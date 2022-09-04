package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.tencent.open.GameAppOperation;
/* loaded from: classes2.dex */
public class StockProfileImageRef extends AbstractC4531j implements StockProfileImage {
    public StockProfileImageRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    /* renamed from: c */
    public String mo19541c() {
        return e(GameAppOperation.QQFAV_DATALINE_IMAGEURL);
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    /* renamed from: d */
    public Uri mo19540d() {
        return Uri.parse(e("image_uri"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: e */
    public StockProfileImage mo7785a() {
        return new StockProfileImageEntity(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((StockProfileImageEntity) ((StockProfileImage) mo7785a())).writeToParcel(parcel, i);
    }
}
