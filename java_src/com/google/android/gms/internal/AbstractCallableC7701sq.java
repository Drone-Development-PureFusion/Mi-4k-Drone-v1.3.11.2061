package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC6830df;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* renamed from: com.google.android.gms.internal.sq */
/* loaded from: classes2.dex */
public abstract class AbstractCallableC7701sq implements Callable {

    /* renamed from: a */
    protected final String f25541a = getClass().getSimpleName();

    /* renamed from: b */
    protected final C7677rw f25542b;

    /* renamed from: c */
    protected final String f25543c;

    /* renamed from: d */
    protected final String f25544d;

    /* renamed from: e */
    protected final AbstractC6830df.C6831a f25545e;

    /* renamed from: f */
    protected Method f25546f;

    /* renamed from: g */
    protected final int f25547g;

    /* renamed from: h */
    protected final int f25548h;

    public AbstractCallableC7701sq(C7677rw c7677rw, String str, String str2, AbstractC6830df.C6831a c6831a, int i, int i2) {
        this.f25542b = c7677rw;
        this.f25543c = str;
        this.f25544d = str2;
        this.f25545e = c6831a;
        this.f25547g = i;
        this.f25548h = i2;
    }

    /* renamed from: a */
    protected abstract void mo13687a();

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public Void call() {
        try {
            long nanoTime = System.nanoTime();
            this.f25546f = this.f25542b.m13725a(this.f25543c, this.f25544d);
            if (this.f25546f != null) {
                mo13687a();
                C7457np m13710j = this.f25542b.m13710j();
                if (m13710j != null && this.f25547g != Integer.MIN_VALUE) {
                    m13710j.m14415a(this.f25548h, this.f25547g, (System.nanoTime() - nanoTime) / 1000);
                }
            }
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e2) {
        }
        return null;
    }
}
