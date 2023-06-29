
基于V免签二次开发的码支付

- 配置改为yml 
- h2->mysql（方便数据管理），h2配置没删，可继续使用同原版本，Mysql需要创建数据库gu-pay（或自行修改）
- 同步返回页面后也异步发送消息通知（这样结果页只用专注展示即可）
- 增加Docker部署
- 如有问题发ISSUE或者联系gugumeng@qq.com

以下为原作者链接信息，如有侵权，联系删之

在此也替自己原作者求个star，完全免费开源的，包含php服务端和java服务端两套

还包括的了移动端的app，

V免签  —— 个人开发者收款解决方案
V免签 是基于SpringBoot 2.1.1 实现的一套免签支付程序，主要包含以下特色：

 + 收款即时到账，无需进入第三方账户，收款更安全
 + 使用H2-Database，仅需安装Java环境，简单配置，一键搭建
 + 超简单Api使用，提供统一Api实现收款回调
 + 免费、开源，无后门风险
 + 支持监听店员收款信息，可使用支付宝微信小号/模拟器挂机，方便IOS用户
 + 免root，免xp框架，不修改支付宝/微信客户端，防封更安全
> 监控端的开源地址位于： https://github.com/Gugumeng/qrPayApp
>
> [点击下载监控端](https://download.guguya.ltd/qrApp.apk)
> 

> 如果您不熟悉Java的配置，您可以使用原作者开发的PHP版本的服务端（ https://github.com/szvone/Vmqphp ）


> V免签的运行环境为JDK版本1.8。

> V免签仅供个人开发者调试测试使用，请勿用于非法用途，商用请您申请官方商户接口

## 安装

 + 下载已经编译好的war,位于GitHub的releases中
 + 确认本机已经拥有java的运行环境（JDK>=1.8）,如果没有，请您安装java的运行环境
 + 在war包的同级目录，在控制台输入启动命令 java -jar v.war
    + 请将v.war替换成您下载的war包的名字
    + 如果您需要自定义项目的运行端口，请您在启动的时候使用：java -jar v.war --server.port=9090 (9090可以替换成任意端口)
 + 打开浏览器，访问 localhost:8080
 + 点击系统设置，进入设置页面，修改系统的默认配置
 + 下载V免签监控端到安卓手机或安卓模拟器，开启辅助服务，实现收款回调功能
 + 默认管理账号为：admin
 + 默认通讯密钥为：admin
 + 保存配置后，即可开始使用


 > 升级说明：请您直接下载新版本覆盖旧版本即可！


## 说明
 + 请部署完成后访问后台，有详细的Api说明


## 注意

  + 本系统原理为监控收款后手机的通知栏推送消息，所以请保持微信/支付宝/V免签监控端后台正常运行，且添加到内存清理白名单！

  + 数据迁移问题：本程序使用使用的是h2数据库，数据库文件位于用户目录下的mq.mv.db，数据迁移请您复制该文件至新服务器即可
    + window位于：C:\Users\用户名\mq.mv.db
    + linux应该位于：~/mq.mv.db


  + v免签面向用户是个人开发者，如果您不懂如何开发网站，那么v免签不适合您的使用！
  
  + v免签的原理是监控手机收到收款后的通知栏推送信息，所以不适合于商用多用户的情况，如果您想用于商用，请二次开发！
  
  + v免签是免费开源产品，所有程序均开放源代码，所以不会有收费计划，因此作者不可能教会每个人部署安装，请参考文档多百度谷歌，v免签使用具有一定的技术门槛，请见谅！
  
  + v免签的监控端并不适配所有手机，遇到手机无法正常使用的时候，请您更换手机或使用模拟器挂机！
  
  + v免签拥有双语言服务端，当您使用php版本服务端遇到问题的时候，请您尝试使用java版本服务端，php版本服务端配置略复杂，需要配置伪静态规则，请知悉！

  + 正常的安装步骤简略如下
    + 下载服务端部署(GitHub中下载的为最新版)
    + 登录网站后台更改系统设置
    + 打开网站后台监控端设置
    + 下载监控端
    + 安装监控端后使用手动配置或扫码配置
    + 监控端中点击开启服务跳转到辅助功能中开启服务
    + 开启服务后返回v免签点击检测监听权限
    + 如果显示监听权限正常，至此安装完毕，如果只收到通知栏推送的测试通知，则系统不兼容无法正常监听
    + 如果显示监听权限正常，还是无法正常运行，那么请确定微信是否关注 “微信支付”这个公众号
    
  + v免签支持的通知有：
    + 支付宝个人收款的推送通知
    + 支付宝商家二维码的收款推送通知
    + 支付宝店员通绑定的店员账号收款的推送通知
    + 微信二维码收款推送通知
    + 微信店员收款推送通知
    

## 版权信息

V免签遵循 MIT License 开源协议发布，并提供免费使用，请勿用于非法用途。
