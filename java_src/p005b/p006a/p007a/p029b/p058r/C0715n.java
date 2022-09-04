package p005b.p006a.p007a.p029b.p058r;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: b.a.a.b.r.n */
/* loaded from: classes.dex */
public class C0715n {

    /* renamed from: a */
    static final long f1295a = 1024;

    /* renamed from: b */
    static final long f1296b = 1048576;

    /* renamed from: c */
    static final long f1297c = 1073741824;

    /* renamed from: e */
    private static final String f1298e = "([0-9]+)";

    /* renamed from: f */
    private static final int f1299f = 1;

    /* renamed from: g */
    private static final String f1300g = "(|kb|mb|gb)s?";

    /* renamed from: h */
    private static final int f1301h = 2;

    /* renamed from: i */
    private static final Pattern f1302i = Pattern.compile("([0-9]+)\\s*(|kb|mb|gb)s?", 2);

    /* renamed from: d */
    final long f1303d;

    C0715n(long j) {
        this.f1303d = j;
    }

    /* renamed from: a */
    public static C0715n m38409a(String str) {
        long j;
        Matcher matcher = f1302i.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            long longValue = Long.valueOf(group).longValue();
            if (group2.equalsIgnoreCase("")) {
                j = 1;
            } else if (group2.equalsIgnoreCase("kb")) {
                j = 1024;
            } else if (group2.equalsIgnoreCase("mb")) {
                j = f1296b;
            } else if (!group2.equalsIgnoreCase("gb")) {
                throw new IllegalStateException("Unexpected " + group2);
            } else {
                j = 1073741824;
            }
            return new C0715n(j * longValue);
        }
        throw new IllegalArgumentException("String value [" + str + "] is not in the expected format.");
    }

    /* renamed from: a */
    public long m38410a() {
        return this.f1303d;
    }
}
