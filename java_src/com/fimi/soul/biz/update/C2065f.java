package com.fimi.soul.biz.update;

import android.content.Context;
import android.os.Message;
import android.support.p001v4.app.FragmentManager;
import android.widget.Toast;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.manager.C2011w;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.p197a.C2163bz;
import com.fimi.soul.drone.p201e.C2254g;
import com.fimi.soul.drone.p201e.C2262o;
import com.fimi.soul.drone.p201e.C2265r;
import com.fimi.soul.drone.p201e.C2266s;
import com.fimi.soul.drone.p201e.C2267t;
import com.fimi.soul.drone.p204h.C2283f;
import com.fimi.soul.drone.p205i.C2318ax;
import com.fimi.soul.drone.p205i.C2328bg;
import com.fimi.soul.drone.p205i.C2338h;
import com.fimi.soul.drone.p205i.C2349j;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.entity.UpgradeResultInfo;
import com.fimi.soul.module.dronemanage.C2715j;
import com.fimi.soul.module.update.p218a.C3021a;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
/* renamed from: com.fimi.soul.biz.update.f */
/* loaded from: classes.dex */
public class C2065f extends AbstractC2056c implements C2104d.AbstractC2106b {

    /* renamed from: A */
    public static C2283f f5788A = null;

    /* renamed from: I */
    private static int f5790I = 0;

    /* renamed from: R */
    private static C2163bz f5791R = null;

    /* renamed from: f */
    static AbstractC2077i f5792f = null;

    /* renamed from: h */
    public static final int f5793h = 300;

    /* renamed from: i */
    public static final int f5794i = -1;

    /* renamed from: j */
    public static final String f5795j = "firmware_info";

    /* renamed from: l */
    public static final String f5797l = "sp_upgrading";

    /* renamed from: m */
    public static final int f5798m = 2;

    /* renamed from: n */
    public static final int f5799n = 3;

    /* renamed from: o */
    public static final int f5800o = 10;

    /* renamed from: p */
    public static final int f5801p = 5;

    /* renamed from: q */
    public static final int f5802q = 9;

    /* renamed from: r */
    public static final int f5803r = 100;

    /* renamed from: s */
    public static final int f5804s = 10;

    /* renamed from: B */
    List<C2283f> f5810B;

    /* renamed from: C */
    C3021a f5811C;

    /* renamed from: D */
    int f5812D;

    /* renamed from: E */
    private Timer f5813E;

    /* renamed from: F */
    private Context f5814F;

    /* renamed from: G */
    private C2083a f5815G;

    /* renamed from: J */
    private FragmentManager f5816J;

    /* renamed from: K */
    private boolean f5817K;

    /* renamed from: L */
    private Timer f5818L;

    /* renamed from: M */
    private long f5819M;

    /* renamed from: N */
    private boolean f5820N;

    /* renamed from: O */
    private int f5821O;

    /* renamed from: P */
    private AbstractC2074c f5822P;

    /* renamed from: Q */
    private int f5823Q;

    /* renamed from: S */
    private int f5824S;

    /* renamed from: g */
    public AbstractC2073b f5825g;

    /* renamed from: t */
    public int f5826t;

    /* renamed from: y */
    public C1827d f5827y;

    /* renamed from: H */
    private static int f5789H = 0;

    /* renamed from: k */
    public static int f5796k = 0;

    /* renamed from: u */
    public static boolean f5805u = false;

    /* renamed from: v */
    public static boolean f5806v = false;

    /* renamed from: w */
    public static boolean f5807w = false;

    /* renamed from: x */
    public static boolean f5808x = false;

    /* renamed from: z */
    static Queue<C2163bz> f5809z = new LinkedList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.biz.update.f$a */
    /* loaded from: classes.dex */
    public class C2072a extends TimerTask {

        /* renamed from: b */
        private C2196c f5837b;

        /* renamed from: c */
        private C2083a f5838c;

        public C2072a(C2196c c2196c, C2083a c2083a) {
            this.f5837b = c2196c;
            this.f5838c = c2083a;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C2065f.m33074p();
            this.f5838c.mo32906ab().mo32587a(this.f5837b);
            if (C2065f.f5789H == 20) {
                if (C2065f.this.f5813E != null) {
                    C2065f.this.f5813E.cancel();
                }
                if (C2065f.f5792f == null) {
                    return;
                }
                C2065f.f5792f.mo28035a(false, 0L, 0L, -1);
            }
        }
    }

    /* renamed from: com.fimi.soul.biz.update.f$b */
    /* loaded from: classes.dex */
    public interface AbstractC2073b {
        /* renamed from: a */
        void mo29622a(int i);

        /* renamed from: a */
        void mo29621a(boolean z);
    }

    /* renamed from: com.fimi.soul.biz.update.f$c */
    /* loaded from: classes.dex */
    public interface AbstractC2074c {
        /* renamed from: a */
        void mo29457a(List<UpdateVersonBean> list);
    }

    public C2065f() {
        this.f5813E = new Timer();
        this.f5826t = 1500;
        this.f5810B = new ArrayList();
        this.f5818L = new Timer();
        this.f5821O = -1;
    }

    public C2065f(Context context, C2083a c2083a) {
        this.f5813E = new Timer();
        this.f5826t = 1500;
        this.f5810B = new ArrayList();
        this.f5818L = new Timer();
        this.f5821O = -1;
        this.f5814F = context;
        this.f5815G = c2083a;
        c2083a.mo32908a(this);
        this.f5827y = (C1827d) C1783b.m34166a().m34150d();
        this.f5811C = C3021a.m29616a();
    }

    /* renamed from: a */
    private void m33099a(byte b) {
        try {
            if (this.f5815G.mo32916T().m32051a() != f5791R.f6675d) {
                return;
            }
            if (f5788A != null) {
                f5788A.m32437e();
            }
            Message message = new Message();
            message.what = 5;
            message.arg1 = f5796k;
            message.arg2 = 300;
            if (this.f5815G.mo32916T().m32051a() != f5790I) {
                this.f5812D = this.f5815G.mo32916T().m32051a();
                a().sendMessage(message);
                if (f5809z.size() <= 0) {
                    return;
                }
                m33091b();
                return;
            }
            this.f5812D = this.f5815G.mo32916T().m32051a();
            a().sendMessage(message);
            f5806v = false;
            this.f5817K = true;
            if (this.f5813E != null) {
                this.f5813E.cancel();
            }
            f5789H = 1;
            C2266s.f7115a.f6693d = b;
            this.f5813E = new Timer();
            this.f5813E.schedule(new C2072a(C2266s.f7115a.mo32762b(), this.f5815G), 100L, 1000L);
        } catch (Exception e) {
            if (f5792f == null) {
                return;
            }
            f5792f.mo28035a(false, 0L, 0L, -1);
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m33089b(C2065f c2065f) {
        int i = c2065f.f5824S;
        c2065f.f5824S = i + 1;
        return i;
    }

    /* renamed from: n */
    public static void m33076n() {
        try {
            final UpgradeResultInfo upgradeResultInfo = (UpgradeResultInfo) C1642c.m34887c().mo34880a("upgradeResultInfo", UpgradeResultInfo.class);
            if (C1642c.m34893a() == null || upgradeResultInfo == null) {
                return;
            }
            new Thread(new Runnable() { // from class: com.fimi.soul.biz.update.f.4
                @Override // java.lang.Runnable
                public void run() {
                    C2011w.m33268a(C1642c.m34893a()).m33266a(new AbstractC1945k() { // from class: com.fimi.soul.biz.update.f.4.1
                        @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                        /* renamed from: a */
                        public void mo28106a(PlaneMsg planeMsg, File file) {
                            if (planeMsg.isSuccess()) {
                                C1642c.m34887c().mo34879a("upgradeResultInfo", (Object) "");
                            }
                        }
                    }, UpgradeResultInfo.this);
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: p */
    static /* synthetic */ int m33074p() {
        int i = f5789H;
        f5789H = i + 1;
        return i;
    }

    /* renamed from: r */
    private long m33072r() {
        f5790I = this.f5811C.m29606f().mo29545a();
        f5809z = this.f5811C.m29606f().mo29540b();
        return f5790I;
    }

    /* renamed from: s */
    private void m33071s() {
        f5788A = new C2283f(this.f5826t, new Runnable() { // from class: com.fimi.soul.biz.update.f.2
            @Override // java.lang.Runnable
            public void run() {
                if (C2065f.f5791R != null) {
                    C2065f.this.f5815G.mo32906ab().mo32587a(C2065f.f5791R.mo32762b());
                }
                C2065f.m33089b(C2065f.this);
                if (C2065f.this.f5824S >= 10) {
                    C2065f.this.a().sendEmptyMessage(2);
                }
            }
        });
        if (!this.f5810B.contains(f5788A)) {
            this.f5810B.add(f5788A);
        }
    }

    /* renamed from: a */
    public void m33098a(int i) {
        this.f5811C.m29610b(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.biz.update.AbstractC2056c, com.fimi.kernel.AbstractC1584b
    /* renamed from: a */
    public void mo30955a(Message message) {
        super.mo30955a(message);
        switch (message.what) {
            case 2:
                if (f5788A != null) {
                    f5788A.m32437e();
                    f5788A.m32436f();
                }
                this.f5824S = 0;
                f5792f.mo28035a(false, 0L, 0L, -1);
                return;
            case 3:
                f5792f.mo28035a(false, 0L, 0L, -1);
                return;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                return;
            case 5:
                if (f5792f == null || message.arg2 != 300) {
                    return;
                }
                if (C1645c.m34884a().mo34875b(f5797l) == 5) {
                    f5792f.mo28035a(false, this.f5812D / 2, f5790I, f5796k);
                    return;
                } else {
                    f5792f.mo28035a(false, this.f5812D, f5790I, f5796k);
                    return;
                }
            case 10:
                f5792f.mo28035a(false, 0L, 0L, -1);
                return;
        }
    }

    /* renamed from: a */
    public void m33097a(AbstractC2073b abstractC2073b) {
        this.f5825g = abstractC2073b;
    }

    /* renamed from: a */
    public void m33096a(final AbstractC2074c abstractC2074c) {
        if (C1642c.m34893a() == null) {
            return;
        }
        C2011w.m33268a(C1642c.m34893a()).m33262c(new AbstractC1945k() { // from class: com.fimi.soul.biz.update.f.1
            @Override // com.fimi.soul.biz.p185m.AbstractC1945k
            /* renamed from: a */
            public void mo28106a(PlaneMsg planeMsg, File file) {
                if (planeMsg.isSuccess()) {
                    abstractC2074c.mo29457a((List) planeMsg.getData());
                }
            }
        });
    }

    /* renamed from: a */
    public void m33094a(AbstractC2077i abstractC2077i) {
        f5792f = abstractC2077i;
    }

    /* renamed from: a */
    public void m33093a(FirmwareInfo firmwareInfo) {
        this.f5811C.m29614a(firmwareInfo.getSysId(), Integer.valueOf(firmwareInfo.getVersion()).intValue());
        this.f5811C.m29615a(firmwareInfo.getSysId()).m29565b(Integer.valueOf(firmwareInfo.getVersion()).intValue());
    }

    /* renamed from: a */
    public void m33092a(FirmwareInfo firmwareInfo, int i) {
        if (this.f5813E != null) {
            this.f5813E.cancel();
        }
        f5796k = i;
        this.f5826t = 1500;
        this.f5820N = false;
        this.f5821O = -1;
        C1645c.m34884a().mo34882a(f5797l, firmwareInfo.getSysId());
        m33098a(firmwareInfo.getSysId());
        m33090b(firmwareInfo.getSysId());
    }

    /* renamed from: b */
    public void m33091b() {
        f5791R = f5809z.poll();
        if (f5791R == null || f5792f == null) {
            return;
        }
        this.f5815G.mo32906ab().mo32587a(f5791R.mo32762b());
        if (f5788A.m32443b()) {
            return;
        }
        f5788A.m32441c();
    }

    /* renamed from: b */
    public void m33090b(int i) {
        try {
            if (((int) m33072r()) <= 0) {
                Toast.makeText(this.f5814F, this.f5814F.getResources().getString(C1704R.C1707string.firmware_file_not_exist), 1).show();
                return;
            }
            if (this.f5813E != null) {
                this.f5813E.cancel();
                this.f5813E = null;
            }
            f5789H = 1;
            f5808x = false;
            this.f5818L = new Timer();
            C2262o.f7109a.f6364d = (byte) i;
            C2262o.f7109a.f6365e = (byte) 1;
            this.f5815G.mo32906ab().mo32587a(C2262o.f7109a.mo32762b());
            this.f5818L.schedule(new C2072a(C2262o.f7109a.mo32762b(), this.f5815G), 200L, 2000L);
        } catch (Exception e) {
            f5792f.mo28035a(false, 0L, 0L, -1);
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m33088b(UpdateVersonBean updateVersonBean, String str, AbstractC2077i abstractC2077i) {
        a(updateVersonBean, str, abstractC2077i);
    }

    /* renamed from: c */
    public boolean m33087c() {
        if (this.f5815G != null) {
            return this.f5815G.m33009am();
        }
        return false;
    }

    /* renamed from: d */
    public void m33085d() {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public String m33081e(UpdateVersonBean updateVersonBean) {
        return d(updateVersonBean);
    }

    /* renamed from: e */
    public void m33083e() {
        if (this.f5813E != null) {
            this.f5813E.cancel();
            this.f5813E = null;
        }
        if (this.f5818L != null) {
            this.f5818L.cancel();
            this.f5818L = null;
        }
        if (f5788A != null) {
            f5788A.m32437e();
            f5788A = null;
        }
        f5792f = null;
        f5796k = 1;
        if (this.f5810B == null || this.f5810B.size() <= 0) {
            return;
        }
        for (C2283f c2283f : this.f5810B) {
            if (c2283f != null) {
                c2283f.m32437e();
                c2283f.m32436f();
            }
        }
    }

    /* renamed from: f */
    public void m33080f() {
        if (f5788A != null) {
            f5788A.m32437e();
        }
        f5788A = null;
    }

    /* renamed from: k */
    public void m33079k() {
        C2254g.f7094a.f6368d = (byte) 1;
        this.f5815G.mo32906ab().mo32587a(C2254g.f7094a.mo32762b());
    }

    /* renamed from: l */
    public void m33078l() {
        this.f5815G.mo32903b(this);
    }

    /* renamed from: m */
    public void m33077m() {
        try {
            UpgradeResultInfo m33064a = C2080l.m33064a(this.f5814F);
            if (m33064a != null) {
                C1642c.m34887c().mo34879a("upgradeResultInfo", m33064a);
            }
            if (C1642c.m34893a() == null) {
                return;
            }
            C2011w.m33268a(C1642c.m34893a()).m33266a(new AbstractC1945k() { // from class: com.fimi.soul.biz.update.f.3
                @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                /* renamed from: a */
                public void mo28106a(PlaneMsg planeMsg, File file) {
                    if (planeMsg.isSuccess()) {
                        C1642c.m34887c().mo34879a("upgradeResultInfo", (Object) "");
                    }
                }
            }, m33064a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        boolean z = false;
        switch (enumC2105a) {
            case RELEASECHAIN:
                C2318ax m33014ah = c2083a.m33014ah();
                if (m33014ah.f7511d != 0) {
                    return;
                }
                if (m33014ah.f7510c == 1 && !f5808x) {
                    f5808x = true;
                    f5789H = 1;
                    if (this.f5818L != null) {
                        this.f5818L.cancel();
                    }
                    this.f5813E = new Timer();
                    C2265r.f7114a.f6666d = (byte) m33014ah.f7509b;
                    C2265r.f7114a.f6667e = (byte) 0;
                    C2265r.f7114a.f6668f = (byte) 1;
                    if (System.currentTimeMillis() - this.f5819M > 800) {
                        c2083a.mo32906ab().mo32587a(C2265r.f7114a.mo32762b());
                        this.f5813E.schedule(new C2072a(C2265r.f7114a.mo32762b(), c2083a), 200L, 2000L);
                    }
                }
                this.f5819M = System.currentTimeMillis();
                if (m33014ah.f7510c != 2 || f5792f == null || f5805u) {
                    return;
                }
                C2267t.f7116a.f6698d = (byte) C1645c.m34884a().mo34875b(f5797l);
                C2267t.f7116a.f6699e = (byte) 1;
                f5805u = true;
                f5789H = 1;
                if (this.f5813E == null) {
                    return;
                }
                this.f5813E.cancel();
                this.f5813E = new Timer();
                this.f5813E.schedule(new C2072a(C2267t.f7116a.mo32762b(), c2083a), 100L, 1000L);
                return;
            case OnRecivedCloudCameraCommandInfo:
                int mo32435a = c2083a.f5918c.mo32435a();
                if (mo32435a == 51) {
                    this.f5827y.j().setDvVersion(((C2349j) c2083a.f5918c).m31927d() + "");
                    return;
                } else if (mo32435a != 50) {
                    return;
                } else {
                    C2338h c2338h = (C2338h) c2083a.f5918c;
                    switch (c2338h.m31974f()) {
                        case UPDATEPRO:
                            if (this.f5825g == null) {
                                return;
                            }
                            this.f5825g.mo29622a(c2338h.m31975e());
                            if (c2338h.m31975e() != 100) {
                                return;
                            }
                            this.f5825g.mo29621a(true);
                            return;
                        case UPDATEFAILE:
                            if (this.f5825g == null) {
                                return;
                            }
                            this.f5825g.mo29621a(false);
                            return;
                        default:
                            return;
                    }
                }
            case UPDATEDRONEORDERREPORT:
                if (!f5808x) {
                    return;
                }
                f5808x = false;
                f5789H = 1;
                if (this.f5813E != null) {
                    this.f5813E.cancel();
                }
                this.f5823Q = c2083a.mo32915U().m32054a();
                if (C2265r.f7114a.f6666d != this.f5823Q) {
                    return;
                }
                byte m32052b = c2083a.mo32915U().m32052b();
                if (m32052b != 0 && m32052b != 4) {
                    f5792f.mo28035a(false, 0L, 0L, -1);
                    return;
                }
                this.f5824S = 0;
                if (f5788A == null) {
                    m33071s();
                    f5788A.m32439d();
                }
                m33091b();
                return;
            case UPDATEDRONEREPORT:
                this.f5824S = 0;
                byte m32049b = c2083a.mo32916T().m32049b();
                if (m32049b != 0 && m32049b != 4) {
                    f5792f.mo28035a(false, 0L, 0L, -1);
                    return;
                }
                this.f5826t = 300;
                m33099a(c2083a.mo32916T().f7560b);
                return;
            case UPDATEDRONEFINISHREPORTCRC:
                C2328bg mo32912X = c2083a.mo32912X();
                f5789H = 0;
                if (this.f5813E != null) {
                    this.f5813E.cancel();
                    this.f5813E = null;
                }
                if (mo32912X.f7553b != 1) {
                    return;
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (f5792f == null) {
                    return;
                }
                if (this.f5817K) {
                    if (C1645c.m34884a().mo34875b(f5797l) == 5) {
                        this.f5820N = true;
                        f5792f.mo28035a(false, f5790I / 2, f5790I, f5796k);
                    } else {
                        f5792f.mo28035a(true, f5790I, f5790I, f5796k);
                    }
                    this.f5817K = false;
                }
                for (int i = 0; i < 4; i++) {
                    C2267t.m32525a(c2083a, 2, C1645c.m34884a().mo34875b(f5797l));
                    m33085d();
                }
                return;
            case UPDATEDRONEFINISHREPORT:
                a().sendEmptyMessage(9);
                C2715j.m30533b();
                f5805u = false;
                f5789H = 1;
                if (f5806v) {
                    return;
                }
                f5806v = true;
                C2262o.f7109a.f6364d = c2083a.mo32913W().f7552c;
                C2262o.f7109a.f6365e = (byte) 2;
                if (this.f5813E != null) {
                    this.f5813E.cancel();
                }
                this.f5813E = new Timer();
                this.f5813E.schedule(new C2072a(C2262o.f7109a.mo32762b(), c2083a), 100L, 1000L);
                return;
            case PowerBatteryProgress:
                if (f5792f == null || C1645c.m34884a().mo34875b(f5797l) != 5 || !this.f5820N || this.f5821O == 100) {
                    return;
                }
                AbstractC2077i abstractC2077i = f5792f;
                if (c2083a.m33024aC().m32184a() == 100) {
                    z = true;
                }
                abstractC2077i.mo28035a(z, (c2083a.m33024aC().m32184a() / 2) + 50, 100L, f5796k);
                this.f5821O = (c2083a.m33024aC().m32184a() / 2) + 50;
                return;
            default:
                return;
        }
    }
}
