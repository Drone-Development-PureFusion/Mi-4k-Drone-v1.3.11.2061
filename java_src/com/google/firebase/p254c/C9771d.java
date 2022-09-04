package com.google.firebase.p254c;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7439ng;
import com.google.firebase.C9751b;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.firebase.c.d */
/* loaded from: classes2.dex */
public class C9771d {

    /* renamed from: a */
    static final /* synthetic */ boolean f30482a;

    /* renamed from: b */
    private static final Map<C9751b, C9771d> f30483b;

    /* renamed from: c */
    private final C9751b f30484c;

    /* renamed from: d */
    private long f30485d = 600000;

    /* renamed from: e */
    private long f30486e = 600000;

    /* renamed from: f */
    private long f30487f = 120000;

    static {
        f30482a = !C9771d.class.desiredAssertionStatus();
        f30483b = new HashMap();
    }

    private C9771d(@NonNull C9751b c9751b) {
        this.f30484c = c9751b;
    }

    @NonNull
    /* renamed from: a */
    public static C9771d m7136a() {
        C9751b m7205d = C9751b.m7205d();
        C4588d.m23618b(m7205d != null, "You must call FirebaseApp.initialize() first.");
        if (f30482a || m7205d != null) {
            return m7133a(m7205d);
        }
        throw new AssertionError();
    }

    @NonNull
    /* renamed from: a */
    public static C9771d m7133a(@NonNull C9751b c9751b) {
        C9771d c9771d;
        C4588d.m23618b(c9751b != null, "Null is not a valid value for the FirebaseApp.");
        synchronized (f30483b) {
            c9771d = f30483b.get(c9751b);
            if (c9771d == null) {
                c9771d = new C9771d(c9751b);
                f30483b.put(c9751b, c9771d);
            }
        }
        return c9771d;
    }

    @NonNull
    /* renamed from: a */
    private C9779i m7134a(@NonNull Uri uri) {
        C4588d.m23626a(uri, "uri must not be null");
        String m7123g = m7123g();
        C4588d.m23618b(TextUtils.isEmpty(m7123g) || uri.getAuthority().equalsIgnoreCase(m7123g), "The supplied bucketname is not available to this project.");
        return new C9779i(uri, this);
    }

    @Nullable
    /* renamed from: g */
    private String m7123g() {
        return this.f30484c.m7208c().m6631e();
    }

    @NonNull
    /* renamed from: a */
    public C9779i m7132a(@NonNull String str) {
        C4588d.m23618b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
            try {
                Uri m14484a = C7439ng.m14484a(this.f30484c, str);
                if (m14484a != null) {
                    return m7134a(m14484a);
                }
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            } catch (UnsupportedEncodingException e) {
                String valueOf = String.valueOf(str);
                Log.e("FirebaseStorage", valueOf.length() != 0 ? "Unable to parse location:".concat(valueOf) : new String("Unable to parse location:"), e);
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            }
        }
        throw new IllegalArgumentException("The storage Uri could not be parsed.");
    }

    /* renamed from: a */
    public void m7135a(long j) {
        this.f30486e = j;
    }

    /* renamed from: b */
    public long m7131b() {
        return this.f30486e;
    }

    @NonNull
    /* renamed from: b */
    public C9779i m7129b(@NonNull String str) {
        C4588d.m23618b(!TextUtils.isEmpty(str), "location must not be null or empty");
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("gs://") || lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) {
            throw new IllegalArgumentException("location should not be a full URL.");
        }
        return m7125e().m7054a(str);
    }

    /* renamed from: b */
    public void m7130b(long j) {
        this.f30485d = j;
    }

    /* renamed from: c */
    public long m7128c() {
        return this.f30485d;
    }

    /* renamed from: c */
    public void m7127c(long j) {
        this.f30487f = j;
    }

    /* renamed from: d */
    public long m7126d() {
        return this.f30487f;
    }

    @NonNull
    /* renamed from: e */
    public C9779i m7125e() {
        if (TextUtils.isEmpty(m7123g())) {
            throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
        }
        return m7134a(new Uri.Builder().scheme("gs").authority(m7123g()).path("/").build());
    }

    @NonNull
    /* renamed from: f */
    public C9751b m7124f() {
        return this.f30484c;
    }
}
