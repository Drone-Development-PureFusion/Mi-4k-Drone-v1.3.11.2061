package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4683f;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Set;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class DriveSpace extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DriveSpace> CREATOR = new C5110v();

    /* renamed from: a */
    public static final DriveSpace f17523a = new DriveSpace("DRIVE");

    /* renamed from: b */
    public static final DriveSpace f17524b = new DriveSpace("APP_DATA_FOLDER");

    /* renamed from: c */
    public static final DriveSpace f17525c = new DriveSpace("PHOTOS");

    /* renamed from: d */
    public static final Set<DriveSpace> f17526d = C4683f.m23149a(f17523a, f17524b, f17525c);

    /* renamed from: e */
    public static final String f17527e = TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, f17526d.toArray());

    /* renamed from: g */
    private static final Pattern f17528g = Pattern.compile("[A-Z0-9_]*");

    /* renamed from: f */
    final int f17529f;

    /* renamed from: h */
    private final String f17530h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DriveSpace(int i, String str) {
        this.f17529f = i;
        this.f17530h = (String) C4588d.m23627a(str);
    }

    private DriveSpace(String str) {
        this(1, str);
    }

    /* renamed from: a */
    public String m22725a() {
        return this.f17530h;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != DriveSpace.class) {
            return false;
        }
        return this.f17530h.equals(((DriveSpace) obj).f17530h);
    }

    public int hashCode() {
        return 1247068382 ^ this.f17530h.hashCode();
    }

    public String toString() {
        return this.f17530h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5110v.m21804a(this, parcel, i);
    }
}
