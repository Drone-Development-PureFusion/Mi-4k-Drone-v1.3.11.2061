package com.fimi.kernel.p158b.p163e;

import com.android.volley.AbstractC0916n;
import com.android.volley.C0912j;
import com.android.volley.C0924p;
import com.android.volley.toolbox.C0945h;
import com.fimi.kernel.p158b.AbstractC1632e;
import com.google.gson.Gson;
import java.io.UnsupportedEncodingException;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.fimi.kernel.b.e.a */
/* loaded from: classes.dex */
public class C1633a<T> extends AbstractC0916n<T> {

    /* renamed from: a */
    private Map<String, String> f4032a;

    /* renamed from: b */
    private AbstractC1632e<T> f4033b;

    /* renamed from: c */
    private Class<?> f4034c;

    /* renamed from: d */
    private Gson f4035d = new Gson();

    public C1633a(int i, String str, Map<String, String> map, AbstractC1632e<T> abstractC1632e, Class<?> cls) {
        super(i, str, null);
        this.f4033b = abstractC1632e;
        this.f4032a = map;
        this.f4034c = cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0916n
    /* renamed from: a */
    public C0924p<T> mo34917a(C0912j c0912j) {
        try {
            return C0924p.m37382a(this.f4035d.fromJson(new String(c0912j.f2015b, C0945h.m37329a(c0912j.f2016c)), (Class<Object>) this.f4034c), C0945h.m37331a(c0912j));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.AbstractC0916n
    /* renamed from: b */
    public void mo34916b(T t) {
        if (this.f4033b != null) {
            this.f4033b.mo30004a(t);
        }
    }

    @Override // com.android.volley.AbstractC0916n
    /* renamed from: s */
    protected Map<String, String> mo34901s() {
        return this.f4032a;
    }
}
