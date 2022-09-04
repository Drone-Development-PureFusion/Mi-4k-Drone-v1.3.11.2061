package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C3858a;
import com.google.android.gms.analytics.internal.C3922v;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.adx;
import java.util.ListIterator;
/* renamed from: com.google.android.gms.analytics.h */
/* loaded from: classes2.dex */
public class C3855h extends AbstractC3939o<C3855h> {

    /* renamed from: b */
    private final C3922v f14954b;

    /* renamed from: c */
    private boolean f14955c;

    public C3855h(C3922v c3922v) {
        super(c3922v.m26106h(), c3922v.m26110d());
        this.f14954b = c3922v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.analytics.AbstractC3939o
    /* renamed from: a */
    public void mo25980a(C3936l c3936l) {
        adx adxVar = (adx) c3936l.m25995b(adx.class);
        if (TextUtils.isEmpty(adxVar.m17956b())) {
            adxVar.m17955b(this.f14954b.m26098p().m26400b());
        }
        if (!this.f14955c || !TextUtils.isEmpty(adxVar.m17951d())) {
            return;
        }
        C3858a m26099o = this.f14954b.m26099o();
        adxVar.m17950d(m26099o.m26446c());
        adxVar.m17957a(m26099o.m26448b());
    }

    /* renamed from: b */
    public void m26468b(String str) {
        C4588d.m23625a(str);
        m26467c(str);
        n().add(new C3856i(this.f14954b, str));
    }

    /* renamed from: c */
    public void m26467c(String str) {
        Uri m26462a = C3856i.m26462a(str);
        ListIterator<AbstractC3947r> listIterator = n().listIterator();
        while (listIterator.hasNext()) {
            if (m26462a.equals(listIterator.next().mo25960a())) {
                listIterator.remove();
            }
        }
    }

    /* renamed from: c */
    public void m26466c(boolean z) {
        this.f14955c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C3922v m26465k() {
        return this.f14954b;
    }

    @Override // com.google.android.gms.analytics.AbstractC3939o
    /* renamed from: l */
    public C3936l mo25978l() {
        C3936l m26000a = m().m26000a();
        m26000a.m25998a(this.f14954b.m26097q().m26441c());
        m26000a.m25998a(this.f14954b.m26096r().m26348b());
        b(m26000a);
        return m26000a;
    }
}
