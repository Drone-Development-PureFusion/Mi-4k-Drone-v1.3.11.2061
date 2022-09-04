package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import com.mob.tools.utils.Hashon;
import java.util.HashMap;
/* renamed from: cn.sharesdk.wechat.utils.i */
/* loaded from: classes.dex */
public class C0857i {

    /* renamed from: a */
    private Platform f1736a;

    /* renamed from: b */
    private Platform.ShareParams f1737b;

    /* renamed from: c */
    private PlatformActionListener f1738c;

    /* renamed from: d */
    private AuthorizeListener f1739d;

    /* renamed from: e */
    private C0853g f1740e;

    public C0857i(Platform platform) {
        this.f1736a = platform;
    }

    /* renamed from: a */
    public Platform.ShareParams m37669a() {
        return this.f1737b;
    }

    /* renamed from: a */
    public void m37668a(Platform.ShareParams shareParams, PlatformActionListener platformActionListener) {
        this.f1737b = shareParams;
        this.f1738c = platformActionListener;
    }

    /* renamed from: a */
    public void m37667a(AuthorizeListener authorizeListener) {
        this.f1739d = authorizeListener;
    }

    /* renamed from: a */
    public void m37666a(WechatResp wechatResp) {
        switch (wechatResp.f1710f) {
            case -4:
                HashMap hashMap = new HashMap();
                hashMap.put("errCode", Integer.valueOf(wechatResp.f1710f));
                hashMap.put("errStr", wechatResp.f1711g);
                hashMap.put("transaction", wechatResp.f1712h);
                Throwable th = new Throwable(new Hashon().fromHashMap(hashMap));
                switch (wechatResp.mo37694a()) {
                    case 1:
                        if (this.f1739d == null) {
                            return;
                        }
                        this.f1739d.onError(th);
                        return;
                    default:
                        return;
                }
            case -3:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("errCode", Integer.valueOf(wechatResp.f1710f));
                hashMap2.put("errStr", wechatResp.f1711g);
                hashMap2.put("transaction", wechatResp.f1712h);
                Throwable th2 = new Throwable(new Hashon().fromHashMap(hashMap2));
                switch (wechatResp.mo37694a()) {
                    case 1:
                        if (this.f1739d == null) {
                            return;
                        }
                        this.f1739d.onError(th2);
                        return;
                    case 2:
                        if (this.f1738c == null) {
                            return;
                        }
                        this.f1738c.onError(this.f1736a, 9, th2);
                        return;
                    default:
                        return;
                }
            case -2:
                switch (wechatResp.mo37694a()) {
                    case 1:
                        if (this.f1739d == null) {
                            return;
                        }
                        this.f1739d.onCancel();
                        return;
                    case 2:
                        if (this.f1738c == null) {
                            return;
                        }
                        this.f1738c.onCancel(this.f1736a, 9);
                        return;
                    default:
                        return;
                }
            case -1:
            default:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("req", wechatResp.getClass().getSimpleName());
                hashMap3.put("errCode", Integer.valueOf(wechatResp.f1710f));
                hashMap3.put("errStr", wechatResp.f1711g);
                hashMap3.put("transaction", wechatResp.f1712h);
                new Throwable(new Hashon().fromHashMap(hashMap3)).printStackTrace();
                return;
            case 0:
                switch (wechatResp.mo37694a()) {
                    case 1:
                        if (this.f1739d == null) {
                            return;
                        }
                        Bundle bundle = new Bundle();
                        wechatResp.mo37692b(bundle);
                        this.f1740e.m37690a(bundle, this.f1739d);
                        return;
                    case 2:
                        if (this.f1738c == null) {
                            return;
                        }
                        HashMap<String, Object> hashMap4 = new HashMap<>();
                        hashMap4.put("ShareParams", this.f1737b);
                        this.f1738c.onComplete(this.f1736a, 9, hashMap4);
                        return;
                    default:
                        return;
                }
        }
    }

    /* renamed from: a */
    public void m37665a(C0853g c0853g) {
        this.f1740e = c0853g;
    }

    /* renamed from: b */
    public Platform m37664b() {
        return this.f1736a;
    }

    /* renamed from: c */
    public PlatformActionListener m37663c() {
        return this.f1738c;
    }
}
