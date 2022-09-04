package org.p286a.p287a.p305h;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;
import org.p286a.p287a.p288a.AbstractC11009c;
@AbstractC11009c
/* renamed from: org.a.a.h.a */
/* loaded from: classes.dex */
public abstract class AbstractC11139a implements HttpEntity {

    /* renamed from: a */
    protected static final int f35818a = 4096;

    /* renamed from: b */
    protected Header f35819b;

    /* renamed from: c */
    protected Header f35820c;

    /* renamed from: d */
    protected boolean f35821d;

    /* renamed from: a */
    public void m1954a(String str) {
        BasicHeader basicHeader = null;
        if (str != null) {
            basicHeader = new BasicHeader("Content-Type", str);
        }
        m1953a((Header) basicHeader);
    }

    /* renamed from: a */
    public void m1953a(Header header) {
        this.f35819b = header;
    }

    /* renamed from: a */
    public void m1952a(boolean z) {
        this.f35821d = z;
    }

    /* renamed from: b */
    public void m1951b(String str) {
        BasicHeader basicHeader = null;
        if (str != null) {
            basicHeader = new BasicHeader("Content-Encoding", str);
        }
        m1950b((Header) basicHeader);
    }

    /* renamed from: b */
    public void m1950b(Header header) {
        this.f35820c = header;
    }

    @Deprecated
    public void consumeContent() {
    }

    public Header getContentEncoding() {
        return this.f35820c;
    }

    public Header getContentType() {
        return this.f35819b;
    }

    public boolean isChunked() {
        return this.f35821d;
    }
}
