package org.p286a.p287a.p306i.p313g;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.C11096f;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p298e.C11090c;
import org.p286a.p287a.p299f.p302c.C11125l;
import org.p286a.p287a.p316k.C11326d;
import org.p286a.p287a.p317l.C11327a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.g.a */
/* loaded from: classes.dex */
public abstract class AbstractC11295a<T extends HttpMessage> implements HttpMessageParser {

    /* renamed from: b */
    private static final int f36279b = 0;

    /* renamed from: c */
    private static final int f36280c = 1;

    /* renamed from: a */
    protected final LineParser f36281a;

    /* renamed from: d */
    private final SessionInputBuffer f36282d;

    /* renamed from: e */
    private final C11090c f36283e;

    /* renamed from: f */
    private final List<CharArrayBuffer> f36284f;

    /* renamed from: g */
    private int f36285g;

    /* renamed from: h */
    private T f36286h;

    public AbstractC11295a(SessionInputBuffer sessionInputBuffer, LineParser lineParser, C11090c c11090c) {
        this.f36282d = (SessionInputBuffer) C11354a.m1321a(sessionInputBuffer, "Session input buffer");
        this.f36281a = lineParser == null ? C11326d.f36378b : lineParser;
        this.f36283e = c11090c == null ? C11090c.f35747a : c11090c;
        this.f36284f = new ArrayList();
        this.f36285g = 0;
    }

    @Deprecated
    public AbstractC11295a(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpParams httpParams) {
        C11354a.m1321a(sessionInputBuffer, "Session input buffer");
        C11354a.m1321a(httpParams, "HTTP parameters");
        this.f36282d = sessionInputBuffer;
        this.f36283e = C11327a.m1427b(httpParams);
        this.f36281a = lineParser == null ? C11326d.f36378b : lineParser;
        this.f36284f = new ArrayList();
        this.f36285g = 0;
    }

    /* renamed from: a */
    public static Header[] m1507a(SessionInputBuffer sessionInputBuffer, int i, int i2, LineParser lineParser) {
        ArrayList arrayList = new ArrayList();
        if (lineParser == null) {
            lineParser = C11326d.f36378b;
        }
        return m1506a(sessionInputBuffer, i, i2, lineParser, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x002e, code lost:
        r1 = new org.apache.http.Header[r13.size()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0038, code lost:
        if (r2 >= r13.size()) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0040, code lost:
        r1[r2] = r12.parseHeader(r13.get(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0046, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
        throw new org.apache.http.ProtocolException(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
        return r1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Header[] m1506a(SessionInputBuffer sessionInputBuffer, int i, int i2, LineParser lineParser, List<CharArrayBuffer> list) {
        CharArrayBuffer charArrayBuffer;
        char charAt;
        int i3 = 0;
        C11354a.m1321a(sessionInputBuffer, "Session input buffer");
        C11354a.m1321a(lineParser, "Line parser");
        C11354a.m1321a(list, "Header line list");
        CharArrayBuffer charArrayBuffer2 = null;
        CharArrayBuffer charArrayBuffer3 = null;
        while (true) {
            if (charArrayBuffer3 == null) {
                charArrayBuffer3 = new CharArrayBuffer(64);
            } else {
                charArrayBuffer3.clear();
            }
            if (sessionInputBuffer.readLine(charArrayBuffer3) == -1 || charArrayBuffer3.length() < 1) {
                break;
            }
            if ((charArrayBuffer3.charAt(0) == ' ' || charArrayBuffer3.charAt(0) == '\t') && charArrayBuffer2 != null) {
                int i4 = 0;
                while (i4 < charArrayBuffer3.length() && ((charAt = charArrayBuffer3.charAt(i4)) == ' ' || charAt == '\t')) {
                    i4++;
                }
                if (i2 > 0 && ((charArrayBuffer2.length() + 1) + charArrayBuffer3.length()) - i4 > i2) {
                    throw new C11096f("Maximum line length limit exceeded");
                }
                charArrayBuffer2.append((char) C11125l.f35805c);
                charArrayBuffer2.append(charArrayBuffer3, i4, charArrayBuffer3.length() - i4);
                charArrayBuffer = charArrayBuffer3;
                charArrayBuffer3 = charArrayBuffer2;
            } else {
                list.add(charArrayBuffer3);
                charArrayBuffer = null;
            }
            if (i > 0 && list.size() >= i) {
                throw new C11096f("Maximum header count exceeded");
            }
            charArrayBuffer2 = charArrayBuffer3;
            charArrayBuffer3 = charArrayBuffer;
        }
    }

    /* renamed from: b */
    protected abstract T mo1495b(SessionInputBuffer sessionInputBuffer);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public T parse() {
        switch (this.f36285g) {
            case 0:
                try {
                    this.f36286h = mo1495b(this.f36282d);
                    this.f36285g = 1;
                    break;
                } catch (ParseException e) {
                    throw new ProtocolException(e.getMessage(), e);
                }
            case 1:
                break;
            default:
                throw new IllegalStateException("Inconsistent parser state");
        }
        this.f36286h.setHeaders(m1506a(this.f36282d, this.f36283e.m2049b(), this.f36283e.m2052a(), this.f36281a, this.f36284f));
        T t = this.f36286h;
        this.f36286h = null;
        this.f36284f.clear();
        this.f36285g = 0;
        return t;
    }
}
