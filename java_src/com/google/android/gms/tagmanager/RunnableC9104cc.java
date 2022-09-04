package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.AbstractC6910eq;
import com.google.android.gms.internal.AbstractC7030gi;
import com.google.android.gms.internal.C6899en;
import com.google.android.gms.internal.C6911er;
import com.google.android.gms.internal.C6912es;
import com.google.android.gms.tagmanager.AbstractC9063av;
import com.google.android.gms.tagmanager.C9092bs;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.google.android.gms.tagmanager.cc */
/* loaded from: classes2.dex */
class RunnableC9104cc implements Runnable {

    /* renamed from: a */
    private final Context f28778a;

    /* renamed from: b */
    private final C6911er f28779b;

    /* renamed from: c */
    private final String f28780c;

    /* renamed from: d */
    private final String f28781d;

    /* renamed from: e */
    private AbstractC9063av<AbstractC7030gi.C7040j> f28782e;

    /* renamed from: f */
    private volatile C9183dq f28783f;

    /* renamed from: g */
    private volatile String f28784g;

    /* renamed from: h */
    private volatile String f28785h;

    RunnableC9104cc(Context context, String str, C6911er c6911er, C9183dq c9183dq) {
        this.f28778a = context;
        this.f28779b = c6911er;
        this.f28780c = str;
        this.f28783f = c9183dq;
        String valueOf = String.valueOf("/r?id=");
        String valueOf2 = String.valueOf(str);
        this.f28781d = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        this.f28784g = this.f28781d;
        this.f28785h = null;
    }

    public RunnableC9104cc(Context context, String str, C9183dq c9183dq) {
        this(context, str, new C6911er(), c9183dq);
    }

    /* renamed from: b */
    private boolean m9242b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f28778a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            C9065aw.m9295e("...no network connectivity");
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m9240c() {
        if (!m9242b()) {
            this.f28782e.mo9028a(AbstractC9063av.EnumC9064a.NOT_AVAILABLE);
            return;
        }
        C9065aw.m9295e("Start loading resource from network ...");
        String m9245a = m9245a();
        AbstractC6910eq m15962a = this.f28779b.m15962a();
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = m15962a.mo15963a(m9245a);
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    C9065aw.m9298b(new StringBuilder(String.valueOf(m9245a).length() + 40 + String.valueOf(valueOf).length()).append("Error when loading resources from url: ").append(m9245a).append(" ").append(valueOf).toString(), e);
                    this.f28782e.mo9028a(AbstractC9063av.EnumC9064a.IO_ERROR);
                    m15962a.mo15964a();
                    return;
                }
            } catch (C6912es e2) {
                String valueOf2 = String.valueOf(m9245a);
                C9065aw.m9299b(valueOf2.length() != 0 ? "Error when loading resource for url: ".concat(valueOf2) : new String("Error when loading resource for url: "));
                this.f28782e.mo9028a(AbstractC9063av.EnumC9064a.SERVER_UNAVAILABLE_ERROR);
            } catch (FileNotFoundException e3) {
                String str = this.f28780c;
                C9065aw.m9299b(new StringBuilder(String.valueOf(m9245a).length() + 79 + String.valueOf(str).length()).append("No data is retrieved from the given url: ").append(m9245a).append(". Make sure container_id: ").append(str).append(" is correct.").toString());
                this.f28782e.mo9028a(AbstractC9063av.EnumC9064a.SERVER_ERROR);
                m15962a.mo15964a();
                return;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C6899en.m16009a(inputStream, byteArrayOutputStream);
                AbstractC7030gi.C7040j m15723a = AbstractC7030gi.C7040j.m15723a(byteArrayOutputStream.toByteArray());
                String valueOf3 = String.valueOf(m15723a);
                C9065aw.m9295e(new StringBuilder(String.valueOf(valueOf3).length() + 43).append("Successfully loaded supplemented resource: ").append(valueOf3).toString());
                if (m15723a.f23783b == null && m15723a.f23782a.length == 0) {
                    String valueOf4 = String.valueOf(this.f28780c);
                    C9065aw.m9295e(valueOf4.length() != 0 ? "No change for container: ".concat(valueOf4) : new String("No change for container: "));
                }
                this.f28782e.mo9027a((AbstractC9063av<AbstractC7030gi.C7040j>) m15723a);
                m15962a.mo15964a();
                C9065aw.m9295e("Load resource from network finished.");
            } catch (IOException e4) {
                String valueOf5 = String.valueOf(e4.getMessage());
                C9065aw.m9298b(new StringBuilder(String.valueOf(m9245a).length() + 51 + String.valueOf(valueOf5).length()).append("Error when parsing downloaded resources from url: ").append(m9245a).append(" ").append(valueOf5).toString(), e4);
                this.f28782e.mo9028a(AbstractC9063av.EnumC9064a.SERVER_ERROR);
                m15962a.mo15964a();
            }
        } catch (Throwable th) {
            m15962a.mo15964a();
            throw th;
        }
    }

    /* renamed from: a */
    String m9245a() {
        String valueOf = String.valueOf(this.f28783f.m9010a());
        String str = this.f28784g;
        String valueOf2 = String.valueOf("&v=a65833898");
        String sb = new StringBuilder(String.valueOf(valueOf).length() + 0 + String.valueOf(str).length() + String.valueOf(valueOf2).length()).append(valueOf).append(str).append(valueOf2).toString();
        if (this.f28785h != null && !this.f28785h.trim().equals("")) {
            String valueOf3 = String.valueOf(sb);
            String valueOf4 = String.valueOf("&pv=");
            String str2 = this.f28785h;
            sb = new StringBuilder(String.valueOf(valueOf3).length() + 0 + String.valueOf(valueOf4).length() + String.valueOf(str2).length()).append(valueOf3).append(valueOf4).append(str2).toString();
        }
        if (C9092bs.m9265a().m9262b().equals(C9092bs.EnumC9093a.CONTAINER_DEBUG)) {
            String valueOf5 = String.valueOf(sb);
            String valueOf6 = String.valueOf("&gtm_debug=x");
            return valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5);
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9244a(AbstractC9063av<AbstractC7030gi.C7040j> abstractC9063av) {
        this.f28782e = abstractC9063av;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9243a(String str) {
        if (str == null) {
            this.f28784g = this.f28781d;
            return;
        }
        String valueOf = String.valueOf(str);
        C9065aw.m9296d(valueOf.length() != 0 ? "Setting CTFE URL path: ".concat(valueOf) : new String("Setting CTFE URL path: "));
        this.f28784g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m9241b(String str) {
        String valueOf = String.valueOf(str);
        C9065aw.m9296d(valueOf.length() != 0 ? "Setting previous container version: ".concat(valueOf) : new String("Setting previous container version: "));
        this.f28785h = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f28782e == null) {
            throw new IllegalStateException("callback must be set before execute");
        }
        this.f28782e.mo9030a();
        m9240c();
    }
}
