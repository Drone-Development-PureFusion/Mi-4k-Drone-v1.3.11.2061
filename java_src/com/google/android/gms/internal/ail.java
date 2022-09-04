package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes2.dex */
public final class ail<L> {

    /* renamed from: a */
    private final HandlerC6384a f21941a;

    /* renamed from: b */
    private volatile L f21942b;

    /* renamed from: c */
    private final C6385b<L> f21943c;

    /* renamed from: com.google.android.gms.internal.ail$a */
    /* loaded from: classes2.dex */
    private final class HandlerC6384a extends Handler {
        public HandlerC6384a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            C4588d.m23619b(z);
            ail.this.m17212b((AbstractC6386c) message.obj);
        }
    }

    /* renamed from: com.google.android.gms.internal.ail$b */
    /* loaded from: classes2.dex */
    public static final class C6385b<L> {

        /* renamed from: a */
        private final L f21945a;

        /* renamed from: b */
        private final String f21946b;

        private C6385b(L l, String str) {
            this.f21945a = l;
            this.f21946b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6385b)) {
                return false;
            }
            C6385b c6385b = (C6385b) obj;
            return this.f21945a == c6385b.f21945a && this.f21946b.equals(c6385b.f21946b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f21945a) * 31) + this.f21946b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.internal.ail$c */
    /* loaded from: classes2.dex */
    public interface AbstractC6386c<L> {
        /* renamed from: a */
        void mo7919a();

        /* renamed from: a */
        void mo7917a(L l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ail(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.f21941a = new HandlerC6384a(looper);
        this.f21942b = (L) C4588d.m23626a(l, "Listener must not be null");
        this.f21943c = new C6385b<>(l, C4588d.m23625a(str));
    }

    /* renamed from: a */
    public void m17215a() {
        this.f21942b = null;
    }

    /* renamed from: a */
    public void m17214a(AbstractC6386c<? super L> abstractC6386c) {
        C4588d.m23626a(abstractC6386c, "Notifier must not be null");
        this.f21941a.sendMessage(this.f21941a.obtainMessage(1, abstractC6386c));
    }

    @NonNull
    /* renamed from: b */
    public C6385b<L> m17213b() {
        return this.f21943c;
    }

    /* renamed from: b */
    void m17212b(AbstractC6386c<? super L> abstractC6386c) {
        Object obj = (L) this.f21942b;
        if (obj == null) {
            abstractC6386c.mo7919a();
            return;
        }
        try {
            abstractC6386c.mo7917a(obj);
        } catch (RuntimeException e) {
            abstractC6386c.mo7919a();
            throw e;
        }
    }
}
