package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.C3424R;
import com.google.android.gms.ads.C3446d;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public final class zzk {

    /* renamed from: a */
    private final C3446d[] f14057a;

    /* renamed from: b */
    private final String f14058b;

    public zzk(Context context, AttributeSet attributeSet) {
        boolean z = true;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3424R.styleable.AdsAttrs);
        String string = obtainAttributes.getString(C3424R.styleable.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(C3424R.styleable.AdsAttrs_adSizes);
        boolean z2 = !TextUtils.isEmpty(string);
        z = TextUtils.isEmpty(string2) ? false : z;
        if (z2 && !z) {
            this.f14057a = m27407a(string);
        } else if (z2 || !z) {
            if (!z2) {
                throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
            }
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            this.f14057a = m27407a(string2);
        }
        this.f14058b = obtainAttributes.getString(C3424R.styleable.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(this.f14058b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* renamed from: a */
    private static C3446d[] m27407a(String str) {
        String[] split = str.split("\\s*,\\s*");
        C3446d[] c3446dArr = new C3446d[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    c3446dArr[i] = new C3446d("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException e) {
                    String valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(trim)) {
                c3446dArr[i] = C3446d.f13737c;
            } else if ("LARGE_BANNER".equals(trim)) {
                c3446dArr[i] = C3446d.f13739e;
            } else if ("FULL_BANNER".equals(trim)) {
                c3446dArr[i] = C3446d.f13738d;
            } else if ("LEADERBOARD".equals(trim)) {
                c3446dArr[i] = C3446d.f13740f;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                c3446dArr[i] = C3446d.f13741g;
            } else if ("SMART_BANNER".equals(trim)) {
                c3446dArr[i] = C3446d.f13743i;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                c3446dArr[i] = C3446d.f13742h;
            } else if (!"FLUID".equals(trim)) {
                String valueOf2 = String.valueOf(trim);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf2) : new String("Could not parse XML attribute \"adSize\": "));
            } else {
                c3446dArr[i] = C3446d.f13744j;
            }
        }
        if (c3446dArr.length == 0) {
            String valueOf3 = String.valueOf(str);
            throw new IllegalArgumentException(valueOf3.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf3) : new String("Could not parse XML attribute \"adSize\": "));
        }
        return c3446dArr;
    }

    /* renamed from: a */
    public String m27408a() {
        return this.f14058b;
    }

    /* renamed from: a */
    public C3446d[] m27406a(boolean z) {
        if (z || this.f14057a.length == 1) {
            return this.f14057a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
