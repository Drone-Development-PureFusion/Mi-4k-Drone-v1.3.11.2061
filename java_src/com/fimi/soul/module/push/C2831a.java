package com.fimi.soul.module.push;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.utils.C3103au;
import java.util.List;
/* renamed from: com.fimi.soul.module.push.a */
/* loaded from: classes.dex */
public class C2831a extends BaseAdapter {

    /* renamed from: a */
    private Context f9972a;

    /* renamed from: b */
    private List<HistoryPushMessage> f9973b;

    /* renamed from: com.fimi.soul.module.push.a$a */
    /* loaded from: classes.dex */
    private class C2833a {

        /* renamed from: a */
        TextView f9974a;

        /* renamed from: b */
        TextView f9975b;

        /* renamed from: c */
        TextView f9976c;

        /* renamed from: d */
        RelativeLayout f9977d;

        /* renamed from: e */
        ImageView f9978e;

        private C2833a() {
        }

        /* renamed from: a */
        public View m30182a(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(C2831a.this.f9972a).inflate(C1704R.layout.adapt_history_push_message, viewGroup, false);
            this.f9974a = (TextView) inflate.findViewById(C1704R.C1706id.title_tv);
            this.f9975b = (TextView) inflate.findViewById(C1704R.C1706id.message_tv);
            this.f9976c = (TextView) inflate.findViewById(C1704R.C1706id.time_tv);
            this.f9978e = (ImageView) inflate.findViewById(C1704R.C1706id.setting_more_iv);
            this.f9977d = (RelativeLayout) inflate.findViewById(C1704R.C1706id.rl);
            C3103au.m29232a(C2831a.this.f9972a.getAssets(), this.f9974a, this.f9975b, this.f9976c);
            return inflate;
        }
    }

    public C2831a(Context context, List<HistoryPushMessage> list) {
        this.f9972a = context;
        this.f9973b = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9973b.size();
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
        C2833a c2833a;
        if (view == null) {
            C2833a c2833a2 = new C2833a();
            view = c2833a2.m30182a(viewGroup);
            view.setTag(c2833a2);
            c2833a = c2833a2;
        } else {
            c2833a = (C2833a) view.getTag();
        }
        view.getLayoutParams().height = (int) this.f9972a.getResources().getDimension(C1704R.dimen.setting_adapt_switch);
        c2833a.f9977d.setLayoutParams(view.getLayoutParams());
        c2833a.f9978e.setVisibility(0);
        c2833a.f9974a.setText(this.f9973b.get(i).getTitle());
        c2833a.f9975b.setText(this.f9973b.get(i).getPayload());
        c2833a.f9976c.setText(this.f9973b.get(i).getTime());
        return view;
    }
}
