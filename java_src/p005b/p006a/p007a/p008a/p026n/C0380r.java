package p005b.p006a.p007a.p008a.p026n;

import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: b.a.a.a.n.r */
/* loaded from: classes.dex */
public class C0380r {

    /* renamed from: a */
    public static final int f420a = 1;

    /* renamed from: b */
    public static final int f421b = 1;

    /* renamed from: c */
    private static final int f422c = 2048;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m39496a(StackTraceElement[] stackTraceElementArr, C0378p[] c0378pArr) {
        int i = 0;
        if (c0378pArr != null && stackTraceElementArr != null) {
            int length = stackTraceElementArr.length - 1;
            for (int length2 = c0378pArr.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(c0378pArr[length2].f406a); length2--) {
                i++;
                length--;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static String m39504a(AbstractC0367e abstractC0367e) {
        StringBuilder sb = new StringBuilder(2048);
        m39498a(sb, null, 1, abstractC0367e);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m39503a(C0379q c0379q, Throwable th, C0379q c0379q2) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int i = -1;
        if (c0379q2 != null) {
            i = m39496a(stackTrace, c0379q2.mo39487c());
        }
        c0379q.f412b = i;
        c0379q.f411a = m39497a(stackTrace);
    }

    /* renamed from: a */
    public static void m39502a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('\t');
        }
    }

    /* renamed from: a */
    public static void m39501a(StringBuilder sb, int i, AbstractC0367e abstractC0367e) {
        C0378p[] mo39487c = abstractC0367e.mo39487c();
        int mo39486d = abstractC0367e.mo39486d();
        for (int i2 = 0; i2 < mo39487c.length - mo39486d; i2++) {
            C0378p c0378p = mo39487c[i2];
            m39502a(sb, i);
            m39494b(sb, c0378p);
            sb.append(C0494h.f715c);
        }
        if (mo39486d > 0) {
            m39502a(sb, i);
            sb.append("... ").append(mo39486d).append(" common frames omitted").append(C0494h.f715c);
        }
    }

    /* renamed from: a */
    public static void m39500a(StringBuilder sb, AbstractC0367e abstractC0367e) {
        m39501a(sb, 1, abstractC0367e);
    }

    /* renamed from: a */
    public static void m39499a(StringBuilder sb, C0378p c0378p) {
        C0364b m39509c;
        if (c0378p == null || (m39509c = c0378p.m39509c()) == null) {
            return;
        }
        if (!m39509c.m39572c()) {
            sb.append(" ~[");
        } else {
            sb.append(" [");
        }
        sb.append(m39509c.m39574a()).append(C0494h.f680A).append(m39509c.m39573b()).append(']');
    }

    /* renamed from: a */
    private static void m39498a(StringBuilder sb, String str, int i, AbstractC0367e abstractC0367e) {
        if (abstractC0367e == null) {
            return;
        }
        m39493b(sb, str, i, abstractC0367e);
        sb.append(C0494h.f715c);
        m39501a(sb, i, abstractC0367e);
        AbstractC0367e[] mo39484f = abstractC0367e.mo39484f();
        if (mo39484f != null) {
            for (AbstractC0367e abstractC0367e2 : mo39484f) {
                m39498a(sb, C0494h.f728p, i + 1, abstractC0367e2);
            }
        }
        m39498a(sb, C0494h.f727o, i, abstractC0367e.mo39485e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0378p[] m39497a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new C0378p[0];
        }
        C0378p[] c0378pArr = new C0378p[stackTraceElementArr.length];
        for (int i = 0; i < c0378pArr.length; i++) {
            c0378pArr[i] = new C0378p(stackTraceElementArr[i]);
        }
        return c0378pArr;
    }

    /* renamed from: b */
    public static void m39495b(StringBuilder sb, AbstractC0367e abstractC0367e) {
        if (abstractC0367e.mo39486d() > 0) {
            sb.append(C0494h.f727o);
        }
        m39491d(sb, abstractC0367e);
    }

    /* renamed from: b */
    public static void m39494b(StringBuilder sb, C0378p c0378p) {
        sb.append(c0378p.toString());
        m39499a(sb, c0378p);
    }

    /* renamed from: b */
    private static void m39493b(StringBuilder sb, String str, int i, AbstractC0367e abstractC0367e) {
        m39502a(sb, i - 1);
        if (str != null) {
            sb.append(str);
        }
        m39491d(sb, abstractC0367e);
    }

    /* renamed from: c */
    public static void m39492c(StringBuilder sb, AbstractC0367e abstractC0367e) {
        if (abstractC0367e.mo39485e() != null) {
            sb.append(C0494h.f729q);
        }
        m39491d(sb, abstractC0367e);
    }

    /* renamed from: d */
    private static void m39491d(StringBuilder sb, AbstractC0367e abstractC0367e) {
        sb.append(abstractC0367e.mo39488b()).append(": ").append(abstractC0367e.mo39490a());
    }
}
