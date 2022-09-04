package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.player.C5924b;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;
/* loaded from: classes2.dex */
public final class PlayerRef extends AbstractC4531j implements Player {

    /* renamed from: c */
    private final C5924b f19263c;

    /* renamed from: d */
    private final PlayerLevelInfo f19264d;

    /* renamed from: e */
    private final MostRecentGameInfoRef f19265e;

    public PlayerRef(DataHolder dataHolder, int i) {
        this(dataHolder, i, null);
    }

    public PlayerRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        this.f19263c = new C5924b(str);
        this.f19265e = new MostRecentGameInfoRef(dataHolder, i, this.f19263c);
        if (!m20712y()) {
            this.f19264d = null;
            return;
        }
        int c = c(this.f19263c.f20116k);
        int c2 = c(this.f19263c.f20119n);
        PlayerLevel playerLevel = new PlayerLevel(c, b(this.f19263c.f20117l), b(this.f19263c.f20118m));
        this.f19264d = new PlayerLevelInfo(b(this.f19263c.f20115j), b(this.f19263c.f20121p), playerLevel, c != c2 ? new PlayerLevel(c2, b(this.f19263c.f20118m), b(this.f19263c.f20120o)) : playerLevel);
    }

    /* renamed from: y */
    private boolean m20712y() {
        return !i(this.f19263c.f20115j) && b(this.f19263c.f20115j) != -1;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: a */
    public void mo20736a(CharArrayBuffer charArrayBuffer) {
        a(this.f19263c.f20107b, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: b */
    public void mo20735b(CharArrayBuffer charArrayBuffer) {
        a(this.f19263c.f20122q, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: c */
    public String mo20734c() {
        return e(this.f19263c.f20106a);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: d */
    public String mo20733d() {
        return e(this.f19263c.f20107b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: e */
    public String mo20732e() {
        return e(this.f19263c.f20097A);
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return PlayerEntity.m20753a(this, obj);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: f */
    public String mo20731f() {
        return e(this.f19263c.f20098B);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: g */
    public boolean mo20730g() {
        return d(this.f19263c.f20131z);
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImageLandscapeUrl() {
        return e(this.f19263c.f20100D);
    }

    @Override // com.google.android.gms.games.Player
    public String getBannerImagePortraitUrl() {
        return e(this.f19263c.f20102F);
    }

    @Override // com.google.android.gms.games.Player
    public String getHiResImageUrl() {
        return e(this.f19263c.f20111f);
    }

    @Override // com.google.android.gms.games.Player
    public String getIconImageUrl() {
        return e(this.f19263c.f20109d);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: h */
    public boolean mo20729h() {
        return mo20728i() != null;
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return PlayerEntity.m20754a(this);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: i */
    public Uri mo20728i() {
        return h(this.f19263c.f20108c);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: j */
    public boolean mo20727j() {
        return mo20726k() != null;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: k */
    public Uri mo20726k() {
        return h(this.f19263c.f20110e);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: l */
    public long mo20725l() {
        return b(this.f19263c.f20112g);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: m */
    public long mo20724m() {
        if (!m_(this.f19263c.f20114i) || i(this.f19263c.f20114i)) {
            return -1L;
        }
        return b(this.f19263c.f20114i);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: n */
    public int mo20723n() {
        return c(this.f19263c.f20113h);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: o */
    public boolean mo20722o() {
        return d(this.f19263c.f20124s);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: p */
    public String mo20721p() {
        return e(this.f19263c.f20122q);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: q */
    public PlayerLevelInfo mo20720q() {
        return this.f19264d;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: r */
    public MostRecentGameInfo mo20719r() {
        if (i(this.f19263c.f20125t)) {
            return null;
        }
        return this.f19265e;
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: s */
    public Uri mo20718s() {
        return h(this.f19263c.f20099C);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: t */
    public Uri mo20717t() {
        return h(this.f19263c.f20101E);
    }

    public String toString() {
        return PlayerEntity.m20751b(this);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: u */
    public int mo20716u() {
        return c(this.f19263c.f20103G);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: v */
    public long mo20715v() {
        return b(this.f19263c.f20104H);
    }

    @Override // com.google.android.gms.games.Player
    /* renamed from: w */
    public boolean mo20714w() {
        return d(this.f19263c.f20105I);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) ((Player) mo7785a())).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: x */
    public Player mo7785a() {
        return new PlayerEntity(this);
    }
}
