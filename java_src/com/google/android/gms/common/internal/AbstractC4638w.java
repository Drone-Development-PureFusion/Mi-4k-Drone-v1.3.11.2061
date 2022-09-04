package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.C4515b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC4600p;
import com.google.android.gms.common.internal.C4641x;
import java.util.Set;
/* renamed from: com.google.android.gms.common.internal.w */
/* loaded from: classes.dex */
public abstract class AbstractC4638w<T extends IInterface> extends AbstractC4600p<T> implements C4467a.AbstractC4477f, C4641x.AbstractC4642a {

    /* renamed from: a */
    private final C4626s f17132a;

    /* renamed from: e */
    private final Set<Scope> f17133e;

    /* renamed from: f */
    private final Account f17134f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4638w(Context context, Looper looper, int i, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        this(context, looper, AbstractC4643y.m23408a(context), C4515b.m23920a(), i, c4626s, (AbstractC4489g.AbstractC4491b) C4588d.m23627a(abstractC4491b), (AbstractC4489g.AbstractC4492c) C4588d.m23627a(abstractC4492c));
    }

    protected AbstractC4638w(Context context, Looper looper, AbstractC4643y abstractC4643y, C4515b c4515b, int i, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, abstractC4643y, c4515b, i, m23422a(abstractC4491b), m23421a(abstractC4492c), c4626s.m23526i());
        this.f17132a = c4626s;
        this.f17134f = c4626s.m23533b();
        this.f17133e = m23420b(c4626s.m23529f());
    }

    @Nullable
    /* renamed from: a */
    private static AbstractC4600p.AbstractC4602b m23422a(final AbstractC4489g.AbstractC4491b abstractC4491b) {
        if (abstractC4491b == null) {
            return null;
        }
        return new AbstractC4600p.AbstractC4602b() { // from class: com.google.android.gms.common.internal.w.1
            @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4602b
            /* renamed from: a */
            public void mo10593a(int i) {
                AbstractC4489g.AbstractC4491b.this.mo17285a(i);
            }

            @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4602b
            /* renamed from: a */
            public void mo10591a(@Nullable Bundle bundle) {
                AbstractC4489g.AbstractC4491b.this.mo17281a(bundle);
            }
        };
    }

    @Nullable
    /* renamed from: a */
    private static AbstractC4600p.AbstractC4603c m23421a(final AbstractC4489g.AbstractC4492c abstractC4492c) {
        if (abstractC4492c == null) {
            return null;
        }
        return new AbstractC4600p.AbstractC4603c() { // from class: com.google.android.gms.common.internal.w.2
            @Override // com.google.android.gms.common.internal.AbstractC4600p.AbstractC4603c
            /* renamed from: a */
            public void mo10590a(@NonNull ConnectionResult connectionResult) {
                AbstractC4489g.AbstractC4492c.this.mo17280a(connectionResult);
            }
        };
    }

    /* renamed from: b */
    private Set<Scope> m23420b(@NonNull Set<Scope> set) {
        Set<Scope> mo17015a = mo17015a(set);
        for (Scope scope : mo17015a) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return mo17015a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: D */
    public final Account mo23425D() {
        return this.f17134f;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: I */
    protected final Set<Scope> mo23424I() {
        return this.f17133e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public final C4626s m23423J() {
        return this.f17132a;
    }

    @NonNull
    /* renamed from: a */
    protected Set<Scope> mo17015a(@NonNull Set<Scope> set) {
        return set;
    }
}
