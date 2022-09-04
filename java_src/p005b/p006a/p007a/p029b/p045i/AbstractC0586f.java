package p005b.p006a.p007a.p029b.p045i;
/* renamed from: b.a.a.b.i.f */
/* loaded from: classes.dex */
public abstract class AbstractC0586f<E> extends AbstractC0566b<E> {

    /* renamed from: i */
    static final int f1009i = 256;

    /* renamed from: j */
    static final int f1010j = 1024;

    /* renamed from: k */
    C0585e f1011k;

    /* renamed from: a */
    public final void m38799a(C0585e c0585e) {
        if (this.f1011k != null) {
            throw new IllegalStateException("FormattingInfo has been already set");
        }
        this.f1011k = c0585e;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: a */
    public final void mo38798a(StringBuilder sb, E e) {
        String a = a((AbstractC0586f<E>) e);
        if (this.f1011k == null) {
            sb.append(a);
            return;
        }
        int m38801c = this.f1011k.m38801c();
        int m38804b = this.f1011k.m38804b();
        if (a == null) {
            if (m38801c <= 0) {
                return;
            }
            C0593m.m38776a(sb, m38801c);
            return;
        }
        int length = a.length();
        if (length > m38804b) {
            if (this.f1011k.m38800d()) {
                sb.append(a.substring(length - m38804b));
            } else {
                sb.append(a.substring(0, m38804b));
            }
        } else if (length >= m38801c) {
            sb.append(a);
        } else if (this.f1011k.m38808a()) {
            C0593m.m38775a(sb, a, m38801c);
        } else {
            C0593m.m38774b(sb, a, m38801c);
        }
    }

    /* renamed from: f */
    public final C0585e m38797f() {
        return this.f1011k;
    }
}
