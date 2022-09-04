package org.p286a.p287a.p306i.p311e;

import org.apache.http.HttpMessage;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;
import org.p286a.p287a.p288a.AbstractC11008b;
@AbstractC11008b
/* renamed from: org.a.a.i.e.a */
/* loaded from: classes2.dex */
public class C11276a implements ContentLengthStrategy {

    /* renamed from: a */
    public static final C11276a f36220a = new C11276a(new C11277b(0));

    /* renamed from: b */
    private final ContentLengthStrategy f36221b;

    public C11276a(ContentLengthStrategy contentLengthStrategy) {
        this.f36221b = contentLengthStrategy;
    }

    public long determineLength(HttpMessage httpMessage) {
        long determineLength = this.f36221b.determineLength(httpMessage);
        if (determineLength == -1) {
            throw new ProtocolException("Identity transfer encoding cannot be used");
        }
        return determineLength;
    }
}
