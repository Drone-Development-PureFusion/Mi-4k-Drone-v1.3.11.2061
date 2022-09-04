package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new C9650x();

    /* renamed from: a */
    final int f29785a;

    /* renamed from: b */
    public ParcelFileDescriptor f29786b;

    /* renamed from: c */
    public Uri f29787c;

    /* renamed from: d */
    private byte[] f29788d;

    /* renamed from: e */
    private String f29789e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Asset(int i, byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.f29785a = i;
        this.f29788d = bArr;
        this.f29789e = str;
        this.f29786b = parcelFileDescriptor;
        this.f29787c = uri;
    }

    /* renamed from: a */
    public static Asset m8144a(Uri uri) {
        if (uri == null) {
            throw new IllegalArgumentException("Asset uri cannot be null");
        }
        return new Asset(1, null, null, null, uri);
    }

    /* renamed from: a */
    public static Asset m8143a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            throw new IllegalArgumentException("Asset fd cannot be null");
        }
        return new Asset(1, null, null, parcelFileDescriptor, null);
    }

    /* renamed from: a */
    public static Asset m8142a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Asset digest cannot be null");
        }
        return new Asset(1, null, str, null, null);
    }

    /* renamed from: a */
    public static Asset m8141a(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Asset data cannot be null");
        }
        return new Asset(1, bArr, null, null, null);
    }

    /* renamed from: a */
    public byte[] m8145a() {
        return this.f29788d;
    }

    /* renamed from: b */
    public String m8140b() {
        return this.f29789e;
    }

    /* renamed from: c */
    public ParcelFileDescriptor m8139c() {
        return this.f29786b;
    }

    /* renamed from: d */
    public Uri m8138d() {
        return this.f29787c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.f29788d, asset.f29788d) && C4585c.m23634a(this.f29789e, asset.f29789e) && C4585c.m23634a(this.f29786b, asset.f29786b) && C4585c.m23634a(this.f29787c, asset.f29787c);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f29788d, this.f29789e, this.f29786b, this.f29787c});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f29789e == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(this.f29789e);
        }
        if (this.f29788d != null) {
            sb.append(", size=");
            sb.append(this.f29788d.length);
        }
        if (this.f29786b != null) {
            sb.append(", fd=");
            sb.append(this.f29786b);
        }
        if (this.f29787c != null) {
            sb.append(", uri=");
            sb.append(this.f29787c);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9650x.m7544a(this, parcel, i | 1);
    }
}
