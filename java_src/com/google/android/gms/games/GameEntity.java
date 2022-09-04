package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.util.C4684g;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
/* loaded from: classes2.dex */
public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    public static final Parcelable.Creator<GameEntity> CREATOR = new C5309a();

    /* renamed from: a */
    private final int f19202a;

    /* renamed from: b */
    private final String f19203b;

    /* renamed from: c */
    private final String f19204c;

    /* renamed from: d */
    private final String f19205d;

    /* renamed from: e */
    private final String f19206e;

    /* renamed from: f */
    private final String f19207f;

    /* renamed from: g */
    private final String f19208g;

    /* renamed from: h */
    private final Uri f19209h;

    /* renamed from: i */
    private final Uri f19210i;

    /* renamed from: j */
    private final Uri f19211j;

    /* renamed from: k */
    private final boolean f19212k;

    /* renamed from: l */
    private final boolean f19213l;

    /* renamed from: m */
    private final String f19214m;

    /* renamed from: n */
    private final int f19215n;

    /* renamed from: o */
    private final int f19216o;

    /* renamed from: p */
    private final int f19217p;

    /* renamed from: q */
    private final boolean f19218q;

    /* renamed from: r */
    private final boolean f19219r;

    /* renamed from: s */
    private final String f19220s;

    /* renamed from: t */
    private final String f19221t;

    /* renamed from: u */
    private final String f19222u;

    /* renamed from: v */
    private final boolean f19223v;

    /* renamed from: w */
    private final boolean f19224w;

    /* renamed from: x */
    private final boolean f19225x;

    /* renamed from: y */
    private final String f19226y;

    /* renamed from: z */
    private final boolean f19227z;

    /* renamed from: com.google.android.gms.games.GameEntity$a */
    /* loaded from: classes2.dex */
    static final class C5309a extends C5354b {
        C5309a() {
        }

        @Override // com.google.android.gms.games.C5354b, android.os.Parcelable.Creator
        /* renamed from: a */
        public GameEntity createFromParcel(Parcel parcel) {
            if (GameEntity.b(GameEntity.q_()) || GameEntity.j_(GameEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Uri parse = readString7 == null ? null : Uri.parse(readString7);
            String readString8 = parcel.readString();
            Uri parse2 = readString8 == null ? null : Uri.parse(readString8);
            String readString9 = parcel.readString();
            return new GameEntity(7, readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString9 == null ? null : Uri.parse(readString9), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GameEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i2, int i3, int i4, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, String str11, boolean z8) {
        this.f19202a = i;
        this.f19203b = str;
        this.f19204c = str2;
        this.f19205d = str3;
        this.f19206e = str4;
        this.f19207f = str5;
        this.f19208g = str6;
        this.f19209h = uri;
        this.f19220s = str8;
        this.f19210i = uri2;
        this.f19221t = str9;
        this.f19211j = uri3;
        this.f19222u = str10;
        this.f19212k = z;
        this.f19213l = z2;
        this.f19214m = str7;
        this.f19215n = i2;
        this.f19216o = i3;
        this.f19217p = i4;
        this.f19218q = z3;
        this.f19219r = z4;
        this.f19223v = z5;
        this.f19224w = z6;
        this.f19225x = z7;
        this.f19226y = str11;
        this.f19227z = z8;
    }

    public GameEntity(Game game) {
        this.f19202a = 7;
        this.f19203b = game.mo20777c();
        this.f19205d = game.mo20774e();
        this.f19206e = game.mo20773f();
        this.f19207f = game.mo20772g();
        this.f19208g = game.mo20771h();
        this.f19204c = game.mo20775d();
        this.f19209h = game.mo20770i();
        this.f19220s = game.getIconImageUrl();
        this.f19210i = game.mo20769j();
        this.f19221t = game.getHiResImageUrl();
        this.f19211j = game.mo20768k();
        this.f19222u = game.getFeaturedImageUrl();
        this.f19212k = game.mo20767l();
        this.f19213l = game.mo20764o();
        this.f19214m = game.mo20763p();
        this.f19215n = 1;
        this.f19216o = game.mo20762q();
        this.f19217p = game.mo20761r();
        this.f19218q = game.mo20760s();
        this.f19219r = game.mo20759t();
        this.f19223v = game.mo20766m();
        this.f19224w = game.mo20765n();
        this.f19225x = game.mo20758u();
        this.f19226y = game.mo20757v();
        this.f19227z = game.mo20756w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20787a(Game game) {
        return C4585c.m23633a(game.mo20777c(), game.mo20775d(), game.mo20774e(), game.mo20773f(), game.mo20772g(), game.mo20771h(), game.mo20770i(), game.mo20769j(), game.mo20768k(), Boolean.valueOf(game.mo20767l()), Boolean.valueOf(game.mo20764o()), game.mo20763p(), Integer.valueOf(game.mo20762q()), Integer.valueOf(game.mo20761r()), Boolean.valueOf(game.mo20760s()), Boolean.valueOf(game.mo20759t()), Boolean.valueOf(game.mo20766m()), Boolean.valueOf(game.mo20765n()), Boolean.valueOf(game.mo20758u()), game.mo20757v(), Boolean.valueOf(game.mo20756w()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20786a(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        if (C4585c.m23634a(game2.mo20777c(), game.mo20777c()) && C4585c.m23634a(game2.mo20775d(), game.mo20775d()) && C4585c.m23634a(game2.mo20774e(), game.mo20774e()) && C4585c.m23634a(game2.mo20773f(), game.mo20773f()) && C4585c.m23634a(game2.mo20772g(), game.mo20772g()) && C4585c.m23634a(game2.mo20771h(), game.mo20771h()) && C4585c.m23634a(game2.mo20770i(), game.mo20770i()) && C4585c.m23634a(game2.mo20769j(), game.mo20769j()) && C4585c.m23634a(game2.mo20768k(), game.mo20768k()) && C4585c.m23634a(Boolean.valueOf(game2.mo20767l()), Boolean.valueOf(game.mo20767l())) && C4585c.m23634a(Boolean.valueOf(game2.mo20764o()), Boolean.valueOf(game.mo20764o())) && C4585c.m23634a(game2.mo20763p(), game.mo20763p()) && C4585c.m23634a(Integer.valueOf(game2.mo20762q()), Integer.valueOf(game.mo20762q())) && C4585c.m23634a(Integer.valueOf(game2.mo20761r()), Integer.valueOf(game.mo20761r())) && C4585c.m23634a(Boolean.valueOf(game2.mo20760s()), Boolean.valueOf(game.mo20760s()))) {
            if (C4585c.m23634a(Boolean.valueOf(game2.mo20759t()), Boolean.valueOf(game.mo20759t() && C4585c.m23634a(Boolean.valueOf(game2.mo20766m()), Boolean.valueOf(game.mo20766m())) && C4585c.m23634a(Boolean.valueOf(game2.mo20765n()), Boolean.valueOf(game.mo20765n())))) && C4585c.m23634a(Boolean.valueOf(game2.mo20758u()), Boolean.valueOf(game.mo20758u())) && C4585c.m23634a(game2.mo20757v(), game.mo20757v()) && C4585c.m23634a(Boolean.valueOf(game2.mo20756w()), Boolean.valueOf(game.mo20756w()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20784b(Game game) {
        return C4585c.m23635a(game).m23632a("ApplicationId", game.mo20777c()).m23632a("DisplayName", game.mo20775d()).m23632a("PrimaryCategory", game.mo20774e()).m23632a("SecondaryCategory", game.mo20773f()).m23632a("Description", game.mo20772g()).m23632a("DeveloperName", game.mo20771h()).m23632a("IconImageUri", game.mo20770i()).m23632a("IconImageUrl", game.getIconImageUrl()).m23632a("HiResImageUri", game.mo20769j()).m23632a("HiResImageUrl", game.getHiResImageUrl()).m23632a("FeaturedImageUri", game.mo20768k()).m23632a("FeaturedImageUrl", game.getFeaturedImageUrl()).m23632a("PlayEnabledGame", Boolean.valueOf(game.mo20767l())).m23632a("InstanceInstalled", Boolean.valueOf(game.mo20764o())).m23632a("InstancePackageName", game.mo20763p()).m23632a("AchievementTotalCount", Integer.valueOf(game.mo20762q())).m23632a("LeaderboardCount", Integer.valueOf(game.mo20761r())).m23632a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.mo20760s())).m23632a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.mo20759t())).m23632a("AreSnapshotsEnabled", Boolean.valueOf(game.mo20758u())).m23632a("ThemeColor", game.mo20757v()).m23632a("HasGamepadSupport", Boolean.valueOf(game.mo20756w())).toString();
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: a */
    public void mo20779a(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19204c, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: b */
    public void mo20778b(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19207f, charArrayBuffer);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: c */
    public String mo20777c() {
        return this.f19203b;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: c */
    public void mo20776c(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19208g, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: d */
    public String mo20775d() {
        return this.f19204c;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: e */
    public String mo20774e() {
        return this.f19205d;
    }

    public boolean equals(Object obj) {
        return m20786a(this, obj);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: f */
    public String mo20773f() {
        return this.f19206e;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: g */
    public String mo20772g() {
        return this.f19207f;
    }

    @Override // com.google.android.gms.games.Game
    public String getFeaturedImageUrl() {
        return this.f19222u;
    }

    @Override // com.google.android.gms.games.Game
    public String getHiResImageUrl() {
        return this.f19221t;
    }

    @Override // com.google.android.gms.games.Game
    public String getIconImageUrl() {
        return this.f19220s;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: h */
    public String mo20771h() {
        return this.f19208g;
    }

    public int hashCode() {
        return m20787a(this);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: i */
    public Uri mo20770i() {
        return this.f19209h;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: j */
    public Uri mo20769j() {
        return this.f19210i;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: k */
    public Uri mo20768k() {
        return this.f19211j;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: l */
    public boolean mo20767l() {
        return this.f19212k;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: m */
    public boolean mo20766m() {
        return this.f19223v;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: n */
    public boolean mo20765n() {
        return this.f19224w;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: o */
    public boolean mo20764o() {
        return this.f19213l;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: p */
    public String mo20763p() {
        return this.f19214m;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: q */
    public int mo20762q() {
        return this.f19216o;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: r */
    public int mo20761r() {
        return this.f19217p;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: s */
    public boolean mo20760s() {
        return this.f19218q;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: t */
    public boolean mo20759t() {
        return this.f19219r;
    }

    public String toString() {
        return m20784b(this);
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: u */
    public boolean mo20758u() {
        return this.f19225x;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: v */
    public String mo20757v() {
        return this.f19226y;
    }

    @Override // com.google.android.gms.games.Game
    /* renamed from: w */
    public boolean mo20756w() {
        return this.f19227z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        String str = null;
        if (!r_()) {
            C5354b.m20512a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f19203b);
        parcel.writeString(this.f19204c);
        parcel.writeString(this.f19205d);
        parcel.writeString(this.f19206e);
        parcel.writeString(this.f19207f);
        parcel.writeString(this.f19208g);
        parcel.writeString(this.f19209h == null ? null : this.f19209h.toString());
        parcel.writeString(this.f19210i == null ? null : this.f19210i.toString());
        if (this.f19211j != null) {
            str = this.f19211j.toString();
        }
        parcel.writeString(str);
        parcel.writeInt(this.f19212k ? 1 : 0);
        if (!this.f19213l) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f19214m);
        parcel.writeInt(this.f19215n);
        parcel.writeInt(this.f19216o);
        parcel.writeInt(this.f19217p);
    }

    /* renamed from: x */
    public int m20782x() {
        return this.f19202a;
    }

    /* renamed from: y */
    public int m20781y() {
        return this.f19215n;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: z */
    public Game mo7785a() {
        return this;
    }
}
