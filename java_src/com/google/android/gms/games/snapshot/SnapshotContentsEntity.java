package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4692o;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.C5906h;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
/* loaded from: classes2.dex */
public final class SnapshotContentsEntity extends AbstractSafeParcelable implements SnapshotContents {

    /* renamed from: b */
    private final int f20359b;

    /* renamed from: c */
    private Contents f20360c;

    /* renamed from: a */
    private static final Object f20358a = new Object();
    public static final C6006a CREATOR = new C6006a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public SnapshotContentsEntity(int i, Contents contents) {
        this.f20359b = i;
        this.f20360c = contents;
    }

    public SnapshotContentsEntity(Contents contents) {
        this(1, contents);
    }

    /* renamed from: a */
    private boolean m19147a(int i, byte[] bArr, int i2, int i3, boolean z) {
        C4588d.m23622a(!mo19143d(), "Must provide a previously opened SnapshotContents");
        synchronized (f20358a) {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f20360c.m22744a().getFileDescriptor());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            try {
                FileChannel channel = fileOutputStream.getChannel();
                channel.position(i);
                bufferedOutputStream.write(bArr, i2, i3);
                if (z) {
                    channel.truncate(bArr.length);
                }
                bufferedOutputStream.flush();
            } catch (IOException e) {
                C5906h.m19939a("SnapshotContentsEntity", "Failed to write snapshot data", e);
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    /* renamed from: a */
    public ParcelFileDescriptor mo19149a() {
        C4588d.m23622a(!mo19143d(), "Cannot mutate closed contents!");
        return this.f20360c.m22744a();
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    /* renamed from: a */
    public boolean mo19148a(int i, byte[] bArr, int i2, int i3) {
        return m19147a(i, bArr, i2, bArr.length, false);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    /* renamed from: a */
    public boolean mo19146a(byte[] bArr) {
        return m19147a(0, bArr, 0, bArr.length, true);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    /* renamed from: b */
    public Contents mo19145b() {
        return this.f20360c;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    /* renamed from: c */
    public void mo19144c() {
        this.f20360c = null;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    /* renamed from: d */
    public boolean mo19143d() {
        return this.f20360c == null;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotContents
    /* renamed from: e */
    public byte[] mo19142e() {
        byte[] m23119a;
        boolean z = false;
        if (!mo19143d()) {
            z = true;
        }
        C4588d.m23622a(z, "Must provide a previously opened Snapshot");
        synchronized (f20358a) {
            FileInputStream fileInputStream = new FileInputStream(this.f20360c.m22744a().getFileDescriptor());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                fileInputStream.getChannel().position(0L);
                m23119a = C4692o.m23119a((InputStream) bufferedInputStream, false);
                fileInputStream.getChannel().position(0L);
            } catch (IOException e) {
                C5906h.m19937b("SnapshotContentsEntity", "Failed to read snapshot data", e);
                throw e;
            }
        }
        return m23119a;
    }

    /* renamed from: f */
    public int m19141f() {
        return this.f20359b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6006a.m19108a(this, parcel, i);
    }
}
