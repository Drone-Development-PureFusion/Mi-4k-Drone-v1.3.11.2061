package com.google.android.gms.cast.internal;

import android.support.p004v7.media.MediaRouteProviderProtocol;
import com.google.android.gms.cast.C4380g;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.common.util.C4685h;
import com.google.firebase.p253b.C9755a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.cast.internal.n */
/* loaded from: classes2.dex */
public class C4441n extends AbstractC4419c {

    /* renamed from: g */
    public static final String f16672g = C4430f.m24203b("com.google.cast.media");

    /* renamed from: h */
    private long f16673h;

    /* renamed from: i */
    private MediaStatus f16674i;

    /* renamed from: k */
    private AbstractC4442a f16676k;

    /* renamed from: l */
    private final C4445q f16677l = new C4445q(this.f16604b, 86400000);

    /* renamed from: m */
    private final C4445q f16678m = new C4445q(this.f16604b, 86400000);

    /* renamed from: n */
    private final C4445q f16679n = new C4445q(this.f16604b, 86400000);

    /* renamed from: o */
    private final C4445q f16680o = new C4445q(this.f16604b, 86400000);

    /* renamed from: p */
    private final C4445q f16681p = new C4445q(this.f16604b, 86400000);

    /* renamed from: q */
    private final C4445q f16682q = new C4445q(this.f16604b, 86400000);

    /* renamed from: r */
    private final C4445q f16683r = new C4445q(this.f16604b, 86400000);

    /* renamed from: s */
    private final C4445q f16684s = new C4445q(this.f16604b, 86400000);

    /* renamed from: t */
    private final C4445q f16685t = new C4445q(this.f16604b, 86400000);

    /* renamed from: u */
    private final C4445q f16686u = new C4445q(this.f16604b, 86400000);

    /* renamed from: v */
    private final C4445q f16687v = new C4445q(this.f16604b, 86400000);

    /* renamed from: w */
    private final C4445q f16688w = new C4445q(this.f16604b, 86400000);

    /* renamed from: x */
    private final C4445q f16689x = new C4445q(this.f16604b, 86400000);

    /* renamed from: y */
    private final C4445q f16690y = new C4445q(this.f16604b, 86400000);

    /* renamed from: j */
    private final List<C4445q> f16675j = new ArrayList();

    /* renamed from: com.google.android.gms.cast.internal.n$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4442a {
        /* renamed from: a */
        void mo24124a();

        /* renamed from: b */
        void mo24123b();

        /* renamed from: c */
        void mo24122c();

        /* renamed from: d */
        void mo24121d();
    }

    public C4441n(String str) {
        super(f16672g, C4685h.m23138d(), "MediaControlChannel", str, 1000L);
        this.f16675j.add(this.f16677l);
        this.f16675j.add(this.f16678m);
        this.f16675j.add(this.f16679n);
        this.f16675j.add(this.f16680o);
        this.f16675j.add(this.f16681p);
        this.f16675j.add(this.f16682q);
        this.f16675j.add(this.f16683r);
        this.f16675j.add(this.f16684s);
        this.f16675j.add(this.f16685t);
        this.f16675j.add(this.f16686u);
        this.f16675j.add(this.f16687v);
        this.f16675j.add(this.f16688w);
        this.f16675j.add(this.f16689x);
        this.f16675j.add(this.f16690y);
        m24125m();
    }

    /* renamed from: a */
    private void m24151a(long j, JSONObject jSONObject) {
        int i;
        boolean z = true;
        boolean m24117a = this.f16677l.m24117a(j);
        boolean z2 = this.f16681p.m24113b() && !this.f16681p.m24117a(j);
        if ((!this.f16682q.m24113b() || this.f16682q.m24117a(j)) && (!this.f16683r.m24113b() || this.f16683r.m24117a(j))) {
            z = false;
        }
        int i2 = z2 ? 2 : 0;
        if (z) {
            i2 |= 1;
        }
        if (m24117a || this.f16674i == null) {
            this.f16674i = new MediaStatus(jSONObject);
            this.f16673h = this.f16604b.mo16432b();
            i = 31;
        } else {
            i = this.f16674i.m25062a(jSONObject, i2);
        }
        if ((i & 1) != 0) {
            this.f16673h = this.f16604b.mo16432b();
            m24129i();
        }
        if ((i & 2) != 0) {
            this.f16673h = this.f16604b.mo16432b();
            m24129i();
        }
        if ((i & 4) != 0) {
            m24128j();
        }
        if ((i & 8) != 0) {
            m24127k();
        }
        if ((i & 16) != 0) {
            m24126l();
        }
        for (C4445q c4445q : this.f16675j) {
            c4445q.m24116a(j, 0);
        }
    }

    /* renamed from: i */
    private void m24129i() {
        if (this.f16676k != null) {
            this.f16676k.mo24124a();
        }
    }

    /* renamed from: j */
    private void m24128j() {
        if (this.f16676k != null) {
            this.f16676k.mo24123b();
        }
    }

    /* renamed from: k */
    private void m24127k() {
        if (this.f16676k != null) {
            this.f16676k.mo24122c();
        }
    }

    /* renamed from: l */
    private void m24126l() {
        if (this.f16676k != null) {
            this.f16676k.mo24121d();
        }
    }

    /* renamed from: m */
    private void m24125m() {
        this.f16673h = 0L;
        this.f16674i = null;
        for (C4445q c4445q : this.f16675j) {
            c4445q.m24118a();
        }
    }

    /* renamed from: a */
    public long m24149a(AbstractC4444p abstractC4444p) {
        JSONObject jSONObject = new JSONObject();
        long c = c();
        this.f16684s.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "GET_STATUS");
            if (this.f16674i != null) {
                jSONObject.put("mediaSessionId", this.f16674i.m25059b());
            }
        } catch (JSONException e) {
        }
        a(jSONObject.toString(), c, (String) null);
        return c;
    }

    /* renamed from: a */
    public long m24148a(AbstractC4444p abstractC4444p, double d, JSONObject jSONObject) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException(new StringBuilder(41).append("Volume cannot be ").append(d).toString());
        }
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.f16682q.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", m24130h());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("level", d);
            jSONObject2.put(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, (String) null);
        return c;
    }

    /* renamed from: a */
    public long m24147a(AbstractC4444p abstractC4444p, int i, long j, MediaQueueItem[] mediaQueueItemArr, int i2, Integer num, JSONObject jSONObject) {
        if (j == -1 || j >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            long c = c();
            this.f16688w.m24114a(c, abstractC4444p);
            a(true);
            try {
                jSONObject2.put("requestId", c);
                jSONObject2.put("type", "QUEUE_UPDATE");
                jSONObject2.put("mediaSessionId", m24130h());
                if (i != 0) {
                    jSONObject2.put("currentItemId", i);
                }
                if (i2 != 0) {
                    jSONObject2.put("jump", i2);
                }
                if (mediaQueueItemArr != null && mediaQueueItemArr.length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i3 = 0; i3 < mediaQueueItemArr.length; i3++) {
                        jSONArray.put(i3, mediaQueueItemArr[i3].m25077k());
                    }
                    jSONObject2.put("items", jSONArray);
                }
                if (num != null) {
                    switch (num.intValue()) {
                        case 0:
                            jSONObject2.put("repeatMode", "REPEAT_OFF");
                            break;
                        case 1:
                            jSONObject2.put("repeatMode", "REPEAT_ALL");
                            break;
                        case 2:
                            jSONObject2.put("repeatMode", "REPEAT_SINGLE");
                            break;
                        case 3:
                            jSONObject2.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
                            break;
                    }
                }
                if (j != -1) {
                    jSONObject2.put("currentTime", C4430f.m24207a(j));
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException e) {
            }
            a(jSONObject2.toString(), c, (String) null);
            return c;
        }
        throw new IllegalArgumentException(new StringBuilder(53).append("playPosition cannot be negative: ").append(j).toString());
    }

    /* renamed from: a */
    public long m24146a(AbstractC4444p abstractC4444p, long j, int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.f16681p.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "SEEK");
            jSONObject2.put("mediaSessionId", m24130h());
            jSONObject2.put("currentTime", C4430f.m24207a(j));
            if (i == 1) {
                jSONObject2.put("resumeState", "PLAYBACK_START");
            } else if (i == 2) {
                jSONObject2.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, (String) null);
        return c;
    }

    /* renamed from: a */
    public long m24145a(AbstractC4444p abstractC4444p, MediaInfo mediaInfo, boolean z, long j, long[] jArr, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.f16677l.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "LOAD");
            jSONObject2.put("media", mediaInfo.m25132l());
            jSONObject2.put("autoplay", z);
            jSONObject2.put("currentTime", C4430f.m24207a(j));
            if (jArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < jArr.length; i++) {
                    jSONArray.put(i, jArr[i]);
                }
                jSONObject2.put("activeTrackIds", jSONArray);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, (String) null);
        return c;
    }

    /* renamed from: a */
    public long m24144a(AbstractC4444p abstractC4444p, TextTrackStyle textTrackStyle) {
        JSONObject jSONObject = new JSONObject();
        long c = c();
        this.f16686u.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.m24983n());
            }
            jSONObject.put("mediaSessionId", m24130h());
        } catch (JSONException e) {
        }
        a(jSONObject.toString(), c, (String) null);
        return c;
    }

    /* renamed from: a */
    public long m24143a(AbstractC4444p abstractC4444p, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.f16678m.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", m24130h());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, (String) null);
        return c;
    }

    /* renamed from: a */
    public long m24142a(AbstractC4444p abstractC4444p, boolean z, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.f16683r.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", m24130h());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("muted", z);
            jSONObject2.put(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, (String) null);
        return c;
    }

    /* renamed from: a */
    public long m24141a(AbstractC4444p abstractC4444p, int[] iArr, int i, JSONObject jSONObject) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.f16690y.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "QUEUE_REORDER");
            jSONObject2.put("mediaSessionId", m24130h());
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jSONArray.put(i2, iArr[i2]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (i != 0) {
                jSONObject2.put("insertBefore", i);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, (String) null);
        return c;
    }

    /* renamed from: a */
    public long m24140a(AbstractC4444p abstractC4444p, int[] iArr, JSONObject jSONObject) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.f16689x.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "QUEUE_REMOVE");
            jSONObject2.put("mediaSessionId", m24130h());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < iArr.length; i++) {
                jSONArray.put(i, iArr[i]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, (String) null);
        return c;
    }

    /* renamed from: a */
    public long m24139a(AbstractC4444p abstractC4444p, long[] jArr) {
        JSONObject jSONObject = new JSONObject();
        long c = c();
        this.f16685t.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject.put("requestId", c);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", m24130h());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jArr.length; i++) {
                jSONArray.put(i, jArr[i]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException e) {
        }
        a(jSONObject.toString(), c, (String) null);
        return c;
    }

    /* renamed from: a */
    public long m24138a(AbstractC4444p abstractC4444p, MediaQueueItem[] mediaQueueItemArr, int i, int i2, int i3, long j, JSONObject jSONObject) {
        if (mediaQueueItemArr == null || mediaQueueItemArr.length == 0) {
            throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
        }
        if (i2 != 0 && i3 != -1) {
            throw new IllegalArgumentException("can not set both currentItemId and currentItemIndexInItemsToInsert");
        }
        if (i3 != -1 && (i3 < 0 || i3 >= mediaQueueItemArr.length)) {
            throw new IllegalArgumentException(String.format("currentItemIndexInItemsToInsert %d out of range [0, %d).", Integer.valueOf(i3), Integer.valueOf(mediaQueueItemArr.length)));
        }
        if (j != -1 && j < 0) {
            throw new IllegalArgumentException(new StringBuilder(54).append("playPosition can not be negative: ").append(j).toString());
        }
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.f16687v.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "QUEUE_INSERT");
            jSONObject2.put("mediaSessionId", m24130h());
            JSONArray jSONArray = new JSONArray();
            for (int i4 = 0; i4 < mediaQueueItemArr.length; i4++) {
                jSONArray.put(i4, mediaQueueItemArr[i4].m25077k());
            }
            jSONObject2.put("items", jSONArray);
            if (i != 0) {
                jSONObject2.put("insertBefore", i);
            }
            if (i2 != 0) {
                jSONObject2.put("currentItemId", i2);
            }
            if (i3 != -1) {
                jSONObject2.put("currentItemIndex", i3);
            }
            if (j != -1) {
                jSONObject2.put("currentTime", C4430f.m24207a(j));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, (String) null);
        return c;
    }

    /* renamed from: a */
    public long m24137a(AbstractC4444p abstractC4444p, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, JSONObject jSONObject) {
        if (mediaQueueItemArr == null || mediaQueueItemArr.length == 0) {
            throw new IllegalArgumentException("items must not be null or empty.");
        }
        if (i < 0 || i >= mediaQueueItemArr.length) {
            throw new IllegalArgumentException(new StringBuilder(31).append("Invalid startIndex: ").append(i).toString());
        }
        if (j != -1 && j < 0) {
            throw new IllegalArgumentException(new StringBuilder(54).append("playPosition can not be negative: ").append(j).toString());
        }
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.f16677l.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "QUEUE_LOAD");
            JSONArray jSONArray = new JSONArray();
            for (int i3 = 0; i3 < mediaQueueItemArr.length; i3++) {
                jSONArray.put(i3, mediaQueueItemArr[i3].m25077k());
            }
            jSONObject2.put("items", jSONArray);
            switch (i2) {
                case 0:
                    jSONObject2.put("repeatMode", "REPEAT_OFF");
                    break;
                case 1:
                    jSONObject2.put("repeatMode", "REPEAT_ALL");
                    break;
                case 2:
                    jSONObject2.put("repeatMode", "REPEAT_SINGLE");
                    break;
                case 3:
                    jSONObject2.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
                    break;
                default:
                    throw new IllegalArgumentException(new StringBuilder(32).append("Invalid repeat mode: ").append(i2).toString());
            }
            jSONObject2.put("startIndex", i);
            if (j != -1) {
                jSONObject2.put("currentTime", C4430f.m24207a(j));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, (String) null);
        return c;
    }

    @Override // com.google.android.gms.cast.internal.AbstractC4419c, com.google.android.gms.cast.internal.AbstractC4422d
    /* renamed from: a */
    public void mo24152a() {
        super.mo24152a();
        m24125m();
    }

    @Override // com.google.android.gms.cast.internal.AbstractC4422d
    /* renamed from: a */
    public void mo17666a(long j, int i) {
        for (C4445q c4445q : this.f16675j) {
            c4445q.m24116a(j, i);
        }
    }

    /* renamed from: a */
    public void m24150a(AbstractC4442a abstractC4442a) {
        this.f16676k = abstractC4442a;
    }

    @Override // com.google.android.gms.cast.internal.AbstractC4419c
    /* renamed from: a */
    protected boolean mo17667a(long j) {
        boolean z;
        for (C4445q c4445q : this.f16675j) {
            c4445q.m24112b(j, C4380g.f16482h);
        }
        synchronized (C4445q.f16691a) {
            Iterator<C4445q> it2 = this.f16675j.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().m24113b()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public long m24136b(AbstractC4444p abstractC4444p, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.f16680o.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "STOP");
            jSONObject2.put("mediaSessionId", m24130h());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, (String) null);
        return c;
    }

    @Override // com.google.android.gms.cast.internal.AbstractC4422d
    /* renamed from: b */
    public final void mo17652b(String str) {
        this.f16611f.m24160b("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1L);
            if (string.equals("MEDIA_STATUS")) {
                JSONArray jSONArray = jSONObject.getJSONArray("status");
                if (jSONArray.length() > 0) {
                    m24151a(optLong, jSONArray.getJSONObject(0));
                    return;
                }
                this.f16674i = null;
                m24129i();
                m24128j();
                m24127k();
                m24126l();
                this.f16684s.m24116a(optLong, 0);
            } else if (string.equals("INVALID_PLAYER_STATE")) {
                this.f16611f.m24155d("received unexpected error: Invalid Player State.", new Object[0]);
                JSONObject optJSONObject = jSONObject.optJSONObject("customData");
                for (C4445q c4445q : this.f16675j) {
                    c4445q.m24115a(optLong, 2100, optJSONObject);
                }
            } else if (string.equals("LOAD_FAILED")) {
                this.f16677l.m24115a(optLong, 2100, jSONObject.optJSONObject("customData"));
            } else if (string.equals("LOAD_CANCELLED")) {
                this.f16677l.m24115a(optLong, C4380g.f16481g, jSONObject.optJSONObject("customData"));
            } else if (string.equals("INVALID_REQUEST")) {
                this.f16611f.m24155d("received unexpected error: Invalid Request.", new Object[0]);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("customData");
                for (C4445q c4445q2 : this.f16675j) {
                    c4445q2.m24115a(optLong, 2100, optJSONObject2);
                }
            }
        } catch (JSONException e) {
            this.f16611f.m24155d("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
    }

    /* renamed from: c */
    public long m24135c(AbstractC4444p abstractC4444p, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long c = c();
        this.f16679n.m24114a(c, abstractC4444p);
        a(true);
        try {
            jSONObject2.put("requestId", c);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", m24130h());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException e) {
        }
        a(jSONObject2.toString(), c, (String) null);
        return c;
    }

    /* renamed from: d */
    public long m24134d() {
        MediaInfo m24131g = m24131g();
        if (m24131g == null || this.f16673h == 0) {
            return 0L;
        }
        double m25053e = this.f16674i.m25053e();
        long m25050g = this.f16674i.m25050g();
        int m25057c = this.f16674i.m25057c();
        if (m25053e == C9755a.f30449c || m25057c != 2) {
            return m25050g;
        }
        long mo16432b = this.f16604b.mo16432b() - this.f16673h;
        long j = mo16432b < 0 ? 0L : mo16432b;
        if (j == 0) {
            return m25050g;
        }
        long m25138f = m24131g.m25138f();
        long j2 = m25050g + ((long) (j * m25053e));
        if (m25138f <= 0 || j2 <= m25138f) {
            m25138f = j2 < 0 ? 0L : j2;
        }
        return m25138f;
    }

    /* renamed from: e */
    public long m24133e() {
        MediaInfo m24131g = m24131g();
        if (m24131g != null) {
            return m24131g.m25138f();
        }
        return 0L;
    }

    /* renamed from: f */
    public MediaStatus m24132f() {
        return this.f16674i;
    }

    /* renamed from: g */
    public MediaInfo m24131g() {
        if (this.f16674i == null) {
            return null;
        }
        return this.f16674i.m25051f();
    }

    /* renamed from: h */
    public long m24130h() {
        if (this.f16674i == null) {
            throw new IllegalStateException("No current media session");
        }
        return this.f16674i.m25059b();
    }
}
