package com.baidu.tts.p101e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.fimi.soul.utils.p219a.C3070c;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.market.sdk.AbstractC10446k;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
/* renamed from: com.baidu.tts.e.c */
/* loaded from: classes.dex */
public class C1163c {

    /* renamed from: e */
    private static C1163c f2769e;

    /* renamed from: a */
    private C1164a f2770a;

    /* renamed from: b */
    private SQLiteDatabase f2771b;

    /* renamed from: c */
    private volatile boolean f2772c = false;

    /* renamed from: d */
    private Context f2773d;

    /* renamed from: com.baidu.tts.e.c$a */
    /* loaded from: classes.dex */
    class C1164a extends SQLiteOpenHelper {
        public C1164a(Context context) {
            super(context, "ttsdata", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("create table result (_id integer primary key autoincrement, time text, code integer, cmd_type integer, cmd_id integer, result text);");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS result");
            onCreate(sQLiteDatabase);
        }
    }

    private C1163c(Context context) {
        this.f2773d = context;
    }

    /* renamed from: a */
    public static C1163c m36350a(Context context) {
        if (f2769e == null) {
            synchronized (C1163c.class) {
                if (f2769e == null) {
                    f2769e = new C1163c(context);
                }
            }
        }
        return f2769e;
    }

    /* renamed from: e */
    public static void m36345e() {
        if (f2769e != null) {
            synchronized (C1163c.class) {
                if (f2769e != null) {
                    f2769e = null;
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void m36352a() {
        if (this.f2770a == null) {
            this.f2770a = new C1164a(this.f2773d);
            this.f2771b = this.f2770a.getWritableDatabase();
        }
    }

    /* renamed from: a */
    public void m36351a(long j, int i, int i2, int i3, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C3070c.C3071a.f11505i, Long.valueOf(j));
        contentValues.put(XiaomiOAuthConstants.EXTRA_CODE_2, Integer.valueOf(i));
        contentValues.put("cmd_type", Integer.valueOf(i2));
        contentValues.put("cmd_id", Integer.valueOf(i3));
        contentValues.put("result", str);
        this.f2771b.insert("result", null, contentValues);
    }

    /* renamed from: a */
    public void m36349a(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str = str + list.get(i) + Constants.ACCEPT_TIME_SEPARATOR_SP;
        }
        if (str.length() <= 0) {
            return;
        }
        this.f2771b.delete("result", "_id in (" + str.substring(0, str.length() - 1) + ")", null);
    }

    /* renamed from: b */
    public Cursor m36348b() {
        if (this.f2771b != null) {
            return this.f2771b.query("result", new String[]{AbstractC10446k._ID, C3070c.C3071a.f11505i, XiaomiOAuthConstants.EXTRA_CODE_2, "cmd_type", "cmd_id", "result"}, null, null, null, null, null);
        }
        return null;
    }

    /* renamed from: c */
    public synchronized void m36347c() {
        if (this.f2773d != null) {
            this.f2770a.close();
            this.f2770a = null;
            this.f2773d = null;
            this.f2772c = true;
        }
    }

    /* renamed from: d */
    public boolean m36346d() {
        return this.f2772c;
    }
}
