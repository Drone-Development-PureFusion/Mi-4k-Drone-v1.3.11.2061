package com.google.android.gms.internal;

import com.facebook.common.util.UriUtil;
import java.net.URI;
/* renamed from: com.google.android.gms.internal.hp */
/* loaded from: classes2.dex */
public class C7101hp {

    /* renamed from: a */
    private final String f23914a;

    /* renamed from: b */
    private final String f23915b;

    /* renamed from: c */
    private final boolean f23916c;

    public C7101hp(String str, String str2, boolean z) {
        this.f23914a = str;
        this.f23915b = str2;
        this.f23916c = z;
    }

    /* renamed from: a */
    public static URI m15572a(String str, boolean z, String str2, String str3) {
        String str4 = z ? "wss" : "ws";
        String valueOf = String.valueOf("v");
        String valueOf2 = String.valueOf("5");
        String sb = new StringBuilder(String.valueOf(str4).length() + 13 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length()).append(str4).append("://").append(str).append("/.ws?ns=").append(str2).append("&").append(valueOf).append("=").append(valueOf2).toString();
        if (str3 != null) {
            String valueOf3 = String.valueOf(sb);
            String valueOf4 = String.valueOf("&ls=");
            sb = new StringBuilder(String.valueOf(valueOf3).length() + 0 + String.valueOf(valueOf4).length() + String.valueOf(str3).length()).append(valueOf3).append(valueOf4).append(str3).toString();
        }
        return URI.create(sb);
    }

    /* renamed from: a */
    public String m15573a() {
        return this.f23914a;
    }

    /* renamed from: b */
    public String m15571b() {
        return this.f23915b;
    }

    /* renamed from: c */
    public boolean m15570c() {
        return this.f23916c;
    }

    public String toString() {
        String str = this.f23916c ? "s" : "";
        String str2 = this.f23914a;
        return new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(str2).length()).append(UriUtil.HTTP_SCHEME).append(str).append("://").append(str2).toString();
    }
}
