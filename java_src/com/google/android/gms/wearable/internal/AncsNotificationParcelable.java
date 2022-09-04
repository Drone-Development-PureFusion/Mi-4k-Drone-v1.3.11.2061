package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.AbstractC9649w;
/* loaded from: classes2.dex */
public final class AncsNotificationParcelable extends AbstractSafeParcelable implements AbstractC9649w {
    public static final Parcelable.Creator<AncsNotificationParcelable> CREATOR = new C9544az();

    /* renamed from: a */
    final int f29868a;

    /* renamed from: b */
    private int f29869b;

    /* renamed from: c */
    private final String f29870c;

    /* renamed from: d */
    private final String f29871d;

    /* renamed from: e */
    private final String f29872e;

    /* renamed from: f */
    private final String f29873f;

    /* renamed from: g */
    private final String f29874g;

    /* renamed from: h */
    private final String f29875h;

    /* renamed from: i */
    private final byte f29876i;

    /* renamed from: j */
    private final byte f29877j;

    /* renamed from: k */
    private final byte f29878k;

    /* renamed from: l */
    private final byte f29879l;

    /* renamed from: m */
    private final String f29880m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AncsNotificationParcelable(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.f29869b = i2;
        this.f29868a = i;
        this.f29870c = str;
        this.f29871d = str2;
        this.f29872e = str3;
        this.f29873f = str4;
        this.f29874g = str5;
        this.f29875h = str6;
        this.f29876i = b;
        this.f29877j = b2;
        this.f29878k = b3;
        this.f29879l = b4;
        this.f29880m = str7;
    }

    /* renamed from: a */
    public int m8089a() {
        return this.f29869b;
    }

    /* renamed from: b */
    public String m8088b() {
        return this.f29870c;
    }

    /* renamed from: c */
    public String m8087c() {
        return this.f29871d;
    }

    /* renamed from: d */
    public String m8086d() {
        return this.f29872e;
    }

    /* renamed from: e */
    public String m8085e() {
        return this.f29873f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) obj;
        if (this.f29868a != ancsNotificationParcelable.f29868a || this.f29869b != ancsNotificationParcelable.f29869b || this.f29876i != ancsNotificationParcelable.f29876i || this.f29877j != ancsNotificationParcelable.f29877j || this.f29878k != ancsNotificationParcelable.f29878k || this.f29879l != ancsNotificationParcelable.f29879l || !this.f29870c.equals(ancsNotificationParcelable.f29870c)) {
            return false;
        }
        if (this.f29871d != null) {
            if (!this.f29871d.equals(ancsNotificationParcelable.f29871d)) {
                return false;
            }
        } else if (ancsNotificationParcelable.f29871d != null) {
            return false;
        }
        if (!this.f29872e.equals(ancsNotificationParcelable.f29872e) || !this.f29873f.equals(ancsNotificationParcelable.f29873f) || !this.f29874g.equals(ancsNotificationParcelable.f29874g)) {
            return false;
        }
        if (this.f29875h != null) {
            if (!this.f29875h.equals(ancsNotificationParcelable.f29875h)) {
                return false;
            }
        } else if (ancsNotificationParcelable.f29875h != null) {
            return false;
        }
        if (this.f29880m != null) {
            z = this.f29880m.equals(ancsNotificationParcelable.f29880m);
        } else if (ancsNotificationParcelable.f29880m != null) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public String m8084f() {
        return this.f29874g;
    }

    /* renamed from: g */
    public String m8083g() {
        return this.f29875h == null ? this.f29870c : this.f29875h;
    }

    /* renamed from: h */
    public byte m8082h() {
        return this.f29876i;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.f29875h != null ? this.f29875h.hashCode() : 0) + (((((((((this.f29871d != null ? this.f29871d.hashCode() : 0) + (((((this.f29868a * 31) + this.f29869b) * 31) + this.f29870c.hashCode()) * 31)) * 31) + this.f29872e.hashCode()) * 31) + this.f29873f.hashCode()) * 31) + this.f29874g.hashCode()) * 31)) * 31) + this.f29876i) * 31) + this.f29877j) * 31) + this.f29878k) * 31) + this.f29879l) * 31;
        if (this.f29880m != null) {
            i = this.f29880m.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public byte m8081i() {
        return this.f29877j;
    }

    /* renamed from: j */
    public byte m8080j() {
        return this.f29878k;
    }

    /* renamed from: k */
    public byte m8079k() {
        return this.f29879l;
    }

    /* renamed from: l */
    public String m8078l() {
        return this.f29880m;
    }

    public String toString() {
        int i = this.f29868a;
        int i2 = this.f29869b;
        String str = this.f29870c;
        String str2 = this.f29871d;
        String str3 = this.f29872e;
        String str4 = this.f29873f;
        String str5 = this.f29874g;
        String str6 = this.f29875h;
        byte b = this.f29876i;
        byte b2 = this.f29877j;
        byte b3 = this.f29878k;
        byte b4 = this.f29879l;
        String str7 = this.f29880m;
        return new StringBuilder(String.valueOf(str).length() + 234 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length()).append("AncsNotificationParcelable{versionCode=").append(i).append(", id=").append(i2).append(", appId='").append(str).append("'").append(", dateTime='").append(str2).append("'").append(", notificationText='").append(str3).append("'").append(", title='").append(str4).append("'").append(", subtitle='").append(str5).append("'").append(", displayName='").append(str6).append("'").append(", eventId=").append((int) b).append(", eventFlags=").append((int) b2).append(", categoryId=").append((int) b3).append(", categoryCount=").append((int) b4).append(", packageName='").append(str7).append("'").append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9544az.m7905a(this, parcel, i);
    }
}
