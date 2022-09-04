package com.fimi.soul.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.fimi.soul.utils.C3119d;
import com.fimi.soul.utils.C3132p;
import com.fimi.soul.utils.C3155z;
import com.fimi.soul.utils.p219a.C3067a;
import com.fimi.soul.utils.p219a.C3070c;
/* renamed from: com.fimi.soul.utils.k */
/* loaded from: classes.dex */
public class C3127k extends SQLiteOpenHelper {

    /* renamed from: a */
    public static C3127k f11668a = null;

    /* renamed from: b */
    private static final String f11669b = "miplaner";

    /* renamed from: c */
    private static final int f11670c = 15;

    /* renamed from: d */
    private Context f11671d;

    private C3127k(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, f11669b, cursorFactory, 15);
        this.f11671d = context;
    }

    /* renamed from: a */
    public static C3127k m29073a(Context context) {
        if (f11668a == null) {
            f11668a = new C3127k(context, null, null, 0);
        }
        return f11668a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C3115ay.m29144a(sQLiteDatabase);
        sQLiteDatabase.execSQL(C3155z.f11865b);
        sQLiteDatabase.execSQL(C3119d.f11634b);
        sQLiteDatabase.execSQL(C3070c.f11492a);
        sQLiteDatabase.execSQL(C3067a.f11483a);
        sQLiteDatabase.execSQL(C3132p.f11678b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("drop table if exists flyRecord_tb");
                sQLiteDatabase.execSQL(C3155z.f11865b);
                sQLiteDatabase.execSQL(C3119d.f11634b);
            case 2:
                sQLiteDatabase.execSQL("drop table if exists battery_over_dischange_tb");
                sQLiteDatabase.execSQL(C3119d.f11634b);
                sQLiteDatabase.execSQL("drop table if exists flyRecord_tb");
                sQLiteDatabase.execSQL(C3155z.f11865b);
            case 3:
                sQLiteDatabase.execSQL("drop table if exists flyRecord_tb");
                sQLiteDatabase.execSQL(C3155z.f11865b);
            case 4:
                sQLiteDatabase.execSQL("drop table if exists history_push_message");
                sQLiteDatabase.execSQL(C3070c.f11492a);
                sQLiteDatabase.execSQL("drop table if exists " + C3067a.C3068a.f11488a);
                sQLiteDatabase.execSQL(C3067a.f11483a);
            case 5:
                sQLiteDatabase.execSQL("drop table if exists history_push_message");
                sQLiteDatabase.execSQL(C3070c.f11492a);
            case 6:
                sQLiteDatabase.execSQL("drop table if exists history_push_message");
                sQLiteDatabase.execSQL(C3070c.f11492a);
            case 7:
                sQLiteDatabase.execSQL("alter table " + C3119d.C3120a.f11638a + " add " + C3119d.C3120a.f11654q + " varchar(20)");
                sQLiteDatabase.execSQL("alter table " + C3119d.C3120a.f11638a + " add " + C3119d.C3120a.f11656s + " varchar(20)");
                sQLiteDatabase.execSQL("alter table " + C3119d.C3120a.f11638a + " add " + C3119d.C3120a.f11655r + " varchar(20)");
            case 8:
                sQLiteDatabase.execSQL(C3132p.f11678b);
            case 9:
                sQLiteDatabase.execSQL("alter table " + C3155z.C3156a.f11869a + " add " + C3155z.C3156a.f11874f + " varchar(10) ");
            case 10:
                sQLiteDatabase.execSQL("alter table " + C3155z.C3156a.f11869a + " add " + C3155z.C3156a.f11875g + " double");
                sQLiteDatabase.execSQL("alter table " + C3155z.C3156a.f11869a + " add " + C3155z.C3156a.f11876h + " double");
            case 11:
                sQLiteDatabase.execSQL("alter table " + C3132p.C3133a.f11682a + " add " + C3132p.C3133a.f11696o + " double");
                sQLiteDatabase.execSQL("alter table " + C3132p.C3133a.f11682a + " add " + C3132p.C3133a.f11697p + " double");
                sQLiteDatabase.execSQL("alter table " + C3132p.C3133a.f11682a + " add " + C3132p.C3133a.f11698q + " double");
                sQLiteDatabase.execSQL("alter table " + C3132p.C3133a.f11682a + " add " + C3132p.C3133a.f11699r + " double");
                sQLiteDatabase.execSQL("alter table " + C3132p.C3133a.f11682a + " add " + C3132p.C3133a.f11700s + " double");
            case 12:
                sQLiteDatabase.execSQL("alter table " + C3132p.C3133a.f11682a + " add " + C3132p.C3133a.f11701t + " double");
            case 13:
                sQLiteDatabase.execSQL("alter table " + C3132p.C3133a.f11682a + " add " + C3132p.C3133a.f11702u + " varchar(200)");
                break;
            case 14:
                break;
            default:
                return;
        }
        sQLiteDatabase.execSQL("alter table " + C3132p.C3133a.f11682a + " add " + C3132p.C3133a.f11703v + " varchar(10)");
    }
}
