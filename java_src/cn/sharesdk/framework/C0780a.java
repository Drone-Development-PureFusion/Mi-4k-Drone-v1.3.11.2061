package cn.sharesdk.framework;

import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.p076b.C0812d;
import cn.sharesdk.framework.p076b.p078b.C0804b;
import cn.sharesdk.framework.p076b.p078b.C0808f;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import com.tencent.p263mm.sdk.contact.RContact;
import com.tencent.p263mm.sdk.plugin.MMPluginProviderConstants;
import java.util.HashMap;
/* renamed from: cn.sharesdk.framework.a */
/* loaded from: classes.dex */
public class C0780a implements PlatformActionListener {

    /* renamed from: a */
    private PlatformActionListener f1491a;

    /* renamed from: b */
    private HashMap<Platform, Platform.ShareParams> f1492b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m38015a(Platform platform) {
        try {
            return m38010a(platform.getDb(), new String[]{RContact.COL_NICKNAME, "icon", "gender", "snsUserUrl", "resume", "secretType", MMPluginProviderConstants.OAuth.SECRET, "birthday", "followerCount", "favouriteCount", "shareCount", "snsregat", "snsUserLevel", "educationJSONArrayStr", "workJSONArrayStr"});
        } catch (Throwable th) {
            C0831d.m37772a().m6187w(th);
            return null;
        }
    }

    /* renamed from: a */
    private String m38010a(PlatformDb platformDb, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        for (String str : strArr) {
            if (i > 0) {
                sb2.append('|');
                sb.append('|');
            }
            i++;
            String str2 = platformDb.get(str);
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
                sb2.append(Data.urlEncode(str2, "utf-8"));
            }
        }
        C0831d.m37772a().m6194i("======UserData: " + sb.toString(), new Object[0]);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m38016a(int i, Platform platform) {
    }

    /* renamed from: a */
    private void m38013a(Platform platform, final int i, final HashMap<String, Object> hashMap) {
        final PlatformActionListener platformActionListener = this.f1491a;
        this.f1491a = new PlatformActionListener() { // from class: cn.sharesdk.framework.a.1
            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onCancel(Platform platform2, int i2) {
                C0780a.this.f1491a = platformActionListener;
                if (C0780a.this.f1491a != null) {
                    C0780a.this.f1491a.onComplete(platform2, i, hashMap);
                    C0780a.this.f1491a = null;
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onComplete(Platform platform2, int i2, HashMap<String, Object> hashMap2) {
                C0780a.this.f1491a = platformActionListener;
                if (C0780a.this.f1491a != null) {
                    C0780a.this.f1491a.onComplete(platform2, i, hashMap);
                    if (!"Wechat".equals(platform2.getName())) {
                        C0780a.this.f1491a = null;
                    }
                }
                C0804b c0804b = new C0804b();
                c0804b.f1552a = platform2.getPlatformId();
                c0804b.f1553b = "TencentWeibo".equals(platform2.getName()) ? platform2.getDb().get("name") : platform2.getDb().getUserId();
                c0804b.f1554c = new Hashon().fromHashMap(hashMap2);
                c0804b.f1555d = C0780a.this.m38015a(platform2);
                C0812d m37877a = C0812d.m37877a(platform2.getContext(), c0804b.f1558g);
                if (m37877a != null) {
                    m37877a.m37875a(c0804b);
                }
                C0780a.this.m38016a(1, platform2);
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onError(Platform platform2, int i2, Throwable th) {
                C0831d.m37772a().m6187w(th);
                C0780a.this.f1491a = platformActionListener;
                if (C0780a.this.f1491a != null) {
                    C0780a.this.f1491a.onComplete(platform2, i, hashMap);
                    C0780a.this.f1491a = null;
                }
            }
        };
        platform.showUser(null);
    }

    /* renamed from: b */
    private String m38005b(Platform platform) {
        Platform platform2;
        PlatformDb db = platform.getDb();
        if (("WechatMoments".equals(platform.getName()) || "WechatFavorite".equals(platform.getName())) && TextUtils.isEmpty(db.getUserGender()) && (platform2 = ShareSDK.getPlatform("Wechat")) != null) {
            db = platform2.getDb();
        }
        try {
            return m38010a(db, new String[]{"gender", "birthday", "secretType", "educationJSONArrayStr", "workJSONArrayStr"});
        } catch (Throwable th) {
            C0831d.m37772a().m6187w(th);
            return null;
        }
    }

    /* renamed from: b */
    private void m38004b(Platform platform, int i, HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2;
        Platform.ShareParams remove = hashMap != null ? (Platform.ShareParams) hashMap.remove("ShareParams") : this.f1492b.remove(platform);
        try {
            hashMap2 = (HashMap) hashMap.clone();
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            hashMap2 = hashMap;
        }
        if (remove != null) {
            C0808f c0808f = new C0808f();
            c0808f.f1580o = remove.getCustomFlag();
            String userId = platform.getDb().getUserId();
            if (("WechatMoments".equals(platform.getName()) || "WechatFavorite".equals(platform.getName())) && TextUtils.isEmpty(userId)) {
                Platform platform2 = ShareSDK.getPlatform("Wechat");
                if (platform2 != null) {
                    userId = platform2.getDb().getUserId();
                }
            } else if ("TencentWeibo".equals(platform.getName())) {
                userId = platform.getDb().get("name");
            }
            c0808f.f1576b = userId;
            c0808f.f1575a = platform.getPlatformId();
            C0808f.C0809a filterShareContent = platform.filterShareContent(remove, hashMap2);
            if (filterShareContent != null) {
                c0808f.f1577c = filterShareContent.f1581a;
                c0808f.f1578d = filterShareContent;
            }
            c0808f.f1579n = m38005b(platform);
            C0812d m37877a = C0812d.m37877a(platform.getContext(), c0808f.f1558g);
            if (m37877a != null) {
                m37877a.m37875a(c0808f);
            }
        }
        if (this.f1491a != null) {
            try {
                this.f1491a.onComplete(platform, i, hashMap);
                this.f1491a = null;
            } catch (Throwable th2) {
                C0831d.m37772a().m6199d(th2);
            }
        }
        m38016a(9, platform);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public PlatformActionListener m38017a() {
        return this.f1491a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m38014a(Platform platform, final int i, final Object obj) {
        final PlatformActionListener platformActionListener = this.f1491a;
        this.f1491a = new PlatformActionListener() { // from class: cn.sharesdk.framework.a.2
            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onCancel(Platform platform2, int i2) {
                C0780a.this.f1491a = platformActionListener;
                if (C0780a.this.f1491a != null) {
                    C0780a.this.f1491a.onCancel(platform2, i);
                    C0780a.this.f1491a = null;
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onComplete(Platform platform2, int i2, HashMap<String, Object> hashMap) {
                C0780a.this.f1491a = platformActionListener;
                platform2.afterRegister(i, obj);
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onError(Platform platform2, int i2, Throwable th) {
                C0780a.this.f1491a = platformActionListener;
                if (C0780a.this.f1491a != null) {
                    C0780a.this.f1491a.onError(platform2, i2, th);
                    C0780a.this.f1491a = null;
                }
            }
        };
        platform.doAuthorize(null);
    }

    /* renamed from: a */
    public void m38012a(Platform platform, Platform.ShareParams shareParams) {
        this.f1492b.put(platform, shareParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m38011a(PlatformActionListener platformActionListener) {
        this.f1491a = platformActionListener;
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i) {
        if (this.f1491a != null) {
            this.f1491a.onCancel(platform, i);
            this.f1491a = null;
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        if (platform instanceof CustomPlatform) {
            if (this.f1491a == null) {
                return;
            }
            this.f1491a.onComplete(platform, i, hashMap);
            this.f1491a = null;
            return;
        }
        switch (i) {
            case 1:
                m38013a(platform, i, hashMap);
                return;
            case 9:
                m38004b(platform, i, hashMap);
                return;
            default:
                if (this.f1491a == null) {
                    return;
                }
                this.f1491a.onComplete(platform, i, hashMap);
                if ("Wechat".equals(platform.getName())) {
                    return;
                }
                this.f1491a = null;
                return;
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i, Throwable th) {
        if (this.f1491a != null) {
            this.f1491a.onError(platform, i, th);
            this.f1491a = null;
        }
    }
}
