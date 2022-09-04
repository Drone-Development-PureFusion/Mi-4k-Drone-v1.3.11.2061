package p005b.p006a.p007a.p059c.p060a.p061a.p062a.p064b;

import java.lang.Character;
import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: b.a.a.c.a.a.a.b.a */
/* loaded from: classes.dex */
public final class C0733a {
    /* renamed from: a */
    public static String m38312a(String str) {
        return str.replace("&", "&amp;").replace("<", "&lt;");
    }

    /* renamed from: a */
    private static List<Integer> m38311a(String str, int i) {
        char charAt;
        int i2 = 0;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf(37, i3);
            int i4 = indexOf + 1;
            if (i4 != 0 && i4 != length) {
                i3 = i4 + 1;
                char charAt2 = str.charAt(i4);
                if (charAt2 != '%') {
                    if (charAt2 >= '0' && charAt2 <= '9' && i3 < length) {
                        do {
                            int i5 = i3;
                            i3 = i5 + 1;
                            charAt = str.charAt(i5);
                            if (charAt < '0' || charAt > '9') {
                                break;
                            }
                        } while (i3 < length);
                        if (charAt == '$') {
                            continue;
                        }
                    }
                    arrayList.add(Integer.valueOf(indexOf));
                    if (i != -1 && (i2 = i2 + 1) >= i) {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m38313a(char c) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        return (Character.isISOControl(c) || c == 65535 || of == null || of == Character.UnicodeBlock.SPECIALS) ? false : true;
    }

    /* renamed from: b */
    public static String m38310b(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(str.length() + 10);
        switch (charArray[0]) {
            case '#':
            case '?':
            case '@':
                sb.append('\\');
                break;
        }
        for (char c : charArray) {
            switch (c) {
                case '\n':
                    sb.append("\\n");
                    continue;
                case '\"':
                    sb.append("&quot;");
                    continue;
                case '\\':
                    sb.append('\\');
                    break;
                default:
                    if (!m38313a(c)) {
                        sb.append(String.format("\\u%04x", Integer.valueOf(c)));
                        continue;
                    }
                    break;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m38309c(String str) {
        boolean z;
        boolean z2;
        if (str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(str.length() + 10);
        switch (charArray[0]) {
            case '#':
            case '?':
            case '@':
                sb.append('\\');
                break;
        }
        int length = charArray.length;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
        int i2 = 0;
        boolean z5 = false;
        while (i < length) {
            char c = charArray[i];
            if (!z5) {
                if (c != ' ') {
                    switch (c) {
                        case '\n':
                        case '\'':
                            z2 = false;
                            z = true;
                            break;
                        case '\"':
                            sb.append('\\');
                            z = z4;
                            z2 = false;
                            break;
                        case '<':
                            if (!z4) {
                                z = z4;
                                z5 = true;
                                z2 = false;
                                break;
                            } else {
                                sb.insert(i2, '\"').append('\"');
                                z = z4;
                                z5 = true;
                                z2 = false;
                                break;
                            }
                        case '\\':
                            sb.append('\\');
                            z = z4;
                            z2 = false;
                            break;
                        default:
                            if (m38313a(c)) {
                                z = z4;
                                z2 = false;
                                break;
                            } else {
                                sb.append(String.format("\\u%04x", Integer.valueOf(c)));
                                z = z4;
                                z2 = false;
                                continue;
                                i++;
                                boolean z6 = z2;
                                z4 = z;
                                z3 = z6;
                            }
                    }
                } else {
                    if (z3) {
                        z4 = true;
                    }
                    z = z4;
                    z2 = true;
                }
            } else if (c == '>') {
                i2 = sb.length() + 1;
                z5 = false;
                z2 = z3;
                z = false;
            } else {
                boolean z7 = z3;
                z = z4;
                z2 = z7;
            }
            sb.append(c);
            i++;
            boolean z62 = z2;
            z4 = z;
            z3 = z62;
        }
        if (z4 || z3) {
            sb.insert(i2, '\"').append('\"');
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m38308d(String str) {
        return m38311a(str, 2).size() > 1;
    }

    /* renamed from: e */
    public static String m38307e(String str) {
        List<Integer> m38311a = m38311a(str, -1);
        if (m38311a.size() < 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        for (Integer num : m38311a) {
            Integer valueOf = Integer.valueOf(num.intValue() + 1);
            int i3 = i + 1;
            sb.append(str.substring(i2, valueOf.intValue())).append(i3).append(C0494h.f688I);
            i2 = valueOf.intValue();
            i = i3;
        }
        sb.append(str.substring(i2));
        return sb.toString();
    }
}
