package com.fimi.soul.module.customerfeedback;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import java.util.List;
/* renamed from: com.fimi.soul.module.customerfeedback.b */
/* loaded from: classes.dex */
public class C2551b<T> extends AbstractC2555d<T> {

    /* renamed from: com.fimi.soul.module.customerfeedback.b$a */
    /* loaded from: classes.dex */
    class C2552a {

        /* renamed from: a */
        TextView f8351a;

        C2552a() {
        }
    }

    public C2551b(List<T> list, Context context) {
        this.f8360a = list;
        this.f8361b = context;
    }

    @Override // com.fimi.soul.module.customerfeedback.AbstractC2555d
    /* renamed from: a */
    View mo31241a(int i, View view, ViewGroup viewGroup) {
        C2552a c2552a;
        if (view == null) {
            view = LayoutInflater.from(this.f8361b).inflate(C1704R.layout.navigation_item_adapter, (ViewGroup) null);
            c2552a = new C2552a();
            c2552a.f8351a = (TextView) view.findViewById(C1704R.C1706id.head_name);
            view.setTag(c2552a);
        } else {
            c2552a = (C2552a) view.getTag();
        }
        T t = this.f8360a.get(i);
        if (t instanceof String) {
            c2552a.f8351a.setText((String) t);
        }
        return view;
    }

    /* renamed from: a */
    public void m31244a(List<T> list) {
        this.f8360a = list;
    }
}
