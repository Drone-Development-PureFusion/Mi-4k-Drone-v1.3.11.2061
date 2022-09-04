package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4684g;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
/* loaded from: classes2.dex */
public final class SnapshotMetadataEntity extends AbstractSafeParcelable implements SnapshotMetadata {
    public static final Parcelable.Creator<SnapshotMetadataEntity> CREATOR = new C6012f();

    /* renamed from: c */
    private final int f20372c;

    /* renamed from: d */
    private final GameEntity f20373d;

    /* renamed from: e */
    private final PlayerEntity f20374e;

    /* renamed from: f */
    private final String f20375f;

    /* renamed from: g */
    private final Uri f20376g;

    /* renamed from: h */
    private final String f20377h;

    /* renamed from: i */
    private final String f20378i;

    /* renamed from: j */
    private final String f20379j;

    /* renamed from: k */
    private final long f20380k;

    /* renamed from: l */
    private final long f20381l;

    /* renamed from: m */
    private final float f20382m;

    /* renamed from: n */
    private final String f20383n;

    /* renamed from: o */
    private final boolean f20384o;

    /* renamed from: p */
    private final long f20385p;

    /* renamed from: q */
    private final String f20386q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SnapshotMetadataEntity(int i, GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j, long j2, float f, String str5, boolean z, long j3, String str6) {
        this.f20372c = i;
        this.f20373d = gameEntity;
        this.f20374e = playerEntity;
        this.f20375f = str;
        this.f20376g = uri;
        this.f20377h = str2;
        this.f20382m = f;
        this.f20378i = str3;
        this.f20379j = str4;
        this.f20380k = j;
        this.f20381l = j2;
        this.f20383n = str5;
        this.f20384o = z;
        this.f20385p = j3;
        this.f20386q = str6;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotMetadata) {
        this.f20372c = 6;
        this.f20373d = new GameEntity(snapshotMetadata.mo19124c());
        this.f20374e = new PlayerEntity(snapshotMetadata.mo19123d());
        this.f20375f = snapshotMetadata.mo19122e();
        this.f20376g = snapshotMetadata.mo19121f();
        this.f20377h = snapshotMetadata.getCoverImageUrl();
        this.f20382m = snapshotMetadata.mo19120g();
        this.f20378i = snapshotMetadata.mo19118i();
        this.f20379j = snapshotMetadata.mo19117j();
        this.f20380k = snapshotMetadata.mo19116k();
        this.f20381l = snapshotMetadata.mo19115l();
        this.f20383n = snapshotMetadata.mo19119h();
        this.f20384o = snapshotMetadata.mo19114m();
        this.f20385p = snapshotMetadata.mo19113n();
        this.f20386q = snapshotMetadata.mo19112o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19130a(SnapshotMetadata snapshotMetadata) {
        return C4585c.m23633a(snapshotMetadata.mo19124c(), snapshotMetadata.mo19123d(), snapshotMetadata.mo19122e(), snapshotMetadata.mo19121f(), Float.valueOf(snapshotMetadata.mo19120g()), snapshotMetadata.mo19118i(), snapshotMetadata.mo19117j(), Long.valueOf(snapshotMetadata.mo19116k()), Long.valueOf(snapshotMetadata.mo19115l()), snapshotMetadata.mo19119h(), Boolean.valueOf(snapshotMetadata.mo19114m()), Long.valueOf(snapshotMetadata.mo19113n()), snapshotMetadata.mo19112o());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19129a(SnapshotMetadata snapshotMetadata, Object obj) {
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        if (snapshotMetadata == obj) {
            return true;
        }
        SnapshotMetadata snapshotMetadata2 = (SnapshotMetadata) obj;
        return C4585c.m23634a(snapshotMetadata2.mo19124c(), snapshotMetadata.mo19124c()) && C4585c.m23634a(snapshotMetadata2.mo19123d(), snapshotMetadata.mo19123d()) && C4585c.m23634a(snapshotMetadata2.mo19122e(), snapshotMetadata.mo19122e()) && C4585c.m23634a(snapshotMetadata2.mo19121f(), snapshotMetadata.mo19121f()) && C4585c.m23634a(Float.valueOf(snapshotMetadata2.mo19120g()), Float.valueOf(snapshotMetadata.mo19120g())) && C4585c.m23634a(snapshotMetadata2.mo19118i(), snapshotMetadata.mo19118i()) && C4585c.m23634a(snapshotMetadata2.mo19117j(), snapshotMetadata.mo19117j()) && C4585c.m23634a(Long.valueOf(snapshotMetadata2.mo19116k()), Long.valueOf(snapshotMetadata.mo19116k())) && C4585c.m23634a(Long.valueOf(snapshotMetadata2.mo19115l()), Long.valueOf(snapshotMetadata.mo19115l())) && C4585c.m23634a(snapshotMetadata2.mo19119h(), snapshotMetadata.mo19119h()) && C4585c.m23634a(Boolean.valueOf(snapshotMetadata2.mo19114m()), Boolean.valueOf(snapshotMetadata.mo19114m())) && C4585c.m23634a(Long.valueOf(snapshotMetadata2.mo19113n()), Long.valueOf(snapshotMetadata.mo19113n())) && C4585c.m23634a(snapshotMetadata2.mo19112o(), snapshotMetadata.mo19112o());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19128b(SnapshotMetadata snapshotMetadata) {
        return C4585c.m23635a(snapshotMetadata).m23632a("Game", snapshotMetadata.mo19124c()).m23632a("Owner", snapshotMetadata.mo19123d()).m23632a("SnapshotId", snapshotMetadata.mo19122e()).m23632a("CoverImageUri", snapshotMetadata.mo19121f()).m23632a("CoverImageUrl", snapshotMetadata.getCoverImageUrl()).m23632a("CoverImageAspectRatio", Float.valueOf(snapshotMetadata.mo19120g())).m23632a("Description", snapshotMetadata.mo19117j()).m23632a("LastModifiedTimestamp", Long.valueOf(snapshotMetadata.mo19116k())).m23632a("PlayedTime", Long.valueOf(snapshotMetadata.mo19115l())).m23632a("UniqueName", snapshotMetadata.mo19119h()).m23632a("ChangePending", Boolean.valueOf(snapshotMetadata.mo19114m())).m23632a("ProgressValue", Long.valueOf(snapshotMetadata.mo19113n())).m23632a("DeviceName", snapshotMetadata.mo19112o()).toString();
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: a */
    public void mo19125a(CharArrayBuffer charArrayBuffer) {
        C4684g.m23139a(this.f20379j, charArrayBuffer);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: c */
    public Game mo19124c() {
        return this.f20373d;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: d */
    public Player mo19123d() {
        return this.f20374e;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: e */
    public String mo19122e() {
        return this.f20375f;
    }

    public boolean equals(Object obj) {
        return m19129a(this, obj);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: f */
    public Uri mo19121f() {
        return this.f20376g;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: g */
    public float mo19120g() {
        return this.f20382m;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getCoverImageUrl() {
        return this.f20377h;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: h */
    public String mo19119h() {
        return this.f20383n;
    }

    public int hashCode() {
        return m19130a(this);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: i */
    public String mo19118i() {
        return this.f20378i;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: j */
    public String mo19117j() {
        return this.f20379j;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: k */
    public long mo19116k() {
        return this.f20380k;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: l */
    public long mo19115l() {
        return this.f20381l;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: m */
    public boolean mo19114m() {
        return this.f20384o;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: n */
    public long mo19113n() {
        return this.f20385p;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: o */
    public String mo19112o() {
        return this.f20386q;
    }

    /* renamed from: p */
    public int m19127p() {
        return this.f20372c;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: q */
    public SnapshotMetadata mo7785a() {
        return this;
    }

    public String toString() {
        return m19128b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6012f.m19087a(this, parcel, i);
    }
}
