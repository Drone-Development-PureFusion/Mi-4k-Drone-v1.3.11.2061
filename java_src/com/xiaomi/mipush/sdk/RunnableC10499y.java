package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.android.AbstractC10397h;
import com.xiaomi.channel.commonutils.android.C10390b;
import com.xiaomi.channel.commonutils.android.C10394e;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.string.C10433d;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import com.xiaomi.xmpush.thrift.EnumC10821o;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mipush.sdk.y */
/* loaded from: classes2.dex */
public final class RunnableC10499y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f32609a;

    /* renamed from: b */
    final /* synthetic */ boolean f32610b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10499y(Context context, boolean z) {
        this.f32609a = context;
        this.f32610b = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        String m4906d;
        String m4906d2;
        String m4906d3;
        String m4907c;
        String m4907c2;
        String m4907c3;
        AbstractC10404b.m5269a("do sync info");
        C10775ae c10775ae = new C10775ae(MiPushClient.generatePacketID(), false);
        C10469a m5034a = C10469a.m5034a(this.f32609a);
        c10775ae.m3695c(EnumC10821o.SyncInfo.f34418N);
        c10775ae.m3698b(m5034a.m5026c());
        c10775ae.m3693d(this.f32609a.getPackageName());
        c10775ae.f33732h = new HashMap();
        AbstractC10397h.m5298a(c10775ae.f33732h, Constants.EXTRA_KEY_APP_VERSION, C10390b.m5327a(this.f32609a, this.f32609a.getPackageName()));
        AbstractC10397h.m5298a(c10775ae.f33732h, Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(C10390b.m5325b(this.f32609a, this.f32609a.getPackageName())));
        AbstractC10397h.m5298a(c10775ae.f33732h, "push_sdk_vn", "3_2_1");
        AbstractC10397h.m5298a(c10775ae.f33732h, "push_sdk_vc", Integer.toString(30201));
        AbstractC10397h.m5298a(c10775ae.f33732h, Constants.EXTRA_KEY_TOKEN, m5034a.m5025d());
        AbstractC10397h.m5298a(c10775ae.f33732h, Constants.EXTRA_KEY_IMEI_MD5, C10433d.m5176a(C10394e.m5310c(this.f32609a)));
        AbstractC10397h.m5298a(c10775ae.f33732h, Constants.EXTRA_KEY_REG_ID, m5034a.m5024e());
        AbstractC10397h.m5298a(c10775ae.f33732h, Constants.EXTRA_KEY_REG_SECRET, m5034a.m5023f());
        AbstractC10397h.m5298a(c10775ae.f33732h, Constants.EXTRA_KEY_ACCEPT_TIME, MiPushClient.getAcceptTime(this.f32609a).replace(Constants.ACCEPT_TIME_SEPARATOR_SP, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
        if (this.f32610b) {
            Map<String, String> map = c10775ae.f33732h;
            m4907c = C10498x.m4907c(MiPushClient.getAllAlias(this.f32609a));
            AbstractC10397h.m5298a(map, Constants.EXTRA_KEY_ALIASES_MD5, m4907c);
            Map<String, String> map2 = c10775ae.f33732h;
            m4907c2 = C10498x.m4907c(MiPushClient.getAllTopic(this.f32609a));
            AbstractC10397h.m5298a(map2, Constants.EXTRA_KEY_TOPICS_MD5, m4907c2);
            Map<String, String> map3 = c10775ae.f33732h;
            m4907c3 = C10498x.m4907c(MiPushClient.getAllUserAccount(this.f32609a));
            AbstractC10397h.m5298a(map3, Constants.EXTRA_KEY_ACCOUNTS_MD5, m4907c3);
        } else {
            Map<String, String> map4 = c10775ae.f33732h;
            m4906d = C10498x.m4906d(MiPushClient.getAllAlias(this.f32609a));
            AbstractC10397h.m5298a(map4, Constants.EXTRA_KEY_ALIASES, m4906d);
            Map<String, String> map5 = c10775ae.f33732h;
            m4906d2 = C10498x.m4906d(MiPushClient.getAllTopic(this.f32609a));
            AbstractC10397h.m5298a(map5, Constants.EXTRA_KEY_TOPICS, m4906d2);
            Map<String, String> map6 = c10775ae.f33732h;
            m4906d3 = C10498x.m4906d(MiPushClient.getAllUserAccount(this.f32609a));
            AbstractC10397h.m5298a(map6, Constants.EXTRA_KEY_ACCOUNTS, m4906d3);
        }
        C10494u.m4943a(this.f32609a).m4932a(c10775ae, EnumC10766a.Notification, false, null);
    }
}
