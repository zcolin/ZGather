package com.zcolin.zupdate;

/**
 * 默认检查更新返回报文
 */
class ZDefReply implements ZUpdateReply {
    public int    code;             //成功失败状态码
    public String msg;              //错误信息

    public boolean isUpdate;        //是否有新版本
    public boolean isForce;         //是否强制更新
    public String  versionName;     //新版本名称
    public String  updateMessage;   //版本更新信息
    public String  downLoadUrl;     //下载地址

    @Override
    public boolean isForce() {
        return isForce;
    }

    @Override
    public String updateMessage() {
        return updateMessage;
    }

    @Override
    public String versionName() {
        return versionName;
    }

    @Override
    public String downLoadUrl() {
        return downLoadUrl;
    }

    @Override
    public boolean isUpdate() {
        return isUpdate;
    }

    @Override
    public boolean isSuccess() {
        return code == 200;
    }

    @Override
    public int getReplyCode() {
        return code;
    }

    @Override
    public String getErrorMessage() {
        return msg;
    }
}
