package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.location.places.AbstractC8247i;
import com.google.android.gms.location.places.BinderC8308s;
import com.google.android.gms.location.places.C8291l;
import com.google.android.gms.location.places.PlacePhotoResult;
/* renamed from: com.google.android.gms.location.places.internal.p */
/* loaded from: classes2.dex */
public class C8282p implements AbstractC8247i {

    /* renamed from: a */
    private final String f27142a;

    /* renamed from: b */
    private final int f27143b;

    /* renamed from: c */
    private final int f27144c;

    /* renamed from: d */
    private final CharSequence f27145d;

    /* renamed from: e */
    private int f27146e;

    public C8282p(String str, int i, int i2, CharSequence charSequence, int i3) {
        this.f27142a = str;
        this.f27143b = i;
        this.f27144c = i2;
        this.f27145d = charSequence;
        this.f27146e = i3;
    }

    @Override // com.google.android.gms.location.places.AbstractC8247i
    /* renamed from: a */
    public AbstractC4494i<PlacePhotoResult> mo12190a(AbstractC4489g abstractC4489g) {
        return mo12189a(abstractC4489g, mo12188c(), mo12187d());
    }

    @Override // com.google.android.gms.location.places.AbstractC8247i
    /* renamed from: a */
    public AbstractC4494i<PlacePhotoResult> mo12189a(AbstractC4489g abstractC4489g, final int i, final int i2) {
        return abstractC4489g.mo17255a((AbstractC4489g) new BinderC8308s.AbstractC8309a<C8257e>(C8291l.f27157c, abstractC4489g) { // from class: com.google.android.gms.location.places.internal.p.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a */
            public void mo7809a(C8257e c8257e) {
                c8257e.m12252a(new BinderC8308s(this), C8282p.this.f27142a, i, i2, C8282p.this.f27146e);
            }
        });
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.location.places.AbstractC8247i
    /* renamed from: c */
    public int mo12188c() {
        return this.f27143b;
    }

    @Override // com.google.android.gms.location.places.AbstractC8247i
    /* renamed from: d */
    public int mo12187d() {
        return this.f27144c;
    }

    @Override // com.google.android.gms.location.places.AbstractC8247i
    /* renamed from: e */
    public CharSequence mo12186e() {
        return this.f27145d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8282p)) {
            return false;
        }
        C8282p c8282p = (C8282p) obj;
        return c8282p.f27143b == this.f27143b && c8282p.f27144c == this.f27144c && C4585c.m23634a(c8282p.f27142a, this.f27142a) && C4585c.m23634a(c8282p.f27145d, this.f27145d);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: f */
    public AbstractC8247i mo7785a() {
        return this;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f27143b), Integer.valueOf(this.f27144c), this.f27142a, this.f27145d);
    }
}
