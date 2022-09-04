package com.xiaomi.market.sdk;

import android.content.Context;
import android.os.AsyncTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.market.sdk.v */
/* loaded from: classes2.dex */
public class AsyncTaskC10457v extends AsyncTask {
    private AsyncTaskC10457v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AsyncTaskC10457v(AsyncTaskC10457v asyncTaskC10457v) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        if (!bool.booleanValue()) {
            AsyncTaskC10455t.m5070x();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b */
    public Boolean doInBackground(Void... voidArr) {
        Context context;
        C10452q c10452q;
        context = XiaomiUpdateAgent.mContext;
        C10448m m5094i = C10448m.m5094i(context);
        c10452q = XiaomiUpdateAgent.f32390aL;
        return Boolean.valueOf(m5094i.m5101a(c10452q));
    }
}
