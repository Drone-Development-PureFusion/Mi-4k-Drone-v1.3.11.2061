package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;
/* renamed from: com.google.android.gms.games.snapshot.d */
/* loaded from: classes2.dex */
public interface AbstractC6009d {

    /* renamed from: a */
    public static final AbstractC6009d f20389a = new SnapshotMetadataChangeEntity();

    /* renamed from: com.google.android.gms.games.snapshot.d$a */
    /* loaded from: classes2.dex */
    public static final class C6010a {

        /* renamed from: a */
        private String f20390a;

        /* renamed from: b */
        private Long f20391b;

        /* renamed from: c */
        private Long f20392c;

        /* renamed from: d */
        private BitmapTeleporter f20393d;

        /* renamed from: e */
        private Uri f20394e;

        /* renamed from: a */
        public C6010a m19097a(long j) {
            this.f20391b = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C6010a m19096a(Bitmap bitmap) {
            this.f20393d = new BitmapTeleporter(bitmap);
            this.f20394e = null;
            return this;
        }

        /* renamed from: a */
        public C6010a m19095a(SnapshotMetadata snapshotMetadata) {
            this.f20390a = snapshotMetadata.mo19117j();
            this.f20391b = Long.valueOf(snapshotMetadata.mo19115l());
            this.f20392c = Long.valueOf(snapshotMetadata.mo19113n());
            if (this.f20391b.longValue() == -1) {
                this.f20391b = null;
            }
            this.f20394e = snapshotMetadata.mo19121f();
            if (this.f20394e != null) {
                this.f20393d = null;
            }
            return this;
        }

        /* renamed from: a */
        public C6010a m19094a(String str) {
            this.f20390a = str;
            return this;
        }

        /* renamed from: a */
        public AbstractC6009d m19098a() {
            return new SnapshotMetadataChangeEntity(this.f20390a, this.f20391b, this.f20393d, this.f20394e, this.f20392c);
        }

        /* renamed from: b */
        public C6010a m19093b(long j) {
            this.f20392c = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: a */
    String mo19103a();

    /* renamed from: b */
    Long mo19102b();

    /* renamed from: c */
    BitmapTeleporter mo19101c();

    /* renamed from: d */
    Bitmap mo19100d();

    /* renamed from: e */
    Long mo19099e();
}
