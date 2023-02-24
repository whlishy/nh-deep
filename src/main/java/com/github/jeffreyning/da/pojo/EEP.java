package com.github.jeffreyning.da.pojo;



import com.github.jeffreyning.da.anno.AttrName;
import com.github.jeffreyning.da.anno.NodeName;
import com.github.jeffreyning.da.anno.TagName;
import com.github.jeffreyning.da.pojo.eep.Biz;
import com.github.jeffreyning.da.pojo.eep.FileDoc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


/**
 * 封装包对象类
 *
 * @author ninghao
 * @since 2023-02-13
 */
@NodeName("电子文件封装包")
public class EEP {
    @AttrName("xmlns")
    public String xmlns="http://www.saac.gov.cn/standards/ERM/encapsulation";
    /**
     * 封装包格式描述
     */
    @TagName("封装包格式描述")
    public String fzbgsms="本EEP根据中华人民共和国档案行业标准DA/T 48-2009《基于XML的电子文件封装规范》生成";
    @TagName("版本")
    public String bb="2009";
    @TagName("被签名对象")
    public EEPTarget bqmdx=new EEPTarget();

    @TagName("电子签名块")
    public Sign dzqmk=new Sign();



    @NodeName("被签名对象")
    public static class EEPTarget {
        @AttrName("eep版本")
        public String eepbb="2009";
        @TagName("封装包类型")
        public String fzblx="原始型";
        @TagName("封装包类型描述")
        public String fzblxms="本封装包包含电子文件数据及其元数据，原始封装，未经修改";
        @TagName("封装包创建时间")
        public String fzbcjsj;
        @TagName("封装包创建单位")
        public String fzbcjdw="qq942225169";
        @TagName("封装内容")
        public EEPContent fznr=new EEPContent();

        //封装内容
        public static class EEPContent{
            @TagName("文件实体块")
            public FileTarget wjstk=new FileTarget();
            @TagName("业务实体块")
            public List<Biz> ywstk=new ArrayList<>();

            @NodeName("文件实体")
            public static class FileTarget {
                @TagName("聚合层次")
                public String jhzc;
                @TagName("来源")
                public Source ly=new Source();
                @TagName("电子文件号")
                public String dzwjh;
                @TagName("内容描述")
                public ContentDesc nrms=new ContentDesc();
                @TagName("形式特征")
                public FormalFeat xstz=new FormalFeat();
                @TagName("存储位置")
                public StorLoc ccwz=new StorLoc();
                @TagName("权限管理")
                public AuthMana qxgl=new AuthMana();
                @TagName("附注")
                public String fz;
                @TagName("文件数据")
                public FileData wjsj=new FileData();

                //来源
                public static class Source{
                    @TagName("全宗名称")
                    public String qzmc;
                    @TagName("立档单位名称")
                    public String lddwmc;
                }

                //存储位置
                public static class StorLoc{
                    @TagName("当前位置")
                    public String dqwz;
                    @TagName("脱机载体编号")
                    public String tjztbh;
                    @TagName("脱机载体存址")
                    public String tjztcz;
                    @TagName("缩微号")
                    public String swh;
                }
                //授权
                public static class AuthMana{
                    @TagName("知识产权说明")
                    public String zscqsm;
                    public List<Auth> sq=new ArrayList<>();

                    @NodeName("授权")
                    public static class Auth{
                        @TagName("授权对象")
                        public String sqdx;
                        @TagName("授权行为")
                        public String sqxw;
                    }
                }
                public static class ContentDesc{
                    public Map<String, String> dtzlx=new LinkedHashMap();

                    @AttrName("descr")
                    public String descr="主要用于四性检测，以及导入档案系统使用";

                }

                public static class FormalFeat{
                    @TagName("件数")
                    public String js;
                    @TagName("页数")
                    public String ys;
                    @TagName("语种")
                    public String yz;
                    @TagName("稿本")
                    public String gb;
                }
                public static class FileData{
                    public List<FileDoc> wd=new ArrayList<>();

                }
            }
        }
    }

    @NodeName("电子签名")
    public static class Sign {
        @TagName("签名标识符号")
        public String qmbsf="MD5";
        @TagName("签名规则")
        public String qmgz="摘要签名";
        @TagName("签名时间")
        public String qmsj;
        @TagName("签名人")
        public String qmr;
        @TagName("签名结果")
        public String qmjg;
        @TagName("证书块")
        public Cer zsk;
        @TagName("签名算法标识")
        public String qmsfbs;

        public static class Cer {
            @TagName("证书")
            public String zs="无";
            @TagName("证书引用")
            public String zsyy="无";
        }
    }


}
