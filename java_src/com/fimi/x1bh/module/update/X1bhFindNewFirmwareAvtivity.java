package com.fimi.x1bh.module.update;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1663g;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p149d.p150a.C1526a;
import com.fimi.p152e.C1549d;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.update.C2080l;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.p168b.C1731d;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.view.DialogC3245f;
import com.fimi.soul.view.TranslationView;
import com.fimi.x1bh.module.X1bhBaseActivity;
import com.fimi.x1bh.module.main.CloudTerraceMainActivity;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class X1bhFindNewFirmwareAvtivity extends X1bhBaseActivity implements View.OnClickListener, AbstractC1792f<X11RespCmd> {

    /* renamed from: a */
    public static final String f13511a = "upgrade_firmwares";

    /* renamed from: x */
    private static final int f13512x = 135;

    /* renamed from: y */
    private static final String f13513y = "X1bhFindNewFirmwareAvti";

    /* renamed from: d */
    TranslationView f13516d;

    /* renamed from: e */
    TextView f13517e;

    /* renamed from: f */
    TextView f13518f;

    /* renamed from: g */
    private Button f13519g;

    /* renamed from: h */
    private Button f13520h;

    /* renamed from: i */
    private Button f13521i;

    /* renamed from: j */
    private Context f13522j;

    /* renamed from: k */
    private int f13523k;

    /* renamed from: l */
    private Boolean f13524l;

    /* renamed from: n */
    private boolean f13526n;

    /* renamed from: o */
    private C1681v f13527o;

    /* renamed from: q */
    private C1526a f13529q;

    /* renamed from: r */
    private ListView f13530r;

    /* renamed from: s */
    private TextView f13531s;

    /* renamed from: t */
    private C1731d f13532t;

    /* renamed from: u */
    private boolean f13533u;

    /* renamed from: v */
    private boolean f13534v;

    /* renamed from: b */
    boolean f13514b = false;

    /* renamed from: m */
    private C1827d f13525m = null;

    /* renamed from: c */
    List<FirmwareInfo> f13515c = null;

    /* renamed from: p */
    private String f13528p = C1756a.f4519L;

    /* renamed from: w */
    private EnumC3380a f13535w = EnumC3380a.IDILE;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.x1bh.module.update.X1bhFindNewFirmwareAvtivity$a */
    /* loaded from: classes.dex */
    public enum EnumC3380a {
        IDILE,
        TF_CARD_NO_UPGRADE_PLEASE_REPLACE,
        TF_CARD_ERROR_NO_UPGRADE,
        CAMERA_RECORDING,
        TF_CARD_CAPACITY,
        HAND_LOW_BATTERY,
        NO_TF_CARD_NO_UPGRADE,
        CARD_PARAMETERS_ERROR,
        UPGRADING,
        CALIBRATION,
        DIS_CONNECT_HANDLE
    }

    /* renamed from: a */
    private void m28085a(EnumC3380a enumC3380a) {
        Log.i(f13513y, "cleanState: " + enumC3380a + ",mState:" + this.f13535w);
        if (this.f13535w == enumC3380a) {
            Log.i(f13513y, "cleanState1: " + this.f13535w);
            this.f13531s.setText(C1704R.C1707string.confirm_all_connection2);
            this.f13535w = EnumC3380a.IDILE;
            m28073i();
        }
    }

    /* renamed from: a */
    private void m28084a(EnumC3380a enumC3380a, int i) {
        if (this.f13535w == enumC3380a) {
            return;
        }
        Log.i(f13513y, "setState: state:" + enumC3380a);
        this.f13535w = enumC3380a;
        this.f13531s.setText(i);
        m28072j();
    }

    /* renamed from: f */
    private void m28076f() {
        int i;
        if (this.f13515c == null || this.f13515c.size() <= 0) {
            i = 0;
        } else {
            i = 0;
            for (int i2 = 0; i2 < this.f13515c.size(); i2++) {
                FirmwareInfo firmwareInfo = this.f13515c.get(i2);
                if (firmwareInfo.getSysId() == 4 || firmwareInfo.getSysId() == 13) {
                    this.f13514b = true;
                }
                i += firmwareInfo.getUpdateTime();
            }
        }
        this.f13526n = C1772d.m34208a().m34187k();
        this.f13525m = (C1827d) C1783b.m34166a().m34150d();
        this.f13525m.a(this);
        if (!this.f13525m.e() && this.drone.mo32904af()) {
            this.f13525m.m33987w().m33996b();
        }
        if (this.f13514b && this.f13525m.e()) {
            this.f13525m.m33989u().m34046d(C1831e.f4927cU);
        }
        String string = getString(C1704R.C1707string.down_firmwares_detail_ex);
        getString(C1704R.C1707string.update_firmwares_detail_ex);
        C2080l.m33065a(i);
        this.f13518f.setText(String.format(string, C2080l.m33048d()));
    }

    /* renamed from: g */
    private void m28075g() {
        if (this.f13535w == EnumC3380a.CARD_PARAMETERS_ERROR) {
            m28077e();
            return;
        }
        Intent intent = new Intent(this.f13522j, X1bhUpgradingActivity.class);
        intent.putExtra("isForce", this.f13533u);
        startActivity(intent);
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    /* renamed from: h */
    private void m28074h() {
        m28085a(EnumC3380a.CAMERA_RECORDING);
        m28085a(EnumC3380a.NO_TF_CARD_NO_UPGRADE);
        m28085a(EnumC3380a.TF_CARD_NO_UPGRADE_PLEASE_REPLACE);
        m28085a(EnumC3380a.TF_CARD_ERROR_NO_UPGRADE);
        m28085a(EnumC3380a.CARD_PARAMETERS_ERROR);
        m28085a(EnumC3380a.UPGRADING);
        if (this.f13525m.j().getFreeKBSpace() == 0) {
            this.f13525m.m33989u().m34046d(C1831e.f4927cU);
        } else if (!m28080b()) {
            m28084a(EnumC3380a.TF_CARD_CAPACITY, C1704R.C1707string.camera_tf_space_detail);
        } else {
            m28085a(EnumC3380a.TF_CARD_CAPACITY);
        }
    }

    /* renamed from: i */
    private void m28073i() {
        this.f13520h.setTextColor(-419430401);
        this.f13521i.setTextColor(-419430401);
        this.f13520h.setClickable(true);
        this.f13521i.setClickable(true);
    }

    /* renamed from: j */
    private void m28072j() {
        this.f13520h.setTextColor(872415231);
        this.f13521i.setTextColor(872415231);
        this.f13520h.setClickable(false);
        this.f13521i.setClickable(false);
    }

    /* renamed from: a */
    public void m28087a() {
        if (this.f13534v) {
            this.f13531s.setText(getString(C1704R.C1707string.confirm_all_connection3));
        } else {
            this.f13531s.setText(getString(C1704R.C1707string.confirm_all_connection2));
        }
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.p148c.AbstractC1523b
    /* renamed from: a */
    public void mo28086a(int i, C1508c c1508c) {
        super.mo28086a(i, c1508c);
        switch (i) {
            case 65:
                AbstractC1507b m35463g = c1508c.m35463g();
                if (!(m35463g instanceof C1526a)) {
                    return;
                }
                getHandler().obtainMessage(135, (C1526a) m35463g).sendToTarget();
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.p148c.AbstractC1522a
    /* renamed from: a */
    public void mo28082a(String str) {
        super.mo28082a(str);
        m28085a(EnumC3380a.DIS_CONNECT_HANDLE);
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        if (isFinishing()) {
            return;
        }
        switch (x11RespCmd.getMsg_id()) {
            case 4:
                if (z) {
                    m28085a(EnumC3380a.CARD_PARAMETERS_ERROR);
                    C1663g.m34751b(new File(C3129m.m29053n()));
                    C1688z.m34447a(this, getString(C1704R.C1707string.format_success), C1688z.f4192c);
                    this.f13525m.m33989u().m34046d(C1831e.f4927cU);
                    this.f13525m.a(true);
                } else {
                    C1688z.m34447a(this, getString(C1704R.C1707string.format_fail), C1688z.f4192c);
                }
                C1642c.m34889b().mo34429c();
                return;
            case 5:
            case 6:
            default:
                return;
            case 7:
                if (!this.f13514b || !C1831e.f4936ce.equals(x11RespCmd.getType())) {
                    return;
                }
                if (C1831e.f4812aL.equals(x11RespCmd.getCard_status())) {
                    m28084a(EnumC3380a.NO_TF_CARD_NO_UPGRADE, C1704R.C1707string.tf_card_no_check_no_upgrade);
                    return;
                } else if (C1831e.f4931cY.equals(x11RespCmd.getCam_status())) {
                    m28084a(EnumC3380a.CAMERA_RECORDING, C1704R.C1707string.findnewfimware_camera_update_no_ugrade);
                    return;
                } else if (C1831e.f4816aP.equals(x11RespCmd.getCard_status()) || C1831e.f4822aV.equals(x11RespCmd.getCard_status())) {
                    if (this.f13535w == EnumC3380a.CARD_PARAMETERS_ERROR) {
                        return;
                    }
                    this.f13535w = EnumC3380a.CARD_PARAMETERS_ERROR;
                    this.f13531s.setText(C1704R.C1707string.please_format_tf_card_upgraded);
                    return;
                } else if (C1831e.f4820aT.equals(x11RespCmd.getCard_status()) || C1831e.f4821aU.equals(x11RespCmd.getCard_status()) || C1831e.f4818aR.equals(x11RespCmd.getCard_status()) || C1831e.f4819aS.equals(x11RespCmd.getCard_status()) || C1831e.f4809aI.equals(x11RespCmd.getCard_status())) {
                    m28084a(EnumC3380a.TF_CARD_NO_UPGRADE_PLEASE_REPLACE, C1704R.C1707string.tf_card_no_upgrade_please_change);
                    return;
                } else {
                    m28074h();
                    return;
                }
        }
    }

    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.p148c.AbstractC1522a
    /* renamed from: b */
    public void mo28051b(String str) {
        super.mo28051b(str);
        m28084a(EnumC3380a.DIS_CONNECT_HANDLE, C1704R.C1707string.cloud_confirm_all_connection);
    }

    /* renamed from: b */
    public boolean m28080b() {
        return !this.f13514b || this.f13525m.j().getFreeKBSpace() > 81920;
    }

    /* renamed from: c */
    public void m28079c() {
        this.f13519g = (Button) findViewById(C1704R.C1706id.btn_after);
        C3103au.m29232a(getAssets(), this.f13519g);
        this.f13519g.setOnClickListener(this);
        this.f13520h = (Button) findViewById(C1704R.C1706id.btn_upgrade);
        C3103au.m29232a(getAssets(), this.f13520h);
        this.f13520h.setOnClickListener(this);
        this.f13521i = (Button) findViewById(C1704R.C1706id.btn_upgrade2);
        C3103au.m29232a(getAssets(), this.f13521i);
        this.f13521i.setOnClickListener(this);
        this.f13516d = (TranslationView) findViewById(C1704R.C1706id.translationview);
        this.f13516d.setVisibility(0);
        this.f13516d.m28854a();
        this.f13517e = (TextView) findViewById(C1704R.C1706id.update_firmware_title);
        C3103au.m29232a(getAssets(), this.f13517e);
        this.f13518f = (TextView) findViewById(C1704R.C1706id.down_firmwares_detail_ex);
        C3103au.m29232a(getAssets(), this.f13518f);
        this.f13531s = (TextView) findViewById(C1704R.C1706id.confirm_tv);
        C3103au.m29232a(getAssets(), this.f13531s);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(C1704R.C1707string.refreshupdate));
        if (this.f13533u) {
            this.f13519g.setVisibility(8);
            this.f13520h.setVisibility(8);
            this.f13521i.setVisibility(0);
            sb.append(getString(C1704R.C1707string.update_firmware_title_ex));
        } else {
            this.f13519g.setVisibility(0);
            this.f13520h.setVisibility(0);
            this.f13521i.setVisibility(8);
        }
        m28073i();
        this.f13517e.setText(sb.toString());
        this.f13530r = (ListView) findViewById(C1704R.C1706id.testListView);
    }

    /* renamed from: d */
    public void m28078d() {
        if (this.f13515c == null || this.f13515c.size() <= 0) {
            return;
        }
        this.f13532t = new C1731d(this, this.f13515c);
        this.f13530r.setAdapter((ListAdapter) this.f13532t);
    }

    /* renamed from: e */
    public void m28077e() {
        new DialogC3245f.C3246a(this).m28641a(getString(C1704R.C1707string.check_tf_card_must_format)).m28639a(false).m28644a(getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.x1bh.module.update.X1bhFindNewFirmwareAvtivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                C1642c.m34889b().mo34440a();
                X1bhFindNewFirmwareAvtivity.this.f13525m.m33989u().m34049c();
            }
        }).m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.x1bh.module.update.X1bhFindNewFirmwareAvtivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).m28645a().show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.btn_after /* 2131755287 */:
                if (this.f13523k == 1) {
                    finish();
                    return;
                } else if (!this.f13524l.booleanValue()) {
                    startActivity(new Intent(this, CloudTerraceMainActivity.class));
                    return;
                } else {
                    this.f13527o.m34546a().edit().putBoolean(C1756a.f4517J, true).commit();
                    this.dpa.m34274d();
                    return;
                }
            case C1704R.C1706id.btn_upgrade /* 2131755288 */:
                m28075g();
                return;
            case C1704R.C1706id.btn_upgrade2 /* 2131755289 */:
                m28075g();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        this.dpa.m34276b(this);
        this.f13527o = C1681v.m34543a(this);
        this.f13528p = C1756a.f4519L;
        this.f13524l = Boolean.valueOf(this.f13527o.m34546a().getBoolean(this.f13528p, false));
        getWindow().setFlags(128, 128);
        setContentView(C1704R.layout.activity_find_new_firmware_avtivity);
        C3103au.m29232a(getAssets(), this.f13520h);
        this.f13522j = this;
        this.f13523k = getIntent().getIntExtra(C1756a.f4514G, 0);
        this.f13515c = C3021a.m29616a().m29608d();
        while (true) {
            int i2 = i;
            if (i2 >= this.f13515c.size()) {
                break;
            }
            if ("2".equals(this.f13515c.get(i2).getForceSign())) {
                this.f13533u = true;
            }
            if (this.f13515c.get(i2).isVersionError()) {
                this.f13533u = true;
                this.f13534v = true;
                break;
            }
            i = i2 + 1;
        }
        m28079c();
        m28076f();
        m28078d();
        m28087a();
        if (!C1549d.m35208b().m35205d()) {
            m28084a(EnumC3380a.DIS_CONNECT_HANDLE, C1704R.C1707string.cloud_confirm_all_connection);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.x1bh.module.X1bhBaseActivity, com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f13516d != null) {
            this.f13516d.m28846c();
        }
    }

    @Override // com.fimi.kernel.BaseActivity
    public void onHandleMessage(Message message) {
        super.onHandleMessage(message);
        if (message.what == 135) {
            this.f13529q = (C1526a) message.obj;
            if (this.f13529q.m35366k() < 20) {
                m28084a(EnumC3380a.HAND_LOW_BATTERY, C1704R.C1707string.cloud_upgrade_check_low_battery_alarm);
            } else {
                m28085a(EnumC3380a.HAND_LOW_BATTERY);
            }
        }
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f13533u) {
            return super.onKeyDown(i, keyEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f13514b) {
            this.f13525m.m33986x().mo34002i();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
