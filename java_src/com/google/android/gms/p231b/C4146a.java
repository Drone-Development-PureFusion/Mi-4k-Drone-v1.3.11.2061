package com.google.android.gms.p231b;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.fitness.C5129d;
import com.google.android.gms.p231b.C4154e;
/* renamed from: com.google.android.gms.b.a */
/* loaded from: classes2.dex */
public final class C4146a extends C4154e {

    /* renamed from: a */
    public static final String f15723a = "http://schema.org/ActivateAction";

    /* renamed from: b */
    public static final String f15724b = "http://schema.org/AddAction";

    /* renamed from: c */
    public static final String f15725c = "http://schema.org/BookmarkAction";

    /* renamed from: d */
    public static final String f15726d = "http://schema.org/CommunicateAction";

    /* renamed from: e */
    public static final String f15727e = "http://schema.org/FilmAction";

    /* renamed from: f */
    public static final String f15728f = "http://schema.org/LikeAction";

    /* renamed from: g */
    public static final String f15729g = "http://schema.org/ListenAction";

    /* renamed from: h */
    public static final String f15730h = "http://schema.org/PhotographAction";

    /* renamed from: i */
    public static final String f15731i = "http://schema.org/ReserveAction";

    /* renamed from: j */
    public static final String f15732j = "http://schema.org/SearchAction";

    /* renamed from: k */
    public static final String f15733k = "http://schema.org/ViewAction";

    /* renamed from: l */
    public static final String f15734l = "http://schema.org/WantAction";

    /* renamed from: m */
    public static final String f15735m = "http://schema.org/WatchAction";

    /* renamed from: n */
    public static final String f15736n = "http://schema.org/ActiveActionStatus";

    /* renamed from: o */
    public static final String f15737o = "http://schema.org/CompletedActionStatus";

    /* renamed from: p */
    public static final String f15738p = "http://schema.org/FailedActionStatus";

    /* renamed from: com.google.android.gms.b.a$a */
    /* loaded from: classes2.dex */
    public static final class C4148a extends C4154e.C4155a {
        public C4148a(String str) {
            C4588d.m23627a(str);
            super.mo25326b("type", str);
        }

        @Override // com.google.android.gms.p231b.C4154e.C4155a
        /* renamed from: a */
        public C4148a mo25328b(Uri uri) {
            if (uri != null) {
                super.mo25326b("url", uri.toString());
            }
            return this;
        }

        /* renamed from: a */
        public C4148a m25344a(C4154e c4154e) {
            C4588d.m23627a(c4154e);
            return (C4148a) super.mo25327b("object", c4154e);
        }

        @Override // com.google.android.gms.p231b.C4154e.C4155a
        /* renamed from: a */
        public C4148a mo25322c(String str) {
            return (C4148a) super.mo25326b("name", str);
        }

        @Override // com.google.android.gms.p231b.C4154e.C4155a
        /* renamed from: a */
        public C4148a mo25327b(String str, C4154e c4154e) {
            return (C4148a) super.mo25327b(str, c4154e);
        }

        @Override // com.google.android.gms.p231b.C4154e.C4155a
        /* renamed from: a */
        public C4148a mo25326b(String str, String str2) {
            return (C4148a) super.mo25326b(str, str2);
        }

        @Override // com.google.android.gms.p231b.C4154e.C4155a
        /* renamed from: a */
        public C4148a mo25325b(String str, boolean z) {
            return (C4148a) super.mo25325b(str, z);
        }

        @Override // com.google.android.gms.p231b.C4154e.C4155a
        /* renamed from: a */
        public C4148a mo25324b(String str, C4154e[] c4154eArr) {
            return (C4148a) super.mo25324b(str, c4154eArr);
        }

        @Override // com.google.android.gms.p231b.C4154e.C4155a
        /* renamed from: a */
        public C4148a mo25323b(String str, String[] strArr) {
            return (C4148a) super.mo25323b(str, strArr);
        }

        @Override // com.google.android.gms.p231b.C4154e.C4155a
        /* renamed from: a */
        public C4146a mo25329b() {
            C4588d.m23626a(this.f15747a.get("object"), "setObject is required before calling build().");
            C4588d.m23626a(this.f15747a.get("type"), "setType is required before calling build().");
            Bundle bundle = (Bundle) this.f15747a.getParcelable("object");
            C4588d.m23626a(bundle.get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            C4588d.m23626a(bundle.get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            return new C4146a(this.f15747a);
        }

        /* renamed from: b */
        public C4148a m25337b(String str) {
            C4588d.m23627a(str);
            return (C4148a) super.mo25326b(C5129d.f18324b, str);
        }
    }

    private C4146a(Bundle bundle) {
        super(bundle);
    }

    /* renamed from: a */
    public static C4146a m25348a(String str, String str2, Uri uri) {
        return m25347a(str, str2, null, uri);
    }

    /* renamed from: a */
    public static C4146a m25347a(String str, String str2, Uri uri, Uri uri2) {
        return (C4146a) new C4148a(str).m25344a(new C4154e.C4155a().mo25322c(str2).m25321d(uri == null ? null : uri.toString()).mo25328b(uri2).mo25329b()).mo25329b();
    }
}
