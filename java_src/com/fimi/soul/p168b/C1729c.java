package com.fimi.soul.p168b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import java.util.HashMap;
import java.util.List;
/* renamed from: com.fimi.soul.b.c */
/* loaded from: classes.dex */
public class C1729c extends BaseExpandableListAdapter {

    /* renamed from: a */
    HashMap<String, List<String>> f4387a;

    /* renamed from: b */
    List<String> f4388b;

    /* renamed from: c */
    Context f4389c;

    /* renamed from: com.fimi.soul.b.c$a */
    /* loaded from: classes.dex */
    class C1730a {

        /* renamed from: a */
        public TextView f4390a;

        C1730a() {
        }
    }

    public C1729c(Context context, HashMap<String, List<String>> hashMap, List<String> list) {
        this.f4389c = context;
        this.f4387a = hashMap;
        this.f4388b = list;
    }

    /* renamed from: a */
    public void m34327a(HashMap<String, List<String>> hashMap, List<String> list) {
        this.f4387a = hashMap;
        this.f4388b = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int i, int i2) {
        if (this.f4387a == null) {
            return null;
        }
        return this.f4387a.get(this.f4388b.get(i)).get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        C1730a c1730a;
        if (view == null) {
            view = LayoutInflater.from(this.f4389c).inflate(C1704R.layout.errorcodebody, (ViewGroup) null);
            C1730a c1730a2 = new C1730a();
            c1730a2.f4390a = (TextView) view.findViewById(C1704R.C1706id.errorbody);
            view.setTag(c1730a2);
            c1730a = c1730a2;
        } else {
            c1730a = (C1730a) view.getTag();
        }
        c1730a.f4390a.setText(this.f4387a.get(this.f4388b.get(i)).get(i2));
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        if (this.f4387a == null) {
            return 0;
        }
        return this.f4387a.get(this.f4388b.get(i)).size();
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i) {
        return this.f4388b.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f4388b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f4389c).inflate(C1704R.layout.errorcodeheard, (ViewGroup) null);
        ((TextView) inflate.findViewById(C1704R.C1706id.errorheard)).setText(this.f4388b.get(i));
        return inflate;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return false;
    }
}
