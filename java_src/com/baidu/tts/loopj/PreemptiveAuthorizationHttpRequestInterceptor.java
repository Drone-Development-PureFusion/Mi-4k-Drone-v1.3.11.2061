package com.baidu.tts.loopj;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p319n.C11344c;
/* loaded from: classes.dex */
public class PreemptiveAuthorizationHttpRequestInterceptor implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        Credentials credentials;
        AuthState authState = (AuthState) httpContext.getAttribute(C11060a.f35616i);
        CredentialsProvider credentialsProvider = (CredentialsProvider) httpContext.getAttribute(C11060a.f35614g);
        HttpHost httpHost = (HttpHost) httpContext.getAttribute(C11344c.f36428q);
        if (authState.getAuthScheme() != null || (credentials = credentialsProvider.getCredentials(new AuthScope(httpHost.getHostName(), httpHost.getPort()))) == null) {
            return;
        }
        authState.setAuthScheme(new BasicScheme());
        authState.setCredentials(credentials);
    }
}
