package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.C3424R;
import com.google.android.gms.ads.internal.C3779u;
import java.util.Map;
@aaa
/* loaded from: classes.dex */
public class aby {

    /* renamed from: a */
    private final Context f21058a;

    /* renamed from: b */
    private String f21059b;

    /* renamed from: c */
    private String f21060c;

    /* renamed from: d */
    private final float f21061d;

    /* renamed from: e */
    private float f21062e;

    /* renamed from: f */
    private float f21063f;

    /* renamed from: g */
    private float f21064g;

    /* renamed from: h */
    private int f21065h;

    public aby(Context context) {
        this.f21065h = 0;
        this.f21058a = context;
        this.f21061d = context.getResources().getDisplayMetrics().density;
    }

    public aby(Context context, String str) {
        this(context);
        this.f21059b = str;
    }

    /* renamed from: b */
    private void m18276b() {
        if (!(this.f21058a instanceof Activity)) {
            abr.c("Can not create dialog without Activity Context");
            return;
        }
        Resources m18430q = C3779u.m26886i().m18430q();
        new AlertDialog.Builder(this.f21058a).setTitle(m18430q != null ? m18430q.getString(C3424R.C3427string.debug_menu_title) : "Select a Debug Mode").setItems(new String[]{m18430q != null ? m18430q.getString(C3424R.C3427string.debug_menu_ad_information) : "Ad Information", m18430q != null ? m18430q.getString(C3424R.C3427string.debug_menu_creative_preview) : "Creative Preview", m18430q != null ? m18430q.getString(C3424R.C3427string.debug_menu_troubleshooting) : "Troubleshooting"}, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.aby.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i) {
                    case 0:
                        aby.this.m18273c();
                        return;
                    case 1:
                        abr.a("Debug mode [Creative Preview] selected.");
                        abu.m18391a(new Runnable() { // from class: com.google.android.gms.internal.aby.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C3779u.m26882m().m18268a(aby.this.f21058a, aby.this.f21060c);
                            }
                        });
                        return;
                    case 2:
                        abr.a("Debug mode [Troubleshooting] selected.");
                        abu.m18391a(new Runnable() { // from class: com.google.android.gms.internal.aby.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                C3779u.m26882m().m18262b(aby.this.f21058a, aby.this.f21060c);
                            }
                        });
                        return;
                    default:
                        return;
                }
            }
        }).create().show();
    }

    /* renamed from: c */
    static String m18271c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "No debug information";
        }
        Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
        StringBuilder sb = new StringBuilder();
        Map<String, String> m18363a = C3779u.m26890e().m18363a(build);
        for (String str2 : m18363a.keySet()) {
            sb.append(str2).append(" = ").append(m18363a.get(str2)).append("\n\n");
        }
        String trim = sb.toString().trim();
        return TextUtils.isEmpty(trim) ? "No debug information" : trim;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m18273c() {
        if (!(this.f21058a instanceof Activity)) {
            abr.c("Can not create dialog without Activity Context");
            return;
        }
        final String m18271c = m18271c(this.f21059b);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f21058a);
        builder.setMessage(m18271c);
        builder.setTitle("Ad Information");
        builder.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.aby.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                C3779u.m26890e().m18377a(aby.this.f21058a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", m18271c), "Share via"));
            }
        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.aby.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.create().show();
    }

    /* renamed from: a */
    public void m18281a() {
        if (C7788uf.f25852cD.m13486c().booleanValue()) {
            m18276b();
        } else {
            m18273c();
        }
    }

    /* renamed from: a */
    void m18280a(int i, float f, float f2) {
        if (i == 0) {
            this.f21065h = 0;
            this.f21062e = f;
            this.f21063f = f2;
            this.f21064g = f2;
        } else if (this.f21065h == -1) {
        } else {
            if (i != 2) {
                if (i != 1 || this.f21065h != 4) {
                    return;
                }
                m18281a();
                return;
            }
            if (f2 > this.f21063f) {
                this.f21063f = f2;
            } else if (f2 < this.f21064g) {
                this.f21064g = f2;
            }
            if (this.f21063f - this.f21064g > 30.0f * this.f21061d) {
                this.f21065h = -1;
                return;
            }
            if (this.f21065h == 0 || this.f21065h == 2) {
                if (f - this.f21062e >= 50.0f * this.f21061d) {
                    this.f21062e = f;
                    this.f21065h++;
                }
            } else if ((this.f21065h == 1 || this.f21065h == 3) && f - this.f21062e <= (-50.0f) * this.f21061d) {
                this.f21062e = f;
                this.f21065h++;
            }
            if (this.f21065h == 1 || this.f21065h == 3) {
                if (f <= this.f21062e) {
                    return;
                }
                this.f21062e = f;
            } else if (this.f21065h != 2 || f >= this.f21062e) {
            } else {
                this.f21062e = f;
            }
        }
    }

    /* renamed from: a */
    public void m18279a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            m18280a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        m18280a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: a */
    public void m18277a(String str) {
        this.f21060c = str;
    }

    /* renamed from: b */
    public void m18274b(String str) {
        this.f21059b = str;
    }
}
