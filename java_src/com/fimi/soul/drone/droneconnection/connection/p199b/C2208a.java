package com.fimi.soul.drone.droneconnection.connection.p199b;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fimi.soul.drone.droneconnection.connection.AbstractC2202a;
import com.fimi.soul.drone.p204h.C2279c;
/* renamed from: com.fimi.soul.drone.droneconnection.connection.b.a */
/* loaded from: classes.dex */
public class C2208a extends AbstractC2202a {

    /* renamed from: i */
    private final AbstractC2210b f6963i;

    public C2208a(Context context) {
        super(context);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.f6963i = new AbstractC2210b() { // from class: com.fimi.soul.drone.droneconnection.connection.b.a.1
            @Override // com.fimi.soul.drone.droneconnection.connection.p199b.AbstractC2210b
            /* renamed from: a */
            protected int mo32696a() {
                return Integer.parseInt(defaultSharedPreferences.getString(C2279c.f7272i, C2279c.f7274k));
            }

            @Override // com.fimi.soul.drone.droneconnection.connection.p199b.AbstractC2210b
            /* renamed from: b */
            protected String mo32691b() {
                return defaultSharedPreferences.getString(C2279c.f7273j, C2279c.m32453b());
            }
        };
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2202a
    /* renamed from: a */
    protected int mo32676a(byte[] bArr) {
        return this.f6963i.mo32630b(bArr);
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2202a
    /* renamed from: a */
    protected void mo32679a() {
        this.f6963i.mo32624e();
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2202a
    /* renamed from: b */
    protected void mo32675b() {
        this.f6963i.mo32627d();
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2224e
    /* renamed from: d */
    protected void mo32625d(byte[] bArr) {
        this.f6963i.mo32625d(bArr);
    }

    @Override // com.fimi.soul.drone.droneconnection.connection.AbstractC2224e
    /* renamed from: j */
    public int mo32616j() {
        return this.f6963i.mo32616j();
    }
}
