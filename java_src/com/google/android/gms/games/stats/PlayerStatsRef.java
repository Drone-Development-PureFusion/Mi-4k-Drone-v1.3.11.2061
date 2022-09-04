package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4598n;
import com.xiaomi.mipush.sdk.Constants;
/* loaded from: classes2.dex */
public class PlayerStatsRef extends AbstractC4531j implements PlayerStats {

    /* renamed from: c */
    private Bundle f20423c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlayerStatsRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: c */
    public float mo19043c() {
        return f("ave_session_length_minutes");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: d */
    public float mo19042d() {
        return f("churn_probability");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: e */
    public int mo19041e() {
        return c("days_since_last_played");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return PlayerStatsEntity.m19047a(this, obj);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: f */
    public int mo19040f() {
        return c("num_purchases");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: g */
    public int mo19039g() {
        return c("num_sessions");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: h */
    public float mo19038h() {
        return f("num_sessions_percentile");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return PlayerStatsEntity.m19048a(this);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: i */
    public float mo19037i() {
        return f("spend_percentile");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: j */
    public float mo19036j() {
        if (!m_("spend_probability")) {
            return -1.0f;
        }
        return f("spend_probability");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: k */
    public float mo19035k() {
        if (!m_("high_spender_probability")) {
            return -1.0f;
        }
        return f("high_spender_probability");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: l */
    public float mo19034l() {
        if (!m_("total_spend_next_28_days")) {
            return -1.0f;
        }
        return f("total_spend_next_28_days");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    /* renamed from: m */
    public Bundle mo19033m() {
        if (this.f20423c != null) {
            return this.f20423c;
        }
        this.f20423c = new Bundle();
        String e = e("unknown_raw_keys");
        String e2 = e("unknown_raw_values");
        if (e != null && e2 != null) {
            String[] split = e.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            String[] split2 = e2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            C4598n.m23592a(split.length <= split2.length, "Invalid raw arguments!");
            for (int i = 0; i < split.length; i++) {
                this.f20423c.putString(split[i], split2[i]);
            }
        }
        return this.f20423c;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: n */
    public PlayerStats mo7785a() {
        return new PlayerStatsEntity(this);
    }

    public String toString() {
        return PlayerStatsEntity.m19046b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerStatsEntity) ((PlayerStats) mo7785a())).writeToParcel(parcel, i);
    }
}
