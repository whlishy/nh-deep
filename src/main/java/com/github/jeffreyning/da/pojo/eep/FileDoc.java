package com.github.jeffreyning.da.pojo.eep;

import com.github.jeffreyning.da.anno.AttrName;
import com.github.jeffreyning.da.anno.NodeName;
import com.github.jeffreyning.da.anno.TagName;

/**
 * 文档对象类
 * @author ninghao
 */
@NodeName("文档")
public class FileDoc {
    @TagName("文档标识符")
    public String wdbsf;
    @TagName("文档序号")
    public String wdxh;
    @TagName("文档主从声明")
    public String wdzcsm;
    @TagName("题名")
    public String tm;
    @TagName("文档数据")
    public DocData wdsj=new DocData();

    //文档数据
    public static class DocData{
        @AttrName("文档数据ID")
        public String wdsjid;
        @TagName("电子属性")
        public ElecAttr dzsx=new ElecAttr();

        @TagName("数字化属性")
        public DigAttr szhsx=new DigAttr();

        //电子属性
        public static class ElecAttr{
            @TagName("格式信息")
            public FormatInfo gsxx=new FormatInfo();
            @TagName("计算机文件名")
            public String jsjwjm;
            @TagName("计算机文件大小")
            public String jsjwdx;
            @TagName("校验码")
            public String xym;
            @TagName("创建时间")
            public String cjsj;
            @TagName("操作系统")
            public String czxt;
            @TagName("硬件架构")
            public String yjjg;
            @TagName("文档创建程序")
            public DocCreApp wdcjcx;
            @TagName("信息系统描述")
            public InfoSysDesc xxxtms;
            @TagName("存储位置")
            public StorLoc ccwz;


            //格式信息
            public static class FormatInfo{
                @TagName("格式名称")
                public String gsmc;
                @TagName("格式版本")
                public String gsbb;
                @TagName("MIME媒体类型")
                public String mmtlx;
            }
            //文档创建程序
            public static class DocCreApp{
                @TagName("程序名称")
                public String cxmc;
                @TagName("程序版本")
                public String cxbb;
            }
            //信息系统描述
            public static class InfoSysDesc{
                @TagName("系统名称")
                public String xtmc="deep";
                @TagName("系统版本")
                public String xtbb="1.0";
                @TagName("系统功能")
                public String xtgn="数字档案管理工具，eep封装，四性检测等";
                @TagName("开发商名称")
                public String kfsmc="ninghao qq:942225169 jeffreyning@aliyun.com";
            }
            //存储位置
            public static class StorLoc {
                @TagName("当前位置")
                public String dqwz;
                @TagName("脱机载体编号")
                public String tjztbh;
                @TagName("脱机载体存址")
                public String tjztcz;
                @TagName("缩微号")
                public String swh;
            }
        }

        //数字化属性
        public static class DigAttr{
            @TagName("数字化对象形态")
            public String szhdxxt;
            @TagName("扫描分辨率")
            public String smfbl;
            @TagName("扫描色彩模式")
            public String smscms;
            @TagName("图像压缩方案")
            public String txysfa;
            @TagName("数字化时间")
            public String szhsj;
            @TagName("数字化对象描述")
            public String szhdxms;
            @TagName("数字化授权信息")
            public String szhsqxx;
            @TagName("扫描设备类型")
            public String smsblx;
            @TagName("扫描设备制造商")
            public String smsbzzs;
            @TagName("扫描设备型号")
            public String smsbxh;
            @TagName("数字化软件名称")
            public String szhrjmc;
            @TagName("数字化软件版本")
            public String szhrjbb;
            @TagName("数字化软件生产商")
            public String szhrjscs;
        }
    }
}
