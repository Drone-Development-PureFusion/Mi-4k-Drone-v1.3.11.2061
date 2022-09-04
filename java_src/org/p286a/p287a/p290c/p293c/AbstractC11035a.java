package org.p286a.p287a.p290c.p293c;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpRequest;
import org.apache.http.client.methods.AbortableHttpRequest;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.HttpParams;
import org.p286a.p287a.p290c.p296f.C11070a;
import org.p286a.p287a.p297d.AbstractC11084b;
/* renamed from: org.a.a.c.c.a */
/* loaded from: classes.dex */
public abstract class AbstractC11035a extends AbstractHttpMessage implements Cloneable, AbstractC11042f, HttpRequest, AbortableHttpRequest {

    /* renamed from: a */
    private final AtomicBoolean f35576a = new AtomicBoolean(false);

    /* renamed from: b */
    private final AtomicReference<AbstractC11084b> f35577b = new AtomicReference<>(null);

    /* renamed from: a */
    public void m2233a() {
        this.f35577b.set(null);
    }

    @Override // org.p286a.p287a.p290c.p293c.AbstractC11042f
    /* renamed from: a */
    public void mo2231a(AbstractC11084b abstractC11084b) {
        if (!this.f35576a.get()) {
            this.f35577b.set(abstractC11084b);
        }
    }

    public void abort() {
        AbstractC11084b andSet;
        if (!this.f35576a.compareAndSet(false, true) || (andSet = this.f35577b.getAndSet(null)) == null) {
            return;
        }
        andSet.mo1532a();
    }

    /* renamed from: b */
    public void m2232b() {
        AbstractC11084b andSet = this.f35577b.getAndSet(null);
        if (andSet != null) {
            andSet.mo1532a();
        }
        this.f35576a.set(false);
    }

    public Object clone() {
        AbstractC11035a abstractC11035a = (AbstractC11035a) super.clone();
        abstractC11035a.headergroup = (HeaderGroup) C11070a.m2157a(this.headergroup);
        abstractC11035a.params = (HttpParams) C11070a.m2157a(this.params);
        return abstractC11035a;
    }

    @Override // org.p286a.p287a.p290c.p293c.AbstractC11042f
    public boolean isAborted() {
        return this.f35576a.get();
    }

    @Deprecated
    public void setConnectionRequest(final ClientConnectionRequest clientConnectionRequest) {
        mo2231a(new AbstractC11084b() { // from class: org.a.a.c.c.a.1
            @Override // org.p286a.p287a.p297d.AbstractC11084b
            /* renamed from: a */
            public boolean mo1532a() {
                clientConnectionRequest.abortRequest();
                return true;
            }
        });
    }

    @Deprecated
    public void setReleaseTrigger(final ConnectionReleaseTrigger connectionReleaseTrigger) {
        mo2231a(new AbstractC11084b() { // from class: org.a.a.c.c.a.2
            @Override // org.p286a.p287a.p297d.AbstractC11084b
            /* renamed from: a */
            public boolean mo1532a() {
                try {
                    connectionReleaseTrigger.abortConnection();
                    return true;
                } catch (IOException e) {
                    return false;
                }
            }
        });
    }
}
