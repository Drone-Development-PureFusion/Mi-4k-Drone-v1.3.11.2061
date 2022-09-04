package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.internal.C7801un;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.acy;
@aaa
/* renamed from: com.google.android.gms.ads.internal.overlay.j */
/* loaded from: classes.dex */
public abstract class AbstractC3662j {
    @Nullable
    /* renamed from: a */
    public abstract AbstractC3661i mo27172a(Context context, acy acyVar, int i, boolean z, C7801un c7801un);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m27200a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return C4696s.m23110d() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m27199a(acy acyVar) {
        return acyVar.mo18085k().f13867e;
    }
}
