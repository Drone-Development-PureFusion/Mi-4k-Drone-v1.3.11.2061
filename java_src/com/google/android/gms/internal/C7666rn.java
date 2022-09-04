package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.AbstractC6830df;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: com.google.android.gms.internal.rn */
/* loaded from: classes2.dex */
public class C7666rn extends AbstractC7665rm {

    /* renamed from: s */
    private static final String f25455s = C7666rn.class.getSimpleName();

    protected C7666rn(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: a */
    public static C7666rn m13795a(String str, Context context, boolean z) {
        a(context, z);
        return new C7666rn(context, str, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7665rm
    /* renamed from: b */
    public List<Callable<Void>> mo13794b(C7677rw c7677rw, AbstractC6830df.C6831a c6831a) {
        if (c7677rw.m13717c() == null || !this.f25451l) {
            return super.mo13794b(c7677rw, c6831a);
        }
        int m13703q = c7677rw.m13703q();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo13794b(c7677rw, c6831a));
        arrayList.add(new C7689sf(c7677rw, C7671rr.m13750n(), C7671rr.m13749o(), c6831a, m13703q, 24));
        return arrayList;
    }
}
