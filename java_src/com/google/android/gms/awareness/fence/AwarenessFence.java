package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes2.dex */
public abstract class AwarenessFence extends AbstractSafeParcelable {
    /* renamed from: a */
    public static AwarenessFence m25508a(AwarenessFence awarenessFence) {
        C4588d.m23627a(awarenessFence);
        return ContextFenceStub.m22991a((ContextFenceStub) awarenessFence);
    }

    /* renamed from: a */
    public static AwarenessFence m25507a(Collection<AwarenessFence> collection) {
        C4588d.m23619b(collection != null && !collection.isEmpty());
        return ContextFenceStub.m22983c((Collection<ContextFenceStub>) m25503c(collection));
    }

    /* renamed from: a */
    public static AwarenessFence m25506a(AwarenessFence... awarenessFenceArr) {
        C4588d.m23619b(awarenessFenceArr != null && awarenessFenceArr.length > 0);
        return ContextFenceStub.m22983c((Collection<ContextFenceStub>) m25502c(awarenessFenceArr));
    }

    /* renamed from: b */
    public static AwarenessFence m25505b(Collection<AwarenessFence> collection) {
        C4588d.m23619b(collection != null && !collection.isEmpty());
        return ContextFenceStub.m22981d(m25503c(collection));
    }

    /* renamed from: b */
    public static AwarenessFence m25504b(AwarenessFence... awarenessFenceArr) {
        C4588d.m23619b(awarenessFenceArr != null && awarenessFenceArr.length > 0);
        return ContextFenceStub.m22981d(m25502c(awarenessFenceArr));
    }

    /* renamed from: c */
    private static ArrayList<ContextFenceStub> m25503c(Collection<AwarenessFence> collection) {
        ArrayList<ContextFenceStub> arrayList = new ArrayList<>(collection.size());
        Iterator<AwarenessFence> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add((ContextFenceStub) it2.next());
        }
        return arrayList;
    }

    /* renamed from: c */
    private static ArrayList<ContextFenceStub> m25502c(AwarenessFence[] awarenessFenceArr) {
        ArrayList<ContextFenceStub> arrayList = new ArrayList<>(awarenessFenceArr.length);
        for (AwarenessFence awarenessFence : awarenessFenceArr) {
            arrayList.add((ContextFenceStub) awarenessFence);
        }
        return arrayList;
    }
}
