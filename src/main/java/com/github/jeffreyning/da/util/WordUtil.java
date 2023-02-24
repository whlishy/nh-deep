package com.github.jeffreyning.da.util;

import com.github.jeffreyning.da.em.DengJiBiao;
import com.github.jeffreyning.da.pojo.DJB;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Bookmark;
import org.apache.poi.hwpf.usermodel.Bookmarks;
import org.apache.poi.hwpf.usermodel.Range;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 电子文件移交接收登记表填写工具
 */
public class WordUtil {

    public static void createDengJiBiao(DJB djObj, File exportFile) throws IOException {

        InputStream in = WordUtil.class.getClassLoader().getResourceAsStream("nh-dzwjyjjsdjb.doc");
        OutputStream outputStream=null;
        try {
            Map<String, String> cMap=new HashMap();
            cMap.put(DengJiBiao.DanWeiMingCheng,djObj.getDanWeiMingCheng());
            cMap.put(DengJiBiao.GuiDangFangShi,djObj.getGuiDangFangShi());
            cMap.put(DengJiBiao.GuiDangDianZiWenJianMenLei,djObj.getGuiDangDianZiWenJianMenLei());
            cMap.put(DengJiBiao.GuiDangShiJian,djObj.getGuiDangShiJian());
            cMap.put(DengJiBiao.DanWeiMingCheng,djObj.getDanWeiMingCheng());
            cMap.put(DengJiBiao.BingDuJianCe,djObj.getBingDuJianCe());
            cMap.put(DengJiBiao.ZiJie,djObj.getZiJie());
            cMap.put(DengJiBiao.ZhenShiXingJianCe,djObj.getZhenShiXingJianCe());
            cMap.put(DengJiBiao.Zhang,djObj.getZhang());
            cMap.put(DengJiBiao.ZaiTiWaiGuanJianCe,djObj.getZaiTiWaiGuanJianCe());
            cMap.put(DengJiBiao.WanZhengXingJianCe,djObj.getWanZhengXingJianCe());
            cMap.put(DengJiBiao.ShuoMing,djObj.getShuoMing());
            cMap.put(DengJiBiao.KeYongXingJianCe,djObj.getKeYongXingJianCe());
            cMap.put(DengJiBiao.KeKaoXingJianCe,djObj.getKeKaoXingJianCe());
            cMap.put(DengJiBiao.Juan,djObj.getJuan());
            cMap.put(DengJiBiao.Jian,djObj.getJian());
            cMap.put(DengJiBiao.FenZhong,djObj.getFenZhong());



            HWPFDocument document = null;
            document = new HWPFDocument(in);

            Bookmarks bookmarks = document.getBookmarks();
            int size=bookmarks.getBookmarksCount();
            for(int dwI = 0;dwI <size;dwI++){
                Bookmark bookmark = bookmarks.getBookmark(dwI);
                String key=bookmark.getName();
                String val=cMap.get(key);
                if(val!=null){
                    Range range = new Range(bookmark.getStart(),bookmark.getEnd(),document);
                    range.insertAfter(val);
                }
            }

            //导出到文件
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            document.write((OutputStream)byteArrayOutputStream);
            outputStream = new FileOutputStream(exportFile);
            outputStream.write(byteArrayOutputStream.toByteArray());

        }finally
         {
            if(in!=null){
                in.close();
            }
            if(outputStream!=null){
                outputStream.close();
            }
        }
    }
}
