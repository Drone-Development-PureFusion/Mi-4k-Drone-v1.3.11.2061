package com.fimi.soul.p168b;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fimi.kernel.utils.C1679t;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.entity.Describehistor;
import com.fimi.soul.utils.C3075ad;
import java.util.List;
/* renamed from: com.fimi.soul.b.a */
/* loaded from: classes.dex */
public class C1715a extends BaseAdapter {

    /* renamed from: a */
    SharedPreferences f4305a;

    /* renamed from: b */
    private Context f4306b;

    /* renamed from: c */
    private List<Describehistor> f4307c;

    /* renamed from: com.fimi.soul.b.a$a */
    /* loaded from: classes.dex */
    class C1716a {

        /* renamed from: a */
        TextView f4308a;

        /* renamed from: b */
        TextView f4309b;

        /* renamed from: c */
        TextView f4310c;

        /* renamed from: d */
        SimpleDraweeView f4311d;

        C1716a() {
        }
    }

    public C1715a(Context context) {
        this.f4306b = context;
        this.f4305a = context.getSharedPreferences("imagehead", 0);
    }

    /* renamed from: a */
    public void m34364a() {
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void m34363a(List<Describehistor> list) {
        this.f4307c = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f4307c == null) {
            return 0;
        }
        return this.f4307c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (this.f4307c == null) {
            return null;
        }
        return this.f4307c.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C1716a c1716a;
        Describehistor describehistor = this.f4307c.get(i);
        if (this.f4305a != null && describehistor.getUserID().equals(this.f4305a.getString("name", ""))) {
            describehistor.setUserImgUrl(this.f4305a.getString(describehistor.getUserID(), ""));
        }
        if (view == null) {
            view = LayoutInflater.from(this.f4306b).inflate(C1704R.layout.describehistoryitem, (ViewGroup) null);
            C1716a c1716a2 = new C1716a();
            c1716a2.f4309b = (TextView) view.findViewById(C1704R.C1706id.nickname);
            c1716a2.f4308a = (TextView) view.findViewById(C1704R.C1706id.listnum);
            c1716a2.f4310c = (TextView) view.findViewById(C1704R.C1706id.flytimedescribe);
            c1716a2.f4311d = (SimpleDraweeView) view.findViewById(C1704R.C1706id.imageView1);
            view.setTag(c1716a2);
            c1716a = c1716a2;
        } else {
            c1716a = (C1716a) view.getTag();
        }
        c1716a.f4309b.setText(describehistor.getName());
        c1716a.f4308a.setText((i + 1) + "");
        c1716a.f4310c.setText(C1679t.m34556a(describehistor.getSumTime() / 60.0d, 2) + "Hrs");
        C3075ad.m29364a(c1716a.f4311d, describehistor.getUserImgUrl());
        return view;
    }
}
