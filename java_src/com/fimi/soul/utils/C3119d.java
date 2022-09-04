package com.fimi.soul.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.BatteryOverDischange;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.utils.d */
/* loaded from: classes.dex */
public class C3119d {

    /* renamed from: a */
    public static C3119d f11633a;

    /* renamed from: b */
    public static final String f11634b = "create table  if not exists " + C3120a.f11638a + "(" + C3120a.f11639b + " varchar(20) not null ," + C3120a.f11640c + " varchar(20) not null ," + C3120a.f11641d + " varchar(20) not null ," + C3120a.f11642e + " varchar(20) not null ," + C3120a.f11643f + " varchar(20) not null ," + C3120a.f11644g + " varchar(20) not null ," + C3120a.f11645h + " varchar(20) not null ," + C3120a.f11646i + " varchar(20) not null ," + C3120a.f11647j + " varchar(20) not null ," + C3120a.f11648k + " varchar(20) not null ," + C3120a.f11649l + " varchar(20) not null ," + C3120a.f11650m + " varchar(20) not null ," + C3120a.f11651n + " varchar(20) not null ," + C3120a.f11652o + " varchar(20) not null ," + C3120a.f11654q + " varchar(20) ," + C3120a.f11655r + " varchar(20) ," + C3120a.f11656s + " varchar(20) ," + C3120a.f11653p + " INTEGER)";

    /* renamed from: c */
    private C3127k f11635c;

    /* renamed from: d */
    private SQLiteDatabase f11636d;

    /* renamed from: e */
    private Context f11637e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.utils.d$a */
    /* loaded from: classes.dex */
    public static class C3120a {

        /* renamed from: a */
        public static String f11638a = "battery_over_dischange_tb";

        /* renamed from: b */
        public static String f11639b = "user_id";

        /* renamed from: c */
        public static String f11640c = "battery_id";

        /* renamed from: d */
        public static String f11641d = "battery_level";

        /* renamed from: e */
        public static String f11642e = "voltage";

        /* renamed from: f */
        public static String f11643f = "battery_current";

        /* renamed from: g */
        public static String f11644g = "temperature";

        /* renamed from: h */
        public static String f11645h = "battery_full";

        /* renamed from: i */
        public static String f11646i = "battery_one";

        /* renamed from: j */
        public static String f11647j = "battery_two";

        /* renamed from: k */
        public static String f11648k = "battery_three";

        /* renamed from: l */
        public static String f11649l = "battery_four";

        /* renamed from: m */
        public static String f11650m = "battery_recyle";

        /* renamed from: n */
        public static String f11651n = "version";

        /* renamed from: o */
        public static String f11652o = "appType";

        /* renamed from: p */
        public static String f11653p = "accidentType";

        /* renamed from: q */
        public static String f11654q = "fc_version";

        /* renamed from: r */
        public static String f11655r = "update_size";

        /* renamed from: s */
        public static String f11656s = "current";

        C3120a() {
        }
    }

    public C3119d(Context context) {
        this.f11637e = context;
        this.f11635c = C3127k.m29073a(context);
        this.f11636d = this.f11635c.getWritableDatabase();
    }

    /* renamed from: a */
    public static C3119d m29115a(Context context) {
        if (f11633a == null) {
            f11633a = new C3119d(context);
        }
        return f11633a;
    }

    /* renamed from: b */
    private ContentValues m29112b(BatteryOverDischange batteryOverDischange) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C3120a.f11639b, batteryOverDischange.getUserId());
        contentValues.put(C3120a.f11640c, batteryOverDischange.getBatteryId());
        contentValues.put(C3120a.f11641d, batteryOverDischange.getBatteryLevel());
        contentValues.put(C3120a.f11642e, batteryOverDischange.getVoltage());
        contentValues.put(C3120a.f11643f, batteryOverDischange.getBatteryCurrent());
        contentValues.put(C3120a.f11644g, batteryOverDischange.getTemperature());
        contentValues.put(C3120a.f11645h, batteryOverDischange.getBatteryFull());
        contentValues.put(C3120a.f11646i, batteryOverDischange.getBatteryOne());
        contentValues.put(C3120a.f11647j, batteryOverDischange.getBatteryTwo());
        contentValues.put(C3120a.f11648k, batteryOverDischange.getBatteryThree());
        contentValues.put(C3120a.f11649l, batteryOverDischange.getBatteryFour());
        contentValues.put(C3120a.f11650m, batteryOverDischange.getBatteryRecyle());
        contentValues.put(C3120a.f11651n, batteryOverDischange.getVersion());
        contentValues.put(C3120a.f11652o, batteryOverDischange.getAppType());
        contentValues.put(C3120a.f11653p, batteryOverDischange.getAppType());
        contentValues.put(C3120a.f11656s, batteryOverDischange.getCurElectric());
        contentValues.put(C3120a.f11654q, batteryOverDischange.getFcVersion());
        contentValues.put(C3120a.f11655r, batteryOverDischange.getUpdateTimes());
        return contentValues;
    }

    /* renamed from: a */
    public long m29114a(BatteryOverDischange batteryOverDischange) {
        return this.f11636d.insert(C3120a.f11638a, null, m29112b(batteryOverDischange));
    }

    /* renamed from: a */
    public List<BatteryOverDischange> m29116a() {
        SQLiteDatabase writableDatabase = this.f11635c.getWritableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = writableDatabase.rawQuery("select * from " + C3120a.f11638a, null);
        while (rawQuery.moveToNext()) {
            BatteryOverDischange batteryOverDischange = new BatteryOverDischange();
            batteryOverDischange.setUserId(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11639b)));
            batteryOverDischange.setBatteryId(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11640c)));
            batteryOverDischange.setBatteryLevel(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11641d)));
            batteryOverDischange.setVoltage(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11642e)));
            batteryOverDischange.setBatteryCurrent(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11643f)));
            batteryOverDischange.setTemperature(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11644g)));
            batteryOverDischange.setBatteryFull(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11645h)));
            batteryOverDischange.setBatteryOne(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11646i)));
            batteryOverDischange.setBatteryTwo(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11647j)));
            batteryOverDischange.setBatteryThree(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11648k)));
            batteryOverDischange.setBatteryFour(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11649l)));
            batteryOverDischange.setBatteryRecyle(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11650m)));
            batteryOverDischange.setVersion(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11651n)));
            batteryOverDischange.setAppType(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11652o)));
            batteryOverDischange.setAccidentType(rawQuery.getInt(rawQuery.getColumnIndex(C3120a.f11653p)));
            batteryOverDischange.setCurElectric(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11656s)));
            batteryOverDischange.setFcVersion(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11654q)));
            batteryOverDischange.setUpdateTimes(rawQuery.getString(rawQuery.getColumnIndex(C3120a.f11655r)));
            arrayList.add(batteryOverDischange);
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean m29113b() {
        return this.f11636d.delete(C3120a.f11638a, null, null) > 0;
    }

    /* renamed from: c */
    public long m29111c() {
        this.f11636d = this.f11635c.getReadableDatabase();
        Cursor rawQuery = this.f11636d.rawQuery("select count(*)from" + C3120a.f11638a, null);
        rawQuery.moveToFirst();
        return rawQuery.getLong(0);
    }
}
