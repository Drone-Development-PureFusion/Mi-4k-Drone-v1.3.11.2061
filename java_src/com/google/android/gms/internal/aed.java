package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.aec;
import com.google.android.gms.internal.ahl;
/* loaded from: classes2.dex */
public abstract class aed<T> extends aec.AbstractBinderC6221a {

    /* renamed from: a */
    protected ahl.AbstractC6344b<T> f21339a;

    public aed(ahl.AbstractC6344b<T> abstractC6344b) {
        this.f21339a = abstractC6344b;
    }

    @Override // com.google.android.gms.internal.aec
    /* renamed from: a */
    public void mo17905a(GetRecentContextCall.Response response) {
    }

    @Override // com.google.android.gms.internal.aec
    /* renamed from: a */
    public void mo17874a(Status status) {
    }

    @Override // com.google.android.gms.internal.aec
    /* renamed from: a */
    public void mo17904a(Status status, ParcelFileDescriptor parcelFileDescriptor) {
    }

    @Override // com.google.android.gms.internal.aec
    /* renamed from: a */
    public void mo17903a(Status status, boolean z) {
    }
}
