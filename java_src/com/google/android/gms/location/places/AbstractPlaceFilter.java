package com.google.android.gms.location.places;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public abstract class AbstractPlaceFilter extends AbstractSafeParcelable {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <E> List<E> m12368a(Collection<E> collection) {
        return (collection == null || collection.isEmpty()) ? Collections.emptyList() : new ArrayList(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <E> Set<E> m12367a(List<E> list) {
        return (list == null || list.isEmpty()) ? Collections.emptySet() : Collections.unmodifiableSet(new HashSet(list));
    }

    /* renamed from: a */
    public boolean mo12344a() {
        return false;
    }

    /* renamed from: b */
    public abstract Set<String> mo12343b();
}
