package p005b.p006a.p007a.p008a.p026n;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: b.a.a.a.n.q */
/* loaded from: classes.dex */
public class C0379q implements AbstractC0367e {

    /* renamed from: j */
    private static final Method f409j;

    /* renamed from: k */
    private static final C0379q[] f410k;

    /* renamed from: a */
    C0378p[] f411a;

    /* renamed from: b */
    int f412b;

    /* renamed from: c */
    private Throwable f413c;

    /* renamed from: d */
    private String f414d;

    /* renamed from: e */
    private String f415e;

    /* renamed from: f */
    private C0379q f416f;

    /* renamed from: g */
    private C0379q[] f417g;

    /* renamed from: h */
    private transient C0376n f418h;

    /* renamed from: i */
    private boolean f419i = false;

    static {
        Method method = null;
        try {
            method = Throwable.class.getMethod("getSuppressed", new Class[0]);
        } catch (NoSuchMethodException e) {
        }
        f409j = method;
        f410k = new C0379q[0];
    }

    public C0379q(Throwable th) {
        this.f417g = f410k;
        this.f413c = th;
        this.f414d = th.getClass().getName();
        this.f415e = th.getMessage();
        this.f411a = C0380r.m39497a(th.getStackTrace());
        Throwable cause = th.getCause();
        if (cause != null) {
            this.f416f = new C0379q(cause);
            this.f416f.f412b = C0380r.m39496a(cause.getStackTrace(), this.f411a);
        }
        if (f409j != null) {
            try {
                Object invoke = f409j.invoke(th, new Object[0]);
                if (!(invoke instanceof Throwable[])) {
                    return;
                }
                Throwable[] thArr = (Throwable[]) invoke;
                if (thArr.length <= 0) {
                    return;
                }
                this.f417g = new C0379q[thArr.length];
                for (int i = 0; i < thArr.length; i++) {
                    this.f417g[i] = new C0379q(thArr[i]);
                    this.f417g[i].f412b = C0380r.m39496a(thArr[i].getStackTrace(), this.f411a);
                }
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
            }
        }
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0367e
    /* renamed from: a */
    public String mo39490a() {
        return this.f415e;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0367e
    /* renamed from: b */
    public String mo39488b() {
        return this.f414d;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0367e
    /* renamed from: c */
    public C0378p[] mo39487c() {
        return this.f411a;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0367e
    /* renamed from: d */
    public int mo39486d() {
        return this.f412b;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0367e
    /* renamed from: e */
    public AbstractC0367e mo39485e() {
        return this.f416f;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0367e
    /* renamed from: f */
    public AbstractC0367e[] mo39484f() {
        return this.f417g;
    }

    /* renamed from: g */
    public Throwable m39508g() {
        return this.f413c;
    }

    /* renamed from: h */
    public C0376n m39507h() {
        if (this.f413c != null && this.f418h == null) {
            this.f418h = new C0376n();
        }
        return this.f418h;
    }

    /* renamed from: i */
    public void m39506i() {
        C0376n m39507h;
        if (!this.f419i && (m39507h = m39507h()) != null) {
            this.f419i = true;
            m39507h.m39521a(this);
        }
    }

    /* renamed from: j */
    public void m39505j() {
        C0378p[] c0378pArr;
        StringBuilder sb = new StringBuilder();
        for (C0378p c0378p : this.f411a) {
            sb.append('\t').append(c0378p.toString());
            C0380r.m39499a(sb, c0378p);
            sb.append(C0494h.f715c);
        }
        System.out.println(sb.toString());
    }
}
