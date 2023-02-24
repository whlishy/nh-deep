package com.github.jeffreyning.da.pojo.dir;

import com.github.jeffreyning.da.anno.NodeName;
import com.github.jeffreyning.da.anno.TagName;

@NodeName("文件")
public class DirWenJian {

    //件号
    @TagName("件号")
    public String jh;
    @TagName("顺序号")
    public String sxh;
    @TagName("文号")
    public String wh;

    //共通
    @TagName("档号")
    public String dh;
    @TagName("题名")
    public String tm;
    @TagName("责任者")
    public String zrz;
    @TagName("年度")
    public String nd;
    @TagName("日期")
    public String rq;
    @TagName("机构")
    public String jg;

    @TagName("页数")
    public String ys;
    @TagName("分类号")
    public String flh;
    @TagName("分类名称")
    public String flmc;
    @TagName("保管期限")
    public String bgqx;
    @TagName("备注")
    public String bz;

    @TagName("密级")
    public String mj;
    //共通技术
    @TagName("档案库名称")
    public String dakmc;
    @TagName("档案库标识")
    public String dakbs;
    @TagName("路径")
    public String lj;
    @TagName("电子档案名称")
    public String dzdamc;
}
