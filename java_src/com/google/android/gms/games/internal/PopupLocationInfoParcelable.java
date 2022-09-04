package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.internal.C5919n;
/* loaded from: classes2.dex */
public final class PopupLocationInfoParcelable extends AbstractSafeParcelable {
    public static final C5917m CREATOR = new C5917m();

    /* renamed from: a */
    private final int f19540a;

    /* renamed from: b */
    private final Bundle f19541b;

    /* renamed from: c */
    private final IBinder f19542c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PopupLocationInfoParcelable(int i, Bundle bundle, IBinder iBinder) {
        this.f19540a = i;
        this.f19541b = bundle;
        this.f19542c = iBinder;
    }

    public PopupLocationInfoParcelable(C5919n.C5921a c5921a) {
        this.f19540a = 1;
        this.f19541b = c5921a.m19561a();
        this.f19542c = c5921a.f20068a;
    }

    /* renamed from: a */
    public int m20450a() {
        return this.f19540a;
    }

    /* renamed from: b */
    public Bundle m20449b() {
        return this.f19541b;
    }

    /* renamed from: c */
    public IBinder m20448c() {
        return this.f19542c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5917m.m19574a(this, parcel, i);
    }
}
