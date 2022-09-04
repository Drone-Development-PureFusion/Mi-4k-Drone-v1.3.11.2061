package com.fimi.soul.module.customerfeedback;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import java.util.List;
/* renamed from: com.fimi.soul.module.customerfeedback.e */
/* loaded from: classes.dex */
public class C2556e<T> extends AbstractC2555d<T> {

    /* renamed from: com.fimi.soul.module.customerfeedback.e$a */
    /* loaded from: classes.dex */
    class C2557a {

        /* renamed from: a */
        TextView f8362a;

        C2557a() {
        }
    }

    public C2556e(List<T> list, Context context) {
        this.f8360a = list;
        this.f8361b = context;
    }

    @Override // com.fimi.soul.module.customerfeedback.AbstractC2555d
    /* renamed from: a */
    View mo31241a(int i, View view, ViewGroup viewGroup) {
        C2557a c2557a;
        if (view == null) {
            view = LayoutInflater.from(this.f8361b).inflate(C1704R.layout.navigation_item_adapter, (ViewGroup) null);
            c2557a = new C2557a();
            c2557a.f8362a = (TextView) view.findViewById(C1704R.C1706id.head_name);
            view.setTag(c2557a);
        } else {
            c2557a = (C2557a) view.getTag();
        }
        T t = this.f8360a.get(i);
        if (t instanceof String) {
            c2557a.f8362a.setText((String) t);
        }
        return view;
    }
}
