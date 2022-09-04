package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4598n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4684g;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
/* loaded from: classes2.dex */
public final class AchievementEntity extends AbstractSafeParcelable implements Achievement {
    public static final Parcelable.Creator<AchievementEntity> CREATOR = new C5334b();

    /* renamed from: f */
    private final int f19328f;

    /* renamed from: g */
    private final String f19329g;

    /* renamed from: h */
    private final int f19330h;

    /* renamed from: i */
    private final String f19331i;

    /* renamed from: j */
    private final String f19332j;

    /* renamed from: k */
    private final Uri f19333k;

    /* renamed from: l */
    private final String f19334l;

    /* renamed from: m */
    private final Uri f19335m;

    /* renamed from: n */
    private final String f19336n;

    /* renamed from: o */
    private final int f19337o;

    /* renamed from: p */
    private final String f19338p;

    /* renamed from: q */
    private final PlayerEntity f19339q;

    /* renamed from: r */
    private final int f19340r;

    /* renamed from: s */
    private final int f19341s;

    /* renamed from: t */
    private final String f19342t;

    /* renamed from: u */
    private final long f19343u;

    /* renamed from: v */
    private final long f19344v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AchievementEntity(int i, String str, int i2, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i3, String str6, PlayerEntity playerEntity, int i4, int i5, String str7, long j, long j2) {
        this.f19328f = i;
        this.f19329g = str;
        this.f19330h = i2;
        this.f19331i = str2;
        this.f19332j = str3;
        this.f19333k = uri;
        this.f19334l = str4;
        this.f19335m = uri2;
        this.f19336n = str5;
        this.f19337o = i3;
        this.f19338p = str6;
        this.f19339q = playerEntity;
        this.f19340r = i4;
        this.f19341s = i5;
        this.f19342t = str7;
        this.f19343u = j;
        this.f19344v = j2;
    }

    public AchievementEntity(Achievement achievement) {
        this.f19328f = 1;
        this.f19329g = achievement.mo20644c();
        this.f19330h = achievement.mo20642d();
        this.f19331i = achievement.mo20640e();
        this.f19332j = achievement.mo20639f();
        this.f19333k = achievement.mo20638g();
        this.f19334l = achievement.getUnlockedImageUrl();
        this.f19335m = achievement.mo20637h();
        this.f19336n = achievement.getRevealedImageUrl();
        this.f19339q = (PlayerEntity) achievement.mo20634k().a();
        this.f19340r = achievement.mo20633l();
        this.f19343u = achievement.mo20630o();
        this.f19344v = achievement.mo20629p();
        if (achievement.mo20642d() == 1) {
            this.f19337o = achievement.mo20636i();
            this.f19338p = achievement.mo20635j();
            this.f19341s = achievement.mo20632m();
            this.f19342t = achievement.mo20631n();
        } else {
            this.f19337o = 0;
            this.f19338p = null;
            this.f19341s = 0;
            this.f19342t = null;
        }
        C4598n.m23595a((Object) this.f19329g);
        C4598n.m23595a((Object) this.f19332j);
    }

    /* renamed from: a */
    static int m20655a(Achievement achievement) {
        int i;
        int i2;
        if (achievement.mo20642d() == 1) {
            i2 = achievement.mo20632m();
            i = achievement.mo20636i();
        } else {
            i = 0;
            i2 = 0;
        }
        return C4585c.m23633a(achievement.mo20644c(), achievement.mo20640e(), Integer.valueOf(achievement.mo20642d()), achievement.mo20639f(), Long.valueOf(achievement.mo20629p()), Integer.valueOf(achievement.mo20633l()), Long.valueOf(achievement.mo20630o()), achievement.mo20634k(), Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: a */
    static boolean m20654a(Achievement achievement, Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof Achievement)) {
            return false;
        }
        if (achievement == obj) {
            return true;
        }
        Achievement achievement2 = (Achievement) obj;
        if (achievement.mo20642d() == 1) {
            z2 = C4585c.m23634a(Integer.valueOf(achievement2.mo20632m()), Integer.valueOf(achievement.mo20632m()));
            z = C4585c.m23634a(Integer.valueOf(achievement2.mo20636i()), Integer.valueOf(achievement.mo20636i()));
        } else {
            z = true;
            z2 = true;
        }
        return C4585c.m23634a(achievement2.mo20644c(), achievement.mo20644c()) && C4585c.m23634a(achievement2.mo20640e(), achievement.mo20640e()) && C4585c.m23634a(Integer.valueOf(achievement2.mo20642d()), Integer.valueOf(achievement.mo20642d())) && C4585c.m23634a(achievement2.mo20639f(), achievement.mo20639f()) && C4585c.m23634a(Long.valueOf(achievement2.mo20629p()), Long.valueOf(achievement.mo20629p())) && C4585c.m23634a(Integer.valueOf(achievement2.mo20633l()), Integer.valueOf(achievement.mo20633l())) && C4585c.m23634a(Long.valueOf(achievement2.mo20630o()), Long.valueOf(achievement.mo20630o())) && C4585c.m23634a(achievement2.mo20634k(), achievement.mo20634k()) && z2 && z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20653b(Achievement achievement) {
        C4585c.C4587a m23632a = C4585c.m23635a(achievement).m23632a("Id", achievement.mo20644c()).m23632a("Type", Integer.valueOf(achievement.mo20642d())).m23632a("Name", achievement.mo20640e()).m23632a("Description", achievement.mo20639f()).m23632a("Player", achievement.mo20634k()).m23632a("State", Integer.valueOf(achievement.mo20633l()));
        if (achievement.mo20642d() == 1) {
            m23632a.m23632a("CurrentSteps", Integer.valueOf(achievement.mo20632m()));
            m23632a.m23632a("TotalSteps", Integer.valueOf(achievement.mo20636i()));
        }
        return m23632a.toString();
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: a */
    public void mo20646a(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19331i, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: b */
    public void mo20645b(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19332j, charArrayBuffer);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: c */
    public String mo20644c() {
        return this.f19329g;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: c */
    public void mo20643c(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (mo20642d() != 1) {
            z = false;
        }
        C4598n.m23593a(z);
        C4684g.m23139a(this.f19338p, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: d */
    public int mo20642d() {
        return this.f19330h;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: d */
    public void mo20641d(CharArrayBuffer charArrayBuffer) {
        boolean z = true;
        if (mo20642d() != 1) {
            z = false;
        }
        C4598n.m23593a(z);
        C4684g.m23139a(this.f19342t, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: e */
    public String mo20640e() {
        return this.f19331i;
    }

    public boolean equals(Object obj) {
        return m20654a(this, obj);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: f */
    public String mo20639f() {
        return this.f19332j;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: g */
    public Uri mo20638g() {
        return this.f19333k;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getRevealedImageUrl() {
        return this.f19336n;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public String getUnlockedImageUrl() {
        return this.f19334l;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: h */
    public Uri mo20637h() {
        return this.f19335m;
    }

    public int hashCode() {
        return m20655a(this);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: i */
    public int mo20636i() {
        boolean z = true;
        if (mo20642d() != 1) {
            z = false;
        }
        C4598n.m23593a(z);
        return m20651r();
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: j */
    public String mo20635j() {
        boolean z = true;
        if (mo20642d() != 1) {
            z = false;
        }
        C4598n.m23593a(z);
        return m20650s();
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: k */
    public Player mo20634k() {
        return this.f19339q;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: l */
    public int mo20633l() {
        return this.f19340r;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: m */
    public int mo20632m() {
        boolean z = true;
        if (mo20642d() != 1) {
            z = false;
        }
        C4598n.m23593a(z);
        return m20649t();
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: n */
    public String mo20631n() {
        boolean z = true;
        if (mo20642d() != 1) {
            z = false;
        }
        C4598n.m23593a(z);
        return m20648u();
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: o */
    public long mo20630o() {
        return this.f19343u;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* renamed from: p */
    public long mo20629p() {
        return this.f19344v;
    }

    /* renamed from: q */
    public int m20652q() {
        return this.f19328f;
    }

    /* renamed from: r */
    public int m20651r() {
        return this.f19337o;
    }

    /* renamed from: s */
    public String m20650s() {
        return this.f19338p;
    }

    /* renamed from: t */
    public int m20649t() {
        return this.f19341s;
    }

    public String toString() {
        return m20653b(this);
    }

    /* renamed from: u */
    public String m20648u() {
        return this.f19342t;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: v */
    public Achievement mo7785a() {
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5334b.m20624a(this, parcel, i);
    }
}
