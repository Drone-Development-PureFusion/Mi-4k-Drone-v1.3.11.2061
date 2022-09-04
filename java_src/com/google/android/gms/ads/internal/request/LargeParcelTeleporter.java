package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C4692o;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
@aaa
/* loaded from: classes.dex */
public final class LargeParcelTeleporter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LargeParcelTeleporter> CREATOR = new C3735m();

    /* renamed from: a */
    final int f14598a;

    /* renamed from: b */
    ParcelFileDescriptor f14599b;

    /* renamed from: c */
    private Parcelable f14600c;

    /* renamed from: d */
    private boolean f14601d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LargeParcelTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f14598a = i;
        this.f14599b = parcelFileDescriptor;
        this.f14600c = null;
        this.f14601d = true;
    }

    public LargeParcelTeleporter(SafeParcelable safeParcelable) {
        this.f14598a = 1;
        this.f14599b = null;
        this.f14600c = safeParcelable;
        this.f14601d = false;
    }

    /* renamed from: a */
    protected <T> ParcelFileDescriptor m27036a(final byte[] bArr) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new Runnable() { // from class: com.google.android.gms.ads.internal.request.LargeParcelTeleporter.1
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void run() {
                        DataOutputStream dataOutputStream;
                        try {
                            try {
                                dataOutputStream = new DataOutputStream(autoCloseOutputStream);
                                try {
                                    dataOutputStream.writeInt(bArr.length);
                                    dataOutputStream.write(bArr);
                                    C4692o.m23124a(dataOutputStream);
                                } catch (IOException e) {
                                    e = e;
                                    abr.b("Error transporting the ad response", e);
                                    C3779u.m26886i().m18451a(e, "LargeParcelTeleporter.pipeData.1");
                                    if (dataOutputStream == null) {
                                        C4692o.m23124a(autoCloseOutputStream);
                                    } else {
                                        C4692o.m23124a(dataOutputStream);
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (dataOutputStream != null) {
                                    C4692o.m23124a(autoCloseOutputStream);
                                } else {
                                    C4692o.m23124a(dataOutputStream);
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            dataOutputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            dataOutputStream = null;
                            if (dataOutputStream != null) {
                            }
                            throw th;
                        }
                    }
                }).start();
                return createPipe[0];
            } catch (IOException e) {
                e = e;
                abr.b("Error transporting the ad response", e);
                C3779u.m26886i().m18451a(e, "LargeParcelTeleporter.pipeData.2");
                C4692o.m23124a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
        }
    }

    /* renamed from: a */
    public <T extends SafeParcelable> T m27037a(Parcelable.Creator<T> creator) {
        if (this.f14601d) {
            if (this.f14599b == null) {
                abr.b("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f14599b));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    dataInputStream.readFully(bArr, 0, bArr.length);
                    C4692o.m23124a((Closeable) dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, bArr.length);
                        obtain.setDataPosition(0);
                        this.f14600c = creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.f14601d = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    throw new IllegalStateException("Could not read from parcel file descriptor", e);
                }
            } catch (Throwable th2) {
                C4692o.m23124a((Closeable) dataInputStream);
                throw th2;
            }
        }
        return (T) this.f14600c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.f14599b == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f14600c.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f14599b = m27036a(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        C3735m.m26991a(this, parcel, i);
    }
}
