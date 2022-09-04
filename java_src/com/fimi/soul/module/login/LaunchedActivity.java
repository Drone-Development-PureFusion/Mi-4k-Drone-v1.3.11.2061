package com.fimi.soul.module.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1685x;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.AbstractC1493b;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.manager.C2015y;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.service.InitAppService;
import com.fimi.soul.utils.C3075ad;
import com.fimi.soul.utils.C3103au;
import java.io.File;
/* loaded from: classes.dex */
public class LaunchedActivity extends BaseActivity implements Handler.Callback {

    /* renamed from: e */
    private static final int f9737e = 2;

    /* renamed from: f */
    private static final int f9738f = 3;

    /* renamed from: b */
    Intent f9740b;

    /* renamed from: c */
    C1681v f9741c;

    /* renamed from: g */
    private Context f9743g;

    /* renamed from: h */
    private C2015y f9744h;

    /* renamed from: i */
    private Handler f9745i;

    /* renamed from: k */
    private TextView f9747k;

    /* renamed from: l */
    private TextView f9748l;

    /* renamed from: d */
    private final int f9742d = 500;

    /* renamed from: j */
    private boolean f9746j = false;

    /* renamed from: a */
    boolean f9739a = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m30287a(boolean z) {
        this.f9746j = z;
        Message message = new Message();
        message.obj = Boolean.valueOf(this.f9746j);
        message.what = 2;
        this.f9745i.sendMessageDelayed(message, 500L);
    }

    /* renamed from: b */
    private void m30285b(boolean z) {
        if (this.f9739a) {
            return;
        }
        C3103au.m29191k(this);
        this.f9739a = true;
        this.f9745i.removeMessages(2);
        this.f9745i.removeMessages(3);
        Intent intent = new Intent(this, LoginActivity.class);
        if (z) {
            intent.putExtra(AbstractC1493b.f3577j, 4);
        } else if (C1642c.m34885e().m34499r() == 0) {
            intent.putExtra(AbstractC1493b.f3577j, 2);
        } else {
            intent.putExtra(AbstractC1493b.f3577j, 3);
        }
        intent.putExtra("islaunchexit", true);
        Bundle bundleExtra = getIntent().getBundleExtra("launchBundle");
        if (bundleExtra != null) {
            Bundle bundle = new Bundle();
            bundle.putString("redirectURL", bundleExtra.getString("redirectURL"));
            bundle.putBoolean("islaunch", true);
            intent.putExtra("launchBundle", bundle);
        }
        startActivity(intent);
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        m30285b(((Boolean) message.obj).booleanValue());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!isTaskRoot()) {
            finish();
            return;
        }
        setContentView(C1704R.layout.activity_launch);
        C3075ad.m29357d();
        this.f9741c = C1681v.m34543a(this);
        this.f9741c.m34546a().edit().putBoolean(C1756a.f4519L, false).commit();
        this.f9745i = new Handler(this);
        this.mTintManager.m34486a(true, (Activity) this);
        this.f9743g = this;
        this.f9740b = new Intent(this, InitAppService.class);
        startService(this.f9740b);
        Message message = new Message();
        message.obj = Boolean.valueOf(!this.f9741c.m34546a().contains("isfirstloading"));
        message.what = 3;
        this.f9745i.sendMessageDelayed(message, 2000L);
        this.f9747k = (TextView) findViewById(C1704R.C1706id.launch_center_tv);
        this.f9748l = (TextView) findViewById(C1704R.C1706id.launch_bottom_tv);
        C3103au.m29232a(getAssets(), this.f9747k, this.f9748l);
        MyLocationManager.m33443a(this.f9743g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f9739a = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f9739a = false;
        C1685x.m34457a(new Runnable() { // from class: com.fimi.soul.module.login.LaunchedActivity.1
            @Override // java.lang.Runnable
            public void run() {
                LaunchedActivity.this.f9744h = C2015y.m33256a(LaunchedActivity.this.f9743g);
                LaunchedActivity.this.speakTTs.m34870a();
                if (!LaunchedActivity.this.f9741c.m34546a().contains("isfirstloading")) {
                    LaunchedActivity.this.m30287a(true);
                } else if (C3103au.m29221b(LaunchedActivity.this)) {
                    LaunchedActivity.this.f9744h.m33255a(LaunchedActivity.this.f9743g, new AbstractC1945k() { // from class: com.fimi.soul.module.login.LaunchedActivity.1.1
                        @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                        /* renamed from: a */
                        public void mo28106a(PlaneMsg planeMsg, File file) {
                            LaunchedActivity.this.m30287a(false);
                        }
                    });
                } else {
                    C1756a.m34260b(LaunchedActivity.this.f9743g);
                    LaunchedActivity.this.m30287a(false);
                }
            }
        });
    }
}
