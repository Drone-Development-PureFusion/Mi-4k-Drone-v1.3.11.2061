package com.google.android.gms.p231b;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.b.e */
/* loaded from: classes2.dex */
public class C4154e {

    /* renamed from: q */
    final Bundle f15746q;

    /* renamed from: com.google.android.gms.b.e$a */
    /* loaded from: classes2.dex */
    public static class C4155a {

        /* renamed from: a */
        final Bundle f15747a = new Bundle();

        /* renamed from: b */
        public C4155a mo25328b(Uri uri) {
            C4588d.m23627a(uri);
            mo25326b("url", uri.toString());
            return this;
        }

        /* renamed from: b */
        public C4155a mo25327b(String str, C4154e c4154e) {
            C4588d.m23627a(str);
            if (c4154e != null) {
                this.f15747a.putParcelable(str, c4154e.f15746q);
            }
            return this;
        }

        /* renamed from: b */
        public C4155a mo25326b(String str, String str2) {
            C4588d.m23627a(str);
            if (str2 != null) {
                this.f15747a.putString(str, str2);
            }
            return this;
        }

        /* renamed from: b */
        public C4155a mo25325b(String str, boolean z) {
            C4588d.m23627a(str);
            this.f15747a.putBoolean(str, z);
            return this;
        }

        /* renamed from: b */
        public C4155a mo25324b(String str, C4154e[] c4154eArr) {
            C4588d.m23627a(str);
            if (c4154eArr != null) {
                ArrayList arrayList = new ArrayList();
                for (C4154e c4154e : c4154eArr) {
                    if (c4154e != null) {
                        arrayList.add(c4154e.f15746q);
                    }
                }
                this.f15747a.putParcelableArray(str, (Parcelable[]) arrayList.toArray(new Bundle[arrayList.size()]));
            }
            return this;
        }

        /* renamed from: b */
        public C4155a mo25323b(String str, String[] strArr) {
            C4588d.m23627a(str);
            if (strArr != null) {
                this.f15747a.putStringArray(str, strArr);
            }
            return this;
        }

        /* renamed from: b */
        public C4154e mo25329b() {
            return new C4154e(this.f15747a);
        }

        /* renamed from: c */
        public C4155a mo25322c(String str) {
            C4588d.m23627a(str);
            mo25326b("name", str);
            return this;
        }

        /* renamed from: d */
        public C4155a m25321d(String str) {
            if (str != null) {
                mo25326b("id", str);
            }
            return this;
        }

        /* renamed from: e */
        public C4155a m25320e(String str) {
            mo25326b("type", str);
            return this;
        }

        /* renamed from: f */
        public C4155a m25319f(String str) {
            mo25326b("description", str);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4154e(Bundle bundle) {
        this.f15746q = bundle;
    }

    /* renamed from: a */
    public Bundle m25330a() {
        return this.f15746q;
    }
}
