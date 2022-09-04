package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.C5375d;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class SnapshotRequest extends AbstractSafeParcelable {

    /* renamed from: b */
    private final int f15677b;

    /* renamed from: c */
    private final int f15678c;

    /* renamed from: d */
    private final ArrayList<BeaconStateImpl.TypeFilterImpl> f15679d;

    /* renamed from: a */
    private static final int[] f15676a = {C5375d.f19452b, C5375d.f19453c, C5375d.f19454d, C5375d.f19455e, C5375d.f19456f, C5375d.f19457g, C5375d.f19458h};
    public static final Parcelable.Creator<SnapshotRequest> CREATOR = new C4136l();

    /* JADX INFO: Access modifiers changed from: package-private */
    public SnapshotRequest(int i, int i2, ArrayList<BeaconStateImpl.TypeFilterImpl> arrayList) {
        this.f15677b = i;
        this.f15678c = i2;
        this.f15679d = arrayList;
    }

    public SnapshotRequest(int i, ArrayList<BeaconStateImpl.TypeFilterImpl> arrayList) {
        this(1, i, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25431a() {
        return this.f15677b;
    }

    /* renamed from: b */
    public int m25430b() {
        return this.f15678c;
    }

    /* renamed from: c */
    public ArrayList<BeaconStateImpl.TypeFilterImpl> m25429c() {
        return this.f15679d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnapshotRequest)) {
            return false;
        }
        SnapshotRequest snapshotRequest = (SnapshotRequest) obj;
        if (this.f15678c != snapshotRequest.m25430b()) {
            return false;
        }
        if ((this.f15679d == null) ^ (snapshotRequest.m25429c() == null)) {
            return false;
        }
        if (this.f15679d != null) {
            if (this.f15679d.size() != snapshotRequest.m25429c().size()) {
                return false;
            }
            Iterator<BeaconStateImpl.TypeFilterImpl> it2 = this.f15679d.iterator();
            while (it2.hasNext()) {
                if (!snapshotRequest.m25429c().contains(it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int i;
        if (this.f15679d != null) {
            Iterator<BeaconStateImpl.TypeFilterImpl> it2 = this.f15679d.iterator();
            i = 0;
            while (it2.hasNext()) {
                i = (it2.next().hashCode() * 13) + i;
            }
        } else {
            i = 0;
        }
        return C4585c.m23633a(Integer.valueOf(this.f15678c), Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4136l.m25367a(this, parcel, i);
    }
}
