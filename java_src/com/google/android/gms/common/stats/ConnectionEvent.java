package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import p005b.p006a.p007a.p008a.p020j.C0324k;
/* loaded from: classes2.dex */
public final class ConnectionEvent extends StatsEvent {
    public static final Parcelable.Creator<ConnectionEvent> CREATOR = new C4668a();

    /* renamed from: a */
    final int f17230a;

    /* renamed from: b */
    private final long f17231b;

    /* renamed from: c */
    private int f17232c;

    /* renamed from: d */
    private final String f17233d;

    /* renamed from: e */
    private final String f17234e;

    /* renamed from: f */
    private final String f17235f;

    /* renamed from: g */
    private final String f17236g;

    /* renamed from: h */
    private final String f17237h;

    /* renamed from: i */
    private final String f17238i;

    /* renamed from: j */
    private final long f17239j;

    /* renamed from: k */
    private final long f17240k;

    /* renamed from: l */
    private long f17241l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectionEvent(int i, long j, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this.f17230a = i;
        this.f17231b = j;
        this.f17232c = i2;
        this.f17233d = str;
        this.f17234e = str2;
        this.f17235f = str3;
        this.f17236g = str4;
        this.f17241l = -1L;
        this.f17237h = str5;
        this.f17238i = str6;
        this.f17239j = j2;
        this.f17240k = j3;
    }

    public ConnectionEvent(long j, int i, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this(1, j, i, str, str2, str3, str4, str5, str6, j2, j3);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: a */
    public long mo23222a() {
        return this.f17231b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: b */
    public int mo23221b() {
        return this.f17232c;
    }

    /* renamed from: c */
    public String m23230c() {
        return this.f17233d;
    }

    /* renamed from: d */
    public String m23229d() {
        return this.f17234e;
    }

    /* renamed from: e */
    public String m23228e() {
        return this.f17235f;
    }

    /* renamed from: f */
    public String m23227f() {
        return this.f17236g;
    }

    /* renamed from: g */
    public String m23226g() {
        return this.f17237h;
    }

    /* renamed from: h */
    public String m23225h() {
        return this.f17238i;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: i */
    public long mo23214i() {
        return this.f17241l;
    }

    /* renamed from: j */
    public long m23224j() {
        return this.f17240k;
    }

    /* renamed from: k */
    public long m23223k() {
        return this.f17239j;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: l */
    public String mo23211l() {
        String valueOf = String.valueOf(C0324k.f324b);
        String valueOf2 = String.valueOf(m23230c());
        String valueOf3 = String.valueOf(m23229d());
        String valueOf4 = String.valueOf(C0324k.f324b);
        String valueOf5 = String.valueOf(m23228e());
        String valueOf6 = String.valueOf(m23227f());
        String valueOf7 = String.valueOf(C0324k.f324b);
        String str = this.f17237h == null ? "" : this.f17237h;
        String valueOf8 = String.valueOf(C0324k.f324b);
        return new StringBuilder(String.valueOf(valueOf).length() + 22 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(str).length() + String.valueOf(valueOf8).length()).append(valueOf).append(valueOf2).append("/").append(valueOf3).append(valueOf4).append(valueOf5).append("/").append(valueOf6).append(valueOf7).append(str).append(valueOf8).append(m23224j()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4668a.m23205a(this, parcel, i);
    }
}
