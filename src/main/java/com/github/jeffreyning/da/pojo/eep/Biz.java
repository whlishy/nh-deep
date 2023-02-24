package com.github.jeffreyning.da.pojo.eep;

import com.github.jeffreyning.da.anno.NodeName;
import com.github.jeffreyning.da.anno.TagName;

/**
 * 业务实体对象类
 * @author ninghao
 */
@NodeName("业务实体")
public class Biz{
    @TagName("业务状态")
    public String ywzt;
    @TagName("业务行为")
    public String ywxw;
    @TagName("行为时间")
    public String xwsj;
    @TagName("行为依据")
    public String xwyj;
    @TagName("行为描述")
    public String xwms;
}
