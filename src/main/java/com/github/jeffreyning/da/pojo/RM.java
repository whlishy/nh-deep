package com.github.jeffreyning.da.pojo;


import com.github.jeffreyning.da.anno.TagName;

/**
 * 说明文件实例类
 * @author ninghao
 */
public class RM {
    @TagName("载体容量")
    public String ztrl="";
    @TagName("载体类型")
    public String ztlx="";
    @TagName("载体编号")
    public String ztbh="";
    @TagName("载体保管单位")
    public String ztbgdw="";
    @TagName("载体制作单位")
    public String ztzzdw="";
    @TagName("载体检查单位")
    public String ztjcdw="";
    @TagName("摘要信息")
    public String zyxx="";
    @TagName("硬件环境")
    public String yjhj="amd64";
    @TagName("软件环境")
    public String rjhj="Linux";


    public String getZaiTiRongLiang() {
        return ztrl;
    }

    /**
     * 设置载体容量
     * @param zaiTiRongLiang
     */
    public void setZaiTiRongLiang(String zaiTiRongLiang) {
        this.ztrl = zaiTiRongLiang;
    }

    public String getZaiTiLeiXing() {
        return ztlx;
    }

    /**
     * 设置载体类型
     * @param zaiTiLeiXing
     */
    public void setZaiTiLeiXing(String zaiTiLeiXing) {
        this.ztlx=zaiTiLeiXing;
    }

    public String getZaiTiBianHao() {
        return ztbh;
    }

    /**
     * 设置载体编号
     * @param zaiTiBianHao
     */
    public void setZaiTiBianHao(String zaiTiBianHao) {
        this.ztbh = zaiTiBianHao;
    }

    public String getZaiTiBaoGuanDanWei() {
        return ztbgdw;
    }

    /**
     * 设置载体保管单位
     * @param zaiTiBaoGuanDanWei
     */
    public void setZaiTiBaoGuanDanWei(String zaiTiBaoGuanDanWei) {
        this.ztbgdw = ztbgdw;
    }

    public String getZaiTiZhiZuoDanWei() {
        return ztzzdw;
    }

    /**
     * 设置载体制作单位
     * @param zaiTiZhiZuoDanWei
     */
    public void setZaiTiZhiZuoDanWei(String zaiTiZhiZuoDanWei) {
        this.ztzzdw = zaiTiZhiZuoDanWei;
    }

    public String getZaiTiJianChaDanWei() {
        return ztjcdw;
    }

    /**
     * 设置载体检查单位
     * @param zaiTiJianChaDanWei
     */
    public void setZaiTiJianChaDanWei(String zaiTiJianChaDanWei) {
        this.ztjcdw = zaiTiJianChaDanWei;
    }

    public String getZaiYaoXinXi() {
        return zyxx;
    }

    /**
     * 设置摘要信息
     * @param zaiYaoXinXi
     */
    public void setZaiYaoXinxi(String zaiYaoXinXi) {
        this.zyxx = zaiYaoXinXi;
    }

    public String getYinJianHuanJing() {
        return yjhj;
    }

    /**
     * 设置硬件环境
     * @param yinJianHuanJing
     */
    public void setYinJianHuanJing(String yinJianHuanJing) {
        this.yjhj = yinJianHuanJing;
    }

    public String getRuanJianHuanJing() {
        return rjhj;
    }

    /**
     * 设置软件环境
     * @param ruanJianHuanJing
     */
    public void setRuanJianHuanJing(String ruanJianHuanJing) {
        this.rjhj = ruanJianHuanJing;
    }
}
