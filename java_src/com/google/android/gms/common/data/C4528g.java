package com.google.android.gms.common.data;

import java.util.ArrayList;
/* renamed from: com.google.android.gms.common.data.g */
/* loaded from: classes2.dex */
public final class C4528g {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T, E extends AbstractC4527f<T>> ArrayList<T> m23852a(Iterable<E> iterable) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        for (E e : iterable) {
            arrayList.add(e.mo7785a());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T, E extends AbstractC4527f<T>> ArrayList<T> m23851a(ArrayList<E> arrayList) {
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(arrayList.get(i).mo7785a());
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T, E extends AbstractC4527f<T>> ArrayList<T> m23850a(E[] eArr) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            arrayList.add(e.mo7785a());
        }
        return arrayList;
    }
}
