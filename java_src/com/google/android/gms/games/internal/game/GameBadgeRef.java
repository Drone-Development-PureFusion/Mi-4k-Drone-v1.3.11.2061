package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
/* loaded from: classes2.dex */
public final class GameBadgeRef extends AbstractC4531j implements GameBadge {
    public GameBadgeRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.games.internal.game.GameBadge
    /* renamed from: c */
    public int mo19959c() {
        return c("badge_type");
    }

    @Override // com.google.android.gms.games.internal.game.GameBadge
    /* renamed from: d */
    public String mo19958d() {
        return e("badge_title");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.internal.game.GameBadge
    /* renamed from: e */
    public String mo19957e() {
        return e("badge_description");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return GameBadgeEntity.m19966a(this, obj);
    }

    @Override // com.google.android.gms.games.internal.game.GameBadge
    /* renamed from: f */
    public Uri mo19956f() {
        return h("badge_icon_image_uri");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: g */
    public GameBadge mo7785a() {
        return new GameBadgeEntity(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return GameBadgeEntity.m19967a(this);
    }

    public String toString() {
        return GameBadgeEntity.m19964b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((GameBadgeEntity) ((GameBadge) mo7785a())).writeToParcel(parcel, i);
    }
}
