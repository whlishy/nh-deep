package com.jeffreyning.test;

import com.github.jeffreyning.da.em.JuHeCengCi;
import com.github.jeffreyning.da.em.WenDangZhuCongShengMing;
import com.github.jeffreyning.da.pojo.DIR;
import com.github.jeffreyning.da.pojo.DJB;
import com.github.jeffreyning.da.pojo.EEP;
import com.github.jeffreyning.da.pojo.RM;
import com.github.jeffreyning.da.pojo.dir.DirWenJian;
import com.github.jeffreyning.da.pojo.eep.Biz;
import com.github.jeffreyning.da.pojo.eep.FileDoc;
import com.github.jeffreyning.da.util.*;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestDemo {


    //测试生成案卷封装eep文件
    @Test
    public void testAnJuanEEP() throws Exception {

        //创建封装包对象
        EEP eepObj=EEPCreateUtil.createEEPObj();
        //设置封装包创建时间
        EEPCreateUtil.setFengZhuangBaoChuangJianShiJian(eepObj,new Date());

        //设置封装包创建单位
        EEPCreateUtil.setFengZhuangBaoChuangJianDanWei(eepObj,"xx公司");
        //设置聚合层次
        EEPCreateUtil.setJuHeCengCi(eepObj, JuHeCengCi.ANJUAN);
        //设置全宗名称
        EEPCreateUtil.setQuanZongMingCheng(eepObj, "x全宗");
        //设置立档单位名称
        EEPCreateUtil.setLiDangDanWeiMingCheng(eepObj,"x立档单位");

        //添加内容描述-档号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "档号","2021-2-001");
        //添加内容描述-案卷题名
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "案卷题名","技术管理研究");
        //添加内容描述-分类号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "分类号","2");
        //添加内容描述-年度
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "年度","2021");
        //添加内容描述-编制单位
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "编制单位","x研究院");

        //添加内容描述-归档部门
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "归档部门","综合部");
        //添加内容描述-分类名称
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "分类名称","开发");
        //添加内容描述-案卷号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "案卷号","001");
        //添加内容描述-立卷单位
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "立卷单位","x集团公司");
        //添加内容描述-件数
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "件数","1");
        //添加内容描述-总页数
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "总页数","1");
        //添加内容描述-保管期限
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "保管期限","30");
        //添加内容描述-归档份数
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "归档份数","1");
        //添加内容描述-库存量
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "库存量","1");
        //添加内容描述-装订方法
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "装订方法","以件装订");
        //添加内容描述-卷盒规格
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "卷盒规格","60mm");

        //设置形式特征-件数
        EEPCreateUtil.setJianShu(eepObj, 1);

        //设置形式特征-页数
        EEPCreateUtil.setYeShu(eepObj, 1);

        //创建业务实体对象
        Biz bizObj=EEPCreateUtil.createBiz();
        //设置业务行为
        EEPCreateUtil.setYeWuXingWei(bizObj,"保存");
        //设置业务时间
        EEPCreateUtil.setXingWeiShiJian(bizObj,new Date());
        //添加业务实体到业务实体块中
        EEPCreateUtil.appendBiz(eepObj, bizObj);

        //设置附注
        EEPCreateUtil.setFuZhu(eepObj, "案卷eep封装 咨询联系 ning qq:942225169");

        //进行md5签名
        EEPUtil.signEEP(eepObj);

        //根据eep实例对象生成xml字符串
        String xml=EEPUtil.eepToXmlStr(eepObj);
        System.out.println(xml);
    }

    //测试生成卷内文件封装eep文件
    @Test
    public void testJuanNeiEEP() throws Exception {

        //创建封装包对象
        EEP eepObj=EEPCreateUtil.createEEPObj();
        //设置封装包创建时间
        EEPCreateUtil.setFengZhuangBaoChuangJianShiJian(eepObj,new Date());

        //设置封装包创建单位
        EEPCreateUtil.setFengZhuangBaoChuangJianDanWei(eepObj,"xx公司");
        //设置聚合层次
        EEPCreateUtil.setJuHeCengCi(eepObj, JuHeCengCi.WENJIAN);
        //设置全宗名称
        EEPCreateUtil.setQuanZongMingCheng(eepObj, "x全宗");
        //设置立档单位名称
        EEPCreateUtil.setLiDangDanWeiMingCheng(eepObj,"x立档单位");



        //添加内容描述-卷内序号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "卷内序号","1");

        //添加内容描述-所属卷号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "所属卷号","2021-2-001");

        //添加内容描述-档号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "档号","2021-2-001-001");

        //添加内容描述-文件题名
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "文件题名","x资料");

        //添加内容描述-分类号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "分类号","2");

        //添加内容描述-分类名称
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "分类名称","开发");

        //添加内容描述-归档份数
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "归档份数","1");
        //添加内容描述-库存量
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "库存量","1");

        //添加内容描述-实体类别
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "实体类别","纸质");

        //添加内容描述-电子文件数据
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "电子文件数据","1");

        //设置形式特征-件数
        EEPCreateUtil.setJianShu(eepObj, 1);


        //创建文件对象
        FileDoc docObj=EEPCreateUtil.createDoc();
        //设置文档主从声明
        EEPCreateUtil.setWenDangZhuCongShengMing(docObj,WenDangZhuCongShengMing.ZHUWENDANG);
        //设置计算机文件名
        EEPCreateUtil.setJiSuanJiWenJianMing(docObj,"1.jpg");
        //设置计算机文件大小
        EEPCreateUtil.setJiSuanJiWenJianDaXiao(docObj,"166605");
        //添加文件对象到文件数据块中
        EEPCreateUtil.appendDoc(eepObj,docObj);

        //创建业务实体对象
        Biz bizObj=EEPCreateUtil.createBiz();
        //设置业务行为
        EEPCreateUtil.setYeWuXingWei(bizObj,"保存");
        //设置业务时间
        EEPCreateUtil.setXingWeiShiJian(bizObj,new Date());
        //添加业务实体到业务实体块中
        EEPCreateUtil.appendBiz(eepObj, bizObj);

        //设置附注
        EEPCreateUtil.setFuZhu(eepObj, "卷内文件eep封装 咨询联系 ning qq:942225169");

        //进行md5签名
        EEPUtil.signEEP(eepObj);

        //根据eep实例对象生成xml字符串
        String xml=EEPUtil.eepToXmlStr(eepObj);
        System.out.println(xml);
    }

    //测试生成文件封装eep文件
    @Test
    public void testWenJianEEP() throws Exception {

        //创建封装包对象
        EEP eepObj=EEPCreateUtil.createEEPObj();
        //设置封装包创建时间
        EEPCreateUtil.setFengZhuangBaoChuangJianShiJian(eepObj,new Date());

        //设置封装包创建单位
        EEPCreateUtil.setFengZhuangBaoChuangJianDanWei(eepObj,"xx公司");
        //设置聚合层次
        EEPCreateUtil.setJuHeCengCi(eepObj, JuHeCengCi.WENJIAN);
        //设置全宗名称
        EEPCreateUtil.setQuanZongMingCheng(eepObj, "x全宗");
        //设置立档单位名称
        EEPCreateUtil.setLiDangDanWeiMingCheng(eepObj,"x立档单位");


        //添加内容描述-题名
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "题名","x资料");
        //添加内容描述-年度
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "年度","2021");
        //添加内容描述-保管期限
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "保管期限","永久");
        //添加内容描述-项目名称
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "项目名称","x字[2021]10010号");
        //添加内容描述-档号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "档号","2021-2-Y-001");

        //添加内容描述-分类号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "分类号","2");

        //添加内容描述-分类名称
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "分类名称","开发");

        //添加内容描述-归档部门
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "归档部门","综合部");
        //添加内容描述-件号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "件号","001");
        //添加内容描述-文件类型
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "文件类型","发文");
        //添加内容描述-页数
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "页数","1");

        //添加内容描述-归档份数
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "归档份数","1");
        //添加内容描述-库存量
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "库存量","1");

        //添加内容描述-实体类别
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "实体类别","纸质");
        //添加内容描述-盒号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "盒号","001");

        //添加内容描述-电子文件数据
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "电子文件数据","1");

        //设置形式特征-件数
        EEPCreateUtil.setJianShu(eepObj, 1);
        //设置形式特征-页数
        EEPCreateUtil.setYeShu(eepObj, 1);

        //创建文件对象
        FileDoc docObj=EEPCreateUtil.createDoc();
        //设置文档主从声明
        EEPCreateUtil.setWenDangZhuCongShengMing(docObj,WenDangZhuCongShengMing.ZHUWENDANG);
        //设置计算机文件名
        EEPCreateUtil.setJiSuanJiWenJianMing(docObj,"1.jpg");
        //设置计算机文件大小
        EEPCreateUtil.setJiSuanJiWenJianDaXiao(docObj,"166605");
        //添加文件对象到文件数据块中
        EEPCreateUtil.appendDoc(eepObj,docObj);

        //创建业务实体对象
        Biz bizObj=EEPCreateUtil.createBiz();
        //设置业务行为
        EEPCreateUtil.setYeWuXingWei(bizObj,"保存");
        //设置业务时间
        EEPCreateUtil.setXingWeiShiJian(bizObj,new Date());
        //添加业务实体到业务实体块中
        EEPCreateUtil.appendBiz(eepObj, bizObj);

        //设置附注
        EEPCreateUtil.setFuZhu(eepObj, "文件eep封装 咨询联系 ning qq:942225169");

        //进行md5签名
        EEPUtil.signEEP(eepObj);

        //根据eep实例对象生成xml字符串
        String xml=EEPUtil.eepToXmlStr(eepObj);
        System.out.println(xml);
    }

    //测试生成盒封装eep
    @Test
    public void testHeEEP() throws Exception {

        //创建封装包对象
        EEP eepObj=EEPCreateUtil.createEEPObj();
        //设置封装包创建时间
        EEPCreateUtil.setFengZhuangBaoChuangJianShiJian(eepObj,new Date());

        //设置封装包创建单位
        EEPCreateUtil.setFengZhuangBaoChuangJianDanWei(eepObj,"xx公司");
        //设置聚合层次
        EEPCreateUtil.setJuHeCengCi(eepObj, JuHeCengCi.HE);
        //设置全宗名称
        EEPCreateUtil.setQuanZongMingCheng(eepObj, "x全宗");
        //设置立档单位名称
        EEPCreateUtil.setLiDangDanWeiMingCheng(eepObj,"x立档单位");

        //添加内容描述-年度
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "年度","2021");
        //添加内容描述-分类号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "分类号","2");
        //添加内容描述-分类名称
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "分类名称","开发");
        //添加内容描述-盒号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "盒号","001");
        //添加内容描述-归档部门
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "归档部门","综合部");
        //添加内容描述-保管期限
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "保管期限","30");


        //添加内容描述-件数
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "件数","1");
        //添加内容描述-起件号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "起件号","1");
        //添加内容描述-止件号
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "止件号","1");
        //添加内容描述-总页数
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "总页数","1");

        //添加内容描述-归档份数
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "归档份数","1");
        //添加内容描述-库存量
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "库存量","1");
        //添加内容描述-卷盒规格
        EEPCreateUtil.appendNeiRongMiaoShu(eepObj, "卷盒规格","50mm");

        //设置形式特征-件数
        EEPCreateUtil.setJianShu(eepObj, "1");

        //设置形式特征-页数
        EEPCreateUtil.setYeShu(eepObj, "1");

        //创建业务实体对象
        Biz bizObj=EEPCreateUtil.createBiz();
        //设置业务行为
        EEPCreateUtil.setYeWuXingWei(bizObj,"保存");
        //设置业务时间
        EEPCreateUtil.setXingWeiShiJian(bizObj,new Date());
        //添加业务实体到业务实体块中
        EEPCreateUtil.appendBiz(eepObj, bizObj);

        //设置附注
        EEPCreateUtil.setFuZhu(eepObj, "盒eep封装 咨询联系 ning qq:942225169");

        //进行md5签名
        EEPUtil.signEEP(eepObj);

        //根据eep实例对象生成xml字符串
        String xml=EEPUtil.eepToXmlStr(eepObj);
        System.out.println(xml);
    }

    //测试生成电子文件移交接收登记表
    @Test
    public void testDengJiBiao() throws IOException {
        File exportFile= new File("d:/电子文件移交接收登记表.doc");
        DJB djb=new DJB();
        djb.setDanWeiMingCheng("x单位");
        djb.setGuiDangShiJian("2022-01-01");
        djb.setGuiDangDianZiWenJianMenLei("文书档案");
        djb.setJuan("1");
        djb.setJian("1");
        djb.setZiJie("166954");
        djb.setGuiDangFangShi("离线归档");
        djb.setShuoMing("nh-deep 咨询联系 ning qq:942225169");
        WordUtil.createDengJiBiao(djb, exportFile);
    }

    //测试生成说明文件
    @Test
    public void testShuoMingWenJian() throws IllegalAccessException {
        RM rm=new RM();
        //设置载体容量
        rm.setZaiTiRongLiang("32G");

        //设置载体类型
        rm.setZaiTiLeiXing("U");

        //设置载体编号
        rm.setZaiTiBianHao("U001");

        //设置载体保管单位
        rm.setZaiTiBaoGuanDanWei("x单位");

        //设置软件环境
        rm.setRuanJianHuanJing("Linux");

        //设置硬件环境
        rm.setYinJianHuanJing("amd64");

        RMUtil.signRM(rm);
        String txt=RMUtil.rmToStr(rm);
        System.out.println(txt);
    }

    //测试生成目录文件
    @Test
    public void testMuLu() throws Exception {
        DIR dirObj= DIRCreateUtil.createDIR();
        DirWenJian fileObj=DIRCreateUtil.createWenJian();
        DIRCreateUtil.setWenJianWenHao(fileObj,"x字[2021]10010号");
        DIRCreateUtil.setWenJianDangHao(fileObj, "2021-2-Y-001");
        DIRCreateUtil.setWenJianNianDu(fileObj,"2021");
        DIRCreateUtil.setWenJianRiQi(fileObj,"2021-10-10");
        DIRCreateUtil.setWenJianTiMing(fileObj,"x资料");
        DIRCreateUtil.setWenJianZeRenZhe(fileObj,"张三");
        DIRCreateUtil.appendWenJian2Dir(dirObj,fileObj);

        String xml=DIRUtil.dirToXmlStr(dirObj);
        System.out.println(xml);

    }
}
