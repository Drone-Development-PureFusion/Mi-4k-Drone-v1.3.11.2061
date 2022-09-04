package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.bm */
/* loaded from: classes2.dex */
abstract class AbstractC9084bm extends AbstractC9091br {
    public AbstractC9084bm(String str) {
        super(str);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9091br
    /* renamed from: a */
    protected boolean mo9153a(AbstractC7090hj.C7091a c7091a, AbstractC7090hj.C7091a c7091a2, Map<String, AbstractC7090hj.C7091a> map) {
        C9146cv m9128b = C9147cw.m9128b(c7091a);
        C9146cv m9128b2 = C9147cw.m9128b(c7091a2);
        if (m9128b == C9147cw.m9117e() || m9128b2 == C9147cw.m9117e()) {
            return false;
        }
        return mo8873a(m9128b, m9128b2, map);
    }

    /* renamed from: a */
    protected abstract boolean mo8873a(C9146cv c9146cv, C9146cv c9146cv2, Map<String, AbstractC7090hj.C7091a> map);
}
