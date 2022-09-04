package com.baidu.tts.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.baidu.tts.client.model.Conditions;
import com.baidu.tts.client.model.ModelBags;
import com.baidu.tts.client.model.ModelFileBags;
import com.baidu.tts.p102f.EnumC1175g;
import com.baidu.tts.p112l.C1202a;
import com.baidu.tts.tools.DataTool;
import com.baidu.tts.tools.SqlTool;
import com.baidu.tts.tools.StringTool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: com.baidu.tts.database.a */
/* loaded from: classes.dex */
public class C1154a {

    /* renamed from: a */
    private C1202a f2755a;

    /* renamed from: b */
    private C1155b f2756b;

    /* renamed from: c */
    private ReadWriteLock f2757c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private Lock f2758d = this.f2757c.writeLock();

    /* renamed from: e */
    private Lock f2759e = this.f2757c.readLock();

    public C1154a(C1202a c1202a) {
        this.f2755a = c1202a;
        this.f2756b = new C1155b(this.f2755a.m36231d());
    }

    /* renamed from: a */
    private SQLiteDatabase m36385a() {
        return this.f2756b.getWritableDatabase();
    }

    /* renamed from: b */
    private SQLiteDatabase m36376b() {
        return this.f2756b.getReadableDatabase();
    }

    /* renamed from: a */
    public int m36381a(String str) {
        int i;
        this.f2758d.lock();
        try {
            SQLiteDatabase m36385a = m36385a();
            try {
                i = SpeechModelTable.m36387a(m36385a, str);
                this.f2758d.unlock();
            } catch (Exception e) {
                i = -1;
                this.f2758d.unlock();
            } finally {
                m36385a.close();
            }
            return i;
        } catch (Throwable th) {
            this.f2758d.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public String m36379a(String str, String str2) {
        Map<String, String> m36378a = m36378a("select b.absPath from speechModel a left join modelFile b on a." + str + "=b.id where a.id=?", new String[]{str2});
        if (m36378a != null) {
            return m36378a.get(EnumC1175g.ABS_PATH.m36317b());
        }
        return null;
    }

    /* renamed from: a */
    public List<Map<String, String>> m36384a(Conditions conditions) {
        String version = conditions.getVersion();
        String str = null;
        String[] strArr = null;
        if (!StringTool.isEmpty(version)) {
            str = "version_min <= ? and version_max >= ?";
            strArr = new String[]{version, version};
        }
        String[] domainArray = conditions.getDomainArray();
        String[] languageArray = conditions.getLanguageArray();
        String[] qualityArray = conditions.getQualityArray();
        String[] genderArray = conditions.getGenderArray();
        String[] speakerArray = conditions.getSpeakerArray();
        String[] modelIdsArray = conditions.getModelIdsArray();
        String buildConditions = SqlTool.buildConditions("and", str, SqlTool.buildInCondition("domain", domainArray), SqlTool.buildInCondition("language", languageArray), SqlTool.buildInCondition("quality", qualityArray), SqlTool.buildInCondition("gender", genderArray), SqlTool.buildInCondition("speaker", speakerArray), SqlTool.buildInCondition("id", modelIdsArray));
        if (StringTool.isEmpty(buildConditions)) {
            return null;
        }
        return m36374b("select * from speechModel where " + buildConditions, DataTool.connect(strArr, domainArray, languageArray, qualityArray, genderArray, speakerArray, modelIdsArray));
    }

    /* renamed from: a */
    public List<Map<String, String>> m36377a(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return null;
        }
        String[] fromSetToArray = DataTool.fromSetToArray(set);
        return m36374b("select * from modelFile where " + SqlTool.buildInCondition("id", fromSetToArray), fromSetToArray);
    }

    /* renamed from: a */
    public Map<String, String> m36378a(String str, String[] strArr) {
        Exception exc;
        HashMap hashMap;
        HashMap hashMap2;
        this.f2759e.lock();
        try {
            SQLiteDatabase m36376b = m36376b();
            try {
                Cursor rawQuery = m36376b.rawQuery(str, strArr);
                if (rawQuery != null) {
                    if (rawQuery.moveToFirst()) {
                        hashMap2 = new HashMap();
                        try {
                            String[] columnNames = rawQuery.getColumnNames();
                            int length = columnNames.length;
                            for (int i = 0; i < length; i++) {
                                hashMap2.put(columnNames[i], rawQuery.getString(rawQuery.getColumnIndex(columnNames[i])));
                            }
                        } catch (Exception e) {
                            hashMap = hashMap2;
                            exc = e;
                            exc.printStackTrace();
                            if (m36376b != null) {
                                m36376b.close();
                            }
                            return hashMap;
                        }
                    } else {
                        hashMap2 = null;
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    hashMap = hashMap2;
                } else {
                    hashMap = null;
                }
                if (m36376b != null) {
                    m36376b.close();
                }
            } catch (Exception e2) {
                exc = e2;
                hashMap = null;
            }
            return hashMap;
        } finally {
            this.f2759e.unlock();
        }
    }

    /* renamed from: a */
    public void m36383a(ModelBags modelBags) {
        this.f2758d.lock();
        try {
            SpeechModelTable.m36388a(m36385a(), modelBags);
        } finally {
            this.f2758d.unlock();
        }
    }

    /* renamed from: a */
    public void m36382a(ModelFileBags modelFileBags) {
        this.f2758d.lock();
        try {
            ModelFileTable.m36392a(m36385a(), modelFileBags);
        } finally {
            this.f2758d.unlock();
        }
    }

    /* renamed from: a */
    public void m36380a(String str, int i) {
        this.f2758d.lock();
        try {
            String[] strArr = {str, String.valueOf(i)};
            SQLiteDatabase m36385a = m36385a();
            m36385a.execSQL("replace into fsFileInfo (absPath,state) values (?, ?)", strArr);
            m36385a.close();
        } finally {
            this.f2758d.unlock();
        }
    }

    /* renamed from: b */
    public int m36375b(String str) {
        int i;
        this.f2758d.lock();
        try {
            SQLiteDatabase m36385a = m36385a();
            try {
                i = ModelFileTable.m36391a(m36385a, str);
                this.f2758d.unlock();
            } catch (Exception e) {
                i = -1;
                this.f2758d.unlock();
            } finally {
                m36385a.close();
            }
            return i;
        } catch (Throwable th) {
            this.f2758d.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[Catch: all -> 0x0066, Exception -> 0x006d, TRY_LEAVE, TryCatch #0 {Exception -> 0x006d, blocks: (B:5:0x000b, B:7:0x0015, B:9:0x001b, B:10:0x001f, B:12:0x0028, B:14:0x003a, B:18:0x0045), top: B:4:0x000b }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<Map<String, String>> m36374b(String str, String[] strArr) {
        Exception e;
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabase = null;
        this.f2759e.lock();
        try {
            try {
                arrayList = new ArrayList();
                try {
                    sQLiteDatabase = m36376b();
                    Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
                    if (rawQuery != null) {
                        if (rawQuery.moveToFirst()) {
                            String[] columnNames = rawQuery.getColumnNames();
                            do {
                                HashMap hashMap = new HashMap();
                                int length = columnNames.length;
                                for (int i = 0; i < length; i++) {
                                    hashMap.put(columnNames[i], rawQuery.getString(rawQuery.getColumnIndex(columnNames[i])));
                                }
                                arrayList.add(hashMap);
                            } while (rawQuery.moveToNext());
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                        } else if (rawQuery != null) {
                        }
                    }
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return arrayList;
                }
            } catch (Exception e3) {
                e = e3;
                arrayList = null;
            }
            return arrayList;
        } finally {
            this.f2759e.unlock();
        }
    }

    /* renamed from: c */
    public Map<String, String> m36373c(String str) {
        return m36378a("select * from fsFileInfo where absPath=?", new String[]{str});
    }

    /* renamed from: d */
    public Map<String, String> m36372d(String str) {
        return m36378a("select * from modelFile where id=?", new String[]{str});
    }

    /* renamed from: e */
    public Map<String, String> m36371e(String str) {
        return m36378a("select * from speechModel where id=?", new String[]{str});
    }
}
