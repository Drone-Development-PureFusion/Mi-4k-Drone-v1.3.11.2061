package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.C7801un;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.acy;
@aaa
/* renamed from: com.google.android.gms.ads.internal.overlay.n */
/* loaded from: classes.dex */
public class C3668n extends AbstractC3662j {
    @Override // com.google.android.gms.ads.internal.overlay.AbstractC3662j
    @Nullable
    /* renamed from: a */
    public AbstractC3661i mo27172a(Context context, acy acyVar, int i, boolean z, C7801un c7801un) {
        if (!a(context)) {
            return null;
        }
        return new TextureView$SurfaceTextureListenerC3641c(context, z, a(acyVar), new C3680x(context, acyVar.mo18081o(), acyVar.mo18074v(), c7801un, acyVar.mo18072x()));
    }
}
