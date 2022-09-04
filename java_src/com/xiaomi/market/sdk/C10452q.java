package com.xiaomi.market.sdk;

import android.text.TextUtils;
import java.io.File;
/* renamed from: com.xiaomi.market.sdk.q */
/* loaded from: classes2.dex */
public class C10452q {
    public String packageName = "";

    /* renamed from: aT */
    public String f32502aT = "";
    public int versionCode = 0;
    public String versionName = "";

    /* renamed from: aU */
    public String f32503aU = "";
    public String sourceDir = "";

    /* renamed from: aV */
    public String f32504aV = "";

    /* renamed from: aW */
    public boolean f32505aW = false;

    private C10452q() {
    }

    /* renamed from: h */
    public static C10452q m5088h(String str) {
        C10452q c10452q = new C10452q();
        c10452q.packageName = str;
        return c10452q;
    }

    /* renamed from: n */
    public String m5087n() {
        if (TextUtils.isEmpty(this.sourceDir)) {
            return null;
        }
        return TextUtils.isEmpty(this.f32504aV) ? C10437b.m5143a(new File(this.sourceDir)) : this.f32504aV;
    }
}
