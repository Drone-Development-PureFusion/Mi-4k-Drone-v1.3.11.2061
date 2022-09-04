package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
/* loaded from: classes2.dex */
public final class SnapshotMetadataRef extends AbstractC4531j implements SnapshotMetadata {

    /* renamed from: c */
    private final Game f20387c;

    /* renamed from: d */
    private final Player f20388d;

    public SnapshotMetadataRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.f20387c = new GameRef(dataHolder, i);
        this.f20388d = new PlayerRef(dataHolder, i);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: a */
    public void mo19125a(CharArrayBuffer charArrayBuffer) {
        a("description", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: c */
    public Game mo19124c() {
        return this.f20387c;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: d */
    public Player mo19123d() {
        return this.f20388d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: e */
    public String mo19122e() {
        return e("external_snapshot_id");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return SnapshotMetadataEntity.m19129a(this, obj);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: f */
    public Uri mo19121f() {
        return h("cover_icon_image_uri");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: g */
    public float mo19120g() {
        float f = f("cover_icon_image_height");
        float f2 = f("cover_icon_image_width");
        if (f == 0.0f) {
            return 0.0f;
        }
        return f2 / f;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getCoverImageUrl() {
        return e("cover_icon_image_url");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: h */
    public String mo19119h() {
        return e("unique_name");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return SnapshotMetadataEntity.m19130a(this);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: i */
    public String mo19118i() {
        return e("title");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: j */
    public String mo19117j() {
        return e("description");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: k */
    public long mo19116k() {
        return b("last_modified_timestamp");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: l */
    public long mo19115l() {
        return b("duration");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: m */
    public boolean mo19114m() {
        return c("pending_change_count") > 0;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: n */
    public long mo19113n() {
        return b("progress_value");
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    /* renamed from: o */
    public String mo19112o() {
        return e("device_name");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: p */
    public SnapshotMetadata mo7785a() {
        return new SnapshotMetadataEntity(this);
    }

    public String toString() {
        return SnapshotMetadataEntity.m19128b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((SnapshotMetadataEntity) ((SnapshotMetadata) mo7785a())).writeToParcel(parcel, i);
    }
}
