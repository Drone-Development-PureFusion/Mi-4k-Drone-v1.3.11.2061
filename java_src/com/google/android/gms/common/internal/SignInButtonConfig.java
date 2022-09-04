package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInButtonConfig> CREATOR = new C4591g();

    /* renamed from: a */
    final int f17012a;

    /* renamed from: b */
    private final int f17013b;

    /* renamed from: c */
    private final int f17014c;
    @Deprecated

    /* renamed from: d */
    private final Scope[] f17015d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.f17012a = i;
        this.f17013b = i2;
        this.f17014c = i3;
        this.f17015d = scopeArr;
    }

    public SignInButtonConfig(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, null);
    }

    /* renamed from: a */
    public int m23723a() {
        return this.f17013b;
    }

    /* renamed from: b */
    public int m23722b() {
        return this.f17014c;
    }

    @Deprecated
    /* renamed from: c */
    public Scope[] m23721c() {
        return this.f17015d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4591g.m23607a(this, parcel, i);
    }
}
