package com.fimi.soul.view.horizontallistview;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
/* renamed from: com.fimi.soul.view.horizontallistview.a */
/* loaded from: classes2.dex */
public class C3272a extends BaseAdapter {

    /* renamed from: a */
    Bitmap f12746a;

    /* renamed from: b */
    private String[] f12747b;

    /* renamed from: c */
    private Context f12748c;

    /* renamed from: d */
    private LayoutInflater f12749d;

    /* renamed from: e */
    private int f12750e = -1;

    /* renamed from: f */
    private int f12751f;

    /* renamed from: g */
    private int f12752g;

    /* renamed from: h */
    private int f12753h;

    /* renamed from: i */
    private int f12754i;

    /* renamed from: com.fimi.soul.view.horizontallistview.a$a */
    /* loaded from: classes2.dex */
    private static class C3274a {

        /* renamed from: a */
        private TextView f12755a;

        private C3274a() {
        }
    }

    public C3272a(Context context, String[] strArr) {
        this.f12748c = context;
        this.f12747b = strArr;
        this.f12751f = context.getResources().getColor(C1704R.color.drone_tab_gray_color);
        this.f12753h = context.getResources().getColor(C1704R.color.setting_content);
        this.f12752g = context.getResources().getColor(C1704R.color.black_80);
        this.f12754i = context.getResources().getColor(C1704R.color.white_blance_select);
        this.f12749d = (LayoutInflater) this.f12748c.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public int m28536a() {
        return this.f12750e;
    }

    /* renamed from: a */
    public void m28535a(int i) {
        this.f12750e = i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f12747b.length;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C3274a c3274a;
        if (view == null) {
            C3274a c3274a2 = new C3274a();
            view = this.f12749d.inflate(C1704R.layout.white_blance_horizontal_list_item, (ViewGroup) null);
            c3274a2.f12755a = (TextView) view.findViewById(C1704R.C1706id.text_list_item);
            view.setTag(c3274a2);
            c3274a = c3274a2;
        } else {
            c3274a = (C3274a) view.getTag();
        }
        if (i == this.f12750e) {
            view.setSelected(true);
            c3274a.f12755a.setTextColor(this.f12753h);
            c3274a.f12755a.setBackgroundResource(C1704R.C1705drawable.white_blance_bg2);
        } else {
            view.setSelected(false);
            c3274a.f12755a.setTextColor(this.f12751f);
            c3274a.f12755a.setBackgroundDrawable(null);
        }
        c3274a.f12755a.setText(this.f12747b[i]);
        return view;
    }
}
