package org.p328c.p337b.p341d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.p328c.p337b.C11503b;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p349b.C11608a;
import org.p328c.p347e.p349b.C11611c;
@Deprecated
/* renamed from: org.c.b.d.a */
/* loaded from: classes.dex */
public class C11513a {

    /* renamed from: a */
    private C11611c f36621a;

    /* renamed from: b */
    private C11554j f36622b;

    /* renamed from: c */
    private C11622c f36623c;

    /* renamed from: d */
    private final Runnable f36624d;

    public C11513a(C11611c c11611c, C11554j c11554j, C11622c c11622c, Runnable runnable) {
        this.f36621a = c11611c;
        this.f36622b = c11554j;
        this.f36623c = c11622c;
        this.f36624d = runnable;
    }

    /* renamed from: c */
    private void m890c() {
        try {
            try {
                for (Method method : this.f36622b.m796b()) {
                    method.invoke(null, new Object[0]);
                }
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        } catch (C11503b e2) {
            throw new C11531c();
        } catch (Throwable th) {
            m892a(th);
            throw new C11531c();
        }
    }

    /* renamed from: d */
    private void m889d() {
        for (Method method : this.f36622b.m794c()) {
            try {
                method.invoke(null, new Object[0]);
            } catch (InvocationTargetException e) {
                m892a(e.getTargetException());
            } catch (Throwable th) {
                m892a(th);
            }
        }
    }

    /* renamed from: a */
    protected void m893a() {
        this.f36624d.run();
    }

    /* renamed from: a */
    protected void m892a(Throwable th) {
        this.f36621a.m568a(new C11608a(this.f36623c, th));
    }

    /* renamed from: b */
    public void m891b() {
        try {
            m890c();
            m893a();
        } catch (C11531c e) {
        } finally {
            m889d();
        }
    }
}
