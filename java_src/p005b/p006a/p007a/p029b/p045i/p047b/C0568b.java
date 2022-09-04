package p005b.p006a.p007a.p029b.p045i.p047b;
/* renamed from: b.a.a.b.i.b.b */
/* loaded from: classes.dex */
public class C0568b extends C0573g {

    /* renamed from: a */
    C0570d f948a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0568b(String str) {
        super(2, str);
    }

    /* renamed from: a */
    public C0570d m38854a() {
        return this.f948a;
    }

    /* renamed from: a */
    public void m38853a(C0570d c0570d) {
        this.f948a = c0570d;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.p047b.C0573g, p005b.p006a.p007a.p029b.p045i.p047b.C0569c, p005b.p006a.p007a.p029b.p045i.p047b.C0570d
    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C0568b)) {
            C0568b c0568b = (C0568b) obj;
            return this.f948a != null ? this.f948a.equals(c0568b.f948a) : c0568b.f948a == null;
        }
        return false;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.p047b.C0573g, p005b.p006a.p007a.p029b.p045i.p047b.C0569c, p005b.p006a.p007a.p029b.p045i.p047b.C0570d
    public int hashCode() {
        return super.hashCode();
    }

    @Override // p005b.p006a.p007a.p029b.p045i.p047b.C0573g, p005b.p006a.p007a.p029b.p045i.p047b.C0570d
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f948a != null) {
            stringBuffer.append("CompositeNode(" + this.f948a + ")");
        } else {
            stringBuffer.append("CompositeNode(no child)");
        }
        stringBuffer.append(f());
        return stringBuffer.toString();
    }
}
