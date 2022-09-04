package com.tencent.stat;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.baidu.tts.loopj.AsyncHttpClient;
import com.tencent.stat.common.C10340e;
import com.tencent.stat.common.C10346k;
import com.tencent.stat.common.StatConstants;
import com.tencent.stat.common.StatLogger;
import com.tencent.stat.p268a.AbstractC10327e;
import com.tencent.stat.p268a.EnumC10328f;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.p286a.p287a.C11086e;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.d */
/* loaded from: classes2.dex */
public class C10352d {

    /* renamed from: c */
    private static StatLogger f32267c = C10346k.m5425b();

    /* renamed from: d */
    private static long f32268d = -1;

    /* renamed from: e */
    private static C10352d f32269e = null;

    /* renamed from: f */
    private static Context f32270f = null;

    /* renamed from: a */
    DefaultHttpClient f32271a;

    /* renamed from: b */
    Handler f32272b;

    private C10352d() {
        this.f32271a = null;
        this.f32272b = null;
        try {
            HandlerThread handlerThread = new HandlerThread("StatDispatcher");
            handlerThread.start();
            f32268d = handlerThread.getId();
            this.f32272b = new Handler(handlerThread.getLooper());
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 10000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 10000);
            this.f32271a = new DefaultHttpClient(basicHttpParams);
            this.f32271a.setKeepAliveStrategy(new C10353e(this));
            if (StatConfig.m5517b() == null) {
                return;
            }
            this.f32271a.getParams().setParameter("http.route.default-proxy", StatConfig.m5517b());
        } catch (Throwable th) {
            f32267c.m5464e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Context m5376a() {
        return f32270f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m5375a(Context context) {
        f32270f = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized C10352d m5372b() {
        C10352d c10352d;
        synchronized (C10352d.class) {
            if (f32269e == null) {
                f32269e = new C10352d();
            }
            c10352d = f32269e;
        }
        return c10352d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5374a(AbstractC10327e abstractC10327e, AbstractC10335c abstractC10335c) {
        m5371b(Arrays.asList(abstractC10327e.m5473d()), abstractC10335c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5373a(List<String> list, AbstractC10335c abstractC10335c) {
        boolean z = false;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                if (i != list.size() - 1) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
            sb.append("]");
            String statReportUrl = StatConfig.getStatReportUrl();
            f32267c.m5463i("[" + statReportUrl + "]Send request(" + sb.toString().length() + "bytes):" + sb.toString());
            HttpPost httpPost = new HttpPost(statReportUrl);
            httpPost.addHeader("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
            httpPost.setHeader(C11086e.f35717j, "Keep-Alive");
            httpPost.removeHeaders("Cache-Control");
            HttpHost m5431a = C10346k.m5431a(f32270f);
            if (m5431a != null) {
                this.f32271a.getParams().setParameter("http.route.default-proxy", C10346k.m5431a(f32270f));
                httpPost.addHeader("X-Online-Host", StatConstants.MTA_SERVER);
                httpPost.addHeader(C11086e.f35705a, "*/*");
                httpPost.addHeader("Content-Type", "json");
                z = true;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = sb.toString().getBytes("UTF-8");
            int length = bytes.length;
            if (sb.length() >= 256) {
                if (m5431a == null) {
                    httpPost.addHeader("Content-Encoding", "rc4,gzip");
                } else {
                    httpPost.addHeader("X-Content-Encoding", "rc4,gzip");
                }
                byteArrayOutputStream.write(new byte[4]);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                bytes = byteArrayOutputStream.toByteArray();
                ByteBuffer.wrap(bytes, 0, 4).putInt(length);
                f32267c.m5466d("before Gzip:" + length + " bytes, after Gzip:" + bytes.length + " bytes");
            } else if (m5431a == null) {
                httpPost.addHeader("Content-Encoding", "rc4");
            } else {
                httpPost.addHeader("X-Content-Encoding", "rc4");
            }
            httpPost.setEntity(new ByteArrayEntity(C10340e.m5454a(bytes)));
            HttpResponse execute = this.f32271a.execute(httpPost);
            if (z) {
                this.f32271a.getParams().removeParameter("http.route.default-proxy");
            }
            HttpEntity entity = execute.getEntity();
            int statusCode = execute.getStatusLine().getStatusCode();
            long contentLength = entity.getContentLength();
            f32267c.m5463i("recv response status code:" + statusCode + ", content length:" + contentLength);
            if (contentLength == 0) {
                EntityUtils.toString(entity);
                if (statusCode != 200) {
                    f32267c.error("Server response error code:" + statusCode);
                } else if (abstractC10335c != null) {
                    abstractC10335c.mo5338a();
                }
            } else if (contentLength > 0) {
                InputStream content = entity.getContent();
                DataInputStream dataInputStream = new DataInputStream(content);
                byte[] bArr = new byte[(int) entity.getContentLength()];
                dataInputStream.readFully(bArr);
                content.close();
                dataInputStream.close();
                Header firstHeader = execute.getFirstHeader("Content-Encoding");
                if (firstHeader != null) {
                    if (firstHeader.getValue().equalsIgnoreCase("gzip,rc4")) {
                        bArr = C10340e.m5452b(C10346k.m5426a(bArr));
                    } else if (firstHeader.getValue().equalsIgnoreCase("rc4,gzip")) {
                        bArr = C10346k.m5426a(C10340e.m5452b(bArr));
                    } else if (firstHeader.getValue().equalsIgnoreCase(AsyncHttpClient.ENCODING_GZIP)) {
                        bArr = C10346k.m5426a(bArr);
                    } else if (firstHeader.getValue().equalsIgnoreCase("rc4")) {
                        bArr = C10340e.m5452b(bArr);
                    }
                }
                if (statusCode == 200) {
                    String str = new String(bArr, "UTF-8");
                    f32267c.m5466d(str);
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.isNull("cfg")) {
                        StatConfig.m5519a(jSONObject.getJSONObject("cfg"));
                    }
                    if (!jSONObject.isNull("et") && !jSONObject.isNull("st")) {
                        f32267c.m5466d("get mid respone:" + str);
                        if (jSONObject.getInt("et") == EnumC10328f.SESSION_ENV.m5472a()) {
                            int i2 = jSONObject.getInt("st");
                            switch (i2) {
                                case -1:
                                case 0:
                                    if (!jSONObject.isNull(DeviceInfo.TAG_MID)) {
                                        StatMid.updateDeviceInfo(f32270f, jSONObject.getString(DeviceInfo.TAG_MID));
                                        break;
                                    }
                                    break;
                                default:
                                    f32267c.m5464e("error type for st:" + i2);
                                    break;
                            }
                        }
                    }
                    if (abstractC10335c != null) {
                        abstractC10335c.mo5338a();
                    }
                } else {
                    f32267c.error("Server response error code:" + statusCode + ", error:" + new String(bArr, "UTF-8"));
                }
                content.close();
            } else {
                EntityUtils.toString(entity);
            }
            byteArrayOutputStream.close();
        } catch (Throwable th) {
            f32267c.m5464e(th);
            if (abstractC10335c == null) {
                return;
            }
            abstractC10335c.mo5337b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m5371b(List<String> list, AbstractC10335c abstractC10335c) {
        if (list.isEmpty() || this.f32272b == null) {
            return;
        }
        this.f32272b.post(new RunnableC10354f(this, list, abstractC10335c));
    }
}
