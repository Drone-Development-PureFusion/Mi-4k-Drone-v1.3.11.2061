package cn.sharesdk.facebook;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.p076b.p078b.C0808f;
import cn.sharesdk.framework.utils.C0831d;
import com.facebook.common.util.UriUtil;
import com.google.firebase.p251a.C9654a;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.tencent.open.SocialConstants;
import com.tencent.p263mm.sdk.contact.RContact;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public class Facebook extends Platform {
    public static final String NAME = Facebook.class.getSimpleName();

    /* renamed from: a */
    private String f1435a;

    /* renamed from: b */
    private String f1436b;

    /* renamed from: c */
    private boolean f1437c;

    /* renamed from: d */
    private Context f1438d;

    /* loaded from: classes.dex */
    public static class ShareParams extends Platform.ShareParams {
    }

    public Facebook(Context context) {
        super(context);
        this.f1438d = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i, Object obj) {
        if (i == 9 && this.f1437c && isClientValid()) {
            Platform.ShareParams shareParams = (Platform.ShareParams) obj;
            if (!TextUtils.isEmpty(shareParams.getImagePath()) || !TextUtils.isEmpty(shareParams.getImageUrl()) || !TextUtils.isEmpty(shareParams.getUrl()) || !TextUtils.isEmpty(shareParams.getFilePath())) {
                return true;
            }
        }
        if (isAuthValid()) {
            C0772d m38054a = C0772d.m38054a(this);
            m38054a.m38051a(this.f1435a);
            String token = this.f1477db.getToken();
            String valueOf = String.valueOf(this.f1477db.getExpiresIn());
            if (token != null && valueOf != null) {
                m38054a.m38050a(token, valueOf);
                if (m38054a.m38058a()) {
                    return true;
                }
            }
        } else if ((obj instanceof Platform.ShareParams) && ((Platform.ShareParams) obj).getShareType() == 4) {
            return true;
        }
        innerAuthorize(i, obj);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        final C0772d m38054a = C0772d.m38054a(this);
        m38054a.m38051a(this.f1435a);
        m38054a.m38043d(this.f1436b);
        m38054a.m38048a(strArr);
        m38054a.m38052a(new AuthorizeListener() { // from class: cn.sharesdk.facebook.Facebook.1
            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
                if (Facebook.this.listener != null) {
                    Facebook.this.listener.onCancel(Facebook.this, 1);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
                String string = bundle.getString("oauth_token");
                int i = bundle.getInt("oauth_token_expires");
                if (i == 0) {
                    try {
                        i = ResHelper.parseInt(String.valueOf(bundle.get("expires_in")));
                    } catch (Throwable th) {
                        C0831d.m37772a().m6199d(th);
                        i = 0;
                    }
                }
                if (TextUtils.isEmpty(string)) {
                    string = bundle.getString("access_token");
                }
                Facebook.this.f1477db.putToken(string);
                Facebook.this.f1477db.putExpiresIn(i);
                m38054a.m38050a(string, String.valueOf(i));
                Facebook.this.afterRegister(1, null);
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th) {
                if (Facebook.this.listener != null) {
                    Facebook.this.listener.onError(Facebook.this, 1, th);
                }
            }
        }, isSSODisable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        try {
            HashMap<String, Object> m38049a = C0772d.m38054a(this).m38049a(str, str2, hashMap, hashMap2);
            if (m38049a == null || m38049a.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, i, new Throwable("response is null"));
                }
            } else if (m38049a.containsKey("error_code") || m38049a.containsKey("error")) {
                if (this.listener != null) {
                    this.listener.onError(this, i, new Throwable(new Hashon().fromHashMap(m38049a)));
                }
            } else if (this.listener != null) {
                this.listener.onComplete(this, i, m38049a);
            }
        } catch (Throwable th) {
            if (this.listener == null) {
                return;
            }
            this.listener.onError(this, i, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doShare(final Platform.ShareParams shareParams) {
        HashMap<String, Object> m38046b;
        C0772d m38054a = C0772d.m38054a(this);
        m38054a.m38051a(this.f1435a);
        try {
            String shortLintk = getShortLintk(shareParams.getText(), false);
            String imagePath = shareParams.getImagePath();
            String imageUrl = shareParams.getImageUrl();
            String titleUrl = shareParams.getTitleUrl();
            String url = shareParams.getUrl();
            if (this.f1437c && m38054a.m38047b()) {
                if (shareParams.getShareType() != 2 || shareParams.getShareType() != 4 || shareParams.getShareType() != 6) {
                    if (!TextUtils.isEmpty(shareParams.getUrl())) {
                        shareParams.setShareType(4);
                    } else if (!TextUtils.isEmpty(shareParams.getImagePath()) || !TextUtils.isEmpty(shareParams.getImageUrl())) {
                        shareParams.setShareType(2);
                    } else if (!TextUtils.isEmpty(shareParams.getFilePath())) {
                        shareParams.setShareType(6);
                    }
                }
                if (shareParams.getShareType() == 2 || shareParams.getShareType() == 4 || shareParams.getShareType() == 6) {
                    if (shareParams.getShareType() == 2 && TextUtils.isEmpty(shareParams.getImagePath()) && !TextUtils.isEmpty(shareParams.getImageUrl())) {
                        shareParams.setImagePath(BitmapHelper.downloadBitmap(this.f1438d, imageUrl));
                    }
                    m38054a.m38053a(this.listener, shareParams);
                    return;
                }
            }
            if (shareParams.getShareType() == 4 && (!TextUtils.isEmpty(titleUrl) || !TextUtils.isEmpty(url))) {
                if (TextUtils.isEmpty(imageUrl) && !TextUtils.isEmpty(imagePath) && new File(imagePath).exists()) {
                    shareParams.setImageUrl(uploadImageToFileServer(imagePath));
                }
                m38054a.m38055a(shareParams, new PlatformActionListener() { // from class: cn.sharesdk.facebook.Facebook.2
                    @Override // cn.sharesdk.framework.PlatformActionListener
                    public void onCancel(Platform platform, int i) {
                        if (Facebook.this.listener != null) {
                            Facebook.this.listener.onCancel(Facebook.this, 9);
                        }
                    }

                    @Override // cn.sharesdk.framework.PlatformActionListener
                    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                        if (Facebook.this.listener != null) {
                            hashMap.put("ShareParams", shareParams);
                            Facebook.this.listener.onComplete(Facebook.this, 9, hashMap);
                        }
                    }

                    @Override // cn.sharesdk.framework.PlatformActionListener
                    public void onError(Platform platform, int i, Throwable th) {
                        if (Facebook.this.listener != null) {
                            Facebook.this.listener.onError(Facebook.this, 9, th);
                        }
                    }
                });
                return;
            }
            if (!TextUtils.isEmpty(imagePath) && new File(imagePath).exists()) {
                m38046b = m38054a.m38045b(shortLintk, imagePath);
            } else if (!TextUtils.isEmpty(imageUrl)) {
                File file = new File(BitmapHelper.downloadBitmap(this.f1438d, imageUrl));
                m38046b = file.exists() ? m38054a.m38045b(shortLintk, file.getAbsolutePath()) : m38054a.m38046b(shortLintk);
            } else {
                m38046b = m38054a.m38046b(shortLintk);
            }
            if (m38046b == null || m38046b.size() <= 0) {
                if (this.listener == null) {
                    return;
                }
                this.listener.onError(this, 9, new Throwable("response is null"));
            } else if (m38046b.containsKey("error_code") || m38046b.containsKey("error")) {
                if (this.listener == null) {
                    return;
                }
                this.listener.onError(this, 9, new Throwable(new Hashon().fromHashMap(m38046b)));
            } else if (this.listener == null) {
            } else {
                m38046b.put("ShareParams", shareParams);
                this.listener.onComplete(this, 9, m38046b);
            }
        } catch (Throwable th) {
            if (this.listener == null) {
                return;
            }
            this.listener.onError(this, 9, th);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> filterFriendshipInfo(int i, HashMap<String, Object> hashMap) {
        Object obj = hashMap.get(UriUtil.DATA_SCHEME);
        if (obj == null) {
            return null;
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("type", "FOLLOWING");
        hashMap2.put("snsplat", Integer.valueOf(getPlatformId()));
        hashMap2.put("snsuid", this.f1477db.getUserId());
        int intValue = ((Integer) hashMap.get("current_cursor")).intValue();
        int intValue2 = ((Integer) hashMap.get("current_limit")).intValue();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        if (arrayList2.size() <= 0) {
            return null;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            HashMap hashMap3 = (HashMap) it2.next();
            if (hashMap3 != null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("snsuid", String.valueOf(hashMap3.get("id")));
                hashMap4.put(RContact.COL_NICKNAME, String.valueOf(hashMap3.get("name")));
                hashMap4.put("gender", "male".equals(String.valueOf(hashMap3.get("gender"))) ? "0" : "1");
                hashMap4.put("secretType", "true".equals(String.valueOf(hashMap3.get("verified"))) ? "1" : "0");
                hashMap4.put("snsUserUrl", String.valueOf(hashMap3.get("link")));
                hashMap4.put("resume", String.valueOf(hashMap3.get("link")));
                HashMap hashMap5 = hashMap3.containsKey(SocialConstants.PARAM_AVATAR_URI) ? (HashMap) hashMap3.get(SocialConstants.PARAM_AVATAR_URI) : null;
                if (hashMap5 != null) {
                    HashMap hashMap6 = hashMap5.containsKey(UriUtil.DATA_SCHEME) ? (HashMap) hashMap5.get(UriUtil.DATA_SCHEME) : null;
                    if (hashMap6 != null) {
                        hashMap4.put("icon", String.valueOf(hashMap6.get("url")));
                    }
                }
                try {
                    if (hashMap3.containsKey("birthday")) {
                        String[] split = String.valueOf(hashMap3.get("birthday")).split("/");
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(1, ResHelper.parseInt(split[2]));
                        calendar.set(2, ResHelper.parseInt(split[0]) - 1);
                        calendar.set(5, ResHelper.parseInt(split[1]));
                        hashMap4.put("birthday", String.valueOf(calendar.getTimeInMillis()));
                    }
                } catch (Throwable th) {
                    C0831d.m37772a().m6199d(th);
                }
                ArrayList arrayList3 = hashMap3.containsKey("education") ? (ArrayList) hashMap3.get("education") : null;
                if (arrayList3 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        HashMap hashMap7 = (HashMap) it3.next();
                        HashMap hashMap8 = new HashMap();
                        hashMap8.put("school_type", 0);
                        HashMap hashMap9 = (HashMap) hashMap7.get("school");
                        if (hashMap9 != null) {
                            hashMap8.put("school", String.valueOf(hashMap9.get("name")));
                        }
                        try {
                            hashMap8.put("year", Integer.valueOf(ResHelper.parseInt(String.valueOf(((HashMap) hashMap7.get("year")).get("name")))));
                        } catch (Throwable th2) {
                            C0831d.m37772a().m6199d(th2);
                        }
                        hashMap8.put("background", 0);
                        arrayList4.add(hashMap8);
                    }
                    HashMap hashMap10 = new HashMap();
                    hashMap10.put("list", arrayList4);
                    String fromHashMap = new Hashon().fromHashMap(hashMap10);
                    hashMap4.put("educationJSONArrayStr", fromHashMap.substring(8, fromHashMap.length() - 1));
                }
                ArrayList arrayList5 = hashMap3.containsKey("work") ? (ArrayList) hashMap3.get("work") : null;
                if (arrayList5 != null) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        HashMap hashMap11 = (HashMap) it4.next();
                        HashMap hashMap12 = new HashMap();
                        HashMap hashMap13 = (HashMap) hashMap11.get("employer");
                        if (hashMap13 != null) {
                            hashMap12.put("company", String.valueOf(hashMap13.get("name")));
                        }
                        HashMap hashMap14 = (HashMap) hashMap11.get("position");
                        if (hashMap14 != null) {
                            hashMap12.put("position", String.valueOf(hashMap14.get("name")));
                        }
                        try {
                            String[] split2 = String.valueOf(hashMap11.get(C9654a.C9656b.f30223h)).split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            hashMap12.put(C9654a.C9656b.f30223h, Integer.valueOf(ResHelper.parseInt(split2[1]) + (ResHelper.parseInt(split2[0]) * 100)));
                        } catch (Throwable th3) {
                            C0831d.m37772a().m6199d(th3);
                        }
                        try {
                            String[] split3 = String.valueOf(hashMap11.get(C9654a.C9656b.f30224i)).split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            hashMap12.put(C9654a.C9656b.f30224i, Integer.valueOf(ResHelper.parseInt(split3[1]) + (ResHelper.parseInt(split3[0]) * 100)));
                        } catch (Throwable th4) {
                            C0831d.m37772a().m6199d(th4);
                            hashMap12.put(C9654a.C9656b.f30224i, 0);
                        }
                        arrayList6.add(hashMap12);
                    }
                    HashMap hashMap15 = new HashMap();
                    hashMap15.put("list", arrayList6);
                    String fromHashMap2 = new Hashon().fromHashMap(hashMap15);
                    hashMap4.put("workJSONArrayStr", fromHashMap2.substring(8, fromHashMap2.length() - 1));
                }
                arrayList.add(hashMap4);
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        String str = "_false";
        if (intValue2 >= arrayList.size()) {
            str = "_true";
        }
        hashMap2.put("nextCursor", (arrayList.size() + intValue) + str);
        hashMap2.put("list", arrayList);
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public C0808f.C0809a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        C0808f.C0809a c0809a = new C0808f.C0809a();
        c0809a.f1582b = shareParams.getText();
        if (hashMap != null) {
            if (hashMap != null && hashMap.containsKey("source")) {
                c0809a.f1584d.add(String.valueOf(hashMap.get("source")));
            } else if (4 == shareParams.getShareType()) {
                c0809a.f1584d.add(shareParams.getImageUrl());
                String titleUrl = shareParams.getTitleUrl();
                if (TextUtils.isEmpty(titleUrl)) {
                    titleUrl = shareParams.getUrl();
                }
                c0809a.f1583c.add(titleUrl);
            }
            Object obj = hashMap.get("post_id");
            c0809a.f1581a = obj == null ? null : String.valueOf(obj);
            c0809a.f1587g = hashMap;
        }
        return c0809a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void follow(String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 6);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> getBilaterals(int i, int i2, String str) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> getFollowers(int i, int i2, String str) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> getFollowings(int i, int i2, String str) {
        try {
            HashMap<String, Object> m38057a = C0772d.m38054a(this).m38057a(i, i2, str);
            if (m38057a == null || m38057a.size() <= 0 || m38057a.containsKey("error_code") || m38057a.containsKey("error")) {
                return null;
            }
            m38057a.put("current_limit", Integer.valueOf(i));
            m38057a.put("current_cursor", Integer.valueOf(i2));
            return filterFriendshipInfo(2, m38057a);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void getFriendList(int i, int i2, String str) {
        try {
            HashMap<String, Object> m38057a = C0772d.m38054a(this).m38057a(i, i2 * i, str);
            if (m38057a == null || m38057a.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable("response is null"));
                }
            } else if (m38057a.containsKey("error_code") || m38057a.containsKey("error")) {
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable(new Hashon().fromHashMap(m38057a)));
                }
            } else if (this.listener != null) {
                this.listener.onComplete(this, 2, m38057a);
            }
        } catch (Throwable th) {
            if (this.listener == null) {
                return;
            }
            this.listener.onError(this, 2, th);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public String getName() {
        return NAME;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getPlatformId() {
        return 10;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 2;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f1435a = getDevinfo("ConsumerKey");
        this.f1436b = getDevinfo("RedirectUrl");
        this.f1437c = "true".equals(getDevinfo("ShareByAppClient"));
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean isClientValid() {
        C0772d m38054a = C0772d.m38054a(this);
        m38054a.m38051a(this.f1435a);
        return m38054a.m38047b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void setNetworkDevinfo() {
        this.f1435a = getNetworkDevinfo("api_key", "ConsumerKey");
        this.f1436b = getNetworkDevinfo(AuthorizeActivityBase.KEY_REDIRECT_URI, "RedirectUrl");
        if (TextUtils.isEmpty(this.f1436b)) {
            this.f1436b = "fbconnect://success";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void timeline(int i, int i2, String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void userInfor(String str) {
        HashMap hashMap;
        try {
            HashMap<String, Object> m38044c = C0772d.m38054a(this).m38044c(str);
            if (m38044c == null || m38044c.size() <= 0) {
                if (this.listener == null) {
                    return;
                }
                this.listener.onError(this, 8, new Throwable("response is null"));
            } else if (m38044c.containsKey("error_code") || m38044c.containsKey("error")) {
                if (this.listener == null) {
                    return;
                }
                this.listener.onError(this, 8, new Throwable(new Hashon().fromHashMap(m38044c)));
            } else {
                if (str == null) {
                    this.f1477db.putUserId(String.valueOf(m38044c.get("id")));
                    this.f1477db.put(RContact.COL_NICKNAME, String.valueOf(m38044c.get("name")));
                    this.f1477db.put("gender", "male".equals(String.valueOf(m38044c.get("gender"))) ? "0" : "1");
                    this.f1477db.put("token_for_business", (String) m38044c.get("token_for_business"));
                    HashMap hashMap2 = m38044c.containsKey(SocialConstants.PARAM_AVATAR_URI) ? (HashMap) m38044c.get(SocialConstants.PARAM_AVATAR_URI) : null;
                    if (hashMap2 != null && (hashMap = (HashMap) hashMap2.get(UriUtil.DATA_SCHEME)) != null) {
                        this.f1477db.put("icon", String.valueOf(hashMap.get("url")));
                    }
                    if (m38044c.containsKey("birthday")) {
                        String[] split = String.valueOf(m38044c.get("birthday")).split("/");
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(1, ResHelper.parseInt(split[2]));
                        calendar.set(2, ResHelper.parseInt(split[0]) - 1);
                        calendar.set(5, ResHelper.parseInt(split[1]));
                        this.f1477db.put("birthday", String.valueOf(calendar.getTimeInMillis()));
                    }
                    this.f1477db.put("secretType", "true".equals(String.valueOf(m38044c.get("verified"))) ? "1" : "0");
                    this.f1477db.put("snsUserUrl", String.valueOf(m38044c.get("link")));
                    this.f1477db.put("resume", String.valueOf(m38044c.get("link")));
                    ArrayList arrayList = m38044c.containsKey("education") ? (ArrayList) m38044c.get("education") : null;
                    if (arrayList != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            HashMap hashMap3 = (HashMap) it2.next();
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put("school_type", 0);
                            HashMap hashMap5 = hashMap3.containsKey("school") ? (HashMap) hashMap3.get("school") : null;
                            if (hashMap5 != null) {
                                hashMap4.put("school", String.valueOf(hashMap5.get("name")));
                            }
                            hashMap4.put("year", Integer.valueOf(ResHelper.parseInt(String.valueOf((hashMap3.containsKey("year") ? (HashMap) hashMap3.get("year") : null).get("name")))));
                            hashMap4.put("background", 0);
                            arrayList2.add(hashMap4);
                        }
                        HashMap hashMap6 = new HashMap();
                        hashMap6.put("list", arrayList2);
                        String fromHashMap = new Hashon().fromHashMap(hashMap6);
                        this.f1477db.put("educationJSONArrayStr", fromHashMap.substring(8, fromHashMap.length() - 1));
                    }
                    ArrayList arrayList3 = m38044c.containsKey("work") ? (ArrayList) m38044c.get("work") : null;
                    if (arrayList3 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            HashMap hashMap7 = (HashMap) it3.next();
                            HashMap hashMap8 = new HashMap();
                            HashMap hashMap9 = (HashMap) hashMap7.get("employer");
                            if (hashMap9 != null) {
                                hashMap8.put("company", String.valueOf(hashMap9.get("name")));
                            }
                            HashMap hashMap10 = (HashMap) hashMap7.get("position");
                            if (hashMap10 != null) {
                                hashMap8.put("position", String.valueOf(hashMap10.get("name")));
                            }
                            String[] split2 = String.valueOf(hashMap7.get(C9654a.C9656b.f30223h)).split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            hashMap8.put(C9654a.C9656b.f30223h, Integer.valueOf(ResHelper.parseInt(split2[1]) + (ResHelper.parseInt(split2[0]) * 100)));
                            String[] split3 = String.valueOf(hashMap7.get(C9654a.C9656b.f30224i)).split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            hashMap8.put(C9654a.C9656b.f30224i, Integer.valueOf(ResHelper.parseInt(split3[1]) + (ResHelper.parseInt(split3[0]) * 100)));
                            arrayList4.add(hashMap8);
                        }
                        HashMap hashMap11 = new HashMap();
                        hashMap11.put("list", arrayList4);
                        String fromHashMap2 = new Hashon().fromHashMap(hashMap11);
                        this.f1477db.put("workJSONArrayStr", fromHashMap2.substring(8, fromHashMap2.length() - 1));
                    }
                }
                if (this.listener == null) {
                    return;
                }
                this.listener.onComplete(this, 8, m38044c);
            }
        } catch (Throwable th) {
            if (this.listener == null) {
                return;
            }
            this.listener.onError(this, 8, th);
        }
    }
}
