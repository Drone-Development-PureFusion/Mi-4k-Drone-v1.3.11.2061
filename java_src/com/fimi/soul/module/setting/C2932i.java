package com.fimi.soul.module.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.manager.C1973k;
import com.fimi.soul.biz.manager.C1981o;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.entity.Setting;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.utils.C3103au;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.module.setting.i */
/* loaded from: classes.dex */
public class C2932i extends BaseAdapter implements SwitchButton.AbstractC1695a {

    /* renamed from: b */
    public static final String f10540b = "100";

    /* renamed from: c */
    public static EnumC2937d[] f10541c = {EnumC2937d.IMU_DETECTION, EnumC2937d.GIMBAL_TUNE_PARAMETER};

    /* renamed from: d */
    public static EnumC2937d[] f10542d = new EnumC2937d[0];

    /* renamed from: m */
    private static final String f10543m = "SettingAdapt";

    /* renamed from: a */
    public AbstractC2936c f10544a;

    /* renamed from: e */
    private Context f10545e;

    /* renamed from: f */
    private List<Setting> f10546f;

    /* renamed from: g */
    private C2083a f10547g;

    /* renamed from: h */
    private AbstractC2935b f10548h;

    /* renamed from: j */
    private C1973k f10550j;

    /* renamed from: k */
    private AbstractC2934a f10551k;

    /* renamed from: l */
    private List<Integer> f10552l = new ArrayList();

    /* renamed from: i */
    private C3022b f10549i = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);

    /* renamed from: com.fimi.soul.module.setting.i$a */
    /* loaded from: classes.dex */
    public interface AbstractC2934a {
        /* renamed from: l */
        void mo29881l();
    }

    /* renamed from: com.fimi.soul.module.setting.i$b */
    /* loaded from: classes.dex */
    public interface AbstractC2935b {
        /* renamed from: a */
        void mo29880a(SwitchButton switchButton);
    }

    /* renamed from: com.fimi.soul.module.setting.i$c */
    /* loaded from: classes.dex */
    public interface AbstractC2936c {
        /* renamed from: b */
        void mo29879b(int i);
    }

    /* renamed from: com.fimi.soul.module.setting.i$d */
    /* loaded from: classes.dex */
    public enum EnumC2937d {
        FLIGHT,
        CONNECT_PLANE,
        FIMWARE_UPDATE,
        COMPASS_CALIBRATION,
        NEW_HAND_GUIDE,
        NEW_HAND_MODE,
        GPS_MODE,
        OPTICAL_FLOW_MODE,
        FORCED_ATTITUDE_MODE,
        SHOW_MORE_PAT,
        FT_TRUN,
        IMU_DETECTION,
        FRONTLIGHTSSETTING,
        REMOTE,
        CALIBRATION_REMOTE,
        SWITCH_REMOTE_MODE,
        RELAY_WIFI_CONFIGURE,
        PAIR_REMOTE,
        SWITCH_RIGHT_MODE,
        BATTERY,
        BATTERY_INFO,
        GIMBAL,
        GIMBAL_CALIBRATION,
        GIMBAL_TUNE_PARAMETER,
        CAMERA,
        CAMERA_SETTING,
        MAP,
        SATELLITE_MAP,
        MAP_CODE_CORREECTION,
        ACCOUNT,
        FLIGHT_RECORD,
        FLIGHT_INFO,
        USER_FEEDBACK,
        CHECK_UPDATE,
        ABOUT,
        HISTORY_MESSAGE,
        XIAOMI_ACCOUNT,
        BOTTOM_EDGE_LABLE
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.module.setting.i$e */
    /* loaded from: classes.dex */
    public class C2938e {

        /* renamed from: a */
        TextView f10592a;

        /* renamed from: b */
        ImageView f10593b;

        /* renamed from: c */
        TextView f10594c;

        /* renamed from: d */
        TextView f10595d;

        /* renamed from: e */
        TextView f10596e;

        /* renamed from: f */
        ImageView f10597f;

        /* renamed from: g */
        TextView f10598g;

        /* renamed from: h */
        ImageView f10599h;

        /* renamed from: i */
        RelativeLayout f10600i;

        /* renamed from: j */
        SwitchButton f10601j;

        /* renamed from: k */
        TextView f10602k;

        private C2938e() {
        }

        /* renamed from: a */
        public View m29878a(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(C2932i.this.f10545e).inflate(C1704R.layout.adapt_setting, viewGroup, false);
            this.f10600i = (RelativeLayout) inflate.findViewById(C1704R.C1706id.rl);
            this.f10592a = (TextView) inflate.findViewById(C1704R.C1706id.setting_title_tv);
            this.f10593b = (ImageView) inflate.findViewById(C1704R.C1706id.general_setting_iv);
            this.f10594c = (TextView) inflate.findViewById(C1704R.C1706id.settig_coontent_tv);
            this.f10597f = (ImageView) inflate.findViewById(C1704R.C1706id.setting_more_iv);
            this.f10595d = (TextView) inflate.findViewById(C1704R.C1706id.switch_manul_tv);
            this.f10596e = (TextView) inflate.findViewById(C1704R.C1706id.switch_manul_child_tv);
            this.f10598g = (TextView) inflate.findViewById(C1704R.C1706id.setting_delcare);
            this.f10599h = (ImageView) inflate.findViewById(C1704R.C1706id.setting_point);
            this.f10601j = (SwitchButton) inflate.findViewById(C1704R.C1706id.switch_btn);
            this.f10602k = (TextView) inflate.findViewById(C1704R.C1706id.btn_set_model);
            C3103au.m29232a(C2932i.this.f10545e.getAssets(), this.f10592a, this.f10594c, this.f10598g, this.f10595d, this.f10596e, this.f10602k);
            return inflate;
        }
    }

    public C2932i(Context context, C2083a c2083a) {
        this.f10545e = context;
        this.f10547g = c2083a;
        this.f10550j = C1973k.m33368a(context);
    }

    /* renamed from: a */
    private void m29884a(C2938e c2938e, ViewGroup.LayoutParams layoutParams) {
        c2938e.f10600i.setBackgroundResource(C1704R.C1705drawable.list_setting_selector);
        c2938e.f10592a.setVisibility(4);
        c2938e.f10597f.setVisibility(4);
        c2938e.f10593b.setVisibility(4);
        c2938e.f10601j.setVisibility(4);
        c2938e.f10599h.setVisibility(8);
        c2938e.f10598g.setVisibility(4);
        c2938e.f10595d.setVisibility(4);
        c2938e.f10596e.setVisibility(4);
        c2938e.f10594c.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_content));
        c2938e.f10595d.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_content));
        c2938e.f10596e.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_content_child));
        c2938e.f10598g.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_declare));
        c2938e.f10593b.setAlpha(1.0f);
        c2938e.f10601j.setAlpha(1.0f);
        c2938e.f10597f.setAlpha(1.0f);
        layoutParams.height = (int) this.f10545e.getResources().getDimension(C1704R.dimen.setting_adapt_height);
        c2938e.f10600i.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public int m29885a(EnumC2937d enumC2937d) {
        for (int i = 0; i < this.f10546f.size(); i++) {
            if (enumC2937d == this.f10546f.get(i).getSettingAdaptState()) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void m29889a(int i, View view) {
        if (view != null && (view.getTag() instanceof C2938e)) {
            ((C2938e) view.getTag()).f10598g.setText(this.f10546f.get(i).getContent());
        }
    }

    @Override // com.fimi.kernel.view.button.SwitchButton.AbstractC1695a
    /* renamed from: a */
    public void mo28184a(View view, boolean z) {
        if (((Integer) view.getTag()).intValue() == m29885a(EnumC2937d.SATELLITE_MAP)) {
            if (C1981o.m33342a(this.f10545e).m33334e()) {
                C1981o.m33342a(this.f10545e).m33331f(false);
                PreferenceManager.getDefaultSharedPreferences(this.f10545e).edit().putInt(C2279c.f7282s, 1).commit();
            } else {
                C1981o.m33342a(this.f10545e).m33331f(true);
                PreferenceManager.getDefaultSharedPreferences(this.f10545e).edit().putInt(C2279c.f7282s, 2).commit();
            }
        }
        if (((Integer) view.getTag()).intValue() == m29885a(EnumC2937d.SHOW_MORE_PAT)) {
            if (C1642c.m34885e().m34530d()) {
                C1642c.m34885e().m34539a(false);
            } else {
                C1642c.m34885e().m34539a(true);
            }
            ((FlightActivity) this.f10545e).m30481j();
        }
        if (((Integer) view.getTag()).intValue() == m29885a(EnumC2937d.NEW_HAND_MODE)) {
            this.f10548h.mo29880a((SwitchButton) view.findViewWithTag(view.getTag()));
        }
        if (((Integer) view.getTag()).intValue() == m29885a(EnumC2937d.FORCED_ATTITUDE_MODE)) {
            SwitchButton switchButton = (SwitchButton) view.findViewWithTag(view.getTag());
            if (this.f10546f.get(m29885a(EnumC2937d.FORCED_ATTITUDE_MODE)).getIsOPen().booleanValue()) {
                switchButton.m34420a(true, false);
            } else {
                switchButton.m34420a(false, false);
            }
            if (this.f10546f.get(m29885a(EnumC2937d.NEW_HAND_MODE)).getIsOPen().booleanValue()) {
                return;
            }
            this.f10544a.mo29879b(4);
            notifyDataSetChanged();
        }
        if (((Integer) view.getTag()).intValue() == m29885a(EnumC2937d.OPTICAL_FLOW_MODE)) {
            SwitchButton switchButton2 = (SwitchButton) view.findViewWithTag(view.getTag());
            if (this.f10546f.get(m29885a(EnumC2937d.OPTICAL_FLOW_MODE)).getIsOPen().booleanValue()) {
                switchButton2.m34420a(true, false);
            } else {
                switchButton2.m34420a(false, false);
            }
            this.f10544a.mo29879b(2);
        }
        if (((Integer) view.getTag()).intValue() == EnumC2937d.MAP_CODE_CORREECTION.ordinal()) {
            SharedPreferences m34546a = C1681v.m34543a(this.f10547g.f5919d).m34546a();
            C2022a m33223a = C2022a.m33223a();
            if (m34546a.getBoolean(C2279c.f7238bN, false)) {
                m34546a.edit().putBoolean(C2279c.f7238bN, false).commit();
                m33223a.m33222a(true);
            } else {
                m34546a.edit().putBoolean(C2279c.f7238bN, true).commit();
                m33223a.m33222a(false);
            }
            if (this.f10547g != null) {
                this.f10547g.mo32909a(C2104d.EnumC2105a.UPDATE_FLYZONE);
            }
        }
        if (((Integer) view.getTag()).intValue() == EnumC2937d.FT_TRUN.ordinal()) {
            if (C1642c.m34885e().m34501p()) {
                C1642c.m34885e().m34516g(false);
            } else {
                C1642c.m34885e().m34516g(true);
            }
            notifyDataSetChanged();
            this.f10547g.mo32909a(C2104d.EnumC2105a.ImperialUnits);
        }
    }

    /* renamed from: a */
    public void m29888a(AbstractC2934a abstractC2934a) {
        this.f10551k = abstractC2934a;
    }

    /* renamed from: a */
    public void m29887a(AbstractC2935b abstractC2935b) {
        this.f10548h = abstractC2935b;
    }

    /* renamed from: a */
    public void m29886a(AbstractC2936c abstractC2936c) {
        this.f10544a = abstractC2936c;
    }

    /* renamed from: a */
    public void m29882a(List<Setting> list) {
        this.f10546f = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f10546f == null) {
            return 0;
        }
        return this.f10546f.size();
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
        C2938e c2938e;
        if (view == null) {
            C2938e c2938e2 = new C2938e();
            view = c2938e2.m29878a(viewGroup);
            view.setTag(c2938e2);
            c2938e = c2938e2;
        } else {
            c2938e = (C2938e) view.getTag();
        }
        if (this.f10546f != null) {
            m29884a(c2938e, view.getLayoutParams());
            EnumC2937d settingAdaptState = this.f10546f.get(i).getSettingAdaptState();
            if (settingAdaptState == EnumC2937d.FLIGHT) {
                c2938e.f10592a.setVisibility(0);
                c2938e.f10592a.setText(C1704R.C1707string.flight);
                c2938e.f10597f.setVisibility(4);
                c2938e.f10594c.setVisibility(4);
                c2938e.f10593b.setVisibility(4);
                c2938e.f10602k.setVisibility(4);
                c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
            }
            if (settingAdaptState == EnumC2937d.CONNECT_PLANE) {
                if (!this.f10546f.get(m29885a(EnumC2937d.CONNECT_PLANE)).getIsOPen().booleanValue()) {
                    c2938e.f10594c.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
                    c2938e.f10593b.setAlpha(0.3f);
                    c2938e.f10597f.setAlpha(0.3f);
                }
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10602k.setVisibility(4);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.connect_aircraft);
                c2938e.f10594c.setText(C1704R.C1707string.connect_plane);
            }
            if (settingAdaptState == EnumC2937d.FIMWARE_UPDATE) {
                if (!this.f10546f.get(m29885a(EnumC2937d.FIMWARE_UPDATE)).getIsOPen().booleanValue()) {
                    c2938e.f10594c.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
                    c2938e.f10593b.setAlpha(0.3f);
                    c2938e.f10597f.setAlpha(0.3f);
                }
                if (this.f10546f.get(m29885a(EnumC2937d.FIMWARE_UPDATE)).getIsOPen().booleanValue()) {
                    if (this.f10546f.get(m29885a(EnumC2937d.FIMWARE_UPDATE)).isDisplayTv()) {
                        c2938e.f10598g.setVisibility(0);
                        c2938e.f10598g.setText(this.f10545e.getResources().getString(C1704R.C1707string.new_firmware_upgrade));
                        c2938e.f10599h.setVisibility(0);
                    } else {
                        c2938e.f10599h.setVisibility(4);
                        c2938e.f10598g.setVisibility(4);
                    }
                }
                c2938e.f10602k.setVisibility(4);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.firmware_upgrade);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10594c.setText(C1704R.C1707string.refreshupdate);
            }
            if (settingAdaptState == EnumC2937d.COMPASS_CALIBRATION) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.compass_calibration);
                c2938e.f10594c.setText(C1704R.C1707string.compass_calibration);
            }
            if (settingAdaptState == EnumC2937d.NEW_HAND_GUIDE) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.new_hand_guide);
                c2938e.f10594c.setText(C1704R.C1707string.new_hand_guide);
            }
            if (settingAdaptState == EnumC2937d.NEW_HAND_MODE) {
                c2938e.f10594c.setVisibility(4);
                c2938e.f10595d.setVisibility(0);
                c2938e.f10596e.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10595d.setText(C1704R.C1707string.new_hand_mode);
                if (C1642c.m34885e().m34501p()) {
                    c2938e.f10596e.setText(this.f10545e.getString(C1704R.C1707string.newhand_mode_child, Math.round(C1679t.m34553b(50.0d)) + this.f10545e.getString(C1704R.C1707string.distance_unit_ft), Math.round(C1679t.m34553b(100.0d)) + this.f10545e.getString(C1704R.C1707string.distance_unit_ft)));
                } else {
                    c2938e.f10596e.setText(this.f10545e.getString(C1704R.C1707string.newhand_mode_child, "50m", "100m"));
                }
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.control_mode);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10601j.setVisibility(0);
                if (this.f10546f.get(m29885a(EnumC2937d.NEW_HAND_MODE)).getIsOPen().booleanValue()) {
                    c2938e.f10601j.m34420a(true, false);
                } else {
                    c2938e.f10601j.m34420a(false, false);
                }
                c2938e.f10601j.setAlpha(1.0f);
                c2938e.f10601j.setTag(Integer.valueOf(m29885a(EnumC2937d.NEW_HAND_MODE)));
                c2938e.f10601j.setOnSwitchListener(this);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = (int) this.f10545e.getResources().getDimension(C1704R.dimen.setting_adapt_switch);
                c2938e.f10600i.setLayoutParams(layoutParams);
                c2938e.f10597f.setVisibility(4);
            }
            if (settingAdaptState == EnumC2937d.GPS_MODE) {
                if (this.f10546f.get(m29885a(EnumC2937d.NEW_HAND_MODE)).getIsOPen().booleanValue()) {
                    c2938e.f10595d.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10596e.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
                    c2938e.f10597f.setAlpha(0.3f);
                    c2938e.f10593b.setAlpha(0.3f);
                }
                c2938e.f10594c.setVisibility(4);
                c2938e.f10595d.setVisibility(0);
                c2938e.f10596e.setVisibility(0);
                c2938e.f10595d.setText(C1704R.C1707string.gps_mode);
                c2938e.f10596e.setText(C1704R.C1707string.need_to_unlock_the_newhand_mode);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_gps);
                c2938e.f10593b.setVisibility(0);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.height = (int) this.f10545e.getResources().getDimension(C1704R.dimen.setting_adapt_switch);
                c2938e.f10600i.setLayoutParams(layoutParams2);
            }
            if (settingAdaptState == EnumC2937d.OPTICAL_FLOW_MODE) {
                if (this.f10546f.get(m29885a(EnumC2937d.NEW_HAND_MODE)).getIsOPen().booleanValue() || this.f10546f.get(m29885a(EnumC2937d.FORCED_ATTITUDE_MODE)).getIsOPen().booleanValue()) {
                    c2938e.f10593b.setAlpha(0.3f);
                    c2938e.f10597f.setAlpha(0.3f);
                    c2938e.f10595d.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10596e.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
                    c2938e.f10601j.setAlpha(0.3f);
                } else {
                    c2938e.f10593b.setAlpha(1.0f);
                    c2938e.f10597f.setAlpha(1.0f);
                    c2938e.f10601j.setAlpha(1.0f);
                }
                c2938e.f10601j.setTag(Integer.valueOf(m29885a(EnumC2937d.OPTICAL_FLOW_MODE)));
                c2938e.f10601j.setOnSwitchListener(this);
                c2938e.f10594c.setVisibility(4);
                c2938e.f10595d.setVisibility(0);
                c2938e.f10596e.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10595d.setText(C1704R.C1707string.optical_flow_mode);
                c2938e.f10596e.setText(C1704R.C1707string.need_to_unlock_the_newhand_mode);
                c2938e.f10601j.setVisibility(0);
                if (this.f10546f.get(m29885a(EnumC2937d.OPTICAL_FLOW_MODE)).getIsOPen().booleanValue()) {
                    c2938e.f10601j.m34420a(true, false);
                } else {
                    c2938e.f10601j.m34420a(false, false);
                }
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_location_mode);
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                layoutParams3.height = (int) this.f10545e.getResources().getDimension(C1704R.dimen.setting_adapt_switch);
                c2938e.f10600i.setLayoutParams(layoutParams3);
            }
            if (settingAdaptState == EnumC2937d.FORCED_ATTITUDE_MODE) {
                if (this.f10546f.get(m29885a(EnumC2937d.NEW_HAND_MODE)).getIsOPen().booleanValue()) {
                    c2938e.f10593b.setAlpha(0.3f);
                    c2938e.f10597f.setAlpha(0.3f);
                    c2938e.f10595d.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10596e.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
                    c2938e.f10601j.setAlpha(0.3f);
                } else {
                    c2938e.f10593b.setAlpha(1.0f);
                    c2938e.f10597f.setAlpha(1.0f);
                    c2938e.f10601j.setAlpha(1.0f);
                }
                c2938e.f10595d.setVisibility(0);
                c2938e.f10594c.setVisibility(4);
                c2938e.f10596e.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10595d.setText(C1704R.C1707string.forced_attitude_mode);
                c2938e.f10596e.setText(C1704R.C1707string.need_to_unlock_the_newhand_mode);
                c2938e.f10601j.setVisibility(0);
                if (this.f10546f.get(m29885a(EnumC2937d.FORCED_ATTITUDE_MODE)).getIsOPen().booleanValue()) {
                    c2938e.f10601j.m34420a(true, false);
                } else {
                    c2938e.f10601j.m34420a(false, false);
                }
                c2938e.f10601j.setTag(Integer.valueOf(m29885a(EnumC2937d.FORCED_ATTITUDE_MODE)));
                c2938e.f10601j.setOnSwitchListener(this);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_posture_mode);
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                layoutParams4.height = (int) this.f10545e.getResources().getDimension(C1704R.dimen.setting_adapt_switch);
                c2938e.f10600i.setLayoutParams(layoutParams4);
            }
            if (settingAdaptState == EnumC2937d.SHOW_MORE_PAT) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.flight_parameter);
                c2938e.f10594c.setText(C1704R.C1707string.show_more_patter);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10597f.setVisibility(0);
            } else if (settingAdaptState == EnumC2937d.FT_TRUN) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_british_unit);
                c2938e.f10594c.setText(C1704R.C1707string.ft_trun);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10601j.setVisibility(0);
                if (C1642c.m34885e().m34501p()) {
                    c2938e.f10601j.m34420a(true, false);
                } else {
                    c2938e.f10601j.m34420a(false, false);
                }
                c2938e.f10601j.setOnSwitchListener(this);
                c2938e.f10601j.setTag(Integer.valueOf(EnumC2937d.FT_TRUN.ordinal()));
                c2938e.f10597f.setVisibility(4);
                ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                layoutParams5.height = (int) this.f10545e.getResources().getDimension(C1704R.dimen.setting_adapt_switch);
                c2938e.f10600i.setLayoutParams(layoutParams5);
            } else if (settingAdaptState == EnumC2937d.IMU_DETECTION) {
                c2938e.f10602k.setVisibility(4);
                if (!this.f10546f.get(m29885a(EnumC2937d.IMU_DETECTION)).getIsOPen().booleanValue()) {
                    c2938e.f10594c.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
                    c2938e.f10593b.setAlpha(0.3f);
                    c2938e.f10597f.setAlpha(0.3f);
                }
                c2938e.f10593b.setVisibility(0);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_imu);
                c2938e.f10596e.setVisibility(0);
                c2938e.f10595d.setVisibility(4);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10594c.setText(this.f10545e.getString(C1704R.C1707string.title_imu));
                c2938e.f10596e.setText("");
            }
            if (settingAdaptState == EnumC2937d.REMOTE) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10592a.setVisibility(0);
                c2938e.f10592a.setText(C1704R.C1707string.remotecontrol);
                c2938e.f10597f.setVisibility(4);
                c2938e.f10594c.setVisibility(4);
                c2938e.f10593b.setVisibility(4);
                c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
            }
            if (settingAdaptState == EnumC2937d.CALIBRATION_REMOTE) {
                c2938e.f10602k.setVisibility(4);
                if (!this.f10546f.get(m29885a(EnumC2937d.CALIBRATION_REMOTE)).getIsOPen().booleanValue()) {
                    c2938e.f10594c.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
                    c2938e.f10593b.setAlpha(0.3f);
                    c2938e.f10597f.setAlpha(0.3f);
                }
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.the_remote_control_of_calibration);
                c2938e.f10594c.setText(C1704R.C1707string.calibration_remote);
            }
            if (settingAdaptState == EnumC2937d.SWITCH_REMOTE_MODE) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.switch_the_remote_control);
                c2938e.f10594c.setText(C1704R.C1707string.switch_remote_mode);
                c2938e.f10598g.setVisibility(0);
                c2938e.f10598g.setText(this.f10546f.get(m29885a(EnumC2937d.SWITCH_REMOTE_MODE)).getContent());
            }
            if (settingAdaptState == EnumC2937d.BATTERY) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10592a.setVisibility(0);
                c2938e.f10592a.setText(C1704R.C1707string.battery);
                c2938e.f10597f.setVisibility(4);
                c2938e.f10594c.setVisibility(4);
                c2938e.f10593b.setVisibility(4);
                c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
            }
            if (settingAdaptState == EnumC2937d.SWITCH_RIGHT_MODE) {
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10594c.setText(C1704R.C1707string.right_scroll_mode);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_right_pulley_mode);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10601j.setVisibility(8);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10598g.setText(this.f10546f.get(m29885a(EnumC2937d.SWITCH_RIGHT_MODE)).getContent());
                c2938e.f10598g.setVisibility(0);
            }
            if (settingAdaptState == EnumC2937d.BATTERY_INFO) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_battery_parameters);
                c2938e.f10594c.setText(C1704R.C1707string.battery_info);
            }
            if (settingAdaptState == EnumC2937d.GIMBAL) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10592a.setVisibility(0);
                c2938e.f10592a.setText(C1704R.C1707string.gimbal);
                c2938e.f10597f.setVisibility(4);
                c2938e.f10594c.setVisibility(4);
                c2938e.f10593b.setVisibility(4);
                c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
            }
            if (settingAdaptState == EnumC2937d.GIMBAL_CALIBRATION) {
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.gimbal_calibration);
                c2938e.f10594c.setText(C1704R.C1707string.gimbal_calibration);
            }
            if (settingAdaptState == EnumC2937d.GIMBAL_TUNE_PARAMETER) {
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_setup_adjust);
                c2938e.f10594c.setText(C1704R.C1707string.gimbal_tune_parameter);
            }
            if (settingAdaptState == EnumC2937d.MAP) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10592a.setVisibility(0);
                c2938e.f10592a.setText(C1704R.C1707string.map);
                c2938e.f10597f.setVisibility(4);
                c2938e.f10594c.setVisibility(4);
                c2938e.f10593b.setVisibility(4);
                c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
            }
            if (settingAdaptState == EnumC2937d.SATELLITE_MAP) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.satellite_map);
                c2938e.f10594c.setText(C1704R.C1707string.sattlite_map);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10601j.setVisibility(0);
                if (C1981o.m33342a(this.f10545e).m33334e()) {
                    c2938e.f10601j.m34420a(true, false);
                } else {
                    c2938e.f10601j.m34420a(false, false);
                }
                c2938e.f10601j.setOnSwitchListener(this);
                c2938e.f10601j.setTag(Integer.valueOf(m29885a(EnumC2937d.SATELLITE_MAP)));
                c2938e.f10597f.setVisibility(4);
            }
            if (settingAdaptState == EnumC2937d.CAMERA) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10592a.setVisibility(0);
                c2938e.f10592a.setText(C1704R.C1707string.camera);
                c2938e.f10597f.setVisibility(4);
                c2938e.f10594c.setVisibility(4);
                c2938e.f10593b.setVisibility(4);
                c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
            }
            if (settingAdaptState == EnumC2937d.CAMERA_SETTING) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.camera_settings);
                c2938e.f10594c.setText(C1704R.C1707string.camera_setting);
            }
            if (settingAdaptState == EnumC2937d.ACCOUNT) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10592a.setVisibility(0);
                c2938e.f10592a.setText(C1704R.C1707string.account);
                c2938e.f10597f.setVisibility(4);
                c2938e.f10594c.setVisibility(4);
                c2938e.f10593b.setVisibility(4);
                c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
            }
            if (settingAdaptState == EnumC2937d.FLIGHT_RECORD) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_fly_record);
                c2938e.f10594c.setText(C1704R.C1707string.flight_record);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10597f.setVisibility(0);
            }
            if (settingAdaptState == EnumC2937d.FLIGHT_INFO) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_fly_log);
                c2938e.f10594c.setText(C1704R.C1707string.fly_logs);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10597f.setVisibility(0);
            }
            if (settingAdaptState == EnumC2937d.XIAOMI_ACCOUNT) {
                c2938e.f10602k.setVisibility(4);
                if (this.f10546f.get(m29885a(EnumC2937d.XIAOMI_ACCOUNT)).getIsOPen().booleanValue()) {
                    c2938e.f10598g.setText(this.f10546f.get(m29885a(EnumC2937d.XIAOMI_ACCOUNT)).getContent());
                    c2938e.f10597f.setVisibility(4);
                } else {
                    c2938e.f10598g.setText(C1704R.C1707string.exited);
                    c2938e.f10597f.setVisibility(0);
                }
                c2938e.f10594c.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.mi_id);
                c2938e.f10594c.setText(C1704R.C1707string.xiaomi_account);
                c2938e.f10598g.setVisibility(0);
            }
            if (settingAdaptState == EnumC2937d.USER_FEEDBACK) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_feedback);
                c2938e.f10594c.setText(C1704R.C1707string.user_feedback);
            }
            if (settingAdaptState == EnumC2937d.CHECK_UPDATE) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.check_update);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10594c.setText(C1704R.C1707string.checkupdate);
                c2938e.f10594c.setVisibility(0);
                if (!this.f10546f.get(m29885a(EnumC2937d.CHECK_UPDATE)).getIsOPen().booleanValue()) {
                    c2938e.f10599h.setVisibility(0);
                    c2938e.f10598g.setVisibility(0);
                    c2938e.f10598g.setText(this.f10545e.getString(C1704R.C1707string.have_update) + this.f10546f.get(m29885a(EnumC2937d.CHECK_UPDATE)).getContent());
                }
            }
            if (settingAdaptState == EnumC2937d.ABOUT) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.about_icon);
                c2938e.f10594c.setText(C1704R.C1707string.about);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10597f.setVisibility(0);
            }
            if (settingAdaptState == EnumC2937d.HISTORY_MESSAGE) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_message);
                c2938e.f10594c.setText(C1704R.C1707string.setting_history_message);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10597f.setVisibility(0);
            }
            if (settingAdaptState == EnumC2937d.BOTTOM_EDGE_LABLE) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10597f.setVisibility(4);
                c2938e.f10593b.setVisibility(4);
                c2938e.f10601j.setVisibility(4);
                c2938e.f10599h.setVisibility(4);
                c2938e.f10598g.setVisibility(4);
                c2938e.f10595d.setVisibility(4);
                c2938e.f10596e.setVisibility(4);
                c2938e.f10594c.setVisibility(4);
                ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                layoutParams6.height = (int) this.f10545e.getResources().getDimension(C1704R.dimen.setting_adapt_bottom);
                c2938e.f10600i.setLayoutParams(layoutParams6);
                c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
            }
            if (settingAdaptState == EnumC2937d.PAIR_REMOTE) {
                c2938e.f10602k.setVisibility(4);
                if (!this.f10546f.get(m29885a(EnumC2937d.CALIBRATION_REMOTE)).getIsOPen().booleanValue()) {
                    c2938e.f10594c.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
                    c2938e.f10593b.setAlpha(0.3f);
                    c2938e.f10597f.setAlpha(0.3f);
                }
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.icon_match_code);
                c2938e.f10594c.setText(C1704R.C1707string.pair_setting_item);
            }
            if (settingAdaptState == EnumC2937d.RELAY_WIFI_CONFIGURE) {
                c2938e.f10602k.setVisibility(4);
                if (!this.f10546f.get(m29885a(EnumC2937d.CALIBRATION_REMOTE)).getIsOPen().booleanValue()) {
                    c2938e.f10594c.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
                    c2938e.f10593b.setAlpha(0.3f);
                    c2938e.f10597f.setAlpha(0.3f);
                }
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.setting_wifi_configure_icon);
                c2938e.f10594c.setText(C1704R.C1707string.relay_wifi_dialog);
            }
            if (settingAdaptState == EnumC2937d.FRONTLIGHTSSETTING) {
                if (!this.f10546f.get(m29885a(EnumC2937d.FRONTLIGHTSSETTING)).getIsOPen().booleanValue()) {
                    c2938e.f10594c.setTextColor(this.f10545e.getResources().getColor(C1704R.color.setting_ash));
                    c2938e.f10600i.setBackgroundResource(C1704R.color.list_nomal);
                    c2938e.f10593b.setAlpha(0.3f);
                    c2938e.f10597f.setAlpha(0.3f);
                }
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(0);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10602k.setVisibility(4);
                c2938e.f10593b.setBackgroundResource(C1704R.C1705drawable.white_brightness_icon);
                c2938e.f10594c.setText(C1704R.C1707string.front_lights_setting);
            }
            if (settingAdaptState == EnumC2937d.MAP_CODE_CORREECTION) {
                c2938e.f10602k.setVisibility(4);
                c2938e.f10597f.setVisibility(0);
                c2938e.f10594c.setVisibility(4);
                c2938e.f10592a.setVisibility(4);
                c2938e.f10593b.setBackgroundResource(C1704R.mipmap.icon_map_correction);
                c2938e.f10595d.setText(C1704R.C1707string.map_code_correction);
                c2938e.f10596e.setText(C1704R.C1707string.map_code_correction_child);
                c2938e.f10595d.setVisibility(0);
                c2938e.f10596e.setVisibility(0);
                c2938e.f10593b.setVisibility(0);
                c2938e.f10601j.setVisibility(0);
                SharedPreferences m34546a = C1681v.m34543a(this.f10547g.f5919d).m34546a();
                C2022a m33223a = C2022a.m33223a();
                if (m34546a.getBoolean(C2279c.f7238bN, false)) {
                    c2938e.f10601j.m34420a(true, false);
                    m33223a.m33222a(false);
                } else {
                    c2938e.f10601j.m34420a(false, false);
                    m33223a.m33222a(true);
                }
                c2938e.f10601j.setOnSwitchListener(this);
                c2938e.f10601j.setTag(Integer.valueOf(EnumC2937d.MAP_CODE_CORREECTION.ordinal()));
                c2938e.f10597f.setVisibility(4);
                ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
                layoutParams7.height = (int) this.f10545e.getResources().getDimension(C1704R.dimen.setting_adapt_switch);
                c2938e.f10600i.setLayoutParams(layoutParams7);
            }
        }
        return view;
    }
}
