package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC4500k;
import java.util.Iterator;
/* renamed from: com.google.android.gms.common.data.b */
/* loaded from: classes.dex */
public interface AbstractC4522b<T> extends AbstractC4500k, Iterable<T> {
    /* renamed from: a */
    T mo9715a(int i);

    @Override // com.google.android.gms.common.api.AbstractC4500k
    /* renamed from: b */
    void mo7804b();

    /* renamed from: c */
    int mo23826c();

    @Deprecated
    /* renamed from: d */
    void mo23869d();

    @Deprecated
    /* renamed from: e */
    boolean mo23868e();

    /* renamed from: f */
    Bundle mo23867f();

    /* renamed from: g */
    Iterator<T> mo23866g();

    Iterator<T> iterator();
}
