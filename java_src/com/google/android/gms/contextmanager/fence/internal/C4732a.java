package com.google.android.gms.contextmanager.fence.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7605pv;
/* renamed from: com.google.android.gms.contextmanager.fence.internal.a */
/* loaded from: classes2.dex */
public class C4732a {

    /* renamed from: a */
    private final C7605pv f17390a;

    public C4732a(C7605pv c7605pv) {
        this.f17390a = (C7605pv) C4588d.m23627a(c7605pv);
    }

    /* renamed from: a */
    public static C4732a m22940a(int i, int[] iArr) {
        C4588d.m23619b(iArr != null && iArr.length > 0);
        return new C4732a(m22939a(i, iArr, 3000L));
    }

    /* renamed from: a */
    public static C4732a m22938a(int[] iArr) {
        return m22940a(1, iArr);
    }

    /* renamed from: a */
    private static C7605pv m22939a(int i, int[] iArr, long j) {
        C7605pv c7605pv = new C7605pv();
        c7605pv.f25215a = i;
        c7605pv.f25216b = j;
        c7605pv.f25217c = iArr;
        return c7605pv;
    }

    /* renamed from: a */
    public C7605pv m22941a() {
        return this.f17390a;
    }
}
