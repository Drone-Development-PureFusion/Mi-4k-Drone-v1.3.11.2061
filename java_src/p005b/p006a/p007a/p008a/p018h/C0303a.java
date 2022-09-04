package p005b.p006a.p007a.p008a.p018h;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.p356d.AbstractC11747c;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0283e;
@Deprecated
/* renamed from: b.a.a.a.h.a */
/* loaded from: classes.dex */
public class C0303a {
    /* renamed from: a */
    public static String m39714a(String str) {
        return AbstractC11747c.f37061c.equals(str) ? "" : str;
    }

    /* renamed from: a */
    public static Level m39716a(C0281d c0281d) {
        if (c0281d == null) {
            throw new IllegalArgumentException("Unexpected level [null]");
        }
        switch (c0281d.f217v) {
            case Integer.MIN_VALUE:
                return Level.ALL;
            case 5000:
                return Level.FINEST;
            case 10000:
                return Level.FINE;
            case 20000:
                return Level.INFO;
            case 30000:
                return Level.WARNING;
            case C0281d.f197b /* 40000 */:
                return Level.SEVERE;
            case Integer.MAX_VALUE:
                return Level.OFF;
            default:
                throw new IllegalArgumentException("Unexpected level [" + c0281d + "]");
        }
    }

    /* renamed from: a */
    public static Logger m39715a(C0283e c0283e) {
        return m39712b(c0283e.mo88d());
    }

    /* renamed from: a */
    public static final boolean m39713a(Logger logger) {
        return logger != null && !logger.getName().equals("");
    }

    /* renamed from: b */
    public static Logger m39712b(String str) {
        return Logger.getLogger(m39714a(str));
    }

    /* renamed from: b */
    public static final boolean m39711b(Logger logger) {
        if (logger == null) {
            return false;
        }
        return logger.getName().equals("");
    }
}
