package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.vu */
/* loaded from: classes.dex */
public class C7878vu implements AbstractC7877vt {

    /* renamed from: a */
    private final Context f26006a;

    /* renamed from: b */
    private final VersionInfoParcel f26007b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @aaa
    /* renamed from: com.google.android.gms.internal.vu$a */
    /* loaded from: classes.dex */
    public static class C7881a {

        /* renamed from: a */
        private final String f26013a;

        /* renamed from: b */
        private final String f26014b;

        public C7881a(String str, String str2) {
            this.f26013a = str;
            this.f26014b = str2;
        }

        /* renamed from: a */
        public String m13309a() {
            return this.f26013a;
        }

        /* renamed from: b */
        public String m13308b() {
            return this.f26014b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @aaa
    /* renamed from: com.google.android.gms.internal.vu$b */
    /* loaded from: classes.dex */
    public static class C7882b {

        /* renamed from: a */
        private final String f26015a;

        /* renamed from: b */
        private final URL f26016b;

        /* renamed from: c */
        private final ArrayList<C7881a> f26017c;

        /* renamed from: d */
        private final String f26018d;

        public C7882b(String str, URL url, ArrayList<C7881a> arrayList, String str2) {
            this.f26015a = str;
            this.f26016b = url;
            if (arrayList == null) {
                this.f26017c = new ArrayList<>();
            } else {
                this.f26017c = arrayList;
            }
            this.f26018d = str2;
        }

        /* renamed from: a */
        public String m13307a() {
            return this.f26015a;
        }

        /* renamed from: b */
        public URL m13306b() {
            return this.f26016b;
        }

        /* renamed from: c */
        public ArrayList<C7881a> m13305c() {
            return this.f26017c;
        }

        /* renamed from: d */
        public String m13304d() {
            return this.f26018d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @aaa
    /* renamed from: com.google.android.gms.internal.vu$c */
    /* loaded from: classes.dex */
    public class C7883c {

        /* renamed from: b */
        private final C7884d f26020b;

        /* renamed from: c */
        private final boolean f26021c;

        /* renamed from: d */
        private final String f26022d;

        public C7883c(boolean z, C7884d c7884d, String str) {
            this.f26021c = z;
            this.f26020b = c7884d;
            this.f26022d = str;
        }

        /* renamed from: a */
        public String m13303a() {
            return this.f26022d;
        }

        /* renamed from: b */
        public C7884d m13302b() {
            return this.f26020b;
        }

        /* renamed from: c */
        public boolean m13301c() {
            return this.f26021c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @aaa
    /* renamed from: com.google.android.gms.internal.vu$d */
    /* loaded from: classes.dex */
    public static class C7884d {

        /* renamed from: a */
        private final String f26023a;

        /* renamed from: b */
        private final int f26024b;

        /* renamed from: c */
        private final List<C7881a> f26025c;

        /* renamed from: d */
        private final String f26026d;

        public C7884d(String str, int i, List<C7881a> list, String str2) {
            this.f26023a = str;
            this.f26024b = i;
            if (list == null) {
                this.f26025c = new ArrayList();
            } else {
                this.f26025c = list;
            }
            this.f26026d = str2;
        }

        /* renamed from: a */
        public String m13300a() {
            return this.f26023a;
        }

        /* renamed from: b */
        public int m13299b() {
            return this.f26024b;
        }

        /* renamed from: c */
        public Iterable<C7881a> m13298c() {
            return this.f26025c;
        }

        /* renamed from: d */
        public String m13297d() {
            return this.f26026d;
        }
    }

    public C7878vu(Context context, VersionInfoParcel versionInfoParcel) {
        this.f26006a = context;
        this.f26007b = versionInfoParcel;
    }

    /* renamed from: a */
    protected C7882b m13310a(JSONObject jSONObject) {
        URL url;
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e) {
            abr.b("Error constructing http request.", e);
            url = null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new C7881a(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new C7882b(optString, url, arrayList, optString3);
    }

    /* renamed from: a */
    protected C7883c m13313a(C7882b c7882b) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) c7882b.m13306b().openConnection();
            C3779u.m26890e().m18367a(this.f26006a, this.f26007b.f14733b, false, httpURLConnection);
            Iterator<C7881a> it2 = c7882b.m13305c().iterator();
            while (it2.hasNext()) {
                C7881a next = it2.next();
                httpURLConnection.addRequestProperty(next.m13309a(), next.m13308b());
            }
            if (!TextUtils.isEmpty(c7882b.m13304d())) {
                httpURLConnection.setDoOutput(true);
                byte[] bytes = c7882b.m13304d().getBytes();
                httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.close();
            }
            ArrayList arrayList = new ArrayList();
            if (httpURLConnection.getHeaderFields() != null) {
                for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                    for (String str : entry.getValue()) {
                        arrayList.add(new C7881a(entry.getKey(), str));
                    }
                }
            }
            return new C7883c(true, new C7884d(c7882b.m13307a(), httpURLConnection.getResponseCode(), arrayList, C3779u.m26890e().m18350a(new InputStreamReader(httpURLConnection.getInputStream()))), null);
        } catch (Exception e) {
            return new C7883c(false, null, e.toString());
        }
    }

    /* renamed from: a */
    protected JSONObject m13312a(C7884d c7884d) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", c7884d.m13300a());
            if (c7884d.m13297d() != null) {
                jSONObject.put("body", c7884d.m13297d());
            }
            JSONArray jSONArray = new JSONArray();
            for (C7881a c7881a : c7884d.m13298c()) {
                jSONArray.put(new JSONObject().put("key", c7881a.m13309a()).put("value", c7881a.m13308b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", c7884d.m13299b());
        } catch (JSONException e) {
            abr.b("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public JSONObject m13311a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            String str2 = "";
            try {
                str2 = jSONObject.optString("http_request_id");
                C7883c m13313a = m13313a(m13310a(jSONObject));
                if (m13313a.m13301c()) {
                    jSONObject2.put("response", m13312a(m13313a.m13302b()));
                    jSONObject2.put("success", true);
                } else {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", str2));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", m13313a.m13303a());
                }
                return jSONObject2;
            } catch (Exception e) {
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", str2));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", e.toString());
                    return jSONObject2;
                } catch (JSONException e2) {
                    return jSONObject2;
                }
            }
        } catch (JSONException e3) {
            abr.b("The request is not a valid JSON.");
            try {
                return new JSONObject().put("success", false);
            } catch (JSONException e4) {
                return new JSONObject();
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(final acy acyVar, final Map<String, String> map) {
        abu.m18391a(new Runnable() { // from class: com.google.android.gms.internal.vu.1
            @Override // java.lang.Runnable
            public void run() {
                abr.a("Received Http request.");
                final JSONObject m13311a = C7878vu.this.m13311a((String) map.get("http_request"));
                if (m13311a == null) {
                    abr.b("Response should not be null.");
                } else {
                    abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.internal.vu.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            acyVar.b("fetchHttpRequestCompleted", m13311a);
                            abr.a("Dispatched http response.");
                        }
                    });
                }
            }
        });
    }
}
