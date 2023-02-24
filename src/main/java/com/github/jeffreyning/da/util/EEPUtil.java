package com.github.jeffreyning.da.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.XmlUtil;
import cn.hutool.crypto.SecureUtil;

import com.github.jeffreyning.da.pojo.EEP;
import com.github.jeffreyning.da.anno.NodeName;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;


/**
 * EEP操作工具
 * @author ninghao
 */
public class EEPUtil {

    /**
     * 根据eep实例创建并填充xml的document对象
     * @param eepObj eep封装对象实例
     * @throws IllegalAccessException
     * @return xml的document对象
     */
    public static Document eepToDocument(EEP eepObj) throws Exception  {
        Document document = XmlUtil.createXml();
        Class cls=eepObj.getClass();
        NodeName nodeName= (NodeName) cls.getAnnotation(NodeName.class);
        String addName = nodeName.value();
        Element root = document.createElement(addName);
        document.appendChild(root);
        CommonUtil.eepDom(eepObj, cls, document, root);
        return document;
    }


    /**
     * 根据eep实例对象生成xml字符串
     * @param eepObj eep实例对象
     * @throws Exception
     */
    public static String eepToXmlStr(EEP eepObj) throws Exception {
        Document document = EEPUtil.eepToDocument(eepObj);
        return  XmlUtil.toStr(document,"UTF-8",true,true);
    }

    /**
     * 根据eep实例对象生成xml字符串并写入到文件中
     * @param eepObj eep实例对象
     * @throws Exception
     */
    public static void writeEEPFile(EEP eepObj, File file) throws Exception {
        Document document = EEPUtil.eepToDocument(eepObj);
        //写出到文件
        String xml=XmlUtil.toStr(document,"UTF-8",true,true);
        FileUtil.writeUtf8String(xml,file);
    }

    /**
     * 签名并设置到eep实例对象的签名结果字段
     * @param eep eep实例对象
     * @throws Exception
     */
    public static void signEEP(EEP eep) throws Exception {
        Document document =CommonUtil.subToDocument(eep.bqmdx);
        String xmlStr=XmlUtil.toStr(document,"UTF-8", false,true);
        int index=xmlStr.indexOf("<被签名对象");
        String signStr=xmlStr.substring(index);
        String md5 = SecureUtil.md5(signStr);
        eep.dzqmk.qmjg=md5;
    }

}
