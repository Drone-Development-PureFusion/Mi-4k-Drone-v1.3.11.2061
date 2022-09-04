package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class AppMetadata extends AbstractSafeParcelable {
    public static final C8724n CREATOR = new C8724n();

    /* renamed from: a */
    public final int f27593a;

    /* renamed from: b */
    public final String f27594b;

    /* renamed from: c */
    public final String f27595c;

    /* renamed from: d */
    public final String f27596d;

    /* renamed from: e */
    public final String f27597e;

    /* renamed from: f */
    public final long f27598f;

    /* renamed from: g */
    public final long f27599g;

    /* renamed from: h */
    public final String f27600h;

    /* renamed from: i */
    public final boolean f27601i;

    /* renamed from: j */
    public final boolean f27602j;

    /* renamed from: k */
    public final long f27603k;

    /* renamed from: l */
    public final String f27604l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppMetadata(int i, String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6) {
        this.f27593a = i;
        this.f27594b = str;
        this.f27595c = str2;
        this.f27596d = str3;
        this.f27603k = i < 5 ? -2147483648L : j3;
        this.f27597e = str4;
        this.f27598f = j;
        this.f27599g = j2;
        this.f27600h = str5;
        if (i >= 3) {
            this.f27601i = z;
        } else {
            this.f27601i = true;
        }
        this.f27602j = z2;
        this.f27604l = str6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppMetadata(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6) {
        C4588d.m23625a(str);
        this.f27593a = 6;
        this.f27594b = str;
        this.f27595c = TextUtils.isEmpty(str2) ? null : str2;
        this.f27596d = str3;
        this.f27603k = j;
        this.f27597e = str4;
        this.f27598f = j2;
        this.f27599g = j3;
        this.f27600h = str5;
        this.f27601i = z;
        this.f27602j = z2;
        this.f27604l = str6;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8724n.m10490a(this, parcel, i);
    }
}
