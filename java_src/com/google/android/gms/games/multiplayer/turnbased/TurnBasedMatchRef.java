package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class TurnBasedMatchRef extends AbstractC4531j implements TurnBasedMatch {

    /* renamed from: k */
    private final Game f20263k;

    /* renamed from: l */
    private final int f20264l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TurnBasedMatchRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f20263k = new GameRef(dataHolder, i);
        this.f20264l = i2;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: A */
    public TurnBasedMatch mo7785a() {
        return new TurnBasedMatchEntity(this);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: a */
    public int mo19351a(String str) {
        return TurnBasedMatchEntity.m19358a((TurnBasedMatch) this, str);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: a */
    public void mo19352a(CharArrayBuffer charArrayBuffer) {
        a("description", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: c */
    public Game mo19350c() {
        return this.f20263k;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: d */
    public String mo19349d() {
        return e("external_match_id");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: e */
    public String mo19348e() {
        return e("creator_external");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return TurnBasedMatchEntity.m19359a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: f */
    public long mo19347f() {
        return b("creation_timestamp");
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: g */
    public int mo19346g() {
        return c("status");
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: h */
    public int mo19345h() {
        return c("user_match_status");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return TurnBasedMatchEntity.m19360a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: i */
    public String mo19344i() {
        return e("description");
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: j */
    public int mo19343j() {
        return c("variant");
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: k */
    public String mo19342k() {
        return e("last_updater_external");
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: l */
    public long mo19341l() {
        return b("last_updated_timestamp");
    }

    @Override // com.google.android.gms.games.multiplayer.AbstractC5948j
    /* renamed from: m */
    public ArrayList<Participant> mo19340m() {
        ArrayList<Participant> arrayList = new ArrayList<>(this.f20264l);
        for (int i = 0; i < this.f20264l; i++) {
            arrayList.add(new ParticipantRef(this.f16909c_, this.f16910d_ + i));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: n */
    public String mo19339n() {
        return e("pending_participant_external");
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: n_ */
    public String mo19338n_(String str) {
        return TurnBasedMatchEntity.m19356b(this, str);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: o */
    public byte[] mo19337o() {
        return g(UriUtil.DATA_SCHEME);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: o_ */
    public Participant mo19336o_(String str) {
        return TurnBasedMatchEntity.m19354c(this, str);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: p */
    public int mo19335p() {
        return c("version");
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: q */
    public boolean mo19334q() {
        return mo19345h() == 3 && mo19333r() == null && mo19340m().size() > 1;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: r */
    public String mo19333r() {
        return e("rematch_id");
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: s */
    public byte[] mo19332s() {
        return g("previous_match_data");
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: t */
    public int mo19331t() {
        return c("match_number");
    }

    public String toString() {
        return TurnBasedMatchEntity.m19357b(this);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: u */
    public Bundle mo19330u() {
        if (!d("has_automatch_criteria")) {
            return null;
        }
        return AbstractC5966d.m19313a(c("automatch_min_players"), c("automatch_max_players"), b("automatch_bit_mask"));
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: v */
    public int mo19329v() {
        if (!d("has_automatch_criteria")) {
            return 0;
        }
        return c("automatch_max_players");
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: w */
    public boolean mo19328w() {
        return d("upsync_required");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((TurnBasedMatchEntity) ((TurnBasedMatch) mo7785a())).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: x */
    public ArrayList<String> mo19327x() {
        return TurnBasedMatchEntity.m19355c(this);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: y */
    public String mo19326y() {
        return e("description_participant_id");
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: z */
    public Participant mo19325z() {
        String mo19326y = mo19326y();
        if (mo19326y == null) {
            return null;
        }
        return mo19336o_(mo19326y);
    }
}
