package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.util.client.C3780a;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.tagmanager.C9196e;
import com.tencent.p263mm.sdk.message.RMsgInfoDB;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.wi */
/* loaded from: classes.dex */
public abstract class AbstractC7903wi implements AbstractC4500k {

    /* renamed from: a */
    protected Context f26045a;

    /* renamed from: b */
    protected String f26046b;

    /* renamed from: c */
    protected WeakReference<acy> f26047c;

    public AbstractC7903wi(acy acyVar) {
        this.f26045a = acyVar.getContext();
        this.f26046b = C3779u.m26890e().m18372a(this.f26045a, acyVar.mo18081o().f14733b);
        this.f26047c = new WeakReference<>(acyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13260a(String str, Map<String, String> map) {
        acy acyVar = this.f26047c.get();
        if (acyVar != null) {
            acyVar.mo18107a(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public String m13258c(String str) {
        char c = 65535;
        switch (str.hashCode()) {
            case -1396664534:
                if (str.equals("badUrl")) {
                    c = 6;
                    break;
                }
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c = 2;
                    break;
                }
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c = 7;
                    break;
                }
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c = 3;
                    break;
                }
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c = 1;
                    break;
                }
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c = '\b';
                    break;
                }
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c = '\t';
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    c = 0;
                    break;
                }
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c = 5;
                    break;
                }
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return "internal";
            case 4:
            case 5:
                return "io";
            case 6:
            case 7:
                return "network";
            case '\b':
            case '\t':
                return "policy";
            default:
                return "internal";
        }
    }

    /* renamed from: a */
    public abstract void mo13256a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m13263a(final String str, final String str2, final int i) {
        C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.wi.2
            @Override // java.lang.Runnable
            public void run() {
                HashMap hashMap = new HashMap();
                hashMap.put(C9196e.f29004b, "precacheComplete");
                hashMap.put("src", str);
                hashMap.put("cachedSrc", str2);
                hashMap.put("totalBytes", Integer.toString(i));
                AbstractC7903wi.this.m13260a("onPrecacheEvent", hashMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m13262a(final String str, final String str2, final int i, final int i2, final boolean z) {
        C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.wi.1
            @Override // java.lang.Runnable
            public void run() {
                HashMap hashMap = new HashMap();
                hashMap.put(C9196e.f29004b, "precacheProgress");
                hashMap.put("src", str);
                hashMap.put("cachedSrc", str2);
                hashMap.put("bytesLoaded", Integer.toString(i));
                hashMap.put("totalBytes", Integer.toString(i2));
                hashMap.put("cacheReady", z ? "1" : "0");
                AbstractC7903wi.this.m13260a("onPrecacheEvent", hashMap);
            }
        });
    }

    /* renamed from: a */
    public void m13261a(final String str, final String str2, final String str3, @Nullable final String str4) {
        C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.wi.3
            @Override // java.lang.Runnable
            public void run() {
                HashMap hashMap = new HashMap();
                hashMap.put(C9196e.f29004b, "precacheCanceled");
                hashMap.put("src", str);
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("cachedSrc", str2);
                }
                hashMap.put("type", AbstractC7903wi.this.m13258c(str3));
                hashMap.put("reason", str3);
                if (!TextUtils.isEmpty(str4)) {
                    hashMap.put(RMsgInfoDB.TABLE, str4);
                }
                AbstractC7903wi.this.m13260a("onPrecacheEvent", hashMap);
            }
        });
    }

    /* renamed from: a */
    public abstract boolean mo13254a(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public String m13259b(String str) {
        return C3514ac.m27586a().m26858a(str);
    }

    @Override // com.google.android.gms.common.api.AbstractC4500k
    /* renamed from: b */
    public void mo7804b() {
    }
}
