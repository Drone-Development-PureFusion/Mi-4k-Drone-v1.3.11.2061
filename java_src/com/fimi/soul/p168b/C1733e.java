package com.fimi.soul.p168b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.entity.FmMenuItem;
import java.util.List;
/* renamed from: com.fimi.soul.b.e */
/* loaded from: classes.dex */
public class C1733e extends BaseAdapter {

    /* renamed from: a */
    private Context f4398a;

    /* renamed from: b */
    private List<FmMenuItem> f4399b;

    /* renamed from: c */
    private int f4400c = C1704R.layout.item_list_pop;

    /* renamed from: com.fimi.soul.b.e$a */
    /* loaded from: classes.dex */
    static class C1734a {

        /* renamed from: a */
        TextView f4401a;

        C1734a() {
        }
    }

    public C1733e(Context context, List<FmMenuItem> list) {
        this.f4398a = context;
        this.f4399b = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4399b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f4399b.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1734a c1734a;
        if (view == null) {
            view = LayoutInflater.from(this.f4398a).inflate(this.f4400c, (ViewGroup) null);
            c1734a = new C1734a();
            c1734a.f4401a = (TextView) view.findViewById(C1704R.C1706id.pop_item);
            view.setTag(c1734a);
        } else {
            c1734a = (C1734a) view.getTag();
        }
        FmMenuItem fmMenuItem = this.f4399b.get(i);
        c1734a.f4401a.setText(fmMenuItem.getText());
        view.setId(fmMenuItem.getId());
        return view;
    }
}
