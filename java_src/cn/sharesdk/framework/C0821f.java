package cn.sharesdk.framework;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import cn.sharesdk.framework.p076b.C0796a;
import cn.sharesdk.framework.utils.C0831d;
import com.facebook.common.util.UriUtil;
import com.mob.commons.eventrecoder.EventRecorder;
import com.mob.tools.SSDKHandlerThread;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
/* renamed from: cn.sharesdk.framework.f */
/* loaded from: classes.dex */
public class C0821f extends SSDKHandlerThread {

    /* renamed from: b */
    private Context f1635b;

    /* renamed from: j */
    private String f1643j;

    /* renamed from: k */
    private boolean f1644k;

    /* renamed from: l */
    private String f1645l;

    /* renamed from: m */
    private boolean f1646m;

    /* renamed from: n */
    private boolean f1647n;

    /* renamed from: a */
    private EnumC0824a f1634a = EnumC0824a.IDLE;

    /* renamed from: c */
    private HashMap<String, HashMap<String, String>> f1636c = new HashMap<>();

    /* renamed from: d */
    private ArrayList<Platform> f1637d = new ArrayList<>();

    /* renamed from: e */
    private HashMap<String, Integer> f1638e = new HashMap<>();

    /* renamed from: f */
    private HashMap<Integer, String> f1639f = new HashMap<>();

    /* renamed from: g */
    private HashMap<Integer, CustomPlatform> f1640g = new HashMap<>();

    /* renamed from: h */
    private HashMap<Integer, HashMap<String, Object>> f1641h = new HashMap<>();

    /* renamed from: i */
    private HashMap<Integer, Service> f1642i = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cn.sharesdk.framework.f$a */
    /* loaded from: classes.dex */
    public enum EnumC0824a {
        IDLE,
        INITIALIZING,
        READY
    }

    public C0821f(Context context, String str) {
        this.f1643j = str;
        this.f1635b = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m37818a(C0796a c0796a, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        boolean z;
        try {
            if (hashMap.containsKey("error")) {
                C0831d.m37772a().m6194i("ShareSDK parse sns config ==>>", new Hashon().fromHashMap(hashMap));
                z = false;
            } else if (!hashMap.containsKey(UriUtil.LOCAL_RESOURCE_SCHEME)) {
                C0831d.m37772a().m6200d("ShareSDK platform config result ==>>", "SNS configuration is empty");
                z = false;
            } else {
                String str = (String) hashMap.get(UriUtil.LOCAL_RESOURCE_SCHEME);
                if (str == null) {
                    z = false;
                } else {
                    hashMap2.putAll(c0796a.m37953b(str));
                    z = true;
                }
            }
            return z;
        } catch (Throwable th) {
            C0831d.m37772a().m6187w(th);
            return false;
        }
    }

    /* renamed from: f */
    private void m37793f() {
        HashMap<String, String> remove;
        synchronized (this.f1636c) {
            this.f1636c.clear();
            m37792g();
            if (this.f1636c.containsKey("ShareSDK") && (remove = this.f1636c.remove("ShareSDK")) != null) {
                if (this.f1643j == null) {
                    this.f1643j = remove.get("AppKey");
                }
                this.f1645l = remove.containsKey("UseVersion") ? remove.get("UseVersion") : "latest";
            }
        }
    }

    /* renamed from: g */
    private void m37792g() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            XmlPullParser newPullParser = newInstance.newPullParser();
            InputStream open = this.f1635b.getAssets().open("ShareSDK.xml");
            newPullParser.setInput(open, "utf-8");
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 2) {
                    String name = newPullParser.getName();
                    HashMap<String, String> hashMap = new HashMap<>();
                    int attributeCount = newPullParser.getAttributeCount();
                    for (int i = 0; i < attributeCount; i++) {
                        hashMap.put(newPullParser.getAttributeName(i), newPullParser.getAttributeValue(i).trim());
                    }
                    this.f1636c.put(name, hashMap);
                }
            }
            open.close();
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cn.sharesdk.framework.f$1] */
    /* renamed from: h */
    private void m37791h() {
        new Thread() { // from class: cn.sharesdk.framework.f.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    if (C0821f.this.m37797d() || !C0821f.this.m37810a(hashMap)) {
                        return;
                    }
                    C0821f.this.m37803b(hashMap);
                } catch (Throwable th) {
                    C0831d.m37772a().m6187w(th);
                }
            }
        }.start();
    }

    /* renamed from: i */
    private void m37790i() {
        this.f1637d.clear();
        ArrayList<Platform> m37840a = new C0819e(this.f1635b, this.f1643j).m37840a();
        if (m37840a != null) {
            this.f1637d.addAll(m37840a);
        }
        synchronized (this.f1638e) {
            synchronized (this.f1639f) {
                Iterator<Platform> it2 = this.f1637d.iterator();
                while (it2.hasNext()) {
                    Platform next = it2.next();
                    this.f1639f.put(Integer.valueOf(next.getPlatformId()), next.getName());
                    this.f1638e.put(next.getName(), Integer.valueOf(next.getPlatformId()));
                }
            }
        }
    }

    /* renamed from: j */
    private void m37789j() {
        C0819e c0819e = new C0819e(this.f1635b, this.f1643j);
        c0819e.m37834a(this);
        c0819e.m37835a(this.handler, this.f1644k, 70);
    }

    /* renamed from: a */
    public Platform m37815a(String str) {
        Platform[] m37824a;
        if (str == null || (m37824a = m37824a()) == null) {
            return null;
        }
        for (Platform platform : m37824a) {
            if (str.equals(platform.getName())) {
                return platform;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String m37820a(int i, String str) {
        String m37837a;
        synchronized (this.f1641h) {
            m37837a = new C0819e(this.f1635b, this.f1643j).m37837a(i, str, this.f1641h);
        }
        return m37837a;
    }

    /* renamed from: a */
    public String m37819a(Bitmap bitmap) {
        if (EnumC0824a.READY != this.f1634a) {
            return null;
        }
        return new C0819e(this.f1635b, this.f1643j).m37836a(bitmap);
    }

    /* renamed from: a */
    public String m37811a(String str, boolean z, int i, String str2) {
        return EnumC0824a.READY != this.f1634a ? str : new C0819e(this.f1635b, this.f1643j).m37831a(str, z, i, str2);
    }

    /* renamed from: a */
    public void m37823a(int i) {
        NetworkHelper.connectionTimeout = i;
    }

    /* renamed from: a */
    public void m37822a(int i, int i2) {
        synchronized (this.f1641h) {
            new C0819e(this.f1635b, this.f1643j).m37839a(i, i2, this.f1641h);
        }
    }

    /* renamed from: a */
    public void m37821a(int i, Platform platform) {
        new C0819e(this.f1635b, this.f1643j).m37838a(i, platform);
    }

    /* renamed from: a */
    public void m37816a(Class<? extends Service> cls) {
        synchronized (this.f1642i) {
            if (this.f1642i.containsKey(Integer.valueOf(cls.hashCode()))) {
                return;
            }
            Service newInstance = cls.newInstance();
            this.f1642i.put(Integer.valueOf(cls.hashCode()), newInstance);
            newInstance.m38031a(this.f1635b);
            newInstance.m38029a(this.f1643j);
            newInstance.onBind();
        }
    }

    /* renamed from: a */
    public void m37814a(String str, int i) {
        new C0819e(this.f1635b, this.f1643j).m37832a(str, i);
    }

    /* renamed from: a */
    public void m37813a(String str, String str2) {
        synchronized (this.f1636c) {
            this.f1636c.put(str2, this.f1636c.get(str));
        }
    }

    /* renamed from: a */
    public void m37812a(String str, HashMap<String, Object> hashMap) {
        synchronized (this.f1636c) {
            HashMap<String, String> hashMap2 = this.f1636c.get(str);
            HashMap<String, String> hashMap3 = hashMap2 == null ? new HashMap<>() : hashMap2;
            synchronized (hashMap3) {
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        hashMap3.put(key, String.valueOf(value));
                    }
                }
            }
            this.f1636c.put(str, hashMap3);
        }
        synchronized (this.f1637d) {
            if (this.f1634a == EnumC0824a.INITIALIZING) {
                this.f1637d.wait();
            }
            Iterator<Platform> it2 = this.f1637d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Platform next = it2.next();
                if (next != null && next.getName().equals(str)) {
                    next.m38033a();
                    break;
                }
            }
        }
    }

    /* renamed from: a */
    public void m37809a(boolean z) {
        this.f1644k = z;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cn.sharesdk.framework.f$2] */
    /* renamed from: a */
    public boolean m37810a(HashMap<String, Object> hashMap) {
        if (EnumC0824a.READY != this.f1634a) {
            C0831d.m37772a().m6200d("Statistics module unopened", new Object[0]);
            return false;
        }
        final C0796a m37967a = C0796a.m37967a(this.f1635b, this.f1643j);
        boolean m37818a = m37818a(m37967a, m37967a.m37950d(), hashMap);
        if (m37818a) {
            this.f1647n = true;
            new Thread() { // from class: cn.sharesdk.framework.f.2
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        HashMap<String, Object> m37948e = m37967a.m37948e();
                        HashMap<String, Object> hashMap2 = new HashMap<>();
                        if (C0821f.this.m37818a(m37967a, m37948e, hashMap2)) {
                            C0821f.this.m37803b(hashMap2);
                        }
                        m37967a.m37956a(m37948e);
                    } catch (Throwable th) {
                        C0831d.m37772a().m6187w(th);
                    }
                }
            }.start();
            return m37818a;
        }
        try {
            HashMap<String, Object> m37948e = m37967a.m37948e();
            m37818a = m37818a(m37967a, m37948e, hashMap);
            if (m37818a) {
                m37967a.m37956a(m37948e);
            }
            this.f1647n = true;
            return m37818a;
        } catch (Throwable th) {
            C0831d.m37772a().m6187w(th);
            this.f1647n = false;
            return m37818a;
        }
    }

    /* renamed from: a */
    public Platform[] m37824a() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f1637d) {
            if (this.f1634a == EnumC0824a.IDLE) {
                return null;
            }
            if (this.f1634a == EnumC0824a.INITIALIZING) {
                this.f1637d.wait();
            }
            ArrayList<Platform> arrayList = new ArrayList<>();
            Iterator<Platform> it2 = this.f1637d.iterator();
            while (it2.hasNext()) {
                Platform next = it2.next();
                if (next != null && next.m38032b()) {
                    next.m38033a();
                    arrayList.add(next);
                }
            }
            new C0819e(this.f1635b, this.f1643j).m37830a(arrayList);
            for (Map.Entry<Integer, CustomPlatform> entry : this.f1640g.entrySet()) {
                CustomPlatform value = entry.getValue();
                if (value != null && value.m38032b()) {
                    arrayList.add(value);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            Platform[] platformArr = new Platform[arrayList.size()];
            for (int i = 0; i < platformArr.length; i++) {
                platformArr[i] = arrayList.get(i);
            }
            C0831d.m37772a().m6194i("sort list use time: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return platformArr;
        }
    }

    /* renamed from: b */
    public int m37805b(String str) {
        int intValue;
        synchronized (this.f1638e) {
            intValue = this.f1638e.containsKey(str) ? this.f1638e.get(str).intValue() : 0;
        }
        return intValue;
    }

    /* renamed from: b */
    public String m37808b() {
        try {
            return new C0819e(this.f1635b, this.f1643j).m37827c();
        } catch (Throwable th) {
            C0831d.m37772a().m6187w(th);
            return "2.8.1";
        }
    }

    /* renamed from: b */
    public String m37804b(String str, String str2) {
        String str3;
        synchronized (this.f1636c) {
            HashMap<String, String> hashMap = this.f1636c.get(str);
            str3 = hashMap == null ? null : hashMap.get(str2);
        }
        return str3;
    }

    /* renamed from: b */
    public void m37807b(int i) {
        NetworkHelper.readTimout = i;
    }

    /* renamed from: b */
    public void m37806b(Class<? extends Service> cls) {
        synchronized (this.f1642i) {
            int hashCode = cls.hashCode();
            if (this.f1642i.containsKey(Integer.valueOf(hashCode))) {
                this.f1642i.get(Integer.valueOf(hashCode)).onUnbind();
                this.f1642i.remove(Integer.valueOf(hashCode));
            }
        }
    }

    /* renamed from: b */
    public void m37802b(boolean z) {
        this.f1646m = z;
    }

    /* renamed from: b */
    public boolean m37803b(HashMap<String, Object> hashMap) {
        boolean m37829a;
        synchronized (this.f1641h) {
            this.f1641h.clear();
            m37829a = new C0819e(this.f1635b, this.f1643j).m37829a(hashMap, this.f1641h);
        }
        return m37829a;
    }

    /* renamed from: c */
    public <T extends Service> T m37799c(Class<T> cls) {
        synchronized (this.f1642i) {
            if (this.f1634a == EnumC0824a.IDLE) {
                return null;
            }
            if (this.f1634a == EnumC0824a.INITIALIZING) {
                this.f1642i.wait();
            }
            return cls.cast(this.f1642i.get(Integer.valueOf(cls.hashCode())));
        }
    }

    /* renamed from: c */
    public String m37800c(int i) {
        String str;
        synchronized (this.f1639f) {
            str = this.f1639f.get(Integer.valueOf(i));
        }
        return str;
    }

    /* renamed from: c */
    public String m37798c(String str) {
        if (EnumC0824a.READY != this.f1634a) {
            return null;
        }
        return new C0819e(this.f1635b, this.f1643j).m37833a(str);
    }

    /* renamed from: c */
    public boolean m37801c() {
        return this.f1646m;
    }

    /* renamed from: d */
    public void m37796d(Class<? extends CustomPlatform> cls) {
        synchronized (this.f1640g) {
            if (this.f1640g.containsKey(Integer.valueOf(cls.hashCode()))) {
                return;
            }
            CustomPlatform newInstance = cls.getConstructor(Context.class).newInstance(this.f1635b);
            this.f1640g.put(Integer.valueOf(cls.hashCode()), newInstance);
            synchronized (this.f1638e) {
                synchronized (this.f1639f) {
                    if (newInstance != null && newInstance.b()) {
                        this.f1639f.put(Integer.valueOf(newInstance.getPlatformId()), newInstance.getName());
                        this.f1638e.put(newInstance.getName(), Integer.valueOf(newInstance.getPlatformId()));
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m37797d() {
        boolean z;
        synchronized (this.f1641h) {
            z = (this.f1641h == null || this.f1641h.size() <= 0) ? this.f1647n : true;
        }
        return z;
    }

    /* renamed from: e */
    public void m37795e() {
        try {
            ResHelper.clearCache(this.f1635b);
        } catch (Throwable th) {
            C0831d.m37772a().m6187w(th);
        }
    }

    /* renamed from: e */
    public void m37794e(Class<? extends CustomPlatform> cls) {
        int hashCode = cls.hashCode();
        synchronized (this.f1640g) {
            this.f1640g.remove(Integer.valueOf(hashCode));
        }
    }

    @Override // com.mob.tools.SSDKHandlerThread
    protected void onMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f1634a = EnumC0824a.IDLE;
                this.handler.getLooper().quit();
                return;
            default:
                return;
        }
    }

    @Override // com.mob.tools.SSDKHandlerThread
    protected void onStart(Message message) {
        synchronized (this.f1642i) {
            synchronized (this.f1637d) {
                try {
                    String checkRecord = EventRecorder.checkRecord("ShareSDK");
                    if (!TextUtils.isEmpty(checkRecord)) {
                        C0796a.m37967a(this.f1635b, this.f1643j).m37956a((HashMap<String, Object>) null);
                        C0831d.m37772a().m6188w("EventRecorder checkRecord result ==" + checkRecord, new Object[0]);
                        m37795e();
                    }
                    EventRecorder.clear();
                } catch (Throwable th) {
                    C0831d.m37772a().m6187w(th);
                }
                m37790i();
                m37789j();
                this.f1634a = EnumC0824a.READY;
                this.f1637d.notify();
                this.f1642i.notify();
                m37791h();
            }
        }
    }

    @Override // com.mob.tools.SSDKHandlerThread
    protected void onStop(Message message) {
        synchronized (this.f1642i) {
            for (Map.Entry<Integer, Service> entry : this.f1642i.entrySet()) {
                entry.getValue().onUnbind();
            }
            this.f1642i.clear();
        }
        synchronized (this.f1640g) {
            this.f1640g.clear();
        }
        try {
            new C0819e(this.f1635b, this.f1643j).m37828b();
        } catch (Throwable th) {
            C0831d.m37772a().m6187w(th);
            this.handler.getLooper().quit();
            this.f1634a = EnumC0824a.IDLE;
        }
    }

    @Override // com.mob.tools.SSDKHandlerThread
    public void startThread() {
        this.f1634a = EnumC0824a.INITIALIZING;
        C0831d.m37771a(this.f1635b, 60070, this.f1643j);
        EventRecorder.prepare(this.f1635b);
        m37793f();
        super.startThread();
    }
}
