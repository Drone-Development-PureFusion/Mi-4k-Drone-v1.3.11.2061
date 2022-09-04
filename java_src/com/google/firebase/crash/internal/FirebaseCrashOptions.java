package com.google.firebase.crash.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* loaded from: classes2.dex */
public class FirebaseCrashOptions implements SafeParcelable {
    public static final Parcelable.Creator<FirebaseCrashOptions> CREATOR = new C9812c();

    /* renamed from: a */
    public final int f30630a;

    /* renamed from: b */
    private String f30631b;

    /* renamed from: c */
    private String f30632c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseCrashOptions(int i, String str, String str2) {
        this.f30630a = i;
        this.f30631b = str;
        this.f30632c = str2;
    }

    public FirebaseCrashOptions(String str, String str2) {
        this.f30630a = 1;
        this.f30631b = str;
        this.f30632c = str2;
    }

    /* renamed from: a */
    public String m6905a() {
        return this.f30631b;
    }

    /* renamed from: b */
    public String m6904b() {
        return this.f30632c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9812c.m6899a(this, parcel, i);
    }
}
