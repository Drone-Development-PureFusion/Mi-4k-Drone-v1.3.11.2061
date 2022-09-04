package com.fimi.soul.module.p209b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import cn.sharesdk.framework.CustomPlatform;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import com.mob.tools.utils.C10109R;
import com.mob.tools.utils.UIHandler;
import com.tencent.connect.common.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.fimi.soul.module.b.e */
/* loaded from: classes.dex */
public abstract class AbstractC2513e implements Handler.Callback, PlatformActionListener {

    /* renamed from: a */
    protected boolean f8169a;

    /* renamed from: b */
    protected HashMap<String, Object> f8170b;

    /* renamed from: c */
    protected boolean f8171c;

    /* renamed from: d */
    protected ArrayList<C2477a> f8172d;

    /* renamed from: e */
    protected HashMap<String, String> f8173e;

    /* renamed from: f */
    protected PlatformActionListener f8174f = this;

    /* renamed from: g */
    protected AbstractC2515f f8175g;

    /* renamed from: h */
    protected boolean f8176h;

    /* renamed from: i */
    protected Context f8177i;

    /* renamed from: a */
    private void m31415a(final String str) {
        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.fimi.soul.module.b.e.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int stringRes = C10109R.getStringRes(AbstractC2513e.this.f8177i, str);
                if (stringRes > 0) {
                    Toast.makeText(AbstractC2513e.this.f8177i, stringRes, 0).show();
                } else {
                    Toast.makeText(AbstractC2513e.this.f8177i, str, 0).show();
                }
                return false;
            }
        });
    }

    /* renamed from: e */
    private void m31405e(Platform platform) {
        Platform.ShareParams m31406d;
        if (!m31407c(platform) || (m31406d = m31406d(platform)) == null) {
            return;
        }
        ShareSDK.logDemoEvent(3, null);
        if (this.f8175g != null) {
            this.f8175g.m31404a(platform, m31406d);
        }
        mo31419a(this.f8177i, platform, m31406d);
    }

    /* renamed from: a */
    public final void m31421a() {
        this.f8176h = true;
    }

    /* renamed from: a */
    public final void m31420a(Context context) {
        this.f8177i = context;
        if (!this.f8170b.containsKey(Constants.PARAM_PLATFORM)) {
            mo31411b(context);
            return;
        }
        Platform platform = ShareSDK.getPlatform(String.valueOf(this.f8170b.get(Constants.PARAM_PLATFORM)));
        boolean z = platform instanceof CustomPlatform;
        boolean m31418a = m31418a(platform);
        if (this.f8171c || z || m31418a) {
            m31410b(platform);
        } else {
            m31405e(platform);
        }
    }

    /* renamed from: a */
    protected abstract void mo31419a(Context context, Platform platform, Platform.ShareParams shareParams);

    /* renamed from: a */
    public final void m31417a(PlatformActionListener platformActionListener) {
        if (platformActionListener == null) {
            platformActionListener = this;
        }
        this.f8174f = platformActionListener;
    }

    /* renamed from: a */
    public final void m31416a(AbstractC2515f abstractC2515f) {
        this.f8175g = abstractC2515f;
    }

    /* renamed from: a */
    public final void m31414a(ArrayList<C2477a> arrayList) {
        this.f8172d = arrayList;
    }

    /* renamed from: a */
    public final void m31413a(HashMap<String, Object> hashMap) {
        this.f8170b = hashMap;
    }

    /* renamed from: a */
    public final void m31412a(boolean z) {
        this.f8169a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m31418a(Platform platform) {
        String name = platform.getName();
        if ("Wechat".equals(name) || "WechatMoments".equals(name) || "WechatFavorite".equals(name) || "ShortMessage".equals(name) || "Email".equals(name) || "Qzone".equals(name) || Constants.SOURCE_QQ.equals(name) || "Pinterest".equals(name) || "Instagram".equals(name) || "Yixin".equals(name) || "YixinMoments".equals(name) || "QZone".equals(name) || "Mingdao".equals(name) || "Line".equals(name) || "KakaoStory".equals(name) || "KakaoTalk".equals(name) || "Bluetooth".equals(name) || "WhatsApp".equals(name) || "BaiduTieba".equals(name) || "Laiwang".equals(name) || "LaiwangMoments".equals(name) || "Alipay".equals(name) || "AlipayMoments".equals(name) || "FacebookMessenger".equals(name) || "GooglePlus".equals(name)) {
            return true;
        }
        if ("Evernote".equals(name)) {
            if ("true".equals(platform.getDevinfo("ShareByAppClient"))) {
                return true;
            }
        } else if ("SinaWeibo".equals(name) && "true".equals(platform.getDevinfo("ShareByAppClient"))) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setPackage("com.sina.weibo");
            intent.setType("image/*");
            ResolveInfo resolveActivity = platform.getContext().getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null) {
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setPackage("com.sina.weibog3");
                intent2.setType("image/*");
                resolveActivity = platform.getContext().getPackageManager().resolveActivity(intent2, 0);
            }
            return resolveActivity != null;
        }
        return false;
    }

    /* renamed from: b */
    protected abstract void mo31411b(Context context);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m31410b(Platform platform) {
        Platform.ShareParams m31406d;
        if (!m31407c(platform) || (m31406d = m31406d(platform)) == null) {
            return;
        }
        m31415a("ssdk_oks_sharing");
        if (this.f8175g != null) {
            this.f8175g.m31404a(platform, m31406d);
        }
        if (this.f8176h) {
            platform.SSOSetting(this.f8176h);
        }
        platform.setPlatformActionListener(this.f8174f);
        platform.share(m31406d);
    }

    /* renamed from: b */
    public final void m31409b(HashMap<String, String> hashMap) {
        this.f8173e = hashMap;
    }

    /* renamed from: b */
    public final void m31408b(boolean z) {
        this.f8171c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m31407c(Platform platform) {
        int i;
        String name = platform.getName();
        if (("Alipay".equals(name) || "AlipayMoments".equals(name)) && !platform.isClientValid()) {
            m31415a("ssdk_alipay_client_inavailable");
            return false;
        } else if ("KakaoTalk".equals(name) && !platform.isClientValid()) {
            m31415a("ssdk_kakaotalk_client_inavailable");
            return false;
        } else if ("KakaoStory".equals(name) && !platform.isClientValid()) {
            m31415a("ssdk_kakaostory_client_inavailable");
            return false;
        } else if ("Line".equals(name) && !platform.isClientValid()) {
            m31415a("ssdk_line_client_inavailable");
            return false;
        } else if ("WhatsApp".equals(name) && !platform.isClientValid()) {
            m31415a("ssdk_whatsapp_client_inavailable");
            return false;
        } else if ("Pinterest".equals(name) && !platform.isClientValid()) {
            return false;
        } else {
            if ("Instagram".equals(name) && !platform.isClientValid()) {
                return false;
            }
            if ("QZone".equals(name) && !platform.isClientValid()) {
                return false;
            }
            boolean equals = "Laiwang".equals(name);
            boolean equals2 = "LaiwangMoments".equals(name);
            if ((equals || equals2) && !platform.isClientValid()) {
                return false;
            }
            if (("YixinMoments".equals(name) || "Yixin".equals(name)) && !platform.isClientValid()) {
                return false;
            }
            boolean z = "WechatFavorite".equals(name) || "Wechat".equals(name) || "WechatMoments".equals(name);
            if (z && !platform.isClientValid()) {
                m31415a(this.f8177i.getString(C10109R.getStringRes(this.f8177i, "no_install_apk")));
                return false;
            } else if ("FacebookMessenger".equals(name) && !platform.isClientValid()) {
                return false;
            } else {
                if (this.f8170b.containsKey("shareType")) {
                    return true;
                }
                String valueOf = String.valueOf(this.f8170b.get("imagePath"));
                if (valueOf == null || !new File(valueOf).exists()) {
                    Bitmap bitmap = (Bitmap) C10109R.forceCast(this.f8170b.get("viewToShare"));
                    if (bitmap == null || bitmap.isRecycled()) {
                        Object obj = this.f8170b.get("imageUrl");
                        if (obj == null || TextUtils.isEmpty(String.valueOf(obj))) {
                            i = 1;
                        } else if (!String.valueOf(obj).endsWith(".gif") || !z) {
                            if (this.f8170b.containsKey("url") && !TextUtils.isEmpty(this.f8170b.get("url").toString())) {
                                if (this.f8170b.containsKey("musicUrl") && !TextUtils.isEmpty(this.f8170b.get("musicUrl").toString()) && z) {
                                    i = 5;
                                }
                                i = 4;
                            }
                            i = 2;
                        } else {
                            i = 9;
                        }
                    } else {
                        if (this.f8170b.containsKey("url") && !TextUtils.isEmpty(this.f8170b.get("url").toString())) {
                            if (this.f8170b.containsKey("musicUrl") && !TextUtils.isEmpty(this.f8170b.get("musicUrl").toString()) && z) {
                                i = 5;
                            }
                            i = 4;
                        }
                        i = 2;
                    }
                } else if (!valueOf.endsWith(".gif") || !z) {
                    if (this.f8170b.containsKey("url") && !TextUtils.isEmpty(this.f8170b.get("url").toString())) {
                        if (this.f8170b.containsKey("musicUrl") && !TextUtils.isEmpty(this.f8170b.get("musicUrl").toString()) && z) {
                            i = 5;
                        }
                        i = 4;
                    }
                    i = 2;
                } else {
                    i = 9;
                }
                this.f8170b.put("shareType", Integer.valueOf(i));
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final Platform.ShareParams m31406d(Platform platform) {
        if (platform == null || this.f8170b == null) {
            m31415a("ssdk_oks_share_failed");
            return null;
        }
        try {
            Bitmap bitmap = (Bitmap) C10109R.forceCast(this.f8170b.get("viewToShare"));
            if (TextUtils.isEmpty((String) C10109R.forceCast(this.f8170b.get("imagePath"))) && bitmap != null && !bitmap.isRecycled()) {
                File file = new File(C10109R.getCachePath(platform.getContext(), "screenshot"), String.valueOf(System.currentTimeMillis()) + ".jpg");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                this.f8170b.put("imagePath", file.getAbsolutePath());
            }
            return new Platform.ShareParams(this.f8170b);
        } catch (Throwable th) {
            th.printStackTrace();
            m31415a("ssdk_oks_share_failed");
            return null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.arg1) {
            case 1:
                int stringRes = C10109R.getStringRes(this.f8177i, "ssdk_oks_share_completed");
                if (stringRes <= 0) {
                    return false;
                }
                m31415a(this.f8177i.getString(stringRes));
                return false;
            case 2:
                String simpleName = message.obj.getClass().getSimpleName();
                if ("WechatClientNotExistException".equals(simpleName) || "WechatTimelineNotSupportedException".equals(simpleName) || "WechatFavoriteNotSupportedException".equals(simpleName)) {
                    m31415a(this.f8177i.getString(C10109R.getStringRes(this.f8177i, "no_install_apk")));
                    return false;
                } else if ("GooglePlusClientNotExistException".equals(simpleName)) {
                    m31415a("ssdk_google_plus_client_inavailable");
                    return false;
                } else if ("QQClientNotExistException".equals(simpleName)) {
                    m31415a("ssdk_qq_client_inavailable");
                    return false;
                } else if ("YixinClientNotExistException".equals(simpleName) || "YixinTimelineNotSupportedException".equals(simpleName)) {
                    m31415a("ssdk_yixin_client_inavailable");
                    return false;
                } else if ("KakaoTalkClientNotExistException".equals(simpleName)) {
                    m31415a("ssdk_kakaotalk_client_inavailable");
                    return false;
                } else if ("KakaoStoryClientNotExistException".equals(simpleName)) {
                    m31415a("ssdk_kakaostory_client_inavailable");
                    return false;
                } else if ("WhatsAppClientNotExistException".equals(simpleName)) {
                    m31415a("ssdk_whatsapp_client_inavailable");
                    return false;
                } else if ("FacebookMessengerClientNotExistException".equals(simpleName)) {
                    m31415a("ssdk_facebookmessenger_client_inavailable");
                    return false;
                } else {
                    m31415a("ssdk_oks_share_failed");
                    return false;
                }
            case 3:
                m31415a("ssdk_oks_share_canceled");
                return false;
            default:
                return false;
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public final void onCancel(Platform platform, int i) {
        Message message = new Message();
        message.arg1 = 3;
        message.arg2 = i;
        message.obj = platform;
        UIHandler.sendMessage(message, this);
        ShareSDK.logDemoEvent(5, platform);
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public final void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        Message message = new Message();
        message.arg1 = 1;
        message.arg2 = i;
        message.obj = platform;
        UIHandler.sendMessage(message, this);
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public final void onError(Platform platform, int i, Throwable th) {
        th.printStackTrace();
        Message message = new Message();
        message.arg1 = 2;
        message.arg2 = i;
        message.obj = th;
        UIHandler.sendMessage(message, this);
        ShareSDK.logDemoEvent(4, platform);
    }
}
