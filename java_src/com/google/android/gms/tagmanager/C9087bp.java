package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import com.google.android.gms.tagmanager.C9136cp;
import com.tencent.p263mm.sdk.platformtools.Util;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.bp */
/* loaded from: classes2.dex */
public class C9087bp implements AbstractC9030ad {

    /* renamed from: a */
    private static final String f28740a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time");

    /* renamed from: b */
    private final C9089b f28741b;

    /* renamed from: c */
    private volatile AbstractC9216k f28742c;

    /* renamed from: d */
    private final AbstractC9031ae f28743d;

    /* renamed from: e */
    private final Context f28744e;

    /* renamed from: f */
    private final String f28745f;

    /* renamed from: g */
    private long f28746g;

    /* renamed from: h */
    private AbstractC4682e f28747h;

    /* renamed from: i */
    private final int f28748i;

    /* renamed from: com.google.android.gms.tagmanager.bp$a */
    /* loaded from: classes2.dex */
    class C9088a implements C9136cp.AbstractC9138a {
        C9088a() {
        }

        @Override // com.google.android.gms.tagmanager.C9136cp.AbstractC9138a
        /* renamed from: a */
        public void mo9157a(C9235z c9235z) {
            C9087bp.this.m9284a(c9235z.m8869a());
        }

        @Override // com.google.android.gms.tagmanager.C9136cp.AbstractC9138a
        /* renamed from: b */
        public void mo9156b(C9235z c9235z) {
            C9087bp.this.m9284a(c9235z.m8869a());
            C9065aw.m9295e(new StringBuilder(57).append("Permanent failure dispatching hitId: ").append(c9235z.m8869a()).toString());
        }

        @Override // com.google.android.gms.tagmanager.C9136cp.AbstractC9138a
        /* renamed from: c */
        public void mo9155c(C9235z c9235z) {
            long m8867b = c9235z.m8867b();
            if (m8867b == 0) {
                C9087bp.this.m9283a(c9235z.m8869a(), C9087bp.this.f28747h.mo16434a());
            } else if (m8867b + 14400000 >= C9087bp.this.f28747h.mo16434a()) {
            } else {
                C9087bp.this.m9284a(c9235z.m8869a());
                C9065aw.m9295e(new StringBuilder(47).append("Giving up on failed hitId: ").append(c9235z.m8869a()).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.bp$b */
    /* loaded from: classes2.dex */
    public class C9089b extends SQLiteOpenHelper {

        /* renamed from: b */
        private boolean f28751b;

        /* renamed from: c */
        private long f28752c = 0;

        C9089b(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* renamed from: a */
        private void m9267a(SQLiteDatabase sQLiteDatabase) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM gtm_hits WHERE 0", null);
            HashSet hashSet = new HashSet();
            try {
                for (String str : rawQuery.getColumnNames()) {
                    hashSet.add(str);
                }
                rawQuery.close();
                if (!hashSet.remove("hit_id") || !hashSet.remove("hit_url") || !hashSet.remove("hit_time") || !hashSet.remove("hit_first_send_time")) {
                    throw new SQLiteException("Database column missing");
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                throw new SQLiteException("Database has extra columns");
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean m9266a(String str, SQLiteDatabase sQLiteDatabase) {
            Cursor cursor;
            Cursor query;
            Cursor cursor2 = null;
            try {
                query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            } catch (SQLiteException e) {
                cursor = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                boolean moveToFirst = query.moveToFirst();
                if (query == null) {
                    return moveToFirst;
                }
                query.close();
                return moveToFirst;
            } catch (SQLiteException e2) {
                cursor = query;
                try {
                    String valueOf = String.valueOf(str);
                    C9065aw.m9299b(valueOf.length() != 0 ? "Error querying for table ".concat(valueOf) : new String("Error querying for table "));
                    if (cursor != null) {
                        cursor.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    cursor2 = cursor;
                    th = th2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = query;
                if (cursor2 != null) {
                }
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            if (!this.f28751b || this.f28752c + Util.MILLSECONDS_OF_HOUR <= C9087bp.this.f28747h.mo16434a()) {
                SQLiteDatabase sQLiteDatabase = null;
                this.f28751b = true;
                this.f28752c = C9087bp.this.f28747h.mo16434a();
                try {
                    sQLiteDatabase = super.getWritableDatabase();
                } catch (SQLiteException e) {
                    C9087bp.this.f28744e.getDatabasePath(C9087bp.this.f28745f).delete();
                }
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = super.getWritableDatabase();
                }
                this.f28751b = false;
                return sQLiteDatabase;
            }
            throw new SQLiteException("Database creation failed");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C9230u.m8874a(sQLiteDatabase.getPath());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (Build.VERSION.SDK_INT < 15) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
                try {
                    rawQuery.moveToFirst();
                } finally {
                    rawQuery.close();
                }
            }
            if (!m9266a("gtm_hits", sQLiteDatabase)) {
                sQLiteDatabase.execSQL(C9087bp.f28740a);
            } else {
                m9267a(sQLiteDatabase);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9087bp(AbstractC9031ae abstractC9031ae, Context context) {
        this(abstractC9031ae, context, "gtm_urls.db", 2000);
    }

    C9087bp(AbstractC9031ae abstractC9031ae, Context context, String str, int i) {
        this.f28744e = context.getApplicationContext();
        this.f28745f = str;
        this.f28743d = abstractC9031ae;
        this.f28747h = C4685h.m23138d();
        this.f28741b = new C9089b(this.f28744e, this.f28745f);
        this.f28742c = new C9136cp(this.f28744e, new C9088a());
        this.f28746g = 0L;
        this.f28748i = i;
    }

    /* renamed from: a */
    private SQLiteDatabase m9278a(String str) {
        try {
            return this.f28741b.getWritableDatabase();
        } catch (SQLiteException e) {
            C9065aw.m9299b(str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m9284a(long j) {
        m9277a(new String[]{String.valueOf(j)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m9283a(long j, long j2) {
        SQLiteDatabase m9278a = m9278a("Error opening database for getNumStoredHits.");
        if (m9278a == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_first_send_time", Long.valueOf(j2));
        try {
            m9278a.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
        } catch (SQLiteException e) {
            C9065aw.m9299b(new StringBuilder(69).append("Error setting HIT_FIRST_DISPATCH_TIME for hitId: ").append(j).toString());
            m9284a(j);
        }
    }

    /* renamed from: b */
    private void m9274b(long j, String str) {
        SQLiteDatabase m9278a = m9278a("Error opening database for putHit");
        if (m9278a == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_time", Long.valueOf(j));
        contentValues.put("hit_url", str);
        contentValues.put("hit_first_send_time", (Integer) 0);
        try {
            m9278a.insert("gtm_hits", null, contentValues);
            this.f28743d.mo9167a(false);
        } catch (SQLiteException e) {
            C9065aw.m9299b("Error storing hit");
        }
    }

    /* renamed from: f */
    private void m9268f() {
        int m9272c = (m9272c() - this.f28748i) + 1;
        if (m9272c > 0) {
            List<String> m9285a = m9285a(m9272c);
            C9065aw.m9295e(new StringBuilder(51).append("Store full, deleting ").append(m9285a.size()).append(" hits to make room.").toString());
            m9277a((String[]) m9285a.toArray(new String[0]));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    List<String> m9285a(int i) {
        Cursor cursor;
        Cursor cursor2 = null;
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            C9065aw.m9299b("Invalid maxHits specified. Skipping");
            return arrayList;
        }
        SQLiteDatabase m9278a = m9278a("Error opening database for peekHitIds.");
        try {
            if (m9278a == null) {
                return arrayList;
            }
            try {
                cursor = m9278a.query("gtm_hits", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(i));
                try {
                } catch (SQLiteException e) {
                    e = e;
                    String valueOf = String.valueOf(e.getMessage());
                    C9065aw.m9299b(valueOf.length() != 0 ? "Error in peekHits fetching hitIds: ".concat(valueOf) : new String("Error in peekHits fetching hitIds: "));
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor2.close();
                }
                throw th;
            }
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                }
                return arrayList;
            }
            do {
                arrayList.add(String.valueOf(cursor.getLong(0)));
            } while (cursor.moveToNext());
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9030ad
    /* renamed from: a */
    public void mo9286a() {
        C9065aw.m9295e("GTM Dispatch running...");
        if (!this.f28742c.mo8911a()) {
            return;
        }
        List<C9235z> m9275b = m9275b(40);
        if (m9275b.isEmpty()) {
            C9065aw.m9295e("...nothing to dispatch");
            this.f28743d.mo9167a(true);
            return;
        }
        this.f28742c.mo8910a(m9275b);
        if (m9270d() <= 0) {
            return;
        }
        C9127cm.m9177c().mo9184a();
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9030ad
    /* renamed from: a */
    public void mo9282a(long j, String str) {
        m9276b();
        m9268f();
        m9274b(j, str);
    }

    /* renamed from: a */
    void m9277a(String[] strArr) {
        SQLiteDatabase m9278a;
        boolean z = true;
        if (strArr == null || strArr.length == 0 || (m9278a = m9278a("Error opening database for deleteHits.")) == null) {
            return;
        }
        try {
            m9278a.delete("gtm_hits", String.format("HIT_ID in (%s)", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, Collections.nCopies(strArr.length, C0363a.f360a))), strArr);
            AbstractC9031ae abstractC9031ae = this.f28743d;
            if (m9272c() != 0) {
                z = false;
            }
            abstractC9031ae.mo9167a(z);
        } catch (SQLiteException e) {
            C9065aw.m9299b("Error deleting hits");
        }
    }

    /* renamed from: b */
    int m9276b() {
        boolean z = true;
        long mo16434a = this.f28747h.mo16434a();
        if (mo16434a <= this.f28746g + 86400000) {
            return 0;
        }
        this.f28746g = mo16434a;
        SQLiteDatabase m9278a = m9278a("Error opening database for deleteStaleHits.");
        if (m9278a == null) {
            return 0;
        }
        int delete = m9278a.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.f28747h.mo16434a() - 2592000000L)});
        AbstractC9031ae abstractC9031ae = this.f28743d;
        if (m9272c() != 0) {
            z = false;
        }
        abstractC9031ae.mo9167a(z);
        return delete;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<C9235z> m9275b(int i) {
        SQLiteException sQLiteException;
        Cursor cursor;
        ArrayList arrayList;
        ArrayList<C9235z> arrayList2;
        Cursor query;
        ArrayList arrayList3 = new ArrayList();
        SQLiteDatabase m9278a = m9278a("Error opening database for peekHits");
        if (m9278a == null) {
            return arrayList3;
        }
        Cursor cursor2 = null;
        try {
            Cursor query2 = m9278a.query("gtm_hits", new String[]{"hit_id", "hit_time", "hit_first_send_time"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(i));
            try {
                try {
                    arrayList2 = new ArrayList();
                } catch (SQLiteException e) {
                    sQLiteException = e;
                    cursor = query2;
                    arrayList = arrayList3;
                }
                try {
                    if (!query2.moveToFirst()) {
                        if (query2 != null) {
                        }
                        query = m9278a.query("gtm_hits", new String[]{"hit_id", "hit_url"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(i));
                        if (query.moveToFirst()) {
                        }
                        if (query != null) {
                        }
                        return arrayList2;
                    }
                    do {
                        arrayList2.add(new C9235z(query2.getLong(0), query2.getLong(1), query2.getLong(2)));
                    } while (query2.moveToNext());
                    if (query2 != null) {
                        query2.close();
                    }
                    try {
                        try {
                            query = m9278a.query("gtm_hits", new String[]{"hit_id", "hit_url"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(i));
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                    }
                    try {
                        if (query.moveToFirst()) {
                            int i2 = 0;
                            while (true) {
                                if (((SQLiteCursor) query).getWindow().getNumRows() > 0) {
                                    ((C9235z) arrayList2.get(i2)).m8868a(query.getString(1));
                                } else {
                                    C9065aw.m9299b(String.format("HitString for hitId %d too large.  Hit will be deleted.", Long.valueOf(((C9235z) arrayList2.get(i2)).m8869a())));
                                }
                                int i3 = i2 + 1;
                                if (!query.moveToNext()) {
                                    break;
                                }
                                i2 = i3;
                            }
                        }
                        if (query != null) {
                            query.close();
                        }
                        return arrayList2;
                    } catch (SQLiteException e3) {
                        e = e3;
                        query2 = query;
                        String valueOf = String.valueOf(e.getMessage());
                        C9065aw.m9299b(valueOf.length() != 0 ? "Error in peekHits fetching hit url: ".concat(valueOf) : new String("Error in peekHits fetching hit url: "));
                        ArrayList arrayList4 = new ArrayList();
                        boolean z = false;
                        for (C9235z c9235z : arrayList2) {
                            if (TextUtils.isEmpty(c9235z.m8866c())) {
                                if (z) {
                                    break;
                                }
                                z = true;
                            }
                            arrayList4.add(c9235z);
                        }
                        if (query2 != null) {
                            query2.close();
                        }
                        return arrayList4;
                    } catch (Throwable th2) {
                        th = th2;
                        query2 = query;
                        if (query2 != null) {
                            query2.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e4) {
                    sQLiteException = e4;
                    cursor = query2;
                    arrayList = arrayList2;
                    try {
                        String valueOf2 = String.valueOf(sQLiteException.getMessage());
                        C9065aw.m9299b(valueOf2.length() != 0 ? "Error in peekHits fetching hitIds: ".concat(valueOf2) : new String("Error in peekHits fetching hitIds: "));
                        if (cursor == null) {
                            return arrayList;
                        }
                        cursor.close();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = query2;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            sQLiteException = e5;
            cursor = null;
            arrayList = arrayList3;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* renamed from: c */
    int m9272c() {
        Cursor cursor = null;
        int i = 0;
        SQLiteDatabase m9278a = m9278a("Error opening database for getNumStoredHits.");
        try {
            if (m9278a != null) {
                try {
                    cursor = m9278a.rawQuery("SELECT COUNT(*) from gtm_hits", null);
                    if (cursor.moveToFirst()) {
                        i = (int) cursor.getLong(0);
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteException e) {
                    C9065aw.m9299b("Error getting numStoredHits");
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
            return i;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    int m9270d() {
        Cursor cursor;
        int i;
        Cursor cursor2 = null;
        SQLiteDatabase m9278a = m9278a("Error opening database for getNumStoredHits.");
        if (m9278a == null) {
            return 0;
        }
        try {
            Cursor query = m9278a.query("gtm_hits", new String[]{"hit_id", "hit_first_send_time"}, "hit_first_send_time=0", null, null, null, null);
            try {
                i = query.getCount();
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e) {
                cursor = query;
                try {
                    C9065aw.m9299b("Error getting num untried hits");
                    if (cursor != null) {
                        cursor.close();
                        i = 0;
                    } else {
                        i = 0;
                    }
                    return i;
                } catch (Throwable th) {
                    cursor2 = cursor;
                    th = th;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = query;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
        return i;
    }
}
