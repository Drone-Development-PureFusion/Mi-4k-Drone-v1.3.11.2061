package com.xiaomi.market.sdk;
/* renamed from: com.xiaomi.market.sdk.l */
/* loaded from: classes2.dex */
public final class C10447l implements AbstractC10446k {
    public static final String PACKAGE_NAME = "package_name";

    /* renamed from: aB */
    public static final String f32481aB = "diff_url";

    /* renamed from: aC */
    public static final String f32482aC = "diff_hash";

    /* renamed from: aE */
    public static final String f32483aE = "update_download";

    /* renamed from: aF */
    public static final String f32484aF = "download_id";

    /* renamed from: aG */
    public static final String f32485aG = "apk_path";

    /* renamed from: aH */
    public static final String f32486aH = "CREATE TABLE update_download (_id INTEGER PRIMARY KEY AUTOINCREMENT,package_name TEXT,download_id INTEGER, version_code INTEGER, apk_url TEXT, apk_hash TEXT, diff_url TEXT, diff_hash TEXT, apk_path TEXT, UNIQUE(package_name));";

    /* renamed from: aI */
    public static final String[] f32487aI = {"update_download.package_name", "update_download.download_id", "update_download.version_code", "update_download.apk_url", "update_download.apk_hash", "update_download.diff_url", "update_download.diff_hash", "update_download.apk_path"};

    /* renamed from: aw */
    public static final String f32488aw = "version_code";

    /* renamed from: ay */
    public static final String f32489ay = "apk_url";

    /* renamed from: az */
    public static final String f32490az = "apk_hash";
}
