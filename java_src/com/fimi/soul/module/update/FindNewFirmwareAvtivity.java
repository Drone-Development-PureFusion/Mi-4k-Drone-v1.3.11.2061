package com.fimi.soul.module.update;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
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
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import com.fimi.soul.biz.p170b.C1769c;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p181i.C1867a;
import com.fimi.soul.biz.update.C2080l;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2338h;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.p168b.C1731d;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.view.DialogC3245f;
import com.fimi.soul.view.TranslationView;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class FindNewFirmwareAvtivity extends BaseActivity implements View.OnClickListener, AbstractC1792f<X11RespCmd> {

    /* renamed from: a */
    public static final String f11052a = "upgrade_firmwares";

    /* renamed from: f */
    TranslationView f11057f;

    /* renamed from: g */
    TextView f11058g;

    /* renamed from: h */
    TextView f11059h;

    /* renamed from: i */
    private Button f11060i;

    /* renamed from: j */
    private Button f11061j;

    /* renamed from: k */
    private Button f11062k;

    /* renamed from: l */
    private Context f11063l;

    /* renamed from: m */
    private int f11064m;

    /* renamed from: n */
    private Boolean f11065n;

    /* renamed from: p */
    private boolean f11067p;

    /* renamed from: q */
    private C1681v f11068q;

    /* renamed from: s */
    private ListView f11070s;

    /* renamed from: t */
    private TextView f11071t;

    /* renamed from: u */
    private C1731d f11072u;

    /* renamed from: v */
    private boolean f11073v;

    /* renamed from: w */
    private boolean f11074w;

    /* renamed from: b */
    boolean f11053b = false;

    /* renamed from: o */
    private C1827d f11066o = null;

    /* renamed from: c */
    List<FirmwareInfo> f11054c = null;

    /* renamed from: r */
    private String f11069r = C1756a.f4519L;

    /* renamed from: d */
    boolean f11055d = false;

    /* renamed from: e */
    boolean f11056e = false;

    /* renamed from: x */
    private EnumC3006a f11075x = EnumC3006a.IDILE;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.module.update.FindNewFirmwareAvtivity$a */
    /* loaded from: classes.dex */
    public enum EnumC3006a {
        IDILE,
        TF_CARD_NO_UPGRADE_PLEASE_REPLACE,
        TF_CARD_ERROR_NO_UPGRADE,
        CAMERA_RECORDING,
        TF_CARD_CAPACITY,
        DRONE_SKY,
        DIS_CONNECT_DRONE,
        REMOTE_LOW_BATTERY,
        NO_TF_CARD_NO_UPGRADE,
        CARD_PARAMETERS_ERROR,
        FLIGHT_LOW_BATTERY,
        UPGRADING,
        CALIBRATION
    }

    /* renamed from: a */
    private void m29707a(EnumC3006a enumC3006a) {
        if (this.f11075x == enumC3006a) {
            this.f11071t.setText(C1704R.C1707string.confirm_all_connection2);
            this.f11075x = EnumC3006a.IDILE;
            m29695j();
        }
    }

    /* renamed from: a */
    private void m29706a(EnumC3006a enumC3006a, int i) {
        if (this.f11075x == enumC3006a) {
            return;
        }
        this.f11075x = enumC3006a;
        this.f11071t.setText(i);
        m29694k();
    }

    /* renamed from: g */
    private void m29698g() {
        int i;
        if (this.f11054c == null || this.f11054c.size() <= 0) {
            i = 0;
        } else {
            i = 0;
            for (int i2 = 0; i2 < this.f11054c.size(); i2++) {
                FirmwareInfo firmwareInfo = this.f11054c.get(i2);
                if (firmwareInfo.getSysId() == 4 || firmwareInfo.getSysId() == 13) {
                    this.f11053b = true;
                } else if (firmwareInfo.getSysId() == 11 || firmwareInfo.getSysId() == 15 || firmwareInfo.getSysId() == 26) {
                    this.f11055d = true;
                } else if (firmwareInfo.getSysId() == 14 || firmwareInfo.getSysId() == 25) {
                    this.f11056e = true;
                }
                i += firmwareInfo.getUpdateTime();
            }
        }
        this.f11067p = C1772d.m34208a().m34187k();
        this.f11066o = (C1827d) C1783b.m34166a().m34150d();
        this.f11066o.a(this);
        if (!this.f11066o.e() && this.drone.mo32904af()) {
            this.f11066o.m33987w().m33996b();
        }
        if (this.f11053b && this.f11066o.e()) {
            this.f11066o.m33989u().m34046d(C1831e.f4927cU);
        }
        String string = getString(C1704R.C1707string.down_firmwares_detail_ex);
        getString(C1704R.C1707string.update_firmwares_detail_ex);
        C2080l.m33065a(i);
        this.f11059h.setText(String.format(string, C2080l.m33048d()));
    }

    /* renamed from: h */
    private void m29697h() {
        if (this.f11075x == EnumC3006a.CARD_PARAMETERS_ERROR) {
            m29699f();
            return;
        }
        Intent intent = new Intent(this.f11063l, UpgradingActivity.class);
        intent.putExtra("isForce", this.f11073v);
        startActivity(intent);
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    /* renamed from: i */
    private void m29696i() {
        m29707a(EnumC3006a.CAMERA_RECORDING);
        m29707a(EnumC3006a.NO_TF_CARD_NO_UPGRADE);
        m29707a(EnumC3006a.TF_CARD_NO_UPGRADE_PLEASE_REPLACE);
        m29707a(EnumC3006a.TF_CARD_ERROR_NO_UPGRADE);
        m29707a(EnumC3006a.CARD_PARAMETERS_ERROR);
        m29707a(EnumC3006a.UPGRADING);
        if (this.f11066o.j().getFreeKBSpace() == 0) {
            this.f11066o.m33989u().m34046d(C1831e.f4927cU);
        } else if (!m29703b()) {
            m29706a(EnumC3006a.TF_CARD_CAPACITY, C1704R.C1707string.camera_tf_space_detail);
        } else {
            m29707a(EnumC3006a.TF_CARD_CAPACITY);
        }
    }

    /* renamed from: j */
    private void m29695j() {
        this.f11061j.setTextColor(-419430401);
        this.f11062k.setTextColor(-419430401);
        this.f11061j.setClickable(true);
        this.f11062k.setClickable(true);
    }

    /* renamed from: k */
    private void m29694k() {
        this.f11061j.setTextColor(872415231);
        this.f11062k.setTextColor(872415231);
        this.f11061j.setClickable(false);
        this.f11062k.setClickable(false);
    }

    /* renamed from: a */
    public void m29709a() {
        if (!this.drone.mo32905ac()) {
            m29706a(EnumC3006a.DIS_CONNECT_DRONE, C1704R.C1707string.confirm_all_connection);
        } else if (this.drone.mo32919Q().m32126g()) {
            m29706a(EnumC3006a.REMOTE_LOW_BATTERY, C1704R.C1707string.update_low_battery);
        } else if (this.f11054c != null && this.f11054c.size() > 0 && !this.drone.m33008an()) {
            m29706a(EnumC3006a.DRONE_SKY, C1704R.C1707string.motor_start_up);
        } else if (this.f11074w) {
            this.f11071t.setText(getString(C1704R.C1707string.confirm_all_connection3));
        } else {
            this.f11071t.setText(getString(C1704R.C1707string.confirm_all_connection2));
        }
    }

    /* renamed from: a */
    public void m29708a(C2104d.EnumC2105a enumC2105a) {
        switch (enumC2105a) {
            case OnRecivedCloudCameraCommandInfo:
                if (this.drone.f5918c.mo32435a() != 50) {
                    return;
                }
                if (((C2338h) this.drone.f5918c).m31974f() != C2338h.EnumC2339a.NoSDCard) {
                    this.f11066o.b(true);
                } else {
                    this.f11066o.b(false);
                }
                switch (r0.m31974f()) {
                    case VideoRecording:
                        m29706a(EnumC3006a.CAMERA_RECORDING, C1704R.C1707string.findnewfimware_camera_update_no_ugrade);
                        return;
                    case NoSDCard:
                        m29706a(EnumC3006a.NO_TF_CARD_NO_UPGRADE, C1704R.C1707string.tf_card_no_check_no_upgrade);
                        return;
                    case UPDATEPRO:
                        if (!m29702c()) {
                            return;
                        }
                        m29706a(EnumC3006a.UPGRADING, C1704R.C1707string.update_updating);
                        return;
                    case LOW_SPEED_CARD:
                    case CardNoPropose:
                    case CardNoProposeAndParamerr:
                    case CardWriteLow:
                    case CardWriteLowAndParamerr:
                        if (!this.f11067p) {
                            m29696i();
                            return;
                        } else {
                            m29706a(EnumC3006a.TF_CARD_NO_UPGRADE_PLEASE_REPLACE, C1704R.C1707string.tf_card_no_upgrade_please_change);
                            return;
                        }
                    case CardSetroot:
                        m29706a(EnumC3006a.TF_CARD_ERROR_NO_UPGRADE, C1704R.C1707string.tf_card_error_no_ugraded);
                        return;
                    case CardFileSysError:
                    case CardParametersError:
                        if (this.f11075x == EnumC3006a.CARD_PARAMETERS_ERROR) {
                            return;
                        }
                        this.f11075x = EnumC3006a.CARD_PARAMETERS_ERROR;
                        this.f11071t.setText(C1704R.C1707string.please_format_tf_card_upgraded);
                        return;
                    default:
                        m29696i();
                        return;
                }
            default:
                return;
        }
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
                    m29707a(EnumC3006a.CARD_PARAMETERS_ERROR);
                    C1663g.m34751b(new File(C3129m.m29053n()));
                    C1688z.m34447a(this, getString(C1704R.C1707string.format_success), C1688z.f4192c);
                    this.f11066o.m33989u().m34046d(C1831e.f4927cU);
                    this.f11066o.a(true);
                } else {
                    C1688z.m34447a(this, getString(C1704R.C1707string.format_fail), C1688z.f4192c);
                }
                C1642c.m34889b().mo34429c();
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public boolean m29703b() {
        return this.f11053b && this.f11066o.j().getFreeKBSpace() > 81920;
    }

    /* renamed from: c */
    public boolean m29702c() {
        return this.f11053b || this.f11055d || this.f11056e;
    }

    /* renamed from: d */
    public void m29701d() {
        this.f11060i = (Button) findViewById(C1704R.C1706id.btn_after);
        C3103au.m29232a(getAssets(), this.f11060i);
        this.f11060i.setOnClickListener(this);
        this.f11061j = (Button) findViewById(C1704R.C1706id.btn_upgrade);
        C3103au.m29232a(getAssets(), this.f11061j);
        this.f11061j.setOnClickListener(this);
        this.f11062k = (Button) findViewById(C1704R.C1706id.btn_upgrade2);
        C3103au.m29232a(getAssets(), this.f11062k);
        this.f11062k.setOnClickListener(this);
        this.f11057f = (TranslationView) findViewById(C1704R.C1706id.translationview);
        this.f11057f.setVisibility(0);
        this.f11057f.m28854a();
        this.f11058g = (TextView) findViewById(C1704R.C1706id.update_firmware_title);
        C3103au.m29232a(getAssets(), this.f11058g);
        this.f11059h = (TextView) findViewById(C1704R.C1706id.down_firmwares_detail_ex);
        C3103au.m29232a(getAssets(), this.f11059h);
        this.f11071t = (TextView) findViewById(C1704R.C1706id.confirm_tv);
        C3103au.m29232a(getAssets(), this.f11071t);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(C1704R.C1707string.refreshupdate));
        if (this.f11073v) {
            this.f11060i.setVisibility(8);
            this.f11061j.setVisibility(8);
            this.f11062k.setVisibility(0);
            sb.append(getString(C1704R.C1707string.update_firmware_title_ex));
        } else {
            this.f11060i.setVisibility(0);
            this.f11061j.setVisibility(0);
            this.f11062k.setVisibility(8);
        }
        this.f11058g.setText(sb.toString());
        this.f11070s = (ListView) findViewById(C1704R.C1706id.testListView);
    }

    /* renamed from: e */
    public void m29700e() {
        if (this.f11054c == null || this.f11054c.size() <= 0) {
            return;
        }
        this.f11072u = new C1731d(this, this.f11054c);
        this.f11070s.setAdapter((ListAdapter) this.f11072u);
    }

    /* renamed from: f */
    public void m29699f() {
        new DialogC3245f.C3246a(this).m28641a(getString(C1704R.C1707string.check_tf_card_must_format)).m28639a(false).m28644a(getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.update.FindNewFirmwareAvtivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                C1642c.m34889b().mo34440a();
                FindNewFirmwareAvtivity.this.f11066o.m33989u().m34049c();
            }
        }).m28640a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.update.FindNewFirmwareAvtivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).m28645a().show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.btn_after /* 2131755287 */:
                if (this.f11064m == 1) {
                    finish();
                    return;
                } else if (!this.f11065n.booleanValue()) {
                    startActivity(new Intent(this, FlightActivity.class));
                    return;
                } else {
                    this.f11068q.m34546a().edit().putBoolean(C1756a.f4517J, true).commit();
                    this.dpa.m34274d();
                    return;
                }
            case C1704R.C1706id.btn_upgrade /* 2131755288 */:
                m29697h();
                return;
            case C1704R.C1706id.btn_upgrade2 /* 2131755289 */:
                m29697h();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        this.dpa.m34276b(this);
        this.f11068q = C1681v.m34543a(this);
        this.f11069r = C1756a.f4519L;
        this.f11065n = Boolean.valueOf(this.f11068q.m34546a().getBoolean(this.f11069r, false));
        getWindow().setFlags(128, 128);
        setContentView(C1704R.layout.activity_find_new_firmware_avtivity);
        C3103au.m29232a(getAssets(), this.f11061j);
        this.f11063l = this;
        this.f11064m = getIntent().getIntExtra(C1756a.f4514G, 0);
        this.f11054c = C3021a.m29616a().m29608d();
        while (true) {
            int i2 = i;
            if (i2 >= this.f11054c.size()) {
                break;
            }
            if ("2".equals(this.f11054c.get(i2).getForceSign())) {
                this.f11073v = true;
            }
            if (this.f11054c.get(i2).isVersionError()) {
                this.f11073v = true;
                this.f11074w = true;
                break;
            }
            i = i2 + 1;
        }
        m29701d();
        m29698g();
        m29700e();
        m29709a();
        C1867a.m33847a().m33841a(getLocalClassName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f11057f != null) {
            this.f11057f.m28846c();
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        super.onDroneEvent(enumC2105a, c2083a);
        if (!c2083a.mo32905ac()) {
            m29706a(EnumC3006a.DIS_CONNECT_DRONE, C1704R.C1707string.confirm_all_connection);
            return;
        }
        m29707a(EnumC3006a.DIS_CONNECT_DRONE);
        if (c2083a.m33007ao().m31786an() || C1772d.m34208a().m34190h() || C1769c.m34218a().m34211d()) {
            if (!m29702c()) {
                return;
            }
            m29706a(EnumC3006a.UPGRADING, C1704R.C1707string.update_updating);
            return;
        }
        m29707a(EnumC3006a.UPGRADING);
        if (c2083a.m33007ao().m31787am()) {
            m29706a(EnumC3006a.CALIBRATION, C1704R.C1707string.update_calibration);
            return;
        }
        m29707a(EnumC3006a.CALIBRATION);
        if (c2083a.mo32919Q().m32126g()) {
            m29706a(EnumC3006a.REMOTE_LOW_BATTERY, C1704R.C1707string.update_low_battery);
            return;
        }
        m29707a(EnumC3006a.REMOTE_LOW_BATTERY);
        if (c2083a.m33007ao().m31811R() || c2083a.m33007ao().m31810S()) {
            m29706a(EnumC3006a.FLIGHT_LOW_BATTERY, C1704R.C1707string.update_flight_low_battery);
            return;
        }
        m29707a(EnumC3006a.FLIGHT_LOW_BATTERY);
        if (!c2083a.m33008an()) {
            m29706a(EnumC3006a.DRONE_SKY, C1704R.C1707string.motor_start_up);
            return;
        }
        m29707a(EnumC3006a.DRONE_SKY);
        if (!this.f11053b) {
            return;
        }
        m29708a(enumC2105a);
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f11073v) {
            return super.onKeyDown(i, keyEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f11053b) {
            this.f11066o.m33986x().mo34002i();
        }
        C1867a.m33847a().m33840a(getLocalClassName(), 1, this.drone);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
