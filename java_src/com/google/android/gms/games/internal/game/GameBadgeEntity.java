package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
/* loaded from: classes2.dex */
public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements GameBadge {
    public static final C5899b CREATOR = new C5897a();

    /* renamed from: a */
    private final int f20053a;

    /* renamed from: b */
    private int f20054b;

    /* renamed from: c */
    private String f20055c;

    /* renamed from: d */
    private String f20056d;

    /* renamed from: e */
    private Uri f20057e;

    /* renamed from: com.google.android.gms.games.internal.game.GameBadgeEntity$a */
    /* loaded from: classes2.dex */
    static final class C5897a extends C5899b {
        C5897a() {
        }

        @Override // com.google.android.gms.games.internal.game.C5899b, android.os.Parcelable.Creator
        /* renamed from: a */
        public GameBadgeEntity createFromParcel(Parcel parcel) {
            if (GameBadgeEntity.b(GameBadgeEntity.q_()) || GameBadgeEntity.j_(GameBadgeEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            return new GameBadgeEntity(1, readInt, readString, readString2, readString3 == null ? null : Uri.parse(readString3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GameBadgeEntity(int i, int i2, String str, String str2, Uri uri) {
        this.f20053a = i;
        this.f20054b = i2;
        this.f20055c = str;
        this.f20056d = str2;
        this.f20057e = uri;
    }

    public GameBadgeEntity(GameBadge gameBadge) {
        this.f20053a = 1;
        this.f20054b = gameBadge.mo19959c();
        this.f20055c = gameBadge.mo19958d();
        this.f20056d = gameBadge.mo19957e();
        this.f20057e = gameBadge.mo19956f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19967a(GameBadge gameBadge) {
        return C4585c.m23633a(Integer.valueOf(gameBadge.mo19959c()), gameBadge.mo19958d(), gameBadge.mo19957e(), gameBadge.mo19956f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19966a(GameBadge gameBadge, Object obj) {
        if (!(obj instanceof GameBadge)) {
            return false;
        }
        if (gameBadge == obj) {
            return true;
        }
        GameBadge gameBadge2 = (GameBadge) obj;
        return C4585c.m23634a(Integer.valueOf(gameBadge2.mo19959c()), gameBadge.mo19958d()) && C4585c.m23634a(gameBadge2.mo19957e(), gameBadge.mo19956f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19964b(GameBadge gameBadge) {
        return C4585c.m23635a(gameBadge).m23632a("Type", Integer.valueOf(gameBadge.mo19959c())).m23632a("Title", gameBadge.mo19958d()).m23632a("Description", gameBadge.mo19957e()).m23632a("IconImageUri", gameBadge.mo19956f()).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.internal.game.GameBadge
    /* renamed from: c */
    public int mo19959c() {
        return this.f20054b;
    }

    @Override // com.google.android.gms.games.internal.game.GameBadge
    /* renamed from: d */
    public String mo19958d() {
        return this.f20055c;
    }

    @Override // com.google.android.gms.games.internal.game.GameBadge
    /* renamed from: e */
    public String mo19957e() {
        return this.f20056d;
    }

    public boolean equals(Object obj) {
        return m19966a(this, obj);
    }

    @Override // com.google.android.gms.games.internal.game.GameBadge
    /* renamed from: f */
    public Uri mo19956f() {
        return this.f20057e;
    }

    /* renamed from: g */
    public int m19962g() {
        return this.f20053a;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: h */
    public GameBadge mo7785a() {
        return this;
    }

    public int hashCode() {
        return m19967a(this);
    }

    public String toString() {
        return m19964b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!r_()) {
            C5899b.m19951a(this, parcel, i);
            return;
        }
        parcel.writeInt(this.f20054b);
        parcel.writeString(this.f20055c);
        parcel.writeString(this.f20056d);
        parcel.writeString(this.f20057e == null ? null : this.f20057e.toString());
    }
}
