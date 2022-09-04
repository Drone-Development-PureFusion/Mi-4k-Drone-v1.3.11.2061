package com.google.android.gms.internal;

import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Field;
import java.util.Locale;
/* renamed from: com.google.android.gms.internal.no */
/* loaded from: classes2.dex */
public enum EnumC7451no implements AbstractC7458nq {
    IDENTITY { // from class: com.google.android.gms.internal.no.1
        @Override // com.google.android.gms.internal.AbstractC7458nq
        /* renamed from: a */
        public String mo14413a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.google.android.gms.internal.no.2
        @Override // com.google.android.gms.internal.AbstractC7458nq
        /* renamed from: a */
        public String mo14413a(Field field) {
            return EnumC7451no.m14418b(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.google.android.gms.internal.no.3
        @Override // com.google.android.gms.internal.AbstractC7458nq
        /* renamed from: a */
        public String mo14413a(Field field) {
            return EnumC7451no.m14418b(EnumC7451no.m14417b(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.google.android.gms.internal.no.4
        @Override // com.google.android.gms.internal.AbstractC7458nq
        /* renamed from: a */
        public String mo14413a(Field field) {
            return EnumC7451no.m14417b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.google.android.gms.internal.no.5
        @Override // com.google.android.gms.internal.AbstractC7458nq
        /* renamed from: a */
        public String mo14413a(Field field) {
            return EnumC7451no.m14417b(field.getName(), Constants.ACCEPT_TIME_SEPARATOR_SERVER).toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: a */
    private static String m14421a(char c, String str, int i) {
        if (i < str.length()) {
            String valueOf = String.valueOf(str.substring(i));
            return new StringBuilder(String.valueOf(valueOf).length() + 1).append(c).append(valueOf).toString();
        }
        return String.valueOf(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static String m14418b(String str) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        while (i < str.length() - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        return i == str.length() ? sb.toString() : !Character.isUpperCase(charAt) ? sb.append(m14421a(Character.toUpperCase(charAt), str, i + 1)).toString() : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static String m14417b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
