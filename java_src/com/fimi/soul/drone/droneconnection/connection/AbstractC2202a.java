package com.fimi.soul.drone.droneconnection.connection;

import android.content.Context;
import com.fimi.soul.biz.p170b.C1772d;
/* renamed from: com.fimi.soul.drone.droneconnection.connection.a */
/* loaded from: classes.dex */
public abstract class AbstractC2202a extends AbstractC2224e {

    /* renamed from: i */
    private static final String f6939i = AbstractC2202a.class.getSimpleName();

    /* renamed from: a */
    protected final Context f6940a;

    /* renamed from: j */
    private boolean f6941j = true;

    public AbstractC2202a(Context context) {
        this.f6940a = context;
    }

    /* renamed from: a */
    protected abstract int mo32676a(byte[] bArr);

    /* renamed from: a */
    protected abstract void mo32679a();

    /* renamed from: a */
    public void m32720a(boolean z) {
        this.f6941j = z;
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2224e
    /* renamed from: b */
    protected int mo32630b(byte[] bArr) {
        if (this.f6941j) {
            return mo32676a(bArr);
        }
        return 0;
    }

    /* renamed from: b */
    protected abstract void mo32675b();

    /* renamed from: b */
    public void m32719b(boolean z) {
        if (z) {
            this.f7025e = true;
        } else {
            this.f7025e = false;
        }
    }

    /* renamed from: c */
    public boolean m32718c() {
        return this.f6941j;
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2224e
    /* renamed from: d */
    protected final void mo32627d() {
        mo32675b();
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2224e
    /* renamed from: e */
    public final void mo32624e() {
        mo32679a();
        k();
        C1772d.m34208a().m34200b(false);
    }
}
