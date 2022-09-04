package com.tencent.stat;
/* renamed from: com.tencent.stat.h */
/* loaded from: classes2.dex */
/* synthetic */ class C10356h {

    /* renamed from: a */
    static final /* synthetic */ int[] f32278a = new int[StatReportStrategy.values().length];

    static {
        try {
            f32278a[StatReportStrategy.INSTANT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f32278a[StatReportStrategy.ONLY_WIFI.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f32278a[StatReportStrategy.APP_LAUNCH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f32278a[StatReportStrategy.DEVELOPER.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f32278a[StatReportStrategy.BATCH.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f32278a[StatReportStrategy.PERIOD.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f32278a[StatReportStrategy.ONLY_WIFI_NO_CACHE.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
    }
}
