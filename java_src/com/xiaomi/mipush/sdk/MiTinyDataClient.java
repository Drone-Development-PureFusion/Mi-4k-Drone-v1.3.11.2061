package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.C10636aw;
/* loaded from: classes2.dex */
public class MiTinyDataClient {
    public static void init(Context context, String str) {
        if (context == null) {
            AbstractC10404b.m5264d("MiTinyDataClient.init(Context, String). Context can not be null");
        } else if (str == null) {
            AbstractC10404b.m5264d("MiTinyDataClient.init(Context, String). Channel can not be null.");
        } else {
            C10636aw.m4319a().m4310a(str);
        }
    }

    public static boolean upload(int i, String str, String str2, long j, String str3) {
        return C10636aw.m4319a().m4317a(i, str, str2, j, str3, false);
    }

    public static boolean upload(String str, String str2, long j, String str3) {
        return upload(0, str, str2, j, str3);
    }
}
