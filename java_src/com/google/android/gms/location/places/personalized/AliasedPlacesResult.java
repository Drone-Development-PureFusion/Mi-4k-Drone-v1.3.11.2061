package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class AliasedPlacesResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<AliasedPlacesResult> CREATOR = new C8299b();

    /* renamed from: a */
    final int f27176a;

    /* renamed from: b */
    private final Status f27177b;

    /* renamed from: c */
    private final List<AliasedPlace> f27178c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AliasedPlacesResult(int i, Status status, List<AliasedPlace> list) {
        this.f27176a = i;
        this.f27177b = status;
        this.f27178c = list;
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f27177b;
    }

    /* renamed from: b */
    public List<AliasedPlace> m12134b() {
        return this.f27178c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8299b.m12124a(this, parcel, i);
    }
}
