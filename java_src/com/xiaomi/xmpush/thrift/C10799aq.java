package com.xiaomi.xmpush.thrift;

import android.content.Context;
import com.xiaomi.channel.commonutils.android.C10390b;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10409e;
import com.xiaomi.push.service.C10644ay;
import org.p286a.p321b.AbstractC11361a;
import org.p286a.p321b.C11391e;
import org.p286a.p321b.C11392f;
import org.p286a.p321b.C11393g;
import org.p286a.p321b.p323b.C11371a;
import org.p286a.p321b.p323b.C11382k;
/* renamed from: com.xiaomi.xmpush.thrift.aq */
/* loaded from: classes.dex */
public class C10799aq {
    /* renamed from: a */
    public static short m3472a(Context context, C10769ab c10769ab) {
        int i = 0;
        int m5318a = (C10409e.m5256a(context) ? 8 : 0) + 0 + C10390b.m5321d(context, c10769ab.f33671f).m5318a() + (C10409e.m5255b(context) ? 4 : 0);
        if (C10644ay.m4298a(context, c10769ab)) {
            i = 16;
        }
        return (short) (m5318a + i);
    }

    /* renamed from: a */
    public static short m3469a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z2 ? 2 : 0) + 0 + (z ? 4 : 0);
        if (z3) {
            i = 1;
        }
        return (short) (i + i2);
    }

    /* renamed from: a */
    public static <T extends AbstractC11361a<T, ?>> void m3470a(T t, byte[] bArr) {
        if (bArr == null) {
            throw new C11392f("the message byte is empty.");
        }
        new C11391e(new C11382k.C11383a(true, true, bArr.length)).m1208a(t, bArr);
    }

    /* renamed from: a */
    public static <T extends AbstractC11361a<T, ?>> byte[] m3471a(T t) {
        if (t == null) {
            return null;
        }
        try {
            return new C11393g(new C11371a.C11372a()).m1207a(t);
        } catch (C11392f e) {
            AbstractC10404b.m5268a("convertThriftObjectToBytes catch TException.", e);
            return null;
        }
    }
}
