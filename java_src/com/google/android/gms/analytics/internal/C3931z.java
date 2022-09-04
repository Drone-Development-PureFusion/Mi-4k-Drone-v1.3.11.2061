package com.google.android.gms.analytics.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4691n;
import com.tencent.p263mm.sdk.platformtools.Util;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.analytics.internal.z */
/* loaded from: classes2.dex */
public class C3931z extends AbstractC3920t implements Closeable {

    /* renamed from: a */
    private static final String f15192a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");

    /* renamed from: b */
    private static final String f15193b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");

    /* renamed from: c */
    private final C3932a f15194c;

    /* renamed from: d */
    private final C3905m f15195d = new C3905m(n());

    /* renamed from: e */
    private final C3905m f15196e = new C3905m(n());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.analytics.internal.z$a */
    /* loaded from: classes2.dex */
    public class C3932a extends SQLiteOpenHelper {
        C3932a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* renamed from: a */
        private void m26019a(SQLiteDatabase sQLiteDatabase) {
            boolean z = true;
            Set<String> m26016b = m26016b(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (!m26016b.remove(str)) {
                    String valueOf = String.valueOf(str);
                    throw new SQLiteException(valueOf.length() != 0 ? "Database hits2 is missing required column: ".concat(valueOf) : new String("Database hits2 is missing required column: "));
                }
            }
            if (m26016b.remove("hit_app_id")) {
                z = false;
            }
            if (!m26016b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            }
            if (!z) {
                return;
            }
            sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean m26018a(SQLiteDatabase sQLiteDatabase, String str) {
            Cursor cursor;
            Cursor cursor2 = null;
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    try {
                        boolean moveToFirst = cursor.moveToFirst();
                        if (cursor == null) {
                            return moveToFirst;
                        }
                        cursor.close();
                        return moveToFirst;
                    } catch (SQLiteException e) {
                        e = e;
                        C3931z.this.c("Error querying for table", str, e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                }
                throw th;
            }
        }

        /* renamed from: b */
        private Set<String> m26016b(SQLiteDatabase sQLiteDatabase, String str) {
            HashSet hashSet = new HashSet();
            Cursor rawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" LIMIT 0").toString(), null);
            try {
                for (String str2 : rawQuery.getColumnNames()) {
                    hashSet.add(str2);
                }
                return hashSet;
            } finally {
                rawQuery.close();
            }
        }

        /* renamed from: b */
        private void m26017b(SQLiteDatabase sQLiteDatabase) {
            Set<String> m26016b = m26016b(sQLiteDatabase, "properties");
            String[] strArr = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
            for (int i = 0; i < 6; i++) {
                String str = strArr[i];
                if (!m26016b.remove(str)) {
                    String valueOf = String.valueOf(str);
                    throw new SQLiteException(valueOf.length() != 0 ? "Database properties is missing required column: ".concat(valueOf) : new String("Database properties is missing required column: "));
                }
            }
            if (!m26016b.isEmpty()) {
                throw new SQLiteException("Database properties table has extra columns");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            if (!C3931z.this.f15196e.m26221a(Util.MILLSECONDS_OF_HOUR)) {
                throw new SQLiteException("Database open failed");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e) {
                C3931z.this.f15196e.m26222a();
                C3931z.this.u("Opening the database failed, dropping the table and recreating it");
                C3931z.this.o().getDatabasePath(C3931z.this.m26048I()).delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    C3931z.this.f15196e.m26220b();
                    return writableDatabase;
                } catch (SQLiteException e2) {
                    C3931z.this.e("Failed to open freshly created database", e2);
                    throw e2;
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            C3881an.m26340a(sQLiteDatabase.getPath());
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
            if (!m26018a(sQLiteDatabase, "hits2")) {
                sQLiteDatabase.execSQL(C3931z.f15192a);
            } else {
                m26019a(sQLiteDatabase);
            }
            if (!m26018a(sQLiteDatabase, "properties")) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            } else {
                m26017b(sQLiteDatabase);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3931z(C3922v c3922v) {
        super(c3922v);
        this.f15194c = new C3932a(c3922v.m26112b(), m26048I());
    }

    /* renamed from: H */
    private void m26049H() {
        int m26359y = q().m26359y();
        long m26023g = m26023g();
        if (m26023g > m26359y - 1) {
            List<Long> m26046a = m26046a((m26023g - m26359y) + 1);
            d("Store full, deleting hits to make room, count", Integer.valueOf(m26046a.size()));
            m26037a(m26046a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public String m26048I() {
        if (q().m26383a() && !q().m26382b()) {
            return q().m26389B();
        }
        return q().m26390A();
    }

    /* renamed from: a */
    private long m26039a(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = m26051F().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                return cursor.getLong(0);
            } catch (SQLiteException e) {
                d("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: a */
    private long m26038a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = m26051F().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                } else if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                d("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: a */
    private static String m26036a(Map<String, String> map) {
        C4588d.m23627a(map);
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String encodedQuery = builder.build().getEncodedQuery();
        return encodedQuery == null ? "" : encodedQuery;
    }

    /* renamed from: b */
    private String m26033b(C3887c c3887c) {
        return c3887c.m26306f() ? q().m26369o() : q().m26368p();
    }

    /* renamed from: c */
    private static String m26028c(C3887c c3887c) {
        C4588d.m23627a(c3887c);
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry<String, String> entry : c3887c.m26311b().entrySet()) {
            String key = entry.getKey();
            if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key)) {
                builder.appendQueryParameter(key, entry.getValue());
            }
        }
        String encodedQuery = builder.build().getEncodedQuery();
        return encodedQuery == null ? "" : encodedQuery;
    }

    /* renamed from: F */
    SQLiteDatabase m26051F() {
        try {
            return this.f15194c.getWritableDatabase();
        } catch (SQLiteException e) {
            d("Error opening database", e);
            throw e;
        }
    }

    /* renamed from: a */
    public long m26044a(long j, String str, String str2) {
        C4588d.m23625a(str);
        C4588d.m23625a(str2);
        D();
        m();
        return m26038a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{String.valueOf(j), str, str2}, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0073: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:26:0x0073 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<Long> m26046a(long j) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3 = null;
        m();
        D();
        if (j <= 0) {
            return Collections.emptyList();
        }
        SQLiteDatabase m26051F = m26051F();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                cursor = m26051F.query("hits2", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
                try {
                } catch (SQLiteException e) {
                    e = e;
                    d("Error selecting hit ids", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
            }
            return arrayList;
        }
        do {
            arrayList.add(Long.valueOf(cursor.getLong(0)));
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    /* renamed from: a */
    Map<String, String> m26040a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith(C0363a.f360a)) {
                String valueOf = String.valueOf(str);
                str = valueOf.length() != 0 ? C0363a.f360a.concat(valueOf) : new String(C0363a.f360a);
            }
            return C4691n.m23126a(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            e("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    @Override // com.google.android.gms.analytics.internal.AbstractC3920t
    /* renamed from: a */
    protected void mo26047a() {
    }

    /* renamed from: a */
    public void m26045a(long j, String str) {
        C4588d.m23625a(str);
        D();
        m();
        int delete = m26051F().delete("properties", "app_uid=? AND cid<>?", new String[]{String.valueOf(j), str});
        if (delete > 0) {
            a("Deleted property records", Integer.valueOf(delete));
        }
    }

    /* renamed from: a */
    public void m26043a(C3887c c3887c) {
        C4588d.m23627a(c3887c);
        m();
        D();
        String m26028c = m26028c(c3887c);
        if (m26028c.length() > 8192) {
            p().m26290a(c3887c, "Hit length exceeds the maximum allowed size");
            return;
        }
        m26049H();
        SQLiteDatabase m26051F = m26051F();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_string", m26028c);
        contentValues.put("hit_time", Long.valueOf(c3887c.m26308d()));
        contentValues.put("hit_app_id", Integer.valueOf(c3887c.m26317a()));
        contentValues.put("hit_url", m26033b(c3887c));
        try {
            long insert = m26051F.insert("hits2", null, contentValues);
            if (insert == -1) {
                u("Failed to insert a hit (got -1)");
            } else {
                b("Hit saved to database. db-id, hit", Long.valueOf(insert), c3887c);
            }
        } catch (SQLiteException e) {
            e("Error storing a hit", e);
        }
    }

    /* renamed from: a */
    public void m26042a(C3925x c3925x) {
        C4588d.m23627a(c3925x);
        D();
        m();
        SQLiteDatabase m26051F = m26051F();
        String m26036a = m26036a(c3925x.m26068f());
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_uid", Long.valueOf(c3925x.m26074a()));
        contentValues.put("cid", c3925x.m26072b());
        contentValues.put("tid", c3925x.m26071c());
        contentValues.put("adid", Integer.valueOf(c3925x.m26070d() ? 1 : 0));
        contentValues.put("hits_count", Long.valueOf(c3925x.m26069e()));
        contentValues.put("params", m26036a);
        try {
            if (m26051F.insertWithOnConflict("properties", null, contentValues, 5) != -1) {
                return;
            }
            u("Failed to insert/update a property (got -1)");
        } catch (SQLiteException e) {
            e("Error storing a property", e);
        }
    }

    /* renamed from: a */
    public void m26037a(List<Long> list) {
        C4588d.m23627a(list);
        m();
        D();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("hit_id");
        sb.append(" in (");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                sb.append(")");
                String sb2 = sb.toString();
                try {
                    SQLiteDatabase m26051F = m26051F();
                    a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                    int delete = m26051F.delete("hits2", sb2, null);
                    if (delete == list.size()) {
                        return;
                    }
                    b("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
                    return;
                } catch (SQLiteException e) {
                    e("Error deleting hits", e);
                    throw e;
                }
            }
            Long l = list.get(i2);
            if (l == null || l.longValue() == 0) {
                break;
            }
            if (i2 > 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(l);
            i = i2 + 1;
        }
        throw new SQLiteException("Invalid hit id");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<C3887c> m26034b(long j) {
        Cursor cursor;
        boolean z = true;
        Cursor cursor2 = null;
        if (j < 0) {
            z = false;
        }
        C4588d.m23619b(z);
        m();
        D();
        try {
            try {
                Cursor query = m26051F().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
                try {
                    ArrayList arrayList = new ArrayList();
                    if (!query.moveToFirst()) {
                        if (query != null) {
                        }
                        return arrayList;
                    }
                    do {
                        arrayList.add(new C3887c(this, m26040a(query.getString(2)), query.getLong(1), C3909p.m26183f(query.getString(3)), query.getLong(0), query.getInt(4)));
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                } catch (SQLiteException e) {
                    e = e;
                    cursor = query;
                    try {
                        e("Error loading hits from the database", e);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        }
    }

    /* renamed from: b */
    Map<String, String> m26031b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            String valueOf = String.valueOf(str);
            return C4691n.m23126a(new URI(valueOf.length() != 0 ? C0363a.f360a.concat(valueOf) : new String(C0363a.f360a)), "UTF-8");
        } catch (URISyntaxException e) {
            e("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    /* renamed from: b */
    public void m26035b() {
        D();
        m26051F().beginTransaction();
    }

    /* renamed from: c */
    public void m26030c() {
        D();
        m26051F().setTransactionSuccessful();
    }

    /* renamed from: c */
    public void m26029c(long j) {
        m();
        D();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        a("Deleting hit, id", Long.valueOf(j));
        m26037a((List<Long>) arrayList);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f15194c.close();
        } catch (SQLiteException e) {
            e("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            e("Error closing database", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[Catch: SQLiteException -> 0x00a8, all -> 0x00b8, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x00a8, blocks: (B:5:0x0048, B:7:0x0053, B:10:0x0065, B:12:0x007a, B:14:0x009e, B:15:0x0085, B:18:0x0080, B:20:0x008b, B:22:0x0091), top: B:4:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<C3925x> m26026d(long j) {
        Cursor cursor;
        D();
        m();
        SQLiteDatabase m26051F = m26051F();
        Cursor cursor2 = null;
        try {
            try {
                int m26358z = q().m26358z();
                Cursor query = m26051F.query("properties", new String[]{"cid", "tid", "adid", "hits_count", "params"}, "app_uid=?", new String[]{String.valueOf(j)}, null, null, null, String.valueOf(m26358z));
                try {
                    ArrayList arrayList = new ArrayList();
                    if (!query.moveToFirst()) {
                        if (arrayList.size() >= m26358z) {
                        }
                        if (query != null) {
                        }
                        return arrayList;
                    }
                    do {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        boolean z = query.getInt(2) != 0;
                        long j2 = query.getInt(3);
                        Map<String, String> m26031b = m26031b(query.getString(4));
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            c("Read property with empty client id or tracker id", string, string2);
                        } else {
                            arrayList.add(new C3925x(j, string, string2, z, j2, m26031b));
                        }
                    } while (query.moveToNext());
                    if (arrayList.size() >= m26358z) {
                        t("Sending hits to too many properties. Campaign report might be incorrect");
                    }
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                } catch (SQLiteException e) {
                    e = e;
                    cursor = query;
                    try {
                        e("Error loading hits from the database", e);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = null;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* renamed from: d */
    public void m26027d() {
        D();
        m26051F().endTransaction();
    }

    /* renamed from: e */
    public void m26025e() {
        m();
        D();
        m26051F().delete("hits2", null, null);
    }

    /* renamed from: f */
    public void m26024f() {
        m();
        D();
        m26051F().delete("properties", null, null);
    }

    /* renamed from: g */
    public long m26023g() {
        m();
        D();
        return m26039a("SELECT COUNT(*) FROM hits2", (String[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m26022h() {
        return m26023g() == 0;
    }

    /* renamed from: i */
    public int m26021i() {
        m();
        D();
        if (!this.f15195d.m26221a(86400000L)) {
            return 0;
        }
        this.f15195d.m26222a();
        q("Deleting stale hits (if any)");
        int delete = m26051F().delete("hits2", "hit_time < ?", new String[]{Long.toString(n().mo16434a() - 2592000000L)});
        a("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    /* renamed from: j */
    public long m26020j() {
        m();
        D();
        return m26038a(f15193b, (String[]) null, 0L);
    }
}
