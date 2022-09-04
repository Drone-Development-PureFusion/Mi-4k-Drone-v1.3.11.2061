package com.google.android.gms.drive;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.internal.C4891bo;
import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.drive.metadata.internal.C5006e;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.ajw;
/* renamed from: com.google.android.gms.drive.m */
/* loaded from: classes.dex */
public final class C4989m extends AbstractC4521a<AbstractC4988l> {

    /* renamed from: b */
    private C4990a f17974b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.m$a */
    /* loaded from: classes2.dex */
    public static class C4990a extends AbstractC4988l {

        /* renamed from: c */
        private final DataHolder f17975c;

        /* renamed from: d */
        private final int f17976d;

        /* renamed from: e */
        private final int f17977e;

        public C4990a(DataHolder dataHolder, int i) {
            this.f17975c = dataHolder;
            this.f17976d = i;
            this.f17977e = dataHolder.m23898a(i);
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: H */
        public AbstractC4988l mo7785a() {
            MetadataBundle m22156a = MetadataBundle.m22156a();
            for (AbstractC4991a<?> abstractC4991a : C5006e.m22134a()) {
                if (abstractC4991a != ajw.f22061F) {
                    abstractC4991a.mo22168a(this.f17975c, m22156a, this.f17976d, this.f17977e);
                }
            }
            return new C4891bo(m22156a);
        }

        @Override // com.google.android.gms.drive.AbstractC4988l
        /* renamed from: a */
        public <T> T mo22176a(AbstractC4991a<T> abstractC4991a) {
            return abstractC4991a.mo22169a(this.f17975c, this.f17976d, this.f17977e);
        }

        @Override // com.google.android.gms.common.data.AbstractC4527f
        /* renamed from: b */
        public boolean mo7790b() {
            return !this.f17975c.m23877h();
        }
    }

    public C4989m(DataHolder dataHolder) {
        super(dataHolder);
        dataHolder.m23881f().setClassLoader(C4989m.class.getClassLoader());
    }

    @Deprecated
    /* renamed from: a */
    public String m22180a() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public AbstractC4988l mo9715a(int i) {
        C4990a c4990a = this.f17974b;
        if (c4990a == null || c4990a.f17976d != i) {
            C4990a c4990a2 = new C4990a(this.f16904a, i);
            this.f17974b = c4990a2;
            return c4990a2;
        }
        return c4990a;
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b, com.google.android.gms.common.api.AbstractC4500k
    /* renamed from: b */
    public void mo7804b() {
        if (this.f16904a != null) {
            C5006e.m22133a(this.f16904a);
        }
        super.mo7804b();
    }
}
