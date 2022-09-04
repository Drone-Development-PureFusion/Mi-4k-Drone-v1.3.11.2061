package p005b.p006a.p007a.p029b.p058r;
/* renamed from: b.a.a.b.r.f */
/* loaded from: classes.dex */
public class C0707f {
    /* renamed from: a */
    public static boolean m38432a(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("text");
    }

    /* renamed from: b */
    public static String m38431b(String str) {
        int indexOf;
        int i;
        if (str == null || (indexOf = str.indexOf(47)) == -1 || (i = indexOf + 1) >= str.length()) {
            return null;
        }
        return str.substring(i);
    }
}
