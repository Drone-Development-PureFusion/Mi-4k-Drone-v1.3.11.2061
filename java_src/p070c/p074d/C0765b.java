package p070c.p074d;

import java.io.PrintStream;
import p070c.p072b.AbstractC0753i;
import p070c.p072b.AbstractC0754j;
import p070c.p072b.C0757m;
import p070c.p072b.C0759n;
import p070c.p073c.AbstractC0761a;
import p070c.p073c.C0763c;
/* renamed from: c.d.b */
/* loaded from: classes.dex */
public class C0765b extends AbstractC0761a {

    /* renamed from: e */
    public static final int f1431e = 0;

    /* renamed from: f */
    public static final int f1432f = 1;

    /* renamed from: g */
    public static final int f1433g = 2;

    /* renamed from: h */
    private C0764a f1434h;

    public C0765b() {
        this(System.out);
    }

    public C0765b(C0764a c0764a) {
        this.f1434h = c0764a;
    }

    public C0765b(PrintStream printStream) {
        this(new C0764a(printStream));
    }

    /* renamed from: a */
    public static void m38102a(Class<? extends AbstractC0754j> cls) {
        m38096c(new C0759n(cls));
    }

    /* renamed from: b */
    public static void m38097b(String[] strArr) {
        try {
            if (!new C0765b().m38095c(strArr).m38169h()) {
                System.exit(1);
            }
            System.exit(0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(2);
        }
    }

    /* renamed from: c */
    public static C0757m m38096c(AbstractC0753i abstractC0753i) {
        return new C0765b().m38093e(abstractC0753i);
    }

    /* renamed from: d */
    public static void m38094d(AbstractC0753i abstractC0753i) {
        new C0765b().m38104a(abstractC0753i, true);
    }

    /* renamed from: a */
    public C0757m m38104a(AbstractC0753i abstractC0753i, boolean z) {
        C0757m m38092f = m38092f();
        m38092f.m38178a(this.f1434h);
        long currentTimeMillis = System.currentTimeMillis();
        abstractC0753i.mo38162a(m38092f);
        this.f1434h.m38112a(m38092f, System.currentTimeMillis() - currentTimeMillis);
        m38098b(z);
        return m38092f;
    }

    /* renamed from: a */
    protected C0757m m38100a(String str, String str2, boolean z) {
        return m38104a(C0759n.m38160a(g(str).asSubclass(AbstractC0754j.class), str2), z);
    }

    @Override // p070c.p073c.AbstractC0761a
    /* renamed from: a */
    public void mo38105a(int i, AbstractC0753i abstractC0753i, Throwable th) {
    }

    /* renamed from: a */
    public void m38103a(C0764a c0764a) {
        this.f1434h = c0764a;
    }

    @Override // p070c.p073c.AbstractC0761a
    /* renamed from: a */
    public void mo38101a(String str) {
    }

    @Override // p070c.p073c.AbstractC0761a
    /* renamed from: b */
    public void mo38099b(String str) {
    }

    /* renamed from: b */
    protected void m38098b(boolean z) {
        if (!z) {
            return;
        }
        this.f1434h.m38117a();
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    /* renamed from: c */
    public C0757m m38095c(String[] strArr) {
        String str = "";
        String str2 = "";
        int i = 0;
        boolean z = false;
        while (i < strArr.length) {
            if (strArr[i].equals("-wait")) {
                z = true;
            } else if (strArr[i].equals("-c")) {
                i++;
                str = d(strArr[i]);
            } else if (strArr[i].equals("-m")) {
                i++;
                String str3 = strArr[i];
                int lastIndexOf = str3.lastIndexOf(46);
                str = str3.substring(0, lastIndexOf);
                str2 = str3.substring(lastIndexOf + 1);
            } else if (strArr[i].equals("-v")) {
                System.err.println("JUnit " + C0763c.m38119a() + " by Kent Beck and Erich Gamma");
            } else {
                str = strArr[i];
            }
            i++;
        }
        if (str.equals("")) {
            throw new Exception("Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
        }
        try {
            return !str2.equals("") ? m38100a(str, str2, z) : m38104a(c(str), z);
        } catch (Exception e) {
            throw new Exception("Could not create and run test suite: " + e);
        }
    }

    /* renamed from: e */
    public C0757m m38093e(AbstractC0753i abstractC0753i) {
        return m38104a(abstractC0753i, false);
    }

    /* renamed from: f */
    protected C0757m m38092f() {
        return new C0757m();
    }

    @Override // p070c.p073c.AbstractC0761a
    /* renamed from: f */
    protected void mo38091f(String str) {
        System.err.println(str);
        System.exit(1);
    }
}
