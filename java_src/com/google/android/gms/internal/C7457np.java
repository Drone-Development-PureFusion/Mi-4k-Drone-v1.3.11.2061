package com.google.android.gms.internal;

import com.google.android.gms.clearcut.C4456b;
import com.google.android.gms.internal.AbstractC6801ce;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* renamed from: com.google.android.gms.internal.np */
/* loaded from: classes2.dex */
public class C7457np {

    /* renamed from: a */
    protected static volatile C4456b f24921a = null;

    /* renamed from: d */
    private static volatile Random f24922d = null;

    /* renamed from: e */
    private static final Object f24923e = new Object();

    /* renamed from: b */
    protected boolean f24924b;

    /* renamed from: c */
    private C7677rw f24925c;

    public C7457np(C7677rw c7677rw) {
        this.f24924b = false;
        this.f24925c = c7677rw;
        C7788uf.m13470a(c7677rw.m13732a());
        this.f24924b = C7788uf.f25768aZ.m13486c().booleanValue();
        if (!this.f24924b || f24921a != null) {
            return;
        }
        synchronized (f24923e) {
            if (f24921a == null) {
                f24921a = new C4456b(c7677rw.m13732a(), "ADSHIELD", null);
            }
        }
    }

    /* renamed from: b */
    private static Random m14414b() {
        if (f24922d == null) {
            synchronized (f24923e) {
                if (f24922d == null) {
                    f24922d = new Random();
                }
            }
        }
        return f24922d;
    }

    /* renamed from: a */
    public int m14416a() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (NoClassDefFoundError e) {
            return m14414b().nextInt();
        } catch (RuntimeException e2) {
            return m14414b().nextInt();
        }
    }

    /* renamed from: a */
    public void m14415a(int i, int i2, long j) {
        try {
            if (!this.f24924b || f24921a == null || !this.f24925c.m13711i()) {
                return;
            }
            AbstractC6801ce.C6802a c6802a = new AbstractC6801ce.C6802a();
            c6802a.f22892a = this.f24925c.m13732a().getPackageName();
            c6802a.f22893b = Long.valueOf(j);
            C4456b.C4458a m24079a = f24921a.m24079a(AbstractC7649rd.m13857a(c6802a));
            m24079a.m24056b(i2);
            m24079a.m24058a(i);
            m24079a.m24057a(this.f24925c.m13713g());
        } catch (Exception e) {
        }
    }
}
