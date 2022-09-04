package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.AbstractC4503n;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.internal.su */
/* loaded from: classes2.dex */
public abstract class AbstractC7710su<T1 extends AbstractC4502m, T2 extends AbstractC4502m> extends AbstractC4494i<T1> {

    /* renamed from: a */
    private AbstractC4494i<T2> f25554a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7710su(AbstractC4494i<T2> abstractC4494i) {
        this.f25554a = null;
        this.f25554a = abstractC4494i;
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    @NonNull
    /* renamed from: a */
    public T1 mo13675a(long j, @NonNull TimeUnit timeUnit) {
        return mo13674a((AbstractC7710su<T1, T2>) this.f25554a.mo13675a(j, timeUnit));
    }

    /* renamed from: a */
    protected abstract T1 mo13674a(T2 t2);

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public void mo13676a() {
        this.f25554a.mo13676a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public void mo13673a(@NonNull final AbstractC4503n<? super T1> abstractC4503n) {
        this.f25554a.mo13673a((AbstractC4503n<? super T2>) new AbstractC4503n<T2>() { // from class: com.google.android.gms.internal.su.1
            @Override // com.google.android.gms.common.api.AbstractC4503n
            /* renamed from: a */
            public void mo7161a(@NonNull T2 t2) {
                abstractC4503n.mo7161a(AbstractC7710su.this.mo13674a((AbstractC7710su) t2));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: a */
    public void mo13672a(@NonNull final AbstractC4503n<? super T1> abstractC4503n, long j, @NonNull TimeUnit timeUnit) {
        this.f25554a.mo13672a(new AbstractC4503n<T2>() { // from class: com.google.android.gms.internal.su.2
            @Override // com.google.android.gms.common.api.AbstractC4503n
            /* renamed from: a */
            public void mo7161a(@NonNull T2 t2) {
                abstractC4503n.mo7161a(AbstractC7710su.this.mo13674a((AbstractC7710su) t2));
            }
        }, j, timeUnit);
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    @NonNull
    /* renamed from: d */
    public T1 mo13671d() {
        return mo13674a((AbstractC7710su<T1, T2>) this.f25554a.mo13671d());
    }

    @Override // com.google.android.gms.common.api.AbstractC4494i
    /* renamed from: e */
    public boolean mo13670e() {
        return this.f25554a.mo13670e();
    }
}
