package com.tencent.p263mm.sdk.contact;

import android.content.Context;
import com.tencent.p263mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p263mm.sdk.storage.MAutoStorage;
/* renamed from: com.tencent.mm.sdk.contact.RContactStorage */
/* loaded from: classes2.dex */
public class RContactStorage extends MAutoStorage<RContact> {
    public static final String AUTHORITY = "com.tencent.mm.sdk.contact.provider";
    public static final String PRIMARY_KEY = "";
    public static final String TABLE = "rcontact";

    private RContactStorage(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase);
    }

    public static RContactStorage create(Context context) {
        return new RContactStorage(new RContactDB(context));
    }

    public RContact get(String str) {
        RContact rContact = new RContact();
        rContact.field_username = str;
        if (!super.get((RContactStorage) rContact, "username")) {
            return null;
        }
        return rContact;
    }

    @Override // com.tencent.p263mm.sdk.storage.MAutoStorage
    public String[] getColumns() {
        return RContact.COLUMNS;
    }

    @Override // com.tencent.p263mm.sdk.storage.MAutoStorage
    public String getPrimaryKey() {
        return "";
    }

    @Override // com.tencent.p263mm.sdk.storage.MAutoStorage
    public String getTableName() {
        return TABLE;
    }
}
