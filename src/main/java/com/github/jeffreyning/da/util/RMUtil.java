package com.github.jeffreyning.da.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.crypto.SecureUtil;
import com.github.jeffreyning.da.anno.TagName;
import com.github.jeffreyning.da.pojo.RM;

import java.io.File;
import java.lang.reflect.Field;

/**
 * 说明文件工具类
 * @author ninghao
 */
public class RMUtil {
    public static String rmToStr(RM rmObj) throws IllegalAccessException {
        Class cls=rmObj.getClass();
        Field[] fields=cls.getDeclaredFields();
        StringBuffer sb=new StringBuffer("");
        for(Field field:fields) {
            TagName tagName = field.getAnnotation(TagName.class);
            if (tagName != null) {
                String name = tagName.value();
                sb.append(name).append(":");
                Object vobj = field.get(rmObj);
                if (vobj != null) {
                    sb.append(" ").append(vobj);
                }
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }
    public static void writeRmFile(RM rmObj, File file) throws IllegalAccessException {
        String txt=RMUtil.rmToStr(rmObj);
        FileUtil.writeUtf8String(txt,file);
    }
    public static void signRM(RM rmObj) throws IllegalAccessException {
        String txt=RMUtil.rmToStr(rmObj);
        String md5 = SecureUtil.md5(txt);
        rmObj.zyxx=md5;
    }
}
