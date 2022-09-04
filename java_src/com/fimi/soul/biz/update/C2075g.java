package com.fimi.soul.biz.update;

import com.fimi.soul.entity.FirmwareInfo;
import java.util.Comparator;
/* renamed from: com.fimi.soul.biz.update.g */
/* loaded from: classes.dex */
public class C2075g implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((FirmwareInfo) obj).getSort() > ((FirmwareInfo) obj2).getSort() ? 1 : -1;
    }
}
