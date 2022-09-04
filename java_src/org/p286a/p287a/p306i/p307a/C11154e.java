package org.p286a.p287a.p306i.p307a;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.impl.auth.UnsupportedDigestAlgorithmException;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;
import org.p286a.p287a.C11011b;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p289b.EnumC11016e;
import org.p286a.p287a.p316k.C11323a;
import org.p286a.p287a.p319n.C11342a;
import org.p286a.p287a.p320o.C11354a;
import p005b.p006a.p007a.p029b.C0494h;
@AbstractC11009c
/* renamed from: org.a.a.i.a.e */
/* loaded from: classes.dex */
public class C11154e extends AbstractC11169k {

    /* renamed from: a */
    private static final char[] f35864a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c */
    private static final int f35865c = -1;

    /* renamed from: d */
    private static final int f35866d = 0;

    /* renamed from: e */
    private static final int f35867e = 1;

    /* renamed from: f */
    private static final int f35868f = 2;

    /* renamed from: b */
    private boolean f35869b;

    /* renamed from: g */
    private String f35870g;

    /* renamed from: h */
    private long f35871h;

    /* renamed from: i */
    private String f35872i;

    /* renamed from: j */
    private String f35873j;

    /* renamed from: k */
    private String f35874k;

    public C11154e() {
        this(C11011b.f35499f);
    }

    public C11154e(Charset charset) {
        super(charset);
        this.f35869b = false;
    }

    @Deprecated
    public C11154e(EnumC11016e enumC11016e) {
        super(enumC11016e);
    }

    /* renamed from: a */
    static String m1914a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        for (int i = 0; i < length; i++) {
            cArr[i * 2] = f35864a[(bArr[i] & 240) >> 4];
            cArr[(i * 2) + 1] = f35864a[bArr[i] & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private static MessageDigest m1918a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception e) {
            throw new UnsupportedDigestAlgorithmException("Unsupported algorithm in HTTP Digest authentication: " + str);
        }
    }

    /* renamed from: a */
    private Header m1916a(Credentials credentials, HttpRequest httpRequest) {
        char c;
        String sb;
        String parameter = getParameter("uri");
        String parameter2 = getParameter("realm");
        String parameter3 = getParameter("nonce");
        String parameter4 = getParameter("opaque");
        String parameter5 = getParameter("methodname");
        String parameter6 = getParameter("algorithm");
        if (parameter6 == null) {
            parameter6 = "MD5";
        }
        HashSet hashSet = new HashSet(8);
        char c2 = 65535;
        String parameter7 = getParameter("qop");
        if (parameter7 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(parameter7, Constants.ACCEPT_TIME_SEPARATOR_SP);
            while (stringTokenizer.hasMoreTokens()) {
                hashSet.add(stringTokenizer.nextToken().trim().toLowerCase(Locale.ENGLISH));
            }
            if ((httpRequest instanceof HttpEntityEnclosingRequest) && hashSet.contains("auth-int")) {
                c2 = 1;
            } else if (hashSet.contains("auth")) {
                c2 = 2;
            }
            c = c2;
        } else {
            c = 0;
        }
        if (c == 65535) {
            throw new AuthenticationException("None of the qop methods is supported: " + parameter7);
        }
        String parameter8 = getParameter("charset");
        if (parameter8 == null) {
            parameter8 = "ISO-8859-1";
        }
        String str = parameter6.equalsIgnoreCase("MD5-sess") ? "MD5" : parameter6;
        try {
            MessageDigest m1918a = m1918a(str);
            String name = credentials.getUserPrincipal().getName();
            String password = credentials.getPassword();
            if (parameter3.equals(this.f35870g)) {
                this.f35871h++;
            } else {
                this.f35871h = 1L;
                this.f35872i = null;
                this.f35870g = parameter3;
            }
            StringBuilder sb2 = new StringBuilder(256);
            Formatter formatter = new Formatter(sb2, Locale.US);
            formatter.format("%08x", Long.valueOf(this.f35871h));
            formatter.close();
            String sb3 = sb2.toString();
            if (this.f35872i == null) {
                this.f35872i = m1910f();
            }
            this.f35873j = null;
            this.f35874k = null;
            if (parameter6.equalsIgnoreCase("MD5-sess")) {
                sb2.setLength(0);
                sb2.append(name).append(C0494h.f680A).append(parameter2).append(C0494h.f680A).append(password);
                String m1914a = m1914a(m1918a.digest(EncodingUtils.getBytes(sb2.toString(), parameter8)));
                sb2.setLength(0);
                sb2.append(m1914a).append(C0494h.f680A).append(parameter3).append(C0494h.f680A).append(this.f35872i);
                this.f35873j = sb2.toString();
            } else {
                sb2.setLength(0);
                sb2.append(name).append(C0494h.f680A).append(parameter2).append(C0494h.f680A).append(password);
                this.f35873j = sb2.toString();
            }
            String m1914a2 = m1914a(m1918a.digest(EncodingUtils.getBytes(this.f35873j, parameter8)));
            if (c == 2) {
                this.f35874k = parameter5 + C0494h.f680A + parameter;
            } else if (c == 1) {
                HttpEntity httpEntity = null;
                if (httpRequest instanceof HttpEntityEnclosingRequest) {
                    httpEntity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
                }
                if (httpEntity == null || httpEntity.isRepeatable()) {
                    C11157g c11157g = new C11157g(m1918a);
                    if (httpEntity != null) {
                        try {
                            httpEntity.writeTo(c11157g);
                        } catch (IOException e) {
                            throw new AuthenticationException("I/O error reading entity content", e);
                        }
                    }
                    c11157g.close();
                    this.f35874k = parameter5 + C0494h.f680A + parameter + C0494h.f680A + m1914a(c11157g.m1904a());
                } else if (!hashSet.contains("auth")) {
                    throw new AuthenticationException("Qop auth-int cannot be used with a non-repeatable entity");
                } else {
                    c = 2;
                    this.f35874k = parameter5 + C0494h.f680A + parameter;
                }
            } else {
                this.f35874k = parameter5 + C0494h.f680A + parameter;
            }
            String m1914a3 = m1914a(m1918a.digest(EncodingUtils.getBytes(this.f35874k, parameter8)));
            if (c == 0) {
                sb2.setLength(0);
                sb2.append(m1914a2).append(C0494h.f680A).append(parameter3).append(C0494h.f680A).append(m1914a3);
                sb = sb2.toString();
            } else {
                sb2.setLength(0);
                sb2.append(m1914a2).append(C0494h.f680A).append(parameter3).append(C0494h.f680A).append(sb3).append(C0494h.f680A).append(this.f35872i).append(C0494h.f680A).append(c == 1 ? "auth-int" : "auth").append(C0494h.f680A).append(m1914a3);
                sb = sb2.toString();
            }
            String m1914a4 = m1914a(m1918a.digest(EncodingUtils.getAsciiBytes(sb)));
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(128);
            if (a()) {
                charArrayBuffer.append(C11086e.f35692N);
            } else {
                charArrayBuffer.append("Authorization");
            }
            charArrayBuffer.append(": Digest ");
            ArrayList arrayList = new ArrayList(20);
            arrayList.add(new BasicNameValuePair("username", name));
            arrayList.add(new BasicNameValuePair("realm", parameter2));
            arrayList.add(new BasicNameValuePair("nonce", parameter3));
            arrayList.add(new BasicNameValuePair("uri", parameter));
            arrayList.add(new BasicNameValuePair("response", m1914a4));
            if (c != 0) {
                arrayList.add(new BasicNameValuePair("qop", c == 1 ? "auth-int" : "auth"));
                arrayList.add(new BasicNameValuePair("nc", sb3));
                arrayList.add(new BasicNameValuePair("cnonce", this.f35872i));
            }
            arrayList.add(new BasicNameValuePair("algorithm", parameter6));
            if (parameter4 != null) {
                arrayList.add(new BasicNameValuePair("opaque", parameter4));
            }
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= arrayList.size()) {
                    return new BufferedHeader(charArrayBuffer);
                }
                NameValuePair nameValuePair = (BasicNameValuePair) arrayList.get(i2);
                if (i2 > 0) {
                    charArrayBuffer.append(", ");
                }
                String name2 = nameValuePair.getName();
                C11323a.f36367b.formatNameValuePair(charArrayBuffer, nameValuePair, !("nc".equals(name2) || "qop".equals(name2) || "algorithm".equals(name2)));
                i = i2 + 1;
            }
        } catch (UnsupportedDigestAlgorithmException e2) {
            throw new AuthenticationException("Unsuppported digest algorithm: " + str);
        }
    }

    /* renamed from: f */
    public static String m1910f() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return m1914a(bArr);
    }

    @Override // org.p286a.p287a.p306i.p307a.AbstractC11150a, org.p286a.p287a.p289b.AbstractC11017f
    /* renamed from: a */
    public Header mo1915a(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        C11354a.m1321a(credentials, "Credentials");
        C11354a.m1321a(httpRequest, "HTTP request");
        if (getParameter("realm") == null) {
            throw new AuthenticationException("missing realm in challenge");
        }
        if (getParameter("nonce") == null) {
            throw new AuthenticationException("missing nonce in challenge");
        }
        h().put("methodname", httpRequest.getRequestLine().getMethod());
        h().put("uri", httpRequest.getRequestLine().getUri());
        if (getParameter("charset") == null) {
            h().put("charset", a(httpRequest));
        }
        return m1916a(credentials, httpRequest);
    }

    /* renamed from: a */
    public void m1917a(String str, String str2) {
        h().put(str, str2);
    }

    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return mo1915a(credentials, httpRequest, new C11342a());
    }

    /* renamed from: c */
    String m1913c() {
        return this.f35872i;
    }

    /* renamed from: d */
    String m1912d() {
        return this.f35873j;
    }

    /* renamed from: e */
    String m1911e() {
        return this.f35874k;
    }

    public String getSchemeName() {
        return "digest";
    }

    public boolean isComplete() {
        if ("true".equalsIgnoreCase(getParameter("stale"))) {
            return false;
        }
        return this.f35869b;
    }

    public boolean isConnectionBased() {
        return false;
    }

    @Override // org.p286a.p287a.p306i.p307a.AbstractC11150a
    public void processChallenge(Header header) {
        super.processChallenge(header);
        this.f35869b = true;
    }

    @Override // org.p286a.p287a.p306i.p307a.AbstractC11150a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DIGEST [complete=").append(this.f35869b).append(", nonce=").append(this.f35870g).append(", nc=").append(this.f35871h).append("]");
        return sb.toString();
    }
}
