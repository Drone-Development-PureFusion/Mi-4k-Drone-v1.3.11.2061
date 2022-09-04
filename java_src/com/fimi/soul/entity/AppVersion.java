package com.fimi.soul.entity;

import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes.dex */
public class AppVersion extends BaseModel {
    private String binKey;
    private String fileEncode;

    /* renamed from: id */
    private int f7779id;
    private String modelName;
    private String newVersion;
    private String size;
    private String sysid;
    private String updcontents;
    private String uploadTime;
    private String url;
    private String userVersion;

    public String getBinKey() {
        return this.binKey;
    }

    public String getFileEncode() {
        return this.fileEncode;
    }

    public int getId() {
        return this.f7779id;
    }

    public String getModelName() {
        return this.modelName;
    }

    public String getNewVersion() {
        return this.newVersion;
    }

    public String getSize() {
        return this.size;
    }

    public String getSysid() {
        return this.sysid;
    }

    public String getUpdcontents() {
        return this.updcontents;
    }

    public String getUploadTime() {
        return this.uploadTime;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserVersion() {
        return this.userVersion;
    }

    public void setBinKey(String str) {
        this.binKey = str;
    }

    public void setFileEncode(String str) {
        this.fileEncode = str;
    }

    public void setId(int i) {
        this.f7779id = i;
    }

    public void setModelName(String str) {
        this.modelName = str;
    }

    public void setNewVersion(String str) {
        this.newVersion = str;
    }

    public void setSize(String str) {
        this.size = str;
    }

    public void setSysid(String str) {
        this.sysid = str;
    }

    public void setUpdcontents(String str) {
        this.updcontents = str;
    }

    public void setUploadTime(String str) {
        this.uploadTime = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUserVersion(String str) {
        this.userVersion = str;
    }

    public String toString() {
        return "AppVersion{id=" + this.f7779id + ", size='" + this.size + C0494h.f738z + ", userVersion='" + this.userVersion + C0494h.f738z + ", newVersion='" + this.newVersion + C0494h.f738z + ", updcontents='" + this.updcontents + C0494h.f738z + ", uploadTime='" + this.uploadTime + C0494h.f738z + ", url='" + this.url + C0494h.f738z + ", sysid='" + this.sysid + C0494h.f738z + ", modelName='" + this.modelName + C0494h.f738z + ", fileEncode='" + this.fileEncode + C0494h.f738z + ", binKey='" + this.binKey + C0494h.f738z + C0494h.f735w;
    }
}
