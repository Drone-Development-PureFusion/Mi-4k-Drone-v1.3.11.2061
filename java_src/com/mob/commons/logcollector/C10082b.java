package com.mob.commons.logcollector;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.mob.tools.MobLog;
/* renamed from: com.mob.commons.logcollector.b */
/* loaded from: classes2.dex */
public class C10082b {

    /* renamed from: c */
    private static C10082b f31120c = null;

    /* renamed from: a */
    private Context f31121a;

    /* renamed from: b */
    private C10081a f31122b;

    private C10082b(Context context) {
        this.f31121a = context.getApplicationContext();
        this.f31122b = new C10081a(this.f31121a);
    }

    /* renamed from: a */
    public static synchronized C10082b m6237a(Context context) {
        C10082b c10082b;
        synchronized (C10082b.class) {
            if (f31120c == null) {
                f31120c = new C10082b(context);
            }
            c10082b = f31120c;
        }
        return c10082b;
    }

    /* renamed from: a */
    public int m6236a(String str) {
        Cursor cursor = null;
        int i = 0;
        try {
            cursor = this.f31122b.getWritableDatabase().rawQuery("select count(*) from " + str, null);
            if (cursor.moveToNext()) {
                i = cursor.getInt(0);
            }
        } catch (Exception e) {
            MobLog.getInstance().m6187w(e);
        } finally {
            cursor.close();
        }
        return i;
    }

    /* renamed from: a */
    public int m6234a(String str, String str2, String[] strArr) {
        Exception e;
        int i;
        try {
            i = this.f31122b.getWritableDatabase().delete(str, str2, strArr);
            try {
                MobLog.getInstance().m6200d("Deleted %d rows from table: %s", Integer.valueOf(i), str);
            } catch (Exception e2) {
                e = e2;
                MobLog.getInstance().m6186w(e, "when delete database occur error table:%s,", str);
                return i;
            }
        } catch (Exception e3) {
            e = e3;
            i = 0;
        }
        return i;
    }

    /* renamed from: a */
    public long m6235a(String str, ContentValues contentValues) {
        try {
            return this.f31122b.getWritableDatabase().replace(str, null, contentValues);
        } catch (Exception e) {
            MobLog.getInstance().m6186w(e, "when insert database occur error table:%s,", str);
            return -1L;
        }
    }

    /* renamed from: a */
    public Cursor m6233a(String str, String[] strArr) {
        try {
            return this.f31122b.getWritableDatabase().rawQuery(str, strArr);
        } catch (Exception e) {
            MobLog.getInstance().m6187w(e);
            return null;
        }
    }
}
