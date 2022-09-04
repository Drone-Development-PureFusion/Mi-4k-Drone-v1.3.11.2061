package com.google.android.gms.p231b;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4585c;
import java.util.List;
/* renamed from: com.google.android.gms.b.b */
/* loaded from: classes2.dex */
public final class C4149b {

    /* renamed from: a */
    private final Uri f15739a;

    private C4149b(Uri uri) {
        this.f15739a = uri;
    }

    /* renamed from: a */
    public static C4149b m25335a(Uri uri) {
        C4149b c4149b = new C4149b(uri);
        if (m25334a(c4149b)) {
            return c4149b;
        }
        throw new IllegalArgumentException("AndroidAppUri validation failed.");
    }

    /* renamed from: a */
    public static C4149b m25333a(String str, Uri uri) {
        Uri.Builder authority = new Uri.Builder().scheme("android-app").authority(str);
        if (uri != null) {
            authority.appendPath(uri.getScheme());
            if (uri.getAuthority() != null) {
                authority.appendPath(uri.getAuthority());
            }
            for (String str2 : uri.getPathSegments()) {
                authority.appendPath(str2);
            }
            authority.encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment());
        }
        return new C4149b(authority.build());
    }

    /* renamed from: a */
    private static boolean m25334a(C4149b c4149b) {
        if (!"android-app".equals(c4149b.f15739a.getScheme())) {
            throw new IllegalArgumentException("android-app scheme is required.");
        }
        if (TextUtils.isEmpty(c4149b.m25332b())) {
            throw new IllegalArgumentException("Package name is empty.");
        }
        if (c4149b.f15739a.equals(m25333a(c4149b.m25332b(), c4149b.m25331c()).m25336a())) {
            return true;
        }
        throw new IllegalArgumentException("URI is not canonical.");
    }

    /* renamed from: a */
    public Uri m25336a() {
        return this.f15739a;
    }

    /* renamed from: b */
    public String m25332b() {
        return this.f15739a.getAuthority();
    }

    /* renamed from: c */
    public Uri m25331c() {
        List<String> pathSegments = this.f15739a.getPathSegments();
        if (pathSegments.size() > 0) {
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(pathSegments.get(0));
            if (pathSegments.size() > 1) {
                builder.authority(pathSegments.get(1));
                int i = 2;
                while (true) {
                    int i2 = i;
                    if (i2 >= pathSegments.size()) {
                        break;
                    }
                    builder.appendPath(pathSegments.get(i2));
                    i = i2 + 1;
                }
            }
            builder.encodedQuery(this.f15739a.getEncodedQuery());
            builder.encodedFragment(this.f15739a.getEncodedFragment());
            return builder.build();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4149b) {
            return this.f15739a.equals(((C4149b) obj).f15739a);
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f15739a);
    }

    public String toString() {
        return this.f15739a.toString();
    }
}
