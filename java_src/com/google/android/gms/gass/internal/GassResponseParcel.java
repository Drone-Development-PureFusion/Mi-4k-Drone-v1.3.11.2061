package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC6830df;
import com.google.android.gms.internal.AbstractC7649rd;
import com.google.android.gms.internal.C7648rc;
/* loaded from: classes2.dex */
public final class GassResponseParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GassResponseParcel> CREATOR = new C6052d();

    /* renamed from: a */
    public final int f20473a;

    /* renamed from: b */
    private AbstractC6830df.C6831a f20474b = null;

    /* renamed from: c */
    private byte[] f20475c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GassResponseParcel(int i, byte[] bArr) {
        this.f20473a = i;
        this.f20475c = bArr;
        m18959e();
    }

    /* renamed from: c */
    private boolean m18961c() {
        return this.f20474b != null;
    }

    /* renamed from: d */
    private void m18960d() {
        if (!m18961c()) {
            try {
                this.f20474b = AbstractC6830df.C6831a.m16167a(this.f20475c);
                this.f20475c = null;
            } catch (C7648rc e) {
                throw new IllegalStateException(e);
            }
        }
        m18959e();
    }

    /* renamed from: e */
    private void m18959e() {
        if (this.f20474b != null || this.f20475c == null) {
            if (this.f20474b != null && this.f20475c == null) {
                return;
            }
            if (this.f20474b != null && this.f20475c != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (this.f20474b != null || this.f20475c != null) {
                throw new IllegalStateException("Impossible");
            }
            throw new IllegalStateException("Invalid internal representation - empty");
        }
    }

    /* renamed from: a */
    public byte[] m18963a() {
        return this.f20475c != null ? this.f20475c : AbstractC7649rd.m13857a(this.f20474b);
    }

    /* renamed from: b */
    public AbstractC6830df.C6831a m18962b() {
        m18960d();
        return this.f20474b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6052d.m18945a(this, parcel, i);
    }
}
