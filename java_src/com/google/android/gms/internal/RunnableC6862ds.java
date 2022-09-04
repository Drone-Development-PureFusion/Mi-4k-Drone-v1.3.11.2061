package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4692o;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.google.android.gms.internal.ds */
/* loaded from: classes2.dex */
public class RunnableC6862ds implements Runnable {

    /* renamed from: a */
    private final Context f23067a;

    /* renamed from: b */
    private final AbstractC6840dh f23068b;

    /* renamed from: c */
    private final C6861dr f23069c;

    /* renamed from: d */
    private final C6849dl f23070d;

    /* renamed from: e */
    private final C6858do f23071e;

    public RunnableC6862ds(Context context, C6849dl c6849dl, AbstractC6840dh abstractC6840dh) {
        this(context, c6849dl, abstractC6840dh, new C6861dr(), new C6858do());
    }

    RunnableC6862ds(Context context, C6849dl c6849dl, AbstractC6840dh abstractC6840dh, C6861dr c6861dr, C6858do c6858do) {
        this.f23067a = (Context) C4588d.m23627a(context);
        this.f23068b = (AbstractC6840dh) C4588d.m23627a(abstractC6840dh);
        this.f23070d = c6849dl;
        this.f23069c = c6861dr;
        this.f23071e = c6858do;
    }

    public RunnableC6862ds(Context context, C6849dl c6849dl, AbstractC6840dh abstractC6840dh, String str) {
        this(context, c6849dl, abstractC6840dh, new C6861dr(), new C6858do());
        this.f23071e.m16105a(str);
    }

    /* renamed from: a */
    void m16096a() {
        if (!m16094b()) {
            this.f23068b.m16146a(0, 0);
            return;
        }
        aph.m16391d("Starting to load resource from Network.");
        AbstractC6860dq m16097a = this.f23069c.m16097a();
        InputStream inputStream = null;
        try {
            String m16106a = this.f23071e.m16106a(this.f23070d.m16128a());
            String valueOf = String.valueOf(m16106a);
            aph.m16391d(valueOf.length() != 0 ? "Loading resource from ".concat(valueOf) : new String("Loading resource from "));
            try {
                try {
                    inputStream = m16097a.mo16098a(m16106a);
                } catch (C6864du e) {
                    String valueOf2 = String.valueOf(m16106a);
                    aph.m16396a(valueOf2.length() != 0 ? "NetworkLoader: Error when loading resource for url: ".concat(valueOf2) : new String("NetworkLoader: Error when loading resource for url: "));
                    this.f23068b.m16146a(3, 0);
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C4692o.m23122a(inputStream, byteArrayOutputStream);
                    this.f23068b.m16145a(byteArrayOutputStream.toByteArray());
                    m16097a.mo16099a();
                } catch (IOException e2) {
                    String valueOf3 = String.valueOf(e2.getMessage());
                    aph.m16395a(new StringBuilder(String.valueOf(m16106a).length() + 66 + String.valueOf(valueOf3).length()).append("NetworkLoader: Error when parsing downloaded resources from url: ").append(m16106a).append(" ").append(valueOf3).toString(), e2);
                    this.f23068b.m16146a(2, 0);
                    m16097a.mo16099a();
                }
            } catch (FileNotFoundException e3) {
                String valueOf4 = String.valueOf(m16106a);
                aph.m16396a(valueOf4.length() != 0 ? "NetworkLoader: No data was retrieved from the given url: ".concat(valueOf4) : new String("NetworkLoader: No data was retrieved from the given url: "));
                this.f23068b.m16146a(2, 0);
                m16097a.mo16099a();
            } catch (IOException e4) {
                String valueOf5 = String.valueOf(e4.getMessage());
                aph.m16395a(new StringBuilder(String.valueOf(m16106a).length() + 54 + String.valueOf(valueOf5).length()).append("NetworkLoader: Error when loading resource from url: ").append(m16106a).append(" ").append(valueOf5).toString(), e4);
                this.f23068b.m16146a(1, 0);
                m16097a.mo16099a();
            }
        } catch (Throwable th) {
            m16097a.mo16099a();
            throw th;
        }
    }

    /* renamed from: a */
    boolean m16095a(String str) {
        return this.f23067a.getPackageManager().checkPermission(str, this.f23067a.getPackageName()) == 0;
    }

    /* renamed from: b */
    boolean m16094b() {
        if (!m16095a("android.permission.INTERNET")) {
            aph.m16396a("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        } else if (!m16095a("android.permission.ACCESS_NETWORK_STATE")) {
            aph.m16396a("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
            return false;
        } else {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f23067a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            aph.m16394b("No network connectivity - Offline");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        m16096a();
    }
}
