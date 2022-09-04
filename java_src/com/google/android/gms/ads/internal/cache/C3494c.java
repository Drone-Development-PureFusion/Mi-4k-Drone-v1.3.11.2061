package com.google.android.gms.ads.internal.cache;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.ads.internal.cache.AbstractC3497f;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.internal.aaa;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
@aaa
/* renamed from: com.google.android.gms.ads.internal.cache.c */
/* loaded from: classes.dex */
public class C3494c extends AbstractC4600p<AbstractC3497f> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3494c(Context context, Looper looper, AbstractC4600p.AbstractC4602b abstractC4602b, AbstractC4600p.AbstractC4603c abstractC4603c) {
        super(context, looper, Opcodes.LSHR, abstractC4602b, abstractC4603c, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC3497f mo7440b(IBinder iBinder) {
        return AbstractC3497f.AbstractBinderC3498a.m27643a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* renamed from: f_ */
    public AbstractC3497f m27647f_() {
        return (AbstractC3497f) super.m23582G();
    }
}
