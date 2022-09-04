package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* loaded from: classes2.dex */
public final class PlayerLevel implements SafeParcelable {
    public static final Parcelable.Creator<PlayerLevel> CREATOR = new C5934l();

    /* renamed from: a */
    private final int f19254a;

    /* renamed from: b */
    private final int f19255b;

    /* renamed from: c */
    private final long f19256c;

    /* renamed from: d */
    private final long f19257d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlayerLevel(int i, int i2, long j, long j2) {
        boolean z = true;
        C4588d.m23622a(j >= 0, "Min XP must be positive!");
        C4588d.m23622a(j2 <= j ? false : z, "Max XP must be more than min XP!");
        this.f19254a = i;
        this.f19255b = i2;
        this.f19256c = j;
        this.f19257d = j2;
    }

    public PlayerLevel(int i, long j, long j2) {
        this(1, i, j, j2);
    }

    /* renamed from: a */
    public int m20746a() {
        return this.f19254a;
    }

    /* renamed from: b */
    public int m20745b() {
        return this.f19255b;
    }

    /* renamed from: c */
    public long m20744c() {
        return this.f19256c;
    }

    /* renamed from: d */
    public long m20743d() {
        return this.f19257d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlayerLevel playerLevel = (PlayerLevel) obj;
        return C4585c.m23634a(Integer.valueOf(playerLevel.m20745b()), Integer.valueOf(m20745b())) && C4585c.m23634a(Long.valueOf(playerLevel.m20744c()), Long.valueOf(m20744c())) && C4585c.m23634a(Long.valueOf(playerLevel.m20743d()), Long.valueOf(m20743d()));
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f19255b), Long.valueOf(this.f19256c), Long.valueOf(this.f19257d));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("LevelNumber", Integer.valueOf(m20745b())).m23632a("MinXp", Long.valueOf(m20744c())).m23632a("MaxXp", Long.valueOf(m20743d())).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5934l.m19508a(this, parcel, i);
    }
}
