package org.p286a.p287a.p290c.p292b;

import java.nio.charset.Charset;
import java.util.List;
import org.apache.http.NameValuePair;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p290c.p296f.C11081j;
import org.p286a.p287a.p305h.C11143e;
import org.p286a.p287a.p305h.C11148j;
@AbstractC11009c
/* renamed from: org.a.a.c.b.h */
/* loaded from: classes2.dex */
public class C11033h extends C11148j {
    public C11033h(Iterable<? extends NameValuePair> iterable) {
        this(iterable, (Charset) null);
    }

    public C11033h(Iterable<? extends NameValuePair> iterable, Charset charset) {
        super(C11081j.m2093a(iterable, charset != null ? charset : Charset.forName("ISO-8859-1")), C11143e.m1944a(C11081j.f35660a, charset));
    }

    public C11033h(List<? extends NameValuePair> list) {
        this(list, (Charset) null);
    }

    public C11033h(List<? extends NameValuePair> list, String str) {
        super(C11081j.m2085a(list, str != null ? str : Charset.forName("ISO-8859-1").name()), C11143e.m1945a(C11081j.f35660a, str));
    }
}
