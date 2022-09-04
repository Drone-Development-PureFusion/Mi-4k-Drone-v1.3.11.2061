package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.uk */
/* loaded from: classes.dex */
public abstract class AbstractC7795uk {
    @aaa

    /* renamed from: a */
    public static final AbstractC7795uk f25925a = new AbstractC7795uk() { // from class: com.google.android.gms.internal.uk.1
        @Override // com.google.android.gms.internal.AbstractC7795uk
        /* renamed from: a */
        public String mo13446a(@Nullable String str, String str2) {
            return str2;
        }
    };
    @aaa

    /* renamed from: b */
    public static final AbstractC7795uk f25926b = new AbstractC7795uk() { // from class: com.google.android.gms.internal.uk.2
        @Override // com.google.android.gms.internal.AbstractC7795uk
        /* renamed from: a */
        public String mo13446a(@Nullable String str, String str2) {
            return str != null ? str : str2;
        }
    };
    @aaa

    /* renamed from: c */
    public static final AbstractC7795uk f25927c = new AbstractC7795uk() { // from class: com.google.android.gms.internal.uk.3
        @Nullable
        /* renamed from: a */
        private String m13447a(@Nullable String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            int i = 0;
            int length = str.length();
            while (i < str.length() && str.charAt(i) == ',') {
                i++;
            }
            while (length > 0 && str.charAt(length - 1) == ',') {
                length--;
            }
            return (i == 0 && length == str.length()) ? str : str.substring(i, length);
        }

        @Override // com.google.android.gms.internal.AbstractC7795uk
        /* renamed from: a */
        public String mo13446a(@Nullable String str, String str2) {
            String m13447a = m13447a(str);
            String m13447a2 = m13447a(str2);
            return TextUtils.isEmpty(m13447a) ? m13447a2 : TextUtils.isEmpty(m13447a2) ? m13447a : new StringBuilder(String.valueOf(m13447a).length() + 1 + String.valueOf(m13447a2).length()).append(m13447a).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(m13447a2).toString();
        }
    };

    /* renamed from: a */
    public abstract String mo13446a(@Nullable String str, String str2);

    /* renamed from: a */
    public final void m13448a(Map<String, String> map, String str, String str2) {
        map.put(str, mo13446a(map.get(str), str2));
    }
}
