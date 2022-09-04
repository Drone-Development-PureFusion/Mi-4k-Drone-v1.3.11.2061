package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.internal.AbstractC8066yq;
import com.google.android.gms.p232c.BinderC4173f;
/* loaded from: classes.dex */
public class AdActivity extends Activity {

    /* renamed from: a */
    public static final String f13701a = "com.google.android.gms.ads.AdActivity";

    /* renamed from: b */
    public static final String f13702b = "AdActivity";

    /* renamed from: c */
    private AbstractC8066yq f13703c;

    /* renamed from: a */
    private void m27882a() {
        if (this.f13703c != null) {
            try {
                this.f13703c.mo12862l();
            } catch (RemoteException e) {
                C3784b.m26839d("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f13703c.mo12874a(i, i2, intent);
        } catch (Exception e) {
            C3784b.m26839d("Could not forward onActivityResult to ad overlay:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f13703c != null) {
                z = this.f13703c.mo12869e();
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward onBackPressed to ad overlay:", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f13703c.mo12872a(BinderC4173f.m25293a(configuration));
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to wrap configuration.", e);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13703c = C3514ac.m27584b().m27617b(this);
        if (this.f13703c == null) {
            C3784b.m26840d("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.f13703c.mo12873a(bundle);
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            if (this.f13703c != null) {
                this.f13703c.mo12863k();
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        try {
            if (this.f13703c != null) {
                this.f13703c.mo12865i();
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        try {
            if (this.f13703c == null) {
                return;
            }
            this.f13703c.mo12868f();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            if (this.f13703c == null) {
                return;
            }
            this.f13703c.mo12866h();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f13703c != null) {
                this.f13703c.mo12871b(bundle);
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        try {
            if (this.f13703c == null) {
                return;
            }
            this.f13703c.mo12867g();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        try {
            if (this.f13703c != null) {
                this.f13703c.mo12864j();
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        super.setContentView(i);
        m27882a();
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        m27882a();
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m27882a();
    }
}
