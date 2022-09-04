package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public class ParcelableEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableEvent> CREATOR = new C5065c();

    /* renamed from: a */
    final int f18138a;

    /* renamed from: b */
    final String f18139b;

    /* renamed from: c */
    final String f18140c;

    /* renamed from: d */
    final List<String> f18141d;

    /* renamed from: e */
    final boolean f18142e;

    /* renamed from: f */
    final boolean f18143f;

    /* renamed from: g */
    final boolean f18144g;

    /* renamed from: h */
    final String f18145h;

    /* renamed from: i */
    final String f18146i;

    /* renamed from: j */
    final TextInsertedDetails f18147j;

    /* renamed from: k */
    final TextDeletedDetails f18148k;

    /* renamed from: l */
    final ValuesAddedDetails f18149l;

    /* renamed from: m */
    final ValuesRemovedDetails f18150m;

    /* renamed from: n */
    final ValuesSetDetails f18151n;

    /* renamed from: o */
    final ValueChangedDetails f18152o;

    /* renamed from: p */
    final ReferenceShiftedDetails f18153p;

    /* renamed from: q */
    final ObjectChangedDetails f18154q;

    /* renamed from: r */
    final FieldChangedDetails f18155r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ParcelableEvent(int i, String str, String str2, List<String> list, boolean z, boolean z2, boolean z3, String str3, String str4, TextInsertedDetails textInsertedDetails, TextDeletedDetails textDeletedDetails, ValuesAddedDetails valuesAddedDetails, ValuesRemovedDetails valuesRemovedDetails, ValuesSetDetails valuesSetDetails, ValueChangedDetails valueChangedDetails, ReferenceShiftedDetails referenceShiftedDetails, ObjectChangedDetails objectChangedDetails, FieldChangedDetails fieldChangedDetails) {
        this.f18138a = i;
        this.f18139b = str;
        this.f18140c = str2;
        this.f18141d = list;
        this.f18142e = z;
        this.f18143f = z2;
        this.f18144g = z3;
        this.f18145h = str3;
        this.f18146i = str4;
        this.f18147j = textInsertedDetails;
        this.f18148k = textDeletedDetails;
        this.f18149l = valuesAddedDetails;
        this.f18150m = valuesRemovedDetails;
        this.f18151n = valuesSetDetails;
        this.f18152o = valueChangedDetails;
        this.f18153p = referenceShiftedDetails;
        this.f18154q = objectChangedDetails;
        this.f18155r = fieldChangedDetails;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5065c.m21920a(this, parcel, i);
    }
}
