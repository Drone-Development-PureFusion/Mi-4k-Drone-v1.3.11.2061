package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.alq;
/* loaded from: classes2.dex */
public class SubscribeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new C5236m();

    /* renamed from: a */
    private final int f19042a;

    /* renamed from: b */
    private Subscription f19043b;

    /* renamed from: c */
    private final boolean f19044c;

    /* renamed from: d */
    private final alq f19045d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubscribeRequest(int i, Subscription subscription, boolean z, IBinder iBinder) {
        this.f19042a = i;
        this.f19043b = subscription;
        this.f19044c = z;
        this.f19045d = alq.AbstractBinderC6512a.m16932a(iBinder);
    }

    public SubscribeRequest(Subscription subscription, boolean z, alq alqVar) {
        this.f19042a = 3;
        this.f19043b = subscription;
        this.f19044c = z;
        this.f19045d = alqVar;
    }

    /* renamed from: a */
    public Subscription m21120a() {
        return this.f19043b;
    }

    /* renamed from: b */
    public boolean m21119b() {
        return this.f19044c;
    }

    /* renamed from: c */
    public IBinder m21118c() {
        if (this.f19045d == null) {
            return null;
        }
        return this.f19045d.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m21117d() {
        return this.f19042a;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("subscription", this.f19043b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5236m.m21007a(this, parcel, i);
    }
}
