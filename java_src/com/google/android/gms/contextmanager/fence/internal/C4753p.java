package com.google.android.gms.contextmanager.fence.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7637qt;
import java.util.TimeZone;
/* renamed from: com.google.android.gms.contextmanager.fence.internal.p */
/* loaded from: classes2.dex */
public class C4753p {

    /* renamed from: a */
    private final C7637qt f17404a;

    public C4753p(C7637qt c7637qt) {
        this.f17404a = (C7637qt) C4588d.m23627a(c7637qt);
    }

    /* renamed from: a */
    public static C4753p m22890a(int i, TimeZone timeZone, long j, long j2) {
        boolean z = true;
        C4588d.m23619b(i != 1);
        C4588d.m23627a(timeZone);
        C4588d.m23619b(j >= 0);
        C4588d.m23619b(j <= 86400000);
        C4588d.m23619b(j2 >= 0);
        C4588d.m23619b(j2 <= 86400000);
        if (j > j2) {
            z = false;
        }
        C4588d.m23619b(z);
        return new C4753p(m22888b(i, timeZone, j, j2));
    }

    /* renamed from: a */
    public static C4753p m22889a(long j, long j2) {
        boolean z = false;
        C4588d.m23619b(j >= 0);
        C4588d.m23619b(j2 >= 0);
        if (j <= j2) {
            z = true;
        }
        C4588d.m23619b(z);
        return new C4753p(m22888b(1, null, j, j2));
    }

    /* renamed from: b */
    private static C7637qt m22888b(int i, TimeZone timeZone, long j, long j2) {
        C7637qt c7637qt = new C7637qt();
        c7637qt.f25354a = i;
        if (timeZone != null && !TextUtils.isEmpty(timeZone.getID())) {
            c7637qt.f25355b = timeZone.getID();
        }
        c7637qt.f25356c = j;
        c7637qt.f25357d = j2;
        return c7637qt;
    }

    /* renamed from: a */
    public C7637qt m22891a() {
        return this.f17404a;
    }
}
