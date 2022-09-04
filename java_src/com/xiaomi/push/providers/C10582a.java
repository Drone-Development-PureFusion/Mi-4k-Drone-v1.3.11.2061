package com.xiaomi.push.providers;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.market.sdk.C10447l;
import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.xiaomi.push.providers.a */
/* loaded from: classes2.dex */
public class C10582a extends SQLiteOpenHelper {

    /* renamed from: b */
    private static int f32921b = 1;

    /* renamed from: a */
    public static final Object f32920a = new Object();

    /* renamed from: c */
    private static final String[] f32922c = {C10447l.PACKAGE_NAME, "TEXT", "message_ts", " LONG DEFAULT 0 ", "bytes", " LONG DEFAULT 0 ", "network_type", " INT DEFAULT -1 ", "rcv", " INT DEFAULT -1 ", "imsi", "TEXT"};

    public C10582a(Context context) {
        super(context, "traffic.db", (SQLiteDatabase.CursorFactory) null, f32921b);
    }

    /* renamed from: a */
    private void m4509a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("CREATE TABLE traffic(_id INTEGER  PRIMARY KEY ,");
        for (int i = 0; i < f32922c.length - 1; i += 2) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(f32922c[i]).append(" ").append(f32922c[i + 1]);
        }
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f32920a) {
            try {
                m4509a(sQLiteDatabase);
            } catch (SQLException e) {
                AbstractC10404b.m5267a(e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
