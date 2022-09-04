package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveFileRange;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class OnDownloadProgressResponse extends AbstractSafeParcelable {

    /* renamed from: a */
    final int f17753a;

    /* renamed from: b */
    final long f17754b;

    /* renamed from: c */
    final long f17755c;

    /* renamed from: d */
    final int f17756d;

    /* renamed from: e */
    final List<DriveFileRange> f17757e;

    /* renamed from: f */
    private static final List<DriveFileRange> f17752f = Collections.emptyList();
    public static final Parcelable.Creator<OnDownloadProgressResponse> CREATOR = new C4981w();

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnDownloadProgressResponse(int i, long j, long j2, int i2, List<DriveFileRange> list) {
        this.f17753a = i;
        this.f17754b = j;
        this.f17755c = j2;
        this.f17756d = i2;
        this.f17757e = list;
    }

    /* renamed from: a */
    public long m22613a() {
        return this.f17754b;
    }

    /* renamed from: b */
    public long m22612b() {
        return this.f17755c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4981w.m22235a(this, parcel, i);
    }
}
