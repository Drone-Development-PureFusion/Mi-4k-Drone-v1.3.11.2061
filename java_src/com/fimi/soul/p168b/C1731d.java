package com.fimi.soul.p168b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.entity.FirmwareInfo;
import com.fimi.soul.utils.C3103au;
import java.util.List;
/* renamed from: com.fimi.soul.b.d */
/* loaded from: classes.dex */
public class C1731d extends BaseAdapter {

    /* renamed from: a */
    List<FirmwareInfo> f4392a;

    /* renamed from: b */
    private Context f4393b;

    /* renamed from: com.fimi.soul.b.d$a */
    /* loaded from: classes.dex */
    class C1732a {

        /* renamed from: a */
        TextView f4394a;

        /* renamed from: b */
        TextView f4395b;

        /* renamed from: c */
        View f4396c;

        C1732a() {
        }
    }

    public C1731d(Context context, List<FirmwareInfo> list) {
        this.f4392a = null;
        this.f4393b = context;
        this.f4392a = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4392a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f4392a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1732a c1732a;
        if (view == null) {
            C1732a c1732a2 = new C1732a();
            view = LayoutInflater.from(this.f4393b).inflate(C1704R.layout.list_firmware_info_item, (ViewGroup) null);
            c1732a2.f4394a = (TextView) view.findViewById(C1704R.C1706id.serial);
            c1732a2.f4395b = (TextView) view.findViewById(C1704R.C1706id.info_tv);
            c1732a2.f4396c = view.findViewById(C1704R.C1706id.divider);
            C3103au.m29232a(this.f4393b.getAssets(), c1732a2.f4394a);
            C3103au.m29232a(this.f4393b.getAssets(), c1732a2.f4395b);
            c1732a2.f4395b.setTag(Integer.valueOf(i));
            view.setTag(c1732a2);
            c1732a = c1732a2;
        } else {
            c1732a = (C1732a) view.getTag();
        }
        c1732a.f4394a.setText("" + (i + 1));
        c1732a.f4395b.setText(this.f4392a.get(i).getSysName() + ":" + this.f4392a.get(i).getUpdcontents());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }
}
