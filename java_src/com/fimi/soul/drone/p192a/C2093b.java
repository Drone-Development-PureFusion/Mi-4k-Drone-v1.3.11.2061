package com.fimi.soul.drone.p192a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.AbstractC1488a;
import com.fimi.p140a.p142b.EnumC1494a;
import com.fimi.p140a.p143c.AbstractC1499c;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.setting.newhand.C2954b;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3027g;
import java.util.List;
/* renamed from: com.fimi.soul.drone.a.b */
/* loaded from: classes.dex */
public class C2093b extends AbstractC1488a {

    /* renamed from: f */
    private Context f5976f;

    /* renamed from: g */
    private C2083a f5977g;

    /* renamed from: h */
    private C1772d f5978h;

    /* renamed from: i */
    private C3027g f5979i;

    /* renamed from: o */
    private AbstractC1499c f5985o;

    /* renamed from: j */
    private List<FirmwareInfo> f5980j = null;

    /* renamed from: k */
    private float f5981k = 0.0f;

    /* renamed from: l */
    private final int f5982l = C2954b.f10826ao;

    /* renamed from: m */
    private final int f5983m = 10;

    /* renamed from: n */
    private final int f5984n = 1;

    /* renamed from: p */
    private EnumC1494a f5986p = EnumC1494a.FLIGHT;

    /* renamed from: d */
    Runnable f5974d = new Runnable() { // from class: com.fimi.soul.drone.a.b.2
        @Override // java.lang.Runnable
        public void run() {
            C2093b.m32953b(C2093b.this);
            Message obtainMessage = C2093b.this.f5975e.obtainMessage();
            obtainMessage.obj = Float.valueOf(C2093b.this.f5981k);
            obtainMessage.what = 1;
            C2093b.this.f5975e.sendMessage(obtainMessage);
        }
    };

    /* renamed from: e */
    Handler f5975e = new Handler() { // from class: com.fimi.soul.drone.a.b.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            float floatValue = message.obj != null ? ((Float) message.obj).floatValue() : 0.0f;
            C2093b.this.f5985o.mo30241a(floatValue);
            if (!C2093b.this.f5977g.mo32906ab().mo32588a()) {
                C2093b.this.f5985o.mo30239a(C2093b.this.f5976f.getString(C1704R.C1707string.disconnect_titlefaile), C2093b.this.f5976f.getString(C1704R.C1707string.disconnect_reson));
            } else if (!C2093b.this.f5977g.mo32905ac()) {
                C2093b.this.f5985o.mo30239a(C2093b.this.f5976f.getString(C1704R.C1707string.unconnectdrone), C2093b.this.f5976f.getString(C1704R.C1707string.fc_tip_error));
            } else if (floatValue == 390.0f) {
                if (!C2093b.this.m32947h()) {
                    C2093b.this.f5975e.postDelayed(C2093b.this.f5974d, 10L);
                } else {
                    C2093b.this.f5985o.mo30240a(C2093b.this.f5986p);
                }
            } else if (floatValue < 400.0f) {
                if (C2093b.this.f5981k <= 0.0f) {
                    return;
                }
                C2093b.this.f5975e.postDelayed(C2093b.this.f5974d, 10L);
            } else {
                C2093b.this.f5975e.removeCallbacks(C2093b.this.f5974d);
                if (!C2093b.this.f3552b) {
                    C2093b.this.f5985o.mo30240a(C2093b.this.f5986p);
                    return;
                }
                C2093b.this.f3553c.m34546a().edit().putBoolean(C2093b.this.f3551a, true).commit();
                C2093b.this.f5986p = EnumC1494a.SETTING;
                C2093b.this.f5985o.mo30240a(C2093b.this.f5986p);
            }
        }
    };

    public C2093b(Context context, AbstractC1499c abstractC1499c) {
        super(context, abstractC1499c);
        this.f5976f = context;
        this.f5985o = abstractC1499c;
        mo28277a();
    }

    /* renamed from: b */
    static /* synthetic */ float m32953b(C2093b c2093b) {
        float f = c2093b.f5981k;
        c2093b.f5981k = 1.0f + f;
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public boolean m32947h() {
        new StringBuffer();
        List<UpdateVersonBean> m29607e = C3021a.m29616a().m29607e();
        if (m29607e != null && m29607e.size() > 0) {
            C1645c.m34884a().mo34877a(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, (List) m29607e);
            this.f5975e.removeCallbacks(this.f5974d);
            this.f5986p = EnumC1494a.FIND_ONLINE_FIRMWARE;
            return true;
        }
        this.f5980j = C3021a.m29616a().m29608d();
        if (this.f5980j == null || this.f5980j.size() <= 0) {
            return false;
        }
        C1645c.m34884a().mo34877a("upgrade_firmwares", (List) this.f5980j);
        this.f5975e.removeCallbacks(this.f5974d);
        this.f5986p = EnumC1494a.FIND_NEW_FIRMWARE;
        return true;
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: a */
    public void mo28277a() {
        super.m35501a(this.f5976f);
        mo28266e_();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: b */
    public void mo28274b() {
        new Thread(new Runnable() { // from class: com.fimi.soul.drone.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                Looper.prepare();
                for (int i = 0; i < 5; i++) {
                    C2093b.this.f5979i.m29532c();
                }
            }
        }).start();
        this.f5975e.postDelayed(this.f5974d, 200L);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: c */
    public void mo28272c() {
        this.f5975e.removeMessages(1);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: d */
    public void mo28270d() {
        this.f5979i.m29530e();
        this.f5975e.removeCallbacks(this.f5974d);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: e */
    public void mo28268e() {
        this.f5975e.removeMessages(1);
        this.f5975e.removeCallbacks(this.f5974d);
    }

    @Override // com.fimi.p140a.AbstractC1488a
    /* renamed from: e_ */
    public void mo28266e_() {
        this.f5977g = ((DroidPlannerApp) DroidPlannerApp.m34273g()).f4493a;
        this.f5979i = new C3027g(this.f5976f, this.f5977g);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: f */
    public void mo28265f() {
        if (this.f5981k > 0.0f) {
            this.f5975e.postDelayed(this.f5974d, 10L);
        }
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: g */
    public void mo28263g() {
    }
}
