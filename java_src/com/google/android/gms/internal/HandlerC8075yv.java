package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.facebook.common.util.UriUtil;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.yv */
/* loaded from: classes.dex */
public class HandlerC8075yv extends Handler {

    /* renamed from: a */
    private final AbstractC8074yu f26430a;

    public HandlerC8075yv(Context context) {
        this(new C8076yw(context.getApplicationContext() != null ? context.getApplicationContext() : context));
    }

    public HandlerC8075yv(AbstractC8074yu abstractC8074yu) {
        this.f26430a = abstractC8074yu;
    }

    /* renamed from: a */
    private void m12858a(JSONObject jSONObject) {
        try {
            this.f26430a.mo12856a(jSONObject.getString("request_id"), jSONObject.getString("base_url"), jSONObject.getString("html"));
        } catch (Exception e) {
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            Bundle data = message.getData();
            if (data == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject(data.getString(UriUtil.DATA_SCHEME));
            if (!"fetch_html".equals(jSONObject.getString("message_name"))) {
                return;
            }
            m12858a(jSONObject);
        } catch (Exception e) {
        }
    }
}
