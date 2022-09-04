package com.google.android.gms.ads.internal.util.client;

import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.util.client.C3780a;
import com.google.android.gms.internal.aaa;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
@aaa
/* renamed from: com.google.android.gms.ads.internal.util.client.c */
/* loaded from: classes.dex */
public class C3785c implements C3780a.AbstractC3783a {
    @Nullable

    /* renamed from: a */
    private final String f14747a;

    public C3785c() {
        this(null);
    }

    public C3785c(@Nullable String str) {
        this.f14747a = str;
    }

    @Override // com.google.android.gms.ads.internal.util.client.C3780a.AbstractC3783a
    @WorkerThread
    /* renamed from: a */
    public void mo18306a(String str) {
        try {
            String valueOf = String.valueOf(str);
            C3784b.m26846a(valueOf.length() != 0 ? "Pinging URL: ".concat(valueOf) : new String("Pinging URL: "));
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            C3514ac.m27586a().m26856a(true, httpURLConnection, this.f14747a);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                C3784b.m26840d(new StringBuilder(String.valueOf(str).length() + 65).append("Received non-success response code ").append(responseCode).append(" from pinging URL: ").append(str).toString());
            }
            httpURLConnection.disconnect();
        } catch (IOException e) {
            String valueOf2 = String.valueOf(e.getMessage());
            C3784b.m26840d(new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(valueOf2).length()).append("Error while pinging URL: ").append(str).append(". ").append(valueOf2).toString());
        } catch (IndexOutOfBoundsException e2) {
            String valueOf3 = String.valueOf(e2.getMessage());
            C3784b.m26840d(new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf3).length()).append("Error while parsing ping URL: ").append(str).append(". ").append(valueOf3).toString());
        } catch (RuntimeException e3) {
            String valueOf4 = String.valueOf(e3.getMessage());
            C3784b.m26840d(new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(valueOf4).length()).append("Error while pinging URL: ").append(str).append(". ").append(valueOf4).toString());
        }
    }
}
