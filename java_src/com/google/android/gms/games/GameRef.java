package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.xiaomi.market.sdk.C10447l;
/* loaded from: classes2.dex */
public final class GameRef extends AbstractC4531j implements Game {
    public GameRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: a */
    public void mo20779a(CharArrayBuffer charArrayBuffer) {
        a("display_name", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: b */
    public void mo20778b(CharArrayBuffer charArrayBuffer) {
        a("game_description", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: c */
    public String mo20777c() {
        return e("external_game_id");
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: c */
    public void mo20776c(CharArrayBuffer charArrayBuffer) {
        a("developer_name", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: d */
    public String mo20775d() {
        return e("display_name");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: e */
    public String mo20774e() {
        return e("primary_category");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return GameEntity.m20786a(this, obj);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: f */
    public String mo20773f() {
        return e("secondary_category");
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: g */
    public String mo20772g() {
        return e("game_description");
    }

    @Override // com.google.android.gms.games.Game
    public String getFeaturedImageUrl() {
        return e("featured_image_url");
    }

    @Override // com.google.android.gms.games.Game
    public String getHiResImageUrl() {
        return e("game_hi_res_image_url");
    }

    @Override // com.google.android.gms.games.Game
    public String getIconImageUrl() {
        return e("game_icon_image_url");
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: h */
    public String mo20771h() {
        return e("developer_name");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return GameEntity.m20787a(this);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: i */
    public Uri mo20770i() {
        return h("game_icon_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: j */
    public Uri mo20769j() {
        return h("game_hi_res_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: k */
    public Uri mo20768k() {
        return h("featured_image_uri");
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: l */
    public boolean mo20767l() {
        return d("play_enabled_game");
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: m */
    public boolean mo20766m() {
        return d("muted");
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: n */
    public boolean mo20765n() {
        return d("identity_sharing_confirmed");
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: o */
    public boolean mo20764o() {
        return c("installed") > 0;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: p */
    public String mo20763p() {
        return e(C10447l.PACKAGE_NAME);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: q */
    public int mo20762q() {
        return c("achievement_total_count");
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: r */
    public int mo20761r() {
        return c("leaderboard_count");
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: s */
    public boolean mo20760s() {
        return c("real_time_support") > 0;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: t */
    public boolean mo20759t() {
        return c("turn_based_support") > 0;
    }

    public String toString() {
        return GameEntity.m20784b(this);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: u */
    public boolean mo20758u() {
        return c("snapshots_enabled") > 0;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: v */
    public String mo20757v() {
        return e("theme_color");
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: w */
    public boolean mo20756w() {
        return c("gamepad_support") > 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((GameEntity) ((Game) mo7785a())).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: x */
    public Game mo7785a() {
        return new GameEntity(this);
    }
}
