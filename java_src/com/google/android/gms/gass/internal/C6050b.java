package com.google.android.gms.gass.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.gass.internal.AbstractC6053e;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.google.android.gms.gass.internal.b */
/* loaded from: classes2.dex */
public class C6050b extends AbstractC4600p<AbstractC6053e> {
    public C6050b(Context context, Looper looper, AbstractC4600p.AbstractC4602b abstractC4602b, AbstractC4600p.AbstractC4603c abstractC4603c) {
        super(context, looper, Opcodes.INEG, abstractC4602b, abstractC4603c, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC6053e mo7440b(IBinder iBinder) {
        return AbstractC6053e.AbstractBinderC6054a.m18944a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.gass.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* renamed from: h */
    public AbstractC6053e m18951h() {
        return (AbstractC6053e) super.m23582G();
    }
}
