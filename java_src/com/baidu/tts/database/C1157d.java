package com.baidu.tts.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p112l.C1202a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.baidu.tts.database.d */
/* loaded from: classes.dex */
public class C1157d {

    /* renamed from: a */
    private C1202a f2760a;

    /* renamed from: b */
    private C1156c f2761b;

    /* renamed from: c */
    private ReadWriteLock f2762c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private Lock f2763d = this.f2762c.writeLock();

    /* renamed from: e */
    private Lock f2764e = this.f2762c.readLock();

    public C1157d(C1202a c1202a) {
        this.f2760a = c1202a;
        this.f2761b = new C1156c(this.f2760a.m36231d());
    }

    /* renamed from: b */
    private SQLiteDatabase m36366b() {
        return this.f2761b.getWritableDatabase();
    }

    /* renamed from: c */
    private SQLiteDatabase m36365c() {
        return this.f2761b.getReadableDatabase();
    }

    /* renamed from: a */
    public int m36369a(int i, int i2) {
        this.f2763d.lock();
        SQLiteDatabase m36365c = m36365c();
        try {
            int delete = m36365c.delete("StatisticsInfo", "id between ? and ?", new String[]{Integer.toString(i), Integer.toString(i2)});
            LoggerProxy.m36554d("StatisticsDbManager", "delete database=" + delete + "=" + i + "=" + i2);
            return delete;
        } finally {
            m36365c.close();
            this.f2763d.unlock();
        }
    }

    /* renamed from: a */
    public int m36367a(String str, String str2, String str3) {
        this.f2763d.lock();
        SQLiteDatabase m36366b = m36366b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(str2, str3);
            int update = m36366b.update("StatisticsInfo", contentValues, "uuid=?", new String[]{str});
            if (update == 0) {
                m36366b.insert("StatisticsInfo", null, contentValues);
            }
            return update;
        } finally {
            m36366b.close();
            this.f2763d.unlock();
        }
    }

    /* renamed from: a */
    public long m36368a(String str) {
        this.f2763d.lock();
        SQLiteDatabase m36366b = m36366b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("uuid", str);
            return m36366b.insert("StatisticsInfo", null, contentValues);
        } finally {
            m36366b.close();
            this.f2763d.unlock();
        }
    }

    /* renamed from: a */
    public Map<String, ArrayList> m36370a() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f2764e.lock();
        SQLiteDatabase m36365c = m36365c();
        Cursor rawQuery = m36365c.rawQuery("select * from StatisticsInfo limit 0,100", null);
        while (rawQuery.moveToNext()) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    int i = rawQuery.getInt(rawQuery.getColumnIndex("id"));
                    jSONObject.put("uuid", rawQuery.getString(rawQuery.getColumnIndex("uuid")));
                    jSONObject.put("startInfo", rawQuery.getString(rawQuery.getColumnIndex("startInfo")));
                    jSONObject.put("endInfo", rawQuery.getString(rawQuery.getColumnIndex("endInfo")));
                    arrayList2.add(Integer.valueOf(i));
                    arrayList.add(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } finally {
                rawQuery.close();
                m36365c.close();
                this.f2764e.unlock();
            }
        }
        hashMap.put("listId", arrayList2);
        hashMap.put("list", arrayList);
        return hashMap;
    }
}
