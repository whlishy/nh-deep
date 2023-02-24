package com.github.jeffreyning.da.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.XmlUtil;
import com.github.jeffreyning.da.pojo.DIR;
import org.w3c.dom.Document;

import java.io.File;

public class DIRUtil {




    /**
     * 根据dir实例对象生成xml字符串
     * @param dirObj dir实例对象
     * @throws Exception
     */
    public static String dirToXmlStr(DIR dirObj) throws Exception {
        Document document = CommonUtil.subToDocument(dirObj);
        return  XmlUtil.toStr(document,"UTF-8",true,true);
    }

    /**
     * 根据dir实例对象生成xml字符串并写入到文件中
     * @param dirObj dir实例对象
     * @throws Exception
     */
    public static void writeDirFile(DIR dirObj, File file) throws Exception {
        Document document = CommonUtil.subToDocument(dirObj);
        //写出到文件
        String xml=XmlUtil.toStr(document,"UTF-8",true,true);
        FileUtil.writeUtf8String(xml,file);
    }
}
