package org.p286a.p287a.p299f.p302c;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;
import org.p286a.p287a.p288a.AbstractC11008b;
@AbstractC11008b
/* renamed from: org.a.a.f.c.d */
/* loaded from: classes2.dex */
final class C11114d {

    /* renamed from: a */
    public static final C11114d f35776a = new C11114d();

    /* renamed from: b */
    private static final BitSet f35777b = C11125l.m1967a(61, 44, 43);

    /* renamed from: c */
    private static final BitSet f35778c = C11125l.m1967a(44, 43);

    /* renamed from: d */
    private final C11125l f35779d = new C11115a();

    /* renamed from: org.a.a.f.c.d$a */
    /* loaded from: classes2.dex */
    static class C11115a extends C11125l {
        C11115a() {
        }

        @Override // org.p286a.p287a.p299f.p302c.C11125l
        /* renamed from: a */
        public void mo1968a(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet, StringBuilder sb) {
            int pos = parserCursor.getPos();
            int pos2 = parserCursor.getPos();
            int upperBound = parserCursor.getUpperBound();
            int i = pos;
            int i2 = pos2;
            boolean z = false;
            while (i2 < upperBound) {
                char charAt = charArrayBuffer.charAt(i2);
                if (!z) {
                    if ((bitSet != null && bitSet.get(charAt)) || C11125l.m1972a(charAt) || charAt == '\"') {
                        break;
                    } else if (charAt == '\\') {
                        z = true;
                    } else {
                        sb.append(charAt);
                    }
                } else {
                    sb.append(charAt);
                    z = false;
                }
                i2++;
                i++;
            }
            parserCursor.updatePos(i);
        }
    }

    C11114d() {
    }

    /* renamed from: a */
    String m1999a(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet) {
        return this.f35779d.m1969a(charArrayBuffer, parserCursor, bitSet);
    }

    /* renamed from: a */
    public List<NameValuePair> m2001a(String str) {
        if (str == null) {
            return null;
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return m1998b(charArrayBuffer, new ParserCursor(0, str.length()));
    }

    /* renamed from: a */
    NameValuePair m2000a(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        String m1999a = m1999a(charArrayBuffer, parserCursor, f35777b);
        if (parserCursor.atEnd()) {
            return new BasicNameValuePair(m1999a, (String) null);
        }
        char charAt = charArrayBuffer.charAt(parserCursor.getPos());
        parserCursor.updatePos(parserCursor.getPos() + 1);
        if (charAt == ',') {
            return new BasicNameValuePair(m1999a, (String) null);
        }
        String m1997b = m1997b(charArrayBuffer, parserCursor, f35778c);
        if (!parserCursor.atEnd()) {
            parserCursor.updatePos(parserCursor.getPos() + 1);
        }
        return new BasicNameValuePair(m1999a, m1997b);
    }

    /* renamed from: b */
    String m1997b(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor, BitSet bitSet) {
        return this.f35779d.m1966b(charArrayBuffer, parserCursor, bitSet);
    }

    /* renamed from: b */
    public List<NameValuePair> m1998b(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        ArrayList arrayList = new ArrayList();
        this.f35779d.m1971a(charArrayBuffer, parserCursor);
        while (!parserCursor.atEnd()) {
            arrayList.add(m2000a(charArrayBuffer, parserCursor));
        }
        return arrayList;
    }
}
