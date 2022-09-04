package p005b.p006a.p007a.p029b.p045i;
/* renamed from: b.a.a.b.i.m */
/* loaded from: classes.dex */
public class C0593m {

    /* renamed from: a */
    static final String[] f1023a = {" ", "  ", "    ", "        ", "                ", "                                "};

    /* renamed from: a */
    public static final void m38776a(StringBuilder sb, int i) {
        while (i >= 32) {
            sb.append(f1023a[5]);
            i -= 32;
        }
        for (int i2 = 4; i2 >= 0; i2--) {
            if (((1 << i2) & i) != 0) {
                sb.append(f1023a[i2]);
            }
        }
    }

    /* renamed from: a */
    public static final void m38775a(StringBuilder sb, String str, int i) {
        int i2 = 0;
        if (str != null) {
            i2 = str.length();
        }
        if (i2 < i) {
            m38776a(sb, i - i2);
        }
        if (str != null) {
            sb.append(str);
        }
    }

    /* renamed from: b */
    public static final void m38774b(StringBuilder sb, String str, int i) {
        int i2 = 0;
        if (str != null) {
            i2 = str.length();
        }
        if (str != null) {
            sb.append(str);
        }
        if (i2 < i) {
            m38776a(sb, i - i2);
        }
    }
}
