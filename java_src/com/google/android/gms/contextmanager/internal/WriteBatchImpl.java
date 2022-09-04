package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.Relation;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class WriteBatchImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WriteBatchImpl> CREATOR = new C4791s();

    /* renamed from: a */
    private final int f17454a;

    /* renamed from: b */
    private final boolean f17455b;

    /* renamed from: c */
    private ArrayList<ContextData> f17456c;

    /* renamed from: d */
    private ArrayList<Relation> f17457d;

    /* renamed from: e */
    private ArrayList<Relation> f17458e;

    public WriteBatchImpl() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WriteBatchImpl(int i, boolean z, ArrayList<ContextData> arrayList, ArrayList<Relation> arrayList2, ArrayList<Relation> arrayList3) {
        this.f17454a = i;
        this.f17455b = z;
        this.f17456c = arrayList;
        this.f17457d = arrayList2;
        this.f17458e = arrayList3;
    }

    public WriteBatchImpl(boolean z) {
        this.f17454a = 1;
        this.f17455b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m22827a() {
        return this.f17454a;
    }

    /* renamed from: b */
    public boolean m22826b() {
        return this.f17455b;
    }

    /* renamed from: c */
    public ArrayList<ContextData> m22825c() {
        return this.f17456c;
    }

    /* renamed from: d */
    public ArrayList<Relation> m22824d() {
        return this.f17457d;
    }

    /* renamed from: e */
    public ArrayList<Relation> m22823e() {
        return this.f17458e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4791s.m22747a(this, parcel, i);
    }
}
