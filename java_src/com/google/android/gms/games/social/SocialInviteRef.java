package com.google.android.gms.games.social;

import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
/* loaded from: classes2.dex */
public final class SocialInviteRef extends AbstractC4531j implements SocialInvite {

    /* renamed from: c */
    private final Player f20409c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SocialInviteRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.f20409c = new PlayerRef(dataHolder, i);
    }

    @Override // com.google.android.gms.games.social.SocialInvite
    /* renamed from: c */
    public String mo19060c() {
        return e("external_social_invite_id");
    }

    @Override // com.google.android.gms.games.social.SocialInvite
    /* renamed from: d */
    public Player mo19059d() {
        return this.f20409c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.social.SocialInvite
    /* renamed from: e */
    public int mo19058e() {
        return c("type");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return SocialInviteEntity.m19064a(this, obj);
    }

    @Override // com.google.android.gms.games.social.SocialInvite
    /* renamed from: f */
    public int mo19057f() {
        return c("direction");
    }

    @Override // com.google.android.gms.games.social.SocialInvite
    /* renamed from: g */
    public long mo19056g() {
        return b("last_modified_timestamp");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: h */
    public SocialInvite mo7785a() {
        return new SocialInviteEntity(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return SocialInviteEntity.m19065a(this);
    }

    public String toString() {
        return SocialInviteEntity.m19063b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((SocialInviteEntity) ((SocialInvite) mo7785a())).writeToParcel(parcel, i);
    }
}
