package com.fimi.soul.biz.update;

import com.fimi.soul.entity.UpdateVersonBean;
import java.util.Comparator;
/* renamed from: com.fimi.soul.biz.update.m */
/* loaded from: classes.dex */
public class C2082m implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((UpdateVersonBean) obj).getSort() > ((UpdateVersonBean) obj2).getSort() ? 1 : -1;
    }
}
