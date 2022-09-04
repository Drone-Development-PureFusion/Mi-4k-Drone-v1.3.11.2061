package com.fimi.soul.service;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1673n;
import com.fimi.kernel.utils.C1680u;
import com.fimi.kernel.utils.C1681v;
import com.fimi.soul.biz.p190r.C2032a;
import com.fimi.soul.biz.update.AbstractC2056c;
import com.fimi.soul.biz.update.AbstractC2077i;
import com.fimi.soul.biz.update.AbstractC2079k;
import com.fimi.soul.biz.update.C2037a;
import com.fimi.soul.biz.update.C2058d;
import com.fimi.soul.biz.update.C2065f;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.receiver.SpeekSignReceiver;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.utils.FlyLogTools;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class InitAppService extends Service {

    /* renamed from: a */
    public static final String f11416a = "sp_down_firmware";

    /* renamed from: b */
    private volatile int f11417b = 0;

    /* renamed from: c */
    private C2037a f11418c = new C2037a();

    /* renamed from: d */
    private C2058d f11419d = new C2058d();

    /* renamed from: e */
    private C2065f f11420e = new C2065f();

    /* renamed from: f */
    private AbstractC2077i f11421f;

    /* renamed from: g */
    private AbstractC2079k<UpdateVersonBean> f11422g;

    /* renamed from: h */
    private AbstractC2077i f11423h;

    /* renamed from: i */
    private SpeekSignReceiver f11424i;

    /* renamed from: j */
    private C2032a f11425j;

    /* renamed from: k */
    private AbstractC2077i f11426k;

    /* renamed from: com.fimi.soul.service.InitAppService$a */
    /* loaded from: classes.dex */
    public class BinderC3052a extends Binder {
        public BinderC3052a() {
        }

        /* renamed from: a */
        public InitAppService m29456a() {
            return InitAppService.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m29472a(C2065f c2065f, final UpdateVersonBean updateVersonBean) {
        m29461e();
        updateVersonBean.getSysname();
        File file = new File(C3129m.m29045v());
        if (!file.exists()) {
            file.mkdir();
        }
        final String fileEncode = updateVersonBean.getFileEncode();
        String m33081e = c2065f.m33081e(updateVersonBean);
        File file2 = new File(m33081e);
        boolean z = false;
        if (file2.exists()) {
            String m34548a = C1680u.m34548a(file2);
            if (!C1673n.m34653b(fileEncode) && fileEncode.equals(m34548a)) {
                z = true;
                if (updateVersonBean.getSysid() == 24) {
                    C1681v.m34543a(getBaseContext()).m34520f(fileEncode);
                }
            }
        }
        if (!z) {
            c2065f.m33088b(updateVersonBean, m33081e, new AbstractC2077i() { // from class: com.fimi.soul.service.InitAppService.3
                @Override // com.fimi.soul.biz.update.AbstractC2077i
                /* renamed from: a */
                public void mo28035a(boolean z2, long j, long j2, int i) {
                    if (!z2) {
                        return;
                    }
                    if (updateVersonBean.getSysid() == 24) {
                        C1681v.m34543a(InitAppService.this.getBaseContext()).m34520f(fileEncode);
                    }
                    InitAppService.this.m29460f();
                }
            });
        }
    }

    /* renamed from: e */
    private synchronized void m29461e() {
        this.f11417b++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m29460f() {
        this.f11417b--;
    }

    /* renamed from: g */
    private void m29459g() {
        if (C3103au.m29213c(getBaseContext())) {
            if (m29466b()) {
                return;
            }
            m29464c();
        } else if (C3103au.m29221b(getBaseContext())) {
            m29462d();
        } else {
            Log.d("Good", "没有网络");
        }
    }

    /* renamed from: h */
    private void m29458h() {
        final C2065f c2065f = new C2065f();
        c2065f.m33096a(new C2065f.AbstractC2074c() { // from class: com.fimi.soul.service.InitAppService.2
            @Override // com.fimi.soul.biz.update.C2065f.AbstractC2074c
            /* renamed from: a */
            public void mo29457a(List<UpdateVersonBean> list) {
                InitAppService.this.m29467a(list);
                if (list == null || list.size() < 1) {
                    return;
                }
                AbstractC2056c.f5765c = false;
                AbstractC2056c.f5764b = false;
                List<UpdateVersonBean> m29607e = C3021a.m29616a().m29607e();
                if (m29607e != null && m29607e.size() > 0) {
                    for (UpdateVersonBean updateVersonBean : m29607e) {
                        InitAppService.this.m29472a(c2065f, updateVersonBean);
                    }
                }
                InitAppService.this.m29473a(c2065f);
            }
        });
    }

    /* renamed from: a */
    public void m29474a() {
        this.f11421f = null;
        this.f11422g = null;
        this.f11423h = null;
    }

    /* renamed from: a */
    public void m29473a(C2065f c2065f) {
        UpdateVersonBean m29605g = C3021a.m29616a().m29605g();
        if (m29605g != null) {
            m29472a(c2065f, m29605g);
        }
    }

    /* renamed from: a */
    public void m29471a(AbstractC2077i abstractC2077i) {
        this.f11426k = abstractC2077i;
    }

    /* renamed from: a */
    public void m29470a(AbstractC2079k<UpdateVersonBean> abstractC2079k) {
        this.f11422g = abstractC2079k;
    }

    /* renamed from: a */
    public void m29467a(List<UpdateVersonBean> list) {
        if (list == null || list.size() < 1) {
            C1642c.m34887c().mo34879a(f11416a, (Object) "");
        } else {
            C1642c.m34887c().mo34877a(f11416a, (List) list);
        }
    }

    /* renamed from: b */
    public void m29465b(AbstractC2077i abstractC2077i) {
        this.f11423h = abstractC2077i;
    }

    /* renamed from: b */
    public synchronized boolean m29466b() {
        return this.f11417b > 0;
    }

    /* renamed from: c */
    public synchronized void m29464c() {
        if (!m29466b() && C3103au.m29213c(getBaseContext())) {
            m29458h();
        }
    }

    /* renamed from: c */
    public void m29463c(AbstractC2077i abstractC2077i) {
        this.f11421f = abstractC2077i;
    }

    /* renamed from: d */
    public void m29462d() {
        this.f11420e.m33096a(new C2065f.AbstractC2074c() { // from class: com.fimi.soul.service.InitAppService.1
            @Override // com.fimi.soul.biz.update.C2065f.AbstractC2074c
            /* renamed from: a */
            public void mo29457a(List<UpdateVersonBean> list) {
                InitAppService.this.m29467a(list);
            }
        });
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new BinderC3052a();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f11424i = new SpeekSignReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.f11424i, intentFilter);
        this.f11425j = C2032a.m33177a(getBaseContext());
        this.f11425j.m33178a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        if (this.f11424i != null) {
            unregisterReceiver(this.f11424i);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C2065f.m33076n();
        m29459g();
        FlyLogTools.m29422a(this).m29419a((FlyLogTools.AbstractC3062a) null);
        return super.onStartCommand(intent, i, i2);
    }
}
