package p005b.p006a.p007a.p029b.p057q;

import java.util.Iterator;
import java.util.Stack;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p055o.AbstractC0672p;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.b.q.b */
/* loaded from: classes.dex */
public class C0693b {

    /* renamed from: a */
    final C0690a f1243a;

    /* renamed from: b */
    final AbstractC0672p f1244b;

    /* renamed from: c */
    final AbstractC0672p f1245c;

    public C0693b(C0690a c0690a, AbstractC0672p abstractC0672p) {
        this(c0690a, abstractC0672p, null);
    }

    public C0693b(C0690a c0690a, AbstractC0672p abstractC0672p, AbstractC0672p abstractC0672p2) {
        this.f1243a = c0690a;
        this.f1244b = abstractC0672p;
        this.f1245c = abstractC0672p2;
    }

    /* renamed from: a */
    private static C0690a m38462a(String str) {
        return new C0695c(new C0699e(str).m38445a()).m38457a();
    }

    /* renamed from: a */
    private String m38467a(C0690a c0690a) {
        return (String) ((C0690a) c0690a.f1236b).f1236b;
    }

    /* renamed from: a */
    public static String m38461a(String str, AbstractC0672p abstractC0672p, AbstractC0672p abstractC0672p2) {
        return new C0693b(m38462a(str), abstractC0672p, abstractC0672p2).m38468a();
    }

    /* renamed from: a */
    private String m38460a(Stack<C0690a> stack) {
        StringBuilder sb = new StringBuilder("Circular variable reference detected while parsing input [");
        Iterator<C0690a> it2 = stack.iterator();
        while (it2.hasNext()) {
            C0690a next = it2.next();
            sb.append("${").append(m38467a(next)).append("}");
            if (stack.lastElement() != next) {
                sb.append(" --> ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    private void m38465a(C0690a c0690a, StringBuilder sb) {
        sb.append((String) c0690a.f1236b);
    }

    /* renamed from: a */
    private void m38464a(C0690a c0690a, StringBuilder sb, Stack<C0690a> stack) {
        while (c0690a != null) {
            switch (c0690a.f1235a) {
                case LITERAL:
                    m38465a(c0690a, sb);
                    break;
                case VARIABLE:
                    m38459b(c0690a, sb, stack);
                    break;
            }
            c0690a = c0690a.f1238d;
        }
    }

    /* renamed from: a */
    private boolean m38466a(C0690a c0690a, C0690a c0690a2) {
        if (c0690a.f1235a == null || c0690a.f1235a.equals(c0690a2.f1235a)) {
            if (c0690a.f1236b != null && !c0690a.f1236b.equals(c0690a2.f1236b)) {
                return false;
            }
            return c0690a.f1237c == null || c0690a.f1237c.equals(c0690a2.f1237c);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m38463a(C0690a c0690a, Stack<C0690a> stack) {
        Iterator<C0690a> it2 = stack.iterator();
        while (it2.hasNext()) {
            if (m38466a(c0690a, it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private String m38458b(String str) {
        String mo38529a;
        String mo38529a2 = this.f1244b.mo38529a(str);
        if (mo38529a2 != null) {
            return mo38529a2;
        }
        if (this.f1245c != null && (mo38529a = this.f1245c.mo38529a(str)) != null) {
            return mo38529a;
        }
        String m38378a = C0724u.m38378a(str, (String) null);
        if (m38378a != null) {
            return m38378a;
        }
        String m38385a = C0724u.m38385a(str);
        if (m38385a != null) {
            return m38385a;
        }
        return null;
    }

    /* renamed from: b */
    private void m38459b(C0690a c0690a, StringBuilder sb, Stack<C0690a> stack) {
        if (m38463a(c0690a, stack)) {
            stack.push(c0690a);
            throw new IllegalArgumentException(m38460a(stack));
        }
        stack.push(c0690a);
        StringBuilder sb2 = new StringBuilder();
        m38464a((C0690a) c0690a.f1236b, sb2, stack);
        String sb3 = sb2.toString();
        String m38458b = m38458b(sb3);
        if (m38458b != null) {
            m38464a(m38462a(m38458b), sb, stack);
            stack.pop();
        } else if (c0690a.f1237c == null) {
            sb.append(sb3 + C0494h.f711ae);
            stack.pop();
        } else {
            StringBuilder sb4 = new StringBuilder();
            m38464a((C0690a) c0690a.f1237c, sb4, stack);
            stack.pop();
            sb.append(sb4.toString());
        }
    }

    /* renamed from: a */
    public String m38468a() {
        StringBuilder sb = new StringBuilder();
        m38464a(this.f1243a, sb, new Stack<>());
        return sb.toString();
    }
}
