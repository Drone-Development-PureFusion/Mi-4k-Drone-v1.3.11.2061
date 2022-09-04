package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
/* renamed from: com.google.android.gms.internal.st */
/* loaded from: classes2.dex */
public interface AbstractC7707st {

    /* renamed from: com.google.android.gms.internal.st$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7708a {

        /* renamed from: a */
        public static final AbstractC7708a f25553a = new AbstractC7708a() { // from class: com.google.android.gms.internal.st.a.1
            @Override // com.google.android.gms.internal.AbstractC7707st.AbstractC7708a
            /* renamed from: a */
            public Handler mo13677a(Looper looper) {
                return new Handler(looper);
            }
        };

        /* renamed from: a */
        Handler mo13677a(Looper looper);
    }
}
