package cn.sharesdk.framework.p076b.p077a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import cn.sharesdk.framework.utils.C0831d;
import com.tencent.p263mm.sdk.message.RMsgInfoDB;
import com.xiaomi.market.sdk.AbstractC10446k;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
/* renamed from: cn.sharesdk.framework.b.a.d */
/* loaded from: classes.dex */
public class C0800d {
    /* renamed from: a */
    public static synchronized long m37941a(Context context, String str, long j) {
        long m37945a;
        synchronized (C0800d.class) {
            if (str != null) {
                if (str.trim() != "") {
                    C0798b m37947a = C0798b.m37947a(context);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("post_time", Long.valueOf(j));
                    contentValues.put("message_data", str.toString());
                    m37945a = m37947a.m37945a(RMsgInfoDB.TABLE, contentValues);
                }
            }
            m37945a = -1;
        }
        return m37945a;
    }

    /* renamed from: a */
    public static synchronized long m37939a(Context context, ArrayList<String> arrayList) {
        long j;
        synchronized (C0800d.class) {
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
                int m37944a = C0798b.m37947a(context).m37944a(RMsgInfoDB.TABLE, "_id in ( " + sb.toString().substring(0, sb.length() - 1) + " )", null);
                C0831d.m37772a().m6194i("delete COUNT == %s", Integer.valueOf(m37944a));
                j = m37944a;
            }
        }
        return j;
    }

    /* renamed from: a */
    public static synchronized ArrayList<C0799c> m37942a(Context context) {
        ArrayList<C0799c> m37940a;
        synchronized (C0800d.class) {
            m37940a = C0798b.m37947a(context).m37946a(RMsgInfoDB.TABLE) > 0 ? m37940a(context, (String) null, (String[]) null) : new ArrayList<>();
        }
        return m37940a;
    }

    /* renamed from: a */
    private static synchronized ArrayList<C0799c> m37940a(Context context, String str, String[] strArr) {
        ArrayList<C0799c> arrayList;
        synchronized (C0800d.class) {
            arrayList = new ArrayList<>();
            C0799c c0799c = new C0799c();
            StringBuilder sb = new StringBuilder();
            Cursor m37943a = C0798b.m37947a(context).m37943a(RMsgInfoDB.TABLE, new String[]{AbstractC10446k._ID, "post_time", "message_data"}, str, strArr, null);
            StringBuilder sb2 = sb;
            C0799c c0799c2 = c0799c;
            while (m37943a != null && m37943a.moveToNext()) {
                c0799c2.f1539b.add(m37943a.getString(0));
                if (c0799c2.f1539b.size() == 100) {
                    sb2.append(m37943a.getString(2));
                    c0799c2.f1538a = sb2.toString();
                    arrayList.add(c0799c2);
                    c0799c2 = new C0799c();
                    sb2 = new StringBuilder();
                } else {
                    sb2.append(m37943a.getString(2) + "\n");
                }
            }
            m37943a.close();
            if (c0799c2.f1539b.size() != 0) {
                c0799c2.f1538a = sb2.toString().substring(0, sb2.length() - 1);
                arrayList.add(c0799c2);
            }
        }
        return arrayList;
    }
}
