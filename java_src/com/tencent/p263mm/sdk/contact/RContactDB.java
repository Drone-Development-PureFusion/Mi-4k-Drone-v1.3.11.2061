package com.tencent.p263mm.sdk.contact;

import android.content.Context;
import android.net.Uri;
import com.tencent.p263mm.sdk.storage.ContentProviderDB;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.tencent.mm.sdk.contact.RContactDB */
/* loaded from: classes2.dex */
public class RContactDB extends ContentProviderDB<RContactDB> {

    /* renamed from: O */
    private static final Map<String, Uri> f31581O;

    static {
        HashMap hashMap = new HashMap();
        f31581O = hashMap;
        hashMap.put(RContactStorage.TABLE, Uri.parse("content://com.tencent.mm.sdk.contact.provider/rcontact"));
    }

    public RContactDB(Context context) {
        super(context);
    }

    @Override // com.tencent.p263mm.sdk.storage.ContentProviderDB
    public Uri getUriFromTable(String str) {
        return f31581O.get(str);
    }
}
