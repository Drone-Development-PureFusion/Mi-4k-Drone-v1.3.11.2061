package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.AbstractC4988l;
import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* renamed from: com.google.android.gms.drive.internal.bo */
/* loaded from: classes2.dex */
public final class C4891bo extends AbstractC4988l {

    /* renamed from: c */
    private final MetadataBundle f17856c;

    public C4891bo(MetadataBundle metadataBundle) {
        this.f17856c = metadataBundle;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: H */
    public AbstractC4988l mo7785a() {
        return new C4891bo(this.f17856c.m22152b());
    }

    @Override // com.google.android.gms.drive.AbstractC4988l
    /* renamed from: a */
    public <T> T mo22176a(AbstractC4991a<T> abstractC4991a) {
        return (T) this.f17856c.m22154a(abstractC4991a);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return this.f17856c != null;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f17856c);
        return new StringBuilder(String.valueOf(valueOf).length() + 17).append("Metadata [mImpl=").append(valueOf).append("]").toString();
    }
}
