package p005b.p006a.p007a.p008a.p026n;

import java.util.List;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: b.a.a.a.n.a */
/* loaded from: classes.dex */
public class C0363a {

    /* renamed from: a */
    public static final String f360a = "?";

    /* renamed from: b */
    public static final int f361b = -1;

    /* renamed from: c */
    public static final String f362c = "?#?:?" + C0494h.f715c;

    /* renamed from: d */
    public static final StackTraceElement[] f363d = new StackTraceElement[0];

    /* renamed from: e */
    private static final String f364e = "org.apache.log4j.Category";

    /* renamed from: f */
    private static final String f365f = "org.slf4j.Logger";

    /* renamed from: a */
    public static StackTraceElement m39578a() {
        return new StackTraceElement(f360a, f360a, f360a, -1);
    }

    /* renamed from: a */
    static boolean m39577a(String str, String str2, List<String> list) {
        return str.equals(str2) || str.equals(f364e) || str.startsWith(f365f) || m39576a(str, list);
    }

    /* renamed from: a */
    private static boolean m39576a(String str, List<String> list) {
        if (list == null) {
            return false;
        }
        for (String str2 : list) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static StackTraceElement[] m39575a(Throwable th, String str, int i, List<String> list) {
        if (th == null) {
            return null;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int i2 = -1;
        for (int i3 = 0; i3 < stackTrace.length; i3++) {
            if (m39577a(stackTrace[i3].getClassName(), str, list)) {
                i2 = i3 + 1;
            } else if (i2 != -1) {
                break;
            }
        }
        if (i2 == -1) {
            return f363d;
        }
        int length = stackTrace.length - i2;
        if (i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        for (int i4 = 0; i4 < i; i4++) {
            stackTraceElementArr[i4] = stackTrace[i2 + i4];
        }
        return stackTraceElementArr;
    }
}
