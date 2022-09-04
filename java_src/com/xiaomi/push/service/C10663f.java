package com.xiaomi.push.service;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.tauth.AuthActivity;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.market.sdk.C10447l;
import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.xiaomi.push.service.f */
/* loaded from: classes2.dex */
public class C10663f extends SQLiteOpenHelper {

    /* renamed from: c */
    private static final String[] f33130c = {"name", "TEXT NOT NULL", "appId", "INTEGER NOT NULL", C10447l.PACKAGE_NAME, "TEXT NOT NULL", "create_time", "INTEGER NOT NULL", "type", "TEXT NOT NULL", "center_longtitude", "TEXT", "center_lantitude", "TEXT", "circle_radius", "REAL", "polygon_point", "TEXT", "coordinate_provider", "TEXT NOT NULL", "current_status", "TEXT NOT NULL"};

    /* renamed from: d */
    private static final String[] f33131d = {"message_id", "TEXT NOT NULL", "geo_id", "TEXT NOT NULL", "content", "BLOB NOT NULL", AuthActivity.ACTION_KEY, "INTEGER NOT NULL", "deadline", "INTEGER NOT NULL"};

    /* renamed from: b */
    private final String f33133b = "GeoFenceDatabaseHelper.";

    /* renamed from: a */
    public final Object f33132a = new Object();

    public C10663f(Context context) {
        super(context, "geofencing.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    private void m4260a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder("CREATE TABLE geofence(id TEXT PRIMARY KEY ,");
            for (int i = 0; i < f33130c.length - 1; i += 2) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(f33130c[i]).append(" ").append(f33130c[i + 1]);
            }
            sb.append(");");
            sQLiteDatabase.execSQL(sb.toString());
        } catch (SQLException e) {
            AbstractC10404b.m5264d(e.toString());
        }
    }

    /* renamed from: b */
    private void m4259b(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder("CREATE TABLE geoMessage(");
            for (int i = 0; i < f33131d.length - 1; i += 2) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(f33131d[i]).append(" ").append(f33130c[i + 1]);
            }
            sb.append(",PRIMARY KEY(message_id,geo_id));");
            sQLiteDatabase.execSQL(sb.toString());
        } catch (SQLException e) {
            AbstractC10404b.m5264d(e.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (this.f33132a) {
            try {
                m4260a(sQLiteDatabase);
                m4259b(sQLiteDatabase);
                AbstractC10404b.m5265c("GeoFenceDatabaseHelper. create tables");
            } catch (SQLException e) {
                AbstractC10404b.m5267a(e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
