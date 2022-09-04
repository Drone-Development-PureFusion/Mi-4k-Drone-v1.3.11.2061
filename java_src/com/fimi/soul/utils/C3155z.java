package com.fimi.soul.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.utils.z */
/* loaded from: classes.dex */
public class C3155z {

    /* renamed from: a */
    public static C3155z f11864a;

    /* renamed from: b */
    public static final String f11865b = "create table  if not exists " + C3156a.f11869a + "(" + C3156a.f11870b + " varchar(20) not null ," + C3156a.f11871c + " long default 0 ," + C3156a.f11872d + " double default 0," + C3156a.f11874f + " varchar(10) ," + C3156a.f11875g + " double," + C3156a.f11876h + " double," + C3156a.f11873e + " varchar(20) not null)";

    /* renamed from: c */
    private C3127k f11866c;

    /* renamed from: d */
    private SQLiteDatabase f11867d;

    /* renamed from: e */
    private Context f11868e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.utils.z$a */
    /* loaded from: classes.dex */
    public static class C3156a {

        /* renamed from: a */
        public static String f11869a = "flyRecords_tb";

        /* renamed from: b */
        public static String f11870b = "drone_id";

        /* renamed from: c */
        public static String f11871c = "fly_time";

        /* renamed from: d */
        public static String f11872d = "fly_distance";

        /* renamed from: e */
        public static String f11873e = "user_id";

        /* renamed from: f */
        public static String f11874f = "deviceType";

        /* renamed from: g */
        public static String f11875g = "latitude";

        /* renamed from: h */
        public static String f11876h = "longitude";

        C3156a() {
        }
    }

    public C3155z(Context context) {
        this.f11868e = context;
        this.f11866c = C3127k.m29073a(context);
        this.f11867d = this.f11866c.getWritableDatabase();
    }

    /* renamed from: a */
    public static C3155z m28998a(Context context) {
        if (f11864a == null) {
            f11864a = new C3155z(context);
        }
        return f11864a;
    }

    /* renamed from: b */
    private ContentValues m28995b(C3072aa c3072aa) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C3156a.f11871c, Long.valueOf(c3072aa.m29379d()));
        contentValues.put(C3156a.f11872d, Double.valueOf(c3072aa.m29378e()));
        contentValues.put(C3156a.f11870b, c3072aa.m29382c());
        contentValues.put(C3156a.f11873e, c3072aa.m29385b());
        contentValues.put(C3156a.f11874f, c3072aa.m29389a());
        contentValues.put(C3156a.f11875g, Double.valueOf(c3072aa.m29377f()));
        contentValues.put(C3156a.f11876h, Double.valueOf(c3072aa.m29376g()));
        return contentValues;
    }

    /* renamed from: a */
    public List<C3072aa> m28996a(String str) {
        Cursor query;
        ArrayList arrayList = null;
        if (str == null || "".equals(str) || (query = this.f11867d.query(C3156a.f11869a, new String[]{C3156a.f11873e, C3156a.f11870b, C3156a.f11871c, C3156a.f11872d, C3156a.f11874f, C3156a.f11875g, C3156a.f11876h}, C3156a.f11873e + " = ? ", new String[]{str}, null, null, null)) == null || query.getCount() <= 0) {
            return arrayList;
        }
        arrayList = new ArrayList();
        query.moveToFirst();
        do {
            C3072aa c3072aa = new C3072aa();
            c3072aa.m29383b(str);
            c3072aa.m29387a(query.getLong(query.getColumnIndex(C3156a.f11871c)));
            c3072aa.m29388a(query.getDouble(query.getColumnIndex(C3156a.f11872d)));
            c3072aa.m29386a(query.getString(query.getColumnIndex(C3156a.f11874f)));
            c3072aa.m29384b(query.getDouble(query.getColumnIndex(C3156a.f11875g)));
            c3072aa.m29381c(query.getDouble(query.getColumnIndex(C3156a.f11876h)));
            arrayList.add(c3072aa);
        } while (query.moveToNext());
        return arrayList;
    }

    /* renamed from: a */
    public void m28997a(C3072aa c3072aa) {
        this.f11867d.insert(C3156a.f11869a, null, m28995b(c3072aa));
    }

    /* renamed from: b */
    public boolean m28994b(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        return this.f11867d.delete(C3156a.f11869a, new StringBuilder().append(C3156a.f11873e).append(" = ? ").toString(), new String[]{str}) > 0;
    }
}
