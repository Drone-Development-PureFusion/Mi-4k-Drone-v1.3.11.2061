package p005b.p006a.p007a.p008a.p024l;

import java.util.Arrays;
import java.util.List;
import p005b.p006a.p007a.p008a.C0286f;
/* renamed from: b.a.a.a.l.b */
/* loaded from: classes.dex */
public class C0356b implements AbstractC0355a {

    /* renamed from: a */
    private C0286f f354a;

    public C0356b(C0286f c0286f) {
        this.f354a = c0286f;
    }

    @Override // p005b.p006a.p007a.p008a.p024l.AbstractC0355a
    /* renamed from: a */
    public C0286f mo39594a() {
        return mo39592b();
    }

    @Override // p005b.p006a.p007a.p008a.p024l.AbstractC0355a
    /* renamed from: a */
    public C0286f mo39593a(String str) {
        if (this.f354a.p().equals(str)) {
            return this.f354a;
        }
        return null;
    }

    @Override // p005b.p006a.p007a.p008a.p024l.AbstractC0355a
    /* renamed from: b */
    public C0286f mo39592b() {
        return this.f354a;
    }

    @Override // p005b.p006a.p007a.p008a.p024l.AbstractC0355a
    /* renamed from: b */
    public C0286f mo39591b(String str) {
        return this.f354a;
    }

    @Override // p005b.p006a.p007a.p008a.p024l.AbstractC0355a
    /* renamed from: c */
    public List<String> mo39590c() {
        return Arrays.asList(this.f354a.p());
    }
}
