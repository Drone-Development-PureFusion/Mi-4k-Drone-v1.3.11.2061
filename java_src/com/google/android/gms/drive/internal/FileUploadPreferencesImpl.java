package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.AbstractC4987k;
/* loaded from: classes2.dex */
public final class FileUploadPreferencesImpl extends AbstractSafeParcelable implements AbstractC4987k {
    public static final Parcelable.Creator<FileUploadPreferencesImpl> CREATOR = new C4958h();

    /* renamed from: f */
    final int f17712f;

    /* renamed from: g */
    int f17713g;

    /* renamed from: h */
    int f17714h;

    /* renamed from: i */
    boolean f17715i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileUploadPreferencesImpl(int i, int i2, int i3, boolean z) {
        this.f17712f = i;
        this.f17713g = i2;
        this.f17714h = i3;
        this.f17715i = z;
    }

    /* renamed from: c */
    public static boolean m22618c(int i) {
        switch (i) {
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public static boolean m22617d(int i) {
        switch (i) {
            case 256:
            case 257:
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.drive.AbstractC4987k
    /* renamed from: a */
    public int mo22217a() {
        if (!m22618c(this.f17713g)) {
            return 0;
        }
        return this.f17713g;
    }

    @Override // com.google.android.gms.drive.AbstractC4987k
    /* renamed from: a */
    public void mo22216a(int i) {
        if (!m22618c(i)) {
            throw new IllegalArgumentException("Invalid data connection preference value.");
        }
        this.f17713g = i;
    }

    @Override // com.google.android.gms.drive.AbstractC4987k
    /* renamed from: a */
    public void mo22215a(boolean z) {
        this.f17715i = z;
    }

    @Override // com.google.android.gms.drive.AbstractC4987k
    /* renamed from: b */
    public void mo22213b(int i) {
        if (!m22617d(i)) {
            throw new IllegalArgumentException("Invalid battery usage preference value.");
        }
        this.f17714h = i;
    }

    @Override // com.google.android.gms.drive.AbstractC4987k
    /* renamed from: b */
    public boolean mo22214b() {
        return this.f17715i;
    }

    @Override // com.google.android.gms.drive.AbstractC4987k
    /* renamed from: c */
    public int mo22212c() {
        if (!m22617d(this.f17714h)) {
            return 0;
        }
        return this.f17714h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4958h.m22342a(this, parcel, i);
    }
}
