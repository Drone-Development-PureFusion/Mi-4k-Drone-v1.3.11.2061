package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.iid.C6095a;
import com.tencent.p263mm.sdk.message.RMsgInfoDB;
import com.xiaomi.market.sdk.C10445j;
/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: a */
    public static final int f16743a = 0;

    /* renamed from: b */
    public static final int f16744b = 1;

    /* renamed from: c */
    public static final int f16745c = 2;

    /* renamed from: d */
    public static final int f16746d = 3;

    /* renamed from: e */
    public static final int f16747e = 4;

    /* renamed from: f */
    public static final int f16748f = 5;

    /* renamed from: g */
    public static final int f16749g = 6;

    /* renamed from: h */
    public static final int f16750h = 7;

    /* renamed from: i */
    public static final int f16751i = 8;

    /* renamed from: j */
    public static final int f16752j = 9;

    /* renamed from: k */
    public static final int f16753k = 10;

    /* renamed from: l */
    public static final int f16754l = 11;

    /* renamed from: m */
    public static final int f16755m = 13;

    /* renamed from: n */
    public static final int f16756n = 14;

    /* renamed from: o */
    public static final int f16757o = 15;

    /* renamed from: p */
    public static final int f16758p = 16;

    /* renamed from: q */
    public static final int f16759q = 17;

    /* renamed from: r */
    public static final int f16760r = 18;

    /* renamed from: s */
    public static final int f16761s = 19;

    /* renamed from: t */
    public static final int f16762t = 20;
    @Deprecated

    /* renamed from: u */
    public static final int f16763u = 1500;

    /* renamed from: w */
    final int f16765w;

    /* renamed from: x */
    private final int f16766x;

    /* renamed from: y */
    private final PendingIntent f16767y;

    /* renamed from: z */
    private final String f16768z;

    /* renamed from: v */
    public static final ConnectionResult f16764v = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C4541i();

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f16765w = i;
        this.f16766x = i2;
        this.f16767y = pendingIntent;
        this.f16768z = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m24049a(int i) {
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return C6095a.f20616b;
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case 18:
                return "SERVICE_UPDATING";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 20:
                return "RESTRICTED_PROFILE";
            case 21:
                return "API_VERSION_UPDATE_REQUIRED";
            case 42:
                return "UPDATE_ANDROID_WEAR";
            case 99:
                return "UNFINISHED";
            case 1500:
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            default:
                return new StringBuilder(31).append("UNKNOWN_ERROR_CODE(").append(i).append(")").toString();
        }
    }

    /* renamed from: a */
    public void m24048a(Activity activity, int i) {
        if (!m24050a()) {
            return;
        }
        activity.startIntentSenderForResult(this.f16767y.getIntentSender(), i, null, 0, 0, 0);
    }

    /* renamed from: a */
    public boolean m24050a() {
        return (this.f16766x == 0 || this.f16767y == null) ? false : true;
    }

    /* renamed from: b */
    public boolean m24047b() {
        return this.f16766x == 0;
    }

    /* renamed from: c */
    public int m24046c() {
        return this.f16766x;
    }

    @Nullable
    /* renamed from: d */
    public PendingIntent m24045d() {
        return this.f16767y;
    }

    @Nullable
    /* renamed from: e */
    public String m24044e() {
        return this.f16768z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f16766x == connectionResult.f16766x && C4585c.m23634a(this.f16767y, connectionResult.f16767y) && C4585c.m23634a(this.f16768z, connectionResult.f16768z);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f16766x), this.f16767y, this.f16768z);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("statusCode", m24049a(this.f16766x)).m23632a(C10445j.f32463ai, this.f16767y).m23632a(RMsgInfoDB.TABLE, this.f16768z).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4541i.m23797a(this, parcel, i);
    }
}
