package com.baidu.tts.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* renamed from: com.baidu.tts.database.b */
/* loaded from: classes.dex */
public class C1155b extends SQLiteOpenHelper {
    public C1155b(Context context) {
        this(context, "ttsModel.db", null, 1);
    }

    public C1155b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(SpeechModelTable.m36389a());
        sQLiteDatabase.execSQL(ModelFileTable.m36393a());
        sQLiteDatabase.execSQL(FsFileInfoTable.m36395a());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(SpeechModelTable.m36386b());
        sQLiteDatabase.execSQL(ModelFileTable.m36390b());
        sQLiteDatabase.execSQL(FsFileInfoTable.m36394b());
        onCreate(sQLiteDatabase);
    }
}
