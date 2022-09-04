package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* loaded from: classes2.dex */
public final class PlayerLevelInfo implements SafeParcelable {
    public static final Parcelable.Creator<PlayerLevelInfo> CREATOR = new C5935m();

    /* renamed from: a */
    private final int f19258a;

    /* renamed from: b */
    private final long f19259b;

    /* renamed from: c */
    private final long f19260c;

    /* renamed from: d */
    private final PlayerLevel f19261d;

    /* renamed from: e */
    private final PlayerLevel f19262e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlayerLevelInfo(int i, long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        C4588d.m23623a(j != -1);
        C4588d.m23627a(playerLevel);
        C4588d.m23627a(playerLevel2);
        this.f19258a = i;
        this.f19259b = j;
        this.f19260c = j2;
        this.f19261d = playerLevel;
        this.f19262e = playerLevel2;
    }

    public PlayerLevelInfo(long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        this(1, j, j2, playerLevel, playerLevel2);
    }

    /* renamed from: a */
    public int m20742a() {
        return this.f19258a;
    }

    /* renamed from: b */
    public long m20741b() {
        return this.f19259b;
    }

    /* renamed from: c */
    public long m20740c() {
        return this.f19260c;
    }

    /* renamed from: d */
    public PlayerLevel m20739d() {
        return this.f19261d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public PlayerLevel m20738e() {
        return this.f19262e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return C4585c.m23634a(Long.valueOf(this.f19259b), Long.valueOf(playerLevelInfo.f19259b)) && C4585c.m23634a(Long.valueOf(this.f19260c), Long.valueOf(playerLevelInfo.f19260c)) && C4585c.m23634a(this.f19261d, playerLevelInfo.f19261d) && C4585c.m23634a(this.f19262e, playerLevelInfo.f19262e);
    }

    /* renamed from: f */
    public boolean m20737f() {
        return this.f19261d.equals(this.f19262e);
    }

    public int hashCode() {
        return C4585c.m23633a(Long.valueOf(this.f19259b), Long.valueOf(this.f19260c), this.f19261d, this.f19262e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5935m.m19505a(this, parcel, i);
    }
}
