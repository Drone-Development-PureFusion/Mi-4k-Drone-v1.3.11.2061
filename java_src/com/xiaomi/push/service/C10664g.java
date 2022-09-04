package com.xiaomi.push.service;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.tencent.tauth.AuthActivity;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10419k;
import com.xiaomi.push.service.module.C10678b;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.xiaomi.push.service.g */
/* loaded from: classes2.dex */
public class C10664g {

    /* renamed from: a */
    private static volatile C10664g f33134a;

    /* renamed from: b */
    private C10663f f33135b;

    private C10664g(Context context) {
        this.f33135b = new C10663f(context);
    }

    /* renamed from: a */
    private synchronized Cursor m4256a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        synchronized (this) {
            C10419k.m5232a(false);
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT * FROM geoMessage", null);
            } catch (Exception e) {
                AbstractC10404b.m5264d(e.toString());
            }
        }
        return cursor;
    }

    /* renamed from: a */
    public static C10664g m4257a(Context context) {
        if (f33134a == null) {
            synchronized (C10664g.class) {
                if (f33134a == null) {
                    f33134a = new C10664g(context);
                }
            }
        }
        return f33134a;
    }

    /* renamed from: a */
    public synchronized int m4255a(String str) {
        int i = 0;
        synchronized (this) {
            C10419k.m5232a(false);
            if (!TextUtils.isEmpty(str)) {
                try {
                    SQLiteDatabase writableDatabase = this.f33135b.getWritableDatabase();
                    int delete = writableDatabase.delete("geoMessage", "message_id = ?", new String[]{str});
                    writableDatabase.close();
                    i = delete;
                } catch (Exception e) {
                    AbstractC10404b.m5264d(e.toString());
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public synchronized ArrayList<C10678b> m4258a() {
        ArrayList<C10678b> arrayList;
        C10419k.m5232a(false);
        try {
            SQLiteDatabase writableDatabase = this.f33135b.getWritableDatabase();
            Cursor m4256a = m4256a(writableDatabase);
            arrayList = new ArrayList<>();
            if (m4256a != null) {
                while (m4256a.moveToNext()) {
                    C10678b c10678b = new C10678b();
                    c10678b.m4162a(m4256a.getString(m4256a.getColumnIndex("message_id")));
                    c10678b.m4159b(m4256a.getString(m4256a.getColumnIndex("geo_id")));
                    c10678b.m4161a(m4256a.getBlob(m4256a.getColumnIndex("content")));
                    c10678b.m4164a(m4256a.getInt(m4256a.getColumnIndex(AuthActivity.ACTION_KEY)));
                    c10678b.m4163a(m4256a.getLong(m4256a.getColumnIndex("deadline")));
                    arrayList.add(c10678b);
                }
                m4256a.close();
            }
            writableDatabase.close();
        } catch (Exception e) {
            AbstractC10404b.m5264d(e.toString());
            arrayList = null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized boolean m4254a(ArrayList<ContentValues> arrayList) {
        boolean z;
        C10419k.m5232a(false);
        if (arrayList == null || arrayList.size() <= 0) {
            z = false;
        } else {
            try {
                SQLiteDatabase writableDatabase = this.f33135b.getWritableDatabase();
                writableDatabase.beginTransaction();
                Iterator<ContentValues> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    } else if (-1 == writableDatabase.insert("geoMessage", null, it2.next())) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    writableDatabase.setTransactionSuccessful();
                }
                writableDatabase.endTransaction();
                writableDatabase.close();
            } catch (Exception e) {
                AbstractC10404b.m5264d(e.toString());
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public synchronized int m4253b(String str) {
        int i = 0;
        synchronized (this) {
            C10419k.m5232a(false);
            if (!TextUtils.isEmpty(str)) {
                try {
                    SQLiteDatabase writableDatabase = this.f33135b.getWritableDatabase();
                    int delete = writableDatabase.delete("geoMessage", "geo_id = ?", new String[]{str});
                    writableDatabase.close();
                    i = delete;
                } catch (Exception e) {
                    AbstractC10404b.m5264d(e.toString());
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public synchronized ArrayList<C10678b> m4252c(String str) {
        ArrayList<C10678b> arrayList;
        C10419k.m5232a(false);
        if (TextUtils.isEmpty(str)) {
            arrayList = null;
        } else {
            try {
                ArrayList<C10678b> m4258a = m4258a();
                ArrayList<C10678b> arrayList2 = new ArrayList<>();
                Iterator<C10678b> it2 = m4258a.iterator();
                while (it2.hasNext()) {
                    C10678b next = it2.next();
                    if (TextUtils.equals(next.m4158c(), str)) {
                        arrayList2.add(next);
                    }
                }
                arrayList = arrayList2;
            } catch (Exception e) {
                AbstractC10404b.m5264d(e.toString());
                arrayList = null;
            }
        }
        return arrayList;
    }
}
