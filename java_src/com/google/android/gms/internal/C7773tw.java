package com.google.android.gms.internal;

import com.android.volley.C0904d;
/* renamed from: com.google.android.gms.internal.tw */
/* loaded from: classes2.dex */
public class C7773tw implements afg {

    /* renamed from: a */
    private int f25699a;

    /* renamed from: b */
    private int f25700b;

    /* renamed from: c */
    private final int f25701c;

    /* renamed from: d */
    private final float f25702d;

    public C7773tw() {
        this(C0904d.f1994a, 1, 1.0f);
    }

    public C7773tw(int i, int i2, float f) {
        this.f25699a = i;
        this.f25701c = i2;
        this.f25702d = f;
    }

    @Override // com.google.android.gms.internal.afg
    /* renamed from: a */
    public int mo13507a() {
        return this.f25699a;
    }

    @Override // com.google.android.gms.internal.afg
    /* renamed from: a */
    public void mo13506a(aii aiiVar) {
        this.f25700b++;
        this.f25699a = (int) (this.f25699a + (this.f25699a * this.f25702d));
        if (!m13504c()) {
            throw aiiVar;
        }
    }

    @Override // com.google.android.gms.internal.afg
    /* renamed from: b */
    public int mo13505b() {
        return this.f25700b;
    }

    /* renamed from: c */
    protected boolean m13504c() {
        return this.f25700b <= this.f25701c;
    }
}
