package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import java.util.Collection;
/* loaded from: classes2.dex */
public abstract class FenceQueryRequest extends AbstractSafeParcelable {
    /* renamed from: a */
    public static FenceQueryRequest m25501a() {
        return new FenceQueryRequestImpl();
    }

    /* renamed from: a */
    public static FenceQueryRequest m25500a(Collection<String> collection) {
        C4588d.m23627a(collection);
        for (String str : collection) {
            C4588d.m23625a(str);
        }
        return new FenceQueryRequestImpl(collection);
    }

    /* renamed from: a */
    public static FenceQueryRequest m25499a(String... strArr) {
        C4588d.m23627a(strArr);
        for (String str : strArr) {
            C4588d.m23625a(str);
        }
        return new FenceQueryRequestImpl(strArr);
    }
}
