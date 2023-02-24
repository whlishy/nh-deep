package com.github.jeffreyning.da.util;

import com.github.jeffreyning.da.pojo.EEP;
import com.github.jeffreyning.da.pojo.eep.Biz;
import com.github.jeffreyning.da.pojo.eep.FileDoc;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建eep对象，进行成员变量设置，创建eep相关子对象
 * @author ninghao
 */
public class EEPCreateUtil {
    /**
     * 创建eep对象
     */
    public static EEP createEEPObj(){
        return new EEP();
    }
    /**
     * 设置封装包创建时间
     */
    public static void setFengZhuangBaoChuangJianShiJian(EEP eepObj, Date createDate){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date= sdf.format(createDate);
        eepObj.bqmdx.fzbcjsj=date;
    }
    public static void setFengZhuangBaoChuangJianShiJian(EEP eepObj, String createDate){
        eepObj.bqmdx.fzbcjsj=createDate;
    }

    /**
     * 设置聚合层次
     */
    public static void setJuHeCengCi(EEP eepObj, String juHeCengCi){
        eepObj.bqmdx.fznr.wjstk.jhzc=juHeCengCi;
    }

    /**
     * 设置全宗名称
     */
    public static void setFengZhuangBaoChuangJianDanWei(EEP eepObj,String chuangJianDanWei){
        eepObj.bqmdx.fzbcjdw=chuangJianDanWei;
    }

    /**
     * 设置全宗名称
     */
    public static void setQuanZongMingCheng(EEP eepObj, String quanZongMingCheng){
        eepObj.bqmdx.fznr.wjstk.ly.qzmc=quanZongMingCheng;
    }

    /**
     * 设置立档单位名称
     */
    public static void setLiDangDanWeiMingCheng(EEP eepObj, String liDangDanWeiMingCheng){
        eepObj.bqmdx.fznr.wjstk.ly.lddwmc=liDangDanWeiMingCheng;
    }

    /**
     * 设置电子文件号
     */
    public static void setDianZiWenJianHao(EEP eepObj, String dianZiWenJianHao){
        eepObj.bqmdx.fznr.wjstk.dzwjh=dianZiWenJianHao;
    }

    /**
     * 增加内容描述
     */
    public static void appendNeiRongMiaoShu(EEP eepObj, String tagName, String tagValue){
        eepObj.bqmdx.fznr.wjstk.nrms.dtzlx.put(tagName, tagValue);
    }

    /**
     * 设置件数
     */
    public static void setJianShu(EEP eepObj, Integer jianShu){
        if(jianShu!=null) {
            eepObj.bqmdx.fznr.wjstk.xstz.js = jianShu.toString();
        }else{
            eepObj.bqmdx.fznr.wjstk.xstz.js = null;
        }
    }
    public static void setJianShu(EEP eepObj, String jianShu){
         eepObj.bqmdx.fznr.wjstk.xstz.js = jianShu;

    }

    /**
     * 设置页数
     */
    public static void setYeShu(EEP eepObj, Integer yeShu){
        if(yeShu!=null) {
            eepObj.bqmdx.fznr.wjstk.xstz.ys = yeShu.toString();
        }else{
            eepObj.bqmdx.fznr.wjstk.xstz.ys = null;
        }
    }
    public static void setYeShu(EEP eepObj, String yeShu){
        eepObj.bqmdx.fznr.wjstk.xstz.ys = yeShu;
    }

    /**
     * 设置语种
     */
    public static void setYuZhong(EEP eepObj, String yuZhong){
        eepObj.bqmdx.fznr.wjstk.xstz.yz = yuZhong;
    }

    /**
     * 设置稿本
     */
    public static void setGaoBen(EEP eepObj, String gaoBen){
        eepObj.bqmdx.fznr.wjstk.xstz.gb = gaoBen;
    }

    /**
     * 设置当前位置
     */
    public static void setDangQianWeiZhi(EEP eepObj, String dangQianWeiZhi){
        eepObj.bqmdx.fznr.wjstk.ccwz.dqwz = dangQianWeiZhi;
    }

    /**
     * 设置缩微号
     */
    public static void setSuoWeiHao(EEP eepObj, String suoWeiHao){
        eepObj.bqmdx.fznr.wjstk.ccwz.swh = suoWeiHao;
    }

    /**
     * 设置脱机载体编号
     */
    public static void setTuoJiZaiTiBianHao(EEP eepObj, String tuoJiZaiTiBianHao){
        eepObj.bqmdx.fznr.wjstk.ccwz.tjztbh=tuoJiZaiTiBianHao;
    }

    /**
     * 设置脱机载体存址
     */
    public static void setTuoJiZaiTiCunZhi(EEP eepObj, String tuoJiZaiTiCunZhi){
        eepObj.bqmdx.fznr.wjstk.ccwz.tjztcz = tuoJiZaiTiCunZhi;
    }

    /**
     * 设置附注
     */
    public static void setFuZhu(EEP eepObj, String fuZhu){
        eepObj.bqmdx.fznr.wjstk.fz = fuZhu;
    }

    /**
     * 创建文档实体
     * @return 文档实体
     */
    public static FileDoc createDoc(){
        return new FileDoc();
    }

    /**
     * 设置文档标识符
     */
    public static void setWenDangBiaoShiFu(FileDoc doc, String wenDangBiaoShiFu){
        doc.wdbsf=wenDangBiaoShiFu;
    }

    /**
     * 设置文档序号
     */
    public static void setWenDangXuHao(FileDoc doc, String wenDangXuHao){
        doc.wdxh=wenDangXuHao;
    }
    /**
     * 设置文档主从声明
     */
    public static void setWenDangZhuCongShengMing(FileDoc doc, String wenDangZhuCongShengMing){
        doc.wdzcsm=wenDangZhuCongShengMing;
    }
    /**
     * 设置文档题名
     */
    public static void setWenDangTiMing(FileDoc doc, String wenDangTiMing){
        doc.tm=wenDangTiMing;
    }
    /**
     * 设置文档数据ID
     */
    public static void setWenDangShuJuID(FileDoc doc, String wenDangShuJuID){
        doc.wdsj.wdsjid=wenDangShuJuID;
    }
    /**
     * 设置格式名称
     */
    public static void setGeShiMingCheng(FileDoc doc, String geShiMingCheng){
        doc.wdsj.dzsx.gsxx.gsmc=geShiMingCheng;
    }
    /**
     * 设置格式版本
     */
    public static void setGeShiBanBen(FileDoc doc, String geShiBanBen){
        doc.wdsj.dzsx.gsxx.gsbb=geShiBanBen;
    }
    /**
     * 设置媒体类型
     */
    public static void setMeiTiLeiXing(FileDoc doc, String meiTiLeiXing){
        doc.wdsj.dzsx.gsxx.mmtlx=meiTiLeiXing;
    }
    /**
     * 设置计算机文件名
     */
    public static void setJiSuanJiWenJianMing(FileDoc doc, String jiSuanJiWenJianMing){
        doc.wdsj.dzsx.jsjwjm=jiSuanJiWenJianMing;
    }
    /**
     * 设置计算机文件大小
     */
    public static void setJiSuanJiWenJianDaXiao(FileDoc doc, String jiSuanJiWenJianDaXiao){
        doc.wdsj.dzsx.jsjwdx=jiSuanJiWenJianDaXiao;
    }
    /**
     * 设置校验码
     */
    public static void setXiaoYanMa(FileDoc doc, String xiaoYanMa){
        doc.wdsj.dzsx.xym=xiaoYanMa;
    }

    /**
     * 设置创建时间
     */
    public static void setChuangJianShiJian(FileDoc doc, Date chuangJianShiJian){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date=sdf.format(chuangJianShiJian);
        doc.wdsj.dzsx.cjsj=date;
    }
    public static void setChuangJianShiJian(FileDoc doc, String chuangJianShiJian){
        doc.wdsj.dzsx.cjsj=chuangJianShiJian;
    }

    /**
     * 设置操作系统
     */
    public static void setCaoZuoXiTong(FileDoc doc, String caoZuoXiTong){
        doc.wdsj.dzsx.czxt=caoZuoXiTong;
    }

    /**
     * 设置硬件架构
     */
    public static void setYingJianJiaGou(FileDoc doc, String yingJianJiaGou){
        doc.wdsj.dzsx.yjjg=yingJianJiaGou;
    }

    /**
     * 添加文档实体到文件实体块中
     * @return 文档实体
     */
    public static void appendDoc(EEP eepObj, FileDoc doc){
        eepObj.bqmdx.fznr.wjstk.wjsj.wd.add(doc);

    }

    /**
     * 创建行为实体
     * @return 行为实体
     */
    public static Biz createBiz(){
        return new Biz();
    }


    /**
     * 设置业务状态
     */
    public static void setYeWuZhuangTai(Biz biz, String yeWuZhuangTai){
        biz.ywzt=yeWuZhuangTai;
    }

    /**
     * 设置业务行为
     */
    public static void setYeWuXingWei(Biz biz, String yeWuXingWei){
        biz.ywxw=yeWuXingWei;
    }

    /**
     * 设置行为时间
     */
    public static void setXingWeiShiJian(Biz biz, Date xingWeiShiJian){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date=sdf.format(xingWeiShiJian);
        biz.xwsj=date;
    }
    public static void setXingWeiShiJian(Biz biz, String xingWeiShiJian){
        biz.xwsj=xingWeiShiJian;
    }
    /**
     * 设置行为依据
     */
    public static void setXingWeiYiJu(Biz biz, String xingWeiYiJu){
        biz.xwyj=xingWeiYiJu;
    }

    /**
     * 设置行为描述
     */
    public static void setXingWeiMiaoShu(Biz biz, String xingWeiMiaoShu){
        biz.xwms=xingWeiMiaoShu;
    }

    /**
     * 添加行为实体到行为实体块中
     * @param eepObj
     * @param biz
     */
    public static void appendBiz(EEP eepObj, Biz biz){
        eepObj.bqmdx.fznr.ywstk.add(biz);
    }

    /**
     * 设置签名标识符
     */
    public static void setQianMingBiaoShiFu(EEP eepObj, String qianMingBiaoShiFu){
        eepObj.dzqmk.qmbsf=qianMingBiaoShiFu;
    }

    /**
     * 设置签名时间
     */
    public static void setQianMingShiJian(EEP eepObj, Date qianMingShiJian){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date=sdf.format(qianMingShiJian);
        eepObj.dzqmk.qmsj=date;
    }
    public static void setQianMingShiJian(EEP eepObj, String qianMingShiJian){
        eepObj.dzqmk.qmsj=qianMingShiJian;
    }
    /**
     * 设置签名人
     */
    public static void setQianMingRen(EEP eepObj, String qianMingRen){
        eepObj.dzqmk.qmr=qianMingRen;
    }

    /**
     * 设置签名结果
     */
    public static void setQianMingJieGuo(EEP eepObj, String qianMingJieGuo){
        eepObj.dzqmk.qmjg=qianMingJieGuo;
    }

}
