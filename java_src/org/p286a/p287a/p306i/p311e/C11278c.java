package org.p286a.p287a.p306i.p311e;

import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.e.c */
/* loaded from: classes2.dex */
public class C11278c implements ContentLengthStrategy {

    /* renamed from: a */
    public static final C11278c f36224a = new C11278c();

    /* renamed from: b */
    private final int f36225b;

    public C11278c() {
        this(-1);
    }

    public C11278c(int i) {
        this.f36225b = i;
    }

    public long determineLength(HttpMessage httpMessage) {
        C11354a.m1321a(httpMessage, "HTTP message");
        Header firstHeader = httpMessage.getFirstHeader(C11086e.f35701W);
        if (firstHeader != null) {
            String value = firstHeader.getValue();
            if ("chunked".equalsIgnoreCase(value)) {
                if (!httpMessage.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0)) {
                    return -2L;
                }
                throw new ProtocolException("Chunked transfer encoding not allowed for " + httpMessage.getProtocolVersion());
            } else if (!"identity".equalsIgnoreCase(value)) {
                throw new ProtocolException("Unsupported transfer encoding: " + value);
            } else {
                return -1L;
            }
        }
        Header firstHeader2 = httpMessage.getFirstHeader("Content-Length");
        if (firstHeader2 == null) {
            return this.f36225b;
        }
        String value2 = firstHeader2.getValue();
        try {
            long parseLong = Long.parseLong(value2);
            if (parseLong >= 0) {
                return parseLong;
            }
            throw new ProtocolException("Negative content length: " + value2);
        } catch (NumberFormatException e) {
            throw new ProtocolException("Invalid content length: " + value2);
        }
    }
}
