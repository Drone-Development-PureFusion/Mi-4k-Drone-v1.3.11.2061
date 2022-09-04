package com.baidu.tts.p114m;

import com.baidu.tts.aop.tts.TtsError;
import com.baidu.tts.p102f.EnumC1166a;
import com.baidu.tts.p102f.EnumC1173e;
import com.baidu.tts.p115n.AbstractC1241a;
/* renamed from: com.baidu.tts.m.h */
/* loaded from: classes.dex */
public class C1237h extends AbstractC1241a<C1237h> {

    /* renamed from: a */
    private EnumC1173e f3073a;

    /* renamed from: b */
    private int f3074b;

    /* renamed from: c */
    private int f3075c;

    /* renamed from: d */
    private String f3076d;

    /* renamed from: e */
    private int f3077e;

    /* renamed from: f */
    private int f3078f;

    /* renamed from: g */
    private byte[] f3079g;

    /* renamed from: h */
    private EnumC1166a f3080h;

    /* renamed from: i */
    private C1238i f3081i;

    /* renamed from: j */
    private TtsError f3082j;

    /* renamed from: a */
    public static C1237h m36154a(C1238i c1238i, TtsError ttsError) {
        C1237h m36148b = m36148b(c1238i);
        m36148b.m36158a(ttsError);
        return m36148b;
    }

    /* renamed from: b */
    public static C1237h m36149b(TtsError ttsError) {
        C1237h c1237h = new C1237h();
        c1237h.m36158a(ttsError);
        return c1237h;
    }

    /* renamed from: b */
    public static C1237h m36148b(C1238i c1238i) {
        C1237h c1237h = new C1237h();
        c1237h.m36155a(c1238i);
        return c1237h;
    }

    /* renamed from: a */
    public int m36160a() {
        return this.f3075c;
    }

    /* renamed from: a */
    public void m36159a(int i) {
        this.f3075c = i;
    }

    /* renamed from: a */
    public void m36158a(TtsError ttsError) {
        this.f3082j = ttsError;
    }

    /* renamed from: a */
    public void m36157a(EnumC1166a enumC1166a) {
        this.f3080h = enumC1166a;
    }

    /* renamed from: a */
    public void m36156a(EnumC1173e enumC1173e) {
        this.f3073a = enumC1173e;
    }

    /* renamed from: a */
    public void m36155a(C1238i c1238i) {
        this.f3081i = c1238i;
    }

    /* renamed from: a */
    public void m36153a(String str) {
        this.f3076d = str;
    }

    /* renamed from: a */
    public void m36152a(byte[] bArr) {
        this.f3079g = bArr;
    }

    /* renamed from: b */
    public int m36151b() {
        return this.f3077e;
    }

    /* renamed from: b */
    public void m36150b(int i) {
        this.f3077e = i;
    }

    /* renamed from: c */
    public int m36147c() {
        return this.f3078f;
    }

    /* renamed from: c */
    public void m36146c(int i) {
        this.f3078f = i;
    }

    /* renamed from: d */
    public void m36144d(int i) {
        this.f3074b = i;
    }

    /* renamed from: d */
    public byte[] m36145d() {
        return this.f3079g;
    }

    /* renamed from: e */
    public C1238i m36143e() {
        return this.f3081i;
    }

    /* renamed from: f */
    public TtsError m36142f() {
        return this.f3082j;
    }

    /* renamed from: g */
    public EnumC1173e m36141g() {
        return this.f3073a;
    }
}
