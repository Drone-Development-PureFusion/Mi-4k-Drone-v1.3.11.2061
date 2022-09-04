package com.google.android.gms.games.video;

import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
/* loaded from: classes2.dex */
public final class VideoRef extends AbstractC4531j implements Video {
    /* JADX INFO: Access modifiers changed from: package-private */
    public VideoRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.games.video.Video
    /* renamed from: c */
    public int mo18998c() {
        return c("duration");
    }

    @Override // com.google.android.gms.games.video.Video
    /* renamed from: d */
    public String mo18997d() {
        return e("filepath");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.video.Video
    /* renamed from: e */
    public long mo18996e() {
        return b("filesize");
    }

    @Override // com.google.android.gms.games.video.Video
    /* renamed from: f */
    public long mo18995f() {
        return b("start_time");
    }

    @Override // com.google.android.gms.games.video.Video
    /* renamed from: g */
    public String mo18994g() {
        return e("package");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: h */
    public Video mo7785a() {
        return new VideoEntity(this);
    }

    public String toString() {
        return VideoEntity.m19001b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((VideoEntity) ((Video) mo7785a())).writeToParcel(parcel, i);
    }
}
