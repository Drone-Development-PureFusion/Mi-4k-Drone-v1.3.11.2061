package com.fimi.soul.p168b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.entity.UpdateVersonBean;
import com.fimi.soul.utils.C3103au;
import java.util.List;
/* renamed from: com.fimi.soul.b.i */
/* loaded from: classes.dex */
public class C1750i extends BaseAdapter {

    /* renamed from: a */
    List<UpdateVersonBean> f4481a;

    /* renamed from: b */
    private Context f4482b;

    /* renamed from: com.fimi.soul.b.i$a */
    /* loaded from: classes.dex */
    class C1751a {

        /* renamed from: a */
        TextView f4483a;

        /* renamed from: b */
        TextView f4484b;

        /* renamed from: c */
        View f4485c;

        C1751a() {
        }
    }

    public C1750i(Context context, List<UpdateVersonBean> list) {
        this.f4481a = null;
        this.f4482b = context;
        this.f4481a = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4481a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f4481a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1751a c1751a;
        if (view == null) {
            C1751a c1751a2 = new C1751a();
            view = LayoutInflater.from(this.f4482b).inflate(C1704R.layout.list_firmware_info_item, (ViewGroup) null);
            c1751a2.f4483a = (TextView) view.findViewById(C1704R.C1706id.serial);
            c1751a2.f4484b = (TextView) view.findViewById(C1704R.C1706id.info_tv);
            c1751a2.f4485c = view.findViewById(C1704R.C1706id.divider);
            C3103au.m29232a(this.f4482b.getAssets(), c1751a2.f4483a);
            C3103au.m29232a(this.f4482b.getAssets(), c1751a2.f4484b);
            c1751a2.f4484b.setTag(Integer.valueOf(i));
            view.setTag(c1751a2);
            c1751a = c1751a2;
        } else {
            c1751a = (C1751a) view.getTag();
        }
        c1751a.f4483a.setText("" + (i + 1));
        c1751a.f4484b.setText(this.f4481a.get(i).getSysname() + ":" + this.f4481a.get(i).getUpdcontents());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }
}
