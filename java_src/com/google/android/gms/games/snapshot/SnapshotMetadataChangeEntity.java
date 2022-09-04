package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class SnapshotMetadataChangeEntity extends AbstractSafeParcelable implements AbstractC6009d {
    public static final C6011e CREATOR = new C6011e();

    /* renamed from: b */
    private final int f20366b;

    /* renamed from: c */
    private final String f20367c;

    /* renamed from: d */
    private final Long f20368d;

    /* renamed from: e */
    private final Uri f20369e;

    /* renamed from: f */
    private BitmapTeleporter f20370f;

    /* renamed from: g */
    private final Long f20371g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SnapshotMetadataChangeEntity() {
        this(5, null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SnapshotMetadataChangeEntity(int i, String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
        boolean z = true;
        this.f20366b = i;
        this.f20367c = str;
        this.f20368d = l;
        this.f20370f = bitmapTeleporter;
        this.f20369e = uri;
        this.f20371g = l2;
        if (this.f20370f != null) {
            C4588d.m23622a(this.f20369e != null ? false : z, "Cannot set both a URI and an image");
        } else if (this.f20369e == null) {
        } else {
            C4588d.m23622a(this.f20370f != null ? false : z, "Cannot set both a URI and an image");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SnapshotMetadataChangeEntity(String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
        this(5, str, l, bitmapTeleporter, uri, l2);
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6009d
    /* renamed from: a */
    public String mo19103a() {
        return this.f20367c;
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6009d
    /* renamed from: b */
    public Long mo19102b() {
        return this.f20368d;
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6009d
    /* renamed from: c */
    public BitmapTeleporter mo19101c() {
        return this.f20370f;
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6009d
    /* renamed from: d */
    public Bitmap mo19100d() {
        if (this.f20370f == null) {
            return null;
        }
        return this.f20370f.m23904a();
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6009d
    /* renamed from: e */
    public Long mo19099e() {
        return this.f20371g;
    }

    /* renamed from: f */
    public int m19132f() {
        return this.f20366b;
    }

    /* renamed from: g */
    public Uri m19131g() {
        return this.f20369e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6011e.m19090a(this, parcel, i);
    }
}
