package com.xiaomi.mistatistic.sdk.controller;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.tencent.stat.DeviceInfo;
import com.xiaomi.mistatistic.sdk.data.C10554h;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.i */
/* loaded from: classes2.dex */
public class C10528i {

    /* renamed from: a */
    private static C10535p f32679a;

    /* renamed from: a */
    public static C10554h m4844a(Cursor cursor) {
        new C10554h();
        long j = cursor.getLong(2);
        String string = cursor.getString(4);
        String string2 = cursor.getString(5);
        String string3 = cursor.getString(1);
        String string4 = cursor.getString(3);
        String string5 = cursor.getString(6);
        C10554h c10554h = new C10554h();
        c10554h.f32716a = string3;
        c10554h.f32718c = string4;
        c10554h.f32720e = string;
        c10554h.f32717b = j;
        c10554h.f32719d = string2;
        c10554h.f32721f = string5;
        return c10554h;
    }

    /* renamed from: a */
    public static void m4846a() {
        f32679a = new C10535p(AbstractC10508a.m4880a());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10554h m4842a(String str, String str2) {
        Cursor cursor;
        C10554h m4844a;
        Cursor cursor2 = null;
        try {
            Cursor query = f32679a.getReadableDatabase().query("mistat_event", null, "category=? AND key=?", new String[]{str, str2}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        m4844a = m4844a(query);
                        if (query != null) {
                            return m4844a;
                        }
                        query.close();
                        return m4844a;
                    }
                } catch (SQLiteException e) {
                    cursor = query;
                    if (cursor == null) {
                        return null;
                    }
                    cursor.close();
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = query;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            m4844a = null;
            if (query != null) {
            }
        } catch (SQLiteException e2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public void m4845a(long j) {
        try {
            f32679a.getWritableDatabase().delete("mistat_event", "ts<=?", new String[]{String.valueOf(j)});
        } catch (SQLiteException e) {
        }
    }

    /* renamed from: a */
    public void m4843a(C10554h c10554h) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("category", c10554h.f32716a);
        contentValues.put("key", TextUtils.isEmpty(c10554h.f32718c) ? "" : c10554h.f32718c);
        contentValues.put(DeviceInfo.TAG_TIMESTAMPS, Long.valueOf(c10554h.f32717b));
        contentValues.put("type", TextUtils.isEmpty(c10554h.f32719d) ? "" : c10554h.f32719d);
        contentValues.put("value", TextUtils.isEmpty(c10554h.f32720e) ? "" : c10554h.f32720e);
        contentValues.put("extra", TextUtils.isEmpty(c10554h.f32721f) ? "" : c10554h.f32721f);
        try {
            f32679a.getWritableDatabase().insert("mistat_event", "", contentValues);
        } catch (SQLiteException e) {
            new C10534o().m4822a("Error to insert data into DB, key=" + c10554h.f32718c, e);
        }
    }

    /* renamed from: a */
    public void m4841a(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str3);
        try {
            f32679a.getWritableDatabase().update("mistat_event", contentValues, "category=? AND key=?", new String[]{str2, str});
        } catch (SQLiteException e) {
            new C10534o().m4822a("Error to update data from DB, key=" + str, e);
        }
    }

    /* renamed from: b */
    public Cursor m4840b() {
        try {
            return f32679a.getReadableDatabase().query("mistat_event", null, null, null, null, null, "ts DESC");
        } catch (SQLiteException e) {
            new C10534o().m4822a("Error while reading data from DB", e);
            return null;
        }
    }

    /* renamed from: c */
    public void m4839c() {
        try {
            f32679a.getWritableDatabase().delete("mistat_event", "ts<=? and category <> ?", new String[]{String.valueOf(System.currentTimeMillis() - 259200000), "mistat_basic"});
        } catch (SQLiteException e) {
        }
    }

    /* renamed from: d */
    public int m4838d() {
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            Cursor query = f32679a.getReadableDatabase().query("mistat_event", new String[]{"count(*)"}, null, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int i = query.getInt(0);
                        if (query == null) {
                            return i;
                        }
                        query.close();
                        return i;
                    }
                } catch (SQLiteException e) {
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = query;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (SQLiteException e2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
        return 0;
    }
}
