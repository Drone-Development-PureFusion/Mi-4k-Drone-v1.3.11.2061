package p005b.p006a.p007a.p029b.p055o;
/* renamed from: b.a.a.b.o.r */
/* loaded from: classes.dex */
public class C0674r extends Exception {
    private static final long serialVersionUID = -3132040414328475658L;

    /* renamed from: a */
    Throwable f1212a;

    public C0674r(String str) {
        super(str);
    }

    public C0674r(String str, Throwable th) {
        super(str);
        this.f1212a = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f1212a;
    }
}
