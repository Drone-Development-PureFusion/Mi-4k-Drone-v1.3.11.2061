package com.google.android.gms.awareness.fence;

import android.support.annotation.RequiresPermission;
import com.google.android.gms.contextmanager.fence.internal.C4732a;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
/* renamed from: com.google.android.gms.awareness.fence.b */
/* loaded from: classes2.dex */
public final class C4096b {

    /* renamed from: a */
    public static final int f15634a = 0;

    /* renamed from: b */
    public static final int f15635b = 1;

    /* renamed from: c */
    public static final int f15636c = 2;

    /* renamed from: d */
    public static final int f15637d = 3;

    /* renamed from: e */
    public static final int f15638e = 4;

    /* renamed from: f */
    public static final int f15639f = 5;

    /* renamed from: g */
    public static final int f15640g = 7;

    /* renamed from: h */
    public static final int f15641h = 8;

    private C4096b() {
    }

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    public static AwarenessFence m25491a(int... iArr) {
        return ContextFenceStub.m22990a(C4732a.m22938a(iArr));
    }

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: b */
    public static AwarenessFence m25490b(int... iArr) {
        return ContextFenceStub.m22990a(C4732a.m22940a(2, iArr));
    }

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: c */
    public static AwarenessFence m25489c(int... iArr) {
        return ContextFenceStub.m22990a(C4732a.m22940a(3, iArr));
    }
}
