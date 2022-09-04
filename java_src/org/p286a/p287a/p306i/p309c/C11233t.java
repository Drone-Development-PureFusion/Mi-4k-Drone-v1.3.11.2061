package org.p286a.p287a.p306i.p309c;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p299f.AbstractC11134i;
@AbstractC11008b
/* renamed from: org.a.a.i.c.t */
/* loaded from: classes2.dex */
public class C11233t extends C11220j {

    /* renamed from: a */
    private final ProxySelector f36161a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.a.a.i.c.t$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C112341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f36162a = new int[Proxy.Type.values().length];

        static {
            try {
                f36162a[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f36162a[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f36162a[Proxy.Type.SOCKS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public C11233t(ProxySelector proxySelector) {
        this(null, proxySelector);
    }

    public C11233t(AbstractC11134i abstractC11134i, ProxySelector proxySelector) {
        super(abstractC11134i);
        this.f36161a = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
    }

    /* renamed from: a */
    private String m1583a(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    /* renamed from: a */
    private Proxy m1582a(List<Proxy> list) {
        Proxy proxy = null;
        int i = 0;
        while (proxy == null && i < list.size()) {
            Proxy proxy2 = list.get(i);
            switch (C112341.f36162a[proxy2.type().ordinal()]) {
                case 1:
                case 2:
                    break;
                default:
                    proxy2 = proxy;
                    break;
            }
            i++;
            proxy = proxy2;
        }
        return proxy == null ? Proxy.NO_PROXY : proxy;
    }

    @Override // org.p286a.p287a.p306i.p309c.C11220j
    /* renamed from: a */
    protected HttpHost mo1581a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        try {
            Proxy m1582a = m1582a(this.f36161a.select(new URI(httpHost.toURI())));
            if (m1582a.type() != Proxy.Type.HTTP) {
                return null;
            }
            if (!(m1582a.address() instanceof InetSocketAddress)) {
                throw new HttpException("Unable to handle non-Inet proxy address: " + m1582a.address());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) m1582a.address();
            return new HttpHost(m1583a(inetSocketAddress), inetSocketAddress.getPort());
        } catch (URISyntaxException e) {
            throw new HttpException("Cannot convert host to URI: " + httpHost, e);
        }
    }
}
