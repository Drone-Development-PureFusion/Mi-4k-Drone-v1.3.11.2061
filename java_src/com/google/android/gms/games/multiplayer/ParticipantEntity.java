package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.util.C4684g;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
/* loaded from: classes2.dex */
public final class ParticipantEntity extends GamesDowngradeableSafeParcel implements Participant {
    public static final Parcelable.Creator<ParticipantEntity> CREATOR = new C5937a();

    /* renamed from: h */
    private final int f20160h;

    /* renamed from: i */
    private final String f20161i;

    /* renamed from: j */
    private final String f20162j;

    /* renamed from: k */
    private final Uri f20163k;

    /* renamed from: l */
    private final Uri f20164l;

    /* renamed from: m */
    private final int f20165m;

    /* renamed from: n */
    private final String f20166n;

    /* renamed from: o */
    private final boolean f20167o;

    /* renamed from: p */
    private final PlayerEntity f20168p;

    /* renamed from: q */
    private final int f20169q;

    /* renamed from: r */
    private final ParticipantResult f20170r;

    /* renamed from: s */
    private final String f20171s;

    /* renamed from: t */
    private final String f20172t;

    /* renamed from: com.google.android.gms.games.multiplayer.ParticipantEntity$a */
    /* loaded from: classes2.dex */
    static final class C5937a extends C5945g {
        C5937a() {
        }

        @Override // com.google.android.gms.games.multiplayer.C5945g, android.os.Parcelable.Creator
        /* renamed from: a */
        public ParticipantEntity createFromParcel(Parcel parcel) {
            boolean z = true;
            if (ParticipantEntity.b(ParticipantEntity.q_()) || ParticipantEntity.j_(ParticipantEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Uri parse = readString3 == null ? null : Uri.parse(readString3);
            String readString4 = parcel.readString();
            Uri parse2 = readString4 == null ? null : Uri.parse(readString4);
            int readInt = parcel.readInt();
            String readString5 = parcel.readString();
            boolean z2 = parcel.readInt() > 0;
            if (parcel.readInt() <= 0) {
                z = false;
            }
            return new ParticipantEntity(3, readString, readString2, parse, parse2, readInt, readString5, z2, z ? PlayerEntity.CREATOR.createFromParcel(parcel) : null, 7, null, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ParticipantEntity(int i, String str, String str2, Uri uri, Uri uri2, int i2, String str3, boolean z, PlayerEntity playerEntity, int i3, ParticipantResult participantResult, String str4, String str5) {
        this.f20160h = i;
        this.f20161i = str;
        this.f20162j = str2;
        this.f20163k = uri;
        this.f20164l = uri2;
        this.f20165m = i2;
        this.f20166n = str3;
        this.f20167o = z;
        this.f20168p = playerEntity;
        this.f20169q = i3;
        this.f20170r = participantResult;
        this.f20171s = str4;
        this.f20172t = str5;
    }

    public ParticipantEntity(Participant participant) {
        this.f20160h = 3;
        this.f20161i = participant.mo19472j();
        this.f20162j = participant.mo19475g();
        this.f20163k = participant.mo19474h();
        this.f20164l = participant.mo19473i();
        this.f20165m = participant.mo19479c();
        this.f20166n = participant.mo19478d();
        this.f20167o = participant.mo19476f();
        Player mo19471k = participant.mo19471k();
        this.f20168p = mo19471k == null ? null : new PlayerEntity(mo19471k);
        this.f20169q = participant.mo19477e();
        this.f20170r = participant.mo19470l();
        this.f20171s = participant.getIconImageUrl();
        this.f20172t = participant.getHiResImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19488a(Participant participant) {
        return C4585c.m23633a(participant.mo19471k(), Integer.valueOf(participant.mo19479c()), participant.mo19478d(), Boolean.valueOf(participant.mo19476f()), participant.mo19475g(), participant.mo19474h(), participant.mo19473i(), Integer.valueOf(participant.mo19477e()), participant.mo19470l(), participant.mo19472j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19487a(Participant participant, Object obj) {
        if (!(obj instanceof Participant)) {
            return false;
        }
        if (participant == obj) {
            return true;
        }
        Participant participant2 = (Participant) obj;
        return C4585c.m23634a(participant2.mo19471k(), participant.mo19471k()) && C4585c.m23634a(Integer.valueOf(participant2.mo19479c()), Integer.valueOf(participant.mo19479c())) && C4585c.m23634a(participant2.mo19478d(), participant.mo19478d()) && C4585c.m23634a(Boolean.valueOf(participant2.mo19476f()), Boolean.valueOf(participant.mo19476f())) && C4585c.m23634a(participant2.mo19475g(), participant.mo19475g()) && C4585c.m23634a(participant2.mo19474h(), participant.mo19474h()) && C4585c.m23634a(participant2.mo19473i(), participant.mo19473i()) && C4585c.m23634a(Integer.valueOf(participant2.mo19477e()), Integer.valueOf(participant.mo19477e())) && C4585c.m23634a(participant2.mo19470l(), participant.mo19470l()) && C4585c.m23634a(participant2.mo19472j(), participant.mo19472j());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19485b(Participant participant) {
        return C4585c.m23635a(participant).m23632a("ParticipantId", participant.mo19472j()).m23632a("Player", participant.mo19471k()).m23632a("Status", Integer.valueOf(participant.mo19479c())).m23632a("ClientAddress", participant.mo19478d()).m23632a("ConnectedToRoom", Boolean.valueOf(participant.mo19476f())).m23632a("DisplayName", participant.mo19475g()).m23632a("IconImage", participant.mo19474h()).m23632a("IconImageUrl", participant.getIconImageUrl()).m23632a("HiResImage", participant.mo19473i()).m23632a("HiResImageUrl", participant.getHiResImageUrl()).m23632a("Capabilities", Integer.valueOf(participant.mo19477e())).m23632a("Result", participant.mo19470l()).toString();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: a */
    public void mo19480a(CharArrayBuffer charArrayBuffer) {
        if (this.f20168p == null) {
            C4684g.m23139a(this.f20162j, charArrayBuffer);
        } else {
            this.f20168p.mo20736a(charArrayBuffer);
        }
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: c */
    public int mo19479c() {
        return this.f20165m;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: d */
    public String mo19478d() {
        return this.f20166n;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: e */
    public int mo19477e() {
        return this.f20169q;
    }

    public boolean equals(Object obj) {
        return m19487a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: f */
    public boolean mo19476f() {
        return this.f20167o;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: g */
    public String mo19475g() {
        return this.f20168p == null ? this.f20162j : this.f20168p.mo20733d();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public String getHiResImageUrl() {
        return this.f20168p == null ? this.f20172t : this.f20168p.getHiResImageUrl();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    public String getIconImageUrl() {
        return this.f20168p == null ? this.f20171s : this.f20168p.getIconImageUrl();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: h */
    public Uri mo19474h() {
        return this.f20168p == null ? this.f20163k : this.f20168p.mo20728i();
    }

    public int hashCode() {
        return m19488a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: i */
    public Uri mo19473i() {
        return this.f20168p == null ? this.f20164l : this.f20168p.mo20726k();
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: j */
    public String mo19472j() {
        return this.f20161i;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: k */
    public Player mo19471k() {
        return this.f20168p;
    }

    @Override // com.google.android.gms.games.multiplayer.Participant
    /* renamed from: l */
    public ParticipantResult mo19470l() {
        return this.f20170r;
    }

    /* renamed from: m */
    public int m19483m() {
        return this.f20160h;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: n */
    public Participant mo7785a() {
        return this;
    }

    public String toString() {
        return m19485b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        int i2 = 0;
        if (!r_()) {
            C5945g.m19449a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f20161i);
        parcel.writeString(this.f20162j);
        parcel.writeString(this.f20163k == null ? null : this.f20163k.toString());
        if (this.f20164l != null) {
            str = this.f20164l.toString();
        }
        parcel.writeString(str);
        parcel.writeInt(this.f20165m);
        parcel.writeString(this.f20166n);
        parcel.writeInt(this.f20167o ? 1 : 0);
        if (this.f20168p != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (this.f20168p == null) {
            return;
        }
        this.f20168p.writeToParcel(parcel, i);
    }
}
