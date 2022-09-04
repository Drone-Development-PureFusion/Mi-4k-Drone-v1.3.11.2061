package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.drive.metadata.AbstractC4997g;
import com.google.android.gms.drive.query.internal.AbstractC5041f;
import com.google.android.gms.drive.query.internal.Operator;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.android.gms.drive.query.f */
/* loaded from: classes2.dex */
public class C5035f implements AbstractC5041f<String> {
    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: a */
    public /* synthetic */ String mo21987a(AbstractC4991a abstractC4991a, Object obj) {
        return m22016b((AbstractC4991a<AbstractC4991a>) abstractC4991a, (AbstractC4991a) obj);
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: a */
    public /* synthetic */ String mo21986a(AbstractC4997g abstractC4997g, Object obj) {
        return m22015b((AbstractC4997g<AbstractC4997g>) abstractC4997g, (AbstractC4997g) obj);
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: b */
    public String mo21988a(AbstractC4991a<?> abstractC4991a) {
        return String.format("fieldOnly(%s)", abstractC4991a.mo22171a());
    }

    /* renamed from: b */
    public <T> String m22016b(AbstractC4991a<T> abstractC4991a, T t) {
        return String.format("has(%s,%s)", abstractC4991a.mo22171a(), t);
    }

    /* renamed from: b */
    public <T> String m22015b(AbstractC4997g<T> abstractC4997g, T t) {
        return String.format("contains(%s,%s)", abstractC4997g.a(), t);
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: b */
    public <T> String mo21984a(Operator operator, AbstractC4991a<T> abstractC4991a, T t) {
        return String.format("cmp(%s,%s,%s)", operator.m22004a(), abstractC4991a.mo22171a(), t);
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: b */
    public String mo21983a(Operator operator, List<String> list) {
        StringBuilder sb = new StringBuilder(String.valueOf(operator.m22004a()).concat("("));
        String str = "";
        Iterator<String> it2 = list.iterator();
        while (true) {
            String str2 = str;
            if (it2.hasNext()) {
                sb.append(str2);
                sb.append(it2.next());
                str = Constants.ACCEPT_TIME_SEPARATOR_SP;
            } else {
                return sb.append(")").toString();
            }
        }
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: b */
    public String mo21981a(String str) {
        return String.format("not(%s)", str);
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: c */
    public String mo21989a() {
        return "all()";
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: c */
    public String mo21980a(String str) {
        return String.format("fullTextSearch(%s)", str);
    }

    @Override // com.google.android.gms.drive.query.internal.AbstractC5041f
    /* renamed from: d */
    public String mo21979b() {
        return "ownedByMe()";
    }
}
