package com.baidu.tts.p114m;

import com.baidu.tts.p102f.EnumC1172d;
import com.baidu.tts.p102f.EnumC1176h;
import com.baidu.tts.p115n.AbstractC1241a;
/* renamed from: com.baidu.tts.m.d */
/* loaded from: classes.dex */
public class C1233d<T> extends AbstractC1241a<T> {

    /* renamed from: a */
    private String f3062a = "5";

    /* renamed from: b */
    private String f3063b = "5";

    /* renamed from: c */
    private String f3064c = "5";

    /* renamed from: d */
    private EnumC1176h f3065d = EnumC1176h.ZH;

    /* renamed from: e */
    private EnumC1172d f3066e = EnumC1172d.UTF8;

    /* renamed from: f */
    private String f3067f = "0";

    /* renamed from: a */
    public void m36187a(EnumC1172d enumC1172d) {
        this.f3066e = enumC1172d;
    }

    /* renamed from: i */
    public void m36186i(String str) {
        this.f3065d = EnumC1176h.m36315a(str);
    }

    /* renamed from: j */
    public void m36185j(String str) {
        this.f3067f = str;
    }

    /* renamed from: k */
    public void m36184k(String str) {
        this.f3062a = str;
    }

    /* renamed from: l */
    public void m36183l(String str) {
        this.f3063b = str;
    }

    /* renamed from: m */
    public void m36182m(String str) {
        this.f3064c = str;
    }

    /* renamed from: p */
    public String m36181p() {
        return this.f3066e.m36323a();
    }

    /* renamed from: q */
    public String m36180q() {
        return this.f3066e.m36321b();
    }

    /* renamed from: r */
    public String m36179r() {
        return this.f3065d.m36316a();
    }

    /* renamed from: s */
    public String m36178s() {
        return this.f3067f;
    }

    /* renamed from: t */
    public long m36177t() {
        try {
            return Long.parseLong(this.f3067f);
        } catch (Exception e) {
            return 0L;
        }
    }

    /* renamed from: u */
    public String m36176u() {
        return this.f3062a;
    }

    /* renamed from: v */
    public String m36175v() {
        return this.f3063b;
    }

    /* renamed from: w */
    public String m36174w() {
        return this.f3064c;
    }

    /* renamed from: x */
    public long m36173x() {
        return Long.parseLong(this.f3064c);
    }

    /* renamed from: y */
    public long m36172y() {
        return Long.parseLong(this.f3062a);
    }

    /* renamed from: z */
    public long m36171z() {
        return Long.parseLong(this.f3063b);
    }
}
