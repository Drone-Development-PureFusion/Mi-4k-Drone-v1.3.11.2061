package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public class ParentDriveIdSet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ParentDriveIdSet> CREATOR = new C5014l();

    /* renamed from: a */
    final int f17997a;

    /* renamed from: b */
    final List<PartialDriveId> f17998b;

    public ParentDriveIdSet() {
        this(1, new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ParentDriveIdSet(int i, List<PartialDriveId> list) {
        this.f17997a = i;
        this.f17998b = list;
    }

    /* renamed from: a */
    public Set<DriveId> m22148a(long j) {
        HashSet hashSet = new HashSet();
        for (PartialDriveId partialDriveId : this.f17998b) {
            hashSet.add(partialDriveId.m22146a(j));
        }
        return hashSet;
    }

    /* renamed from: a */
    public void m22147a(PartialDriveId partialDriveId) {
        this.f17998b.add(partialDriveId);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5014l.m22111a(this, parcel, i);
    }
}
