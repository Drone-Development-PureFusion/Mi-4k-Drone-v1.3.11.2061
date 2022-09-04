package com.baidu.tts.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* renamed from: com.baidu.tts.database.c */
/* loaded from: classes.dex */
public class C1156c extends SQLiteOpenHelper {
    public C1156c(Context context) {
        this(context, "Statistics.db", null, 1);
    }

    public C1156c(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C1158e.m36364a());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(C1158e.m36363b());
        onCreate(sQLiteDatabase);
    }
}
