package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.AbstractC4836f;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.AbstractC5013k;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class ajz extends AbstractC5013k<DriveId> {

    /* renamed from: a */
    public static final ajz f22106a = new ajz();

    private ajz() {
        super("driveId", Arrays.asList("sqlId", "resourceId", "mimeType"), Arrays.asList("dbInstanceId"), 4100000);
    }

    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: b */
    protected boolean mo17071b(DataHolder dataHolder, int i, int i2) {
        for (String str : b()) {
            if (!dataHolder.m23895a(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: d */
    public DriveId mo17070c(DataHolder dataHolder, int i, int i2) {
        long j = dataHolder.m23881f().getLong("dbInstanceId");
        int i3 = AbstractC4836f.f17636b_.equals(dataHolder.m23886c(ajw.f22096x.a(), i, i2)) ? 1 : 0;
        String m23886c = dataHolder.m23886c("resourceId", i, i2);
        Long valueOf = Long.valueOf(dataHolder.m23893a("sqlId", i, i2));
        if ("generated-android-null".equals(m23886c)) {
            m23886c = null;
        }
        return new DriveId(m23886c, valueOf.longValue(), j, i3);
    }
}
