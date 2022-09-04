package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4598n;
import com.google.android.gms.common.util.C4684g;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
/* loaded from: classes2.dex */
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    public static final Parcelable.Creator<PlayerEntity> CREATOR = new C5310a();

    /* renamed from: c */
    private final int f19230c;

    /* renamed from: d */
    private String f19231d;

    /* renamed from: e */
    private String f19232e;

    /* renamed from: f */
    private final Uri f19233f;

    /* renamed from: g */
    private final Uri f19234g;

    /* renamed from: h */
    private final long f19235h;

    /* renamed from: i */
    private final int f19236i;

    /* renamed from: j */
    private final long f19237j;

    /* renamed from: k */
    private final String f19238k;

    /* renamed from: l */
    private final String f19239l;

    /* renamed from: m */
    private final String f19240m;

    /* renamed from: n */
    private final MostRecentGameInfoEntity f19241n;

    /* renamed from: o */
    private final PlayerLevelInfo f19242o;

    /* renamed from: p */
    private final boolean f19243p;

    /* renamed from: q */
    private final boolean f19244q;

    /* renamed from: r */
    private final String f19245r;

    /* renamed from: s */
    private final String f19246s;

    /* renamed from: t */
    private final Uri f19247t;

    /* renamed from: u */
    private final String f19248u;

    /* renamed from: v */
    private final Uri f19249v;

    /* renamed from: w */
    private final String f19250w;

    /* renamed from: x */
    private final int f19251x;

    /* renamed from: y */
    private final long f19252y;

    /* renamed from: z */
    private final boolean f19253z;

    /* renamed from: com.google.android.gms.games.PlayerEntity$a */
    /* loaded from: classes2.dex */
    static final class C5310a extends C5933k {
        C5310a() {
        }

        @Override // com.google.android.gms.games.C5933k, android.os.Parcelable.Creator
        /* renamed from: a */
        public PlayerEntity createFromParcel(Parcel parcel) {
            if (PlayerEntity.b(PlayerEntity.q_()) || PlayerEntity.j_(PlayerEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            return new PlayerEntity(14, readString, readString2, readString3 == null ? null : Uri.parse(readString3), readString4 == null ? null : Uri.parse(readString4), parcel.readLong(), -1, -1L, null, null, null, null, null, true, false, parcel.readString(), parcel.readString(), null, null, null, null, -1, -1L, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlayerEntity(int i, String str, String str2, Uri uri, Uri uri2, long j, int i2, long j2, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z, boolean z2, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, int i3, long j3, boolean z3) {
        this.f19230c = i;
        this.f19231d = str;
        this.f19232e = str2;
        this.f19233f = uri;
        this.f19238k = str3;
        this.f19234g = uri2;
        this.f19239l = str4;
        this.f19235h = j;
        this.f19236i = i2;
        this.f19237j = j2;
        this.f19240m = str5;
        this.f19243p = z;
        this.f19241n = mostRecentGameInfoEntity;
        this.f19242o = playerLevelInfo;
        this.f19244q = z2;
        this.f19245r = str6;
        this.f19246s = str7;
        this.f19247t = uri3;
        this.f19248u = str8;
        this.f19249v = uri4;
        this.f19250w = str9;
        this.f19251x = i3;
        this.f19252y = j3;
        this.f19253z = z3;
    }

    public PlayerEntity(Player player) {
        this(player, true);
    }

    public PlayerEntity(Player player, boolean z) {
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        this.f19230c = 14;
        this.f19231d = z ? player.mo20734c() : null;
        this.f19232e = player.mo20733d();
        this.f19233f = player.mo20728i();
        this.f19238k = player.getIconImageUrl();
        this.f19234g = player.mo20726k();
        this.f19239l = player.getHiResImageUrl();
        this.f19235h = player.mo20725l();
        this.f19236i = player.mo20723n();
        this.f19237j = player.mo20724m();
        this.f19240m = player.mo20721p();
        this.f19243p = player.mo20722o();
        MostRecentGameInfo mo20719r = player.mo20719r();
        this.f19241n = mo20719r != null ? new MostRecentGameInfoEntity(mo20719r) : mostRecentGameInfoEntity;
        this.f19242o = player.mo20720q();
        this.f19244q = player.mo20730g();
        this.f19245r = player.mo20732e();
        this.f19246s = player.mo20731f();
        this.f19247t = player.mo20718s();
        this.f19248u = player.getBannerImageLandscapeUrl();
        this.f19249v = player.mo20717t();
        this.f19250w = player.getBannerImagePortraitUrl();
        this.f19251x = player.mo20716u();
        this.f19252y = player.mo20715v();
        this.f19253z = player.mo20714w();
        if (z) {
            C4598n.m23595a((Object) this.f19231d);
        }
        C4598n.m23595a((Object) this.f19232e);
        C4598n.m23593a(this.f19235h > 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20754a(Player player) {
        return C4585c.m23633a(player.mo20734c(), player.mo20733d(), Boolean.valueOf(player.mo20730g()), player.mo20728i(), player.mo20726k(), Long.valueOf(player.mo20725l()), player.mo20721p(), player.mo20720q(), player.mo20732e(), player.mo20731f(), player.mo20718s(), player.mo20717t(), Integer.valueOf(player.mo20716u()), Long.valueOf(player.mo20715v()), Boolean.valueOf(player.mo20714w()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20753a(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return C4585c.m23634a(player2.mo20734c(), player.mo20734c()) && C4585c.m23634a(player2.mo20733d(), player.mo20733d()) && C4585c.m23634a(Boolean.valueOf(player2.mo20730g()), Boolean.valueOf(player.mo20730g())) && C4585c.m23634a(player2.mo20728i(), player.mo20728i()) && C4585c.m23634a(player2.mo20726k(), player.mo20726k()) && C4585c.m23634a(Long.valueOf(player2.mo20725l()), Long.valueOf(player.mo20725l())) && C4585c.m23634a(player2.mo20721p(), player.mo20721p()) && C4585c.m23634a(player2.mo20720q(), player.mo20720q()) && C4585c.m23634a(player2.mo20732e(), player.mo20732e()) && C4585c.m23634a(player2.mo20731f(), player.mo20731f()) && C4585c.m23634a(player2.mo20718s(), player.mo20718s()) && C4585c.m23634a(player2.mo20717t(), player.mo20717t()) && C4585c.m23634a(Integer.valueOf(player2.mo20716u()), Integer.valueOf(player.mo20716u())) && C4585c.m23634a(Long.valueOf(player2.mo20715v()), Long.valueOf(player.mo20715v())) && C4585c.m23634a(Boolean.valueOf(player2.mo20714w()), Boolean.valueOf(player.mo20714w()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20751b(Player player) {
        return C4585c.m23635a(player).m23632a("PlayerId", player.mo20734c()).m23632a("DisplayName", player.mo20733d()).m23632a("HasDebugAccess", Boolean.valueOf(player.mo20730g())).m23632a("IconImageUri", player.mo20728i()).m23632a("IconImageUrl", player.getIconImageUrl()).m23632a("HiResImageUri", player.mo20726k()).m23632a("HiResImageUrl", player.getHiResImageUrl()).m23632a("RetrievedTimestamp", Long.valueOf(player.mo20725l())).m23632a("Title", player.mo20721p()).m23632a("LevelInfo", player.mo20720q()).m23632a("GamerTag", player.mo20732e()).m23632a("Name", player.mo20731f()).m23632a("BannerImageLandscapeUri", player.mo20718s()).m23632a("BannerImageLandscapeUrl", player.getBannerImageLandscapeUrl()).m23632a("BannerImagePortraitUri", player.mo20717t()).m23632a("BannerImagePortraitUrl", player.getBannerImagePortraitUrl()).m23632a("GamerFriendStatus", Integer.valueOf(player.mo20716u())).m23632a("GamerFriendUpdateTimestamp", Long.valueOf(player.mo20715v())).m23632a("IsMuted", Boolean.valueOf(player.mo20714w())).toString();
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: a */
    public void mo20736a(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19232e, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: b */
    public void mo20735b(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f19240m, charArrayBuffer);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: c */
    public String mo20734c() {
        return this.f19231d;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: d */
    public String mo20733d() {
        return this.f19232e;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: e */
    public String mo20732e() {
        return this.f19245r;
    }

    public boolean equals(Object obj) {
        return m20753a(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: f */
    public String mo20731f() {
        return this.f19246s;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: g */
    public boolean mo20730g() {
        return this.f19244q;
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImageLandscapeUrl() {
        return this.f19248u;
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImagePortraitUrl() {
        return this.f19250w;
    }

    @Override // com.google.android.gms.games.Player
    public String getHiResImageUrl() {
        return this.f19239l;
    }

    @Override // com.google.android.gms.games.Player
    public String getIconImageUrl() {
        return this.f19238k;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: h */
    public boolean mo20729h() {
        return mo20728i() != null;
    }

    public int hashCode() {
        return m20754a(this);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: i */
    public Uri mo20728i() {
        return this.f19233f;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: j */
    public boolean mo20727j() {
        return mo20726k() != null;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: k */
    public Uri mo20726k() {
        return this.f19234g;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: l */
    public long mo20725l() {
        return this.f19235h;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: m */
    public long mo20724m() {
        return this.f19237j;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: n */
    public int mo20723n() {
        return this.f19236i;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: o */
    public boolean mo20722o() {
        return this.f19243p;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: p */
    public String mo20721p() {
        return this.f19240m;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: q */
    public PlayerLevelInfo mo20720q() {
        return this.f19242o;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: r */
    public MostRecentGameInfo mo20719r() {
        return this.f19241n;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: s */
    public Uri mo20718s() {
        return this.f19247t;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: t */
    public Uri mo20717t() {
        return this.f19249v;
    }

    public String toString() {
        return m20751b(this);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: u */
    public int mo20716u() {
        return this.f19251x;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: v */
    public long mo20715v() {
        return this.f19252y;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: w */
    public boolean mo20714w() {
        return this.f19253z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        if (!r_()) {
            C5933k.m19511a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f19231d);
        parcel.writeString(this.f19232e);
        parcel.writeString(this.f19233f == null ? null : this.f19233f.toString());
        if (this.f19234g != null) {
            str = this.f19234g.toString();
        }
        parcel.writeString(str);
        parcel.writeLong(this.f19235h);
    }

    /* renamed from: x */
    public int m20749x() {
        return this.f19230c;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: y */
    public Player mo7785a() {
        return this;
    }
}
