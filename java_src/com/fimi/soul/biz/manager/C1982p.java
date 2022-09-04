package com.fimi.soul.biz.manager;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.twitter.Twitter;
import cn.sharesdk.wechat.friends.Wechat;
import cn.sharesdk.wechat.moments.WechatMoments;
import com.fimi.kernel.C1642c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.entity.ShareInfo;
import com.fimi.soul.module.p209b.C2510b;
import com.fimi.soul.module.p209b.EnumC2512d;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3121e;
import com.fimi.soul.utils.C3129m;
import com.tencent.p263mm.sdk.plugin.MMPluginProviderConstants;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
/* renamed from: com.fimi.soul.biz.manager.p */
/* loaded from: classes.dex */
public class C1982p {

    /* renamed from: a */
    public static int f5526a = 0;

    /* renamed from: b */
    public static int f5527b = 1;

    /* renamed from: c */
    public static final int f5528c = 1;

    /* renamed from: d */
    public static final int f5529d = 2;

    /* renamed from: e */
    public static final int f5530e = 3;

    /* renamed from: g */
    private Context f5532g;

    /* renamed from: h */
    private ShareInfo f5533h;

    /* renamed from: i */
    private AbstractC1994b f5534i;

    /* renamed from: j */
    private final String f5535j = "tempImage.png";

    /* renamed from: k */
    private Handler f5536k = new Handler() { // from class: com.fimi.soul.biz.manager.p.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Toast.makeText(C1982p.this.f5532g, (int) C1704R.C1707string.share_success, 1).show();
                    break;
                case 3:
                    Toast.makeText(C1982p.this.f5532g, (int) C1704R.C1707string.share_fail, 1).show();
                    break;
            }
            super.handleMessage(message);
        }
    };

    /* renamed from: f */
    public IUiListener f5531f = new IUiListener() { // from class: com.fimi.soul.biz.manager.p.3
        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            Toast.makeText(C1982p.this.f5532g, "Complete", 1).show();
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            Toast.makeText(C1982p.this.f5532g, "Error", 1).show();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.biz.manager.p$a */
    /* loaded from: classes.dex */
    public class AlertDialogC1988a extends AlertDialog {

        /* renamed from: a */
        ImageView f5542a;

        /* renamed from: b */
        ImageView f5543b;

        /* renamed from: c */
        ImageView f5544c;

        /* renamed from: d */
        Button f5545d;

        /* renamed from: f */
        private Context f5547f;

        /* renamed from: g */
        private ShareInfo f5548g;

        /* renamed from: h */
        private boolean f5549h;

        /* renamed from: i */
        private boolean f5550i;

        public AlertDialogC1988a(Context context, ShareInfo shareInfo) {
            super(context);
            this.f5547f = context;
            this.f5548g = shareInfo;
        }

        @Override // android.app.AlertDialog, android.app.Dialog
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(C1704R.layout.dialog_share);
            findViewById(C1704R.C1706id.iv_facebook_share).setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.biz.manager.p.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C1982p.this.m33330a(AlertDialogC1988a.this.f5547f, Facebook.NAME, true, AlertDialogC1988a.this.f5548g);
                    AlertDialogC1988a.this.dismiss();
                }
            });
            findViewById(C1704R.C1706id.iv_twitter_share).setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.biz.manager.p.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C1982p.this.m33330a(AlertDialogC1988a.this.f5547f, Twitter.NAME, true, AlertDialogC1988a.this.f5548g);
                    AlertDialogC1988a.this.dismiss();
                }
            });
            TextView textView = (TextView) findViewById(C1704R.C1706id.share_tv);
            this.f5542a = (ImageView) findViewById(C1704R.C1706id.wechat_iv);
            this.f5542a.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.biz.manager.p.a.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C1982p.this.m33330a(AlertDialogC1988a.this.f5547f, Wechat.NAME, true, AlertDialogC1988a.this.f5548g);
                    AlertDialogC1988a.this.dismiss();
                }
            });
            this.f5543b = (ImageView) findViewById(C1704R.C1706id.wechat_friend_iv);
            this.f5543b.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.biz.manager.p.a.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C1982p.this.m33330a(AlertDialogC1988a.this.f5547f, WechatMoments.NAME, true, AlertDialogC1988a.this.f5548g);
                    AlertDialogC1988a.this.dismiss();
                }
            });
            this.f5545d = (Button) findViewById(C1704R.C1706id.cancle_btn);
            this.f5545d.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.biz.manager.p.a.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AlertDialogC1988a.this.dismiss();
                }
            });
            C3103au.m29233a(C1642c.m34893a().getResources().getAssets(), (ViewGroup) getWindow().getDecorView());
        }

        @Override // android.app.Dialog
        protected void onStart() {
            super.onStart();
            if (C3103au.m29208d(this.f5547f, MMPluginProviderConstants.PluginIntent.APP_PACKAGE_PATTERN)) {
                this.f5549h = true;
                this.f5542a.setAlpha(1.0f);
                this.f5543b.setAlpha(1.0f);
                return;
            }
            this.f5549h = false;
            this.f5542a.setAlpha(0.3f);
            this.f5543b.setAlpha(0.3f);
        }
    }

    /* renamed from: com.fimi.soul.biz.manager.p$b */
    /* loaded from: classes.dex */
    public interface AbstractC1994b {
        /* renamed from: a */
        void mo31687a(int i);
    }

    public C1982p(Context context) {
        this.f5532g = context;
    }

    /* renamed from: a */
    private boolean m33325a(String str) {
        return str.contains("http://");
    }

    /* renamed from: a */
    public void m33330a(Context context, String str, boolean z, ShareInfo shareInfo) {
        ShareSDK.initSDK(this.f5532g);
        C2510b c2510b = new C2510b();
        c2510b.m31461a(!z);
        if (str != null) {
            c2510b.m31441n(str);
        }
        c2510b.m31464a(EnumC2512d.CLASSIC);
        c2510b.m31452e();
        c2510b.m31454d();
        c2510b.m31457b(shareInfo.getTitle());
        if (m33325a(shareInfo.getUrl())) {
            c2510b.m31449f(shareInfo.getUrl());
        } else if (Twitter.NAME == str) {
            try {
                C3121e.m29105a(C3121e.m29102a(shareInfo.getUrl(), 480, 600), new File(C3129m.m29070a(), "tempImage.png"));
                c2510b.m31451e(C3129m.m29070a() + "/tempImage.png");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            c2510b.m31451e(shareInfo.getUrl());
        }
        c2510b.m31465a(new PlatformActionListener() { // from class: com.fimi.soul.biz.manager.p.4
            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onCancel(Platform platform, int i) {
                if (platform.getName() == Twitter.NAME) {
                    C3121e.m29093f(C3129m.m29070a() + "/tempImage.png");
                }
                C1982p.this.f5536k.sendEmptyMessage(2);
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                if (platform.getName() == Twitter.NAME) {
                    C3121e.m29093f(C3129m.m29070a() + "/tempImage.png");
                }
                C1982p.this.f5536k.sendEmptyMessage(1);
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onError(Platform platform, int i, Throwable th) {
                if (platform.getName() == Twitter.NAME) {
                    C3121e.m29093f(C3129m.m29070a() + "/tempImage.png");
                }
                C1982p.this.f5536k.sendEmptyMessage(3);
            }
        });
        c2510b.m31467a(BitmapFactory.decodeResource(context.getResources(), C1704R.C1705drawable.ic_launcher), "Mi Drone", new View.OnClickListener() { // from class: com.fimi.soul.biz.manager.p.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        c2510b.m31468a(context);
    }

    /* renamed from: a */
    public void m33329a(AbstractC1994b abstractC1994b) {
        this.f5534i = abstractC1994b;
    }

    /* renamed from: a */
    public void m33327a(ShareInfo shareInfo) {
        this.f5533h = shareInfo;
        new AlertDialogC1988a(this.f5532g, shareInfo).show();
    }

    /* renamed from: a */
    public void m33326a(ShareInfo shareInfo, String str) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setImagePath(shareInfo.getUrl());
        shareParams.setShareType(2);
        Platform platform = ShareSDK.getPlatform(str);
        platform.setPlatformActionListener(new PlatformActionListener() { // from class: com.fimi.soul.biz.manager.p.1
            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onCancel(Platform platform2, int i) {
                C1982p.this.f5536k.sendEmptyMessage(2);
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onComplete(Platform platform2, int i, HashMap<String, Object> hashMap) {
                C1982p.this.f5536k.sendEmptyMessage(1);
            }

            @Override // cn.sharesdk.framework.PlatformActionListener
            public void onError(Platform platform2, int i, Throwable th) {
                C1982p.this.f5536k.sendEmptyMessage(3);
            }
        });
        platform.share(shareParams);
    }
}
