package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
/* loaded from: classes2.dex */
public interface aik {
    /* renamed from: a */
    Activity mo12687a();

    /* renamed from: a */
    <T extends aij> T mo12683a(String str, Class<T> cls);

    /* renamed from: a */
    void mo12684a(String str, @NonNull aij aijVar);

    void startActivityForResult(Intent intent, int i);
}
