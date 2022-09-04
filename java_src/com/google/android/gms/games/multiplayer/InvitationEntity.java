package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class InvitationEntity extends GamesDowngradeableSafeParcel implements Invitation {
    public static final Parcelable.Creator<InvitationEntity> CREATOR = new C5936a();

    /* renamed from: c */
    private final int f20141c;

    /* renamed from: d */
    private final GameEntity f20142d;

    /* renamed from: e */
    private final String f20143e;

    /* renamed from: f */
    private final long f20144f;

    /* renamed from: g */
    private final int f20145g;

    /* renamed from: h */
    private final ParticipantEntity f20146h;

    /* renamed from: i */
    private final ArrayList<ParticipantEntity> f20147i;

    /* renamed from: j */
    private final int f20148j;

    /* renamed from: k */
    private final int f20149k;

    /* renamed from: com.google.android.gms.games.multiplayer.InvitationEntity$a */
    /* loaded from: classes2.dex */
    static final class C5936a extends C5939b {
        C5936a() {
        }

        @Override // com.google.android.gms.games.multiplayer.C5939b, android.os.Parcelable.Creator
        /* renamed from: a */
        public InvitationEntity createFromParcel(Parcel parcel) {
            if (InvitationEntity.b(InvitationEntity.q_()) || InvitationEntity.j_(InvitationEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            GameEntity createFromParcel = GameEntity.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ParticipantEntity createFromParcel2 = ParticipantEntity.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new InvitationEntity(2, createFromParcel, readString, readLong, readInt, createFromParcel2, arrayList, -1, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InvitationEntity(int i, GameEntity gameEntity, String str, long j, int i2, ParticipantEntity participantEntity, ArrayList<ParticipantEntity> arrayList, int i3, int i4) {
        this.f20141c = i;
        this.f20142d = gameEntity;
        this.f20143e = str;
        this.f20144f = j;
        this.f20145g = i2;
        this.f20146h = participantEntity;
        this.f20147i = arrayList;
        this.f20148j = i3;
        this.f20149k = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InvitationEntity(Invitation invitation) {
        this.f20141c = 2;
        this.f20142d = new GameEntity(invitation.mo19495e());
        this.f20143e = invitation.mo19494f();
        this.f20144f = invitation.mo19492h();
        this.f20145g = invitation.mo19491i();
        this.f20148j = invitation.mo19490j();
        this.f20149k = invitation.mo19489k();
        String mo19472j = invitation.mo19493g().mo19472j();
        Participant participant = null;
        ArrayList<Participant> m = invitation.m();
        int size = m.size();
        this.f20147i = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Participant participant2 = m.get(i);
            if (participant2.mo19472j().equals(mo19472j)) {
                participant = participant2;
            }
            this.f20147i.add((ParticipantEntity) participant2.a());
        }
        C4588d.m23626a(participant, "Must have a valid inviter!");
        this.f20146h = (ParticipantEntity) participant.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19504a(Invitation invitation) {
        return C4585c.m23633a(invitation.mo19495e(), invitation.mo19494f(), Long.valueOf(invitation.mo19492h()), Integer.valueOf(invitation.mo19491i()), invitation.mo19493g(), invitation.m(), Integer.valueOf(invitation.mo19490j()), Integer.valueOf(invitation.mo19489k()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19503a(Invitation invitation, Object obj) {
        if (!(obj instanceof Invitation)) {
            return false;
        }
        if (invitation == obj) {
            return true;
        }
        Invitation invitation2 = (Invitation) obj;
        return C4585c.m23634a(invitation2.mo19495e(), invitation.mo19495e()) && C4585c.m23634a(invitation2.mo19494f(), invitation.mo19494f()) && C4585c.m23634a(Long.valueOf(invitation2.mo19492h()), Long.valueOf(invitation.mo19492h())) && C4585c.m23634a(Integer.valueOf(invitation2.mo19491i()), Integer.valueOf(invitation.mo19491i())) && C4585c.m23634a(invitation2.mo19493g(), invitation.mo19493g()) && C4585c.m23634a(invitation2.m(), invitation.m()) && C4585c.m23634a(Integer.valueOf(invitation2.mo19490j()), Integer.valueOf(invitation.mo19490j())) && C4585c.m23634a(Integer.valueOf(invitation2.mo19489k()), Integer.valueOf(invitation.mo19489k()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19501b(Invitation invitation) {
        return C4585c.m23635a(invitation).m23632a("Game", invitation.mo19495e()).m23632a("InvitationId", invitation.mo19494f()).m23632a("CreationTimestamp", Long.valueOf(invitation.mo19492h())).m23632a("InvitationType", Integer.valueOf(invitation.mo19491i())).m23632a("Inviter", invitation.mo19493g()).m23632a("Participants", invitation.m()).m23632a("Variant", Integer.valueOf(invitation.mo19490j())).m23632a("AvailableAutoMatchSlots", Integer.valueOf(invitation.mo19489k())).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: e */
    public Game mo19495e() {
        return this.f20142d;
    }

    public boolean equals(Object obj) {
        return m19503a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: f */
    public String mo19494f() {
        return this.f20143e;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: g */
    public Participant mo19493g() {
        return this.f20146h;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: h */
    public long mo19492h() {
        return this.f20144f;
    }

    public int hashCode() {
        return m19504a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: i */
    public int mo19491i() {
        return this.f20145g;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: j */
    public int mo19490j() {
        return this.f20148j;
    }

    @Override // com.google.android.gms.games.multiplayer.Invitation
    /* renamed from: k */
    public int mo19489k() {
        return this.f20149k;
    }

    /* renamed from: l */
    public int m19499l() {
        return this.f20141c;
    }

    @Override // com.google.android.gms.games.multiplayer.AbstractC5948j
    /* renamed from: m */
    public ArrayList<Participant> mo19340m() {
        return new ArrayList<>(this.f20147i);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: n */
    public Invitation mo7785a() {
        return this;
    }

    public String toString() {
        return m19501b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!r_()) {
            C5939b.m19461a(this, parcel, i);
            return;
        }
        this.f20142d.writeToParcel(parcel, i);
        parcel.writeString(this.f20143e);
        parcel.writeLong(this.f20144f);
        parcel.writeInt(this.f20145g);
        this.f20146h.writeToParcel(parcel, i);
        int size = this.f20147i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f20147i.get(i2).writeToParcel(parcel, i);
        }
    }
}
