package com.xiaomi.mistatistic.sdk;

import com.xiaomi.mistatistic.sdk.controller.C10529j;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
/* loaded from: classes2.dex */
public class MIStatsHttpClientHelper {
    /* renamed from: a */
    private static int m4903a(Object obj) {
        StatusLine statusLine;
        if (!(obj instanceof HttpResponse) || (statusLine = ((HttpResponse) obj).getStatusLine()) == null) {
            return 0;
        }
        return statusLine.getStatusCode();
    }

    public static Object execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        String str = httpHost.toURI().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object execute = httpClient.execute(httpHost, httpRequest, responseHandler);
            C10529j.m4837a().m4834a(new HttpEvent(str, System.currentTimeMillis() - currentTimeMillis, m4903a(execute), (String) null));
            return execute;
        } catch (IOException e) {
            C10529j.m4837a().m4834a(new HttpEvent(str, e.getClass().getSimpleName()));
            throw e;
        }
    }

    public static Object execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        String str = httpHost.toURI().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object execute = httpClient.execute(httpHost, httpRequest, responseHandler, httpContext);
            C10529j.m4837a().m4834a(new HttpEvent(str, System.currentTimeMillis() - currentTimeMillis, m4903a(execute), (String) null));
            return execute;
        } catch (ClientProtocolException e) {
            C10529j.m4837a().m4834a(new HttpEvent(str, e.getClass().getSimpleName()));
            throw e;
        } catch (IOException e2) {
            C10529j.m4837a().m4834a(new HttpEvent(str, e2.getClass().getSimpleName()));
            throw e2;
        }
    }

    public static Object execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        String uri = httpUriRequest.getURI().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object execute = httpClient.execute(httpUriRequest, responseHandler);
            C10529j.m4837a().m4834a(new HttpEvent(uri, System.currentTimeMillis() - currentTimeMillis, m4903a(execute), (String) null));
            return execute;
        } catch (IOException e) {
            C10529j.m4837a().m4834a(new HttpEvent(uri, e.getClass().getSimpleName()));
            throw e;
        }
    }

    public static Object execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        String url = httpUriRequest.getURI().toURL().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object execute = httpClient.execute(httpUriRequest, responseHandler, httpContext);
            C10529j.m4837a().m4834a(new HttpEvent(url, System.currentTimeMillis() - currentTimeMillis, m4903a(execute), (String) null));
            return execute;
        } catch (IOException e) {
            C10529j.m4837a().m4834a(new HttpEvent(url, e.getClass().getSimpleName()));
            throw e;
        } catch (ClientProtocolException e2) {
            C10529j.m4837a().m4834a(new HttpEvent(url, e2.getClass().getSimpleName()));
            throw e2;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        String str = httpHost.toURI().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            C10529j.m4837a().m4834a(new HttpEvent(str, System.currentTimeMillis() - currentTimeMillis, m4903a(execute), (String) null));
            return execute;
        } catch (IOException e) {
            C10529j.m4837a().m4834a(new HttpEvent(str, e.getClass().getSimpleName()));
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        String str = httpHost.toURI().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            C10529j.m4837a().m4834a(new HttpEvent(str, System.currentTimeMillis() - currentTimeMillis, m4903a(execute), (String) null));
            return execute;
        } catch (IOException e) {
            C10529j.m4837a().m4834a(new HttpEvent(str, e.getClass().getSimpleName()));
            throw e;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        String url = httpUriRequest.getURI().toURL().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HttpResponse execute = httpClient.execute(httpUriRequest);
            C10529j.m4837a().m4834a(new HttpEvent(url, System.currentTimeMillis() - currentTimeMillis, m4903a(execute), (String) null));
            return execute;
        } catch (IOException e) {
            C10529j.m4837a().m4834a(new HttpEvent(url, e.getClass().getSimpleName()));
            throw e;
        } catch (ClientProtocolException e2) {
            C10529j.m4837a().m4834a(new HttpEvent(url, e2.getClass().getSimpleName()));
            throw e2;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        String uri = httpUriRequest.getURI().toString();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            C10529j.m4837a().m4834a(new HttpEvent(uri, System.currentTimeMillis() - currentTimeMillis, m4903a(execute), (String) null));
            return execute;
        } catch (IOException e) {
            C10529j.m4837a().m4834a(new HttpEvent(uri, e.getClass().getSimpleName()));
            throw e;
        }
    }
}
