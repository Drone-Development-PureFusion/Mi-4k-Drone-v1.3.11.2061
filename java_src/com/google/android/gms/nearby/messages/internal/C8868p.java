package com.google.android.gms.nearby.messages.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.nearby.messages.internal.p */
/* loaded from: classes2.dex */
public class C8868p {
    /* renamed from: a */
    public static <T extends Parcelable> List<T> m9850a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        return bundleExtra == null ? Collections.emptyList() : bundleExtra.getParcelableArrayList(str);
    }
}
