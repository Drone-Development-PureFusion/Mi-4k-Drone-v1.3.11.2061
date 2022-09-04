package com.fimi.x1bh.module.update;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.p158b.p161c.AbstractC1625d;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.progress.ProgressView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.p141a.C1492d;
import com.fimi.p148c.AbstractC1524c;
import com.fimi.p154g.C1555c;
import com.fimi.p155h.C1566c;
import com.fimi.p155h.C1567d;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import com.fimi.soul.biz.camera.p174c.C1820d;
import com.fimi.soul.biz.p181i.C1867a;
import com.fimi.soul.biz.update.AbstractC2077i;
import com.fimi.soul.biz.update.C2037a;
import com.fimi.soul.biz.update.C2058d;
import com.fimi.soul.biz.update.C2080l;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.module.update.C3030c;
import com.fimi.soul.module.update.UpgradeResultActivity;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.utils.C3103au;
import com.fimi.x1bh.module.X1bhBaseActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class X1bhUpgradingActivity extends X1bhBaseActivity implements AbstractC1792f<X11RespCmd>, C3030c.AbstractC3032a {

    /* renamed from: H */
    private static final String f13563H = "X1bhUpgradingActivity";

    /* renamed from: a */
    public static final String f13564a = "sp_upgrade_skip";

    /* renamed from: m */
    private static final int f13565m = 153;

    /* renamed from: n */
    private static final int f13566n = 256;

    /* renamed from: o */
    private static final int f13567o = 136;

    /* renamed from: p */
    private static final int f13568p = 50;

    /* renamed from: r */
    private static int f13569r = 1;

    /* renamed from: s */
    private static final int f13570s = 119;

    /* renamed from: t */
    private static final int f13571t = 102;

    /* renamed from: A */
    private boolean f13572A;

    /* renamed from: C */
    private boolean f13574C;

    /* renamed from: D */
    private TextView f13575D;

    /* renamed from: E */
    private boolean f13576E;

    /* renamed from: F */
    private C1555c f13577F;

    /* renamed from: G */
    private List<C1566c> f13578G;

    /* renamed from: J */
    private Toast f13580J;

    /* renamed from: b */
    List<FirmwareInfo> f13581b;

    /* renamed from: e */
    long f13584e;

    /* renamed from: f */
    private ProgressView f13585f;

    /* renamed from: g */
    private TextView f13586g;

    /* renamed from: h */
    private ImageView f13587h;

    /* renamed from: i */
    private C2083a f13588i;

    /* renamed from: j */
    private TextView f13589j;

    /* renamed from: k */
    private TextView f13590k;

    /* renamed from: l */
    private TextView f13591l;

    /* renamed from: u */
    private boolean f13593u;

    /* renamed from: z */
    private C2058d f13598z;

    /* renamed from: q */
    private final int f13592q = 32;

    /* renamed from: v */
    private int f13594v = 0;

    /* renamed from: w */
    private int f13595w = 0;

    /* renamed from: x */
    private int f13596x = 0;

    /* renamed from: c */
    C2037a f13582c = null;

    /* renamed from: y */
    private C1827d f13597y = null;

    /* renamed from: d */
    C3030c f13583d = null;

    /* renamed from: B */
    private StringBuffer f13573B = null;

    /* renamed from: I */
    private AbstractC1524c f13579I = new AbstractC1524c() { // from class: com.fimi.x1bh.module.update.X1bhUpgradingActivity.4
        @Override // com.fimi.p148c.AbstractC1524c
        /* renamed from: a */
        public void mo28034a() {
        }

        @Override // com.fimi.p148c.AbstractC1524c
        /* renamed from: a */
        public void mo28033a(long j, long j2) {
            Log.i(X1bhUpgradingActivity.f13563H, "onProcess:" + j + " " + j2 + " " + ((int) ((100 * j2) / j)));
            X1bhUpgradingActivity.this.m28063a(153, (int) j2, (int) j);
        }

        @Override // com.fimi.p148c.AbstractC1524c
        /* renamed from: a */
        public void mo28032a(String str) {
        }

        @Override // com.fimi.p148c.AbstractC1524c
        /* renamed from: a */
        public void mo28031a(String str, List<C1566c> list) {
            Log.i(X1bhUpgradingActivity.f13563H, "onRestart: ");
            Message message = new Message();
            message.what = 102;
            X1bhUpgradingActivity.this.getHandler().sendMessage(message);
        }

        @Override // com.fimi.p148c.AbstractC1524c
        /* renamed from: a */
        public void mo28030a(List<C1566c> list) {
            for (int i = 0; i < list.size(); i++) {
                for (int i2 = 0; i2 < X1bhUpgradingActivity.this.f13581b.size(); i2++) {
                    if (list.get(i).m35118e() == X1bhUpgradingActivity.this.f13581b.get(i2).getSysId()) {
                        Log.i(X1bhUpgradingActivity.f13563H, "onRestart: index:" + i);
                        X1bhUpgradingActivity.this.f13581b.get(i2).setIsUpgradeSuccess(Boolean.valueOf(list.get(i).m35129a()));
                    }
                }
            }
        }

        @Override // com.fimi.p148c.AbstractC1524c
        /* renamed from: a */
        public void mo28029a(boolean z, String str) {
        }

        @Override // com.fimi.p148c.AbstractC1524c
        /* renamed from: b */
        public void mo28028b(String str) {
            Log.i(X1bhUpgradingActivity.f13563H, "onSendError: msg:" + str);
        }

        @Override // com.fimi.p148c.AbstractC1524c
        /* renamed from: c */
        public void mo28027c(String str) {
            if (X1bhUpgradingActivity.this.m28065a()) {
                X1bhUpgradingActivity.m28048c(X1bhUpgradingActivity.this);
            }
            X1bhUpgradingActivity.this.getHandler().sendEmptyMessage(119);
            Log.i(X1bhUpgradingActivity.f13563H, "onCurrentUpgrade: info:" + str);
        }

        @Override // com.fimi.p148c.AbstractC1524c
        /* renamed from: d */
        public void mo28026d(String str) {
            Log.i(X1bhUpgradingActivity.f13563H, "onInterrupt: ");
            Message message = new Message();
            message.what = 6;
            message.obj = str;
            X1bhUpgradingActivity.this.getHandler().sendMessage(message);
            X1bhUpgradingActivity.this.f13577F = null;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m28063a(int i, int i2, int i3) {
        if (System.currentTimeMillis() - this.f13584e > 500 || i2 == i3 || i == 256) {
            Log.i(f13563H, "updateProgress: ");
            this.f13584e = System.currentTimeMillis();
            Message message = new Message();
            message.what = i;
            message.arg1 = i2;
            message.arg2 = i3;
            getHandler().sendMessageDelayed(message, 50L);
        }
    }

    /* renamed from: b */
    private void m28054b() {
        this.f13581b = C3021a.m29616a().m29608d();
        if (this.f13581b == null || this.f13581b.size() == 0) {
            finish();
            return;
        }
        this.f13591l.setText(getResources().getString(C1704R.C1707string.upgrading_firmware) + this.f13581b.get(0).getSysName());
        this.f13596x = this.f13581b.size();
        this.f13594v = this.f13581b.size() * 100;
        this.f13585f.setMaxCount(this.f13594v);
        FirmwareInfo firmwareInfo = this.f13581b.get(0);
        if (firmwareInfo.getSysId() != 4 && firmwareInfo.getSysId() != 13) {
            m28058a(this.f13581b);
            return;
        }
        this.f13583d.m29529a();
        m28053b(firmwareInfo.getSysId());
    }

    /* renamed from: b */
    private void m28053b(final int i) {
        new Thread(new Runnable() { // from class: com.fimi.x1bh.module.update.X1bhUpgradingActivity.1
            @Override // java.lang.Runnable
            public void run() {
                C2080l.m33050c("request camera upgrade:" + i);
                if (i == 13) {
                    X1bhUpgradingActivity.this.f13595w = 1;
                    C1820d m33988v = X1bhUpgradingActivity.this.f13597y.m33988v();
                    C2058d unused = X1bhUpgradingActivity.this.f13598z;
                    m33988v.m34010h(C2058d.m33108c());
                }
            }
        }).start();
    }

    /* renamed from: b */
    private void m28050b(boolean z) {
        Log.i(f13563H, "upgradeNextFirmware: ");
        this.f13581b.get(0).setIsUpgradeSuccess(Boolean.valueOf(z));
        if (this.f13596x > 1) {
            m28058a(this.f13581b);
        } else {
            m28045e();
        }
    }

    /* renamed from: c */
    static /* synthetic */ int m28048c(X1bhUpgradingActivity x1bhUpgradingActivity) {
        int i = x1bhUpgradingActivity.f13595w;
        x1bhUpgradingActivity.f13595w = i + 1;
        return i;
    }

    /* renamed from: c */
    private void m28049c() {
        this.f13583d = new C3030c(0, this);
        this.f13573B = new StringBuffer();
        f13569r = 1;
        this.f13582c = new C2037a();
        this.f13598z = new C2058d();
        this.f13597y = (C1827d) C1783b.m34166a().m34150d();
        this.f13574C = false;
        this.f13597y.c(false);
        this.f13597y.a(this);
        this.f13597y.c(new AbstractC1625d() { // from class: com.fimi.x1bh.module.update.X1bhUpgradingActivity.2
            @Override // com.fimi.kernel.p158b.p161c.AbstractC1625d
            /* renamed from: a */
            public void mo28036a(String str) {
            }
        });
        this.f13597y.m33988v().m34031a(new AbstractC2077i() { // from class: com.fimi.x1bh.module.update.X1bhUpgradingActivity.3
            @Override // com.fimi.soul.biz.update.AbstractC2077i
            /* renamed from: a */
            public void mo28035a(boolean z, long j, long j2, int i) {
                C2080l.m33050c("uplaod file progress:" + ((100 * j) / j2) + "%");
                if (!X1bhUpgradingActivity.this.f13597y.m33988v().m34013g()) {
                    X1bhUpgradingActivity.this.f13583d.m29526b();
                    X1bhUpgradingActivity.this.m28063a(153, (int) j, (int) j2);
                }
            }
        });
        C2080l.m33042f();
        this.f13588i = ((DroidPlannerApp) getApplication()).f4493a;
    }

    /* renamed from: d */
    private void m28047d() {
        C2080l.m33050c(C1831e.f4881bb);
        this.f13574C = true;
        m28050b(true);
    }

    /* renamed from: e */
    private void m28045e() {
        Log.i(f13563H, "sendOverPackage: ");
        this.f13597y.m33988v().m34018d("");
        m28039i();
    }

    /* renamed from: f */
    private void m28043f() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        f13569r = 0;
        m28039i();
    }

    /* renamed from: g */
    private void m28041g() {
        if (this.f13572A) {
            C1688z.m34448a(this, this.f13573B.toString() + getResources().getString(C1704R.C1707string.updatefail));
        } else {
            C1688z.m34450a(this, (int) C1704R.C1707string.upgrade_firmware_success);
        }
    }

    /* renamed from: h */
    private void m28040h() {
        this.f13572A = true;
        this.f13574C = true;
        this.f13597y.m33988v().m34026a(true);
        getHandler().sendEmptyMessageDelayed(32, 50L);
    }

    /* renamed from: i */
    private void m28039i() {
        Intent intent = new Intent(this, UpgradeResultActivity.class);
        intent.putExtra(UpgradeResultActivity.f11131a, (Serializable) this.f13581b);
        startActivity(intent);
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    /* renamed from: j */
    private void m28038j() {
        if (this.f13583d != null) {
            this.f13583d.m29523d();
        }
    }

    /* renamed from: k */
    private void m28037k() {
        if (!this.f13593u) {
            this.f13593u = true;
            this.f13580J = Toast.makeText(getApplicationContext(), (int) C1704R.C1707string.upgrading_not_disconnect, 0);
            this.f13580J.show();
            getHandler().sendEmptyMessageDelayed(136, 2000L);
            return;
        }
        this.f13597y.m33988v().m34026a(true);
        this.f13580J.cancel();
        startActivity(new Intent(this, X1bhFindNewFirmwareAvtivity.class));
        DroidPlannerApp.f4489f = false;
        finish();
    }

    /* renamed from: a */
    public void m28064a(int i) {
        this.f13595w = i;
    }

    /* renamed from: a */
    public void m28058a(List<FirmwareInfo> list) {
        this.f13578G = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                this.f13577F = new C1555c(this.f13578G);
                this.f13577F.m35179a(this.f13579I);
                this.f13577F.m35182a();
                return;
            }
            if (list.get(i2).getSysId() != 13) {
                C1566c c1566c = new C1566c();
                c1566c.m35127a(list.get(i2).getSysId());
                if (c1566c.m35118e() == C1492d.f3565a) {
                    c1566c.m35128a((byte) 2);
                    c1566c.m35125a(C1567d.m35115a().m35114a(C1492d.f3565a));
                    c1566c.m35121b(list.get(i2).getFwPath());
                } else if (c1566c.m35118e() == C1492d.f3566b) {
                    c1566c.m35128a((byte) 3);
                    c1566c.m35125a(C1567d.m35115a().m35114a(C1492d.f3566b));
                    c1566c.m35121b(list.get(i2).getFwPath());
                } else if (c1566c.m35118e() == C1492d.f3567c) {
                    c1566c.m35128a((byte) 2);
                    c1566c.m35125a(C1567d.m35115a().m35114a(C1492d.f3567c));
                    c1566c.m35121b(list.get(i2).getFwPath());
                }
                this.f13578G.add(c1566c);
            }
            i = i2 + 1;
        }
    }

    @Override // com.fimi.soul.module.update.C3030c.AbstractC3032a
    /* renamed from: a */
    public void mo28057a(boolean z) {
        if (z) {
            this.f13574C = true;
            m28050b(false);
        }
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        if (z) {
            x11RespCmd.getMsg_id();
            if (!x11RespCmd.isNotification()) {
                return;
            }
            if (C1831e.f4826aZ.equals(x11RespCmd.getType())) {
                Log.i(f13563H, "onProcessed:put_file_complete ");
                this.f13583d.m29526b();
                C2080l.m33050c(C1831e.f4826aZ);
            }
            if (C1831e.f4882bc.equals(x11RespCmd.getType())) {
                Log.i(f13563H, "onProcessed:fw_upgrade_complete ");
                this.f13583d.m29523d();
                if (this.f13574C) {
                    this.f13581b.get(0).setIsUpgradeSuccess(true);
                } else {
                    m28047d();
                }
            }
            if (C1831e.f4883bd.equals(x11RespCmd.getType())) {
                Log.i(f13563H, "onProcessed:fw_unzip_finish ");
            }
            if (C1831e.f4886bg.equals(x11RespCmd.getType())) {
                Log.i(f13563H, "onProcessed:fw_unzipping ");
                C2080l.m33050c(C1831e.f4886bg);
            }
            if (x11RespCmd.getType().contains(C1831e.f4884be)) {
                Log.i(f13563H, "onProcessed:progress ");
            }
            if (!x11RespCmd.getType().contains(C1831e.f4880ba)) {
                return;
            }
            Log.i(f13563H, "onProcessed:progress ");
            this.f13583d.m29523d();
            this.f13574C = true;
            m28050b(false);
        }
    }

    /* renamed from: a */
    public boolean m28065a() {
        return this.f13596x > this.f13595w;
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.p148c.AbstractC1522a
    /* renamed from: b */
    public void mo28051b(String str) {
        super.mo28051b(str);
        m28039i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DroidPlannerApp.f4489f = true;
        CameraValue.isUpdate = true;
        this.dpa.m34276b(this);
        this.preferencesUtil = C1681v.m34543a(this);
        getWindow().setFlags(128, 128);
        setContentView(C1704R.layout.activity_upgrading);
        this.f13576E = getIntent().getBooleanExtra("isForce", false);
        this.f13585f = (ProgressView) findViewById(C1704R.C1706id.progress_view);
        this.f13586g = (TextView) findViewById(C1704R.C1706id.tv_progress);
        C3103au.m29218b(getAssets(), this.f13586g);
        this.f13587h = (ImageView) findViewById(C1704R.C1706id.img_anim);
        this.f13591l = (TextView) findViewById(C1704R.C1706id.upgrade_result);
        this.f13575D = (TextView) findViewById(C1704R.C1706id.upgrading_warning);
        C3103au.m29232a(getAssets(), this.f13591l, this.f13575D);
        this.f13589j = (TextView) findViewById(C1704R.C1706id.tv_percent);
        this.f13590k = (TextView) findViewById(C1704R.C1706id.upgrading_warning);
        this.f13590k.setText(C1704R.C1707string.clould_upgrade_check_warm_prompt);
        C3103au.m29218b(getAssets(), this.f13589j, this.f13590k);
        this.f13595w = 0;
        m28049c();
        m28054b();
        C1867a.m33847a().m33841a(getLocalClassName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m28038j();
    }

    @Override // com.fimi.kernel.BaseActivity
    public void onHandleMessage(Message message) {
        if (message.what == 153) {
            this.f13591l.setText(getResources().getString(C1704R.C1707string.upgrading_firmware) + this.f13581b.get(this.f13595w - 1).getSysName());
            int i = ((int) (((message.arg1 * 1.0f) / message.arg2) * 100.0f)) + ((this.f13595w - 1) * 100);
            this.f13586g.setText(((i * 100) / this.f13594v) + "");
            Log.i(f13563H, "onHandleMessage: progress:" + i + ",arg1:" + message.arg1 + ",arg2:" + message.arg2 + ",seq:" + this.f13595w + ",maxCount:" + this.f13594v);
            this.f13585f.setCurrentCount(i);
        } else if (message.what != 256 && message.what == 119) {
            this.f13591l.setText(getResources().getString(C1704R.C1707string.upgrading_firmware) + this.f13581b.get(this.f13595w - 1).getSysName());
        }
        if (message.what == 136) {
            this.f13593u = false;
        }
        if (message.what == 102) {
            if (this.f13581b.get(0).getSysId() == 13) {
                Log.i(f13563H, "onHandleMessage: sUPGRADE_SUCCESS");
                this.f13597y.m33988v().m34018d("");
            }
            m28039i();
        }
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (!this.f13576E) {
                m28037k();
            }
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (f13569r == 0) {
            f13569r = 0;
            m28039i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f13587h.setBackgroundResource(C1704R.C1705drawable.update_anim);
        ((AnimationDrawable) this.f13587h.getBackground()).start();
    }
}
