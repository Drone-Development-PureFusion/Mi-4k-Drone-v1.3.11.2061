package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.ads.internal.request.AbstractC3729k;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.internal.aaa;
@aaa
/* renamed from: com.google.android.gms.ads.internal.request.e */
/* loaded from: classes.dex */
public class C3723e extends AbstractC4600p<AbstractC3729k> {

    /* renamed from: a */
    final int f14636a;

    public C3723e(Context context, Looper looper, AbstractC4600p.AbstractC4602b abstractC4602b, AbstractC4600p.AbstractC4603c abstractC4603c, int i) {
        super(context, looper, 8, abstractC4602b, abstractC4603c, null);
        this.f14636a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC3729k mo7440b(IBinder iBinder) {
        return AbstractC3729k.AbstractBinderC3730a.m26996a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.ads.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* renamed from: g_ */
    public AbstractC3729k m27009g_() {
        return (AbstractC3729k) super.m23582G();
    }
}
