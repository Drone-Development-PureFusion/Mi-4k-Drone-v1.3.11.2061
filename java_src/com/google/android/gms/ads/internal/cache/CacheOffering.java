package com.google.android.gms.ads.internal.cache;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import java.util.List;
@aaa
/* loaded from: classes.dex */
public class CacheOffering extends AbstractSafeParcelable {
    public static final C3495d CREATOR = new C3495d();

    /* renamed from: a */
    public final int f13827a;
    @Nullable

    /* renamed from: b */
    public final String f13828b;

    /* renamed from: c */
    public final long f13829c;

    /* renamed from: d */
    public final String f13830d;

    /* renamed from: e */
    public final String f13831e;

    /* renamed from: f */
    public final String f13832f;

    /* renamed from: g */
    public final Bundle f13833g;

    /* renamed from: h */
    public final boolean f13834h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CacheOffering(int i, @Nullable String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z) {
        this.f13827a = i;
        this.f13828b = str;
        this.f13829c = j;
        this.f13830d = str2 == null ? "" : str2;
        this.f13831e = str3 == null ? "" : str3;
        this.f13832f = str4 == null ? "" : str4;
        this.f13833g = bundle == null ? new Bundle() : bundle;
        this.f13834h = z;
    }

    @Nullable
    /* renamed from: a */
    public static CacheOffering m27666a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                abr.d(new StringBuilder(62).append("Expected 2 path parts for namespace and id, found :").append(pathSegments.size()).toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : C3779u.m26888g().mo18299a(uri)) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring("tag.".length()), uri.getQueryParameter(str3));
                }
            }
            return new CacheOffering(1, queryParameter, parseLong, host, str, str2, bundle, equals);
        } catch (NullPointerException | NumberFormatException e) {
            abr.d("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public static CacheOffering m27665a(String str) {
        return m27666a(Uri.parse(str));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3495d.m27644a(this, parcel, i);
    }
}
