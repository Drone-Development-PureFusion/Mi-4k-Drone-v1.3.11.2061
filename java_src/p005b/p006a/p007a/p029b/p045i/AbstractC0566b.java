package p005b.p006a.p007a.p029b.p045i;
/* renamed from: b.a.a.b.i.b */
/* loaded from: classes.dex */
public abstract class AbstractC0566b<E> {

    /* renamed from: f */
    AbstractC0566b<E> f943f;

    /* renamed from: a */
    public abstract String mo38694a(E e);

    /* renamed from: a */
    public void mo38798a(StringBuilder sb, E e) {
        sb.append(mo38694a(e));
    }

    /* renamed from: b */
    public final AbstractC0566b<E> m38860b() {
        return this.f943f;
    }

    /* renamed from: b */
    public final void m38859b(AbstractC0566b<E> abstractC0566b) {
        if (this.f943f != null) {
            throw new IllegalStateException("Next converter has been already set");
        }
        this.f943f = abstractC0566b;
    }
}
