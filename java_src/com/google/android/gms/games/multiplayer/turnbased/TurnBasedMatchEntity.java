package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4684g;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.AbstractC5942d;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class TurnBasedMatchEntity extends AbstractSafeParcelable implements TurnBasedMatch {
    public static final Parcelable.Creator<TurnBasedMatchEntity> CREATOR = new C5970f();

    /* renamed from: A */
    private final Bundle f20242A;

    /* renamed from: B */
    private final int f20243B;

    /* renamed from: C */
    private final boolean f20244C;

    /* renamed from: D */
    private final String f20245D;

    /* renamed from: E */
    private final String f20246E;

    /* renamed from: k */
    private final int f20247k;

    /* renamed from: l */
    private final GameEntity f20248l;

    /* renamed from: m */
    private final String f20249m;

    /* renamed from: n */
    private final String f20250n;

    /* renamed from: o */
    private final long f20251o;

    /* renamed from: p */
    private final String f20252p;

    /* renamed from: q */
    private final long f20253q;

    /* renamed from: r */
    private final String f20254r;

    /* renamed from: s */
    private final int f20255s;

    /* renamed from: t */
    private final int f20256t;

    /* renamed from: u */
    private final int f20257u;

    /* renamed from: v */
    private final byte[] f20258v;

    /* renamed from: w */
    private final ArrayList<ParticipantEntity> f20259w;

    /* renamed from: x */
    private final String f20260x;

    /* renamed from: y */
    private final byte[] f20261y;

    /* renamed from: z */
    private final int f20262z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TurnBasedMatchEntity(int i, GameEntity gameEntity, String str, String str2, long j, String str3, long j2, String str4, int i2, int i3, int i4, byte[] bArr, ArrayList<ParticipantEntity> arrayList, String str5, byte[] bArr2, int i5, Bundle bundle, int i6, boolean z, String str6, String str7) {
        this.f20247k = i;
        this.f20248l = gameEntity;
        this.f20249m = str;
        this.f20250n = str2;
        this.f20251o = j;
        this.f20252p = str3;
        this.f20253q = j2;
        this.f20254r = str4;
        this.f20255s = i2;
        this.f20243B = i6;
        this.f20256t = i3;
        this.f20257u = i4;
        this.f20258v = bArr;
        this.f20259w = arrayList;
        this.f20260x = str5;
        this.f20261y = bArr2;
        this.f20262z = i5;
        this.f20242A = bundle;
        this.f20244C = z;
        this.f20245D = str6;
        this.f20246E = str7;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnBasedMatch) {
        this.f20247k = 2;
        this.f20248l = new GameEntity(turnBasedMatch.mo19350c());
        this.f20249m = turnBasedMatch.mo19349d();
        this.f20250n = turnBasedMatch.mo19348e();
        this.f20251o = turnBasedMatch.mo19347f();
        this.f20252p = turnBasedMatch.mo19342k();
        this.f20253q = turnBasedMatch.mo19341l();
        this.f20254r = turnBasedMatch.mo19339n();
        this.f20255s = turnBasedMatch.mo19346g();
        this.f20243B = turnBasedMatch.mo19345h();
        this.f20256t = turnBasedMatch.mo19343j();
        this.f20257u = turnBasedMatch.mo19335p();
        this.f20260x = turnBasedMatch.mo19333r();
        this.f20262z = turnBasedMatch.mo19331t();
        this.f20242A = turnBasedMatch.mo19330u();
        this.f20244C = turnBasedMatch.mo19328w();
        this.f20245D = turnBasedMatch.mo19344i();
        this.f20246E = turnBasedMatch.mo19326y();
        byte[] mo19337o = turnBasedMatch.mo19337o();
        if (mo19337o == null) {
            this.f20258v = null;
        } else {
            this.f20258v = new byte[mo19337o.length];
            System.arraycopy(mo19337o, 0, this.f20258v, 0, mo19337o.length);
        }
        byte[] mo19332s = turnBasedMatch.mo19332s();
        if (mo19332s == null) {
            this.f20261y = null;
        } else {
            this.f20261y = new byte[mo19332s.length];
            System.arraycopy(mo19332s, 0, this.f20261y, 0, mo19332s.length);
        }
        ArrayList<Participant> m = turnBasedMatch.m();
        int size = m.size();
        this.f20259w = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.f20259w.add((ParticipantEntity) m.get(i).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19360a(TurnBasedMatch turnBasedMatch) {
        return C4585c.m23633a(turnBasedMatch.mo19350c(), turnBasedMatch.mo19349d(), turnBasedMatch.mo19348e(), Long.valueOf(turnBasedMatch.mo19347f()), turnBasedMatch.mo19342k(), Long.valueOf(turnBasedMatch.mo19341l()), turnBasedMatch.mo19339n(), Integer.valueOf(turnBasedMatch.mo19346g()), Integer.valueOf(turnBasedMatch.mo19345h()), turnBasedMatch.mo19344i(), Integer.valueOf(turnBasedMatch.mo19343j()), Integer.valueOf(turnBasedMatch.mo19335p()), turnBasedMatch.m(), turnBasedMatch.mo19333r(), Integer.valueOf(turnBasedMatch.mo19331t()), turnBasedMatch.mo19330u(), Integer.valueOf(turnBasedMatch.mo19329v()), Boolean.valueOf(turnBasedMatch.mo19328w()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19358a(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList<Participant> m = turnBasedMatch.m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Participant participant = m.get(i);
            if (participant.mo19472j().equals(str)) {
                return participant.mo19479c();
            }
        }
        String valueOf = String.valueOf(turnBasedMatch.mo19349d());
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf).length()).append("Participant ").append(str).append(" is not in match ").append(valueOf).toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19359a(TurnBasedMatch turnBasedMatch, Object obj) {
        if (!(obj instanceof TurnBasedMatch)) {
            return false;
        }
        if (turnBasedMatch == obj) {
            return true;
        }
        TurnBasedMatch turnBasedMatch2 = (TurnBasedMatch) obj;
        return C4585c.m23634a(turnBasedMatch2.mo19350c(), turnBasedMatch.mo19350c()) && C4585c.m23634a(turnBasedMatch2.mo19349d(), turnBasedMatch.mo19349d()) && C4585c.m23634a(turnBasedMatch2.mo19348e(), turnBasedMatch.mo19348e()) && C4585c.m23634a(Long.valueOf(turnBasedMatch2.mo19347f()), Long.valueOf(turnBasedMatch.mo19347f())) && C4585c.m23634a(turnBasedMatch2.mo19342k(), turnBasedMatch.mo19342k()) && C4585c.m23634a(Long.valueOf(turnBasedMatch2.mo19341l()), Long.valueOf(turnBasedMatch.mo19341l())) && C4585c.m23634a(turnBasedMatch2.mo19339n(), turnBasedMatch.mo19339n()) && C4585c.m23634a(Integer.valueOf(turnBasedMatch2.mo19346g()), Integer.valueOf(turnBasedMatch.mo19346g())) && C4585c.m23634a(Integer.valueOf(turnBasedMatch2.mo19345h()), Integer.valueOf(turnBasedMatch.mo19345h())) && C4585c.m23634a(turnBasedMatch2.mo19344i(), turnBasedMatch.mo19344i()) && C4585c.m23634a(Integer.valueOf(turnBasedMatch2.mo19343j()), Integer.valueOf(turnBasedMatch.mo19343j())) && C4585c.m23634a(Integer.valueOf(turnBasedMatch2.mo19335p()), Integer.valueOf(turnBasedMatch.mo19335p())) && C4585c.m23634a(turnBasedMatch2.m(), turnBasedMatch.m()) && C4585c.m23634a(turnBasedMatch2.mo19333r(), turnBasedMatch.mo19333r()) && C4585c.m23634a(Integer.valueOf(turnBasedMatch2.mo19331t()), Integer.valueOf(turnBasedMatch.mo19331t())) && C4585c.m23634a(turnBasedMatch2.mo19330u(), turnBasedMatch.mo19330u()) && C4585c.m23634a(Integer.valueOf(turnBasedMatch2.mo19329v()), Integer.valueOf(turnBasedMatch.mo19329v())) && C4585c.m23634a(Boolean.valueOf(turnBasedMatch2.mo19328w()), Boolean.valueOf(turnBasedMatch.mo19328w()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19357b(TurnBasedMatch turnBasedMatch) {
        return C4585c.m23635a(turnBasedMatch).m23632a("Game", turnBasedMatch.mo19350c()).m23632a("MatchId", turnBasedMatch.mo19349d()).m23632a("CreatorId", turnBasedMatch.mo19348e()).m23632a("CreationTimestamp", Long.valueOf(turnBasedMatch.mo19347f())).m23632a("LastUpdaterId", turnBasedMatch.mo19342k()).m23632a("LastUpdatedTimestamp", Long.valueOf(turnBasedMatch.mo19341l())).m23632a("PendingParticipantId", turnBasedMatch.mo19339n()).m23632a("MatchStatus", Integer.valueOf(turnBasedMatch.mo19346g())).m23632a("TurnStatus", Integer.valueOf(turnBasedMatch.mo19345h())).m23632a("Description", turnBasedMatch.mo19344i()).m23632a("Variant", Integer.valueOf(turnBasedMatch.mo19343j())).m23632a("Data", turnBasedMatch.mo19337o()).m23632a("Version", Integer.valueOf(turnBasedMatch.mo19335p())).m23632a("Participants", turnBasedMatch.m()).m23632a("RematchId", turnBasedMatch.mo19333r()).m23632a("PreviousData", turnBasedMatch.mo19332s()).m23632a("MatchNumber", Integer.valueOf(turnBasedMatch.mo19331t())).m23632a("AutoMatchCriteria", turnBasedMatch.mo19330u()).m23632a("AvailableAutoMatchSlots", Integer.valueOf(turnBasedMatch.mo19329v())).m23632a("LocallyModified", Boolean.valueOf(turnBasedMatch.mo19328w())).m23632a("DescriptionParticipantId", turnBasedMatch.mo19326y()).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19356b(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList<Participant> m = turnBasedMatch.m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Participant participant = m.get(i);
            Player mo19471k = participant.mo19471k();
            if (mo19471k != null && mo19471k.mo20734c().equals(str)) {
                return participant.mo19472j();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Participant m19354c(TurnBasedMatch turnBasedMatch, String str) {
        ArrayList<Participant> m = turnBasedMatch.m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            Participant participant = m.get(i);
            if (participant.mo19472j().equals(str)) {
                return participant;
            }
        }
        String valueOf = String.valueOf(turnBasedMatch.mo19349d());
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf).length()).append("Participant ").append(str).append(" is not in match ").append(valueOf).toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static ArrayList<String> m19355c(TurnBasedMatch turnBasedMatch) {
        ArrayList<Participant> m = turnBasedMatch.m();
        int size = m.size();
        ArrayList<String> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(m.get(i).mo19472j());
        }
        return arrayList;
    }

    /* renamed from: A */
    public int m19362A() {
        return this.f20247k;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: B */
    public TurnBasedMatch mo7785a() {
        return this;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: a */
    public int mo19351a(String str) {
        return m19358a((TurnBasedMatch) this, str);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: a */
    public void mo19352a(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f20245D, charArrayBuffer);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: c */
    public Game mo19350c() {
        return this.f20248l;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: d */
    public String mo19349d() {
        return this.f20249m;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: e */
    public String mo19348e() {
        return this.f20250n;
    }

    public boolean equals(Object obj) {
        return m19359a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: f */
    public long mo19347f() {
        return this.f20251o;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: g */
    public int mo19346g() {
        return this.f20255s;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: h */
    public int mo19345h() {
        return this.f20243B;
    }

    public int hashCode() {
        return m19360a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: i */
    public String mo19344i() {
        return this.f20245D;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: j */
    public int mo19343j() {
        return this.f20256t;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: k */
    public String mo19342k() {
        return this.f20252p;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: l */
    public long mo19341l() {
        return this.f20253q;
    }

    @Override // com.google.android.gms.games.multiplayer.AbstractC5948j
    /* renamed from: m */
    public ArrayList<Participant> mo19340m() {
        return new ArrayList<>(this.f20259w);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: n */
    public String mo19339n() {
        return this.f20254r;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: n_ */
    public String mo19338n_(String str) {
        return m19356b(this, str);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: o */
    public byte[] mo19337o() {
        return this.f20258v;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: o_ */
    public Participant mo19336o_(String str) {
        return m19354c(this, str);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: p */
    public int mo19335p() {
        return this.f20257u;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: q */
    public boolean mo19334q() {
        return this.f20255s == 2 && this.f20260x == null;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: r */
    public String mo19333r() {
        return this.f20260x;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: s */
    public byte[] mo19332s() {
        return this.f20261y;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: t */
    public int mo19331t() {
        return this.f20262z;
    }

    public String toString() {
        return m19357b(this);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: u */
    public Bundle mo19330u() {
        return this.f20242A;
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: v */
    public int mo19329v() {
        if (this.f20242A == null) {
            return 0;
        }
        return this.f20242A.getInt(AbstractC5942d.f20195j);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: w */
    public boolean mo19328w() {
        return this.f20244C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5970f.m19300a(this, parcel, i);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: x */
    public ArrayList<String> mo19327x() {
        return m19355c(this);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    /* renamed from: y */
    public String mo19326y() {
        return this.f20246E;
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
