package com.google.firebase.p254c;

import android.net.Uri;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7435nc;
import com.google.android.gms.internal.C7439ng;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* renamed from: com.google.firebase.c.h */
/* loaded from: classes2.dex */
public class C9776h {

    /* renamed from: a */
    private String f30504a;

    /* renamed from: b */
    private C9771d f30505b;

    /* renamed from: c */
    private C9779i f30506c;

    /* renamed from: d */
    private String f30507d;

    /* renamed from: e */
    private String f30508e;

    /* renamed from: f */
    private String f30509f;

    /* renamed from: g */
    private String f30510g;

    /* renamed from: h */
    private String f30511h;

    /* renamed from: i */
    private String f30512i;

    /* renamed from: j */
    private long f30513j;

    /* renamed from: k */
    private String f30514k;

    /* renamed from: l */
    private String f30515l;

    /* renamed from: m */
    private String f30516m;

    /* renamed from: n */
    private String f30517n;

    /* renamed from: o */
    private String f30518o;

    /* renamed from: p */
    private Map<String, String> f30519p;

    /* renamed from: q */
    private String[] f30520q;

    /* renamed from: com.google.firebase.c.h$a */
    /* loaded from: classes2.dex */
    public static class C9778a {

        /* renamed from: a */
        C9776h f30521a;

        /* renamed from: b */
        boolean f30522b;

        public C9778a() {
            this.f30521a = new C9776h();
        }

        public C9778a(C9776h c9776h) {
            this.f30521a = new C9776h(false);
        }

        C9778a(JSONObject jSONObject) {
            this.f30521a = new C9776h();
            if (jSONObject != null) {
                m7069a(jSONObject);
                this.f30522b = true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C9778a(JSONObject jSONObject, C9779i c9779i) {
            this(jSONObject);
            this.f30521a.f30506c = c9779i;
        }

        /* renamed from: a */
        private void m7069a(JSONObject jSONObject) {
            this.f30521a.f30508e = jSONObject.optString("generation");
            this.f30521a.f30504a = jSONObject.optString("name");
            this.f30521a.f30507d = jSONObject.optString("bucket");
            this.f30521a.f30510g = jSONObject.optString("metageneration");
            this.f30521a.f30511h = jSONObject.optString("timeCreated");
            this.f30521a.f30512i = jSONObject.optString("updated");
            this.f30521a.f30513j = jSONObject.optLong("size");
            this.f30521a.f30514k = jSONObject.optString("md5Hash");
            this.f30521a.m7101b(jSONObject.optString("downloadTokens"));
            m7065e(jSONObject.optString("contentType"));
            if (jSONObject.has("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m7070a(next, jSONObject2.getString(next));
                }
            }
            m7066d(jSONObject.optString("cacheControl"));
            m7067c(jSONObject.optString("contentDisposition"));
            m7068b(jSONObject.optString("'contentEncoding"));
            m7071a(jSONObject.optString("'contentLanguage"));
        }

        /* renamed from: a */
        public C9778a m7071a(String str) {
            this.f30521a.f30518o = str;
            return this;
        }

        /* renamed from: a */
        public C9778a m7070a(String str, String str2) {
            if (this.f30521a.f30519p == null) {
                this.f30521a.f30519p = new HashMap();
            }
            this.f30521a.f30519p.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public C9776h m7072a() {
            return new C9776h(this.f30522b);
        }

        /* renamed from: b */
        public C9778a m7068b(String str) {
            this.f30521a.f30517n = str;
            return this;
        }

        /* renamed from: c */
        public C9778a m7067c(String str) {
            this.f30521a.f30516m = str;
            return this;
        }

        /* renamed from: d */
        public C9778a m7066d(String str) {
            this.f30521a.f30515l = str;
            return this;
        }

        /* renamed from: e */
        public C9778a m7065e(String str) {
            this.f30521a.f30509f = str;
            return this;
        }
    }

    public C9776h() {
        this.f30504a = null;
        this.f30505b = null;
        this.f30506c = null;
        this.f30507d = null;
        this.f30508e = null;
        this.f30509f = null;
        this.f30510g = null;
        this.f30511h = null;
        this.f30512i = null;
        this.f30514k = null;
        this.f30515l = null;
        this.f30516m = null;
        this.f30517n = null;
        this.f30518o = null;
        this.f30519p = null;
        this.f30520q = null;
    }

    private C9776h(@NonNull C9776h c9776h, boolean z) {
        this.f30504a = null;
        this.f30505b = null;
        this.f30506c = null;
        this.f30507d = null;
        this.f30508e = null;
        this.f30509f = null;
        this.f30510g = null;
        this.f30511h = null;
        this.f30512i = null;
        this.f30514k = null;
        this.f30515l = null;
        this.f30516m = null;
        this.f30517n = null;
        this.f30518o = null;
        this.f30519p = null;
        this.f30520q = null;
        C4588d.m23627a(c9776h);
        this.f30504a = c9776h.f30504a;
        this.f30505b = c9776h.f30505b;
        this.f30506c = c9776h.f30506c;
        this.f30507d = c9776h.f30507d;
        this.f30509f = c9776h.f30509f;
        this.f30515l = c9776h.f30515l;
        this.f30516m = c9776h.f30516m;
        this.f30517n = c9776h.f30517n;
        this.f30518o = c9776h.f30518o;
        if (c9776h.f30519p != null) {
            this.f30519p = new HashMap(c9776h.f30519p);
        }
        this.f30520q = c9776h.f30520q;
        if (z) {
            this.f30514k = c9776h.f30514k;
            this.f30513j = c9776h.f30513j;
            this.f30512i = c9776h.f30512i;
            this.f30511h = c9776h.f30511h;
            this.f30510g = c9776h.f30510g;
            this.f30508e = c9776h.f30508e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7101b(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f30520q = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
    }

    /* renamed from: a */
    public String m7110a() {
        return this.f30509f;
    }

    /* renamed from: a */
    public String m7104a(@NonNull String str) {
        if (this.f30519p == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f30519p.get(str);
    }

    @NonNull
    /* renamed from: b */
    public Set<String> m7103b() {
        return this.f30519p == null ? Collections.emptySet() : this.f30519p.keySet();
    }

    @NonNull
    /* renamed from: c */
    public String m7100c() {
        return this.f30504a != null ? this.f30504a : "";
    }

    @Nullable
    /* renamed from: d */
    public String m7098d() {
        String m7100c = m7100c();
        if (TextUtils.isEmpty(m7100c)) {
            return null;
        }
        int lastIndexOf = m7100c.lastIndexOf(47);
        return lastIndexOf != -1 ? m7100c.substring(lastIndexOf + 1) : m7100c;
    }

    @Nullable
    /* renamed from: e */
    public String m7096e() {
        return this.f30507d;
    }

    @Nullable
    /* renamed from: f */
    public String m7094f() {
        return this.f30508e;
    }

    @Nullable
    /* renamed from: g */
    public String m7092g() {
        return this.f30510g;
    }

    /* renamed from: h */
    public long m7090h() {
        return C7439ng.m14482a(this.f30511h);
    }

    /* renamed from: i */
    public long m7088i() {
        return C7439ng.m14482a(this.f30512i);
    }

    /* renamed from: j */
    public long m7086j() {
        return this.f30513j;
    }

    @Nullable
    /* renamed from: k */
    public String m7084k() {
        return this.f30514k;
    }

    @Nullable
    /* renamed from: l */
    public Uri m7082l() {
        List<Uri> m7080m = m7080m();
        if (m7080m == null || m7080m.size() <= 0) {
            return null;
        }
        return m7080m.get(0);
    }

    @Nullable
    /* renamed from: m */
    public List<Uri> m7080m() {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        if (this.f30520q != null && this.f30506c != null) {
            try {
                String m14442c = this.f30506c.m7044h().m14442c(this.f30506c.m7037o());
                if (!TextUtils.isEmpty(m14442c)) {
                    for (String str : this.f30520q) {
                        if (!TextUtils.isEmpty(str)) {
                            arrayList.add(Uri.parse(new StringBuilder(String.valueOf(m14442c).length() + 17 + String.valueOf(str).length()).append(m14442c).append("?alt=media&token=").append(str).toString()));
                        }
                    }
                }
            } catch (RemoteException e) {
                Log.e("StorageMetadata", "Unexpected error getting DownloadUrls.", e);
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: n */
    public String m7078n() {
        return this.f30515l;
    }

    @Nullable
    /* renamed from: o */
    public String m7077o() {
        return this.f30516m;
    }

    @Nullable
    /* renamed from: p */
    public String m7076p() {
        return this.f30517n;
    }

    @Nullable
    /* renamed from: q */
    public String m7075q() {
        return this.f30518o;
    }

    @Nullable
    /* renamed from: r */
    public C9779i m7074r() {
        if (this.f30506c != null || this.f30505b == null) {
            return this.f30506c;
        }
        String m7096e = m7096e();
        String m7100c = m7100c();
        if (TextUtils.isEmpty(m7096e) || TextUtils.isEmpty(m7100c)) {
            return null;
        }
        try {
            return new C9779i(new Uri.Builder().scheme("gs").authority(m7096e).encodedPath(C7435nc.m14490a(m7100c)).build(), this.f30505b);
        } catch (UnsupportedEncodingException e) {
            Log.e("StorageMetadata", new StringBuilder(String.valueOf(m7096e).length() + 38 + String.valueOf(m7100c).length()).append("Unable to create a valid default Uri. ").append(m7096e).append(m7100c).toString(), e);
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: s */
    public JSONObject m7073s() {
        JSONObject jSONObject = new JSONObject();
        if (m7110a() != null) {
            jSONObject.put("contentType", m7110a());
        }
        if (this.f30519p != null) {
            jSONObject.put("metadata", new JSONObject(this.f30519p));
        }
        if (m7078n() != null) {
            jSONObject.put("cacheControl", m7078n());
        }
        if (m7077o() != null) {
            jSONObject.put("contentDisposition", m7077o());
        }
        if (m7076p() != null) {
            jSONObject.put("'contentEncoding", m7076p());
        }
        if (m7075q() != null) {
            jSONObject.put("'contentLanguage", m7075q());
        }
        return jSONObject;
    }
}
