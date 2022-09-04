package org.p286a.p287a.p306i.p308b;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11357d;
@AbstractC11008b
/* renamed from: org.a.a.i.b.f */
/* loaded from: classes2.dex */
public class C11184f implements ResponseHandler<String> {
    /* renamed from: a */
    public String handleResponse(HttpResponse httpResponse) {
        StatusLine statusLine = httpResponse.getStatusLine();
        HttpEntity entity = httpResponse.getEntity();
        if (statusLine.getStatusCode() >= 300) {
            C11357d.m1303b(entity);
            throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
        } else if (entity != null) {
            return C11357d.m1299f(entity);
        } else {
            return null;
        }
    }
}
