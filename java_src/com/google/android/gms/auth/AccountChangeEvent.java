package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new C4078f();

    /* renamed from: a */
    final int f15330a;

    /* renamed from: b */
    final long f15331b;

    /* renamed from: c */
    final String f15332c;

    /* renamed from: d */
    final int f15333d;

    /* renamed from: e */
    final int f15334e;

    /* renamed from: f */
    final String f15335f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f15330a = i;
        this.f15331b = j;
        this.f15332c = (String) C4588d.m23627a(str);
        this.f15333d = i2;
        this.f15334e = i3;
        this.f15335f = str2;
    }

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.f15330a = 1;
        this.f15331b = j;
        this.f15332c = (String) C4588d.m23627a(str);
        this.f15333d = i;
        this.f15334e = i2;
        this.f15335f = str2;
    }

    /* renamed from: a */
    public String m25873a() {
        return this.f15332c;
    }

    /* renamed from: b */
    public int m25872b() {
        return this.f15333d;
    }

    /* renamed from: c */
    public int m25871c() {
        return this.f15334e;
    }

    /* renamed from: d */
    public String m25870d() {
        return this.f15335f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f15330a == accountChangeEvent.f15330a && this.f15331b == accountChangeEvent.f15331b && C4585c.m23634a(this.f15332c, accountChangeEvent.f15332c) && this.f15333d == accountChangeEvent.f15333d && this.f15334e == accountChangeEvent.f15334e && C4585c.m23634a(this.f15335f, accountChangeEvent.f15335f);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f15330a), Long.valueOf(this.f15331b), this.f15332c, Integer.valueOf(this.f15333d), Integer.valueOf(this.f15334e), this.f15335f);
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.f15333d) {
            case 1:
                str = "ADDED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "RENAMED_FROM";
                break;
            case 4:
                str = "RENAMED_TO";
                break;
        }
        String str2 = this.f15332c;
        String str3 = this.f15335f;
        return new StringBuilder(String.valueOf(str2).length() + 91 + String.valueOf(str).length() + String.valueOf(str3).length()).append("AccountChangeEvent {accountName = ").append(str2).append(", changeType = ").append(str).append(", changeData = ").append(str3).append(", eventIndex = ").append(this.f15334e).append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4078f.m25547a(this, parcel, i);
    }
}
