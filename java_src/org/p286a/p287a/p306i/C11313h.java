package org.p286a.p287a.p306i;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.RequestLine;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.message.BasicHttpRequest;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.p293c.C11044h;
import org.p286a.p287a.p290c.p293c.C11045i;
import org.p286a.p287a.p290c.p293c.C11048l;
import org.p286a.p287a.p290c.p293c.C11053o;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.h */
/* loaded from: classes2.dex */
public class C11313h implements HttpRequestFactory {

    /* renamed from: a */
    public static final C11313h f36351a = new C11313h();

    /* renamed from: b */
    private static final String[] f36352b = {"GET"};

    /* renamed from: c */
    private static final String[] f36353c = {"POST", C11048l.f35589a};

    /* renamed from: d */
    private static final String[] f36354d = {C11044h.f35585a, C11045i.f35586a, "DELETE", C11053o.f35598a, "CONNECT"};

    /* renamed from: a */
    private static boolean m1475a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public HttpRequest newHttpRequest(String str, String str2) {
        if (m1475a(f36352b, str)) {
            return new BasicHttpRequest(str, str2);
        }
        if (m1475a(f36353c, str)) {
            return new BasicHttpEntityEnclosingRequest(str, str2);
        }
        if (!m1475a(f36354d, str)) {
            throw new MethodNotSupportedException(str + " method not supported");
        }
        return new BasicHttpRequest(str, str2);
    }

    public HttpRequest newHttpRequest(RequestLine requestLine) {
        C11354a.m1321a(requestLine, "Request line");
        String method = requestLine.getMethod();
        if (m1475a(f36352b, method)) {
            return new BasicHttpRequest(requestLine);
        }
        if (m1475a(f36353c, method)) {
            return new BasicHttpEntityEnclosingRequest(requestLine);
        }
        if (!m1475a(f36354d, method)) {
            throw new MethodNotSupportedException(method + " method not supported");
        }
        return new BasicHttpRequest(requestLine);
    }
}
