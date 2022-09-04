package com.google.android.gms.plus.p249a.p250a;

import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.C4532k;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.internal.model.people.C8986k;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
/* renamed from: com.google.android.gms.plus.a.a.b */
/* loaded from: classes2.dex */
public final class C8939b extends AbstractC4521a<AbstractC8923a> {

    /* renamed from: b */
    private final C4532k<PersonEntity> f28460b;

    public C8939b(DataHolder dataHolder) {
        super(dataHolder);
        if (dataHolder.m23881f() == null || !dataHolder.m23881f().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false)) {
            this.f28460b = null;
        } else {
            this.f28460b = new C4532k<>(dataHolder, PersonEntity.CREATOR);
        }
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public AbstractC8923a mo9715a(int i) {
        return this.f28460b != null ? (AbstractC8923a) ((SafeParcelable) this.f28460b.mo9715a(i)) : new C8986k(this.f16904a, i);
    }
}
