package com.google.android.gms.internal;

import java.lang.Thread;
/* renamed from: com.google.android.gms.internal.iw */
/* loaded from: classes2.dex */
public interface AbstractC7230iw {

    /* renamed from: a */
    public static final AbstractC7230iw f24286a = new AbstractC7230iw() { // from class: com.google.android.gms.internal.iw.1
        @Override // com.google.android.gms.internal.AbstractC7230iw
        /* renamed from: a */
        public void mo15160a(Thread thread, String str) {
            thread.setName(str);
        }

        @Override // com.google.android.gms.internal.AbstractC7230iw
        /* renamed from: a */
        public void mo15159a(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // com.google.android.gms.internal.AbstractC7230iw
        /* renamed from: a */
        public void mo15158a(Thread thread, boolean z) {
            thread.setDaemon(z);
        }
    };

    /* renamed from: a */
    void mo15160a(Thread thread, String str);

    /* renamed from: a */
    void mo15159a(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    /* renamed from: a */
    void mo15158a(Thread thread, boolean z);
}
