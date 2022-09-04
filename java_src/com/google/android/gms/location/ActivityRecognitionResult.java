package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4631c;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C8164c CREATOR = new C8164c();

    /* renamed from: a */
    List<DetectedActivity> f26624a;

    /* renamed from: b */
    long f26625b;

    /* renamed from: c */
    long f26626c;

    /* renamed from: d */
    int f26627d;

    /* renamed from: e */
    Bundle f26628e;

    /* renamed from: f */
    private final int f26629f;

    public ActivityRecognitionResult(int i, List<DetectedActivity> list, long j, long j2, int i2, Bundle bundle) {
        this.f26629f = i;
        this.f26624a = list;
        this.f26625b = j;
        this.f26626c = j2;
        this.f26627d = i2;
        this.f26628e = bundle;
    }

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2) {
        this(detectedActivity, j, j2, 0, (Bundle) null);
    }

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2, int i, Bundle bundle) {
        this(Collections.singletonList(detectedActivity), j, j2, i, bundle);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2) {
        this(list, j, j2, 0, (Bundle) null);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z = true;
        C4588d.m23618b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        C4588d.m23618b((j <= 0 || j2 <= 0) ? false : z, "Must set times");
        this.f26629f = 2;
        this.f26624a = list;
        this.f26625b = j;
        this.f26626c = j2;
        this.f26627d = i;
        this.f26628e = bundle;
    }

    /* renamed from: a */
    public static boolean m12668a(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (m12659e(intent)) {
            return true;
        }
        List<ActivityRecognitionResult> m12661d = m12661d(intent);
        return m12661d != null && !m12661d.isEmpty();
    }

    /* renamed from: a */
    private static boolean m12667a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || (bundle != null && bundle2 == null)) {
            return false;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!m12667a(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static ActivityRecognitionResult m12665b(Intent intent) {
        ActivityRecognitionResult m12658f = m12658f(intent);
        if (m12658f != null) {
            return m12658f;
        }
        List<ActivityRecognitionResult> m12661d = m12661d(intent);
        if (m12661d != null && !m12661d.isEmpty()) {
            return m12661d.get(m12661d.size() - 1);
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m12663c(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST");
    }

    @Nullable
    /* renamed from: d */
    public static List<ActivityRecognitionResult> m12661d(Intent intent) {
        if (!m12663c(intent)) {
            return null;
        }
        return C4631c.m23441b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
    }

    /* renamed from: e */
    private static boolean m12659e(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
    }

    /* renamed from: f */
    private static ActivityRecognitionResult m12658f(Intent intent) {
        if (!m12668a(intent)) {
            return null;
        }
        Object obj = intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
        if (obj instanceof byte[]) {
            return (ActivityRecognitionResult) C4631c.m23442a((byte[]) obj, CREATOR);
        }
        if (!(obj instanceof ActivityRecognitionResult)) {
            return null;
        }
        return (ActivityRecognitionResult) obj;
    }

    /* renamed from: a */
    public int m12669a(int i) {
        for (DetectedActivity detectedActivity : this.f26624a) {
            if (detectedActivity.m12648a() == i) {
                return detectedActivity.m12646b();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public DetectedActivity m12670a() {
        return this.f26624a.get(0);
    }

    /* renamed from: b */
    public List<DetectedActivity> m12666b() {
        return this.f26624a;
    }

    /* renamed from: c */
    public long m12664c() {
        return this.f26625b;
    }

    /* renamed from: d */
    public long m12662d() {
        return this.f26626c;
    }

    /* renamed from: e */
    public int m12660e() {
        return this.f26629f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.f26625b == activityRecognitionResult.f26625b && this.f26626c == activityRecognitionResult.f26626c && this.f26627d == activityRecognitionResult.f26627d && C4585c.m23634a(this.f26624a, activityRecognitionResult.f26624a) && m12667a(this.f26628e, activityRecognitionResult.f26628e);
    }

    public int hashCode() {
        return C4585c.m23633a(Long.valueOf(this.f26625b), Long.valueOf(this.f26626c), Integer.valueOf(this.f26627d), this.f26624a, this.f26628e);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f26624a);
        long j = this.f26625b;
        return new StringBuilder(String.valueOf(valueOf).length() + 124).append("ActivityRecognitionResult [probableActivities=").append(valueOf).append(", timeMillis=").append(j).append(", elapsedRealtimeMillis=").append(this.f26626c).append("]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8164c.m12570a(this, parcel, i);
    }
}
