package com.google.android.gms.internal;

import com.google.android.gms.internal.C7669rq;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.internal.sp */
/* loaded from: classes2.dex */
public class C7699sp {

    /* renamed from: a */
    protected static final String f25532a = C7699sp.class.getSimpleName();

    /* renamed from: b */
    private final C7677rw f25533b;

    /* renamed from: c */
    private final String f25534c;

    /* renamed from: d */
    private final String f25535d;

    /* renamed from: g */
    private List<Class> f25538g;

    /* renamed from: e */
    private final int f25536e = 2;

    /* renamed from: f */
    private volatile Method f25537f = null;

    /* renamed from: h */
    private CountDownLatch f25539h = new CountDownLatch(1);

    public C7699sp(C7677rw c7677rw, String str, String str2, List<Class> list) {
        this.f25533b = c7677rw;
        this.f25534c = str;
        this.f25535d = str2;
        this.f25538g = new ArrayList(list);
        this.f25533b.m13717c().submit(new Runnable() { // from class: com.google.android.gms.internal.sp.1
            @Override // java.lang.Runnable
            public void run() {
                C7699sp.this.m13688b();
            }
        });
    }

    /* renamed from: a */
    private String m13689a(byte[] bArr, String str) {
        return new String(this.f25533b.m13715e().m13776a(bArr, str), "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m13688b() {
        try {
            Class loadClass = this.f25533b.m13716d().loadClass(m13689a(this.f25533b.m13714f(), this.f25534c));
            if (loadClass == null) {
                return;
            }
            this.f25537f = loadClass.getMethod(m13689a(this.f25533b.m13714f(), this.f25535d), (Class[]) this.f25538g.toArray(new Class[this.f25538g.size()]));
            if (this.f25537f != null) {
            }
        } catch (C7669rq.C7670a e) {
        } catch (UnsupportedEncodingException e2) {
        } catch (ClassNotFoundException e3) {
        } catch (NoSuchMethodException e4) {
        } catch (NullPointerException e5) {
        } finally {
            this.f25539h.countDown();
        }
    }

    /* renamed from: a */
    public Method m13691a() {
        if (this.f25537f != null) {
            return this.f25537f;
        }
        try {
            if (!this.f25539h.await(2L, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f25537f;
        } catch (InterruptedException e) {
            return null;
        }
    }
}
