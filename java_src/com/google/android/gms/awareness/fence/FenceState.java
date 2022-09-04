package com.google.android.gms.awareness.fence;

import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public abstract class FenceState extends AbstractSafeParcelable {

    /* renamed from: a */
    public static final int f15631a = 0;

    /* renamed from: b */
    public static final int f15632b = 1;

    /* renamed from: c */
    public static final int f15633c = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.awareness.fence.FenceState$a */
    /* loaded from: classes.dex */
    public @interface AbstractC4094a {
    }

    /* renamed from: a */
    public static FenceState m25498a(Intent intent) {
        return FenceStateImpl.m22968b(intent);
    }

    /* renamed from: a */
    public abstract int mo22971a();

    /* renamed from: b */
    public abstract int mo22969b();

    /* renamed from: c */
    public abstract long mo22967c();

    /* renamed from: d */
    public abstract String mo22966d();
}
