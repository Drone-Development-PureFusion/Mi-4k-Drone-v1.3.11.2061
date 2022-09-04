package com.fimi.soul.module.update;

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
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.RelayEntity;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import com.fimi.soul.biz.camera.p174c.C1820d;
import com.fimi.soul.biz.p170b.C1769c;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p181i.C1867a;
import com.fimi.soul.biz.update.AbstractC2077i;
import com.fimi.soul.biz.update.C2037a;
import com.fimi.soul.biz.update.C2058d;
import com.fimi.soul.biz.update.C2065f;
import com.fimi.soul.biz.update.C2080l;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p201e.C2262o;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.module.update.C3030c;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.utils.C3103au;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class UpgradingActivity extends BaseActivity implements AbstractC1792f<X11RespCmd>, C3030c.AbstractC3032a {

    /* renamed from: R */
    private static final String f11156R = "UpgradingActivity";

    /* renamed from: a */
    public static final String f11157a = "sp_upgrade_skip";

    /* renamed from: q */
    private static final int f11158q = 153;

    /* renamed from: r */
    private static final int f11159r = 257;

    /* renamed from: s */
    private static final int f11160s = 256;

    /* renamed from: t */
    private static final int f11161t = 136;

    /* renamed from: u */
    private static final int f11162u = 102;

    /* renamed from: v */
    private static final int f11163v = 50;

    /* renamed from: x */
    private static int f11164x = 1;

    /* renamed from: D */
    private C2058d f11168D;

    /* renamed from: F */
    private EnumC3019a f11170F;

    /* renamed from: G */
    private Boolean f11171G;

    /* renamed from: H */
    private boolean f11172H;

    /* renamed from: J */
    private boolean f11174J;

    /* renamed from: K */
    private TextView f11175K;

    /* renamed from: O */
    private C1681v f11179O;

    /* renamed from: Q */
    private boolean f11181Q;

    /* renamed from: T */
    private Toast f11183T;

    /* renamed from: b */
    List<FirmwareInfo> f11184b;

    /* renamed from: f */
    C1772d.AbstractC1774a f11188f;

    /* renamed from: h */
    C1769c.AbstractC1771a f11190h;

    /* renamed from: i */
    long f11191i;

    /* renamed from: j */
    private ProgressView f11192j;

    /* renamed from: k */
    private TextView f11193k;

    /* renamed from: l */
    private ImageView f11194l;

    /* renamed from: m */
    private C2083a f11195m;

    /* renamed from: n */
    private TextView f11196n;

    /* renamed from: o */
    private C2065f f11197o;

    /* renamed from: p */
    private TextView f11198p;

    /* renamed from: y */
    private boolean f11200y;

    /* renamed from: w */
    private final int f11199w = 32;

    /* renamed from: z */
    private int f11201z = 0;

    /* renamed from: A */
    private int f11165A = 1;

    /* renamed from: B */
    private int f11166B = 0;

    /* renamed from: c */
    C2037a f11185c = null;

    /* renamed from: C */
    private C1827d f11167C = null;

    /* renamed from: E */
    private String f11169E = null;

    /* renamed from: d */
    C3030c f11186d = null;

    /* renamed from: I */
    private StringBuffer f11173I = null;

    /* renamed from: e */
    C1772d f11187e = null;

    /* renamed from: g */
    C1769c f11189g = null;

    /* renamed from: L */
    private boolean f11176L = false;

    /* renamed from: M */
    private boolean f11177M = false;

    /* renamed from: N */
    private boolean f11178N = false;

    /* renamed from: P */
    private String f11180P = C1756a.f4519L;

    /* renamed from: S */
    private boolean f11182S = false;

    /* renamed from: com.fimi.soul.module.update.UpgradingActivity$a */
    /* loaded from: classes.dex */
    public enum EnumC3019a {
        OnlyAP,
        OnlyRC,
        RCAndAP,
        Others
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m29667a(int i, int i2, int i3) {
        if (System.currentTimeMillis() - this.f11191i > 500 || i2 == i3 || i == 256) {
            this.f11191i = System.currentTimeMillis();
            Message message = new Message();
            message.what = i;
            message.arg1 = i2;
            message.arg2 = i3;
            getHandler().sendMessageDelayed(message, 50L);
        }
    }

    /* renamed from: a */
    private void m29666a(FirmwareInfo firmwareInfo) {
        if (m29655b(firmwareInfo)) {
            this.f11185c.m33166a(new AbstractC2077i() { // from class: com.fimi.soul.module.update.UpgradingActivity.4
                @Override // com.fimi.soul.biz.update.AbstractC2077i
                /* renamed from: a */
                public void mo28035a(boolean z, long j, long j2, int i) {
                    if (z) {
                        UpgradingActivity.this.getHandler().sendEmptyMessageDelayed(102, 50L);
                    }
                }
            }, this, firmwareInfo);
        } else {
            this.f11197o.m33092a(firmwareInfo, this.f11165A);
        }
    }

    /* renamed from: a */
    private void m29661a(String str) {
        m29667a(153, (Integer.valueOf(str.substring(str.lastIndexOf("=") + 1, str.length()).trim()).intValue() / 2) + 50, 100);
    }

    /* renamed from: b */
    private void m29658b() {
        this.f11197o.m33083e();
        this.f11184b = C3021a.m29616a().m29608d();
        if (this.f11184b == null || this.f11184b.size() == 0) {
            finish();
            return;
        }
        this.f11198p.setText(getResources().getString(C1704R.C1707string.upgrading_firmware) + this.f11184b.get(this.f11165A - 1).getSysName());
        this.f11170F = m29660a(this.f11184b);
        this.f11166B = this.f11184b.size();
        this.f11201z = this.f11184b.size() * 100;
        this.f11192j.setMaxCount(this.f11201z);
        this.f11197o.m33094a(new AbstractC2077i() { // from class: com.fimi.soul.module.update.UpgradingActivity.1
            @Override // com.fimi.soul.biz.update.AbstractC2077i
            /* renamed from: a */
            public void mo28035a(boolean z, long j, long j2, int i) {
                if (i == -1) {
                    UpgradingActivity.this.m29631k();
                } else if (z) {
                    UpgradingActivity.this.m29667a(256, i, 0);
                } else {
                    UpgradingActivity.this.f11165A = i;
                    UpgradingActivity.this.m29667a(153, (int) j, (int) j2);
                }
            }
        });
        this.f11197o.m33097a(new C2065f.AbstractC2073b() { // from class: com.fimi.soul.module.update.UpgradingActivity.3
            @Override // com.fimi.soul.biz.update.C2065f.AbstractC2073b
            /* renamed from: a */
            public void mo29622a(int i) {
                Log.i(UpgradingActivity.f11156R, "onCameraPress: " + UpgradingActivity.this.f11174J + ",seq:" + UpgradingActivity.this.f11165A);
                if (!UpgradingActivity.this.f11174J) {
                    UpgradingActivity.this.m29650c(i);
                }
            }

            @Override // com.fimi.soul.biz.update.C2065f.AbstractC2073b
            /* renamed from: a */
            public void mo29621a(boolean z) {
                if (!z || UpgradingActivity.this.f11174J) {
                    return;
                }
                UpgradingActivity.this.m29641f();
                UpgradingActivity.this.f11174J = true;
            }
        });
        FirmwareInfo firmwareInfo = this.f11184b.get(0);
        if (!m29651c()) {
            return;
        }
        this.f11186d.m29529a();
        if (firmwareInfo.getSysId() == 4 || firmwareInfo.getSysId() == 13) {
            m29657b(firmwareInfo.getSysId());
        } else {
            m29666a(firmwareInfo);
        }
    }

    /* renamed from: b */
    private void m29657b(final int i) {
        this.f11169E = "firmware.zip";
        new Thread(new Runnable() { // from class: com.fimi.soul.module.update.UpgradingActivity.7
            @Override // java.lang.Runnable
            public void run() {
                C2080l.m33050c("request camera upgrade:" + i);
                if (i != 13) {
                    C1820d m33988v = UpgradingActivity.this.f11167C.m33988v();
                    C2058d unused = UpgradingActivity.this.f11168D;
                    m33988v.m34010h(C2058d.m33109b());
                    return;
                }
                C2080l.m33050c("request camera upgrade:xx");
                C1820d m33988v2 = UpgradingActivity.this.f11167C.m33988v();
                C2058d unused2 = UpgradingActivity.this.f11168D;
                m33988v2.m34010h(C2058d.m33108c());
            }
        }).start();
    }

    /* renamed from: b */
    private void m29656b(int i, int i2, int i3) {
        if (System.currentTimeMillis() - this.f11191i > 500 || i2 == i3 || i == 256) {
            this.f11191i = System.currentTimeMillis();
            Message message = new Message();
            message.what = i;
            message.arg1 = i2;
            message.arg2 = i3;
            getHandler().sendMessage(message);
        }
    }

    /* renamed from: b */
    private boolean m29655b(FirmwareInfo firmwareInfo) {
        return firmwareInfo.getSysId() == 11 || firmwareInfo.getSysId() == 15 || firmwareInfo.getSysId() == 26 || firmwareInfo.getSysId() == 14 || firmwareInfo.getSysId() == 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m29650c(int i) {
        if (this.f11174J) {
            return;
        }
        m29656b(257, (i / 2) + 50, 100);
    }

    /* renamed from: c */
    private void m29649c(FirmwareInfo firmwareInfo) {
        if (m29655b(firmwareInfo)) {
            this.f11185c.m33166a(new AbstractC2077i() { // from class: com.fimi.soul.module.update.UpgradingActivity.10
                @Override // com.fimi.soul.biz.update.AbstractC2077i
                /* renamed from: a */
                public void mo28035a(boolean z, long j, long j2, int i) {
                    if (z) {
                        UpgradingActivity.this.getHandler().sendEmptyMessageDelayed(102, 50L);
                    }
                }
            }, this, firmwareInfo);
        } else if (m29645d(firmwareInfo)) {
            this.f11197o.m33092a(firmwareInfo, this.f11165A);
        } else if (m29645d(firmwareInfo)) {
            this.f11197o.m33092a(firmwareInfo, this.f11165A);
        } else if (!this.f11195m.mo32905ac()) {
            getHandler().sendEmptyMessageDelayed(32, 50L);
        } else {
            this.f11197o.m33092a(firmwareInfo, this.f11165A);
        }
    }

    /* renamed from: c */
    private boolean m29651c() {
        if (this.f11197o.m33087c()) {
            m29631k();
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m29646d() {
        this.f11186d.m29526b();
        this.f11186d.m29529a();
        try {
            this.f11185c.m33154e();
        } catch (Exception e) {
            C2080l.m33055b("e:closeFtpNetwork:" + e.getMessage().toString());
        }
        this.f11187e = C1772d.m34208a();
        this.f11188f = new C1772d.AbstractC1774a() { // from class: com.fimi.soul.module.update.UpgradingActivity.5
            @Override // com.fimi.soul.biz.p170b.C1772d.AbstractC1774a
            /* renamed from: a */
            public void mo29620a(RelayEntity relayEntity) {
                int firmupg_finished = relayEntity.getFirmupg_finished();
                if (firmupg_finished <= 0) {
                    return;
                }
                if (!UpgradingActivity.this.f11177M) {
                    UpgradingActivity.this.m29667a(153, firmupg_finished, 100);
                }
                if (firmupg_finished < 100) {
                    UpgradingActivity.this.f11186d.m29526b();
                } else if (UpgradingActivity.this.f11177M) {
                } else {
                    C2080l.m33046d(UpgradingActivity.this.f11184b.get(UpgradingActivity.this.f11166B - 1).getVersion());
                    UpgradingActivity.this.m29667a(256, 0, 0);
                    UpgradingActivity.this.f11177M = true;
                }
            }
        };
        this.f11187e.m34206a(this.f11188f);
        this.f11189g = C1769c.m34218a();
        this.f11190h = new C1769c.AbstractC1771a() { // from class: com.fimi.soul.module.update.UpgradingActivity.6
            @Override // com.fimi.soul.biz.p170b.C1769c.AbstractC1771a
            /* renamed from: a */
            public void mo29619a(RelayEntity relayEntity) {
                int firmupg_finished = relayEntity.getFirmupg_finished();
                if (firmupg_finished <= 0) {
                    return;
                }
                if (!UpgradingActivity.this.f11176L) {
                    UpgradingActivity.this.m29667a(153, firmupg_finished, 100);
                }
                if (firmupg_finished < 100) {
                    UpgradingActivity.this.f11186d.m29526b();
                } else if (UpgradingActivity.this.f11176L) {
                } else {
                    C2080l.m33046d(UpgradingActivity.this.f11184b.get(UpgradingActivity.this.f11166B - 1).getVersion());
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    UpgradingActivity.this.m29667a(256, 0, 0);
                    UpgradingActivity.this.f11176L = true;
                }
            }
        };
        this.f11189g.m34217a(this.f11190h);
    }

    /* renamed from: d */
    private boolean m29645d(FirmwareInfo firmwareInfo) {
        return firmwareInfo.getSysId() == 1;
    }

    /* renamed from: e */
    private void m29643e() {
        this.f11186d = new C3030c(0, this);
        this.f11173I = new StringBuffer();
        this.f11170F = EnumC3019a.Others;
        f11164x = 1;
        this.f11185c = new C2037a();
        this.f11168D = new C2058d();
        this.f11167C = (C1827d) C1783b.m34166a().m34150d();
        this.f11174J = false;
        this.f11167C.c(false);
        this.f11167C.a(this);
        this.f11167C.c(new AbstractC1625d() { // from class: com.fimi.soul.module.update.UpgradingActivity.8
            @Override // com.fimi.kernel.p158b.p161c.AbstractC1625d
            /* renamed from: a */
            public void mo28036a(String str) {
            }
        });
        this.f11167C.m33988v().m34031a(new AbstractC2077i() { // from class: com.fimi.soul.module.update.UpgradingActivity.9
            @Override // com.fimi.soul.biz.update.AbstractC2077i
            /* renamed from: a */
            public void mo28035a(boolean z, long j, long j2, int i) {
                C2080l.m33050c("uplaod file progress:" + ((100 * j) / j2) + "%");
                if (!UpgradingActivity.this.f11167C.m33988v().m34013g()) {
                    Log.i(UpgradingActivity.f11156R, "onProgress1: ");
                    if (UpgradingActivity.this.f11174J) {
                        return;
                    }
                    UpgradingActivity.this.m29667a(153, ((int) j) / 2, (int) j2);
                }
            }
        });
        C2080l.m33042f();
        this.f11195m = ((DroidPlannerApp) getApplication()).f4493a;
        this.f11197o = new C2065f(this, this.f11195m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m29641f() {
        C2080l.m33050c(C1831e.f4881bb);
        this.f11174J = true;
        C2080l.m33043e(this.f11184b.get(0).getVersion());
        m29639g();
    }

    /* renamed from: g */
    private void m29639g() {
        this.f11184b.get(0).setIsUpgradeSuccess(true);
        if (this.f11166B < 2) {
            m29637h();
            return;
        }
        this.f11165A++;
        m29666a(this.f11184b.get(1));
    }

    /* renamed from: h */
    private void m29637h() {
        f11164x = 0;
        this.f11186d.m29523d();
        this.f11197o.m33077m();
        if (this.f11172H) {
            try {
                this.f11173I.deleteCharAt(this.f11173I.length() - 1);
            } catch (Exception e) {
            }
        }
        if (!this.f11178N) {
            if (this.f11170F == EnumC3019a.OnlyRC) {
                C2080l.m33055b("reset rc");
                this.f11197o.m33079k();
                m29635i();
            } else {
                m29635i();
            }
            this.f11178N = true;
        }
    }

    /* renamed from: i */
    private void m29635i() {
        m29626n();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        f11164x = 0;
        m29627m();
    }

    /* renamed from: j */
    private void m29633j() {
        if (this.f11172H) {
            C1688z.m34448a(this, this.f11173I.toString() + getResources().getString(C1704R.C1707string.updatefail));
        } else {
            C1688z.m34450a(this, (int) C1704R.C1707string.upgrade_firmware_success);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m29631k() {
        this.f11172H = true;
        this.f11174J = true;
        this.f11167C.m33988v().m34026a(true);
        getHandler().sendEmptyMessageDelayed(32, 50L);
    }

    /* renamed from: l */
    private void m29629l() {
        this.f11173I.append(this.f11184b.get(this.f11165A - 1).getSysName() + Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (!m29669a() || !this.f11195m.mo32906ab().mo32588a()) {
            this.f11182S = true;
            Log.i(f11156R, "continueUpgrade: ");
            m29627m();
            return;
        }
        this.f11165A++;
        if (!m29651c()) {
            return;
        }
        m29649c(this.f11184b.get(this.f11165A - 1));
    }

    /* renamed from: m */
    private void m29627m() {
        Intent intent = new Intent(this, UpgradeResultActivity.class);
        intent.putExtra(UpgradeResultActivity.f11131a, (Serializable) this.f11184b);
        startActivity(intent);
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    /* renamed from: n */
    private void m29626n() {
        if (this.f11167C != null) {
            this.f11167C.c(true);
            this.f11167C.m33988v().m34026a(true);
            this.f11167C = null;
        }
        this.f11197o.m33083e();
        this.f11197o.m33078l();
        this.f11185c = null;
        this.f11186d.m29523d();
        m29625o();
        m29624p();
        getHandler().removeCallbacksAndMessages(null);
        System.gc();
    }

    /* renamed from: o */
    private void m29625o() {
        if (this.f11187e == null || this.f11188f == null) {
            return;
        }
        this.f11187e.m34202b(this.f11188f);
    }

    /* renamed from: p */
    private void m29624p() {
        if (this.f11189g == null || this.f11190h == null) {
            return;
        }
        this.f11189g.m34214b(this.f11190h);
    }

    /* renamed from: q */
    private void m29623q() {
        if (!this.f11200y) {
            this.f11200y = true;
            this.f11183T = Toast.makeText(getApplicationContext(), (int) C1704R.C1707string.upgrading_not_disconnect, 0);
            this.f11183T.show();
            getHandler().sendEmptyMessageDelayed(136, 2000L);
            return;
        }
        this.f11167C.m33988v().m34026a(true);
        new Thread(new Runnable() { // from class: com.fimi.soul.module.update.UpgradingActivity.2
            @Override // java.lang.Runnable
            public void run() {
                C2262o.f7109a.f6364d = (byte) 0;
                C2262o.f7109a.f6365e = (byte) 2;
                UpgradingActivity.this.f11195m.mo32906ab().mo32587a(C2262o.f7109a.mo32762b());
            }
        }).start();
        this.f11183T.cancel();
        startActivity(new Intent(this, FindNewFirmwareAvtivity.class));
        DroidPlannerApp.f4489f = false;
        finish();
    }

    /* renamed from: a */
    public EnumC3019a m29660a(List<FirmwareInfo> list) {
        EnumC3019a enumC3019a;
        EnumC3019a enumC3019a2 = EnumC3019a.Others;
        Iterator<FirmwareInfo> it2 = list.iterator();
        while (true) {
            enumC3019a = enumC3019a2;
            if (!it2.hasNext()) {
                break;
            }
            FirmwareInfo next = it2.next();
            if (next.getSysId() == 11) {
                EnumC3019a enumC3019a3 = EnumC3019a.OnlyAP;
                Iterator<FirmwareInfo> it3 = list.iterator();
                while (true) {
                    enumC3019a = enumC3019a3;
                    if (!it3.hasNext()) {
                        break;
                    }
                    enumC3019a3 = it3.next().getSysId() == 1 ? EnumC3019a.RCAndAP : enumC3019a;
                }
            } else {
                enumC3019a2 = next.getSysId() == 1 ? EnumC3019a.OnlyRC : enumC3019a;
            }
        }
        return enumC3019a;
    }

    /* renamed from: a */
    public void m29668a(int i) {
        this.f11165A = i;
    }

    @Override // com.fimi.soul.module.update.C3030c.AbstractC3032a
    /* renamed from: a */
    public void mo28057a(boolean z) {
        if (z) {
            m29631k();
        }
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        if (!z || !x11RespCmd.isNotification()) {
            return;
        }
        if (C1831e.f4826aZ.equals(x11RespCmd.getType())) {
            C2080l.m33050c(C1831e.f4826aZ);
            this.f11186d.m29526b();
        }
        if (C1831e.f4881bb.equals(x11RespCmd.getType())) {
            m29641f();
        }
        if (C1831e.f4883bd.equals(x11RespCmd.getType())) {
            C2080l.m33050c(C1831e.f4883bd);
        }
        if (C1831e.f4886bg.equals(x11RespCmd.getType())) {
            C2080l.m33050c(C1831e.f4886bg);
        }
        if (!x11RespCmd.getType().contains(C1831e.f4884be) || this.f11174J) {
            return;
        }
        String type = x11RespCmd.getType();
        C2080l.m33050c(type);
        m29661a(type);
    }

    /* renamed from: a */
    public boolean m29669a() {
        return this.f11166B > this.f11165A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DroidPlannerApp.f4489f = true;
        CameraValue.isUpdate = true;
        this.dpa.m34276b(this);
        this.f11179O = C1681v.m34543a(this);
        this.f11171G = Boolean.valueOf(this.f11179O.m34546a().getBoolean(this.f11180P, false));
        getWindow().setFlags(128, 128);
        setContentView(C1704R.layout.activity_upgrading);
        this.f11181Q = getIntent().getBooleanExtra("isForce", false);
        this.f11192j = (ProgressView) findViewById(C1704R.C1706id.progress_view);
        this.f11193k = (TextView) findViewById(C1704R.C1706id.tv_progress);
        C3103au.m29218b(getAssets(), this.f11193k);
        this.f11194l = (ImageView) findViewById(C1704R.C1706id.img_anim);
        this.f11198p = (TextView) findViewById(C1704R.C1706id.upgrade_result);
        this.f11175K = (TextView) findViewById(C1704R.C1706id.upgrading_warning);
        C3103au.m29232a(getAssets(), this.f11198p, this.f11175K);
        this.f11196n = (TextView) findViewById(C1704R.C1706id.tv_percent);
        C3103au.m29218b(getAssets(), this.f11196n);
        this.f11165A = 1;
        m29643e();
        m29658b();
        C1867a.m33847a().m33841a(getLocalClassName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m29626n();
    }

    @Override // com.fimi.kernel.BaseActivity
    public void onHandleMessage(Message message) {
        if (message.what == 153) {
            this.f11186d.m29526b();
            this.f11198p.setText(getResources().getString(C1704R.C1707string.upgrading_firmware) + this.f11184b.get(this.f11165A - 1).getSysName());
            int i = ((message.arg1 * 100) / message.arg2) + ((this.f11165A - 1) * 100);
            this.f11193k.setText(((i * 100) / this.f11201z) + "");
            Log.i(f11156R, "onHandleMessage1: " + ((i * 100) / this.f11201z) + ",seq:" + this.f11165A);
            this.f11192j.setCurrentCount(i);
        }
        if (message.what == 257 && (this.f11165A <= 1 || !this.f11174J)) {
            this.f11186d.m29526b();
            this.f11198p.setText(getResources().getString(C1704R.C1707string.upgrading_firmware) + this.f11184b.get(this.f11165A - 1).getSysName());
            int i2 = ((message.arg1 * 100) / message.arg2) + ((this.f11165A - 1) * 100);
            this.f11193k.setText(((i2 * 100) / this.f11201z) + "");
            Log.i(f11156R, "onHandleMessage1: " + ((i2 * 100) / this.f11201z) + ",seq:" + this.f11165A);
            this.f11192j.setCurrentCount(i2);
        }
        if (message.what == 256) {
            this.f11197o.m33080f();
            this.f11184b.get(this.f11165A - 1).setIsUpgradeSuccess(true);
            this.f11197o.m33093a(this.f11184b.get(this.f11165A - 1));
            if (!m29651c()) {
                return;
            }
            if (m29669a()) {
                this.f11165A++;
                m29666a(this.f11184b.get(this.f11165A - 1));
            } else {
                m29637h();
            }
        }
        if (message.what == 136) {
            this.f11200y = false;
        }
        if (message.what == 102) {
            m29646d();
        }
        if (message.what != 32 || this.f11182S) {
            return;
        }
        m29629l();
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (!this.f11181Q) {
                m29623q();
            }
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (f11164x == 0) {
            f11164x = 0;
            m29627m();
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
        this.f11194l.setBackgroundResource(C1704R.C1705drawable.update_anim);
        ((AnimationDrawable) this.f11194l.getBackground()).start();
    }
}
