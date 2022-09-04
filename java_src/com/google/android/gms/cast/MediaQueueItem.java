package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4693p;
import com.google.firebase.p253b.C9755a;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class MediaQueueItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MediaQueueItem> CREATOR = new C4451o();

    /* renamed from: a */
    public static final int f15907a = 0;

    /* renamed from: b */
    public static final double f15908b = Double.POSITIVE_INFINITY;

    /* renamed from: c */
    String f15909c;

    /* renamed from: d */
    private final int f15910d;

    /* renamed from: e */
    private MediaInfo f15911e;

    /* renamed from: f */
    private int f15912f;

    /* renamed from: g */
    private boolean f15913g;

    /* renamed from: h */
    private double f15914h;

    /* renamed from: i */
    private double f15915i;

    /* renamed from: j */
    private double f15916j;

    /* renamed from: k */
    private long[] f15917k;

    /* renamed from: l */
    private JSONObject f15918l;

    /* renamed from: com.google.android.gms.cast.MediaQueueItem$a */
    /* loaded from: classes2.dex */
    public static class C4199a {

        /* renamed from: a */
        private final MediaQueueItem f15919a;

        public C4199a(MediaInfo mediaInfo) {
            this.f15919a = new MediaQueueItem(mediaInfo);
        }

        public C4199a(MediaQueueItem mediaQueueItem) {
            this.f15919a = new MediaQueueItem();
        }

        public C4199a(JSONObject jSONObject) {
            this.f15919a = new MediaQueueItem(jSONObject);
        }

        /* renamed from: a */
        public C4199a m25076a() {
            this.f15919a.m25093a(0);
            return this;
        }

        /* renamed from: a */
        public C4199a m25075a(double d) {
            this.f15919a.m25094a(d);
            return this;
        }

        /* renamed from: a */
        public C4199a m25074a(JSONObject jSONObject) {
            this.f15919a.m25087b(jSONObject);
            return this;
        }

        /* renamed from: a */
        public C4199a m25073a(boolean z) {
            this.f15919a.m25091a(z);
            return this;
        }

        /* renamed from: a */
        public C4199a m25072a(long[] jArr) {
            this.f15919a.m25090a(jArr);
            return this;
        }

        /* renamed from: b */
        public C4199a m25070b(double d) {
            this.f15919a.m25088b(d);
            return this;
        }

        /* renamed from: b */
        public MediaQueueItem m25071b() {
            this.f15919a.m25078j();
            return this.f15919a;
        }

        /* renamed from: c */
        public C4199a m25069c(double d) {
            this.f15919a.m25085c(d);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaQueueItem(int i, MediaInfo mediaInfo, int i2, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.f15910d = i;
        this.f15911e = mediaInfo;
        this.f15912f = i2;
        this.f15913g = z;
        this.f15914h = d;
        this.f15915i = d2;
        this.f15916j = d3;
        this.f15917k = jArr;
        this.f15909c = str;
        if (this.f15909c == null) {
            this.f15918l = null;
            return;
        }
        try {
            this.f15918l = new JSONObject(this.f15909c);
        } catch (JSONException e) {
            this.f15918l = null;
            this.f15909c = null;
        }
    }

    private MediaQueueItem(MediaInfo mediaInfo) {
        this(1, mediaInfo, 0, true, C9755a.f30449c, Double.POSITIVE_INFINITY, C9755a.f30449c, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    private MediaQueueItem(MediaQueueItem mediaQueueItem) {
        this(1, mediaQueueItem.m25089b(), mediaQueueItem.m25086c(), mediaQueueItem.m25084d(), mediaQueueItem.m25083e(), mediaQueueItem.m25082f(), mediaQueueItem.m25081g(), mediaQueueItem.m25080h(), null);
        if (this.f15911e == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        this.f15918l = mediaQueueItem.m25079i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaQueueItem(JSONObject jSONObject) {
        this(1, null, 0, true, C9755a.f30449c, Double.POSITIVE_INFINITY, C9755a.f30449c, null, null);
        m25092a(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25095a() {
        return this.f15910d;
    }

    /* renamed from: a */
    void m25094a(double d) {
        if (Double.isNaN(d) || d < C9755a.f30449c) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        this.f15914h = d;
    }

    /* renamed from: a */
    void m25093a(int i) {
        this.f15912f = i;
    }

    /* renamed from: a */
    void m25091a(boolean z) {
        this.f15913g = z;
    }

    /* renamed from: a */
    void m25090a(long[] jArr) {
        this.f15917k = jArr;
    }

    /* renamed from: a */
    public boolean m25092a(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        long[] jArr;
        boolean z3;
        int i;
        if (jSONObject.has("media")) {
            this.f15911e = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.f15912f != (i = jSONObject.getInt("itemId"))) {
            this.f15912f = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.f15913g != (z3 = jSONObject.getBoolean("autoplay"))) {
            this.f15913g = z3;
            z = true;
        }
        if (jSONObject.has("startTime")) {
            double d = jSONObject.getDouble("startTime");
            if (Math.abs(d - this.f15914h) > 1.0E-7d) {
                this.f15914h = d;
                z = true;
            }
        }
        if (jSONObject.has("playbackDuration")) {
            double d2 = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d2 - this.f15915i) > 1.0E-7d) {
                this.f15915i = d2;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d3 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d3 - this.f15916j) > 1.0E-7d) {
                this.f15916j = d3;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            long[] jArr2 = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr2[i2] = jSONArray.getLong(i2);
            }
            if (this.f15917k == null) {
                jArr = jArr2;
                z2 = true;
            } else if (this.f15917k.length == length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        jArr = jArr2;
                        break;
                    } else if (this.f15917k[i3] != jArr2[i3]) {
                        jArr = jArr2;
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
            } else {
                jArr = jArr2;
                z2 = true;
            }
        } else {
            z2 = false;
            jArr = null;
        }
        if (z2) {
            this.f15917k = jArr;
            z = true;
        }
        if (jSONObject.has("customData")) {
            this.f15918l = jSONObject.getJSONObject("customData");
            return true;
        }
        return z;
    }

    /* renamed from: b */
    public MediaInfo m25089b() {
        return this.f15911e;
    }

    /* renamed from: b */
    void m25088b(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        this.f15915i = d;
    }

    /* renamed from: b */
    void m25087b(JSONObject jSONObject) {
        this.f15918l = jSONObject;
    }

    /* renamed from: c */
    public int m25086c() {
        return this.f15912f;
    }

    /* renamed from: c */
    void m25085c(double d) {
        if (Double.isNaN(d) || d < C9755a.f30449c) {
            throw new IllegalArgumentException("preloadTime cannot be negative or NaN.");
        }
        this.f15916j = d;
    }

    /* renamed from: d */
    public boolean m25084d() {
        return this.f15913g;
    }

    /* renamed from: e */
    public double m25083e() {
        return this.f15914h;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        if ((this.f15918l == null) != (mediaQueueItem.f15918l == null)) {
            return false;
        }
        if (this.f15918l != null && mediaQueueItem.f15918l != null && !C4693p.m23118a(this.f15918l, mediaQueueItem.f15918l)) {
            return false;
        }
        if (!C4430f.m24206a(this.f15911e, mediaQueueItem.f15911e) || this.f15912f != mediaQueueItem.f15912f || this.f15913g != mediaQueueItem.f15913g || this.f15914h != mediaQueueItem.f15914h || this.f15915i != mediaQueueItem.f15915i || this.f15916j != mediaQueueItem.f15916j || !Arrays.equals(this.f15917k, mediaQueueItem.f15917k)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public double m25082f() {
        return this.f15915i;
    }

    /* renamed from: g */
    public double m25081g() {
        return this.f15916j;
    }

    /* renamed from: h */
    public long[] m25080h() {
        return this.f15917k;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f15911e, Integer.valueOf(this.f15912f), Boolean.valueOf(this.f15913g), Double.valueOf(this.f15914h), Double.valueOf(this.f15915i), Double.valueOf(this.f15916j), Integer.valueOf(Arrays.hashCode(this.f15917k)), String.valueOf(this.f15918l));
    }

    /* renamed from: i */
    public JSONObject m25079i() {
        return this.f15918l;
    }

    /* renamed from: j */
    void m25078j() {
        if (this.f15911e == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (Double.isNaN(this.f15914h) || this.f15914h < C9755a.f30449c) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(this.f15915i)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (!Double.isNaN(this.f15916j) && this.f15916j >= C9755a.f30449c) {
            return;
        }
        throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
    }

    /* renamed from: k */
    public JSONObject m25077k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("media", this.f15911e.m25132l());
            if (this.f15912f != 0) {
                jSONObject.put("itemId", this.f15912f);
            }
            jSONObject.put("autoplay", this.f15913g);
            jSONObject.put("startTime", this.f15914h);
            if (this.f15915i != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", this.f15915i);
            }
            jSONObject.put("preloadTime", this.f15916j);
            if (this.f15917k != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j : this.f15917k) {
                    jSONArray.put(j);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            if (this.f15918l != null) {
                jSONObject.put("customData", this.f15918l);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f15909c = this.f15918l == null ? null : this.f15918l.toString();
        C4451o.m24093a(this, parcel, i);
    }
}
