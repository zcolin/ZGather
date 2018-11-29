package com.zcolin.zupdate;

import com.zcolin.frame.http.ZReply;

/**
 * 检查更新请求实体基类
 */
public interface ZUpdateReply extends ZReply {
    /**
     * 是否有版本更新
     */
    boolean isUpdate();

    /**
     * 是否强制更新
     */
    boolean isForce();

    /**
     * 展示给用户的更新消息
     */
    String updateMessage();

    /**
     * 新版本的版本号
     */
    String versionName();

    /**
     * 需要下载新版本的地址
     */
    public String downLoadUrl();
}
