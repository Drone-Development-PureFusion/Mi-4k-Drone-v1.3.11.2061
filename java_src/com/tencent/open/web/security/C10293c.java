package com.tencent.open.web.security;

import android.webkit.WebView;
import com.facebook.common.util.UriUtil;
import com.tencent.open.C10241a;
import com.tencent.open.p264a.C10257f;
import com.tencent.open.p266c.C10281c;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.tencent.open.web.security.c */
/* loaded from: classes2.dex */
public class C10293c extends C10241a.C10242a {

    /* renamed from: d */
    private static final String f32038d = C10257f.f31917d + ".SL";

    /* renamed from: e */
    private String f32039e;

    public C10293c(WebView webView, long j, String str, String str2) {
        super(webView, j, str);
        this.f32039e = str2;
    }

    /* renamed from: b */
    private void m5566b(String str) {
        WebView webView = this.f31862a.get();
        if (webView != null) {
            StringBuffer stringBuffer = new StringBuffer("javascript:");
            stringBuffer.append("if(!!").append(this.f32039e).append("){");
            stringBuffer.append(this.f32039e);
            stringBuffer.append("(");
            stringBuffer.append(str);
            stringBuffer.append(")}");
            String stringBuffer2 = stringBuffer.toString();
            C10257f.m5673b(C10257f.f31917d, "-->callback, callback: " + stringBuffer2);
            webView.loadUrl(stringBuffer2);
        }
    }

    @Override // com.tencent.open.C10241a.C10242a
    /* renamed from: a */
    public void mo5569a() {
        C10257f.m5673b(f32038d, "-->onNoMatchMethod...");
    }

    @Override // com.tencent.open.C10241a.C10242a
    /* renamed from: a */
    public void mo5568a(Object obj) {
        C10257f.m5673b(f32038d, "-->onComplete, result: " + obj);
    }

    @Override // com.tencent.open.C10241a.C10242a
    /* renamed from: a */
    public void mo5567a(String str) {
        C10257f.m5673b(f32038d, "-->onCustomCallback, js: " + str);
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        if (!C10281c.f31969a) {
            i = -4;
        }
        try {
            jSONObject.put("result", i);
            jSONObject.put("sn", this.f31863b);
            jSONObject.put(UriUtil.DATA_SCHEME, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m5566b(jSONObject.toString());
    }
}
