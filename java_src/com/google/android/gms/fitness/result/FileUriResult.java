package com.google.android.gms.fitness.result;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class FileUriResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<FileUriResult> CREATOR = new C5257h();

    /* renamed from: a */
    private final int f19107a;

    /* renamed from: b */
    private final Uri f19108b;

    /* renamed from: c */
    private final Status f19109c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileUriResult(int i, Uri uri, Status status) {
        this.f19107a = i;
        this.f19108b = uri;
        this.f19109c = status;
    }

    /* renamed from: a */
    private boolean m20932a(FileUriResult fileUriResult) {
        return this.f19109c.equals(fileUriResult.f19109c) && C4585c.m23634a(this.f19108b, fileUriResult.f19108b);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f19109c;
    }

    /* renamed from: b */
    public Uri m20931b() {
        return this.f19108b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m20930c() {
        return this.f19107a;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FileUriResult) && m20932a((FileUriResult) obj));
    }

    public int hashCode() {
        return C4585c.m23633a(this.f19109c, this.f19108b);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("status", this.f19109c).m23632a("uri", this.f19108b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5257h.m20882a(this, parcel, i);
    }
}
