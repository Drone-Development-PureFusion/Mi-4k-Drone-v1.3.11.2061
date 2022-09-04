package com.fimi.p154g;

import android.util.Log;
import com.fimi.p140a.p141a.C1489a;
import com.fimi.p140a.p141a.C1492d;
import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p140a.p146f.C1516b;
import com.fimi.p148c.AbstractC1522a;
import com.fimi.p148c.AbstractC1523b;
import com.fimi.p148c.AbstractC1524c;
import com.fimi.p149d.p150a.C1529d;
import com.fimi.p149d.p150a.C1530e;
import com.fimi.p149d.p150a.C1531f;
import com.fimi.p149d.p150a.C1532g;
import com.fimi.p149d.p150a.C1533h;
import com.fimi.p149d.p150a.C1534i;
import com.fimi.p149d.p151b.C1536b;
import com.fimi.p149d.p151b.C1537c;
import com.fimi.p149d.p151b.C1538d;
import com.fimi.p149d.p151b.C1539e;
import com.fimi.p149d.p151b.C1540f;
import com.fimi.p149d.p151b.C1541g;
import com.fimi.p152e.C1543b;
import com.fimi.p152e.C1549d;
import com.fimi.p154g.C1560e;
import com.fimi.p155h.C1566c;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
/* renamed from: com.fimi.g.c */
/* loaded from: classes.dex */
public class C1555c implements AbstractC1522a, AbstractC1523b, C1560e.AbstractC1561a {

    /* renamed from: m */
    private static final String f3807m = "UpgradeManager";

    /* renamed from: a */
    private AbstractC1524c f3808a;

    /* renamed from: b */
    private C1560e f3809b;

    /* renamed from: c */
    private List<C1566c> f3810c;

    /* renamed from: e */
    private int f3812e;

    /* renamed from: f */
    private C1566c f3813f;

    /* renamed from: g */
    private C1554b f3814g;

    /* renamed from: i */
    private int f3816i;

    /* renamed from: j */
    private long f3817j;

    /* renamed from: k */
    private Timer f3818k;

    /* renamed from: l */
    private Timer f3819l;

    /* renamed from: d */
    private boolean f3811d = false;

    /* renamed from: h */
    private EnumC1558a f3815h = EnumC1558a.UNINIT;

    /* renamed from: com.fimi.g.c$a */
    /* loaded from: classes.dex */
    public enum EnumC1558a {
        UNINIT,
        IDLE,
        C1,
        CC,
        C7,
        C9,
        CA,
        CB,
        RESTART
    }

    public C1555c(List<C1566c> list) {
        this.f3810c = new ArrayList();
        this.f3810c = list;
    }

    /* renamed from: b */
    static /* synthetic */ int m35175b(C1555c c1555c) {
        int i = c1555c.f3816i;
        c1555c.f3816i = i + 1;
        return i;
    }

    /* renamed from: a */
    public void m35182a() {
        this.f3809b = new C1560e(this);
        C1543b.m35227b().m35229a(this);
        C1549d.m35208b().m35212a(this);
        this.f3809b.start();
        m35177b();
        m35174c();
    }

    /* renamed from: a */
    public void m35181a(byte b) {
        this.f3815h = EnumC1558a.CC;
        C1541g c1541g = new C1541g();
        c1541g.c(this.f3813f.m35119d());
        c1541g.d(1);
        c1541g.a(0);
        c1541g.b(204);
        c1541g.a(this.f3813f.m35117f().m35138b());
        c1541g.m35235b(b);
        m35180a(c1541g);
    }

    @Override // com.fimi.p154g.C1560e.AbstractC1561a
    /* renamed from: a */
    public void mo35150a(int i) {
        m35170d("数据发送超时 " + C1516b.m35400h(i));
    }

    @Override // com.fimi.p148c.AbstractC1523b
    /* renamed from: a */
    public void mo28086a(int i, C1508c c1508c) {
        AbstractC1507b m35463g = c1508c.m35463g();
        if (m35463g == null) {
            return;
        }
        this.f3809b.m35153a(m35463g.m35479d());
        if (m35463g instanceof C1529d) {
            m35176b(m35463g);
        } else if (m35463g instanceof C1534i) {
            m35173c(m35463g);
        } else if (m35463g instanceof C1530e) {
            m35171d(m35463g);
        } else if (m35463g instanceof C1531f) {
            m35168e(m35463g);
        } else if (m35463g instanceof C1532g) {
            m35166f(m35463g);
        } else if (!(m35463g instanceof C1533h)) {
        } else {
            m35164g(m35463g);
        }
    }

    /* renamed from: a */
    public void m35180a(AbstractC1507b abstractC1507b) {
        this.f3809b.m35151a(abstractC1507b, this.f3815h);
    }

    /* renamed from: a */
    public void m35179a(AbstractC1524c abstractC1524c) {
        this.f3808a = abstractC1524c;
    }

    @Override // com.fimi.p148c.AbstractC1522a
    /* renamed from: a */
    public void mo28082a(String str) {
    }

    /* renamed from: b */
    public void m35177b() {
        this.f3813f = this.f3810c.get(this.f3812e);
        this.f3814g = new C1554b();
        this.f3814g.m35192a(this.f3813f.m35116g(), this.f3813f.m35117f().m35134f(), this.f3813f.m35117f().m35133g(), this.f3813f.m35117f().m35132h());
    }

    /* renamed from: b */
    public void m35176b(AbstractC1507b abstractC1507b) {
        ((C1529d) abstractC1507b).m35310l();
        m35181a((byte) 1);
    }

    @Override // com.fimi.p148c.AbstractC1522a
    /* renamed from: b */
    public void mo28051b(String str) {
        if (this.f3811d) {
            return;
        }
        m35169e();
        this.f3808a.mo28026d("升级中断-失败");
    }

    /* renamed from: c */
    public void m35174c() {
        this.f3817j = System.currentTimeMillis();
        int m35118e = this.f3813f.m35118e();
        this.f3808a.mo28027c("current upgrade type: " + ((int) this.f3813f.m35117f().m35138b()) + " sysId " + m35118e + " - ");
        if (m35118e == C1492d.f3565a) {
            m35165g();
        } else if (m35118e == C1492d.f3566b) {
            m35167f();
        } else if (m35118e != C1492d.f3567c) {
        } else {
            m35165g();
        }
    }

    /* renamed from: c */
    public void m35173c(AbstractC1507b abstractC1507b) {
        if (abstractC1507b.m35485a() && ((C1534i) abstractC1507b).m35303h() == 1) {
            m35163h();
        } else if (!abstractC1507b.m35485a() || ((C1534i) abstractC1507b).m35303h() != 2) {
            m35170d("CC has error code");
        } else if (this.f3810c.get(this.f3812e).m35118e() == C1492d.f3565a) {
            m35157n();
        } else {
            m35159l();
        }
    }

    @Override // com.fimi.p148c.AbstractC1522a
    /* renamed from: c */
    public void mo28161c(String str) {
    }

    /* renamed from: d */
    public void m35172d() {
        this.f3809b.m35154a();
        C1543b.m35227b().m35226b(this);
        C1549d.m35208b().m35207b(this);
    }

    /* renamed from: d */
    public void m35171d(AbstractC1507b abstractC1507b) {
        if (!abstractC1507b.m35485a()) {
            m35170d("CC has error code");
        } else if (this.f3815h == EnumC1558a.UNINIT) {
            m35156o();
            m35165g();
        } else if (this.f3815h != EnumC1558a.C7) {
        } else {
            m35162i();
        }
    }

    /* renamed from: d */
    public void m35170d(String str) {
        this.f3808a.mo28028b(str);
        this.f3810c.get(this.f3812e).m35124a(str);
        m35159l();
    }

    /* renamed from: e */
    public void m35169e() {
        m35172d();
        m35156o();
        m35155p();
    }

    /* renamed from: e */
    public void m35168e(AbstractC1507b abstractC1507b) {
        Log.i("zhej", "onC9Response: " + abstractC1507b.toString());
        Log.i(f3807m, "onC9Response: " + ((C1531f) abstractC1507b).toString());
        if (!abstractC1507b.m35485a()) {
            m35170d("C9 has error code");
        } else if (((C1531f) abstractC1507b).m35307h() - 1 != this.f3814g.m35197a()) {
        } else {
            this.f3814g.m35190b();
            this.f3808a.mo28033a(this.f3814g.m35187d(), this.f3814g.m35186e());
            Log.i(f3807m, "onC9Response: ");
            m35162i();
        }
    }

    /* renamed from: f */
    public void m35167f() {
        this.f3815h = EnumC1558a.UNINIT;
        final C1537c c1537c = new C1537c();
        c1537c.c(3);
        c1537c.d(1);
        c1537c.a(0);
        c1537c.b(199);
        c1537c.a(this.f3813f.m35117f().m35138b());
        c1537c.m35248b((byte) 90);
        c1537c.m35247c((byte) 1);
        this.f3818k = new Timer();
        this.f3816i = 0;
        this.f3818k.schedule(new TimerTask() { // from class: com.fimi.g.c.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                byte[] m35464f = c1537c.mo35234g().m35464f();
                C1549d.m35208b().m35209a(m35464f, m35464f.length);
                if (C1555c.this.f3816i > 45) {
                    C1555c.this.m35156o();
                }
                C1555c.m35175b(C1555c.this);
            }
        }, 0L, 1000L);
    }

    /* renamed from: f */
    public void m35166f(AbstractC1507b abstractC1507b) {
        if (abstractC1507b.m35485a()) {
            m35160k();
        } else {
            m35170d("CA has error code");
        }
    }

    /* renamed from: g */
    public void m35165g() {
        this.f3815h = EnumC1558a.C1;
        C1536b c1536b = new C1536b();
        c1536b.c((int) this.f3813f.m35119d());
        c1536b.d(1);
        c1536b.a(0);
        c1536b.b(C1536b.f3729a);
        c1536b.mo35268a(this.f3813f.m35117f().m35138b());
        m35180a(c1536b);
    }

    /* renamed from: g */
    public void m35164g(AbstractC1507b abstractC1507b) {
        if (!abstractC1507b.m35485a()) {
            m35170d("CB has error code");
            return;
        }
        this.f3810c.get(this.f3812e).m35123a(true);
        this.f3808a.mo28030a(this.f3810c);
        m35181a((byte) 2);
    }

    /* renamed from: h */
    public void m35163h() {
        this.f3815h = EnumC1558a.C7;
        C1537c c1537c = new C1537c();
        c1537c.c((int) this.f3813f.m35119d());
        c1537c.d(1);
        c1537c.a(0);
        c1537c.b(199);
        c1537c.a(this.f3813f.m35117f().m35138b());
        c1537c.m35248b((byte) 0);
        c1537c.m35247c((byte) 1);
        m35180a(c1537c);
    }

    /* renamed from: i */
    public void m35162i() {
        this.f3815h = EnumC1558a.C9;
        if (this.f3814g.m35188c()) {
            m35161j();
            return;
        }
        C1538d c1538d = new C1538d();
        c1538d.c(this.f3813f.m35119d());
        c1538d.d(1);
        c1538d.a(0);
        c1538d.b(201);
        c1538d.a(this.f3813f.m35117f().m35138b());
        c1538d.m35243e(this.f3814g.m35197a());
        C1489a m35184g = this.f3814g.m35184g();
        c1538d.m35242f(m35184g.f3556b);
        c1538d.m35244a(m35184g.f3555a);
        Log.i("zhej", "sendC9: " + c1538d.toString());
        m35180a(c1538d);
    }

    /* renamed from: j */
    public void m35161j() {
        this.f3815h = EnumC1558a.CA;
        C1539e c1539e = new C1539e();
        c1539e.c(this.f3813f.m35119d());
        c1539e.d(1);
        c1539e.a(0);
        c1539e.b(202);
        c1539e.a(this.f3813f.m35117f().m35138b());
        m35180a(c1539e);
    }

    /* renamed from: k */
    public void m35160k() {
        this.f3815h = EnumC1558a.CB;
        C1540f c1540f = new C1540f();
        c1540f.c(this.f3813f.m35119d());
        c1540f.d(1);
        c1540f.a(0);
        c1540f.b(203);
        c1540f.a(this.f3813f.m35117f().m35138b());
        m35180a(c1540f);
    }

    /* renamed from: l */
    public void m35159l() {
        this.f3812e++;
        if (this.f3812e < this.f3810c.size()) {
            m35177b();
            m35174c();
            return;
        }
        this.f3811d = true;
        m35172d();
        this.f3808a.mo28031a("升级完成", this.f3810c);
    }

    /* renamed from: m */
    public void m35158m() {
        this.f3815h = EnumC1558a.RESTART;
        C1536b c1536b = new C1536b();
        c1536b.c((int) this.f3813f.m35119d());
        c1536b.d(1);
        c1536b.a(0);
        c1536b.b(C1536b.f3729a);
        c1536b.mo35268a(this.f3813f.m35117f().m35138b());
        if (this.f3812e < this.f3810c.size() - 1) {
            m35180a(c1536b);
            return;
        }
        this.f3808a.mo28029a(true, "升级包数据发送完成 耗时：" + (System.currentTimeMillis() - this.f3817j));
    }

    /* renamed from: n */
    public void m35157n() {
        this.f3819l = new Timer();
        this.f3819l.schedule(new TimerTask() { // from class: com.fimi.g.c.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                C1555c.this.m35159l();
            }
        }, 20000L);
    }

    /* renamed from: o */
    public void m35156o() {
        if (this.f3818k != null) {
            this.f3818k.cancel();
            this.f3818k = null;
        }
    }

    /* renamed from: p */
    public void m35155p() {
        if (this.f3819l != null) {
            this.f3819l.cancel();
            this.f3819l = null;
        }
    }
}
