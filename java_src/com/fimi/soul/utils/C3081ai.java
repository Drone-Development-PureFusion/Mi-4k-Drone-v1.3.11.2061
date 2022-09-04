package com.fimi.soul.utils;

import android.content.Intent;
/* renamed from: com.fimi.soul.utils.ai */
/* loaded from: classes.dex */
public class C3081ai {
    /* renamed from: a */
    public static Intent m29332a() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        return intent;
    }

    /* renamed from: a */
    public static Intent m29331a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType(str);
        intent.addCategory("android.intent.category.OPENABLE");
        return intent;
    }
}
