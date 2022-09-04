package com.google.android.gms.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p290c.p293c.C11044h;
import org.p286a.p287a.p290c.p293c.C11048l;
/* loaded from: classes2.dex */
class apw implements aov {

    /* renamed from: a */
    private final String f22780a;

    /* renamed from: b */
    private final Context f22781b;

    /* renamed from: c */
    private final AbstractC6729b f22782c;

    /* renamed from: d */
    private final AbstractC6728a f22783d;

    /* renamed from: com.google.android.gms.internal.apw$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6728a {
        /* renamed from: a */
        void mo16282a(aoy aoyVar);

        /* renamed from: b */
        void mo16281b(aoy aoyVar);

        /* renamed from: c */
        void mo16280c(aoy aoyVar);
    }

    /* renamed from: com.google.android.gms.internal.apw$b */
    /* loaded from: classes2.dex */
    interface AbstractC6729b {
        /* renamed from: a */
        HttpURLConnection mo16279a(URL url);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public apw(Context context, AbstractC6728a abstractC6728a) {
        this(new AbstractC6729b() { // from class: com.google.android.gms.internal.apw.1
            @Override // com.google.android.gms.internal.apw.AbstractC6729b
            /* renamed from: a */
            public HttpURLConnection mo16279a(URL url) {
                return (HttpURLConnection) url.openConnection();
            }
        }, context, abstractC6728a);
    }

    apw(AbstractC6729b abstractC6729b, Context context, AbstractC6728a abstractC6728a) {
        this.f22782c = abstractC6729b;
        this.f22781b = context.getApplicationContext();
        this.f22783d = abstractC6728a;
        this.f22780a = m16285a("GoogleTagManager", "5.01", Build.VERSION.RELEASE, m16283a(Locale.getDefault()), Build.MODEL, Build.ID);
    }

    /* renamed from: a */
    static String m16283a(Locale locale) {
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
    String m16285a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", str, str2, str3, str4, str5, str6);
    }

    /* renamed from: a */
    URL m16286a(aoy aoyVar) {
        try {
            return new URL(aoyVar.m16418c());
        } catch (MalformedURLException e) {
            aph.m16396a("Error trying to parse the GTM url.");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0077 A[Catch: IOException -> 0x007e, TRY_ENTER, TryCatch #3 {IOException -> 0x007e, blocks: (B:24:0x00f1, B:40:0x012b, B:52:0x017d, B:53:0x0180, B:61:0x0077, B:62:0x007a, B:63:0x007d), top: B:23:0x00f1 }] */
    @Override // com.google.android.gms.internal.aov
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16284a(List<aoy> list) {
        boolean z;
        boolean z2;
        Throwable th;
        InputStream inputStream;
        int min = Math.min(list.size(), 40);
        boolean z3 = true;
        int i = 0;
        while (i < min) {
            aoy aoyVar = list.get(i);
            URL m16286a = m16286a(aoyVar);
            String m16416d = aoyVar.m16416d();
            Map<String, String> m16415e = aoyVar.m16415e();
            String m16414f = aoyVar.m16414f();
            if (m16286a == null) {
                aph.m16394b("No destination: discarding hit.");
                this.f22783d.mo16281b(aoyVar);
                z = z3;
            } else {
                try {
                    HttpURLConnection mo16279a = this.f22782c.mo16279a(m16286a);
                    if (z3) {
                        try {
                            apj.m16383b(this.f22781b);
                            z2 = false;
                        } catch (Throwable th2) {
                            z2 = z3;
                            th = th2;
                            inputStream = null;
                            if (inputStream != null) {
                            }
                            mo16279a.disconnect();
                            throw th;
                        }
                    } else {
                        z2 = z3;
                    }
                    try {
                        mo16279a.setRequestProperty(C11086e.f35703Y, this.f22780a);
                        if (m16415e != null) {
                            for (Map.Entry<String, String> entry : m16415e.entrySet()) {
                                mo16279a.setRequestProperty(entry.getKey(), entry.getValue());
                            }
                        }
                        if (m16416d == null) {
                            aph.m16394b(String.format("Hit %d retrieved from the store has null HTTP method.", Long.valueOf(aoyVar.m16423a())));
                            this.f22783d.mo16281b(aoyVar);
                            try {
                                mo16279a.disconnect();
                                z = z2;
                            } catch (IOException e) {
                                e = e;
                                z3 = z2;
                                String valueOf = String.valueOf(m16286a);
                                String valueOf2 = String.valueOf(e.getClass().getSimpleName());
                                aph.m16394b(new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length()).append("Exception sending hit to ").append(valueOf).append(": ").append(valueOf2).toString());
                                aph.m16394b(e.getMessage());
                                this.f22783d.mo16280c(aoyVar);
                                z = z3;
                                i++;
                                z3 = z;
                            }
                        } else if (m16416d.equals("GET") || m16416d.equals(C11044h.f35585a) || m16416d.equals("POST") || m16416d.equals(C11048l.f35589a)) {
                            char c = 65535;
                            switch (m16416d.hashCode()) {
                                case 70454:
                                    if (m16416d.equals("GET")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 79599:
                                    if (m16416d.equals(C11048l.f35589a)) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                                case 2213344:
                                    if (m16416d.equals(C11044h.f35585a)) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 2461856:
                                    if (m16416d.equals("POST")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                case 1:
                                    if (m16414f != null) {
                                        aph.m16394b(String.format("Body of %s hit is ignored: %s.", m16416d, m16414f));
                                    }
                                    mo16279a.setRequestMethod(m16416d);
                                    break;
                                case 2:
                                case 3:
                                    mo16279a.setRequestMethod(m16416d);
                                    if (m16414f != null) {
                                        mo16279a.setDoOutput(true);
                                        byte[] bytes = m16414f.getBytes(Charset.forName("UTF-8"));
                                        mo16279a.setFixedLengthStreamingMode(bytes.length);
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(mo16279a.getOutputStream());
                                        bufferedOutputStream.write(bytes);
                                        bufferedOutputStream.flush();
                                        bufferedOutputStream.close();
                                        break;
                                    }
                                    break;
                            }
                            int responseCode = mo16279a.getResponseCode();
                            inputStream = mo16279a.getInputStream();
                            if (responseCode != 200) {
                                try {
                                    String valueOf3 = String.valueOf(m16286a);
                                    aph.m16394b(new StringBuilder(String.valueOf(valueOf3).length() + 39).append("Bad response received for ").append(valueOf3).append(": ").append(responseCode).toString());
                                    this.f22783d.mo16280c(aoyVar);
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    mo16279a.disconnect();
                                    throw th;
                                }
                            } else {
                                String valueOf4 = String.valueOf(m16286a);
                                aph.m16391d(new StringBuilder(String.valueOf(valueOf4).length() + 23 + String.valueOf(m16416d).length()).append("Hit sent to ").append(valueOf4).append("(method = ").append(m16416d).append(")").toString());
                                this.f22783d.mo16282a(aoyVar);
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            mo16279a.disconnect();
                            z = z2;
                        } else {
                            aph.m16394b(String.format("Unrecongnized HTTP method %s. Supported methods are GET, HEAD, PUT and/or POST", m16416d));
                            this.f22783d.mo16281b(aoyVar);
                            mo16279a.disconnect();
                            z = z2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i++;
            z3 = z;
        }
    }

    @Override // com.google.android.gms.internal.aov
    /* renamed from: a */
    public boolean mo16287a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f22781b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            aph.m16391d("...no network connectivity");
            return false;
        }
        return true;
    }
}
