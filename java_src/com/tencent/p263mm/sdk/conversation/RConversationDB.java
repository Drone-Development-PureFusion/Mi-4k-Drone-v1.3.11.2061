package com.tencent.p263mm.sdk.conversation;

import android.content.Context;
import android.net.Uri;
import com.tencent.p263mm.sdk.storage.ContentProviderDB;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.tencent.mm.sdk.conversation.RConversationDB */
/* loaded from: classes2.dex */
public class RConversationDB extends ContentProviderDB<RConversationDB> {

    /* renamed from: O */
    private static final Map<String, Uri> f31583O;

    static {
        HashMap hashMap = new HashMap();
        f31583O = hashMap;
        hashMap.put(RConversationStorage.TABLE, Uri.parse("content://com.tencent.mm.sdk.conversation.provider/rconversation"));
    }

    public RConversationDB(Context context) {
        super(context);
    }

    @Override // com.tencent.p263mm.sdk.storage.ContentProviderDB
    public Uri getUriFromTable(String str) {
        return f31583O.get(str);
    }
}
