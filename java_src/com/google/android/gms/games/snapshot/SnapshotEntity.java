package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class SnapshotEntity extends AbstractSafeParcelable implements Snapshot {
    public static final Parcelable.Creator<SnapshotEntity> CREATOR = new C6007b();

    /* renamed from: a */
    private final int f20361a;

    /* renamed from: b */
    private final SnapshotMetadataEntity f20362b;

    /* renamed from: c */
    private final SnapshotContentsEntity f20363c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SnapshotEntity(int i, SnapshotMetadata snapshotMetadata, SnapshotContentsEntity snapshotContentsEntity) {
        this.f20361a = i;
        this.f20362b = new SnapshotMetadataEntity(snapshotMetadata);
        this.f20363c = snapshotContentsEntity;
    }

    public SnapshotEntity(SnapshotMetadata snapshotMetadata, SnapshotContentsEntity snapshotContentsEntity) {
        this(2, snapshotMetadata, snapshotContentsEntity);
    }

    /* renamed from: a */
    static int m19140a(Snapshot snapshot) {
        return C4585c.m23633a(snapshot.mo19137c(), snapshot.mo19136d());
    }

    /* renamed from: a */
    static boolean m19139a(Snapshot snapshot, Object obj) {
        if (!(obj instanceof Snapshot)) {
            return false;
        }
        if (snapshot == obj) {
            return true;
        }
        Snapshot snapshot2 = (Snapshot) obj;
        return C4585c.m23634a(snapshot2.mo19137c(), snapshot.mo19137c()) && C4585c.m23634a(snapshot2.mo19136d(), snapshot.mo19136d());
    }

    /* renamed from: b */
    static String m19138b(Snapshot snapshot) {
        return C4585c.m23635a(snapshot).m23632a("Metadata", snapshot.mo19137c()).m23632a("HasContents", Boolean.valueOf(snapshot.mo19136d() != null)).toString();
    }

    /* renamed from: g */
    private boolean m19133g() {
        return this.f20363c.mo19143d();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    /* renamed from: c */
    public SnapshotMetadata mo19137c() {
        return this.f20362b;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    /* renamed from: d */
    public SnapshotContents mo19136d() {
        if (m19133g()) {
            return null;
        }
        return this.f20363c;
    }

    /* renamed from: e */
    public int m19135e() {
        return this.f20361a;
    }

    public boolean equals(Object obj) {
        return m19139a(this, obj);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: f */
    public Snapshot mo7785a() {
        return this;
    }

    public int hashCode() {
        return m19140a(this);
    }

    public String toString() {
        return m19138b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6007b.m19105a(this, parcel, i);
    }
}
