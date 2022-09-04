package com.fimi.x1bh.module;

import android.os.Bundle;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p148c.AbstractC1522a;
import com.fimi.p148c.AbstractC1523b;
import com.fimi.p152e.C1543b;
import com.fimi.p152e.C1549d;
import com.fimi.soul.base.BaseActivity;
/* loaded from: classes.dex */
public class X1bhBaseActivity extends BaseActivity implements AbstractC1522a, AbstractC1523b {
    @Override // com.fimi.p148c.AbstractC1523b
    /* renamed from: a */
    public void mo28086a(int i, C1508c c1508c) {
    }

    @Override // com.fimi.p148c.AbstractC1522a
    /* renamed from: a */
    public void mo28082a(String str) {
    }

    /* renamed from: a */
    public void m28236a(byte[] bArr) {
        C1549d.m35208b().m35209a(bArr, bArr.length);
    }

    @Override // com.fimi.p148c.AbstractC1522a
    /* renamed from: b */
    public void mo28051b(String str) {
    }

    @Override // com.fimi.p148c.AbstractC1522a
    /* renamed from: c */
    public void mo28161c(String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1543b.m35227b().m35229a(this);
        C1549d.m35208b().m35212a(this);
        C1549d.m35208b().m35205d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C1543b.m35227b().m35226b(this);
        C1549d.m35208b().m35207b(this);
    }
}
