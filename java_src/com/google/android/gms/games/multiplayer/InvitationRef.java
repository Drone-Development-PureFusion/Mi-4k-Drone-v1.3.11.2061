package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class InvitationRef extends AbstractC4531j implements Invitation {

    /* renamed from: c */
    private final Game f20150c;

    /* renamed from: d */
    private final ParticipantRef f20151d;

    /* renamed from: e */
    private final ArrayList<Participant> f20152e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InvitationRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f20150c = new GameRef(dataHolder, i);
        this.f20152e = new ArrayList<>(i2);
        String e = e("external_inviter_id");
        ParticipantRef participantRef = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ParticipantRef participantRef2 = new ParticipantRef(this.f16909c_, this.f16910d_ + i3);
            if (participantRef2.mo19472j().equals(e)) {
                participantRef = participantRef2;
            }
            this.f20152e.add(participantRef2);
        }
        this.f20151d = (ParticipantRef) C4588d.m23626a(participantRef, "Must have a valid inviter!");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: d */
    public Invitation mo7785a() {
        return new InvitationEntity(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: e */
    public Game mo19495e() {
        return this.f20150c;
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return InvitationEntity.m19503a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: f */
    public String mo19494f() {
        return e("external_invitation_id");
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: g */
    public Participant mo19493g() {
        return this.f20151d;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: h */
    public long mo19492h() {
        return Math.max(b("creation_timestamp"), b("last_modified_timestamp"));
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return InvitationEntity.m19504a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: i */
    public int mo19491i() {
        return c("type");
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: j */
    public int mo19490j() {
        return c("variant");
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: k */
    public int mo19489k() {
        if (!d("has_automatch_criteria")) {
            return 0;
        }
        return c("automatch_max_players");
    }

    @Override // com.google.android.gms.games.multiplayer.AbstractC5948j
    /* renamed from: m */
    public ArrayList<Participant> mo19340m() {
        return this.f20152e;
    }

    public String toString() {
        return InvitationEntity.m19501b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((InvitationEntity) ((Invitation) mo7785a())).writeToParcel(parcel, i);
    }
}
