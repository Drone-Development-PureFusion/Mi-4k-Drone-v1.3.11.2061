package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.cr */
/* loaded from: classes2.dex */
abstract class AbstractC9141cr extends AbstractC9091br {
    public AbstractC9141cr(String str) {
        super(str);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9091br
    /* renamed from: a */
    protected boolean mo9153a(AbstractC7090hj.C7091a c7091a, AbstractC7090hj.C7091a c7091a2, Map<String, AbstractC7090hj.C7091a> map) {
        String m9132a = C9147cw.m9132a(c7091a);
        String m9132a2 = C9147cw.m9132a(c7091a2);
        if (m9132a == C9147cw.m9113f() || m9132a2 == C9147cw.m9113f()) {
            return false;
        }
        return mo8890a(m9132a, m9132a2, map);
    }

    /* renamed from: a */
    protected abstract boolean mo8890a(String str, String str2, Map<String, AbstractC7090hj.C7091a> map);
}
