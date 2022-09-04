package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.AbstractC4534m;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.appcontent.e */
/* loaded from: classes2.dex */
public final class C5342e extends AbstractC4534m<AppContentSection> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: b */
    public AppContentSection mo7644a(int i, int i2) {
        return new AppContentSectionRef(null, i, i2);
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b, com.google.android.gms.common.api.AbstractC4500k
    /* renamed from: b */
    public void mo7804b() {
        ArrayList arrayList = null;
        super.b();
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            DataHolder dataHolder = (DataHolder) arrayList.get(i);
            if (dataHolder != null) {
                dataHolder.close();
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: h */
    protected String mo7642h() {
        return "section_id";
    }

    @Override // com.google.android.gms.common.data.AbstractC4534m
    /* renamed from: i */
    protected String mo20527i() {
        return "card_id";
    }
}
