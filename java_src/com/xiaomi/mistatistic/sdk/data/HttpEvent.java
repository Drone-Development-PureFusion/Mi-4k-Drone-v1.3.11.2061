package com.xiaomi.mistatistic.sdk.data;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10508a;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10536q;
import org.json.JSONObject;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0437d;
/* loaded from: classes2.dex */
public class HttpEvent {
    private String exceptionName;
    private String net;
    private long netFlow;
    private String operator;
    private int responseCode;
    private long time;
    private long timeCost;
    private String url;

    public HttpEvent(String str, long j) {
        this(str, j, -1, (String) null);
    }

    public HttpEvent(String str, long j, int i, String str2) {
        this(str, j, 0L, i, str2);
    }

    public HttpEvent(String str, long j, long j2) {
        this(str, j, j2, -1, null);
    }

    public HttpEvent(String str, long j, long j2, int i) {
        this(str, j, j2, i, null);
    }

    public HttpEvent(String str, long j, long j2, int i, String str2) {
        this.time = System.currentTimeMillis();
        this.netFlow = 0L;
        this.url = str;
        this.timeCost = j;
        this.responseCode = i;
        this.exceptionName = str2;
        this.netFlow = j2;
        setNet();
    }

    public HttpEvent(String str, String str2) {
        this(str, -1L, -1, str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HttpEvent)) {
            return false;
        }
        HttpEvent httpEvent = (HttpEvent) obj;
        return TextUtils.equals(this.url, httpEvent.url) && TextUtils.equals(this.net, httpEvent.net) && TextUtils.equals(this.exceptionName, httpEvent.exceptionName) && this.responseCode == httpEvent.responseCode && this.timeCost == httpEvent.timeCost && this.time == httpEvent.time && this.netFlow == httpEvent.netFlow;
    }

    public String getUrl() {
        return this.url;
    }

    public void setNet() {
        String m4816b = AbstractC10536q.m4816b(AbstractC10508a.m4880a());
        if (TextUtils.isEmpty(m4816b)) {
            this.net = AbstractC0437d.f576k;
            return;
        }
        this.net = m4816b;
        if ("WIFI".equalsIgnoreCase(m4816b)) {
            return;
        }
        this.operator = ((TelephonyManager) AbstractC10508a.m4880a().getSystemService("phone")).getSimOperator();
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("net", this.net);
        if (this.timeCost > 0) {
            jSONObject.put("cost", this.timeCost);
        }
        if (this.responseCode != -1) {
            jSONObject.put(XiaomiOAuthConstants.EXTRA_CODE_2, this.responseCode);
        }
        if (!TextUtils.isEmpty(this.exceptionName)) {
            jSONObject.put("exception", this.exceptionName);
        }
        if (!TextUtils.isEmpty(this.operator)) {
            jSONObject.put("op", this.operator);
        }
        if (this.netFlow > 0) {
            jSONObject.put("flow", this.netFlow);
        }
        jSONObject.put("t", this.time);
        return jSONObject;
    }
}
