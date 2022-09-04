package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.common.util.C4692o;
import com.google.android.gms.internal.acc;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
@aaa
/* loaded from: classes.dex */
public class abz {

    /* renamed from: a */
    private final Object f21072a = new Object();

    /* renamed from: b */
    private String f21073b = "";

    /* renamed from: c */
    private String f21074c = "";

    /* renamed from: d */
    private boolean f21075d = false;

    /* renamed from: a */
    private Uri m18267a(Context context, String str, String str2) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", m18269a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        return buildUpon.build();
    }

    /* renamed from: f */
    private void m18258f(Context context, String str) {
        C3779u.m26890e().m18376a(context, m18267a(context, C7788uf.f25853cE.m13486c(), str));
    }

    /* renamed from: a */
    public String m18270a() {
        String str;
        synchronized (this.f21072a) {
            str = this.f21074c;
        }
        return str;
    }

    /* renamed from: a */
    public String m18269a(Context context) {
        String str;
        synchronized (this.f21072a) {
            if (TextUtils.isEmpty(this.f21073b)) {
                this.f21073b = C3779u.m26890e().m18335b(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f21073b)) {
                    this.f21073b = C3779u.m26890e().m18329c();
                    C3779u.m26890e().m18334b(context, "debug_signals_id.txt", this.f21073b);
                }
            }
            str = this.f21073b;
        }
        return str;
    }

    /* renamed from: a */
    public void m18268a(Context context, String str) {
        if (m18261c(context, str)) {
            abr.a("Device is linked for in app preview.");
        } else {
            m18258f(context, str);
        }
    }

    /* renamed from: a */
    public void m18266a(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = m18267a(context, C7788uf.f25856cH.m13486c(), str3).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        C3779u.m26890e().m18370a(context, str, buildUpon.build().toString());
    }

    /* renamed from: a */
    public void m18265a(String str) {
        synchronized (this.f21072a) {
            this.f21074c = str;
        }
    }

    /* renamed from: a */
    public void m18264a(boolean z) {
        synchronized (this.f21072a) {
            this.f21075d = z;
        }
    }

    /* renamed from: b */
    public void m18262b(Context context, String str) {
        if (m18260d(context, str)) {
            abr.a("Device is linked for debug signals.");
        } else {
            m18258f(context, str);
        }
    }

    /* renamed from: b */
    public boolean m18263b() {
        boolean z;
        synchronized (this.f21072a) {
            z = this.f21075d;
        }
        return z;
    }

    /* renamed from: c */
    boolean m18261c(Context context, String str) {
        String m18259e = m18259e(context, m18267a(context, C7788uf.f25854cF.m13486c(), str).toString());
        if (TextUtils.isEmpty(m18259e)) {
            abr.a("Not linked for in app preview.");
            return false;
        }
        m18265a(m18259e.trim());
        return true;
    }

    /* renamed from: d */
    boolean m18260d(Context context, String str) {
        String m18259e = m18259e(context, m18267a(context, C7788uf.f25855cG.m13486c(), str).toString());
        if (TextUtils.isEmpty(m18259e)) {
            abr.a("Not linked for debug signals.");
            return false;
        }
        boolean parseBoolean = Boolean.parseBoolean(m18259e.trim());
        m18264a(parseBoolean);
        return parseBoolean;
    }

    /* renamed from: e */
    protected String m18259e(Context context, final String str) {
        aco m18244a = new acc(context).m18244a(str, new acc.AbstractC6182a<String>() { // from class: com.google.android.gms.internal.abz.1
            @Override // com.google.android.gms.internal.acc.AbstractC6182a
            /* renamed from: a */
            public String mo12729b() {
                String valueOf = String.valueOf(str);
                abr.d(valueOf.length() != 0 ? "Error getting a response from: ".concat(valueOf) : new String("Error getting a response from: "));
                return null;
            }

            @Override // com.google.android.gms.internal.acc.AbstractC6182a
            /* renamed from: a */
            public String mo12728b(InputStream inputStream) {
                try {
                    String str2 = new String(C4692o.m23119a(inputStream, true), "UTF-8");
                    String str3 = str;
                    abr.a(new StringBuilder(String.valueOf(str3).length() + 49 + String.valueOf(str2).length()).append("Response received from server. \nURL: ").append(str3).append("\n Response: ").append(str2).toString());
                    return str2;
                } catch (IOException e) {
                    String valueOf = String.valueOf(str);
                    abr.d(valueOf.length() != 0 ? "Error connecting to url: ".concat(valueOf) : new String("Error connecting to url: "), e);
                    return null;
                }
            }
        });
        try {
            return (String) m18244a.get(C7788uf.f25857cI.m13486c().intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(str);
            abr.b(valueOf.length() != 0 ? "Interrupted while retriving a response from: ".concat(valueOf) : new String("Interrupted while retriving a response from: "), e);
            m18244a.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            String valueOf2 = String.valueOf(str);
            abr.b(valueOf2.length() != 0 ? "Timeout while retriving a response from: ".concat(valueOf2) : new String("Timeout while retriving a response from: "), e2);
            m18244a.cancel(true);
            return null;
        } catch (Exception e3) {
            String valueOf3 = String.valueOf(str);
            abr.b(valueOf3.length() != 0 ? "Error retriving a response from: ".concat(valueOf3) : new String("Error retriving a response from: "), e3);
            return null;
        }
    }
}
