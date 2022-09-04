package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.C3779u;
import com.xiaomi.market.sdk.C10445j;
import java.util.LinkedHashMap;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.ug */
/* loaded from: classes.dex */
public class C7790ug {

    /* renamed from: a */
    private boolean f25910a = C7788uf.f25729N.m13486c().booleanValue();

    /* renamed from: b */
    private String f25911b = C7788uf.f25730O.m13486c();

    /* renamed from: c */
    private Map<String, String> f25912c = new LinkedHashMap();

    /* renamed from: d */
    private Context f25913d;

    /* renamed from: e */
    private String f25914e;

    public C7790ug(Context context, String str) {
        this.f25913d = null;
        this.f25914e = null;
        this.f25913d = context;
        this.f25914e = str;
        this.f25912c.put("s", "gmob_sdk");
        this.f25912c.put("v", "3");
        this.f25912c.put(C10445j.f32457ac, Build.VERSION.RELEASE);
        this.f25912c.put("sdk", Build.VERSION.SDK);
        this.f25912c.put("device", C3779u.m26890e().m18320e());
        this.f25912c.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        this.f25912c.put("is_lite_sdk", C3779u.m26890e().m18308l(context) ? "1" : "0");
        aak m18601a = C3779u.m26881n().m18601a(this.f25913d);
        this.f25912c.put("network_coarse", Integer.toString(m18601a.f20762m));
        this.f25912c.put("network_fine", Integer.toString(m18601a.f20763n));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m13467a() {
        return this.f25910a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m13466b() {
        return this.f25911b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Context m13465c() {
        return this.f25913d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m13464d() {
        return this.f25914e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<String, String> m13463e() {
        return this.f25912c;
    }
}
