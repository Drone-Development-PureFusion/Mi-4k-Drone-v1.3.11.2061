package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC3938n;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class adp extends AbstractC3938n<adp> {

    /* renamed from: a */
    private String f21286a;

    /* renamed from: b */
    private String f21287b;

    /* renamed from: c */
    private String f21288c;

    /* renamed from: d */
    private String f21289d;

    /* renamed from: e */
    private String f21290e;

    /* renamed from: f */
    private String f21291f;

    /* renamed from: g */
    private String f21292g;

    /* renamed from: h */
    private String f21293h;

    /* renamed from: i */
    private String f21294i;

    /* renamed from: j */
    private String f21295j;

    /* renamed from: a */
    public String m18023a() {
        return this.f21286a;
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(adp adpVar) {
        if (!TextUtils.isEmpty(this.f21286a)) {
            adpVar.m18021a(this.f21286a);
        }
        if (!TextUtils.isEmpty(this.f21287b)) {
            adpVar.m18019b(this.f21287b);
        }
        if (!TextUtils.isEmpty(this.f21288c)) {
            adpVar.m18017c(this.f21288c);
        }
        if (!TextUtils.isEmpty(this.f21289d)) {
            adpVar.m18015d(this.f21289d);
        }
        if (!TextUtils.isEmpty(this.f21290e)) {
            adpVar.m18013e(this.f21290e);
        }
        if (!TextUtils.isEmpty(this.f21291f)) {
            adpVar.m18011f(this.f21291f);
        }
        if (!TextUtils.isEmpty(this.f21292g)) {
            adpVar.m18009g(this.f21292g);
        }
        if (!TextUtils.isEmpty(this.f21293h)) {
            adpVar.m18007h(this.f21293h);
        }
        if (!TextUtils.isEmpty(this.f21294i)) {
            adpVar.m18005i(this.f21294i);
        }
        if (!TextUtils.isEmpty(this.f21295j)) {
            adpVar.m18003j(this.f21295j);
        }
    }

    /* renamed from: a */
    public void m18021a(String str) {
        this.f21286a = str;
    }

    /* renamed from: b */
    public String m18020b() {
        return this.f21287b;
    }

    /* renamed from: b */
    public void m18019b(String str) {
        this.f21287b = str;
    }

    /* renamed from: c */
    public String m18018c() {
        return this.f21288c;
    }

    /* renamed from: c */
    public void m18017c(String str) {
        this.f21288c = str;
    }

    /* renamed from: d */
    public String m18016d() {
        return this.f21289d;
    }

    /* renamed from: d */
    public void m18015d(String str) {
        this.f21289d = str;
    }

    /* renamed from: e */
    public String m18014e() {
        return this.f21290e;
    }

    /* renamed from: e */
    public void m18013e(String str) {
        this.f21290e = str;
    }

    /* renamed from: f */
    public String m18012f() {
        return this.f21291f;
    }

    /* renamed from: f */
    public void m18011f(String str) {
        this.f21291f = str;
    }

    /* renamed from: g */
    public String m18010g() {
        return this.f21292g;
    }

    /* renamed from: g */
    public void m18009g(String str) {
        this.f21292g = str;
    }

    /* renamed from: h */
    public String m18008h() {
        return this.f21293h;
    }

    /* renamed from: h */
    public void m18007h(String str) {
        this.f21293h = str;
    }

    /* renamed from: i */
    public String m18006i() {
        return this.f21294i;
    }

    /* renamed from: i */
    public void m18005i(String str) {
        this.f21294i = str;
    }

    /* renamed from: j */
    public String m18004j() {
        return this.f21295j;
    }

    /* renamed from: j */
    public void m18003j(String str) {
        this.f21295j = str;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.f21286a);
        hashMap.put("source", this.f21287b);
        hashMap.put("medium", this.f21288c);
        hashMap.put("keyword", this.f21289d);
        hashMap.put("content", this.f21290e);
        hashMap.put("id", this.f21291f);
        hashMap.put("adNetworkId", this.f21292g);
        hashMap.put("gclid", this.f21293h);
        hashMap.put("dclid", this.f21294i);
        hashMap.put("aclid", this.f21295j);
        return a((Object) hashMap);
    }
}
