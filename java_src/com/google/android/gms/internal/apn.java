package com.google.android.gms.internal;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
/* loaded from: classes2.dex */
public class apn {

    /* renamed from: a */
    private static apn f22725a;

    /* renamed from: b */
    private volatile EnumC6715a f22726b;

    /* renamed from: c */
    private volatile String f22727c;

    /* renamed from: d */
    private volatile String f22728d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.apn$a */
    /* loaded from: classes2.dex */
    public enum EnumC6715a {
        NONE,
        CONTAINER
    }

    apn() {
        m16348e();
    }

    /* renamed from: a */
    public static apn m16354a() {
        apn apnVar;
        synchronized (apn.class) {
            if (f22725a == null) {
                f22725a = new apn();
            }
            apnVar = f22725a;
        }
        return apnVar;
    }

    /* renamed from: a */
    public boolean m16353a(String str) {
        return m16351b() && m16349d().equals(str);
    }

    /* renamed from: a */
    public synchronized boolean m16352a(String str, Uri uri) {
        boolean z = false;
        synchronized (this) {
            try {
                String decode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\S+")) {
                    String valueOf = String.valueOf(decode);
                    aph.m16394b(valueOf.length() != 0 ? "Bad preview url: ".concat(valueOf) : new String("Bad preview url: "));
                } else {
                    String queryParameter = uri.getQueryParameter("id");
                    String queryParameter2 = uri.getQueryParameter("gtm_auth");
                    String queryParameter3 = uri.getQueryParameter("gtm_preview");
                    if (!str.equals(queryParameter)) {
                        aph.m16394b("Preview fails (container doesn't match the container specified by the asset)");
                    } else if (queryParameter == null || queryParameter.length() <= 0) {
                        String valueOf2 = String.valueOf(decode);
                        aph.m16394b(valueOf2.length() != 0 ? "Bad preview url: ".concat(valueOf2) : new String("Bad preview url: "));
                    } else {
                        if (queryParameter3 == null || queryParameter3.length() != 0) {
                            if (queryParameter3 == null || queryParameter3.length() <= 0 || queryParameter2 == null || queryParameter2.length() <= 0) {
                                String valueOf3 = String.valueOf(decode);
                                aph.m16394b(valueOf3.length() != 0 ? "Bad preview url: ".concat(valueOf3) : new String("Bad preview url: "));
                            } else {
                                this.f22726b = EnumC6715a.CONTAINER;
                                this.f22728d = uri.getQuery();
                                this.f22727c = queryParameter;
                            }
                        } else if (!queryParameter.equals(this.f22727c) || this.f22726b == EnumC6715a.NONE) {
                            aph.m16394b("Error in exiting preview mode. The container is not in preview.");
                        } else {
                            String valueOf4 = String.valueOf(this.f22727c);
                            aph.m16391d(valueOf4.length() != 0 ? "Exit preview mode for container: ".concat(valueOf4) : new String("Exit preview mode for container: "));
                            this.f22726b = EnumC6715a.NONE;
                            this.f22727c = null;
                            this.f22728d = null;
                        }
                        z = true;
                    }
                }
            } catch (UnsupportedEncodingException e) {
                String valueOf5 = String.valueOf(e);
                aph.m16394b(new StringBuilder(String.valueOf(valueOf5).length() + 32).append("Error decoding the preview url: ").append(valueOf5).toString());
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean m16351b() {
        return this.f22726b == EnumC6715a.CONTAINER;
    }

    /* renamed from: c */
    public String m16350c() {
        return this.f22728d;
    }

    /* renamed from: d */
    public String m16349d() {
        return this.f22727c;
    }

    /* renamed from: e */
    void m16348e() {
        this.f22726b = EnumC6715a.NONE;
        this.f22728d = null;
        this.f22727c = null;
    }
}
