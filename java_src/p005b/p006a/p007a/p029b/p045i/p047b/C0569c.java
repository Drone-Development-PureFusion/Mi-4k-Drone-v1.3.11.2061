package p005b.p006a.p007a.p029b.p045i.p047b;

import p005b.p006a.p007a.p029b.p045i.C0585e;
/* renamed from: b.a.a.b.i.b.c */
/* loaded from: classes.dex */
public class C0569c extends C0570d {

    /* renamed from: b */
    C0585e f949b;

    C0569c(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0569c(int i, Object obj) {
        super(i, obj);
    }

    /* renamed from: a */
    public void m38852a(C0585e c0585e) {
        this.f949b = c0585e;
    }

    /* renamed from: b */
    public C0585e m38851b() {
        return this.f949b;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.p047b.C0570d
    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C0569c)) {
            C0569c c0569c = (C0569c) obj;
            return this.f949b != null ? this.f949b.equals(c0569c.f949b) : c0569c.f949b == null;
        }
        return false;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.p047b.C0570d
    public int hashCode() {
        return (this.f949b != null ? this.f949b.hashCode() : 0) + (super.hashCode() * 31);
    }
}
