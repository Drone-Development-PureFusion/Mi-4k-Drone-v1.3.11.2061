package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.C4679b;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.games.appcontent.h */
/* loaded from: classes2.dex */
public final class C5345h {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.games.appcontent.h$a */
    /* loaded from: classes2.dex */
    public interface AbstractC5350a {
        /* renamed from: a */
        void mo20515a(ArrayList<DataHolder> arrayList, int i);
    }

    /* renamed from: a */
    public static ArrayList<AppContentAction> m20519a(DataHolder dataHolder, ArrayList<DataHolder> arrayList, String str, int i) {
        final ArrayList<AppContentAction> arrayList2 = new ArrayList<>();
        m20520a(dataHolder, 1, str, "action_id", i, new AbstractC5350a() { // from class: com.google.android.gms.games.appcontent.h.1
            @Override // com.google.android.gms.games.appcontent.C5345h.AbstractC5350a
            /* renamed from: a */
            public void mo20515a(ArrayList<DataHolder> arrayList3, int i2) {
                arrayList2.add(new AppContentActionRef(arrayList3, i2));
            }
        }, arrayList);
        return arrayList2;
    }

    /* renamed from: a */
    private static void m20520a(DataHolder dataHolder, int i, String str, String str2, int i2, AbstractC5350a abstractC5350a, ArrayList<DataHolder> arrayList) {
        DataHolder dataHolder2 = arrayList.get(i);
        String m23886c = dataHolder.m23886c(str, i2, dataHolder.m23898a(i2));
        if (!TextUtils.isEmpty(m23886c)) {
            int m23879g = dataHolder2.m23879g();
            String[] split = m23886c.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            for (int i3 = 0; i3 < m23879g; i3++) {
                String m23886c2 = dataHolder2.m23886c(str2, i3, dataHolder2.m23898a(i3));
                if (!TextUtils.isEmpty(m23886c2) && C4679b.m23161b(split, m23886c2)) {
                    abstractC5350a.mo20515a(arrayList, i3);
                }
            }
        }
    }

    /* renamed from: b */
    public static ArrayList<AppContentAnnotation> m20518b(DataHolder dataHolder, ArrayList<DataHolder> arrayList, String str, int i) {
        final ArrayList<AppContentAnnotation> arrayList2 = new ArrayList<>();
        m20520a(dataHolder, 2, str, "annotation_id", i, new AbstractC5350a() { // from class: com.google.android.gms.games.appcontent.h.2
            @Override // com.google.android.gms.games.appcontent.C5345h.AbstractC5350a
            /* renamed from: a */
            public void mo20515a(ArrayList<DataHolder> arrayList3, int i2) {
                arrayList2.add(new AppContentAnnotationRef(arrayList3, i2));
            }
        }, arrayList);
        return arrayList2;
    }

    /* renamed from: c */
    public static ArrayList<AppContentCondition> m20517c(DataHolder dataHolder, ArrayList<DataHolder> arrayList, String str, int i) {
        final ArrayList<AppContentCondition> arrayList2 = new ArrayList<>();
        m20520a(dataHolder, 4, str, "condition_id", i, new AbstractC5350a() { // from class: com.google.android.gms.games.appcontent.h.3
            @Override // com.google.android.gms.games.appcontent.C5345h.AbstractC5350a
            /* renamed from: a */
            public void mo20515a(ArrayList<DataHolder> arrayList3, int i2) {
                arrayList2.add(new AppContentConditionRef(arrayList3, i2));
            }
        }, arrayList);
        return arrayList2;
    }

    /* renamed from: d */
    public static Bundle m20516d(DataHolder dataHolder, ArrayList<DataHolder> arrayList, String str, int i) {
        final Bundle bundle = new Bundle();
        final DataHolder dataHolder2 = arrayList.get(3);
        m20520a(dataHolder, 3, str, "tuple_id", i, new AbstractC5350a() { // from class: com.google.android.gms.games.appcontent.h.4
            @Override // com.google.android.gms.games.appcontent.C5345h.AbstractC5350a
            /* renamed from: a */
            public void mo20515a(ArrayList<DataHolder> arrayList2, int i2) {
                AppContentTupleRef appContentTupleRef = new AppContentTupleRef(DataHolder.this, i2);
                bundle.putString(appContentTupleRef.mo20543c(), appContentTupleRef.mo20542d());
            }
        }, arrayList);
        return bundle;
    }
}
