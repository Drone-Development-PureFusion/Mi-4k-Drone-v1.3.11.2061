package com.fimi.soul.module.setting;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.p001v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.AbstractC1493b;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.manager.C1973k;
import com.fimi.soul.biz.manager.C1981o;
import com.fimi.soul.biz.manager.C2011w;
import com.fimi.soul.biz.manager.C2015y;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.biz.p188p.C2024a;
import com.fimi.soul.biz.update.C2046b;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p195d.p196a.p197a.C2155br;
import com.fimi.soul.drone.p195d.p196a.p197a.C2186r;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.drone.p205i.C2333c;
import com.fimi.soul.drone.p205i.C2336f;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.entity.DeviceType;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Setting;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.calibcompass.C2540a;
import com.fimi.soul.module.calibcompass.CaliCompassActivity;
import com.fimi.soul.module.droneui.BatteryInfoActivity;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.droneui.IMU4KActivity;
import com.fimi.soul.module.droneui.MoreInfoSettingAcitivity;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.module.paircode.PairCodeActivity;
import com.fimi.soul.module.push.HistoryMessageActivity;
import com.fimi.soul.module.remote.RemoteCalibration;
import com.fimi.soul.module.remote.RemoteModelActivity;
import com.fimi.soul.module.setting.C2932i;
import com.fimi.soul.module.setting.GimalCalibration.GimalCalibrationActivity;
import com.fimi.soul.module.setting.gimaltuneparameter.GimalTuneParameterActivity;
import com.fimi.soul.module.setting.newhand.AbstractC2973d;
import com.fimi.soul.module.setting.newhand.C2955c;
import com.fimi.soul.module.setting.newhand.GpsSettingActivity;
import com.fimi.soul.module.setting.newhand.NewHandActivity;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.FindNewFirmwareAvtivity;
import com.fimi.soul.module.update.FindOnlineFirmwareAvtivity;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.p168b.C1717b;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.DialogC3245f;
import com.fimi.soul.view.DialogC3275i;
import com.fimi.soul.view.marknumberprogress.AbstractC3290b;
import com.fimi.soul.view.marknumberprogress.C3288a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import org.p286a.p287a.p320o.C11359f;
/* loaded from: classes.dex */
public class MapSettingFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener, C2046b.AbstractC2054a, C2104d.AbstractC2106b, C2932i.AbstractC2934a, C2932i.AbstractC2935b, C2932i.AbstractC2936c {

    /* renamed from: A */
    private static final int f10240A = 0;

    /* renamed from: B */
    private static final int f10241B = 2;

    /* renamed from: C */
    private static final int f10242C = 1;

    /* renamed from: D */
    private static final int f10243D = 3;

    /* renamed from: E */
    private static final int f10244E = 5;

    /* renamed from: U */
    private static final int f10245U = 6;

    /* renamed from: V */
    private static final int f10246V = 7;

    /* renamed from: W */
    private static final int f10247W = 5000;

    /* renamed from: X */
    private static final String f10248X = "MapSettingFragment";

    /* renamed from: F */
    private C1973k f10249F;

    /* renamed from: G */
    private boolean f10250G;

    /* renamed from: J */
    private C2011w f10253J;

    /* renamed from: R */
    private C3288a f10261R;

    /* renamed from: b */
    public C2046b f10267b;

    /* renamed from: d */
    List<UpdateVersonBean> f10269d;

    /* renamed from: e */
    AbstractC2973d f10270e;

    /* renamed from: g */
    private ListView f10272g;

    /* renamed from: h */
    private C2932i f10273h;

    /* renamed from: i */
    private C1717b f10274i;

    /* renamed from: k */
    private Setting f10276k;

    /* renamed from: l */
    private Context f10277l;

    /* renamed from: m */
    private AbstractC2889a f10278m;

    /* renamed from: n */
    private Button f10279n;

    /* renamed from: o */
    private TextView f10280o;

    /* renamed from: p */
    private C2083a f10281p;

    /* renamed from: q */
    private C2523d f10282q;

    /* renamed from: r */
    private PercentRelativeLayout f10283r;

    /* renamed from: s */
    private C1681v f10284s;

    /* renamed from: t */
    private C1827d f10285t;

    /* renamed from: u */
    private C2015y f10286u;

    /* renamed from: f */
    private Observer f10271f = new Observer() { // from class: com.fimi.soul.module.setting.MapSettingFragment.1
        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            if (MapSettingFragment.this.f10273h != null) {
                MapSettingFragment.this.f10273h.m29882a(MapSettingFragment.this.f10275j);
            }
        }
    };

    /* renamed from: j */
    private List<Setting> f10275j = new ArrayList();

    /* renamed from: a */
    public boolean f10266a = false;

    /* renamed from: c */
    List<FirmwareInfo> f10268c = null;

    /* renamed from: v */
    private boolean f10287v = false;

    /* renamed from: w */
    private int f10288w = 0;

    /* renamed from: x */
    private int f10289x = 0;

    /* renamed from: y */
    private int f10290y = 0;

    /* renamed from: z */
    private boolean f10291z = false;

    /* renamed from: H */
    private boolean f10251H = false;

    /* renamed from: I */
    private long f10252I = 0;

    /* renamed from: K */
    private boolean f10254K = true;

    /* renamed from: L */
    private boolean f10255L = false;

    /* renamed from: M */
    private boolean f10256M = false;

    /* renamed from: N */
    private boolean f10257N = false;

    /* renamed from: O */
    private boolean f10258O = false;

    /* renamed from: P */
    private String f10259P = C1756a.f4519L;

    /* renamed from: Q */
    private String f10260Q = RemoteModelActivity.f10053a;

    /* renamed from: S */
    private int f10262S = 60;

    /* renamed from: T */
    private C1717b.AbstractC1725a f10263T = new C1717b.AbstractC1725a() { // from class: com.fimi.soul.module.setting.MapSettingFragment.4
        @Override // com.fimi.soul.p168b.C1717b.AbstractC1725a
        /* renamed from: a */
        public boolean mo30069a() {
            return false;
        }
    };

    /* renamed from: Y */
    private int f10264Y = -1;

    /* renamed from: Z */
    private Handler f10265Z = new Handler() { // from class: com.fimi.soul.module.setting.MapSettingFragment.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    MapSettingFragment.this.f10270e.mo29801a();
                    return;
                case 1:
                    if (MapSettingFragment.this.f10257N) {
                        return;
                    }
                    MapSettingFragment.this.f10270e.mo29787e();
                    return;
                case 2:
                    MapSettingFragment.this.f10270e.mo29793b();
                    return;
                case 3:
                    C2912d.m29999a(MapSettingFragment.this.f10281p).m30001a();
                    return;
                case 4:
                default:
                    return;
                case 5:
                    if (MapSettingFragment.this.f10258O) {
                        return;
                    }
                    MapSettingFragment.this.f10270e.mo29788d();
                    return;
                case 6:
                    Log.d(MapSettingFragment.f10248X, "handleMessage: TIME");
                    MapSettingFragment.this.m30107a((C1827d) C1783b.m34166a().m34150d());
                    sendEmptyMessageDelayed(6, 5000L);
                    return;
                case 7:
                    MapSettingFragment.this.m30070u();
                    return;
            }
        }
    };

    /* renamed from: com.fimi.soul.module.setting.MapSettingFragment$a */
    /* loaded from: classes.dex */
    public interface AbstractC2889a {
        /* renamed from: c */
        void mo30068c();
    }

    /* renamed from: a */
    private void m30108a(View view) {
        this.f10283r = (PercentRelativeLayout) view.findViewById(C1704R.C1706id.heardView);
        this.f10279n = (Button) this.f10283r.findViewById(C1704R.C1706id.black_btn);
        this.f10272g = (ListView) view.findViewById(C1704R.C1706id.setting_lv);
        this.f10280o = (TextView) this.f10283r.findViewById(C1704R.C1706id.tv_settingTitle);
        this.f10284s = C1681v.m34543a(getActivity());
        this.f10285t = (C1827d) C1783b.m34166a().m34150d();
        this.f10279n.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m30107a(C1827d c1827d) {
        CameraValue.PAGE_CAMERA_MENU_ALBUM = 2;
        if ("menu_album".equals("") || !c1827d.e() || C1681v.m34543a(this.f10277l).m34495v() != DeviceType.DEVICE_4K) {
            return;
        }
        c1827d.m33989u().m34054a("menu_album", C1831e.f4911cE);
    }

    /* renamed from: a */
    private void m30106a(C2083a c2083a) {
        C2155br c2155br = new C2155br();
        c2155br.f6616d = C2186r.f6822a;
        c2155br.f6617e = (byte) 1;
        c2155br.f6618f = (byte) 0;
        c2083a.mo32906ab().mo32587a(c2155br.mo32762b());
        m30085h();
    }

    /* renamed from: o */
    private void m30076o() {
        this.f10267b = new C2046b(this.f10277l);
        this.f10267b.m33138a(this);
        this.f10267b.m33140a();
        this.f10286u = C2015y.m33256a(this.f10277l);
        this.f10249F = C1973k.m33368a(this.f10277l);
        if (!C3103au.m29221b(this.f10277l) || !this.f10281p.mo32905ac()) {
            return;
        }
        this.f10249F.m33366a(C1756a.m34259c(this.f10277l), C1973k.f5474a, new AbstractC1945k() { // from class: com.fimi.soul.module.setting.MapSettingFragment.5
            @Override // com.fimi.soul.biz.p185m.AbstractC1945k
            /* renamed from: a */
            public void mo28106a(PlaneMsg planeMsg, File file) {
                if (planeMsg.isSuccess()) {
                }
            }
        });
    }

    /* renamed from: p */
    private boolean m30075p() {
        return this.f10269d != null && this.f10269d.size() > 0;
    }

    /* renamed from: q */
    private void m30074q() {
        if (this.f10266a) {
            this.f10280o.setText(C1704R.C1707string.camera_setting);
            if (this.f10274i == null) {
                this.f10274i = new C1717b(getActivity(), this.f10281p);
                this.f10274i.m34361a(this.f10263T);
            }
            this.f10274i.m34362a();
            this.f10274i.m34351b();
            this.f10272g.setAdapter((ListAdapter) this.f10274i);
            this.f10272g.setOnItemClickListener(this.f10274i);
        } else if (this.f10273h != null && this.f10275j.size() > 0) {
            this.f10272g.setAdapter((ListAdapter) this.f10273h);
            this.f10272g.setOverScrollMode(2);
            this.f10272g.setOnItemClickListener(this);
            if (this.f10264Y != C1681v.m34543a(getActivity()).m34495v()) {
                m30110a();
            }
            m30073r();
            this.f10272g.setSelectionFromTop(this.f10288w, this.f10289x);
            this.f10280o.setText(C1704R.C1707string.setting);
        } else {
            this.f10280o.setText(C1704R.C1707string.setting);
            this.f10273h = new C2932i(this.f10277l, this.f10281p);
            this.f10273h.m29887a((C2932i.AbstractC2935b) this);
            this.f10273h.m29886a((C2932i.AbstractC2936c) this);
            this.f10273h.m29888a((C2932i.AbstractC2934a) this);
            this.f10272g.setAdapter((ListAdapter) this.f10273h);
            this.f10272g.setOverScrollMode(2);
            this.f10272g.setOnItemClickListener(this);
            m30110a();
            m30073r();
            this.f10272g.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.fimi.soul.module.setting.MapSettingFragment.6
                @Override // android.widget.AbsListView.OnScrollListener
                public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                }

                @Override // android.widget.AbsListView.OnScrollListener
                public void onScrollStateChanged(AbsListView absListView, int i) {
                    int i2 = 0;
                    if (MapSettingFragment.this.f10266a) {
                        return;
                    }
                    if (i == 0) {
                        MapSettingFragment.this.f10288w = MapSettingFragment.this.f10272g.getFirstVisiblePosition();
                    }
                    if (MapSettingFragment.this.f10275j == null) {
                        return;
                    }
                    View childAt = MapSettingFragment.this.f10272g.getChildAt(0);
                    MapSettingFragment mapSettingFragment = MapSettingFragment.this;
                    if (childAt != null) {
                        i2 = childAt.getTop();
                    }
                    mapSettingFragment.f10289x = i2;
                }
            });
        }
    }

    /* renamed from: r */
    private void m30073r() {
        this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)).setIsOPen(Boolean.valueOf(this.f10254K));
        this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.OPTICAL_FLOW_MODE)).setIsOPen(Boolean.valueOf(this.f10256M));
        this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).setIsOPen(Boolean.valueOf(this.f10255L));
        this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).setIsOPen(false);
        this.f10268c = C3021a.m29616a().m29608d();
        if (this.f10284s.m34546a().contains("isfirstloading")) {
            this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.XIAOMI_ACCOUNT)).setIsOPen(true);
            this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.XIAOMI_ACCOUNT)).setContent(C1756a.m34259c(this.f10277l).getXiaomiID());
        } else {
            this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.XIAOMI_ACCOUNT)).setIsOPen(false);
        }
        if (this.f10284s.m34546a().getInt(RemoteModelActivity.f10053a, 0) == 0) {
            this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_REMOTE_MODE)).setContent(getResources().getString(C1704R.C1707string.modelcannal));
        } else {
            this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_REMOTE_MODE)).setContent(getResources().getString(C1704R.C1707string.modelcannaljp));
        }
        if (!this.f10281p.mo32906ab().mo32588a() || !this.f10281p.mo32905ac()) {
            this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.CONNECT_PLANE)).setIsOPen(true);
        }
        this.f10269d = C3021a.m29616a().m29607e();
        m30072s();
        this.f10273h.m29882a(this.f10275j);
    }

    /* renamed from: s */
    private void m30072s() {
        this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FIMWARE_UPDATE)).setIsOPen(true);
        if (m30075p() || (this.f10268c != null && this.f10268c.size() > 0)) {
            this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FIMWARE_UPDATE)).setDisplayTv(true);
        } else {
            this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FIMWARE_UPDATE)).setDisplayTv(false);
        }
    }

    /* renamed from: t */
    private void m30071t() {
        final DialogC3275i.C3276a c3276a = new DialogC3275i.C3276a(getActivity(), this.f10281p);
        final String m34181q = C1772d.m34208a().m34181q();
        final String m34182p = C1772d.m34208a().m34182p();
        if (m34181q != null) {
            c3276a.m28524c(m34181q);
        }
        if (m34182p != null) {
            c3276a.m28523d(m34182p);
        }
        c3276a.m28530a(getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.MapSettingFragment.10
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.MapSettingFragment.11
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (C11359f.m1297a(c3276a.m28532a())) {
                    c3276a.m28527b(MapSettingFragment.this.getString(C1704R.C1707string.relay_error_ssid));
                } else if (C11359f.m1297a(c3276a.m28529b())) {
                    c3276a.m28527b(MapSettingFragment.this.getString(C1704R.C1707string.relay_error_pas));
                } else if (c3276a.m28529b().length() < 8) {
                    c3276a.m28527b(MapSettingFragment.this.getString(C1704R.C1707string.relay_error_pas));
                } else if (m34181q != null && m34181q.equals(c3276a.m28532a()) && m34182p != null && m34182p.equals(c3276a.m28529b())) {
                    dialogInterface.dismiss();
                } else {
                    C2024a m33219a = C2024a.m33219a();
                    m33219a.m33217a(c3276a.m28532a());
                    m33219a.m33214b(c3276a.m28529b());
                    m33219a.m33216b();
                }
            }
        });
        c3276a.m28526c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m30070u() {
        boolean m34187k = C1772d.m34208a().m34187k();
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        int m29604a = c3022b != null ? c3022b.m29604a() : 0;
        if (m34187k || m29604a >= C2912d.f10400g) {
            C2912d.m29999a(this.f10281p).m30001a();
        }
    }

    /* renamed from: a */
    public void m30110a() {
        this.f10275j.clear();
        if (C1681v.m34543a(getActivity()).m34495v() == DeviceType.DEVICE_4K) {
            m30096c();
        } else if (C1681v.m34543a(getActivity()).m34495v() == DeviceType.DEVICE_1080P) {
            m30099b();
        }
        this.f10264Y = C1681v.m34543a(getActivity()).m34495v();
    }

    /* renamed from: a */
    public void m30109a(int i) {
        C2336f m32984g = this.f10281p.m32984g();
        this.f10281p.mo32906ab().mo32587a(m32984g.m32006a(i, m32984g));
    }

    @Override // com.fimi.soul.module.setting.C2932i.AbstractC2935b
    /* renamed from: a */
    public void mo29880a(SwitchButton switchButton) {
        if (this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)).getIsOPen().booleanValue()) {
            this.f10265Z.sendEmptyMessageDelayed(7, 1000L);
        }
        this.f10270e.mo29796a(switchButton, this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)));
        this.f10273h.notifyDataSetChanged();
    }

    @Override // com.fimi.soul.biz.update.C2046b.AbstractC2054a
    /* renamed from: a */
    public void mo30102a(String str) {
        this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.CHECK_UPDATE)).setIsOPen(false);
        this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.CHECK_UPDATE)).setContent(str);
        this.f10273h.m29882a(this.f10275j);
        this.f10268c = C3021a.m29616a().m29608d();
    }

    /* renamed from: a */
    public void m30101a(boolean z) {
        byte b = z ? (byte) 2 : (byte) 1;
        C2155br c2155br = new C2155br();
        c2155br.f6616d = (byte) 116;
        c2155br.f6617e = (byte) 1;
        c2155br.f6618f = b;
        this.f10281p.mo32906ab().mo32587a(c2155br.mo32762b());
    }

    /* renamed from: a */
    public void m30100a(boolean z, String str) {
        if (this.f10261R == null) {
            this.f10261R = new C3288a(getActivity(), new AbstractC3290b() { // from class: com.fimi.soul.module.setting.MapSettingFragment.9
                @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
                /* renamed from: a */
                public void mo28463a(int i) {
                }

                @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
                /* renamed from: a */
                public void mo28462a(int i, int i2) {
                    MapSettingFragment.this.f10262S = i;
                    if (!MapSettingFragment.this.f10281p.mo32906ab().mo32588a() || !MapSettingFragment.this.f10281p.mo32905ac()) {
                        return;
                    }
                    MapSettingFragment.this.m30109a(i);
                }

                @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
                /* renamed from: b */
                public void mo28461b(int i, int i2) {
                }
            });
        }
        this.f10261R.m28466a(this.f10262S, z, str);
    }

    /* renamed from: b */
    public void m30099b() {
        C2932i.EnumC2937d[] values;
        boolean z;
        for (C2932i.EnumC2937d enumC2937d : C2932i.EnumC2937d.values()) {
            int i = 0;
            while (true) {
                if (i >= C2932i.f10541c.length) {
                    z = true;
                    break;
                } else if (enumC2937d == C2932i.f10541c[i]) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                this.f10276k = new Setting();
                this.f10276k.addObserver(this.f10271f);
                this.f10276k.setIsOPen(true);
                this.f10276k.setSettingAdaptState(enumC2937d);
                this.f10275j.add(this.f10276k);
            }
        }
    }

    @Override // com.fimi.soul.module.setting.C2932i.AbstractC2936c
    /* renamed from: b */
    public void mo29879b(int i) {
        if (i == 4) {
            this.f10270e.mo29795a(this.f10275j, this.f10273h);
        } else if (i != 2) {
        } else {
            this.f10270e.mo29794a(this.f10275j, this.f10273h, this.f10249F);
        }
    }

    /* renamed from: c */
    public void m30096c() {
        C2932i.EnumC2937d[] values;
        boolean z;
        for (C2932i.EnumC2937d enumC2937d : C2932i.EnumC2937d.values()) {
            int i = 0;
            while (true) {
                if (i >= C2932i.f10542d.length) {
                    z = true;
                    break;
                } else if (enumC2937d == C2932i.f10542d[i]) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                this.f10276k = new Setting();
                this.f10276k.addObserver(this.f10271f);
                this.f10276k.setIsOPen(true);
                this.f10276k.setSettingAdaptState(enumC2937d);
                this.f10275j.add(this.f10276k);
            }
        }
    }

    /* renamed from: d */
    public boolean m30093d() {
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        boolean z = c3022b != null && c3022b.m29604a() > 0 && c3022b.m29604a() >= (C1681v.m34543a(getActivity()).m34495v() == DeviceType.DEVICE_4K ? 1067 : C1681v.m34543a(getActivity()).m34495v() == DeviceType.DEVICE_1080P ? 1902 : 0);
        if (!z) {
            C1688z.m34447a(this.f10277l, this.f10277l.getString(C1704R.C1707string.fc_update_tip), C1688z.f4191b);
        }
        return z;
    }

    /* renamed from: e */
    public void m30091e() {
        if (!this.f10281p.mo32906ab().mo32588a() || !this.f10281p.mo32905ac()) {
            C1688z.m34449a(getActivity(), (int) C1704R.C1707string.front_lights_setting_no_connect, 3000);
            return;
        }
        switch (m30089f()) {
            case 0:
                m30100a(false, getString(C1704R.C1707string.front_lights_setting_app_enable_tip));
                return;
            case 1:
                m30100a(true, "");
                return;
            case 2:
                m30100a(false, getString(C1704R.C1707string.front_lights_setting_app_enable_tip2));
                return;
            default:
                return;
        }
    }

    /* renamed from: f */
    public int m30089f() {
        String content = this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).getContent();
        if (this.f10281p.m33001au().m32390g().isEnforcementAtti()) {
            return 2;
        }
        return (content == null || !content.equals(getString(C1704R.C1707string.ev_control))) ? 0 : 1;
    }

    /* renamed from: g */
    public boolean m30087g() {
        String content = this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).getContent();
        return content != null && content.equals(getString(C1704R.C1707string.ev_control));
    }

    /* renamed from: h */
    public void m30085h() {
        this.f10281p.mo32906ab().mo32587a(new C2336f().m31995f());
    }

    /* renamed from: i */
    public void m30083i() {
        this.f10262S = (int) ((this.f10281p.m32984g().m32000c() * 100.0f) / 1024.0f);
    }

    /* renamed from: j */
    public void m30081j() {
        if (this.f10270e == null) {
            this.f10270e = new C2955c(this.f10281p, this.f10277l);
        }
        this.f10270e.mo29787e();
    }

    /* renamed from: k */
    public void m30079k() {
        this.f10265Z.sendEmptyMessage(6);
    }

    @Override // com.fimi.soul.module.setting.C2932i.AbstractC2934a
    /* renamed from: l */
    public void mo29881l() {
    }

    /* renamed from: m */
    public boolean m30078m() {
        if (this.f10266a) {
            this.f10266a = false;
            this.f10285t.m33989u().m34045e();
            m30074q();
            return false;
        }
        this.f10265Z.removeCallbacksAndMessages(null);
        m30077n();
        this.f10278m.mo30068c();
        return true;
    }

    /* renamed from: n */
    public void m30077n() {
        CameraValue.PAGE_CAMERA_MENU_ALBUM = 0;
        if (!"menu_album".equals("")) {
            C1827d c1827d = (C1827d) C1783b.m34166a().m34150d();
            if (!c1827d.e() || C1681v.m34543a(this.f10277l).m34495v() != DeviceType.DEVICE_4K) {
                return;
            }
            c1827d.m33989u().m34054a("menu_album", "off");
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 100:
                this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).setContent(intent.getStringExtra("content"));
                this.f10273h.notifyDataSetChanged();
                return;
            default:
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f10277l = activity;
        this.f10278m = (AbstractC2889a) activity;
        this.f10281p = ((DroidPlannerApp) activity.getApplication()).f4493a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.black_btn /* 2131756179 */:
                if (this.f10266a) {
                    this.f10266a = false;
                    ((C1827d) C1783b.m34166a().m34150d()).m33989u().m34045e();
                    m30074q();
                    return;
                }
                this.f10265Z.removeCallbacksAndMessages(null);
                m30077n();
                this.f10278m.mo30068c();
                return;
            default:
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.activity_general_setting, viewGroup, false);
        m30108a(inflate);
        m30076o();
        return inflate;
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (c2083a.mo32906ab().mo32588a() && c2083a.mo32905ac()) {
            switch (enumC2105a) {
                case Remotecontrol:
                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.CONNECT_PLANE)).setIsOPen(false);
                    break;
                case NEW_HAND_OPERATE:
                    if (c2083a.m32999aw().m32263d() == 51) {
                        if (C1642c.m34889b().mo34433b() != null && C1642c.m34889b().mo34433b().isShowing()) {
                            C1642c.m34889b().mo34429c();
                        }
                        if (c2083a.m32999aw().m32261f() == 1) {
                            if (c2083a.m32999aw().m32258i() == 0) {
                                C1688z.m34450a(this.f10277l, (int) C1704R.C1707string.set_model_success);
                                this.f10265Z.sendEmptyMessageDelayed(1, 1000L);
                                this.f10265Z.sendEmptyMessageDelayed(1, 2000L);
                                this.f10257N = false;
                            } else {
                                C1688z.m34450a(this.f10277l, (int) C1704R.C1707string.set_model_fail);
                            }
                            if (c2083a.m32999aw().m32262e() == 0) {
                                this.f10254K = true;
                                this.f10255L = false;
                                this.f10256M = false;
                                this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)).setIsOPen(true);
                                this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.OPTICAL_FLOW_MODE)).setIsOPen(false);
                                this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).setIsOPen(false);
                                this.f10270e.mo29787e();
                            } else {
                                this.f10254K = false;
                                this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)).setIsOPen(false);
                            }
                        }
                        if (c2083a.m32999aw().m32261f() == 3) {
                            if (c2083a.m32999aw().m32258i() == 0) {
                                C1688z.m34450a(this.f10277l, (int) C1704R.C1707string.set_model_success);
                                this.f10265Z.sendEmptyMessageDelayed(5, 1000L);
                                this.f10265Z.sendEmptyMessageDelayed(5, 2000L);
                                this.f10258O = false;
                            } else {
                                C1688z.m34450a(this.f10277l, (int) C1704R.C1707string.set_model_fail);
                            }
                            if (c2083a.m32999aw().m32260g() == 2) {
                                if (c2083a.m32999aw().m32259h() == 1.0f) {
                                    this.f10254K = false;
                                    this.f10255L = false;
                                    this.f10256M = true;
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).setIsOPen(false);
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.OPTICAL_FLOW_MODE)).setIsOPen(true);
                                } else {
                                    this.f10256M = false;
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.OPTICAL_FLOW_MODE)).setIsOPen(false);
                                }
                            }
                            if (c2083a.m32999aw().m32260g() == 4) {
                                if (c2083a.m32999aw().m32259h() == 1.0f) {
                                    this.f10254K = false;
                                    this.f10255L = true;
                                    this.f10256M = false;
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.OPTICAL_FLOW_MODE)).setIsOPen(false);
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).setIsOPen(true);
                                    this.f10251H = true;
                                    m30101a(true);
                                    m30106a(c2083a);
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).setContent(this.f10277l.getString(C1704R.C1707string.gps_atti));
                                } else {
                                    this.f10255L = false;
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).setIsOPen(false);
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).setIsOPen(false);
                                }
                            }
                        }
                    }
                    if (c2083a.m32999aw().m32263d() == 34) {
                        this.f10257N = true;
                        this.f10258O = true;
                        if (c2083a.m32999aw().m32261f() == 1 || c2083a.m32999aw().m32261f() == 3) {
                            if (c2083a.m32999aw().m32261f() == 1) {
                                if (c2083a.m32999aw().m32262e() == 0) {
                                    this.f10254K = true;
                                    this.f10255L = false;
                                    this.f10256M = false;
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)).setIsOPen(true);
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.OPTICAL_FLOW_MODE)).setIsOPen(false);
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).setIsOPen(false);
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).setIsOPen(false);
                                    this.f10251H = false;
                                    m30101a(false);
                                    m30106a(c2083a);
                                } else {
                                    this.f10254K = false;
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)).setIsOPen(false);
                                }
                            }
                            if ((((int) c2083a.m32999aw().m32259h()) & 1) == 1) {
                                this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).setIsOPen(false);
                                this.f10255L = false;
                            }
                            if ((((int) c2083a.m32999aw().m32259h()) & 2) == 2) {
                                this.f10254K = false;
                                this.f10255L = false;
                                this.f10256M = true;
                                this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).setIsOPen(false);
                                this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.OPTICAL_FLOW_MODE)).setIsOPen(true);
                            } else {
                                this.f10256M = false;
                                this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.OPTICAL_FLOW_MODE)).setIsOPen(false);
                            }
                            if ((((int) c2083a.m32999aw().m32259h()) & 4) == 4) {
                                if (!this.f10254K) {
                                    this.f10251H = true;
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).setContent(this.f10277l.getString(C1704R.C1707string.gps_atti));
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).setIsOPen(true);
                                    this.f10254K = false;
                                    this.f10255L = true;
                                    this.f10256M = false;
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).setIsOPen(true);
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.OPTICAL_FLOW_MODE)).setIsOPen(false);
                                    break;
                                }
                            } else if (System.currentTimeMillis() - this.f10252I < 1000) {
                                return;
                            } else {
                                this.f10252I = System.currentTimeMillis();
                                this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).setIsOPen(false);
                                this.f10251H = false;
                                m30101a(false);
                                m30106a(c2083a);
                                break;
                            }
                        }
                    }
                    break;
                case backControl:
                    C2333c mo32918R = c2083a.mo32918R();
                    if (mo32918R != null && mo32918R.m32031b() == 115) {
                        if (this.f10251H) {
                            return;
                        }
                        if (mo32918R.m32030c() == 2) {
                            switch (mo32918R.f7579d) {
                                case 1:
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).setContent(getString(C1704R.C1707string.ev_control));
                                    break;
                                case 2:
                                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).setContent(getString(C1704R.C1707string.light_control));
                                    break;
                            }
                        }
                    }
                    this.f10273h.notifyDataSetChanged();
                    break;
                case BRIGHTNESS:
                    m30083i();
                    if (this.f10274i != null) {
                        this.f10274i.m34341d();
                        break;
                    }
                    break;
            }
        } else {
            this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.CONNECT_PLANE)).setIsOPen(true);
            switch (enumC2105a) {
                case CLEANALLOBJ:
                    m30072s();
                    this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.CONNECT_PLANE)).setIsOPen(true);
                    break;
            }
        }
        if (enumC2105a == C2104d.EnumC2105a.backControl && c2083a.mo32918R().m32031b() == 114) {
            C2540a.m31307a().m31305a("98");
            if (c2083a.mo32918R().m32029d() == 2) {
                this.f10284s.m34546a().edit().putInt(RemoteModelActivity.f10053a, 1).commit();
                this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_REMOTE_MODE)).setContent(getResources().getString(C1704R.C1707string.modelcannaljp));
            } else if (c2083a.mo32918R().m32029d() == 1) {
                this.f10284s.m34546a().edit().putInt(RemoteModelActivity.f10053a, 0).commit();
                this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_REMOTE_MODE)).setContent(getResources().getString(C1704R.C1707string.modelcannal));
            }
            if (this.f10273h != null) {
                this.f10273h.m29889a(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_REMOTE_MODE), this.f10272g.getChildAt(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_REMOTE_MODE)));
            }
        }
        switch (enumC2105a) {
            case Remotecontrol:
            case CLEANALLOBJ:
                if (!c2083a.mo32905ac()) {
                    this.f10291z = true;
                    return;
                } else if (!this.f10291z) {
                    return;
                } else {
                    this.f10291z = false;
                    this.f10270e.mo29787e();
                    return;
                }
            default:
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C2932i.EnumC2937d settingAdaptState = this.f10275j.get(i).getSettingAdaptState();
        if (settingAdaptState == C2932i.EnumC2937d.CONNECT_PLANE) {
            if (!this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.CONNECT_PLANE)).getIsOPen().booleanValue()) {
                return;
            }
            this.f10265Z.removeCallbacksAndMessages(null);
            m30077n();
            this.f10284s.m34546a().edit().putBoolean(C1756a.f4519L, false).commit();
            Intent intent = new Intent(this.f10277l, LoginActivity.class);
            C1827d c1827d = (C1827d) C1783b.m34166a().m34150d();
            c1827d.n();
            c1827d.a(-1);
            intent.putExtra(AbstractC1493b.f3577j, 2);
            startActivityForResult(intent, 0);
        }
        if (settingAdaptState == C2932i.EnumC2937d.FIMWARE_UPDATE) {
            if (!this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FIMWARE_UPDATE)).getIsOPen().booleanValue()) {
                return;
            }
            if (m30075p()) {
                C1645c.m34884a().mo34877a(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, (List) this.f10269d);
                Intent intent2 = new Intent(this.f10277l, FindOnlineFirmwareAvtivity.class);
                CameraValue.isFindFirmware = true;
                startActivity(intent2);
            } else if (this.f10268c == null || this.f10268c.size() <= 0) {
                C1688z.m34450a(this.f10277l, (int) C1704R.C1707string.version_tip);
            } else {
                Intent intent3 = new Intent(this.f10277l, FindNewFirmwareAvtivity.class);
                CameraValue.isFindFirmware = true;
                startActivity(intent3);
            }
        }
        if (settingAdaptState == C2932i.EnumC2937d.COMPASS_CALIBRATION) {
            Intent intent4 = new Intent(getActivity(), CaliCompassActivity.class);
            intent4.putExtra(C1756a.f4525R, true);
            startActivity(intent4);
        }
        if (settingAdaptState == C2932i.EnumC2937d.GIMBAL_CALIBRATION) {
            startActivity(new Intent(this.f10277l, GimalCalibrationActivity.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.GIMBAL_TUNE_PARAMETER) {
            startActivity(new Intent(this.f10277l, GimalTuneParameterActivity.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.NEW_HAND_GUIDE) {
            this.f10284s.m34546a().edit().putBoolean(C1756a.f4519L, true).commit();
            startActivity(new Intent(this.f10277l, NewHandActivity.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.NEW_HAND_MODE) {
            SwitchButton switchButton = (SwitchButton) view.findViewById(C1704R.C1706id.switch_btn);
            if (this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)).getIsOPen().booleanValue()) {
                this.f10265Z.sendEmptyMessageDelayed(7, 1000L);
            }
            this.f10270e.mo29796a(switchButton, this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)));
            this.f10273h.notifyDataSetChanged();
        }
        if (settingAdaptState == C2932i.EnumC2937d.GPS_MODE) {
            if (this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)).getIsOPen().booleanValue()) {
                return;
            }
            Intent intent5 = new Intent(this.f10277l, GpsSettingActivity.class);
            intent5.putExtra(GpsSettingActivity.f10618b, this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)).getIsOPen());
            intent5.putExtra(GpsSettingActivity.f10619c, this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.OPTICAL_FLOW_MODE)).getIsOPen());
            intent5.putExtra(GpsSettingActivity.f10620d, this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).getIsOPen());
            this.f10277l.startActivity(intent5);
        }
        if (settingAdaptState == C2932i.EnumC2937d.SATELLITE_MAP) {
            SwitchButton switchButton2 = (SwitchButton) view.findViewById(C1704R.C1706id.switch_btn);
            if (C1981o.m33342a(this.f10277l).m33334e()) {
                switchButton2.m34420a(false, true);
                C1981o.m33342a(this.f10277l).m33331f(false);
                PreferenceManager.getDefaultSharedPreferences(this.f10277l).edit().putInt(C2279c.f7282s, 1).commit();
            } else {
                switchButton2.m34420a(true, true);
                C1981o.m33342a(this.f10277l).m33331f(true);
                PreferenceManager.getDefaultSharedPreferences(this.f10277l).edit().putInt(C2279c.f7282s, 2).commit();
            }
        }
        if (settingAdaptState == C2932i.EnumC2937d.SHOW_MORE_PAT) {
            startActivity(new Intent(this.f10277l, MoreInfoSettingAcitivity.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.CALIBRATION_REMOTE) {
            startActivity(new Intent(this.f10277l, RemoteCalibration.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.SWITCH_REMOTE_MODE) {
            if (this.f10281p.mo32905ac()) {
                C1688z.m34447a(this.f10277l, this.f10277l.getString(C1704R.C1707string.close_plane_switch_rocket), C1688z.f4191b);
                return;
            }
            startActivity(new Intent(this.f10277l, RemoteModelActivity.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.CAMERA_SETTING) {
            this.f10266a = true;
            m30074q();
        }
        if (settingAdaptState == C2932i.EnumC2937d.HISTORY_MESSAGE) {
            startActivity(new Intent(this.f10277l, HistoryMessageActivity.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.XIAOMI_ACCOUNT) {
            if (this.f10284s.m34546a().contains("isfirstloading")) {
                new DialogC3245f.C3246a(this.f10277l).m28641a(this.f10277l.getString(C1704R.C1707string.log_out)).m28633c(17).m28644a(getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(this.f10277l.getString(C1704R.C1707string.exit), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.MapSettingFragment.8
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        C1756a.m34265a(MapSettingFragment.this.f10277l);
                        ((Setting) MapSettingFragment.this.f10275j.get(MapSettingFragment.this.f10273h.m29885a(C2932i.EnumC2937d.XIAOMI_ACCOUNT))).setIsOPen(false);
                        MapSettingFragment.this.f10273h.m29882a(MapSettingFragment.this.f10275j);
                        MapSettingFragment.this.f10286u.m33244b(C1756a.m34259c(MapSettingFragment.this.f10277l), new AbstractC1945k() { // from class: com.fimi.soul.module.setting.MapSettingFragment.8.1
                            @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                            /* renamed from: a */
                            public void mo28106a(PlaneMsg planeMsg, File file) {
                            }
                        });
                        MapSettingFragment.this.f10284s.m34546a().edit().putBoolean(C1756a.f4519L, false).commit();
                        Intent intent6 = new Intent(MapSettingFragment.this.f10277l, LoginActivity.class);
                        intent6.putExtra(AbstractC1493b.f3577j, 4);
                        MapSettingFragment.this.startActivity(intent6);
                        ((FlightActivity) MapSettingFragment.this.f10277l).finish();
                        ((FlightActivity) MapSettingFragment.this.f10277l).overridePendingTransition(17432576, 17432577);
                    }
                }).m28640a(this.f10277l.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.MapSettingFragment.7
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                    }
                }).m28645a().show();
            } else {
                this.f10284s.m34546a().edit().putBoolean(C1756a.f4519L, true).commit();
                Intent intent6 = new Intent(this.f10277l, LoginActivity.class);
                intent6.putExtra(AbstractC1493b.f3577j, 4);
                startActivity(intent6);
            }
        }
        if (settingAdaptState == C2932i.EnumC2937d.USER_FEEDBACK) {
            startActivity(new Intent(this.f10277l, UserFeedBackActivity.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.MAP_CODE_CORREECTION) {
            SwitchButton switchButton3 = (SwitchButton) view.findViewById(C1704R.C1706id.switch_btn);
            boolean z = this.f10284s.m34546a().getBoolean(C2279c.f7238bN, false);
            C2022a m33223a = C2022a.m33223a();
            if (!z) {
                this.f10284s.m34546a().edit().putBoolean(C2279c.f7238bN, true).commit();
                switchButton3.setSwitchState(true);
                m33223a.m33222a(false);
                if (this.f10281p != null) {
                    this.f10281p.mo32909a(C2104d.EnumC2105a.UPDATE_FLYZONE);
                }
            } else {
                this.f10284s.m34546a().edit().putBoolean(C2279c.f7238bN, false).commit();
                switchButton3.setSwitchState(false);
                m33223a.m33222a(true);
                if (this.f10281p != null) {
                    this.f10281p.mo32909a(C2104d.EnumC2105a.UPDATE_FLYZONE);
                }
            }
        }
        if (settingAdaptState == C2932i.EnumC2937d.CHECK_UPDATE) {
            if (C3103au.m29221b(this.f10277l)) {
                C1688z.m34447a(this.f10277l, this.f10277l.getString(C1704R.C1707string.checking_update), C1688z.f4191b);
                this.f10267b.m33131a(true);
            } else {
                C1688z.m34449a(this.f10277l, (int) C1704R.C1707string.login_result_net, 1000);
            }
        }
        if (settingAdaptState == C2932i.EnumC2937d.ABOUT) {
            startActivity(new Intent(this.f10277l, AboutActivity.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.BATTERY_INFO) {
            startActivity(new Intent(this.f10277l, BatteryInfoActivity.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.OPTICAL_FLOW_MODE) {
            this.f10270e.mo29794a(this.f10275j, this.f10273h, this.f10249F);
        }
        if (settingAdaptState == C2932i.EnumC2937d.FORCED_ATTITUDE_MODE) {
            this.f10270e.mo29795a(this.f10275j, this.f10273h);
        }
        if (settingAdaptState == C2932i.EnumC2937d.FLIGHT_RECORD) {
            startActivity(new Intent(this.f10277l, FlyRecordActivity.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.FLIGHT_INFO) {
            startActivity(new Intent(this.f10277l, FlyLogsActivity.class));
        } else if (settingAdaptState == C2932i.EnumC2937d.IMU_DETECTION && C1681v.m34543a(getActivity()).m34495v() == DeviceType.DEVICE_4K) {
            startActivity(new Intent(this.f10277l, IMU4KActivity.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.FT_TRUN) {
            SwitchButton switchButton4 = (SwitchButton) view.findViewById(C1704R.C1706id.switch_btn);
            if (C1642c.m34885e().m34501p()) {
                C1642c.m34885e().m34516g(false);
                switchButton4.m34420a(false, true);
            } else {
                C1642c.m34885e().m34516g(true);
                switchButton4.m34420a(true, true);
            }
            this.f10273h.notifyDataSetChanged();
            this.f10281p.mo32909a(C2104d.EnumC2105a.ImperialUnits);
        }
        if (settingAdaptState == C2932i.EnumC2937d.PAIR_REMOTE) {
            startActivity(new Intent(this.f10277l, PairCodeActivity.class));
        }
        if (settingAdaptState == C2932i.EnumC2937d.SWITCH_RIGHT_MODE) {
            Intent intent7 = new Intent(this.f10277l, RightRollerSetActivity.class);
            intent7.putExtra("GPS_ATTI", this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).getIsOPen());
            intent7.putExtra("curModel", this.f10275j.get(this.f10273h.m29885a(C2932i.EnumC2937d.SWITCH_RIGHT_MODE)).getContent());
            getActivity().startActivityForResult(intent7, 100);
        }
        if (settingAdaptState == C2932i.EnumC2937d.RELAY_WIFI_CONFIGURE) {
            if (!this.f10281p.mo32906ab().mo32588a()) {
                C1688z.m34449a(getActivity(), (int) C1704R.C1707string.connectdefault, 3000);
            } else if (this.f10281p.m33009am()) {
                C1688z.m34449a(getActivity(), (int) C1704R.C1707string.relay_error_in_sky_tip, 3000);
                return;
            } else {
                m30071t();
            }
        }
        if (settingAdaptState != C2932i.EnumC2937d.FRONTLIGHTSSETTING || !m30093d()) {
            return;
        }
        m30091e();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
        ((FlightActivity) this.f10277l).m30481j();
        ((FlightActivity) this.f10277l).m30479k();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        m30074q();
        this.f10281p.mo32908a(this);
        this.f10282q = C2523d.m31374a(this.f10281p);
        this.f10282q.m31361g();
        this.f10250G = C1772d.m34208a().m34187k();
        if (this.f10270e == null) {
            this.f10270e = new C2955c(this.f10281p, this.f10277l);
        }
        this.f10257N = false;
        this.f10270e.mo29787e();
        this.f10265Z.sendEmptyMessageDelayed(1, 500L);
        this.f10265Z.sendEmptyMessageDelayed(1, 1000L);
        this.f10259P = C1756a.f4519L;
        this.f10260Q = RemoteModelActivity.f10053a;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
        this.f10281p.mo32903b(this);
        if (this.f10267b == null || this.f10267b.m33130b() == null) {
            return;
        }
        this.f10267b.m33137a((C2046b.AbstractC2055b) null);
    }
}
