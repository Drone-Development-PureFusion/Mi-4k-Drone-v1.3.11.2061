package org.p286a.p287a.p290c.p295e;

import com.baidu.tts.loopj.AsyncHttpClient;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.p292b.C11026b;
import org.p286a.p287a.p290c.p292b.C11031f;
@AbstractC11008b
/* renamed from: org.a.a.c.e.h */
/* loaded from: classes2.dex */
public class C11067h implements HttpResponseInterceptor {

    /* renamed from: a */
    public static final String f35626a = "http.client.response.uncompressed";

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        Header contentEncoding;
        HeaderElement headerElement;
        boolean z = true;
        HttpEntity entity = httpResponse.getEntity();
        if (entity == null || entity.getContentLength() == 0 || (contentEncoding = entity.getContentEncoding()) == null) {
            return;
        }
        HeaderElement[] elements = contentEncoding.getElements();
        if (0 < elements.length) {
            String lowerCase = elements[0].getName().toLowerCase(Locale.ENGLISH);
            if (AsyncHttpClient.ENCODING_GZIP.equals(lowerCase) || "x-gzip".equals(lowerCase)) {
                httpResponse.setEntity(new C11031f(httpResponse.getEntity()));
            } else if (!"deflate".equals(lowerCase)) {
                if ("identity".equals(lowerCase)) {
                    return;
                }
                throw new HttpException("Unsupported Content-Coding: " + headerElement.getName());
            } else {
                httpResponse.setEntity(new C11026b(httpResponse.getEntity()));
            }
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        httpResponse.removeHeaders("Content-Length");
        httpResponse.removeHeaders("Content-Encoding");
        httpResponse.removeHeaders("Content-MD5");
    }
}
