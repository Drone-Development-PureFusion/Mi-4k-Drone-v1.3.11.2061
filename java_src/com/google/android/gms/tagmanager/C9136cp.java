package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.p286a.p287a.C11086e;
/* renamed from: com.google.android.gms.tagmanager.cp */
/* loaded from: classes2.dex */
class C9136cp implements AbstractC9216k {

    /* renamed from: a */
    private final String f28866a;

    /* renamed from: b */
    private final Context f28867b;

    /* renamed from: c */
    private final AbstractC9139b f28868c;

    /* renamed from: d */
    private final AbstractC9138a f28869d;

    /* renamed from: com.google.android.gms.tagmanager.cp$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9138a {
        /* renamed from: a */
        void mo9157a(C9235z c9235z);

        /* renamed from: b */
        void mo9156b(C9235z c9235z);

        /* renamed from: c */
        void mo9155c(C9235z c9235z);
    }

    /* renamed from: com.google.android.gms.tagmanager.cp$b */
    /* loaded from: classes2.dex */
    interface AbstractC9139b {
        /* renamed from: a */
        HttpURLConnection mo9154a(URL url);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9136cp(Context context, AbstractC9138a abstractC9138a) {
        this(new AbstractC9139b() { // from class: com.google.android.gms.tagmanager.cp.1
            @Override // com.google.android.gms.tagmanager.C9136cp.AbstractC9139b
            /* renamed from: a */
            public HttpURLConnection mo9154a(URL url) {
                return (HttpURLConnection) url.openConnection();
            }
        }, context, abstractC9138a);
    }

    C9136cp(AbstractC9139b abstractC9139b, Context context, AbstractC9138a abstractC9138a) {
        this.f28868c = abstractC9139b;
        this.f28867b = context.getApplicationContext();
        this.f28869d = abstractC9138a;
        this.f28866a = m9159a("GoogleTagManager", "4.00", Build.VERSION.RELEASE, m9158a(Locale.getDefault()), Build.MODEL, Build.ID);
    }

    /* renamed from: a */
    static String m9158a(Locale locale) {
        if (locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage().toLowerCase());
        if (locale.getCountry() != null && locale.getCountry().length() != 0) {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER).append(locale.getCountry().toLowerCase());
        }
        return sb.toString();
    }

    /* renamed from: a */
    String m9159a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", str, str2, str3, str4, str5, str6);
    }

    /* renamed from: a */
    URL m9160a(C9235z c9235z) {
        try {
            return new URL(c9235z.m8866c());
        } catch (MalformedURLException e) {
            C9065aw.m9301a("Error trying to parse the GTM url.");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.tagmanager.AbstractC9216k
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo8910a(List<C9235z> list) {
        IOException iOException;
        boolean z;
        boolean z2;
        InputStream inputStream;
        boolean z3;
        Throwable th;
        int min = Math.min(list.size(), 40);
        boolean z4 = true;
        int i = 0;
        while (i < min) {
            C9235z c9235z = list.get(i);
            URL m9160a = m9160a(c9235z);
            if (m9160a == null) {
                C9065aw.m9299b("No destination: discarding hit.");
                this.f28869d.mo9156b(c9235z);
                z2 = z4;
            } else {
                try {
                    HttpURLConnection mo9154a = this.f28868c.mo9154a(m9160a);
                    if (z4) {
                        try {
                            C9072bb.m9291b(this.f28867b);
                            z4 = false;
                        } catch (Throwable th2) {
                            inputStream = null;
                            z3 = z4;
                            th = th2;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    z = z3;
                                    iOException = e;
                                    String valueOf = String.valueOf(iOException.getClass().getSimpleName());
                                    C9065aw.m9299b(valueOf.length() != 0 ? "Exception sending hit: ".concat(valueOf) : new String("Exception sending hit: "));
                                    C9065aw.m9299b(iOException.getMessage());
                                    this.f28869d.mo9155c(c9235z);
                                    z2 = z;
                                    i++;
                                    z4 = z2;
                                }
                            }
                            mo9154a.disconnect();
                            throw th;
                            break;
                        }
                    }
                    mo9154a.setRequestProperty(C11086e.f35703Y, this.f28866a);
                    int responseCode = mo9154a.getResponseCode();
                    InputStream inputStream2 = mo9154a.getInputStream();
                    if (responseCode != 200) {
                        try {
                            C9065aw.m9299b(new StringBuilder(25).append("Bad response: ").append(responseCode).toString());
                            this.f28869d.mo9155c(c9235z);
                        } catch (Throwable th3) {
                            inputStream = inputStream2;
                            z3 = z4;
                            th = th3;
                            if (inputStream != null) {
                            }
                            mo9154a.disconnect();
                            throw th;
                            break;
                            break;
                        }
                    } else {
                        this.f28869d.mo9157a(c9235z);
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    mo9154a.disconnect();
                    z2 = z4;
                } catch (IOException e2) {
                    iOException = e2;
                    z = z4;
                }
            }
            i++;
            z4 = z2;
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9216k
    /* renamed from: a */
    public boolean mo8911a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f28867b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            C9065aw.m9295e("...no network connectivity");
            return false;
        }
        return true;
    }
}
