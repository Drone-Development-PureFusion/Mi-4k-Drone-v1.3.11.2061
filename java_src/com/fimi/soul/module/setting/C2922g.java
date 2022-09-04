package com.fimi.soul.module.setting;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
import java.util.List;
/* renamed from: com.fimi.soul.module.setting.g */
/* loaded from: classes.dex */
public class C2922g extends BaseAdapter {

    /* renamed from: a */
    List<C2931h> f10451a;

    /* renamed from: b */
    Context f10452b;

    /* renamed from: c */
    ListView f10453c;

    /* renamed from: d */
    C2923a f10454d;

    /* renamed from: e */
    private boolean f10455e = false;

    /* renamed from: f */
    private boolean f10456f = false;

    /* renamed from: com.fimi.soul.module.setting.g$a */
    /* loaded from: classes.dex */
    class C2923a {

        /* renamed from: a */
        TextView f10457a;

        /* renamed from: b */
        ImageView f10458b;

        C2923a() {
        }
    }

    public C2922g(Context context, List<C2931h> list) {
        this.f10452b = context;
        this.f10451a = list;
    }

    /* renamed from: a */
    public void m29933a(int i) {
        if (this.f10451a != null) {
            for (C2931h c2931h : this.f10451a) {
                c2931h.m29891a(false);
            }
            this.f10451a.get(i).m29891a(true);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void m29932a(boolean z) {
        this.f10456f = z;
    }

    /* renamed from: b */
    public void m29931b(boolean z) {
        this.f10455e = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f10451a != null) {
            return this.f10451a.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f10451a != null) {
            return this.f10451a.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        this.f10453c = (ListView) viewGroup;
        if (view == null) {
            this.f10454d = new C2923a();
            view = LinearLayout.inflate(this.f10452b, C1704R.layout.roller_setting_item, null);
            this.f10454d.f10458b = (ImageView) view.findViewById(C1704R.C1706id.item_icon);
            this.f10454d.f10457a = (TextView) view.findViewById(C1704R.C1706id.item_name);
            view.setLayoutParams(new AbsListView.LayoutParams(-1, (int) this.f10452b.getResources().getDimension(C1704R.dimen.setting_adapt_height)));
            view.setTag(this.f10454d);
            C3103au.m29232a(this.f10452b.getAssets(), this.f10454d.f10457a);
        } else {
            this.f10454d = (C2923a) view.getTag();
        }
        this.f10454d.f10457a.setText(this.f10451a.get(i).m29893a());
        if (this.f10451a.get(i).m29890b()) {
            this.f10454d.f10458b.setVisibility(0);
            this.f10454d.f10457a.setSelected(true);
        } else {
            this.f10454d.f10458b.setVisibility(4);
            this.f10454d.f10457a.setSelected(false);
        }
        if (this.f10456f) {
            this.f10454d.f10457a.setTextColor(this.f10452b.getResources().getColor(C1704R.color.setting_ash));
        } else if (i != 2 && this.f10455e) {
            this.f10454d.f10457a.setTextColor(this.f10452b.getResources().getColor(C1704R.color.setting_ash));
        } else if (!this.f10455e && i == 2) {
            this.f10454d.f10457a.setTextColor(this.f10452b.getResources().getColor(C1704R.color.setting_ash));
        }
        return view;
    }
}
