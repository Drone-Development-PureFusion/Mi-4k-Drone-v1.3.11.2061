package cn.sharesdk.framework.p076b.p077a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import cn.sharesdk.framework.utils.C0831d;
/* renamed from: cn.sharesdk.framework.b.a.b */
/* loaded from: classes.dex */
public class C0798b {

    /* renamed from: c */
    private static C0798b f1535c = null;

    /* renamed from: a */
    private Context f1536a;

    /* renamed from: b */
    private C0797a f1537b;

    private C0798b(Context context) {
        this.f1536a = context.getApplicationContext();
        this.f1537b = new C0797a(this.f1536a);
    }

    /* renamed from: a */
    public static synchronized C0798b m37947a(Context context) {
        C0798b c0798b;
        synchronized (C0798b.class) {
            if (f1535c == null) {
                f1535c = new C0798b(context);
            }
            c0798b = f1535c;
        }
        return c0798b;
    }

    /* renamed from: a */
    public int m37946a(String str) {
        Cursor cursor = null;
        int i = 0;
        try {
            cursor = this.f1537b.getWritableDatabase().rawQuery("select count(*) from " + str, null);
            if (cursor.moveToNext()) {
                i = cursor.getInt(0);
            }
        } catch (Exception e) {
            C0831d.m37772a().m6187w(e);
        } finally {
            cursor.close();
        }
        return i;
    }

    /* renamed from: a */
    public int m37944a(String str, String str2, String[] strArr) {
        Exception e;
        int i;
        try {
            i = this.f1537b.getWritableDatabase().delete(str, str2, strArr);
            try {
                C0831d.m37772a().m6200d("Deleted %d rows from table: %s", Integer.valueOf(i), str);
            } catch (Exception e2) {
                e = e2;
                C0831d.m37772a().m6186w(e, "when delete database occur error table:%s,", str);
                return i;
            }
        } catch (Exception e3) {
            e = e3;
            i = 0;
        }
        return i;
    }

    /* renamed from: a */
    public long m37945a(String str, ContentValues contentValues) {
        try {
            return this.f1537b.getWritableDatabase().replace(str, null, contentValues);
        } catch (Exception e) {
            C0831d.m37772a().m6186w(e, "when insert database occur error table:%s,", str);
            return -1L;
        }
    }

    /* renamed from: a */
    public Cursor m37943a(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        SQLiteDatabase writableDatabase = this.f1537b.getWritableDatabase();
        C0831d.m37772a().m6200d("Query table: %s", str);
        try {
            return writableDatabase.query(str, strArr, str2, strArr2, null, null, str3);
        } catch (Exception e) {
            C0831d.m37772a().m6186w(e, "when query database occur error table:%s,", str);
            return null;
        }
    }
}
