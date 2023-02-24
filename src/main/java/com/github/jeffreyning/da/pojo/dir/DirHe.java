package com.github.jeffreyning.da.pojo.dir;

import com.github.jeffreyning.da.anno.NodeName;
import com.github.jeffreyning.da.anno.TagName;

import java.util.ArrayList;
import java.util.List;

@NodeName("盒")
public class DirHe {
    @TagName("档案库名称")
    public String dakmc;
    @TagName("档案库标识")
    public String dakbs;
    @TagName("路径")
    public String lj;


    @TagName("盒号")
    public String hh;
    @TagName("年度")
    public String nd;
    @TagName("盒内文件")
    public List<DirWenJian> hnwj=new ArrayList();
}
