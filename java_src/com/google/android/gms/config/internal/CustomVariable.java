package com.google.android.gms.config.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class CustomVariable extends AbstractSafeParcelable {
    public static final C4715f CREATOR = new C4715f();

    /* renamed from: a */
    private final int f17316a;

    /* renamed from: b */
    private final String f17317b;

    /* renamed from: c */
    private final String f17318c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CustomVariable(int i, String str, String str2) {
        this.f17316a = i;
        this.f17317b = str;
        this.f17318c = str2;
    }

    public CustomVariable(String str, String str2) {
        this(1, str, str2);
    }

    /* renamed from: a */
    public int m23073a() {
        return this.f17316a;
    }

    /* renamed from: b */
    public String m23072b() {
        return this.f17317b;
    }

    /* renamed from: c */
    public String m23071c() {
        return this.f17318c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4715f.m23037a(this, parcel, i);
    }
}
