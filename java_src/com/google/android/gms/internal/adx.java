package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.analytics.AbstractC3938n;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.p253b.C9755a;
import com.xiaomi.market.sdk.C10445j;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class adx extends AbstractC3938n<adx> {

    /* renamed from: a */
    private String f21315a;

    /* renamed from: b */
    private String f21316b;

    /* renamed from: c */
    private String f21317c;

    /* renamed from: d */
    private String f21318d;

    /* renamed from: e */
    private boolean f21319e;

    /* renamed from: f */
    private String f21320f;

    /* renamed from: g */
    private boolean f21321g;

    /* renamed from: h */
    private double f21322h;

    /* renamed from: a */
    public String m17961a() {
        return this.f21315a;
    }

    /* renamed from: a */
    public void m17960a(double d) {
        C4588d.m23618b(d >= C9755a.f30449c && d <= 100.0d, "Sample rate must be between 0% and 100%");
        this.f21322h = d;
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(adx adxVar) {
        if (!TextUtils.isEmpty(this.f21315a)) {
            adxVar.m17958a(this.f21315a);
        }
        if (!TextUtils.isEmpty(this.f21316b)) {
            adxVar.m17955b(this.f21316b);
        }
        if (!TextUtils.isEmpty(this.f21317c)) {
            adxVar.m17952c(this.f21317c);
        }
        if (!TextUtils.isEmpty(this.f21318d)) {
            adxVar.m17950d(this.f21318d);
        }
        if (this.f21319e) {
            adxVar.m17957a(true);
        }
        if (!TextUtils.isEmpty(this.f21320f)) {
            adxVar.m17948e(this.f21320f);
        }
        if (this.f21321g) {
            adxVar.m17954b(this.f21321g);
        }
        if (this.f21322h != C9755a.f30449c) {
            adxVar.m17960a(this.f21322h);
        }
    }

    /* renamed from: a */
    public void m17958a(String str) {
        this.f21315a = str;
    }

    /* renamed from: a */
    public void m17957a(boolean z) {
        this.f21319e = z;
    }

    /* renamed from: b */
    public String m17956b() {
        return this.f21316b;
    }

    /* renamed from: b */
    public void m17955b(String str) {
        this.f21316b = str;
    }

    /* renamed from: b */
    public void m17954b(boolean z) {
        this.f21321g = z;
    }

    /* renamed from: c */
    public String m17953c() {
        return this.f21317c;
    }

    /* renamed from: c */
    public void m17952c(String str) {
        this.f21317c = str;
    }

    /* renamed from: d */
    public String m17951d() {
        return this.f21318d;
    }

    /* renamed from: d */
    public void m17950d(String str) {
        this.f21318d = str;
    }

    /* renamed from: e */
    public void m17948e(String str) {
        this.f21320f = str;
    }

    /* renamed from: e */
    public boolean m17949e() {
        return this.f21319e;
    }

    /* renamed from: f */
    public String m17947f() {
        return this.f21320f;
    }

    /* renamed from: g */
    public boolean m17946g() {
        return this.f21321g;
    }

    /* renamed from: h */
    public double m17945h() {
        return this.f21322h;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.f21315a);
        hashMap.put(C10445j.f32455aa, this.f21316b);
        hashMap.put("userId", this.f21317c);
        hashMap.put("androidAdId", this.f21318d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.f21319e));
        hashMap.put("sessionControl", this.f21320f);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f21321g));
        hashMap.put("sampleRate", Double.valueOf(this.f21322h));
        return a((Object) hashMap);
    }
}
