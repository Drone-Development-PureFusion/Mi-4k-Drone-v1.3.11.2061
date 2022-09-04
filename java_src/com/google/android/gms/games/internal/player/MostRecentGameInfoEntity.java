package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class MostRecentGameInfoEntity extends AbstractSafeParcelable implements MostRecentGameInfo {
    public static final C5923a CREATOR = new C5923a();

    /* renamed from: a */
    private final int f20077a;

    /* renamed from: b */
    private final String f20078b;

    /* renamed from: c */
    private final String f20079c;

    /* renamed from: d */
    private final long f20080d;

    /* renamed from: e */
    private final Uri f20081e;

    /* renamed from: f */
    private final Uri f20082f;

    /* renamed from: g */
    private final Uri f20083g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MostRecentGameInfoEntity(int i, String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
        this.f20077a = i;
        this.f20078b = str;
        this.f20079c = str2;
        this.f20080d = j;
        this.f20081e = uri;
        this.f20082f = uri2;
        this.f20083g = uri3;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostRecentGameInfo) {
        this.f20077a = 2;
        this.f20078b = mostRecentGameInfo.mo19551c();
        this.f20079c = mostRecentGameInfo.mo19550d();
        this.f20080d = mostRecentGameInfo.mo19549e();
        this.f20081e = mostRecentGameInfo.mo19548f();
        this.f20082f = mostRecentGameInfo.mo19547g();
        this.f20083g = mostRecentGameInfo.mo19546h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19556a(MostRecentGameInfo mostRecentGameInfo) {
        return C4585c.m23633a(mostRecentGameInfo.mo19551c(), mostRecentGameInfo.mo19550d(), Long.valueOf(mostRecentGameInfo.mo19549e()), mostRecentGameInfo.mo19548f(), mostRecentGameInfo.mo19547g(), mostRecentGameInfo.mo19546h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19555a(MostRecentGameInfo mostRecentGameInfo, Object obj) {
        if (!(obj instanceof MostRecentGameInfo)) {
            return false;
        }
        if (mostRecentGameInfo == obj) {
            return true;
        }
        MostRecentGameInfo mostRecentGameInfo2 = (MostRecentGameInfo) obj;
        return C4585c.m23634a(mostRecentGameInfo2.mo19551c(), mostRecentGameInfo.mo19551c()) && C4585c.m23634a(mostRecentGameInfo2.mo19550d(), mostRecentGameInfo.mo19550d()) && C4585c.m23634a(Long.valueOf(mostRecentGameInfo2.mo19549e()), Long.valueOf(mostRecentGameInfo.mo19549e())) && C4585c.m23634a(mostRecentGameInfo2.mo19548f(), mostRecentGameInfo.mo19548f()) && C4585c.m23634a(mostRecentGameInfo2.mo19547g(), mostRecentGameInfo.mo19547g()) && C4585c.m23634a(mostRecentGameInfo2.mo19546h(), mostRecentGameInfo.mo19546h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19554b(MostRecentGameInfo mostRecentGameInfo) {
        return C4585c.m23635a(mostRecentGameInfo).m23632a("GameId", mostRecentGameInfo.mo19551c()).m23632a("GameName", mostRecentGameInfo.mo19550d()).m23632a("ActivityTimestampMillis", Long.valueOf(mostRecentGameInfo.mo19549e())).m23632a("GameIconUri", mostRecentGameInfo.mo19548f()).m23632a("GameHiResUri", mostRecentGameInfo.mo19547g()).m23632a("GameFeaturedUri", mostRecentGameInfo.mo19546h()).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    /* renamed from: c */
    public String mo19551c() {
        return this.f20078b;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    /* renamed from: d */
    public String mo19550d() {
        return this.f20079c;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    /* renamed from: e */
    public long mo19549e() {
        return this.f20080d;
    }

    public boolean equals(Object obj) {
        return m19555a(this, obj);
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    /* renamed from: f */
    public Uri mo19548f() {
        return this.f20081e;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    /* renamed from: g */
    public Uri mo19547g() {
        return this.f20082f;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    /* renamed from: h */
    public Uri mo19546h() {
        return this.f20083g;
    }

    public int hashCode() {
        return m19556a(this);
    }

    /* renamed from: i */
    public int m19553i() {
        return this.f20077a;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: j */
    public MostRecentGameInfo mo7785a() {
        return this;
    }

    public String toString() {
        return m19554b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5923a.m19536a(this, parcel, i);
    }
}
