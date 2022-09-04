package com.fimi.x1bh.module.setting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
import java.util.List;
/* renamed from: com.fimi.x1bh.module.setting.b */
/* loaded from: classes.dex */
public class C3374b extends BaseAdapter {

    /* renamed from: a */
    private Context f13489a;

    /* renamed from: b */
    private List<C3373a> f13490b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.x1bh.module.setting.b$a */
    /* loaded from: classes.dex */
    public enum EnumC3376a {
        CONNECT_PLANE,
        FIRMWARE_UPDATE,
        CAMERA_SETTING,
        ARROW_KEY_SET,
        ABOUT,
        XIAOMI_ACCOUNT,
        BOTTOM
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.x1bh.module.setting.b$b */
    /* loaded from: classes2.dex */
    public class C3377b {

        /* renamed from: a */
        TextView f13499a;

        /* renamed from: b */
        ImageView f13500b;

        /* renamed from: c */
        TextView f13501c;

        /* renamed from: d */
        TextView f13502d;

        /* renamed from: e */
        TextView f13503e;

        /* renamed from: f */
        ImageView f13504f;

        /* renamed from: g */
        TextView f13505g;

        /* renamed from: h */
        ImageView f13506h;

        /* renamed from: i */
        RelativeLayout f13507i;

        /* renamed from: j */
        SwitchButton f13508j;

        /* renamed from: k */
        TextView f13509k;

        private C3377b() {
        }

        /* renamed from: a */
        public View m28089a(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(C3374b.this.f13489a).inflate(C1704R.layout.adapt_setting, viewGroup, false);
            this.f13507i = (RelativeLayout) inflate.findViewById(C1704R.C1706id.rl);
            this.f13499a = (TextView) inflate.findViewById(C1704R.C1706id.setting_title_tv);
            this.f13500b = (ImageView) inflate.findViewById(C1704R.C1706id.general_setting_iv);
            this.f13501c = (TextView) inflate.findViewById(C1704R.C1706id.settig_coontent_tv);
            this.f13504f = (ImageView) inflate.findViewById(C1704R.C1706id.setting_more_iv);
            this.f13502d = (TextView) inflate.findViewById(C1704R.C1706id.switch_manul_tv);
            this.f13503e = (TextView) inflate.findViewById(C1704R.C1706id.switch_manul_child_tv);
            this.f13505g = (TextView) inflate.findViewById(C1704R.C1706id.setting_delcare);
            this.f13506h = (ImageView) inflate.findViewById(C1704R.C1706id.setting_point);
            this.f13508j = (SwitchButton) inflate.findViewById(C1704R.C1706id.switch_btn);
            this.f13509k = (TextView) inflate.findViewById(C1704R.C1706id.btn_set_model);
            C3103au.m29232a(C3374b.this.f13489a.getAssets(), this.f13499a, this.f13501c, this.f13505g, this.f13502d, this.f13503e, this.f13509k);
            return inflate;
        }

        /* renamed from: a */
        public void m28088a(boolean z) {
            this.f13507i.setClickable(z);
        }
    }

    public C3374b(Context context) {
        this.f13489a = context;
    }

    /* renamed from: a */
    private void m28092a(C3377b c3377b, ViewGroup.LayoutParams layoutParams) {
        c3377b.f13507i.setBackgroundResource(C1704R.C1705drawable.list_setting_selector);
        c3377b.f13499a.setVisibility(4);
        c3377b.f13504f.setVisibility(4);
        c3377b.f13500b.setVisibility(4);
        c3377b.f13508j.setVisibility(4);
        c3377b.f13506h.setVisibility(8);
        c3377b.f13505g.setVisibility(4);
        c3377b.f13502d.setVisibility(4);
        c3377b.f13503e.setVisibility(4);
        c3377b.f13501c.setTextColor(this.f13489a.getResources().getColor(C1704R.color.setting_content));
        c3377b.f13502d.setTextColor(this.f13489a.getResources().getColor(C1704R.color.setting_content));
        c3377b.f13503e.setTextColor(this.f13489a.getResources().getColor(C1704R.color.setting_content_child));
        c3377b.f13505g.setTextColor(this.f13489a.getResources().getColor(C1704R.color.setting_declare));
        c3377b.f13500b.setAlpha(1.0f);
        c3377b.f13508j.setAlpha(1.0f);
        c3377b.f13504f.setAlpha(1.0f);
        layoutParams.height = (int) this.f13489a.getResources().getDimension(C1704R.dimen.setting_adapt_height);
        c3377b.f13507i.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public int m28093a(EnumC3376a enumC3376a) {
        for (int i = 0; i < this.f13490b.size(); i++) {
            if (enumC3376a == this.f13490b.get(i).m28096d()) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void m28090a(List<C3373a> list) {
        this.f13490b = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f13490b == null) {
            return 0;
        }
        return this.f13490b.size();
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
        C3377b c3377b;
        if (view == null) {
            C3377b c3377b2 = new C3377b();
            view = c3377b2.m28089a(viewGroup);
            view.setTag(c3377b2);
            c3377b = c3377b2;
        } else {
            c3377b = (C3377b) view.getTag();
        }
        if (this.f13490b != null) {
            m28092a(c3377b, view.getLayoutParams());
            if (i == EnumC3376a.CONNECT_PLANE.ordinal()) {
                if (!this.f13490b.get(m28093a(EnumC3376a.CONNECT_PLANE)).m28095e()) {
                    c3377b.f13501c.setTextColor(this.f13489a.getResources().getColor(C1704R.color.setting_ash));
                    c3377b.f13507i.setBackgroundResource(C1704R.color.list_nomal);
                    c3377b.f13500b.setAlpha(0.3f);
                    c3377b.f13504f.setAlpha(0.3f);
                }
                c3377b.f13504f.setVisibility(0);
                c3377b.f13501c.setVisibility(0);
                c3377b.f13499a.setVisibility(4);
                c3377b.f13500b.setVisibility(0);
                c3377b.f13509k.setVisibility(4);
                c3377b.f13500b.setBackgroundResource(C1704R.C1705drawable.connect_aircraft);
                c3377b.f13501c.setText(C1704R.C1707string.connect_plane);
            }
            if (i == EnumC3376a.FIRMWARE_UPDATE.ordinal()) {
                if (!this.f13490b.get(m28093a(EnumC3376a.FIRMWARE_UPDATE)).m28095e()) {
                    c3377b.f13501c.setTextColor(this.f13489a.getResources().getColor(C1704R.color.setting_ash));
                    c3377b.f13507i.setBackgroundResource(C1704R.color.list_nomal);
                    c3377b.f13500b.setAlpha(0.3f);
                    c3377b.f13504f.setAlpha(0.3f);
                }
                if (this.f13490b.get(m28093a(EnumC3376a.FIRMWARE_UPDATE)).m28095e()) {
                    if (this.f13490b.get(m28093a(EnumC3376a.FIRMWARE_UPDATE)).m28094f()) {
                        c3377b.f13505g.setVisibility(0);
                        c3377b.f13505g.setText(this.f13489a.getResources().getString(C1704R.C1707string.new_firmware_upgrade));
                        c3377b.f13506h.setVisibility(0);
                    } else {
                        c3377b.f13506h.setVisibility(4);
                        c3377b.f13505g.setVisibility(4);
                    }
                }
                c3377b.f13501c.setVisibility(0);
                c3377b.f13500b.setBackgroundResource(C1704R.C1705drawable.camera_settings);
                c3377b.f13500b.setVisibility(0);
                c3377b.f13501c.setText(C1704R.C1707string.refreshupdate);
                c3377b.f13504f.setVisibility(0);
            }
            if (i == EnumC3376a.CAMERA_SETTING.ordinal()) {
                c3377b.f13501c.setVisibility(0);
                c3377b.f13500b.setBackgroundResource(C1704R.C1705drawable.camera_settings);
                c3377b.f13500b.setVisibility(0);
                c3377b.f13501c.setText(C1704R.C1707string.camera_setting);
                c3377b.f13504f.setVisibility(0);
            } else if (i == EnumC3376a.ARROW_KEY_SET.ordinal()) {
                c3377b.f13501c.setVisibility(0);
                c3377b.f13501c.setText(C1704R.C1707string.cloud_setting_arrow_key_set);
                c3377b.f13500b.setVisibility(0);
                c3377b.f13500b.setBackgroundResource(C1704R.C1705drawable.arrow_key_icon);
                c3377b.f13504f.setVisibility(0);
            } else if (i == EnumC3376a.XIAOMI_ACCOUNT.ordinal()) {
                c3377b.f13501c.setVisibility(0);
                c3377b.f13501c.setText(C1704R.C1707string.cloud_setting_xiaomi_account);
                c3377b.f13500b.setVisibility(0);
                c3377b.f13500b.setBackgroundResource(C1704R.C1705drawable.mi_id);
                c3377b.f13504f.setVisibility(0);
                if (this.f13490b.get(m28093a(EnumC3376a.XIAOMI_ACCOUNT)).m28099b().booleanValue()) {
                    c3377b.f13505g.setVisibility(0);
                    c3377b.f13505g.setText(this.f13490b.get(m28093a(EnumC3376a.XIAOMI_ACCOUNT)).m28097c());
                    c3377b.f13504f.setVisibility(4);
                }
            } else if (i == EnumC3376a.BOTTOM.ordinal()) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = (int) this.f13489a.getResources().getDimension(C1704R.dimen.setting_adapt_bottom);
                c3377b.f13507i.setLayoutParams(layoutParams);
                c3377b.f13507i.setBackgroundResource(C1704R.color.list_nomal);
                c3377b.f13499a.setVisibility(8);
                c3377b.f13508j.setVisibility(8);
                c3377b.f13501c.setVisibility(8);
                c3377b.m28088a(false);
            } else if (i == EnumC3376a.ABOUT.ordinal()) {
                c3377b.f13509k.setVisibility(4);
                c3377b.f13499a.setVisibility(4);
                c3377b.f13500b.setVisibility(0);
                c3377b.f13500b.setBackgroundResource(C1704R.C1705drawable.about_icon);
                c3377b.f13501c.setText(C1704R.C1707string.about);
                c3377b.f13501c.setVisibility(0);
                c3377b.f13504f.setVisibility(0);
            }
        }
        return view;
    }
}
