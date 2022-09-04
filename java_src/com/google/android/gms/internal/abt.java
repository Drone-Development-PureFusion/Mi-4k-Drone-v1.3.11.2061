package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.concurrent.Future;
@aaa
/* loaded from: classes.dex */
public final class abt {

    /* renamed from: com.google.android.gms.internal.abt$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC6148a extends abq {
        private AbstractC6148a() {
        }

        @Override // com.google.android.gms.internal.abq
        /* renamed from: b */
        public void mo12779b() {
        }
    }

    /* renamed from: com.google.android.gms.internal.abt$b */
    /* loaded from: classes2.dex */
    public interface AbstractC6149b {
        /* renamed from: a */
        void mo18393a(Bundle bundle);
    }

    /* renamed from: a */
    public static SharedPreferences m18408a(Context context) {
        return context.getSharedPreferences("admob", 0);
    }

    /* renamed from: a */
    public static Future m18407a(final Context context, final int i) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences.Editor edit = abt.m18408a(context).edit();
                edit.putInt("request_in_session_count", i);
                edit.apply();
            }
        }.mo12820e();
    }

    /* renamed from: a */
    public static Future m18406a(final Context context, final long j) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences.Editor edit = abt.m18408a(context).edit();
                edit.putLong("app_last_background_time_ms", j);
                edit.apply();
            }
        }.mo12820e();
    }

    /* renamed from: a */
    public static Future m18405a(final Context context, final AbstractC6149b abstractC6149b) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences m18408a = abt.m18408a(context);
                Bundle bundle = new Bundle();
                bundle.putBoolean("use_https", m18408a.getBoolean("use_https", true));
                if (abstractC6149b != null) {
                    abstractC6149b.mo18393a(bundle);
                }
            }
        }.mo12820e();
    }

    /* renamed from: a */
    public static Future m18404a(final Context context, final String str) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences.Editor edit = abt.m18408a(context).edit();
                edit.putString("content_url_hashes", str);
                edit.apply();
            }
        }.mo12820e();
    }

    /* renamed from: a */
    public static Future m18403a(final Context context, final String str, final long j) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences.Editor edit = abt.m18408a(context).edit();
                edit.putString("app_settings_json", str);
                edit.putLong("app_settings_last_update_ms", j);
                edit.apply();
            }
        }.mo12820e();
    }

    /* renamed from: a */
    public static Future m18402a(final Context context, final boolean z) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences.Editor edit = abt.m18408a(context).edit();
                edit.putBoolean("use_https", z);
                edit.apply();
            }
        }.mo12820e();
    }

    /* renamed from: b */
    public static Future m18401b(final Context context, final AbstractC6149b abstractC6149b) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences m18408a = abt.m18408a(context);
                Bundle bundle = new Bundle();
                bundle.putInt("webview_cache_version", m18408a.getInt("webview_cache_version", 0));
                if (abstractC6149b != null) {
                    abstractC6149b.mo18393a(bundle);
                }
            }
        }.mo12820e();
    }

    /* renamed from: b */
    public static Future m18400b(final Context context, final boolean z) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences.Editor edit = abt.m18408a(context).edit();
                edit.putBoolean("content_url_opted_out", z);
                edit.apply();
            }
        }.mo12820e();
    }

    /* renamed from: c */
    public static Future m18399c(final Context context, final AbstractC6149b abstractC6149b) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences m18408a = abt.m18408a(context);
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", m18408a.getBoolean("content_url_opted_out", true));
                if (abstractC6149b != null) {
                    abstractC6149b.mo18393a(bundle);
                }
            }
        }.mo12820e();
    }

    /* renamed from: c */
    public static Future m18398c(final Context context, final boolean z) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences.Editor edit = abt.m18408a(context).edit();
                edit.putBoolean("auto_collect_location", z);
                edit.apply();
            }
        }.mo12820e();
    }

    /* renamed from: d */
    public static Future m18397d(final Context context, final AbstractC6149b abstractC6149b) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences m18408a = abt.m18408a(context);
                Bundle bundle = new Bundle();
                bundle.putString("content_url_hashes", m18408a.getString("content_url_hashes", ""));
                if (abstractC6149b != null) {
                    abstractC6149b.mo18393a(bundle);
                }
            }
        }.mo12820e();
    }

    /* renamed from: e */
    public static Future m18396e(final Context context, final AbstractC6149b abstractC6149b) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences m18408a = abt.m18408a(context);
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", m18408a.getBoolean("auto_collect_location", false));
                if (abstractC6149b != null) {
                    abstractC6149b.mo18393a(bundle);
                }
            }
        }.mo12820e();
    }

    /* renamed from: f */
    public static Future m18395f(final Context context, final AbstractC6149b abstractC6149b) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences m18408a = abt.m18408a(context);
                Bundle bundle = new Bundle();
                bundle.putString("app_settings_json", m18408a.getString("app_settings_json", ""));
                bundle.putLong("app_settings_last_update_ms", m18408a.getLong("app_settings_last_update_ms", 0L));
                if (abstractC6149b != null) {
                    abstractC6149b.mo18393a(bundle);
                }
            }
        }.mo12820e();
    }

    /* renamed from: g */
    public static Future m18394g(final Context context, final AbstractC6149b abstractC6149b) {
        return (Future) new AbstractC6148a() { // from class: com.google.android.gms.internal.abt.11
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.abq
            /* renamed from: a */
            public void mo12782a() {
                SharedPreferences m18408a = abt.m18408a(context);
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", m18408a.getLong("app_last_background_time_ms", 0L));
                if (abstractC6149b != null) {
                    abstractC6149b.mo18393a(bundle);
                }
            }
        }.mo12820e();
    }
}
