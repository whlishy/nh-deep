package com.github.jeffreyning.da.util;

import cn.hutool.core.util.XmlUtil;
import com.github.jeffreyning.da.anno.AttrName;
import com.github.jeffreyning.da.anno.NodeName;
import com.github.jeffreyning.da.anno.TagName;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class CommonUtil {
    protected static Document subToDocument(Object subObj) throws Exception  {
        Document document = XmlUtil.createXml();
        Class cls=subObj.getClass();
        NodeName nodeName= (NodeName) cls.getAnnotation(NodeName.class);
        String addName = nodeName.value();
        Element root = document.createElement(addName);
        document.appendChild(root);
        eepDom(subObj, cls, document, root);
        return document;
    }

    protected static void eepDom(Object obj,Class cls,Document document,Element parent) throws Exception {
        Field[] fields=cls.getDeclaredFields();
        for(Field field:fields){
            Class fcls=field.getType();
            if(fcls.equals(String.class)) {
                eepElement(obj, field, document,parent);
            }else if(!fcls.equals(List.class) && !fcls.equals(Map.class)) {
                TagName tagName = field.getAnnotation(TagName.class);
                if (tagName != null) {
                    String name = tagName.value();
                    Element element = document.createElement(name);
                    parent.appendChild(element);
                    Object vobj = field.get(obj);
                    if (vobj != null) {
                        eepDom(vobj, fcls, document, element);
                    }
                } else {
                    Object vobj = field.get(obj);
                    if (vobj != null) {
                        eepDom(vobj, fcls, document, parent);
                    }
                }
            }else if(fcls.equals(Map.class)){
                Map<String, Object> vobj = (Map) field.get(obj);
                if (vobj != null) {
                    for (Map.Entry<String, Object> it :vobj.entrySet()){
                        String tagName=it.getKey();
                        String valueObj=null;
                        if(it.getValue()!=null){
                            valueObj=it.getValue().toString();
                        }
                        Element element = document.createElement(tagName);
                        if(valueObj!=null) {
                            CDATASection cdata = document.createCDATASection(valueObj);
                            element.appendChild(cdata);
                        }
                        parent.appendChild(element);
                    }
                }
            }else{
                TagName tagName=field.getAnnotation(TagName.class);
                if(tagName!=null) {
                    String name = tagName.value();
                    Element element = document.createElement(name);
                    parent.appendChild(element);
                    Object vobj = field.get(obj);
                    if(vobj!=null) {
                        eepList((List) vobj, document, element);
                    }
                }else {
                    Object vobj = field.get(obj);
                    if(vobj!=null) {
                        eepList((List) vobj, document, parent);
                    }
                }
            }
        }
    }
    protected static void eepList(List list,Document document,Element parent) throws Exception {
        int size=list.size();
        for(int i=0;i<size;i++){
            Object obj=list.get(i);
            Class cls=obj.getClass();
            NodeName nodeName= (NodeName) cls.getAnnotation(NodeName.class);
            if(nodeName!=null) {
                String addName = nodeName.value();
                Element element = document.createElement(addName);
                parent.appendChild(element);
                eepDom(obj, cls, document, element);
            }else {
                eepDom(obj, cls, document, parent);
            }
        }
    }
    protected static void eepElement(Object obj,Field field,Document document,Element parent) throws Exception {
        TagName tagName=field.getAnnotation(TagName.class);
        AttrName attrName=field.getAnnotation(AttrName.class);
        if(tagName==null && attrName==null){
            return ;
        }
        if(tagName!=null) {
            String name = tagName.value();
            Element element = document.createElement(name);
            parent.appendChild(element);
            Object valueObj = field.get(obj);
            if(valueObj!=null) {
                CDATASection cdata = document.createCDATASection((String) valueObj);
                element.appendChild(cdata);
            }
        }
        if(attrName!=null){
            String attr=attrName.value();
            Object valueObj = field.get(obj);
            if(valueObj!=null) {
                parent.setAttribute(attr, String.valueOf(valueObj));
            }
        }
    }
}
