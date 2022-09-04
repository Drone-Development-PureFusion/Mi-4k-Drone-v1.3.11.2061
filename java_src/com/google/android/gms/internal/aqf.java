package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4583ak;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.p253b.C9755a;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class aqf {
    /* renamed from: a */
    public static double m16223a(AbstractC6880ea<?> abstractC6880ea, AbstractC6880ea<?> abstractC6880ea2) {
        boolean z = true;
        C4588d.m23619b(abstractC6880ea != null);
        if (abstractC6880ea2 == null) {
            z = false;
        }
        C4588d.m23619b(z);
        double m16222b = m16222b(abstractC6880ea);
        double m16222b2 = m16222b(abstractC6880ea2);
        if (Double.isNaN(m16222b) || Double.isNaN(m16222b2)) {
            return Double.NaN;
        }
        if ((m16222b == Double.POSITIVE_INFINITY && m16222b2 == Double.NEGATIVE_INFINITY) || (m16222b == Double.NEGATIVE_INFINITY && m16222b2 == Double.POSITIVE_INFINITY)) {
            return Double.NaN;
        }
        return (!Double.isInfinite(m16222b) || Double.isInfinite(m16222b2)) ? (Double.isInfinite(m16222b) || !Double.isInfinite(m16222b2)) ? m16222b + m16222b2 : m16222b2 : m16222b;
    }

    /* renamed from: a */
    public static boolean m16224a(AbstractC6880ea<?> abstractC6880ea) {
        C4588d.m23619b(abstractC6880ea != null);
        if (abstractC6880ea == C6886ee.f23122e || abstractC6880ea == C6886ee.f23121d) {
            return false;
        }
        if (abstractC6880ea instanceof C6883eb) {
            return ((Boolean) ((C6883eb) abstractC6880ea).mo16034b()).booleanValue();
        }
        if (abstractC6880ea instanceof C6884ec) {
            if (((Double) ((C6884ec) abstractC6880ea).mo16034b()).doubleValue() == C9755a.f30449c || ((Double) ((C6884ec) abstractC6880ea).mo16034b()).doubleValue() == -0.0d || Double.isNaN(((Double) ((C6884ec) abstractC6880ea).mo16034b()).doubleValue())) {
                return false;
            }
        } else if (abstractC6880ea instanceof C6893ej) {
            if (((String) ((C6893ej) abstractC6880ea).mo16034b()).isEmpty()) {
                return false;
            }
        } else if (m16215f(abstractC6880ea)) {
            String valueOf = String.valueOf(abstractC6880ea.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Illegal type given to isTruthy: ").append(valueOf).append(".").toString());
        }
        return true;
    }

    /* renamed from: b */
    public static double m16222b(AbstractC6880ea<?> abstractC6880ea) {
        C4588d.m23619b(abstractC6880ea != null);
        if (abstractC6880ea == C6886ee.f23122e) {
            return Double.NaN;
        }
        if (abstractC6880ea == C6886ee.f23121d) {
            return C9755a.f30449c;
        }
        if (abstractC6880ea instanceof C6883eb) {
            if (!((Boolean) ((C6883eb) abstractC6880ea).mo16034b()).booleanValue()) {
                return C9755a.f30449c;
            }
            return 1.0d;
        } else if (abstractC6880ea instanceof C6884ec) {
            return ((Double) ((C6884ec) abstractC6880ea).mo16034b()).doubleValue();
        } else {
            if (abstractC6880ea instanceof C6887ef) {
                C6887ef c6887ef = (C6887ef) abstractC6880ea;
                if (c6887ef.mo16034b().isEmpty()) {
                    return C9755a.f30449c;
                }
                if (c6887ef.mo16034b().size() == 1) {
                    return m16222b(new C6893ej(m16218d(c6887ef.m16049b(0))));
                }
            } else if (abstractC6880ea instanceof C6893ej) {
                C6893ej c6893ej = (C6893ej) abstractC6880ea;
                if (((String) c6893ej.mo16034b()).isEmpty()) {
                    return C9755a.f30449c;
                }
                try {
                    return Double.parseDouble((String) c6893ej.mo16034b());
                } catch (NumberFormatException e) {
                    return Double.NaN;
                }
            }
            if (!m16215f(abstractC6880ea)) {
                return Double.NaN;
            }
            String valueOf = String.valueOf(abstractC6880ea.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 41).append("Illegal type given to numberEquivalent: ").append(valueOf).append(".").toString());
        }
    }

    /* renamed from: b */
    public static boolean m16221b(AbstractC6880ea<?> abstractC6880ea, AbstractC6880ea<?> abstractC6880ea2) {
        C4588d.m23619b(abstractC6880ea != null);
        C4588d.m23619b(abstractC6880ea2 != null);
        if (m16215f(abstractC6880ea)) {
            String valueOf = String.valueOf(abstractC6880ea.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Illegal type given to abstractRelationalCompare: ").append(valueOf).append(".").toString());
        } else if (m16215f(abstractC6880ea2)) {
            String valueOf2 = String.valueOf(abstractC6880ea2.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 50).append("Illegal type given to abstractRelationalCompare: ").append(valueOf2).append(".").toString());
        } else {
            C6893ej c6893ej = ((abstractC6880ea instanceof C6891eh) || (abstractC6880ea instanceof C6887ef) || (abstractC6880ea instanceof C6885ed)) ? new C6893ej(m16218d(abstractC6880ea)) : abstractC6880ea;
            C6893ej c6893ej2 = ((abstractC6880ea2 instanceof C6891eh) || (abstractC6880ea2 instanceof C6887ef) || (abstractC6880ea2 instanceof C6885ed)) ? new C6893ej(m16218d(abstractC6880ea2)) : abstractC6880ea2;
            if ((c6893ej instanceof C6893ej) && (c6893ej2 instanceof C6893ej)) {
                return ((String) c6893ej.mo16034b()).compareTo((String) c6893ej2.mo16034b()) < 0;
            }
            double m16222b = m16222b(c6893ej);
            double m16222b2 = m16222b(c6893ej2);
            if (Double.isNaN(m16222b) || Double.isNaN(m16222b2)) {
                return false;
            }
            if (m16222b == C9755a.f30449c && m16222b2 == -0.0d) {
                return false;
            }
            if ((m16222b == -0.0d && m16222b2 == C9755a.f30449c) || m16222b == Double.POSITIVE_INFINITY) {
                return false;
            }
            if (m16222b2 == Double.POSITIVE_INFINITY) {
                return true;
            }
            if (m16222b2 == Double.NEGATIVE_INFINITY) {
                return false;
            }
            return m16222b == Double.NEGATIVE_INFINITY || Double.compare(m16222b, m16222b2) < 0;
        }
    }

    /* renamed from: c */
    public static double m16220c(AbstractC6880ea<?> abstractC6880ea) {
        double m16222b = m16222b(abstractC6880ea);
        return Double.isNaN(m16222b) ? C9755a.f30449c : (m16222b == C9755a.f30449c || m16222b == -0.0d || Double.isInfinite(m16222b)) ? m16222b : Math.signum(m16222b) * Math.floor(Math.abs(m16222b));
    }

    /* renamed from: c */
    public static boolean m16219c(AbstractC6880ea<?> abstractC6880ea, AbstractC6880ea<?> abstractC6880ea2) {
        C4588d.m23619b(abstractC6880ea != null);
        C4588d.m23619b(abstractC6880ea2 != null);
        if (m16215f(abstractC6880ea)) {
            String valueOf = String.valueOf(abstractC6880ea.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 48).append("Illegal type given to abstractEqualityCompare: ").append(valueOf).append(".").toString());
        } else if (m16215f(abstractC6880ea2)) {
            String valueOf2 = String.valueOf(abstractC6880ea2.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 48).append("Illegal type given to abstractEqualityCompare: ").append(valueOf2).append(".").toString());
        } else {
            String m16216e = m16216e(abstractC6880ea);
            String m16216e2 = m16216e(abstractC6880ea2);
            if (!m16216e.equals(m16216e2)) {
                if ((abstractC6880ea == C6886ee.f23122e || abstractC6880ea == C6886ee.f23121d) && (abstractC6880ea2 == C6886ee.f23122e || abstractC6880ea2 == C6886ee.f23121d)) {
                    return true;
                }
                if (m16216e.equals("Number") && m16216e2.equals("String")) {
                    return m16219c(abstractC6880ea, new C6884ec(Double.valueOf(m16222b(abstractC6880ea2))));
                }
                if ((!m16216e.equals("String") || !m16216e2.equals("Number")) && !m16216e.equals("Boolean")) {
                    if (m16216e2.equals("Boolean")) {
                        return m16219c(abstractC6880ea, new C6884ec(Double.valueOf(m16222b(abstractC6880ea2))));
                    }
                    if ((m16216e.equals("String") || m16216e.equals("Number")) && m16216e2.equals("Object")) {
                        return m16219c(abstractC6880ea, new C6893ej(m16218d(abstractC6880ea2)));
                    }
                    if (m16216e.equals("Object") && (m16216e2.equals("String") || m16216e2.equals("Number"))) {
                        return m16219c(new C6893ej(m16218d(abstractC6880ea)), abstractC6880ea2);
                    }
                    return false;
                }
                return m16219c(new C6884ec(Double.valueOf(m16222b(abstractC6880ea))), abstractC6880ea2);
            }
            char c = 65535;
            switch (m16216e.hashCode()) {
                case -1950496919:
                    if (m16216e.equals("Number")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1939501217:
                    if (m16216e.equals("Object")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1808118735:
                    if (m16216e.equals("String")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2439591:
                    if (m16216e.equals("Null")) {
                        c = 1;
                        break;
                    }
                    break;
                case 965837104:
                    if (m16216e.equals("Undefined")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1729365000:
                    if (m16216e.equals("Boolean")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    return true;
                case 2:
                    double doubleValue = ((Double) ((C6884ec) abstractC6880ea).mo16034b()).doubleValue();
                    double doubleValue2 = ((Double) ((C6884ec) abstractC6880ea2).mo16034b()).doubleValue();
                    if (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2)) {
                        return false;
                    }
                    return doubleValue == doubleValue2;
                case 3:
                    return ((String) ((C6893ej) abstractC6880ea).mo16034b()).equals((String) ((C6893ej) abstractC6880ea2).mo16034b());
                case 4:
                    return ((Boolean) ((C6883eb) abstractC6880ea).mo16034b()) == ((Boolean) ((C6883eb) abstractC6880ea2).mo16034b());
                case 5:
                    return abstractC6880ea == abstractC6880ea2;
                default:
                    return false;
            }
        }
    }

    /* renamed from: d */
    public static String m16218d(AbstractC6880ea<?> abstractC6880ea) {
        String str;
        int i = 1;
        C4588d.m23619b(abstractC6880ea != null);
        if (abstractC6880ea == C6886ee.f23122e) {
            return "undefined";
        }
        if (abstractC6880ea == C6886ee.f23121d) {
            return "null";
        }
        if (abstractC6880ea instanceof C6883eb) {
            return ((Boolean) ((C6883eb) abstractC6880ea).mo16034b()).booleanValue() ? "true" : "false";
        } else if (!(abstractC6880ea instanceof C6884ec)) {
            if (abstractC6880ea instanceof C6885ed) {
                aqe aqeVar = (aqe) ((C6885ed) abstractC6880ea).mo16034b();
                if (aqeVar instanceof aqd) {
                    return ((aqd) aqeVar).m16226a();
                }
            } else if (abstractC6880ea instanceof C6887ef) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC6880ea<?> abstractC6880ea2 : ((C6887ef) abstractC6880ea).mo16034b()) {
                    if (abstractC6880ea2 == C6886ee.f23121d || abstractC6880ea2 == C6886ee.f23122e) {
                        arrayList.add("");
                    } else {
                        arrayList.add(m16218d(abstractC6880ea2));
                    }
                }
                return C4583ak.m23640a(Constants.ACCEPT_TIME_SEPARATOR_SP).m23642a((Iterable<?>) arrayList);
            } else if (abstractC6880ea instanceof C6891eh) {
                return "[object Object]";
            } else {
                if (abstractC6880ea instanceof C6893ej) {
                    return (String) ((C6893ej) abstractC6880ea).mo16034b();
                }
            }
            if (m16215f(abstractC6880ea)) {
                String valueOf = String.valueOf(abstractC6880ea.toString());
                str = new StringBuilder(String.valueOf(valueOf).length() + 41).append("Illegal type given to stringEquivalent: ").append(valueOf).append(".").toString();
            } else {
                str = "Unknown type in stringEquivalent.";
            }
            throw new IllegalArgumentException(str);
        } else {
            String d = Double.toString(((Double) ((C6884ec) abstractC6880ea).mo16034b()).doubleValue());
            int indexOf = d.indexOf("E");
            if (indexOf <= 0) {
                if (!d.endsWith(".0")) {
                    return d;
                }
                String substring = d.substring(0, d.length() - 2);
                return substring.equals("-0") ? "0" : substring;
            }
            int parseInt = Integer.parseInt(d.substring(indexOf + 1, d.length()));
            if (parseInt < 0) {
                if (parseInt <= -7) {
                    return d.replace("E", "e");
                }
                String replace = d.substring(0, indexOf).replace(".", "");
                StringBuilder sb = new StringBuilder();
                sb.append("0.");
                for (int i2 = parseInt; i2 + 1 < 0; i2++) {
                    sb.append("0");
                }
                sb.append(replace);
                return sb.toString();
            } else if (parseInt >= 21) {
                return d.replace("E", "e+");
            } else {
                String replace2 = d.substring(0, indexOf).replace(".", "");
                int i3 = parseInt + 1;
                int length = replace2.length();
                if (!replace2.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                    i = 0;
                }
                int i4 = i3 - (length - i);
                StringBuilder sb2 = new StringBuilder();
                if (i4 < 0) {
                    int length2 = i4 + replace2.length();
                    sb2.append(replace2.substring(0, length2));
                    sb2.append(".");
                    sb2.append(replace2.substring(length2, replace2.length()));
                } else {
                    sb2.append(replace2);
                    while (i4 > 0) {
                        sb2.append("0");
                        i4--;
                    }
                }
                return sb2.toString();
            }
        }
    }

    /* renamed from: d */
    public static boolean m16217d(AbstractC6880ea<?> abstractC6880ea, AbstractC6880ea<?> abstractC6880ea2) {
        C4588d.m23619b(abstractC6880ea != null);
        C4588d.m23619b(abstractC6880ea2 != null);
        if (m16215f(abstractC6880ea)) {
            String valueOf = String.valueOf(abstractC6880ea.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Illegal type given to strictEqualityCompare: ").append(valueOf).append(".").toString());
        } else if (m16215f(abstractC6880ea2)) {
            String valueOf2 = String.valueOf(abstractC6880ea2.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 46).append("Illegal type given to strictEqualityCompare: ").append(valueOf2).append(".").toString());
        } else {
            String m16216e = m16216e(abstractC6880ea);
            if (!m16216e.equals(m16216e(abstractC6880ea2))) {
                return false;
            }
            char c = 65535;
            switch (m16216e.hashCode()) {
                case -1950496919:
                    if (m16216e.equals("Number")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1808118735:
                    if (m16216e.equals("String")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2439591:
                    if (m16216e.equals("Null")) {
                        c = 1;
                        break;
                    }
                    break;
                case 965837104:
                    if (m16216e.equals("Undefined")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1729365000:
                    if (m16216e.equals("Boolean")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    return true;
                case 2:
                    double doubleValue = ((Double) ((C6884ec) abstractC6880ea).mo16034b()).doubleValue();
                    double doubleValue2 = ((Double) ((C6884ec) abstractC6880ea2).mo16034b()).doubleValue();
                    if (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2)) {
                        return false;
                    }
                    return doubleValue == doubleValue2;
                case 3:
                    return ((String) ((C6893ej) abstractC6880ea).mo16034b()).equals((String) ((C6893ej) abstractC6880ea2).mo16034b());
                case 4:
                    return ((Boolean) ((C6883eb) abstractC6880ea).mo16034b()) == ((Boolean) ((C6883eb) abstractC6880ea2).mo16034b());
                default:
                    return abstractC6880ea == abstractC6880ea2;
            }
        }
    }

    /* renamed from: e */
    private static String m16216e(AbstractC6880ea<?> abstractC6880ea) {
        return abstractC6880ea == C6886ee.f23122e ? "Undefined" : abstractC6880ea == C6886ee.f23121d ? "Null" : abstractC6880ea instanceof C6883eb ? "Boolean" : abstractC6880ea instanceof C6884ec ? "Number" : abstractC6880ea instanceof C6893ej ? "String" : "Object";
    }

    /* renamed from: f */
    private static boolean m16215f(AbstractC6880ea<?> abstractC6880ea) {
        return (abstractC6880ea instanceof C6892ei) || !(!(abstractC6880ea instanceof C6886ee) || abstractC6880ea == C6886ee.f23122e || abstractC6880ea == C6886ee.f23121d);
    }
}
