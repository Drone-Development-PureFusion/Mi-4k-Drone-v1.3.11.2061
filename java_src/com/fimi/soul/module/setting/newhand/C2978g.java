package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
import java.util.ArrayList;
/* renamed from: com.fimi.soul.module.setting.newhand.g */
/* loaded from: classes.dex */
public class C2978g extends BaseAdapter {

    /* renamed from: a */
    private Context f10927a;

    /* renamed from: b */
    private ArrayList<String> f10928b;

    /* renamed from: c */
    private LayoutInflater f10929c;

    /* renamed from: d */
    private int f10930d;

    /* renamed from: com.fimi.soul.module.setting.newhand.g$a */
    /* loaded from: classes.dex */
    class C2979a {

        /* renamed from: a */
        TextView f10931a;

        C2979a() {
        }
    }

    public C2978g(Context context, ArrayList<String> arrayList) {
        this.f10927a = context;
        this.f10928b = arrayList;
        this.f10929c = LayoutInflater.from(this.f10927a);
    }

    /* renamed from: a */
    public void m29783a(int i) {
        this.f10930d = i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f10928b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f10928b.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C2979a c2979a;
        if (view == null) {
            c2979a = new C2979a();
            view = this.f10929c.inflate(C1704R.layout.item_set_newhand_mode, (ViewGroup) null);
            view.setTag(c2979a);
            c2979a.f10931a = (TextView) view.findViewById(C1704R.C1706id.tv_group_item);
        } else {
            c2979a = (C2979a) view.getTag();
        }
        if (i == this.f10930d) {
            c2979a.f10931a.setTextColor(this.f10927a.getResources().getColor(C1704R.color.color_set_model));
        } else {
            c2979a.f10931a.setTextColor(this.f10927a.getResources().getColor(17170443));
        }
        c2979a.f10931a.setText(this.f10928b.get(i));
        C3103au.m29232a(this.f10927a.getAssets(), c2979a.f10931a);
        return view;
    }
}
