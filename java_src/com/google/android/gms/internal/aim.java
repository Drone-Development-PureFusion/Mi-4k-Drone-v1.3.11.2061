package com.google.android.gms.internal;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public class aim {

    /* renamed from: a */
    private final Set<ail<?>> f21947a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public <L> ail<L> m17210a(@NonNull L l, Looper looper) {
        return m17209a(l, looper, "NO_TYPE");
    }

    /* renamed from: a */
    public <L> ail<L> m17209a(@NonNull L l, @NonNull Looper looper, @NonNull String str) {
        C4588d.m23626a(l, "Listener must not be null");
        C4588d.m23626a(looper, "Looper must not be null");
        C4588d.m23626a(str, (Object) "Listener type must not be null");
        ail<L> ailVar = new ail<>(looper, l, str);
        this.f21947a.add(ailVar);
        return ailVar;
    }

    /* renamed from: a */
    public void m17211a() {
        for (ail<?> ailVar : this.f21947a) {
            ailVar.m17215a();
        }
        this.f21947a.clear();
    }
}
