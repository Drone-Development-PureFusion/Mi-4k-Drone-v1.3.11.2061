package cn.sharesdk.facebook;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.AbstractC0795b;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.authorize.AbstractC0787b;
import cn.sharesdk.framework.authorize.AbstractC0789d;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.C0788c;
import cn.sharesdk.framework.authorize.C0790e;
import cn.sharesdk.framework.authorize.SSOListener;
import cn.sharesdk.framework.p075a.C0783a;
import cn.sharesdk.framework.utils.C0831d;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.mob.tools.network.KVPair;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.tencent.connect.common.Constants;
import com.tencent.p263mm.sdk.message.RMsgInfoDB;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p005b.p006a.p007a.p008a.p026n.C0363a;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: cn.sharesdk.facebook.d */
/* loaded from: classes.dex */
public class C0772d extends AbstractC0795b {

    /* renamed from: b */
    private static final String[] f1450b = {"user_about_me", "user_birthday", "user_photos", "publish_actions", "user_friends"};

    /* renamed from: c */
    private static C0772d f1451c;

    /* renamed from: d */
    private String f1452d;

    /* renamed from: e */
    private String f1453e;

    /* renamed from: f */
    private long f1454f;

    /* renamed from: g */
    private String f1455g;

    /* renamed from: h */
    private C0783a f1456h = C0783a.m38003a();

    /* renamed from: i */
    private String[] f1457i;

    /* renamed from: j */
    private String f1458j;

    private C0772d(Platform platform) {
        super(platform);
    }

    /* renamed from: a */
    public static C0772d m38054a(Platform platform) {
        if (f1451c == null) {
            f1451c = new C0772d(platform);
        }
        return f1451c;
    }

    /* renamed from: a */
    public HashMap<String, Object> m38057a(int i, int i2, String str) {
        String str2 = "me";
        if (str != null) {
            str2 = str;
        }
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("access_token", this.f1453e));
        arrayList.add(new KVPair<>(FimiMediaMeta.IJKM_KEY_FORMAT, "json"));
        arrayList.add(new KVPair<>("limit", String.valueOf(i)));
        arrayList.add(new KVPair<>("offset", String.valueOf(i2)));
        arrayList.add(new KVPair<>("fields", "id,name,first_name,middle_name,last_name,gender,locale,languages,link,age_range,third_party_id,installed,timezone,updated_time,verified,birthday,cover,currency,devices,education,email,hometown,interested_in,location,political,payment_pricepoints,favorite_athletes,favorite_teams,picture,quotes,relationship_status,religion,security_settings,significant_other,video_upload_limits,website,work"));
        String str3 = "/friends";
        if (!TextUtils.isEmpty(str)) {
            str3 = "/taggable_friends";
        }
        String m37997a = this.f1456h.m37997a("https://graph.facebook.com/v2.5/" + str2 + str3, arrayList, "friends", c());
        if (m37997a == null || m37997a.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(m37997a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public HashMap<String, Object> m38049a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        KVPair kVPair;
        if (str2 == null) {
            return null;
        }
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                arrayList.add(new KVPair<>(entry.getKey(), String.valueOf(entry.getValue())));
            }
        }
        arrayList.add(new KVPair<>("access_token", this.f1453e));
        arrayList.add(new KVPair<>(FimiMediaMeta.IJKM_KEY_FORMAT, "json"));
        if (hashMap2 == null || hashMap2.size() <= 0) {
            kVPair = null;
        } else {
            KVPair kVPair2 = null;
            for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                kVPair2 = new KVPair(entry2.getKey(), entry2.getValue());
            }
            kVPair = kVPair2;
        }
        String httpGet = "GET".equals(str2.toUpperCase()) ? this.f1456h.httpGet(str, arrayList, null, null) : "POST".equals(str2.toUpperCase()) ? this.f1456h.httpPost(str, arrayList, kVPair, null, null) : null;
        if (httpGet != null && httpGet.length() > 0) {
            return new Hashon().fromJson(httpGet);
        }
        return null;
    }

    /* renamed from: a */
    public void m38055a(Platform.ShareParams shareParams, PlatformActionListener platformActionListener) {
        String imageUrl = shareParams.getImageUrl();
        String title = shareParams.getTitle();
        String text = shareParams.getText();
        String musicUrl = shareParams.getMusicUrl();
        String url = shareParams.getUrl();
        String titleUrl = shareParams.getTitleUrl();
        if (!TextUtils.isEmpty(titleUrl)) {
            titleUrl = this.f1527a.getShortLintk(titleUrl, false);
            shareParams.setTitleUrl(titleUrl);
        } else if (!TextUtils.isEmpty(url)) {
            titleUrl = this.f1527a.getShortLintk(url, false);
            shareParams.setUrl(titleUrl);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://www.facebook.com/dialog/feed?");
        sb.append("app_id=").append(this.f1455g);
        sb.append("&redirect_uri=fbconnect://success");
        sb.append("&link=").append(Data.urlEncode(titleUrl, "utf-8"));
        if (!TextUtils.isEmpty(imageUrl)) {
            sb.append("&picture=").append(Data.urlEncode(imageUrl, "utf-8"));
        }
        if (!TextUtils.isEmpty(title)) {
            sb.append("&caption=").append(Data.urlEncode(title, "utf-8"));
        }
        if (!TextUtils.isEmpty(text)) {
            sb.append("&description=").append(Data.urlEncode(text, "utf-8"));
        }
        if (!TextUtils.isEmpty(musicUrl)) {
            sb.append("&source=").append(Data.urlEncode(musicUrl, "utf-8"));
            if (!TextUtils.isEmpty(text)) {
                sb.append("&name=").append(Data.urlEncode(text, "utf-8"));
            }
        }
        C0775f c0775f = new C0775f();
        c0775f.m38036a(sb.toString());
        c0775f.m38037a(platformActionListener);
        c0775f.show(this.f1527a.getContext(), null);
    }

    /* renamed from: a */
    public void m38053a(PlatformActionListener platformActionListener, Platform.ShareParams shareParams) {
        Intent intent = new Intent();
        intent.putExtra("TITLE", shareParams.getTitle());
        C0774e c0774e = new C0774e();
        c0774e.m38041a(platformActionListener, this.f1527a, shareParams, this.f1455g, this.f1457i);
        c0774e.show(this.f1527a.getContext(), intent);
    }

    /* renamed from: a */
    public void m38052a(final AuthorizeListener authorizeListener, boolean z) {
        if (z) {
            b(authorizeListener);
        } else {
            a(new SSOListener() { // from class: cn.sharesdk.facebook.d.1
                @Override // cn.sharesdk.framework.authorize.SSOListener
                public void onCancel() {
                    authorizeListener.onCancel();
                }

                @Override // cn.sharesdk.framework.authorize.SSOListener
                public void onComplete(Bundle bundle) {
                    authorizeListener.onComplete(bundle);
                }

                @Override // cn.sharesdk.framework.authorize.SSOListener
                public void onFailed(Throwable th) {
                    C0831d.m37772a().m6199d(th);
                    C0772d.this.b(authorizeListener);
                }
            });
        }
    }

    /* renamed from: a */
    public void m38051a(String str) {
        this.f1455g = str;
    }

    /* renamed from: a */
    public void m38050a(String str, String str2) {
        this.f1453e = str;
        if (str2 == null || str2.equals("0")) {
            return;
        }
        try {
            this.f1454f = System.currentTimeMillis() + (ResHelper.parseInt(str2) * 1000);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
    }

    /* renamed from: a */
    public void m38048a(String[] strArr) {
        this.f1457i = strArr;
    }

    /* renamed from: a */
    public boolean m38058a() {
        return this.f1453e != null && (this.f1454f == 0 || System.currentTimeMillis() < this.f1454f);
    }

    /* renamed from: b */
    public HashMap<String, Object> m38046b(String str) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("access_token", this.f1453e));
        arrayList.add(new KVPair<>(FimiMediaMeta.IJKM_KEY_FORMAT, "json"));
        arrayList.add(new KVPair<>(RMsgInfoDB.TABLE, str));
        String m37994b = this.f1456h.m37994b("https://graph.facebook.com/v2.5/me/feed", arrayList, "/v2.5/me/feed", c());
        if (m37994b == null || m37994b.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(m37994b);
    }

    /* renamed from: b */
    public HashMap<String, Object> m38045b(String str, String str2) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("access_token", this.f1453e));
        arrayList.add(new KVPair<>(FimiMediaMeta.IJKM_KEY_FORMAT, "json"));
        arrayList.add(new KVPair<>("caption", str));
        String m38000a = this.f1456h.m38000a("https://graph.facebook.com/v2.5/me/photos", arrayList, new KVPair<>("source", str2), "/v2.5/me/photos", c());
        if (m38000a == null || m38000a.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(m38000a);
    }

    /* renamed from: b */
    public boolean m38047b() {
        Intent intent = new Intent();
        intent.setClassName("com.facebook.katana", "com.facebook.katana.ProxyAuth");
        intent.putExtra(Constants.PARAM_CLIENT_ID, this.f1455g);
        if (this.f1457i != null && this.f1457i.length > 0) {
            intent.putExtra("scope", TextUtils.join(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP, this.f1457i));
        }
        ResolveInfo resolveActivity = getPlatform().getContext().getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity == null) {
            return false;
        }
        try {
            Signature[] signatureArr = getPlatform().getContext().getPackageManager().getPackageInfo(resolveActivity.activityInfo.packageName, 64).signatures;
            for (Signature signature : signatureArr) {
                if ("30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2".equals(signature.toCharsString())) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: c */
    public HashMap<String, Object> m38044c(String str) {
        String str2 = "/me";
        if (str != null) {
            str2 = "/" + str;
        }
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("access_token", this.f1453e));
        arrayList.add(new KVPair<>(FimiMediaMeta.IJKM_KEY_FORMAT, "json"));
        arrayList.add(new KVPair<>("fields", "id,name,first_name,middle_name,last_name,gender,locale,languages,link,age_range,third_party_id,installed,timezone,updated_time,verified,birthday,cover,currency,devices,education,email,hometown,interested_in,location,political,payment_pricepoints,favorite_athletes,favorite_teams,picture,quotes,relationship_status,religion,security_settings,significant_other,video_upload_limits,website,work"));
        String m37997a = this.f1456h.m37997a("https://graph.facebook.com/v2.5" + str2, arrayList, "get_user_info", c());
        C0831d.m37772a().m6194i("facebook helper getUser", new Object[0]);
        if (m37997a == null || m37997a.length() <= 0) {
            return null;
        }
        return new Hashon().fromJson(m37997a);
    }

    /* renamed from: d */
    public void m38043d(String str) {
        this.f1458j = str;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getAuthorizeUrl() {
        Bundle bundle = new Bundle();
        bundle.putString("display", "touch");
        bundle.putString(AuthorizeActivityBase.KEY_REDIRECT_URI, this.f1458j);
        bundle.putString("type", "user_agent");
        String[] strArr = this.f1457i == null ? f1450b : this.f1457i;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str : strArr) {
            if (i > 0) {
                sb.append(C0494h.f736x);
            }
            sb.append(str);
            i++;
        }
        bundle.putString("scope", sb.toString());
        bundle.putString(Constants.PARAM_CLIENT_ID, this.f1455g);
        bundle.putString("response_type", XiaomiOAuthConstants.EXTRA_CODE_2);
        this.f1452d = "https://www.facebook.com/dialog/oauth" + C0363a.f360a + ResHelper.encodeUrl(bundle);
        ShareSDK.logApiEvent("/dialog/oauth", c());
        return this.f1452d;
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public AbstractC0787b getAuthorizeWebviewClient(C0790e c0790e) {
        return new C0770c(c0790e);
    }

    @Override // cn.sharesdk.framework.authorize.AuthorizeHelper
    public String getRedirectUri() {
        return this.f1458j;
    }

    @Override // cn.sharesdk.framework.AbstractC0795b, cn.sharesdk.framework.authorize.AuthorizeHelper
    public AbstractC0789d getSSOProcessor(C0788c c0788c) {
        C0769b c0769b = new C0769b(c0788c);
        c0769b.a(32525);
        c0769b.m38065a(this.f1455g, this.f1457i == null ? f1450b : this.f1457i);
        return c0769b;
    }
}
