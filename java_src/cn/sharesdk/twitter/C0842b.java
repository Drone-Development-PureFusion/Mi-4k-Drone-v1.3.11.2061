package cn.sharesdk.twitter;

import android.text.TextUtils;
import cn.sharesdk.framework.AbstractC0795b;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.authorize.AbstractC0787b;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.C0790e;
import cn.sharesdk.framework.p075a.C0783a;
import cn.sharesdk.framework.utils.C0825a;
import cn.sharesdk.framework.utils.C0831d;
import com.facebook.common.util.UriUtil;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: cn.sharesdk.twitter.b */
/* loaded from: classes.dex */
public class C0842b extends AbstractC0795b {

    /* renamed from: b */
    private static C0842b f1689b;

    /* renamed from: c */
    private C0825a f1690c = new C0825a();

    /* renamed from: d */
    private C0783a f1691d = C0783a.m38003a();

    private C0842b(Platform platform) {
        super(platform);
    }

    /* renamed from: a */
    public static C0842b m37751a(Platform platform) {
        if (f1689b == null) {
            f1689b = new C0842b(platform);
        }
        return f1689b;
    }

    /* renamed from: a */
    public String m37749a(String str) {
        try {
            ArrayList<KVPair<String>> arrayList = new ArrayList<>();
            arrayList.add(new KVPair<>("oauth_verifier", str));
            return this.f1691d.m37998a("https://api.twitter.com/oauth/access_token", arrayList, (KVPair<String>) null, this.f1690c.m37779a(this.f1690c.m37781a("https://api.twitter.com/oauth/access_token", arrayList)), "/oauth/access_token", c());
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public HashMap<String, Object> m37746a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        KVPair kVPair;
        String str3;
        ArrayList<KVPair<String>> m37779a;
        if (str2 == null) {
            return null;
        }
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                arrayList.add(new KVPair<>(entry.getKey(), String.valueOf(entry.getValue())));
            }
        }
        if (hashMap2 == null || hashMap2.size() <= 0) {
            kVPair = null;
        } else {
            KVPair kVPair2 = null;
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                kVPair2 = new KVPair(entry2.getKey(), entry2.getValue());
            }
            kVPair = kVPair2;
        }
        if ("GET".equals(str2.toUpperCase())) {
            str3 = this.f1691d.httpGet(str, arrayList, this.f1690c.m37779a(this.f1690c.m37778b(str, arrayList)), null);
        } else if ("POST".equals(str2.toUpperCase())) {
            if (hashMap2 == null || hashMap2.size() <= 0) {
                m37779a = this.f1690c.m37779a(this.f1690c.m37781a(str, arrayList));
            } else {
                m37779a = this.f1690c.m37779a(this.f1690c.m37781a(str, new ArrayList<>()));
                m37779a.remove(1);
            }
            str3 = this.f1691d.httpPost(str, arrayList, kVPair, m37779a, null);
        } else {
            str3 = null;
        }
        if (str3 != null && str3.length() > 0) {
            return new Hashon().fromJson(str3);
        }
        return null;
    }

    /* renamed from: a */
    public HashMap<String, Object> m37745a(String str, String[] strArr) {
        String str2;
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        ArrayList<KVPair<String>> m37779a = this.f1690c.m37779a(this.f1690c.m37781a("https://upload.twitter.com/1.1/media/upload.json", arrayList));
        m37779a.remove(1);
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < strArr.length && (arrayList2 == null || arrayList2.size() <= 3); i++) {
            try {
                str2 = strArr[i];
            } catch (Exception e) {
                C0831d.m37772a().m6200d(sb.toString(), new Object[0]);
            }
            if (str2.startsWith(UriUtil.HTTP_SCHEME)) {
                str2 = BitmapHelper.downloadBitmap(this.f1527a.getContext(), str2);
            } else {
                if (!TextUtils.isEmpty(str2)) {
                    if (!new File(str2).exists()) {
                    }
                }
            }
            String m37998a = this.f1691d.m37998a("https://upload.twitter.com/1.1/media/upload.json", arrayList, new KVPair<>("media", str2), m37779a, "/1.1/media/upload.json", c());
            sb.append(strArr[i]).append(": ").append(m37998a).append("\n");
            if (m37998a != null && m37998a.length() > 0) {
                arrayList2.add(new Hashon().fromJson(m37998a));
            }
        }
        sb.setLength(0);
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            if (((HashMap) arrayList2.get(i2)).containsKey("image")) {
                if (sb.length() > 0) {
                    sb.append(C0494h.f736x);
                }
                sb.append(String.valueOf(((HashMap) arrayList2.get(i2)).get("media_id")));
            }
        }
        return m37740d(str, sb.toString());
    }

    /* renamed from: a */
    public void m37750a(AuthorizeListener authorizeListener) {
        b(authorizeListener);
    }

    /* renamed from: a */
    public void m37748a(String str, String str2) {
        this.f1690c.m37784a(str, str2);
    }

    /* renamed from: a */
    public void m37747a(String str, String str2, String str3) {
        this.f1690c.m37783a(str, str2, str3);
    }

    /* renamed from: b */
    public HashMap<String, Object> m37744b(String str) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        long j = 0;
        try {
            j = ResHelper.parseLong(str);
        } catch (Throwable th) {
            str = null;
        }
        arrayList.add(new KVPair<>("user_id", str == null ? this.f1527a.getDb().getUserId() : String.valueOf(j)));
        String m37996a = this.f1691d.m37996a("https://api.twitter.com/1.1/users/show.json", arrayList, this.f1690c.m37779a(this.f1690c.m37778b("https://api.twitter.com/1.1/users/show.json", arrayList)), (NetworkHelper.NetworkTimeOut) null, "/1.1/users/show.json", c());
        if (m37996a == null || m37996a.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(m37996a);
    }

    /* renamed from: b */
    public HashMap<String, Object> m37743b(String str, String str2) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("nextCursor", str2));
        boolean z = true;
        try {
            ResHelper.parseLong(str);
        } catch (Throwable th) {
            z = false;
        }
        if (z) {
            arrayList.add(new KVPair<>("user_id", str));
        } else {
            arrayList.add(new KVPair<>("screen_name", str));
        }
        String m37996a = this.f1691d.m37996a("https://api.twitter.com/1.1/friends/list.json", arrayList, this.f1690c.m37779a(this.f1690c.m37778b("https://api.twitter.com/1.1/friends/list.json", arrayList)), (NetworkHelper.NetworkTimeOut) null, "/1.1/friends/list.json", c());
        if (m37996a == null || m37996a.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(m37996a);
    }

    /* renamed from: c */
    public HashMap<String, Object> m37742c(String str) {
        return m37740d(str, null);
    }

    /* renamed from: c */
    public HashMap<String, Object> m37741c(String str, String str2) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("nextCursor", str2));
        boolean z = true;
        try {
            ResHelper.parseLong(str);
        } catch (Throwable th) {
            z = false;
        }
        if (z) {
            arrayList.add(new KVPair<>("user_id", str));
        } else {
            arrayList.add(new KVPair<>("screen_name", str));
        }
        String m37996a = this.f1691d.m37996a("https://api.twitter.com/1.1/followers/list.json", arrayList, this.f1690c.m37779a(this.f1690c.m37778b("https://api.twitter.com/1.1/followers/list.json", arrayList)), (NetworkHelper.NetworkTimeOut) null, "/1.1/followers/list.json", c());
        if (m37996a == null || m37996a.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(m37996a);
    }

    /* renamed from: d */
    public HashMap<String, Object> m37740d(String str, String str2) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("status", str));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new KVPair<>("media_ids", str2));
        }
        String m37998a = this.f1691d.m37998a("https://api.twitter.com/1.1/statuses/update.json", arrayList, (KVPair<String>) null, this.f1690c.m37779a(this.f1690c.m37781a("https://api.twitter.com/1.1/statuses/update.json", arrayList)), "/1.1/statuses/update.json", c());
        if (m37998a == null || m37998a.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(m37998a);
    }

    /* renamed from: e */
    public HashMap<String, Object> m37739e(String str, String str2) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        ArrayList<KVPair<String>> m37779a = this.f1690c.m37779a(this.f1690c.m37781a("https://api.twitter.com/1.1/statuses/update_with_media.json", arrayList));
        m37779a.remove(1);
        arrayList.add(new KVPair<>("status", str));
        String m37998a = this.f1691d.m37998a("https://api.twitter.com/1.1/statuses/update_with_media.json", arrayList, new KVPair<>("media[]", str2), m37779a, "/1.1/statuses/update_with_media.json", c());
        if (m37998a == null || m37998a.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(m37998a);
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getAuthorizeUrl() {
        String m37998a;
        try {
            ArrayList<KVPair<String>> arrayList = new ArrayList<>();
            arrayList.add(new KVPair<>("oauth_callback", getRedirectUri()));
            m37748a((String) null, (String) null);
            m37998a = this.f1691d.m37998a("https://api.twitter.com/oauth/request_token", arrayList, (KVPair<String>) null, this.f1690c.m37779a(this.f1690c.m37781a("https://api.twitter.com/oauth/request_token", arrayList)), "/oauth/request_token", c());
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
        if (m37998a == null) {
            return null;
        }
        String[] split = m37998a.split("&");
        HashMap hashMap = new HashMap();
        for (String str : split) {
            if (str != null) {
                String[] split2 = str.split("=");
                if (split2.length >= 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        if (hashMap.containsKey("oauth_token")) {
            String str2 = (String) hashMap.get("oauth_token");
            m37748a(str2, (String) hashMap.get("oauth_token_secret"));
            ShareSDK.logApiEvent("/oauth/authorize", c());
            return "https://api.twitter.com/oauth/authorize?oauth_token=" + str2;
        }
        return null;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public AbstractC0787b getAuthorizeWebviewClient(C0790e c0790e) {
        return new C0839a(c0790e);
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getRedirectUri() {
        return this.f1690c.m37788a().f1665e;
    }
}
