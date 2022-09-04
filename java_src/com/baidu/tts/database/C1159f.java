package com.baidu.tts.database;

import android.database.sqlite.SQLiteDatabase;
/* renamed from: com.baidu.tts.database.f */
/* loaded from: classes.dex */
public class C1159f {

    /* renamed from: a */
    private SQLiteDatabase f2765a;

    /* renamed from: b */
    private AbstractC1160a f2766b;

    /* renamed from: com.baidu.tts.database.f$a */
    /* loaded from: classes.dex */
    public interface AbstractC1160a {
        /* renamed from: a */
        boolean mo36361a(SQLiteDatabase sQLiteDatabase);
    }

    public C1159f(SQLiteDatabase sQLiteDatabase, AbstractC1160a abstractC1160a) {
        this.f2765a = sQLiteDatabase;
        this.f2766b = abstractC1160a;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: a */
    public boolean m36362a() {
        boolean z = false;
        if (this.f2766b != null && this.f2765a != null) {
            try {
                try {
                    this.f2765a.beginTransaction();
                    z = this.f2766b.mo36361a(this.f2765a);
                    if (z) {
                        this.f2765a.setTransactionSuccessful();
                    }
                    if (this.f2765a != null) {
                        this.f2765a.endTransaction();
                        this.f2765a.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (this.f2765a != null) {
                        this.f2765a.endTransaction();
                        this.f2765a.close();
                    }
                }
            } catch (Throwable th) {
                if (this.f2765a != null) {
                    this.f2765a.endTransaction();
                    this.f2765a.close();
                }
                throw th;
            }
        }
        return z;
    }
}
