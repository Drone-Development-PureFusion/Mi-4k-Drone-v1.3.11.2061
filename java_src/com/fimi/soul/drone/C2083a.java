package com.fimi.soul.drone;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Handler;
import com.fimi.kernel.utils.C1679t;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.droneconnection.connection.C2221d;
import com.fimi.soul.drone.droneconnection.connection.C2229g;
import com.fimi.soul.drone.p195d.AbstractC2108a;
import com.fimi.soul.drone.p205i.C2295aa;
import com.fimi.soul.drone.p205i.C2296ab;
import com.fimi.soul.drone.p205i.C2297ac;
import com.fimi.soul.drone.p205i.C2298ad;
import com.fimi.soul.drone.p205i.C2299ae;
import com.fimi.soul.drone.p205i.C2300af;
import com.fimi.soul.drone.p205i.C2301ag;
import com.fimi.soul.drone.p205i.C2302ah;
import com.fimi.soul.drone.p205i.C2303ai;
import com.fimi.soul.drone.p205i.C2304aj;
import com.fimi.soul.drone.p205i.C2305ak;
import com.fimi.soul.drone.p205i.C2306al;
import com.fimi.soul.drone.p205i.C2307am;
import com.fimi.soul.drone.p205i.C2308an;
import com.fimi.soul.drone.p205i.C2309ao;
import com.fimi.soul.drone.p205i.C2310ap;
import com.fimi.soul.drone.p205i.C2311aq;
import com.fimi.soul.drone.p205i.C2312ar;
import com.fimi.soul.drone.p205i.C2313as;
import com.fimi.soul.drone.p205i.C2314at;
import com.fimi.soul.drone.p205i.C2315au;
import com.fimi.soul.drone.p205i.C2316av;
import com.fimi.soul.drone.p205i.C2317aw;
import com.fimi.soul.drone.p205i.C2318ax;
import com.fimi.soul.drone.p205i.C2319ay;
import com.fimi.soul.drone.p205i.C2320az;
import com.fimi.soul.drone.p205i.C2322ba;
import com.fimi.soul.drone.p205i.C2323bb;
import com.fimi.soul.drone.p205i.C2324bc;
import com.fimi.soul.drone.p205i.C2325bd;
import com.fimi.soul.drone.p205i.C2326be;
import com.fimi.soul.drone.p205i.C2327bf;
import com.fimi.soul.drone.p205i.C2328bg;
import com.fimi.soul.drone.p205i.C2329bh;
import com.fimi.soul.drone.p205i.C2330bi;
import com.fimi.soul.drone.p205i.C2331bj;
import com.fimi.soul.drone.p205i.C2333c;
import com.fimi.soul.drone.p205i.C2334d;
import com.fimi.soul.drone.p205i.C2335e;
import com.fimi.soul.drone.p205i.C2336f;
import com.fimi.soul.drone.p205i.C2337g;
import com.fimi.soul.drone.p205i.C2338h;
import com.fimi.soul.drone.p205i.C2352k;
import com.fimi.soul.drone.p205i.C2353l;
import com.fimi.soul.drone.p205i.C2354m;
import com.fimi.soul.drone.p205i.C2355n;
import com.fimi.soul.drone.p205i.C2356o;
import com.fimi.soul.drone.p205i.C2357p;
import com.fimi.soul.drone.p205i.C2359r;
import com.fimi.soul.drone.p205i.C2360s;
import com.fimi.soul.drone.p205i.C2361t;
import com.fimi.soul.drone.p205i.C2362u;
import com.fimi.soul.drone.p205i.C2363v;
import com.fimi.soul.drone.p205i.C2364w;
import com.fimi.soul.drone.p205i.C2365x;
import com.fimi.soul.drone.p205i.C2366y;
import com.fimi.soul.drone.p205i.C2367z;
import com.fimi.soul.drone.p205i.p206a.C2286a;
import com.fimi.soul.drone.p205i.p206a.C2288b;
import com.fimi.soul.drone.p205i.p206a.C2289c;
import com.fimi.soul.drone.p205i.p206a.C2290d;
import com.fimi.soul.drone.p205i.p206a.C2292f;
import com.fimi.soul.drone.p205i.p206a.C2294h;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.utils.C3072aa;
import com.fimi.soul.utils.C3155z;
import com.fimi.soul.utils.FlyLogTools;
import com.fimi.soul.view.MapWrapperLayout;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.p253b.C9755a;
import java.util.Timer;
import java.util.TimerTask;
/* renamed from: com.fimi.soul.drone.a */
/* loaded from: classes.dex */
public class C2083a implements AbstractC2101c {

    /* renamed from: Z */
    private final C2229g.AbstractC2230a f5874Z;

    /* renamed from: aL */
    private C2086b f5887aL;

    /* renamed from: aM */
    private boolean f5888aM;

    /* renamed from: aO */
    private MapWrapperLayout f5890aO;

    /* renamed from: ac */
    private boolean f5893ac;

    /* renamed from: ag */
    private C8500c f5897ag;

    /* renamed from: ah */
    private boolean f5898ah;

    /* renamed from: ak */
    private boolean f5901ak;

    /* renamed from: an */
    private boolean f5904an;

    /* renamed from: ao */
    private C2338h f5905ao;

    /* renamed from: ap */
    private LatLng f5906ap;

    /* renamed from: aq */
    private float f5907aq;

    /* renamed from: ar */
    private boolean f5908ar;

    /* renamed from: as */
    private int f5909as;

    /* renamed from: at */
    private Location f5910at;

    /* renamed from: au */
    private boolean f5911au;

    /* renamed from: b */
    FlyLogTools f5917b;

    /* renamed from: c */
    public AbstractC2108a f5918c;

    /* renamed from: d */
    public Context f5919d;

    /* renamed from: e */
    private final C2097b f5920e;

    /* renamed from: ad */
    private double f5894ad = C9755a.f30449c;

    /* renamed from: ae */
    private long f5895ae = 0;

    /* renamed from: af */
    private long f5896af = 0;

    /* renamed from: ai */
    private boolean f5899ai = true;

    /* renamed from: aj */
    private double f5900aj = C9755a.f30449c;

    /* renamed from: a */
    SharedPreferences f5875a = null;

    /* renamed from: aG */
    private boolean f5882aG = false;

    /* renamed from: aN */
    private volatile EnumC2085a f5889aN = EnumC2085a.normal;

    /* renamed from: f */
    private final C2296ab f5921f = new C2296ab(this);

    /* renamed from: g */
    private final C2354m f5922g = new C2354m(this);

    /* renamed from: h */
    private final C2316av f5923h = new C2316av(this);

    /* renamed from: i */
    private final C2317aw f5924i = new C2317aw(this);

    /* renamed from: j */
    private final C2314at f5925j = new C2314at(this);

    /* renamed from: k */
    private final C2324bc f5926k = new C2324bc(this);

    /* renamed from: l */
    private final C2315au f5927l = new C2315au(this);

    /* renamed from: m */
    private final C2301ag f5928m = new C2301ag(this);

    /* renamed from: n */
    private final C2297ac f5929n = new C2297ac(this);

    /* renamed from: o */
    private final C2313as f5930o = new C2313as(this);

    /* renamed from: p */
    private final C2311aq f5931p = new C2311aq(this);

    /* renamed from: q */
    private final C2302ah f5932q = new C2302ah(this);

    /* renamed from: r */
    private final C2334d f5933r = new C2334d(this);

    /* renamed from: s */
    private final C2303ai f5934s = new C2303ai(this);

    /* renamed from: t */
    private final C2304aj f5935t = new C2304aj(this);

    /* renamed from: u */
    private final C2304aj f5936u = new C2304aj(this);

    /* renamed from: v */
    private final C2305ak f5937v = new C2305ak(this);

    /* renamed from: w */
    private final C2305ak f5938w = new C2305ak(this);

    /* renamed from: x */
    private final C2353l f5939x = new C2353l(this);

    /* renamed from: y */
    private final C2353l f5940y = new C2353l(this);

    /* renamed from: z */
    private final C2290d f5941z = new C2290d(this);

    /* renamed from: A */
    private final C2295aa f5849A = new C2295aa(this);

    /* renamed from: B */
    private final C2294h f5850B = new C2294h(this);

    /* renamed from: C */
    private final C2335e f5851C = new C2335e(this);

    /* renamed from: D */
    private final C2326be f5852D = new C2326be(this);

    /* renamed from: E */
    private final C2366y f5853E = new C2366y(this);

    /* renamed from: F */
    private final C2310ap f5854F = new C2310ap(this);

    /* renamed from: G */
    private final C2322ba f5855G = new C2322ba(this);

    /* renamed from: H */
    private final C2367z f5856H = new C2367z(this);

    /* renamed from: I */
    private final C2323bb f5857I = new C2323bb(this);

    /* renamed from: J */
    private final C2319ay f5858J = new C2319ay(this);

    /* renamed from: K */
    private final C2333c f5859K = new C2333c(this);

    /* renamed from: L */
    private final C2325bd f5860L = new C2325bd(this);

    /* renamed from: M */
    private final C2331bj f5861M = new C2331bj(this);

    /* renamed from: N */
    private final C2330bi f5862N = new C2330bi(this);

    /* renamed from: O */
    private final C2329bh f5863O = new C2329bh(this);

    /* renamed from: P */
    private final C2327bf f5864P = new C2327bf(this);

    /* renamed from: Q */
    private final C2328bg f5865Q = new C2328bg(this);

    /* renamed from: T */
    private final C2300af f5868T = new C2300af(this);

    /* renamed from: U */
    private final C2308an f5869U = new C2308an(this);

    /* renamed from: aa */
    private C2337g f5891aa = new C2337g(this);

    /* renamed from: R */
    private final C2318ax f5866R = new C2318ax(this);

    /* renamed from: S */
    private final C2320az f5867S = new C2320az(this);

    /* renamed from: ab */
    private C2365x f5892ab = new C2365x(this);

    /* renamed from: al */
    private C2355n f5902al = new C2355n(this);

    /* renamed from: aw */
    private C2289c f5913aw = new C2289c(this);

    /* renamed from: av */
    private C2352k f5912av = new C2352k(this);

    /* renamed from: am */
    private final C2292f f5903am = new C2292f(this);

    /* renamed from: V */
    private final C2298ad f5870V = new C2298ad(this);

    /* renamed from: W */
    private final C2299ae f5871W = new C2299ae(this);

    /* renamed from: X */
    private final C2306al f5872X = new C2306al(this);

    /* renamed from: ax */
    private C2307am f5914ax = new C2307am(this);

    /* renamed from: ay */
    private C2309ao f5915ay = new C2309ao(this);

    /* renamed from: aD */
    private C2356o f5879aD = new C2356o(this);

    /* renamed from: aF */
    private C2286a f5881aF = new C2286a(this);

    /* renamed from: aA */
    private C2363v f5876aA = new C2363v(this);

    /* renamed from: az */
    private C2359r f5916az = new C2359r(this);

    /* renamed from: Y */
    private final C2312ar f5873Y = new C2312ar(this);

    /* renamed from: aE */
    private C2357p f5880aE = new C2357p();

    /* renamed from: aB */
    private C2336f f5877aB = new C2336f();

    /* renamed from: aC */
    private C2364w f5878aC = new C2364w();

    /* renamed from: aH */
    private C2361t f5883aH = new C2361t(this);

    /* renamed from: aI */
    private C2362u f5884aI = new C2362u(this);

    /* renamed from: aJ */
    private C2360s f5885aJ = new C2360s(this);

    /* renamed from: aK */
    private C2288b f5886aK = new C2288b(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.drone.a$a */
    /* loaded from: classes.dex */
    public enum EnumC2085a {
        normal,
        inSky,
        onLand,
        disCon
    }

    /* renamed from: com.fimi.soul.drone.a$b */
    /* loaded from: classes.dex */
    class C2086b extends TimerTask {
        C2086b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C2083a.this.f5917b.m29419a((FlyLogTools.AbstractC3062a) null);
        }
    }

    public C2083a(C2229g.AbstractC2230a abstractC2230a, Context context, Handler handler) {
        this.f5919d = context;
        this.f5874Z = abstractC2230a;
        this.f5920e = new C2097b(this, handler);
        this.f5917b = FlyLogTools.m29422a(context);
        Timer timer = new Timer();
        if (this.f5887aL == null) {
            this.f5887aL = new C2086b();
        }
        timer.schedule(this.f5887aL, 5000L, 180000L);
    }

    /* renamed from: a */
    private void m33036a(long j, double d) {
        C3155z m28998a = C3155z.m28998a(this.f5919d);
        C3072aa c3072aa = new C3072aa();
        c3072aa.m29388a(d);
        c3072aa.m29387a(j / 1000);
        c3072aa.m29383b(C1756a.m34259c(this.f5919d).getUserID());
        c3072aa.m29380c(C3021a.m29616a().m29615a(0).m29550i());
        c3072aa.m29386a(C1772d.m34208a().m34187k() ? "1" : "0");
        c3072aa.m29384b(mo32891w().m32189f());
        c3072aa.m29381c(mo32891w().m32190e());
        m28998a.m28997a(c3072aa);
    }

    /* renamed from: a */
    private void m33035a(long j, long j2) {
        if (j > 1800000) {
            return;
        }
        m33036a(j, this.f5900aj);
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: A */
    public C2304aj mo32935A() {
        return this.f5935t;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: B */
    public C2304aj mo32934B() {
        return this.f5936u;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: C */
    public C2305ak mo32933C() {
        return this.f5937v;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: D */
    public C2305ak mo32932D() {
        return this.f5938w;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: E */
    public C2353l mo32931E() {
        return this.f5939x;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: F */
    public C2353l mo32930F() {
        return this.f5940y;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: G */
    public C2290d mo32929G() {
        return this.f5941z;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: H */
    public C2295aa mo32928H() {
        return this.f5849A;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: I */
    public C2294h mo32927I() {
        return this.f5850B;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: J */
    public C2335e mo32926J() {
        return this.f5851C;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: K */
    public C2326be mo32925K() {
        return this.f5852D;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: L */
    public C2366y mo32924L() {
        return this.f5853E;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: M */
    public C2310ap mo32923M() {
        return this.f5854F;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: N */
    public C2322ba mo32922N() {
        return this.f5855G;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: O */
    public C2367z mo32921O() {
        return this.f5856H;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: P */
    public C2323bb mo32920P() {
        return this.f5857I;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: Q */
    public C2319ay mo32919Q() {
        return this.f5858J;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: R */
    public C2333c mo32918R() {
        return this.f5859K;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: S */
    public C2325bd mo32917S() {
        return this.f5860L;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: T */
    public C2331bj mo32916T() {
        return this.f5861M;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: U */
    public C2330bi mo32915U() {
        return this.f5862N;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: V */
    public C2329bh mo32914V() {
        return this.f5863O;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: W */
    public C2327bf mo32913W() {
        return this.f5864P;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: X */
    public C2328bg mo32912X() {
        return this.f5865Q;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: Y */
    public C2300af mo32911Y() {
        return this.f5868T;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: Z */
    public C2308an mo32910Z() {
        return this.f5869U;
    }

    /* renamed from: a */
    public C2338h m33039a() {
        return this.f5905ao;
    }

    /* renamed from: a */
    public void m33038a(float f) {
        this.f5907aq = f;
    }

    /* renamed from: a */
    public void m33037a(int i) {
        this.f5902al.m31901a(this.f5919d.getResources().getString(i));
    }

    /* renamed from: a */
    public void m33034a(Location location) {
        this.f5910at = location;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: a */
    public void mo32909a(C2104d.EnumC2105a enumC2105a) {
        this.f5920e.m32941a(enumC2105a);
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: a */
    public void mo32908a(C2104d.AbstractC2106b abstractC2106b) {
        this.f5920e.m32940a(abstractC2106b);
    }

    /* renamed from: a */
    public void m33033a(C2289c c2289c) {
        this.f5913aw = c2289c;
    }

    /* renamed from: a */
    public void m33032a(C2338h c2338h) {
        this.f5905ao = c2338h;
    }

    /* renamed from: a */
    public void m33031a(C2352k c2352k) {
        this.f5912av = c2352k;
    }

    /* renamed from: a */
    public void m33030a(MapWrapperLayout mapWrapperLayout) {
        this.f5890aO = mapWrapperLayout;
    }

    /* renamed from: a */
    public void m33029a(C8500c c8500c) {
        this.f5897ag = c8500c;
    }

    /* renamed from: a */
    public void m33028a(LatLng latLng) {
        this.f5906ap = latLng;
    }

    /* renamed from: a */
    public void m33027a(boolean z) {
        this.f5911au = z;
    }

    /* renamed from: aA */
    public C2286a m33026aA() {
        return this.f5881aF;
    }

    /* renamed from: aB */
    public MapWrapperLayout m33025aB() {
        return this.f5890aO;
    }

    /* renamed from: aC */
    public C2312ar m33024aC() {
        return this.f5873Y;
    }

    /* renamed from: aD */
    public C2357p m33023aD() {
        return this.f5880aE;
    }

    /* renamed from: aE */
    public boolean m33022aE() {
        return this.f5882aG;
    }

    /* renamed from: aF */
    public C2361t m33021aF() {
        return this.f5883aH;
    }

    /* renamed from: aG */
    public C2362u m33020aG() {
        return this.f5884aI;
    }

    /* renamed from: aH */
    public C2360s m33019aH() {
        return this.f5885aJ;
    }

    /* renamed from: aI */
    public C2288b m33018aI() {
        return this.f5886aK;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: aa */
    public C2299ae mo32907aa() {
        return this.f5871W;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: ab */
    public C2229g.AbstractC2230a mo32906ab() {
        return this.f5874Z;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: ac */
    public boolean mo32905ac() {
        return this.f5908ar;
    }

    /* renamed from: ad */
    public void m33017ad() {
        if (this.f5898ah) {
            this.f5889aN = EnumC2085a.disCon;
            m33010al();
        }
    }

    /* renamed from: ae */
    public boolean m33016ae() {
        return this.f5888aM;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: af */
    public boolean mo32904af() {
        return C1772d.m34208a().m34185m();
    }

    /* renamed from: ag */
    public C2337g m33015ag() {
        return this.f5891aa;
    }

    /* renamed from: ah */
    public C2318ax m33014ah() {
        return this.f5866R;
    }

    /* renamed from: ai */
    public C2320az m33013ai() {
        return this.f5867S;
    }

    /* renamed from: aj */
    public C8500c m33012aj() {
        return this.f5897ag;
    }

    /* renamed from: ak */
    public void m33011ak() {
        this.f5889aN = EnumC2085a.normal;
    }

    /* renamed from: al */
    public void m33010al() {
        C2221d.m32670a();
        switch (this.f5889aN) {
            case inSky:
                if (this.f5899ai) {
                    this.f5894ad = System.currentTimeMillis();
                    this.f5899ai = false;
                }
                if (System.currentTimeMillis() - this.f5896af < 1000) {
                    return;
                }
                this.f5896af = System.currentTimeMillis();
                this.f5900aj = Math.abs(C1679t.m34556a(mo32894t().m32334a() / 100.0d, 1)) + this.f5900aj;
                return;
            case disCon:
            case onLand:
                if (this.f5894ad <= C9755a.f30449c) {
                    return;
                }
                this.f5895ae = (long) (System.currentTimeMillis() - this.f5894ad);
                m33035a(this.f5895ae, (long) this.f5900aj);
                this.f5894ad = C9755a.f30449c;
                this.f5900aj = C9755a.f30449c;
                this.f5899ai = true;
                return;
            default:
                return;
        }
    }

    /* renamed from: am */
    public boolean m33009am() {
        return this.f5898ah;
    }

    /* renamed from: an */
    public boolean m33008an() {
        return this.f5889aN == EnumC2085a.onLand;
    }

    /* renamed from: ao */
    public C2365x m33007ao() {
        return this.f5892ab;
    }

    /* renamed from: ap */
    public float m33006ap() {
        return this.f5907aq;
    }

    /* renamed from: aq */
    public boolean m33005aq() {
        return this.f5901ak;
    }

    /* renamed from: ar */
    public String m33004ar() {
        return this.f5902al.m31902a();
    }

    /* renamed from: as */
    public C2097b m33003as() {
        return this.f5920e;
    }

    /* renamed from: at */
    public LatLng m33002at() {
        return this.f5906ap;
    }

    /* renamed from: au */
    public C2292f m33001au() {
        return this.f5903am;
    }

    /* renamed from: av */
    public C2298ad m33000av() {
        return this.f5870V;
    }

    /* renamed from: aw */
    public C2306al m32999aw() {
        return this.f5872X;
    }

    /* renamed from: ax */
    public boolean m32998ax() {
        return this.f5893ac;
    }

    /* renamed from: ay */
    public int m32997ay() {
        return this.f5909as;
    }

    /* renamed from: az */
    public boolean m32996az() {
        return this.f5904an;
    }

    /* renamed from: b */
    public Location m32995b() {
        return this.f5910at;
    }

    /* renamed from: b */
    public void m32994b(int i) {
        this.f5909as = i;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: b */
    public void mo32903b(C2104d.AbstractC2106b abstractC2106b) {
        this.f5920e.m32938b(abstractC2106b);
    }

    /* renamed from: b */
    public void m32993b(boolean z) {
        this.f5908ar = z;
    }

    /* renamed from: c */
    public void m32991c(boolean z) {
        this.f5888aM = z;
    }

    /* renamed from: c */
    public boolean m32992c() {
        return this.f5911au;
    }

    /* renamed from: d */
    public C2359r m32990d() {
        return this.f5916az;
    }

    /* renamed from: d */
    public void m32989d(boolean z) {
        this.f5898ah = z;
        if (z) {
            this.f5889aN = EnumC2085a.inSky;
        } else {
            this.f5889aN = EnumC2085a.onLand;
        }
        m33010al();
    }

    /* renamed from: e */
    public C2309ao m32988e() {
        return this.f5915ay;
    }

    /* renamed from: e */
    public void m32987e(boolean z) {
        this.f5901ak = z;
    }

    /* renamed from: f */
    public C2363v m32986f() {
        return this.f5876aA;
    }

    /* renamed from: f */
    public void m32985f(boolean z) {
        this.f5893ac = z;
    }

    /* renamed from: g */
    public C2336f m32984g() {
        return this.f5877aB;
    }

    /* renamed from: g */
    public void m32983g(boolean z) {
        this.f5904an = z;
    }

    /* renamed from: h */
    public C2364w m32982h() {
        return this.f5878aC;
    }

    /* renamed from: h */
    public void m32981h(boolean z) {
        this.f5882aG = z;
    }

    /* renamed from: i */
    public C2307am m32980i() {
        return this.f5914ax;
    }

    /* renamed from: j */
    public C2289c m32979j() {
        return this.f5913aw;
    }

    /* renamed from: k */
    public C2352k m32978k() {
        return this.f5912av;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: l */
    public C2296ab mo32902l() {
        return this.f5921f;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: m */
    public C2354m mo32901m() {
        return this.f5922g;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: n */
    public C2316av mo32900n() {
        return this.f5923h;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: o */
    public C2317aw mo32899o() {
        return this.f5924i;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: p */
    public C2314at mo32898p() {
        return this.f5925j;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: q */
    public C2324bc mo32897q() {
        return this.f5926k;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: r */
    public C2356o mo32896r() {
        return this.f5879aD;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: s */
    public C2315au mo32895s() {
        return this.f5927l;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: t */
    public C2301ag mo32894t() {
        return this.f5928m;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: u */
    public C2297ac mo32893u() {
        return this.f5929n;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: v */
    public C2313as mo32892v() {
        return this.f5930o;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: w */
    public C2311aq mo32891w() {
        return this.f5931p;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: x */
    public C2302ah mo32890x() {
        return this.f5932q;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: y */
    public C2334d mo32889y() {
        return this.f5933r;
    }

    @Override // com.fimi.soul.drone.AbstractC2101c
    /* renamed from: z */
    public C2303ai mo32888z() {
        return this.f5934s;
    }
}
