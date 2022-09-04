package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
/* loaded from: classes2.dex */
public final class MostRecentGameInfoRef extends AbstractC4531j implements MostRecentGameInfo {

    /* renamed from: c */
    private final C5924b f20084c;

    public MostRecentGameInfoRef(DataHolder dataHolder, int i, C5924b c5924b) {
        super(dataHolder, i);
        this.f20084c = c5924b;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    /* renamed from: c */
    public String mo19551c() {
        return e(this.f20084c.f20125t);
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    /* renamed from: d */
    public String mo19550d() {
        return e(this.f20084c.f20126u);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    /* renamed from: e */
    public long mo19549e() {
        return b(this.f20084c.f20127v);
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return MostRecentGameInfoEntity.m19555a(this, obj);
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    /* renamed from: f */
    public Uri mo19548f() {
        return h(this.f20084c.f20128w);
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    /* renamed from: g */
    public Uri mo19547g() {
        return h(this.f20084c.f20129x);
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    /* renamed from: h */
    public Uri mo19546h() {
        return h(this.f20084c.f20130y);
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return MostRecentGameInfoEntity.m19556a(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: i */
    public MostRecentGameInfo mo7785a() {
        return new MostRecentGameInfoEntity(this);
    }

    public String toString() {
        return MostRecentGameInfoEntity.m19554b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MostRecentGameInfoEntity) ((MostRecentGameInfo) mo7785a())).writeToParcel(parcel, i);
    }
}
