package com.xiaomi.smack;

import com.xiaomi.channel.commonutils.misc.C10405a;
import com.xiaomi.channel.commonutils.misc.C10407c;
import java.util.Map;
/* renamed from: com.xiaomi.smack.b */
/* loaded from: classes.dex */
public class C10718b implements Cloneable {

    /* renamed from: b */
    public static String f33419b = "wcc-ml-test10.bj";

    /* renamed from: c */
    public static final String f33420c = C10407c.f32345b;

    /* renamed from: d */
    public static String f33421d = null;

    /* renamed from: a */
    private String f33422a;

    /* renamed from: e */
    private String f33423e;

    /* renamed from: f */
    private int f33424f;

    /* renamed from: g */
    private boolean f33425g = AbstractC10716a.f33398a;

    /* renamed from: h */
    private boolean f33426h = true;

    /* renamed from: i */
    private String f33427i;

    /* renamed from: j */
    private AbstractC10722e f33428j;

    public C10718b(Map<String, Integer> map, int i, String str, AbstractC10722e abstractC10722e) {
        m3962a(map, i, str, abstractC10722e);
    }

    /* renamed from: a */
    private void m3962a(Map<String, Integer> map, int i, String str, AbstractC10722e abstractC10722e) {
        this.f33423e = m3960b();
        this.f33424f = i;
        this.f33422a = str;
        this.f33428j = abstractC10722e;
    }

    /* renamed from: b */
    public static final String m3960b() {
        return f33421d != null ? f33421d : C10405a.m5262a() ? "sandbox.xmpush.xiaomi.com" : C10405a.m5260b() ? f33420c : "app.chat.xiaomi.net";
    }

    /* renamed from: a */
    public void m3963a(String str) {
        this.f33427i = str;
    }

    /* renamed from: a */
    public void m3961a(boolean z) {
        this.f33425g = z;
    }

    /* renamed from: a */
    public byte[] mo3964a() {
        return null;
    }

    /* renamed from: b */
    public void m3959b(String str) {
        this.f33423e = str;
    }

    /* renamed from: c */
    public String m3958c() {
        return this.f33427i;
    }

    /* renamed from: d */
    public int m3957d() {
        return this.f33424f;
    }

    /* renamed from: e */
    public String m3956e() {
        return this.f33423e;
    }

    /* renamed from: f */
    public boolean m3955f() {
        return this.f33425g;
    }
}
