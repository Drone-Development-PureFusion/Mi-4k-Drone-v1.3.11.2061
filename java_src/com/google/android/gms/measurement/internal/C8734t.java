package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import java.util.Iterator;
/* renamed from: com.google.android.gms.measurement.internal.t */
/* loaded from: classes2.dex */
public class C8734t {

    /* renamed from: a */
    final String f27936a;

    /* renamed from: b */
    final String f27937b;

    /* renamed from: c */
    final String f27938c;

    /* renamed from: d */
    final long f27939d;

    /* renamed from: e */
    final long f27940e;

    /* renamed from: f */
    final EventParams f27941f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8734t(C8668aj c8668aj, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C4588d.m23625a(str2);
        C4588d.m23625a(str3);
        this.f27936a = str2;
        this.f27937b = str3;
        this.f27938c = TextUtils.isEmpty(str) ? null : str;
        this.f27939d = j;
        this.f27940e = j2;
        if (this.f27940e != 0 && this.f27940e > this.f27939d) {
            c8668aj.m10698f().m10832z().m10831a("Event created with reverse previous/current timestamps");
        }
        this.f27941f = m10347a(c8668aj, bundle);
    }

    private C8734t(C8668aj c8668aj, String str, String str2, String str3, long j, long j2, EventParams eventParams) {
        C4588d.m23625a(str2);
        C4588d.m23625a(str3);
        C4588d.m23627a(eventParams);
        this.f27936a = str2;
        this.f27937b = str3;
        this.f27938c = TextUtils.isEmpty(str) ? null : str;
        this.f27939d = j;
        this.f27940e = j2;
        if (this.f27940e != 0 && this.f27940e > this.f27939d) {
            c8668aj.m10698f().m10832z().m10831a("Event created with reverse previous/current timestamps");
        }
        this.f27941f = eventParams;
    }

    /* renamed from: a */
    static EventParams m10347a(C8668aj c8668aj, Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return new EventParams(new Bundle());
        }
        Bundle bundle2 = new Bundle(bundle);
        Iterator<String> it2 = bundle2.keySet().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (next == null) {
                c8668aj.m10698f().m10834f().m10831a("Param name can't be null");
                it2.remove();
            } else {
                Object m10513b = c8668aj.m10689o().m10513b(next, bundle2.get(next));
                if (m10513b == null) {
                    c8668aj.m10698f().m10832z().m10830a("Param value can't be null", next);
                    it2.remove();
                } else {
                    c8668aj.m10689o().m10543a(bundle2, next, m10513b);
                }
            }
        }
        return new EventParams(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C8734t m10348a(C8668aj c8668aj, long j) {
        return new C8734t(c8668aj, this.f27938c, this.f27936a, this.f27937b, this.f27939d, j, this.f27941f);
    }

    public String toString() {
        String str = this.f27936a;
        String str2 = this.f27937b;
        String valueOf = String.valueOf(this.f27941f);
        return new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length()).append("Event{appId='").append(str).append("'").append(", name='").append(str2).append("'").append(", params=").append(valueOf).append("}").toString();
    }
}
