package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.util.LongSparseArray;
import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AbstractC5013k;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.C5006e;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class ajx extends AbstractC5013k<AppVisibleCustomProperties> {

    /* renamed from: a */
    public static final C5006e.AbstractC5007a f22099a = new C5006e.AbstractC5007a() { // from class: com.google.android.gms.internal.ajx.1
        @Override // com.google.android.gms.drive.metadata.internal.C5006e.AbstractC5007a
        /* renamed from: a */
        public String mo17073a() {
            return "customPropertiesExtraHolder";
        }

        @Override // com.google.android.gms.drive.metadata.internal.C5006e.AbstractC5007a
        /* renamed from: a */
        public void mo17072a(DataHolder dataHolder) {
            ajx.m17075d(dataHolder);
        }
    };

    public ajx(int i) {
        super("customProperties", Arrays.asList("hasCustomProperties", "sqlId"), Arrays.asList("customPropertiesExtra", "customPropertiesExtraHolder"), i);
    }

    /* renamed from: b */
    private static LongSparseArray<AppVisibleCustomProperties.C5001a> m17077b(DataHolder dataHolder) {
        Bundle m23881f = dataHolder.m23881f();
        String string = m23881f.getString("entryIdColumn");
        String string2 = m23881f.getString("keyColumn");
        String string3 = m23881f.getString("visibilityColumn");
        String string4 = m23881f.getString("valueColumn");
        LongSparseArray<AppVisibleCustomProperties.C5001a> longSparseArray = new LongSparseArray<>();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < dataHolder.m23879g()) {
                int m23898a = dataHolder.m23898a(i2);
                long m23893a = dataHolder.m23893a(string, i2, m23898a);
                String m23886c = dataHolder.m23886c(string2, i2, m23898a);
                int m23888b = dataHolder.m23888b(string3, i2, m23898a);
                CustomProperty customProperty = new CustomProperty(new CustomPropertyKey(m23886c, m23888b), dataHolder.m23886c(string4, i2, m23898a));
                AppVisibleCustomProperties.C5001a c5001a = longSparseArray.get(m23893a);
                if (c5001a == null) {
                    c5001a = new AppVisibleCustomProperties.C5001a();
                    longSparseArray.put(m23893a, c5001a);
                }
                c5001a.m22159a(customProperty);
                i = i2 + 1;
            } else {
                return longSparseArray;
            }
        }
    }

    /* renamed from: c */
    private static void m17076c(DataHolder dataHolder) {
        synchronized (dataHolder) {
            DataHolder dataHolder2 = (DataHolder) dataHolder.m23881f().getParcelable("customPropertiesExtraHolder");
            if (dataHolder2 == null) {
                return;
            }
            LongSparseArray<AppVisibleCustomProperties.C5001a> m17077b = m17077b(dataHolder2);
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            for (int i = 0; i < dataHolder.m23879g(); i++) {
                AppVisibleCustomProperties.C5001a c5001a = m17077b.get(dataHolder.m23893a("sqlId", i, dataHolder.m23898a(i)));
                if (c5001a != null) {
                    sparseArray.append(i, c5001a.m22161a());
                }
            }
            dataHolder.m23881f().putSparseParcelableArray("customPropertiesExtra", sparseArray);
            dataHolder2.close();
            dataHolder.m23881f().remove("customPropertiesExtraHolder");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m17075d(DataHolder dataHolder) {
        Bundle m23881f = dataHolder.m23881f();
        if (m23881f == null) {
            return;
        }
        synchronized (dataHolder) {
            DataHolder dataHolder2 = (DataHolder) m23881f.getParcelable("customPropertiesExtraHolder");
            if (dataHolder2 != null) {
                dataHolder2.close();
                m23881f.remove("customPropertiesExtraHolder");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: d */
    public AppVisibleCustomProperties mo17070c(DataHolder dataHolder, int i, int i2) {
        Bundle m23881f = dataHolder.m23881f();
        SparseArray sparseParcelableArray = m23881f.getSparseParcelableArray("customPropertiesExtra");
        if (sparseParcelableArray == null) {
            if (m23881f.getParcelable("customPropertiesExtraHolder") != null) {
                m17076c(dataHolder);
                sparseParcelableArray = m23881f.getSparseParcelableArray("customPropertiesExtra");
            }
            if (sparseParcelableArray == null) {
                return AppVisibleCustomProperties.f17988a;
            }
        }
        return (AppVisibleCustomProperties) sparseParcelableArray.get(i, AppVisibleCustomProperties.f17988a);
    }
}
