package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.iid.FirebaseInstanceId;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.Map;
/* loaded from: classes.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C9925e();

    /* renamed from: a */
    final int f30844a;

    /* renamed from: b */
    Bundle f30845b;

    /* renamed from: c */
    private Map<String, String> f30846c;

    /* renamed from: d */
    private C9920b f30847d;

    /* renamed from: com.google.firebase.messaging.RemoteMessage$a */
    /* loaded from: classes2.dex */
    public static class C9919a {

        /* renamed from: a */
        private final Bundle f30848a = new Bundle();

        /* renamed from: b */
        private final Map<String, String> f30849b = new ArrayMap();

        public C9919a(String str) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid to: ".concat(valueOf) : new String("Invalid to: "));
            } else {
                this.f30848a.putString("google.to", str);
            }
        }

        /* renamed from: a */
        public C9919a m6498a(int i) {
            this.f30848a.putString("google.ttl", String.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public C9919a m6497a(String str) {
            this.f30848a.putString("google.message_id", str);
            return this;
        }

        /* renamed from: a */
        public C9919a m6496a(String str, String str2) {
            this.f30849b.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public C9919a m6495a(Map<String, String> map) {
            this.f30849b.clear();
            this.f30849b.putAll(map);
            return this;
        }

        /* renamed from: a */
        public RemoteMessage m6499a() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f30849b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.f30848a);
            String m6605f = FirebaseInstanceId.m6622a().m6605f();
            if (m6605f != null) {
                this.f30848a.putString("from", m6605f);
            } else {
                this.f30848a.remove("from");
            }
            return new RemoteMessage(bundle);
        }

        /* renamed from: b */
        public C9919a m6494b() {
            this.f30849b.clear();
            return this;
        }

        /* renamed from: b */
        public C9919a m6493b(String str) {
            this.f30848a.putString(PushMessageHelper.MESSAGE_TYPE, str);
            return this;
        }

        /* renamed from: c */
        public C9919a m6492c(String str) {
            this.f30848a.putString("collapse_key", str);
            return this;
        }
    }

    /* renamed from: com.google.firebase.messaging.RemoteMessage$b */
    /* loaded from: classes2.dex */
    public static class C9920b {

        /* renamed from: a */
        private final String f30850a;

        /* renamed from: b */
        private final String f30851b;

        /* renamed from: c */
        private final String[] f30852c;

        /* renamed from: d */
        private final String f30853d;

        /* renamed from: e */
        private final String f30854e;

        /* renamed from: f */
        private final String[] f30855f;

        /* renamed from: g */
        private final String f30856g;

        /* renamed from: h */
        private final String f30857h;

        /* renamed from: i */
        private final String f30858i;

        /* renamed from: j */
        private final String f30859j;

        /* renamed from: k */
        private final String f30860k;

        private C9920b(Bundle bundle) {
            this.f30850a = C9923c.m6467a(bundle, "gcm.n.title");
            this.f30851b = C9923c.m6462b(bundle, "gcm.n.title");
            this.f30852c = m6490a(bundle, "gcm.n.title");
            this.f30853d = C9923c.m6467a(bundle, "gcm.n.body");
            this.f30854e = C9923c.m6462b(bundle, "gcm.n.body");
            this.f30855f = m6490a(bundle, "gcm.n.body");
            this.f30856g = C9923c.m6467a(bundle, "gcm.n.icon");
            this.f30857h = C9923c.m6460c(bundle);
            this.f30858i = C9923c.m6467a(bundle, "gcm.n.tag");
            this.f30859j = C9923c.m6467a(bundle, "gcm.n.color");
            this.f30860k = C9923c.m6467a(bundle, "gcm.n.click_action");
        }

        /* renamed from: a */
        private String[] m6490a(Bundle bundle, String str) {
            Object[] m6459c = C9923c.m6459c(bundle, str);
            if (m6459c == null) {
                return null;
            }
            String[] strArr = new String[m6459c.length];
            for (int i = 0; i < m6459c.length; i++) {
                strArr[i] = String.valueOf(m6459c[i]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String m6491a() {
            return this.f30850a;
        }

        /* renamed from: b */
        public String m6489b() {
            return this.f30851b;
        }

        /* renamed from: c */
        public String[] m6488c() {
            return this.f30852c;
        }

        /* renamed from: d */
        public String m6487d() {
            return this.f30853d;
        }

        /* renamed from: e */
        public String m6486e() {
            return this.f30854e;
        }

        /* renamed from: f */
        public String[] m6485f() {
            return this.f30855f;
        }

        /* renamed from: g */
        public String m6484g() {
            return this.f30856g;
        }

        /* renamed from: h */
        public String m6483h() {
            return this.f30857h;
        }

        /* renamed from: i */
        public String m6482i() {
            return this.f30858i;
        }

        /* renamed from: j */
        public String m6481j() {
            return this.f30859j;
        }

        /* renamed from: k */
        public String m6480k() {
            return this.f30860k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoteMessage(int i, Bundle bundle) {
        this.f30844a = i;
        this.f30845b = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoteMessage(Bundle bundle) {
        this(1, bundle);
    }

    /* renamed from: a */
    public String m6509a() {
        return this.f30845b.getString("from");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6508a(Intent intent) {
        intent.putExtras(this.f30845b);
    }

    /* renamed from: b */
    public String m6507b() {
        return this.f30845b.getString("google.to");
    }

    /* renamed from: c */
    public Map<String, String> m6506c() {
        if (this.f30846c == null) {
            this.f30846c = new ArrayMap();
            for (String str : this.f30845b.keySet()) {
                Object obj = this.f30845b.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals(PushMessageHelper.MESSAGE_TYPE) && !str.equals("collapse_key")) {
                        this.f30846c.put(str, str2);
                    }
                }
            }
        }
        return this.f30846c;
    }

    /* renamed from: d */
    public String m6505d() {
        return this.f30845b.getString("collapse_key");
    }

    /* renamed from: e */
    public String m6504e() {
        String string = this.f30845b.getString("google.message_id");
        return string == null ? this.f30845b.getString("message_id") : string;
    }

    /* renamed from: f */
    public String m6503f() {
        return this.f30845b.getString(PushMessageHelper.MESSAGE_TYPE);
    }

    /* renamed from: g */
    public long m6502g() {
        return this.f30845b.getLong("google.sent_time");
    }

    /* renamed from: h */
    public int m6501h() {
        Object obj = this.f30845b.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(obj);
                Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(valueOf).length() + 13).append("Invalid TTL: ").append(valueOf).toString());
            }
        }
        return 0;
    }

    /* renamed from: i */
    public C9920b m6500i() {
        if (this.f30847d == null && C9923c.m6469a(this.f30845b)) {
            this.f30847d = new C9920b(this.f30845b);
        }
        return this.f30847d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9925e.m6444a(this, parcel, i);
    }
}
