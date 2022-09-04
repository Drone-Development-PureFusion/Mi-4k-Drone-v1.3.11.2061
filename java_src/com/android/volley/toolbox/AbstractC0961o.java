package com.android.volley.toolbox;

import com.android.volley.AbstractC0916n;
import com.android.volley.C0912j;
import com.android.volley.C0924p;
import com.android.volley.C0968v;
import java.io.UnsupportedEncodingException;
/* renamed from: com.android.volley.toolbox.o */
/* loaded from: classes.dex */
public abstract class AbstractC0961o<T> extends AbstractC0916n<T> {

    /* renamed from: a */
    protected static final String f2152a = "utf-8";

    /* renamed from: b */
    private static final String f2153b = String.format("application/json; charset=%s", f2152a);

    /* renamed from: c */
    private C0924p.AbstractC0926b<T> f2154c;

    /* renamed from: d */
    private final String f2155d;

    public AbstractC0961o(int i, String str, String str2, C0924p.AbstractC0926b<T> abstractC0926b, C0924p.AbstractC0925a abstractC0925a) {
        super(i, str, abstractC0925a);
        this.f2154c = abstractC0926b;
        this.f2155d = str2;
    }

    public AbstractC0961o(String str, String str2, C0924p.AbstractC0926b<T> abstractC0926b, C0924p.AbstractC0925a abstractC0925a) {
        this(-1, str, str2, abstractC0926b, abstractC0925a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0916n
    /* renamed from: a */
    public abstract C0924p<T> mo34917a(C0912j c0912j);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0916n
    /* renamed from: b */
    public void mo34916b(T t) {
        if (this.f2154c != null) {
            this.f2154c.mo34899a(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0916n
    /* renamed from: e */
    public void mo37270e() {
        super.mo37270e();
        this.f2154c = null;
    }

    @Override // com.android.volley.AbstractC0916n
    /* renamed from: q */
    public String mo37285q() {
        return mo37283u();
    }

    @Override // com.android.volley.AbstractC0916n
    /* renamed from: r */
    public byte[] mo37284r() {
        return mo37282v();
    }

    @Override // com.android.volley.AbstractC0916n
    /* renamed from: u */
    public String mo37283u() {
        return f2153b;
    }

    @Override // com.android.volley.AbstractC0916n
    /* renamed from: v */
    public byte[] mo37282v() {
        try {
            if (this.f2155d != null) {
                return this.f2155d.getBytes(f2152a);
            }
            return null;
        } catch (UnsupportedEncodingException e) {
            C0968v.m37257d("Unsupported Encoding while trying to get the bytes of %s using %s", this.f2155d, f2152a);
            return null;
        }
    }
}
