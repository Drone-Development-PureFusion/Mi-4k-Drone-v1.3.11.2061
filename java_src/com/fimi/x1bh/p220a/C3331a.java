package com.fimi.x1bh.p220a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.p140a.AbstractC1488a;
import com.fimi.p140a.p142b.EnumC1494a;
import com.fimi.p140a.p143c.AbstractC1499c;
import com.fimi.p155h.C1562a;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.update.p218a.C3021a;
import java.util.List;
/* renamed from: com.fimi.x1bh.a.a */
/* loaded from: classes2.dex */
public class C3331a extends AbstractC1488a {

    /* renamed from: d */
    C1562a f13270d;

    /* renamed from: g */
    private Context f13273g;

    /* renamed from: h */
    private C2083a f13274h;

    /* renamed from: i */
    private C1772d f13275i;

    /* renamed from: o */
    private AbstractC1499c f13281o;

    /* renamed from: j */
    private List<FirmwareInfo> f13276j = null;

    /* renamed from: k */
    private float f13277k = 0.0f;

    /* renamed from: l */
    private final int f13278l = 600;

    /* renamed from: m */
    private final int f13279m = 10;

    /* renamed from: n */
    private final int f13280n = 1;

    /* renamed from: p */
    private EnumC1494a f13282p = EnumC1494a.FLIGHT;

    /* renamed from: e */
    Runnable f13271e = new Runnable() { // from class: com.fimi.x1bh.a.a.1
        @Override // java.lang.Runnable
        public void run() {
            C3331a.m28276a(C3331a.this);
            Message obtainMessage = C3331a.this.f13272f.obtainMessage();
            obtainMessage.obj = Float.valueOf(C3331a.this.f13277k);
            obtainMessage.what = 1;
            C3331a.this.f13272f.sendMessage(obtainMessage);
        }
    };

    /* renamed from: f */
    Handler f13272f = new Handler() { // from class: com.fimi.x1bh.a.a.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            float floatValue = message.obj != null ? ((Float) message.obj).floatValue() : 0.0f;
            C3331a.this.f13281o.mo30241a(floatValue);
            if (floatValue == 590.0f) {
                C3331a.this.f13270d.m35149a();
                if (!C3331a.this.m28261h()) {
                    C3331a.this.f13272f.postDelayed(C3331a.this.f13271e, 10L);
                } else {
                    C3331a.this.f13281o.mo30240a(C3331a.this.f13282p);
                }
            } else if (floatValue < 600.0f) {
                if (C3331a.this.f13277k <= 0.0f) {
                    return;
                }
                C3331a.this.f13272f.postDelayed(C3331a.this.f13271e, 10L);
            } else {
                C3331a.this.f13272f.removeCallbacks(C3331a.this.f13271e);
                if (!C3331a.this.f3552b) {
                    C3331a.this.f13281o.mo30240a(C3331a.this.f13282p);
                    return;
                }
                C3331a.this.f3553c.m34546a().edit().putBoolean(C3331a.this.f3551a, true).commit();
                C3331a.this.f13282p = EnumC1494a.SETTING;
                C3331a.this.f13281o.mo30240a(C3331a.this.f13282p);
            }
        }
    };

    public C3331a(Context context, AbstractC1499c abstractC1499c) {
        super(context, abstractC1499c);
        this.f13273g = context;
        this.f13281o = abstractC1499c;
        mo28277a();
    }

    /* renamed from: a */
    static /* synthetic */ float m28276a(C3331a c3331a) {
        float f = c3331a.f13277k;
        c3331a.f13277k = 1.0f + f;
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public boolean m28261h() {
        new StringBuffer();
        List<UpdateVersonBean> m29607e = C3021a.m29616a().m29607e();
        if (m29607e != null && m29607e.size() > 0) {
            C1645c.m34884a().mo34877a(UpdateVersonBean.SP_NEED_DOWN_FIRMWWARES, (List) m29607e);
            this.f13272f.removeCallbacks(this.f13271e);
            this.f13282p = EnumC1494a.FIND_ONLINE_FIRMWARE;
            return true;
        }
        this.f13276j = C3021a.m29616a().m29608d();
        if (this.f13276j == null || this.f13276j.size() <= 0) {
            return false;
        }
        C1645c.m34884a().mo34877a("upgrade_firmwares", (List) this.f13276j);
        this.f13272f.removeCallbacks(this.f13271e);
        this.f13282p = EnumC1494a.FIND_NEW_FIRMWARE;
        return true;
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: a */
    public void mo28277a() {
        super.m35501a(this.f13273g);
        mo28266e_();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: b */
    public void mo28274b() {
        this.f13272f.postDelayed(this.f13271e, 200L);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: c */
    public void mo28272c() {
        this.f13272f.removeMessages(1);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: d */
    public void mo28270d() {
        this.f13272f.removeCallbacks(this.f13271e);
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: e */
    public void mo28268e() {
        this.f13272f.removeMessages(1);
        this.f13272f.removeCallbacks(this.f13271e);
    }

    @Override // com.fimi.p140a.AbstractC1488a
    /* renamed from: e_ */
    public void mo28266e_() {
        this.f13274h = ((DroidPlannerApp) DroidPlannerApp.m34273g()).f4493a;
        this.f13270d = new C1562a();
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: f */
    public void mo28265f() {
        if (this.f13277k > 0.0f) {
            this.f13272f.postDelayed(this.f13271e, 10L);
        }
    }

    @Override // com.fimi.p140a.p143c.AbstractC1497a
    /* renamed from: g */
    public void mo28263g() {
        this.f13270d.m35145b();
    }
}
