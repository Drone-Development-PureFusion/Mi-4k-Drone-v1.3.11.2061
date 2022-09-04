package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.auth.api.model.ProviderUserInfo;
import com.google.firebase.auth.api.model.ProviderUserInfoList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.gf */
/* loaded from: classes2.dex */
public class C7027gf extends AbstractC7488oj<ProviderUserInfoList> {

    /* renamed from: a */
    private C7459nr f23718a;

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a */
    public ProviderUserInfoList mo14172b(C7598pp c7598pp) {
        if (c7598pp.mo14146f() == EnumC7600pq.NULL) {
            c7598pp.mo14142j();
            return null;
        }
        ProviderUserInfoList providerUserInfoList = new ProviderUserInfoList();
        AbstractC7488oj m14399a = this.f23718a.m14399a(ProviderUserInfo.class);
        c7598pp.mo14165a();
        while (c7598pp.mo14147e()) {
            providerUserInfoList.m7320a().add((ProviderUserInfo) m14399a.mo14172b(c7598pp));
        }
        c7598pp.mo14158b();
        return providerUserInfoList;
    }

    /* renamed from: a */
    public void m15755a(@NonNull C7459nr c7459nr) {
        this.f23718a = (C7459nr) C4588d.m23627a(c7459nr);
    }

    @Override // com.google.android.gms.internal.AbstractC7488oj
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo14173a(C7602ps c7602ps, ProviderUserInfoList providerUserInfoList) {
        if (providerUserInfoList == null) {
            c7602ps.mo14095f();
            return;
        }
        AbstractC7488oj m14399a = this.f23718a.m14399a(ProviderUserInfo.class);
        c7602ps.mo14107b();
        List<ProviderUserInfo> m7320a = providerUserInfoList.m7320a();
        int size = m7320a != null ? m7320a.size() : 0;
        for (int i = 0; i < size; i++) {
            m14399a.mo14173a(c7602ps, m7320a.get(i));
        }
        c7602ps.mo14103c();
    }
}
