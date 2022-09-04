package com.xiaomi.market.sdk;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* renamed from: com.xiaomi.market.sdk.c */
/* loaded from: classes2.dex */
public class C10438c {
    private static final String TAG = "MarketConnection";

    /* renamed from: r */
    protected static final String f32412r = "http";

    /* renamed from: s */
    private static final int f32413s = 10000;

    /* renamed from: t */
    private static final int f32414t = 10000;

    /* renamed from: u */
    private static final int f32415u = 30000;

    /* renamed from: A */
    protected boolean f32416A;

    /* renamed from: B */
    protected boolean f32417B;

    /* renamed from: C */
    protected boolean f32418C;

    /* renamed from: D */
    protected boolean f32419D;

    /* renamed from: E */
    protected boolean f32420E;

    /* renamed from: v */
    protected JSONObject f32421v;

    /* renamed from: w */
    protected URL f32422w;

    /* renamed from: x */
    protected C10443h f32423x;

    /* renamed from: y */
    protected String f32424y;

    /* renamed from: z */
    protected boolean f32425z;

    public C10438c(String str) {
        this(str, false);
    }

    public C10438c(String str, String str2) {
        this(m5120c(str, str2), false);
    }

    public C10438c(String str, boolean z) {
        URL url;
        try {
            url = new URL(str);
        } catch (MalformedURLException e) {
            Log.e(TAG, "URL error: " + e);
            url = null;
        }
        m5125a(url);
        this.f32420E = z;
    }

    /* renamed from: a */
    private EnumC10442g m5131a(int i) {
        if (i == 200) {
            return EnumC10442g.OK;
        }
        Log.e(TAG, "Network Error : " + i);
        return EnumC10442g.SERVER_ERROR;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x016e A[Catch: Exception -> 0x0172, all -> 0x0179, TRY_ENTER, TryCatch #12 {Exception -> 0x0172, all -> 0x0179, blocks: (B:23:0x0062, B:25:0x0067, B:27:0x006d, B:29:0x007c, B:30:0x0090, B:31:0x0093, B:53:0x00be, B:62:0x0160, B:48:0x016e, B:49:0x0171), top: B:22:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private EnumC10442g m5127a(String str, String str2, boolean z, boolean z2, AbstractC10444i abstractC10444i) {
        URL url;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        BufferedInputStream bufferedInputStream;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            if (C10454s.DEBUG) {
                Log.d(TAG, "hosted connection url: " + str3);
            }
            try {
                try {
                    HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(str3).openConnection();
                    try {
                        httpURLConnection3.setConnectTimeout(10000);
                        if (C10454s.m5076n(XiaomiUpdateAgent.getContext())) {
                            httpURLConnection3.setReadTimeout(10000);
                        } else {
                            httpURLConnection3.setReadTimeout(30000);
                        }
                        if (z) {
                            httpURLConnection3.setRequestMethod("GET");
                            httpURLConnection3.setDoOutput(false);
                        } else {
                            httpURLConnection3.setRequestMethod("POST");
                            httpURLConnection3.setDoOutput(true);
                        }
                        try {
                            httpURLConnection = m5126a(httpURLConnection3);
                            try {
                                httpURLConnection.connect();
                                if (!z && !TextUtils.isEmpty(str2)) {
                                    OutputStream outputStream = httpURLConnection.getOutputStream();
                                    outputStream.write(str2.getBytes());
                                    if (C10454s.DEBUG) {
                                        Log.d(TAG, "[post]" + str2);
                                    }
                                    outputStream.close();
                                }
                                EnumC10442g m5131a = m5131a(httpURLConnection.getResponseCode());
                                if (m5131a == EnumC10442g.OK && abstractC10444i != null) {
                                    try {
                                        bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), 8192);
                                        try {
                                            byte[] bArr = new byte[1024];
                                            while (true) {
                                                int read = bufferedInputStream.read(bArr, 0, 1024);
                                                if (read <= 0) {
                                                    break;
                                                }
                                                abstractC10444i.write(bArr, 0, read);
                                            }
                                            abstractC10444i.flush();
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            try {
                                                Log.e(TAG, "Connection Exception for " + url.getHost() + " : read file stream error " + e);
                                                abstractC10444i.reset();
                                                if (bufferedInputStream != null) {
                                                    bufferedInputStream.close();
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                if (bufferedInputStream != null) {
                                                    bufferedInputStream.close();
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        bufferedInputStream = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bufferedInputStream = null;
                                        if (bufferedInputStream != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (httpURLConnection == null) {
                                    return m5131a;
                                }
                                httpURLConnection.disconnect();
                                return m5131a;
                            } catch (Exception e3) {
                                e = e3;
                                httpURLConnection2 = httpURLConnection;
                                try {
                                    Log.e(TAG, "Connection Exception for " + url.getHost() + " :" + e);
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    httpURLConnection = httpURLConnection2;
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                if (httpURLConnection != null) {
                                }
                                throw th;
                            }
                        } catch (C10439d e4) {
                            EnumC10442g enumC10442g = e4.f32426F;
                            if (httpURLConnection3 != null) {
                                httpURLConnection3.disconnect();
                            }
                            return enumC10442g;
                        }
                    } catch (Exception e5) {
                        httpURLConnection2 = httpURLConnection3;
                        e = e5;
                    } catch (Throwable th5) {
                        httpURLConnection = httpURLConnection3;
                        th = th5;
                    }
                } catch (Exception e6) {
                    e = e6;
                    httpURLConnection2 = null;
                } catch (Throwable th6) {
                    th = th6;
                    httpURLConnection = null;
                }
            } catch (MalformedURLException e7) {
                Log.e(TAG, " URL error :" + e7);
            }
        }
        return EnumC10442g.NETWORK_ERROR;
    }

    /* renamed from: a */
    private void m5125a(URL url) {
        this.f32425z = true;
        this.f32416A = false;
        this.f32417B = true;
        this.f32418C = true;
        this.f32419D = true;
        if (m5122b(url)) {
            this.f32422w = url;
        }
    }

    /* renamed from: c */
    public static String m5120c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str.charAt(str.length() - 1) == '/') {
            str = str.substring(0, str.length() - 1);
        }
        if (str2.charAt(0) == '/') {
            str2 = str2.substring(1);
        }
        return String.valueOf(str) + "/" + str2;
    }

    /* renamed from: a */
    protected EnumC10442g m5129a(AbstractC10444i abstractC10444i) {
        if (this.f32422w == null) {
            return EnumC10442g.URL_ERROR;
        }
        if (!C10454s.m5077m(XiaomiUpdateAgent.getContext())) {
            return EnumC10442g.NETWORK_ERROR;
        }
        if (this.f32423x == null) {
            getClass();
            this.f32423x = new C10443h(this);
        }
        C10443h c10443h = this.f32423x;
        try {
            C10443h m5130a = m5130a(this.f32423x);
            String url = this.f32422w.toString();
            if (this.f32416A && !m5130a.isEmpty()) {
                String query = this.f32422w.getQuery();
                String url2 = this.f32422w.toString();
                url = TextUtils.isEmpty(query) ? String.valueOf(url2) + C0363a.f360a + m5130a.toString() : String.valueOf(url2) + "&" + m5130a.toString();
            }
            try {
                String m5128a = m5128a(url, m5130a);
                if (C10454s.DEBUG) {
                    Log.d(TAG, "connection url: " + m5128a);
                }
                String str = "";
                if (!this.f32416A) {
                    str = m5130a.toString();
                }
                long currentTimeMillis = System.currentTimeMillis();
                EnumC10442g m5127a = m5127a(m5128a, str, this.f32416A, false, abstractC10444i);
                if (!C10454s.DEBUG) {
                    return m5127a;
                }
                Log.d(TAG, "Time(ms) spent in request: " + (System.currentTimeMillis() - currentTimeMillis) + ", " + m5128a);
                return m5127a;
            } catch (C10439d e) {
                return e.f32426F;
            }
        } catch (C10439d e2) {
            return e2.f32426F;
        }
    }

    /* renamed from: a */
    protected C10443h m5130a(C10443h c10443h) {
        return c10443h;
    }

    /* renamed from: a */
    protected String m5128a(String str, C10443h c10443h) {
        return str;
    }

    /* renamed from: a */
    protected HttpURLConnection m5126a(HttpURLConnection httpURLConnection) {
        return httpURLConnection;
    }

    /* renamed from: a */
    public void m5124a(boolean z) {
        this.f32416A = z;
    }

    /* renamed from: b */
    public EnumC10442g m5123b(File file) {
        if (file == null) {
            throw new IllegalArgumentException();
        }
        try {
            C10440e c10440e = new C10440e(this, file);
            EnumC10442g m5129a = m5129a(c10440e);
            try {
                c10440e.close();
                if (m5129a != EnumC10442g.OK) {
                    Log.e(TAG, "Connection failed : " + m5129a);
                    file.delete();
                }
            } catch (IOException e) {
            }
            return m5129a;
        } catch (FileNotFoundException e2) {
            Log.e(TAG, "File not found: " + e2);
            throw e2;
        }
    }

    /* renamed from: b */
    public void m5121b(boolean z) {
        this.f32425z = z;
    }

    /* renamed from: b */
    protected boolean m5122b(URL url) {
        return url != null && TextUtils.equals(url.getProtocol(), "http");
    }

    /* renamed from: c */
    public void m5119c(boolean z) {
        this.f32417B = z;
    }

    /* renamed from: d */
    public void m5118d(boolean z) {
        this.f32418C = z;
    }

    /* renamed from: e */
    public JSONObject m5117e() {
        return this.f32421v;
    }

    /* renamed from: e */
    public void m5116e(boolean z) {
        this.f32419D = z;
    }

    /* renamed from: f */
    public String m5115f() {
        return this.f32424y;
    }

    /* renamed from: g */
    public C10443h m5114g() {
        return this.f32423x;
    }

    /* renamed from: h */
    public EnumC10442g m5113h() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        EnumC10442g m5129a = m5129a(new C10441f(this, byteArrayOutputStream));
        try {
            try {
                if (m5129a == EnumC10442g.OK) {
                    this.f32421v = new JSONObject(byteArrayOutputStream.toString());
                } else {
                    Log.e(TAG, "Connection failed : " + m5129a);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                }
            } catch (JSONException e2) {
                Log.e(TAG, "JSON error: " + e2);
                m5129a = EnumC10442g.RESULT_ERROR;
            }
            return m5129a;
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
            }
        }
    }

    /* renamed from: i */
    public EnumC10442g m5112i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        EnumC10442g m5129a = m5129a(new C10441f(this, byteArrayOutputStream));
        if (m5129a == EnumC10442g.OK) {
            this.f32424y = byteArrayOutputStream.toString();
        } else {
            Log.e(TAG, "Connection failed : " + m5129a);
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
        }
        return m5129a;
    }
}
