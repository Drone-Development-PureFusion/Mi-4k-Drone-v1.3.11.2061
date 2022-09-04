package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.C10346k;
import com.tencent.stat.common.StatLogger;
import com.tencent.stat.p268a.C10331i;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.j */
/* loaded from: classes2.dex */
public class RunnableC10358j implements Runnable {

    /* renamed from: a */
    private Context f32280a;

    /* renamed from: b */
    private Map<String, Integer> f32281b;

    public RunnableC10358j(Context context, Map<String, Integer> map) {
        this.f32280a = null;
        this.f32281b = null;
        this.f32280a = context;
        if (map != null) {
            this.f32281b = map;
        }
    }

    /* renamed from: a */
    private NetworkMonitor m5368a(String str, int i) {
        StatLogger statLogger;
        StatLogger statLogger2;
        StatLogger statLogger3;
        StatLogger statLogger4;
        NetworkMonitor networkMonitor = new NetworkMonitor();
        Socket socket = new Socket();
        int i2 = 0;
        try {
            try {
                networkMonitor.setDomain(str);
                networkMonitor.setPort(i);
                long currentTimeMillis = System.currentTimeMillis();
                InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i);
                socket.connect(inetSocketAddress, 30000);
                networkMonitor.setMillisecondsConsume(System.currentTimeMillis() - currentTimeMillis);
                networkMonitor.setRemoteIp(inetSocketAddress.getAddress().getHostAddress());
                if (socket != null) {
                    socket.close();
                }
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Throwable th) {
                        statLogger4 = StatService.f32152i;
                        statLogger4.m5464e(th);
                    }
                }
            } catch (IOException e) {
                i2 = -1;
                statLogger2 = StatService.f32152i;
                statLogger2.m5465e((Exception) e);
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Throwable th2) {
                        statLogger3 = StatService.f32152i;
                        statLogger3.m5464e(th2);
                    }
                }
            }
            networkMonitor.setStatusCode(i2);
            return networkMonitor;
        } catch (Throwable th3) {
            if (socket != null) {
                try {
                    socket.close();
                } catch (Throwable th4) {
                    statLogger = StatService.f32152i;
                    statLogger.m5464e(th4);
                }
            }
            throw th3;
        }
    }

    /* renamed from: a */
    private Map<String, Integer> m5369a() {
        String str;
        StatLogger statLogger;
        HashMap hashMap = new HashMap();
        String m5520a = StatConfig.m5520a("__MTA_TEST_SPEED__", (String) null);
        if (m5520a != null && m5520a.trim().length() != 0) {
            for (String str2 : m5520a.split(";")) {
                String[] split = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                if (split != null && split.length == 2 && (str = split[0]) != null && str.trim().length() != 0) {
                    try {
                        hashMap.put(str, Integer.valueOf(Integer.valueOf(split[1]).intValue()));
                    } catch (NumberFormatException e) {
                        statLogger = StatService.f32152i;
                        statLogger.m5465e((Exception) e);
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        StatLogger statLogger;
        StatLogger statLogger2;
        StatLogger statLogger3;
        StatLogger statLogger4;
        try {
            if (!C10346k.m5408h(this.f32280a)) {
                return;
            }
            if (this.f32281b == null) {
                this.f32281b = m5369a();
            }
            if (this.f32281b == null || this.f32281b.size() == 0) {
                statLogger2 = StatService.f32152i;
                statLogger2.m5461w("empty domain list.");
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, Integer> entry : this.f32281b.entrySet()) {
                String key = entry.getKey();
                if (key == null || key.length() == 0) {
                    statLogger3 = StatService.f32152i;
                    statLogger3.m5461w("empty domain name.");
                } else if (entry.getValue() == null) {
                    statLogger4 = StatService.f32152i;
                    statLogger4.m5461w("port is null for " + key);
                } else {
                    jSONArray.put(m5368a(entry.getKey(), entry.getValue().intValue()).toJSONObject());
                }
            }
            if (jSONArray.length() == 0) {
                return;
            }
            C10331i c10331i = new C10331i(this.f32280a, StatService.m5498a(this.f32280a, false));
            c10331i.m5471a(jSONArray.toString());
            if (StatService.m5493c(this.f32280a) == null) {
                return;
            }
            StatService.m5493c(this.f32280a).post(new RunnableC10359k(c10331i));
        } catch (Throwable th) {
            statLogger = StatService.f32152i;
            statLogger.m5464e(th);
        }
    }
}
