package org.p328c.p337b.p341d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.p328c.p337b.C11503b;
import org.p328c.p347e.C11622c;
import org.p328c.p347e.p349b.C11608a;
import org.p328c.p347e.p349b.C11611c;
import org.p328c.p350f.p351a.C11655l;
@Deprecated
/* renamed from: org.c.b.d.g */
/* loaded from: classes.dex */
public class C11548g {

    /* renamed from: a */
    private final Object f36669a;

    /* renamed from: b */
    private final C11611c f36670b;

    /* renamed from: c */
    private final C11622c f36671c;

    /* renamed from: d */
    private C11555k f36672d;

    public C11548g(Object obj, C11555k c11555k, C11611c c11611c, C11622c c11622c) {
        this.f36669a = obj;
        this.f36670b = c11611c;
        this.f36671c = c11622c;
        this.f36672d = c11555k;
    }

    /* renamed from: a */
    private void m814a(final long j) {
        m813a(new Runnable() { // from class: org.c.b.d.g.1
            @Override // java.lang.Runnable
            public void run() {
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Future submit = newSingleThreadExecutor.submit(new Callable<Object>() { // from class: org.c.b.d.g.1.1
                    @Override // java.util.concurrent.Callable
                    public Object call() {
                        C11548g.this.m810c();
                        return null;
                    }
                });
                newSingleThreadExecutor.shutdown();
                try {
                    if (!newSingleThreadExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        newSingleThreadExecutor.shutdownNow();
                    }
                    submit.get(0L, TimeUnit.MILLISECONDS);
                } catch (TimeoutException e) {
                    C11548g.this.m812a(new C11655l(j, TimeUnit.MILLISECONDS));
                } catch (Exception e2) {
                    C11548g.this.m812a(e2);
                }
            }
        });
    }

    /* renamed from: d */
    private void m809d() {
        try {
            try {
                for (Method method : this.f36672d.m783e()) {
                    method.invoke(this.f36669a, new Object[0]);
                }
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        } catch (C11503b e2) {
            throw new C11531c();
        } catch (Throwable th) {
            m812a(th);
            throw new C11531c();
        }
    }

    /* renamed from: e */
    private void m808e() {
        for (Method method : this.f36672d.m782f()) {
            try {
                method.invoke(this.f36669a, new Object[0]);
            } catch (InvocationTargetException e) {
                m812a(e.getTargetException());
            } catch (Throwable th) {
                m812a(th);
            }
        }
    }

    /* renamed from: a */
    public void m815a() {
        if (this.f36672d.m789a()) {
            this.f36670b.m558c(this.f36671c);
            return;
        }
        this.f36670b.m560b(this.f36671c);
        try {
            long m786b = this.f36672d.m786b();
            if (m786b > 0) {
                m814a(m786b);
            } else {
                m811b();
            }
        } finally {
            this.f36670b.m556d(this.f36671c);
        }
    }

    /* renamed from: a */
    public void m813a(Runnable runnable) {
        try {
            try {
                m809d();
                runnable.run();
                m808e();
            } catch (C11531c e) {
                m808e();
            } catch (Exception e2) {
                throw new RuntimeException("test should never throw an exception to this level");
            }
        } catch (Throwable th) {
            m808e();
            throw th;
        }
    }

    /* renamed from: a */
    protected void m812a(Throwable th) {
        this.f36670b.m568a(new C11608a(this.f36671c, th));
    }

    /* renamed from: b */
    public void m811b() {
        m813a(new Runnable() { // from class: org.c.b.d.g.2
            @Override // java.lang.Runnable
            public void run() {
                C11548g.this.m810c();
            }
        });
    }

    /* renamed from: c */
    protected void m810c() {
        try {
            this.f36672d.m788a(this.f36669a);
            if (!this.f36672d.m784d()) {
                return;
            }
            m812a(new AssertionError("Expected exception: " + this.f36672d.m785c().getName()));
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof C11503b) {
                return;
            }
            if (!this.f36672d.m784d()) {
                m812a(targetException);
            } else if (!this.f36672d.m787a(targetException)) {
            } else {
                m812a(new Exception("Unexpected exception, expected<" + this.f36672d.m785c().getName() + "> but was<" + targetException.getClass().getName() + ">", targetException));
            }
        } catch (Throwable th) {
            m812a(th);
        }
    }
}
