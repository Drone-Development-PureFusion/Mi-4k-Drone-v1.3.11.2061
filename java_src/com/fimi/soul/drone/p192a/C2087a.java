package com.fimi.soul.drone.p192a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.p170b.C1769c;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.setting.newhand.C2954b;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3027g;
import java.util.List;
/* renamed from: com.fimi.soul.drone.a.a */
/* loaded from: classes.dex */
public class C2087a {

    /* renamed from: c */
    private Context f5951c;

    /* renamed from: d */
    private C1681v f5952d;

    /* renamed from: f */
    private boolean f5954f;

    /* renamed from: g */
    private C2083a f5955g;

    /* renamed from: h */
    private C1772d f5956h;

    /* renamed from: i */
    private C1827d f5957i;

    /* renamed from: j */
    private C3027g f5958j;

    /* renamed from: p */
    private AbstractC2091a f5964p;

    /* renamed from: e */
    private String f5953e = C1756a.f4517J;

    /* renamed from: k */
    private List<FirmwareInfo> f5959k = null;

    /* renamed from: l */
    private float f5960l = 0.0f;

    /* renamed from: m */
    private final int f5961m = C2954b.f10826ao;

    /* renamed from: n */
    private final int f5962n = 10;

    /* renamed from: o */
    private final int f5963o = 1;

    /* renamed from: q */
    private EnumC2092b f5965q = EnumC2092b.FLIGHT;

    /* renamed from: a */
    Runnable f5949a = new Runnable() { // from class: com.fimi.soul.drone.a.a.2
        @Override // java.lang.Runnable
        public void run() {
            C2087a.m32973b(C2087a.this);
            Message obtainMessage = C2087a.this.f5950b.obtainMessage();
            obtainMessage.obj = Float.valueOf(C2087a.this.f5960l);
            obtainMessage.what = 1;
            C2087a.this.f5950b.sendMessage(obtainMessage);
        }
    };

    /* renamed from: b */
    Handler f5950b = new Handler() { // from class: com.fimi.soul.drone.a.a.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            float floatValue = message.obj != null ? ((Float) message.obj).floatValue() : 0.0f;
            C2087a.this.f5964p.m32958a(floatValue);
            if (!C2087a.this.f5955g.mo32906ab().mo32588a()) {
                C2087a.this.f5964p.m32956a(C2087a.this.f5951c.getString(C1704R.C1707string.disconnect_titlefaile), C2087a.this.f5951c.getString(C1704R.C1707string.disconnect_reson));
            } else if (!C2087a.this.f5955g.mo32905ac()) {
                C2087a.this.f5964p.m32956a(C2087a.this.f5951c.getString(C1704R.C1707string.unconnectdrone), C2087a.this.f5951c.getString(C1704R.C1707string.fc_tip_error));
            } else if (floatValue == 390.0f) {
                if (!C2087a.this.m32964g()) {
                    C2087a.this.f5950b.postDelayed(C2087a.this.f5949a, 10L);
                } else {
                    C2087a.this.f5964p.m32957a(C2087a.this.f5965q);
                }
            } else if (floatValue < 400.0f) {
                if (C2087a.this.f5960l <= 0.0f) {
                    return;
                }
                C2087a.this.f5950b.postDelayed(C2087a.this.f5949a, 10L);
            } else {
                C2087a.this.f5950b.removeCallbacks(C2087a.this.f5949a);
                if (!C2087a.this.f5954f) {
                    C2087a.this.f5964p.m32957a(C2087a.this.f5965q);
                    return;
                }
                C2087a.this.f5952d.m34546a().edit().putBoolean(C2087a.this.f5953e, true).commit();
                C2087a.this.f5965q = EnumC2092b.SETTING;
                C2087a.this.f5964p.m32957a(C2087a.this.f5965q);
            }
        }
    };

    /* renamed from: com.fimi.soul.drone.a.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC2091a {
        /* renamed from: a */
        void m32958a(float f);

        /* renamed from: a */
        void m32957a(EnumC2092b enumC2092b);

        /* renamed from: a */
        void m32956a(String str, String str2);
    }

    /* renamed from: com.fimi.soul.drone.a.a$b */
    /* loaded from: classes.dex */
    public enum EnumC2092b {
        FIND_ONLINE_FIRMWARE,
        FIND_NEW_FIRMWARE,
        FLIGHT,
        SETTING
    }

    public C2087a(Context context, AbstractC2091a abstractC2091a) {
        this.f5951c = context;
        this.f5964p = abstractC2091a;
        m32977a();
    }

    /* renamed from: b */
    static /* synthetic */ float m32973b(C2087a c2087a) {
        float f = c2087a.f5960l;
        c2087a.f5960l = 1.0f + f;
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m32964g() {
        new StringBuffer();
        List<UpdateVersonBean> m29607e = C3021a.m29616a().m29607e();
        if (m29607e != null && m29607e.size() > 0) {
            C1645c.m34884a().mo34877a(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, (List) m29607e);
            this.f5950b.removeCallbacks(this.f5949a);
            this.f5965q = EnumC2092b.FIND_ONLINE_FIRMWARE;
            return true;
        }
        this.f5959k = C3021a.m29616a().m29608d();
        if (this.f5959k == null || this.f5959k.size() <= 0) {
            return false;
        }
        C1645c.m34884a().mo34877a("upgrade_firmwares", (List) this.f5959k);
        this.f5950b.removeCallbacks(this.f5949a);
        this.f5965q = EnumC2092b.FIND_NEW_FIRMWARE;
        return true;
    }

    /* renamed from: a */
    public void m32977a() {
        this.f5952d = C1681v.m34543a(this.f5951c);
        this.f5953e = C1756a.f4517J;
        this.f5954f = C1642c.m34887c().mo34872d(C1756a.f4519L);
        C3021a.m29616a().m29609c();
        this.f5955g = ((DroidPlannerApp) DroidPlannerApp.m34273g()).f4493a;
        C1772d.m34208a().m34201b((String) null);
        C1769c.m34218a().m34213b((String) null);
        this.f5957i = (C1827d) C1783b.m34166a().m34150d();
        this.f5957i.m33987w().m33996b();
        if (this.f5957i.e()) {
            this.f5957i.m33989u().m34037k();
        }
        this.f5958j = new C3027g(this.f5951c, this.f5955g);
    }

    /* renamed from: b */
    public void m32974b() {
        new Thread(new Runnable() { // from class: com.fimi.soul.drone.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                Looper.prepare();
                for (int i = 0; i < 5; i++) {
                    C2087a.this.f5958j.m29532c();
                }
            }
        }).start();
        this.f5950b.postDelayed(this.f5949a, 200L);
    }

    /* renamed from: c */
    public void m32972c() {
        this.f5950b.removeMessages(1);
    }

    /* renamed from: d */
    public void m32970d() {
        this.f5958j.m29530e();
        this.f5950b.removeCallbacks(this.f5949a);
    }

    /* renamed from: e */
    public void m32968e() {
        this.f5950b.removeMessages(1);
        this.f5950b.removeCallbacks(this.f5949a);
    }

    /* renamed from: f */
    public void m32966f() {
        if (this.f5960l > 0.0f) {
            this.f5950b.postDelayed(this.f5949a, 10L);
        }
    }
}
