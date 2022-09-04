package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.akd;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class BleDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BleDevice> CREATOR = new C5150h();

    /* renamed from: a */
    private final int f18373a;

    /* renamed from: b */
    private final String f18374b;

    /* renamed from: c */
    private final String f18375c;

    /* renamed from: d */
    private final List<String> f18376d;

    /* renamed from: e */
    private final List<DataType> f18377e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BleDevice(int i, String str, String str2, List<String> list, List<DataType> list2) {
        this.f18373a = i;
        this.f18374b = str;
        this.f18375c = str2;
        this.f18376d = Collections.unmodifiableList(list);
        this.f18377e = Collections.unmodifiableList(list2);
    }

    /* renamed from: a */
    private boolean m21757a(BleDevice bleDevice) {
        return this.f18375c.equals(bleDevice.f18375c) && this.f18374b.equals(bleDevice.f18374b) && akd.m17052a(bleDevice.f18376d, this.f18376d) && akd.m17052a(this.f18377e, bleDevice.f18377e);
    }

    /* renamed from: a */
    public String m21758a() {
        return this.f18374b;
    }

    /* renamed from: b */
    public String m21756b() {
        return this.f18375c;
    }

    /* renamed from: c */
    public List<String> m21755c() {
        return this.f18376d;
    }

    /* renamed from: d */
    public List<DataType> m21754d() {
        return this.f18377e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m21753e() {
        return this.f18373a;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof BleDevice) && m21757a((BleDevice) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f18375c, this.f18374b, this.f18376d, this.f18377e);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("name", this.f18375c).m23632a("address", this.f18374b).m23632a("dataTypes", this.f18377e).m23632a("supportedProfiles", this.f18376d).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5150h.m21466a(this, parcel, i);
    }
}
