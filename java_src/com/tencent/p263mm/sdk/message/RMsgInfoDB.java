package com.tencent.p263mm.sdk.message;

import android.content.Context;
import android.net.Uri;
import com.tencent.p263mm.sdk.storage.ContentProviderDB;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.tencent.mm.sdk.message.RMsgInfoDB */
/* loaded from: classes2.dex */
public class RMsgInfoDB extends ContentProviderDB<RMsgInfoDB> {

    /* renamed from: O */
    private static final Map<String, Uri> f31585O;
    public static final String TABLE = "message";

    static {
        HashMap hashMap = new HashMap();
        f31585O = hashMap;
        hashMap.put(TABLE, Uri.parse("content://com.tencent.mm.sdk.msginfo.provider/message"));
    }

    public RMsgInfoDB(Context context) {
        super(context);
    }

    @Override // com.tencent.p263mm.sdk.storage.ContentProviderDB
    public Uri getUriFromTable(String str) {
        return f31585O.get(str);
    }
}
