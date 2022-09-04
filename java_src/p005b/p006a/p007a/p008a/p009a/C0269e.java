package p005b.p006a.p007a.p008a.p009a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p005b.p006a.p007a.p008a.p011c.C0275a;
import p005b.p006a.p007a.p008a.p011c.p012a.AbstractC0277b;
import p005b.p006a.p007a.p008a.p011c.p012a.C0278c;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p008a.p026n.AbstractC0367e;
import p005b.p006a.p007a.p008a.p026n.C0378p;
import p005b.p006a.p007a.p008a.p026n.C0380r;
import p005b.p006a.p007a.p029b.AbstractC0689q;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p030a.AbstractC0402a;
/* renamed from: b.a.a.a.a.e */
/* loaded from: classes.dex */
public class C0269e extends AbstractC0689q<AbstractC0366d> {

    /* renamed from: f */
    private static final int f143f = 1;

    /* renamed from: g */
    private static final int f144g = 2;

    /* renamed from: h */
    private static final int f145h = 3;

    /* renamed from: i */
    private static final int f146i = 4;

    /* renamed from: m */
    private static final int f147m = 5;

    /* renamed from: n */
    private static final int f148n = 6;

    /* renamed from: o */
    private static final int f149o = 7;

    /* renamed from: p */
    private static final int f150p = 11;

    /* renamed from: q */
    private static final int f151q = 12;

    /* renamed from: r */
    private static final int f152r = 13;

    /* renamed from: u */
    private static final int f153u = 14;

    /* renamed from: v */
    private static final short f154v = 1;

    /* renamed from: w */
    private static final short f155w = 2;

    /* renamed from: a */
    private SQLiteDatabase f156a;

    /* renamed from: b */
    private String f157b;

    /* renamed from: c */
    private String f158c;

    /* renamed from: d */
    private String f159d;

    /* renamed from: e */
    private AbstractC0277b f160e;

    /* renamed from: a */
    private long m39828a(AbstractC0366d abstractC0366d, SQLiteStatement sQLiteStatement) {
        m39835a(sQLiteStatement, abstractC0366d);
        m39833a(sQLiteStatement, abstractC0366d.mo39536d());
        m39832a(sQLiteStatement, abstractC0366d.mo39531i());
        try {
            return sQLiteStatement.executeInsert();
        } catch (SQLiteException e) {
            c("Failed to insert loggingEvent", e);
            return -1L;
        }
    }

    /* renamed from: a */
    private void m39835a(SQLiteStatement sQLiteStatement, AbstractC0366d abstractC0366d) {
        sQLiteStatement.bindLong(1, abstractC0366d.mo39526n());
        sQLiteStatement.bindString(2, abstractC0366d.mo39535e());
        sQLiteStatement.bindString(3, abstractC0366d.mo39534f());
        sQLiteStatement.bindString(4, abstractC0366d.mo39538b().toString());
        sQLiteStatement.bindString(5, abstractC0366d.mo39540a());
        sQLiteStatement.bindLong(6, m39825b(abstractC0366d));
    }

    /* renamed from: a */
    private void m39834a(SQLiteStatement sQLiteStatement, String str, short s, long j) {
        sQLiteStatement.bindLong(1, j);
        sQLiteStatement.bindLong(2, s);
        sQLiteStatement.bindString(3, str);
        sQLiteStatement.executeInsert();
    }

    /* renamed from: a */
    private void m39833a(SQLiteStatement sQLiteStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        for (int i = 0; i < length && i < 4; i++) {
            sQLiteStatement.bindString(i + 7, m39824b(objArr[i]));
        }
    }

    /* renamed from: a */
    private void m39832a(SQLiteStatement sQLiteStatement, StackTraceElement[] stackTraceElementArr) {
        StackTraceElement stackTraceElement;
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0 || (stackTraceElement = stackTraceElementArr[0]) == null) {
            return;
        }
        sQLiteStatement.bindString(11, stackTraceElement.getFileName());
        sQLiteStatement.bindString(12, stackTraceElement.getClassName());
        sQLiteStatement.bindString(13, stackTraceElement.getMethodName());
        sQLiteStatement.bindString(14, Integer.toString(stackTraceElement.getLineNumber()));
    }

    /* renamed from: a */
    private void m39829a(AbstractC0366d abstractC0366d, long j) {
        m39826a(m39823c(abstractC0366d), j);
        if (abstractC0366d.mo39532h() != null) {
            m39827a(abstractC0366d.mo39532h(), j);
        }
    }

    /* renamed from: a */
    private void m39827a(AbstractC0367e abstractC0367e, long j) {
        SQLiteStatement compileStatement = this.f156a.compileStatement(this.f158c);
        short s = 0;
        while (abstractC0367e != null) {
            try {
                StringBuilder sb = new StringBuilder();
                C0380r.m39495b(sb, abstractC0367e);
                m39834a(compileStatement, sb.toString(), s, j);
                int mo39486d = abstractC0367e.mo39486d();
                C0378p[] mo39487c = abstractC0367e.mo39487c();
                s = (short) (s + f154v);
                int i = 0;
                while (i < mo39487c.length - mo39486d) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('\t');
                    C0380r.m39494b(sb2, mo39487c[i]);
                    String sb3 = sb2.toString();
                    short s2 = (short) (s + f154v);
                    m39834a(compileStatement, sb3, s, j);
                    i++;
                    s = s2;
                }
                if (mo39486d > 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append('\t').append("... ").append(mo39486d).append(" common frames omitted");
                    m39834a(compileStatement, sb4.toString(), s, j);
                    s = (short) (s + f154v);
                }
                abstractC0367e = abstractC0367e.mo39485e();
            } finally {
                compileStatement.close();
            }
        }
    }

    /* renamed from: a */
    private void m39826a(Map<String, String> map, long j) {
        if (map.size() > 0) {
            SQLiteStatement compileStatement = this.f156a.compileStatement(this.f157b);
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    compileStatement.bindLong(1, j);
                    compileStatement.bindString(2, entry.getKey());
                    compileStatement.bindString(3, entry.getValue());
                    compileStatement.executeInsert();
                }
            } finally {
                compileStatement.close();
            }
        }
    }

    /* renamed from: b */
    private String m39824b(Object obj) {
        String str = null;
        if (obj != null) {
            str = obj.toString();
        }
        if (str != null && str.length() > 254) {
            str = str.substring(0, 254);
        }
        return str == null ? "" : str;
    }

    /* renamed from: b */
    private static short m39825b(AbstractC0366d abstractC0366d) {
        short s = 0;
        int size = abstractC0366d.mo39528l() != null ? abstractC0366d.mo39528l().keySet().size() : 0;
        int size2 = abstractC0366d.mo39533g().m39558b() != null ? abstractC0366d.mo39533g().m39558b().size() : 0;
        if (size > 0 || size2 > 0) {
            s = f154v;
        }
        return abstractC0366d.mo39532h() != null ? (short) (s | f155w) : s;
    }

    /* renamed from: c */
    private Map<String, String> m39823c(AbstractC0366d abstractC0366d) {
        HashMap hashMap = new HashMap();
        Map<String, String> m39558b = abstractC0366d.mo39533g().m39558b();
        if (m39558b != null) {
            hashMap.putAll(m39558b);
        }
        Map<String, String> mo39528l = abstractC0366d.mo39528l();
        if (mo39528l != null) {
            hashMap.putAll(mo39528l);
        }
        return hashMap;
    }

    /* renamed from: a */
    public void m39831a(AbstractC0277b abstractC0277b) {
        this.f160e = abstractC0277b;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0689q
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo38482a(AbstractC0366d abstractC0366d) {
        if (b_()) {
            try {
                SQLiteStatement compileStatement = this.f156a.compileStatement(this.f159d);
                this.f156a.beginTransaction();
                long m39828a = m39828a(abstractC0366d, compileStatement);
                if (m39828a != -1) {
                    m39829a(abstractC0366d, m39828a);
                    this.f156a.setTransactionSuccessful();
                }
                if (this.f156a.inTransaction()) {
                    this.f156a.endTransaction();
                }
                compileStatement.close();
            } catch (Throwable th) {
                a("Cannot append event", th);
            }
        }
    }

    protected void finalize() {
        this.f156a.close();
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0689q, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        String str = null;
        boolean z = true;
        this.f1233j = false;
        if (c_() != null) {
            str = c_().mo38529a(C0494h.f698S);
        }
        if (str == null || str.length() == 0) {
            c("Cannot create database without package name");
            return;
        }
        try {
            File file = new File(AbstractC0402a.m39414b(str), "logback.db");
            file.getParentFile().mkdirs();
            this.f156a = SQLiteDatabase.openOrCreateDatabase(file.getPath(), (SQLiteDatabase.CursorFactory) null);
        } catch (SQLiteException e) {
            a("Cannot open database", e);
            z = false;
        }
        if (!z) {
            return;
        }
        if (this.f160e == null) {
            this.f160e = new C0278c();
        }
        this.f158c = C0275a.m39815b(this.f160e);
        this.f157b = C0275a.m39816a(this.f160e);
        this.f159d = C0275a.m39814c(this.f160e);
        try {
            this.f156a.execSQL(C0275a.m39813d(this.f160e));
            this.f156a.execSQL(C0275a.m39812e(this.f160e));
            this.f156a.execSQL(C0275a.m39811f(this.f160e));
            super.mo38474j();
            this.f1233j = true;
        } catch (SQLiteException e2) {
            a("Cannot create database tables", e2);
        }
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0689q, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f156a.close();
    }
}
