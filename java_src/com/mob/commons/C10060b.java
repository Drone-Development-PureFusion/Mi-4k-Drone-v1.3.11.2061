package com.mob.commons;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.utils.p219a.C3070c;
import com.mob.commons.authorize.DeviceAuthorizer;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.MobRSA;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.SQLiteHelper;
import com.p255mi.live.openlivesdk.C10024b;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.zip.GZIPOutputStream;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
/* renamed from: com.mob.commons.b */
/* loaded from: classes2.dex */
public class C10060b implements Handler.Callback {

    /* renamed from: a */
    private static C10060b f31071a;

    /* renamed from: b */
    private Context f31072b;

    /* renamed from: c */
    private Handler f31073c;

    /* renamed from: d */
    private SQLiteHelper.SingleTableDB f31074d;

    /* renamed from: e */
    private Hashon f31075e = new Hashon();

    /* renamed from: f */
    private Random f31076f = new Random();

    private C10060b(Context context) {
        this.f31072b = context.getApplicationContext();
        MobHandlerThread mobHandlerThread = new MobHandlerThread();
        mobHandlerThread.start();
        this.f31073c = new Handler(mobHandlerThread.getLooper(), this);
        File file = new File(ResHelper.getCacheRoot(context), "comm/dbs/.dh");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        this.f31074d = SQLiteHelper.getDatabase(file.getAbsolutePath(), "DataHeap_1");
        this.f31074d.addField(C3070c.C3071a.f11505i, "text", true);
        this.f31074d.addField(UriUtil.DATA_SCHEME, "text", true);
        this.f31073c.sendEmptyMessage(1);
    }

    /* renamed from: a */
    public static synchronized C10060b m6331a(Context context) {
        C10060b c10060b;
        synchronized (C10060b.class) {
            if (f31071a == null) {
                f31071a = new C10060b(context);
            }
            c10060b = f31071a;
        }
        return c10060b;
    }

    /* renamed from: a */
    private String m6328a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeLong(this.f31076f.nextLong());
        dataOutputStream.writeLong(this.f31076f.nextLong());
        dataOutputStream.flush();
        dataOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
        gZIPOutputStream.write(str.getBytes("utf-8"));
        gZIPOutputStream.flush();
        gZIPOutputStream.close();
        byte[] AES128Encode = Data.AES128Encode(byteArray, byteArrayOutputStream2.toByteArray());
        byte[] encode = new MobRSA(1024).encode(byteArray, new BigInteger("ceeef5035212dfe7c6a0acdc0ef35ce5b118aab916477037d7381f85c6b6176fcf57b1d1c3296af0bb1c483fe5e1eb0ce9eb2953b44e494ca60777a1b033cc07", 16), new BigInteger("191737288d17e660c4b61440d5d14228a0bf9854499f9d68d8274db55d6d954489371ecf314f26bec236e58fac7fffa9b27bcf923e1229c4080d49f7758739e5bd6014383ed2a75ce1be9b0ab22f283c5c5e11216c5658ba444212b6270d629f2d615b8dfdec8545fb7d4f935b0cc10b6948ab4fc1cb1dd496a8f94b51e888dd", 16));
        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream3);
        dataOutputStream2.writeInt(encode.length);
        dataOutputStream2.write(encode);
        dataOutputStream2.writeInt(AES128Encode.length);
        dataOutputStream2.write(AES128Encode);
        dataOutputStream2.flush();
        dataOutputStream2.close();
        return Base64.encodeToString(byteArrayOutputStream3.toByteArray(), 2);
    }

    /* renamed from: a */
    private void m6333a() {
        String str;
        try {
            str = (String) ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31072b), "getNetworkType", new Object[0]);
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
            str = null;
        }
        if (str == null || "none".equals(str)) {
            return;
        }
        C10074d.m6265a(new File(ResHelper.getCacheRoot(this.f31072b), "comm/locks/.dhlock"), new LockAction() { // from class: com.mob.commons.b.2
            @Override // com.mob.commons.LockAction
            public boolean run(FileLocker fileLocker) {
                ArrayList m6326b = C10060b.this.m6326b();
                if (m6326b.size() <= 0 || !C10060b.this.m6327a(m6326b)) {
                    return false;
                }
                C10060b.this.m6321b(m6326b);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m6327a(ArrayList<String[]> arrayList) {
        try {
            NetworkHelper networkHelper = new NetworkHelper();
            ArrayList<MobProduct> m6264a = C10075e.m6264a();
            if (m6264a.isEmpty()) {
                return false;
            }
            HashMap hashMap = new HashMap();
            Object invokeStaticMethod = ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", this.f31072b);
            hashMap.put("plat", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getPlatformCode", new Object[0]));
            hashMap.put("device", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getDeviceKey", new Object[0]));
            hashMap.put("mac", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getMacAddress", new Object[0]));
            hashMap.put("model", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getModel", new Object[0]));
            hashMap.put("duid", DeviceAuthorizer.authorize(this.f31072b, (MobProduct) null));
            hashMap.put("imei", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getIMEI", new Object[0]));
            hashMap.put("serialno", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getSerialno", new Object[0]));
            hashMap.put("networktype", ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getDetailNetworkTypeForStatic", new Object[0]));
            ArrayList arrayList2 = new ArrayList();
            byte[] rawMD5 = Data.rawMD5(String.valueOf(ReflectHelper.invokeInstanceMethod(invokeStaticMethod, "getManufacturer", new Object[0])));
            Iterator<String[]> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(this.f31075e.fromJson(new String(Data.AES128Decode(rawMD5, Base64.decode(it2.next()[1], 2)), "utf-8").trim()));
            }
            hashMap.put("datas", arrayList2);
            ArrayList<KVPair<String>> arrayList3 = new ArrayList<>();
            arrayList3.add(new KVPair<>(C10024b.f30903f, m6264a.get(0).getProductAppkey()));
            arrayList3.add(new KVPair<>(C0548a.f931b, m6328a(this.f31075e.fromHashMap(hashMap))));
            ArrayList<KVPair<String>> arrayList4 = new ArrayList<>();
            arrayList4.add(new KVPair<>("User-Identity", C10075e.m6263a(this.f31072b, m6264a)));
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 30000;
            networkTimeOut.connectionTimeout = 30000;
            boolean equals = "200".equals(String.valueOf(this.f31075e.fromJson(networkHelper.httpPost(m6324b(this.f31072b), arrayList3, null, arrayList4, networkTimeOut)).get("status")));
            if (equals) {
                return equals;
            }
            C10080f.m6243e(this.f31072b, null);
            return equals;
        } catch (Throwable th) {
            C10080f.m6243e(this.f31072b, null);
            MobLog.getInstance().m6187w(th);
            return false;
        }
    }

    /* renamed from: b */
    private static String m6324b(Context context) {
        String str = null;
        try {
            str = C10080f.m6242f(context);
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
        }
        return TextUtils.isEmpty(str) ? "http://c.data.mob.com/v2/cdata" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public ArrayList<String[]> m6326b() {
        ArrayList<String[]> arrayList = new ArrayList<>();
        try {
            Cursor query = SQLiteHelper.query(this.f31074d, new String[]{C3070c.C3071a.f11505i, UriUtil.DATA_SCHEME}, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    long m6371a = C10054a.m6371a(this.f31072b);
                    do {
                        String[] strArr = {query.getString(0), query.getString(1)};
                        long j = -1;
                        try {
                            j = Long.parseLong(strArr[0]);
                        } catch (Throwable th) {
                        }
                        if (j <= m6371a) {
                            arrayList.add(strArr);
                        }
                    } while (query.moveToNext());
                    query.close();
                } else {
                    query.close();
                }
            }
        } catch (Throwable th2) {
            MobLog.getInstance().m6187w(th2);
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m6325b(final long j, final HashMap<String, Object> hashMap) {
        C10074d.m6265a(new File(ResHelper.getCacheRoot(this.f31072b), "comm/locks/.dhlock"), new LockAction() { // from class: com.mob.commons.b.1
            @Override // com.mob.commons.LockAction
            public boolean run(FileLocker fileLocker) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C3070c.C3071a.f11505i, String.valueOf(j));
                    contentValues.put(UriUtil.DATA_SCHEME, Base64.encodeToString(Data.AES128Encode(Data.rawMD5(String.valueOf(ReflectHelper.invokeInstanceMethod(ReflectHelper.invokeStaticMethod("DeviceHelper", "getInstance", C10060b.this.f31072b), "getManufacturer", new Object[0]))), C10060b.this.f31075e.fromHashMap(hashMap).getBytes("utf-8")), 2));
                    SQLiteHelper.insert(C10060b.this.f31074d, contentValues);
                } catch (Throwable th) {
                    MobLog.getInstance().m6187w(th);
                }
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6321b(ArrayList<String[]> arrayList) {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String[]> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String[] next = it2.next();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(C0494h.f738z).append(next[0]).append(C0494h.f738z);
            }
            SQLiteHelper.delete(this.f31074d, "time in (" + sb.toString() + ")", null);
        } catch (Throwable th) {
            MobLog.getInstance().m6187w(th);
        }
    }

    /* renamed from: a */
    public synchronized void m6332a(long j, HashMap<String, Object> hashMap) {
        Message message = new Message();
        message.what = 2;
        message.obj = new Object[]{Long.valueOf(j), hashMap};
        this.f31073c.sendMessage(message);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                m6333a();
                this.f31073c.sendEmptyMessageDelayed(1, 10000L);
                break;
            case 2:
                Object[] objArr = (Object[]) message.obj;
                long longValue = ((Long) ResHelper.forceCast(objArr[0], -1L)).longValue();
                if (longValue > 0) {
                    m6325b(longValue, (HashMap) objArr[1]);
                    break;
                }
                break;
        }
        return false;
    }
}
