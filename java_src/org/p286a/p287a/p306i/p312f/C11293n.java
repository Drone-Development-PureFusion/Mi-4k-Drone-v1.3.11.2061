package org.p286a.p287a.p306i.p312f;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.p286a.p287a.p288a.AbstractC11008b;
@AbstractC11008b
/* renamed from: org.a.a.i.f.n */
/* loaded from: classes2.dex */
public class C11293n extends HttpException {
    private static final long serialVersionUID = -8646722842745617323L;

    /* renamed from: a */
    private final HttpResponse f36277a;

    public C11293n(String str, HttpResponse httpResponse) {
        super(str);
        this.f36277a = httpResponse;
    }

    /* renamed from: a */
    public HttpResponse m1510a() {
        return this.f36277a;
    }
}
