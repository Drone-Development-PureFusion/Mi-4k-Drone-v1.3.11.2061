package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.internal.C7271ju;
import com.google.firebase.database.C9866d;
import com.tencent.p263mm.sdk.storage.MAutoDBItem;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
/* renamed from: com.google.android.gms.internal.gx */
/* loaded from: classes2.dex */
public class C7062gx implements AbstractC7258jq {

    /* renamed from: a */
    static final /* synthetic */ boolean f23832a;

    /* renamed from: b */
    private static final Charset f23833b;

    /* renamed from: c */
    private final SQLiteDatabase f23834c;

    /* renamed from: d */
    private final C7315ks f23835d;

    /* renamed from: e */
    private boolean f23836e;

    /* renamed from: f */
    private long f23837f = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.gx$a */
    /* loaded from: classes2.dex */
    public static class C7065a extends SQLiteOpenHelper {

        /* renamed from: a */
        static final /* synthetic */ boolean f23845a;

        static {
            f23845a = !C7062gx.class.desiredAssertionStatus();
        }

        public C7065a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
        }

        /* renamed from: a */
        private void m15674a(SQLiteDatabase sQLiteDatabase, String str) {
            String valueOf = String.valueOf(str);
            sQLiteDatabase.execSQL(valueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(valueOf) : new String("DROP TABLE IF EXISTS "));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (f23845a || i2 == 2) {
                if (i > 1) {
                    throw new AssertionError(new StringBuilder(40).append("We don't handle upgrading to ").append(i2).toString());
                }
                m15674a(sQLiteDatabase, "serverCache");
                sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
                m15674a(sQLiteDatabase, "complete");
                sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
                return;
            }
            throw new AssertionError("Why is onUpgrade() called with a different version?");
        }
    }

    static {
        f23832a = !C7062gx.class.desiredAssertionStatus();
        f23833b = Charset.forName("UTF-8");
    }

    public C7062gx(Context context, C7146ic c7146ic, String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            this.f23835d = c7146ic.m15413a("Persistence");
            this.f23834c = m15696a(context, encode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private int m15691a(C7160ij c7160ij, List<String> list, int i) {
        int i2 = i + 1;
        String m15680c = m15680c(c7160ij);
        if (!list.get(i).startsWith(m15680c)) {
            throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
        }
        while (i2 < list.size() && list.get(i2).equals(m15695a(c7160ij, i2 - i))) {
            i2++;
        }
        if (i2 < list.size()) {
            String str = list.get(i2);
            String valueOf = String.valueOf(m15680c);
            String valueOf2 = String.valueOf(".part-");
            if (str.startsWith(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf))) {
                throw new IllegalStateException("Run did not finish with all parts");
            }
        }
        return i2 - i;
    }

    /* renamed from: a */
    private int m15687a(String str, C7160ij c7160ij) {
        String m15680c = m15680c(c7160ij);
        return this.f23834c.delete(str, "path >= ? AND path < ?", new String[]{m15680c, m15688a(m15680c)});
    }

    /* renamed from: a */
    private Cursor m15690a(C7160ij c7160ij, String[] strArr) {
        String m15680c = m15680c(c7160ij);
        String m15688a = m15688a(m15680c);
        String[] strArr2 = new String[c7160ij.m15355i() + 3];
        String valueOf = String.valueOf(m15681b(c7160ij, strArr2));
        String valueOf2 = String.valueOf(" OR (path > ? AND path < ?)");
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        strArr2[c7160ij.m15355i() + 1] = m15680c;
        strArr2[c7160ij.m15355i() + 2] = m15688a;
        return this.f23834c.query("serverCache", strArr, concat, strArr2, null, null, "path");
    }

    /* renamed from: a */
    private SQLiteDatabase m15696a(Context context, String str) {
        try {
            SQLiteDatabase writableDatabase = new C7065a(context, str).getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (SQLiteException e) {
            if (!(e instanceof SQLiteDatabaseLockedException)) {
                throw e;
            }
            throw new C9866d("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e);
        }
    }

    /* renamed from: a */
    private AbstractC7344lh m15684a(byte[] bArr) {
        try {
            return C7347li.m14735a(C7380mb.m14630b(new String(bArr, f23833b)));
        } catch (IOException e) {
            String valueOf = String.valueOf(new String(bArr, f23833b));
            throw new RuntimeException(valueOf.length() != 0 ? "Could not deserialize node: ".concat(valueOf) : new String("Could not deserialize node: "), e);
        }
    }

    /* renamed from: a */
    private String m15695a(C7160ij c7160ij, int i) {
        String valueOf = String.valueOf(m15680c(c7160ij));
        String valueOf2 = String.valueOf(String.format(".part-%04d", Integer.valueOf(i)));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private static String m15688a(String str) {
        if (f23832a || str.endsWith("/")) {
            String valueOf = String.valueOf(str.substring(0, str.length() - 1));
            return new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append('0').toString();
        }
        throw new AssertionError("Path keys must end with a '/'");
    }

    /* renamed from: a */
    private String m15686a(Collection<Long> collection) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        Iterator<Long> it2 = collection.iterator();
        while (true) {
            boolean z2 = z;
            if (it2.hasNext()) {
                long longValue = it2.next().longValue();
                if (!z2) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                z = false;
                sb.append(longValue);
            } else {
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    private static List<byte[]> m15683a(byte[] bArr, int i) {
        int length = ((bArr.length - 1) / i) + 1;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            int min = Math.min(i, bArr.length - (i2 * i));
            byte[] bArr2 = new byte[min];
            System.arraycopy(bArr, i2 * i, bArr2, 0, min);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m15694a(C7160ij c7160ij, long j, String str, byte[] bArr) {
        int i = 0;
        m15677h();
        this.f23834c.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        if (bArr.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("path", m15680c(c7160ij));
            contentValues.put("type", str);
            contentValues.put("part", (Integer) null);
            contentValues.put("node", bArr);
            this.f23834c.insertWithOnConflict("writes", null, contentValues, 5);
            return;
        }
        List<byte[]> m15683a = m15683a(bArr, (int) AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        while (true) {
            int i2 = i;
            if (i2 >= m15683a.size()) {
                return;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("id", Long.valueOf(j));
            contentValues2.put("path", m15680c(c7160ij));
            contentValues2.put("type", str);
            contentValues2.put("part", Integer.valueOf(i2));
            contentValues2.put("node", m15683a.get(i2));
            this.f23834c.insertWithOnConflict("writes", null, contentValues2, 5);
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    private void m15693a(C7160ij c7160ij, final C7160ij c7160ij2, C7271ju<Long> c7271ju, final C7271ju<Long> c7271ju2, C7259jr c7259jr, final List<C7389mh<C7160ij, AbstractC7344lh>> list) {
        if (c7271ju.m14990b() == null) {
            Iterator<Map.Entry<C7319kv, C7271ju<Long>>> it2 = c7271ju.m14987c().iterator();
            while (it2.hasNext()) {
                Map.Entry<C7319kv, C7271ju<Long>> next = it2.next();
                C7319kv key = next.getKey();
                m15693a(c7160ij, c7160ij2.m15368a(key), next.getValue(), c7271ju2.m14992a(key), c7259jr.m15041a(next.getKey()), list);
            }
            return;
        }
        int intValue = ((Integer) c7259jr.m15040a(0, new C7271ju.AbstractC7274a<Void, Integer>() { // from class: com.google.android.gms.internal.gx.1
            @Override // com.google.android.gms.internal.C7271ju.AbstractC7274a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public Integer mo14978a(C7160ij c7160ij3, Void r3, Integer num) {
                return Integer.valueOf(c7271ju2.m14981e(c7160ij3) == null ? num.intValue() + 1 : num.intValue());
            }
        })).intValue();
        if (intValue <= 0) {
            return;
        }
        C7160ij m15370a = c7160ij.m15370a(c7160ij2);
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Need to rewrite %d nodes below path %s", Integer.valueOf(intValue), m15370a), new Object[0]);
        }
        final AbstractC7344lh m15682b = m15682b(m15370a);
        c7259jr.m15040a(null, new C7271ju.AbstractC7274a<Void, Void>() { // from class: com.google.android.gms.internal.gx.2
            @Override // com.google.android.gms.internal.C7271ju.AbstractC7274a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public Void mo14978a(C7160ij c7160ij3, Void r6, Void r7) {
                if (c7271ju2.m14981e(c7160ij3) == null) {
                    list.add(new C7389mh(c7160ij2.m15370a(c7160ij3), m15682b.mo14750a(c7160ij3)));
                    return null;
                }
                return null;
            }
        });
    }

    /* renamed from: a */
    private void m15692a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh, boolean z) {
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (!z) {
            i2 = m15687a("serverCache", c7160ij);
            i = m15679c(c7160ij, abstractC7344lh);
        } else {
            i = 0;
            i2 = 0;
            for (C7343lg c7343lg : abstractC7344lh) {
                i2 += m15687a("serverCache", c7160ij.m15368a(c7343lg.m14752c()));
                i = m15679c(c7160ij.m15368a(c7343lg.m14752c()), c7343lg.m14751d()) + i;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", Integer.valueOf(i), Integer.valueOf(i2), c7160ij.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    /* renamed from: a */
    private byte[] m15689a(Object obj) {
        try {
            return C7380mb.m14637a(obj).getBytes(f23833b);
        } catch (IOException e) {
            throw new RuntimeException("Could not serialize leaf node", e);
        }
    }

    /* renamed from: a */
    private byte[] m15685a(List<byte[]> list) {
        int i = 0;
        for (byte[] bArr : list) {
            i = bArr.length + i;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : list) {
            System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            i2 = bArr3.length + i2;
        }
        return bArr2;
    }

    /* renamed from: b */
    private AbstractC7344lh m15682b(C7160ij c7160ij) {
        AbstractC7344lh m15684a;
        int i;
        C7160ij c7160ij2;
        boolean z;
        AbstractC7344lh mo14749a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor m15690a = m15690a(c7160ij, new String[]{"path", "value"});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        while (m15690a.moveToNext()) {
            try {
                arrayList.add(m15690a.getString(0));
                arrayList2.add(m15690a.getBlob(1));
            } catch (Throwable th) {
                m15690a.close();
                throw th;
            }
        }
        m15690a.close();
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        long currentTimeMillis5 = System.currentTimeMillis();
        AbstractC7344lh m14778j = C7335la.m14778j();
        boolean z2 = false;
        HashMap hashMap = new HashMap();
        int i2 = 0;
        while (i2 < arrayList2.size()) {
            if (arrayList.get(i2).endsWith(".part-0000")) {
                String str = arrayList.get(i2);
                C7160ij c7160ij3 = new C7160ij(str.substring(0, str.length() - ".part-0000".length()));
                int m15691a = m15691a(c7160ij3, arrayList, i2);
                if (this.f23835d.m14844a()) {
                    this.f23835d.m14840a(new StringBuilder(42).append("Loading split node with ").append(m15691a).append(" parts.").toString(), new Object[0]);
                }
                i = (i2 + m15691a) - 1;
                c7160ij2 = c7160ij3;
                m15684a = m15684a(m15685a(arrayList2.subList(i2, i2 + m15691a)));
            } else {
                m15684a = m15684a((byte[]) arrayList2.get(i2));
                i = i2;
                c7160ij2 = new C7160ij(arrayList.get(i2));
            }
            if (c7160ij2.m15357g() != null && c7160ij2.m15357g().m14822f()) {
                hashMap.put(c7160ij2, m15684a);
                z = z2;
                mo14749a = m14778j;
            } else if (c7160ij2.m15366b(c7160ij)) {
                C7392mk.m14606a(!z2, "Descendants of path must come after ancestors.");
                boolean z3 = z2;
                mo14749a = m15684a.mo14750a(C7160ij.m15369a(c7160ij2, c7160ij));
                z = z3;
            } else if (!c7160ij.m15366b(c7160ij2)) {
                throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", c7160ij2, c7160ij));
            } else {
                z = true;
                mo14749a = m14778j.mo14749a(C7160ij.m15369a(c7160ij, c7160ij2), m15684a);
            }
            i2 = i + 1;
            m14778j = mo14749a;
            z2 = z;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            m14778j = m14778j.mo14749a(C7160ij.m15369a(c7160ij, (C7160ij) entry.getKey()), (AbstractC7344lh) entry.getValue());
        }
        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
        long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", Integer.valueOf(arrayList2.size()), Integer.valueOf(C7387mf.m14619b(m14778j)), c7160ij, Long.valueOf(currentTimeMillis7), Long.valueOf(currentTimeMillis2), Long.valueOf(currentTimeMillis4), Long.valueOf(currentTimeMillis6)), new Object[0]);
        }
        return m14778j;
    }

    /* renamed from: b */
    private static String m15681b(C7160ij c7160ij, String[] strArr) {
        if (f23832a || strArr.length >= c7160ij.m15355i() + 1) {
            int i = 0;
            StringBuilder sb = new StringBuilder("(");
            while (!c7160ij.m15356h()) {
                sb.append("path");
                sb.append(" = ? OR ");
                strArr[i] = m15680c(c7160ij);
                c7160ij = c7160ij.m15359f();
                i++;
            }
            sb.append("path");
            sb.append(" = ?)");
            strArr[i] = m15680c(C7160ij.m15371a());
            return sb.toString();
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    private int m15679c(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        int i;
        int i2 = 0;
        long m14620a = C7387mf.m14620a(abstractC7344lh);
        if (!(abstractC7344lh instanceof C7322kw) || m14620a <= FimiMediaMeta.AV_CH_TOP_FRONT_RIGHT) {
            m15678d(c7160ij, abstractC7344lh);
            return 1;
        }
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", c7160ij, Long.valueOf(m14620a), 16384), new Object[0]);
        }
        Iterator<C7343lg> it2 = abstractC7344lh.iterator();
        while (true) {
            i = i2;
            if (!it2.hasNext()) {
                break;
            }
            C7343lg next = it2.next();
            i2 = m15679c(c7160ij.m15368a(next.m14752c()), next.m14751d()) + i;
        }
        if (!abstractC7344lh.mo14737f().mo14739b()) {
            m15678d(c7160ij.m15368a(C7319kv.m14825c()), abstractC7344lh.mo14737f());
            i++;
        }
        m15678d(c7160ij, C7335la.m14778j());
        return i + 1;
    }

    /* renamed from: c */
    private static String m15680c(C7160ij c7160ij) {
        return c7160ij.m15356h() ? "/" : String.valueOf(c7160ij.toString()).concat("/");
    }

    /* renamed from: d */
    private void m15678d(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        int i = 0;
        byte[] m15689a = m15689a(abstractC7344lh.mo14747a(true));
        if (m15689a.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", m15680c(c7160ij));
            contentValues.put("value", m15689a);
            this.f23834c.insertWithOnConflict("serverCache", null, contentValues, 5);
            return;
        }
        List<byte[]> m15683a = m15683a(m15689a, (int) AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(new StringBuilder(45).append("Saving huge leaf node with ").append(m15683a.size()).append(" parts.").toString(), new Object[0]);
        }
        while (true) {
            int i2 = i;
            if (i2 >= m15683a.size()) {
                return;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("path", m15695a(c7160ij, i2));
            contentValues2.put("value", m15683a.get(i2));
            this.f23834c.insertWithOnConflict("serverCache", null, contentValues2, 5);
            i = i2 + 1;
        }
    }

    /* renamed from: h */
    private void m15677h() {
        C7392mk.m14606a(this.f23836e, "Transaction expected to already be in progress.");
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: a */
    public AbstractC7344lh mo15061a(C7160ij c7160ij) {
        return m15682b(c7160ij);
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: a */
    public List<C7234iy> mo15065a() {
        byte[] m15685a;
        C7234iy c7234iy;
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f23834c.query("writes", new String[]{"id", "path", "type", "part", "node"}, null, null, null, null, "id, part");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    long j = query.getLong(0);
                    C7160ij c7160ij = new C7160ij(query.getString(1));
                    String string = query.getString(2);
                    if (query.isNull(3)) {
                        m15685a = query.getBlob(4);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        do {
                            arrayList2.add(query.getBlob(4));
                            if (!query.moveToNext()) {
                                break;
                            }
                        } while (query.getLong(0) == j);
                        query.moveToPrevious();
                        m15685a = m15685a((List<byte[]>) arrayList2);
                    }
                    Object m14630b = C7380mb.m14630b(new String(m15685a, f23833b));
                    if ("o".equals(string)) {
                        c7234iy = new C7234iy(j, c7160ij, C7347li.m14735a(m14630b), true);
                    } else if (!C0548a.f931b.equals(string)) {
                        String valueOf = String.valueOf(string);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Got invalid write type: ".concat(valueOf) : new String("Got invalid write type: "));
                    } else {
                        c7234iy = new C7234iy(j, c7160ij, C7142ia.m15429a((Map) m14630b));
                    }
                    arrayList.add(c7234iy);
                } catch (IOException e) {
                    throw new RuntimeException("Failed to load writes", e);
                }
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Loaded %d writes in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: a */
    public Set<C7319kv> mo15054a(Set<Long> set) {
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf("id IN (");
        String valueOf2 = String.valueOf(m15686a((Collection<Long>) set));
        Cursor query = this.f23834c.query(true, "trackedKeys", new String[]{"key"}, new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append(")").toString(), null, null, null, null, null);
        HashSet hashSet = new HashSet();
        while (query.moveToNext()) {
            try {
                hashSet.add(C7319kv.m14828a(query.getString(0)));
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Loaded %d tracked queries keys for tracked queries %s in %dms", Integer.valueOf(hashSet.size()), set.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        return hashSet;
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: a */
    public void mo15064a(long j) {
        m15677h();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.f23834c.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Deleted %d write(s) with writeId %d in %dms", Integer.valueOf(delete), Long.valueOf(j), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: a */
    public void mo15063a(long j, Set<C7319kv> set) {
        m15677h();
        long currentTimeMillis = System.currentTimeMillis();
        this.f23834c.delete("trackedKeys", "id = ?", new String[]{String.valueOf(j)});
        for (C7319kv c7319kv : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", c7319kv.m14823e());
            this.f23834c.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Set %d tracked query keys for tracked query %d in %dms", Integer.valueOf(set.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: a */
    public void mo15062a(long j, Set<C7319kv> set, Set<C7319kv> set2) {
        m15677h();
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(j);
        Iterator<C7319kv> it2 = set2.iterator();
        while (it2.hasNext()) {
            this.f23834c.delete("trackedKeys", "id = ? AND key = ?", new String[]{valueOf, it2.next().m14823e()});
        }
        for (C7319kv c7319kv : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", c7319kv.m14823e());
            this.f23834c.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: a */
    public void mo15060a(C7160ij c7160ij, C7142ia c7142ia) {
        m15677h();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<Map.Entry<C7160ij, AbstractC7344lh>> it2 = c7142ia.iterator();
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            Map.Entry<C7160ij, AbstractC7344lh> next = it2.next();
            i += m15687a("serverCache", c7160ij.m15370a(next.getKey()));
            i2 = m15679c(c7160ij.m15370a(next.getKey()), next.getValue()) + i2;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", Integer.valueOf(i2), Integer.valueOf(i), c7160ij.toString(), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: a */
    public void mo15059a(C7160ij c7160ij, C7142ia c7142ia, long j) {
        m15677h();
        long currentTimeMillis = System.currentTimeMillis();
        m15694a(c7160ij, j, C0548a.f931b, m15689a(c7142ia.m15428a(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Persisted user merge in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: a */
    public void mo15058a(C7160ij c7160ij, C7259jr c7259jr) {
        if (!c7259jr.m15043a()) {
            return;
        }
        m15677h();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor m15690a = m15690a(c7160ij, new String[]{MAutoDBItem.SYSTEM_ROWID_FIELD, "path"});
        C7271ju<Long> c7271ju = new C7271ju<>(null);
        C7271ju<Long> c7271ju2 = new C7271ju<>(null);
        while (m15690a.moveToNext()) {
            long j = m15690a.getLong(0);
            C7160ij c7160ij2 = new C7160ij(m15690a.getString(1));
            if (!c7160ij.m15366b(c7160ij2)) {
                C7315ks c7315ks = this.f23835d;
                String valueOf = String.valueOf(c7160ij);
                String valueOf2 = String.valueOf(c7160ij2);
                c7315ks.m14843a(new StringBuilder(String.valueOf(valueOf).length() + 67 + String.valueOf(valueOf2).length()).append("We are pruning at ").append(valueOf).append(" but we have data stored higher up at ").append(valueOf2).append(". Ignoring.").toString());
            } else {
                C7160ij m15369a = C7160ij.m15369a(c7160ij, c7160ij2);
                if (c7259jr.m15042a(m15369a)) {
                    c7271ju = c7271ju.m14995a(m15369a, (C7160ij) Long.valueOf(j));
                } else if (c7259jr.m15039b(m15369a)) {
                    c7271ju2 = c7271ju2.m14995a(m15369a, (C7160ij) Long.valueOf(j));
                } else {
                    C7315ks c7315ks2 = this.f23835d;
                    String valueOf3 = String.valueOf(c7160ij);
                    String valueOf4 = String.valueOf(c7160ij2);
                    c7315ks2.m14843a(new StringBuilder(String.valueOf(valueOf3).length() + 88 + String.valueOf(valueOf4).length()).append("We are pruning at ").append(valueOf3).append(" and have data at ").append(valueOf4).append(" that isn't marked for pruning or keeping. Ignoring.").toString());
                }
            }
        }
        int i = 0;
        int i2 = 0;
        if (!c7271ju.m14984d()) {
            ArrayList arrayList = new ArrayList();
            m15693a(c7160ij, C7160ij.m15371a(), c7271ju, c7271ju2, c7259jr, arrayList);
            Collection<Long> m14982e = c7271ju.m14982e();
            String valueOf5 = String.valueOf(m15686a(m14982e));
            this.f23834c.delete("serverCache", new StringBuilder(String.valueOf(valueOf5).length() + 11).append("rowid IN (").append(valueOf5).append(")").toString(), null);
            for (C7389mh<C7160ij, AbstractC7344lh> c7389mh : arrayList) {
                m15679c(c7160ij.m15370a(c7389mh.m14616a()), c7389mh.m14615b());
            }
            i = m14982e.size();
            i2 = arrayList.size();
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (!this.f23835d.m14844a()) {
            return;
        }
        this.f23835d.m14840a(String.format("Pruned %d rows with %d nodes resaved in %dms", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(currentTimeMillis2)), new Object[0]);
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: a */
    public void mo15057a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        m15677h();
        m15692a(c7160ij, abstractC7344lh, false);
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: a */
    public void mo15056a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh, long j) {
        m15677h();
        long currentTimeMillis = System.currentTimeMillis();
        m15694a(c7160ij, j, "o", m15689a(abstractC7344lh.mo14747a(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Persisted user overwrite in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: a */
    public void mo15055a(C7263js c7263js) {
        m15677h();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(c7263js.f24353a));
        contentValues.put("path", m15680c(c7263js.f24354b.m14900a()));
        contentValues.put("queryParams", c7263js.f24354b.m14897b().m14903p());
        contentValues.put("lastUse", Long.valueOf(c7263js.f24355c));
        contentValues.put("complete", Boolean.valueOf(c7263js.f24356d));
        contentValues.put("active", Boolean.valueOf(c7263js.f24357e));
        this.f23834c.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Saved new tracked query in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: b */
    public long mo15053b() {
        Cursor rawQuery = this.f23834c.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", "value", "path", "serverCache"), null);
        try {
            if (!rawQuery.moveToFirst()) {
                throw new IllegalStateException("Couldn't read database result!");
            }
            return rawQuery.getLong(0);
        } finally {
            rawQuery.close();
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: b */
    public void mo15052b(long j) {
        m15677h();
        String valueOf = String.valueOf(j);
        this.f23834c.delete("trackedQueries", "id = ?", new String[]{valueOf});
        this.f23834c.delete("trackedKeys", "id = ?", new String[]{valueOf});
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: b */
    public void mo15051b(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        m15677h();
        m15692a(c7160ij, abstractC7344lh, true);
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: c */
    public List<C7263js> mo15050c() {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f23834c.query("trackedQueries", new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"}, null, null, null, null, "id");
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    arrayList.add(new C7263js(query.getLong(0), C7296kg.m14898a(new C7160ij(query.getString(1)), C7380mb.m14635a(query.getString(2))), query.getLong(3), query.getInt(4) != 0, query.getInt(5) != 0));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } finally {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Loaded %d tracked queries in %dms", Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: c */
    public void mo15049c(long j) {
        m15677h();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", (Boolean) false);
        contentValues.put("lastUse", Long.valueOf(j));
        this.f23834c.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Reset active tracked queries in %dms", Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: d */
    public Set<C7319kv> mo15047d(long j) {
        return mo15054a(Collections.singleton(Long.valueOf(j)));
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: d */
    public void mo15048d() {
        m15677h();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.f23834c.delete("writes", null, null);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Deleted %d (all) write(s) in %dms", Integer.valueOf(delete), Long.valueOf(currentTimeMillis2)), new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: e */
    public void mo15046e() {
        C7392mk.m14606a(!this.f23836e, "runInTransaction called when an existing transaction is already in progress.");
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a("Starting transaction.", new Object[0]);
        }
        this.f23834c.beginTransaction();
        this.f23836e = true;
        this.f23837f = System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: f */
    public void mo15045f() {
        this.f23834c.endTransaction();
        this.f23836e = false;
        long currentTimeMillis = System.currentTimeMillis() - this.f23837f;
        if (this.f23835d.m14844a()) {
            this.f23835d.m14840a(String.format("Transaction completed. Elapsed: %dms", Long.valueOf(currentTimeMillis)), new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7258jq
    /* renamed from: g */
    public void mo15044g() {
        this.f23834c.setTransactionSuccessful();
    }
}
