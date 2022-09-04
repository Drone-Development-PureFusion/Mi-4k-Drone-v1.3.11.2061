package com.tencent.p263mm.sdk.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p263mm.sdk.platformtools.Log;
import com.tencent.p263mm.sdk.platformtools.Util;
import com.tencent.p263mm.sdk.storage.MAutoDBItem;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p070c.p072b.C0744a;
/* renamed from: com.tencent.mm.sdk.storage.MAutoStorage */
/* loaded from: classes2.dex */
public abstract class MAutoStorage<T extends MAutoDBItem> extends MStorage {

    /* renamed from: P */
    private ISQLiteDatabase f31702P;

    /* renamed from: bL */
    private final String f31703bL;
    private final String[] columns;

    public MAutoStorage(ISQLiteDatabase iSQLiteDatabase) {
        this.f31702P = iSQLiteDatabase;
        this.f31703bL = Util.isNullOrNil(getPrimaryKey()) ? MAutoDBItem.SYSTEM_ROWID_FIELD : getPrimaryKey();
        this.columns = getColumns();
    }

    /* renamed from: a */
    private static StringBuilder m5846a(ContentValues contentValues, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str + " = ? AND ");
            if (contentValues.get(str) == null) {
                return null;
            }
        }
        sb.append(" 1=1");
        return sb;
    }

    /* renamed from: a */
    private boolean m5847a(ContentValues contentValues) {
        Cursor query = this.f31702P.query(getTableName(), this.columns, this.f31703bL + " = ?", new String[]{Util.nullAsNil(contentValues.getAsString(this.f31703bL))}, null, null, null);
        boolean checkIOEqual = MAutoDBItem.checkIOEqual(contentValues, query);
        query.close();
        return checkIOEqual;
    }

    /* renamed from: a */
    private static String[] m5845a(String[] strArr, ContentValues contentValues) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr2.length; i++) {
            strArr2[i] = Util.nullAsNil(contentValues.getAsString(strArr[i]));
        }
        return strArr2;
    }

    /* renamed from: d */
    private void m5844d(String str) {
        Log.m5877d("MicroMsg.SDK.MAutoStorage", getTableName() + ":" + str);
    }

    /* renamed from: e */
    private void m5843e(String str) {
        Log.m5875e("MicroMsg.SDK.MAutoStorage", getTableName() + ":" + str);
    }

    public static List<String> getCreateSQLs(Field[] fieldArr, String str, String str2, String... strArr) {
        LinkedList linkedList = new LinkedList();
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS " + str + " ( ");
        Map<String, String> identify = MAutoDBItem.identify(fieldArr, sb, str2);
        sb.append(");");
        linkedList.addFirst(sb.toString());
        if (strArr != null && strArr.length > 0) {
            for (String str3 : strArr) {
                if (str3 != null && str3.length() > 0) {
                    if (identify.get(str3) == null) {
                        Log.m5875e("MicroMsg.SDK.MAutoStorage", "skipped invalid index: " + str3 + ", not found in fields");
                    }
                    linkedList.add("CREATE INDEX IF NOT EXISTS _mindex_" + str + "_" + str3 + "_ ON " + str + "(" + str3 + ");");
                }
            }
        }
        return linkedList;
    }

    public static List<String> getUpdateSQLs(Field[] fieldArr, String str, ISQLiteDatabase iSQLiteDatabase) {
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        Cursor rawQuery = iSQLiteDatabase.rawQuery("PRAGMA table_info( " + str + " )", null);
        while (rawQuery.moveToNext()) {
            hashMap.put(rawQuery.getString(rawQuery.getColumnIndex("name")), rawQuery.getString(rawQuery.getColumnIndex("type")));
        }
        rawQuery.close();
        for (Map.Entry<String, String> entry : MAutoDBItem.identify(fieldArr, null, null).entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            if (!((value == null) | (value.length() <= 0))) {
                String str2 = (String) hashMap.get(key);
                if (str2 == null) {
                    linkedList.add("ALTER TABLE " + str + " ADD COLUMN " + key + " " + value + ";");
                    hashMap.remove(key);
                } else if (!str2.equalsIgnoreCase(value)) {
                    Log.m5875e("MicroMsg.SDK.MAutoStorage", "conflicting alter table on column: " + key + ", " + str2 + "<o-n>" + value);
                    hashMap.remove(key);
                }
            }
        }
        return linkedList;
    }

    public boolean delete(long j) {
        boolean z = true;
        if (this.f31702P.delete(getTableName(), "rowid = ?", new String[]{String.valueOf(j)}) <= 0) {
            z = false;
        }
        if (z) {
            notify();
        }
        return z;
    }

    public boolean delete(T t, String... strArr) {
        boolean z = false;
        ContentValues convertTo = t.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            m5843e("delete failed, value.size <= 0");
            return false;
        } else if (strArr == null || strArr.length <= 0) {
            m5844d("delete with primary key");
            if (this.f31702P.delete(getTableName(), this.f31703bL + " = ?", new String[]{Util.nullAsNil(convertTo.getAsString(this.f31703bL))}) > 0) {
                z = true;
            }
            if (!z) {
                return z;
            }
            doNotify();
            return z;
        } else {
            StringBuilder m5846a = m5846a(convertTo, strArr);
            if (m5846a == null) {
                m5843e("delete failed, check keys failed");
                return false;
            } else if (this.f31702P.delete(getTableName(), m5846a.toString(), m5845a(strArr, convertTo)) > 0) {
                doNotify(this.f31703bL);
                return true;
            } else {
                m5843e("delete failed");
                return false;
            }
        }
    }

    public boolean get(long j, T t) {
        Cursor query = this.f31702P.query(getTableName(), this.columns, "rowid = ?", new String[]{String.valueOf(j)}, null, null, null);
        if (!query.moveToFirst()) {
            query.close();
            return false;
        }
        t.convertFrom(query);
        query.close();
        return true;
    }

    public boolean get(T t, String... strArr) {
        ContentValues convertTo = t.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            m5843e("get failed, value.size <= 0");
            return false;
        } else if (strArr == null || strArr.length <= 0) {
            m5844d("get with primary key");
            Cursor query = this.f31702P.query(getTableName(), this.columns, this.f31703bL + " = ?", new String[]{Util.nullAsNil(convertTo.getAsString(this.f31703bL))}, null, null, null);
            if (!query.moveToFirst()) {
                query.close();
                return false;
            }
            t.convertFrom(query);
            query.close();
            return true;
        } else {
            StringBuilder m5846a = m5846a(convertTo, strArr);
            if (m5846a == null) {
                m5843e("get failed, check keys failed");
                return false;
            }
            Cursor query2 = this.f31702P.query(getTableName(), this.columns, m5846a.toString(), m5845a(strArr, convertTo), null, null, null);
            if (query2.moveToFirst()) {
                t.convertFrom(query2);
                query2.close();
                return true;
            }
            query2.close();
            m5844d("get failed, not found");
            return false;
        }
    }

    public Cursor getAll() {
        return this.f31702P.query(getTableName(), this.columns, null, null, null, null, null);
    }

    public abstract String[] getColumns();

    public int getCount() {
        Cursor rawQuery = rawQuery("select count(*) from " + getTableName(), new String[0]);
        if (rawQuery != null) {
            rawQuery.moveToFirst();
            int i = rawQuery.getInt(0);
            rawQuery.close();
            return i;
        }
        return 0;
    }

    public abstract String getPrimaryKey();

    public abstract String getTableName();

    public boolean insert(T t) {
        ContentValues convertTo = t.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            m5843e("insert failed, value.size <= 0");
            return false;
        }
        t.systemRowid = this.f31702P.insert(getTableName(), this.f31703bL, t.convertTo());
        if (t.systemRowid <= 0) {
            m5843e("insert failed");
            return false;
        }
        doNotify(this.f31703bL);
        return true;
    }

    public Cursor rawQuery(String str, String... strArr) {
        return this.f31702P.rawQuery(str, strArr);
    }

    public boolean replace(T t) {
        C0744a.m38271a("replace primaryKey == null", !Util.isNullOrNil(this.f31703bL));
        ContentValues convertTo = t.convertTo();
        if (convertTo != null) {
            if (convertTo.size() == (convertTo.containsKey(MAutoDBItem.SYSTEM_ROWID_FIELD) ? 1 : 0) + t.fields().length) {
                if (m5847a(convertTo)) {
                    m5844d("no need replace , fields no change");
                    return true;
                } else if (this.f31702P.replace(getTableName(), this.f31703bL, convertTo) > 0) {
                    doNotify(this.f31703bL);
                    return true;
                } else {
                    m5843e("replace failed");
                    return false;
                }
            }
        }
        m5843e("replace failed, cv.size() != item.fields().length");
        return false;
    }

    public boolean update(long j, T t) {
        ContentValues convertTo = t.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            m5843e("update failed, value.size <= 0");
            return false;
        }
        Cursor query = this.f31702P.query(getTableName(), this.columns, "rowid = ?", new String[]{String.valueOf(j)}, null, null, null);
        if (MAutoDBItem.checkIOEqual(convertTo, query)) {
            query.close();
            m5844d("no need replace , fields no change");
            return true;
        }
        query.close();
        boolean z = this.f31702P.update(getTableName(), convertTo, "rowid = ?", new String[]{String.valueOf(j)}) > 0;
        if (!z) {
            return z;
        }
        doNotify();
        return z;
    }

    public boolean update(T t, String... strArr) {
        boolean z = false;
        ContentValues convertTo = t.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            m5843e("update failed, value.size <= 0");
            return false;
        } else if (strArr != null && strArr.length > 0) {
            StringBuilder m5846a = m5846a(convertTo, strArr);
            if (m5846a == null) {
                m5843e("update failed, check keys failed");
                return false;
            } else if (this.f31702P.update(getTableName(), convertTo, m5846a.toString(), m5845a(strArr, convertTo)) > 0) {
                doNotify(this.f31703bL);
                return true;
            } else {
                m5843e("update failed");
                return false;
            }
        } else {
            m5844d("update with primary key");
            if (m5847a(convertTo)) {
                m5844d("no need replace , fields no change");
                return true;
            }
            if (this.f31702P.update(getTableName(), convertTo, this.f31703bL + " = ?", new String[]{Util.nullAsNil(convertTo.getAsString(this.f31703bL))}) > 0) {
                z = true;
            }
            if (!z) {
                return z;
            }
            doNotify();
            return z;
        }
    }
}
