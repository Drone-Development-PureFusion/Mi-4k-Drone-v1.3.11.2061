package com.tencent.p263mm.sdk.message;

import android.content.Context;
import android.database.Cursor;
import com.tencent.p263mm.sdk.platformtools.Util;
import com.tencent.p263mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p263mm.sdk.storage.MStorage;
/* renamed from: com.tencent.mm.sdk.message.RMsgInfoStorage */
/* loaded from: classes2.dex */
public class RMsgInfoStorage extends MStorage {
    public static final String AUTHORITY = "com.tencent.mm.sdk.msginfo.provider";
    public static final String PRIMARY_KEY = "msgId";

    /* renamed from: P */
    ISQLiteDatabase f31586P;

    private RMsgInfoStorage(ISQLiteDatabase iSQLiteDatabase) {
        this.f31586P = null;
        this.f31586P = iSQLiteDatabase;
    }

    public static RMsgInfoStorage create(Context context) {
        return new RMsgInfoStorage(new RMsgInfoDB(context));
    }

    public int doDelete(long j) {
        int delete = this.f31586P.delete(RMsgInfoDB.TABLE, "msgId=?", new String[]{String.valueOf(j)});
        if (delete > 0) {
            notify();
        }
        return delete;
    }

    public long doInsert(RMsgInfo rMsgInfo) {
        if (rMsgInfo == null || Util.isNullOrNil(rMsgInfo.field_talker)) {
            return -1L;
        }
        long insert = this.f31586P.insert(RMsgInfoDB.TABLE, "msgId", rMsgInfo.convertTo());
        if (insert <= 0) {
            return insert;
        }
        notify();
        return insert;
    }

    public int doUpdate(long j, RMsgInfo rMsgInfo) {
        if (rMsgInfo == null || Util.isNullOrNil(rMsgInfo.field_talker)) {
            return -1;
        }
        int update = this.f31586P.update(RMsgInfoDB.TABLE, rMsgInfo.convertTo(), "msgId=?", new String[]{String.valueOf(j)});
        if (update <= 0) {
            return update;
        }
        notify();
        return update;
    }

    public RMsgInfo getMsgById(long j) {
        Cursor query = this.f31586P.query(RMsgInfoDB.TABLE, null, "msgId=?", new String[]{String.valueOf(j)}, null, null, null);
        if (query == null) {
            return null;
        }
        if (query.getCount() == 0) {
            query.close();
            return null;
        }
        RMsgInfo rMsgInfo = new RMsgInfo();
        rMsgInfo.convertFrom(query);
        return rMsgInfo;
    }

    public Cursor getMsgByTalker(String str) {
        return this.f31586P.query(RMsgInfoDB.TABLE, null, "talker=?", new String[]{str}, null, null, null);
    }
}
