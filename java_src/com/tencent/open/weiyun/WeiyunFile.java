package com.tencent.open.weiyun;
/* loaded from: classes2.dex */
public class WeiyunFile {

    /* renamed from: a */
    private String f32054a;

    /* renamed from: b */
    private String f32055b;

    /* renamed from: c */
    private String f32056c;

    /* renamed from: d */
    private long f32057d;

    public WeiyunFile(String str, String str2, String str3, long j) {
        this.f32054a = str;
        this.f32055b = str2;
        this.f32056c = str3;
        this.f32057d = j;
    }

    public String getCreateTime() {
        return this.f32056c;
    }

    public String getFileId() {
        return this.f32054a;
    }

    public String getFileName() {
        return this.f32055b;
    }

    public long getFileSize() {
        return this.f32057d;
    }

    public void setCreateTime(String str) {
        this.f32056c = str;
    }

    public void setFileId(String str) {
        this.f32054a = str;
    }

    public void setFileName(String str) {
        this.f32055b = str;
    }

    public void setFileSize(long j) {
        this.f32057d = j;
    }
}
