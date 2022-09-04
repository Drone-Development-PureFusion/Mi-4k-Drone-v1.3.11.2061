package org.p286a.p287a.p305h;

import com.baidu.tts.loopj.RequestParams;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.C11011b;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.p296f.C11081j;
import org.p286a.p287a.p316k.C11323a;
import org.p286a.p287a.p316k.C11324b;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11359f;
@AbstractC11008b
/* renamed from: org.a.a.h.e */
/* loaded from: classes2.dex */
public final class C11143e implements Serializable {

    /* renamed from: a */
    public static final C11143e f35829a = m1944a("application/atom+xml", C11011b.f35500g);

    /* renamed from: b */
    public static final C11143e f35830b = m1944a(C11081j.f35660a, C11011b.f35500g);

    /* renamed from: c */
    public static final C11143e f35831c = m1944a(RequestParams.APPLICATION_JSON, C11011b.f35498e);

    /* renamed from: d */
    public static final C11143e f35832d = m1944a(RequestParams.APPLICATION_OCTET_STREAM, (Charset) null);

    /* renamed from: e */
    public static final C11143e f35833e = m1944a("application/svg+xml", C11011b.f35500g);

    /* renamed from: f */
    public static final C11143e f35834f = m1944a("application/xhtml+xml", C11011b.f35500g);

    /* renamed from: g */
    public static final C11143e f35835g = m1944a("application/xml", C11011b.f35500g);

    /* renamed from: h */
    public static final C11143e f35836h = m1944a("multipart/form-data", C11011b.f35500g);

    /* renamed from: i */
    public static final C11143e f35837i = m1944a("text/html", C11011b.f35500g);

    /* renamed from: j */
    public static final C11143e f35838j = m1944a("text/plain", C11011b.f35500g);

    /* renamed from: k */
    public static final C11143e f35839k = m1944a("text/xml", C11011b.f35500g);

    /* renamed from: l */
    public static final C11143e f35840l = m1944a("*/*", (Charset) null);

    /* renamed from: m */
    public static final C11143e f35841m = f35838j;

    /* renamed from: n */
    public static final C11143e f35842n = f35832d;
    private static final long serialVersionUID = -7768694718232371896L;

    /* renamed from: o */
    private final String f35843o;

    /* renamed from: p */
    private final Charset f35844p;

    /* renamed from: q */
    private final NameValuePair[] f35845q;

    C11143e(String str, Charset charset) {
        this.f35843o = str;
        this.f35844p = charset;
        this.f35845q = null;
    }

    C11143e(String str, NameValuePair[] nameValuePairArr) {
        this.f35843o = str;
        this.f35845q = nameValuePairArr;
        String m1946a = m1946a("charset");
        this.f35844p = !C11359f.m1296b(m1946a) ? Charset.forName(m1946a) : null;
    }

    /* renamed from: a */
    public static C11143e m1945a(String str, String str2) {
        return m1944a(str, !C11359f.m1296b(str2) ? Charset.forName(str2) : null);
    }

    /* renamed from: a */
    public static C11143e m1944a(String str, Charset charset) {
        String lowerCase = ((String) C11354a.m1315b(str, "MIME type")).toLowerCase(Locale.US);
        C11354a.m1319a(m1935e(lowerCase), "MIME type may not contain reserved characters");
        return new C11143e(lowerCase, charset);
    }

    /* renamed from: a */
    private static C11143e m1942a(HeaderElement headerElement) {
        String name = headerElement.getName();
        NameValuePair[] parameters = headerElement.getParameters();
        if (parameters == null || parameters.length <= 0) {
            parameters = null;
        }
        return new C11143e(name, parameters);
    }

    /* renamed from: a */
    public static C11143e m1941a(HttpEntity httpEntity) {
        Header contentType;
        if (httpEntity == null || (contentType = httpEntity.getContentType()) == null) {
            return null;
        }
        HeaderElement[] elements = contentType.getElements();
        if (elements.length <= 0) {
            return null;
        }
        return m1942a(elements[0]);
    }

    /* renamed from: b */
    public static C11143e m1939b(String str) {
        return new C11143e(str, (Charset) null);
    }

    /* renamed from: b */
    public static C11143e m1938b(HttpEntity httpEntity) {
        C11143e m1941a = m1941a(httpEntity);
        return m1941a != null ? m1941a : f35841m;
    }

    /* renamed from: c */
    public static C11143e m1937c(String str) {
        C11354a.m1321a(str, "Content type");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        HeaderElement[] parseElements = C11324b.f36371b.parseElements(charArrayBuffer, new ParserCursor(0, str.length()));
        if (parseElements.length > 0) {
            return m1942a(parseElements[0]);
        }
        throw new ParseException("Invalid content type: " + str);
    }

    /* renamed from: e */
    private static boolean m1935e(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"' || charAt == ',' || charAt == ';') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public String m1947a() {
        return this.f35843o;
    }

    /* renamed from: a */
    public String m1946a(String str) {
        NameValuePair[] nameValuePairArr;
        C11354a.m1322a(str, "Parameter name");
        if (this.f35845q == null) {
            return null;
        }
        for (NameValuePair nameValuePair : this.f35845q) {
            if (nameValuePair.getName().equalsIgnoreCase(str)) {
                return nameValuePair.getValue();
            }
        }
        return null;
    }

    /* renamed from: a */
    public C11143e m1943a(Charset charset) {
        return m1944a(m1947a(), charset);
    }

    /* renamed from: b */
    public Charset m1940b() {
        return this.f35844p;
    }

    /* renamed from: d */
    public C11143e m1936d(String str) {
        return m1945a(m1947a(), str);
    }

    public String toString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        charArrayBuffer.append(this.f35843o);
        if (this.f35845q != null) {
            charArrayBuffer.append("; ");
            C11323a.f36367b.formatParameters(charArrayBuffer, this.f35845q, false);
        } else if (this.f35844p != null) {
            charArrayBuffer.append("; charset=");
            charArrayBuffer.append(this.f35844p.name());
        }
        return charArrayBuffer.toString();
    }
}
