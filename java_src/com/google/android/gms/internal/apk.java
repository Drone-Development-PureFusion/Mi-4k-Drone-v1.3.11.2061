package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import com.google.android.gms.internal.apw;
import com.tencent.p263mm.sdk.platformtools.Util;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class apk implements apc {

    /* renamed from: a */
    private static final String f22704a = String.format("CREATE TABLE IF NOT EXISTS %s ('%s' TEXT UNIQUE);", "gtm_hit_unique_ids", "hit_unique_id");

    /* renamed from: b */
    private static final String f22705b = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT UNIQUE, '%s' TEXT, '%s' TEXT);", "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body");

    /* renamed from: c */
    private static final String f22706c = String.format("CREATE TRIGGER IF NOT EXISTS %s DELETE ON %s FOR EACH ROW WHEN OLD.%s NOTNULL BEGIN     INSERT OR IGNORE INTO %s (%s) VALUES (OLD.%s); END;", "save_unique_on_delete", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id");

    /* renamed from: d */
    private static final String f22707d = String.format("CREATE TRIGGER IF NOT EXISTS %s BEFORE INSERT ON %s FOR EACH ROW WHEN NEW.%s NOT NULL BEGIN     SELECT RAISE(ABORT, 'Duplicate unique ID.')     WHERE EXISTS (SELECT 1 FROM %s WHERE %s = NEW.%s); END;", "check_unique_on_insert", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id");

    /* renamed from: e */
    private final C6713b f22708e;

    /* renamed from: f */
    private volatile aov f22709f;

    /* renamed from: g */
    private final apd f22710g;

    /* renamed from: h */
    private final Context f22711h;

    /* renamed from: i */
    private final String f22712i;

    /* renamed from: j */
    private long f22713j;

    /* renamed from: k */
    private AbstractC4682e f22714k;

    /* renamed from: l */
    private final int f22715l;

    /* renamed from: com.google.android.gms.internal.apk$a */
    /* loaded from: classes2.dex */
    class C6712a implements apw.AbstractC6728a {
        C6712a() {
        }

        @Override // com.google.android.gms.internal.apw.AbstractC6728a
        /* renamed from: a */
        public void mo16282a(aoy aoyVar) {
            apk.this.m16380a(aoyVar.m16423a());
        }

        @Override // com.google.android.gms.internal.apw.AbstractC6728a
        /* renamed from: b */
        public void mo16281b(aoy aoyVar) {
            apk.this.m16380a(aoyVar.m16423a());
            aph.m16391d(new StringBuilder(57).append("Permanent failure dispatching hitId: ").append(aoyVar.m16423a()).toString());
        }

        @Override // com.google.android.gms.internal.apw.AbstractC6728a
        /* renamed from: c */
        public void mo16280c(aoy aoyVar) {
            long m16420b = aoyVar.m16420b();
            if (m16420b == 0) {
                apk.this.m16379a(aoyVar.m16423a(), apk.this.f22714k.mo16434a());
            } else if (m16420b + 14400000 >= apk.this.f22714k.mo16434a()) {
            } else {
                apk.this.m16380a(aoyVar.m16423a());
                aph.m16391d(new StringBuilder(47).append("Giving up on failed hitId: ").append(aoyVar.m16423a()).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.apk$b */
    /* loaded from: classes2.dex */
    public class C6713b extends SQLiteOpenHelper {

        /* renamed from: b */
        private boolean f22718b;

        /* renamed from: c */
        private long f22719c = 0;

        C6713b(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* renamed from: a */
        private void m16359a(SQLiteDatabase sQLiteDatabase, String str, List<String> list) {
            Cursor rawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" WHERE 0").toString(), null);
            HashSet hashSet = new HashSet();
            try {
                for (String str2 : rawQuery.getColumnNames()) {
                    hashSet.add(str2);
                }
                rawQuery.close();
                for (String str3 : list) {
                    if (!hashSet.remove(str3)) {
                        throw new SQLiteException(String.format("Database column %s missing in table %s.", str3, str));
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                throw new SQLiteException(String.format("Database has extra columns in table %s.", str));
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
        private boolean m16358a(String str, SQLiteDatabase sQLiteDatabase) {
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
                    aph.m16394b(valueOf.length() != 0 ? "Error querying for table ".concat(valueOf) : new String("Error querying for table "));
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
            if (!this.f22718b || this.f22719c + Util.MILLSECONDS_OF_HOUR <= apk.this.f22714k.mo16434a()) {
                SQLiteDatabase sQLiteDatabase = null;
                this.f22718b = true;
                this.f22719c = apk.this.f22714k.mo16434a();
                try {
                    sQLiteDatabase = super.getWritableDatabase();
                } catch (SQLiteException e) {
                    apk.this.f22711h.getDatabasePath(apk.this.f22712i).delete();
                }
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = super.getWritableDatabase();
                }
                this.f22718b = false;
                return sQLiteDatabase;
            }
            throw new SQLiteException("Database creation failed");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            aox.m16424a(sQLiteDatabase.getPath());
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
            if (!m16358a("gtm_hit_unique_ids", sQLiteDatabase)) {
                sQLiteDatabase.execSQL(apk.f22704a);
            } else {
                m16359a(sQLiteDatabase, "gtm_hit_unique_ids", Arrays.asList("hit_unique_id"));
            }
            if (!m16358a("gtm_hits", sQLiteDatabase)) {
                sQLiteDatabase.execSQL(apk.f22705b);
            } else {
                m16359a(sQLiteDatabase, "gtm_hits", Arrays.asList("hit_id", "hit_url", "hit_time", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"));
            }
            sQLiteDatabase.execSQL(apk.f22706c);
            sQLiteDatabase.execSQL(apk.f22707d);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public apk(apd apdVar, Context context) {
        this(apdVar, context, "gtm_urls.db", 2000);
    }

    apk(apd apdVar, Context context, String str, int i) {
        this.f22711h = context.getApplicationContext();
        this.f22712i = str;
        this.f22710g = apdVar;
        this.f22714k = C4685h.m23138d();
        this.f22708e = new C6713b(this.f22711h, this.f22712i);
        this.f22709f = new apw(this.f22711h, new C6712a());
        this.f22713j = 0L;
        this.f22715l = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m16380a(long j) {
        m16373a(new String[]{String.valueOf(j)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m16379a(long j, long j2) {
        SQLiteDatabase m16368b = m16368b("Error opening database for getNumStoredHits.");
        if (m16368b == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_first_send_time", Long.valueOf(j2));
        try {
            m16368b.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
        } catch (SQLiteException e) {
            aph.m16394b(new StringBuilder(69).append("Error setting HIT_FIRST_DISPATCH_TIME for hitId: ").append(j).toString());
            m16380a(j);
        }
    }

    /* renamed from: b */
    private SQLiteDatabase m16368b(String str) {
        try {
            return this.f22708e.getWritableDatabase();
        } catch (SQLiteException e) {
            aph.m16394b(str);
            return null;
        }
    }

    /* renamed from: b */
    private void m16370b(long j, String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4) {
        String str5 = null;
        SQLiteDatabase m16368b = m16368b("Error opening database for putHit");
        if (m16368b == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_time", Long.valueOf(j));
        contentValues.put("hit_url", str);
        contentValues.put("hit_first_send_time", (Integer) 0);
        if (str2 == null) {
            str2 = "GET";
        }
        contentValues.put("hit_method", str2);
        contentValues.put("hit_unique_id", str3);
        if (map != null) {
            str5 = new JSONObject(map).toString();
        }
        contentValues.put("hit_headers", str5);
        contentValues.put("hit_body", str4);
        try {
            m16368b.insertOrThrow("gtm_hits", null, contentValues);
            aph.m16391d(new StringBuilder(String.valueOf(str).length() + 19).append("Hit stored (url = ").append(str).append(")").toString());
            this.f22710g.mo16293a(false);
        } catch (SQLiteConstraintException e) {
            String valueOf = String.valueOf(str);
            aph.m16391d(valueOf.length() != 0 ? "Hit has already been sent: ".concat(valueOf) : new String("Hit has already been sent: "));
        } catch (SQLiteException e2) {
            String valueOf2 = String.valueOf(e2);
            aph.m16394b(new StringBuilder(String.valueOf(valueOf2).length() + 18).append("Error storing hit ").append(valueOf2).toString());
        }
    }

    /* renamed from: i */
    private void m16360i() {
        int m16367c = (m16367c() - this.f22715l) + 1;
        if (m16367c > 0) {
            List<String> m16381a = m16381a(m16367c);
            aph.m16391d(new StringBuilder(51).append("Store full, deleting ").append(m16381a.size()).append(" hits to make room.").toString());
            m16373a((String[]) m16381a.toArray(new String[0]));
        }
    }

    /* renamed from: a */
    int m16374a(String str) {
        Cursor cursor = null;
        int i = 0;
        SQLiteDatabase m16368b = m16368b("Error opening database for getNumRecords.");
        if (m16368b != null) {
            try {
                try {
                    String valueOf = String.valueOf(str);
                    cursor = m16368b.rawQuery(valueOf.length() != 0 ? "SELECT COUNT(*) from ".concat(valueOf) : new String("SELECT COUNT(*) from "), null);
                    if (cursor.moveToFirst()) {
                        i = (int) cursor.getLong(0);
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteException e) {
                    aph.m16394b("Error getting numStoredRecords");
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    List<String> m16381a(int i) {
        Cursor cursor;
        Cursor cursor2 = null;
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            aph.m16394b("Invalid maxHits specified. Skipping");
            return arrayList;
        }
        SQLiteDatabase m16368b = m16368b("Error opening database for peekHitIds.");
        try {
            if (m16368b == null) {
                return arrayList;
            }
            try {
                cursor = m16368b.query("gtm_hits", new String[]{"hit_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(i));
                try {
                } catch (SQLiteException e) {
                    e = e;
                    String valueOf = String.valueOf(e.getMessage());
                    aph.m16394b(valueOf.length() != 0 ? "Error in peekHits fetching hitIds: ".concat(valueOf) : new String("Error in peekHits fetching hitIds: "));
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

    @Override // com.google.android.gms.internal.apc
    /* renamed from: a */
    public void mo16382a() {
        aph.m16391d("GTM Dispatch running...");
        if (!this.f22709f.mo16287a()) {
            return;
        }
        List<aoy> m16371b = m16371b(40);
        if (m16371b.isEmpty()) {
            aph.m16391d("...nothing to dispatch");
            this.f22710g.mo16293a(true);
            return;
        }
        this.f22709f.mo16284a(m16371b);
        if (m16365d() <= 0) {
            return;
        }
        apu.m16305b().m16301d();
    }

    @Override // com.google.android.gms.internal.apc
    /* renamed from: a */
    public void mo16378a(long j, String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4) {
        m16372b();
        m16360i();
        m16370b(j, str, str2, str3, map, str4);
        if (apn.m16354a().m16351b()) {
            aph.m16391d("Sending hits immediately under preview.");
            mo16382a();
        }
    }

    /* renamed from: a */
    void m16373a(String[] strArr) {
        SQLiteDatabase m16368b;
        boolean z = true;
        if (strArr == null || strArr.length == 0 || (m16368b = m16368b("Error opening database for deleteHits.")) == null) {
            return;
        }
        try {
            m16368b.delete("gtm_hits", String.format("HIT_ID in (%s)", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, Collections.nCopies(strArr.length, C0363a.f360a))), strArr);
            apd apdVar = this.f22710g;
            if (m16367c() != 0) {
                z = false;
            }
            apdVar.mo16293a(z);
        } catch (SQLiteException e) {
            aph.m16394b("Error deleting hits");
        }
    }

    /* renamed from: b */
    int m16372b() {
        boolean z = true;
        long mo16434a = this.f22714k.mo16434a();
        if (mo16434a <= this.f22713j + 86400000) {
            return 0;
        }
        this.f22713j = mo16434a;
        SQLiteDatabase m16368b = m16368b("Error opening database for deleteStaleHits.");
        if (m16368b == null) {
            return 0;
        }
        int delete = m16368b.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.f22714k.mo16434a() - 2592000000L)});
        aph.m16391d(new StringBuilder(31).append("Removed ").append(delete).append(" stale hits.").toString());
        apd apdVar = this.f22710g;
        if (m16367c() != 0) {
            z = false;
        }
        apdVar.mo16293a(z);
        return delete;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<aoy> m16371b(int i) {
        SQLiteException sQLiteException;
        Cursor cursor;
        ArrayList arrayList;
        ArrayList<aoy> arrayList2;
        Cursor cursor2;
        int i2;
        HashMap hashMap;
        ArrayList arrayList3 = new ArrayList();
        SQLiteDatabase m16368b = m16368b("Error opening database for peekHits");
        if (m16368b == null) {
            return arrayList3;
        }
        Cursor cursor3 = null;
        try {
            Cursor query = m16368b.query("gtm_hits", new String[]{"hit_id", "hit_time", "hit_first_send_time"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(i));
            try {
                try {
                    arrayList2 = new ArrayList();
                } catch (Throwable th) {
                    th = th;
                    cursor3 = query;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e) {
                sQLiteException = e;
                cursor = query;
                arrayList = arrayList3;
            }
            try {
                if (!query.moveToFirst()) {
                    if (query != null) {
                    }
                    cursor2 = m16368b.query("gtm_hits", new String[]{"hit_id", "hit_url", "hit_method", "hit_headers", "hit_body"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(i));
                    if (cursor2.moveToFirst()) {
                    }
                    if (cursor2 != null) {
                    }
                    return arrayList2;
                }
                do {
                    arrayList2.add(new aoy(query.getLong(0), query.getLong(1), query.getLong(2)));
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                try {
                    try {
                        cursor2 = m16368b.query("gtm_hits", new String[]{"hit_id", "hit_url", "hit_method", "hit_headers", "hit_body"}, null, null, null, null, String.format("%s ASC", "hit_id"), Integer.toString(i));
                    } catch (SQLiteException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = query;
                }
                try {
                    if (cursor2.moveToFirst()) {
                        int i3 = 0;
                        while (true) {
                            if (((SQLiteCursor) cursor2).getWindow().getNumRows() > 0) {
                                ((aoy) arrayList2.get(i3)).m16422a(cursor2.getString(1));
                                ((aoy) arrayList2.get(i3)).m16419b(cursor2.getString(2));
                                ((aoy) arrayList2.get(i3)).m16417c(cursor2.getString(4));
                                try {
                                    String string = cursor2.getString(3);
                                    if (string != null) {
                                        JSONObject jSONObject = new JSONObject(string);
                                        JSONArray names = jSONObject.names();
                                        hashMap = new HashMap();
                                        int i4 = 0;
                                        while (true) {
                                            int i5 = i4;
                                            if (i5 >= names.length()) {
                                                break;
                                            }
                                            String string2 = names.getString(i5);
                                            hashMap.put(string2, (String) jSONObject.opt(string2));
                                            i4 = i5 + 1;
                                        }
                                    } else {
                                        hashMap = null;
                                    }
                                    ((aoy) arrayList2.get(i3)).m16421a(hashMap);
                                } catch (JSONException e3) {
                                    aph.m16394b(String.format("Failed to read headers for hitId %d: %s", Long.valueOf(((aoy) arrayList2.get(i3)).m16423a()), e3.getMessage()));
                                    i2 = i3;
                                }
                            } else {
                                aph.m16394b(String.format("HitString for hitId %d too large.  Hit will be deleted.", Long.valueOf(((aoy) arrayList2.get(i3)).m16423a())));
                            }
                            i2 = i3 + 1;
                            if (!cursor2.moveToNext()) {
                                break;
                            }
                            i3 = i2;
                        }
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return arrayList2;
                } catch (SQLiteException e4) {
                    e = e4;
                    query = cursor2;
                    String valueOf = String.valueOf(e.getMessage());
                    aph.m16394b(valueOf.length() != 0 ? "Error in peekHits fetching hit url: ".concat(valueOf) : new String("Error in peekHits fetching hit url: "));
                    ArrayList arrayList4 = new ArrayList();
                    boolean z = false;
                    for (aoy aoyVar : arrayList2) {
                        if (TextUtils.isEmpty(aoyVar.m16418c())) {
                            if (z) {
                                break;
                            }
                            z = true;
                        }
                        arrayList4.add(aoyVar);
                    }
                    if (query != null) {
                        query.close();
                    }
                    return arrayList4;
                } catch (Throwable th3) {
                    th = th3;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e5) {
                sQLiteException = e5;
                cursor = query;
                arrayList = arrayList2;
                try {
                    String valueOf2 = String.valueOf(sQLiteException.getMessage());
                    aph.m16394b(valueOf2.length() != 0 ? "Error in peekHits fetching hitIds: ".concat(valueOf2) : new String("Error in peekHits fetching hitIds: "));
                    if (cursor == null) {
                        return arrayList;
                    }
                    cursor.close();
                    return arrayList;
                } catch (Throwable th4) {
                    th = th4;
                    cursor3 = cursor;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e6) {
            sQLiteException = e6;
            cursor = null;
            arrayList = arrayList3;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* renamed from: c */
    int m16367c() {
        return m16374a("gtm_hits");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    int m16365d() {
        Cursor cursor;
        int i;
        Cursor cursor2 = null;
        SQLiteDatabase m16368b = m16368b("Error opening database for getNumStoredHits.");
        if (m16368b == null) {
            return 0;
        }
        try {
            Cursor query = m16368b.query("gtm_hits", new String[]{"hit_id", "hit_first_send_time"}, "hit_first_send_time=0", null, null, null, null);
            try {
                i = query.getCount();
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e) {
                cursor = query;
                try {
                    aph.m16394b("Error getting num untried hits");
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
