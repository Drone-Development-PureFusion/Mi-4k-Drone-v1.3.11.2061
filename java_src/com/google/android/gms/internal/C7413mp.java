package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.firebase.C9751b;
import com.google.firebase.C9903e;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.google.android.gms.internal.mp */
/* loaded from: classes2.dex */
public class C7413mp {

    /* renamed from: a */
    private static final AtomicReference<C7413mp> f24843a = new AtomicReference<>();

    C7413mp(Context context) {
    }

    @Nullable
    /* renamed from: a */
    public static C7413mp m14552a() {
        return f24843a.get();
    }

    /* renamed from: a */
    public static C7413mp m14551a(Context context) {
        f24843a.compareAndSet(null, new C7413mp(context));
        return f24843a.get();
    }

    /* renamed from: a */
    public C9903e m14549a(@NonNull String str) {
        return null;
    }

    /* renamed from: a */
    public void m14550a(@NonNull C9751b c9751b) {
    }

    /* renamed from: b */
    public Set<String> m14548b() {
        return Collections.emptySet();
    }
}
