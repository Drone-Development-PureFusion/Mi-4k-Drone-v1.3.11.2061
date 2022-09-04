package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.at */
/* loaded from: classes2.dex */
class C9061at extends AbstractC9084bm {

    /* renamed from: a */
    private static final String f28712a = EnumC6890eg.LESS_THAN.toString();

    public C9061at() {
        super(f28712a);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9084bm
    /* renamed from: a */
    protected boolean mo8873a(C9146cv c9146cv, C9146cv c9146cv2, Map<String, AbstractC7090hj.C7091a> map) {
        return c9146cv.compareTo(c9146cv2) < 0;
    }
}
