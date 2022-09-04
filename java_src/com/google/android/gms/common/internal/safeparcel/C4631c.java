package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.google.android.gms.common.internal.safeparcel.c */
/* loaded from: classes2.dex */
public final class C4631c {
    /* renamed from: a */
    public static <T extends SafeParcelable> T m23445a(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) m23442a(byteArrayExtra, creator);
    }

    /* renamed from: a */
    public static <T extends SafeParcelable> T m23442a(byte[] bArr, Parcelable.Creator<T> creator) {
        C4588d.m23627a(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    /* renamed from: a */
    public static <T extends SafeParcelable> void m23443a(T t, Intent intent, String str) {
        intent.putExtra(str, m23444a(t));
    }

    /* renamed from: a */
    public static <T extends SafeParcelable> byte[] m23444a(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static <T extends SafeParcelable> ArrayList<T> m23441b(Intent intent, String str, Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m23442a((byte[]) it2.next(), creator));
        }
        return arrayList2;
    }
}
