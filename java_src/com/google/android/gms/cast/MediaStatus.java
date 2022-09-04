package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p004v7.media.MediaRouteProviderProtocol;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4693p;
import com.google.firebase.p253b.C9755a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class MediaStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MediaStatus> CREATOR = new C4452p();

    /* renamed from: a */
    public static final long f15920a = 1;

    /* renamed from: b */
    public static final long f15921b = 2;

    /* renamed from: c */
    public static final long f15922c = 4;

    /* renamed from: d */
    public static final long f15923d = 8;

    /* renamed from: e */
    public static final long f15924e = 16;

    /* renamed from: f */
    public static final long f15925f = 32;

    /* renamed from: g */
    public static final int f15926g = 0;

    /* renamed from: h */
    public static final int f15927h = 1;

    /* renamed from: i */
    public static final int f15928i = 2;

    /* renamed from: j */
    public static final int f15929j = 3;

    /* renamed from: k */
    public static final int f15930k = 4;

    /* renamed from: l */
    public static final int f15931l = 0;

    /* renamed from: m */
    public static final int f15932m = 1;

    /* renamed from: n */
    public static final int f15933n = 2;

    /* renamed from: o */
    public static final int f15934o = 3;

    /* renamed from: p */
    public static final int f15935p = 4;

    /* renamed from: q */
    public static final int f15936q = 0;

    /* renamed from: r */
    public static final int f15937r = 1;

    /* renamed from: s */
    public static final int f15938s = 2;

    /* renamed from: t */
    public static final int f15939t = 3;

    /* renamed from: A */
    private long f15940A;

    /* renamed from: B */
    private int f15941B;

    /* renamed from: C */
    private double f15942C;

    /* renamed from: D */
    private int f15943D;

    /* renamed from: E */
    private int f15944E;

    /* renamed from: F */
    private long f15945F;

    /* renamed from: G */
    private double f15946G;

    /* renamed from: H */
    private boolean f15947H;

    /* renamed from: I */
    private long[] f15948I;

    /* renamed from: J */
    private int f15949J;

    /* renamed from: K */
    private int f15950K;

    /* renamed from: L */
    private JSONObject f15951L;

    /* renamed from: M */
    private boolean f15952M;

    /* renamed from: N */
    private final SparseArray<Integer> f15953N;

    /* renamed from: u */
    long f15954u;

    /* renamed from: v */
    String f15955v;

    /* renamed from: w */
    int f15956w;

    /* renamed from: x */
    final ArrayList<MediaQueueItem> f15957x;

    /* renamed from: y */
    private final int f15958y;

    /* renamed from: z */
    private MediaInfo f15959z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaStatus(int i, MediaInfo mediaInfo, long j, int i2, double d, int i3, int i4, long j2, long j3, double d2, boolean z, long[] jArr, int i5, int i6, String str, int i7, List<MediaQueueItem> list, boolean z2) {
        this.f15957x = new ArrayList<>();
        this.f15953N = new SparseArray<>();
        this.f15958y = i;
        this.f15959z = mediaInfo;
        this.f15940A = j;
        this.f15941B = i2;
        this.f15942C = d;
        this.f15943D = i3;
        this.f15944E = i4;
        this.f15945F = j2;
        this.f15954u = j3;
        this.f15946G = d2;
        this.f15947H = z;
        this.f15948I = jArr;
        this.f15949J = i5;
        this.f15950K = i6;
        this.f15955v = str;
        if (this.f15955v != null) {
            try {
                this.f15951L = new JSONObject(this.f15955v);
            } catch (JSONException e) {
                this.f15951L = null;
                this.f15955v = null;
            }
        } else {
            this.f15951L = null;
        }
        this.f15956w = i7;
        if (list != null && !list.isEmpty()) {
            m25060a((MediaQueueItem[]) list.toArray(new MediaQueueItem[list.size()]));
        }
        this.f15952M = z2;
    }

    public MediaStatus(JSONObject jSONObject) {
        this(1, null, 0L, 0, C9755a.f30449c, 0, 0, 0L, 0L, C9755a.f30449c, false, null, 0, 0, null, 0, null, false);
        m25062a(jSONObject, 0);
    }

    /* renamed from: a */
    private void m25060a(MediaQueueItem[] mediaQueueItemArr) {
        this.f15957x.clear();
        this.f15953N.clear();
        for (int i = 0; i < mediaQueueItemArr.length; i++) {
            MediaQueueItem mediaQueueItem = mediaQueueItemArr[i];
            this.f15957x.add(mediaQueueItem);
            this.f15953N.put(mediaQueueItem.m25086c(), Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private boolean m25066a(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        switch (i2) {
            case 1:
            case 3:
                return i3 == 0;
            case 2:
                return i4 != 2;
            default:
                return true;
        }
    }

    /* renamed from: a */
    private boolean m25064a(MediaStatus mediaStatus) {
        return this.f15951L == null || mediaStatus.f15951L == null || C4693p.m23118a(this.f15951L, mediaStatus.f15951L);
    }

    /* renamed from: s */
    private void m25038s() {
        this.f15956w = 0;
        this.f15957x.clear();
        this.f15953N.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25068a() {
        return this.f15958y;
    }

    /* renamed from: a */
    public int m25062a(JSONObject jSONObject, int i) {
        int i2;
        long[] jArr;
        boolean z;
        int i3;
        int i4 = 2;
        boolean z2 = true;
        long j = jSONObject.getLong("mediaSessionId");
        if (j != this.f15940A) {
            this.f15940A = j;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (jSONObject.has("playerState")) {
            String string = jSONObject.getString("playerState");
            int i5 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : 0;
            if (i5 != this.f15943D) {
                this.f15943D = i5;
                i2 |= 2;
            }
            if (i5 == 1 && jSONObject.has("idleReason")) {
                String string2 = jSONObject.getString("idleReason");
                if (!string2.equals("CANCELLED")) {
                    i4 = string2.equals("INTERRUPTED") ? 3 : string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                }
                if (i4 != this.f15944E) {
                    this.f15944E = i4;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject.has("playbackRate")) {
            double d = jSONObject.getDouble("playbackRate");
            if (this.f15942C != d) {
                this.f15942C = d;
                i2 |= 2;
            }
        }
        if (jSONObject.has("currentTime") && (i & 2) == 0) {
            long m24208a = C4430f.m24208a(jSONObject.getDouble("currentTime"));
            if (m24208a != this.f15945F) {
                this.f15945F = m24208a;
                i2 |= 2;
            }
        }
        if (jSONObject.has("supportedMediaCommands")) {
            long j2 = jSONObject.getLong("supportedMediaCommands");
            if (j2 != this.f15954u) {
                this.f15954u = j2;
                i2 |= 2;
            }
        }
        if (jSONObject.has(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME) && (i & 1) == 0) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME);
            double d2 = jSONObject2.getDouble("level");
            if (d2 != this.f15946G) {
                this.f15946G = d2;
                i2 |= 2;
            }
            boolean z3 = jSONObject2.getBoolean("muted");
            if (z3 != this.f15947H) {
                this.f15947H = z3;
                i2 |= 2;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            long[] jArr2 = new long[length];
            for (int i6 = 0; i6 < length; i6++) {
                jArr2[i6] = jSONArray.getLong(i6);
            }
            if (this.f15948I != null && this.f15948I.length == length) {
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        z2 = false;
                        break;
                    } else if (this.f15948I[i7] != jArr2[i7]) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            if (z2) {
                this.f15948I = jArr2;
            }
            z = z2;
            jArr = jArr2;
        } else if (this.f15948I != null) {
            z = true;
            jArr = null;
        } else {
            jArr = null;
            z = false;
        }
        if (z) {
            this.f15948I = jArr;
            i2 |= 2;
        }
        if (jSONObject.has("customData")) {
            this.f15951L = jSONObject.getJSONObject("customData");
            this.f15955v = null;
            i2 |= 2;
        }
        if (jSONObject.has("media")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("media");
            this.f15959z = new MediaInfo(jSONObject3);
            i2 |= 2;
            if (jSONObject3.has("metadata")) {
                i2 |= 4;
            }
        }
        if (jSONObject.has("currentItemId") && this.f15941B != (i3 = jSONObject.getInt("currentItemId"))) {
            this.f15941B = i3;
            i2 |= 2;
        }
        int optInt = jSONObject.optInt("preloadedItemId", 0);
        if (this.f15950K != optInt) {
            this.f15950K = optInt;
            i2 |= 16;
        }
        int optInt2 = jSONObject.optInt("loadingItemId", 0);
        if (this.f15949J != optInt2) {
            this.f15949J = optInt2;
            i2 |= 2;
        }
        if (!m25066a(this.f15943D, this.f15944E, this.f15949J, this.f15959z == null ? -1 : this.f15959z.m25141c())) {
            return m25063a(jSONObject) ? i2 | 8 : i2;
        }
        this.f15941B = 0;
        this.f15949J = 0;
        this.f15950K = 0;
        if (this.f15957x.isEmpty()) {
            return i2;
        }
        m25038s();
        return i2 | 8;
    }

    /* renamed from: a */
    public MediaQueueItem m25067a(int i) {
        return m25056c(i);
    }

    /* renamed from: a */
    public void m25061a(boolean z) {
        this.f15952M = z;
    }

    /* renamed from: a */
    public boolean m25065a(long j) {
        return (this.f15954u & j) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m25063a(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        int i = 2;
        boolean z3 = true;
        if (jSONObject.has("repeatMode")) {
            int i2 = this.f15956w;
            String string = jSONObject.getString("repeatMode");
            char c = 65535;
            switch (string.hashCode()) {
                case -1118317585:
                    if (string.equals("REPEAT_ALL_AND_SHUFFLE")) {
                        c = 3;
                        break;
                    }
                    break;
                case -962896020:
                    if (string.equals("REPEAT_SINGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1645938909:
                    if (string.equals("REPEAT_ALL")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1645952171:
                    if (string.equals("REPEAT_OFF")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i = 3;
                    break;
                default:
                    i = i2;
                    break;
            }
            if (this.f15956w != i) {
                this.f15956w = i;
                z = true;
                if (jSONObject.has("items")) {
                    return z;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("items");
                int length = jSONArray.length();
                SparseArray sparseArray = new SparseArray();
                for (int i3 = 0; i3 < length; i3++) {
                    sparseArray.put(i3, Integer.valueOf(jSONArray.getJSONObject(i3).getInt("itemId")));
                }
                MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[length];
                int i4 = 0;
                boolean z4 = z;
                while (i4 < length) {
                    Integer num = (Integer) sparseArray.get(i4);
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                    MediaQueueItem m25056c = m25056c(num.intValue());
                    if (m25056c != null) {
                        boolean m25092a = z4 | m25056c.m25092a(jSONObject2);
                        mediaQueueItemArr[i4] = m25056c;
                        z2 = i4 != m25052e(num.intValue()).intValue() ? true : m25092a;
                    } else if (num.intValue() == this.f15941B) {
                        mediaQueueItemArr[i4] = new MediaQueueItem.C4199a(this.f15959z).m25071b();
                        mediaQueueItemArr[i4].m25092a(jSONObject2);
                        z2 = true;
                    } else {
                        mediaQueueItemArr[i4] = new MediaQueueItem(jSONObject2);
                        z2 = true;
                    }
                    i4++;
                    z4 = z2;
                }
                if (this.f15957x.size() == length) {
                    z3 = z4;
                }
                m25060a(mediaQueueItemArr);
                return z3;
            }
        }
        z = false;
        if (jSONObject.has("items")) {
        }
    }

    /* renamed from: b */
    public long m25059b() {
        return this.f15940A;
    }

    /* renamed from: b */
    public MediaQueueItem m25058b(int i) {
        return m25054d(i);
    }

    /* renamed from: c */
    public int m25057c() {
        return this.f15943D;
    }

    /* renamed from: c */
    public MediaQueueItem m25056c(int i) {
        Integer num = this.f15953N.get(i);
        if (num == null) {
            return null;
        }
        return this.f15957x.get(num.intValue());
    }

    /* renamed from: d */
    public int m25055d() {
        return this.f15944E;
    }

    /* renamed from: d */
    public MediaQueueItem m25054d(int i) {
        if (i < 0 || i >= this.f15957x.size()) {
            return null;
        }
        return this.f15957x.get(i);
    }

    /* renamed from: e */
    public double m25053e() {
        return this.f15942C;
    }

    /* renamed from: e */
    public Integer m25052e(int i) {
        return this.f15953N.get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        if ((this.f15951L == null) != (mediaStatus.f15951L == null)) {
            return false;
        }
        return this.f15940A == mediaStatus.f15940A && this.f15941B == mediaStatus.f15941B && this.f15942C == mediaStatus.f15942C && this.f15943D == mediaStatus.f15943D && this.f15944E == mediaStatus.f15944E && this.f15945F == mediaStatus.f15945F && this.f15946G == mediaStatus.f15946G && this.f15947H == mediaStatus.f15947H && this.f15949J == mediaStatus.f15949J && this.f15950K == mediaStatus.f15950K && this.f15956w == mediaStatus.f15956w && Arrays.equals(this.f15948I, mediaStatus.f15948I) && C4430f.m24206a(Long.valueOf(this.f15954u), Long.valueOf(mediaStatus.f15954u)) && C4430f.m24206a(this.f15957x, mediaStatus.f15957x) && C4430f.m24206a(this.f15959z, mediaStatus.f15959z) && m25064a(mediaStatus) && this.f15952M == mediaStatus.m25039r();
    }

    /* renamed from: f */
    public MediaInfo m25051f() {
        return this.f15959z;
    }

    /* renamed from: g */
    public long m25050g() {
        return this.f15945F;
    }

    /* renamed from: h */
    public double m25049h() {
        return this.f15946G;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f15959z, Long.valueOf(this.f15940A), Integer.valueOf(this.f15941B), Double.valueOf(this.f15942C), Integer.valueOf(this.f15943D), Integer.valueOf(this.f15944E), Long.valueOf(this.f15945F), Long.valueOf(this.f15954u), Double.valueOf(this.f15946G), Boolean.valueOf(this.f15947H), Integer.valueOf(Arrays.hashCode(this.f15948I)), Integer.valueOf(this.f15949J), Integer.valueOf(this.f15950K), this.f15951L, Integer.valueOf(this.f15956w), this.f15957x, Boolean.valueOf(this.f15952M));
    }

    /* renamed from: i */
    public boolean m25048i() {
        return this.f15947H;
    }

    /* renamed from: j */
    public long[] m25047j() {
        return this.f15948I;
    }

    /* renamed from: k */
    public JSONObject m25046k() {
        return this.f15951L;
    }

    /* renamed from: l */
    public int m25045l() {
        return this.f15941B;
    }

    /* renamed from: m */
    public int m25044m() {
        return this.f15949J;
    }

    /* renamed from: n */
    public int m25043n() {
        return this.f15950K;
    }

    /* renamed from: o */
    public int m25042o() {
        return this.f15956w;
    }

    /* renamed from: p */
    public List<MediaQueueItem> m25041p() {
        return this.f15957x;
    }

    /* renamed from: q */
    public int m25040q() {
        return this.f15957x.size();
    }

    /* renamed from: r */
    public boolean m25039r() {
        return this.f15952M;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f15955v = this.f15951L == null ? null : this.f15951L.toString();
        C4452p.m24090a(this, parcel, i);
    }
}
