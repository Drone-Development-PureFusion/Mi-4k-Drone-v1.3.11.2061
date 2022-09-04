package com.tencent.map.p262b;

import android.location.Location;
import com.google.firebase.p251a.C9654a;
import com.google.firebase.p253b.C9755a;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.tencent.map.b.b */
/* loaded from: classes2.dex */
public class C10157b {

    /* renamed from: b */
    private static C10157b f31357b;

    /* renamed from: i */
    private AbstractC10158a f31365i;

    /* renamed from: c */
    private double f31359c = C9755a.f30449c;

    /* renamed from: d */
    private double f31360d = C9755a.f30449c;

    /* renamed from: e */
    private double f31361e = C9755a.f30449c;

    /* renamed from: f */
    private double f31362f = C9755a.f30449c;

    /* renamed from: g */
    private double f31363g = C9755a.f30449c;

    /* renamed from: h */
    private double f31364h = C9755a.f30449c;

    /* renamed from: j */
    private C10159b f31366j = null;

    /* renamed from: k */
    private boolean f31367k = false;

    /* renamed from: a */
    public String f31358a = "";

    /* renamed from: com.tencent.map.b.b$a */
    /* loaded from: classes2.dex */
    public interface AbstractC10158a {
        /* renamed from: a */
        void mo5994a(double d, double d2);
    }

    /* renamed from: com.tencent.map.b.b$b */
    /* loaded from: classes2.dex */
    public class C10159b extends Thread {
        public C10159b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                byte[] m5915a = C10185j.m5915a(C10157b.this.f31358a.getBytes());
                C10157b.this.f31367k = true;
                C10190n m6033a = C10157b.m6033a("http://ls.map.soso.com/deflect?c=1", "SOSO MAP LBS SDK", m5915a);
                C10157b.this.f31367k = false;
                C10157b.m6035a(C10157b.this, C10185j.m5914b(m6033a.f31534a), m6033a.f31535b);
            } catch (Exception e) {
                int i = 0;
                while (true) {
                    i++;
                    if (i > 3) {
                        C10157b.this.f31367k = false;
                        if (C10157b.this.f31365i == null) {
                            return;
                        }
                        C10157b.this.f31365i.mo5994a(360.0d, 360.0d);
                        return;
                    }
                    try {
                        sleep(2000L);
                        C10190n m6033a2 = C10157b.m6033a("http://ls.map.soso.com/deflect?c=1", "SOSO MAP LBS SDK", C10185j.m5915a(C10157b.this.f31358a.getBytes()));
                        C10157b.this.f31367k = false;
                        C10157b.m6035a(C10157b.this, C10185j.m5914b(m6033a2.f31534a), m6033a2.f31535b);
                        return;
                    } catch (Exception e2) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C10157b m6039a() {
        if (f31357b == null) {
            f31357b = new C10157b();
        }
        return f31357b;
    }

    /* renamed from: a */
    public static C10190n m6033a(String str, String str2, byte[] bArr) {
        boolean z = true;
        if (C10188l.m5901b() == null) {
            z = false;
        }
        if (!z) {
            throw new C10191o();
        }
        try {
            return C10193q.m5892a(false, str, str2, null, bArr, false, true);
        } catch (Exception e) {
            throw e;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m6035a(C10157b c10157b, byte[] bArr, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(new String(bArr, str));
        } catch (Exception e) {
            if (c10157b.f31365i != null) {
                c10157b.f31365i.mo5994a(360.0d, 360.0d);
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(stringBuffer.toString()).getJSONObject(C9654a.C9656b.f30231p);
            double d = jSONObject.getDouble("latitude");
            double d2 = jSONObject.getDouble("longitude");
            c10157b.f31363g = d - c10157b.f31361e;
            c10157b.f31364h = d2 - c10157b.f31362f;
            c10157b.f31359c = c10157b.f31361e;
            c10157b.f31360d = c10157b.f31362f;
            if (c10157b.f31365i == null) {
                return;
            }
            c10157b.f31365i.mo5994a(d, d2);
        } catch (JSONException e2) {
            if (c10157b.f31365i == null) {
                return;
            }
            c10157b.f31365i.mo5994a(360.0d, 360.0d);
        }
    }

    /* renamed from: a */
    public static boolean m6034a(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: a */
    public final void m6038a(double d, double d2, AbstractC10158a abstractC10158a) {
        this.f31365i = abstractC10158a;
        if (this.f31363g != C9755a.f30449c && this.f31364h != C9755a.f30449c) {
            float[] fArr = new float[10];
            Location.distanceBetween(d, d2, this.f31359c, this.f31360d, fArr);
            if (fArr[0] < 1500.0f) {
                this.f31365i.mo5994a(this.f31363g + d, this.f31364h + d2);
                return;
            }
        }
        if (!this.f31367k) {
            this.f31358a = "{\"source\":101,\"access_token\":\"160e7bd42dec9428721034e0146fc6dd\",\"location\":{\"latitude\":" + d + ",\"longitude\":" + d2 + "}\t}";
            this.f31361e = d;
            this.f31362f = d2;
            this.f31366j = new C10159b();
            this.f31366j.start();
        }
    }
}
