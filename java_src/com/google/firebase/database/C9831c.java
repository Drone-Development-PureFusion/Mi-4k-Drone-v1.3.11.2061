package com.google.firebase.database;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.firebase.database.c */
/* loaded from: classes2.dex */
public class C9831c {

    /* renamed from: a */
    public static final int f30660a = -1;

    /* renamed from: b */
    public static final int f30661b = -2;

    /* renamed from: c */
    public static final int f30662c = -3;

    /* renamed from: d */
    public static final int f30663d = -4;

    /* renamed from: e */
    public static final int f30664e = -6;

    /* renamed from: f */
    public static final int f30665f = -7;

    /* renamed from: g */
    public static final int f30666g = -8;

    /* renamed from: h */
    public static final int f30667h = -9;

    /* renamed from: i */
    public static final int f30668i = -10;

    /* renamed from: j */
    public static final int f30669j = -11;

    /* renamed from: k */
    public static final int f30670k = -24;

    /* renamed from: l */
    public static final int f30671l = -25;

    /* renamed from: m */
    public static final int f30672m = -999;

    /* renamed from: n */
    private static final Map<Integer, String> f30673n = new HashMap();

    /* renamed from: o */
    private static final Map<String, Integer> f30674o = new HashMap();

    /* renamed from: p */
    private final int f30675p;

    /* renamed from: q */
    private final String f30676q;

    /* renamed from: r */
    private final String f30677r;

    static {
        f30673n.put(-1, "The transaction needs to be run again with current data");
        f30673n.put(-2, "The server indicated that this operation failed");
        f30673n.put(-3, "This client does not have permission to perform this operation");
        f30673n.put(-4, "The operation had to be aborted due to a network disconnect");
        f30673n.put(-6, "The supplied auth token has expired");
        f30673n.put(-7, "The supplied auth token was invalid");
        f30673n.put(-8, "The transaction had too many retries");
        f30673n.put(-9, "The transaction was overridden by a subsequent set");
        f30673n.put(-10, "The service is unavailable");
        f30673n.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        f30673n.put(-24, "The operation could not be performed due to a network error");
        f30673n.put(-25, "The write was canceled by the user.");
        f30673n.put(Integer.valueOf((int) f30672m), "An unknown error occurred");
        f30674o.put("datastale", -1);
        f30674o.put("failure", -2);
        f30674o.put("permission_denied", -3);
        f30674o.put("disconnected", -4);
        f30674o.put("expired_token", -6);
        f30674o.put("invalid_token", -7);
        f30674o.put("maxretries", -8);
        f30674o.put("overriddenbyset", -9);
        f30674o.put("unavailable", -10);
        f30674o.put("network_error", -24);
        f30674o.put("write_canceled", -25);
    }

    private C9831c(int i, String str) {
        this(i, str, null);
    }

    private C9831c(int i, String str, String str2) {
        this.f30675p = i;
        this.f30676q = str;
        this.f30677r = str2 == null ? "" : str2;
    }

    /* renamed from: a */
    public static C9831c m6858a(int i) {
        if (!f30673n.containsKey(Integer.valueOf(i))) {
            throw new IllegalArgumentException(new StringBuilder(49).append("Invalid Firebase Database error code: ").append(i).toString());
        }
        return new C9831c(i, f30673n.get(Integer.valueOf(i)), null);
    }

    /* renamed from: a */
    public static C9831c m6857a(String str) {
        return m6856a(str, null);
    }

    /* renamed from: a */
    public static C9831c m6856a(String str, String str2) {
        return m6855a(str, str2, null);
    }

    /* renamed from: a */
    public static C9831c m6855a(String str, String str2, String str3) {
        Integer num = f30674o.get(str.toLowerCase());
        Integer valueOf = num == null ? Integer.valueOf((int) f30672m) : num;
        return new C9831c(valueOf.intValue(), str2 == null ? f30673n.get(valueOf) : str2, str3);
    }

    /* renamed from: a */
    public static C9831c m6854a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String valueOf = String.valueOf(f30673n.get(-11));
        String valueOf2 = String.valueOf(stringWriter.toString());
        return new C9831c(-11, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    /* renamed from: a */
    public int m6859a() {
        return this.f30675p;
    }

    /* renamed from: b */
    public String m6853b() {
        return this.f30676q;
    }

    /* renamed from: c */
    public String m6852c() {
        return this.f30677r;
    }

    /* renamed from: d */
    public C9866d m6851d() {
        String valueOf = String.valueOf(this.f30676q);
        return new C9866d(valueOf.length() != 0 ? "Firebase Database error: ".concat(valueOf) : new String("Firebase Database error: "));
    }

    public String toString() {
        String valueOf = String.valueOf(this.f30676q);
        return valueOf.length() != 0 ? "DatabaseError: ".concat(valueOf) : new String("DatabaseError: ");
    }
}
