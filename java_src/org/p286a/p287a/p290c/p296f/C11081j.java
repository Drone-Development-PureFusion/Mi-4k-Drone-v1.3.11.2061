package org.p286a.p287a.p290c.p296f;

import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import org.codehaus.jackson.smile.SmileConstants;
import org.p286a.p287a.C11011b;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p305h.C11143e;
import org.p286a.p287a.p316k.C11324b;
import org.p286a.p287a.p320o.C11357d;
@AbstractC11008b
/* renamed from: org.a.a.c.f.j */
/* loaded from: classes2.dex */
public class C11081j {

    /* renamed from: a */
    public static final String f35660a = "application/x-www-form-urlencoded";

    /* renamed from: d */
    private static final String f35663d = "=";

    /* renamed from: n */
    private static final int f35673n = 16;

    /* renamed from: b */
    private static final char f35661b = '&';

    /* renamed from: c */
    private static final char f35662c = ';';

    /* renamed from: e */
    private static final char[] f35664e = {f35661b, f35662c};

    /* renamed from: f */
    private static final String f35665f = "[" + new String(f35664e) + "]";

    /* renamed from: g */
    private static final BitSet f35666g = new BitSet(256);

    /* renamed from: h */
    private static final BitSet f35667h = new BitSet(256);

    /* renamed from: i */
    private static final BitSet f35668i = new BitSet(256);

    /* renamed from: j */
    private static final BitSet f35669j = new BitSet(256);

    /* renamed from: k */
    private static final BitSet f35670k = new BitSet(256);

    /* renamed from: l */
    private static final BitSet f35671l = new BitSet(256);

    /* renamed from: m */
    private static final BitSet f35672m = new BitSet(256);

    static {
        for (int i = 97; i <= 122; i++) {
            f35666g.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f35666g.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            f35666g.set(i3);
        }
        f35666g.set(95);
        f35666g.set(45);
        f35666g.set(46);
        f35666g.set(42);
        f35672m.or(f35666g);
        f35666g.set(33);
        f35666g.set(126);
        f35666g.set(39);
        f35666g.set(40);
        f35666g.set(41);
        f35667h.set(44);
        f35667h.set(59);
        f35667h.set(58);
        f35667h.set(36);
        f35667h.set(38);
        f35667h.set(43);
        f35667h.set(61);
        f35668i.or(f35666g);
        f35668i.or(f35667h);
        f35669j.or(f35666g);
        f35669j.set(47);
        f35669j.set(59);
        f35669j.set(58);
        f35669j.set(64);
        f35669j.set(38);
        f35669j.set(61);
        f35669j.set(43);
        f35669j.set(36);
        f35669j.set(44);
        f35671l.set(59);
        f35671l.set(47);
        f35671l.set(63);
        f35671l.set(58);
        f35671l.set(64);
        f35671l.set(38);
        f35671l.set(61);
        f35671l.set(43);
        f35671l.set(36);
        f35671l.set(44);
        f35671l.set(91);
        f35671l.set(93);
        f35670k.or(f35671l);
        f35670k.or(f35666g);
    }

    /* renamed from: a */
    public static String m2094a(Iterable<? extends NameValuePair> iterable, char c, Charset charset) {
        StringBuilder sb = new StringBuilder();
        for (NameValuePair nameValuePair : iterable) {
            String m2075f = m2075f(nameValuePair.getName(), charset);
            String m2075f2 = m2075f(nameValuePair.getValue(), charset);
            if (sb.length() > 0) {
                sb.append(c);
            }
            sb.append(m2075f);
            if (m2075f2 != null) {
                sb.append(f35663d);
                sb.append(m2075f2);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m2093a(Iterable<? extends NameValuePair> iterable, Charset charset) {
        return m2094a(iterable, (char) f35661b, charset);
    }

    /* renamed from: a */
    private static String m2092a(String str, String str2) {
        if (str == null) {
            return null;
        }
        return m2089a(str, str2 != null ? Charset.forName(str2) : C11011b.f35498e, true);
    }

    /* renamed from: a */
    private static String m2090a(String str, Charset charset, BitSet bitSet, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ByteBuffer encode = charset.encode(str);
        while (encode.hasRemaining()) {
            int i = encode.get() & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
            if (bitSet.get(i)) {
                sb.append((char) i);
            } else if (!z || i != 32) {
                sb.append("%");
                char upperCase = Character.toUpperCase(Character.forDigit((i >> 4) & 15, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(i & 15, 16));
                sb.append(upperCase);
                sb.append(upperCase2);
            } else {
                sb.append(SignatureVisitor.EXTENDS);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m2089a(String str, Charset charset, boolean z) {
        if (str == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(str.length());
        CharBuffer wrap = CharBuffer.wrap(str);
        while (wrap.hasRemaining()) {
            char c = wrap.get();
            if (c == '%' && wrap.remaining() >= 2) {
                char c2 = wrap.get();
                char c3 = wrap.get();
                int digit = Character.digit(c2, 16);
                int digit2 = Character.digit(c3, 16);
                if (digit == -1 || digit2 == -1) {
                    allocate.put((byte) 37);
                    allocate.put((byte) c2);
                    allocate.put((byte) c3);
                } else {
                    allocate.put((byte) ((digit << 4) + digit2));
                }
            } else if (!z || c != '+') {
                allocate.put((byte) c);
            } else {
                allocate.put((byte) 32);
            }
        }
        allocate.flip();
        return charset.decode(allocate).toString();
    }

    /* renamed from: a */
    public static String m2086a(List<? extends NameValuePair> list, char c, String str) {
        StringBuilder sb = new StringBuilder();
        for (NameValuePair nameValuePair : list) {
            String m2081b = m2081b(nameValuePair.getName(), str);
            String m2081b2 = m2081b(nameValuePair.getValue(), str);
            if (sb.length() > 0) {
                sb.append(c);
            }
            sb.append(m2081b);
            if (m2081b2 != null) {
                sb.append(f35663d);
                sb.append(m2081b2);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m2085a(List<? extends NameValuePair> list, String str) {
        return m2086a(list, (char) f35661b, str);
    }

    /* renamed from: a */
    public static List<NameValuePair> m2091a(String str, Charset charset) {
        return m2088a(str, charset, f35664e);
    }

    /* renamed from: a */
    public static List<NameValuePair> m2088a(String str, Charset charset, char... cArr) {
        if (str == null) {
            return Collections.emptyList();
        }
        C11324b c11324b = C11324b.f36371b;
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        ParserCursor parserCursor = new ParserCursor(0, charArrayBuffer.length());
        ArrayList arrayList = new ArrayList();
        while (!parserCursor.atEnd()) {
            NameValuePair m1449a = c11324b.m1449a(charArrayBuffer, parserCursor, cArr);
            if (m1449a.getName().length() > 0) {
                arrayList.add(new BasicNameValuePair(m2076e(m1449a.getName(), charset), m2076e(m1449a.getValue(), charset)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<NameValuePair> m2087a(URI uri, String str) {
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null || rawQuery.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        m2083a(arrayList, new Scanner(rawQuery), f35665f, str);
        return arrayList;
    }

    /* renamed from: a */
    public static List<NameValuePair> m2082a(HttpEntity httpEntity) {
        String m1305a;
        C11143e m1941a = C11143e.m1941a(httpEntity);
        if (m1941a == null || !m1941a.m1947a().equalsIgnoreCase(f35660a) || (m1305a = C11357d.m1305a(httpEntity, C11011b.f35499f)) == null || m1305a.length() <= 0) {
            return Collections.emptyList();
        }
        Charset m1940b = m1941a.m1940b();
        if (m1940b == null) {
            m1940b = Charset.forName("ISO-8859-1");
        }
        return m2088a(m1305a, m1940b, f35664e);
    }

    /* renamed from: a */
    public static void m2084a(List<NameValuePair> list, Scanner scanner, String str) {
        m2083a(list, scanner, f35665f, str);
    }

    /* renamed from: a */
    public static void m2083a(List<NameValuePair> list, Scanner scanner, String str, String str2) {
        String m2092a;
        scanner.useDelimiter(str);
        while (scanner.hasNext()) {
            String str3 = null;
            String next = scanner.next();
            int indexOf = next.indexOf(f35663d);
            if (indexOf != -1) {
                m2092a = m2092a(next.substring(0, indexOf).trim(), str2);
                str3 = m2092a(next.substring(indexOf + 1).trim(), str2);
            } else {
                m2092a = m2092a(next.trim(), str2);
            }
            list.add(new BasicNameValuePair(m2092a, str3));
        }
    }

    /* renamed from: b */
    private static String m2081b(String str, String str2) {
        if (str == null) {
            return null;
        }
        return m2090a(str, str2 != null ? Charset.forName(str2) : C11011b.f35498e, f35672m, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m2080b(String str, Charset charset) {
        return m2090a(str, charset, f35668i, false);
    }

    /* renamed from: b */
    public static boolean m2079b(HttpEntity httpEntity) {
        Header contentType = httpEntity.getContentType();
        if (contentType != null) {
            HeaderElement[] elements = contentType.getElements();
            if (elements.length <= 0) {
                return false;
            }
            return elements[0].getName().equalsIgnoreCase(f35660a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m2078c(String str, Charset charset) {
        return m2090a(str, charset, f35670k, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m2077d(String str, Charset charset) {
        return m2090a(str, charset, f35669j, false);
    }

    /* renamed from: e */
    private static String m2076e(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = C11011b.f35498e;
        }
        return m2089a(str, charset, true);
    }

    /* renamed from: f */
    private static String m2075f(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = C11011b.f35498e;
        }
        return m2090a(str, charset, f35672m, true);
    }
}
