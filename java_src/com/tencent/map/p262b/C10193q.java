package com.tencent.map.p262b;

import android.net.Proxy;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import org.p286a.p287a.C11086e;
/* renamed from: com.tencent.map.b.q */
/* loaded from: classes2.dex */
public final class C10193q {

    /* renamed from: a */
    private static int f31536a = 0;

    /* renamed from: b */
    private static boolean f31537b;

    /* JADX WARN: Removed duplicated region for block: B:37:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C10190n m5894a(HttpURLConnection httpURLConnection, boolean z) {
        int read;
        boolean z2 = true;
        int i = 0;
        InputStream inputStream = null;
        try {
            C10190n c10190n = new C10190n();
            String contentType = httpURLConnection.getContentType();
            String str = "GBK";
            if (contentType != null) {
                String[] split = contentType.split(";");
                int length = split.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    String str2 = split[i2];
                    if (str2.contains("charset")) {
                        String[] split2 = str2.split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                        }
                    } else {
                        i2++;
                    }
                }
            }
            c10190n.f31535b = str;
            if (z) {
                if (contentType == null || !contentType.contains("vnd.wap.wml")) {
                    z2 = false;
                }
                if (z2) {
                    httpURLConnection.disconnect();
                    httpURLConnection.connect();
                }
            }
            inputStream = httpURLConnection.getInputStream();
            if (inputStream == null) {
                return c10190n;
            }
            c10190n.f31534a = new byte[0];
            byte[] bArr = new byte[1024];
            do {
                read = inputStream.read(bArr);
                if (read > 0) {
                    i += read;
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(c10190n.f31534a, 0, bArr2, 0, c10190n.f31534a.length);
                    System.arraycopy(bArr, 0, bArr2, c10190n.f31534a.length, read);
                    c10190n.f31534a = bArr2;
                    continue;
                }
            } while (read > 0);
            return c10190n;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.net.HttpURLConnection] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C10190n m5892a(boolean z, String str, String str2, String str3, byte[] bArr, boolean z2, boolean z3) {
        Object obj;
        boolean z4 = true;
        int i = 0;
        DataOutputStream dataOutputStream = null;
        ?? m5899d = C10188l.m5899d();
        try {
            if (m5899d == 0) {
                throw new C10194r();
            }
            try {
                m5899d = m5896a(str, z3);
                try {
                    if (!C10157b.m6034a((String) null)) {
                        m5899d.setRequestProperty(C11086e.f35733z, null);
                    } else if (C10157b.m6034a(m5899d.getURL().getHost())) {
                    }
                    if (z) {
                        m5899d.setRequestMethod("GET");
                    } else {
                        m5899d.setRequestMethod("POST");
                    }
                    m5899d.setConnectTimeout(C10186k.m5913a());
                    m5899d.setReadTimeout(C10186k.m5908b());
                    m5899d.setRequestProperty(C11086e.f35703Y, str2);
                    m5899d.setDoInput(true);
                    if (z) {
                        z4 = false;
                    }
                    m5899d.setDoOutput(z4);
                    m5899d.setUseCaches(false);
                    if (z2) {
                        m5899d.setRequestProperty(C11086e.f35717j, "Keep-Alive");
                    }
                    C10186k.m5910a((HttpURLConnection) m5899d);
                    m5899d.connect();
                    C10186k.m5906c();
                    if (!z && bArr != null && bArr.length != 0) {
                        DataOutputStream dataOutputStream2 = new DataOutputStream(m5899d.getOutputStream());
                        try {
                            dataOutputStream2.write(bArr);
                            dataOutputStream2.flush();
                            dataOutputStream2.close();
                        } catch (C10192p e) {
                            e = e;
                            dataOutputStream = dataOutputStream2;
                            obj = m5899d;
                            try {
                                C10186k.m5909a(true);
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                m5899d = obj;
                                if (dataOutputStream != null) {
                                    dataOutputStream.close();
                                }
                                if (m5899d != 0) {
                                    m5899d.disconnect();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            C10186k.m5909a(false);
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                            dataOutputStream = dataOutputStream2;
                            if (dataOutputStream != null) {
                            }
                            if (m5899d != 0) {
                            }
                            throw th;
                        }
                    }
                    int responseCode = m5899d.getResponseCode();
                    if (responseCode == 200 || responseCode == 206) {
                        C10186k.m5904d();
                        C10190n m5894a = m5894a((HttpURLConnection) m5899d, z);
                        if (m5894a != null && m5894a.f31534a != null) {
                            i = m5894a.f31534a.length;
                        }
                        C10186k.m5912a(i);
                        if (m5899d != 0) {
                            m5899d.disconnect();
                        }
                        return m5894a;
                    } else if (responseCode != 202 && responseCode != 201 && responseCode != 204 && responseCode != 205 && responseCode != 304 && responseCode != 305 && responseCode != 408 && responseCode != 502 && responseCode != 504 && responseCode != 503) {
                        throw new C10192p("response code is " + responseCode);
                    } else {
                        throw new IOException("doGetOrPost retry");
                    }
                } catch (C10192p e3) {
                    e = e3;
                    obj = m5899d;
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (C10192p e5) {
                e = e5;
                obj = null;
            } catch (Exception e6) {
                e = e6;
            } catch (Throwable th3) {
                th = th3;
                m5899d = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f A[Catch: IOException -> 0x00e6, TryCatch #2 {IOException -> 0x00e6, blocks: (B:52:0x009a, B:53:0x009c, B:54:0x009f, B:57:0x00ab, B:61:0x00e0), top: B:51:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0 A[Catch: IOException -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x00e6, blocks: (B:52:0x009a, B:53:0x009c, B:54:0x009f, B:57:0x00ab, B:61:0x00e0), top: B:51:0x009a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00e7 -> B:58:0x0018). Please submit an issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HttpURLConnection m5896a(String str, boolean z) {
        boolean z2;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3 = null;
        try {
            URL url = new URL(str);
            if (C10188l.m5900c()) {
                z2 = false;
            } else {
                C10189m.m5898a();
                z2 = !C10157b.m6034a(Proxy.getDefaultHost());
            }
            if (!z2) {
                try {
                    return (HttpURLConnection) url.openConnection();
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            if (f31536a == 0 && !f31537b) {
                f31537b = true;
                try {
                    URL url2 = new URL("http://ls.map.soso.com/monitor/monitor.html");
                    String defaultHost = Proxy.getDefaultHost();
                    int defaultPort = Proxy.getDefaultPort();
                    if (defaultPort == -1) {
                        defaultPort = 80;
                    }
                    try {
                        HttpURLConnection httpURLConnection4 = (HttpURLConnection) url2.openConnection(new java.net.Proxy(Proxy.Type.HTTP, new InetSocketAddress(defaultHost, defaultPort)));
                        try {
                            httpURLConnection4.setRequestMethod("GET");
                            httpURLConnection4.setConnectTimeout(15000);
                            httpURLConnection4.setReadTimeout(45000);
                            httpURLConnection4.setRequestProperty(C11086e.f35703Y, "QQ Map Mobile");
                            httpURLConnection4.setDoInput(true);
                            httpURLConnection4.setDoOutput(false);
                            httpURLConnection4.setUseCaches(false);
                            boolean m5895a = m5895a(httpURLConnection4);
                            httpURLConnection4.connect();
                            if (m5895a) {
                                m5897a(1);
                            } else {
                                m5897a(2);
                            }
                            if (httpURLConnection4 != null) {
                                httpURLConnection4.disconnect();
                            }
                        } catch (Exception e2) {
                            httpURLConnection2 = httpURLConnection4;
                            e = e2;
                            try {
                                e.printStackTrace();
                                m5897a(2);
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                switch (f31536a) {
                                }
                                return httpURLConnection;
                            } catch (Throwable th) {
                                th = th;
                                httpURLConnection3 = httpURLConnection2;
                                if (httpURLConnection3 != null) {
                                    httpURLConnection3.disconnect();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            httpURLConnection3 = httpURLConnection4;
                            th = th2;
                            if (httpURLConnection3 != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        httpURLConnection2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (MalformedURLException e4) {
                    f31537b = false;
                }
            }
            try {
                switch (f31536a) {
                    case 2:
                        httpURLConnection = m5893a(url, str);
                        break;
                    default:
                        String defaultHost2 = android.net.Proxy.getDefaultHost();
                        int defaultPort2 = android.net.Proxy.getDefaultPort();
                        if (defaultPort2 == -1) {
                            defaultPort2 = 80;
                        }
                        httpURLConnection = (HttpURLConnection) url.openConnection(new java.net.Proxy(Proxy.Type.HTTP, new InetSocketAddress(defaultHost2, defaultPort2)));
                        break;
                }
            } catch (IOException e5) {
                e5.printStackTrace();
                httpURLConnection = null;
            }
            return httpURLConnection;
        } catch (MalformedURLException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static HttpURLConnection m5893a(URL url, String str) {
        int i = 80;
        String defaultHost = android.net.Proxy.getDefaultHost();
        int defaultPort = android.net.Proxy.getDefaultPort();
        if (defaultPort == -1) {
            defaultPort = 80;
        }
        String host = url.getHost();
        int port = url.getPort();
        if (port != -1) {
            i = port;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str.indexOf(new StringBuilder(String.valueOf(host)).append(":").append(i).toString()) != -1 ? str.replaceFirst(String.valueOf(host) + ":" + i, String.valueOf(defaultHost) + ":" + defaultPort) : str.replaceFirst(host, String.valueOf(defaultHost) + ":" + defaultPort)).openConnection();
            httpURLConnection.setRequestProperty("X-Online-Host", String.valueOf(host) + ":" + i);
            return httpURLConnection;
        } catch (MalformedURLException e) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m5897a(int i) {
        if (f31536a == i) {
            return;
        }
        f31536a = i;
    }

    /* renamed from: a */
    private static boolean m5895a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            if (!httpURLConnection.getContentType().equals("text/html")) {
                if (inputStream != null) {
                    inputStream.close();
                }
                return false;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (inputStream.available() > 0) {
                byteArrayOutputStream.write(inputStream.read());
            }
            boolean equals = new String(byteArrayOutputStream.toByteArray()).trim().equals("1");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
