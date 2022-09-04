package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.file.C10400a;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.network.Host;
import com.xiaomi.push.protobuf.C10568a;
import com.xiaomi.stats.C10761f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* renamed from: com.xiaomi.push.service.ae */
/* loaded from: classes2.dex */
public class C10607ae {

    /* renamed from: a */
    private static final Pattern f32980a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    /* renamed from: b */
    private static long f32981b = 0;

    /* renamed from: c */
    private static ThreadPoolExecutor f32982c = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a */
    public static void m4408a() {
        C10568a.C10569a m4330d;
        long currentTimeMillis = System.currentTimeMillis();
        if ((f32982c.getActiveCount() <= 0 || currentTimeMillis - f32981b >= 1800000) && C10761f.m3796a().m3789c() && (m4330d = C10630at.m4340a().m4330d()) != null && m4330d.m4690m() > 0) {
            f32981b = currentTimeMillis;
            m4406a(m4330d.m4691l(), true);
        }
    }

    /* renamed from: a */
    public static void m4406a(List<String> list, boolean z) {
        f32982c.execute(new RunnableC10608af(list, z));
    }

    /* renamed from: b */
    public static void m4405b() {
        String m4403c = m4403c("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(m4403c)) {
            AbstractC10404b.m5269a("dump tcp for uid = " + Process.myUid());
            AbstractC10404b.m5269a(m4403c);
        }
        String m4403c2 = m4403c("/proc/self/net/tcp6");
        if (!TextUtils.isEmpty(m4403c2)) {
            AbstractC10404b.m5269a("dump tcp6 for uid = " + Process.myUid());
            AbstractC10404b.m5269a(m4403c2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m4404b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AbstractC10404b.m5269a("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(Host.m4753b(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            AbstractC10404b.m5269a("ConnectivityTest: connect to " + str + " in " + (System.currentTimeMillis() - currentTimeMillis));
            socket.close();
            return true;
        } catch (Throwable th) {
            AbstractC10404b.m5264d("ConnectivityTest: could not connect to:" + str + " exception: " + th.getClass().getSimpleName() + " description: " + th.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    private static String m4403c(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        String str2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
        } catch (Exception e) {
            bufferedReader = null;
        } catch (Throwable th2) {
            bufferedReader = null;
            th = th2;
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append("\n");
                sb.append(readLine);
            }
            str2 = sb.toString();
            C10400a.m5285a(bufferedReader);
        } catch (Exception e2) {
            C10400a.m5285a(bufferedReader);
            return str2;
        } catch (Throwable th3) {
            th = th3;
            C10400a.m5285a(bufferedReader);
            throw th;
        }
        return str2;
    }
}
