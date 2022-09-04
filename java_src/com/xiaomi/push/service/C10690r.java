package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.smack.C10730l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.xiaomi.push.service.r */
/* loaded from: classes.dex */
public class C10690r {

    /* renamed from: a */
    private static final Map<String, byte[]> f33225a = new HashMap();

    /* renamed from: b */
    private static ArrayList<Pair<String, byte[]>> f33226b = new ArrayList<>();

    /* renamed from: a */
    public static void m4120a(Context context, int i, String str) {
        synchronized (f33225a) {
            for (String str2 : f33225a.keySet()) {
                m4119a(context, str2, f33225a.get(str2), i, str);
            }
            f33225a.clear();
        }
    }

    /* renamed from: a */
    public static void m4119a(Context context, String str, byte[] bArr, int i, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, C10646b.m4285a(str));
    }

    /* renamed from: a */
    public static void m4118a(XMPushService xMPushService) {
        try {
            synchronized (f33225a) {
                for (String str : f33225a.keySet()) {
                    C10601aa.m4439a(xMPushService, str, f33225a.get(str));
                }
                f33225a.clear();
            }
        } catch (C10730l e) {
            AbstractC10404b.m5267a(e);
            xMPushService.m4499a(10, e);
        }
    }

    /* renamed from: a */
    public static void m4117a(String str, byte[] bArr) {
        synchronized (f33225a) {
            f33225a.put(str, bArr);
        }
    }

    /* renamed from: b */
    public static void m4116b(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f33226b) {
                arrayList = f33226b;
                f33226b = new ArrayList<>();
            }
            Iterator<Pair<String, byte[]>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair<String, byte[]> next = it2.next();
                C10601aa.m4439a(xMPushService, (String) next.first, (byte[]) next.second);
            }
        } catch (C10730l e) {
            AbstractC10404b.m5267a(e);
            xMPushService.m4499a(10, e);
        }
    }

    /* renamed from: b */
    public static void m4115b(String str, byte[] bArr) {
        synchronized (f33226b) {
            f33226b.add(new Pair<>(str, bArr));
            if (f33226b.size() > 50) {
                f33226b.remove(0);
            }
        }
    }
}
