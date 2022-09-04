package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4693p;
import com.google.firebase.p253b.C9755a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR = new C4449m();

    /* renamed from: a */
    public static final int f15855a = 0;

    /* renamed from: b */
    public static final int f15856b = 1;

    /* renamed from: c */
    public static final int f15857c = 2;

    /* renamed from: d */
    public static final int f15858d = -1;

    /* renamed from: e */
    public static final long f15859e = -1;

    /* renamed from: f */
    String f15860f;

    /* renamed from: g */
    private final int f15861g;

    /* renamed from: h */
    private final String f15862h;

    /* renamed from: i */
    private int f15863i;

    /* renamed from: j */
    private String f15864j;

    /* renamed from: k */
    private MediaMetadata f15865k;

    /* renamed from: l */
    private long f15866l;

    /* renamed from: m */
    private List<MediaTrack> f15867m;

    /* renamed from: n */
    private TextTrackStyle f15868n;

    /* renamed from: o */
    private List<AdBreakInfo> f15869o;

    /* renamed from: p */
    private JSONObject f15870p;

    /* renamed from: com.google.android.gms.cast.MediaInfo$a */
    /* loaded from: classes2.dex */
    public static class C4196a {

        /* renamed from: a */
        private final MediaInfo f15871a;

        public C4196a(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Content ID cannot be empty");
            }
            this.f15871a = new MediaInfo(str);
        }

        /* renamed from: a */
        public C4196a m25130a(int i) {
            this.f15871a.m25150a(i);
            return this;
        }

        /* renamed from: a */
        public C4196a m25129a(long j) {
            this.f15871a.m25149a(j);
            return this;
        }

        /* renamed from: a */
        public C4196a m25128a(MediaMetadata mediaMetadata) {
            this.f15871a.m25148a(mediaMetadata);
            return this;
        }

        /* renamed from: a */
        public C4196a m25127a(TextTrackStyle textTrackStyle) {
            this.f15871a.m25147a(textTrackStyle);
            return this;
        }

        /* renamed from: a */
        public C4196a m25126a(String str) {
            this.f15871a.m25146a(str);
            return this;
        }

        /* renamed from: a */
        public C4196a m25125a(List<MediaTrack> list) {
            this.f15871a.m25145a(list);
            return this;
        }

        /* renamed from: a */
        public C4196a m25124a(JSONObject jSONObject) {
            this.f15871a.m25144a(jSONObject);
            return this;
        }

        /* renamed from: a */
        public MediaInfo m25131a() {
            this.f15871a.m25133k();
            return this.f15871a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaInfo(int i, String str, int i2, String str2, MediaMetadata mediaMetadata, long j, List<MediaTrack> list, TextTrackStyle textTrackStyle, String str3, List<AdBreakInfo> list2) {
        this.f15861g = i;
        this.f15862h = str;
        this.f15863i = i2;
        this.f15864j = str2;
        this.f15865k = mediaMetadata;
        this.f15866l = j;
        this.f15867m = list;
        this.f15868n = textTrackStyle;
        this.f15860f = str3;
        if (this.f15860f != null) {
            try {
                this.f15870p = new JSONObject(this.f15860f);
            } catch (JSONException e) {
                this.f15870p = null;
                this.f15860f = null;
            }
        } else {
            this.f15870p = null;
        }
        this.f15869o = list2;
    }

    MediaInfo(String str) {
        this(1, str, -1, null, null, -1L, null, null, null, null);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaInfo(JSONObject jSONObject) {
        this(1, jSONObject.getString("contentId"), -1, null, null, -1L, null, null, null, null);
        String string = jSONObject.getString("streamType");
        if ("NONE".equals(string)) {
            this.f15863i = 0;
        } else if ("BUFFERED".equals(string)) {
            this.f15863i = 1;
        } else if ("LIVE".equals(string)) {
            this.f15863i = 2;
        } else {
            this.f15863i = -1;
        }
        this.f15864j = jSONObject.getString("contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            this.f15865k = new MediaMetadata(jSONObject2.getInt("metadataType"));
            this.f15865k.m25115a(jSONObject2);
        }
        this.f15866l = -1L;
        if (jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", C9755a.f30449c);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble)) {
                this.f15866l = C4430f.m24208a(optDouble);
            }
        }
        if (jSONObject.has("tracks")) {
            this.f15867m = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f15867m.add(new MediaTrack(jSONArray.getJSONObject(i)));
            }
        } else {
            this.f15867m = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle();
            textTrackStyle.m25003b(jSONObject3);
            this.f15868n = textTrackStyle;
        } else {
            this.f15868n = null;
        }
        this.f15870p = jSONObject.optJSONObject("customData");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25151a() {
        return this.f15861g;
    }

    /* renamed from: a */
    void m25150a(int i) {
        if (i < -1 || i > 2) {
            throw new IllegalArgumentException("invalid stream type");
        }
        this.f15863i = i;
    }

    /* renamed from: a */
    void m25149a(long j) {
        if (j >= 0 || j == -1) {
            this.f15866l = j;
            return;
        }
        throw new IllegalArgumentException("Invalid stream duration");
    }

    /* renamed from: a */
    void m25148a(MediaMetadata mediaMetadata) {
        this.f15865k = mediaMetadata;
    }

    /* renamed from: a */
    public void m25147a(TextTrackStyle textTrackStyle) {
        this.f15868n = textTrackStyle;
    }

    /* renamed from: a */
    void m25146a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        this.f15864j = str;
    }

    /* renamed from: a */
    void m25145a(List<MediaTrack> list) {
        this.f15867m = list;
    }

    /* renamed from: a */
    void m25144a(JSONObject jSONObject) {
        this.f15870p = jSONObject;
    }

    /* renamed from: b */
    public String m25143b() {
        return this.f15862h;
    }

    /* renamed from: b */
    public void m25142b(List<AdBreakInfo> list) {
        this.f15869o = list;
    }

    /* renamed from: c */
    public int m25141c() {
        return this.f15863i;
    }

    /* renamed from: d */
    public String m25140d() {
        return this.f15864j;
    }

    /* renamed from: e */
    public MediaMetadata m25139e() {
        return this.f15865k;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        if ((this.f15870p == null) != (mediaInfo.f15870p == null)) {
            return false;
        }
        if (this.f15870p != null && mediaInfo.f15870p != null && !C4693p.m23118a(this.f15870p, mediaInfo.f15870p)) {
            return false;
        }
        if (!C4430f.m24206a(this.f15862h, mediaInfo.f15862h) || this.f15863i != mediaInfo.f15863i || !C4430f.m24206a(this.f15864j, mediaInfo.f15864j) || !C4430f.m24206a(this.f15865k, mediaInfo.f15865k) || this.f15866l != mediaInfo.f15866l) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public long m25138f() {
        return this.f15866l;
    }

    /* renamed from: g */
    public List<MediaTrack> m25137g() {
        return this.f15867m;
    }

    /* renamed from: h */
    public TextTrackStyle m25136h() {
        return this.f15868n;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f15862h, Integer.valueOf(this.f15863i), this.f15864j, this.f15865k, Long.valueOf(this.f15866l), String.valueOf(this.f15870p));
    }

    /* renamed from: i */
    public JSONObject m25135i() {
        return this.f15870p;
    }

    /* renamed from: j */
    public List<AdBreakInfo> m25134j() {
        return this.f15869o;
    }

    /* renamed from: k */
    void m25133k() {
        if (TextUtils.isEmpty(this.f15862h)) {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        }
        if (TextUtils.isEmpty(this.f15864j)) {
            throw new IllegalArgumentException("content type cannot be null or empty");
        }
        if (this.f15863i != -1) {
            return;
        }
        throw new IllegalArgumentException("a valid stream type must be specified");
    }

    /* renamed from: l */
    public JSONObject m25132l() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.f15862h);
            switch (this.f15863i) {
                case 1:
                    str = "BUFFERED";
                    break;
                case 2:
                    str = "LIVE";
                    break;
                default:
                    str = "NONE";
                    break;
            }
            jSONObject.put("streamType", str);
            if (this.f15864j != null) {
                jSONObject.put("contentType", this.f15864j);
            }
            if (this.f15865k != null) {
                jSONObject.put("metadata", this.f15865k.m25105e());
            }
            if (this.f15866l <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                jSONObject.put("duration", C4430f.m24207a(this.f15866l));
            }
            if (this.f15867m != null) {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack mediaTrack : this.f15867m) {
                    jSONArray.put(mediaTrack.m25021j());
                }
                jSONObject.put("tracks", jSONArray);
            }
            if (this.f15868n != null) {
                jSONObject.put("textTrackStyle", this.f15868n.m24983n());
            }
            if (this.f15870p != null) {
                jSONObject.put("customData", this.f15870p);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f15860f = this.f15870p == null ? null : this.f15870p.toString();
        C4449m.m24099a(this, parcel, i);
    }
}
