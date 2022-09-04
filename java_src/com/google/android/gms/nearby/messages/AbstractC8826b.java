package com.google.android.gms.nearby.messages;

import android.support.annotation.NonNull;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* renamed from: com.google.android.gms.nearby.messages.b */
/* loaded from: classes.dex */
public interface AbstractC8826b extends Comparable<AbstractC8826b> {

    /* renamed from: a */
    public static final AbstractC8826b f28208a = new DistanceImpl(1, Double.NaN);

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.nearby.messages.b$a */
    /* loaded from: classes.dex */
    public @interface AbstractC8827a {

        /* renamed from: a */
        public static final int f28209a = 1;
    }

    /* renamed from: a */
    int mo9917a();

    /* renamed from: a */
    int mo9915a(@NonNull AbstractC8826b abstractC8826b);

    /* renamed from: b */
    double mo9914b();
}
