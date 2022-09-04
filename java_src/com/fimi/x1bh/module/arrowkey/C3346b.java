package com.fimi.x1bh.module.arrowkey;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
import java.util.List;
/* renamed from: com.fimi.x1bh.module.arrowkey.b */
/* loaded from: classes.dex */
public class C3346b extends BaseAdapter implements SwitchButton.AbstractC1695a {

    /* renamed from: a */
    private Context f13334a;

    /* renamed from: b */
    private List<C3345a> f13335b;

    /* renamed from: c */
    private AbstractC3348a f13336c;

    /* renamed from: com.fimi.x1bh.module.arrowkey.b$a */
    /* loaded from: classes.dex */
    interface AbstractC3348a {
        /* renamed from: a */
        void mo28210a(EnumC3349b enumC3349b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.x1bh.module.arrowkey.b$b */
    /* loaded from: classes.dex */
    public enum EnumC3349b {
        HORZONTAL_OPERATION,
        VERTIAL_OPERATION,
        BOTTOM
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.x1bh.module.arrowkey.b$c */
    /* loaded from: classes2.dex */
    public class C3350c {

        /* renamed from: a */
        TextView f13341a;

        /* renamed from: b */
        RelativeLayout f13342b;

        /* renamed from: c */
        SwitchButton f13343c;

        private C3350c() {
        }

        /* renamed from: a */
        public View m28209a(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(C3346b.this.f13334a).inflate(C1704R.layout.item_arrow_key, viewGroup, false);
            this.f13342b = (RelativeLayout) inflate.findViewById(C1704R.C1706id.rl);
            this.f13341a = (TextView) inflate.findViewById(C1704R.C1706id.settig_coontent_tv);
            this.f13343c = (SwitchButton) inflate.findViewById(C1704R.C1706id.switch_btn);
            C3103au.m29232a(C3346b.this.f13334a.getAssets(), this.f13341a);
            return inflate;
        }

        /* renamed from: a */
        public void m28208a(boolean z) {
            this.f13342b.setClickable(z);
        }
    }

    public C3346b(Context context) {
        this.f13334a = context;
    }

    /* renamed from: a */
    private void m28213a(C3350c c3350c, ViewGroup.LayoutParams layoutParams) {
        c3350c.f13342b.setBackgroundResource(C1704R.C1705drawable.list_setting_selector);
        c3350c.f13343c.setVisibility(4);
        c3350c.f13341a.setTextColor(this.f13334a.getResources().getColor(C1704R.color.setting_content));
        c3350c.f13343c.setAlpha(1.0f);
        layoutParams.height = (int) this.f13334a.getResources().getDimension(C1704R.dimen.setting_adapt_height);
        c3350c.f13342b.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public int m28214a(EnumC3349b enumC3349b) {
        for (int i = 0; i < this.f13335b.size(); i++) {
            if (enumC3349b == this.f13335b.get(i).m28217b()) {
                return i;
            }
        }
        return 0;
    }

    @Override // com.fimi.kernel.view.button.SwitchButton.AbstractC1695a
    /* renamed from: a */
    public void mo28184a(View view, boolean z) {
        if (((Integer) view.getTag()).intValue() == m28214a(EnumC3349b.HORZONTAL_OPERATION)) {
            SwitchButton switchButton = (SwitchButton) view.findViewWithTag(view.getTag());
            if (this.f13335b.get(m28214a(EnumC3349b.HORZONTAL_OPERATION)).m28216c()) {
                switchButton.m34420a(true, false);
            } else {
                switchButton.m34420a(false, false);
            }
            this.f13336c.mo28210a(EnumC3349b.HORZONTAL_OPERATION);
        } else if (((Integer) view.getTag()).intValue() != m28214a(EnumC3349b.VERTIAL_OPERATION)) {
        } else {
            SwitchButton switchButton2 = (SwitchButton) view.findViewWithTag(view.getTag());
            if (this.f13335b.get(m28214a(EnumC3349b.HORZONTAL_OPERATION)).m28216c()) {
                switchButton2.m34420a(true, false);
            } else {
                switchButton2.m34420a(false, false);
            }
            this.f13336c.mo28210a(EnumC3349b.VERTIAL_OPERATION);
        }
    }

    /* renamed from: a */
    public void m28215a(AbstractC3348a abstractC3348a) {
        this.f13336c = abstractC3348a;
    }

    /* renamed from: a */
    public void m28211a(List<C3345a> list) {
        this.f13335b = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f13335b == null) {
            return 0;
        }
        return this.f13335b.size();
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
        C3350c c3350c;
        if (view == null) {
            C3350c c3350c2 = new C3350c();
            view = c3350c2.m28209a(viewGroup);
            view.setTag(c3350c2);
            c3350c = c3350c2;
        } else {
            c3350c = (C3350c) view.getTag();
        }
        if (this.f13335b != null) {
            m28213a(c3350c, view.getLayoutParams());
            if (i == EnumC3349b.HORZONTAL_OPERATION.ordinal()) {
                c3350c.f13341a.setVisibility(0);
                c3350c.f13341a.setText(C1704R.C1707string.arrowkey_horzontal_operation);
                c3350c.f13343c.setVisibility(0);
                c3350c.f13343c.setOnSwitchListener(this);
                c3350c.f13343c.setTag(Integer.valueOf(m28214a(EnumC3349b.HORZONTAL_OPERATION)));
                if (this.f13335b.get(EnumC3349b.HORZONTAL_OPERATION.ordinal()).m28216c()) {
                    c3350c.f13343c.m34420a(true, false);
                } else {
                    c3350c.f13343c.m34420a(false, false);
                }
            } else if (i == EnumC3349b.VERTIAL_OPERATION.ordinal()) {
                c3350c.f13341a.setVisibility(0);
                c3350c.f13341a.setText(C1704R.C1707string.arrowkey_vertial_operation);
                c3350c.f13343c.setVisibility(0);
                c3350c.f13343c.setOnSwitchListener(this);
                c3350c.f13343c.setTag(Integer.valueOf(m28214a(EnumC3349b.VERTIAL_OPERATION)));
                if (this.f13335b.get(EnumC3349b.VERTIAL_OPERATION.ordinal()).m28216c()) {
                    c3350c.f13343c.m34420a(true, false);
                } else {
                    c3350c.f13343c.m34420a(false, false);
                }
            } else if (i == EnumC3349b.BOTTOM.ordinal()) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = (int) this.f13334a.getResources().getDimension(C1704R.dimen.setting_adapt_bottom);
                c3350c.f13342b.setLayoutParams(layoutParams);
                c3350c.f13342b.setBackgroundResource(C1704R.color.list_nomal);
                c3350c.f13343c.setVisibility(8);
                c3350c.f13341a.setVisibility(8);
                c3350c.m28208a(false);
            }
        }
        return view;
    }
}
