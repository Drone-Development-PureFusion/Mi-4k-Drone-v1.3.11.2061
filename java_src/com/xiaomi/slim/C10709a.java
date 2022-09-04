package com.xiaomi.slim;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.string.C10431b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.protobuf.C10570b;
import com.xiaomi.push.service.C10615ak;
import com.xiaomi.smack.AbstractC10716a;
import java.util.HashMap;
/* renamed from: com.xiaomi.slim.a */
/* loaded from: classes2.dex */
class C10709a {
    /* renamed from: a */
    public static void m4037a(C10615ak.C10617b c10617b, String str, AbstractC10716a abstractC10716a) {
        String m5181a;
        C10570b.C10573c c10573c = new C10570b.C10573c();
        if (!TextUtils.isEmpty(c10617b.f32998c)) {
            c10573c.m4640a(c10617b.f32998c);
        }
        if (!TextUtils.isEmpty(c10617b.f33001f)) {
            c10573c.m4635d(c10617b.f33001f);
        }
        if (!TextUtils.isEmpty(c10617b.f33002g)) {
            c10573c.m4633e(c10617b.f33002g);
        }
        c10573c.m4638b(c10617b.f33000e ? "1" : "0");
        if (!TextUtils.isEmpty(c10617b.f32999d)) {
            c10573c.m4637c(c10617b.f32999d);
        } else {
            c10573c.m4637c("XIAOMI-SASL");
        }
        C10710b c10710b = new C10710b();
        c10710b.m4022c(c10617b.f32997b);
        c10710b.m4034a(Integer.parseInt(c10617b.f33003h));
        c10710b.m4025b(c10617b.f32996a);
        c10710b.m4030a("BIND", (String) null);
        c10710b.m4031a(c10710b.m4015h());
        AbstractC10404b.m5269a("[Slim]: bind id=" + c10710b.m4015h());
        HashMap hashMap = new HashMap();
        hashMap.put("challenge", str);
        hashMap.put(Constants.EXTRA_KEY_TOKEN, c10617b.f32998c);
        hashMap.put("chid", c10617b.f33003h);
        hashMap.put("from", c10617b.f32997b);
        hashMap.put("id", c10710b.m4015h());
        hashMap.put("to", "xiaomi.com");
        if (c10617b.f33000e) {
            hashMap.put("kick", "1");
        } else {
            hashMap.put("kick", "0");
        }
        if (!TextUtils.isEmpty(c10617b.f33001f)) {
            hashMap.put("client_attrs", c10617b.f33001f);
        } else {
            hashMap.put("client_attrs", "");
        }
        if (!TextUtils.isEmpty(c10617b.f33002g)) {
            hashMap.put("cloud_attrs", c10617b.f33002g);
        } else {
            hashMap.put("cloud_attrs", "");
        }
        if (c10617b.f32999d.equals("XIAOMI-PASS") || c10617b.f32999d.equals("XMPUSH-PASS")) {
            m5181a = C10431b.m5181a(c10617b.f32999d, null, hashMap, c10617b.f33004i);
        } else {
            if (c10617b.f32999d.equals("XIAOMI-SASL")) {
            }
            m5181a = null;
        }
        c10573c.m4631f(m5181a);
        c10710b.m4027a(c10573c.c(), (String) null);
        abstractC10716a.mo3982b(c10710b);
    }

    /* renamed from: a */
    public static void m4036a(String str, String str2, AbstractC10716a abstractC10716a) {
        C10710b c10710b = new C10710b();
        c10710b.m4022c(str2);
        c10710b.m4034a(Integer.parseInt(str));
        c10710b.m4030a("UBND", (String) null);
        abstractC10716a.mo3982b(c10710b);
    }
}
