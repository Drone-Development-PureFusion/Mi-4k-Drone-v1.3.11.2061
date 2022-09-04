package com.fimi.soul.utils.p219a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.BatteryUpdateSize;
import com.fimi.soul.utils.C3127k;
/* renamed from: com.fimi.soul.utils.a.a */
/* loaded from: classes.dex */
public class C3067a {

    /* renamed from: a */
    public static final String f11483a = "create table  if not exists " + C3068a.f11488a + "(" + C3068a.f11489b + " INTEGER ," + C3068a.f11490c + " varchar(20) not null ," + C3068a.f11491d + " INTEGER)";

    /* renamed from: e */
    private static C3067a f11484e;

    /* renamed from: b */
    private Context f11485b;

    /* renamed from: c */
    private C3127k f11486c;

    /* renamed from: d */
    private SQLiteDatabase f11487d;

    /* renamed from: com.fimi.soul.utils.a.a$a */
    /* loaded from: classes.dex */
    public static class C3068a {

        /* renamed from: a */
        public static String f11488a = "battery_update_size";

        /* renamed from: b */
        public static String f11489b = "battery_id";

        /* renamed from: c */
        public static String f11490c = "battery_update_size";

        /* renamed from: d */
        public static String f11491d = "message_hint_size";
    }

    private C3067a(Context context) {
        this.f11485b = context;
        this.f11486c = C3127k.m29073a(context);
    }

    /* renamed from: a */
    public static C3067a m29400a(Context context) {
        if (f11484e == null) {
            f11484e = new C3067a(context.getApplicationContext());
        }
        return f11484e;
    }

    /* renamed from: a */
    public long m29399a(BatteryUpdateSize batteryUpdateSize) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C3068a.f11489b, batteryUpdateSize.getBatteryId());
        contentValues.put(C3068a.f11490c, Integer.valueOf(batteryUpdateSize.getBatteryUpdateSize()));
        contentValues.put(C3068a.f11491d, Integer.valueOf(batteryUpdateSize.getMessageHintSize()));
        this.f11487d = this.f11486c.getWritableDatabase();
        return this.f11487d.insert(C3068a.f11488a, null, contentValues);
    }

    /* renamed from: b */
    public BatteryUpdateSize m29398b(BatteryUpdateSize batteryUpdateSize) {
        this.f11487d = this.f11486c.getWritableDatabase();
        Cursor rawQuery = this.f11487d.rawQuery("select * from " + C3068a.f11488a + " where " + C3068a.f11489b + "=? and " + C3068a.f11490c + "=?", new String[]{batteryUpdateSize.getBatteryId(), String.valueOf(batteryUpdateSize.getBatteryUpdateSize())});
        BatteryUpdateSize batteryUpdateSize2 = null;
        if (rawQuery.moveToFirst()) {
            do {
                batteryUpdateSize2 = new BatteryUpdateSize();
                batteryUpdateSize2.setBatteryId(rawQuery.getString(rawQuery.getColumnIndex(C3068a.f11489b)));
                batteryUpdateSize2.setBatteryUpdateSize(rawQuery.getInt(rawQuery.getColumnIndex(C3068a.f11490c)));
                batteryUpdateSize2.setMessageHintSize(rawQuery.getInt(rawQuery.getColumnIndex(C3068a.f11491d)));
            } while (rawQuery.moveToNext());
            return batteryUpdateSize2;
        }
        return batteryUpdateSize2;
    }

    /* renamed from: c */
    public int m29397c(BatteryUpdateSize batteryUpdateSize) {
        this.f11487d = this.f11486c.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C3068a.f11491d, Integer.valueOf(batteryUpdateSize.getMessageHintSize()));
        try {
            return this.f11487d.update(C3068a.f11488a, contentValues, C3068a.f11489b + "=? and " + C3068a.f11490c + "=?", new String[]{batteryUpdateSize.getBatteryId(), String.valueOf(batteryUpdateSize.getBatteryUpdateSize())});
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: d */
    public int m29396d(BatteryUpdateSize batteryUpdateSize) {
        this.f11487d = this.f11486c.getWritableDatabase();
        return this.f11487d.delete(C3068a.f11488a, C3068a.f11489b + "=?", new String[]{batteryUpdateSize.getBatteryId()});
    }
}
