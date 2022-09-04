package com.fimi.kernel.p158b.p160b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.fimi.kernel.p158b.p160b.C1600b;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.fimi.kernel.b.b.f */
/* loaded from: classes.dex */
public class C1617f {

    /* renamed from: a */
    private static C1617f f4004a = null;

    /* renamed from: b */
    private SQLiteDatabase f4005b;

    /* renamed from: c */
    private Context f4006c;

    /* renamed from: com.fimi.kernel.b.b.f$a */
    /* loaded from: classes.dex */
    public interface AbstractC1619a {
        /* renamed from: a */
        void mo34955a(C1600b c1600b);
    }

    private C1617f(Context context) {
        this.f4005b = null;
        this.f4006c = context;
        try {
            this.f4005b = new C1599a(context).getWritableDatabase();
        } catch (Exception e) {
            Log.d("ljh", e.getMessage());
        }
    }

    /* renamed from: a */
    public static C1617f m34967a(Context context) {
        if (context == null) {
            return null;
        }
        if (f4004a == null) {
            f4004a = new C1617f(context);
            f4004a.f4006c = context;
        }
        return f4004a;
    }

    /* renamed from: d */
    private SQLiteDatabase m34958d() {
        try {
            return new C1599a(this.f4006c).getWritableDatabase();
        } catch (Exception e) {
            Log.d("Good", e + "");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #5 {, blocks: (B:12:0x003a, B:29:0x0055, B:30:0x0058, B:24:0x004a), top: B:3:0x0002 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized C1600b m34966a(Context context, String str, final AbstractC1619a abstractC1619a) {
        Cursor cursor;
        Cursor cursor2;
        C1600b c1600b;
        Exception exc;
        try {
            cursor = f4004a.f4005b.rawQuery("select url,local_uri,file_size from download_task where url=?", new String[]{str});
            C1600b c1600b2 = null;
            while (cursor.moveToNext()) {
                try {
                    c1600b2 = C1600b.m35054a(context, cursor.getString(0), cursor.getLong(2), false, cursor.getString(1), new C1600b.AbstractC1607e() { // from class: com.fimi.kernel.b.b.f.1
                        @Override // com.fimi.kernel.p158b.p160b.C1600b.AbstractC1607e
                        /* renamed from: a */
                        public void mo34956a(C1600b c1600b3) {
                            if (abstractC1619a != null) {
                                abstractC1619a.mo34955a(c1600b3);
                            }
                        }
                    });
                } catch (Exception e) {
                    exc = e;
                    cursor2 = cursor;
                    c1600b = c1600b2;
                    try {
                        exc.printStackTrace();
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        return c1600b;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
                c1600b = c1600b2;
            } else {
                c1600b = c1600b2;
            }
        } catch (Exception e2) {
            cursor2 = null;
            c1600b = null;
            exc = e2;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        return c1600b;
    }

    /* renamed from: a */
    public List<String> m34969a() {
        Cursor cursor = null;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                cursor = f4004a.f4005b.rawQuery("select url from download_info group by url", null);
                while (cursor.moveToNext()) {
                    arrayList.add(cursor.getString(0));
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized void m34968a(int i, long j, String str) {
        try {
            f4004a.f4005b.beginTransaction();
            f4004a.f4005b.execSQL("update download_info set compelete_size=? where thread_id=? and url=?", new Object[]{Long.valueOf(j), Integer.valueOf(i), str});
            f4004a.f4005b.setTransactionSuccessful();
            try {
                f4004a.f4005b.endTransaction();
            } catch (Exception e) {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            try {
                f4004a.f4005b.endTransaction();
            } catch (Exception e3) {
            }
        }
    }

    /* renamed from: a */
    public synchronized void m34965a(C1600b c1600b) {
        try {
            f4004a.f4005b.execSQL("insert into download_task(url,local_uri,file_size,dur) values (?,?,?,?)", new Object[]{c1600b.m35012m(), c1600b.m35022h(), Long.valueOf(c1600b.m35020i()), c1600b.m35056a()});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public synchronized void m34963a(List<C1614d> list) {
        try {
            for (C1614d c1614d : list) {
                f4004a.f4005b.execSQL("insert into download_info(thread_id,start_pos, end_pos,compelete_size,url) values (?,?,?,?,?)", new Object[]{Integer.valueOf(c1614d.m34979b()), Long.valueOf(c1614d.m34977c()), Long.valueOf(c1614d.m34975d()), Long.valueOf(c1614d.m34974e()), c1614d.m34983a()});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public synchronized boolean m34964a(String str) {
        int i;
        boolean z = true;
        synchronized (this) {
            Cursor cursor = null;
            try {
                cursor = f4004a.f4005b.rawQuery("select count(*)  from download_info where url=?", new String[]{str});
                i = cursor.moveToFirst() ? cursor.getInt(0) : -1;
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                    i = -1;
                } else {
                    i = -1;
                }
            }
            if (i <= 0) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0055 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #5 {, blocks: (B:30:0x004a, B:34:0x003b, B:39:0x0055, B:40:0x0058), top: B:3:0x0002 }] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized C1600b m34961b(String str) {
        Cursor cursor;
        C1600b c1600b;
        Exception e;
        C1600b c1600b2 = null;
        synchronized (this) {
            try {
                c1600b = "select url,local_uri,dur from download_task where url=?";
                cursor = f4004a.f4005b.rawQuery(c1600b, new String[]{str});
                while (true) {
                    try {
                        try {
                            c1600b = c1600b2;
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            c1600b2 = new C1600b(cursor.getString(0), cursor.getString(1));
                            try {
                                c1600b = cursor.getString(2);
                                if (c1600b != null) {
                                    c1600b = cursor.getString(2);
                                    c1600b2.m35041a(c1600b);
                                }
                            } catch (Exception e2) {
                                c1600b = c1600b2;
                                e = e2;
                                e.printStackTrace();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return c1600b;
                            }
                        } catch (Exception e3) {
                            e = e3;
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
            } catch (Exception e4) {
                cursor = null;
                c1600b = null;
                e = e4;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        }
        return c1600b;
    }

    /* renamed from: b */
    public synchronized List<C1600b> m34962b() {
        ArrayList arrayList;
        Cursor cursor = null;
        synchronized (this) {
            arrayList = new ArrayList();
            try {
                cursor = f4004a.f4005b.rawQuery("select url,local_uri from download_task", null);
                cursor.moveToFirst();
                while (cursor.moveToNext()) {
                    arrayList.add(new C1600b(cursor.getString(0), cursor.getString(1)));
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058 A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:16:0x004d, B:23:0x0046, B:28:0x0058, B:29:0x005b), top: B:2:0x0001 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized List<C1614d> m34959c(String str) {
        ArrayList arrayList;
        Cursor cursor;
        arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            cursor = f4004a.f4005b.rawQuery("select thread_id, start_pos, end_pos,compelete_size,url from download_info where url=?", new String[]{str});
            while (cursor.moveToNext()) {
                try {
                    arrayList.add(new C1614d(cursor.getInt(0), cursor.getLong(1), cursor.getLong(2), cursor.getLong(3), cursor.getString(4)));
                } catch (Exception e) {
                    e = e;
                    cursor2 = cursor;
                    try {
                        e.printStackTrace();
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized void m34960c() {
        try {
            f4004a.f4005b.execSQL("DELETE FROM download_info");
            f4004a.f4005b.execSQL("DELETE FROM download_task");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public synchronized void m34957d(String str) {
        try {
            f4004a.f4005b.delete("download_info", "url=?", new String[]{str});
            f4004a.f4005b.delete("download_task", "url=?", new String[]{str});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void finalize() {
        this.f4005b.close();
        super.finalize();
    }
}
