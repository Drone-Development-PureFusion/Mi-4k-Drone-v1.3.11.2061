package com.fimi.soul.module.thirdpartlogin;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.overseas.soul.C1704R;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
/* renamed from: com.fimi.soul.module.thirdpartlogin.b */
/* loaded from: classes.dex */
public class C2986b implements Handler.Callback {

    /* renamed from: a */
    private static final int f10952a = 1;

    /* renamed from: b */
    private static final int f10953b = 2;

    /* renamed from: c */
    private static final int f10954c = 3;

    /* renamed from: d */
    private AbstractC2992d f10955d;

    /* renamed from: e */
    private String f10956e;

    /* renamed from: f */
    private Context f10957f;

    /* renamed from: g */
    private Handler f10958g = new Handler(Looper.getMainLooper(), this);

    /* renamed from: a */
    public void m29774a(Context context) {
        this.f10957f = context.getApplicationContext();
        Platform platform = ShareSDK.getPlatform(this.f10956e);
        if (platform == null) {
            return;
        }
        platform.removeAccount(true);
        if (Facebook.NAME.equals(this.f10956e)) {
            platform.SSOSetting(false);
        } else {
            platform.SSOSetting(true);
        }
        platform.setPlatformActionListener(new PlatformActionListener() { // from class: com.fimi.soul.module.thirdpartlogin.b.1
            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onCancel(Platform platform2, int i) {
                if (platform2 != null) {
                    platform2.removeAccount(true);
                }
                if (i == 8) {
                    Message message = new Message();
                    message.what = 1;
                    message.arg2 = i;
                    message.obj = platform2;
                    C2986b.this.f10958g.sendMessage(message);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onComplete(Platform platform2, int i, HashMap<String, Object> hashMap) {
                if (i == 8) {
                    Message message = new Message();
                    message.what = 3;
                    message.arg2 = i;
                    message.obj = new Object[]{platform2.getName(), hashMap};
                    C2986b.this.f10958g.sendMessage(message);
                }
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onError(Platform platform2, int i, Throwable th) {
                if (platform2 != null) {
                    platform2.removeAccount(true);
                }
                if (i == 8) {
                    Message message = new Message();
                    message.what = 2;
                    message.arg2 = i;
                    message.obj = th;
                    C2986b.this.f10958g.sendMessage(message);
                } else if (i == 1) {
                    Message message2 = new Message();
                    message2.what = 1;
                    message2.arg2 = i;
                    message2.obj = th;
                    C2986b.this.f10958g.sendMessage(message2);
                }
                th.printStackTrace();
            }
        });
        platform.showUser(null);
    }

    /* renamed from: a */
    public void m29772a(AbstractC2992d abstractC2992d) {
        this.f10955d = abstractC2992d;
    }

    /* renamed from: a */
    public void m29771a(String str) {
        this.f10956e = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                HashMap<String, Object> hashMap = new HashMap<>();
                this.f10957f.getResources().getString(C1704R.C1707string.cancel);
                if (this.f10955d != null) {
                    this.f10955d.mo29759a("", hashMap);
                    break;
                }
                break;
            case 2:
                Throwable th = (Throwable) message.obj;
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put(SocialConstants.PARAM_SEND_MSG, "caught error: " + th.getMessage());
                if (this.f10955d != null) {
                    this.f10955d.mo29759a("", hashMap2);
                }
                th.printStackTrace();
                break;
            case 3:
                Object[] objArr = (Object[]) message.obj;
                String str = (String) objArr[0];
                HashMap<String, Object> hashMap3 = (HashMap) objArr[1];
                if (this.f10955d == null || this.f10955d.mo29759a(str, hashMap3)) {
                }
                break;
        }
        return false;
    }
}
