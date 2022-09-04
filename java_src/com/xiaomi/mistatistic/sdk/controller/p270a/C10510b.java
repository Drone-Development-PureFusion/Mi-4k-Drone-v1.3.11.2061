package com.xiaomi.mistatistic.sdk.controller.p270a;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.gms.tagmanager.C9196e;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10524e;
import com.xiaomi.mistatistic.sdk.controller.C10528i;
import com.xiaomi.mistatistic.sdk.controller.C10534o;
import com.xiaomi.mistatistic.sdk.data.C10554h;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.a.b */
/* loaded from: classes2.dex */
public class C10510b implements AbstractC10524e {

    /* renamed from: a */
    private long f32645a;

    /* renamed from: h */
    private AbstractC10511c f32652h;

    /* renamed from: b */
    private HashMap f32646b = new HashMap();

    /* renamed from: c */
    private long f32647c = System.currentTimeMillis();

    /* renamed from: d */
    private long f32648d = 0;

    /* renamed from: e */
    private JSONArray f32649e = new JSONArray();

    /* renamed from: f */
    private JSONObject f32650f = null;

    /* renamed from: g */
    private ArrayList f32651g = new ArrayList();

    /* renamed from: i */
    private HashMap f32653i = new HashMap();

    public C10510b(long j, AbstractC10511c abstractC10511c) {
        this.f32645a = j;
        this.f32652h = abstractC10511c;
    }

    /* renamed from: a */
    private void m4873a(C10554h c10554h) {
        JSONObject jSONObject = (JSONObject) this.f32646b.get("mistat_session");
        if (jSONObject == null) {
            JSONArray jSONArray = new JSONArray();
            jSONObject = new JSONObject();
            jSONObject.put("category", "mistat_session");
            jSONObject.put("values", jSONArray);
            this.f32646b.put("mistat_session", jSONObject);
            this.f32650f.getJSONArray("content").put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        String[] split = c10554h.f32720e.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        long parseLong = Long.parseLong(split[0]);
        long parseLong2 = Long.parseLong(split[1]);
        jSONObject2.put("start", parseLong);
        jSONObject2.put("end", parseLong2);
        jSONObject2.put("env", c10554h.f32721f);
        jSONObject.getJSONArray("values").put(jSONObject2);
    }

    /* renamed from: b */
    private void m4871b(C10554h c10554h) {
        JSONObject jSONObject = (JSONObject) this.f32646b.get("mistat_pv");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("category", "mistat_pv");
            jSONObject.put("values", jSONArray);
            this.f32646b.put("mistat_pv", jSONObject);
            this.f32650f.getJSONArray("content").put(jSONObject);
        }
        String[] split = c10554h.f32720e.trim().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        String[] strArr = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            int indexOf = this.f32651g.indexOf(split[i]);
            if (indexOf >= 0) {
                strArr[i] = String.valueOf(indexOf + 1);
            } else {
                strArr[i] = String.valueOf(this.f32651g.size() + 1);
                this.f32651g.add(split[i]);
            }
        }
        jSONObject.getJSONArray("values").put(TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, strArr));
        jSONObject.put("index", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, this.f32651g));
    }

    /* renamed from: c */
    private void m4870c(C10554h c10554h) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = (JSONObject) this.f32646b.get(c10554h.f32716a);
        if (jSONObject2 == null) {
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject3.put("category", c10554h.f32716a);
            jSONObject3.put("values", jSONArray);
            this.f32646b.put(c10554h.f32716a, jSONObject3);
            this.f32650f.getJSONArray("content").put(jSONObject3);
            jSONObject = jSONObject3;
        } else {
            jSONObject = jSONObject2;
        }
        if (!C9196e.f29004b.equals(c10554h.f32719d) || !TextUtils.isEmpty(c10554h.f32721f)) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("key", c10554h.f32718c);
            jSONObject4.put("type", c10554h.f32719d);
            if ("count".equals(c10554h.f32719d) || "numeric".equals(c10554h.f32719d)) {
                jSONObject4.put("value", Long.parseLong(c10554h.f32720e));
            } else {
                jSONObject4.put("value", c10554h.f32720e);
            }
            if (!TextUtils.isEmpty(c10554h.f32721f)) {
                jSONObject4.put("params", new JSONObject(c10554h.f32721f));
            }
            jSONObject.getJSONArray("values").put(jSONObject4);
            return;
        }
        JSONObject jSONObject5 = (JSONObject) this.f32653i.get(c10554h.f32718c);
        if (jSONObject5 != null) {
            jSONObject5.put("value", jSONObject5.getLong("value") + Long.parseLong(c10554h.f32720e));
            return;
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("key", c10554h.f32718c);
        jSONObject6.put("type", c10554h.f32719d);
        jSONObject6.put("value", Long.parseLong(c10554h.f32720e));
        jSONObject.getJSONArray("values").put(jSONObject6);
        this.f32653i.put(c10554h.f32718c, jSONObject6);
    }

    @Override // com.xiaomi.mistatistic.sdk.controller.AbstractC10524e
    /* renamed from: a */
    public void mo4784a() {
        try {
            JSONArray m4872b = m4872b();
            if (m4872b == null) {
                this.f32652h.mo4796a("", this.f32648d);
            } else {
                this.f32652h.mo4796a(m4872b.toString(), this.f32648d);
            }
        } catch (JSONException e) {
            this.f32652h.mo4796a("", this.f32648d);
        }
    }

    /* renamed from: b */
    public JSONArray m4872b() {
        C10534o c10534o = new C10534o();
        C10528i c10528i = new C10528i();
        c10528i.m4839c();
        Cursor m4840b = c10528i.m4840b();
        c10534o.m4823a("Begin to packing data from local DB");
        int i = 0;
        try {
            if (m4840b.moveToFirst()) {
                do {
                    i++;
                    C10554h m4844a = C10528i.m4844a(m4840b);
                    c10534o.m4823a("Packing " + m4844a.toString());
                    if (this.f32648d == 0) {
                        this.f32648d = m4844a.f32717b;
                        this.f32647c = this.f32648d;
                    }
                    if (this.f32645a > 0 && this.f32647c - m4844a.f32717b > this.f32645a && this.f32650f != null) {
                        this.f32650f = null;
                        this.f32646b.clear();
                        this.f32651g.clear();
                        this.f32647c = m4844a.f32717b;
                        this.f32653i.clear();
                    }
                    if (this.f32650f == null) {
                        this.f32650f = new JSONObject();
                        this.f32650f.put("endTS", m4844a.f32717b);
                        this.f32650f.put("content", new JSONArray());
                        this.f32649e.put(this.f32650f);
                    }
                    if ("mistat_session".equals(m4844a.f32716a)) {
                        m4873a(m4844a);
                    } else if ("mistat_pv".equals(m4844a.f32716a)) {
                        m4871b(m4844a);
                    } else {
                        m4870c(m4844a);
                    }
                    this.f32650f.put("startTS", m4844a.f32717b);
                } while (m4840b.moveToNext());
                c10534o.m4823a("Packing complete, total " + i + " records were packed and to be uploaded");
            } else {
                c10534o.m4823a("No data available to be packed");
                this.f32649e = null;
            }
            return this.f32649e;
        } finally {
            if (m4840b != null) {
                m4840b.close();
            }
        }
    }
}
