package com.google.android.gms.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/* renamed from: com.google.android.gms.internal.ep */
/* loaded from: classes2.dex */
class C6909ep implements AbstractC6910eq {

    /* renamed from: a */
    private HttpURLConnection f23309a;

    /* renamed from: a */
    private InputStream m15967a(HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            return httpURLConnection.getInputStream();
        }
        String sb = new StringBuilder(25).append("Bad response: ").append(responseCode).toString();
        if (responseCode == 404) {
            throw new FileNotFoundException(sb);
        }
        if (responseCode != 503) {
            throw new IOException(sb);
        }
        throw new C6912es(sb);
    }

    /* renamed from: b */
    private void m15965b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC6910eq
    /* renamed from: a */
    public InputStream mo15963a(String str) {
        this.f23309a = m15966b(str);
        return m15967a(this.f23309a);
    }

    @Override // com.google.android.gms.internal.AbstractC6910eq
    /* renamed from: a */
    public void mo15964a() {
        m15965b(this.f23309a);
    }

    /* renamed from: b */
    HttpURLConnection m15966b(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        return httpURLConnection;
    }
}
