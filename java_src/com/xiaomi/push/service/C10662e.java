package com.xiaomi.push.service;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10419k;
import com.xiaomi.market.sdk.C10447l;
import com.xiaomi.xmpush.thrift.C10812j;
import com.xiaomi.xmpush.thrift.C10815l;
import com.xiaomi.xmpush.thrift.EnumC10809h;
import com.xiaomi.xmpush.thrift.EnumC10814k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.xiaomi.push.service.e */
/* loaded from: classes.dex */
public class C10662e {

    /* renamed from: b */
    private static volatile C10662e f33127b;

    /* renamed from: c */
    private static String f33128c = "GeoFenceDao.";

    /* renamed from: a */
    private C10663f f33129a;

    private C10662e(Context context) {
        this.f33129a = new C10663f(context);
    }

    /* renamed from: a */
    private synchronized Cursor m4272a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        synchronized (this) {
            C10419k.m5232a(false);
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT * FROM geofence", null);
            } catch (Exception e) {
            }
        }
        return cursor;
    }

    /* renamed from: a */
    public static C10662e m4274a(Context context) {
        if (f33127b == null) {
            synchronized (C10662e.class) {
                if (f33127b == null) {
                    f33127b = new C10662e(context);
                }
            }
        }
        return f33127b;
    }

    /* renamed from: a */
    private synchronized EnumC10814k m4273a(Cursor cursor) {
        EnumC10814k enumC10814k;
        try {
            EnumC10814k[] values = EnumC10814k.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC10814k = null;
                    break;
                }
                enumC10814k = values[i];
                if (TextUtils.equals(cursor.getString(cursor.getColumnIndex("type")), enumC10814k.name())) {
                    break;
                }
                i++;
            }
        } catch (Exception e) {
            AbstractC10404b.m5264d(e.toString());
            enumC10814k = null;
        }
        return enumC10814k;
    }

    /* renamed from: a */
    private synchronized String m4268a(List<C10815l> list) {
        String str;
        if (list != null) {
            if (list.size() >= 3) {
                JSONArray jSONArray = new JSONArray();
                try {
                    for (C10815l c10815l : list) {
                        if (c10815l != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("point_lantitude", c10815l.m3370c());
                            jSONObject.put("point_longtitude", c10815l.m3378a());
                            jSONArray.put(jSONObject);
                        }
                    }
                    str = jSONArray.toString();
                } catch (JSONException e) {
                    AbstractC10404b.m5264d(e.toString());
                    str = null;
                }
            }
        }
        AbstractC10404b.m5269a(f33128c + " points unvalidated");
        str = null;
        return str;
    }

    /* renamed from: b */
    private synchronized C10815l m4267b(Cursor cursor) {
        C10815l c10815l;
        c10815l = new C10815l();
        try {
            c10815l.m3373b(Double.parseDouble(cursor.getString(cursor.getColumnIndex("center_lantitude"))));
            c10815l.m3377a(Double.parseDouble(cursor.getString(cursor.getColumnIndex("center_longtitude"))));
        } catch (Exception e) {
            AbstractC10404b.m5264d(e.toString());
            c10815l = null;
        }
        return c10815l;
    }

    /* renamed from: c */
    private synchronized ArrayList<C10815l> m4265c(Cursor cursor) {
        ArrayList<C10815l> arrayList;
        ArrayList<C10815l> arrayList2 = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(cursor.getString(cursor.getColumnIndex("polygon_points")));
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= jSONArray.length()) {
                    break;
                }
                C10815l c10815l = new C10815l();
                JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                c10815l.m3373b(jSONObject.getDouble("point_lantitude"));
                c10815l.m3377a(jSONObject.getDouble("point_longtitude"));
                arrayList2.add(c10815l);
                i = i2 + 1;
            }
            arrayList = arrayList2;
        } catch (JSONException e) {
            AbstractC10404b.m5264d(e.toString());
            arrayList = null;
        }
        return arrayList;
    }

    /* renamed from: d */
    private synchronized EnumC10809h m4263d(Cursor cursor) {
        EnumC10809h enumC10809h;
        try {
            enumC10809h = EnumC10809h.valueOf(cursor.getString(cursor.getColumnIndex("coordinate_provider")));
        } catch (IllegalArgumentException e) {
            AbstractC10404b.m5264d(e.toString());
            enumC10809h = null;
        }
        return enumC10809h;
    }

    /* renamed from: a */
    public synchronized int m4269a(String str, String str2) {
        int i = 0;
        synchronized (this) {
            C10419k.m5232a(false);
            try {
                if ("Enter".equals(str2) || "Leave".equals(str2) || "Unknown".equals(str2)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("current_status", str2);
                    SQLiteDatabase writableDatabase = this.f33129a.getWritableDatabase();
                    int update = writableDatabase.update("geofence", contentValues, "id=?", new String[]{str});
                    writableDatabase.close();
                    i = update;
                }
            } catch (Exception e) {
                AbstractC10404b.m5264d(e.toString());
            }
        }
        return i;
    }

    /* renamed from: a */
    public synchronized long m4271a(C10812j c10812j) {
        long j;
        C10419k.m5232a(false);
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", c10812j.m3417a());
            contentValues.put("appId", Long.valueOf(c10812j.m3398e()));
            contentValues.put("name", c10812j.m3402c());
            contentValues.put(C10447l.PACKAGE_NAME, c10812j.m3396g());
            contentValues.put("create_time", Long.valueOf(c10812j.m3394i()));
            contentValues.put("type", c10812j.m3392k().name());
            contentValues.put("center_longtitude", String.valueOf(c10812j.m3390m().m3378a()));
            contentValues.put("center_lantitude", String.valueOf(c10812j.m3390m().m3370c()));
            contentValues.put("circle_radius", Double.valueOf(c10812j.m3388o()));
            contentValues.put("polygon_point", m4268a(c10812j.m3386q()));
            contentValues.put("coordinate_provider", c10812j.m3384s().name());
            contentValues.put("current_status", "Unknown");
            SQLiteDatabase writableDatabase = this.f33129a.getWritableDatabase();
            j = writableDatabase.insert("geofence", null, contentValues);
            writableDatabase.close();
        } catch (Exception e) {
            AbstractC10404b.m5264d(e.toString());
            j = -1;
        }
        return j;
    }

    /* renamed from: a */
    public synchronized C10812j m4270a(String str) {
        C10812j c10812j;
        C10419k.m5232a(false);
        try {
            Iterator<C10812j> it2 = m4275a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c10812j = null;
                    break;
                }
                c10812j = it2.next();
                if (TextUtils.equals(c10812j.m3417a(), str)) {
                    break;
                }
            }
        } catch (Exception e) {
            AbstractC10404b.m5264d(e.toString());
            c10812j = null;
        }
        return c10812j;
    }

    /* renamed from: a */
    public synchronized ArrayList<C10812j> m4275a() {
        ArrayList<C10812j> arrayList;
        C10419k.m5232a(false);
        try {
            SQLiteDatabase writableDatabase = this.f33129a.getWritableDatabase();
            Cursor m4272a = m4272a(writableDatabase);
            arrayList = new ArrayList<>();
            if (m4272a != null) {
                while (m4272a.moveToNext()) {
                    try {
                        C10812j c10812j = new C10812j();
                        c10812j.m3410a(m4272a.getString(m4272a.getColumnIndex("id")));
                        c10812j.m3404b(m4272a.getString(m4272a.getColumnIndex("name")));
                        c10812j.m3415a(m4272a.getInt(m4272a.getColumnIndex("appId")));
                        c10812j.m3401c(m4272a.getString(m4272a.getColumnIndex(C10447l.PACKAGE_NAME)));
                        c10812j.m3406b(m4272a.getInt(m4272a.getColumnIndex("create_time")));
                        EnumC10814k m4273a = m4273a(m4272a);
                        if (m4273a == null) {
                            AbstractC10404b.m5265c(f33128c + "findAllGeoFencing: geo type null");
                        } else {
                            c10812j.m3412a(m4273a);
                            if (TextUtils.equals("Circle", m4273a.name())) {
                                c10812j.m3411a(m4267b(m4272a));
                                c10812j.m3416a(m4272a.getDouble(m4272a.getColumnIndex("circle_radius")));
                            } else if (TextUtils.equals("Polygon", m4273a.name())) {
                                ArrayList<C10815l> m4265c = m4265c(m4272a);
                                if (m4265c == null || m4265c.size() < 3) {
                                    AbstractC10404b.m5265c(f33128c + "findAllGeoFencing: geo points null or size<3");
                                } else {
                                    c10812j.m3409a(m4265c);
                                }
                            }
                            EnumC10809h m4263d = m4263d(m4272a);
                            if (m4263d == null) {
                                AbstractC10404b.m5265c(f33128c + "findAllGeoFencing: geo Coordinate Provider null ");
                            } else {
                                c10812j.m3414a(m4263d);
                                arrayList.add(c10812j);
                            }
                        }
                    } catch (Exception e) {
                        AbstractC10404b.m5264d(e.toString());
                    }
                }
                m4272a.close();
            }
            writableDatabase.close();
        } catch (Exception e2) {
            AbstractC10404b.m5264d(e2.toString());
            arrayList = null;
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized ArrayList<C10812j> m4266b(String str) {
        ArrayList<C10812j> arrayList;
        C10419k.m5232a(false);
        try {
            ArrayList<C10812j> m4275a = m4275a();
            ArrayList<C10812j> arrayList2 = new ArrayList<>();
            Iterator<C10812j> it2 = m4275a.iterator();
            while (it2.hasNext()) {
                C10812j next = it2.next();
                if (TextUtils.equals(next.m3396g(), str)) {
                    arrayList2.add(next);
                }
            }
            arrayList = arrayList2;
        } catch (Exception e) {
            AbstractC10404b.m5264d(e.toString());
            arrayList = null;
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized String m4264c(String str) {
        String str2;
        C10419k.m5232a(false);
        try {
            Cursor m4272a = m4272a(this.f33129a.getWritableDatabase());
            if (m4272a != null) {
                while (m4272a.moveToNext()) {
                    if (TextUtils.equals(m4272a.getString(m4272a.getColumnIndex("id")), str)) {
                        str2 = m4272a.getString(m4272a.getColumnIndex("current_status"));
                        AbstractC10404b.m5265c(f33128c + "findGeoStatueByGeoId: geo current statue is " + str2 + " geoId:" + str);
                        m4272a.close();
                        break;
                    }
                }
                m4272a.close();
            }
            str2 = "Unknown";
        } catch (Exception e) {
            AbstractC10404b.m5264d(e.toString());
            str2 = "Unknown";
        }
        return str2;
    }

    /* renamed from: d */
    public synchronized int m4262d(String str) {
        int i;
        C10419k.m5232a(false);
        try {
            if (m4270a(str) != null) {
                SQLiteDatabase writableDatabase = this.f33129a.getWritableDatabase();
                i = writableDatabase.delete("geofence", "id = ?", new String[]{str});
                writableDatabase.close();
            } else {
                i = 0;
            }
        } catch (Exception e) {
            AbstractC10404b.m5264d(e.toString());
            i = 0;
        }
        return i;
    }

    /* renamed from: e */
    public synchronized int m4261e(String str) {
        int i;
        C10419k.m5232a(false);
        try {
            if (!TextUtils.isEmpty(str)) {
                SQLiteDatabase writableDatabase = this.f33129a.getWritableDatabase();
                i = writableDatabase.delete("geofence", "package_name = ?", new String[]{str});
                writableDatabase.close();
            } else {
                i = 0;
            }
        } catch (Exception e) {
            AbstractC10404b.m5264d(e.toString());
            i = 0;
        }
        return i;
    }
}
