package com.mob.commons.logcollector;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.tools.MobLog;
import com.tencent.open.SocialConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.mob.commons.logcollector.f */
/* loaded from: classes2.dex */
public class C10086f {
    /* renamed from: a */
    public static synchronized long m6204a(Context context, long j, String str, int i, String str2) {
        long m6235a;
        synchronized (C10086f.class) {
            if (TextUtils.isEmpty(str)) {
                m6235a = -1;
            } else {
                C10082b m6237a = C10082b.m6237a(context);
                ContentValues contentValues = new ContentValues();
                contentValues.put("exception_time", Long.valueOf(j));
                contentValues.put("exception_msg", str.toString());
                contentValues.put("exception_level", Integer.valueOf(i));
                contentValues.put("exception_md5", str2);
                m6235a = m6237a.m6235a("table_exception", contentValues);
            }
        }
        return m6235a;
    }

    /* renamed from: a */
    public static synchronized long m6202a(Context context, ArrayList<String> arrayList) {
        long j;
        synchronized (C10086f.class) {
            if (arrayList == null) {
                j = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < arrayList.size(); i++) {
                    sb.append("'");
                    sb.append(arrayList.get(i));
                    sb.append("'");
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                int m6234a = C10082b.m6237a(context).m6234a("table_exception", "exception_md5 in ( " + sb.toString().substring(0, sb.length() - 1) + " )", null);
                MobLog.getInstance().m6194i("delete COUNT == %s", Integer.valueOf(m6234a));
                j = m6234a;
            }
        }
        return j;
    }

    /* renamed from: a */
    private static synchronized ArrayList<C10085e> m6203a(Context context, String str, String[] strArr) {
        ArrayList<C10085e> arrayList;
        synchronized (C10086f.class) {
            arrayList = new ArrayList<>();
            C10085e c10085e = new C10085e();
            C10082b m6237a = C10082b.m6237a(context);
            String str2 = " select exception_md5, exception_level, exception_time, exception_msg, sum(exception_counts) from table_exception group by exception_md5 having max(_id)";
            if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
                str2 = " select exception_md5, exception_level, exception_time, exception_msg, sum(exception_counts) from table_exception where " + str + " group by exception_md5 having max(_id)";
            }
            Cursor m6233a = m6237a.m6233a(str2, strArr);
            while (true) {
                if (m6233a == null || !m6233a.moveToNext()) {
                    break;
                }
                c10085e.f31134b.add(m6233a.getString(0));
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("type", Integer.valueOf(m6233a.getInt(1)));
                hashMap.put("errat", Long.valueOf(m6233a.getLong(2)));
                hashMap.put(SocialConstants.PARAM_SEND_MSG, Base64.encodeToString(m6233a.getString(3).getBytes(), 2));
                hashMap.put("times", Integer.valueOf(m6233a.getInt(4)));
                c10085e.f31133a.add(hashMap);
                if (c10085e.f31134b.size() == 50) {
                    arrayList.add(c10085e);
                    c10085e = new C10085e();
                    break;
                }
            }
            m6233a.close();
            if (c10085e.f31134b.size() != 0) {
                arrayList.add(c10085e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0009, code lost:
        if (r5.length <= 0) goto L5;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ArrayList<C10085e> m6201a(Context context, String[] strArr) {
        ArrayList<C10085e> m6203a;
        synchronized (C10086f.class) {
            String str = "exception_level = ?";
            if (strArr != null) {
            }
            str = null;
            strArr = null;
            m6203a = C10082b.m6237a(context).m6236a("table_exception") > 0 ? m6203a(context, str, strArr) : new ArrayList<>();
        }
        return m6203a;
    }
}
