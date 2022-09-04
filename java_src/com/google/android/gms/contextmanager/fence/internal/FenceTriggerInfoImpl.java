package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
@Deprecated
/* loaded from: classes.dex */
public class FenceTriggerInfoImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FenceTriggerInfoImpl> CREATOR = new C4746k();

    /* renamed from: a */
    private final int f17376a;

    /* renamed from: b */
    private final boolean f17377b;

    /* renamed from: c */
    private final String f17378c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FenceTriggerInfoImpl(int i, boolean z, String str) {
        this.f17376a = i;
        this.f17377b = z;
        this.f17378c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m22959a() {
        return this.f17376a;
    }

    /* renamed from: b */
    public boolean m22958b() {
        return this.f17377b;
    }

    /* renamed from: c */
    public String m22957c() {
        return this.f17378c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4746k.m22905a(this, parcel, i);
    }
}
