package org.p286a.p287a.p306i.p309c;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.conn.routing.HttpRoute;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p298e.C11087a;
import org.p286a.p287a.p299f.AbstractC11130e;
import org.p286a.p287a.p299f.AbstractC11133h;
import org.p286a.p287a.p306i.p313g.C11304j;
import org.p286a.p287a.p315j.AbstractC11321b;
import org.p286a.p287a.p315j.AbstractC11322c;
@AbstractC11008b
/* renamed from: org.a.a.i.c.q */
/* loaded from: classes2.dex */
public class C11227q implements AbstractC11130e<HttpRoute, AbstractC11133h> {

    /* renamed from: c */
    private final AbstractC11322c<HttpRequest> f36145c;

    /* renamed from: d */
    private final AbstractC11321b<HttpResponse> f36146d;

    /* renamed from: b */
    private static final AtomicLong f36144b = new AtomicLong();

    /* renamed from: a */
    public static final C11227q f36143a = new C11227q();

    public C11227q() {
        this(null, null);
    }

    public C11227q(AbstractC11321b<HttpResponse> abstractC11321b) {
        this(null, abstractC11321b);
    }

    public C11227q(AbstractC11322c<HttpRequest> abstractC11322c, AbstractC11321b<HttpResponse> abstractC11321b) {
        this.f36145c = abstractC11322c == null ? C11304j.f36321a : abstractC11322c;
        this.f36146d = abstractC11321b == null ? C11217g.f36120a : abstractC11321b;
    }

    @Override // org.p286a.p287a.p299f.AbstractC11130e
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public AbstractC11133h mo1620a(HttpRoute httpRoute, C11087a c11087a) {
        CharsetEncoder charsetEncoder;
        CharsetDecoder charsetDecoder;
        if (c11087a == null) {
            c11087a = C11087a.f35734a;
        }
        Charset m2065c = c11087a.m2065c();
        CodingErrorAction m2064d = c11087a.m2064d() != null ? c11087a.m2064d() : CodingErrorAction.REPORT;
        CodingErrorAction m2063e = c11087a.m2063e() != null ? c11087a.m2063e() : CodingErrorAction.REPORT;
        if (m2065c != null) {
            charsetDecoder = m2065c.newDecoder();
            charsetDecoder.onMalformedInput(m2064d);
            charsetDecoder.onUnmappableCharacter(m2063e);
            charsetEncoder = m2065c.newEncoder();
            charsetEncoder.onMalformedInput(m2064d);
            charsetEncoder.onUnmappableCharacter(m2063e);
        } else {
            charsetEncoder = null;
            charsetDecoder = null;
        }
        return new C11225o("http-outgoing-" + Long.toString(f36144b.getAndIncrement()), c11087a.m2068a(), c11087a.m2066b(), charsetDecoder, charsetEncoder, c11087a.m2062f(), null, null, this.f36145c, this.f36146d);
    }
}
