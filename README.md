# nh-deep
数字档案管理工具，eep封装，四性检测等

其中电子文件封装(EEP)工具,是按照《基于XML的电子文件封装规范》(DA/T 48-2009)规范设计和实现的,为电子文件提供统一的封装格式,保证电子文件及其元数据的完整合一性,实现电子文件的自包含、自描述和自证明,做到封装文件格式和计算机的软硬件无关,利于电子文件长期保存和交换。

引用
```
<dependency>
    <groupId>com.github.jeffreyning</groupId>
    <artifactId>nh-deep</artifactId>
    <version>1.1.0-RELEASE</version>
</dependency>
```
提供生成一文一件、案卷、盒的eep封装包
提供生成导出包需要的目录xml、说明文件和《电子文件移交接收登记表.doc》
具体查看项目中的测试demo代码
咨询请联系 qq:942225169 email:jeffreyning@aliyun.com

生成一文一件eep的示例代码
```
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
```

案卷eep封装结果示例
```
<电子文件封装包 xmlns="http://www.saac.gov.cn/standards/ERM/encapsulation">
  <封装包格式描述><![CDATA[本EEP根据中华人民共和国档案行业标准DA/T 48-2009《基于XML的电子文件封装规范》生成]]></封装包格式描述>
  <版本><![CDATA[2009]]></版本>
  <被签名对象 eep版本="2009">
    <封装包类型><![CDATA[原始型]]></封装包类型>
    <封装包类型描述><![CDATA[本封装包包含电子文件数据及其元数据，原始封装，未经修改]]></封装包类型描述>
    <封装包创建时间><![CDATA[2023-02-24 16:42:17]]></封装包创建时间>
    <封装包创建单位><![CDATA[xx公司]]></封装包创建单位>
    <封装内容>
      <文件实体块>
        <聚合层次><![CDATA[文件]]></聚合层次>
        <来源>
          <全宗名称><![CDATA[x全宗]]></全宗名称>
          <立档单位名称><![CDATA[x立档单位]]></立档单位名称>
        </来源>
        <电子文件号/>
        <内容描述 descr="主要用于四性检测，以及导入档案系统使用">
          <题名><![CDATA[x资料]]></题名>
          <年度><![CDATA[2021]]></年度>
          <保管期限><![CDATA[永久]]></保管期限>
          <项目名称><![CDATA[x字[2021]10010号]]></项目名称>
          <档号><![CDATA[2021-2-Y-001]]></档号>
          <分类号><![CDATA[2]]></分类号>
          <分类名称><![CDATA[开发]]></分类名称>
          <归档部门><![CDATA[综合部]]></归档部门>
          <件号><![CDATA[001]]></件号>
          <文件类型><![CDATA[发文]]></文件类型>
          <页数><![CDATA[1]]></页数>
          <归档份数><![CDATA[1]]></归档份数>
          <库存量><![CDATA[1]]></库存量>
          <实体类别><![CDATA[纸质]]></实体类别>
          <盒号><![CDATA[001]]></盒号>
          <电子文件数据><![CDATA[1]]></电子文件数据>
        </内容描述>
        <形式特征>
          <件数><![CDATA[1]]></件数>
          <页数><![CDATA[1]]></页数>
          <语种/>
          <稿本/>
        </形式特征>
        <存储位置>
          <当前位置/>
          <脱机载体编号/>
          <脱机载体存址/>
          <缩微号/>
        </存储位置>
        <权限管理>
          <知识产权说明/>
        </权限管理>
        <附注><![CDATA[文件eep封装 咨询联系 ning qq:942225169]]></附注>
        <文件数据>
          <文档>
            <文档标识符/>
            <文档序号/>
            <文档主从声明><![CDATA[主文件]]></文档主从声明>
            <题名/>
            <文档数据>
              <电子属性>
                <格式信息>
                  <格式名称/>
                  <格式版本/>
                  <MIME媒体类型/>
                </格式信息>
                <计算机文件名><![CDATA[1.jpg]]></计算机文件名>
                <计算机文件大小><![CDATA[166605]]></计算机文件大小>
                <校验码/>
                <创建时间/>
                <操作系统/>
                <硬件架构/>
                <文档创建程序/>
                <信息系统描述/>
                <存储位置/>
              </电子属性>
              <数字化属性>
                <数字化对象形态/>
                <扫描分辨率/>
                <扫描色彩模式/>
                <图像压缩方案/>
                <数字化时间/>
                <数字化对象描述/>
                <数字化授权信息/>
                <扫描设备类型/>
                <扫描设备制造商/>
                <扫描设备型号/>
                <数字化软件名称/>
                <数字化软件版本/>
                <数字化软件生产商/>
              </数字化属性>
            </文档数据>
          </文档>
        </文件数据>
      </文件实体块>
      <业务实体块>
        <业务实体>
          <业务状态/>
          <业务行为><![CDATA[保存]]></业务行为>
          <行为时间><![CDATA[2023-02-24 16:42:17]]></行为时间>
          <行为依据/>
          <行为描述/>
        </业务实体>
      </业务实体块>
    </封装内容>
  </被签名对象>
  <电子签名块>
    <签名标识符号><![CDATA[MD5]]></签名标识符号>
    <签名规则><![CDATA[摘要签名]]></签名规则>
    <签名时间/>
    <签名人/>
    <签名结果><![CDATA[e8d0b48ce16c57f93246c136ce77b094]]></签名结果>
    <证书块/>
    <签名算法标识/>
  </电子签名块>
</电子文件封装包>
```

