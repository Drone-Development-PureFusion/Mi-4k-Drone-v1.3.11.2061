package com.fimi.soul.module.p208a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import java.util.List;
/* renamed from: com.fimi.soul.module.a.a */
/* loaded from: classes.dex */
public class C2460a extends BaseAdapter {

    /* renamed from: a */
    private List<C2473d> f7955a;

    /* renamed from: b */
    private LayoutInflater f7956b;

    /* renamed from: c */
    private int f7957c;

    /* renamed from: d */
    private int f7958d;

    /* renamed from: e */
    private int f7959e = -1;

    /* renamed from: com.fimi.soul.module.a.a$a */
    /* loaded from: classes.dex */
    class C2461a {

        /* renamed from: a */
        TextView f7960a;

        /* renamed from: b */
        TextView f7961b;

        /* renamed from: c */
        TextView f7962c;

        /* renamed from: d */
        RelativeLayout f7963d;

        C2461a() {
        }
    }

    public C2460a(Context context, List<C2473d> list) {
        this.f7957c = context.getResources().getColor(C1704R.color.camera_menu_item_text_color_sel);
        this.f7958d = context.getResources().getColor(C1704R.color.camera_menu_item_text_color_def);
        this.f7955a = list;
        this.f7956b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public void m31592a(int i) {
        this.f7959e = i;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void m31591a(int i, String str) {
        if (this.f7955a == null || this.f7955a.size() <= 0) {
            return;
        }
        this.f7955a.get(i).m31550b(str);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void m31590a(String[] strArr) {
        if (this.f7955a == null || this.f7955a.size() <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= strArr.length) {
                notifyDataSetChanged();
                return;
            }
            if (this.f7955a.get(i2).m31548c()) {
                this.f7955a.get(i2).m31550b(strArr[i2]);
            }
            i = i2 + 1;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7955a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f7955a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C2461a c2461a;
        boolean z = true;
        C2473d c2473d = (C2473d) getItem(i);
        if (view == null) {
            C2461a c2461a2 = new C2461a();
            view = this.f7956b.inflate(C1704R.layout.camera_menu_list_item, (ViewGroup) null);
            c2461a2.f7960a = (TextView) view.findViewById(C1704R.C1706id.tv_lv_item_tag);
            c2461a2.f7961b = (TextView) view.findViewById(C1704R.C1706id.tv_lv_item_value);
            c2461a2.f7963d = (RelativeLayout) view.findViewById(C1704R.C1706id.rl);
            view.setTag(c2461a2);
            c2461a = c2461a2;
        } else {
            c2461a = (C2461a) view.getTag();
        }
        if (c2473d.m31547d()) {
            c2461a.f7960a.setVisibility(8);
            c2461a.f7961b.setVisibility(8);
            c2461a.f7962c.setVisibility(0);
            c2461a.f7962c.setText(c2473d.m31554a());
            c2461a.f7963d.setClickable(!c2473d.m31548c());
        } else {
            c2461a.f7960a.setVisibility(0);
            c2461a.f7961b.setVisibility(0);
            c2461a.f7962c.setVisibility(8);
            c2461a.f7960a.setText(c2473d.m31554a());
            c2461a.f7961b.setText(c2473d.m31551b());
            if (c2473d.m31548c()) {
                RelativeLayout relativeLayout = c2461a.f7963d;
                if (c2473d.m31548c()) {
                    z = false;
                }
                relativeLayout.setClickable(z);
                if (i == this.f7959e) {
                    c2461a.f7960a.setTextColor(this.f7957c);
                    c2461a.f7961b.setTextColor(this.f7957c);
                } else {
                    c2461a.f7960a.setTextColor(this.f7958d);
                    c2461a.f7961b.setTextColor(this.f7958d);
                }
            } else {
                RelativeLayout relativeLayout2 = c2461a.f7963d;
                if (c2473d.m31548c()) {
                    z = false;
                }
                relativeLayout2.setClickable(z);
            }
        }
        return view;
    }
}
