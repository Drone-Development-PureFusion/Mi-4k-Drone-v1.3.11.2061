package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.AbstractC4997g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
/* renamed from: com.google.android.gms.drive.metadata.internal.o */
/* loaded from: classes2.dex */
public class C5018o extends AbstractC4997g<String> {
    public C5018o(String str, int i) {
        super(str, Collections.singleton(str), Collections.emptySet(), i);
    }

    /* renamed from: a */
    public static Collection<String> m22102a(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: a */
    public void mo22100a(Bundle bundle, Collection<String> collection) {
        bundle.putStringArrayList(a(), new ArrayList<>(collection));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: b */
    public Collection<String> mo22097c(Bundle bundle) {
        return bundle.getStringArrayList(a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4997g, com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: e_ */
    public Collection<String> mo17070c(DataHolder dataHolder, int i, int i2) {
        try {
            return m22102a(dataHolder.m23886c(a(), i, i2));
        } catch (JSONException e) {
            throw new IllegalStateException("DataHolder supplied invalid JSON", e);
        }
    }
}
