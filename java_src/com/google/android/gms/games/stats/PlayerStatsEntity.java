package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class PlayerStatsEntity extends AbstractSafeParcelable implements PlayerStats {
    public static final Parcelable.Creator<PlayerStatsEntity> CREATOR = new C6027b();

    /* renamed from: b */
    private final int f20411b;

    /* renamed from: c */
    private final float f20412c;

    /* renamed from: d */
    private final float f20413d;

    /* renamed from: e */
    private final int f20414e;

    /* renamed from: f */
    private final int f20415f;

    /* renamed from: g */
    private final int f20416g;

    /* renamed from: h */
    private final float f20417h;

    /* renamed from: i */
    private final float f20418i;

    /* renamed from: j */
    private final Bundle f20419j;

    /* renamed from: k */
    private final float f20420k;

    /* renamed from: l */
    private final float f20421l;

    /* renamed from: m */
    private final float f20422m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlayerStatsEntity(int i, float f, float f2, int i2, int i3, int i4, float f3, float f4, Bundle bundle, float f5, float f6, float f7) {
        this.f20411b = i;
        this.f20412c = f;
        this.f20413d = f2;
        this.f20414e = i2;
        this.f20415f = i3;
        this.f20416g = i4;
        this.f20417h = f3;
        this.f20418i = f4;
        this.f20419j = bundle;
        this.f20420k = f5;
        this.f20421l = f6;
        this.f20422m = f7;
    }

    public PlayerStatsEntity(PlayerStats playerStats) {
        this.f20411b = 4;
        this.f20412c = playerStats.mo19043c();
        this.f20413d = playerStats.mo19042d();
        this.f20414e = playerStats.mo19041e();
        this.f20415f = playerStats.mo19040f();
        this.f20416g = playerStats.mo19039g();
        this.f20417h = playerStats.mo19038h();
        this.f20418i = playerStats.mo19037i();
        this.f20420k = playerStats.mo19036j();
        this.f20421l = playerStats.mo19035k();
        this.f20422m = playerStats.mo19034l();
        this.f20419j = playerStats.mo19033m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19048a(PlayerStats playerStats) {
        return C4585c.m23633a(Float.valueOf(playerStats.mo19043c()), Float.valueOf(playerStats.mo19042d()), Integer.valueOf(playerStats.mo19041e()), Integer.valueOf(playerStats.mo19040f()), Integer.valueOf(playerStats.mo19039g()), Float.valueOf(playerStats.mo19038h()), Float.valueOf(playerStats.mo19037i()), Float.valueOf(playerStats.mo19036j()), Float.valueOf(playerStats.mo19035k()), Float.valueOf(playerStats.mo19034l()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19047a(PlayerStats playerStats, Object obj) {
        if (!(obj instanceof PlayerStats)) {
            return false;
        }
        if (playerStats == obj) {
            return true;
        }
        PlayerStats playerStats2 = (PlayerStats) obj;
        return C4585c.m23634a(Float.valueOf(playerStats2.mo19043c()), Float.valueOf(playerStats.mo19043c())) && C4585c.m23634a(Float.valueOf(playerStats2.mo19042d()), Float.valueOf(playerStats.mo19042d())) && C4585c.m23634a(Integer.valueOf(playerStats2.mo19041e()), Integer.valueOf(playerStats.mo19041e())) && C4585c.m23634a(Integer.valueOf(playerStats2.mo19040f()), Integer.valueOf(playerStats.mo19040f())) && C4585c.m23634a(Integer.valueOf(playerStats2.mo19039g()), Integer.valueOf(playerStats.mo19039g())) && C4585c.m23634a(Float.valueOf(playerStats2.mo19038h()), Float.valueOf(playerStats.mo19038h())) && C4585c.m23634a(Float.valueOf(playerStats2.mo19037i()), Float.valueOf(playerStats.mo19037i())) && C4585c.m23634a(Float.valueOf(playerStats2.mo19036j()), Float.valueOf(playerStats.mo19036j())) && C4585c.m23634a(Float.valueOf(playerStats2.mo19035k()), Float.valueOf(playerStats.mo19035k())) && C4585c.m23634a(Float.valueOf(playerStats2.mo19034l()), Float.valueOf(playerStats.mo19034l()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19046b(PlayerStats playerStats) {
        return C4585c.m23635a(playerStats).m23632a("AverageSessionLength", Float.valueOf(playerStats.mo19043c())).m23632a("ChurnProbability", Float.valueOf(playerStats.mo19042d())).m23632a("DaysSinceLastPlayed", Integer.valueOf(playerStats.mo19041e())).m23632a("NumberOfPurchases", Integer.valueOf(playerStats.mo19040f())).m23632a("NumberOfSessions", Integer.valueOf(playerStats.mo19039g())).m23632a("SessionPercentile", Float.valueOf(playerStats.mo19038h())).m23632a("SpendPercentile", Float.valueOf(playerStats.mo19037i())).m23632a("SpendProbability", Float.valueOf(playerStats.mo19036j())).m23632a("HighSpenderProbability", Float.valueOf(playerStats.mo19035k())).m23632a("TotalSpendNext28Days", Float.valueOf(playerStats.mo19034l())).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: c */
    public float mo19043c() {
        return this.f20412c;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: d */
    public float mo19042d() {
        return this.f20413d;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: e */
    public int mo19041e() {
        return this.f20414e;
    }

    public boolean equals(Object obj) {
        return m19047a(this, obj);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: f */
    public int mo19040f() {
        return this.f20415f;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: g */
    public int mo19039g() {
        return this.f20416g;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: h */
    public float mo19038h() {
        return this.f20417h;
    }

    public int hashCode() {
        return m19048a(this);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: i */
    public float mo19037i() {
        return this.f20418i;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: j */
    public float mo19036j() {
        return this.f20420k;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: k */
    public float mo19035k() {
        return this.f20421l;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: l */
    public float mo19034l() {
        return this.f20422m;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: m */
    public Bundle mo19033m() {
        return this.f20419j;
    }

    /* renamed from: n */
    public int m19045n() {
        return this.f20411b;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: o */
    public PlayerStats mo7785a() {
        return this;
    }

    public String toString() {
        return m19046b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6027b.m19028a(this, parcel, i);
    }
}
