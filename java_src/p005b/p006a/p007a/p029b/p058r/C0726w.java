package p005b.p006a.p007a.p029b.p058r;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import p005b.p006a.p007a.p029b.AbstractC0427f;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p034e.C0425c;
import p005b.p006a.p007a.p029b.p056p.AbstractC0682g;
import p005b.p006a.p007a.p029b.p056p.AbstractC0686k;
import p005b.p006a.p007a.p029b.p056p.C0687l;
/* renamed from: b.a.a.b.r.w */
/* loaded from: classes.dex */
public class C0726w {

    /* renamed from: b */
    private static PrintStream f1330b = System.out;

    /* renamed from: a */
    static C0703b f1329a = new C0703b("HH:mm:ss,SSS");

    /* renamed from: a */
    public static void m38371a(AbstractC0427f abstractC0427f) {
        m38370a(abstractC0427f, 0L);
    }

    /* renamed from: a */
    public static void m38370a(AbstractC0427f abstractC0427f, long j) {
        if (abstractC0427f == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        AbstractC0686k mo39315n = abstractC0427f.mo39315n();
        if (mo39315n == null) {
            f1330b.println("WARN: Context named \"" + abstractC0427f.mo39314p() + "\" has no status manager");
        } else if (new C0687l(abstractC0427f).m38485c(j) < 1) {
        } else {
            m38368a(mo39315n, j);
        }
    }

    /* renamed from: a */
    public static void m38369a(AbstractC0686k abstractC0686k) {
        m38368a(abstractC0686k, 0L);
    }

    /* renamed from: a */
    public static void m38368a(AbstractC0686k abstractC0686k, long j) {
        StringBuilder sb = new StringBuilder();
        m38364a(sb, C0687l.m38489a(abstractC0686k.mo38507a(), j));
        f1330b.println(sb.toString());
    }

    /* renamed from: a */
    public static void m38367a(PrintStream printStream) {
        f1330b = printStream;
    }

    /* renamed from: a */
    public static void m38366a(StringBuilder sb, String str, AbstractC0682g abstractC0682g) {
        String str2 = abstractC0682g.mo38511g() ? str + "+ " : str + "|-";
        if (f1329a != null) {
            sb.append(f1329a.m38440a(abstractC0682g.mo38512f().longValue())).append(" ");
        }
        sb.append(str2).append(abstractC0682g).append(C0494h.f715c);
        if (abstractC0682g.mo38513e() != null) {
            m38365a(sb, abstractC0682g.mo38513e());
        }
        if (abstractC0682g.mo38511g()) {
            Iterator<AbstractC0682g> mo38510h = abstractC0682g.mo38510h();
            while (mo38510h.hasNext()) {
                m38366a(sb, str + "  ", mo38510h.next());
            }
        }
    }

    /* renamed from: a */
    private static void m38365a(StringBuilder sb, Throwable th) {
        String[] m39343a;
        for (String str : C0425c.m39343a(th)) {
            if (!str.startsWith(C0494h.f727o)) {
                if (Character.isDigit(str.charAt(0))) {
                    sb.append("\t... ");
                } else {
                    sb.append("\tat ");
                }
            }
            sb.append(str).append(C0494h.f715c);
        }
    }

    /* renamed from: a */
    private static void m38364a(StringBuilder sb, List<AbstractC0682g> list) {
        if (list == null) {
            return;
        }
        for (AbstractC0682g abstractC0682g : list) {
            m38366a(sb, "", abstractC0682g);
        }
    }

    /* renamed from: a */
    public static void m38363a(List<AbstractC0682g> list) {
        StringBuilder sb = new StringBuilder();
        m38364a(sb, list);
        f1330b.println(sb.toString());
    }

    /* renamed from: b */
    public static void m38362b(AbstractC0427f abstractC0427f) {
        if (abstractC0427f == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        AbstractC0686k mo39315n = abstractC0427f.mo39315n();
        if (mo39315n == null) {
            f1330b.println("WARN: Context named \"" + abstractC0427f.mo39314p() + "\" has no status manager");
        } else if (new C0687l(abstractC0427f).m38485c(0L) != 2) {
        } else {
            m38369a(mo39315n);
        }
    }

    /* renamed from: b */
    public static void m38361b(AbstractC0427f abstractC0427f, long j) {
        if (abstractC0427f == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        AbstractC0686k mo39315n = abstractC0427f.mo39315n();
        if (mo39315n == null) {
            f1330b.println("WARN: Context named \"" + abstractC0427f.mo39314p() + "\" has no status manager");
        } else {
            m38368a(mo39315n, j);
        }
    }

    /* renamed from: c */
    public static void m38360c(AbstractC0427f abstractC0427f) {
        m38361b(abstractC0427f, 0L);
    }
}
