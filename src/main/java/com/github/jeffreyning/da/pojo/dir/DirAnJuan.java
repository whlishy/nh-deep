package com.github.jeffreyning.da.pojo.dir;

import com.github.jeffreyning.da.anno.NodeName;
import com.github.jeffreyning.da.anno.TagName;

import java.util.ArrayList;
import java.util.List;

@NodeName("案卷")
public class DirAnJuan {
    @TagName("档案库名称")
    public String dakmc;
    @TagName("档案库标识")
    public String dakbs;
    @TagName("路径")
    public String lj;


    @TagName("档号")
    public String dh;
    @TagName("题名")
    public String tm;
    @TagName("年度")
    public String nd;
    @TagName("卷内文件")
    public List<DirWenJian> jnwj=new ArrayList();
}
