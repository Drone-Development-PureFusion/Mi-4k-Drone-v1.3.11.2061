package com.google.android.gms.config.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class AnalyticsUserProperty extends AbstractSafeParcelable {
    public static final C4704a CREATOR = new C4704a();

    /* renamed from: a */
    private final int f17313a;

    /* renamed from: b */
    private final String f17314b;

    /* renamed from: c */
    private final String f17315c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnalyticsUserProperty(int i, String str, String str2) {
        this.f17313a = i;
        this.f17314b = str;
        this.f17315c = str2;
    }

    public AnalyticsUserProperty(String str, String str2) {
        this(1, str, str2);
    }

    /* renamed from: a */
    public int m23076a() {
        return this.f17313a;
    }

    /* renamed from: b */
    public String m23075b() {
        return this.f17314b;
    }

    /* renamed from: c */
    public String m23074c() {
        return this.f17315c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4704a.m23052a(this, parcel, i);
    }
}
