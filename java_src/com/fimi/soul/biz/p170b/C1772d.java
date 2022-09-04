package com.fimi.soul.biz.p170b;

import android.text.TextUtils;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.EnumC1626d;
import com.fimi.kernel.p158b.p161c.AbstractC1625d;
import com.fimi.kernel.p158b.p162d.C1629c;
import com.fimi.kernel.p158b.p162d.C1631d;
import com.fimi.kernel.utils.C1673n;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.RelayEntity;
import com.fimi.soul.biz.update.C2080l;
import com.fimi.soul.entity.DeviceType;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.module.update.p218a.C3025e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.b.d */
/* loaded from: classes.dex */
public class C1772d implements AbstractC1625d {

    /* renamed from: b */
    private static C1772d f4618b = new C1772d();

    /* renamed from: a */
    int f4619a;

    /* renamed from: d */
    private String f4621d;

    /* renamed from: e */
    private String f4622e;

    /* renamed from: g */
    private int f4624g;

    /* renamed from: k */
    private boolean f4628k;

    /* renamed from: l */
    private String f4629l;

    /* renamed from: m */
    private String f4630m;

    /* renamed from: f */
    private volatile String f4623f = "5G";

    /* renamed from: h */
    private boolean f4625h = false;

    /* renamed from: i */
    private boolean f4626i = false;

    /* renamed from: j */
    private JSONObject f4627j = null;

    /* renamed from: n */
    private List<AbstractC1774a> f4631n = new ArrayList();

    /* renamed from: c */
    private C1629c f4620c = (C1629c) C1642c.m34890a(EnumC1626d.Socket);

    /* renamed from: com.fimi.soul.biz.b.d$a */
    /* loaded from: classes.dex */
    public interface AbstractC1774a {
        /* renamed from: a */
        void mo29620a(RelayEntity relayEntity);
    }

    private C1772d() {
        C1631d m34929f = this.f4620c.m34929f();
        m34929f.a(C1831e.m33976b());
        m34929f.a(8080);
        m34929f.m34924b(10240);
        m34929f.m34922b(true);
        m34929f.m34925a(true);
        this.f4620c.m34939b(this);
    }

    /* renamed from: a */
    public static synchronized C1772d m34208a() {
        C1772d c1772d;
        synchronized (C1772d.class) {
            if (f4618b == null) {
                f4618b = new C1772d();
            }
            c1772d = f4618b;
        }
        return c1772d;
    }

    /* renamed from: f */
    private void m34192f(String str) {
        try {
            JSONObject jSONObject = (JSONObject) new JSONObject(str).get("fwdap");
            this.f4629l = jSONObject.getString("ssid");
            this.f4630m = jSONObject.getString("key");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m34207a(AbstractC1625d abstractC1625d) {
        this.f4620c.m34939b(abstractC1625d);
    }

    /* renamed from: a */
    public void m34206a(AbstractC1774a abstractC1774a) {
        this.f4631n.add(abstractC1774a);
    }

    @Override // com.fimi.kernel.p158b.p161c.AbstractC1625d
    /* renamed from: a */
    public void mo28036a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C2080l.m33055b(str);
            this.f4626i = true;
            RelayEntity relayEntity = new RelayEntity();
            try {
                this.f4627j = new JSONObject(str);
                String jSONObject = this.f4627j.getJSONObject("system").toString();
                String jSONObject2 = this.f4627j.getJSONObject("camera").toString();
                this.f4627j = new JSONObject(jSONObject);
                this.f4623f = this.f4627j.optString("device_type");
                relayEntity.setDevice_type(this.f4623f);
                if (!this.f4628k) {
                    if ("4K".equalsIgnoreCase(this.f4623f)) {
                        C1681v.m34543a(DroidPlannerApp.m34273g()).m34521f(DeviceType.DEVICE_4K);
                    } else {
                        C1681v.m34543a(DroidPlannerApp.m34273g()).m34521f(DeviceType.DEVICE_1080P);
                    }
                    this.f4628k = true;
                }
                if (TextUtils.isEmpty(this.f4621d) && !TextUtils.isEmpty(this.f4627j.getString("sw_version"))) {
                    if ("4K".equalsIgnoreCase(this.f4623f)) {
                        if (this.f4627j.getString("sw_version").startsWith("X6E")) {
                        }
                        C3021a.m29616a().m29613a(new C3025e(this.f4622e, 15, Integer.valueOf(C1673n.m34639n(this.f4627j.getString("sw_version"))).intValue()));
                        C3021a.m29616a().m29614a(15, Integer.valueOf(C1673n.m34639n(this.f4627j.getString("sw_version"))).intValue());
                    } else {
                        C3021a.m29616a().m29613a(new C3025e(this.f4622e, 11, Integer.valueOf(C1673n.m34639n(this.f4627j.getString("sw_version"))).intValue()));
                        C3021a.m29616a().m29614a(11, Integer.valueOf(C1673n.m34639n(this.f4627j.getString("sw_version"))).intValue());
                    }
                }
                this.f4621d = this.f4627j.getString("sw_version");
                this.f4622e = this.f4627j.getString("hw_version");
                this.f4619a = this.f4627j.getInt("firmupg_finished");
                relayEntity.setFirmupg_finished(this.f4619a);
                relayEntity.setHw_version(this.f4622e);
                relayEntity.setSw_version(this.f4621d);
                this.f4627j = new JSONObject(jSONObject2);
                this.f4624g = this.f4627j.getInt("quality");
                this.f4625h = this.f4627j.getBoolean("connected");
                relayEntity.setQuality(this.f4624g);
                relayEntity.setIsConnectCamera(this.f4625h);
                if (str.contains("fwdap")) {
                    m34192f(str);
                } else {
                    this.f4629l = null;
                    this.f4630m = null;
                }
            } catch (JSONException e) {
                C2080l.m33055b("e:" + e.getMessage().toString());
                e.printStackTrace();
            }
            if (this.f4631n == null || this.f4631n.size() <= 0) {
                return;
            }
            for (AbstractC1774a abstractC1774a : this.f4631n) {
                abstractC1774a.mo29620a(relayEntity);
            }
        }
    }

    /* renamed from: a */
    public void m34204a(boolean z) {
        this.f4625h = z;
    }

    /* renamed from: b */
    public void m34203b() {
        this.f4620c.m34927g();
        this.f4620c.m34933d();
    }

    /* renamed from: b */
    public void m34202b(AbstractC1774a abstractC1774a) {
        this.f4631n.remove(abstractC1774a);
    }

    /* renamed from: b */
    public void m34201b(String str) {
        this.f4621d = str;
    }

    /* renamed from: b */
    public void m34200b(boolean z) {
        this.f4626i = z;
        if (!z) {
            this.f4628k = false;
        }
    }

    /* renamed from: c */
    public void m34199c() {
        C1685x.m34457a(new Runnable() { // from class: com.fimi.soul.biz.b.d.1
            @Override // java.lang.Runnable
            public void run() {
                C1772d.this.f4620c.m34933d();
            }
        });
    }

    /* renamed from: c */
    public void m34198c(String str) {
        this.f4623f = str;
    }

    /* renamed from: d */
    public String m34197d() {
        C3022b c3022b;
        return (!TextUtils.isEmpty(this.f4621d) || (c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class)) == null) ? this.f4621d : c3022b.m29596e() + "";
    }

    /* renamed from: d */
    public void m34196d(String str) {
        this.f4630m = str;
    }

    /* renamed from: e */
    public String m34195e() {
        return this.f4622e;
    }

    /* renamed from: e */
    public void m34194e(String str) {
        this.f4629l = str;
    }

    /* renamed from: f */
    public int m34193f() {
        return this.f4624g;
    }

    /* renamed from: g */
    public int m34191g() {
        return this.f4619a;
    }

    /* renamed from: h */
    public boolean m34190h() {
        return this.f4619a > 0;
    }

    /* renamed from: i */
    public boolean m34189i() {
        return "4K".equalsIgnoreCase(this.f4623f);
    }

    /* renamed from: j */
    public boolean m34188j() {
        return TextUtils.isEmpty(this.f4623f);
    }

    /* renamed from: k */
    public boolean m34187k() {
        return "4K".equalsIgnoreCase(this.f4623f);
    }

    /* renamed from: l */
    public boolean m34186l() {
        return "5G".equalsIgnoreCase(this.f4623f);
    }

    /* renamed from: m */
    public boolean m34185m() {
        return this.f4625h;
    }

    /* renamed from: n */
    public boolean m34184n() {
        return this.f4626i;
    }

    /* renamed from: o */
    public C1629c m34183o() {
        return this.f4620c;
    }

    /* renamed from: p */
    public String m34182p() {
        return this.f4630m;
    }

    /* renamed from: q */
    public String m34181q() {
        return this.f4629l;
    }
}
