package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.p */
/* loaded from: classes2.dex */
public class C10535p extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final Object f32689a = new Object();

    public C10535p(Context context) {
        super(context, "mistat.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f32689a) {
            sQLiteDatabase.execSQL(String.format("create table %s(_id integer primary key autoincrement, category text, ts integer, key text, value text, type text, extra text)", "mistat_event"));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
