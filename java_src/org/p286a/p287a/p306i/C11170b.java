package org.p286a.p287a.p306i;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import org.p286a.p287a.p298e.C11087a;
/* renamed from: org.a.a.i.b */
/* loaded from: classes2.dex */
public final class C11170b {
    /* renamed from: a */
    public static CharsetDecoder m1806a(C11087a c11087a) {
        if (c11087a == null) {
            return null;
        }
        Charset m2065c = c11087a.m2065c();
        CodingErrorAction m2064d = c11087a.m2064d();
        CodingErrorAction m2063e = c11087a.m2063e();
        if (m2065c == null) {
            return null;
        }
        CharsetDecoder newDecoder = m2065c.newDecoder();
        if (m2064d == null) {
            m2064d = CodingErrorAction.REPORT;
        }
        return newDecoder.onMalformedInput(m2064d).onUnmappableCharacter(m2063e != null ? m2063e : CodingErrorAction.REPORT);
    }

    /* renamed from: b */
    public static CharsetEncoder m1805b(C11087a c11087a) {
        Charset m2065c;
        if (c11087a == null || (m2065c = c11087a.m2065c()) == null) {
            return null;
        }
        CodingErrorAction m2064d = c11087a.m2064d();
        CodingErrorAction m2063e = c11087a.m2063e();
        CharsetEncoder newEncoder = m2065c.newEncoder();
        if (m2064d == null) {
            m2064d = CodingErrorAction.REPORT;
        }
        return newEncoder.onMalformedInput(m2064d).onUnmappableCharacter(m2063e != null ? m2063e : CodingErrorAction.REPORT);
    }
}
