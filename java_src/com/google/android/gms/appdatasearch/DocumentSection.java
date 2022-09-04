package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class DocumentSection extends AbstractSafeParcelable {

    /* renamed from: b */
    final int f15242b;

    /* renamed from: c */
    public final String f15243c;

    /* renamed from: d */
    final RegisterSectionInfo f15244d;

    /* renamed from: e */
    public final int f15245e;

    /* renamed from: f */
    public final byte[] f15246f;

    /* renamed from: a */
    public static final int f15240a = Integer.parseInt("-1");
    public static final C3956d CREATOR = new C3956d();

    /* renamed from: g */
    private static final RegisterSectionInfo f15241g = new RegisterSectionInfo.C3949a("SsbContext").m25947a(true).m25948a("blob").m25950a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public DocumentSection(int i, String str, RegisterSectionInfo registerSectionInfo, int i2, byte[] bArr) {
        C4588d.m23618b(i2 == f15240a || C3960h.m25909a(i2) != null, new StringBuilder(32).append("Invalid section type ").append(i2).toString());
        this.f15242b = i;
        this.f15243c = str;
        this.f15244d = registerSectionInfo;
        this.f15245e = i2;
        this.f15246f = bArr;
        String m25952a = m25952a();
        if (m25952a != null) {
            throw new IllegalArgumentException(m25952a);
        }
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo) {
        this(1, str, registerSectionInfo, f15240a, null);
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, String str2) {
        this(1, str, registerSectionInfo, C3960h.m25908a(str2), null);
    }

    public DocumentSection(byte[] bArr, RegisterSectionInfo registerSectionInfo) {
        this(1, null, registerSectionInfo, f15240a, bArr);
    }

    /* renamed from: a */
    public static DocumentSection m25951a(byte[] bArr) {
        return new DocumentSection(bArr, f15241g);
    }

    /* renamed from: a */
    public String m25952a() {
        if (this.f15245e != f15240a && C3960h.m25909a(this.f15245e) == null) {
            return new StringBuilder(32).append("Invalid section type ").append(this.f15245e).toString();
        } else if (this.f15243c != null && this.f15246f != null) {
            return "Both content and blobContent set";
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3956d c3956d = CREATOR;
        C3956d.m25920a(this, parcel, i);
    }
}
