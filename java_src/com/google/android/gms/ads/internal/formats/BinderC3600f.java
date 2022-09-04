package com.google.android.gms.ads.internal.formats;

import android.support.p001v4.util.SimpleArrayMap;
import android.view.View;
import com.google.android.gms.ads.internal.formats.AbstractC3603i;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.internal.AbstractC7813uu;
import com.google.android.gms.internal.AbstractC7835vd;
import com.google.android.gms.internal.aaa;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.ads.internal.formats.f */
/* loaded from: classes.dex */
public class BinderC3600f extends AbstractC7835vd.AbstractBinderC7836a implements AbstractC3603i.AbstractC3604a {

    /* renamed from: a */
    private final C3595a f14121a;

    /* renamed from: b */
    private final String f14122b;

    /* renamed from: c */
    private final SimpleArrayMap<String, BinderC3597c> f14123c;

    /* renamed from: d */
    private final SimpleArrayMap<String, String> f14124d;

    /* renamed from: e */
    private final Object f14125e = new Object();

    /* renamed from: f */
    private AbstractC3603i f14126f;

    public BinderC3600f(String str, SimpleArrayMap<String, BinderC3597c> simpleArrayMap, SimpleArrayMap<String, String> simpleArrayMap2, C3595a c3595a) {
        this.f14122b = str;
        this.f14123c = simpleArrayMap;
        this.f14124d = simpleArrayMap2;
        this.f14121a = c3595a;
    }

    @Override // com.google.android.gms.internal.AbstractC7835vd
    /* renamed from: a */
    public String mo13342a(String str) {
        return this.f14124d.get(str);
    }

    @Override // com.google.android.gms.internal.AbstractC7835vd
    /* renamed from: a */
    public List<String> mo13343a() {
        int i = 0;
        String[] strArr = new String[this.f14123c.size() + this.f14124d.size()];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f14123c.size(); i3++) {
            strArr[i2] = this.f14123c.keyAt(i3);
            i2++;
        }
        while (i < this.f14124d.size()) {
            strArr[i2] = this.f14124d.keyAt(i);
            i++;
            i2++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i.AbstractC3604a
    /* renamed from: a */
    public void mo27381a(AbstractC3603i abstractC3603i) {
        synchronized (this.f14125e) {
            this.f14126f = abstractC3603i;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7835vd
    /* renamed from: b */
    public AbstractC7813uu mo13340b(String str) {
        return this.f14123c.get(str);
    }

    @Override // com.google.android.gms.internal.AbstractC7835vd
    /* renamed from: b */
    public void mo13341b() {
        synchronized (this.f14125e) {
            if (this.f14126f == null) {
                C3784b.m26844b("Attempt to perform recordImpression before ad initialized.");
            } else {
                this.f14126f.mo27378a();
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7835vd
    /* renamed from: c */
    public void mo13339c(String str) {
        synchronized (this.f14125e) {
            if (this.f14126f == null) {
                C3784b.m26844b("Attempt to call performClick before ad initialized.");
            } else {
                this.f14126f.mo27373a((View) null, str, (JSONObject) null, (JSONObject) null, (JSONObject) null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i.AbstractC3604a
    /* renamed from: k */
    public String mo27380k() {
        return "3";
    }

    @Override // com.google.android.gms.internal.AbstractC7835vd, com.google.android.gms.ads.internal.formats.AbstractC3603i.AbstractC3604a
    /* renamed from: l */
    public String mo13338l() {
        return this.f14122b;
    }

    @Override // com.google.android.gms.ads.internal.formats.AbstractC3603i.AbstractC3604a
    /* renamed from: m */
    public C3595a mo27379m() {
        return this.f14121a;
    }
}
