package com.google.android.gms.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import com.google.android.gms.common.C4515b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.zzqv;
/* loaded from: classes2.dex */
public abstract class ahm extends aij implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    protected boolean f21740a;

    /* renamed from: b */
    protected boolean f21741b;

    /* renamed from: c */
    protected final C4515b f21742c;

    /* renamed from: e */
    private ConnectionResult f21743e;

    /* renamed from: f */
    private int f21744f;

    /* renamed from: g */
    private final Handler f21745g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ahm$a */
    /* loaded from: classes2.dex */
    public class RunnableC6346a implements Runnable {
        private RunnableC6346a() {
        }

        @Override // java.lang.Runnable
        @MainThread
        public void run() {
            if (!ahm.this.f21740a) {
                return;
            }
            if (ahm.this.f21743e.m24050a()) {
                ahm.this.f21940d.startActivityForResult(GoogleApiActivity.m24025b(ahm.this.e(), ahm.this.f21743e.m24045d(), ahm.this.f21744f, false), 1);
            } else if (ahm.this.f21742c.mo23376a(ahm.this.f21743e.m24046c())) {
                ahm.this.f21742c.m23914a(ahm.this.e(), ahm.this.f21940d, ahm.this.f21743e.m24046c(), 2, ahm.this);
            } else if (ahm.this.f21743e.m24046c() != 18) {
                ahm.this.mo17206a(ahm.this.f21743e, ahm.this.f21744f);
            } else {
                final Dialog m23915a = ahm.this.f21742c.m23915a(ahm.this.e(), ahm.this);
                ahm.this.f21742c.m23909a(ahm.this.e().getApplicationContext(), new zzqv.AbstractC8149a() { // from class: com.google.android.gms.internal.ahm.a.1
                    @Override // com.google.android.gms.internal.zzqv.AbstractC8149a
                    /* renamed from: a */
                    public void mo12692a() {
                        ahm.this.m17470d();
                        if (m23915a.isShowing()) {
                            m23915a.dismiss();
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ahm(aik aikVar) {
        this(aikVar, C4515b.m23920a());
    }

    ahm(aik aikVar, C4515b c4515b) {
        super(aikVar);
        this.f21744f = -1;
        this.f21745g = new Handler(Looper.getMainLooper());
        this.f21742c = c4515b;
    }

    @Override // com.google.android.gms.internal.aij
    /* renamed from: a */
    public void mo14499a() {
        super.mo14499a();
        this.f21740a = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.aij
    /* renamed from: a */
    public void mo17223a(int i, int i2, Intent intent) {
        boolean z = true;
        switch (i) {
            case 1:
                if (i2 != -1) {
                    if (i2 == 0) {
                        this.f21743e = new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null);
                    }
                    z = false;
                    break;
                }
                break;
            case 2:
                int mo23375a = this.f21742c.mo23375a((Context) e());
                if (mo23375a != 0) {
                    z = false;
                }
                if (this.f21743e.m24046c() == 18 && mo23375a == 18) {
                    return;
                }
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            m17470d();
        } else {
            mo17206a(this.f21743e, this.f21744f);
        }
    }

    @Override // com.google.android.gms.internal.aij
    /* renamed from: a */
    public void mo17222a(Bundle bundle) {
        super.mo17222a(bundle);
        if (bundle != null) {
            this.f21741b = bundle.getBoolean("resolving_error", false);
            if (!this.f21741b) {
                return;
            }
            this.f21744f = bundle.getInt("failed_client_id", -1);
            this.f21743e = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
        }
    }

    /* renamed from: a */
    protected abstract void mo17206a(ConnectionResult connectionResult, int i);

    @Override // com.google.android.gms.internal.aij
    /* renamed from: b */
    public void mo17220b() {
        super.mo17220b();
        this.f21740a = true;
    }

    @Override // com.google.android.gms.internal.aij
    /* renamed from: b */
    public void mo17218b(Bundle bundle) {
        super.mo17218b(bundle);
        bundle.putBoolean("resolving_error", this.f21741b);
        if (this.f21741b) {
            bundle.putInt("failed_client_id", this.f21744f);
            bundle.putInt("failed_status", this.f21743e.m24046c());
            bundle.putParcelable("failed_resolution", this.f21743e.m24045d());
        }
    }

    /* renamed from: b */
    public void m17472b(ConnectionResult connectionResult, int i) {
        if (!this.f21741b) {
            this.f21741b = true;
            this.f21744f = i;
            this.f21743e = connectionResult;
            this.f21745g.post(new RunnableC6346a());
        }
    }

    /* renamed from: c */
    protected abstract void mo17205c();

    /* renamed from: d */
    protected void m17470d() {
        this.f21744f = -1;
        this.f21741b = false;
        this.f21743e = null;
        mo17205c();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        mo17206a(new ConnectionResult(13, null), this.f21744f);
        m17470d();
    }
}
