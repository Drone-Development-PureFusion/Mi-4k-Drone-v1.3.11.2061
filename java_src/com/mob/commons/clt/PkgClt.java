package com.mob.commons.clt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mob.commons.C10054a;
import com.mob.commons.C10060b;
import com.mob.commons.C10074d;
import com.mob.commons.LockAction;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.tencent.p263mm.sdk.platformtools.Util;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes2.dex */
public class PkgClt {

    /* renamed from: a */
    private static final String[] f31090a = {"android.intent.action.PACKAGE_ADDED", "android.intent.action.PACKAGE_CHANGED", "android.intent.action.PACKAGE_REMOVED", "android.intent.action.PACKAGE_REPLACED"};

    /* renamed from: b */
    private static PkgClt f31091b;

    /* renamed from: c */
    private BroadcastReceiver f31092c;

    /* renamed from: d */
    private Context f31093d;

    /* renamed from: e */
    private Hashon f31094e = new Hashon();

    /* renamed from: f */
    private Handler f31095f;

    private PkgClt(Context context) {
        this.f31093d = context.getApplicationContext();
    }

    /* renamed from: a */
    private ArrayList<HashMap<String, String>> m6294a(ArrayList<HashMap<String, String>> arrayList, ArrayList<HashMap<String, String>> arrayList2) {
        boolean z;
        ArrayList<HashMap<String, String>> arrayList3 = new ArrayList<>();
        Iterator<HashMap<String, String>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            HashMap<String, String> next = it2.next();
            String str = next.get("pkg");
            if (!TextUtils.isEmpty(str)) {
                Iterator<HashMap<String, String>> it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    } else if (str.equals(it3.next().get("pkg"))) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    arrayList3.add(next);
                }
            }
        }
        return arrayList3;
    }

    /* renamed from: a */
    private void m6301a() {
        MobHandlerThread mobHandlerThread = new MobHandlerThread() { // from class: com.mob.commons.clt.PkgClt.1
            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: a */
            public void m6284a() {
                super.run();
            }

            @Override // com.mob.tools.MobHandlerThread, java.lang.Thread, java.lang.Runnable
            public void run() {
                C10074d.m6265a(new File(ResHelper.getCacheRoot(PkgClt.this.f31093d), "comm/locks/.pkg_lock"), new LockAction() { // from class: com.mob.commons.clt.PkgClt.1.1
                    @Override // com.mob.commons.LockAction
                    public boolean run(FileLocker fileLocker) {
                        if (C10054a.m6363e(PkgClt.this.f31093d)) {
                            PkgClt.this.m6293b();
                        }
                        m6284a();
                        return false;
                    }
                });
            }
        };
        mobHandlerThread.start();
        this.f31095f = new Handler(mobHandlerThread.getLooper(), new Handler.Callback() { // from class: com.mob.commons.clt.PkgClt.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        PkgClt.this.m6285f();
                        return false;
                    case 2:
                        PkgClt.this.m6287e();
                        return false;
                    default:
                        return false;
                }
            }
        });
        this.f31095f.sendEmptyMessage(2);
    }

    /* renamed from: a */
    private void m6300a(long j) {
        File file = new File(ResHelper.getCacheRoot(this.f31093d), "comm/dbs/.nulal");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            dataOutputStream.writeLong(j);
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (Throwable th) {
            MobLog.getInstance().m6199d(th);
        }
    }

    /* renamed from: a */
    private void m6299a(long j, String str, ArrayList<HashMap<String, String>> arrayList) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("type", str);
        hashMap.put("list", arrayList);
        hashMap.put("datetime", Long.valueOf(C10054a.m6371a(this.f31093d)));
        C10060b.m6331a(this.f31093d).m6332a(j, hashMap);
    }

    /* renamed from: a */
    private void m6295a(ArrayList<HashMap<String, String>> arrayList) {
        File file = new File(ResHelper.getCacheRoot(this.f31093d), "comm/dbs/.al");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream(file)), "utf-8");
            Iterator<HashMap<String, String>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                outputStreamWriter.append((CharSequence) this.f31094e.fromHashMap(it2.next())).append('\n');
            }
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (Throwable th) {
            MobLog.getInstance().m6199d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m6296a(String str) {
        for (String str2 : f31090a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6293b() {
        ArrayList<HashMap<String, String>> arrayList;
        ArrayList<HashMap<String, String>> arrayList2;
        ArrayList<HashMap<String, String>> m6291c = m6291c();
        if (m6291c == null || m6291c.isEmpty()) {
            try {
                arrayList = (ArrayList) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31093d), "getInstalledApp", false);
            } catch (Throwable th) {
                MobLog.getInstance().m6187w(th);
                arrayList = new ArrayList<>();
            }
            m6299a(C10054a.m6353o(this.f31093d), "APPS_ALL", arrayList);
            m6295a(arrayList);
            m6300a(C10054a.m6371a(this.f31093d) + (C10054a.m6361g(this.f31093d) * 1000));
            return;
        }
        long m6371a = C10054a.m6371a(this.f31093d);
        if (m6371a < m6289d()) {
            m6285f();
            return;
        }
        try {
            arrayList2 = (ArrayList) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31093d), "getInstalledApp", false);
        } catch (Throwable th2) {
            MobLog.getInstance().m6187w(th2);
            arrayList2 = new ArrayList<>();
        }
        m6299a(C10054a.m6353o(this.f31093d), "APPS_ALL", arrayList2);
        m6295a(arrayList2);
        m6300a((C10054a.m6361g(this.f31093d) * 1000) + m6371a);
    }

    /* renamed from: c */
    private ArrayList<HashMap<String, String>> m6291c() {
        File file = new File(ResHelper.getCacheRoot(this.f31093d), "comm/dbs/.al");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (file.exists()) {
            try {
                ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(file)), "utf-8"));
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    HashMap<String, String> fromJson = this.f31094e.fromJson(readLine);
                    if (fromJson != null) {
                        arrayList.add(fromJson);
                    }
                }
                bufferedReader.close();
                return arrayList;
            } catch (Throwable th) {
                MobLog.getInstance().m6199d(th);
            }
        }
        return new ArrayList<>();
    }

    /* renamed from: d */
    private long m6289d() {
        File file = new File(ResHelper.getCacheRoot(this.f31093d), "comm/dbs/.nulal");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (file.exists()) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                return readLong;
            } catch (Throwable th) {
                MobLog.getInstance().m6199d(th);
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m6287e() {
        if (C10054a.m6364d(this.f31093d) && C10054a.m6362f(this.f31093d)) {
            if (this.f31092c == null) {
                this.f31092c = new BroadcastReceiver() { // from class: com.mob.commons.clt.PkgClt.3
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        String str = null;
                        if (intent != null) {
                            str = intent.getAction();
                        }
                        if (!PkgClt.this.m6296a(str) || PkgClt.this.f31095f == null) {
                            return;
                        }
                        PkgClt.this.f31095f.removeMessages(1);
                        PkgClt.this.f31095f.sendEmptyMessageDelayed(1, 5000L);
                    }
                };
            }
            IntentFilter intentFilter = new IntentFilter();
            for (int i = 0; i < f31090a.length; i++) {
                intentFilter.addAction(f31090a[i]);
            }
            intentFilter.addDataScheme("package");
            try {
                this.f31093d.registerReceiver(this.f31092c, intentFilter);
            } catch (Throwable th) {
            }
        } else if (this.f31092c != null) {
            this.f31095f.removeMessages(1);
            try {
                this.f31093d.unregisterReceiver(this.f31092c);
            } catch (Throwable th2) {
            }
            this.f31092c = null;
        }
        this.f31095f.sendEmptyMessageDelayed(2, Util.MILLSECONDS_OF_HOUR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m6285f() {
        ArrayList<HashMap<String, String>> arrayList;
        ArrayList<HashMap<String, String>> m6291c = m6291c();
        try {
            arrayList = (ArrayList) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31093d), "getInstalledApp", false);
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
            arrayList = new ArrayList<>();
        }
        if (m6291c == null || m6291c.isEmpty()) {
            m6299a(C10054a.m6353o(this.f31093d), "APPS_ALL", arrayList);
            m6295a(arrayList);
            m6300a(C10054a.m6371a(this.f31093d) + (C10054a.m6361g(this.f31093d) * 1000));
            return;
        }
        ArrayList<HashMap<String, String>> m6294a = m6294a(arrayList, m6291c);
        if (!m6294a.isEmpty()) {
            m6299a(C10054a.m6371a(this.f31093d), "APPS_INCR", m6294a);
        }
        ArrayList<HashMap<String, String>> m6294a2 = m6294a(m6291c, arrayList);
        if (!m6294a2.isEmpty()) {
            m6299a(C10054a.m6371a(this.f31093d), "UNINSTALL", m6294a2);
        }
        m6295a(arrayList);
        m6300a(C10054a.m6371a(this.f31093d) + (C10054a.m6361g(this.f31093d) * 1000));
    }

    public static synchronized boolean register(Context context, String str) {
        synchronized (PkgClt.class) {
            startCollector(context);
        }
        return true;
    }

    public static synchronized void startCollector(Context context) {
        synchronized (PkgClt.class) {
            if (f31091b == null) {
                f31091b = new PkgClt(context);
                f31091b.m6301a();
            }
        }
    }
}
