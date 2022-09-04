package com.fimi.soul.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.DynamicDYZ_Entity;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.utils.p */
/* loaded from: classes.dex */
public class C3132p {

    /* renamed from: a */
    public static C3132p f11677a;

    /* renamed from: b */
    public static final String f11678b = "create table  if not exists " + C3133a.f11682a + "(" + C3133a.f11685d + "  integer PRIMARY KEY autoincrement," + C3133a.f11684c + " double default 0 ," + C3133a.f11683b + " double default 0," + C3133a.f11686e + " integer ," + C3133a.f11687f + " text," + C3133a.f11688g + " text," + C3133a.f11689h + " integer ," + C3133a.f11690i + " long," + C3133a.f11691j + " long," + C3133a.f11692k + " long," + C3133a.f11693l + " integer," + C3133a.f11694m + " text," + C3133a.f11695n + " integer default 0 ," + C3133a.f11696o + " double default 0 ," + C3133a.f11697p + " double default 0 ," + C3133a.f11698q + " double default 0 , " + C3133a.f11699r + " double default 0 ," + C3133a.f11700s + " double default 0 ," + C3133a.f11701t + " double default 0 ," + C3133a.f11702u + " varchar(200)," + C3133a.f11703v + " varcher(10))";

    /* renamed from: c */
    private C3127k f11679c;

    /* renamed from: d */
    private SQLiteDatabase f11680d;

    /* renamed from: e */
    private Context f11681e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.utils.p$a */
    /* loaded from: classes.dex */
    public static class C3133a {

        /* renamed from: a */
        public static String f11682a = "dynData_tb";

        /* renamed from: b */
        public static String f11683b = "logitude";

        /* renamed from: c */
        public static String f11684c = "latitude";

        /* renamed from: d */
        public static String f11685d = "id";

        /* renamed from: e */
        public static String f11686e = "radius";

        /* renamed from: f */
        public static String f11687f = "encryptKey";

        /* renamed from: g */
        public static String f11688g = "encryptValue";

        /* renamed from: h */
        public static String f11689h = "type";

        /* renamed from: i */
        public static String f11690i = "startDate";

        /* renamed from: j */
        public static String f11691j = "endDate";

        /* renamed from: k */
        public static String f11692k = "insertDate";

        /* renamed from: l */
        public static String f11693l = "status";

        /* renamed from: m */
        public static String f11694m = "remarks";

        /* renamed from: n */
        public static String f11695n = "deviceType";

        /* renamed from: o */
        public static String f11696o = "warinRadius";

        /* renamed from: p */
        public static String f11697p = "limitRadius";

        /* renamed from: q */
        public static String f11698q = "limitHeight";

        /* renamed from: r */
        public static String f11699r = "noFlyType";

        /* renamed from: s */
        public static String f11700s = "version";

        /* renamed from: t */
        public static String f11701t = "pushType";

        /* renamed from: u */
        public static String f11702u = "fcIds";

        /* renamed from: v */
        public static String f11703v = "whileRange";

        C3133a() {
        }
    }

    public C3132p(Context context) {
        this.f11681e = context;
        this.f11679c = C3127k.m29073a(context);
        this.f11680d = this.f11679c.getWritableDatabase();
    }

    /* renamed from: a */
    private ContentValues m29036a(DynamicDYZ_Entity dynamicDYZ_Entity) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C3133a.f11684c, Double.valueOf(dynamicDYZ_Entity.getLatitude()));
        contentValues.put(C3133a.f11683b, Double.valueOf(dynamicDYZ_Entity.getLogitude()));
        contentValues.put(C3133a.f11686e, Integer.valueOf(dynamicDYZ_Entity.getRadius()));
        contentValues.put(C3133a.f11687f, dynamicDYZ_Entity.getEncryptKey());
        contentValues.put(C3133a.f11688g, dynamicDYZ_Entity.getEncryptValue());
        contentValues.put(C3133a.f11689h, Integer.valueOf(dynamicDYZ_Entity.getType()));
        contentValues.put(C3133a.f11690i, Long.valueOf(dynamicDYZ_Entity.getStartDate()));
        contentValues.put(C3133a.f11691j, Long.valueOf(dynamicDYZ_Entity.getEndDate()));
        contentValues.put(C3133a.f11692k, Long.valueOf(dynamicDYZ_Entity.getInsertDate()));
        contentValues.put(C3133a.f11693l, Integer.valueOf(dynamicDYZ_Entity.getStatus()));
        contentValues.put(C3133a.f11694m, dynamicDYZ_Entity.getRemarks());
        contentValues.put(C3133a.f11695n, Integer.valueOf(dynamicDYZ_Entity.getDeviceType()));
        contentValues.put(C3133a.f11696o, Double.valueOf(dynamicDYZ_Entity.getWarinRadius()));
        contentValues.put(C3133a.f11697p, Double.valueOf(dynamicDYZ_Entity.getLimitRadius()));
        contentValues.put(C3133a.f11698q, Double.valueOf(dynamicDYZ_Entity.getLimitHeight()));
        contentValues.put(C3133a.f11699r, Double.valueOf(dynamicDYZ_Entity.getNoFlyType()));
        contentValues.put(C3133a.f11700s, Double.valueOf(dynamicDYZ_Entity.getCurrentVersion()));
        contentValues.put(C3133a.f11701t, Double.valueOf(dynamicDYZ_Entity.getPushType()));
        contentValues.put(C3133a.f11702u, dynamicDYZ_Entity.getFcIds());
        contentValues.put(C3133a.f11703v, dynamicDYZ_Entity.getWhileRange());
        return contentValues;
    }

    /* renamed from: a */
    public static C3132p m29037a(Context context) {
        if (f11677a == null) {
            f11677a = new C3132p(context);
        }
        return f11677a;
    }

    /* renamed from: a */
    public List<DynamicDYZ_Entity> m29038a(int i, long j) {
        Cursor rawQuery = this.f11680d.rawQuery("select * from " + C3133a.f11682a + " where " + C3133a.f11695n + " = ? ", new String[]{String.valueOf(i)});
        if (rawQuery == null || rawQuery.getCount() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        rawQuery.moveToFirst();
        do {
            DynamicDYZ_Entity dynamicDYZ_Entity = new DynamicDYZ_Entity();
            dynamicDYZ_Entity.setLatitude(rawQuery.getDouble(rawQuery.getColumnIndex(C3133a.f11684c)));
            dynamicDYZ_Entity.setLogitude(rawQuery.getDouble(rawQuery.getColumnIndex(C3133a.f11683b)));
            dynamicDYZ_Entity.setRadius(rawQuery.getInt(rawQuery.getColumnIndex(C3133a.f11686e)));
            dynamicDYZ_Entity.setEncryptKey(rawQuery.getString(rawQuery.getColumnIndex(C3133a.f11687f)));
            dynamicDYZ_Entity.setEncryptValue(rawQuery.getString(rawQuery.getColumnIndex(C3133a.f11688g)));
            dynamicDYZ_Entity.setType(rawQuery.getInt(rawQuery.getColumnIndex(C3133a.f11689h)));
            dynamicDYZ_Entity.setStartDate(rawQuery.getLong(rawQuery.getColumnIndex(C3133a.f11690i)));
            dynamicDYZ_Entity.setEndDate(rawQuery.getLong(rawQuery.getColumnIndex(C3133a.f11691j)));
            dynamicDYZ_Entity.setInsertDate(rawQuery.getLong(rawQuery.getColumnIndex(C3133a.f11692k)));
            dynamicDYZ_Entity.setStatus(rawQuery.getInt(rawQuery.getColumnIndex(C3133a.f11693l)));
            dynamicDYZ_Entity.setRemarks(rawQuery.getString(rawQuery.getColumnIndex(C3133a.f11694m)));
            dynamicDYZ_Entity.setDeviceType(rawQuery.getInt(rawQuery.getColumnIndex(C3133a.f11695n)));
            dynamicDYZ_Entity.setWarinRadius(rawQuery.getDouble(rawQuery.getColumnIndex(C3133a.f11696o)));
            dynamicDYZ_Entity.setLimitHeight(rawQuery.getDouble(rawQuery.getColumnIndex(C3133a.f11698q)));
            dynamicDYZ_Entity.setLimitRadius(rawQuery.getDouble(rawQuery.getColumnIndex(C3133a.f11697p)));
            dynamicDYZ_Entity.setNoFlyType(rawQuery.getDouble(rawQuery.getColumnIndex(C3133a.f11699r)));
            dynamicDYZ_Entity.setCurrentVersion(rawQuery.getDouble(rawQuery.getColumnIndex(C3133a.f11700s)));
            dynamicDYZ_Entity.setPushType(rawQuery.getDouble(rawQuery.getColumnIndex(C3133a.f11701t)));
            dynamicDYZ_Entity.setFcIds(rawQuery.getString(rawQuery.getColumnIndex(C3133a.f11702u)));
            dynamicDYZ_Entity.setWhileRange(rawQuery.getString(rawQuery.getColumnIndex(C3133a.f11703v)));
            arrayList.add(dynamicDYZ_Entity);
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: a */
    public void m29035a(List<DynamicDYZ_Entity> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        m29039a();
        for (DynamicDYZ_Entity dynamicDYZ_Entity : list) {
            this.f11680d.insert(C3133a.f11682a, null, m29036a(dynamicDYZ_Entity));
        }
    }

    /* renamed from: a */
    public boolean m29039a() {
        return this.f11680d.delete(C3133a.f11682a, null, null) > 0;
    }
}
