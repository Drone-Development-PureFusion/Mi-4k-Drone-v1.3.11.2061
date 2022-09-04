package com.google.android.gms.config.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class PackageConfigTable extends AbstractSafeParcelable {
    public static final C4724k CREATOR = new C4724k();

    /* renamed from: a */
    private final int f17333a;

    /* renamed from: b */
    private final Bundle f17334b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PackageConfigTable(int i, Bundle bundle) {
        this.f17333a = i;
        this.f17334b = bundle;
    }

    /* renamed from: a */
    public int m23056a() {
        return this.f17333a;
    }

    /* renamed from: b */
    public Bundle m23055b() {
        return this.f17334b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4724k.m23017a(this, parcel, i);
    }
}
