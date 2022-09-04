package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.AbstractC4992b;
import com.google.android.gms.drive.metadata.internal.C5006e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
/* renamed from: com.google.android.gms.drive.metadata.internal.m */
/* loaded from: classes2.dex */
public class C5015m extends C5012j<DriveId> implements AbstractC4992b<DriveId> {

    /* renamed from: a */
    public static final C5006e.AbstractC5007a f18006a = new C5006e.AbstractC5007a() { // from class: com.google.android.gms.drive.metadata.internal.m.1
        @Override // com.google.android.gms.drive.metadata.internal.C5006e.AbstractC5007a
        /* renamed from: a */
        public String mo17073a() {
            return "parentsExtraHolder";
        }

        @Override // com.google.android.gms.drive.metadata.internal.C5006e.AbstractC5007a
        /* renamed from: a */
        public void mo17072a(DataHolder dataHolder) {
            C5015m.m22107c(dataHolder);
        }
    };

    public C5015m(int i) {
        super("parents", Collections.emptySet(), Arrays.asList("parentsExtra", "dbInstanceId", "parentsExtraHolder"), i);
    }

    /* renamed from: b */
    private void m22108b(DataHolder dataHolder) {
        synchronized (dataHolder) {
            DataHolder dataHolder2 = (DataHolder) dataHolder.m23881f().getParcelable("parentsExtraHolder");
            if (dataHolder2 == null) {
                return;
            }
            int m23879g = dataHolder.m23879g();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(m23879g);
            HashMap hashMap = new HashMap(m23879g);
            for (int i = 0; i < m23879g; i++) {
                int m23898a = dataHolder.m23898a(i);
                ParentDriveIdSet parentDriveIdSet = new ParentDriveIdSet();
                arrayList.add(parentDriveIdSet);
                hashMap.put(Long.valueOf(dataHolder.m23893a("sqlId", i, m23898a)), parentDriveIdSet);
            }
            Bundle m23881f = dataHolder2.m23881f();
            String string = m23881f.getString("childSqlIdColumn");
            String string2 = m23881f.getString("parentSqlIdColumn");
            String string3 = m23881f.getString("parentResIdColumn");
            int m23879g2 = dataHolder2.m23879g();
            for (int i2 = 0; i2 < m23879g2; i2++) {
                int m23898a2 = dataHolder2.m23898a(i2);
                ((ParentDriveIdSet) hashMap.get(Long.valueOf(dataHolder2.m23893a(string, i2, m23898a2)))).m22147a(new PartialDriveId(dataHolder2.m23886c(string3, i2, m23898a2), dataHolder2.m23893a(string2, i2, m23898a2), 1));
            }
            dataHolder.m23881f().putParcelableArrayList("parentsExtra", arrayList);
            dataHolder2.close();
            dataHolder.m23881f().remove("parentsExtraHolder");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m22107c(DataHolder dataHolder) {
        Bundle m23881f = dataHolder.m23881f();
        if (m23881f == null) {
            return;
        }
        synchronized (dataHolder) {
            DataHolder dataHolder2 = (DataHolder) m23881f.getParcelable("parentsExtraHolder");
            if (dataHolder2 != null) {
                dataHolder2.close();
                m23881f.remove("parentsExtraHolder");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.internal.C5012j, com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: b */
    public Collection<DriveId> mo22097c(Bundle bundle) {
        Collection mo22097c = super.mo22097c(bundle);
        if (mo22097c == null) {
            return null;
        }
        return new HashSet(mo22097c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4997g, com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: e_ */
    public Collection<DriveId> mo17070c(DataHolder dataHolder, int i, int i2) {
        Bundle m23881f = dataHolder.m23881f();
        ArrayList parcelableArrayList = m23881f.getParcelableArrayList("parentsExtra");
        if (parcelableArrayList == null) {
            if (m23881f.getParcelable("parentsExtraHolder") != null) {
                m22108b(dataHolder);
                parcelableArrayList = m23881f.getParcelableArrayList("parentsExtra");
            }
            if (parcelableArrayList == null) {
                return null;
            }
        }
        return ((ParentDriveIdSet) parcelableArrayList.get(i)).m22148a(m23881f.getLong("dbInstanceId"));
    }
}
