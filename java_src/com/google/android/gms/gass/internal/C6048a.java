package com.google.android.gms.gass.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.internal.AbstractC6830df;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.gass.internal.a */
/* loaded from: classes2.dex */
public class C6048a {

    /* renamed from: com.google.android.gms.gass.internal.a$a */
    /* loaded from: classes2.dex */
    static class C6049a implements AbstractC4600p.AbstractC4602b, AbstractC4600p.AbstractC4603c {

        /* renamed from: a */
        protected C6050b f20476a;

        /* renamed from: b */
        private final String f20477b;

        /* renamed from: c */
        private final String f20478c;

        /* renamed from: e */
        private final HandlerThread f20480e = new HandlerThread("GassClient");

        /* renamed from: d */
        private final LinkedBlockingQueue<AbstractC6830df.C6831a> f20479d = new LinkedBlockingQueue<>();

        public C6049a(Context context, String str, String str2) {
            this.f20477b = str;
            this.f20478c = str2;
            this.f20480e.start();
            this.f20476a = new C6050b(context, this.f20480e.getLooper(), this, this);
            m18954c();
        }

        /* renamed from: a */
        public AbstractC6830df.C6831a m18957a() {
            return m18955b(2000);
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4602b
        /* renamed from: a */
        public void mo10593a(int i) {
            try {
                this.f20479d.put(new AbstractC6830df.C6831a());
            } catch (InterruptedException e) {
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4602b
        /* renamed from: a */
        public void mo10591a(Bundle bundle) {
            AbstractC6053e m18956b = m18956b();
            if (m18956b != null) {
                try {
                    this.f20479d.put(m18956b.mo18943a(new GassRequestParcel(this.f20477b, this.f20478c)).m18962b());
                    m18953d();
                    this.f20480e.quit();
                } catch (Throwable th) {
                    m18953d();
                    this.f20480e.quit();
                }
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4603c
        /* renamed from: a */
        public void mo10590a(ConnectionResult connectionResult) {
            try {
                this.f20479d.put(new AbstractC6830df.C6831a());
            } catch (InterruptedException e) {
            }
        }

        /* renamed from: b */
        protected AbstractC6053e m18956b() {
            try {
                return this.f20476a.m18951h();
            } catch (DeadObjectException | IllegalStateException e) {
                return null;
            }
        }

        /* renamed from: b */
        public AbstractC6830df.C6831a m18955b(int i) {
            AbstractC6830df.C6831a c6831a;
            try {
                c6831a = this.f20479d.poll(i, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                c6831a = null;
            }
            return c6831a == null ? new AbstractC6830df.C6831a() : c6831a;
        }

        /* renamed from: c */
        protected void m18954c() {
            this.f20476a.A();
        }

        /* renamed from: d */
        public void m18953d() {
            if (this.f20476a != null) {
                if (!this.f20476a.t() && !this.f20476a.u()) {
                    return;
                }
                this.f20476a.f();
            }
        }
    }

    /* renamed from: a */
    public static AbstractC6830df.C6831a m18958a(Context context, String str, String str2) {
        return new C6049a(context, str, str2).m18957a();
    }
}
