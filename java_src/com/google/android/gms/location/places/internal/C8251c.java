package com.google.android.gms.location.places.internal;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.C4583ak;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.Collection;
import java.util.List;
/* renamed from: com.google.android.gms.location.places.internal.c */
/* loaded from: classes2.dex */
public class C8251c {
    /* renamed from: a */
    public static CharSequence m12264a(String str, List<AutocompletePredictionEntity.SubstringEntity> list, CharacterStyle characterStyle) {
        if (characterStyle == null) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        for (AutocompletePredictionEntity.SubstringEntity substringEntity : list) {
            spannableString.setSpan(CharacterStyle.wrap(characterStyle), substringEntity.m12314a(), substringEntity.m12313b() + substringEntity.m12314a(), 0);
        }
        return spannableString;
    }

    /* renamed from: a */
    public static String m12263a(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        return C4583ak.m23640a(", ").m23642a((Iterable<?>) collection);
    }
}
