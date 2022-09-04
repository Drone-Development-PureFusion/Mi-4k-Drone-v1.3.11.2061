package com.fimi.soul.biz.p170b;

import android.text.TextUtils;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.EnumC1626d;
import com.fimi.kernel.p158b.p161c.AbstractC1625d;
import com.fimi.kernel.p158b.p162d.C1629c;
import com.fimi.kernel.p158b.p162d.C1631d;
import com.fimi.kernel.utils.C1673n;
import com.fimi.kernel.utils.C1685x;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.RelayEntity;
import com.fimi.soul.biz.update.C2080l;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.module.update.p218a.C3025e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.biz.b.c */
/* loaded from: classes.dex */
public class C1769c implements AbstractC1625d {

    /* renamed from: b */
    private static C1769c f4610b = new C1769c();

    /* renamed from: a */
    int f4611a;

    /* renamed from: d */
    private String f4613d;

    /* renamed from: e */
    private String f4614e;

    /* renamed from: f */
    private JSONObject f4615f = null;

    /* renamed from: g */
    private List<AbstractC1771a> f4616g = new ArrayList();

    /* renamed from: c */
    private C1629c f4612c = (C1629c) C1642c.m34890a(EnumC1626d.Socket);

    /* renamed from: com.fimi.soul.biz.b.c$a */
    /* loaded from: classes.dex */
    public interface AbstractC1771a {
        /* renamed from: a */
        void mo29619a(RelayEntity relayEntity);
    }

    private C1769c() {
        C1631d m34929f = this.f4612c.m34929f();
        m34929f.a(C1831e.m33975c());
        m34929f.a(8080);
        m34929f.m34924b(10240);
        m34929f.m34922b(true);
        m34929f.m34925a(true);
        this.f4612c.m34939b(this);
    }

    /* renamed from: a */
    public static synchronized C1769c m34218a() {
        C1769c c1769c;
        synchronized (C1769c.class) {
            if (f4610b == null) {
                f4610b = new C1769c();
            }
            c1769c = f4610b;
        }
        return c1769c;
    }

    /* renamed from: a */
    public void m34217a(AbstractC1771a abstractC1771a) {
        this.f4616g.add(abstractC1771a);
    }

    @Override // com.fimi.kernel.p158b.p161c.AbstractC1625d
    /* renamed from: a */
    public void mo28036a(String str) {
        if (!TextUtils.isEmpty(str)) {
            RelayEntity relayEntity = new RelayEntity();
            C2080l.m33050c("msg:" + str);
            try {
                this.f4615f = new JSONObject(str);
                this.f4615f = new JSONObject(this.f4615f.getJSONObject("system").toString());
                this.f4613d = this.f4615f.optString("device_type");
                relayEntity.setDevice_type(this.f4613d);
                if (TextUtils.isEmpty(this.f4614e) && !TextUtils.isEmpty(this.f4615f.getString("sw_version"))) {
                    int i = this.f4615f.getString("sw_version").startsWith("X6E") ? 14 : 25;
                    C3021a.m29616a().m29613a(new C3025e(this.f4614e, i, Integer.valueOf(C1673n.m34639n(this.f4615f.getString("sw_version"))).intValue()));
                    C3021a.m29616a().m29614a(i, Integer.valueOf(C1673n.m34639n(this.f4615f.getString("sw_version"))).intValue());
                }
                this.f4614e = this.f4615f.getString("sw_version");
                this.f4611a = this.f4615f.getInt("firmupg_finished");
                relayEntity.setFirmupg_finished(this.f4611a);
                relayEntity.setSw_version(this.f4614e);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.f4616g == null || this.f4616g.size() <= 0) {
                return;
            }
            for (AbstractC1771a abstractC1771a : this.f4616g) {
                abstractC1771a.mo29619a(relayEntity);
            }
        }
    }

    /* renamed from: b */
    public void m34215b() {
        C1685x.m34457a(new Runnable() { // from class: com.fimi.soul.biz.b.c.1
            @Override // java.lang.Runnable
            public void run() {
                C1769c.this.f4612c.m34933d();
            }
        });
    }

    /* renamed from: b */
    public void m34214b(AbstractC1771a abstractC1771a) {
        this.f4616g.remove(abstractC1771a);
    }

    /* renamed from: b */
    public void m34213b(String str) {
        this.f4614e = str;
    }

    /* renamed from: c */
    public int m34212c() {
        return this.f4611a;
    }

    /* renamed from: d */
    public boolean m34211d() {
        return this.f4611a > 0;
    }

    /* renamed from: e */
    public String m34210e() {
        C3022b c3022b;
        return (!TextUtils.isEmpty(this.f4614e) || (c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class)) == null) ? C1673n.m34639n(this.f4614e) + "" : c3022b.m29584k() + "";
    }

    /* renamed from: f */
    public C1629c m34209f() {
        return this.f4612c;
    }
}
