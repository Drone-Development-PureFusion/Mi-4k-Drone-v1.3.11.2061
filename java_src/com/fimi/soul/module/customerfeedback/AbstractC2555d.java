package com.fimi.soul.module.customerfeedback;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;
/* renamed from: com.fimi.soul.module.customerfeedback.d */
/* loaded from: classes.dex */
public abstract class AbstractC2555d<T> extends BaseAdapter {

    /* renamed from: a */
    protected List<T> f8360a;

    /* renamed from: b */
    protected Context f8361b;

    /* renamed from: a */
    abstract View mo31241a(int i, View view, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f8360a == null) {
            return 0;
        }
        return this.f8360a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f8360a == null) {
            return null;
        }
        return this.f8360a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return mo31241a(i, view, viewGroup);
    }
}
