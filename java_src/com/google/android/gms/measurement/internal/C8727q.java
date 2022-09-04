package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.support.annotation.WorkerThread;
import android.support.p001v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7639qv;
import com.google.android.gms.internal.C7640qw;
import com.google.android.gms.internal.amu;
import com.google.android.gms.internal.amw;
import com.tencent.p263mm.sdk.storage.MAutoDBItem;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000a.C0017k;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q */
/* loaded from: classes2.dex */
public class C8727q extends AbstractC8683b {

    /* renamed from: a */
    private static final Map<String, String> f27916a = new ArrayMap(17);

    /* renamed from: b */
    private static final Map<String, String> f27917b = new ArrayMap(1);

    /* renamed from: c */
    private static final Map<String, String> f27918c = new ArrayMap(1);

    /* renamed from: e */
    private final C8718i f27920e = new C8718i(p());

    /* renamed from: d */
    private final C8730c f27919d = new C8730c(q(), m10426B());

    /* renamed from: com.google.android.gms.measurement.internal.q$a */
    /* loaded from: classes2.dex */
    public static class C8728a {

        /* renamed from: a */
        long f27921a;

        /* renamed from: b */
        long f27922b;

        /* renamed from: c */
        long f27923c;

        /* renamed from: d */
        long f27924d;

        /* renamed from: e */
        long f27925e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.measurement.internal.q$b */
    /* loaded from: classes2.dex */
    public interface AbstractC8729b {
        /* renamed from: a */
        void mo10366a(amw.C6593e c6593e);

        /* renamed from: a */
        boolean mo10367a(long j, amw.C6590b c6590b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.measurement.internal.q$c */
    /* loaded from: classes2.dex */
    public class C8730c extends SQLiteOpenHelper {
        C8730c(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @WorkerThread
        /* renamed from: a */
        private void m10364a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, Map<String, String> map) {
            if (!m10365a(sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                m10363a(sQLiteDatabase, str, str3, map);
            } catch (SQLiteException e) {
                C8727q.this.w().m10834f().m10830a("Failed to verify columns on table that was just created", str);
                throw e;
            }
        }

        @WorkerThread
        /* renamed from: a */
        private void m10363a(SQLiteDatabase sQLiteDatabase, String str, String str2, Map<String, String> map) {
            String[] split;
            Set<String> m10362b = m10362b(sQLiteDatabase, str);
            for (String str3 : str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                if (!m10362b.remove(str3)) {
                    throw new SQLiteException(new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str3).length()).append("Table ").append(str).append(" is missing required column: ").append(str3).toString());
                }
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (!m10362b.remove(entry.getKey())) {
                        sQLiteDatabase.execSQL(entry.getValue());
                    }
                }
            }
            if (!m10362b.isEmpty()) {
                C8727q.this.w().m10832z().m10829a("Table has extra columns. table, columns", str, TextUtils.join(", ", m10362b));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
        @WorkerThread
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean m10365a(SQLiteDatabase sQLiteDatabase, String str) {
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
                        C8727q.this.w().m10832z().m10829a("Error querying for table", str, e);
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

        @WorkerThread
        /* renamed from: b */
        private Set<String> m10362b(SQLiteDatabase sQLiteDatabase, String str) {
            HashSet hashSet = new HashSet();
            Cursor rawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" LIMIT 0").toString(), null);
            try {
                Collections.addAll(hashSet, rawQuery.getColumnNames());
                return hashSet;
            } finally {
                rawQuery.close();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        @WorkerThread
        public SQLiteDatabase getWritableDatabase() {
            if (!C8727q.this.f27920e.m10561a(C8727q.this.y().m10478G())) {
                throw new SQLiteException("Database open failed");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e) {
                C8727q.this.f27920e.m10562a();
                C8727q.this.w().m10834f().m10831a("Opening the database failed, dropping and recreating it");
                String m10426B = C8727q.this.m10426B();
                if (!C8727q.this.q().getDatabasePath(m10426B).delete()) {
                    C8727q.this.w().m10834f().m10830a("Failed to delete corrupted db file", m10426B);
                }
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    C8727q.this.f27920e.m10560b();
                    return writableDatabase;
                } catch (SQLiteException e2) {
                    C8727q.this.w().m10834f().m10830a("Failed to open freshly created database", e2);
                    throw e2;
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        @WorkerThread
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (Build.VERSION.SDK_INT >= 9) {
                File file = new File(sQLiteDatabase.getPath());
                if (!file.setReadable(false, false)) {
                    C8727q.this.w().m10832z().m10831a("Failed to turn off database read permission");
                }
                if (!file.setWritable(false, false)) {
                    C8727q.this.w().m10832z().m10831a("Failed to turn off database write permission");
                }
                if (!file.setReadable(true, true)) {
                    C8727q.this.w().m10832z().m10831a("Failed to turn on database read permission for owner");
                }
                if (file.setWritable(true, true)) {
                    return;
                }
                C8727q.this.w().m10832z().m10831a("Failed to turn on database write permission for owner");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        @WorkerThread
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (Build.VERSION.SDK_INT < 15) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
                try {
                    rawQuery.moveToFirst();
                } finally {
                    rawQuery.close();
                }
            }
            m10364a(sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", null);
            m10364a(sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", null);
            m10364a(sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C8727q.f27916a);
            m10364a(sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C8727q.f27918c);
            m10364a(sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
            m10364a(sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C8727q.f27917b);
            m10364a(sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", null);
            m10364a(sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", null);
            m10364a(sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
            m10364a(sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", null);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        @WorkerThread
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    static {
        f27916a.put(Constants.EXTRA_KEY_APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;");
        f27916a.put("app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;");
        f27916a.put("gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;");
        f27916a.put("dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;");
        f27916a.put("measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;");
        f27916a.put("last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;");
        f27916a.put("day", "ALTER TABLE apps ADD COLUMN day INTEGER;");
        f27916a.put("daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;");
        f27916a.put("daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;");
        f27916a.put("daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;");
        f27916a.put("remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;");
        f27916a.put("config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;");
        f27916a.put("failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;");
        f27916a.put("app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;");
        f27916a.put("firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;");
        f27916a.put("daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;");
        f27916a.put("daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;");
        f27917b.put("realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;");
        f27918c.put("has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8727q(C8668aj c8668aj) {
        super(c8668aj);
    }

    /* renamed from: N */
    private boolean m10414N() {
        return q().getDatabasePath(m10426B()).exists();
    }

    @WorkerThread
    @TargetApi(11)
    /* renamed from: a */
    static int m10410a(Cursor cursor, int i) {
        if (Build.VERSION.SDK_INT >= 11) {
            return cursor.getType(i);
        }
        CursorWindow window = ((SQLiteCursor) cursor).getWindow();
        int position = cursor.getPosition();
        if (window.isNull(position, i)) {
            return 0;
        }
        if (window.isLong(position, i)) {
            return 1;
        }
        if (window.isFloat(position, i)) {
            return 2;
        }
        if (window.isString(position, i)) {
            return 3;
        }
        return window.isBlob(position, i) ? 4 : -1;
    }

    @WorkerThread
    /* renamed from: a */
    private long m10389a(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = m10427A().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                return cursor.getLong(0);
            } catch (SQLiteException e) {
                w().m10834f().m10829a("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @WorkerThread
    /* renamed from: a */
    private long m10388a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = m10427A().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                } else if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                w().m10834f().m10829a("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @WorkerThread
    /* renamed from: a */
    private void m10394a(String str, amu.C6580a c6580a) {
        boolean z = false;
        c();
        j();
        C4588d.m23625a(str);
        C4588d.m23627a(c6580a);
        C4588d.m23627a(c6580a.f22314c);
        C4588d.m23627a(c6580a.f22313b);
        if (c6580a.f22312a == null) {
            w().m10832z().m10831a("Audience with no ID");
            return;
        }
        int intValue = c6580a.f22312a.intValue();
        for (amu.C6581b c6581b : c6580a.f22314c) {
            if (c6581b.f22316a == null) {
                w().m10832z().m10829a("Event filter with no ID. Audience definition ignored. appId, audienceId", str, c6580a.f22312a);
                return;
            }
        }
        for (amu.C6584e c6584e : c6580a.f22313b) {
            if (c6584e.f22332a == null) {
                w().m10832z().m10829a("Property filter with no ID. Audience definition ignored. appId, audienceId", str, c6580a.f22312a);
                return;
            }
        }
        boolean z2 = true;
        amu.C6581b[] c6581bArr = c6580a.f22314c;
        int length = c6581bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!m10399a(str, intValue, c6581bArr[i])) {
                z2 = false;
                break;
            } else {
                i++;
            }
        }
        if (z2) {
            for (amu.C6584e c6584e2 : c6580a.f22313b) {
                if (!m10398a(str, intValue, c6584e2)) {
                    break;
                }
            }
        }
        z = z2;
        if (z) {
            return;
        }
        m10383b(str, intValue);
    }

    @WorkerThread
    /* renamed from: a */
    private boolean m10399a(String str, int i, amu.C6581b c6581b) {
        c();
        j();
        C4588d.m23625a(str);
        C4588d.m23627a(c6581b);
        if (TextUtils.isEmpty(c6581b.f22317b)) {
            w().m10832z().m10829a("Event filter had no event name. Audience definition ignored. audienceId, filterId", Integer.valueOf(i), String.valueOf(c6581b.f22316a));
            return false;
        }
        try {
            byte[] bArr = new byte[c6581b.g()];
            C7640qw m13959a = C7640qw.m13959a(bArr);
            c6581b.mo13818a(m13959a);
            m13959a.m13957b();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", c6581b.f22316a);
            contentValues.put(C0017k.f42b, c6581b.f22317b);
            contentValues.put(UriUtil.DATA_SCHEME, bArr);
            try {
                if (m10427A().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                    w().m10834f().m10831a("Failed to insert event filter (got -1)");
                }
                return true;
            } catch (SQLiteException e) {
                w().m10834f().m10830a("Error storing event filter", e);
                return false;
            }
        } catch (IOException e2) {
            w().m10834f().m10830a("Configuration loss. Failed to serialize event filter", e2);
            return false;
        }
    }

    @WorkerThread
    /* renamed from: a */
    private boolean m10398a(String str, int i, amu.C6584e c6584e) {
        c();
        j();
        C4588d.m23625a(str);
        C4588d.m23627a(c6584e);
        if (TextUtils.isEmpty(c6584e.f22333b)) {
            w().m10832z().m10829a("Property filter had no property name. Audience definition ignored. audienceId, filterId", Integer.valueOf(i), String.valueOf(c6584e.f22332a));
            return false;
        }
        try {
            byte[] bArr = new byte[c6584e.g()];
            C7640qw m13959a = C7640qw.m13959a(bArr);
            c6584e.mo13818a(m13959a);
            m13959a.m13957b();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", c6584e.f22332a);
            contentValues.put("property_name", c6584e.f22333b);
            contentValues.put(UriUtil.DATA_SCHEME, bArr);
            try {
                if (m10427A().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                w().m10834f().m10831a("Failed to insert property filter (got -1)");
                return false;
            } catch (SQLiteException e) {
                w().m10834f().m10830a("Error storing property filter", e);
                return false;
            }
        } catch (IOException e2) {
            w().m10834f().m10830a("Configuration loss. Failed to serialize property filter", e2);
            return false;
        }
    }

    @WorkerThread
    /* renamed from: A */
    SQLiteDatabase m10427A() {
        j();
        try {
            return this.f27919d.getWritableDatabase();
        } catch (SQLiteException e) {
            w().m10832z().m10830a("Error opening database", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public String m10426B() {
        if (y().m10471N() && !y().m10470O()) {
            w().m10847A().m10831a("Using secondary database");
            return y().m10473L();
        }
        return y().m10474K();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    @WorkerThread
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m10425C() {
        Cursor cursor;
        Throwable th;
        String str = null;
        try {
            try {
                cursor = m10427A().rawQuery("select app_id from queue where app_id not in (select app_id from apps where measurement_enabled=0) order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        str = cursor.getString(0);
                        if (cursor != null) {
                            cursor.close();
                        }
                    } else if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    w().m10834f().m10830a("Database error getting next bundle app id", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return str;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        return str;
    }

    /* renamed from: D */
    public boolean m10424D() {
        return m10389a("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: E */
    public void m10423E() {
        j();
        c();
        if (!m10414N()) {
            return;
        }
        long m10788a = x().f27692f.m10788a();
        long mo16432b = p().mo16432b();
        if (Math.abs(mo16432b - m10788a) <= y().m10465T()) {
            return;
        }
        x().f27692f.m10787a(mo16432b);
        m10422F();
    }

    @WorkerThread
    /* renamed from: F */
    void m10422F() {
        int delete;
        j();
        c();
        if (m10414N() && (delete = m10427A().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(p().mo16434a()), String.valueOf(y().m10466S())})) > 0) {
            w().m10843E().m10830a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
        }
    }

    @WorkerThread
    /* renamed from: G */
    public long m10421G() {
        return m10388a("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    @WorkerThread
    /* renamed from: H */
    public long m10420H() {
        return m10388a("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    /* renamed from: I */
    public boolean m10419I() {
        return m10389a("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: J */
    public boolean m10418J() {
        return m10389a("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: a */
    public long m10409a(amw.C6593e c6593e) {
        j();
        c();
        C4588d.m23627a(c6593e);
        C4588d.m23625a(c6593e.f22391o);
        try {
            byte[] bArr = new byte[c6593e.g()];
            C7640qw m13959a = C7640qw.m13959a(bArr);
            c6593e.mo13818a(m13959a);
            m13959a.m13957b();
            long m10504d = s().m10504d(bArr);
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c6593e.f22391o);
            contentValues.put("metadata_fingerprint", Long.valueOf(m10504d));
            contentValues.put("metadata", bArr);
            try {
                m10427A().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return m10504d;
            } catch (SQLiteException e) {
                w().m10834f().m10830a("Error storing raw event metadata", e);
                throw e;
            }
        } catch (IOException e2) {
            w().m10834f().m10830a("Data loss. Failed to serialize event metadata", e2);
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    @WorkerThread
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8728a m10412a(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Cursor cursor;
        C4588d.m23625a(str);
        j();
        c();
        String[] strArr = {str};
        C8728a c8728a = new C8728a();
        Cursor cursor2 = null;
        try {
            try {
                SQLiteDatabase m10427A = m10427A();
                cursor = m10427A.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        w().m10832z().m10830a("Not updating daily counts, app is not known", str);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return c8728a;
                    }
                    if (cursor.getLong(0) == j) {
                        c8728a.f27922b = cursor.getLong(1);
                        c8728a.f27921a = cursor.getLong(2);
                        c8728a.f27923c = cursor.getLong(3);
                        c8728a.f27924d = cursor.getLong(4);
                        c8728a.f27925e = cursor.getLong(5);
                    }
                    if (z) {
                        c8728a.f27922b++;
                    }
                    if (z2) {
                        c8728a.f27921a++;
                    }
                    if (z3) {
                        c8728a.f27923c++;
                    }
                    if (z4) {
                        c8728a.f27924d++;
                    }
                    if (z5) {
                        c8728a.f27925e++;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(c8728a.f27921a));
                    contentValues.put("daily_events_count", Long.valueOf(c8728a.f27922b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c8728a.f27923c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c8728a.f27924d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c8728a.f27925e));
                    m10427A.update("apps", contentValues, "app_id=?", strArr);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return c8728a;
                } catch (SQLiteException e) {
                    e = e;
                    w().m10834f().m10830a("Error updating daily counts", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return c8728a;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    @WorkerThread
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8735u m10393a(String str, String str2) {
        Cursor cursor;
        Cursor cursor2 = null;
        C4588d.m23625a(str);
        C4588d.m23625a(str2);
        j();
        c();
        try {
            Cursor query = m10427A().query("events", new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!query.moveToFirst()) {
                    if (query != null) {
                        query.close();
                    }
                    return null;
                }
                C8735u c8735u = new C8735u(str, str2, query.getLong(0), query.getLong(1), query.getLong(2));
                if (query.moveToNext()) {
                    w().m10834f().m10831a("Got multiple records for event aggregates, expected one");
                }
                if (query == null) {
                    return c8735u;
                }
                query.close();
                return c8735u;
            } catch (SQLiteException e) {
                e = e;
                cursor = query;
                try {
                    w().m10834f().m10828a("Error querying events", str, str2, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
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
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    @WorkerThread
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<C8722l> m10402a(String str) {
        Cursor cursor;
        Cursor query;
        Cursor cursor2 = null;
        C4588d.m23625a(str);
        j();
        c();
        ArrayList arrayList = new ArrayList();
        try {
            query = m10427A().query("user_attributes", new String[]{"name", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, MAutoDBItem.SYSTEM_ROWID_FIELD, String.valueOf(y().m10479F()));
        } catch (SQLiteException e) {
            e = e;
            cursor = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!query.moveToFirst()) {
                if (query != null) {
                    query.close();
                }
                return arrayList;
            }
            do {
                String string = query.getString(0);
                long j = query.getLong(1);
                Object m10385b = m10385b(query, 2);
                if (m10385b == null) {
                    w().m10834f().m10831a("Read invalid user property value, ignoring it");
                } else {
                    arrayList.add(new C8722l(str, string, j, m10385b));
                }
            } while (query.moveToNext());
            if (query != null) {
                query.close();
            }
            return arrayList;
        } catch (SQLiteException e2) {
            e = e2;
            cursor = query;
            try {
                w().m10834f().m10829a("Error querying user properties", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
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

    /* JADX WARN: Removed duplicated region for block: B:63:0x00de  */
    @WorkerThread
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<Pair<amw.C6593e, Long>> m10400a(String str, int i, int i2) {
        Cursor cursor;
        Cursor cursor2;
        int i3;
        byte[] m10511b;
        boolean z = true;
        j();
        c();
        C4588d.m23619b(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        C4588d.m23619b(z);
        C4588d.m23625a(str);
        try {
            cursor = m10427A().query("queue", new String[]{MAutoDBItem.SYSTEM_ROWID_FIELD, UriUtil.DATA_SCHEME}, "app_id=?", new String[]{str}, null, null, MAutoDBItem.SYSTEM_ROWID_FIELD, String.valueOf(i));
        } catch (SQLiteException e) {
            e = e;
            cursor2 = null;
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            if (!cursor.moveToFirst()) {
                List<Pair<amw.C6593e, Long>> emptyList = Collections.emptyList();
                if (cursor == null) {
                    return emptyList;
                }
                cursor.close();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (true) {
                long j = cursor.getLong(0);
                try {
                    m10511b = s().m10511b(cursor.getBlob(1));
                } catch (IOException e2) {
                    w().m10834f().m10829a("Failed to unzip queued bundle", str, e2);
                    i3 = i4;
                }
                if (!arrayList.isEmpty() && m10511b.length + i4 > i2) {
                    break;
                }
                C7639qv m14009a = C7639qv.m14009a(m10511b);
                amw.C6593e c6593e = new amw.C6593e();
                try {
                    amw.C6593e c6593e2 = (amw.C6593e) c6593e.mo13816b(m14009a);
                    i3 = m10511b.length + i4;
                    arrayList.add(Pair.create(c6593e, Long.valueOf(j)));
                } catch (IOException e3) {
                    w().m10834f().m10829a("Failed to merge queued bundle", str, e3);
                    i3 = i4;
                }
                if (!cursor.moveToNext() || i3 > i2) {
                    break;
                }
                i4 = i3;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e4) {
            e = e4;
            cursor2 = cursor;
            try {
                w().m10834f().m10829a("Error querying bundles", str, e);
                List<Pair<amw.C6593e, Long>> emptyList2 = Collections.emptyList();
                if (cursor2 == null) {
                    return emptyList2;
                }
                cursor2.close();
                return emptyList2;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: a */
    public void m10413a(long j) {
        j();
        c();
        if (m10427A().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) != 1) {
            w().m10834f().m10831a("Deleted fewer rows from queue than expected");
        }
    }

    @WorkerThread
    /* renamed from: a */
    void m10411a(ContentValues contentValues, String str, Object obj) {
        C4588d.m23625a(str);
        C4588d.m23627a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        } else {
            contentValues.put(str, (Double) obj);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public void m10408a(amw.C6593e c6593e, boolean z) {
        j();
        c();
        C4588d.m23627a(c6593e);
        C4588d.m23625a(c6593e.f22391o);
        C4588d.m23627a(c6593e.f22382f);
        m10423E();
        long mo16434a = p().mo16434a();
        if (c6593e.f22382f.longValue() < mo16434a - y().m10466S() || c6593e.f22382f.longValue() > y().m10466S() + mo16434a) {
            w().m10832z().m10829a("Storing bundle outside of the max uploading time span. now, timestamp", Long.valueOf(mo16434a), c6593e.f22382f);
        }
        try {
            byte[] bArr = new byte[c6593e.g()];
            C7640qw m13959a = C7640qw.m13959a(bArr);
            c6593e.mo13818a(m13959a);
            m13959a.m13957b();
            byte[] m10517a = s().m10517a(bArr);
            w().m10843E().m10830a("Saving bundle, size", Integer.valueOf(m10517a.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c6593e.f22391o);
            contentValues.put("bundle_end_timestamp", c6593e.f22382f);
            contentValues.put(UriUtil.DATA_SCHEME, m10517a);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (m10427A().insert("queue", null, contentValues) != -1) {
                    return;
                }
                w().m10834f().m10831a("Failed to insert bundle (got -1)");
            } catch (SQLiteException e) {
                w().m10834f().m10830a("Error storing bundle", e);
            }
        } catch (IOException e2) {
            w().m10834f().m10830a("Data loss. Failed to serialize bundle", e2);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public void m10407a(C8641a c8641a) {
        C4588d.m23627a(c8641a);
        j();
        c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c8641a.m10889b());
        contentValues.put("app_instance_id", c8641a.m10886c());
        contentValues.put("gmp_app_id", c8641a.m10883d());
        contentValues.put("resettable_device_id_hash", c8641a.m10880e());
        contentValues.put("last_bundle_index", Long.valueOf(c8641a.m10858o()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c8641a.m10874g()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c8641a.m10872h()));
        contentValues.put(Constants.EXTRA_KEY_APP_VERSION, c8641a.m10870i());
        contentValues.put("app_store", c8641a.m10866k());
        contentValues.put("gmp_version", Long.valueOf(c8641a.m10864l()));
        contentValues.put("dev_cert_hash", Long.valueOf(c8641a.m10862m()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c8641a.m10860n()));
        contentValues.put("day", Long.valueOf(c8641a.m10854s()));
        contentValues.put("daily_public_events_count", Long.valueOf(c8641a.m10853t()));
        contentValues.put("daily_events_count", Long.valueOf(c8641a.m10852u()));
        contentValues.put("daily_conversions_count", Long.valueOf(c8641a.m10851v()));
        contentValues.put("config_fetched_time", Long.valueOf(c8641a.m10857p()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c8641a.m10856q()));
        contentValues.put("app_version_int", Long.valueOf(c8641a.m10868j()));
        contentValues.put("firebase_instance_id", c8641a.m10877f());
        contentValues.put("daily_error_events_count", Long.valueOf(c8641a.m10849x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c8641a.m10850w()));
        try {
            if (m10427A().insertWithOnConflict("apps", null, contentValues, 5) != -1) {
                return;
            }
            w().m10834f().m10831a("Failed to insert/update app (got -1)");
        } catch (SQLiteException e) {
            w().m10834f().m10830a("Error storing app", e);
        }
    }

    /* renamed from: a */
    public void m10404a(C8734t c8734t, long j, boolean z) {
        int i = 0;
        j();
        c();
        C4588d.m23627a(c8734t);
        C4588d.m23625a(c8734t.f27936a);
        amw.C6590b c6590b = new amw.C6590b();
        c6590b.f22361d = Long.valueOf(c8734t.f27940e);
        c6590b.f22358a = new amw.C6591c[c8734t.f27941f.m10899a()];
        Iterator<String> it2 = c8734t.f27941f.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            String next = it2.next();
            amw.C6591c c6591c = new amw.C6591c();
            c6590b.f22358a[i2] = c6591c;
            c6591c.f22364a = next;
            s().m10540a(c6591c, c8734t.f27941f.m10897a(next));
            i2++;
        }
        try {
            byte[] bArr = new byte[c6590b.g()];
            C7640qw m13959a = C7640qw.m13959a(bArr);
            c6590b.mo13818a(m13959a);
            m13959a.m13957b();
            w().m10843E().m10829a("Saving event, name, data size", c8734t.f27937b, Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c8734t.f27936a);
            contentValues.put("name", c8734t.f27937b);
            contentValues.put("timestamp", Long.valueOf(c8734t.f27939d));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put(UriUtil.DATA_SCHEME, bArr);
            if (z) {
                i = 1;
            }
            contentValues.put("realtime", Integer.valueOf(i));
            try {
                if (m10427A().insert("raw_events", null, contentValues) != -1) {
                    return;
                }
                w().m10834f().m10831a("Failed to insert raw event (got -1)");
            } catch (SQLiteException e) {
                w().m10834f().m10830a("Error storing raw event", e);
            }
        } catch (IOException e2) {
            w().m10834f().m10830a("Data loss. Failed to serialize event params/data", e2);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public void m10403a(C8735u c8735u) {
        C4588d.m23627a(c8735u);
        j();
        c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c8735u.f27942a);
        contentValues.put("name", c8735u.f27943b);
        contentValues.put("lifetime_count", Long.valueOf(c8735u.f27944c));
        contentValues.put("current_bundle_count", Long.valueOf(c8735u.f27945d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c8735u.f27946e));
        try {
            if (m10427A().insertWithOnConflict("events", null, contentValues, 5) != -1) {
                return;
            }
            w().m10834f().m10831a("Failed to insert/update event aggregates (got -1)");
        } catch (SQLiteException e) {
            w().m10834f().m10830a("Error storing event aggregates", e);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public void m10401a(String str, int i) {
        C4588d.m23625a(str);
        j();
        c();
        try {
            m10427A().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str, str, String.valueOf(i)});
        } catch (SQLiteException e) {
            w().m10834f().m10829a("Error pruning currencies", str, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10397a(String str, int i, amw.C6594f c6594f) {
        c();
        j();
        C4588d.m23625a(str);
        C4588d.m23627a(c6594f);
        try {
            byte[] bArr = new byte[c6594f.g()];
            C7640qw m13959a = C7640qw.m13959a(bArr);
            c6594f.mo13818a(m13959a);
            m13959a.m13957b();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("current_results", bArr);
            try {
                if (m10427A().insertWithOnConflict("audience_filter_values", null, contentValues, 5) != -1) {
                    return;
                }
                w().m10834f().m10831a("Failed to insert filter results (got -1)");
            } catch (SQLiteException e) {
                w().m10834f().m10830a("Error storing filter results", e);
            }
        } catch (IOException e2) {
            w().m10834f().m10830a("Configuration loss. Failed to serialize filter results", e2);
        }
    }

    @WorkerThread
    /* renamed from: a */
    protected void m10396a(String str, long j) {
        C4588d.m23625a(str);
        j();
        c();
        if (j <= 0) {
            w().m10834f().m10831a("Nonpositive first open count received, ignoring");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("first_open_count", Long.valueOf(j));
        try {
            if (m10427A().insertWithOnConflict("app2", null, contentValues, 5) != -1) {
                return;
            }
            w().m10834f().m10831a("Failed to insert/replace first open count (got -1)");
        } catch (SQLiteException e) {
            w().m10834f().m10830a("Error inserting/replacing first open count", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.google.android.gms.measurement.internal.ab$a] */
    /* JADX WARN: Type inference failed for: r3v16, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* renamed from: a */
    public void m10395a(String str, long j, AbstractC8729b abstractC8729b) {
        Cursor cursor;
        SQLiteDatabase m10427A;
        String str2;
        Cursor cursor2 = null;
        C4588d.m23627a(abstractC8729b);
        j();
        c();
        try {
            try {
                try {
                    m10427A = m10427A();
                } catch (SQLiteException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursor2;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                cursor2 = m10427A.rawQuery("select app_id, metadata_fingerprint from raw_events where app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", new String[]{String.valueOf(j)});
                if (!cursor2.moveToFirst()) {
                    if (cursor2 != 0) {
                        cursor2.close();
                    }
                }
                str = cursor2.getString(0);
                String string = cursor2.getString(1);
                cursor2.close();
                str2 = string;
                cursor = cursor2;
            } else {
                cursor2 = m10427A.rawQuery("select metadata_fingerprint from raw_events where app_id = ? order by rowid limit 1;", new String[]{str});
                if (!cursor2.moveToFirst()) {
                    if (cursor2 != 0) {
                        cursor2.close();
                    }
                }
                String string2 = cursor2.getString(0);
                cursor2.close();
                str2 = string2;
                cursor = cursor2;
            }
            cursor = m10427A.query("raw_events_metadata", new String[]{"metadata"}, "app_id=? and metadata_fingerprint=?", new String[]{str, str2}, null, null, MAutoDBItem.SYSTEM_ROWID_FIELD, "2");
            if (!cursor.moveToFirst()) {
                cursor2 = "Raw event metadata record is missing";
                w().m10834f().m10831a(cursor2);
                if (cursor != null) {
                    cursor.close();
                }
            } else {
                C7639qv m14009a = C7639qv.m14009a(cursor.getBlob(0));
                amw.C6593e c6593e = new amw.C6593e();
                try {
                    amw.C6593e c6593e2 = (amw.C6593e) c6593e.mo13816b(m14009a);
                    if (cursor.moveToNext()) {
                        w().m10832z().m10831a("Get multiple raw event metadata records, expected one");
                    }
                    cursor.close();
                    abstractC8729b.mo10366a(c6593e);
                    cursor2 = m10427A.query("raw_events", new String[]{MAutoDBItem.SYSTEM_ROWID_FIELD, "name", "timestamp", UriUtil.DATA_SCHEME}, "app_id=? and metadata_fingerprint=?", new String[]{str, str2}, null, null, MAutoDBItem.SYSTEM_ROWID_FIELD, null);
                    if (!cursor2.moveToFirst()) {
                        w().m10832z().m10831a("Raw event data disappeared while in transaction");
                        if (cursor2 != 0) {
                            cursor2.close();
                        }
                    } else {
                        while (true) {
                            long j2 = cursor2.getLong(0);
                            C7639qv m14009a2 = C7639qv.m14009a(cursor2.getBlob(3));
                            amw.C6590b c6590b = new amw.C6590b();
                            try {
                                amw.C6590b c6590b2 = (amw.C6590b) c6590b.mo13816b(m14009a2);
                                c6590b.f22359b = cursor2.getString(1);
                                c6590b.f22360c = Long.valueOf(cursor2.getLong(2));
                                if (!abstractC8729b.mo10367a(j2, c6590b)) {
                                    if (cursor2 != 0) {
                                        cursor2.close();
                                    }
                                }
                            } catch (IOException e2) {
                                w().m10834f().m10829a("Data loss. Failed to merge raw event", str, e2);
                            }
                            if (!cursor2.moveToNext()) {
                                if (cursor2 != 0) {
                                    cursor2.close();
                                }
                            }
                        }
                    }
                } catch (IOException e3) {
                    cursor2 = w().m10834f();
                    cursor2.m10829a("Data loss. Failed to merge raw event metadata", str, e3);
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor2 = cursor;
            w().m10834f().m10830a("Data loss. Error selecting raw event", e);
            if (cursor2 == null) {
                return;
            }
            cursor2.close();
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: a */
    public void m10391a(String str, byte[] bArr) {
        C4588d.m23625a(str);
        j();
        c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (m10427A().update("apps", contentValues, "app_id = ?", new String[]{str}) != 0) {
                return;
            }
            w().m10834f().m10831a("Failed to update remote config (got 0)");
        } catch (SQLiteException e) {
            w().m10834f().m10830a("Error storing remote config", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public void m10390a(String str, amu.C6580a[] c6580aArr) {
        c();
        j();
        C4588d.m23625a(str);
        C4588d.m23627a(c6580aArr);
        SQLiteDatabase m10427A = m10427A();
        m10427A.beginTransaction();
        try {
            m10377e(str);
            for (amu.C6580a c6580a : c6580aArr) {
                m10394a(str, c6580a);
            }
            ArrayList arrayList = new ArrayList();
            for (amu.C6580a c6580a2 : c6580aArr) {
                arrayList.add(c6580a2.f22312a);
            }
            m10392a(str, arrayList);
            m10427A.setTransactionSuccessful();
        } finally {
            m10427A.endTransaction();
        }
    }

    /* renamed from: a */
    public void m10387a(List<Long> list) {
        C4588d.m23627a(list);
        j();
        c();
        StringBuilder sb = new StringBuilder("rowid in (");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                break;
            }
            if (i2 != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(list.get(i2).longValue());
            i = i2 + 1;
        }
        sb.append(")");
        int delete = m10427A().delete("raw_events", sb.toString(), null);
        if (delete != list.size()) {
            w().m10834f().m10829a("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    @WorkerThread
    /* renamed from: a */
    public boolean m10406a(C8722l c8722l) {
        C4588d.m23627a(c8722l);
        j();
        c();
        if (m10380c(c8722l.f27910a, c8722l.f27911b) == null) {
            if (C8723m.m10537a(c8722l.f27911b)) {
                if (m10389a("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c8722l.f27910a}) >= y().m10480E()) {
                    return false;
                }
            } else if (m10389a("select count(1) from user_attributes where app_id=?", new String[]{c8722l.f27910a}) >= y().m10479F()) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c8722l.f27910a);
        contentValues.put("name", c8722l.f27911b);
        contentValues.put("set_timestamp", Long.valueOf(c8722l.f27912c));
        m10411a(contentValues, "value", c8722l.f27913d);
        try {
            if (m10427A().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                w().m10834f().m10831a("Failed to insert/update user property (got -1)");
            }
        } catch (SQLiteException e) {
            w().m10834f().m10830a("Error storing user property", e);
        }
        return true;
    }

    /* renamed from: a */
    boolean m10392a(String str, List<Integer> list) {
        C4588d.m23625a(str);
        c();
        j();
        SQLiteDatabase m10427A = m10427A();
        try {
            long m10389a = m10389a("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int m10434f = y().m10434f(str);
            if (m10389a <= m10434f) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    Integer num = list.get(i);
                    if (num == null || !(num instanceof Integer)) {
                        return false;
                    }
                    arrayList.add(Integer.toString(num.intValue()));
                }
            }
            String valueOf = String.valueOf(TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, arrayList));
            String sb = new StringBuilder(String.valueOf(valueOf).length() + 2).append("(").append(valueOf).append(")").toString();
            return m10427A.delete("audience_filter_values", new StringBuilder(String.valueOf(sb).length() + 140).append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ").append(sb).append(" order by rowid desc limit -1 offset ?)").toString(), new String[]{str, Integer.toString(m10434f)}) > 0;
        } catch (SQLiteException e) {
            w().m10834f().m10830a("Database error querying filters", e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01ba  */
    @WorkerThread
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8641a m10384b(String str) {
        Cursor cursor;
        C4588d.m23625a(str);
        j();
        c();
        try {
            cursor = m10427A().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", Constants.EXTRA_KEY_APP_VERSION, "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    C8641a c8641a = new C8641a(this.f27815n, str);
                    c8641a.m10891a(cursor.getString(0));
                    c8641a.m10887b(cursor.getString(1));
                    c8641a.m10884c(cursor.getString(2));
                    c8641a.m10876f(cursor.getLong(3));
                    c8641a.m10892a(cursor.getLong(4));
                    c8641a.m10888b(cursor.getLong(5));
                    c8641a.m10878e(cursor.getString(6));
                    c8641a.m10875f(cursor.getString(7));
                    c8641a.m10882d(cursor.getLong(8));
                    c8641a.m10879e(cursor.getLong(9));
                    c8641a.m10890a((cursor.isNull(10) ? 1 : cursor.getInt(10)) != 0);
                    c8641a.m10869i(cursor.getLong(11));
                    c8641a.m10867j(cursor.getLong(12));
                    c8641a.m10865k(cursor.getLong(13));
                    c8641a.m10863l(cursor.getLong(14));
                    c8641a.m10873g(cursor.getLong(15));
                    c8641a.m10871h(cursor.getLong(16));
                    c8641a.m10885c(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
                    c8641a.m10881d(cursor.getString(18));
                    c8641a.m10859n(cursor.getLong(19));
                    c8641a.m10861m(cursor.getLong(20));
                    c8641a.m10893a();
                    if (cursor.moveToNext()) {
                        w().m10834f().m10831a("Got multiple records for app, expected one");
                    }
                    if (cursor == null) {
                        return c8641a;
                    }
                    cursor.close();
                    return c8641a;
                } catch (SQLiteException e) {
                    e = e;
                    w().m10834f().m10829a("Error querying app", str, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
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
    }

    @WorkerThread
    /* renamed from: b */
    Object m10385b(Cursor cursor, int i) {
        int m10410a = m10410a(cursor, i);
        switch (m10410a) {
            case 0:
                w().m10834f().m10831a("Loaded invalid null value from database");
                return null;
            case 1:
                return Long.valueOf(cursor.getLong(i));
            case 2:
                return Double.valueOf(cursor.getDouble(i));
            case 3:
                return cursor.getString(i);
            case 4:
                w().m10834f().m10831a("Loaded invalid blob type value, ignoring it");
                return null;
            default:
                w().m10834f().m10830a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(m10410a));
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m10386b(long j) {
        Cursor cursor;
        Throwable th;
        String str = null;
        j();
        c();
        try {
            cursor = m10427A().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        w().m10843E().m10831a("No expired configs for apps with pending events");
                        if (cursor != null) {
                            cursor.close();
                        }
                    } else {
                        str = cursor.getString(0);
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    w().m10834f().m10830a("Error selecting expired configs", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return str;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            cursor = null;
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        return str;
    }

    @WorkerThread
    /* renamed from: b */
    void m10383b(String str, int i) {
        c();
        j();
        C4588d.m23625a(str);
        SQLiteDatabase m10427A = m10427A();
        m10427A.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
        m10427A.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
    }

    @WorkerThread
    /* renamed from: b */
    public void m10382b(String str, String str2) {
        C4588d.m23625a(str);
        C4588d.m23625a(str2);
        j();
        c();
        try {
            w().m10843E().m10830a("Deleted user attribute rows:", Integer.valueOf(m10427A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            w().m10834f().m10828a("Error deleting user attribute", str, str2, e);
        }
    }

    /* renamed from: c */
    public long m10381c(String str) {
        C4588d.m23625a(str);
        j();
        c();
        try {
            return m10427A().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(y().m10429j(str))});
        } catch (SQLiteException e) {
            w().m10834f().m10830a("Error deleting over the limit events", e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @WorkerThread
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8722l m10380c(String str, String str2) {
        Cursor cursor;
        Cursor query;
        Cursor cursor2 = null;
        C4588d.m23625a(str);
        C4588d.m23625a(str2);
        j();
        c();
        try {
            query = m10427A().query("user_attributes", new String[]{"set_timestamp", "value"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
        } catch (SQLiteException e) {
            e = e;
            cursor = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!query.moveToFirst()) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            C8722l c8722l = new C8722l(str, str2, query.getLong(0), m10385b(query, 1));
            if (query.moveToNext()) {
                w().m10834f().m10831a("Got multiple records for user property, expected one");
            }
            if (query == null) {
                return c8722l;
            }
            query.close();
            return c8722l;
        } catch (SQLiteException e2) {
            e = e2;
            cursor = query;
            try {
                w().m10834f().m10828a("Error querying user property", str, str2, e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<Integer, List<amu.C6581b>> m10378d(String str, String str2) {
        Cursor cursor;
        Cursor cursor2 = null;
        c();
        j();
        C4588d.m23625a(str);
        C4588d.m23625a(str2);
        ArrayMap arrayMap = new ArrayMap();
        try {
            try {
                cursor = m10427A().query("event_filters", new String[]{"audience_id", UriUtil.DATA_SCHEME}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        Map<Integer, List<amu.C6581b>> emptyMap = Collections.emptyMap();
                        if (cursor == null) {
                            return emptyMap;
                        }
                        cursor.close();
                        return emptyMap;
                    }
                    do {
                        C7639qv m14009a = C7639qv.m14009a(cursor.getBlob(1));
                        amu.C6581b c6581b = new amu.C6581b();
                        try {
                            amu.C6581b c6581b2 = (amu.C6581b) c6581b.mo13816b(m14009a);
                            int i = cursor.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(c6581b);
                        } catch (IOException e) {
                            w().m10834f().m10829a("Failed to merge filter", str, e);
                        }
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayMap;
                } catch (SQLiteException e2) {
                    e = e2;
                    w().m10834f().m10830a("Database error querying filters", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    @WorkerThread
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m10379d(String str) {
        Cursor cursor;
        Cursor cursor2 = null;
        C4588d.m23625a(str);
        j();
        c();
        try {
            try {
                cursor = m10427A().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    byte[] blob = cursor.getBlob(0);
                    if (cursor.moveToNext()) {
                        w().m10834f().m10831a("Got multiple records for app config, expected one");
                    }
                    if (cursor == null) {
                        return blob;
                    }
                    cursor.close();
                    return blob;
                } catch (SQLiteException e) {
                    e = e;
                    w().m10834f().m10829a("Error querying remote config", str, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<Integer, List<amu.C6584e>> m10376e(String str, String str2) {
        Cursor cursor;
        Cursor cursor2 = null;
        c();
        j();
        C4588d.m23625a(str);
        C4588d.m23625a(str2);
        ArrayMap arrayMap = new ArrayMap();
        try {
            try {
                cursor = m10427A().query("property_filters", new String[]{"audience_id", UriUtil.DATA_SCHEME}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        Map<Integer, List<amu.C6584e>> emptyMap = Collections.emptyMap();
                        if (cursor == null) {
                            return emptyMap;
                        }
                        cursor.close();
                        return emptyMap;
                    }
                    do {
                        C7639qv m14009a = C7639qv.m14009a(cursor.getBlob(1));
                        amu.C6584e c6584e = new amu.C6584e();
                        try {
                            amu.C6584e c6584e2 = (amu.C6584e) c6584e.mo13816b(m14009a);
                            int i = cursor.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(c6584e);
                        } catch (IOException e) {
                            w().m10834f().m10829a("Failed to merge filter", str, e);
                        }
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayMap;
                } catch (SQLiteException e2) {
                    e = e2;
                    w().m10834f().m10830a("Database error querying filters", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
    }

    @WorkerThread
    /* renamed from: e */
    void m10377e(String str) {
        c();
        j();
        C4588d.m23625a(str);
        SQLiteDatabase m10427A = m10427A();
        m10427A.delete("property_filters", "app_id=?", new String[]{str});
        m10427A.delete("event_filters", "app_id=?", new String[]{str});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<Integer, amw.C6594f> m10374f(String str) {
        Cursor cursor;
        Cursor cursor2;
        c();
        j();
        C4588d.m23625a(str);
        try {
            cursor = m10427A().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e) {
            e = e;
            cursor2 = null;
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            ArrayMap arrayMap = new ArrayMap();
            do {
                int i = cursor.getInt(0);
                C7639qv m14009a = C7639qv.m14009a(cursor.getBlob(1));
                amw.C6594f c6594f = new amw.C6594f();
                try {
                    amw.C6594f c6594f2 = (amw.C6594f) c6594f.mo13816b(m14009a);
                    arrayMap.put(Integer.valueOf(i), c6594f);
                } catch (IOException e2) {
                    w().m10834f().m10828a("Failed to merge filter results. appId, audienceId, error", str, Integer.valueOf(i), e2);
                }
            } while (cursor.moveToNext());
            if (cursor != null) {
                cursor.close();
            }
            return arrayMap;
        } catch (SQLiteException e3) {
            e = e3;
            cursor2 = cursor;
            try {
                w().m10834f().m10830a("Database error querying filter results", e);
                if (cursor2 != null) {
                    cursor2.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: f */
    public void m10375f() {
        c();
        m10427A().beginTransaction();
    }

    @WorkerThread
    /* renamed from: g */
    public void m10373g() {
        c();
        m10427A().setTransactionSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: g */
    public void m10372g(String str) {
        c();
        j();
        C4588d.m23625a(str);
        try {
            SQLiteDatabase m10427A = m10427A();
            String[] strArr = {str};
            int delete = m10427A.delete("audience_filter_values", "app_id=?", strArr) + m10427A.delete("events", "app_id=?", strArr) + 0 + m10427A.delete("user_attributes", "app_id=?", strArr) + m10427A.delete("apps", "app_id=?", strArr) + m10427A.delete("raw_events", "app_id=?", strArr) + m10427A.delete("raw_events_metadata", "app_id=?", strArr) + m10427A.delete("event_filters", "app_id=?", strArr) + m10427A.delete("property_filters", "app_id=?", strArr);
            if (delete <= 0) {
                return;
            }
            w().m10843E().m10829a("Deleted application data. app, records", str, Integer.valueOf(delete));
        } catch (SQLiteException e) {
            w().m10834f().m10829a("Error deleting application data. appId, error", str, e);
        }
    }

    @WorkerThread
    /* renamed from: h */
    public long m10371h(String str) {
        C4588d.m23625a(str);
        j();
        c();
        SQLiteDatabase m10427A = m10427A();
        m10427A.beginTransaction();
        try {
            long m10388a = m10388a("select first_open_count from app2 where app_id=?", new String[]{str}, 0L);
            m10396a(str, 1 + m10388a);
            m10427A.setTransactionSuccessful();
            return m10388a;
        } finally {
            m10427A.endTransaction();
        }
    }

    /* renamed from: i */
    public void m10370i(String str) {
        try {
            m10427A().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str, str});
        } catch (SQLiteException e) {
            w().m10834f().m10830a("Failed to remove unused event metadata", e);
        }
    }

    /* renamed from: j */
    public long m10369j(String str) {
        C4588d.m23625a(str);
        return m10388a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @WorkerThread
    /* renamed from: z */
    public void m10368z() {
        c();
        m10427A().endTransaction();
    }
}
