package com.google.android.gms.games.snapshot;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
/* loaded from: classes2.dex */
public interface SnapshotContents extends Parcelable {
    /* renamed from: a */
    ParcelFileDescriptor mo19149a();

    /* renamed from: a */
    boolean mo19148a(int i, byte[] bArr, int i2, int i3);

    /* renamed from: a */
    boolean mo19146a(byte[] bArr);

    /* renamed from: b */
    Contents mo19145b();

    /* renamed from: c */
    void mo19144c();

    /* renamed from: d */
    boolean mo19143d();

    /* renamed from: e */
    byte[] mo19142e();
}
