package com.google.android.gms.internal;

import java.util.List;
/* loaded from: classes2.dex */
public class akf {
    /* renamed from: a */
    public static <T> int m17048a(T t, List<T> list) {
        if (t == null) {
            return -1;
        }
        int indexOf = list.indexOf(t);
        if (indexOf >= 0) {
            return indexOf;
        }
        list.add(t);
        return list.size() - 1;
    }
}
