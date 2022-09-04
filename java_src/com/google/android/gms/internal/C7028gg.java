package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.auth.api.model.StringList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.gg */
/* loaded from: classes2.dex */
public class C7028gg extends AbstractC7488oj<StringList> {

    /* renamed from: a */
    private C7459nr f23719a;

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a */
    public StringList mo14172b(C7598pp c7598pp) {
        if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
            c7598pp.mo14142j();
            return null;
        }
        StringList stringList = new StringList();
        AbstractC7488oj m14399a = this.f23719a.m14399a(String.class);
        c7598pp.mo14165a();
        while (c7598pp.mo14147e()) {
            stringList.m7317a().add((String) m14399a.mo14172b(c7598pp));
        }
        c7598pp.mo14158b();
        return stringList;
    }

    /* renamed from: a */
    public void m15752a(@NonNull C7459nr c7459nr) {
        this.f23719a = (C7459nr) C4588d.m23627a(c7459nr);
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo14173a(C7602ps c7602ps, StringList stringList) {
        if (stringList == null) {
            c7602ps.mo14095f();
            return;
        }
        AbstractC7488oj m14399a = this.f23719a.m14399a(String.class);
        c7602ps.mo14107b();
        List<String> m7317a = stringList.m7317a();
        int size = m7317a != null ? m7317a.size() : 0;
        for (int i = 0; i < size; i++) {
            m14399a.mo14173a(c7602ps, m7317a.get(i));
        }
        c7602ps.mo14103c();
    }
}
