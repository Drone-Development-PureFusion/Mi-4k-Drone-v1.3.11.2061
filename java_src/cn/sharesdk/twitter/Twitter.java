package cn.sharesdk.twitter;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.p076b.p078b.C0808f;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.tencent.p263mm.sdk.contact.RContact;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public class Twitter extends Platform {
    public static final String NAME = Twitter.class.getSimpleName();

    /* renamed from: a */
    private String f1679a;

    /* renamed from: b */
    private String f1680b;

    /* renamed from: c */
    private String f1681c;

    /* loaded from: classes.dex */
    public static class ShareParams extends Platform.ShareParams {
    }

    public Twitter(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i, Object obj) {
        if (isAuthValid()) {
            C0842b m37751a = C0842b.m37751a(this);
            m37751a.m37747a(this.f1679a, this.f1680b, this.f1681c);
            String token = this.f1477db.getToken();
            String tokenSecret = this.f1477db.getTokenSecret();
            if (token != null && tokenSecret != null) {
                m37751a.m37748a(token, tokenSecret);
                return true;
            }
        }
        innerAuthorize(i, obj);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        final C0842b m37751a = C0842b.m37751a(this);
        m37751a.m37747a(this.f1679a, this.f1680b, this.f1681c);
        m37751a.m37750a(new AuthorizeListener() { // from class: cn.sharesdk.twitter.Twitter.1
            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onCancel() {
                if (Twitter.this.listener != null) {
                    Twitter.this.listener.onCancel(Twitter.this, 1);
                }
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onComplete(Bundle bundle) {
                String string = bundle.getString("oauth_token");
                String string2 = bundle.getString("oauth_token_secret");
                String string3 = bundle.getString("user_id");
                String string4 = bundle.getString("screen_name");
                Twitter.this.f1477db.putToken(string);
                Twitter.this.f1477db.putTokenSecret(string2);
                Twitter.this.f1477db.putUserId(string3);
                Twitter.this.f1477db.put(RContact.COL_NICKNAME, string4);
                m37751a.m37748a(string, string2);
                Twitter.this.afterRegister(1, null);
            }

            @Override // cn.sharesdk.framework.authorize.AuthorizeListener
            public void onError(Throwable th) {
                if (Twitter.this.listener != null) {
                    Twitter.this.listener.onError(Twitter.this, 1, th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        try {
            HashMap<String, Object> m37746a = C0842b.m37751a(this).m37746a(str, str2, hashMap, hashMap2);
            if (m37746a == null || m37746a.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, i, new Throwable("response is null"));
                }
            } else if (m37746a.containsKey("error_code") || m37746a.containsKey("error")) {
                if (this.listener != null) {
                    this.listener.onError(this, i, new Throwable(new Hashon().fromHashMap(m37746a)));
                }
            } else if (this.listener != null) {
                this.listener.onComplete(this, i, m37746a);
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
    public void doShare(Platform.ShareParams shareParams) {
        C0842b m37751a = C0842b.m37751a(this);
        HashMap<String, Object> hashMap = null;
        String shortLintk = getShortLintk(shareParams.getText(), false);
        shareParams.setText(shortLintk);
        try {
            String[] imageArray = shareParams.getImageArray();
            String imagePath = shareParams.getImagePath();
            String imageUrl = shareParams.getImageUrl();
            if (imageArray != null && imageArray.length > 0) {
                hashMap = m37751a.m37745a(shortLintk, imageArray);
            } else if (!TextUtils.isEmpty(imagePath) && new File(imagePath).exists()) {
                hashMap = m37751a.m37739e(shortLintk, imagePath);
            } else if (!TextUtils.isEmpty(imageUrl)) {
                String downloadBitmap = BitmapHelper.downloadBitmap(getContext(), imageUrl);
                if (new File(downloadBitmap).exists()) {
                    hashMap = m37751a.m37739e(shortLintk, downloadBitmap);
                }
            } else {
                hashMap = m37751a.m37742c(shortLintk);
            }
            if (hashMap == null) {
                if (this.listener == null) {
                    return;
                }
                this.listener.onError(this, 8, new Throwable("response is null"));
            } else if (hashMap.containsKey("error_code") || hashMap.containsKey("error")) {
                if (this.listener == null) {
                    return;
                }
                this.listener.onError(this, 8, new Throwable(new Hashon().fromHashMap(hashMap)));
            } else {
                hashMap.put("ShareParams", shareParams);
                if (this.listener == null) {
                    return;
                }
                this.listener.onComplete(this, 9, hashMap);
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
        HashMap<String, Object> hashMap2 = new HashMap<>();
        switch (i) {
            case 2:
                hashMap2.put("type", "FOLLOWING");
                break;
            case 10:
                hashMap2.put("type", "FRIENDS");
                break;
            case 11:
                hashMap2.put("type", "FOLLOWERS");
                break;
            default:
                return null;
        }
        hashMap2.put("snsplat", Integer.valueOf(getPlatformId()));
        hashMap2.put("snsuid", this.f1477db.getUserId());
        String valueOf = hashMap.containsKey("next_cursor") ? String.valueOf(hashMap.get("next_cursor")) : null;
        Object obj = hashMap.get("users");
        if (obj != null) {
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
                    hashMap4.put(RContact.COL_NICKNAME, String.valueOf(hashMap3.get("screen_name")));
                    hashMap4.put("icon", String.valueOf(hashMap3.get("profile_image_url")));
                    hashMap4.put("gender", "2");
                    hashMap4.put("resume", String.valueOf(hashMap3.get("description")));
                    hashMap4.put("secretType", "true".equals(String.valueOf(hashMap3.get("verified"))) ? "1" : "0");
                    hashMap4.put("followerCount", String.valueOf(hashMap3.get("followers_count")));
                    hashMap4.put("favouriteCount", String.valueOf(hashMap3.get("friends_count")));
                    hashMap4.put("shareCount", String.valueOf(hashMap3.get("statuses_count")));
                    hashMap4.put("snsregat", String.valueOf(ResHelper.dateToLong(String.valueOf(hashMap3.get("created_at")))));
                    hashMap4.put("snsUserUrl", "https://twitter.com/" + hashMap3.get("screen_name"));
                    arrayList.add(hashMap4);
                }
            }
            if (arrayList == null || arrayList.size() <= 0) {
                return null;
            }
            String str = valueOf + "_false";
            if (TextUtils.isEmpty(valueOf) || "0".equals(valueOf)) {
                str = "0_true";
            }
            hashMap2.put("nextCursor", str);
            hashMap2.put("list", arrayList);
            return hashMap2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public C0808f.C0809a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        ArrayList arrayList;
        C0808f.C0809a c0809a = new C0808f.C0809a();
        c0809a.f1582b = shareParams.getText();
        if (hashMap != null) {
            HashMap hashMap2 = (HashMap) hashMap.get("entities");
            if (hashMap2 != null && (arrayList = (ArrayList) hashMap2.get("media")) != null && arrayList.size() > 0 && ((HashMap) arrayList.get(0)) != null) {
                c0809a.f1584d.add(String.valueOf(hashMap.get("media_url")));
            }
            c0809a.f1581a = String.valueOf(hashMap.get("id"));
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
        String userId = TextUtils.isEmpty(null) ? this.f1477db.getUserId() : null;
        if (TextUtils.isEmpty(userId)) {
            userId = this.f1477db.getUserName();
        }
        if (TextUtils.isEmpty(userId)) {
            return null;
        }
        C0842b m37751a = C0842b.m37751a(this);
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            HashMap<String, Object> m37741c = m37751a.m37741c(userId, str);
            if (m37741c != null && m37741c.size() > 0 && !m37741c.containsKey("error_code") && !m37741c.containsKey("error")) {
                return filterFriendshipInfo(11, m37741c);
            }
            return null;
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return null;
        }
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> getFollowings(int i, int i2, String str) {
        String userId = TextUtils.isEmpty(null) ? this.f1477db.getUserId() : null;
        if (TextUtils.isEmpty(userId)) {
            userId = this.f1477db.getUserName();
        }
        if (TextUtils.isEmpty(userId)) {
            return null;
        }
        C0842b m37751a = C0842b.m37751a(this);
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            HashMap<String, Object> m37743b = m37751a.m37743b(userId, str);
            if (m37743b != null && m37743b.size() > 0 && !m37743b.containsKey("error_code") && !m37743b.containsKey("error")) {
                return filterFriendshipInfo(2, m37743b);
            }
            return null;
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void getFriendList(int i, int i2, String str) {
        String str2 = null;
        if (TextUtils.isEmpty(null)) {
            str2 = this.f1477db.getUserId();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f1477db.getUserName();
        }
        if (TextUtils.isEmpty(str2) && this.listener != null) {
            this.listener.onError(this, 2, new Throwable("The account do not authorize!"));
        }
        C0842b m37751a = C0842b.m37751a(this);
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            HashMap<String, Object> m37743b = m37751a.m37743b(str2, str);
            if (m37743b == null || m37743b.size() <= 0) {
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable("response is null"));
                }
            } else if (m37743b.containsKey("error_code") || m37743b.containsKey("error")) {
                if (this.listener != null) {
                    this.listener.onError(this, 2, new Throwable(new Hashon().fromHashMap(m37743b)));
                }
            } else if (this.listener != null) {
                this.listener.onComplete(this, 2, m37743b);
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
        return 11;
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
        this.f1679a = getDevinfo("ConsumerKey");
        this.f1680b = getDevinfo("ConsumerSecret");
        this.f1681c = getDevinfo("CallbackUrl");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void setNetworkDevinfo() {
        this.f1679a = getNetworkDevinfo("consumer_key", "ConsumerKey");
        this.f1680b = getNetworkDevinfo("consumer_secret", "ConsumerSecret");
        this.f1681c = getNetworkDevinfo(AuthorizeActivityBase.KEY_REDIRECT_URI, "CallbackUrl");
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
        try {
            HashMap<String, Object> m37744b = C0842b.m37751a(this).m37744b(str);
            if (m37744b == null || m37744b.size() <= 0) {
                if (this.listener == null) {
                    return;
                }
                this.listener.onError(this, 8, new Throwable("response is null"));
            } else if (m37744b.containsKey("error_code") || m37744b.containsKey("error")) {
                if (this.listener == null) {
                    return;
                }
                this.listener.onError(this, 8, new Throwable(new Hashon().fromHashMap(m37744b)));
            } else {
                if (str == null) {
                    this.f1477db.put(RContact.COL_NICKNAME, String.valueOf(m37744b.get("screen_name")));
                    this.f1477db.put("icon", String.valueOf(m37744b.get("profile_image_url")));
                    this.f1477db.put("gender", "2");
                    this.f1477db.put("resume", String.valueOf(m37744b.get("description")));
                    this.f1477db.put("secretType", "true".equals(String.valueOf(m37744b.get("verified"))) ? "1" : "0");
                    this.f1477db.put("followerCount", String.valueOf(m37744b.get("followers_count")));
                    this.f1477db.put("favouriteCount", String.valueOf(m37744b.get("friends_count")));
                    this.f1477db.put("shareCount", String.valueOf(m37744b.get("statuses_count")));
                    this.f1477db.put("snsregat", String.valueOf(ResHelper.dateToLong(String.valueOf(m37744b.get("created_at")))));
                    this.f1477db.put("snsUserUrl", "https://twitter.com/" + m37744b.get("screen_name"));
                }
                if (this.listener == null) {
                    return;
                }
                this.listener.onComplete(this, 8, m37744b);
            }
        } catch (Throwable th) {
            if (this.listener == null) {
                return;
            }
            this.listener.onError(this, 8, th);
        }
    }
}
