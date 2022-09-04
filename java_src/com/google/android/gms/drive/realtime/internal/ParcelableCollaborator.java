package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ParcelableCollaborator extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableCollaborator> CREATOR = new C5105q();

    /* renamed from: a */
    final int f18117a;

    /* renamed from: b */
    final boolean f18118b;

    /* renamed from: c */
    final boolean f18119c;

    /* renamed from: d */
    final String f18120d;

    /* renamed from: e */
    final String f18121e;

    /* renamed from: f */
    final String f18122f;

    /* renamed from: g */
    final String f18123g;

    /* renamed from: h */
    final String f18124h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ParcelableCollaborator(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5) {
        this.f18117a = i;
        this.f18118b = z;
        this.f18119c = z2;
        this.f18120d = str;
        this.f18121e = str2;
        this.f18122f = str3;
        this.f18123g = str4;
        this.f18124h = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelableCollaborator) {
            return this.f18120d.equals(((ParcelableCollaborator) obj).f18120d);
        }
        return false;
    }

    public int hashCode() {
        return this.f18120d.hashCode();
    }

    public String toString() {
        boolean z = this.f18118b;
        boolean z2 = this.f18119c;
        String str = this.f18120d;
        String str2 = this.f18121e;
        String str3 = this.f18122f;
        String str4 = this.f18123g;
        String str5 = this.f18124h;
        return new StringBuilder(String.valueOf(str).length() + 98 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length()).append("Collaborator [isMe=").append(z).append(", isAnonymous=").append(z2).append(", sessionId=").append(str).append(", userId=").append(str2).append(", displayName=").append(str3).append(", color=").append(str4).append(", photoUrl=").append(str5).append("]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5105q.m21813a(this, parcel, i);
    }
}
