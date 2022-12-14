package org.p286a.p287a.p290c.p296f;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import org.apache.http.HttpHost;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11359f;
import p005b.p006a.p007a.p008a.p026n.C0363a;
import p005b.p006a.p007a.p029b.C0494h;
@AbstractC11008b
/* renamed from: org.a.a.c.f.i */
/* loaded from: classes.dex */
public class C11080i {
    private C11080i() {
    }

    @Deprecated
    /* renamed from: a */
    public static URI m2104a(String str, String str2, int i, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(C0494h.f680A);
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return new URI(sb.toString());
    }

    /* renamed from: a */
    public static URI m2103a(URI uri) {
        C11354a.m1321a(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        C11079h c11079h = new C11079h(uri);
        if (c11079h.m2116g() != null) {
            c11079h.m2129b((String) null);
        }
        if (C11359f.m1297a(c11079h.m2110j())) {
            c11079h.m2121d("/");
        }
        if (c11079h.m2114h() != null) {
            c11079h.m2125c(c11079h.m2114h().toLowerCase(Locale.ENGLISH));
        }
        c11079h.m2115g(null);
        return c11079h.m2138a();
    }

    /* renamed from: a */
    public static URI m2102a(URI uri, String str) {
        return m2101a(uri, URI.create(str));
    }

    /* renamed from: a */
    public static URI m2101a(URI uri, URI uri2) {
        C11354a.m1321a(uri, "Base URI");
        C11354a.m1321a(uri2, "Reference URI");
        String uri3 = uri2.toString();
        if (uri3.startsWith(C0363a.f360a)) {
            return m2096b(uri, uri2);
        }
        boolean z = uri3.length() == 0;
        if (z) {
            uri2 = URI.create("#");
        }
        URI resolve = uri.resolve(uri2);
        if (z) {
            String uri4 = resolve.toString();
            resolve = URI.create(uri4.substring(0, uri4.indexOf(35)));
        }
        return m2095c(resolve);
    }

    /* renamed from: a */
    public static URI m2100a(URI uri, HttpHost httpHost) {
        return m2098a(uri, httpHost, false);
    }

    /* renamed from: a */
    public static URI m2099a(URI uri, HttpHost httpHost, List<URI> list) {
        C11079h c11079h;
        C11354a.m1321a(uri, "Request URI");
        if (list == null || list.isEmpty()) {
            c11079h = new C11079h(uri);
        } else {
            C11079h c11079h2 = new C11079h(list.get(list.size() - 1));
            String m2106l = c11079h2.m2106l();
            int size = list.size() - 1;
            while (m2106l == null && size >= 0) {
                String fragment = list.get(size).getFragment();
                size--;
                m2106l = fragment;
            }
            c11079h2.m2115g(m2106l);
            c11079h = c11079h2;
        }
        if (c11079h.m2106l() == null) {
            c11079h.m2115g(uri.getFragment());
        }
        if (httpHost != null && !c11079h.m2122d()) {
            c11079h.m2136a(httpHost.getSchemeName());
            c11079h.m2125c(httpHost.getHostName());
            c11079h.m2137a(httpHost.getPort());
        }
        return c11079h.m2138a();
    }

    /* renamed from: a */
    public static URI m2098a(URI uri, HttpHost httpHost, boolean z) {
        C11354a.m1321a(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        C11079h c11079h = new C11079h(uri);
        if (httpHost != null) {
            c11079h.m2136a(httpHost.getSchemeName());
            c11079h.m2125c(httpHost.getHostName());
            c11079h.m2137a(httpHost.getPort());
        } else {
            c11079h.m2136a((String) null);
            c11079h.m2125c((String) null);
            c11079h.m2137a(-1);
        }
        if (z) {
            c11079h.m2115g(null);
        }
        if (C11359f.m1297a(c11079h.m2110j())) {
            c11079h.m2121d("/");
        }
        return c11079h.m2138a();
    }

    /* renamed from: b */
    private static URI m2096b(URI uri, URI uri2) {
        String uri3 = uri.toString();
        if (uri3.indexOf(63) > -1) {
            uri3 = uri3.substring(0, uri3.indexOf(63));
        }
        return URI.create(uri3 + uri2.toString());
    }

    /* renamed from: b */
    public static HttpHost m2097b(URI uri) {
        HttpHost httpHost;
        int indexOf;
        int i;
        if (uri == null) {
            return null;
        }
        if (uri.isAbsolute()) {
            int port = uri.getPort();
            String host = uri.getHost();
            if (host == null && (host = uri.getAuthority()) != null) {
                int indexOf2 = host.indexOf(64);
                String substring = indexOf2 >= 0 ? host.length() > indexOf2 + 1 ? host.substring(indexOf2 + 1) : null : host;
                if (substring == null || (indexOf = substring.indexOf(58)) < 0) {
                    host = substring;
                } else {
                    int i2 = indexOf + 1;
                    int i3 = 0;
                    for (int i4 = i2; i4 < substring.length() && Character.isDigit(substring.charAt(i4)); i4++) {
                        i3++;
                    }
                    if (i3 > 0) {
                        try {
                            i = Integer.parseInt(substring.substring(i2, i2 + i3));
                        } catch (NumberFormatException e) {
                            i = port;
                        }
                    } else {
                        i = port;
                    }
                    port = i;
                    host = substring.substring(0, indexOf);
                }
            }
            String scheme = uri.getScheme();
            if (!C11359f.m1296b(host)) {
                httpHost = new HttpHost(host, port, scheme);
                return httpHost;
            }
        }
        httpHost = null;
        return httpHost;
    }

    /* renamed from: c */
    private static URI m2095c(URI uri) {
        if (uri.isOpaque() || uri.getAuthority() == null) {
            return uri;
        }
        C11354a.m1319a(uri.isAbsolute(), "Base URI must be absolute");
        String path = uri.getPath() == null ? "" : uri.getPath();
        String[] split = path.split("/");
        Stack stack = new Stack();
        for (String str : split) {
            if (str.length() != 0 && !".".equals(str)) {
                if (!"..".equals(str)) {
                    stack.push(str);
                } else if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = stack.iterator();
        while (it2.hasNext()) {
            sb.append('/').append((String) it2.next());
        }
        if (path.lastIndexOf(47) == path.length() - 1) {
            sb.append('/');
        }
        try {
            URI uri2 = new URI(uri.getScheme().toLowerCase(Locale.ENGLISH), uri.getAuthority().toLowerCase(Locale.ENGLISH), sb.toString(), null, null);
            if (uri.getQuery() == null && uri.getFragment() == null) {
                return uri2;
            }
            StringBuilder sb2 = new StringBuilder(uri2.toASCIIString());
            if (uri.getQuery() != null) {
                sb2.append('?').append(uri.getRawQuery());
            }
            if (uri.getFragment() != null) {
                sb2.append('#').append(uri.getRawFragment());
            }
            return URI.create(sb2.toString());
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
