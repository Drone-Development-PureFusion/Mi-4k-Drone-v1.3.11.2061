package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.anw;
import java.util.List;
/* loaded from: classes2.dex */
public class any extends AbstractC4638w<anw> {

    /* renamed from: a */
    private final Context f22539a;

    public any(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 45, c4626s, abstractC4491b, abstractC4492c);
        this.f22539a = context;
    }

    /* renamed from: h */
    private String m16572h() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f22539a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f22539a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null) {
                return (String) bundle.get("com.google.android.safetynet.API_KEY");
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public anw mo7440b(IBinder iBinder) {
        return anw.AbstractBinderC6657a.m16597a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.safetynet.service.START";
    }

    /* renamed from: a */
    public void m16576a(anv anvVar) {
        ((anw) G()).mo16593b(anvVar);
    }

    /* renamed from: a */
    public void m16575a(anv anvVar, List<Integer> list, int i, String str, String str2) {
        String m16572h = str2 == null ? m16572h() : str2;
        int[] iArr = new int[list.size()];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= list.size()) {
                ((anw) G()).mo16595a(anvVar, m16572h, iArr, i, str);
                return;
            } else {
                iArr[i3] = list.get(i3).intValue();
                i2 = i3 + 1;
            }
        }
    }

    /* renamed from: a */
    public void m16574a(anv anvVar, byte[] bArr) {
        ((anw) G()).mo16594a(anvVar, bArr);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    /* renamed from: b */
    public void m16573b(anv anvVar) {
        ((anw) G()).mo16592c(anvVar);
    }
}
