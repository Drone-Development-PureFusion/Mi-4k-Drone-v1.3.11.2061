package p005b.p006a.p007a.p029b.p058r;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: b.a.a.b.r.j */
/* loaded from: classes.dex */
public class C0711j {

    /* renamed from: a */
    static final long f1285a = 1000;

    /* renamed from: b */
    static final long f1286b = 60000;

    /* renamed from: c */
    static final long f1287c = 3600000;

    /* renamed from: d */
    static final long f1288d = 86400000;

    /* renamed from: f */
    private static final String f1289f = "([0-9]*(.[0-9]+)?)";

    /* renamed from: g */
    private static final int f1290g = 1;

    /* renamed from: h */
    private static final String f1291h = "(|milli(second)?|second(e)?|minute|hour|day)s?";

    /* renamed from: i */
    private static final int f1292i = 3;

    /* renamed from: j */
    private static final Pattern f1293j = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);

    /* renamed from: e */
    final long f1294e;

    public C0711j(long j) {
        this.f1294e = j;
    }

    /* renamed from: a */
    public static C0711j m38426a() {
        return new C0711j(Long.MAX_VALUE);
    }

    /* renamed from: a */
    public static C0711j m38425a(double d) {
        return new C0711j((long) d);
    }

    /* renamed from: a */
    public static C0711j m38424a(String str) {
        Matcher matcher = f1293j.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(3);
            double doubleValue = Double.valueOf(group).doubleValue();
            if (group2.equalsIgnoreCase("milli") || group2.equalsIgnoreCase("millisecond") || group2.length() == 0) {
                return m38425a(doubleValue);
            }
            if (group2.equalsIgnoreCase("second") || group2.equalsIgnoreCase("seconde")) {
                return m38422b(doubleValue);
            }
            if (group2.equalsIgnoreCase("minute")) {
                return m38421c(doubleValue);
            }
            if (group2.equalsIgnoreCase("hour")) {
                return m38420d(doubleValue);
            }
            if (!group2.equalsIgnoreCase("day")) {
                throw new IllegalStateException("Unexpected " + group2);
            }
            return m38419e(doubleValue);
        }
        throw new IllegalArgumentException("String value [" + str + "] is not in the expected format.");
    }

    /* renamed from: b */
    public static C0711j m38422b(double d) {
        return new C0711j((long) (1000.0d * d));
    }

    /* renamed from: c */
    public static C0711j m38421c(double d) {
        return new C0711j((long) (60000.0d * d));
    }

    /* renamed from: d */
    public static C0711j m38420d(double d) {
        return new C0711j((long) (3600000.0d * d));
    }

    /* renamed from: e */
    public static C0711j m38419e(double d) {
        return new C0711j((long) (8.64E7d * d));
    }

    /* renamed from: b */
    public long m38423b() {
        return this.f1294e;
    }

    public String toString() {
        return this.f1294e < 1000 ? this.f1294e + " milliseconds" : this.f1294e < 60000 ? (this.f1294e / 1000) + " seconds" : this.f1294e < 3600000 ? (this.f1294e / 60000) + " minutes" : (this.f1294e / 3600000) + " hours";
    }
}
