package com.fimi.soul.p166a.p167a;

import android.app.Activity;
import android.preference.PreferenceManager;
import android.view.WindowManager;
/* renamed from: com.fimi.soul.a.a.c */
/* loaded from: classes.dex */
public class C1714c {

    /* renamed from: a */
    public int f4303a;

    /* renamed from: b */
    private Activity f4304b;

    public C1714c(Activity activity) {
        this.f4304b = activity;
    }

    /* renamed from: c */
    private void m34367c() {
        this.f4304b.setRequestedOrientation(this.f4303a);
    }

    /* renamed from: d */
    private void m34366d() {
        int rotation = ((WindowManager) this.f4304b.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = this.f4304b.getResources().getConfiguration().orientation;
        if (!(((rotation == 0 || rotation == 2) && i == 2) || ((rotation == 1 || rotation == 3) && i == 1))) {
            switch (rotation) {
                case 0:
                    this.f4303a = 1;
                    break;
                case 1:
                    this.f4303a = 0;
                    break;
                case 2:
                    this.f4303a = 9;
                    break;
                case 3:
                    this.f4303a = 8;
                    break;
            }
        } else {
            switch (rotation) {
                case 0:
                    this.f4303a = 0;
                    break;
                case 1:
                    this.f4303a = 9;
                    break;
                case 2:
                    this.f4303a = 8;
                    break;
                case 3:
                    this.f4303a = 1;
                    break;
            }
        }
        m34367c();
    }

    /* renamed from: e */
    private boolean m34365e() {
        return PreferenceManager.getDefaultSharedPreferences(this.f4304b.getApplicationContext()).getBoolean("pref_lock_screen_orientation", false);
    }

    /* renamed from: a */
    public void m34369a() {
        if (m34365e()) {
            m34366d();
        }
    }

    /* renamed from: b */
    public void m34368b() {
        if (this.f4303a != -1) {
            this.f4303a = -1;
            m34367c();
        }
    }
}
