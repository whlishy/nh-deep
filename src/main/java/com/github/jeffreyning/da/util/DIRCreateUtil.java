package com.github.jeffreyning.da.util;


import com.github.jeffreyning.da.pojo.DIR;
import com.github.jeffreyning.da.pojo.dir.DirAnJuan;
import com.github.jeffreyning.da.pojo.dir.DirHe;
import com.github.jeffreyning.da.pojo.dir.DirWenJian;

/**
 * 目录对象生成工具类
 */
public class DIRCreateUtil {
    /**
     * 创建目录对象
     * @return
     */
    public static DIR createDIR(){
        return new DIR();
    }

    /**
     * 创建案卷对象
     * @return
     */
    public static DirAnJuan createDirAnJuan(){
        return new DirAnJuan();
    }

    /**
     * 创建文件对象
     * @return
     */
    public static DirWenJian createWenJian(){
        return new DirWenJian();
    }

    /**
     * 创建盒对象
     * @return
     */
    public static DirHe createDirHe(){
        return new DirHe();
    }

    /**
     * 向目录对象中添加文件
     * @param dirObj
     * @param dirWenJian
     */
    public static void appendWenJian2Dir(DIR dirObj, DirWenJian dirWenJian){
        dirObj.ml.add(dirWenJian);
    }

    /**
     * 向目录对象中添加案卷
     * @param dirObj
     * @param dirAnJuan
     */
    public static void appendAnJuan2Dir(DIR dirObj, DirAnJuan dirAnJuan){
        dirObj.ml.add(dirAnJuan);
    }

    /**
     * 向目录对象中添加盒
     * @param dirObj
     * @param dirHe
     */
    public static void appendHe2Dir(DIR dirObj, DirHe dirHe){
        dirObj.ml.add(dirHe);
    }

    /**
     * 向案卷对象中添加文件
     * @param dirAnJuanObj
     * @param dirWenJian
     */
    public static void appendWenJian2AnJuan(DirAnJuan dirAnJuanObj, DirWenJian dirWenJian){
        dirAnJuanObj.jnwj.add(dirWenJian);
    }

    /**
     * 向盒对象中添加文件
     * @param dirHeObj
     * @param dirWenJian
     */
    public static void appendWenJian2He(DirHe dirHeObj, DirWenJian dirWenJian){
        dirHeObj.hnwj.add(dirWenJian);
    }

    /**
     * 向案卷对象中设置档案库名称
     * @param dirAnJuanObj
     * @param dangAnKuMingCheng
     */
    public static void setAnJuanDangAnKuMingCheng(DirAnJuan dirAnJuanObj,String dangAnKuMingCheng){
        dirAnJuanObj.dakmc=dangAnKuMingCheng;
    }

    /**
     * 向案卷对象中设置档案库标识
     * @param dirAnJuanObj
     * @param dangAnKuBiaoShi
     */
    public static void setAnJuanDangAnKuBiaoShi(DirAnJuan dirAnJuanObj,String dangAnKuBiaoShi){
        dirAnJuanObj.dakbs=dangAnKuBiaoShi;
    }

    /**
     * 向案卷对象中设置路径
     * @param dirAnJuanObj
     * @param luJing
     */
    public static void setAnJuanLuJing(DirAnJuan dirAnJuanObj,String luJing){
        dirAnJuanObj.lj=luJing;
    }

    /**
     * 向案卷对象中设置档号
     * @param dirAnJuanObj
     * @param dangHao
     */
    public static void setAnJuanDangHao(DirAnJuan dirAnJuanObj,String dangHao){
        dirAnJuanObj.dh=dangHao;
    }
    /**
     * 向案卷对象中设置题名
     * @param dirAnJuanObj
     * @param tiMing
     */
    public static void setAnJuanTiMing(DirAnJuan dirAnJuanObj,String tiMing){
        dirAnJuanObj.tm=tiMing;
    }

    /**
     * 向案卷对象中设置年度
     * @param dirAnJuanObj
     * @param nianDu
     */
    public static void setAnJuanNianDu(DirAnJuan dirAnJuanObj,String nianDu){
        dirAnJuanObj.nd=nianDu;
    }

    /**
     * 向盒对象中设置档案库名称
     * @param dirHeObj
     * @param dangAnKuMingCheng
     */
    public static void setHeDangAnMingCheng(DirHe dirHeObj,String dangAnKuMingCheng){
        dirHeObj.dakmc=dangAnKuMingCheng;
    }

    /**
     * 向盒对象中设置档案库标识
     * @param dirHeObj
     * @param dangAnKuBiaoShi
     */
    public static void setHeDangAnBiaoShi(DirHe dirHeObj,String dangAnKuBiaoShi){
        dirHeObj.dakbs=dangAnKuBiaoShi;
    }

    /**
     * 向盒对象中设置路径
     * @param dirHeObj
     * @param luJing
     */
    public static void setHeLuJing(DirHe dirHeObj,String luJing){
        dirHeObj.lj=luJing;
    }

    /**
     * 向盒对象中设置盒号
     * @param dirHeObj
     * @param heHao
     */
    public static void setHeHeHao(DirHe dirHeObj,String heHao){
        dirHeObj.hh=heHao;
    }

    /**
     * 向盒对象中设置年度
     * @param dirHeObj
     * @param nianDu
     */
    public static void setHeNianDu(DirHe dirHeObj,String nianDu){
        dirHeObj.nd=nianDu;
    }


    /**
     * 向文件对象中设置件号
     */
    public static void setWenJianJianHao(DirWenJian dirWenJianObj, String jianHao){
        dirWenJianObj.jh=jianHao;
    }

    /**
     * 向文件对象中设置顺序号
     */
    public static void setWenJianShunXuHao(DirWenJian dirWenJianObj, String shunXuHao){
        dirWenJianObj.sxh=shunXuHao;
    }

    /**
     * 向文件对象中设置文号
     */
    public static void setWenJianWenHao(DirWenJian dirWenJianObj, String wenHao){
        dirWenJianObj.wh=wenHao;
    }

    /**
     * 向文件对象中设置档号
     */
    public static void setWenJianDangHao(DirWenJian dirWenJianObj, String dangHao){
        dirWenJianObj.dh=dangHao;
    }

    /**
     * 向文件对象中设置题名
     */
    public static void setWenJianTiMing(DirWenJian dirWenJianObj, String tiMing){
        dirWenJianObj.tm=tiMing;
    }

    /**
     * 向文件对象中设置责任者
     */
    public static void setWenJianZeRenZhe(DirWenJian dirWenJianObj, String zeRenZhe){
        dirWenJianObj.zrz=zeRenZhe;
    }

    /**
     * 向文件对象中设置年度
     */
    public static void setWenJianNianDu(DirWenJian dirWenJianObj, String nianDu){
        dirWenJianObj.nd=nianDu;
    }
    /**
     * 向文件对象中设置日期
     */
    public static void setWenJianRiQi(DirWenJian dirWenJianObj, String riQi){
        dirWenJianObj.rq=riQi;
    }
    /**
     * 向文件对象中设置机构
     */
    public static void setWenJianJiGou(DirWenJian dirWenJianObj, String jiGou){
        dirWenJianObj.jg=jiGou;
    }
    /**
     * 向文件对象中设置页数
     */
    public static void setWenJianYeShu(DirWenJian dirWenJianObj, String yeShu){
        dirWenJianObj.ys=yeShu;
    }
    /**
     * 向文件对象中设置分类号
     */
    public static void setWenJianFenLeiHao(DirWenJian dirWenJianObj, String fenLeiHao){
        dirWenJianObj.flh=fenLeiHao;
    }
    /**
     * 向文件对象中设置分类名称
     */
    public static void setWenJianFenLeiMingCheng(DirWenJian dirWenJianObj, String fenLeiMingCheng){
        dirWenJianObj.flmc=fenLeiMingCheng;
    }
    /**
     * 向文件对象中设置保管期限
     */
    public static void setWenJianBaoGuanQiXian(DirWenJian dirWenJianObj, String baoGuanQiXian){
        dirWenJianObj.bgqx=baoGuanQiXian;
    }
    /**
     * 向文件对象中设置备注
     */
    public static void setWenJianBeiZhu(DirWenJian dirWenJianObj, String beiZhu){
        dirWenJianObj.bz=beiZhu;
    }
    /**
     * 向文件对象中设置密级
     */
    public static void setWenJianMiJi(DirWenJian dirWenJianObj, String miJi){
        dirWenJianObj.mj=miJi;
    }
    /**
     * 向文件对象中设置档案库名称
     */
    public static void setWenJianDangAnKuMingCheng(DirWenJian dirWenJianObj, String dangAnKuMingCheng){
        dirWenJianObj.dakmc=dangAnKuMingCheng;
    }
    /**
     * 向文件对象中设置档案库标识
     */
    public static void setWenJianDangAnKuBiaoShi(DirWenJian dirWenJianObj, String dangAnKuBiaoShi){
        dirWenJianObj.dakbs=dangAnKuBiaoShi;
    }
    /**
     * 向文件对象中设置路径
     */
    public static void setWenJianLuJing(DirWenJian dirWenJianObj, String luJing){
        dirWenJianObj.lj=luJing;
    }
    /**
     * 向文件对象中设置电子档案名称
     */
    public static void setWenJianDianZiDangAnMingCheng(DirWenJian dirWenJianObj, String dianZiDangAnMingCheng){
        dirWenJianObj.dzdamc=dianZiDangAnMingCheng;
    }

}
