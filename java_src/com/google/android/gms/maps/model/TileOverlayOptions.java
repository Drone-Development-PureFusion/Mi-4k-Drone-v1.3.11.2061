package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.p248a.AbstractC8603j;
/* loaded from: classes2.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final C8608ac CREATOR = new C8608ac();

    /* renamed from: a */
    private final int f27536a;

    /* renamed from: b */
    private AbstractC8603j f27537b;

    /* renamed from: c */
    private AbstractC8620l f27538c;

    /* renamed from: d */
    private boolean f27539d;

    /* renamed from: e */
    private float f27540e;

    /* renamed from: f */
    private boolean f27541f;

    /* renamed from: g */
    private float f27542g;

    public TileOverlayOptions() {
        this.f27539d = true;
        this.f27541f = true;
        this.f27542g = 0.0f;
        this.f27536a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TileOverlayOptions(int i, IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.f27539d = true;
        this.f27541f = true;
        this.f27542g = 0.0f;
        this.f27536a = i;
        this.f27537b = AbstractC8603j.AbstractBinderC8604a.m11102a(iBinder);
        this.f27538c = this.f27537b == null ? null : new AbstractC8620l() { // from class: com.google.android.gms.maps.model.TileOverlayOptions.1

            /* renamed from: c */
            private final AbstractC8603j f27544c;

            {
                this.f27544c = TileOverlayOptions.this.f27537b;
            }

            @Override // com.google.android.gms.maps.model.AbstractC8620l
            /* renamed from: a */
            public Tile mo10958a(int i2, int i3, int i4) {
                try {
                    return this.f27544c.mo11101a(i2, i3, i4);
                } catch (RemoteException e) {
                    return null;
                }
            }
        };
        this.f27539d = z;
        this.f27540e = f;
        this.f27541f = z2;
        this.f27542g = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11270a() {
        return this.f27536a;
    }

    /* renamed from: a */
    public TileOverlayOptions m11269a(float f) {
        this.f27540e = f;
        return this;
    }

    /* renamed from: a */
    public TileOverlayOptions m11267a(final AbstractC8620l abstractC8620l) {
        this.f27538c = abstractC8620l;
        this.f27537b = this.f27538c == null ? null : new AbstractC8603j.AbstractBinderC8604a() { // from class: com.google.android.gms.maps.model.TileOverlayOptions.2
            @Override // com.google.android.gms.maps.model.p248a.AbstractC8603j
            /* renamed from: a */
            public Tile mo11101a(int i, int i2, int i3) {
                return abstractC8620l.mo10958a(i, i2, i3);
            }
        };
        return this;
    }

    /* renamed from: a */
    public TileOverlayOptions m11266a(boolean z) {
        this.f27539d = z;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public IBinder m11265b() {
        return this.f27537b.asBinder();
    }

    /* renamed from: b */
    public TileOverlayOptions m11264b(float f) {
        C4588d.m23618b(f >= 0.0f && f <= 1.0f, "Transparency must be in the range [0..1]");
        this.f27542g = f;
        return this;
    }

    /* renamed from: b */
    public TileOverlayOptions m11263b(boolean z) {
        this.f27541f = z;
        return this;
    }

    /* renamed from: c */
    public AbstractC8620l m11262c() {
        return this.f27538c;
    }

    /* renamed from: d */
    public float m11261d() {
        return this.f27540e;
    }

    /* renamed from: e */
    public boolean m11260e() {
        return this.f27539d;
    }

    /* renamed from: f */
    public boolean m11259f() {
        return this.f27541f;
    }

    /* renamed from: g */
    public float m11258g() {
        return this.f27542g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8608ac.m11092a(this, parcel, i);
    }
}
