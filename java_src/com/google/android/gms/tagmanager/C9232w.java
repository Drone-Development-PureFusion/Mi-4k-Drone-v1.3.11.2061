package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.w */
/* loaded from: classes2.dex */
class C9232w extends AbstractC9084bm {

    /* renamed from: a */
    private static final String f29069a = EnumC6890eg.GREATER_THAN.toString();

    public C9232w() {
        super(f29069a);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9084bm
    /* renamed from: a */
    protected boolean mo8873a(C9146cv c9146cv, C9146cv c9146cv2, Map<String, AbstractC7090hj.C7091a> map) {
        return c9146cv.compareTo(c9146cv2) > 0;
    }
}
