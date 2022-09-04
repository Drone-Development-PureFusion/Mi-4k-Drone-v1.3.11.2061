package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;
/* loaded from: classes2.dex */
public class QueryResultEventParcelable extends WriteAwareParcelable implements DriveEvent {
    public static final C4829n CREATOR = new C4829n();

    /* renamed from: a */
    final int f17610a;

    /* renamed from: b */
    final DataHolder f17611b;

    /* renamed from: c */
    final boolean f17612c;

    /* renamed from: d */
    final int f17613d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public QueryResultEventParcelable(int i, DataHolder dataHolder, boolean z, int i2) {
        this.f17610a = i;
        this.f17611b = dataHolder;
        this.f17612c = z;
        this.f17613d = i2;
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    /* renamed from: a */
    public int mo22667a() {
        return 3;
    }

    @Override // com.google.android.gms.drive.WriteAwareParcelable
    /* renamed from: a */
    public void mo22607a(Parcel parcel, int i) {
        C4829n.m22639a(this, parcel, i);
    }

    /* renamed from: b */
    public DataHolder m22672b() {
        return this.f17611b;
    }

    /* renamed from: c */
    public boolean m22671c() {
        return this.f17612c;
    }

    /* renamed from: d */
    public int m22670d() {
        return this.f17613d;
    }
}
