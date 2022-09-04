package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
/* loaded from: classes2.dex */
public final class ParticipantRef extends AbstractC4531j implements Participant {

    /* renamed from: h */
    private final PlayerRef f20173h;

    public ParticipantRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.f20173h = new PlayerRef(dataHolder, i);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: a */
    public void mo19480a(CharArrayBuffer charArrayBuffer) {
        if (i("external_player_id")) {
            a("default_display_name", charArrayBuffer);
        } else {
            this.f20173h.mo20736a(charArrayBuffer);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: c */
    public int mo19479c() {
        return c("player_status");
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: d */
    public String mo19478d() {
        return e("client_address");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: e */
    public int mo19477e() {
        return c("capabilities");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return ParticipantEntity.m19487a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: f */
    public boolean mo19476f() {
        return c("connected") > 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: g */
    public String mo19475g() {
        return i("external_player_id") ? e("default_display_name") : this.f20173h.mo20733d();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public String getHiResImageUrl() {
        return i("external_player_id") ? e("default_display_hi_res_image_url") : this.f20173h.getHiResImageUrl();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public String getIconImageUrl() {
        return i("external_player_id") ? e("default_display_image_url") : this.f20173h.getIconImageUrl();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: h */
    public Uri mo19474h() {
        return i("external_player_id") ? h("default_display_image_uri") : this.f20173h.mo20728i();
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return ParticipantEntity.m19488a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: i */
    public Uri mo19473i() {
        return i("external_player_id") ? h("default_display_hi_res_image_uri") : this.f20173h.mo20726k();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: j */
    public String mo19472j() {
        return e("external_participant_id");
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: k */
    public Player mo19471k() {
        if (i("external_player_id")) {
            return null;
        }
        return this.f20173h;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: l */
    public ParticipantResult mo19470l() {
        if (i("result_type")) {
            return null;
        }
        return new ParticipantResult(mo19472j(), c("result_type"), c("placing"));
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: m */
    public Participant mo7785a() {
        return new ParticipantEntity(this);
    }

    public String toString() {
        return ParticipantEntity.m19485b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((ParticipantEntity) ((Participant) mo7785a())).writeToParcel(parcel, i);
    }
}
