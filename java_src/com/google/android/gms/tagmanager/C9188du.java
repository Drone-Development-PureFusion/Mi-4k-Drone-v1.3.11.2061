package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import com.google.android.gms.tagmanager.C9196e;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.du */
/* loaded from: classes2.dex */
public class C9188du implements C9196e.AbstractC9201c {

    /* renamed from: a */
    private static final String f28982a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", "datalayer", "ID", "key", "value", "expires");

    /* renamed from: b */
    private final Executor f28983b;

    /* renamed from: c */
    private final Context f28984c;

    /* renamed from: d */
    private C9192a f28985d;

    /* renamed from: e */
    private AbstractC4682e f28986e;

    /* renamed from: f */
    private int f28987f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.du$a */
    /* loaded from: classes2.dex */
    public class C9192a extends SQLiteOpenHelper {
        C9192a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* renamed from: a */
        private void m8985a(SQLiteDatabase sQLiteDatabase) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
            HashSet hashSet = new HashSet();
            try {
                for (String str : rawQuery.getColumnNames()) {
                    hashSet.add(str);
                }
                rawQuery.close();
                if (!hashSet.remove("key") || !hashSet.remove("value") || !hashSet.remove("ID") || !hashSet.remove("expires")) {
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
        private boolean m8984a(String str, SQLiteDatabase sQLiteDatabase) {
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
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (SQLiteException e) {
                C9188du.this.f28984c.getDatabasePath("google_tagmanager.db").delete();
            }
            return sQLiteDatabase == null ? super.getWritableDatabase() : sQLiteDatabase;
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
            if (!m8984a("datalayer", sQLiteDatabase)) {
                sQLiteDatabase.execSQL(C9188du.f28982a);
            } else {
                m8985a(sQLiteDatabase);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tagmanager.du$b */
    /* loaded from: classes2.dex */
    public static class C9193b {

        /* renamed from: a */
        final String f28996a;

        /* renamed from: b */
        final byte[] f28997b;

        C9193b(String str, byte[] bArr) {
            this.f28996a = str;
            this.f28997b = bArr;
        }

        public String toString() {
            String str = this.f28996a;
            return new StringBuilder(String.valueOf(str).length() + 54).append("KeyAndSerialized: key = ").append(str).append(" serialized hash = ").append(Arrays.hashCode(this.f28997b)).toString();
        }
    }

    public C9188du(Context context) {
        this(context, C4685h.m23138d(), "google_tagmanager.db", 2000, Executors.newSingleThreadExecutor());
    }

    C9188du(Context context, AbstractC4682e abstractC4682e, String str, int i, Executor executor) {
        this.f28984c = context;
        this.f28986e = abstractC4682e;
        this.f28987f = i;
        this.f28983b = executor;
        this.f28985d = new C9192a(this.f28984c, str);
    }

    /* renamed from: a */
    private Object m8998a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable th;
        Object obj = null;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                obj = objectInputStream.readObject();
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e) {
                    }
                }
                byteArrayInputStream.close();
            } catch (IOException e2) {
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e3) {
                    }
                }
                byteArrayInputStream.close();
                return obj;
            } catch (ClassNotFoundException e4) {
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e5) {
                    }
                }
                byteArrayInputStream.close();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e6) {
                        throw th;
                    }
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e7) {
            objectInputStream = null;
        } catch (ClassNotFoundException e8) {
            objectInputStream = null;
        } catch (Throwable th3) {
            objectInputStream = null;
            th = th3;
        }
        return obj;
    }

    /* renamed from: a */
    private List<C9196e.C9199a> m8999a(List<C9193b> list) {
        ArrayList arrayList = new ArrayList();
        for (C9193b c9193b : list) {
            arrayList.add(new C9196e.C9199a(c9193b.f28996a, m8998a(c9193b.f28997b)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m9005a(int i) {
        int m8987d = (m8987d() - this.f28987f) + i;
        if (m8987d > 0) {
            List<String> m8995b = m8995b(m8987d);
            C9065aw.m9297c(new StringBuilder(64).append("DataLayer store full, deleting ").append(m8995b.size()).append(" entries to make room.").toString());
            m8997a((String[]) m8995b.toArray(new String[0]));
        }
    }

    /* renamed from: a */
    private void m9004a(long j) {
        SQLiteDatabase m8989c = m8989c("Error opening database for deleteOlderThan.");
        if (m8989c == null) {
            return;
        }
        try {
            C9065aw.m9295e(new StringBuilder(33).append("Deleted ").append(m8989c.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)})).append(" expired items").toString());
        } catch (SQLiteException e) {
            C9065aw.m9299b("Error deleting old entries.");
        }
    }

    /* renamed from: a */
    private void m8997a(String[] strArr) {
        SQLiteDatabase m8989c;
        if (strArr == null || strArr.length == 0 || (m8989c = m8989c("Error opening database for deleteEntries.")) == null) {
            return;
        }
        try {
            m8989c.delete("datalayer", String.format("%s in (%s)", "ID", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, Collections.nCopies(strArr.length, C0363a.f360a))), strArr);
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(Arrays.toString(strArr));
            C9065aw.m9299b(valueOf.length() != 0 ? "Error deleting entries ".concat(valueOf) : new String("Error deleting entries "));
        }
    }

    /* renamed from: a */
    private byte[] m9000a(Object obj) {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        byte[] bArr = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(obj);
                bArr = byteArrayOutputStream.toByteArray();
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e) {
                    }
                }
                byteArrayOutputStream.close();
            } catch (IOException e2) {
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e3) {
                    }
                }
                byteArrayOutputStream.close();
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (IOException e4) {
                        throw th;
                    }
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException e5) {
            objectOutputStream = null;
        } catch (Throwable th3) {
            objectOutputStream = null;
            th = th3;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public List<C9196e.C9199a> m8996b() {
        try {
            m9004a(this.f28986e.mo16434a());
            return m8999a(m8990c());
        } finally {
            m8986e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<String> m8995b(int i) {
        Cursor cursor;
        Cursor cursor2 = null;
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            C9065aw.m9299b("Invalid maxEntries specified. Skipping.");
            return arrayList;
        }
        SQLiteDatabase m8989c = m8989c("Error opening database for peekEntryIds.");
        try {
            if (m8989c == null) {
                return arrayList;
            }
            try {
                cursor = m8989c.query("datalayer", new String[]{"ID"}, null, null, null, null, String.format("%s ASC", "ID"), Integer.toString(i));
                try {
                } catch (SQLiteException e) {
                    e = e;
                    String valueOf = String.valueOf(e.getMessage());
                    C9065aw.m9299b(valueOf.length() != 0 ? "Error in peekEntries fetching entryIds: ".concat(valueOf) : new String("Error in peekEntries fetching entryIds: "));
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

    /* renamed from: b */
    private List<C9193b> m8992b(List<C9196e.C9199a> list) {
        ArrayList arrayList = new ArrayList();
        for (C9196e.C9199a c9199a : list) {
            arrayList.add(new C9193b(c9199a.f29014a, m9000a(c9199a.f29015b)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8993b(String str) {
        SQLiteDatabase m8989c = m8989c("Error opening database for clearKeysWithPrefix.");
        if (m8989c == null) {
            return;
        }
        try {
            C9065aw.m9295e(new StringBuilder(25).append("Cleared ").append(m8989c.delete("datalayer", "key = ? OR key LIKE ?", new String[]{str, String.valueOf(str).concat(".%")})).append(" items").toString());
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e);
            C9065aw.m9299b(new StringBuilder(String.valueOf(str).length() + 44 + String.valueOf(valueOf).length()).append("Error deleting entries with key prefix: ").append(str).append(" (").append(valueOf).append(").").toString());
        } finally {
            m8986e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m8991b(List<C9193b> list, long j) {
        long mo16434a = this.f28986e.mo16434a();
        m9004a(mo16434a);
        m9005a(list.size());
        m8988c(list, mo16434a + j);
        m8986e();
    }

    /* renamed from: c */
    private SQLiteDatabase m8989c(String str) {
        try {
            return this.f28985d.getWritableDatabase();
        } catch (SQLiteException e) {
            C9065aw.m9299b(str);
            return null;
        }
    }

    /* renamed from: c */
    private List<C9193b> m8990c() {
        SQLiteDatabase m8989c = m8989c("Error opening database for loadSerialized.");
        ArrayList arrayList = new ArrayList();
        if (m8989c == null) {
            return arrayList;
        }
        Cursor query = m8989c.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
        while (query.moveToNext()) {
            try {
                arrayList.add(new C9193b(query.getString(0), query.getBlob(1)));
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m8988c(List<C9193b> list, long j) {
        SQLiteDatabase m8989c = m8989c("Error opening database for writeEntryToDatabase.");
        if (m8989c == null) {
            return;
        }
        for (C9193b c9193b : list) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("expires", Long.valueOf(j));
            contentValues.put("key", c9193b.f28996a);
            contentValues.put("value", c9193b.f28997b);
            m8989c.insert("datalayer", null, contentValues);
        }
    }

    /* renamed from: d */
    private int m8987d() {
        Cursor cursor = null;
        int i = 0;
        SQLiteDatabase m8989c = m8989c("Error opening database for getNumStoredEntries.");
        try {
            if (m8989c != null) {
                try {
                    cursor = m8989c.rawQuery("SELECT COUNT(*) from datalayer", null);
                    if (cursor.moveToFirst()) {
                        i = (int) cursor.getLong(0);
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteException e) {
                    C9065aw.m9299b("Error getting numStoredEntries");
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

    /* renamed from: e */
    private void m8986e() {
        try {
            this.f28985d.close();
        } catch (SQLiteException e) {
        }
    }

    @Override // com.google.android.gms.tagmanager.C9196e.AbstractC9201c
    /* renamed from: a */
    public void mo8948a(final C9196e.AbstractC9201c.AbstractC9202a abstractC9202a) {
        this.f28983b.execute(new Runnable() { // from class: com.google.android.gms.tagmanager.du.2
            @Override // java.lang.Runnable
            public void run() {
                abstractC9202a.mo8945a(C9188du.this.m8996b());
            }
        });
    }

    @Override // com.google.android.gms.tagmanager.C9196e.AbstractC9201c
    /* renamed from: a */
    public void mo8947a(final String str) {
        this.f28983b.execute(new Runnable() { // from class: com.google.android.gms.tagmanager.du.3
            @Override // java.lang.Runnable
            public void run() {
                C9188du.this.m8993b(str);
            }
        });
    }

    @Override // com.google.android.gms.tagmanager.C9196e.AbstractC9201c
    /* renamed from: a */
    public void mo8946a(List<C9196e.C9199a> list, final long j) {
        final List<C9193b> m8992b = m8992b(list);
        this.f28983b.execute(new Runnable() { // from class: com.google.android.gms.tagmanager.du.1
            @Override // java.lang.Runnable
            public void run() {
                C9188du.this.m8991b(m8992b, j);
            }
        });
    }
}
