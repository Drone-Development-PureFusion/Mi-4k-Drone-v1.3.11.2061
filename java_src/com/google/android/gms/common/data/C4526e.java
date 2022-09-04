package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.common.data.e */
/* loaded from: classes2.dex */
public final class C4526e {
    private C4526e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T, E extends AbstractC4527f<T>> ArrayList<T> m23856a(AbstractC4522b<E> abstractC4522b) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList(abstractC4522b.mo23826c());
        try {
            for (E e : abstractC4522b) {
                arrayList.add(e.mo7785a());
            }
            return arrayList;
        } finally {
            abstractC4522b.mo23869d();
        }
    }

    /* renamed from: b */
    public static boolean m23855b(AbstractC4522b<?> abstractC4522b) {
        Bundle mo23867f = abstractC4522b.mo23867f();
        return (mo23867f == null || mo23867f.getString("next_page_token") == null) ? false : true;
    }

    /* renamed from: c */
    public static boolean m23854c(AbstractC4522b<?> abstractC4522b) {
        Bundle mo23867f = abstractC4522b.mo23867f();
        return (mo23867f == null || mo23867f.getString("prev_page_token") == null) ? false : true;
    }

    /* renamed from: d */
    public static boolean m23853d(AbstractC4522b<?> abstractC4522b) {
        return abstractC4522b != null && abstractC4522b.mo23826c() > 0;
    }
}
