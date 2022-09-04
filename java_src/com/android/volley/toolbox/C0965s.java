package com.android.volley.toolbox;

import com.android.volley.AbstractC0916n;
import com.android.volley.C0912j;
import com.android.volley.C0924p;
import java.io.UnsupportedEncodingException;
/* renamed from: com.android.volley.toolbox.s */
/* loaded from: classes.dex */
public class C0965s extends AbstractC0916n<String> {

    /* renamed from: a */
    private C0924p.AbstractC0926b<String> f2162a;

    public C0965s(int i, String str, C0924p.AbstractC0926b<String> abstractC0926b, C0924p.AbstractC0925a abstractC0925a) {
        super(i, str, abstractC0925a);
        this.f2162a = abstractC0926b;
    }

    public C0965s(String str, C0924p.AbstractC0926b<String> abstractC0926b, C0924p.AbstractC0925a abstractC0925a) {
        this(0, str, abstractC0926b, abstractC0925a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0916n
    /* renamed from: a */
    public C0924p<String> mo34917a(C0912j c0912j) {
        String str;
        try {
            str = new String(c0912j.f2015b, C0945h.m37329a(c0912j.f2016c));
        } catch (UnsupportedEncodingException e) {
            str = new String(c0912j.f2015b);
        }
        return C0924p.m37382a(str, C0945h.m37331a(c0912j));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0916n
    /* renamed from: d */
    public void mo34916b(String str) {
        if (this.f2162a != null) {
            this.f2162a.mo34899a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0916n
    /* renamed from: e */
    public void mo37270e() {
        super.mo37270e();
        this.f2162a = null;
    }
}
