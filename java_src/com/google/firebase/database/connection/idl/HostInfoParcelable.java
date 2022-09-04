package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.C7101hp;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class HostInfoParcelable extends AbstractSafeParcelable {
    public static final C9846d CREATOR = new C9846d();

    /* renamed from: a */
    final int f30689a;

    /* renamed from: b */
    final String f30690b;

    /* renamed from: c */
    final String f30691c;

    /* renamed from: d */
    final boolean f30692d;

    public HostInfoParcelable(int i, String str, String str2, boolean z) {
        this.f30689a = i;
        this.f30690b = str;
        this.f30691c = str2;
        this.f30692d = z;
    }

    /* renamed from: a */
    public static C7101hp m6845a(HostInfoParcelable hostInfoParcelable) {
        return new C7101hp(hostInfoParcelable.f30690b, hostInfoParcelable.f30691c, hostInfoParcelable.f30692d);
    }

    /* renamed from: a */
    public static HostInfoParcelable m6846a(C7101hp c7101hp) {
        return new HostInfoParcelable(1, c7101hp.m15573a(), c7101hp.m15571b(), c7101hp.m15570c());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9846d.m6794a(this, parcel, i);
    }
}
