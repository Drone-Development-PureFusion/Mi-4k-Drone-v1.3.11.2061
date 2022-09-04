package com.google.android.gms.internal;

import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.mf */
/* loaded from: classes2.dex */
public class C7387mf {

    /* renamed from: a */
    static final /* synthetic */ boolean f24608a;

    static {
        f24608a = !C7387mf.class.desiredAssertionStatus();
    }

    /* renamed from: a */
    private static long m14621a(AbstractC7339le<?> abstractC7339le) {
        long j = 8;
        if (!(abstractC7339le instanceof C7333kz) && !(abstractC7339le instanceof C7342lf)) {
            if (abstractC7339le instanceof C7318ku) {
                j = 4;
            } else if (!(abstractC7339le instanceof C7355lo)) {
                String valueOf = String.valueOf(abstractC7339le.getClass());
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unknown leaf node type: ").append(valueOf).toString());
            } else {
                j = ((String) abstractC7339le.a()).length() + 2;
            }
        }
        if (abstractC7339le.mo14737f().mo14739b()) {
            return j;
        }
        return m14621a((AbstractC7339le<?>) abstractC7339le.mo14737f()) + 24 + j;
    }

    /* renamed from: a */
    public static long m14620a(AbstractC7344lh abstractC7344lh) {
        long j;
        if (abstractC7344lh.mo14739b()) {
            return 4L;
        }
        if (abstractC7344lh.mo14743e()) {
            return m14621a((AbstractC7339le<?>) abstractC7344lh);
        }
        if (!f24608a && !(abstractC7344lh instanceof C7322kw)) {
            String valueOf = String.valueOf(abstractC7344lh.getClass());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unexpected node type: ").append(valueOf).toString());
        }
        long j2 = 1;
        Iterator<C7343lg> it2 = abstractC7344lh.iterator();
        while (true) {
            j = j2;
            if (!it2.hasNext()) {
                break;
            }
            C7343lg next = it2.next();
            j2 = m14620a(next.m14751d()) + j + next.m14752c().m14823e().length() + 4;
        }
        return !abstractC7344lh.mo14737f().mo14739b() ? j + 12 + m14621a((AbstractC7339le<?>) abstractC7344lh.mo14737f()) : j;
    }

    /* renamed from: b */
    public static int m14619b(AbstractC7344lh abstractC7344lh) {
        int i = 0;
        if (abstractC7344lh.mo14739b()) {
            return 0;
        }
        if (abstractC7344lh.mo14743e()) {
            return 1;
        }
        if (!f24608a && !(abstractC7344lh instanceof C7322kw)) {
            String valueOf = String.valueOf(abstractC7344lh.getClass());
            throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Unexpected node type: ").append(valueOf).toString());
        }
        Iterator<C7343lg> it2 = abstractC7344lh.iterator();
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                return i2;
            }
            i = m14619b(it2.next().m14751d()) + i2;
        }
    }
}
