package com.google.android.gms.contextmanager.fence.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7625qh;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.contextmanager.fence.internal.n */
/* loaded from: classes2.dex */
public class C4751n {

    /* renamed from: a */
    private final C7625qh f17403a;

    public C4751n(C7625qh c7625qh) {
        this.f17403a = (C7625qh) C4588d.m23627a(c7625qh);
    }

    /* renamed from: a */
    public static C4751n m22898a(int i, int i2, double d) {
        C4588d.m23619b(d >= C9755a.f30449c);
        return new C4751n(m22896a(2, 1, i, i2, d, d, 3000L, 0L));
    }

    /* renamed from: a */
    public static C4751n m22897a(int i, int i2, double d, long j) {
        C4588d.m23619b(d >= C9755a.f30449c);
        return new C4751n(m22896a(1, 1, i, i2, d, d, 0L, j));
    }

    /* renamed from: a */
    private static C7625qh m22896a(int i, int i2, int i3, int i4, double d, double d2, long j, long j2) {
        C7625qh c7625qh = new C7625qh();
        c7625qh.f25309a = i;
        c7625qh.f25310b = i2;
        c7625qh.f25311c = j;
        c7625qh.f25316h = j2;
        if (i2 == 1) {
            c7625qh.f25312d = i3;
            c7625qh.f25313e = i4;
            c7625qh.f25314f = d;
            c7625qh.f25315g = d2;
        }
        return c7625qh;
    }

    /* renamed from: b */
    public static C4751n m22895b(int i, int i2, double d) {
        C4588d.m23619b(d >= C9755a.f30449c);
        return new C4751n(m22896a(3, 1, i, i2, d, d, 3000L, 0L));
    }

    /* renamed from: a */
    public C7625qh m22899a() {
        return this.f17403a;
    }
}
