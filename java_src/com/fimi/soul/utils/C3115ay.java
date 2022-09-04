package com.fimi.soul.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.fimi.soul.drone.p202f.C2270b;
import com.fimi.soul.drone.p205i.C2332bk;
import com.fimi.soul.entity.UpdateDroneItem;
import com.google.android.gms.maps.model.LatLng;
import com.tencent.p263mm.sdk.conversation.RConversation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.fimi.soul.utils.ay */
/* loaded from: classes.dex */
public class C3115ay {

    /* renamed from: a */
    public static final String f11611a = "route";

    /* renamed from: b */
    public static final String f11612b = "flydata";

    /* renamed from: f */
    private static final String f11613f = "waypoint";

    /* renamed from: g */
    private static final String f11614g = "latitude";

    /* renamed from: h */
    private static final String f11615h = "longitude";

    /* renamed from: i */
    private static final String f11616i = "height";

    /* renamed from: j */
    private static final String f11617j = "sequence";

    /* renamed from: k */
    private static final String f11618k = "link";

    /* renamed from: l */
    private static final String f11619l = "type";

    /* renamed from: m */
    private static final String f11620m = "flyOver";

    /* renamed from: n */
    private static final String f11621n = "create table if not exists route (id integer primary key autoincrement,planeID varchar(30),record_time varchar(30),user_id long,year integer,month integer,distance double,sportTime double,maxhight double,endddata varchar(30),uploadurl text,flag integer);";

    /* renamed from: o */
    private static final String f11622o = "create table if not exists flydata(id integer primary key autoincrement,user_id long,latitude double,longitude double,record_time varchar(30),altitude double,distance double,speed double,model text,sporttime doule,satellitenum integer,endddata varchar(30));";

    /* renamed from: p */
    private static final String f11623p = "create table if not exists flyid(id integer primary key autoincrement,user_id long,cloud_deck_ID text,receiver_control_ID text,fly_control_ID text,remote_control_ID text);";

    /* renamed from: q */
    private static final String f11624q = "create table if not exists waypoint (latitude double ,longitude double ,height integer ,sequence integer ,link bit ,type integer ,flyOver bit );";

    /* renamed from: r */
    private static final String f11625r = "latitude,longitude,height,sequence,link,type,flyOver";

    /* renamed from: c */
    private C3127k f11626c;

    /* renamed from: d */
    private SQLiteDatabase f11627d;

    /* renamed from: e */
    private Context f11628e;

    public C3115ay(Context context) {
        this.f11626c = C3127k.m29073a(context);
        this.f11628e = context;
    }

    /* renamed from: a */
    private ContentValues m29143a(C2332bk c2332bk) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(f11620m, Integer.valueOf(c2332bk.m32034g()));
        contentValues.put("height", Integer.valueOf(c2332bk.m32041c()));
        contentValues.put(f11614g, Double.valueOf(c2332bk.m32043b().f27462a));
        contentValues.put(f11615h, Double.valueOf(c2332bk.m32043b().f27463b));
        contentValues.put(f11618k, Integer.valueOf(c2332bk.m32037e()));
        contentValues.put(f11617j, Integer.valueOf(c2332bk.m32039d()));
        contentValues.put("type", Integer.valueOf(c2332bk.m32035f()));
        return contentValues;
    }

    /* renamed from: a */
    private C2332bk m29145a(Cursor cursor) {
        C2332bk c2332bk = new C2332bk();
        c2332bk.m32036e(cursor.getInt(cursor.getColumnIndex(f11620m)));
        c2332bk.m32046a(cursor.getInt(cursor.getColumnIndex("height")));
        c2332bk.m32045a(new LatLng(cursor.getDouble(cursor.getColumnIndex(f11614g)), cursor.getDouble(cursor.getColumnIndex(f11615h))));
        c2332bk.m32042b(cursor.getInt(cursor.getColumnIndex(f11617j)));
        c2332bk.m32038d(cursor.getInt(cursor.getColumnIndex("type")));
        c2332bk.m32040c(cursor.getInt(cursor.getColumnIndex(f11618k)));
        return c2332bk;
    }

    /* renamed from: a */
    public static void m29144a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f11624q);
        sQLiteDatabase.execSQL(f11621n);
        sQLiteDatabase.execSQL(f11622o);
        sQLiteDatabase.execSQL(f11623p);
    }

    /* renamed from: a */
    public int m29146a(ContentValues contentValues, String str) {
        this.f11627d = this.f11626c.getWritableDatabase();
        return Long.valueOf(this.f11627d.insert(str, null, contentValues)).intValue();
    }

    /* renamed from: a */
    public int m29141a(String str, int i) {
        this.f11627d = this.f11626c.getWritableDatabase();
        return this.f11627d.delete(str, "id=?", new String[]{Integer.toString(i)});
    }

    /* renamed from: a */
    public int m29140a(String str, ContentValues contentValues, String str2, String str3) {
        this.f11627d = this.f11626c.getWritableDatabase();
        return this.f11627d.update(str, contentValues, "record_time=? and user_id=?", new String[]{str2, str3});
    }

    /* renamed from: a */
    public int m29139a(String str, UpdateDroneItem updateDroneItem, String str2) {
        this.f11627d = this.f11626c.getWritableDatabase();
        return this.f11627d.delete(str, "record_time=? and user_id=?", new String[]{updateDroneItem.getRecord_time(), str2});
    }

    /* renamed from: a */
    public int m29137a(String str, List<UpdateDroneItem> list, String str2) {
        this.f11627d = this.f11626c.getWritableDatabase();
        Iterator<UpdateDroneItem> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i = this.f11627d.delete(str, "record_time=? and user_id=?", new String[]{it2.next().getRecord_time(), str2}) == 1 ? i + 1 : i;
        }
        return i;
    }

    /* renamed from: a */
    public List<C2270b> m29142a(String str) {
        ArrayList arrayList = null;
        this.f11627d = this.f11626c.getWritableDatabase();
        Cursor rawQuery = this.f11627d.rawQuery(str, null);
        if (rawQuery.getCount() > 0) {
            arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                C2270b c2270b = new C2270b();
                c2270b.m32506a(rawQuery.getDouble(rawQuery.getColumnIndex(f11614g)));
                c2270b.m32501b(rawQuery.getDouble(rawQuery.getColumnIndex(f11615h)));
                c2270b.m32498c(rawQuery.getDouble(rawQuery.getColumnIndex("altitude")));
                c2270b.m32503a(rawQuery.getString(rawQuery.getColumnIndex("record_time")));
                c2270b.m32495d(rawQuery.getDouble(rawQuery.getColumnIndex("distance")));
                c2270b.m32493e(rawQuery.getDouble(rawQuery.getColumnIndex("speed")));
                c2270b.m32500b(rawQuery.getString(rawQuery.getColumnIndex("model")));
                c2270b.m32491f(rawQuery.getDouble(rawQuery.getColumnIndex("sporttime")));
                c2270b.m32505a(rawQuery.getInt(rawQuery.getColumnIndex("satellitenum")));
                c2270b.m32497c(rawQuery.getString(rawQuery.getColumnIndex("endddata")));
                arrayList.add(c2270b);
            }
            rawQuery.close();
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<UpdateDroneItem> m29138a(String str, String str2) {
        ArrayList arrayList = null;
        if (str2 != null) {
            this.f11627d = this.f11626c.getWritableDatabase();
            Cursor query = this.f11627d.query(str, null, "user_id=?", new String[]{str2}, null, null, "month");
            if (query.getCount() > 0) {
                arrayList = new ArrayList();
            }
            while (query.moveToNext()) {
                UpdateDroneItem updateDroneItem = new UpdateDroneItem();
                updateDroneItem.setDistance(query.getDouble(query.getColumnIndex("distance")));
                updateDroneItem.setEndddata(query.getString(query.getColumnIndex("endddata")));
                updateDroneItem.setMaxhight(query.getDouble(query.getColumnIndex("maxhight")));
                updateDroneItem.setMonth(query.getInt(query.getColumnIndex("month")));
                updateDroneItem.setRecord_time(query.getString(query.getColumnIndex("record_time")));
                updateDroneItem.setSportTime(query.getDouble(query.getColumnIndex("sportTime")));
                updateDroneItem.setUploadurl(query.getString(query.getColumnIndex("uploadurl")));
                updateDroneItem.setUser_id(query.getLong(query.getColumnIndex("user_id")));
                updateDroneItem.setUser_id(query.getLong(query.getColumnIndex("planeID")));
                updateDroneItem.setYear(query.getInt(query.getColumnIndex("year")));
                updateDroneItem.setFlag(query.getInt(query.getColumnIndex(RConversation.COL_FLAG)));
                updateDroneItem.setPlaneID(query.getLong(query.getColumnIndex("planeID")) + "");
                arrayList.add(updateDroneItem);
            }
            query.close();
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m29147a() {
        this.f11627d = this.f11626c.getWritableDatabase();
        this.f11627d.execSQL("delete from waypoint");
        this.f11627d.close();
    }

    /* renamed from: a */
    public void m29136a(List<C2332bk> list) {
        m29147a();
        this.f11627d = this.f11626c.getWritableDatabase();
        for (C2332bk c2332bk : list) {
            this.f11627d.insert(f11613f, null, m29143a(c2332bk));
        }
    }

    /* renamed from: a */
    public void m29135a(List<ContentValues> list, String str) {
        Log.e("查数据", "fdfdfdfdfdfd");
        this.f11627d = this.f11626c.getWritableDatabase();
        for (ContentValues contentValues : list) {
            this.f11627d.insert(str, null, contentValues);
        }
    }

    /* renamed from: b */
    public int m29133b(String str, String str2) {
        int i = 0;
        this.f11627d = this.f11626c.getWritableDatabase();
        Cursor rawQuery = this.f11627d.rawQuery(str, null);
        while (rawQuery.moveToNext()) {
            i = rawQuery.getInt(rawQuery.getColumnIndex(str2));
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: b */
    public List<C2332bk> m29134b() {
        this.f11627d = this.f11626c.getReadableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f11627d.rawQuery("select latitude,longitude,height,sequence,link,type,flyOver from waypoint", null);
        if (rawQuery.getCount() > 0) {
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                arrayList.add(m29145a(rawQuery));
                rawQuery.moveToNext();
            }
        } else {
            arrayList = null;
        }
        rawQuery.close();
        this.f11626c.close();
        return arrayList;
    }
}
