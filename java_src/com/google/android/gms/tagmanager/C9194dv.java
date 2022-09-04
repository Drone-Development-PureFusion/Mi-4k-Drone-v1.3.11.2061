package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.dv */
/* loaded from: classes2.dex */
public class C9194dv extends AbstractC9145cu {

    /* renamed from: a */
    private static final String f28998a = EnumC6890eg.DATA_LAYER_WRITE.toString();

    /* renamed from: b */
    private static final String f28999b = EnumC6958fh.VALUE.toString();

    /* renamed from: c */
    private static final String f29000c = EnumC6958fh.CLEAR_PERSISTENT_DATA_LAYER_PREFIX.toString();

    /* renamed from: d */
    private final C9196e f29001d;

    public C9194dv(C9196e c9196e) {
        super(f28998a, f28999b);
        this.f29001d = c9196e;
    }

    /* renamed from: a */
    private void m8983a(AbstractC7090hj.C7091a c7091a) {
        String m9132a;
        if (c7091a == null || c7091a == C9147cw.m9133a() || (m9132a = C9147cw.m9132a(c7091a)) == C9147cw.m9113f()) {
            return;
        }
        this.f29001d.m8968a(m9132a);
    }

    /* renamed from: b */
    private void m8982b(AbstractC7090hj.C7091a c7091a) {
        if (c7091a == null || c7091a == C9147cw.m9133a()) {
            return;
        }
        Object m9112f = C9147cw.m9112f(c7091a);
        if (!(m9112f instanceof List)) {
            return;
        }
        for (Object obj : (List) m9112f) {
            if (obj instanceof Map) {
                this.f29001d.m8964a((Map) obj);
            }
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9145cu
    /* renamed from: b */
    public void mo8981b(Map<String, AbstractC7090hj.C7091a> map) {
        m8982b(map.get(f28999b));
        m8983a(map.get(f29000c));
    }
}
