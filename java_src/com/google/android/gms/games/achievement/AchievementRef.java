package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4598n;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
/* loaded from: classes2.dex */
public final class AchievementRef extends AbstractC4531j implements Achievement {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AchievementRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: a */
    public void mo20646a(CharArrayBuffer charArrayBuffer) {
        a("name", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: b */
    public void mo20645b(CharArrayBuffer charArrayBuffer) {
        a("description", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: c */
    public String mo20644c() {
        return e("external_achievement_id");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: c */
    public void mo20643c(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (mo20642d() != 1) {
            z = false;
        }
        C4598n.m23593a(z);
        a("formatted_total_steps", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: d */
    public int mo20642d() {
        return c("type");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: d */
    public void mo20641d(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (mo20642d() != 1) {
            z = false;
        }
        C4598n.m23593a(z);
        a("formatted_current_steps", charArrayBuffer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: e */
    public String mo20640e() {
        return e("name");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: f */
    public String mo20639f() {
        return e("description");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: g */
    public Uri mo20638g() {
        return h("unlocked_icon_image_uri");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getRevealedImageUrl() {
        return e("revealed_icon_image_url");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getUnlockedImageUrl() {
        return e("unlocked_icon_image_url");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: h */
    public Uri mo20637h() {
        return h("revealed_icon_image_uri");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: i */
    public int mo20636i() {
        boolean z = true;
        if (mo20642d() != 1) {
            z = false;
        }
        C4598n.m23593a(z);
        return c("total_steps");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: j */
    public String mo20635j() {
        boolean z = true;
        if (mo20642d() != 1) {
            z = false;
        }
        C4598n.m23593a(z);
        return e("formatted_total_steps");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: k */
    public Player mo20634k() {
        return new PlayerRef(this.f16909c_, this.f16910d_);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: l */
    public int mo20633l() {
        return c(XiaomiOAuthConstants.EXTRA_STATE_2);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: m */
    public int mo20632m() {
        boolean z = true;
        if (mo20642d() != 1) {
            z = false;
        }
        C4598n.m23593a(z);
        return c("current_steps");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: n */
    public String mo20631n() {
        boolean z = true;
        if (mo20642d() != 1) {
            z = false;
        }
        C4598n.m23593a(z);
        return e("formatted_current_steps");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: o */
    public long mo20630o() {
        return b("last_updated_timestamp");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: p */
    public long mo20629p() {
        return (!m_("instance_xp_value") || i("instance_xp_value")) ? b("definition_xp_value") : b("instance_xp_value");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: q */
    public Achievement mo7785a() {
        return new AchievementEntity(this);
    }

    public String toString() {
        return AchievementEntity.m20653b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((AchievementEntity) ((Achievement) mo7785a())).writeToParcel(parcel, i);
    }
}
