package com.fimi.soul.module.thirdpartlogin;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.twitter.Twitter;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.manager.C2015y;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.tencent.open.SocialConstants;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.io.File;
import java.util.HashMap;
/* renamed from: com.fimi.soul.module.thirdpartlogin.c */
/* loaded from: classes.dex */
public class C2988c {

    /* renamed from: a */
    public static C2988c f10960a = null;

    /* renamed from: c */
    public static final String f10961c = "LoginManager";

    /* renamed from: b */
    public Context f10962b;

    /* renamed from: d */
    public String f10963d;

    /* renamed from: e */
    private User f10964e = new User();

    /* renamed from: f */
    private String f10965f;

    /* renamed from: com.fimi.soul.module.thirdpartlogin.c$a */
    /* loaded from: classes.dex */
    public interface AbstractC2991a {
        /* renamed from: a */
        void mo29761a(int i, Object obj);
    }

    private C2988c() {
    }

    /* renamed from: a */
    public static C2988c m29770a() {
        if (f10960a == null) {
            f10960a = new C2988c();
        }
        return f10960a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m29768a(PlatformDb platformDb, final AbstractC2991a abstractC2991a) {
        Log.i(f10961c, "thirPlaformLogin(" + platformDb.toString() + Constants.ACCEPT_TIME_SEPARATOR_SP + abstractC2991a.toString() + ")");
        String userId = platformDb.getUserId();
        String userIcon = platformDb.getUserIcon();
        String platformNname = platformDb.getPlatformNname();
        Log.i(f10961c, "platformName:" + platformNname);
        Log.i(f10961c, "userIcon:" + userIcon);
        this.f10964e.setXiaomiID(userId);
        this.f10964e.setappType("0");
        this.f10964e.setName(platformDb.getUserName());
        this.f10964e.setNickName(platformDb.getUserName());
        this.f10964e.setUserImgUrl(userIcon);
        if (platformNname.equalsIgnoreCase(Facebook.NAME)) {
            this.f10963d = "1";
        } else if (platformNname.equalsIgnoreCase(Twitter.NAME)) {
            this.f10963d = "2";
        }
        this.f10964e.setloginChannel(this.f10963d);
        C2015y.m33256a(this.f10962b).m33236d(this.f10964e, new AbstractC1945k() { // from class: com.fimi.soul.module.thirdpartlogin.c.2
            @Override // com.fimi.soul.biz.p185m.AbstractC1945k
            /* renamed from: a */
            public void mo28106a(PlaneMsg planeMsg, File file) {
                C2988c.this.f10965f = planeMsg.getErrorMessage();
                if (planeMsg.isSuccess()) {
                    MiPushClient.registerPush(C2988c.this.f10962b, "2882303761517518920", C1756a.f4559r);
                    if (abstractC2991a == null) {
                        return;
                    }
                    abstractC2991a.mo29761a(0, "");
                } else if (C2988c.this.f10965f != null) {
                    if (abstractC2991a == null) {
                        return;
                    }
                    abstractC2991a.mo29761a(1, String.valueOf(C2988c.this.f10965f));
                } else if (abstractC2991a == null) {
                } else {
                    abstractC2991a.mo29761a(1, C2988c.this.f10962b.getResources().getString(C1704R.C1707string.login_result_net));
                }
            }
        });
    }

    /* renamed from: b */
    private void m29762b(String str, final AbstractC2991a abstractC2991a) {
        Log.i(f10961c, "innerLogin(" + str + ")");
        C2986b c2986b = new C2986b();
        c2986b.m29771a(str);
        this.f10963d = str;
        c2986b.m29772a(new AbstractC2992d() { // from class: com.fimi.soul.module.thirdpartlogin.c.1
            @Override // com.fimi.soul.module.thirdpartlogin.AbstractC2992d
            /* renamed from: a */
            public boolean mo29760a(C2994f c2994f) {
                return true;
            }

            @Override // com.fimi.soul.module.thirdpartlogin.AbstractC2992d
            /* renamed from: a */
            public boolean mo29759a(String str2, HashMap<String, Object> hashMap) {
                if (!TextUtils.isEmpty(str2)) {
                    C2988c.this.m29768a(ShareSDK.getPlatform(str2).getDb(), abstractC2991a);
                    return false;
                } else if (abstractC2991a == null) {
                    return false;
                } else {
                    abstractC2991a.mo29761a(-1, hashMap.get(SocialConstants.PARAM_SEND_MSG));
                    return false;
                }
            }
        });
        c2986b.m29774a(this.f10962b);
    }

    /* renamed from: a */
    public void m29769a(Context context) {
        this.f10962b = context;
        ShareSDK.initSDK(context);
    }

    /* renamed from: a */
    public void m29764a(String str, AbstractC2991a abstractC2991a) {
        m29762b(str, abstractC2991a);
    }

    /* renamed from: b */
    public void m29763b() {
        if (!TextUtils.isEmpty(this.f10963d)) {
            ShareSDK.getPlatform(this.f10963d).removeAccount(true);
        }
    }
}
