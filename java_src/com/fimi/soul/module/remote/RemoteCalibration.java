package com.fimi.soul.module.remote;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentManager;
import android.view.KeyEvent;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.module.calibcompass.C2540a;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.module.remote.BaseRemoteFragment;
import com.fimi.soul.view.DialogC3245f;
/* loaded from: classes.dex */
public class RemoteCalibration extends BaseActivity implements C2104d.AbstractC2106b, BaseRemoteFragment.AbstractC2834a {

    /* renamed from: a */
    private RemoteMidCalibrationFragment f10022a;

    /* renamed from: b */
    private BaseRemoteFragment f10023b;

    /* renamed from: c */
    private FragmentManager f10024c;

    /* renamed from: d */
    private C2523d f10025d;

    /* renamed from: e */
    private RemoteRollerFragment f10026e;

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment.AbstractC2834a
    /* renamed from: a */
    public void mo30175a() {
        DialogC3245f.C3246a c3246a = new DialogC3245f.C3246a(this);
        c3246a.m28641a(getString(C1704R.C1707string.interruptcaliremote));
        c3246a.m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.remote.RemoteCalibration.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.remote.RemoteCalibration.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                RemoteCalibration.this.f10025d.m31354n();
                RemoteCalibration.this.f10025d.m31355m();
                RemoteCalibration.this.finish();
            }
        }).m28645a().show();
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment.AbstractC2834a
    /* renamed from: a */
    public void mo30174a(int i, int i2) {
        this.f10024c.beginTransaction().hide(this.f10024c.findFragmentById(i)).commitAllowingStateLoss();
        this.f10024c.beginTransaction().show(this.f10024c.findFragmentById(i2)).commitAllowingStateLoss();
    }

    @Override // com.fimi.soul.module.remote.BaseRemoteFragment.AbstractC2834a
    /* renamed from: a */
    public void mo30173a(int i, int i2, String str, boolean z) {
        if (!(this.f10024c.findFragmentById(i) instanceof ErrorCaliBretionFragment)) {
            this.f10024c.beginTransaction().hide(this.f10024c.findFragmentById(i)).commitAllowingStateLoss();
            if (this.f10024c.findFragmentById(i2) == null || !(this.f10024c.findFragmentById(i2) instanceof ErrorCaliBretionFragment)) {
                return;
            }
            ErrorCaliBretionFragment errorCaliBretionFragment = (ErrorCaliBretionFragment) this.f10024c.findFragmentById(i2);
            errorCaliBretionFragment.m30177a(str, z);
            if (!errorCaliBretionFragment.isHidden()) {
                return;
            }
            this.f10024c.beginTransaction().show(errorCaliBretionFragment).commitAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.remotecalibration);
        getWindow().setFlags(128, 128);
        this.f10025d = C2523d.m31374a(this.drone);
        this.f10024c = getSupportFragmentManager();
        if (bundle == null) {
            this.f10023b = (BaseRemoteFragment) this.f10024c.findFragmentById(C1704R.C1706id.basefragment);
            if (this.f10023b == null) {
                this.f10023b = new BaseRemoteFragment();
                this.f10024c.beginTransaction().add(C1704R.C1706id.basefragment, this.f10023b).commit();
            }
            this.f10026e = (RemoteRollerFragment) this.f10024c.findFragmentById(C1704R.C1706id.remote_roller_fragment);
            if (this.f10026e == null) {
                this.f10026e = new RemoteRollerFragment();
            }
            this.f10024c.beginTransaction().add(C1704R.C1706id.remote_roller_fragment, this.f10026e).commit();
            RemoteMidcalingFragment remoteMidcalingFragment = (RemoteMidcalingFragment) this.f10024c.findFragmentById(C1704R.C1706id.midcalibrationing);
            if (remoteMidcalingFragment == null) {
                remoteMidcalingFragment = new RemoteMidcalingFragment();
            }
            this.f10024c.beginTransaction().add(C1704R.C1706id.midcalibrationing, remoteMidcalingFragment).hide(remoteMidcalingFragment).commit();
            RemoteEndCaliFragment remoteEndCaliFragment = (RemoteEndCaliFragment) this.f10024c.findFragmentById(C1704R.C1706id.endmidcalibration);
            if (remoteEndCaliFragment == null) {
                remoteEndCaliFragment = new RemoteEndCaliFragment();
            }
            this.f10024c.beginTransaction().add(C1704R.C1706id.endmidcalibration, remoteEndCaliFragment).hide(remoteEndCaliFragment).commit();
            CarliRemoteFragment carliRemoteFragment = (CarliRemoteFragment) this.f10024c.findFragmentById(C1704R.C1706id.caliremotestart);
            if (carliRemoteFragment == null) {
                carliRemoteFragment = new CarliRemoteFragment();
            }
            this.f10024c.beginTransaction().add(C1704R.C1706id.caliremotestart, carliRemoteFragment).hide(carliRemoteFragment).commit();
            WhellRemoteFragment whellRemoteFragment = (WhellRemoteFragment) this.f10024c.findFragmentById(C1704R.C1706id.cariremotecomple);
            if (whellRemoteFragment == null) {
                whellRemoteFragment = new WhellRemoteFragment();
            }
            this.f10024c.beginTransaction().replace(C1704R.C1706id.cariremotecomple, whellRemoteFragment).hide(whellRemoteFragment).commit();
            ErrorCaliBretionFragment errorCaliBretionFragment = (ErrorCaliBretionFragment) this.f10024c.findFragmentById(C1704R.C1706id.errorcalifragment);
            if (errorCaliBretionFragment == null) {
                errorCaliBretionFragment = new ErrorCaliBretionFragment();
            }
            this.f10024c.beginTransaction().add(C1704R.C1706id.errorcalifragment, errorCaliBretionFragment).hide(errorCaliBretionFragment).commit();
            this.drone.m32981h(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.drone.m32981h(false);
        super.onDestroy();
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case backControl:
                C2540a.m31307a().m31305a("98");
                return;
            case CLEANALLOBJ:
                for (Fragment fragment : this.f10024c.getFragments()) {
                    if (fragment.isVisible() && this.f10026e != null && !this.f10026e.isVisible()) {
                        mo30173a(fragment.getId(), C1704R.C1706id.errorcalifragment, getString(C1704R.C1707string.calidisconremote), false);
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.kernel.BaseActivity
    public void onHandleMessage(Message message) {
        super.onHandleMessage(message);
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f10026e == null || !this.f10026e.isVisible()) {
                mo30175a();
            } else {
                finish();
            }
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.drone.mo32908a(this);
        this.f10025d.m31358j();
    }
}
