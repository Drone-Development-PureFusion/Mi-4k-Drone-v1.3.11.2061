package com.fimi.soul.base;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.kernel.utils.C1681v;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
@SuppressLint({"NewApi"})
@TargetApi(11)
/* loaded from: classes.dex */
public class BaseActivity extends BaseFimiActivity implements C2104d.AbstractC2106b {
    public DroidPlannerApp dpa;
    public C2083a drone;
    protected C1681v preferencesUtil;
    public C1648b speakTTs;

    public void hideNavigationBar() {
        getWindow().getDecorView().setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? 5894 : 1799);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dpa = (DroidPlannerApp) getApplication();
        this.drone = this.dpa.f4493a;
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        this.preferencesUtil = C1681v.m34543a(this);
        this.speakTTs = C1648b.m34869a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseFimiActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MiStatInterface.recordPageEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        MiStatInterface.recordPageStart(this, getTitle() != null ? getTitle().toString() : "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.drone.mo32908a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.drone.mo32903b(this);
    }

    @Override // com.fimi.soul.base.BaseFimiActivity, android.app.Activity
    public void setContentView(int i) {
        setAbContentView(i);
    }
}
