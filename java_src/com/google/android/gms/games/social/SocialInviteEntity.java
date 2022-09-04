package com.google.android.gms.games.social;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
/* loaded from: classes2.dex */
public class SocialInviteEntity extends AbstractSafeParcelable implements SocialInvite {
    public static final Parcelable.Creator<SocialInviteEntity> CREATOR = new C6025d();

    /* renamed from: a */
    private final int f20403a;

    /* renamed from: b */
    private final String f20404b;

    /* renamed from: c */
    private final PlayerEntity f20405c;

    /* renamed from: d */
    private final int f20406d;

    /* renamed from: e */
    private final int f20407e;

    /* renamed from: f */
    private final long f20408f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SocialInviteEntity(int i, String str, PlayerEntity playerEntity, int i2, int i3, long j) {
        this.f20403a = i;
        this.f20404b = str;
        this.f20405c = playerEntity;
        this.f20406d = i2;
        this.f20407e = i3;
        this.f20408f = j;
    }

    public SocialInviteEntity(SocialInvite socialInvite) {
        this.f20403a = 1;
        this.f20404b = socialInvite.mo19060c();
        Player mo19059d = socialInvite.mo19059d();
        this.f20405c = mo19059d == null ? null : (PlayerEntity) mo19059d.a();
        this.f20406d = socialInvite.mo19058e();
        this.f20407e = socialInvite.mo19057f();
        this.f20408f = socialInvite.mo19056g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m19065a(SocialInvite socialInvite) {
        return C4585c.m23633a(socialInvite.mo19060c(), socialInvite.mo19059d(), Integer.valueOf(socialInvite.mo19058e()), Integer.valueOf(socialInvite.mo19057f()), Long.valueOf(socialInvite.mo19056g()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m19064a(SocialInvite socialInvite, Object obj) {
        if (!(obj instanceof SocialInvite)) {
            return false;
        }
        if (socialInvite == obj) {
            return true;
        }
        SocialInvite socialInvite2 = (SocialInvite) obj;
        return C4585c.m23634a(socialInvite2.mo19060c(), socialInvite.mo19060c()) && C4585c.m23634a(socialInvite2.mo19059d(), socialInvite.mo19059d()) && C4585c.m23634a(Integer.valueOf(socialInvite2.mo19058e()), Integer.valueOf(socialInvite.mo19058e())) && C4585c.m23634a(Integer.valueOf(socialInvite2.mo19057f()), Integer.valueOf(socialInvite.mo19057f())) && C4585c.m23634a(Long.valueOf(socialInvite2.mo19056g()), Long.valueOf(socialInvite.mo19056g()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19063b(SocialInvite socialInvite) {
        return C4585c.m23635a(socialInvite).m23632a("Social Invite ID", socialInvite.mo19060c()).m23632a("Player", socialInvite.mo19059d()).m23632a("Type", Integer.valueOf(socialInvite.mo19058e())).m23632a("Direction", Integer.valueOf(socialInvite.mo19057f())).m23632a("Last Modified Timestamp", Long.valueOf(socialInvite.mo19056g())).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.social.SocialInvite
    /* renamed from: c */
    public String mo19060c() {
        return this.f20404b;
    }

    @Override // com.google.android.gms.games.social.SocialInvite
    /* renamed from: d */
    public Player mo19059d() {
        return this.f20405c;
    }

    @Override // com.google.android.gms.games.social.SocialInvite
    /* renamed from: e */
    public int mo19058e() {
        return this.f20406d;
    }

    public boolean equals(Object obj) {
        return m19064a(this, obj);
    }

    @Override // com.google.android.gms.games.social.SocialInvite
    /* renamed from: f */
    public int mo19057f() {
        return this.f20407e;
    }

    @Override // com.google.android.gms.games.social.SocialInvite
    /* renamed from: g */
    public long mo19056g() {
        return this.f20408f;
    }

    /* renamed from: h */
    public int m19062h() {
        return this.f20403a;
    }

    public int hashCode() {
        return m19065a(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: i */
    public SocialInvite mo7785a() {
        return this;
    }

    public String toString() {
        return m19063b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6025d.m19049a(this, parcel, i);
    }
}
