package com.google.android.gms.internal;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
@aaa
/* loaded from: classes.dex */
public class aaj {

    /* renamed from: a */
    private final List<String> f20738a;

    /* renamed from: b */
    private final List<String> f20739b;

    /* renamed from: c */
    private final String f20740c;

    /* renamed from: d */
    private final String f20741d;

    /* renamed from: e */
    private final String f20742e;

    /* renamed from: f */
    private final String f20743f;

    /* renamed from: g */
    private final boolean f20744g;

    /* renamed from: h */
    private final boolean f20745h;

    /* renamed from: i */
    private final String f20746i;

    /* renamed from: j */
    private final String f20747j;

    /* renamed from: k */
    private String f20748k;

    /* renamed from: l */
    private int f20749l;

    public aaj(int i, Map<String, String> map) {
        this.f20748k = map.get("url");
        this.f20741d = map.get("base_uri");
        this.f20742e = map.get("post_parameters");
        this.f20744g = m18616b(map.get("drt_include"));
        this.f20745h = m18616b(map.get("pan_include"));
        this.f20740c = map.get("activation_overlay_url");
        this.f20739b = m18614c(map.get("check_packages"));
        this.f20746i = map.get("request_id");
        this.f20743f = map.get("type");
        this.f20738a = m18614c(map.get("errors"));
        this.f20749l = i;
        this.f20747j = map.get("fetched_ad");
    }

    /* renamed from: b */
    private static boolean m18616b(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    /* renamed from: c */
    private List<String> m18614c(String str) {
        if (str == null) {
            return null;
        }
        return Arrays.asList(str.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
    }

    /* renamed from: a */
    public int m18619a() {
        return this.f20749l;
    }

    /* renamed from: a */
    public void m18618a(String str) {
        this.f20748k = str;
    }

    /* renamed from: b */
    public List<String> m18617b() {
        return this.f20738a;
    }

    /* renamed from: c */
    public String m18615c() {
        return this.f20742e;
    }

    /* renamed from: d */
    public String m18613d() {
        return this.f20748k;
    }

    /* renamed from: e */
    public String m18612e() {
        return this.f20743f;
    }

    /* renamed from: f */
    public boolean m18611f() {
        return this.f20744g;
    }

    /* renamed from: g */
    public String m18610g() {
        return this.f20746i;
    }

    /* renamed from: h */
    public String m18609h() {
        return this.f20747j;
    }
}
