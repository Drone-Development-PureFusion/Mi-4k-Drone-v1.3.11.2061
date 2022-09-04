package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.drive.metadata.AbstractC4997g;
import com.google.android.gms.drive.query.Filter;
import java.util.List;
/* renamed from: com.google.android.gms.drive.query.internal.g */
/* loaded from: classes2.dex */
public class C5042g implements AbstractC5041f<Boolean> {

    /* renamed from: a */
    private Boolean f18108a = false;

    private C5042g() {
    }

    /* renamed from: a */
    public static boolean m21985a(Filter filter) {
        if (filter == null) {
            return false;
        }
        return ((Boolean) filter.mo22003a(new C5042g())).booleanValue();
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public Boolean mo21981a(Boolean bool) {
        return this.f18108a;
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: a */
    public /* synthetic */ Boolean mo21987a(AbstractC4991a abstractC4991a, Object obj) {
        return m21977b((AbstractC4991a<AbstractC4991a>) abstractC4991a, (AbstractC4991a) obj);
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: a */
    public /* synthetic */ Boolean mo21986a(AbstractC4997g abstractC4997g, Object obj) {
        return m21976b((AbstractC4997g<AbstractC4997g>) abstractC4997g, (AbstractC4997g) obj);
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: b */
    public Boolean mo21988a(AbstractC4991a<?> abstractC4991a) {
        return this.f18108a;
    }

    /* renamed from: b */
    public <T> Boolean m21977b(AbstractC4991a<T> abstractC4991a, T t) {
        return this.f18108a;
    }

    /* renamed from: b */
    public <T> Boolean m21976b(AbstractC4997g<T> abstractC4997g, T t) {
        return this.f18108a;
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: b */
    public <T> Boolean mo21984a(Operator operator, AbstractC4991a<T> abstractC4991a, T t) {
        return this.f18108a;
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: b */
    public Boolean mo21983a(Operator operator, List<Boolean> list) {
        return this.f18108a;
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: b */
    public Boolean mo21980a(String str) {
        if (!str.isEmpty()) {
            this.f18108a = true;
        }
        return this.f18108a;
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: c */
    public Boolean mo21989a() {
        return this.f18108a;
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: d */
    public Boolean mo21979b() {
        return this.f18108a;
    }
}
