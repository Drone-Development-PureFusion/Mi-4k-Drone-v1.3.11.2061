package com.google.firebase.p254c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.wallet.C9357e;
import com.google.firebase.C9766c;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* renamed from: com.google.firebase.c.g */
/* loaded from: classes.dex */
public class C9774g extends C9766c {

    /* renamed from: a */
    public static final int f30488a = -13000;

    /* renamed from: b */
    public static final int f30489b = -13010;

    /* renamed from: c */
    public static final int f30490c = -13011;

    /* renamed from: d */
    public static final int f30491d = -13012;

    /* renamed from: e */
    public static final int f30492e = -13013;

    /* renamed from: f */
    public static final int f30493f = -13020;

    /* renamed from: g */
    public static final int f30494g = -13021;

    /* renamed from: h */
    public static final int f30495h = -13030;

    /* renamed from: i */
    public static final int f30496i = -13031;

    /* renamed from: j */
    public static final int f30497j = -13040;

    /* renamed from: k */
    static IOException f30498k;

    /* renamed from: l */
    static final /* synthetic */ boolean f30499l;

    /* renamed from: m */
    private final int f30500m;

    /* renamed from: n */
    private final int f30501n;

    /* renamed from: o */
    private String f30502o;

    /* renamed from: p */
    private Throwable f30503p;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.c.g$a */
    /* loaded from: classes.dex */
    public @interface AbstractC9775a {
    }

    static {
        f30499l = !C9774g.class.desiredAssertionStatus();
        f30498k = new IOException("The operation was canceled.");
    }

    C9774g(int i, Throwable th, int i2) {
        this.f30502o = m7119a(i);
        this.f30503p = th;
        this.f30500m = i;
        this.f30501n = i2;
        String str = this.f30502o;
        String valueOf = String.valueOf(Integer.toString(this.f30500m));
        String valueOf2 = String.valueOf(Integer.toString(this.f30501n));
        Log.e("StorageException", new StringBuilder(String.valueOf(str).length() + 52 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length()).append("StorageException has occurred.\n").append(str).append("\n Code: ").append(valueOf).append(" HttpResult: ").append(valueOf2).toString());
        if (this.f30503p != null) {
            Log.e("StorageException", this.f30503p.getMessage(), this.f30503p);
        }
    }

    C9774g(Status status) {
        this(m7113b(status), null, 0);
    }

    C9774g(@Nullable Throwable th, int i) {
        this(m7112b(th, i), th, i);
    }

    @NonNull
    /* renamed from: a */
    public static C9774g m7118a(@NonNull Status status) {
        C4588d.m23627a(status);
        C4588d.m23619b(!status.m24018f());
        return new C9774g(status);
    }

    @NonNull
    /* renamed from: a */
    public static C9774g m7117a(@NonNull Throwable th) {
        C9774g m7116a = m7116a(th, 0);
        if (f30499l || m7116a != null) {
            return m7116a;
        }
        throw new AssertionError();
    }

    @Nullable
    /* renamed from: a */
    public static C9774g m7116a(@Nullable Throwable th, int i) {
        if (th instanceof C9774g) {
            return (C9774g) th;
        }
        if (m7114b(i) && th == null) {
            return null;
        }
        return new C9774g(th, i);
    }

    /* renamed from: a */
    static String m7119a(int i) {
        switch (i) {
            case f30497j /* -13040 */:
                return "The operation was cancelled.";
            case f30496i /* -13031 */:
                return "Object has a checksum which does not match. Please retry the operation.";
            case f30495h /* -13030 */:
                return "The operation retry limit has been exceeded.";
            case f30494g /* -13021 */:
                return "User does not have permission to access this object.";
            case f30493f /* -13020 */:
                return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
            case f30492e /* -13013 */:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case f30491d /* -13012 */:
                return "Project does not exist.";
            case f30490c /* -13011 */:
                return "Bucket does not exist.";
            case f30489b /* -13010 */:
                return "Object does not exist at location.";
            case f30488a /* -13000 */:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    /* renamed from: b */
    private static int m7113b(Status status) {
        return status.m24017g() ? f30497j : status == Status.f16789d ? f30495h : f30488a;
    }

    /* renamed from: b */
    private static int m7112b(@Nullable Throwable th, int i) {
        if (th == f30498k) {
            return f30497j;
        }
        switch (i) {
            case -2:
                return f30495h;
            case 401:
                return f30493f;
            case 403:
                return f30494g;
            case C9357e.f29594j /* 404 */:
                return f30489b;
            default:
                return f30488a;
        }
    }

    /* renamed from: b */
    private static boolean m7114b(int i) {
        return i == 0 || (i >= 200 && i < 300);
    }

    /* renamed from: a */
    public int m7120a() {
        return this.f30500m;
    }

    /* renamed from: b */
    public int m7115b() {
        return this.f30501n;
    }

    /* renamed from: c */
    public boolean m7111c() {
        return m7120a() == -13030;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        if (this.f30503p == this) {
            return null;
        }
        return this.f30503p;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f30502o;
    }
}
