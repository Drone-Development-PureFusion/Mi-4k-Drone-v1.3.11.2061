package com.fimi.kernel.p158b.p163e;

import com.android.volley.AbstractC0916n;
import com.android.volley.AbstractC0928r;
import com.android.volley.C0904d;
import com.android.volley.C0920o;
import com.android.volley.C0924p;
import com.android.volley.C0967u;
import com.android.volley.toolbox.C0960n;
import com.android.volley.toolbox.C0965s;
import com.android.volley.toolbox.C0966t;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.AbstractC1586a;
import com.fimi.kernel.p158b.AbstractC1632e;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: com.fimi.kernel.b.e.b */
/* loaded from: classes.dex */
public class C1634b implements AbstractC1586a {

    /* renamed from: a */
    C0920o f4036a;

    public C1634b() {
        this.f4036a = null;
        this.f4036a = C0966t.m37269a(C1642c.m34893a());
    }

    /* renamed from: a */
    private void m34915a(int i, String str, final AbstractC1632e<String> abstractC1632e) {
        C0965s c0965s = new C0965s(i, str, new C0924p.AbstractC0926b<String>() { // from class: com.fimi.kernel.b.e.b.4
            @Override // com.android.volley.C0924p.AbstractC0926b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo34899a(String str2) {
                if (abstractC1632e != null) {
                    abstractC1632e.mo30004a(str2);
                }
            }
        }, new C0924p.AbstractC0925a() { // from class: com.fimi.kernel.b.e.b.5
            @Override // com.android.volley.C0924p.AbstractC0925a
            /* renamed from: a */
            public void mo29150a(C0967u c0967u) {
                abstractC1632e.mo30002b(c0967u.getMessage());
            }
        });
        c0965s.a((AbstractC0928r) new C0904d(3000, 1, 1.0f));
        this.f4036a.m37395a((AbstractC0916n) c0965s);
    }

    /* renamed from: a */
    private <T> void m34914a(int i, String str, Map<String, String> map, AbstractC1632e<T> abstractC1632e, Class<?> cls) {
        this.f4036a.m37395a((AbstractC0916n) new C1633a(i, str, map, abstractC1632e, cls));
    }

    /* renamed from: a */
    private void m34913a(int i, String str, JSONObject jSONObject, final AbstractC1632e<JSONObject> abstractC1632e) {
        this.f4036a.m37395a((AbstractC0916n) new C0960n(i, str, jSONObject, new C0924p.AbstractC0926b<JSONObject>() { // from class: com.fimi.kernel.b.e.b.6
            @Override // com.android.volley.C0924p.AbstractC0926b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo34899a(JSONObject jSONObject2) {
                if (abstractC1632e != null) {
                    abstractC1632e.mo30004a(jSONObject2);
                }
            }
        }, (C0924p.AbstractC0925a) null));
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: a */
    public void mo34912a(String str, AbstractC1632e<String> abstractC1632e) {
        m34915a(0, str, abstractC1632e);
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: a */
    public <T> void mo34911a(String str, AbstractC1632e<T> abstractC1632e, Class<?> cls) {
        m34914a(0, str, null, abstractC1632e, cls);
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: a */
    public void mo34910a(String str, final Map<String, String> map, final AbstractC1632e<String> abstractC1632e) {
        this.f4036a.m37395a((AbstractC0916n) new C0965s(1, str, new C0924p.AbstractC0926b<String>() { // from class: com.fimi.kernel.b.e.b.1
            @Override // com.android.volley.C0924p.AbstractC0926b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo34899a(String str2) {
                if (abstractC1632e != null) {
                    abstractC1632e.mo30004a(str2);
                }
            }
        }, new C0924p.AbstractC0925a() { // from class: com.fimi.kernel.b.e.b.2
            @Override // com.android.volley.C0924p.AbstractC0925a
            /* renamed from: a */
            public void mo29150a(C0967u c0967u) {
                abstractC1632e.mo30002b(c0967u.getMessage());
            }
        }) { // from class: com.fimi.kernel.b.e.b.3
            @Override // com.android.volley.AbstractC0916n
            /* renamed from: s */
            protected Map<String, String> mo34901s() {
                return map;
            }
        });
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: a */
    public <T> void mo34909a(String str, Map<String, String> map, AbstractC1632e<T> abstractC1632e, Class<?> cls) {
        m34914a(1, str, map, abstractC1632e, cls);
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: a */
    public void mo34908a(String str, JSONObject jSONObject, AbstractC1632e<JSONObject> abstractC1632e) {
        m34913a(1, str, jSONObject, abstractC1632e);
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: b */
    public void mo34907b(String str, AbstractC1632e<String> abstractC1632e) {
        m34915a(1, str, abstractC1632e);
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: b */
    public <T> void mo34906b(String str, AbstractC1632e<T> abstractC1632e, Class<?> cls) {
        m34914a(1, str, null, abstractC1632e, cls);
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: b */
    public void mo34905b(String str, JSONObject jSONObject, AbstractC1632e<JSONObject> abstractC1632e) {
        m34913a(0, str, jSONObject, abstractC1632e);
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: c */
    public void mo34904c(String str, AbstractC1632e<JSONObject> abstractC1632e) {
        m34913a(1, str, (JSONObject) null, abstractC1632e);
    }

    @Override // com.fimi.kernel.p158b.AbstractC1586a
    /* renamed from: d */
    public void mo34903d(String str, AbstractC1632e<JSONObject> abstractC1632e) {
        m34913a(0, str, (JSONObject) null, abstractC1632e);
    }
}
