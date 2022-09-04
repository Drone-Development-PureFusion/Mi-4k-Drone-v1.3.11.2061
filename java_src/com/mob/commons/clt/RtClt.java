package com.mob.commons.clt;

import android.content.Context;
import android.os.Build;
import com.mob.commons.C10054a;
import com.mob.commons.C10060b;
import com.mob.commons.C10063c;
import com.mob.commons.C10074d;
import com.mob.commons.LockAction;
import com.mob.tools.MobLog;
import com.mob.tools.MobLooper;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.xiaomi.market.sdk.C10445j;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class RtClt {

    /* renamed from: a */
    private static final String f31100a;

    /* renamed from: b */
    private static RtClt f31101b;

    /* renamed from: c */
    private Context f31102c;

    static {
        f31100a = Build.VERSION.SDK_INT >= 16 ? "^u\\d+_a\\d+" : "^app_\\d+";
    }

    private RtClt(Context context) {
        this.f31102c = context.getApplicationContext();
    }

    /* renamed from: a */
    private ArrayList<HashMap<String, Object>> m6273a(HashMap<String, String>[][] hashMapArr, ArrayList<long[]> arrayList) {
        ArrayList<HashMap<String, Object>> arrayList2 = new ArrayList<>(hashMapArr.length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < hashMapArr.length) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("runtimes", 0L);
                hashMap.put("fg", 0);
                hashMap.put("bg", 0);
                hashMap.put("empty", 0);
                arrayList2.add(hashMap);
                HashMap<String, String>[] hashMapArr2 = hashMapArr[i2];
                int length = hashMapArr2.length - 1;
                while (length >= 0) {
                    if (hashMapArr2[length] != null) {
                        hashMap.put("runtimes", Long.valueOf((length == 0 ? 0L : arrayList.get(length)[1]) + ((Long) ResHelper.forceCast(hashMap.get("runtimes"), 0L)).longValue()));
                        if ("fg".equals(hashMapArr2[length].get("pcy"))) {
                            hashMap.put("fg", Integer.valueOf(((Integer) ResHelper.forceCast(hashMap.get("fg"), 0)).intValue() + 1));
                        } else if ("bg".equals(hashMapArr2[length].get("pcy"))) {
                            hashMap.put("bg", Integer.valueOf(((Integer) ResHelper.forceCast(hashMap.get("bg"), 0)).intValue() + 1));
                        } else {
                            hashMap.put("empty", Integer.valueOf(((Integer) ResHelper.forceCast(hashMap.get("empty"), 0)).intValue() + 1));
                        }
                        hashMap.put("pkg", hashMapArr2[length].get("pkg"));
                        hashMap.put("name", hashMapArr2[length].get("name"));
                        hashMap.put("version", hashMapArr2[length].get("version"));
                    }
                    length--;
                }
                i = i2 + 1;
            } else {
                return arrayList2;
            }
        }
    }

    /* renamed from: a */
    private HashMap<String, Integer> m6276a(ArrayList<ArrayList<HashMap<String, String>>> arrayList) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Iterator<ArrayList<HashMap<String, String>>> it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Iterator<HashMap<String, String>> it3 = it2.next().iterator();
            int i2 = i;
            while (it3.hasNext()) {
                HashMap<String, String> next = it3.next();
                String str = next.get("pkg") + ":" + next.get("version");
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, Integer.valueOf(i2));
                    i2++;
                }
            }
            i = i2;
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m6282a() {
        Thread thread = new Thread() { // from class: com.mob.commons.clt.RtClt.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                C10074d.m6265a(new File(ResHelper.getCacheRoot(RtClt.this.f31102c), "comm/locks/.rc_lock"), new LockAction() { // from class: com.mob.commons.clt.RtClt.1.1
                    @Override // com.mob.commons.LockAction
                    public boolean run(FileLocker fileLocker) {
                        if (C10063c.m6318a(RtClt.this.f31102c, "comm/tags/.rcTag")) {
                            return false;
                        }
                        RtClt.this.m6272b();
                        return true;
                    }
                });
            }
        };
        thread.setPriority(1);
        thread.start();
    }

    /* renamed from: a */
    private void m6278a(String str, ArrayList<ArrayList<HashMap<String, String>>> arrayList, ArrayList<long[]> arrayList2) {
        try {
            HashMap<String, String[]> m6266e = m6266e();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str), "utf-8"));
            String readLine = bufferedReader.readLine();
            for (int i = 0; i < 7; i++) {
                readLine = bufferedReader.readLine();
            }
            ArrayList<HashMap<String, String>> arrayList3 = new ArrayList<>();
            while (readLine != null) {
                if ("======================".equals(readLine)) {
                    try {
                        String[] split = bufferedReader.readLine().split("_");
                        long[] jArr = {Long.valueOf(split[0]).longValue(), Long.valueOf(split[1]).longValue()};
                        arrayList.add(arrayList3);
                        arrayList2.add(jArr);
                    } catch (Throwable th) {
                    }
                    arrayList3 = new ArrayList<>();
                    for (int i2 = 0; i2 < 7; i2++) {
                        bufferedReader.readLine();
                    }
                } else if (readLine.length() > 0) {
                    m6277a(readLine, m6266e, arrayList3);
                }
                readLine = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Throwable th2) {
            MobLog.getInstance().m6199d(th2);
        }
    }

    /* renamed from: a */
    private void m6277a(String str, HashMap<String, String[]> hashMap, ArrayList<HashMap<String, String>> arrayList) {
        String[] strArr;
        String[] split = str.replaceAll(" +", " ").split(" ");
        if (split == null || split.length < 10) {
            return;
        }
        String str2 = split[split.length - 1];
        if (!split[split.length - 2].matches(f31100a) || "top".equals(str2) || (strArr = hashMap.get(str2)) == null) {
            return;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("pkg", str2);
        hashMap2.put("name", strArr[0]);
        hashMap2.put("version", strArr[1]);
        hashMap2.put("pcy", split[split.length - 3]);
        arrayList.add(hashMap2);
    }

    /* renamed from: a */
    private void m6275a(ArrayList<HashMap<String, Object>> arrayList, ArrayList<long[]> arrayList2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("type", "APP_RUNTIMES");
        hashMap.put("list", arrayList);
        hashMap.put("datatime", Long.valueOf(C10054a.m6371a(this.f31102c)));
        hashMap.put("recordat", Long.valueOf(arrayList2.get(0)[0]));
        long j = 0;
        for (int i = 1; i < arrayList2.size(); i++) {
            j += arrayList2.get(i)[1];
        }
        hashMap.put("sdk_runtime_len", Long.valueOf(j));
        hashMap.put("top_count", Integer.valueOf(arrayList2.size()));
        C10060b.m6331a(this.f31102c).m6332a(C10054a.m6371a(this.f31102c), hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m6279a(String str) {
        ArrayList<ArrayList<HashMap<String, String>>> arrayList = new ArrayList<>();
        ArrayList<long[]> arrayList2 = new ArrayList<>();
        m6278a(str, arrayList, arrayList2);
        m6275a(m6273a(m6274a(m6276a(arrayList), arrayList), arrayList2), arrayList2);
        return m6270b(str);
    }

    /* renamed from: a */
    private HashMap<String, String>[][] m6274a(HashMap<String, Integer> hashMap, ArrayList<ArrayList<HashMap<String, String>>> arrayList) {
        HashMap<String, String> hashMap2;
        HashMap<String, String>[][] hashMapArr = (HashMap[][]) Array.newInstance(HashMap.class, hashMap.size(), arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ArrayList<HashMap<String, String>> arrayList2 = arrayList.get(i);
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashMapArr[hashMap.get(hashMap2.get("pkg") + ":" + hashMap2.get("version")).intValue()][i] = arrayList2.get(i2);
            }
        }
        return hashMapArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6272b() {
        Process process;
        OutputStream outputStream = null;
        try {
            final File file = new File(ResHelper.getCacheRoot(this.f31102c), "comm/dbs/.plst");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            final String absolutePath = file.getAbsolutePath();
            long m6269c = m6269c();
            C10063c.m6317b(this.f31102c, "comm/tags/.rcTag");
            try {
                process = Runtime.getRuntime().exec("sh");
                try {
                    outputStream = process.getOutputStream();
                } catch (Throwable th) {
                    th = th;
                    MobLog.getInstance().m6187w(th);
                    C10063c.m6316c(this.f31102c, "comm/tags/.rcTag");
                    final HashMap hashMap = new HashMap();
                    hashMap.put("nextUploadTime", Long.valueOf(m6269c));
                    hashMap.put("p", process);
                    hashMap.put(C10445j.f32457ac, outputStream);
                    hashMap.put("firstLog", true);
                    new MobLooper(this.f31102c).start(new Runnable() { // from class: com.mob.commons.clt.RtClt.2
                        @Override // java.lang.Runnable
                        public void run() {
                            String str;
                            long j;
                            try {
                                if (!C10054a.m6367b(RtClt.this.f31102c)) {
                                    return;
                                }
                                if (!file.exists()) {
                                    file.createNewFile();
                                }
                                long m6371a = C10054a.m6371a(RtClt.this.f31102c);
                                OutputStream outputStream2 = (OutputStream) hashMap.get(C10445j.f32457ac);
                                outputStream2.write(("top -d 0 -n 1 | grep -E -v 'root|shell|system' >> " + absolutePath + " && echo \"======================\" >> " + absolutePath + "\n").getBytes("ascii"));
                                if (String.valueOf(hashMap.get("firstLog")).equals("true")) {
                                    str = "echo \"" + m6371a + "_0\" >> " + absolutePath + "\n";
                                    hashMap.put("firstLog", false);
                                } else {
                                    str = "echo \"" + m6371a + "_" + C10054a.m6365c(RtClt.this.f31102c) + "\" >> " + absolutePath + "\n";
                                }
                                outputStream2.write(str.getBytes("ascii"));
                                outputStream2.flush();
                                try {
                                    j = Long.parseLong(String.valueOf(hashMap.get("nextUploadTime")));
                                } catch (Throwable th2) {
                                    j = 0;
                                }
                                if (m6371a < j) {
                                    return;
                                }
                                outputStream2.write("exit\n".getBytes("ascii"));
                                outputStream2.flush();
                                outputStream2.close();
                                Process process2 = (Process) hashMap.get("p");
                                process2.waitFor();
                                process2.destroy();
                                if (RtClt.this.m6279a(absolutePath)) {
                                    long m6267d = RtClt.this.m6267d();
                                    if (m6267d > 0) {
                                        hashMap.put("nextUploadTime", Long.valueOf(m6267d));
                                    }
                                    hashMap.put("firstLog", true);
                                }
                                C10063c.m6317b(RtClt.this.f31102c, "comm/tags/.rcTag");
                                Process exec = Runtime.getRuntime().exec("sh");
                                hashMap.put("p", exec);
                                hashMap.put(C10445j.f32457ac, exec.getOutputStream());
                                C10063c.m6316c(RtClt.this.f31102c, "comm/tags/.rcTag");
                            } catch (Throwable th3) {
                                MobLog.getInstance().m6199d(th3);
                            }
                        }
                    }, C10054a.m6365c(this.f31102c) * 1000);
                }
            } catch (Throwable th2) {
                th = th2;
                process = null;
            }
            C10063c.m6316c(this.f31102c, "comm/tags/.rcTag");
            final HashMap hashMap2 = new HashMap();
            hashMap2.put("nextUploadTime", Long.valueOf(m6269c));
            hashMap2.put("p", process);
            hashMap2.put(C10445j.f32457ac, outputStream);
            hashMap2.put("firstLog", true);
            new MobLooper(this.f31102c).start(new Runnable() { // from class: com.mob.commons.clt.RtClt.2
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    long j;
                    try {
                        if (!C10054a.m6367b(RtClt.this.f31102c)) {
                            return;
                        }
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        long m6371a = C10054a.m6371a(RtClt.this.f31102c);
                        OutputStream outputStream2 = (OutputStream) hashMap2.get(C10445j.f32457ac);
                        outputStream2.write(("top -d 0 -n 1 | grep -E -v 'root|shell|system' >> " + absolutePath + " && echo \"======================\" >> " + absolutePath + "\n").getBytes("ascii"));
                        if (String.valueOf(hashMap2.get("firstLog")).equals("true")) {
                            str = "echo \"" + m6371a + "_0\" >> " + absolutePath + "\n";
                            hashMap2.put("firstLog", false);
                        } else {
                            str = "echo \"" + m6371a + "_" + C10054a.m6365c(RtClt.this.f31102c) + "\" >> " + absolutePath + "\n";
                        }
                        outputStream2.write(str.getBytes("ascii"));
                        outputStream2.flush();
                        try {
                            j = Long.parseLong(String.valueOf(hashMap2.get("nextUploadTime")));
                        } catch (Throwable th22) {
                            j = 0;
                        }
                        if (m6371a < j) {
                            return;
                        }
                        outputStream2.write("exit\n".getBytes("ascii"));
                        outputStream2.flush();
                        outputStream2.close();
                        Process process2 = (Process) hashMap2.get("p");
                        process2.waitFor();
                        process2.destroy();
                        if (RtClt.this.m6279a(absolutePath)) {
                            long m6267d = RtClt.this.m6267d();
                            if (m6267d > 0) {
                                hashMap2.put("nextUploadTime", Long.valueOf(m6267d));
                            }
                            hashMap2.put("firstLog", true);
                        }
                        C10063c.m6317b(RtClt.this.f31102c, "comm/tags/.rcTag");
                        Process exec = Runtime.getRuntime().exec("sh");
                        hashMap2.put("p", exec);
                        hashMap2.put(C10445j.f32457ac, exec.getOutputStream());
                        C10063c.m6316c(RtClt.this.f31102c, "comm/tags/.rcTag");
                    } catch (Throwable th3) {
                        MobLog.getInstance().m6199d(th3);
                    }
                }
            }, C10054a.m6365c(this.f31102c) * 1000);
        } catch (Throwable th3) {
        }
    }

    /* renamed from: b */
    private boolean m6270b(String str) {
        try {
            File file = new File(str);
            file.delete();
            file.createNewFile();
            return true;
        } catch (Throwable th) {
            MobLog.getInstance().m6199d(th);
            return false;
        }
    }

    /* renamed from: c */
    private long m6269c() {
        long m6371a = C10054a.m6371a(this.f31102c);
        try {
            File file = new File(ResHelper.getCacheRoot(this.f31102c), "comm/dbs/.nulplt");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
                m6267d();
                return m6371a + 86400000;
            }
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            long readLong = dataInputStream.readLong();
            dataInputStream.close();
            return readLong;
        } catch (Throwable th) {
            MobLog.getInstance().m6199d(th);
            return m6371a + 86400000;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public long m6267d() {
        long m6371a = C10054a.m6371a(this.f31102c) + 86400000;
        try {
            File file = new File(ResHelper.getCacheRoot(this.f31102c), "comm/dbs/.nulplt");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            dataOutputStream.writeLong(m6371a);
            dataOutputStream.flush();
            dataOutputStream.close();
            return m6371a;
        } catch (Throwable th) {
            MobLog.getInstance().m6199d(th);
            return 0L;
        }
    }

    /* renamed from: e */
    private HashMap<String, String[]> m6266e() {
        ArrayList arrayList;
        try {
            arrayList = (ArrayList) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31102c), "getInstalledApp", false);
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
            arrayList = new ArrayList();
        }
        HashMap<String, String[]> hashMap = new HashMap<>();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            HashMap hashMap2 = (HashMap) it2.next();
            hashMap.put((String) hashMap2.get("pkg"), new String[]{(String) hashMap2.get("name"), (String) hashMap2.get("version")});
        }
        return hashMap;
    }

    public static synchronized void startCollector(Context context) {
        synchronized (RtClt.class) {
            if (f31101b == null) {
                f31101b = new RtClt(context);
                f31101b.m6282a();
            }
        }
    }

    public static synchronized void startCollector(Context context, String str) {
        synchronized (RtClt.class) {
            startCollector(context);
        }
    }
}
