package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10406b;
import com.xiaomi.channel.commonutils.misc.C10410f;
import com.xiaomi.channel.commonutils.string.C10433d;
import com.xiaomi.push.service.C10612ah;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.EnumC10806e;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* renamed from: com.xiaomi.mipush.sdk.x */
/* loaded from: classes2.dex */
public class C10498x {
    /* renamed from: a */
    public static void m4912a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        long j = sharedPreferences.getLong("last_sync_info", -1L);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long m4397a = C10612ah.m4394a(context).m4397a(EnumC10806e.SyncInfoFrequency.m3437a(), 1209600);
        if (j == -1) {
            sharedPreferences.edit().putLong("last_sync_info", currentTimeMillis).commit();
        } else if (Math.abs(currentTimeMillis - j) <= m4397a) {
        } else {
            m4910a(context, true);
            sharedPreferences.edit().putLong("last_sync_info", currentTimeMillis).commit();
        }
    }

    /* renamed from: a */
    public static void m4911a(Context context, C10775ae c10775ae) {
        AbstractC10404b.m5269a("need to update local info with: " + c10775ae.m3688i());
        String str = c10775ae.m3688i().get(Constants.EXTRA_KEY_ACCEPT_TIME);
        if (str != null) {
            MiPushClient.removeAcceptTime(context);
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (split.length == 2) {
                MiPushClient.addAcceptTime(context, split[0], split[1]);
                if (!"00:00".equals(split[0]) || !"00:00".equals(split[1])) {
                    C10469a.m5034a(context).m5029a(false);
                } else {
                    C10469a.m5034a(context).m5029a(true);
                }
            }
        }
        String str2 = c10775ae.m3688i().get(Constants.EXTRA_KEY_ALIASES);
        if (str2 != null) {
            MiPushClient.removeAllAliases(context);
            if (!"".equals(str2)) {
                String[] split2 = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                for (String str3 : split2) {
                    MiPushClient.addAlias(context, str3);
                }
            }
        }
        String str4 = c10775ae.m3688i().get(Constants.EXTRA_KEY_TOPICS);
        if (str4 != null) {
            MiPushClient.removeAllTopics(context);
            if (!"".equals(str4)) {
                String[] split3 = str4.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                for (String str5 : split3) {
                    MiPushClient.addTopic(context, str5);
                }
            }
        }
        String str6 = c10775ae.m3688i().get(Constants.EXTRA_KEY_ACCOUNTS);
        if (str6 != null) {
            MiPushClient.removeAllAccounts(context);
            if ("".equals(str6)) {
                return;
            }
            String[] split4 = str6.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            for (String str7 : split4) {
                MiPushClient.addAccount(context, str7);
            }
        }
    }

    /* renamed from: a */
    public static void m4910a(Context context, boolean z) {
        C10410f.m5253a(context).m5248a(new RunnableC10499y(context, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static String m4907c(List<String> list) {
        String m5176a = C10433d.m5176a(m4906d(list));
        return (TextUtils.isEmpty(m5176a) || m5176a.length() <= 4) ? "" : m5176a.substring(0, 4).toLowerCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static String m4906d(List<String> list) {
        if (C10406b.m5258a(list)) {
            return "";
        }
        ArrayList<String> arrayList = new ArrayList(list);
        Collections.sort(arrayList, Collator.getInstance(Locale.CHINA));
        String str = "";
        for (String str2 : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                str = str + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
            str = str + str2;
        }
        return str;
    }
}
