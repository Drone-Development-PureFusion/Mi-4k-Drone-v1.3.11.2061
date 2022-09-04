package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4683f;
import com.google.android.gms.measurement.internal.C8668aj;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import com.google.firebase.p251a.C9654a;
import com.p255mi.live.openlivesdk.C10022a;
import com.xiaomi.market.sdk.AbstractC10446k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: a */
    private final C8668aj f27586a;

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    /* loaded from: classes2.dex */
    public static final class C8635a extends C9654a.C9655a {

        /* renamed from: a */
        public static final Map<String, String> f27587a = C4683f.m23145a((Object[]) new String[]{"app_clear_data", "app_exception", "app_remove", "app_update", "firebase_campaign", "error", "first_open", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement"}, (Object[]) new String[]{"_cd", "_ae", "_ui", "_au", "_cmp", "_err", "_f", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e"});
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$b */
    /* loaded from: classes2.dex */
    public interface AbstractC8636b {
        @WorkerThread
        /* renamed from: a */
        void mo8894a(String str, String str2, Bundle bundle, long j);
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$c */
    /* loaded from: classes2.dex */
    public interface AbstractC8637c {
        @WorkerThread
        /* renamed from: a */
        void mo8893a(String str, String str2, Bundle bundle, long j);
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$d */
    /* loaded from: classes2.dex */
    public static final class C8638d extends C9654a.C9656b {

        /* renamed from: a */
        public static final Map<String, String> f27588a = C4683f.m23145a((Object[]) new String[]{"firebase_conversion", "engagement_time_msec", "firebase_error", "firebase_error_value", "firebase_error_length", C10022a.f30894c, "realtime", "firebase_event_origin", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update"}, (Object[]) new String[]{"_c", "_et", "_err", "_ev", "_el", "_dbg", "_r", "_o", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu"});
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$e */
    /* loaded from: classes2.dex */
    public static final class C8639e extends C9654a.C9657c {

        /* renamed from: a */
        public static final Map<String, String> f27589a = C4683f.m23145a((Object[]) new String[]{"firebase_last_notification", "first_open_time", "last_deep_link_referrer", "user_id"}, (Object[]) new String[]{"_ln", "_fot", "_ldl", AbstractC10446k._ID});
    }

    public AppMeasurement(C8668aj c8668aj) {
        C4588d.m23627a(c8668aj);
        this.f27586a = c8668aj;
    }

    /* renamed from: b */
    private void m10904b(String str, String str2, Object obj) {
        this.f27586a.m10692l().m10628a(str, str2, obj);
    }

    @Keep
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return C8668aj.m10727a(context).m10691m();
    }

    /* renamed from: a */
    public void m10915a(long j) {
        this.f27586a.m10692l().m10642a(j);
    }

    @WorkerThread
    /* renamed from: a */
    public void m10914a(AbstractC8636b abstractC8636b) {
        this.f27586a.m10692l().m10640a(abstractC8636b);
    }

    /* renamed from: a */
    public void m10913a(AbstractC8637c abstractC8637c) {
        this.f27586a.m10692l().m10639a(abstractC8637c);
    }

    /* renamed from: a */
    public void m10912a(String str) {
        m10907a("app", AbstractC10446k._ID, str);
    }

    /* renamed from: a */
    public void m10911a(@Size(max = 32, min = 1) @NonNull String str, Bundle bundle) {
        int m10514b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if ((this.f27586a.m10701d().m10471N() || !"_iap".equals(str)) && (m10514b = this.f27586a.m10689o().m10514b(str)) != 0) {
            this.f27586a.m10689o().m10550a(m10514b, "_ev", this.f27586a.m10689o().m10535a(str, this.f27586a.m10701d().m10441c(), true), str != null ? str.length() : 0);
        } else {
            this.f27586a.m10692l().m10630a("app", str, bundle, true);
        }
    }

    /* renamed from: a */
    public void m10910a(@Size(max = 24, min = 1) @NonNull String str, @Size(max = 36) @Nullable String str2) {
        int m10506d = this.f27586a.m10689o().m10506d(str);
        if (m10506d != 0) {
            this.f27586a.m10689o().m10550a(m10506d, "_ev", this.f27586a.m10689o().m10535a(str, this.f27586a.m10701d().m10439d(), true), str != null ? str.length() : 0);
        } else {
            m10907a("app", str, str2);
        }
    }

    /* renamed from: a */
    public void m10909a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f27586a.m10692l().m10632a(str, str2, bundle);
    }

    /* renamed from: a */
    public void m10908a(String str, String str2, Bundle bundle, long j) {
        this.f27586a.m10692l().m10631a(str, str2, bundle == null ? new Bundle() : bundle, j);
    }

    /* renamed from: a */
    public void m10907a(String str, String str2, Object obj) {
        m10904b(str, str2, obj);
    }

    @Deprecated
    /* renamed from: a */
    public void m10906a(boolean z) {
        this.f27586a.m10692l().m10626a(z);
    }

    @WorkerThread
    /* renamed from: b */
    public Map<String, Object> m10903b(boolean z) {
        List<UserAttributeParcel> m10623b = this.f27586a.m10692l().m10623b(z);
        HashMap hashMap = new HashMap(m10623b.size());
        for (UserAttributeParcel userAttributeParcel : m10623b) {
            hashMap.put(userAttributeParcel.f27615b, userAttributeParcel.m10894a());
        }
        return hashMap;
    }

    /* renamed from: b */
    public void m10905b(long j) {
        this.f27586a.m10692l().m10625b(j);
    }
}
