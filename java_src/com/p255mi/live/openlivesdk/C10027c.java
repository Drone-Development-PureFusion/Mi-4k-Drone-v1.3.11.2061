package com.p255mi.live.openlivesdk;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import com.p255mi.live.openlivesdk.p256a.AbstractC10023a;
/* renamed from: com.mi.live.openlivesdk.c */
/* loaded from: classes2.dex */
public class C10027c {

    /* renamed from: a */
    static final String f30912a = "liveopen://startstream?appid=%s&appkey=%s&packagename=%s&playui=%s";

    /* renamed from: b */
    static final String f30913b = "liveopen://endstream?appid=%s&appkey=%s&packagename=%s";

    /* renamed from: c */
    private String f30914c;

    /* renamed from: d */
    private String f30915d;

    /* renamed from: e */
    private int f30916e;

    /* renamed from: f */
    private AbstractC10023a f30917f;

    /* renamed from: g */
    private Application f30918g;

    /* renamed from: h */
    private BroadcastReceiver f30919h = new BroadcastReceiver() { // from class: com.mi.live.openlivesdk.c.1
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            if (intent != null) {
                String action = intent.getAction();
                switch (action.hashCode()) {
                    case -2077898362:
                        if (action.equals(C10024b.f30899b)) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    case 1390740215:
                        if (action.equals(C10024b.f30900c)) {
                            z = true;
                            break;
                        }
                        z = true;
                        break;
                    default:
                        z = true;
                        break;
                }
                switch (z) {
                    case false:
                        String stringExtra = intent.getStringExtra(C10024b.f30901d);
                        if (C10027c.this.f30917f == null) {
                            return;
                        }
                        if (TextUtils.isEmpty(stringExtra)) {
                            C10027c.this.f30917f.mo6440a(-1, "");
                            return;
                        } else {
                            C10027c.this.f30917f.mo6439a(stringExtra);
                            return;
                        }
                    case true:
                        if (C10027c.this.f30917f == null) {
                            return;
                        }
                        C10027c.this.f30917f.mo6441a();
                        return;
                    default:
                        return;
                }
            }
        }
    };

    public C10027c(String str, String str2, int i, AbstractC10023a abstractC10023a, Application application) {
        this.f30916e = 0;
        this.f30914c = str;
        this.f30915d = str2;
        this.f30917f = abstractC10023a;
        this.f30918g = application;
        this.f30916e = i;
        m6434b();
    }

    /* renamed from: b */
    private void m6434b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C10024b.f30899b);
        intentFilter.addAction(C10024b.f30900c);
        if (this.f30918g != null) {
            this.f30918g.registerReceiver(this.f30919h, intentFilter);
        }
    }

    /* renamed from: c */
    private void m6432c() {
        if (this.f30918g != null) {
            this.f30918g.unregisterReceiver(this.f30919h);
        }
    }

    /* renamed from: a */
    public void m6437a() {
        this.f30917f = null;
        m6432c();
        this.f30918g = null;
    }

    /* renamed from: a */
    public void m6436a(Context context) {
        if (context != null) {
            int m6431a = C10029d.m6431a(context);
            if (m6431a == 1) {
                Intent intent = new Intent();
                intent.setAction(C10024b.f30898a);
                intent.setData(Uri.parse(String.format(f30912a, this.f30914c, this.f30915d, context.getPackageName(), Integer.valueOf(this.f30916e))));
                context.startActivity(intent);
            } else if (m6431a == -2) {
                this.f30917f.mo6440a(-2, "MiLive App not install");
            } else if (m6431a != -3) {
            } else {
                this.f30917f.mo6440a(-3, "MiLive App version is too low");
            }
        }
    }

    /* renamed from: b */
    public void m6433b(Context context) {
        if (context != null) {
            int m6431a = C10029d.m6431a(context);
            if (m6431a == 1) {
                Intent intent = new Intent();
                intent.setAction(C10024b.f30898a);
                intent.setData(Uri.parse(String.format(f30913b, this.f30914c, this.f30915d, context.getPackageName())));
                context.startActivity(intent);
            } else if (m6431a == -2) {
                this.f30917f.mo6438b(-2, "MiLive App not install");
            } else if (m6431a != -3) {
            } else {
                this.f30917f.mo6438b(-3, "MiLive App version is too low");
            }
        }
    }
}
