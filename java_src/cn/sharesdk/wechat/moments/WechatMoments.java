package cn.sharesdk.wechat.moments;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.p076b.p078b.C0808f;
import cn.sharesdk.framework.utils.C0831d;
import cn.sharesdk.wechat.utils.C0853g;
import cn.sharesdk.wechat.utils.C0857i;
import cn.sharesdk.wechat.utils.WechatClientNotExistException;
import cn.sharesdk.wechat.utils.WechatHelper;
import cn.sharesdk.wechat.utils.WechatTimelineNotSupportedException;
import java.util.HashMap;
/* loaded from: classes.dex */
public class WechatMoments extends Platform {
    public static final String NAME = WechatMoments.class.getSimpleName();

    /* renamed from: a */
    private String f1696a;

    /* renamed from: b */
    private String f1697b;

    /* renamed from: c */
    private boolean f1698c;

    /* loaded from: classes.dex */
    public static class ShareParams extends WechatHelper.ShareParams {
        public ShareParams() {
            this.scene = 1;
        }
    }

    public WechatMoments(Context context) {
        super(context);
    }

    /* renamed from: c */
    private boolean m37729c() {
        if (!TextUtils.isEmpty(getDb().get("refresh_token"))) {
            C0853g c0853g = new C0853g(this, 23);
            c0853g.m37684a(this.f1696a, this.f1697b);
            return c0853g.m37691a();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public boolean checkAuthorize(int i, Object obj) {
        WechatHelper m37724a = WechatHelper.m37724a();
        m37724a.m37721a(this.context, this.f1696a);
        if (!m37724a.m37698c()) {
            if (this.listener == null) {
                return false;
            }
            this.listener.onError(this, i, new WechatClientNotExistException());
            return false;
        } else if (!m37724a.m37695d()) {
            if (this.listener == null) {
                return false;
            }
            this.listener.onError(this, 1, new WechatTimelineNotSupportedException());
            return false;
        } else if (i == 9 || isAuthValid() || m37729c()) {
            return true;
        } else {
            innerAuthorize(i, obj);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
        if (TextUtils.isEmpty(this.f1696a) || TextUtils.isEmpty(this.f1697b)) {
            if (this.listener == null) {
                return;
            }
            this.listener.onError(this, 8, new Throwable("The params of appID or appSecret is missing !"));
            return;
        }
        WechatHelper m37724a = WechatHelper.m37724a();
        m37724a.m37721a(this.context, this.f1696a);
        if (!m37724a.m37698c()) {
            if (this.listener == null) {
                return;
            }
            this.listener.onError(this, 1, new WechatClientNotExistException());
        } else if (!m37724a.m37695d()) {
            if (this.listener == null) {
                return;
            }
            this.listener.onError(this, 1, new WechatTimelineNotSupportedException());
        } else {
            C0853g c0853g = new C0853g(this, 23);
            c0853g.m37684a(this.f1696a, this.f1697b);
            C0857i c0857i = new C0857i(this);
            c0857i.m37665a(c0853g);
            c0857i.m37667a(new AuthorizeListener() { // from class: cn.sharesdk.wechat.moments.WechatMoments.1
                @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                public void onCancel() {
                    if (WechatMoments.this.listener != null) {
                        WechatMoments.this.listener.onCancel(WechatMoments.this, 1);
                    }
                }

                @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                public void onComplete(Bundle bundle) {
                    WechatMoments.this.afterRegister(1, null);
                }

                @Override // cn.sharesdk.framework.authorize.AuthorizeListener
                public void onError(Throwable th) {
                    if (WechatMoments.this.listener != null) {
                        WechatMoments.this.listener.onError(WechatMoments.this, 1, th);
                    }
                }
            });
            try {
                m37724a.m37711a(c0857i);
            } catch (Throwable th) {
                if (this.listener == null) {
                    return;
                }
                this.listener.onError(this, 1, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        if (this.listener != null) {
            this.listener.onCancel(this, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void doShare(Platform.ShareParams shareParams) {
        shareParams.set("scene", 1);
        WechatHelper m37724a = WechatHelper.m37724a();
        m37724a.m37721a(this.context, this.f1696a);
        C0857i c0857i = new C0857i(this);
        if (this.f1698c) {
            try {
                m37724a.m37710a(c0857i, shareParams, this.listener);
                return;
            } catch (Throwable th) {
                if (this.listener == null) {
                    return;
                }
                this.listener.onError(this, 9, th);
                return;
            }
        }
        c0857i.m37668a(shareParams, this.listener);
        try {
            m37724a.m37699b(c0857i);
            if (this.listener == null || !m37724a.m37707b()) {
                return;
            }
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("ShareParams", shareParams);
            if (this.listener == null) {
                return;
            }
            this.listener.onComplete(this, 9, hashMap);
        } catch (Throwable th2) {
            if (this.listener == null) {
                return;
            }
            this.listener.onError(this, 9, th2);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    protected HashMap<String, Object> filterFriendshipInfo(int i, HashMap<String, Object> hashMap) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public C0808f.C0809a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        C0808f.C0809a c0809a = new C0808f.C0809a();
        String text = shareParams.getText();
        c0809a.f1582b = text;
        String imageUrl = shareParams.getImageUrl();
        String imagePath = shareParams.getImagePath();
        Bitmap imageData = shareParams.getImageData();
        if (!TextUtils.isEmpty(imageUrl)) {
            c0809a.f1584d.add(imageUrl);
        } else if (imagePath != null) {
            c0809a.f1585e.add(imagePath);
        } else if (imageData != null) {
            c0809a.f1586f.add(imageData);
        }
        String url = shareParams.getUrl();
        if (url != null) {
            c0809a.f1583c.add(url);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("title", shareParams.getTitle());
        hashMap2.put("url", url);
        hashMap2.put("extInfo", null);
        hashMap2.put("content", text);
        hashMap2.put("image", c0809a.f1584d);
        hashMap2.put("musicFileUrl", url);
        c0809a.f1587g = hashMap2;
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
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void getFriendList(int i, int i2, String str) {
        if (this.listener != null) {
            this.listener.onCancel(this, 2);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public String getName() {
        return NAME;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getPlatformId() {
        return 23;
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 1;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return !this.f1698c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void initDevInfo(String str) {
        this.f1696a = getDevinfo("AppId");
        this.f1697b = getDevinfo("AppSecret");
        this.f1698c = "true".equals(getDevinfo("BypassApproval"));
        if (this.f1696a == null || this.f1696a.length() <= 0) {
            this.f1696a = getDevinfo("Wechat", "AppId");
            this.f1698c = "true".equals(getDevinfo("Wechat", "BypassApproval"));
            if (this.f1696a != null && this.f1696a.length() > 0) {
                copyDevinfo("Wechat", NAME);
                this.f1696a = getDevinfo("AppId");
                this.f1698c = "true".equals(getDevinfo("BypassApproval"));
                C0831d.m37772a().m6200d("Try to use the dev info of Wechat, this will cause Id and SortId field are always 0.", new Object[0]);
                return;
            }
            this.f1696a = getDevinfo("WechatFavorite", "AppId");
            if (this.f1696a == null || this.f1696a.length() <= 0) {
                return;
            }
            copyDevinfo("WechatFavorite", NAME);
            this.f1696a = getDevinfo("AppId");
            C0831d.m37772a().m6200d("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.", new Object[0]);
        }
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean isClientValid() {
        WechatHelper m37724a = WechatHelper.m37724a();
        m37724a.m37721a(this.context, this.f1696a);
        return m37724a.m37698c() && m37724a.m37695d();
    }

    @Override // cn.sharesdk.framework.Platform
    @Deprecated
    public boolean isValid() {
        WechatHelper m37724a = WechatHelper.m37724a();
        m37724a.m37721a(this.context, this.f1696a);
        return m37724a.m37698c() && m37724a.m37695d() && super.isValid();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cn.sharesdk.framework.Platform
    public void setNetworkDevinfo() {
        this.f1696a = getNetworkDevinfo("app_id", "AppId");
        this.f1697b = getNetworkDevinfo("app_secret", "AppSecret");
        if (this.f1696a == null || this.f1696a.length() <= 0) {
            this.f1696a = getNetworkDevinfo(22, "app_id", "AppId");
            if (this.f1696a == null || this.f1696a.length() <= 0) {
                this.f1696a = getNetworkDevinfo(37, "app_id", "AppId");
                if (this.f1696a != null && this.f1696a.length() > 0) {
                    copyNetworkDevinfo(23, 23);
                    this.f1696a = getNetworkDevinfo("app_id", "AppId");
                    C0831d.m37772a().m6200d("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.", new Object[0]);
                }
            } else {
                copyNetworkDevinfo(22, 23);
                this.f1696a = getNetworkDevinfo("app_id", "AppId");
                C0831d.m37772a().m6200d("Try to use the dev info of Wechat, this will cause Id and SortId field are always 0.", new Object[0]);
            }
        }
        if (this.f1697b == null || this.f1697b.length() <= 0) {
            this.f1697b = getNetworkDevinfo(22, "app_secret", "AppSecret");
            if (this.f1697b != null && this.f1697b.length() > 0) {
                copyNetworkDevinfo(22, 23);
                this.f1697b = getNetworkDevinfo("app_secret", "AppSecret");
                C0831d.m37772a().m6200d("Try to use the dev info of Wechat, this will cause Id and SortId field are always 0.", new Object[0]);
                return;
            }
            this.f1697b = getNetworkDevinfo(37, "app_secret", "AppSecret");
            if (this.f1697b == null || this.f1697b.length() <= 0) {
                return;
            }
            copyNetworkDevinfo(23, 23);
            this.f1697b = getNetworkDevinfo("app_secret", "AppSecret");
            C0831d.m37772a().m6200d("Try to use the dev info of WechatFavorite, this will cause Id and SortId field are always 0.", new Object[0]);
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
        if (TextUtils.isEmpty(this.f1696a) || TextUtils.isEmpty(this.f1697b)) {
            if (this.listener == null) {
                return;
            }
            this.listener.onError(this, 8, new Throwable("The params of appID or appSecret is missing !"));
            return;
        }
        C0853g c0853g = new C0853g(this, 23);
        c0853g.m37684a(this.f1696a, this.f1697b);
        try {
            c0853g.m37689a(this.listener);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            if (this.listener == null) {
                return;
            }
            this.listener.onError(this, 8, th);
        }
    }
}
