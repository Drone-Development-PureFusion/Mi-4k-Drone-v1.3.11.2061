package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4693p;
import com.google.android.gms.common.util.C4696s;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class TextTrackStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TextTrackStyle> CREATOR = new C4454r();

    /* renamed from: a */
    public static final float f15982a = 1.0f;

    /* renamed from: b */
    public static final int f15983b = 0;

    /* renamed from: c */
    public static final int f15984c = -1;

    /* renamed from: d */
    public static final int f15985d = 0;

    /* renamed from: e */
    public static final int f15986e = 1;

    /* renamed from: f */
    public static final int f15987f = 2;

    /* renamed from: g */
    public static final int f15988g = 3;

    /* renamed from: h */
    public static final int f15989h = 4;

    /* renamed from: i */
    public static final int f15990i = -1;

    /* renamed from: j */
    public static final int f15991j = 0;

    /* renamed from: k */
    public static final int f15992k = 1;

    /* renamed from: l */
    public static final int f15993l = 2;

    /* renamed from: m */
    public static final int f15994m = -1;

    /* renamed from: n */
    public static final int f15995n = 0;

    /* renamed from: o */
    public static final int f15996o = 1;

    /* renamed from: p */
    public static final int f15997p = 2;

    /* renamed from: q */
    public static final int f15998q = 3;

    /* renamed from: r */
    public static final int f15999r = 4;

    /* renamed from: s */
    public static final int f16000s = 5;

    /* renamed from: t */
    public static final int f16001t = 6;

    /* renamed from: u */
    public static final int f16002u = -1;

    /* renamed from: v */
    public static final int f16003v = 0;

    /* renamed from: w */
    public static final int f16004w = 1;

    /* renamed from: x */
    public static final int f16005x = 2;

    /* renamed from: y */
    public static final int f16006y = 3;

    /* renamed from: A */
    private final int f16007A;

    /* renamed from: B */
    private float f16008B;

    /* renamed from: C */
    private int f16009C;

    /* renamed from: D */
    private int f16010D;

    /* renamed from: E */
    private int f16011E;

    /* renamed from: F */
    private int f16012F;

    /* renamed from: G */
    private int f16013G;

    /* renamed from: H */
    private int f16014H;

    /* renamed from: I */
    private int f16015I;

    /* renamed from: J */
    private String f16016J;

    /* renamed from: K */
    private int f16017K;

    /* renamed from: L */
    private int f16018L;

    /* renamed from: M */
    private JSONObject f16019M;

    /* renamed from: z */
    String f16020z;

    public TextTrackStyle() {
        this(1, 1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextTrackStyle(int i, float f, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, int i9, int i10, String str2) {
        this.f16007A = i;
        this.f16008B = f;
        this.f16009C = i2;
        this.f16010D = i3;
        this.f16011E = i4;
        this.f16012F = i5;
        this.f16013G = i6;
        this.f16014H = i7;
        this.f16015I = i8;
        this.f16016J = str;
        this.f16017K = i9;
        this.f16018L = i10;
        this.f16020z = str2;
        if (this.f16020z == null) {
            this.f16019M = null;
            return;
        }
        try {
            this.f16019M = new JSONObject(this.f16020z);
        } catch (JSONException e) {
            this.f16019M = null;
            this.f16020z = null;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static TextTrackStyle m25009a(Context context) {
        TextTrackStyle textTrackStyle = new TextTrackStyle();
        if (!C4696s.m23106h()) {
            return textTrackStyle;
        }
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        textTrackStyle.m25011a(captioningManager.getFontScale());
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        textTrackStyle.m25005b(userStyle.backgroundColor);
        textTrackStyle.m25010a(userStyle.foregroundColor);
        switch (userStyle.edgeType) {
            case 1:
                textTrackStyle.m25001c(1);
                break;
            case 2:
                textTrackStyle.m25001c(2);
                break;
            default:
                textTrackStyle.m25001c(0);
                break;
        }
        textTrackStyle.m24999d(userStyle.edgeColor);
        Typeface typeface = userStyle.getTypeface();
        if (typeface != null) {
            if (Typeface.MONOSPACE.equals(typeface)) {
                textTrackStyle.m24991h(1);
            } else if (Typeface.SANS_SERIF.equals(typeface)) {
                textTrackStyle.m24991h(0);
            } else if (Typeface.SERIF.equals(typeface)) {
                textTrackStyle.m24991h(2);
            } else {
                textTrackStyle.m24991h(0);
            }
            boolean isBold = typeface.isBold();
            boolean isItalic = typeface.isItalic();
            if (isBold && isItalic) {
                textTrackStyle.m24989i(3);
            } else if (isBold) {
                textTrackStyle.m24989i(1);
            } else if (isItalic) {
                textTrackStyle.m24989i(2);
            } else {
                textTrackStyle.m24989i(0);
            }
        }
        return textTrackStyle;
    }

    /* renamed from: b */
    private int m25004b(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: j */
    private String m24987j(int i) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m25012a() {
        return this.f16007A;
    }

    /* renamed from: a */
    public void m25011a(float f) {
        this.f16008B = f;
    }

    /* renamed from: a */
    public void m25010a(int i) {
        this.f16009C = i;
    }

    /* renamed from: a */
    public void m25008a(String str) {
        this.f16016J = str;
    }

    /* renamed from: a */
    public void m25007a(JSONObject jSONObject) {
        this.f16019M = jSONObject;
    }

    /* renamed from: b */
    public float m25006b() {
        return this.f16008B;
    }

    /* renamed from: b */
    public void m25005b(int i) {
        this.f16010D = i;
    }

    /* renamed from: b */
    public void m25003b(JSONObject jSONObject) {
        this.f16008B = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.f16009C = m25004b(jSONObject.optString("foregroundColor"));
        this.f16010D = m25004b(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            String string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.f16011E = 0;
            } else if ("OUTLINE".equals(string)) {
                this.f16011E = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.f16011E = 2;
            } else if ("RAISED".equals(string)) {
                this.f16011E = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.f16011E = 4;
            }
        }
        this.f16012F = m25004b(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            String string2 = jSONObject.getString("windowType");
            if ("NONE".equals(string2)) {
                this.f16013G = 0;
            } else if ("NORMAL".equals(string2)) {
                this.f16013G = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.f16013G = 2;
            }
        }
        this.f16014H = m25004b(jSONObject.optString("windowColor"));
        if (this.f16013G == 2) {
            this.f16015I = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.f16016J = jSONObject.optString("fontFamily", null);
        if (jSONObject.has("fontGenericFamily")) {
            String string3 = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string3)) {
                this.f16017K = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.f16017K = 1;
            } else if ("SERIF".equals(string3)) {
                this.f16017K = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.f16017K = 3;
            } else if ("CASUAL".equals(string3)) {
                this.f16017K = 4;
            } else if ("CURSIVE".equals(string3)) {
                this.f16017K = 5;
            } else if ("SMALL_CAPITALS".equals(string3)) {
                this.f16017K = 6;
            }
        }
        if (jSONObject.has("fontStyle")) {
            String string4 = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string4)) {
                this.f16018L = 0;
            } else if ("BOLD".equals(string4)) {
                this.f16018L = 1;
            } else if ("ITALIC".equals(string4)) {
                this.f16018L = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.f16018L = 3;
            }
        }
        this.f16019M = jSONObject.optJSONObject("customData");
    }

    /* renamed from: c */
    public int m25002c() {
        return this.f16009C;
    }

    /* renamed from: c */
    public void m25001c(int i) {
        if (i < 0 || i > 4) {
            throw new IllegalArgumentException("invalid edgeType");
        }
        this.f16011E = i;
    }

    /* renamed from: d */
    public int m25000d() {
        return this.f16010D;
    }

    /* renamed from: d */
    public void m24999d(int i) {
        this.f16012F = i;
    }

    /* renamed from: e */
    public int m24998e() {
        return this.f16011E;
    }

    /* renamed from: e */
    public void m24997e(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("invalid windowType");
        }
        this.f16013G = i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        if ((this.f16019M == null) != (textTrackStyle.f16019M == null)) {
            return false;
        }
        if (this.f16019M != null && textTrackStyle.f16019M != null && !C4693p.m23118a(this.f16019M, textTrackStyle.f16019M)) {
            return false;
        }
        if (this.f16008B != textTrackStyle.f16008B || this.f16009C != textTrackStyle.f16009C || this.f16010D != textTrackStyle.f16010D || this.f16011E != textTrackStyle.f16011E || this.f16012F != textTrackStyle.f16012F || this.f16013G != textTrackStyle.f16013G || this.f16015I != textTrackStyle.f16015I || !C4430f.m24206a(this.f16016J, textTrackStyle.f16016J) || this.f16017K != textTrackStyle.f16017K || this.f16018L != textTrackStyle.f16018L) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public int m24996f() {
        return this.f16012F;
    }

    /* renamed from: f */
    public void m24995f(int i) {
        this.f16014H = i;
    }

    /* renamed from: g */
    public int m24994g() {
        return this.f16013G;
    }

    /* renamed from: g */
    public void m24993g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("invalid windowCornerRadius");
        }
        this.f16015I = i;
    }

    /* renamed from: h */
    public int m24992h() {
        return this.f16014H;
    }

    /* renamed from: h */
    public void m24991h(int i) {
        if (i < 0 || i > 6) {
            throw new IllegalArgumentException("invalid fontGenericFamily");
        }
        this.f16017K = i;
    }

    public int hashCode() {
        return C4585c.m23633a(Float.valueOf(this.f16008B), Integer.valueOf(this.f16009C), Integer.valueOf(this.f16010D), Integer.valueOf(this.f16011E), Integer.valueOf(this.f16012F), Integer.valueOf(this.f16013G), Integer.valueOf(this.f16014H), Integer.valueOf(this.f16015I), this.f16016J, Integer.valueOf(this.f16017K), Integer.valueOf(this.f16018L), this.f16019M);
    }

    /* renamed from: i */
    public int m24990i() {
        return this.f16015I;
    }

    /* renamed from: i */
    public void m24989i(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("invalid fontStyle");
        }
        this.f16018L = i;
    }

    /* renamed from: j */
    public String m24988j() {
        return this.f16016J;
    }

    /* renamed from: k */
    public int m24986k() {
        return this.f16017K;
    }

    /* renamed from: l */
    public int m24985l() {
        return this.f16018L;
    }

    /* renamed from: m */
    public JSONObject m24984m() {
        return this.f16019M;
    }

    /* renamed from: n */
    public JSONObject m24983n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.f16008B);
            if (this.f16009C != 0) {
                jSONObject.put("foregroundColor", m24987j(this.f16009C));
            }
            if (this.f16010D != 0) {
                jSONObject.put("backgroundColor", m24987j(this.f16010D));
            }
            switch (this.f16011E) {
                case 0:
                    jSONObject.put("edgeType", "NONE");
                    break;
                case 1:
                    jSONObject.put("edgeType", "OUTLINE");
                    break;
                case 2:
                    jSONObject.put("edgeType", "DROP_SHADOW");
                    break;
                case 3:
                    jSONObject.put("edgeType", "RAISED");
                    break;
                case 4:
                    jSONObject.put("edgeType", "DEPRESSED");
                    break;
            }
            if (this.f16012F != 0) {
                jSONObject.put("edgeColor", m24987j(this.f16012F));
            }
            switch (this.f16013G) {
                case 0:
                    jSONObject.put("windowType", "NONE");
                    break;
                case 1:
                    jSONObject.put("windowType", "NORMAL");
                    break;
                case 2:
                    jSONObject.put("windowType", "ROUNDED_CORNERS");
                    break;
            }
            if (this.f16014H != 0) {
                jSONObject.put("windowColor", m24987j(this.f16014H));
            }
            if (this.f16013G == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f16015I);
            }
            if (this.f16016J != null) {
                jSONObject.put("fontFamily", this.f16016J);
            }
            switch (this.f16017K) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            switch (this.f16018L) {
                case 0:
                    jSONObject.put("fontStyle", "NORMAL");
                    break;
                case 1:
                    jSONObject.put("fontStyle", "BOLD");
                    break;
                case 2:
                    jSONObject.put("fontStyle", "ITALIC");
                    break;
                case 3:
                    jSONObject.put("fontStyle", "BOLD_ITALIC");
                    break;
            }
            if (this.f16019M != null) {
                jSONObject.put("customData", this.f16019M);
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f16020z = this.f16019M == null ? null : this.f16019M.toString();
        C4454r.m24084a(this, parcel, i);
    }
}
