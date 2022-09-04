package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new C8998g();

    /* renamed from: a */
    public final int f28613a;

    /* renamed from: b */
    private String f28614b;

    /* renamed from: c */
    private DataHolder f28615c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SafeBrowsingData(int i, String str, DataHolder dataHolder) {
        this.f28613a = i;
        this.f28614b = str;
        this.f28615c = dataHolder;
    }

    public SafeBrowsingData(String str) {
        this(1, str, null);
    }

    public SafeBrowsingData(String str, DataHolder dataHolder) {
        this(1, str, dataHolder);
    }

    /* renamed from: a */
    public String m9438a() {
        return this.f28614b;
    }

    /* renamed from: b */
    public DataHolder m9437b() {
        return this.f28615c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8998g.m9416a(this, parcel, i);
    }
}
