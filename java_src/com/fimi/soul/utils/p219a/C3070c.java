package com.fimi.soul.utils.p219a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.utils.C3127k;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.utils.a.c */
/* loaded from: classes.dex */
public class C3070c {

    /* renamed from: a */
    public static final String f11492a = "create table  if not exists history_push_message(orderId int auto_increment primary key ,url varchar(600) ,title varchar(20) ,payload varchar(20) ,id varchar(20) ,msgType varchar(20) ,passThrough varchar(20) ,statue varchar(20) ,time varchar(20))";

    /* renamed from: e */
    private static C3070c f11493e;

    /* renamed from: b */
    private C3127k f11494b;

    /* renamed from: c */
    private SQLiteDatabase f11495c;

    /* renamed from: d */
    private Context f11496d;

    /* renamed from: com.fimi.soul.utils.a.c$a */
    /* loaded from: classes.dex */
    public static class C3071a {

        /* renamed from: a */
        public static final String f11497a = "history_push_message";

        /* renamed from: b */
        public static final String f11498b = "url";

        /* renamed from: c */
        public static final String f11499c = "title";

        /* renamed from: d */
        public static final String f11500d = "payload";

        /* renamed from: e */
        public static final String f11501e = "statue";

        /* renamed from: f */
        public static final String f11502f = "passThrough";

        /* renamed from: g */
        public static final String f11503g = "id";

        /* renamed from: h */
        public static final String f11504h = "msgType";

        /* renamed from: i */
        public static final String f11505i = "time";

        /* renamed from: j */
        public static final String f11506j = "orderId";
    }

    private C3070c(Context context) {
        this.f11496d = context;
        this.f11494b = C3127k.m29073a(context);
        this.f11495c = this.f11494b.getWritableDatabase();
    }

    /* renamed from: a */
    public static C3070c m29392a(Context context) {
        if (f11493e == null) {
            f11493e = new C3070c(context.getApplicationContext());
        }
        return f11493e;
    }

    /* renamed from: a */
    public long m29391a(HistoryPushMessage historyPushMessage) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", historyPushMessage.getRedirectURL());
        contentValues.put("title", historyPushMessage.getTitle());
        contentValues.put(C3071a.f11500d, historyPushMessage.getPayload());
        contentValues.put(C3071a.f11505i, historyPushMessage.getTime());
        contentValues.put(C3071a.f11501e, historyPushMessage.getStatus());
        contentValues.put(C3071a.f11502f, historyPushMessage.getPassThough());
        contentValues.put("id", historyPushMessage.getId());
        contentValues.put("msgType", historyPushMessage.getMsgType());
        return this.f11495c.insert(C3071a.f11497a, null, contentValues);
    }

    /* renamed from: a */
    public List<HistoryPushMessage> m29393a() {
        this.f11495c = this.f11494b.getWritableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f11495c.rawQuery("select * from history_push_message order by orderId desc", null);
        while (rawQuery.moveToNext()) {
            HistoryPushMessage historyPushMessage = new HistoryPushMessage();
            historyPushMessage.setRedirectURL(rawQuery.getString(rawQuery.getColumnIndex("url")));
            historyPushMessage.setTitle(rawQuery.getString(rawQuery.getColumnIndex("title")));
            historyPushMessage.setPayload(rawQuery.getString(rawQuery.getColumnIndex(C3071a.f11500d)));
            historyPushMessage.setTime(rawQuery.getString(rawQuery.getColumnIndex(C3071a.f11505i)));
            historyPushMessage.setId(rawQuery.getString(rawQuery.getColumnIndex("id")));
            historyPushMessage.setMsgType(rawQuery.getString(rawQuery.getColumnIndex("msgType")));
            historyPushMessage.setPassThough(rawQuery.getString(rawQuery.getColumnIndex(C3071a.f11502f)));
            historyPushMessage.setStatus(rawQuery.getString(rawQuery.getColumnIndex(C3071a.f11501e)));
            arrayList.add(historyPushMessage);
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean m29390b(HistoryPushMessage historyPushMessage) {
        this.f11495c = this.f11494b.getWritableDatabase();
        try {
            if (this.f11495c.rawQuery("select * from history_push_message where id=?", new String[]{historyPushMessage.getId()}).getCount() > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
