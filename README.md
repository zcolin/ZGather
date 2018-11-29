# ZGather
## 具有独立功能的，代码提交较小或功能较单一的会放置到此库下。
此项目包含：
#### 1. libUpdate 更新组件，包括更新检测，判断更新种类，显示更新信息，更新下载及安装等。
##### dependencies
```
dependencies {
    implementation "com.android.support:appcompat-v7:$supprotVersion"
    implementation "com.android.support:design:$supprotVersion"
    implementation "com.android.support:recyclerview-v7:$supprotVersion"
    implementation "com.github.zcolin:ZFrame:version"//程序框架 
    implementation "com.github.zcolin:ZUILib:version"//UI库
    implementation 'com.github.zcolin.ZGather:libUpdate:latest.release'
}
```
##### 调用  
```
ZUpdate.instance()
       .setUpdateUrl("")
       .setOnlyWifi(false)
       .setUpdateReplyClass(ZDefReply.class)
       .setDownloadSilent(true)
       .checkVersion(mActivity);
```