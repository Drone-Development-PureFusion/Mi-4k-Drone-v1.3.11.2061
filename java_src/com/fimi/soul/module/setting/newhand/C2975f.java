package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import java.util.ArrayList;
/* renamed from: com.fimi.soul.module.setting.newhand.f */
/* loaded from: classes.dex */
public class C2975f {

    /* renamed from: a */
    View f10918a;

    /* renamed from: b */
    ListView f10919b;

    /* renamed from: c */
    ArrayList<String> f10920c;

    /* renamed from: d */
    PopupWindow f10921d;

    /* renamed from: e */
    C2978g f10922e;

    /* renamed from: f */
    TextView f10923f;

    /* renamed from: g */
    AbstractC2977a f10924g;

    /* renamed from: h */
    AdapterView.OnItemClickListener f10925h = new AdapterView.OnItemClickListener() { // from class: com.fimi.soul.module.setting.newhand.f.1
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C2975f.this.f10924g.m29784a(i);
            if (C2975f.this.f10921d != null) {
                C2975f.this.f10921d.dismiss();
                C2975f.this.f10921d = null;
            }
        }
    };

    /* renamed from: com.fimi.soul.module.setting.newhand.f$a */
    /* loaded from: classes.dex */
    public interface AbstractC2977a {
        /* renamed from: a */
        void m29784a(int i);
    }

    /* renamed from: a */
    public void m29785a(TextView textView, Context context, int i, AbstractC2977a abstractC2977a) {
        this.f10923f = textView;
        this.f10924g = abstractC2977a;
        this.f10918a = LayoutInflater.from(context).inflate(C1704R.layout.listview_newhand, (ViewGroup) null);
        this.f10919b = (ListView) this.f10918a.findViewById(C1704R.C1706id.lv_group);
        this.f10920c = new ArrayList<>();
        this.f10920c.add(context.getString(C1704R.C1707string.new_driver_mode));
        this.f10920c.add(context.getString(C1704R.C1707string.normal_driver_model));
        this.f10922e = new C2978g(context, this.f10920c);
        this.f10922e.m29783a(i);
        this.f10919b.setAdapter((ListAdapter) this.f10922e);
        this.f10921d = new PopupWindow(this.f10918a, -2, -2);
        this.f10921d.setBackgroundDrawable(context.getResources().getDrawable(C1704R.C1705drawable.radio));
        this.f10921d.setFocusable(true);
        int[] iArr = new int[2];
        textView.getLocationOnScreen(iArr);
        this.f10921d.showAtLocation(textView, 0, iArr[0], iArr[1]);
        this.f10919b.setOnItemClickListener(this.f10925h);
    }
}
