package com.tencent.stat.common;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.tencent.stat.StatConfig;
import com.xiaomi.market.sdk.C10445j;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;
import org.p356d.AbstractC11759f;
/* renamed from: com.tencent.stat.common.c */
/* loaded from: classes2.dex */
class C10338c {

    /* renamed from: a */
    String f32216a;

    /* renamed from: b */
    String f32217b;

    /* renamed from: c */
    DisplayMetrics f32218c;

    /* renamed from: d */
    int f32219d;

    /* renamed from: e */
    String f32220e;

    /* renamed from: f */
    String f32221f;

    /* renamed from: g */
    String f32222g;

    /* renamed from: h */
    String f32223h;

    /* renamed from: i */
    String f32224i;

    /* renamed from: j */
    String f32225j;

    /* renamed from: k */
    String f32226k;

    /* renamed from: l */
    int f32227l;

    /* renamed from: m */
    String f32228m;

    /* renamed from: n */
    Context f32229n;

    /* renamed from: o */
    private String f32230o;

    /* renamed from: p */
    private String f32231p;

    /* renamed from: q */
    private String f32232q;

    /* renamed from: r */
    private String f32233r;

    private C10338c(Context context) {
        this.f32217b = StatConstants.VERSION;
        this.f32219d = Build.VERSION.SDK_INT;
        this.f32220e = Build.MODEL;
        this.f32221f = Build.MANUFACTURER;
        this.f32222g = Locale.getDefault().getLanguage();
        this.f32227l = 0;
        this.f32228m = null;
        this.f32229n = null;
        this.f32230o = null;
        this.f32231p = null;
        this.f32232q = null;
        this.f32233r = null;
        this.f32229n = context;
        this.f32218c = C10346k.m5417d(context);
        this.f32216a = C10346k.m5401n(context);
        this.f32223h = StatConfig.getInstallChannel(context);
        this.f32224i = C10346k.m5402m(context);
        this.f32225j = TimeZone.getDefault().getID();
        this.f32227l = C10346k.m5396s(context);
        this.f32226k = C10346k.m5395t(context);
        this.f32228m = context.getPackageName();
        if (this.f32219d >= 14) {
            this.f32230o = C10346k.m5440A(context);
        }
        this.f32231p = C10346k.m5389z(context).toString();
        this.f32232q = C10346k.m5391x(context);
        this.f32233r = C10346k.m5415e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5457a(JSONObject jSONObject) {
        jSONObject.put("sr", this.f32218c.widthPixels + AbstractC11759f.f37104a + this.f32218c.heightPixels);
        C10346k.m5427a(jSONObject, "av", this.f32216a);
        C10346k.m5427a(jSONObject, "ch", this.f32223h);
        C10346k.m5427a(jSONObject, "mf", this.f32221f);
        C10346k.m5427a(jSONObject, "sv", this.f32217b);
        C10346k.m5427a(jSONObject, "ov", Integer.toString(this.f32219d));
        jSONObject.put(C10445j.f32457ac, 1);
        C10346k.m5427a(jSONObject, "op", this.f32224i);
        C10346k.m5427a(jSONObject, "lg", this.f32222g);
        C10346k.m5427a(jSONObject, "md", this.f32220e);
        C10346k.m5427a(jSONObject, "tz", this.f32225j);
        if (this.f32227l != 0) {
            jSONObject.put("jb", this.f32227l);
        }
        C10346k.m5427a(jSONObject, "sd", this.f32226k);
        C10346k.m5427a(jSONObject, "apn", this.f32228m);
        if (C10346k.m5408h(this.f32229n)) {
            JSONObject jSONObject2 = new JSONObject();
            C10346k.m5427a(jSONObject2, "bs", C10346k.m5438C(this.f32229n));
            C10346k.m5427a(jSONObject2, "ss", C10346k.m5437D(this.f32229n));
            if (jSONObject2.length() > 0) {
                C10346k.m5427a(jSONObject, "wf", jSONObject2.toString());
            }
        }
        C10346k.m5427a(jSONObject, "sen", this.f32230o);
        C10346k.m5427a(jSONObject, "cpu", this.f32231p);
        C10346k.m5427a(jSONObject, "ram", this.f32232q);
        C10346k.m5427a(jSONObject, "rom", this.f32233r);
    }
}
