package com.google.firebase.appindexing.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.firebase.appindexing.internal.AbstractC9703f;
/* renamed from: com.google.firebase.appindexing.internal.b */
/* loaded from: classes2.dex */
public class C9685b extends AbstractC4638w<AbstractC9703f> {

    /* renamed from: e */
    private static final C4467a.C4478g<C9685b> f30313e = new C4467a.C4478g<>();

    /* renamed from: f */
    private static final C4467a.AbstractC4473b<C9685b, C4467a.AbstractC4468a.C4470b> f30314f = new C4467a.AbstractC4473b<C9685b, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.firebase.appindexing.internal.b.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C9685b mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C9685b(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: a */
    static final C4467a<C4467a.AbstractC4468a.C4470b> f30312a = new C4467a<>("AppIndexing.API", f30314f, f30313e);

    public C9685b(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 113, c4626s, abstractC4491b, abstractC4492c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC9703f mo7440b(IBinder iBinder) {
        return AbstractC9703f.AbstractBinderC9704a.m7411a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }
}
