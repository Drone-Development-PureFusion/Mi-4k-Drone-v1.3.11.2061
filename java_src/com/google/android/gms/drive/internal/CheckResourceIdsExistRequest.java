package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class CheckResourceIdsExistRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CheckResourceIdsExistRequest> CREATOR = new C4882bf();

    /* renamed from: a */
    private final int f17663a;

    /* renamed from: b */
    private final List<String> f17664b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckResourceIdsExistRequest(int i, List<String> list) {
        this.f17663a = i;
        this.f17664b = list;
    }

    /* renamed from: a */
    public int m22621a() {
        return this.f17663a;
    }

    /* renamed from: b */
    public List<String> m22620b() {
        return this.f17664b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4882bf.m22505a(this, parcel, i);
    }
}
