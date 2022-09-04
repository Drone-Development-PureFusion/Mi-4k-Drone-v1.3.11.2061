package it.p273a.p274a.p275a;

import it.p273a.p274a.AbstractC10869h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
/* renamed from: it.a.a.a.f */
/* loaded from: classes2.dex */
public class C10852f extends AbstractC10869h {

    /* renamed from: d */
    private String f34747d;

    /* renamed from: e */
    private int f34748e;

    /* renamed from: f */
    private String f34749f;

    /* renamed from: g */
    private String f34750g;

    public C10852f(String str, int i) {
        this(str, i, null, null);
    }

    public C10852f(String str, int i, String str2, String str3) {
        this.f34747d = str;
        this.f34748e = i;
        this.f34749f = str2;
        this.f34750g = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.net.Socket] */
    /* renamed from: a */
    private Socket m3129a(String str, int i, boolean z) {
        OutputStream outputStream = null;
        byte[] bytes = "\r\n".getBytes("UTF-8");
        String stringBuffer = new StringBuffer().append("CONNECT ").append(str).append(":").append(i).append(" HTTP/1.1").toString();
        ?? r3 = ":";
        ?? append = new StringBuffer().append("Host: ").append(str).append((String) r3).append(i);
        String stringBuffer2 = append.toString();
        try {
            try {
                r3 = z ? b(this.f34747d, this.f34748e) : a(this.f34747d, this.f34748e);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable th2) {
            th = th2;
            append = 0;
            r3 = 0;
        }
        try {
            InputStream inputStream = r3.getInputStream();
            try {
                OutputStream outputStream2 = r3.getOutputStream();
                outputStream2.write(stringBuffer.getBytes("UTF-8"));
                outputStream2.write(bytes);
                outputStream2.write(stringBuffer2.getBytes("UTF-8"));
                outputStream2.write(bytes);
                if (this.f34749f != null && this.f34750g != null) {
                    outputStream2.write(new StringBuffer().append("Proxy-Authorization: Basic ").append(C10847a.m3142a(new StringBuffer().append(this.f34749f).append(":").append(this.f34750g).toString())).toString().getBytes("UTF-8"));
                    outputStream2.write(bytes);
                }
                outputStream2.write(bytes);
                outputStream2.flush();
                ArrayList arrayList = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                for (String readLine = bufferedReader.readLine(); readLine != null && readLine.length() > 0; readLine = bufferedReader.readLine()) {
                    arrayList.add(readLine);
                }
                int size = arrayList.size();
                if (size < 1) {
                    throw new IOException("HTTPTunnelConnector: invalid proxy response");
                }
                String str2 = (String) arrayList.get(0);
                if (!str2.startsWith("HTTP/") || str2.length() < 12) {
                    throw new IOException("HTTPTunnelConnector: invalid proxy response");
                }
                if ("200".equals(str2.substring(9, 12))) {
                    return r3;
                }
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("HTTPTunnelConnector: connection failed\r\n");
                stringBuffer3.append("Response received from the proxy:\r\n");
                for (int i2 = 0; i2 < size; i2++) {
                    stringBuffer3.append((String) arrayList.get(i2));
                    stringBuffer3.append("\r\n");
                }
                throw new IOException(stringBuffer3.toString());
            } catch (IOException e2) {
                throw e2;
            }
        } catch (IOException e3) {
            throw e3;
        } catch (Throwable th3) {
            th = th3;
            append = 0;
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (Throwable th4) {
                }
            }
            if (append != 0) {
                try {
                    append.close();
                } catch (Throwable th5) {
                }
            }
            if (r3 != 0) {
                try {
                    r3.close();
                } catch (Throwable th6) {
                }
            }
            throw th;
        }
    }

    @Override // it.p273a.p274a.AbstractC10869h
    /* renamed from: c */
    public Socket mo3004c(String str, int i) {
        return m3129a(str, i, false);
    }

    @Override // it.p273a.p274a.AbstractC10869h
    /* renamed from: d */
    public Socket mo3003d(String str, int i) {
        return m3129a(str, i, true);
    }
}
