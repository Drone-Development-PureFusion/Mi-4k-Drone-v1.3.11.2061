package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.AbstractC9452b;
import com.google.android.gms.wearable.AbstractC9635o;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public class CapabilityInfoParcelable extends AbstractSafeParcelable implements AbstractC9452b {
    public static final Parcelable.Creator<CapabilityInfoParcelable> CREATOR = new C9559bc();

    /* renamed from: a */
    final int f29881a;

    /* renamed from: c */
    private final String f29883c;

    /* renamed from: d */
    private final List<NodeParcelable> f29884d;

    /* renamed from: b */
    private final Object f29882b = new Object();

    /* renamed from: e */
    private Set<AbstractC9635o> f29885e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CapabilityInfoParcelable(int i, String str, List<NodeParcelable> list) {
        this.f29881a = i;
        this.f29883c = str;
        this.f29884d = list;
        m8076d();
    }

    /* renamed from: d */
    private void m8076d() {
        C4588d.m23627a(this.f29883c);
        C4588d.m23627a(this.f29884d);
    }

    @Override // com.google.android.gms.wearable.AbstractC9452b
    /* renamed from: a */
    public String mo7883a() {
        return this.f29883c;
    }

    @Override // com.google.android.gms.wearable.AbstractC9452b
    /* renamed from: b */
    public Set<AbstractC9635o> mo7882b() {
        Set<AbstractC9635o> set;
        synchronized (this.f29882b) {
            if (this.f29885e == null) {
                this.f29885e = new HashSet(this.f29884d);
            }
            set = this.f29885e;
        }
        return set;
    }

    /* renamed from: c */
    public List<NodeParcelable> m8077c() {
        return this.f29884d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        if (this.f29881a != capabilityInfoParcelable.f29881a) {
            return false;
        }
        if (this.f29883c == null ? capabilityInfoParcelable.f29883c != null : !this.f29883c.equals(capabilityInfoParcelable.f29883c)) {
            return false;
        }
        if (this.f29884d != null) {
            if (this.f29884d.equals(capabilityInfoParcelable.f29884d)) {
                return true;
            }
        } else if (capabilityInfoParcelable.f29884d == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f29883c != null ? this.f29883c.hashCode() : 0) + (this.f29881a * 31)) * 31;
        if (this.f29884d != null) {
            i = this.f29884d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f29883c;
        String valueOf = String.valueOf(this.f29884d);
        return new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(valueOf).length()).append("CapabilityInfo{").append(str).append(", ").append(valueOf).append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9559bc.m7875a(this, parcel, i);
    }
}
