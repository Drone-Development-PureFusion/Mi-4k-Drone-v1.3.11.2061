package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.channel.commonutils.android.AbstractC10397h;
import com.xiaomi.channel.commonutils.android.C10394e;
import com.xiaomi.channel.commonutils.misc.C10410f;
import com.xiaomi.push.service.C10612ah;
import com.xiaomi.push.service.C10673k;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import com.xiaomi.xmpush.thrift.EnumC10806e;
import com.xiaomi.xmpush.thrift.EnumC10821o;
import java.util.HashMap;
/* renamed from: com.xiaomi.mipush.sdk.z */
/* loaded from: classes2.dex */
public class C10500z implements C10673k.AbstractC10674a {
    public C10500z(Context context) {
        C10673k.m4213a(context).m4212a(this);
    }

    /* renamed from: b */
    private void m4904b(String str, Context context) {
        C10775ae c10775ae = new C10775ae();
        c10775ae.m3695c(EnumC10821o.ClientMIIDUpdate.f34418N);
        c10775ae.m3698b(C10469a.m5034a(context).m5026c());
        c10775ae.m3706a(MiPushClient.generatePacketID());
        HashMap hashMap = new HashMap();
        AbstractC10397h.m5298a(hashMap, Constants.EXTRA_KEY_MIID, str);
        c10775ae.m3703a(hashMap);
        int m5312b = C10394e.m5312b();
        if (m5312b >= 0) {
            c10775ae.m3688i().put("space_id", Integer.toString(m5312b));
        }
        C10494u.m4943a(context).m4932a(c10775ae, EnumC10766a.Notification, true, null);
    }

    /* renamed from: a */
    public void m4905a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        long j = sharedPreferences.getLong("last_sync_miid_time", -1L);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        int m4397a = C10612ah.m4394a(context).m4397a(EnumC10806e.SyncMIIDFrequency.m3437a(), 21600);
        if (j == -1) {
            sharedPreferences.edit().putLong("last_sync_miid_time", currentTimeMillis).commit();
        } else if (Math.abs(currentTimeMillis - j) <= m4397a) {
        } else {
            C10410f.m5253a(context).m5251a((C10410f.AbstractRunnableC10411a) new C10471aa(context), m4397a);
            sharedPreferences.edit().putLong("last_sync_miid_time", currentTimeMillis).commit();
        }
    }

    @Override // com.xiaomi.push.service.C10673k.AbstractC10674a
    /* renamed from: a */
    public void mo4203a(String str, Context context) {
        m4904b(str, context);
    }
}
