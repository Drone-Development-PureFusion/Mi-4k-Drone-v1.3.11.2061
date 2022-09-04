package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4693p;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new C4453q();

    /* renamed from: a */
    public static final int f15960a = 0;

    /* renamed from: b */
    public static final int f15961b = 1;

    /* renamed from: c */
    public static final int f15962c = 2;

    /* renamed from: d */
    public static final int f15963d = 3;

    /* renamed from: e */
    public static final int f15964e = -1;

    /* renamed from: f */
    public static final int f15965f = 0;

    /* renamed from: g */
    public static final int f15966g = 1;

    /* renamed from: h */
    public static final int f15967h = 2;

    /* renamed from: i */
    public static final int f15968i = 3;

    /* renamed from: j */
    public static final int f15969j = 4;

    /* renamed from: k */
    public static final int f15970k = 5;

    /* renamed from: l */
    String f15971l;

    /* renamed from: m */
    private final int f15972m;

    /* renamed from: n */
    private long f15973n;

    /* renamed from: o */
    private int f15974o;

    /* renamed from: p */
    private String f15975p;

    /* renamed from: q */
    private String f15976q;

    /* renamed from: r */
    private String f15977r;

    /* renamed from: s */
    private String f15978s;

    /* renamed from: t */
    private int f15979t;

    /* renamed from: u */
    private JSONObject f15980u;

    /* renamed from: com.google.android.gms.cast.MediaTrack$a */
    /* loaded from: classes2.dex */
    public static class C4200a {

        /* renamed from: a */
        private final MediaTrack f15981a;

        public C4200a(long j, int i) {
            this.f15981a = new MediaTrack(j, i);
        }

        /* renamed from: a */
        public C4200a m25019a(int i) {
            this.f15981a.m25036a(i);
            return this;
        }

        /* renamed from: a */
        public C4200a m25018a(String str) {
            this.f15981a.m25035a(str);
            return this;
        }

        /* renamed from: a */
        public C4200a m25017a(Locale locale) {
            this.f15981a.m25027d(C4430f.m24204a(locale));
            return this;
        }

        /* renamed from: a */
        public C4200a m25016a(JSONObject jSONObject) {
            this.f15981a.m25034a(jSONObject);
            return this;
        }

        /* renamed from: a */
        public MediaTrack m25020a() {
            return this.f15981a;
        }

        /* renamed from: b */
        public C4200a m25015b(String str) {
            this.f15981a.m25032b(str);
            return this;
        }

        /* renamed from: c */
        public C4200a m25014c(String str) {
            this.f15981a.m25029c(str);
            return this;
        }

        /* renamed from: d */
        public C4200a m25013d(String str) {
            this.f15981a.m25027d(str);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaTrack(int i, long j, int i2, String str, String str2, String str3, String str4, int i3, String str5) {
        this.f15972m = i;
        this.f15973n = j;
        this.f15974o = i2;
        this.f15975p = str;
        this.f15976q = str2;
        this.f15977r = str3;
        this.f15978s = str4;
        this.f15979t = i3;
        this.f15971l = str5;
        if (this.f15971l == null) {
            this.f15980u = null;
            return;
        }
        try {
            this.f15980u = new JSONObject(this.f15971l);
        } catch (JSONException e) {
            this.f15980u = null;
            this.f15971l = null;
        }
    }

    MediaTrack(long j, int i) {
        this(1, 0L, 0, null, null, null, null, -1, null);
        this.f15973n = j;
        if (i <= 0 || i > 3) {
            throw new IllegalArgumentException(new StringBuilder(24).append("invalid type ").append(i).toString());
        }
        this.f15974o = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaTrack(JSONObject jSONObject) {
        this(1, 0L, 0, null, null, null, null, -1, null);
        m25031b(jSONObject);
    }

    /* renamed from: b */
    private void m25031b(JSONObject jSONObject) {
        this.f15973n = jSONObject.getLong("trackId");
        String string = jSONObject.getString("type");
        if ("TEXT".equals(string)) {
            this.f15974o = 1;
        } else if ("AUDIO".equals(string)) {
            this.f15974o = 2;
        } else if (!"VIDEO".equals(string)) {
            String valueOf = String.valueOf(string);
            throw new JSONException(valueOf.length() != 0 ? "invalid type: ".concat(valueOf) : new String("invalid type: "));
        } else {
            this.f15974o = 3;
        }
        this.f15975p = jSONObject.optString("trackContentId", null);
        this.f15976q = jSONObject.optString("trackContentType", null);
        this.f15977r = jSONObject.optString("name", null);
        this.f15978s = jSONObject.optString("language", null);
        if (jSONObject.has("subtype")) {
            String string2 = jSONObject.getString("subtype");
            if ("SUBTITLES".equals(string2)) {
                this.f15979t = 1;
            } else if ("CAPTIONS".equals(string2)) {
                this.f15979t = 2;
            } else if ("DESCRIPTIONS".equals(string2)) {
                this.f15979t = 3;
            } else if ("CHAPTERS".equals(string2)) {
                this.f15979t = 4;
            } else if (!"METADATA".equals(string2)) {
                String valueOf2 = String.valueOf(string2);
                throw new JSONException(valueOf2.length() != 0 ? "invalid subtype: ".concat(valueOf2) : new String("invalid subtype: "));
            } else {
                this.f15979t = 5;
            }
        } else {
            this.f15979t = 0;
        }
        this.f15980u = jSONObject.optJSONObject("customData");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25037a() {
        return this.f15972m;
    }

    /* renamed from: a */
    void m25036a(int i) {
        if (i <= -1 || i > 5) {
            throw new IllegalArgumentException(new StringBuilder(27).append("invalid subtype ").append(i).toString());
        }
        if (i != 0 && this.f15974o != 1) {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        }
        this.f15979t = i;
    }

    /* renamed from: a */
    public void m25035a(String str) {
        this.f15975p = str;
    }

    /* renamed from: a */
    void m25034a(JSONObject jSONObject) {
        this.f15980u = jSONObject;
    }

    /* renamed from: b */
    public long m25033b() {
        return this.f15973n;
    }

    /* renamed from: b */
    public void m25032b(String str) {
        this.f15976q = str;
    }

    /* renamed from: c */
    public int m25030c() {
        return this.f15974o;
    }

    /* renamed from: c */
    void m25029c(String str) {
        this.f15977r = str;
    }

    /* renamed from: d */
    public String m25028d() {
        return this.f15975p;
    }

    /* renamed from: d */
    void m25027d(String str) {
        this.f15978s = str;
    }

    /* renamed from: e */
    public String m25026e() {
        return this.f15976q;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        if ((this.f15980u == null) != (mediaTrack.f15980u == null)) {
            return false;
        }
        if (this.f15980u != null && mediaTrack.f15980u != null && !C4693p.m23118a(this.f15980u, mediaTrack.f15980u)) {
            return false;
        }
        if (this.f15973n != mediaTrack.f15973n || this.f15974o != mediaTrack.f15974o || !C4430f.m24206a(this.f15975p, mediaTrack.f15975p) || !C4430f.m24206a(this.f15976q, mediaTrack.f15976q) || !C4430f.m24206a(this.f15977r, mediaTrack.f15977r) || !C4430f.m24206a(this.f15978s, mediaTrack.f15978s) || this.f15979t != mediaTrack.f15979t) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public String m25025f() {
        return this.f15977r;
    }

    /* renamed from: g */
    public String m25024g() {
        return this.f15978s;
    }

    /* renamed from: h */
    public int m25023h() {
        return this.f15979t;
    }

    public int hashCode() {
        return C4585c.m23633a(Long.valueOf(this.f15973n), Integer.valueOf(this.f15974o), this.f15975p, this.f15976q, this.f15977r, this.f15978s, Integer.valueOf(this.f15979t), this.f15980u);
    }

    /* renamed from: i */
    public JSONObject m25022i() {
        return this.f15980u;
    }

    /* renamed from: j */
    public JSONObject m25021j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.f15973n);
            switch (this.f15974o) {
                case 1:
                    jSONObject.put("type", "TEXT");
                    break;
                case 2:
                    jSONObject.put("type", "AUDIO");
                    break;
                case 3:
                    jSONObject.put("type", "VIDEO");
                    break;
            }
            if (this.f15975p != null) {
                jSONObject.put("trackContentId", this.f15975p);
            }
            if (this.f15976q != null) {
                jSONObject.put("trackContentType", this.f15976q);
            }
            if (this.f15977r != null) {
                jSONObject.put("name", this.f15977r);
            }
            if (!TextUtils.isEmpty(this.f15978s)) {
                jSONObject.put("language", this.f15978s);
            }
            switch (this.f15979t) {
                case 1:
                    jSONObject.put("subtype", "SUBTITLES");
                    break;
                case 2:
                    jSONObject.put("subtype", "CAPTIONS");
                    break;
                case 3:
                    jSONObject.put("subtype", "DESCRIPTIONS");
                    break;
                case 4:
                    jSONObject.put("subtype", "CHAPTERS");
                    break;
                case 5:
                    jSONObject.put("subtype", "METADATA");
                    break;
            }
            if (this.f15980u != null) {
                jSONObject.put("customData", this.f15980u);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f15971l = this.f15980u == null ? null : this.f15980u.toString();
        C4453q.m24087a(this, parcel, i);
    }
}
