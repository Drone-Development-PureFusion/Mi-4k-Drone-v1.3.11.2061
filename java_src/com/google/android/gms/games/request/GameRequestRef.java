package com.google.android.gms.games.request;

import android.os.Parcel;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class GameRequestRef extends AbstractC4531j implements GameRequest {

    /* renamed from: g */
    private final int f20345g;

    public GameRequestRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f20345g = i2;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: a */
    public boolean mo19184a(String str) {
        return mo19173p_(str) == 1;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: d */
    public GameRequest mo7785a() {
        return new GameRequestEntity(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: e */
    public String mo19182e() {
        return e("external_request_id");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return GameRequestEntity.m19190a(this, obj);
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: f */
    public Game mo19181f() {
        return new GameRef(this.f16909c_, this.f16910d_);
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: g */
    public Player mo19180g() {
        return new PlayerRef(this.f16909c_, s_(), "sender_");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return GameRequestEntity.m19191a(this);
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: i */
    public byte[] mo19179i() {
        return g(UriUtil.DATA_SCHEME);
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: j */
    public int mo19178j() {
        return c("type");
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: k */
    public long mo19177k() {
        return b("creation_timestamp");
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: l */
    public long mo19176l() {
        return b("expiration_timestamp");
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: m */
    public int mo19175m() {
        return c("status");
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: o */
    public List<Player> mo19174o() {
        ArrayList arrayList = new ArrayList(this.f20345g);
        for (int i = 0; i < this.f20345g; i++) {
            arrayList.add(new PlayerRef(this.f16909c_, this.f16910d_ + i, "recipient_"));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.games.request.GameRequest
    /* renamed from: p_ */
    public int mo19173p_(String str) {
        for (int i = this.f16910d_; i < this.f16910d_ + this.f20345g; i++) {
            int m23898a = this.f16909c_.m23898a(i);
            if (this.f16909c_.m23886c("recipient_external_player_id", i, m23898a).equals(str)) {
                return this.f16909c_.m23888b("recipient_status", i, m23898a);
            }
        }
        return -1;
    }

    public String toString() {
        return GameRequestEntity.m19189b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((GameRequestEntity) ((GameRequest) mo7785a())).writeToParcel(parcel, i);
    }
}
