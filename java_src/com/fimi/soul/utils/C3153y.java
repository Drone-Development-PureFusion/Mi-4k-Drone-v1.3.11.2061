package com.fimi.soul.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.FlyModeLog;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.utils.y */
/* loaded from: classes.dex */
public class C3153y {

    /* renamed from: a */
    public static C3153y f11852a;

    /* renamed from: b */
    private C3127k f11853b;

    /* renamed from: c */
    private SQLiteDatabase f11854c;

    /* renamed from: d */
    private Context f11855d;

    /* renamed from: e */
    private final String f11856e = "create table  if not exists " + C3154a.f11857a + "(" + C3154a.f11858b + " varchar(20) not null ," + C3154a.f11859c + " varchar(20) not null ," + C3154a.f11860d + " varchar(20) not null ," + C3154a.f11861e + " varchar(20) not null ," + C3154a.f11862f + " varchar(20) not null ," + C3154a.f11863g + " varchar(20) not null)";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.utils.y$a */
    /* loaded from: classes.dex */
    public static class C3154a {

        /* renamed from: a */
        public static String f11857a = "fly_mode_log_tb";

        /* renamed from: b */
        public static String f11858b = "userID";

        /* renamed from: c */
        public static String f11859c = "fcVersion";

        /* renamed from: d */
        public static String f11860d = "openType";

        /* renamed from: e */
        public static String f11861e = "applyTime";

        /* renamed from: f */
        public static String f11862f = "x2Version";

        /* renamed from: g */
        public static String f11863g = "appType";

        C3154a() {
        }
    }

    public C3153y(Context context) {
        this.f11855d = context;
        this.f11853b = C3127k.m29073a(context);
        this.f11854c = this.f11853b.getWritableDatabase();
        this.f11854c.execSQL(this.f11856e);
    }

    /* renamed from: a */
    public static C3153y m29003a(Context context) {
        if (f11852a == null) {
            f11852a = new C3153y(context);
        }
        return f11852a;
    }

    /* renamed from: b */
    private ContentValues m29000b(FlyModeLog flyModeLog) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C3154a.f11858b, flyModeLog.getUserID());
        contentValues.put(C3154a.f11859c, flyModeLog.getFcVersion());
        contentValues.put(C3154a.f11860d, flyModeLog.getOpenType());
        contentValues.put(C3154a.f11861e, flyModeLog.getApplyTime());
        contentValues.put(C3154a.f11862f, flyModeLog.getX2Version());
        contentValues.put(C3154a.f11863g, flyModeLog.getAppType());
        return contentValues;
    }

    /* renamed from: a */
    public long m29002a(FlyModeLog flyModeLog) {
        return this.f11854c.insert(C3154a.f11857a, null, m29000b(flyModeLog));
    }

    /* renamed from: a */
    public List<FlyModeLog> m29004a() {
        SQLiteDatabase writableDatabase = this.f11853b.getWritableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = writableDatabase.rawQuery("select * from " + C3154a.f11857a, null);
        while (rawQuery.moveToNext()) {
            FlyModeLog flyModeLog = new FlyModeLog();
            flyModeLog.setUserID(rawQuery.getString(rawQuery.getColumnIndex(C3154a.f11858b)));
            flyModeLog.setFcVersion(rawQuery.getString(rawQuery.getColumnIndex(C3154a.f11859c)));
            flyModeLog.setOpenType(rawQuery.getString(rawQuery.getColumnIndex(C3154a.f11860d)));
            flyModeLog.setApplyTime(rawQuery.getString(rawQuery.getColumnIndex(C3154a.f11861e)));
            flyModeLog.setX2Version(rawQuery.getString(rawQuery.getColumnIndex(C3154a.f11862f)));
            flyModeLog.setAppType(rawQuery.getString(rawQuery.getColumnIndex(C3154a.f11863g)));
            arrayList.add(flyModeLog);
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean m29001b() {
        return this.f11854c.delete(C3154a.f11857a, null, null) > 0;
    }

    /* renamed from: c */
    public long m28999c() {
        this.f11854c = this.f11853b.getReadableDatabase();
        Cursor rawQuery = this.f11854c.rawQuery("select count(*)from" + C3154a.f11857a, null);
        rawQuery.moveToFirst();
        return rawQuery.getLong(0);
    }
}
