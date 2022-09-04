package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.agt;
import com.google.firebase.p251a.C9654a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class MediaMetadata extends AbstractSafeParcelable {

    /* renamed from: a */
    public static final int f15875a = 0;

    /* renamed from: b */
    public static final int f15876b = 1;

    /* renamed from: c */
    public static final int f15877c = 2;

    /* renamed from: d */
    public static final int f15878d = 3;

    /* renamed from: e */
    public static final int f15879e = 4;

    /* renamed from: f */
    public static final int f15880f = 100;

    /* renamed from: D */
    private final int f15900D;

    /* renamed from: E */
    private final List<WebImage> f15901E;

    /* renamed from: F */
    private int f15902F;

    /* renamed from: g */
    final Bundle f15903g;

    /* renamed from: B */
    private static final String[] f15873B = {null, "String", "int", "double", "ISO-8601 date String"};
    public static final Parcelable.Creator<MediaMetadata> CREATOR = new C4450n();

    /* renamed from: h */
    public static final String f15881h = "com.google.android.gms.cast.metadata.CREATION_DATE";

    /* renamed from: i */
    public static final String f15882i = "com.google.android.gms.cast.metadata.RELEASE_DATE";

    /* renamed from: j */
    public static final String f15883j = "com.google.android.gms.cast.metadata.BROADCAST_DATE";

    /* renamed from: k */
    public static final String f15884k = "com.google.android.gms.cast.metadata.TITLE";

    /* renamed from: l */
    public static final String f15885l = "com.google.android.gms.cast.metadata.SUBTITLE";

    /* renamed from: m */
    public static final String f15886m = "com.google.android.gms.cast.metadata.ARTIST";

    /* renamed from: n */
    public static final String f15887n = "com.google.android.gms.cast.metadata.ALBUM_ARTIST";

    /* renamed from: o */
    public static final String f15888o = "com.google.android.gms.cast.metadata.ALBUM_TITLE";

    /* renamed from: p */
    public static final String f15889p = "com.google.android.gms.cast.metadata.COMPOSER";

    /* renamed from: q */
    public static final String f15890q = "com.google.android.gms.cast.metadata.DISC_NUMBER";

    /* renamed from: r */
    public static final String f15891r = "com.google.android.gms.cast.metadata.TRACK_NUMBER";

    /* renamed from: s */
    public static final String f15892s = "com.google.android.gms.cast.metadata.SEASON_NUMBER";

    /* renamed from: t */
    public static final String f15893t = "com.google.android.gms.cast.metadata.EPISODE_NUMBER";

    /* renamed from: u */
    public static final String f15894u = "com.google.android.gms.cast.metadata.SERIES_TITLE";

    /* renamed from: v */
    public static final String f15895v = "com.google.android.gms.cast.metadata.STUDIO";

    /* renamed from: w */
    public static final String f15896w = "com.google.android.gms.cast.metadata.WIDTH";

    /* renamed from: x */
    public static final String f15897x = "com.google.android.gms.cast.metadata.HEIGHT";

    /* renamed from: y */
    public static final String f15898y = "com.google.android.gms.cast.metadata.LOCATION_NAME";

    /* renamed from: z */
    public static final String f15899z = "com.google.android.gms.cast.metadata.LOCATION_LATITUDE";

    /* renamed from: A */
    public static final String f15872A = "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE";

    /* renamed from: C */
    private static final C4197a f15874C = new C4197a().m25098a(f15881h, "creationDateTime", 4).m25098a(f15882i, "releaseDate", 4).m25098a(f15883j, "originalAirdate", 4).m25098a(f15884k, "title", 1).m25098a(f15885l, "subtitle", 1).m25098a(f15886m, "artist", 1).m25098a(f15887n, "albumArtist", 1).m25098a(f15888o, "albumName", 1).m25098a(f15889p, "composer", 1).m25098a(f15890q, "discNumber", 2).m25098a(f15891r, "trackNumber", 2).m25098a(f15892s, "season", 2).m25098a(f15893t, "episode", 2).m25098a(f15894u, "seriesTitle", 1).m25098a(f15895v, "studio", 1).m25098a(f15896w, FimiMediaMeta.IJKM_KEY_WIDTH, 2).m25098a(f15897x, FimiMediaMeta.IJKM_KEY_HEIGHT, 2).m25098a(f15898y, C9654a.C9656b.f30231p, 1).m25098a(f15899z, "latitude", 3).m25098a(f15872A, "longitude", 3);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.cast.MediaMetadata$a */
    /* loaded from: classes2.dex */
    public static class C4197a {

        /* renamed from: a */
        private final Map<String, String> f15904a = new HashMap();

        /* renamed from: b */
        private final Map<String, String> f15905b = new HashMap();

        /* renamed from: c */
        private final Map<String, Integer> f15906c = new HashMap();

        /* renamed from: a */
        public C4197a m25098a(String str, String str2, int i) {
            this.f15904a.put(str, str2);
            this.f15905b.put(str2, str);
            this.f15906c.put(str, Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public String m25099a(String str) {
            return this.f15904a.get(str);
        }

        /* renamed from: b */
        public String m25097b(String str) {
            return this.f15905b.get(str);
        }

        /* renamed from: c */
        public int m25096c(String str) {
            Integer num = this.f15906c.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
    }

    public MediaMetadata() {
        this(0);
    }

    public MediaMetadata(int i) {
        this(1, new ArrayList(), new Bundle(), i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaMetadata(int i, List<WebImage> list, Bundle bundle, int i2) {
        this.f15900D = i;
        this.f15901E = list;
        this.f15903g = bundle;
        this.f15902F = i2;
    }

    /* renamed from: a */
    private void m25114a(JSONObject jSONObject, String... strArr) {
        try {
            for (String str : strArr) {
                if (this.f15903g.containsKey(str)) {
                    switch (f15874C.m25096c(str)) {
                        case 1:
                        case 4:
                            jSONObject.put(f15874C.m25099a(str), this.f15903g.getString(str));
                            continue;
                        case 2:
                            jSONObject.put(f15874C.m25099a(str), this.f15903g.getInt(str));
                            continue;
                        case 3:
                            jSONObject.put(f15874C.m25099a(str), this.f15903g.getDouble(str));
                            continue;
                        default:
                            continue;
                    }
                }
            }
            for (String str2 : this.f15903g.keySet()) {
                if (!str2.startsWith("com.google.")) {
                    Object obj = this.f15903g.get(str2);
                    if (obj instanceof String) {
                        jSONObject.put(str2, obj);
                    } else if (obj instanceof Integer) {
                        jSONObject.put(str2, obj);
                    } else if (obj instanceof Double) {
                        jSONObject.put(str2, obj);
                    }
                }
            }
        } catch (JSONException e) {
        }
    }

    /* renamed from: a */
    private boolean m25122a(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m25122a((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private void m25111b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int m25096c = f15874C.m25096c(str);
        if (m25096c == i || m25096c == 0) {
            return;
        }
        String valueOf = String.valueOf(f15873B[i]);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(valueOf).length()).append("Value for ").append(str).append(" must be a ").append(valueOf).toString());
    }

    /* renamed from: b */
    private void m25110b(JSONObject jSONObject, String... strArr) {
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!"metadataType".equals(next)) {
                    String m25097b = f15874C.m25097b(next);
                    if (m25097b == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            this.f15903g.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.f15903g.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.f15903g.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(m25097b)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                switch (f15874C.m25096c(m25097b)) {
                                    case 1:
                                        if (obj2 instanceof String) {
                                            this.f15903g.putString(m25097b, (String) obj2);
                                            break;
                                        } else {
                                            continue;
                                        }
                                    case 2:
                                        if (obj2 instanceof Integer) {
                                            this.f15903g.putInt(m25097b, ((Integer) obj2).intValue());
                                            break;
                                        } else {
                                            continue;
                                        }
                                    case 3:
                                        if (obj2 instanceof Double) {
                                            this.f15903g.putDouble(m25097b, ((Double) obj2).doubleValue());
                                            break;
                                        } else {
                                            continue;
                                        }
                                    case 4:
                                        if (!(obj2 instanceof String)) {
                                            continue;
                                        } else if (agt.m17576a((String) obj2) == null) {
                                            break;
                                        } else {
                                            this.f15903g.putString(m25097b, (String) obj2);
                                            break;
                                        }
                                    default:
                                        continue;
                                }
                            }
                        } catch (JSONException e) {
                        }
                    }
                }
            }
        } catch (JSONException e2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25123a() {
        return this.f15900D;
    }

    /* renamed from: a */
    public void m25121a(WebImage webImage) {
        this.f15901E.add(webImage);
    }

    /* renamed from: a */
    public void m25119a(String str, double d) {
        m25111b(str, 3);
        this.f15903g.putDouble(str, d);
    }

    /* renamed from: a */
    public void m25118a(String str, int i) {
        m25111b(str, 2);
        this.f15903g.putInt(str, i);
    }

    /* renamed from: a */
    public void m25117a(String str, String str2) {
        m25111b(str, 1);
        this.f15903g.putString(str, str2);
    }

    /* renamed from: a */
    public void m25116a(String str, Calendar calendar) {
        m25111b(str, 4);
        this.f15903g.putString(str, agt.m17575a(calendar));
    }

    /* renamed from: a */
    public void m25115a(JSONObject jSONObject) {
        m25109c();
        this.f15902F = 0;
        try {
            this.f15902F = jSONObject.getInt("metadataType");
        } catch (JSONException e) {
        }
        agt.m17574a(this.f15901E, jSONObject);
        switch (this.f15902F) {
            case 0:
                m25110b(jSONObject, f15884k, f15886m, f15885l, f15882i);
                return;
            case 1:
                m25110b(jSONObject, f15884k, f15895v, f15885l, f15882i);
                return;
            case 2:
                m25110b(jSONObject, f15884k, f15894u, f15892s, f15893t, f15883j);
                return;
            case 3:
                m25110b(jSONObject, f15884k, f15888o, f15886m, f15887n, f15889p, f15891r, f15890q, f15882i);
                return;
            case 4:
                m25110b(jSONObject, f15884k, f15886m, f15898y, f15899z, f15872A, f15896w, f15897x, f15881h);
                return;
            default:
                m25110b(jSONObject, new String[0]);
                return;
        }
    }

    /* renamed from: a */
    public boolean m25120a(String str) {
        return this.f15903g.containsKey(str);
    }

    /* renamed from: b */
    public int m25113b() {
        return this.f15902F;
    }

    /* renamed from: b */
    public String m25112b(String str) {
        m25111b(str, 1);
        return this.f15903g.getString(str);
    }

    /* renamed from: c */
    public int m25108c(String str) {
        m25111b(str, 2);
        return this.f15903g.getInt(str);
    }

    /* renamed from: c */
    public void m25109c() {
        this.f15903g.clear();
        this.f15901E.clear();
    }

    /* renamed from: d */
    public double m25106d(String str) {
        m25111b(str, 3);
        return this.f15903g.getDouble(str);
    }

    /* renamed from: d */
    public Set<String> m25107d() {
        return this.f15903g.keySet();
    }

    /* renamed from: e */
    public Calendar m25104e(String str) {
        m25111b(str, 4);
        String string = this.f15903g.getString(str);
        if (string != null) {
            return agt.m17576a(string);
        }
        return null;
    }

    /* renamed from: e */
    public JSONObject m25105e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.f15902F);
        } catch (JSONException e) {
        }
        agt.m17573a(jSONObject, this.f15901E);
        switch (this.f15902F) {
            case 0:
                m25114a(jSONObject, f15884k, f15886m, f15885l, f15882i);
                break;
            case 1:
                m25114a(jSONObject, f15884k, f15895v, f15885l, f15882i);
                break;
            case 2:
                m25114a(jSONObject, f15884k, f15894u, f15892s, f15893t, f15883j);
                break;
            case 3:
                m25114a(jSONObject, f15884k, f15886m, f15888o, f15887n, f15889p, f15891r, f15890q, f15882i);
                break;
            case 4:
                m25114a(jSONObject, f15884k, f15886m, f15898y, f15899z, f15872A, f15896w, f15897x, f15881h);
                break;
            default:
                m25114a(jSONObject, new String[0]);
                break;
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return m25122a(this.f15903g, mediaMetadata.f15903g) && this.f15901E.equals(mediaMetadata.f15901E);
    }

    /* renamed from: f */
    public String m25102f(String str) {
        m25111b(str, 4);
        return this.f15903g.getString(str);
    }

    /* renamed from: f */
    public List<WebImage> m25103f() {
        return this.f15901E;
    }

    /* renamed from: g */
    public boolean m25101g() {
        return this.f15901E != null && !this.f15901E.isEmpty();
    }

    /* renamed from: h */
    public void m25100h() {
        this.f15901E.clear();
    }

    public int hashCode() {
        int i = 17;
        Iterator<String> it2 = this.f15903g.keySet().iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                i = this.f15903g.get(it2.next()).hashCode() + (i2 * 31);
            } else {
                return (i2 * 31) + this.f15901E.hashCode();
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4450n.m24096a(this, parcel, i);
    }
}
