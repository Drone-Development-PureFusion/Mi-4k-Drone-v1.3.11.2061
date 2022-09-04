package com.xiaomi.market.sdk;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
/* renamed from: com.xiaomi.market.sdk.r */
/* loaded from: classes2.dex */
public class C10453r extends SQLiteOpenHelper {
    private static final String TAG = "MarketSDKDatabaseHelper";

    /* renamed from: aY */
    private static C10453r f32506aY = null;

    /* renamed from: aZ */
    static final String f32507aZ = "xiaomi_market_sdk_update.db";

    /* renamed from: ba */
    static final int f32508ba = 1;

    private C10453r(Context context) {
        super(context, f32507aZ, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    private void m5085a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C10447l.f32486aH);
    }

    /* renamed from: j */
    public static C10453r m5083j(Context context) {
        if (f32506aY == null) {
            f32506aY = new C10453r(context);
        }
        return f32506aY;
    }

    /* renamed from: a */
    public long m5086a(ContentValues contentValues) {
        SQLiteStatement compileStatement = getWritableDatabase().compileStatement("INSERT OR REPLACE INTO update_download(package_name,download_id,version_code,apk_url,apk_hash,diff_url,diff_hash,apk_path) VALUES(?,?,?,?,?,?,?,?)");
        compileStatement.bindString(1, contentValues.getAsString(C10447l.PACKAGE_NAME));
        compileStatement.bindLong(2, contentValues.getAsLong(C10447l.f32484aF).longValue());
        compileStatement.bindLong(3, contentValues.getAsInteger(C10447l.f32488aw).intValue());
        compileStatement.bindString(4, contentValues.getAsString(C10447l.f32489ay));
        compileStatement.bindString(5, contentValues.getAsString(C10447l.f32490az));
        compileStatement.bindString(6, contentValues.getAsString(C10447l.f32481aB));
        compileStatement.bindString(7, contentValues.getAsString(C10447l.f32482aC));
        compileStatement.bindString(8, contentValues.getAsString(C10447l.f32485aG));
        compileStatement.execute();
        return 1L;
    }

    /* renamed from: a */
    public synchronized long m5084a(String str, ContentValues contentValues) {
        return getWritableDatabase().insert(str, null, contentValues);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.d(TAG, "create database");
        m5085a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return getReadableDatabase().query(str, strArr, str2, strArr2, str3, str4, str5);
    }
}
