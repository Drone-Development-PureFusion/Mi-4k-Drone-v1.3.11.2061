package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.AbstractC4808e;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new C4529h();

    /* renamed from: a */
    final int f16881a;

    /* renamed from: b */
    ParcelFileDescriptor f16882b;

    /* renamed from: c */
    final int f16883c;

    /* renamed from: d */
    private Bitmap f16884d;

    /* renamed from: e */
    private boolean f16885e;

    /* renamed from: f */
    private File f16886f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f16881a = i;
        this.f16882b = parcelFileDescriptor;
        this.f16883c = i2;
        this.f16884d = null;
        this.f16885e = false;
    }

    public BitmapTeleporter(Bitmap bitmap) {
        this.f16881a = 1;
        this.f16882b = null;
        this.f16883c = 0;
        this.f16884d = bitmap;
        this.f16885e = true;
    }

    /* renamed from: a */
    private void m23903a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    /* renamed from: c */
    private FileOutputStream m23900c() {
        if (this.f16886f == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            File createTempFile = File.createTempFile("teleporter", ".tmp", this.f16886f);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                this.f16882b = ParcelFileDescriptor.open(createTempFile, AbstractC4808e.f17570a_);
                createTempFile.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Could not create temporary file", e2);
        }
    }

    /* renamed from: a */
    public Bitmap m23904a() {
        if (!this.f16885e) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f16882b));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    int readInt = dataInputStream.readInt();
                    int readInt2 = dataInputStream.readInt();
                    Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                    dataInputStream.read(bArr);
                    m23903a(dataInputStream);
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                    createBitmap.copyPixelsFromBuffer(wrap);
                    this.f16884d = createBitmap;
                    this.f16885e = true;
                } catch (IOException e) {
                    throw new IllegalStateException("Could not read from parcel file descriptor", e);
                }
            } catch (Throwable th) {
                m23903a(dataInputStream);
                throw th;
            }
        }
        return this.f16884d;
    }

    /* renamed from: a */
    public void m23902a(File file) {
        if (file == null) {
            throw new NullPointerException("Cannot set null temp directory");
        }
        this.f16886f = file;
    }

    /* renamed from: b */
    public void m23901b() {
        if (!this.f16885e) {
            try {
                this.f16882b.close();
            } catch (IOException e) {
                Log.w("BitmapTeleporter", "Could not close PFD", e);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.f16882b == null) {
            Bitmap bitmap = this.f16884d;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(m23900c());
            try {
                try {
                    dataOutputStream.writeInt(array.length);
                    dataOutputStream.writeInt(bitmap.getWidth());
                    dataOutputStream.writeInt(bitmap.getHeight());
                    dataOutputStream.writeUTF(bitmap.getConfig().toString());
                    dataOutputStream.write(array);
                } catch (IOException e) {
                    throw new IllegalStateException("Could not write into unlinked file", e);
                }
            } finally {
                m23903a(dataOutputStream);
            }
        }
        C4529h.m23847a(this, parcel, i | 1);
        this.f16882b = null;
    }
}
