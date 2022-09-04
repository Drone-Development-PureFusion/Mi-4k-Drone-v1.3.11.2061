package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.aem;
/* loaded from: classes2.dex */
public class aej extends AbstractC4638w<aem> {

    /* renamed from: a */
    private final String f21357a;

    public aej(Context context, Looper looper, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, C4626s c4626s) {
        super(context, looper, 77, c4626s, abstractC4491b, abstractC4492c);
        this.f21357a = c4626s.m23527h();
    }

    /* renamed from: h */
    private Bundle m17858h() {
        Bundle bundle = new Bundle();
        bundle.putString("authPackage", this.f21357a);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public aem mo7440b(IBinder iBinder) {
        return aem.AbstractBinderC6238a.m17853a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.appinvite.service.START";
    }

    /* renamed from: a */
    public void m17861a(ael aelVar) {
        try {
            ((aem) G()).mo17852a(aelVar);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public void m17860a(ael aelVar, String str) {
        try {
            ((aem) G()).mo17850b(aelVar, str);
        } catch (RemoteException e) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.appinvite.internal.IAppInviteService";
    }

    /* renamed from: b */
    public void m17859b(ael aelVar, String str) {
        try {
            ((aem) G()).mo17851a(aelVar, str);
        } catch (RemoteException e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    public Bundle mo9367c() {
        return m17858h();
    }
}
