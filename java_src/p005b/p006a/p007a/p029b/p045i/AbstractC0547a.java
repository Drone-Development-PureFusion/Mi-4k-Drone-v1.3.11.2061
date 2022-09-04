package p005b.p006a.p007a.p029b.p045i;
/* renamed from: b.a.a.b.i.a */
/* loaded from: classes.dex */
public abstract class AbstractC0547a<E> extends AbstractC0584d<E> {

    /* renamed from: a */
    AbstractC0566b<E> f929a;

    /* renamed from: a */
    public AbstractC0566b<E> m38863a() {
        return this.f929a;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: a */
    public String mo38694a(E e) {
        StringBuilder sb = new StringBuilder();
        for (AbstractC0566b<E> abstractC0566b = this.f929a; abstractC0566b != null; abstractC0566b = abstractC0566b.f943f) {
            abstractC0566b.mo38798a(sb, e);
        }
        return mo38777a((AbstractC0547a<E>) e, sb.toString());
    }

    /* renamed from: a */
    protected abstract String mo38777a(E e, String str);

    /* renamed from: a */
    public void m38862a(AbstractC0566b<E> abstractC0566b) {
        this.f929a = abstractC0566b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompositeConverter<");
        if (this.f1011k != null) {
            sb.append(this.f1011k);
        }
        if (this.f929a != null) {
            sb.append(", children: ").append(this.f929a);
        }
        sb.append(">");
        return sb.toString();
    }
}
