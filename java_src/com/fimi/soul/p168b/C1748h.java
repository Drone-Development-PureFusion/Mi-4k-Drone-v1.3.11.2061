package com.fimi.soul.p168b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.entity.UpgradeResultDetail;
import java.util.List;
/* renamed from: com.fimi.soul.b.h */
/* loaded from: classes.dex */
public class C1748h extends BaseAdapter {

    /* renamed from: a */
    private Context f4474a;

    /* renamed from: b */
    private List<UpgradeResultDetail> f4475b;

    /* renamed from: com.fimi.soul.b.h$a */
    /* loaded from: classes.dex */
    class C1749a {

        /* renamed from: a */
        TextView f4476a;

        /* renamed from: b */
        TextView f4477b;

        /* renamed from: c */
        View f4478c;

        /* renamed from: d */
        ImageView f4479d;

        C1749a() {
        }
    }

    public C1748h(Context context, List<UpgradeResultDetail> list) {
        this.f4474a = context;
        this.f4475b = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4475b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f4475b.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1749a c1749a;
        if (view == null) {
            c1749a = new C1749a();
            view = LayoutInflater.from(this.f4474a).inflate(C1704R.layout.list_update_result_item, (ViewGroup) null);
            c1749a.f4476a = (TextView) view.findViewById(C1704R.C1706id.time);
            c1749a.f4477b = (TextView) view.findViewById(C1704R.C1706id.info_tv);
            c1749a.f4478c = view.findViewById(C1704R.C1706id.divider);
            c1749a.f4479d = (ImageView) view.findViewById(C1704R.C1706id.info_tv2);
            view.setTag(c1749a);
        } else {
            c1749a = (C1749a) view.getTag();
        }
        c1749a.f4477b.setText(this.f4475b.get(i).getDetail());
        c1749a.f4479d.setImageResource(this.f4475b.get(i).getImg());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }
}
