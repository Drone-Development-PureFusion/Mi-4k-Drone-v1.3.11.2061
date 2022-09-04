package com.fimi.soul.utils;

import android.content.Context;
import android.text.TextUtils;
import com.fimi.kernel.C1642c;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.manager.C2015y;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.receiver.NetworkStateReceiver;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class FlyLogTools extends NetworkStateReceiver {

    /* renamed from: c */
    public static FlyLogTools f11463c;

    /* renamed from: d */
    static long f11464d;

    /* renamed from: b */
    C3155z f11465b;

    /* renamed from: e */
    private Context f11466e;

    /* renamed from: com.fimi.soul.utils.FlyLogTools$a */
    /* loaded from: classes.dex */
    public interface AbstractC3062a {
        /* renamed from: a */
        void mo29418a();
    }

    /* renamed from: com.fimi.soul.utils.FlyLogTools$b */
    /* loaded from: classes.dex */
    private class C3063b implements AbstractC1945k {

        /* renamed from: b */
        private String f11472b;

        /* renamed from: c */
        private AbstractC3062a f11473c;

        public C3063b(String str, AbstractC3062a abstractC3062a) {
            this.f11472b = str;
            this.f11473c = abstractC3062a;
        }

        @Override // com.fimi.soul.biz.p185m.AbstractC1945k
        /* renamed from: a */
        public void mo28106a(PlaneMsg planeMsg, File file) {
            if (planeMsg.isSuccess()) {
                if (FlyLogTools.this.f11465b == null || "".equals(this.f11472b)) {
                    return;
                }
                FlyLogTools.this.f11465b.m28994b(this.f11472b);
            }
            if (this.f11473c != null) {
                this.f11473c.mo29418a();
            }
        }
    }

    public FlyLogTools() {
    }

    public FlyLogTools(Context context) {
        this.f11465b = C3155z.m28998a(context);
    }

    /* renamed from: a */
    public static FlyLogTools m29422a(Context context) {
        if (f11463c == null) {
            f11463c = new FlyLogTools(context);
        }
        return f11463c;
    }

    /* renamed from: a */
    public void m29421a(final AbstractC1945k abstractC1945k) {
        try {
            new Thread(new Runnable() { // from class: com.fimi.soul.utils.FlyLogTools.1
                @Override // java.lang.Runnable
                public void run() {
                    Context m34893a = C1642c.m34893a();
                    if (m34893a == null) {
                        return;
                    }
                    C2015y m33256a = C2015y.m33256a(m34893a);
                    String m29550i = C3021a.m29616a().m29615a(0).m29550i();
                    User m34259c = C1756a.m34259c(m34893a);
                    if (m34259c == null && TextUtils.isEmpty(m34259c.getUserID())) {
                        return;
                    }
                    C1642c.m34887c();
                    m33256a.m33235d(m29550i, m34259c.getUserID(), abstractC1945k);
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.fimi.soul.receiver.NetworkStateReceiver
    /* renamed from: a */
    public void mo29420a(NetworkStateReceiver.EnumC3033a enumC3033a, Context context) {
        if (enumC3033a == NetworkStateReceiver.EnumC3033a.Wifi || enumC3033a == NetworkStateReceiver.EnumC3033a.Mobile) {
            this.f11466e = context;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f11464d < 1000) {
                return;
            }
            f11464d = currentTimeMillis;
            m29419a((AbstractC3062a) null);
        }
    }

    /* renamed from: a */
    public void m29419a(final AbstractC3062a abstractC3062a) {
        try {
            new Thread(new Runnable() { // from class: com.fimi.soul.utils.FlyLogTools.2
                @Override // java.lang.Runnable
                public void run() {
                    Context m34893a = C1642c.m34893a();
                    if (m34893a == null) {
                        return;
                    }
                    C2015y m33256a = C2015y.m33256a(m34893a);
                    String m29550i = C3021a.m29616a().m29615a(0).m29550i();
                    User m34259c = C1756a.m34259c(m34893a);
                    if (m34259c == null && TextUtils.isEmpty(m34259c.getUserID())) {
                        return;
                    }
                    String userID = m34259c.getUserID();
                    FlyLogTools.this.f11465b = C3155z.m28998a(m34893a);
                    synchronized (FlyLogTools.this.f11465b) {
                        List<C3072aa> m28996a = FlyLogTools.this.f11465b.m28996a(m34259c.getUserID());
                        if (m28996a != null && m28996a.size() > 0) {
                            JSONArray jSONArray = new JSONArray();
                            try {
                                for (C3072aa c3072aa : m28996a) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("planeID", m29550i);
                                    jSONObject.put("flyTime", c3072aa.m29379d());
                                    jSONObject.put("flyJourney", c3072aa.m29378e());
                                    jSONObject.put("userID", userID);
                                    jSONObject.put("clientType", "0");
                                    jSONObject.put("deviceType", c3072aa.m29389a());
                                    jSONObject.put("latitude", c3072aa.m29377f());
                                    jSONObject.put("longitude", c3072aa.m29376g());
                                    jSONArray.put(jSONObject);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            m33256a.m33242b(jSONArray.toString(), new C3063b(userID, abstractC3062a));
                        } else if (abstractC3062a != null) {
                            abstractC3062a.mo29418a();
                        }
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
