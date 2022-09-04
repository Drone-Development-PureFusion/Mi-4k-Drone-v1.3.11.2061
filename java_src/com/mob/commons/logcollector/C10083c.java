package com.mob.commons.logcollector;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.tools.MobLog;
import com.mob.tools.SSDKHandlerThread;
import com.mob.tools.log.NLog;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
/* renamed from: com.mob.commons.logcollector.c */
/* loaded from: classes2.dex */
public class C10083c extends SSDKHandlerThread {

    /* renamed from: a */
    private static C10083c f31123a;

    /* renamed from: b */
    private static String f31124b = "http://api.exc.mob.com:80";

    /* renamed from: d */
    private Context f31126d;

    /* renamed from: f */
    private C10084d f31128f;

    /* renamed from: g */
    private File f31129g;

    /* renamed from: e */
    private NetworkHelper f31127e = new NetworkHelper();

    /* renamed from: c */
    private HashMap<String, Integer> f31125c = new HashMap<>();

    /* renamed from: h */
    private FileLocker f31130h = new FileLocker();

    private C10083c(Context context) {
        this.f31126d = context.getApplicationContext();
        this.f31128f = C10084d.m6214a(context);
        this.f31129g = new File(context.getFilesDir(), ".lock");
        if (!this.f31129g.exists()) {
            try {
                this.f31129g.createNewFile();
            } catch (Exception e) {
                MobLog.getInstance().m6187w(e);
            }
        }
        NLog.setContext(context);
        startThread();
    }

    /* renamed from: a */
    public static synchronized C10083c m6228a(Context context) {
        C10083c c10083c;
        synchronized (C10083c.class) {
            if (f31123a == null) {
                f31123a = new C10083c(context);
            }
            c10083c = f31123a;
        }
        return c10083c;
    }

    /* renamed from: a */
    private String m6226a(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = byteArrayInputStream.read(bArr, 0, 1024);
            if (read == -1) {
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byteArrayInputStream.close();
                return Base64.encodeToString(byteArray, 2);
            }
            gZIPOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    private void m6229a(int i, String str, String str2, String[] strArr) {
        try {
            if (!this.f31128f.m6211b()) {
                return;
            }
            if ("none".equals((String) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31126d), "getDetailNetworkTypeForStatic", new Object[0]))) {
                throw new IllegalStateException("network is disconnected!");
            }
            ArrayList<C10085e> m6201a = C10086f.m6201a(this.f31126d, strArr);
            for (int i2 = 0; i2 < m6201a.size(); i2++) {
                C10085e c10085e = m6201a.get(i2);
                HashMap<String, Object> m6219c = m6219c(i, str, str2);
                m6219c.put("errmsg", c10085e.f31133a);
                if (m6225a(m6226a(new Hashon().fromHashMap(m6219c)), true)) {
                    C10086f.m6202a(this.f31126d, c10085e.f31134b);
                }
            }
        } catch (Throwable th) {
            MobLog.getInstance().m6193i(th);
        }
    }

    /* renamed from: a */
    private void m6227a(Message message) {
        this.handler.sendMessageDelayed(message, 1000L);
    }

    /* renamed from: a */
    private boolean m6225a(String str, boolean z) {
        try {
            if ("none".equals((String) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31126d), "getDetailNetworkTypeForStatic", new Object[0]))) {
                throw new IllegalStateException("network is disconnected!");
            }
            ArrayList<KVPair<String>> arrayList = new ArrayList<>();
            arrayList.add(new KVPair<>(C0548a.f931b, str));
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 10000;
            networkTimeOut.connectionTimeout = 10000;
            this.f31127e.httpPost(m6220c(), arrayList, null, null, networkTimeOut);
            return true;
        } catch (Throwable th) {
            MobLog.getInstance().m6193i(th);
            return false;
        }
    }

    /* renamed from: b */
    private String m6224b() {
        return f31124b + "/errconf";
    }

    /* renamed from: b */
    private void m6222b(int i, String str, String str2) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        Object invokeStaticMethod = ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31126d);
        arrayList.add(new KVPair<>("key", str2));
        arrayList.add(new KVPair<>("sdk", str));
        arrayList.add(new KVPair<>("apppkg", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getPackageName", new Object[0]))));
        arrayList.add(new KVPair<>("appver", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getAppVersion", new Object[0]))));
        arrayList.add(new KVPair<>("sdkver", String.valueOf(i)));
        arrayList.add(new KVPair<>("plat", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getPlatformCode", new Object[0]))));
        try {
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 10000;
            networkTimeOut.connectionTimeout = 10000;
            String httpPost = this.f31127e.httpPost(m6224b(), arrayList, null, null, networkTimeOut);
            MobLog.getInstance().m6194i("get server config == %s", httpPost);
            HashMap fromJson = new Hashon().fromJson(httpPost);
            if ("-200".equals(String.valueOf(fromJson.get("status")))) {
                MobLog.getInstance().m6194i("error log server config response fail !!", new Object[0]);
                return;
            }
            Object obj = fromJson.get("result");
            if (obj == null || !(obj instanceof HashMap)) {
                return;
            }
            HashMap hashMap = (HashMap) obj;
            if (hashMap.containsKey("timestamp")) {
                this.f31128f.m6215a(System.currentTimeMillis() - ResHelper.parseLong(String.valueOf(hashMap.get("timestamp"))));
            }
            if ("1".equals(String.valueOf(hashMap.get("enable")))) {
                this.f31128f.m6212a(true);
            } else {
                this.f31128f.m6212a(false);
            }
            Object obj2 = hashMap.get("upconf");
            if (obj2 != null && (obj2 instanceof HashMap)) {
                HashMap hashMap2 = (HashMap) obj2;
                String valueOf = String.valueOf(hashMap2.get("crash"));
                String valueOf2 = String.valueOf(hashMap2.get("sdkerr"));
                String valueOf3 = String.valueOf(hashMap2.get("apperr"));
                this.f31128f.m6216a(Integer.parseInt(valueOf));
                this.f31128f.m6210b(Integer.parseInt(valueOf2));
                this.f31128f.m6208c(Integer.parseInt(valueOf3));
            }
            if (hashMap.containsKey("requesthost") && hashMap.containsKey("requestport")) {
                String valueOf4 = String.valueOf(hashMap.get("requesthost"));
                String valueOf5 = String.valueOf(hashMap.get("requestport"));
                if (!TextUtils.isEmpty(valueOf4) && !TextUtils.isEmpty(valueOf5)) {
                    f31124b = "http://" + valueOf4 + ":" + valueOf5;
                }
            }
            Object obj3 = hashMap.get("filter");
            if (obj3 == null || !(obj3 instanceof ArrayList)) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) obj3;
            if (arrayList2.size() <= 0) {
                return;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("fakelist", arrayList2);
            this.f31128f.m6213a(new Hashon().fromHashMap(hashMap3));
        } catch (Throwable th) {
            MobLog.getInstance().m6199d(th);
        }
    }

    /* renamed from: b */
    private void m6221b(Message message) {
        try {
            int i = message.arg1;
            Object[] objArr = (Object[]) message.obj;
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            m6222b(i, str, str2);
            m6229a(i, str, str2, null);
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
        }
    }

    /* renamed from: c */
    private String m6220c() {
        return f31124b + "/errlog";
    }

    /* renamed from: c */
    private HashMap<String, Object> m6219c(int i, String str, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        Object invokeStaticMethod = ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31126d);
        hashMap.put("key", str2);
        hashMap.put("plat", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getPlatformCode", new Object[0]));
        hashMap.put("sdk", str);
        hashMap.put("sdkver", Integer.valueOf(i));
        hashMap.put("appname", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getAppName", new Object[0]));
        hashMap.put("apppkg", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getPackageName", new Object[0]));
        hashMap.put("appver", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getAppVersion", new Object[0])));
        hashMap.put("deviceid", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getDeviceKey", new Object[0]));
        hashMap.put("model", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getModel", new Object[0]));
        hashMap.put("mac", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getMacAddress", new Object[0]));
        hashMap.put("udid", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getDeviceId", new Object[0]));
        hashMap.put("sysver", String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getOSVersionInt", new Object[0])));
        hashMap.put("networktype", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getDetailNetworkTypeForStatic", new Object[0]));
        return hashMap;
    }

    /* renamed from: c */
    private void m6218c(Message message) {
        ArrayList arrayList;
        try {
            int i = message.arg1;
            Object[] objArr = (Object[]) message.obj;
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            String str3 = (String) objArr[2];
            int i2 = 1;
            if (message.arg2 == 0) {
                i2 = 2;
            } else if (message.arg2 == 2) {
                i2 = 1;
            }
            String m6205f = this.f31128f.m6205f();
            if (!TextUtils.isEmpty(m6205f) && (arrayList = (ArrayList) new Hashon().fromJson(m6205f).get("fakelist")) != null && arrayList.size() > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str4 = (String) it2.next();
                    if (!TextUtils.isEmpty(str4) && str3.contains(str4)) {
                        return;
                    }
                }
            }
            int m6209c = this.f31128f.m6209c();
            int m6207d = this.f31128f.m6207d();
            int m6206e = this.f31128f.m6206e();
            if (3 == i2 && -1 == m6206e) {
                return;
            }
            if (1 == i2 && -1 == m6209c) {
                return;
            }
            if (2 == i2 && -1 == m6207d) {
                return;
            }
            String MD5 = Data.MD5(str3);
            this.f31130h.setLockFile(this.f31129g.getAbsolutePath());
            if (this.f31130h.lock(false)) {
                C10086f.m6204a(this.f31126d, System.currentTimeMillis() - this.f31128f.m6217a(), str3, i2, MD5);
            }
            this.f31130h.release();
            this.f31125c.remove(MD5);
            if (3 == i2 && 1 == m6206e) {
                m6229a(i, str, str2, new String[]{String.valueOf(3)});
            } else if (1 == i2 && 1 == m6209c) {
                m6229a(i, str, str2, new String[]{String.valueOf(1)});
            } else if (2 != i2 || 1 != m6207d) {
            } else {
                m6229a(i, str, str2, new String[]{String.valueOf(2)});
            }
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
        }
    }

    /* renamed from: a */
    public Context m6232a() {
        return this.f31126d;
    }

    /* renamed from: a */
    public void m6231a(int i, int i2, String str, String str2, String str3) {
        Message message = new Message();
        message.what = 101;
        message.arg1 = i;
        message.arg2 = i2;
        message.obj = new Object[]{str, str2, str3};
        this.handler.sendMessage(message);
    }

    /* renamed from: a */
    public void m6230a(int i, String str, String str2) {
        Message message = new Message();
        message.what = 100;
        message.arg1 = i;
        message.obj = new Object[]{str, str2};
        this.handler.sendMessage(message);
    }

    /* renamed from: b */
    public void m6223b(int i, int i2, String str, String str2, String str3) {
        m6231a(i, i2, str, str2, str3);
        try {
            this.handler.wait();
        } catch (Throwable th) {
        }
    }

    @Override // com.mob.tools.SSDKHandlerThread
    protected void onMessage(Message message) {
        switch (message.what) {
            case 100:
                m6221b(message);
                return;
            case 101:
                m6218c(message);
                return;
            default:
                return;
        }
    }
}
