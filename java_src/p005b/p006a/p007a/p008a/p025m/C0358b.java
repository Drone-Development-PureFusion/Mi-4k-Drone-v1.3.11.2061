package p005b.p006a.p007a.p008a.p025m;

import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.p054n.AbstractC0644b;
/* renamed from: b.a.a.a.m.b */
/* loaded from: classes.dex */
public class C0358b extends AbstractC0644b<AbstractC0366d> {

    /* renamed from: b */
    private static final String f355b = "contextName";

    /* renamed from: c */
    private String f356c;

    @Override // p005b.p006a.p007a.p029b.p054n.AbstractC0648f
    /* renamed from: a */
    public String mo38614a() {
        return f355b;
    }

    @Override // p005b.p006a.p007a.p029b.p054n.AbstractC0648f
    /* renamed from: a */
    public String mo38613a(AbstractC0366d abstractC0366d) {
        String m39559a = abstractC0366d.mo39533g().m39559a();
        return m39559a == null ? this.f356c : m39559a;
    }

    /* renamed from: a */
    public void m39588a(String str) {
        throw new UnsupportedOperationException("Key cannot be set. Using fixed key contextName");
    }

    /* renamed from: b */
    public String m39587b() {
        return this.f356c;
    }

    /* renamed from: b */
    public void m39586b(String str) {
        this.f356c = str;
    }
}
