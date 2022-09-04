package com.google.android.gms.ads.internal.purchase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
@aaa
/* renamed from: com.google.android.gms.ads.internal.purchase.h */
/* loaded from: classes.dex */
public class C3691h {

    /* renamed from: a */
    private static final String f14442a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", "InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time");

    /* renamed from: c */
    private static final Object f14443c = new Object();

    /* renamed from: d */
    private static C3691h f14444d;

    /* renamed from: b */
    private final C3692a f14445b;

    /* renamed from: com.google.android.gms.ads.internal.purchase.h$a */
    /* loaded from: classes2.dex */
    public class C3692a extends SQLiteOpenHelper {
        public C3692a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 4);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(C3691h.f14442a);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            abr.c(new StringBuilder(64).append("Database updated from version ").append(i).append(" to version ").append(i2).toString());
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
            onCreate(sQLiteDatabase);
        }
    }

    C3691h(Context context) {
        this.f14445b = new C3692a(context, "google_inapp_purchase.db");
    }

    /* renamed from: a */
    public static C3691h m27090a(Context context) {
        C3691h c3691h;
        synchronized (f14443c) {
            if (f14444d == null) {
                f14444d = new C3691h(context);
            }
            c3691h = f14444d;
        }
        return c3691h;
    }

    /* renamed from: a */
    public SQLiteDatabase m27092a() {
        try {
            return this.f14445b.getWritableDatabase();
        } catch (SQLiteException e) {
            abr.d("Error opening writable conversion tracking database");
            return null;
        }
    }

    /* renamed from: a */
    public C3689f m27089a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new C3689f(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041 A[Catch: all -> 0x0066, TRY_ENTER, TryCatch #3 {, blocks: (B:4:0x0004, B:6:0x000f, B:10:0x0012, B:12:0x0018, B:25:0x0041, B:26:0x0044, B:40:0x0072, B:41:0x0075, B:35:0x0062), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072 A[Catch: all -> 0x0066, TRY_ENTER, TryCatch #3 {, blocks: (B:4:0x0004, B:6:0x000f, B:10:0x0012, B:12:0x0018, B:25:0x0041, B:26:0x0044, B:40:0x0072, B:41:0x0075, B:35:0x0062), top: B:3:0x0004 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<C3689f> m27091a(long j) {
        Cursor cursor;
        synchronized (f14443c) {
            LinkedList linkedList = new LinkedList();
            if (j <= 0) {
                return linkedList;
            }
            SQLiteDatabase m27092a = m27092a();
            if (m27092a == null) {
                return linkedList;
            }
            try {
                cursor = m27092a.query("InAppPurchase", null, null, null, null, null, "record_time ASC", String.valueOf(j));
                try {
                    try {
                    } catch (SQLiteException e) {
                        e = e;
                        String valueOf = String.valueOf(e.getMessage());
                        abr.d(valueOf.length() != 0 ? "Error extracing purchase info: ".concat(valueOf) : new String("Error extracing purchase info: "));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return linkedList;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                }
                return linkedList;
            }
            do {
                linkedList.add(m27089a(cursor));
            } while (cursor.moveToNext());
            if (cursor != null) {
                cursor.close();
            }
            return linkedList;
        }
    }

    /* renamed from: a */
    public void m27088a(C3689f c3689f) {
        if (c3689f == null) {
            return;
        }
        synchronized (f14443c) {
            SQLiteDatabase m27092a = m27092a();
            if (m27092a != null) {
                m27092a.delete("InAppPurchase", String.format(Locale.US, "%s = %d", "purchase_id", Long.valueOf(c3689f.f14432a)), null);
            }
        }
    }

    /* renamed from: b */
    public int m27087b() {
        Cursor cursor = null;
        int i = 0;
        synchronized (f14443c) {
            SQLiteDatabase m27092a = m27092a();
            if (m27092a != null) {
                try {
                    cursor = m27092a.rawQuery("select count(*) from InAppPurchase", null);
                } catch (SQLiteException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    abr.d(valueOf.length() != 0 ? "Error getting record count".concat(valueOf) : new String("Error getting record count"));
                    if (cursor != null) {
                        cursor.close();
                    }
                }
                if (cursor.moveToFirst()) {
                    i = cursor.getInt(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                } else if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public void m27086b(C3689f c3689f) {
        if (c3689f == null) {
            return;
        }
        synchronized (f14443c) {
            SQLiteDatabase m27092a = m27092a();
            if (m27092a == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("product_id", c3689f.f14434c);
            contentValues.put("developer_payload", c3689f.f14433b);
            contentValues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
            c3689f.f14432a = m27092a.insert("InAppPurchase", null, contentValues);
            if (m27087b() > 20000) {
                m27085c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005c A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0004, B:6:0x000a, B:13:0x002c, B:14:0x002f, B:33:0x005c, B:34:0x005f, B:28:0x004f), top: B:3:0x0004 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m27085c() {
        Cursor cursor;
        synchronized (f14443c) {
            SQLiteDatabase m27092a = m27092a();
            if (m27092a == null) {
                return;
            }
            try {
                cursor = m27092a.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
                if (cursor != null) {
                    try {
                        try {
                            if (cursor.moveToFirst()) {
                                m27088a(m27089a(cursor));
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            String valueOf = String.valueOf(e.getMessage());
                            abr.d(valueOf.length() != 0 ? "Error remove oldest record".concat(valueOf) : new String("Error remove oldest record"));
                            if (cursor != null) {
                                cursor.close();
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        }
    }
}
