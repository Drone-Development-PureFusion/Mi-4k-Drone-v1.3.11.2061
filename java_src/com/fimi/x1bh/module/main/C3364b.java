package com.fimi.x1bh.module.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.p160b.C1609c;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.C1496c;
import com.fimi.p140a.C1518g;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import com.fimi.soul.module.flyplannermedia.DroneMediaTabActivity;
import com.fimi.soul.module.p208a.View$OnClickListenerC2474e;
import com.fimi.soul.utils.C3103au;
import com.fimi.x1bh.module.main.AbstractC3362a;
import com.fimi.x1bh.module.setting.CloudTerraceSettingActivity;
import com.fimi.x1bh.p221b.AbstractC3341b;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.x1bh.module.main.b */
/* loaded from: classes.dex */
public class C3364b implements AbstractC1792f<X11RespCmd>, AbstractC3362a {

    /* renamed from: l */
    private static final int f13442l = 5;

    /* renamed from: m */
    private static final int f13443m = 7;

    /* renamed from: n */
    private static final int f13444n = 5000;

    /* renamed from: o */
    private static final String f13445o = "CloudTerraceMainInterac";

    /* renamed from: a */
    long f13446a;

    /* renamed from: b */
    private AbstractC3362a.AbstractC3363a f13447b;

    /* renamed from: c */
    private AbstractC3341b f13448c;

    /* renamed from: d */
    private boolean f13449d;

    /* renamed from: f */
    private Context f13451f;

    /* renamed from: j */
    private View$OnClickListenerC2474e f13455j;

    /* renamed from: p */
    private C1609c f13457p;

    /* renamed from: e */
    private boolean f13450e = false;

    /* renamed from: k */
    private HandlerC3367b f13456k = new HandlerC3367b();

    /* renamed from: g */
    private C1518g f13452g = new C1518g();

    /* renamed from: h */
    private C1496c f13453h = new C1496c();

    /* renamed from: i */
    private C1827d f13454i = (C1827d) C1783b.m34166a().m34150d();

    /* renamed from: q */
    private EnumC3366a f13458q = EnumC3366a.IDLE;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.x1bh.module.main.b$a */
    /* loaded from: classes2.dex */
    public enum EnumC3366a {
        VF,
        IDLE,
        RECORD
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.x1bh.module.main.b$b */
    /* loaded from: classes2.dex */
    public class HandlerC3367b extends Handler {
        private HandlerC3367b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 5:
                    C3364b.this.m28124m();
                    return;
                case 6:
                default:
                    return;
                case 7:
                    if (C3364b.this.f13447b == null) {
                        return;
                    }
                    C3364b.this.f13447b.mo28155d();
                    return;
            }
        }
    }

    public C3364b(Context context, AbstractC3362a.AbstractC3363a abstractC3363a) {
        this.f13447b = abstractC3363a;
        this.f13451f = context;
    }

    /* renamed from: a */
    private static String m28147a(long j, boolean z) {
        long j2 = j / 1000;
        long j3 = j2 / 60;
        long j4 = j3 / 60;
        long j5 = j3 - (60 * j4);
        long j6 = j2 - (j3 * 60);
        StringBuilder sb = new StringBuilder();
        if (j4 > 0) {
            if (j4 < 10) {
                sb.append('0');
            }
            sb.append(j4);
            sb.append(C0494h.f680A);
        } else {
            sb.append('0');
            sb.append('0');
            sb.append(C0494h.f680A);
        }
        if (j5 < 10) {
            sb.append('0');
        }
        sb.append(j5);
        sb.append(C0494h.f680A);
        if (j6 < 10) {
            sb.append('0');
        }
        sb.append(j6);
        if (z) {
            sb.append(C0494h.f686G);
            long j7 = (j - (j2 * 1000)) / 10;
            if (j7 < 10) {
                sb.append('0');
            }
            sb.append(j7);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m28148a(long j) {
        this.f13446a = SystemClock.uptimeMillis() - (1000 * j);
    }

    /* renamed from: a */
    private void m28146a(X11RespCmd x11RespCmd) {
        if (!C1831e.f4936ce.equals(x11RespCmd.getType())) {
            if (!C1831e.f4937cf.equals(x11RespCmd.getType())) {
                return;
            }
            this.f13447b.mo28151e(x11RespCmd.getParam().toString().replace("EV", "").replace(" ", ""));
            return;
        }
        if (C1831e.f4812aL.equals(x11RespCmd.getCard_status())) {
            this.f13454i.b(false);
        } else {
            this.f13454i.b(true);
        }
        m28142a(x11RespCmd.getCard_status());
        if (C1831e.f4931cY.equals(x11RespCmd.getCam_status())) {
            if (this.f13458q == EnumC3366a.RECORD) {
                return;
            }
            this.f13454i.m33985y().m33999m();
            return;
        }
        if (this.f13458q == EnumC3366a.RECORD) {
            this.f13456k.removeMessages(5);
            this.f13447b.mo28158b(false);
        }
        this.f13458q = EnumC3366a.VF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m28124m() {
        this.f13458q = EnumC3366a.RECORD;
        this.f13447b.mo28154d(m28147a(SystemClock.uptimeMillis() - this.f13446a, false));
        this.f13456k.sendEmptyMessageDelayed(5, 1000L);
    }

    /* renamed from: n */
    private void m28123n() {
        this.f13454i.m33989u().m34052b();
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a
    /* renamed from: a */
    public void mo28149a() {
        if (this.f13450e) {
            this.f13447b.mo28157c();
        } else {
            this.f13447b.mo28159b();
        }
        this.f13450e = !this.f13450e;
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a
    /* renamed from: a */
    public void mo28145a(AbstractC3341b abstractC3341b) {
        this.f13448c = abstractC3341b;
    }

    /* renamed from: a */
    public void m28143a(Class<?> cls) {
        this.f13451f.startActivity(new Intent(this.f13451f, cls));
        ((Activity) this.f13451f).overridePendingTransition(17432576, 17432577);
    }

    /* renamed from: a */
    public void m28142a(String str) {
        if (this.f13447b != null) {
            this.f13447b.mo28150f(str);
        }
    }

    /* renamed from: a */
    public void m28141a(boolean z) {
        this.f13450e = true;
        this.f13456k.removeMessages(7);
        if (!z) {
            C1688z.m34447a(this.f13451f, this.f13451f.getString(C1704R.C1707string.record_fail), C1688z.f4191b);
            this.f13447b.mo28158b(false);
            return;
        }
        C3103au.m29189m(this.f13451f);
        C1688z.m34447a(this.f13451f, this.f13451f.getString(C1704R.C1707string.record_start), C1688z.f4191b);
        m28148a(0L);
        m28124m();
        this.f13447b.mo28158b(true);
        if (this.f13457p == null) {
            this.f13457p = C1609c.m34997a(C1642c.m34893a());
        }
        this.f13457p.m34987d();
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        switch (x11RespCmd.getMsg_id()) {
            case 1:
                if (!z || !"ae_bias".equals(x11RespCmd.getType().toString())) {
                    return;
                }
                this.f13447b.mo28151e(x11RespCmd.getParam().toString().replace("EV", "").replace(" ", ""));
                return;
            case 2:
                m28136b(z, x11RespCmd);
                return;
            case 3:
                m28136b(z, x11RespCmd);
                m28142a(this.f13454i.j().getSDState());
                this.f13454i.m33985y().m33999m();
                this.f13454i.m33989u().m34056a("ae_bias");
                return;
            case 7:
                m28146a(x11RespCmd);
                return;
            case 513:
                m28141a(z);
                return;
            case 514:
                m28137b(z);
                return;
            case 515:
                if (x11RespCmd.getParam() == null) {
                    return;
                }
                long parseLong = Long.parseLong(x11RespCmd.getParam().toString());
                if (parseLong == 0) {
                    return;
                }
                this.f13456k.removeMessages(5);
                m28148a(parseLong);
                m28124m();
                return;
            case C1831e.f4786M /* 769 */:
                m28134c(z);
                return;
            default:
                return;
        }
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a
    /* renamed from: b */
    public void mo28139b() {
        m28125l();
        this.f13456k.sendEmptyMessageDelayed(7, 5000L);
    }

    /* renamed from: b */
    public void m28137b(boolean z) {
        this.f13450e = true;
        this.f13456k.removeMessages(7);
        if (!z) {
            C1688z.m34447a(this.f13451f, this.f13451f.getString(C1704R.C1707string.record_stop_fail), C1688z.f4191b);
            return;
        }
        C3103au.m29190l(this.f13451f);
        C1688z.m34447a(this.f13451f, this.f13451f.getString(C1704R.C1707string.record_end), C1688z.f4191b);
        this.f13456k.removeMessages(5);
        this.f13447b.mo28158b(false);
        this.f13458q = EnumC3366a.IDLE;
        if (this.f13457p == null) {
            this.f13457p = C1609c.m34997a(C1642c.m34893a());
        }
        this.f13457p.m34986e();
    }

    /* renamed from: b */
    public void m28136b(boolean z, X11RespCmd x11RespCmd) {
        if (!z || !"ae_bias".equals(x11RespCmd.getType())) {
            return;
        }
        m28123n();
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a
    /* renamed from: c */
    public void mo28135c() {
        m28126k();
        this.f13456k.sendEmptyMessageDelayed(7, 5000L);
    }

    /* renamed from: c */
    public void m28134c(boolean z) {
        this.f13456k.removeMessages(7);
        if (this.f13447b != null) {
            this.f13447b.mo28152e();
        }
        if (this.f13458q == EnumC3366a.RECORD) {
            if (!z) {
                this.f13447b.mo28153d(false);
                return;
            }
            C3103au.m29188n(this.f13451f);
            C1688z.m34447a(this.f13451f, this.f13451f.getString(C1704R.C1707string.capture_success), C1688z.f4191b);
            this.f13447b.mo28153d(true);
        } else if (!z) {
            C1688z.m34447a(this.f13451f, this.f13451f.getString(C1704R.C1707string.take_photo_false), C1688z.f4191b);
            this.f13447b.mo28156c(false);
        } else {
            C3103au.m29188n(this.f13451f);
            C1688z.m34447a(this.f13451f, this.f13451f.getString(C1704R.C1707string.take_photo_success), C1688z.f4191b);
            this.f13447b.mo28156c(true);
        }
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a
    /* renamed from: d */
    public void mo28133d() {
        this.f13448c.mo28237f();
        m28143a(DroneMediaTabActivity.class);
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a
    /* renamed from: e */
    public void mo28132e() {
        m28143a(CloudTerraceSettingActivity.class);
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a
    /* renamed from: f */
    public void mo28131f() {
        String videoResolution;
        if (this.f13458q != EnumC3366a.RECORD || (videoResolution = this.f13454i.j().getVideoResolution()) == null || "".equals(videoResolution) || C1831e.f4941cj.contains(videoResolution) || C1831e.f4945cn.contains(videoResolution) || C1831e.f4946co.contains(videoResolution)) {
            return;
        }
        m28126k();
        this.f13456k.sendEmptyMessageDelayed(7, 5000L);
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a
    /* renamed from: g */
    public void mo28130g() {
        m28123n();
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a
    /* renamed from: h */
    public void mo28129h() {
        this.f13456k.removeMessages(5);
    }

    @Override // com.fimi.x1bh.module.main.AbstractC3362a
    /* renamed from: i */
    public void mo28128i() {
        this.f13449d = false;
    }

    /* renamed from: j */
    public void m28127j() {
        this.f13454i.a(this);
    }

    /* renamed from: k */
    public void m28126k() {
        this.f13454i.m33985y().mo34007c();
    }

    /* renamed from: l */
    public void m28125l() {
        if (this.f13458q == EnumC3366a.RECORD) {
            this.f13454i.m33985y().mo34003g();
        } else {
            this.f13454i.m33985y().mo34004f();
        }
    }
}
