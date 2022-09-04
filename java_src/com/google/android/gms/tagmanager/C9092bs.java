package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
/* renamed from: com.google.android.gms.tagmanager.bs */
/* loaded from: classes2.dex */
class C9092bs {

    /* renamed from: a */
    private static C9092bs f28757a;

    /* renamed from: b */
    private volatile EnumC9093a f28758b;

    /* renamed from: c */
    private volatile String f28759c;

    /* renamed from: d */
    private volatile String f28760d;

    /* renamed from: e */
    private volatile String f28761e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.bs$a */
    /* loaded from: classes2.dex */
    public enum EnumC9093a {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG
    }

    C9092bs() {
        m9258e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C9092bs m9265a() {
        C9092bs c9092bs;
        synchronized (C9092bs.class) {
            if (f28757a == null) {
                f28757a = new C9092bs();
            }
            c9092bs = f28757a;
        }
        return c9092bs;
    }

    /* renamed from: a */
    private String m9263a(String str) {
        return str.split("&")[0].split("=")[1];
    }

    /* renamed from: b */
    private String m9261b(Uri uri) {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean m9264a(Uri uri) {
        boolean z = true;
        synchronized (this) {
            try {
                String decode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                    String valueOf = String.valueOf(decode);
                    C9065aw.m9295e(valueOf.length() != 0 ? "Container preview url: ".concat(valueOf) : new String("Container preview url: "));
                    if (decode.matches(".*?&gtm_debug=x$")) {
                        this.f28758b = EnumC9093a.CONTAINER_DEBUG;
                    } else {
                        this.f28758b = EnumC9093a.CONTAINER;
                    }
                    this.f28761e = m9261b(uri);
                    if (this.f28758b == EnumC9093a.CONTAINER || this.f28758b == EnumC9093a.CONTAINER_DEBUG) {
                        String valueOf2 = String.valueOf("/r?");
                        String valueOf3 = String.valueOf(this.f28761e);
                        this.f28760d = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
                    }
                    this.f28759c = m9263a(this.f28761e);
                } else if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                    String valueOf4 = String.valueOf(decode);
                    C9065aw.m9299b(valueOf4.length() != 0 ? "Invalid preview uri: ".concat(valueOf4) : new String("Invalid preview uri: "));
                    z = false;
                } else if (m9263a(uri.getQuery()).equals(this.f28759c)) {
                    String valueOf5 = String.valueOf(this.f28759c);
                    C9065aw.m9295e(valueOf5.length() != 0 ? "Exit preview mode for container: ".concat(valueOf5) : new String("Exit preview mode for container: "));
                    this.f28758b = EnumC9093a.NONE;
                    this.f28760d = null;
                } else {
                    z = false;
                }
            } catch (UnsupportedEncodingException e) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public EnumC9093a m9262b() {
        return this.f28758b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m9260c() {
        return this.f28760d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m9259d() {
        return this.f28759c;
    }

    /* renamed from: e */
    void m9258e() {
        this.f28758b = EnumC9093a.NONE;
        this.f28760d = null;
        this.f28759c = null;
        this.f28761e = null;
    }
}
