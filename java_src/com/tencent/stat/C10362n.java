package com.tencent.stat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.stat.common.C10346k;
import com.tencent.stat.common.StatLogger;
import com.tencent.stat.p268a.AbstractC10327e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.tencent.stat.n */
/* loaded from: classes2.dex */
public class C10362n {

    /* renamed from: e */
    private static StatLogger f32287e = C10346k.m5425b();

    /* renamed from: f */
    private static C10362n f32288f = null;

    /* renamed from: a */
    Handler f32289a;

    /* renamed from: d */
    private C10371w f32292d;

    /* renamed from: b */
    volatile int f32290b = 0;

    /* renamed from: c */
    DeviceInfo f32291c = null;

    /* renamed from: g */
    private HashMap<String, String> f32293g = new HashMap<>();

    private C10362n(Context context) {
        this.f32289a = null;
        try {
            HandlerThread handlerThread = new HandlerThread("StatStore");
            handlerThread.start();
            f32287e.m5461w("Launch store thread:" + handlerThread);
            this.f32289a = new Handler(handlerThread.getLooper());
            Context applicationContext = context.getApplicationContext();
            this.f32292d = new C10371w(applicationContext);
            this.f32292d.getWritableDatabase();
            this.f32292d.getReadableDatabase();
            m5349b(applicationContext);
            m5343c();
            m5339f();
            this.f32289a.post(new RunnableC10363o(this));
        } catch (Throwable th) {
            f32287e.m5464e(th);
        }
    }

    /* renamed from: a */
    public static synchronized C10362n m5362a(Context context) {
        C10362n c10362n;
        synchronized (C10362n.class) {
            if (f32288f == null) {
                f32288f = new C10362n(context);
            }
            c10362n = f32288f;
        }
        return c10362n;
    }

    /* renamed from: b */
    public static C10362n m5351b() {
        return f32288f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m5350b(int i) {
        try {
            if (this.f32290b > 0 && i > 0) {
                f32287e.m5463i("Load " + Integer.toString(this.f32290b) + " unsent events");
                ArrayList arrayList = new ArrayList();
                ArrayList<C10372x> arrayList2 = new ArrayList();
                if (i == -1 || i > StatConfig.m5528a()) {
                    i = StatConfig.m5528a();
                }
                this.f32290b -= i;
                m5342c(arrayList2, i);
                f32287e.m5463i("Peek " + Integer.toString(arrayList2.size()) + " unsent events.");
                if (!arrayList2.isEmpty()) {
                    m5344b(arrayList2, 2);
                    for (C10372x c10372x : arrayList2) {
                        arrayList.add(c10372x.f32312b);
                    }
                    C10352d.m5372b().m5371b(arrayList, new C10369u(this, arrayList2, i));
                }
            }
        } catch (Throwable th) {
            f32287e.m5464e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m5348b(AbstractC10327e abstractC10327e, AbstractC10335c abstractC10335c) {
        if (StatConfig.getMaxStoreEventCount() > 0) {
            this.f32292d.getWritableDatabase().beginTransaction();
            if (this.f32290b > StatConfig.getMaxStoreEventCount()) {
                f32287e.warn("Too many events stored in db.");
                this.f32290b -= this.f32292d.getWritableDatabase().delete("events", "event_id in (select event_id from events where timestamp in (select min(timestamp) from events) limit 1)", null);
            }
            ContentValues contentValues = new ContentValues();
            String m5419c = C10346k.m5419c(abstractC10327e.m5473d());
            contentValues.put("content", m5419c);
            contentValues.put("send_count", "0");
            contentValues.put("status", Integer.toString(1));
            contentValues.put("timestamp", Long.valueOf(abstractC10327e.m5476b()));
            if (this.f32292d.getWritableDatabase().insert("events", null, contentValues) == -1) {
                f32287e.error("Failed to store event:" + m5419c);
            } else {
                this.f32290b++;
                this.f32292d.getWritableDatabase().setTransactionSuccessful();
                if (abstractC10335c != null) {
                    abstractC10335c.mo5338a();
                }
            }
            try {
                this.f32292d.getWritableDatabase().endTransaction();
            } catch (Throwable th) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m5347b(C10334b c10334b) {
        Cursor cursor;
        boolean z;
        long insert;
        try {
            String m5468a = c10334b.m5468a();
            String m5429a = C10346k.m5429a(m5468a);
            ContentValues contentValues = new ContentValues();
            contentValues.put("content", c10334b.f32204b.toString());
            contentValues.put("md5sum", m5429a);
            c10334b.f32205c = m5429a;
            contentValues.put("version", Integer.valueOf(c10334b.f32206d));
            cursor = this.f32292d.getReadableDatabase().query("config", null, null, null, null, null, null);
            while (true) {
                try {
                    if (!cursor.moveToNext()) {
                        z = false;
                        break;
                    } else if (cursor.getInt(0) == c10334b.f32203a) {
                        z = true;
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    f32287e.m5464e(th);
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
            if (true == z) {
                insert = this.f32292d.getWritableDatabase().update("config", contentValues, "type=?", new String[]{Integer.toString(c10334b.f32203a)});
            } else {
                contentValues.put("type", Integer.valueOf(c10334b.f32203a));
                insert = this.f32292d.getWritableDatabase().insert("config", null, contentValues);
            }
            if (insert == -1) {
                f32287e.m5464e("Failed to store cfg:" + m5468a);
            } else {
                f32287e.m5466d("Sucessed to store cfg:" + m5468a);
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        if (cursor != null) {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m5345b(List<C10372x> list) {
        f32287e.m5463i("Delete " + list.size() + " sent events in thread:" + Thread.currentThread());
        this.f32292d.getWritableDatabase().beginTransaction();
        Iterator<C10372x> it2 = list.iterator();
        while (it2.hasNext()) {
            this.f32290b -= this.f32292d.getWritableDatabase().delete("events", "event_id = ?", new String[]{Long.toString(it2.next().f32311a)});
        }
        this.f32292d.getWritableDatabase().setTransactionSuccessful();
        this.f32290b = (int) DatabaseUtils.queryNumEntries(this.f32292d.getReadableDatabase(), "events");
        try {
            this.f32292d.getWritableDatabase().endTransaction();
        } catch (SQLiteException e) {
            f32287e.m5465e((Exception) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m5344b(List<C10372x> list, int i) {
        int update;
        f32287e.m5463i("Update " + list.size() + " sending events to status:" + i + " in thread:" + Thread.currentThread());
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.toString(i));
        this.f32292d.getWritableDatabase().beginTransaction();
        for (C10372x c10372x : list) {
            if (c10372x.f32314d + 1 > StatConfig.getMaxSendRetryCount()) {
                this.f32290b -= this.f32292d.getWritableDatabase().delete("events", "event_id=?", new String[]{Long.toString(c10372x.f32311a)});
            } else {
                contentValues.put("send_count", Integer.valueOf(c10372x.f32314d + 1));
                f32287e.m5463i("Update event:" + c10372x.f32311a + " for content:" + contentValues);
                if (this.f32292d.getWritableDatabase().update("events", contentValues, "event_id=?", new String[]{Long.toString(c10372x.f32311a)}) <= 0) {
                    f32287e.m5464e("Failed to update db, error code:" + Integer.toString(update));
                }
            }
        }
        this.f32292d.getWritableDatabase().setTransactionSuccessful();
        this.f32290b = (int) DatabaseUtils.queryNumEntries(this.f32292d.getReadableDatabase(), "events");
        try {
            this.f32292d.getWritableDatabase().endTransaction();
        } catch (SQLiteException e) {
            f32287e.m5465e((Exception) e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:40)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    /* renamed from: c */
    private void m5342c(java.util.List<com.tencent.stat.C10372x> r11, int r12) {
        /*
            r10 = this;
            r9 = 0
            com.tencent.stat.w r0 = r10.f32292d     // Catch: java.lang.Throwable -> L6a
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "events"
            r2 = 0
            java.lang.String r3 = "status=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L6a
            r5 = 0
            r6 = 1
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch: java.lang.Throwable -> L6a
            r4[r5] = r6     // Catch: java.lang.Throwable -> L6a
            r5 = 0
            r6 = 0
            java.lang.String r7 = "event_id"
            java.lang.String r8 = java.lang.Integer.toString(r12)     // Catch: java.lang.Throwable -> L6a
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6a
        L23:
            boolean r0 = r7.moveToNext()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L57
            r0 = 0
            long r2 = r7.getLong(r0)     // Catch: java.lang.Throwable -> L4a
            r0 = 1
            java.lang.String r0 = r7.getString(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = com.tencent.stat.common.C10346k.m5416d(r0)     // Catch: java.lang.Throwable -> L4a
            r0 = 2
            int r5 = r7.getInt(r0)     // Catch: java.lang.Throwable -> L4a
            r0 = 3
            int r6 = r7.getInt(r0)     // Catch: java.lang.Throwable -> L4a
            com.tencent.stat.x r1 = new com.tencent.stat.x     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L4a
            r11.add(r1)     // Catch: java.lang.Throwable -> L4a
            goto L23
        L4a:
            r0 = move-exception
            r1 = r7
        L4c:
            com.tencent.stat.common.StatLogger r2 = com.tencent.stat.C10362n.f32287e     // Catch: java.lang.Throwable -> L67
            r2.m5464e(r0)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L56
            r1.close()
        L56:
            return
        L57:
            if (r7 == 0) goto L56
            r7.close()
            goto L56
        L5d:
            r0 = move-exception
        L5e:
            if (r9 == 0) goto L63
            r9.close()
        L63:
            throw r0
        L64:
            r0 = move-exception
            r9 = r7
            goto L5e
        L67:
            r0 = move-exception
            r9 = r1
            goto L5e
        L6a:
            r0 = move-exception
            r1 = r9
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.stat.C10362n.m5342c(java.util.List, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m5340e() {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", (Integer) 1);
            this.f32292d.getWritableDatabase().update("events", contentValues, "status=?", new String[]{Long.toString(2L)});
            this.f32290b = (int) DatabaseUtils.queryNumEntries(this.f32292d.getReadableDatabase(), "events");
            f32287e.m5463i("Total " + this.f32290b + " unsent events.");
        } catch (Throwable th) {
            f32287e.m5464e(th);
        }
    }

    /* renamed from: f */
    private void m5339f() {
        Cursor cursor;
        try {
            cursor = this.f32292d.getReadableDatabase().query("keyvalues", null, null, null, null, null, null);
            while (cursor.moveToNext()) {
                try {
                    this.f32293g.put(cursor.getString(0), cursor.getString(1));
                } catch (Throwable th) {
                    th = th;
                    try {
                        f32287e.m5464e(th);
                        if (cursor == null) {
                            return;
                        }
                        return;
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
            if (cursor == null) {
                return;
            }
            cursor.close();
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* renamed from: a */
    public int m5364a() {
        return this.f32290b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5363a(int i) {
        this.f32289a.post(new RunnableC10370v(this, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5361a(AbstractC10327e abstractC10327e, AbstractC10335c abstractC10335c) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        try {
            if (Thread.currentThread().getId() == this.f32289a.getLooper().getThread().getId()) {
                m5348b(abstractC10327e, abstractC10335c);
            } else {
                this.f32289a.post(new RunnableC10366r(this, abstractC10327e, abstractC10335c));
            }
        } catch (Throwable th) {
            f32287e.m5464e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5360a(C10334b c10334b) {
        if (c10334b == null) {
            return;
        }
        this.f32289a.post(new RunnableC10367s(this, c10334b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5353a(List<C10372x> list) {
        try {
            if (Thread.currentThread().getId() == this.f32289a.getLooper().getThread().getId()) {
                m5345b(list);
            } else {
                this.f32289a.post(new RunnableC10365q(this, list));
            }
        } catch (SQLiteException e) {
            f32287e.m5465e((Exception) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5352a(List<C10372x> list, int i) {
        try {
            if (Thread.currentThread().getId() == this.f32289a.getLooper().getThread().getId()) {
                m5344b(list, i);
            } else {
                this.f32289a.post(new RunnableC10364p(this, list, i));
            }
        } catch (Throwable th) {
            f32287e.m5464e(th);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:40)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    /* renamed from: b */
    public synchronized com.tencent.stat.DeviceInfo m5349b(android.content.Context r20) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.stat.C10362n.m5349b(android.content.Context):com.tencent.stat.DeviceInfo");
    }

    /* renamed from: c */
    void m5343c() {
        this.f32289a.post(new RunnableC10368t(this));
    }
}
