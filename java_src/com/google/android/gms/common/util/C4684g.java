package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.text.TextUtils;
/* renamed from: com.google.android.gms.common.util.g */
/* loaded from: classes2.dex */
public final class C4684g {
    /* renamed from: a */
    public static void m23139a(String str, CharArrayBuffer charArrayBuffer) {
        if (TextUtils.isEmpty(str)) {
            charArrayBuffer.sizeCopied = 0;
        } else if (charArrayBuffer.data == null || charArrayBuffer.data.length < str.length()) {
            charArrayBuffer.data = str.toCharArray();
        } else {
            str.getChars(0, str.length(), charArrayBuffer.data, 0);
        }
        charArrayBuffer.sizeCopied = str.length();
    }
}
