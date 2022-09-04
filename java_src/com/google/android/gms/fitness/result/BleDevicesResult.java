package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class BleDevicesResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<BleDevicesResult> CREATOR = new C5250a();

    /* renamed from: a */
    private final int f19079a;

    /* renamed from: b */
    private final List<BleDevice> f19080b;

    /* renamed from: c */
    private final Status f19081c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BleDevicesResult(int i, List<BleDevice> list, Status status) {
        this.f19079a = i;
        this.f19080b = Collections.unmodifiableList(list);
        this.f19081c = status;
    }

    public BleDevicesResult(List<BleDevice> list, Status status) {
        this.f19079a = 3;
        this.f19080b = Collections.unmodifiableList(list);
        this.f19081c = status;
    }

    /* renamed from: a */
    public static BleDevicesResult m20967a(Status status) {
        return new BleDevicesResult(Collections.emptyList(), status);
    }

    /* renamed from: a */
    private boolean m20965a(BleDevicesResult bleDevicesResult) {
        return this.f19081c.equals(bleDevicesResult.f19081c) && C4585c.m23634a(this.f19080b, bleDevicesResult.f19080b);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f19081c;
    }

    /* renamed from: a */
    public List<BleDevice> m20966a(DataType dataType) {
        ArrayList arrayList = new ArrayList();
        for (BleDevice bleDevice : this.f19080b) {
            if (bleDevice.m21754d().contains(dataType)) {
                arrayList.add(bleDevice);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public List<BleDevice> m20964b() {
        return this.f19080b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m20963c() {
        return this.f19079a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BleDevicesResult) && m20965a((BleDevicesResult) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19081c, this.f19080b);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("status", this.f19081c).m23632a("bleDevices", this.f19080b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5250a.m20903a(this, parcel, i);
    }
}
