package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* renamed from: com.google.android.gms.common.data.k */
/* loaded from: classes2.dex */
public class C4532k<T extends SafeParcelable> extends AbstractC4521a<T> {

    /* renamed from: b */
    private static final String[] f16911b = {UriUtil.DATA_SCHEME};

    /* renamed from: c */
    private final Parcelable.Creator<T> f16912c;

    public C4532k(DataHolder dataHolder, Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.f16912c = creator;
    }

    /* renamed from: a */
    public static <T extends SafeParcelable> void m23833a(DataHolder.C4519a c4519a, T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(UriUtil.DATA_SCHEME, obtain.marshall());
        c4519a.mo23874a(contentValues);
        obtain.recycle();
    }

    /* renamed from: h */
    public static DataHolder.C4519a m23832h() {
        return DataHolder.m23891a(f16911b);
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public T mo9715a(int i) {
        byte[] m23880f = this.f16904a.m23880f(UriUtil.DATA_SCHEME, i, this.f16904a.m23898a(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(m23880f, 0, m23880f.length);
        obtain.setDataPosition(0);
        T createFromParcel = this.f16912c.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
