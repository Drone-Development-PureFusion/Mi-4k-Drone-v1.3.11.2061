package org.p286a.p287a.p306i.p308b;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpRequest;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.p293c.C11044h;
import org.p286a.p287a.p290c.p293c.C11045i;
import org.p286a.p287a.p290c.p293c.C11048l;
import org.p286a.p287a.p290c.p293c.C11053o;
@AbstractC11008b
/* renamed from: org.a.a.i.b.ae */
/* loaded from: classes2.dex */
public class C11176ae extends C11190l {

    /* renamed from: b */
    private final Map<String, Boolean> f35981b;

    public C11176ae() {
        this(3, false);
    }

    public C11176ae(int i, boolean z) {
        super(i, z);
        this.f35981b = new ConcurrentHashMap();
        this.f35981b.put("GET", Boolean.TRUE);
        this.f35981b.put(C11044h.f35585a, Boolean.TRUE);
        this.f35981b.put(C11048l.f35589a, Boolean.TRUE);
        this.f35981b.put("DELETE", Boolean.TRUE);
        this.f35981b.put(C11045i.f35586a, Boolean.TRUE);
        this.f35981b.put(C11053o.f35598a, Boolean.TRUE);
    }

    @Override // org.p286a.p287a.p306i.p308b.C11190l
    /* renamed from: a */
    protected boolean mo1760a(HttpRequest httpRequest) {
        Boolean bool = this.f35981b.get(httpRequest.getRequestLine().getMethod().toUpperCase(Locale.ENGLISH));
        return bool != null && bool.booleanValue();
    }
}
