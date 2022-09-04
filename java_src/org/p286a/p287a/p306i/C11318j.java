package org.p286a.p287a.p306i;

import com.fimi.soul.module.setting.newhand.C2954b;
import com.google.android.gms.wallet.C9357e;
import com.p079a.p080a.AbstractC0877l;
import it.p273a.p274a.AbstractC10866e;
import java.util.Locale;
import org.apache.http.ReasonPhraseCatalog;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.j */
/* loaded from: classes2.dex */
public class C11318j implements ReasonPhraseCatalog {

    /* renamed from: a */
    public static final C11318j f36363a = new C11318j();

    /* renamed from: b */
    private static final String[][] f36364b = {null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    static {
        m1470a(200, "OK");
        m1470a(201, "Created");
        m1470a(202, "Accepted");
        m1470a(204, "No Content");
        m1470a(301, "Moved Permanently");
        m1470a(302, "Moved Temporarily");
        m1470a(304, "Not Modified");
        m1470a(C2954b.f10826ao, "Bad Request");
        m1470a(401, "Unauthorized");
        m1470a(403, "Forbidden");
        m1470a(C9357e.f29594j, "Not Found");
        m1470a(500, "Internal Server Error");
        m1470a(AbstractC10866e.f34835b, "Not Implemented");
        m1470a(AbstractC10866e.f34836c, "Bad Gateway");
        m1470a(AbstractC10866e.f34837d, "Service Unavailable");
        m1470a(100, "Continue");
        m1470a(307, "Temporary Redirect");
        m1470a(C9357e.f29595k, "Method Not Allowed");
        m1470a(C9357e.f29597m, "Conflict");
        m1470a(C9357e.f29600p, "Precondition Failed");
        m1470a(C9357e.f29601q, "Request Too Long");
        m1470a(414, "Request-URI Too Long");
        m1470a(415, "Unsupported Media Type");
        m1470a(300, "Multiple Choices");
        m1470a(303, "See Other");
        m1470a(305, "Use Proxy");
        m1470a(C9357e.f29593i, "Payment Required");
        m1470a(C9357e.f29596l, "Not Acceptable");
        m1470a(407, "Proxy Authentication Required");
        m1470a(408, "Request Timeout");
        m1470a(101, "Switching Protocols");
        m1470a(203, "Non Authoritative Information");
        m1470a(205, "Reset Content");
        m1470a(206, "Partial Content");
        m1470a(AbstractC10866e.f34838e, "Gateway Timeout");
        m1470a(505, "Http Version Not Supported");
        m1470a(C9357e.f29598n, "Gone");
        m1470a(C9357e.f29599o, "Length Required");
        m1470a(416, "Requested Range Not Satisfiable");
        m1470a(417, "Expectation Failed");
        m1470a(102, "Processing");
        m1470a(207, "Multi-Status");
        m1470a(422, "Unprocessable Entity");
        m1470a(419, "Insufficient Space On Resource");
        m1470a(AbstractC0877l.f1841g, "Method Failure");
        m1470a(423, "Locked");
        m1470a(507, "Insufficient Storage");
        m1470a(424, "Failed Dependency");
    }

    protected C11318j() {
    }

    /* renamed from: a */
    private static void m1470a(int i, String str) {
        int i2 = i / 100;
        f36364b[i2][i - (i2 * 100)] = str;
    }

    public String getReason(int i, Locale locale) {
        C11354a.m1319a(i >= 100 && i < 600, "Unknown category for status code " + i);
        int i2 = i / 100;
        int i3 = i - (i2 * 100);
        if (f36364b[i2].length > i3) {
            return f36364b[i2][i3];
        }
        return null;
    }
}
