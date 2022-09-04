package org.p286a.p287a.p306i.p308b;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import org.p286a.p287a.p290c.p296f.C11080i;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11357d;
@AbstractC11010d
/* renamed from: org.a.a.i.b.h */
/* loaded from: classes2.dex */
public abstract class AbstractC11186h implements Closeable, HttpClient {

    /* renamed from: a */
    private static final String f35993a = "HttpClient";

    /* renamed from: b */
    private static HttpHost m1766b(HttpUriRequest httpUriRequest) {
        HttpHost httpHost = null;
        URI uri = httpUriRequest.getURI();
        if (!uri.isAbsolute() || (httpHost = C11080i.m2097b(uri)) != null) {
            return httpHost;
        }
        throw new ClientProtocolException("URI does not specify a valid host name: " + uri);
    }

    /* renamed from: a */
    public AbstractC11038b execute(HttpHost httpHost, HttpRequest httpRequest) {
        return mo1661a(httpHost, httpRequest, null);
    }

    /* renamed from: a */
    protected abstract AbstractC11038b mo1661a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext);

    /* renamed from: a */
    public AbstractC11038b execute(HttpUriRequest httpUriRequest) {
        return execute(httpUriRequest, (HttpContext) null);
    }

    /* renamed from: a */
    public AbstractC11038b execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        C11354a.m1321a(httpUriRequest, "HTTP request");
        return mo1661a(m1766b(httpUriRequest), httpUriRequest, httpContext);
    }

    /* renamed from: b */
    public AbstractC11038b execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return mo1661a(httpHost, httpRequest, httpContext);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) execute(httpHost, httpRequest, responseHandler, null);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        C11354a.m1321a(responseHandler, "Response handler");
        AbstractC11038b execute = execute(httpHost, httpRequest, httpContext);
        try {
            T t = (T) responseHandler.handleResponse(execute);
            C11357d.m1303b(execute.getEntity());
            return t;
        } catch (Exception e) {
            try {
                C11357d.m1303b(execute.getEntity());
            } catch (Exception e2) {
                if (Log.isLoggable(f35993a, 5)) {
                    Log.w(f35993a, "Error consuming content after an exception.", e2);
                }
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            if (!(e instanceof IOException)) {
                throw new UndeclaredThrowableException(e);
            }
            throw ((IOException) e);
        }
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) execute(httpUriRequest, responseHandler, (HttpContext) null);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) execute(m1766b(httpUriRequest), httpUriRequest, responseHandler, httpContext);
    }
}
