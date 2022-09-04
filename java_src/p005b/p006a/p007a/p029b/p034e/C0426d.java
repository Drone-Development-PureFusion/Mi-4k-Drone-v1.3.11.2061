package p005b.p006a.p007a.p029b.p034e;
/* renamed from: b.a.a.b.e.d */
/* loaded from: classes.dex */
public class C0426d {

    /* renamed from: a */
    private static final String f529a = "<![CDATA[";

    /* renamed from: c */
    private static final String f531c = "]]&gt;";

    /* renamed from: d */
    private static final String f532d = "]]>]]&gt;<![CDATA[";

    /* renamed from: b */
    private static final String f530b = "]]>";

    /* renamed from: e */
    private static final int f533e = f530b.length();

    /* renamed from: a */
    public static String m39339a(String str) {
        return (str == null || str.length() == 0) ? str : (str.indexOf("<") == -1 && str.indexOf(">") == -1) ? str : m39338a(new StringBuffer(str));
    }

    /* renamed from: a */
    public static String m39338a(StringBuffer stringBuffer) {
        for (int i = 0; i < stringBuffer.length(); i++) {
            char charAt = stringBuffer.charAt(i);
            if (charAt == '<') {
                stringBuffer.replace(i, i + 1, "&lt;");
            } else if (charAt == '>') {
                stringBuffer.replace(i, i + 1, "&gt;");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static void m39337a(StringBuilder sb, String str) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(f530b);
        if (indexOf < 0) {
            sb.append(str);
            return;
        }
        int i = 0;
        while (indexOf > -1) {
            sb.append(str.substring(i, indexOf));
            sb.append(f532d);
            i = f533e + indexOf;
            if (i >= str.length()) {
                return;
            }
            indexOf = str.indexOf(f530b, i);
        }
        sb.append(str.substring(i));
    }
}
