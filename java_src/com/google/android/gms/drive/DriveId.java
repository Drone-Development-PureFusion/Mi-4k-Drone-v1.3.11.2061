package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.internal.C4924bv;
import com.google.android.gms.drive.internal.C4929bx;
import com.google.android.gms.drive.internal.C4938by;
import com.google.android.gms.drive.internal.C4939c;
import com.google.android.gms.internal.AbstractC7649rd;
import com.google.android.gms.internal.C7648rc;
import com.google.android.gms.internal.aju;
import com.google.android.gms.internal.ajv;
/* loaded from: classes2.dex */
public class DriveId extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<DriveId> CREATOR = new C5108t();

    /* renamed from: a */
    public static final int f17513a = -1;

    /* renamed from: b */
    public static final int f17514b = 0;

    /* renamed from: c */
    public static final int f17515c = 1;

    /* renamed from: d */
    final int f17516d;

    /* renamed from: e */
    final String f17517e;

    /* renamed from: f */
    final long f17518f;

    /* renamed from: g */
    final long f17519g;

    /* renamed from: h */
    final int f17520h;

    /* renamed from: i */
    private volatile String f17521i;

    /* renamed from: j */
    private volatile String f17522j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DriveId(int i, String str, long j, long j2, int i2) {
        boolean z = false;
        this.f17521i = null;
        this.f17522j = null;
        this.f17516d = i;
        this.f17517e = str;
        C4588d.m23619b(!"".equals(str));
        C4588d.m23619b((str == null && j == -1) ? z : true);
        this.f17518f = j;
        this.f17519g = j2;
        this.f17520h = i2;
    }

    public DriveId(String str, long j, long j2, int i) {
        this(1, str, j, j2, i);
    }

    /* renamed from: a */
    public static DriveId m22736a(String str) {
        C4588d.m23627a(str);
        return new DriveId(str, -1L, -1L, -1);
    }

    /* renamed from: a */
    static DriveId m22735a(byte[] bArr) {
        try {
            aju m17085a = aju.m17085a(bArr);
            return new DriveId(m17085a.f22049a, "".equals(m17085a.f22050b) ? null : m17085a.f22050b, m17085a.f22051c, m17085a.f22052d, m17085a.f22053e);
        } catch (C7648rc e) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static DriveId m22733b(String str) {
        boolean startsWith = str.startsWith("DriveId:");
        String valueOf = String.valueOf(str);
        C4588d.m23618b(startsWith, valueOf.length() != 0 ? "Invalid DriveId: ".concat(valueOf) : new String("Invalid DriveId: "));
        return m22735a(Base64.decode(str.substring("DriveId:".length()), 10));
    }

    /* renamed from: i */
    private byte[] m22726i() {
        ajv ajvVar = new ajv();
        ajvVar.f22054a = this.f17518f;
        ajvVar.f22055b = this.f17519g;
        return AbstractC7649rd.m13857a(ajvVar);
    }

    /* renamed from: a */
    public String m22737a() {
        return this.f17517e;
    }

    /* renamed from: b */
    public int m22734b() {
        return this.f17520h;
    }

    /* renamed from: c */
    public AbstractC4808e m22732c() {
        if (this.f17520h == 1) {
            throw new IllegalStateException("This DriveId corresponds to a folder. Call asDriveFolder instead.");
        }
        return new C4924bv(this);
    }

    /* renamed from: d */
    public AbstractC4836f m22731d() {
        if (this.f17520h == 0) {
            throw new IllegalStateException("This DriveId corresponds to a file. Call asDriveFile instead.");
        }
        return new C4929bx(this);
    }

    /* renamed from: e */
    public AbstractC4841h m22730e() {
        return this.f17520h == 1 ? m22731d() : this.f17520h == 0 ? m22732c() : new C4939c(this);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (!(obj instanceof DriveId)) {
            return false;
        }
        DriveId driveId = (DriveId) obj;
        if (driveId.f17519g != this.f17519g) {
            return false;
        }
        if (driveId.f17518f == -1 && this.f17518f == -1) {
            return driveId.f17517e.equals(this.f17517e);
        }
        if (this.f17517e == null || driveId.f17517e == null) {
            if (driveId.f17518f != this.f17518f) {
                z = false;
            }
            return z;
        } else if (driveId.f17518f != this.f17518f) {
            return false;
        } else {
            if (driveId.f17517e.equals(this.f17517e)) {
                return true;
            }
            C4938by.m22378b("DriveId", "Unexpected unequal resourceId for same DriveId object.");
            return false;
        }
    }

    /* renamed from: f */
    public final String m22729f() {
        if (this.f17521i == null) {
            String encodeToString = Base64.encodeToString(m22727h(), 10);
            String valueOf = String.valueOf("DriveId:");
            String valueOf2 = String.valueOf(encodeToString);
            this.f17521i = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return this.f17521i;
    }

    /* renamed from: g */
    public final String m22728g() {
        if (this.f17522j == null) {
            this.f17522j = Base64.encodeToString(m22726i(), 10);
        }
        return this.f17522j;
    }

    /* renamed from: h */
    final byte[] m22727h() {
        aju ajuVar = new aju();
        ajuVar.f22049a = this.f17516d;
        ajuVar.f22050b = this.f17517e == null ? "" : this.f17517e;
        ajuVar.f22051c = this.f17518f;
        ajuVar.f22052d = this.f17519g;
        ajuVar.f22053e = this.f17520h;
        return AbstractC7649rd.m13857a(ajuVar);
    }

    public int hashCode() {
        if (this.f17518f == -1) {
            return this.f17517e.hashCode();
        }
        String valueOf = String.valueOf(String.valueOf(this.f17519g));
        String valueOf2 = String.valueOf(String.valueOf(this.f17518f));
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }

    public String toString() {
        return m22729f();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5108t.m21807a(this, parcel, i);
    }
}
