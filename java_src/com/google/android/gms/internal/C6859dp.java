package com.google.android.gms.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/* renamed from: com.google.android.gms.internal.dp */
/* loaded from: classes2.dex */
class C6859dp implements AbstractC6860dq {

    /* renamed from: a */
    private HttpURLConnection f23066a;

    /* renamed from: a */
    private InputStream m16102a(HttpURLConnection httpURLConnection) {
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
        throw new C6864du(sb);
    }

    /* renamed from: b */
    private void m16100b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC6860dq
    /* renamed from: a */
    public InputStream mo16098a(String str) {
        this.f23066a = m16101b(str);
        return m16102a(this.f23066a);
    }

    @Override // com.google.android.gms.internal.AbstractC6860dq
    /* renamed from: a */
    public void mo16099a() {
        m16100b(this.f23066a);
    }

    /* renamed from: b */
    HttpURLConnection m16101b(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        return httpURLConnection;
    }
}
