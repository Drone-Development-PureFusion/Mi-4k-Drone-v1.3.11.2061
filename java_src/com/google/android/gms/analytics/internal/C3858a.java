package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.p225a.C3433a;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
/* renamed from: com.google.android.gms.analytics.internal.a */
/* loaded from: classes2.dex */
public class C3858a extends AbstractC3920t {

    /* renamed from: a */
    public static boolean f14965a;

    /* renamed from: b */
    private C3433a.C3434a f14966b;

    /* renamed from: c */
    private final C3905m f14967c;

    /* renamed from: d */
    private String f14968d;

    /* renamed from: e */
    private boolean f14969e = false;

    /* renamed from: f */
    private Object f14970f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3858a(C3922v c3922v) {
        super(c3922v);
        this.f14967c = new C3905m(c3922v.m26110d());
    }

    /* renamed from: a */
    private static String m26449a(String str) {
        MessageDigest m26185d = C3909p.m26185d("MD5");
        if (m26185d == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m26185d.digest(str.getBytes())));
    }

    /* renamed from: a */
    private boolean m26450a(C3433a.C3434a c3434a, C3433a.C3434a c3434a2) {
        String str;
        String str2 = null;
        String m27865a = c3434a2 == null ? null : c3434a2.m27865a();
        if (TextUtils.isEmpty(m27865a)) {
            return true;
        }
        String m26400b = x().m26400b();
        synchronized (this.f14970f) {
            if (!this.f14969e) {
                this.f14968d = m26444e();
                this.f14969e = true;
            } else if (TextUtils.isEmpty(this.f14968d)) {
                if (c3434a != null) {
                    str2 = c3434a.m27865a();
                }
                if (str2 == null) {
                    String valueOf = String.valueOf(m27865a);
                    String valueOf2 = String.valueOf(m26400b);
                    return m26447b(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                }
                String valueOf3 = String.valueOf(str2);
                String valueOf4 = String.valueOf(m26400b);
                this.f14968d = m26449a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            }
            String valueOf5 = String.valueOf(m27865a);
            String valueOf6 = String.valueOf(m26400b);
            String m26449a = m26449a(valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5));
            if (TextUtils.isEmpty(m26449a)) {
                return false;
            }
            if (m26449a.equals(this.f14968d)) {
                return true;
            }
            if (!TextUtils.isEmpty(this.f14968d)) {
                q("Resetting the client id because Advertising Id changed.");
                str = x().m26399c();
                a("New client Id", str);
            } else {
                str = m26400b;
            }
            String valueOf7 = String.valueOf(m27865a);
            String valueOf8 = String.valueOf(str);
            return m26447b(valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7));
        }
    }

    /* renamed from: b */
    private boolean m26447b(String str) {
        try {
            String m26449a = m26449a(str);
            q("Storing hashed adid.");
            FileOutputStream openFileOutput = o().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(m26449a.getBytes());
            openFileOutput.close();
            this.f14968d = m26449a;
            return true;
        } catch (IOException e) {
            e("Error creating hash file", e);
            return false;
        }
    }

    /* renamed from: f */
    private synchronized C3433a.C3434a m26443f() {
        if (this.f14967c.m26221a(1000L)) {
            this.f14967c.m26222a();
            C3433a.C3434a m26445d = m26445d();
            if (m26450a(this.f14966b, m26445d)) {
                this.f14966b = m26445d;
            } else {
                u("Failed to reset client id on adid change. Not using adid");
                this.f14966b = new C3433a.C3434a("", false);
            }
        }
        return this.f14966b;
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
    }

    /* renamed from: b */
    public boolean m26448b() {
        D();
        C3433a.C3434a m26443f = m26443f();
        return m26443f != null && !m26443f.m27864b();
    }

    /* renamed from: c */
    public String m26446c() {
        D();
        C3433a.C3434a m26443f = m26443f();
        String m27865a = m26443f != null ? m26443f.m27865a() : null;
        if (TextUtils.isEmpty(m27865a)) {
            return null;
        }
        return m27865a;
    }

    /* renamed from: d */
    protected C3433a.C3434a m26445d() {
        try {
            return C3433a.m27869b(o());
        } catch (IllegalStateException e) {
            t("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        } catch (Throwable th) {
            if (f14965a) {
                return null;
            }
            f14965a = true;
            d("Error getting advertiser id", th);
            return null;
        }
    }

    /* renamed from: e */
    protected String m26444e() {
        String str = null;
        try {
            FileInputStream openFileInput = o().openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                t("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                o().deleteFile("gaClientIdData");
            } else if (read <= 0) {
                q("Hash file is empty.");
                openFileInput.close();
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                    str = str2;
                } catch (FileNotFoundException e) {
                    str = str2;
                } catch (IOException e2) {
                    str = str2;
                    e = e2;
                    d("Error reading Hash file, deleting it", e);
                    o().deleteFile("gaClientIdData");
                    return str;
                }
            }
        } catch (FileNotFoundException e3) {
        } catch (IOException e4) {
            e = e4;
        }
        return str;
    }
}
