package org.p286a.p287a.p316k;

import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.message.LineFormatter;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p299f.p302c.C11125l;
import org.p286a.p287a.p320o.C11354a;
import p005b.p006a.p007a.p029b.C0494h;
@AbstractC11008b
/* renamed from: org.a.a.k.c */
/* loaded from: classes.dex */
public class C11325c implements LineFormatter {
    @Deprecated

    /* renamed from: a */
    public static final C11325c f36375a = new C11325c();

    /* renamed from: b */
    public static final C11325c f36376b = new C11325c();

    /* renamed from: a */
    public static String m1445a(Header header, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = f36376b;
        }
        return lineFormatter.formatHeader((CharArrayBuffer) null, header).toString();
    }

    /* renamed from: a */
    public static String m1443a(ProtocolVersion protocolVersion, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = f36376b;
        }
        return lineFormatter.appendProtocolVersion((CharArrayBuffer) null, protocolVersion).toString();
    }

    /* renamed from: a */
    public static String m1442a(RequestLine requestLine, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = f36376b;
        }
        return lineFormatter.formatRequestLine((CharArrayBuffer) null, requestLine).toString();
    }

    /* renamed from: a */
    public static String m1441a(StatusLine statusLine, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = f36376b;
        }
        return lineFormatter.formatStatusLine((CharArrayBuffer) null, statusLine).toString();
    }

    /* renamed from: a */
    protected int m1444a(ProtocolVersion protocolVersion) {
        return protocolVersion.getProtocol().length() + 4;
    }

    /* renamed from: a */
    protected CharArrayBuffer m1440a(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer != null) {
            charArrayBuffer.clear();
            return charArrayBuffer;
        }
        return new CharArrayBuffer(64);
    }

    /* renamed from: a */
    protected void m1439a(CharArrayBuffer charArrayBuffer, Header header) {
        String name = header.getName();
        String value = header.getValue();
        int length = name.length() + 2;
        if (value != null) {
            length += value.length();
        }
        charArrayBuffer.ensureCapacity(length);
        charArrayBuffer.append(name);
        charArrayBuffer.append(": ");
        if (value != null) {
            charArrayBuffer.append(value);
        }
    }

    /* renamed from: a */
    protected void m1438a(CharArrayBuffer charArrayBuffer, RequestLine requestLine) {
        String method = requestLine.getMethod();
        String uri = requestLine.getUri();
        charArrayBuffer.ensureCapacity(method.length() + 1 + uri.length() + 1 + m1444a(requestLine.getProtocolVersion()));
        charArrayBuffer.append(method);
        charArrayBuffer.append((char) C11125l.f35805c);
        charArrayBuffer.append(uri);
        charArrayBuffer.append((char) C11125l.f35805c);
        appendProtocolVersion(charArrayBuffer, requestLine.getProtocolVersion());
    }

    /* renamed from: a */
    protected void m1437a(CharArrayBuffer charArrayBuffer, StatusLine statusLine) {
        int m1444a = m1444a(statusLine.getProtocolVersion()) + 1 + 3 + 1;
        String reasonPhrase = statusLine.getReasonPhrase();
        if (reasonPhrase != null) {
            m1444a += reasonPhrase.length();
        }
        charArrayBuffer.ensureCapacity(m1444a);
        appendProtocolVersion(charArrayBuffer, statusLine.getProtocolVersion());
        charArrayBuffer.append((char) C11125l.f35805c);
        charArrayBuffer.append(Integer.toString(statusLine.getStatusCode()));
        charArrayBuffer.append((char) C11125l.f35805c);
        if (reasonPhrase != null) {
            charArrayBuffer.append(reasonPhrase);
        }
    }

    public CharArrayBuffer appendProtocolVersion(CharArrayBuffer charArrayBuffer, ProtocolVersion protocolVersion) {
        C11354a.m1321a(protocolVersion, "Protocol version");
        int m1444a = m1444a(protocolVersion);
        if (charArrayBuffer == null) {
            charArrayBuffer = new CharArrayBuffer(m1444a);
        } else {
            charArrayBuffer.ensureCapacity(m1444a);
        }
        charArrayBuffer.append(protocolVersion.getProtocol());
        charArrayBuffer.append('/');
        charArrayBuffer.append(Integer.toString(protocolVersion.getMajor()));
        charArrayBuffer.append((char) C0494h.f686G);
        charArrayBuffer.append(Integer.toString(protocolVersion.getMinor()));
        return charArrayBuffer;
    }

    public CharArrayBuffer formatHeader(CharArrayBuffer charArrayBuffer, Header header) {
        C11354a.m1321a(header, "Header");
        if (header instanceof FormattedHeader) {
            return ((FormattedHeader) header).getBuffer();
        }
        CharArrayBuffer m1440a = m1440a(charArrayBuffer);
        m1439a(m1440a, header);
        return m1440a;
    }

    public CharArrayBuffer formatRequestLine(CharArrayBuffer charArrayBuffer, RequestLine requestLine) {
        C11354a.m1321a(requestLine, "Request line");
        CharArrayBuffer m1440a = m1440a(charArrayBuffer);
        m1438a(m1440a, requestLine);
        return m1440a;
    }

    public CharArrayBuffer formatStatusLine(CharArrayBuffer charArrayBuffer, StatusLine statusLine) {
        C11354a.m1321a(statusLine, "Status line");
        CharArrayBuffer m1440a = m1440a(charArrayBuffer);
        m1437a(m1440a, statusLine);
        return m1440a;
    }
}
