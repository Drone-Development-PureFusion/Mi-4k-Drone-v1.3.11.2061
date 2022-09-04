package org.p286a.p287a.p306i.p311e;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.e.b */
/* loaded from: classes2.dex */
public class C11277b implements ContentLengthStrategy {

    /* renamed from: a */
    public static final C11277b f36222a = new C11277b();

    /* renamed from: b */
    private final int f36223b;

    public C11277b() {
        this(-1);
    }

    public C11277b(int i) {
        this.f36223b = i;
    }

    public long determineLength(HttpMessage httpMessage) {
        long j;
        C11354a.m1321a(httpMessage, "HTTP message");
        Header firstHeader = httpMessage.getFirstHeader(C11086e.f35701W);
        if (firstHeader != null) {
            try {
                HeaderElement[] elements = firstHeader.getElements();
                int length = elements.length;
                return (!"identity".equalsIgnoreCase(firstHeader.getValue()) && length > 0 && "chunked".equalsIgnoreCase(elements[length + (-1)].getName())) ? -2L : -1L;
            } catch (ParseException e) {
                throw new ProtocolException("Invalid Transfer-Encoding header value: " + firstHeader, e);
            }
        } else if (httpMessage.getFirstHeader("Content-Length") == null) {
            return this.f36223b;
        } else {
            Header[] headers = httpMessage.getHeaders("Content-Length");
            int length2 = headers.length - 1;
            while (true) {
                if (length2 < 0) {
                    j = -1;
                    break;
                }
                try {
                    j = Long.parseLong(headers[length2].getValue());
                    break;
                } catch (NumberFormatException e2) {
                    length2--;
                }
            }
            if (j < 0) {
                return -1L;
            }
            return j;
        }
    }
}
