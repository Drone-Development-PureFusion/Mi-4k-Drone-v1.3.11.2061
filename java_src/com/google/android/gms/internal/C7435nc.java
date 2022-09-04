package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import java.net.URLEncoder;
/* renamed from: com.google.android.gms.internal.nc */
/* loaded from: classes2.dex */
public class C7435nc {
    @NonNull
    /* renamed from: a */
    public static String m14490a(@Nullable String str) {
        return TextUtils.isEmpty(str) ? "" : m14489b(URLEncoder.encode(str, "UTF8"));
    }

    @NonNull
    /* renamed from: b */
    public static String m14489b(@NonNull String str) {
        C4588d.m23627a(str);
        return str.replace("%2F", "/");
    }

    @NonNull
    /* renamed from: c */
    public static String m14488c(@NonNull String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("/")) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb.length() > 0) {
                    sb.append("/").append(str2);
                } else {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }
}
