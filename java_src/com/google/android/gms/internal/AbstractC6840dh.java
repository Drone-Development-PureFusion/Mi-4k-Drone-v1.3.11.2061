package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import com.google.android.gms.internal.C6850dm;
/* renamed from: com.google.android.gms.internal.dh */
/* loaded from: classes2.dex */
public abstract class AbstractC6840dh {

    /* renamed from: a */
    protected final C6849dl f23022a;

    /* renamed from: b */
    protected final AbstractC6845dj f23023b;

    /* renamed from: c */
    protected final AbstractC4682e f23024c;
    @Nullable

    /* renamed from: d */
    protected final aos f23025d;

    /* renamed from: e */
    private int f23026e;

    public AbstractC6840dh(int i, C6849dl c6849dl, AbstractC6845dj abstractC6845dj, @Nullable aos aosVar) {
        this(i, c6849dl, abstractC6845dj, aosVar, C4685h.m23138d());
    }

    public AbstractC6840dh(int i, C6849dl c6849dl, AbstractC6845dj abstractC6845dj, @Nullable aos aosVar, AbstractC4682e abstractC4682e) {
        this.f23022a = (C6849dl) C4588d.m23627a(c6849dl);
        C4588d.m23627a(c6849dl.m16128a());
        this.f23026e = i;
        this.f23023b = (AbstractC6845dj) C4588d.m23627a(abstractC6845dj);
        this.f23024c = (AbstractC4682e) C4588d.m23627a(abstractC4682e);
        this.f23025d = aosVar;
    }

    /* renamed from: a */
    public String m16147a(int i) {
        switch (i) {
            case 0:
                return "Resource not available";
            case 1:
                return "IOError";
            case 2:
                return "Server error";
            default:
                return "Unknown reason";
        }
    }

    /* renamed from: a */
    public void m16146a(int i, int i2) {
        if (this.f23025d != null && i2 == 0 && i == 3) {
            this.f23025d.m16439e();
        }
        String valueOf = String.valueOf(this.f23022a.m16128a().m16175a());
        String valueOf2 = String.valueOf(m16147a(i));
        aph.m16391d(new StringBuilder(String.valueOf(valueOf).length() + 61 + String.valueOf(valueOf2).length()).append("Failed to fetch the container resource for the container \"").append(valueOf).append("\": ").append(valueOf2).toString());
        mo16134a(new C6850dm(Status.f16788c, i2));
    }

    /* renamed from: a */
    protected abstract void mo16134a(C6850dm c6850dm);

    /* renamed from: a */
    public void m16145a(byte[] bArr) {
        C6850dm c6850dm;
        C6850dm m16144b = m16144b(bArr);
        if (this.f23025d != null && this.f23026e == 0) {
            this.f23025d.m16438f();
        }
        if (m16144b == null || m16144b.mo7645a() != Status.f16786a) {
            c6850dm = new C6850dm(Status.f16788c, this.f23026e);
        } else {
            c6850dm = new C6850dm(Status.f16786a, this.f23026e, new C6850dm.C6851a(this.f23022a.m16128a(), bArr, m16144b.m16125b().m16119c(), this.f23024c.mo16434a()), m16144b.m16124c());
        }
        mo16134a(c6850dm);
    }

    /* renamed from: b */
    protected C6850dm m16144b(byte[] bArr) {
        C6850dm c6850dm = null;
        try {
            c6850dm = this.f23023b.mo16129a(bArr);
            if (c6850dm == null) {
                aph.m16392c("Parsed resource from is null");
            }
        } catch (C6829de e) {
            aph.m16392c("Resource data is corrupted");
        }
        return c6850dm;
    }
}
