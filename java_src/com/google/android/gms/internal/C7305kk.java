package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7287kc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.kk */
/* loaded from: classes2.dex */
public class C7305kk {

    /* renamed from: a */
    static final /* synthetic */ boolean f24452a;

    /* renamed from: b */
    private final Map<C7319kv, C7285ka> f24453b = new HashMap();

    static {
        f24452a = !C7305kk.class.desiredAssertionStatus();
    }

    /* renamed from: a */
    public List<C7285ka> m14866a() {
        return new ArrayList(this.f24453b.values());
    }

    /* renamed from: a */
    public void m14865a(C7285ka c7285ka) {
        AbstractC7287kc.EnumC7288a m14945b = c7285ka.m14945b();
        C7319kv m14952a = c7285ka.m14952a();
        if (f24452a || m14945b == AbstractC7287kc.EnumC7288a.CHILD_ADDED || m14945b == AbstractC7287kc.EnumC7288a.CHILD_CHANGED || m14945b == AbstractC7287kc.EnumC7288a.CHILD_REMOVED) {
            if (!f24452a && c7285ka.m14952a().m14822f()) {
                throw new AssertionError();
            }
            if (!this.f24453b.containsKey(m14952a)) {
                this.f24453b.put(c7285ka.m14952a(), c7285ka);
                return;
            }
            C7285ka c7285ka2 = this.f24453b.get(m14952a);
            AbstractC7287kc.EnumC7288a m14945b2 = c7285ka2.m14945b();
            if (m14945b == AbstractC7287kc.EnumC7288a.CHILD_ADDED && m14945b2 == AbstractC7287kc.EnumC7288a.CHILD_REMOVED) {
                this.f24453b.put(c7285ka.m14952a(), C7285ka.m14949a(m14952a, c7285ka.m14942c(), c7285ka2.m14942c()));
                return;
            } else if (m14945b == AbstractC7287kc.EnumC7288a.CHILD_REMOVED && m14945b2 == AbstractC7287kc.EnumC7288a.CHILD_ADDED) {
                this.f24453b.remove(m14952a);
                return;
            } else if (m14945b == AbstractC7287kc.EnumC7288a.CHILD_REMOVED && m14945b2 == AbstractC7287kc.EnumC7288a.CHILD_CHANGED) {
                this.f24453b.put(m14952a, C7285ka.m14944b(m14952a, c7285ka2.m14939e()));
                return;
            } else if (m14945b == AbstractC7287kc.EnumC7288a.CHILD_CHANGED && m14945b2 == AbstractC7287kc.EnumC7288a.CHILD_ADDED) {
                this.f24453b.put(m14952a, C7285ka.m14950a(m14952a, c7285ka.m14942c()));
                return;
            } else if (m14945b == AbstractC7287kc.EnumC7288a.CHILD_CHANGED && m14945b2 == AbstractC7287kc.EnumC7288a.CHILD_CHANGED) {
                this.f24453b.put(m14952a, C7285ka.m14949a(m14952a, c7285ka.m14942c(), c7285ka2.m14939e()));
                return;
            } else {
                String valueOf = String.valueOf(c7285ka);
                String valueOf2 = String.valueOf(c7285ka2);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length()).append("Illegal combination of changes: ").append(valueOf).append(" occurred after ").append(valueOf2).toString());
            }
        }
        throw new AssertionError("Only child changes supported for tracking");
    }
}
