package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.p075a.C0783a;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.network.KVPair;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.tencent.open.GameAppOperation;
import com.tencent.p263mm.sdk.contact.RContact;
import com.tencent.p263mm.sdk.plugin.MMPluginProviderConstants;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: cn.sharesdk.wechat.utils.g */
/* loaded from: classes.dex */
public class C0853g {

    /* renamed from: a */
    private String f1724a;

    /* renamed from: b */
    private String f1725b;

    /* renamed from: c */
    private C0783a f1726c = C0783a.m38003a();

    /* renamed from: d */
    private Platform f1727d;

    /* renamed from: e */
    private int f1728e;

    public C0853g(Platform platform, int i) {
        this.f1727d = platform;
        this.f1728e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m37686a(String str) {
        C0831d.m37772a().m6200d("wechat getAuthorizeToken ==>>" + str, new Object[0]);
        HashMap fromJson = new Hashon().fromJson(str);
        String valueOf = String.valueOf(fromJson.get("access_token"));
        String valueOf2 = String.valueOf(fromJson.get("refresh_token"));
        String valueOf3 = String.valueOf(fromJson.get("expires_in"));
        this.f1727d.getDb().put("openid", String.valueOf(fromJson.get("openid")));
        this.f1727d.getDb().putExpiresIn(Long.valueOf(valueOf3).longValue());
        this.f1727d.getDb().putToken(valueOf);
        this.f1727d.getDb().put("refresh_token", valueOf2);
    }

    /* renamed from: a */
    public void m37690a(Bundle bundle, AuthorizeListener authorizeListener) {
        String string = bundle.getString("_wxapi_sendauth_resp_url");
        if (TextUtils.isEmpty(string)) {
            if (authorizeListener == null) {
                return;
            }
            authorizeListener.onError(null);
            return;
        }
        int indexOf = string.indexOf("://oauth?");
        if (indexOf >= 0) {
            string = string.substring(indexOf + 1);
        }
        try {
            m37685a(ResHelper.urlToBundle(string).getString(XiaomiOAuthConstants.EXTRA_CODE_2), authorizeListener);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            if (authorizeListener == null) {
                return;
            }
            authorizeListener.onError(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cn.sharesdk.wechat.utils.g$2] */
    /* renamed from: a */
    public void m37689a(final PlatformActionListener platformActionListener) {
        new Thread() { // from class: cn.sharesdk.wechat.utils.g.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    ArrayList<KVPair<String>> arrayList = new ArrayList<>();
                    arrayList.add(new KVPair<>("access_token", C0853g.this.f1727d.getDb().getToken()));
                    arrayList.add(new KVPair<>("openid", C0853g.this.f1727d.getDb().get("openid")));
                    String m37997a = C0853g.this.f1726c.m37997a("https://api.weixin.qq.com/sns/userinfo", arrayList, "/sns/userinfo", C0853g.this.f1728e);
                    if (TextUtils.isEmpty(m37997a)) {
                        if (platformActionListener == null) {
                            return;
                        }
                        platformActionListener.onError(C0853g.this.f1727d, 8, new Throwable());
                        return;
                    }
                    C0831d.m37772a().m6200d("getUserInfo ==>>" + m37997a, new Object[0]);
                    HashMap<String, Object> fromJson = new Hashon().fromJson(m37997a);
                    if (fromJson.containsKey("errcode") && ((Integer) fromJson.get("errcode")).intValue() != 0) {
                        if (platformActionListener == null) {
                            return;
                        }
                        platformActionListener.onError(C0853g.this.f1727d, 8, new Throwable(new Hashon().fromHashMap(fromJson)));
                        return;
                    }
                    String valueOf = String.valueOf(fromJson.get("openid"));
                    String valueOf2 = String.valueOf(fromJson.get(RContact.COL_NICKNAME));
                    int parseInt = ResHelper.parseInt(String.valueOf(fromJson.get("sex")));
                    String valueOf3 = String.valueOf(fromJson.get("province"));
                    String valueOf4 = String.valueOf(fromJson.get("city"));
                    String valueOf5 = String.valueOf(fromJson.get("country"));
                    String valueOf6 = String.valueOf(fromJson.get("headimgurl"));
                    String valueOf7 = String.valueOf(fromJson.get(GameAppOperation.GAME_UNION_ID));
                    C0853g.this.f1727d.getDb().put(RContact.COL_NICKNAME, valueOf2);
                    if (parseInt == 1) {
                        C0853g.this.f1727d.getDb().put("gender", "0");
                    } else if (parseInt == 2) {
                        C0853g.this.f1727d.getDb().put("gender", "1");
                    } else {
                        C0853g.this.f1727d.getDb().put("gender", "2");
                    }
                    C0853g.this.f1727d.getDb().putUserId(valueOf);
                    C0853g.this.f1727d.getDb().put("icon", valueOf6);
                    C0853g.this.f1727d.getDb().put("province", valueOf3);
                    C0853g.this.f1727d.getDb().put("city", valueOf4);
                    C0853g.this.f1727d.getDb().put("country", valueOf5);
                    C0853g.this.f1727d.getDb().put("openid", valueOf);
                    C0853g.this.f1727d.getDb().put(GameAppOperation.GAME_UNION_ID, valueOf7);
                    platformActionListener.onComplete(C0853g.this.f1727d, 8, fromJson);
                } catch (Throwable th) {
                    C0831d.m37772a().m6199d(th);
                }
            }
        }.start();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cn.sharesdk.wechat.utils.g$1] */
    /* renamed from: a */
    public void m37685a(final String str, final AuthorizeListener authorizeListener) {
        C0831d.m37772a().m6200d("getAuthorizeToken ==>> " + str, new Object[0]);
        new Thread() { // from class: cn.sharesdk.wechat.utils.g.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    ArrayList<KVPair<String>> arrayList = new ArrayList<>();
                    arrayList.add(new KVPair<>("appid", C0853g.this.f1724a));
                    arrayList.add(new KVPair<>(MMPluginProviderConstants.OAuth.SECRET, C0853g.this.f1725b));
                    arrayList.add(new KVPair<>(XiaomiOAuthConstants.EXTRA_CODE_2, str));
                    arrayList.add(new KVPair<>("grant_type", "authorization_code"));
                    String m37997a = C0853g.this.f1726c.m37997a("https://api.weixin.qq.com/sns/oauth2/access_token", arrayList, "/sns/oauth2/access_token", C0853g.this.f1728e);
                    if (TextUtils.isEmpty(m37997a)) {
                        authorizeListener.onError(new Throwable("Authorize token is empty"));
                    } else if (!m37997a.contains("errcode")) {
                        C0853g.this.m37686a(m37997a);
                        authorizeListener.onComplete(null);
                    } else if (authorizeListener != null) {
                        authorizeListener.onError(new Throwable(m37997a));
                    }
                } catch (Throwable th) {
                    C0831d.m37772a().m6199d(th);
                }
            }
        }.start();
    }

    /* renamed from: a */
    public void m37684a(String str, String str2) {
        this.f1724a = str;
        this.f1725b = str2;
    }

    /* renamed from: a */
    public boolean m37691a() {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("appid", this.f1724a));
        arrayList.add(new KVPair<>("refresh_token", this.f1727d.getDb().get("refresh_token")));
        arrayList.add(new KVPair<>("grant_type", "refresh_token"));
        try {
            String m37997a = this.f1726c.m37997a("https://api.weixin.qq.com/sns/oauth2/refresh_token", arrayList, "/sns/oauth2/refresh_token", this.f1728e);
            if (TextUtils.isEmpty(m37997a) || m37997a.contains("errcode")) {
                return false;
            }
            m37686a(m37997a);
            return true;
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return false;
        }
    }
}
