package cn.sharesdk.framework;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import java.lang.reflect.Field;
import java.util.HashMap;
/* renamed from: cn.sharesdk.framework.c */
/* loaded from: classes.dex */
public class C0813c {

    /* renamed from: a */
    private Platform f1613a;

    /* renamed from: b */
    private Context f1614b;

    /* renamed from: c */
    private PlatformDb f1615c;

    /* renamed from: e */
    private int f1617e;

    /* renamed from: f */
    private int f1618f;

    /* renamed from: g */
    private boolean f1619g;

    /* renamed from: i */
    private boolean f1621i;

    /* renamed from: h */
    private boolean f1620h = true;

    /* renamed from: d */
    private C0780a f1616d = new C0780a();

    public C0813c(Platform platform, Context context) {
        this.f1613a = platform;
        this.f1614b = context;
        String name = platform.getName();
        this.f1615c = new PlatformDb(context, name, platform.getVersion());
        m37862a(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public boolean m37842j() {
        boolean z = false;
        if (ShareSDK.m38028a()) {
            String m37867a = m37867a(this.f1613a.getPlatformId(), "covert_url", (String) null);
            if (m37867a != null) {
                m37867a.trim();
            }
            if (!"false".equals(m37867a)) {
                z = true;
            }
            this.f1620h = z;
            this.f1613a.setNetworkDevinfo();
            return true;
        }
        try {
            HashMap hashMap = new HashMap();
            if (!ShareSDK.m38021a(hashMap)) {
                return false;
            }
            if (!ShareSDK.m38018b(hashMap)) {
                C0831d.m37772a().m6194i("Failed to parse network dev-info: " + new Hashon().fromHashMap(hashMap), new Object[0]);
                return false;
            }
            String m37867a2 = m37867a(this.f1613a.getPlatformId(), "covert_url", (String) null);
            if (m37867a2 != null) {
                m37867a2.trim();
            }
            this.f1620h = !"false".equals(m37867a2);
            this.f1613a.setNetworkDevinfo();
            return true;
        } catch (Throwable th) {
            C0831d.m37772a().m6187w(th);
            return false;
        }
    }

    /* renamed from: k */
    private String m37841k() {
        StringBuilder sb = new StringBuilder();
        try {
            if ("TencentWeibo".equals(this.f1613a.getName())) {
                C0831d.m37772a().m6194i("user id %s ==>>", m37845g().getUserName());
                sb.append(Data.urlEncode(m37845g().getUserName(), "utf-8"));
            } else {
                sb.append(Data.urlEncode(m37845g().getUserId(), "utf-8"));
            }
            sb.append("|").append(Data.urlEncode(m37845g().get("secretType"), "utf-8"));
            sb.append("|").append(Data.urlEncode(m37845g().get("gender"), "utf-8"));
            sb.append("|").append(Data.urlEncode(m37845g().get("birthday"), "utf-8"));
            sb.append("|").append(Data.urlEncode(m37845g().get("educationJSONArrayStr"), "utf-8"));
            sb.append("|").append(Data.urlEncode(m37845g().get("workJSONArrayStr"), "utf-8"));
        } catch (Throwable th) {
            C0831d.m37772a().m6187w(th);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int m37870a() {
        return this.f1617e;
    }

    /* renamed from: a */
    public String m37867a(int i, String str, String str2) {
        String m38026a = ShareSDK.m38026a(i, str);
        return (TextUtils.isEmpty(m38026a) || "null".equals(m38026a)) ? this.f1613a.getDevinfo(this.f1613a.getName(), str2) : m38026a;
    }

    /* renamed from: a */
    public String m37866a(Bitmap bitmap) {
        return ShareSDK.m38025a(bitmap);
    }

    /* renamed from: a */
    public String m37859a(String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f1620h) {
            C0831d.m37772a().m6194i("getShortLintk use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return str;
        } else if (TextUtils.isEmpty(str)) {
            C0831d.m37772a().m6194i("getShortLintk use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return str;
        } else {
            String m38022a = ShareSDK.m38022a(str, z, this.f1613a.getPlatformId(), m37841k());
            C0831d.m37772a().m6194i("getShortLintk use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return m38022a;
        }
    }

    /* renamed from: a */
    public void m37869a(int i, int i2, String str) {
        m37851c(2, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str});
    }

    /* renamed from: a */
    public void m37868a(int i, Object obj) {
        this.f1616d.m38014a(this.f1613a, i, obj);
    }

    /* renamed from: a */
    public void m37865a(Platform.ShareParams shareParams) {
        if (shareParams != null) {
            m37851c(9, shareParams);
        } else if (this.f1616d == null) {
        } else {
            this.f1616d.onError(this.f1613a, 9, new NullPointerException());
        }
    }

    /* renamed from: a */
    public void m37864a(PlatformActionListener platformActionListener) {
        this.f1616d.m38011a(platformActionListener);
    }

    /* renamed from: a */
    public void m37862a(String str) {
        try {
            this.f1617e = ResHelper.parseInt(String.valueOf(ShareSDK.m38019b(str, "Id")).trim());
        } catch (Throwable th) {
            if (!(this.f1613a instanceof CustomPlatform)) {
                C0831d.m37772a().m6200d(this.f1613a.getName() + " failed to parse Id, this will cause method getId() always returens 0", new Object[0]);
            }
        }
        try {
            this.f1618f = ResHelper.parseInt(String.valueOf(ShareSDK.m38019b(str, "SortId")).trim());
        } catch (Throwable th2) {
            if (!(this.f1613a instanceof CustomPlatform)) {
                C0831d.m37772a().m6200d(this.f1613a.getName() + " failed to parse SortId, this won't cause any problem, don't worry", new Object[0]);
            }
        }
        String m38019b = ShareSDK.m38019b(str, "Enable");
        if (m38019b == null) {
            this.f1621i = true;
            if (!(this.f1613a instanceof CustomPlatform)) {
                C0831d.m37772a().m6200d(this.f1613a.getName() + " failed to parse Enable, this will cause platform always be enable", new Object[0]);
            }
        } else {
            this.f1621i = "true".equals(m38019b.trim());
        }
        this.f1613a.initDevInfo(str);
    }

    /* renamed from: a */
    public void m37861a(String str, int i, int i2) {
        m37851c(7, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str});
    }

    /* renamed from: a */
    public void m37860a(String str, String str2, short s, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        m37851c(655360 | s, new Object[]{str, str2, hashMap, hashMap2});
    }

    /* renamed from: a */
    public void m37858a(boolean z) {
        this.f1619g = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cn.sharesdk.framework.c$2] */
    /* renamed from: a */
    public void m37857a(final String[] strArr) {
        new Thread() { // from class: cn.sharesdk.framework.c.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    C0813c.this.m37842j();
                    C0813c.this.f1613a.doAuthorize(strArr);
                } catch (Throwable th) {
                    C0831d.m37772a().m6187w(th);
                }
            }
        }.start();
    }

    /* renamed from: b */
    public int m37856b() {
        return this.f1618f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m37855b(int i, Object obj) {
        Field[] fields;
        Object obj2;
        switch (i) {
            case 1:
                if (this.f1616d == null) {
                    return;
                }
                this.f1616d.onComplete(this.f1613a, 1, null);
                return;
            case 2:
                Object[] objArr = (Object[]) obj;
                this.f1613a.getFriendList(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), (String) objArr[2]);
                return;
            case 3:
            case 4:
            case 5:
            default:
                Object[] objArr2 = (Object[]) obj;
                this.f1613a.doCustomerProtocol(String.valueOf(objArr2[0]), String.valueOf(objArr2[1]), i, (HashMap) objArr2[2], (HashMap) objArr2[3]);
                return;
            case 6:
                this.f1613a.follow((String) obj);
                return;
            case 7:
                Object[] objArr3 = (Object[]) obj;
                this.f1613a.timeline(((Integer) objArr3[0]).intValue(), ((Integer) objArr3[1]).intValue(), (String) objArr3[2]);
                return;
            case 8:
                this.f1613a.userInfor(obj == null ? null : (String) obj);
                return;
            case 9:
                Platform.ShareParams shareParams = (Platform.ShareParams) obj;
                HashMap<String, Object> map = shareParams.toMap();
                for (Field field : shareParams.getClass().getFields()) {
                    if (map.get(field.getName()) == null) {
                        field.setAccessible(true);
                        try {
                            obj2 = field.get(shareParams);
                        } catch (Throwable th) {
                            C0831d.m37772a().m6187w(th);
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            map.put(field.getName(), obj2);
                        }
                    }
                }
                if (this.f1616d instanceof C0780a) {
                    this.f1616d.m38012a(this.f1613a, shareParams);
                }
                this.f1613a.doShare(shareParams);
                return;
        }
    }

    /* renamed from: b */
    public void m37853b(String str) {
        m37851c(6, str);
    }

    /* renamed from: c */
    public PlatformActionListener m37852c() {
        return this.f1616d.m38017a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cn.sharesdk.framework.c$1] */
    /* renamed from: c */
    protected void m37851c(final int i, final Object obj) {
        new Thread() { // from class: cn.sharesdk.framework.c.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    C0813c.this.m37842j();
                    if (!C0813c.this.f1613a.checkAuthorize(i, obj)) {
                        return;
                    }
                    C0813c.this.m37855b(i, obj);
                } catch (Throwable th) {
                    C0831d.m37772a().m6187w(th);
                }
            }
        }.start();
    }

    /* renamed from: c */
    public void m37850c(String str) {
        m37851c(8, str);
    }

    /* renamed from: d */
    public String m37848d(String str) {
        return ShareSDK.m38024a(str);
    }

    /* renamed from: d */
    public boolean m37849d() {
        return this.f1615c.isValid();
    }

    /* renamed from: e */
    public boolean m37847e() {
        return this.f1619g;
    }

    /* renamed from: f */
    public boolean m37846f() {
        return this.f1621i;
    }

    /* renamed from: g */
    public PlatformDb m37845g() {
        return this.f1615c;
    }

    /* renamed from: h */
    public void m37844h() {
        this.f1615c.removeAccount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public PlatformActionListener m37843i() {
        return this.f1616d;
    }
}
