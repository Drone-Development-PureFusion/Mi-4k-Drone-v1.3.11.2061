package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.channel.commonutils.string.C10433d;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
/* renamed from: com.xiaomi.push.service.ad */
/* loaded from: classes2.dex */
public class C10606ad {

    /* renamed from: a */
    private static Object f32978a = new Object();

    /* renamed from: b */
    private static Map<String, Queue<String>> f32979b = new HashMap();

    /* renamed from: a */
    public static boolean m4409a(XMPushService xMPushService, String str, String str2) {
        synchronized (f32978a) {
            SharedPreferences sharedPreferences = xMPushService.getSharedPreferences("push_message_ids", 0);
            Queue<String> queue = f32979b.get(str);
            if (queue == null) {
                String[] split = sharedPreferences.getString(str, "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                queue = new LinkedList<>();
                for (String str3 : split) {
                    queue.add(str3);
                }
                f32979b.put(str, queue);
            }
            if (queue.contains(str2)) {
                return true;
            }
            queue.add(str2);
            if (queue.size() > 25) {
                queue.poll();
            }
            String m5175a = C10433d.m5175a(queue, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str, m5175a);
            edit.commit();
            return false;
        }
    }
}
