package com.xiaomi.market.sdk;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.TreeMap;
/* renamed from: com.xiaomi.market.sdk.h */
/* loaded from: classes2.dex */
public class C10443h {

    /* renamed from: G */
    final /* synthetic */ C10438c f32440G;

    /* renamed from: R */
    private TreeMap f32441R;

    public C10443h(C10438c c10438c) {
        this(c10438c, true);
    }

    public C10443h(C10438c c10438c, boolean z) {
        this.f32440G = c10438c;
        this.f32441R = new TreeMap();
        if (z) {
            c10438c.f32423x = this;
        }
    }

    /* renamed from: a */
    public C10443h m5111a(String str, boolean z) {
        if (z) {
            this.f32441R.put(str, "true");
        } else {
            this.f32441R.put(str, "false");
        }
        return this;
    }

    /* renamed from: d */
    public C10443h m5110d(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        this.f32441R.put(str, str2);
        return this;
    }

    public String get(String str) {
        return (String) this.f32441R.get(str);
    }

    public boolean isEmpty() {
        return this.f32441R.isEmpty();
    }

    /* renamed from: j */
    public TreeMap m5109j() {
        return this.f32441R;
    }

    public String toString() {
        if (this.f32441R.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.f32441R.keySet()) {
            sb.append(str);
            sb.append("=");
            try {
                sb.append(URLEncoder.encode((String) this.f32441R.get(str), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
            }
            sb.append("&");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
