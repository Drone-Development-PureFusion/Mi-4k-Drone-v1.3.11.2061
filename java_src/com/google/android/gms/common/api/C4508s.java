package com.google.android.gms.common.api;

import android.support.p001v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ahh;
/* renamed from: com.google.android.gms.common.api.s */
/* loaded from: classes2.dex */
public class C4508s extends C4509t {

    /* renamed from: a */
    private final ConnectionResult f16859a;

    public C4508s(Status status, ArrayMap<ahh<?>, ConnectionResult> arrayMap) {
        super(status, arrayMap);
        this.f16859a = arrayMap.get(arrayMap.keyAt(0));
    }
}
