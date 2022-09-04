package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.internal.p242b.C5651j;
/* loaded from: classes2.dex */
public final class ParticipantResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParticipantResult> CREATOR = new C5946h();

    /* renamed from: a */
    public static final int f20174a = -1;

    /* renamed from: b */
    public static final int f20175b = 0;

    /* renamed from: c */
    public static final int f20176c = 1;

    /* renamed from: d */
    public static final int f20177d = 2;

    /* renamed from: e */
    public static final int f20178e = 3;

    /* renamed from: f */
    public static final int f20179f = 4;

    /* renamed from: g */
    public static final int f20180g = 5;

    /* renamed from: h */
    public static final int f20181h = -1;

    /* renamed from: i */
    private final int f20182i;

    /* renamed from: j */
    private final String f20183j;

    /* renamed from: k */
    private final int f20184k;

    /* renamed from: l */
    private final int f20185l;

    public ParticipantResult(int i, String str, int i2, int i3) {
        this.f20182i = i;
        this.f20183j = (String) C4588d.m23627a(str);
        C4588d.m23623a(C5651j.m20228a(i2));
        this.f20184k = i2;
        this.f20185l = i3;
    }

    public ParticipantResult(String str, int i, int i2) {
        this(1, str, i, i2);
    }

    /* renamed from: a */
    public int m19468a() {
        return this.f20182i;
    }

    /* renamed from: b */
    public String m19467b() {
        return this.f20183j;
    }

    /* renamed from: c */
    public int m19466c() {
        return this.f20184k;
    }

    /* renamed from: d */
    public int m19465d() {
        return this.f20185l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5946h.m19446a(this, parcel, i);
    }
}
