package com.fimi.x1bh.module.setting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.AbstractC1493b;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.manager.C2015y;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.module.setting.C2932i;
import com.fimi.soul.module.update.FindOnlineFirmwareAvtivity;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.DialogC3245f;
import com.fimi.x1bh.module.X1bhBaseActivity;
import com.fimi.x1bh.module.about.CloudAboutActivity;
import com.fimi.x1bh.module.arrowkey.ArrowKeyActivity;
import com.fimi.x1bh.module.camerasetting.CloudCameraSettingActivity;
import com.fimi.x1bh.module.setting.C3374b;
import com.fimi.x1bh.module.update.X1bhFindNewFirmwareAvtivity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
/* loaded from: classes.dex */
public class CloudTerraceSettingActivity extends X1bhBaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    /* renamed from: j */
    private static int f13464j = 1;

    /* renamed from: k */
    private static final int f13465k = 5000;

    /* renamed from: n */
    private static final String f13466n = "CloudTerraceSettingActi";

    /* renamed from: b */
    List<UpdateVersonBean> f13468b;

    /* renamed from: c */
    private C3374b f13469c;

    /* renamed from: d */
    private C2015y f13470d;

    /* renamed from: e */
    private Button f13471e;

    /* renamed from: f */
    private TextView f13472f;

    /* renamed from: g */
    private ListView f13473g;

    /* renamed from: h */
    private List<C3373a> f13474h;

    /* renamed from: i */
    private C1827d f13475i;

    /* renamed from: a */
    List<FirmwareInfo> f13467a = null;

    /* renamed from: l */
    private Handler f13476l = new Handler() { // from class: com.fimi.x1bh.module.setting.CloudTerraceSettingActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == CloudTerraceSettingActivity.f13464j) {
                CloudTerraceSettingActivity.this.m28121a(CloudTerraceSettingActivity.this.f13475i);
                CloudTerraceSettingActivity.this.f13476l.sendEmptyMessageDelayed(CloudTerraceSettingActivity.f13464j, 5000L);
            }
        }
    };

    /* renamed from: m */
    private Observer f13477m = new Observer() { // from class: com.fimi.x1bh.module.setting.CloudTerraceSettingActivity.2
        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            if (CloudTerraceSettingActivity.this.f13469c != null) {
                CloudTerraceSettingActivity.this.f13469c.m28090a(CloudTerraceSettingActivity.this.f13474h);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m28121a(C1827d c1827d) {
        Log.i(f13466n, "enterMapSetting: ");
        CameraValue.PAGE_CAMERA_MENU_ALBUM = 2;
        if ("menu_album".equals("") || !c1827d.e()) {
            return;
        }
        c1827d.m33989u().m34054a("menu_album", C1831e.f4911cE);
    }

    /* renamed from: c */
    private void m28116c() {
        C3374b.EnumC3376a[] values;
        this.f13469c = new C3374b(this);
        this.f13474h = new ArrayList();
        for (C3374b.EnumC3376a enumC3376a : C3374b.EnumC3376a.values()) {
            for (int i = 0; i < C2932i.f10542d.length; i++) {
            }
            C3373a c3373a = new C3373a();
            c3373a.addObserver(this.f13477m);
            c3373a.m28102a((Boolean) true);
            c3373a.m28103a(enumC3376a);
            this.f13474h.add(c3373a);
        }
        this.f13467a = C3021a.m29616a().m29608d();
        this.f13468b = C3021a.m29616a().m29607e();
        this.f13469c.m28090a(this.f13474h);
        m28114d();
        this.f13473g.setAdapter((ListAdapter) this.f13469c);
        this.f13473g.setOnItemClickListener(this);
        this.f13470d = C2015y.m33256a(this);
        this.f13475i = (C1827d) C1783b.m34166a().m34150d();
        m28121a(this.f13475i);
        this.f13476l.sendEmptyMessageDelayed(f13464j, 5000L);
        m28108g();
    }

    /* renamed from: d */
    private void m28114d() {
        this.f13474h.get(this.f13469c.m28093a(C3374b.EnumC3376a.XIAOMI_ACCOUNT)).m28102a((Boolean) true);
        this.f13474h.get(this.f13469c.m28093a(C3374b.EnumC3376a.XIAOMI_ACCOUNT)).m28101a(C1756a.m34259c(this).getXiaomiID());
    }

    /* renamed from: e */
    private void m28112e() {
        getWindow().addFlags(256);
        getWindow().addFlags(512);
        this.f13471e = (Button) findViewById(C1704R.C1706id.black_btn);
        this.f13472f = (TextView) findViewById(C1704R.C1706id.tv_settingTitle);
        this.f13473g = (ListView) findViewById(C1704R.C1706id.setting_lv);
        this.f13471e.setOnClickListener(this);
        C3103au.m29232a(getAssets(), this.f13472f);
    }

    /* renamed from: f */
    private void m28110f() {
        if (this.preferencesUtil.m34546a().contains("isfirstloading")) {
            new DialogC3245f.C3246a(this).m28641a(getString(C1704R.C1707string.log_out)).m28633c(17).m28644a(getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(getString(C1704R.C1707string.exit), new DialogInterface.OnClickListener() { // from class: com.fimi.x1bh.module.setting.CloudTerraceSettingActivity.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    C1756a.m34265a(CloudTerraceSettingActivity.this);
                    ((C3373a) CloudTerraceSettingActivity.this.f13474h.get(CloudTerraceSettingActivity.this.f13469c.m28093a(C3374b.EnumC3376a.XIAOMI_ACCOUNT))).m28102a((Boolean) false);
                    CloudTerraceSettingActivity.this.f13469c.m28090a(CloudTerraceSettingActivity.this.f13474h);
                    CloudTerraceSettingActivity.this.f13470d.m33244b(C1756a.m34259c(CloudTerraceSettingActivity.this), new AbstractC1945k() { // from class: com.fimi.x1bh.module.setting.CloudTerraceSettingActivity.4.1
                        @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                        /* renamed from: a */
                        public void mo28106a(PlaneMsg planeMsg, File file) {
                        }
                    });
                    CloudTerraceSettingActivity.this.preferencesUtil.m34546a().edit().putBoolean(C1756a.f4519L, false).commit();
                    Intent intent = new Intent(CloudTerraceSettingActivity.this, LoginActivity.class);
                    intent.putExtra(AbstractC1493b.f3577j, 4);
                    CloudTerraceSettingActivity.this.startActivity(intent);
                    CloudTerraceSettingActivity.this.finish();
                    CloudTerraceSettingActivity.this.overridePendingTransition(17432576, 17432577);
                }
            }).m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.x1bh.module.setting.CloudTerraceSettingActivity.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).m28645a().show();
            return;
        }
        this.preferencesUtil.m34546a().edit().putBoolean(C1756a.f4519L, true).commit();
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra(AbstractC1493b.f3577j, 4);
        startActivity(intent);
    }

    /* renamed from: g */
    private void m28108g() {
        this.f13474h.get(this.f13469c.m28093a(C3374b.EnumC3376a.FIRMWARE_UPDATE)).m28100a(true);
        if (m28107h() || (this.f13467a != null && this.f13467a.size() > 0)) {
            this.f13474h.get(this.f13469c.m28093a(C3374b.EnumC3376a.FIRMWARE_UPDATE)).m28098b(true);
        } else {
            this.f13474h.get(this.f13469c.m28093a(C3374b.EnumC3376a.FIRMWARE_UPDATE)).m28098b(false);
        }
    }

    /* renamed from: h */
    private boolean m28107h() {
        return this.f13468b != null && this.f13468b.size() > 0;
    }

    /* renamed from: a */
    public void m28122a() {
        Log.i(f13466n, "quitMapSetting: ");
        CameraValue.PAGE_CAMERA_MENU_ALBUM = 0;
        if (!"menu_album".equals("")) {
            C1827d c1827d = (C1827d) C1783b.m34166a().m34150d();
            if (!c1827d.e()) {
                return;
            }
            c1827d.m33989u().m34054a("menu_album", "off");
        }
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.p148c.AbstractC1522a
    /* renamed from: a */
    public void mo28082a(String str) {
        super.mo28082a(str);
        Log.d(f13466n, "onConnected: " + Thread.currentThread().getName());
        this.f13474h.get(this.f13469c.m28093a(C3374b.EnumC3376a.CONNECT_PLANE)).m28100a(false);
        this.f13469c.notifyDataSetChanged();
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.p148c.AbstractC1522a
    /* renamed from: b */
    public void mo28051b(String str) {
        super.mo28051b(str);
        Log.d(f13466n, "onDisconnect: " + Thread.currentThread().getName());
        this.f13474h.get(this.f13469c.m28093a(C3374b.EnumC3376a.CONNECT_PLANE)).m28100a(true);
        this.f13469c.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C1704R.C1706id.black_btn) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_cloud_terrace_setting);
        this.dpa.m34276b(this);
        m28112e();
        m28116c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f13476l != null) {
            this.f13476l.removeMessages(f13464j);
        }
        m28122a();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C3374b.EnumC3376a m28096d = this.f13474h.get(i).m28096d();
        if (m28096d == C3374b.EnumC3376a.XIAOMI_ACCOUNT) {
            m28110f();
        } else if (m28096d == C3374b.EnumC3376a.ARROW_KEY_SET) {
            startActivity(new Intent(this, ArrowKeyActivity.class));
        } else if (m28096d == C3374b.EnumC3376a.CAMERA_SETTING) {
            startActivity(new Intent(this, CloudCameraSettingActivity.class));
        } else if (m28096d == C3374b.EnumC3376a.CONNECT_PLANE) {
            if (!this.f13474h.get(this.f13469c.m28093a(C3374b.EnumC3376a.CONNECT_PLANE)).m28095e()) {
                return;
            }
            C1827d c1827d = (C1827d) C1783b.m34166a().m34150d();
            c1827d.n();
            c1827d.a(-1);
            if (this.f13476l != null) {
                this.f13476l.removeMessages(f13464j);
            }
            m28122a();
            this.preferencesUtil.m34546a().edit().putBoolean(C1756a.f4519L, false).commit();
            Intent intent = new Intent(this, LoginActivity.class);
            if (C1642c.m34885e().m34499r() == 0) {
                intent.putExtra(AbstractC1493b.f3577j, 2);
            } else {
                intent.putExtra(AbstractC1493b.f3577j, 3);
            }
            startActivity(intent);
            overridePendingTransition(17432576, 17432577);
        } else if (m28096d != C3374b.EnumC3376a.FIRMWARE_UPDATE) {
            if (m28096d != C3374b.EnumC3376a.ABOUT) {
                return;
            }
            startActivity(new Intent(this, CloudAboutActivity.class));
        } else if (!this.f13474h.get(this.f13469c.m28093a(C3374b.EnumC3376a.FIRMWARE_UPDATE)).m28095e()) {
        } else {
            if (m28107h()) {
                C1645c.m34884a().mo34877a(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, (List) this.f13468b);
                Intent intent2 = new Intent(this, FindOnlineFirmwareAvtivity.class);
                CameraValue.isFindFirmware = true;
                startActivity(intent2);
            } else if (this.f13467a == null || this.f13467a.size() <= 0) {
                C1688z.m34450a(this, (int) C1704R.C1707string.version_tip);
            } else {
                Intent intent3 = new Intent(this, X1bhFindNewFirmwareAvtivity.class);
                CameraValue.isFindFirmware = true;
                startActivity(intent3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (((C1827d) C1783b.m34166a().m34150d()).s()) {
            this.f13474h.get(this.f13469c.m28093a(C3374b.EnumC3376a.CONNECT_PLANE)).m28100a(false);
        } else {
            this.f13474h.get(this.f13469c.m28093a(C3374b.EnumC3376a.CONNECT_PLANE)).m28100a(true);
        }
    }
}
