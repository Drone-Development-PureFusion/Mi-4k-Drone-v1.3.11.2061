package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetAccountInfoUserList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.fx */
/* loaded from: classes2.dex */
public class C7009fx extends AbstractC7488oj<GetAccountInfoUserList> {

    /* renamed from: a */
    private C7459nr f23695a;

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a */
    public GetAccountInfoUserList mo14172b(C7598pp c7598pp) {
        if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
            c7598pp.mo14142j();
            return null;
        }
        GetAccountInfoUserList getAccountInfoUserList = new GetAccountInfoUserList();
        AbstractC7488oj m14399a = this.f23695a.m14399a(GetAccountInfoUser.class);
        c7598pp.mo14165a();
        while (c7598pp.mo14147e()) {
            getAccountInfoUserList.m7333a().add((GetAccountInfoUser) m14399a.mo14172b(c7598pp));
        }
        c7598pp.mo14158b();
        return getAccountInfoUserList;
    }

    /* renamed from: a */
    public void m15803a(@NonNull C7459nr c7459nr) {
        this.f23695a = (C7459nr) C4588d.m23627a(c7459nr);
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo14173a(C7602ps c7602ps, GetAccountInfoUserList getAccountInfoUserList) {
        if (getAccountInfoUserList == null) {
            c7602ps.mo14095f();
            return;
        }
        AbstractC7488oj m14399a = this.f23695a.m14399a(GetAccountInfoUser.class);
        c7602ps.mo14107b();
        List<GetAccountInfoUser> m7333a = getAccountInfoUserList.m7333a();
        int size = m7333a != null ? m7333a.size() : 0;
        for (int i = 0; i < size; i++) {
            m14399a.mo14173a(c7602ps, m7333a.get(i));
        }
        c7602ps.mo14103c();
    }
}
