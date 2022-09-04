package p005b.p006a.p007a.p029b.p055o;

import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p029b.p034e.C0423a;
/* renamed from: b.a.a.b.o.h */
/* loaded from: classes.dex */
public class C0664h<E> extends AbstractC0652a<C0423a<E>> {

    /* renamed from: a */
    static final int f1204a = 64;

    /* renamed from: b */
    static final int f1205b = 256;

    /* renamed from: c */
    int f1206c = 256;

    public C0664h() {
        a(64);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0652a
    /* renamed from: a */
    public C0423a<E> mo38535b(String str) {
        return new C0423a<>(this.f1206c);
    }

    /* renamed from: a */
    protected void m38541a(C0423a<E> c0423a) {
        c0423a.m39352a();
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0652a
    /* renamed from: a */
    protected /* synthetic */ boolean mo38540a(Object obj) {
        return m38537b((C0423a) ((C0423a) obj));
    }

    /* renamed from: b */
    public void m38538b(int i) {
        this.f1206c = i;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0652a
    /* renamed from: b */
    protected /* synthetic */ void mo38536b(Object obj) {
        m38541a((C0423a) ((C0423a) obj));
    }

    /* renamed from: b */
    protected boolean m38537b(C0423a<E> c0423a) {
        return false;
    }

    /* renamed from: f */
    public int m38534f() {
        return this.f1206c;
    }

    /* renamed from: g */
    List<String> m38533g() {
        return new ArrayList(this.f1185i.keySet());
    }

    /* renamed from: h */
    List<String> m38532h() {
        return new ArrayList(this.f1186j.keySet());
    }
}
