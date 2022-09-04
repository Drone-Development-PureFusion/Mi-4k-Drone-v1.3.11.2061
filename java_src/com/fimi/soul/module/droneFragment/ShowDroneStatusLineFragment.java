package com.fimi.soul.module.droneFragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.app.Fragment;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.kernel.utils.C1681v;
import com.fimi.overseas.soul.C1704R;
import com.fimi.p140a.AbstractC1493b;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p180h.AbstractC1858e;
import com.fimi.soul.biz.p180h.C1851b;
import com.fimi.soul.biz.p180h.C1853d;
import com.fimi.soul.biz.p180h.C1862h;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2365x;
import com.fimi.soul.entity.ErrorMode;
import com.fimi.soul.module.calibcompass.CaliCompassActivity;
import com.fimi.soul.module.droneui.DialogC2752a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.module.remote.RemoteCalibration;
import com.fimi.soul.module.setting.newhand.C2954b;
import com.fimi.soul.utils.C3075ad;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3107av;
import com.fimi.soul.view.AutoScrollTextView;
import com.fimi.soul.view.C3238d;
import com.google.firebase.p251a.C9654a;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class ShowDroneStatusLineFragment extends Fragment implements Handler.Callback, View.OnClickListener, AbstractC1858e, C2104d.AbstractC2106b {

    /* renamed from: O */
    private static final String f8574O = "ShowDroneStatusLineFrag";

    /* renamed from: a */
    public static boolean f8575a = false;

    /* renamed from: B */
    private C2523d f8577B;

    /* renamed from: D */
    private Timer f8579D;

    /* renamed from: E */
    private Button f8580E;

    /* renamed from: F */
    private ImageView f8581F;

    /* renamed from: G */
    private C1853d f8582G;

    /* renamed from: H */
    private C1862h f8583H;

    /* renamed from: I */
    private C3238d f8584I;

    /* renamed from: J */
    private C1851b f8585J;

    /* renamed from: K */
    private String f8586K;

    /* renamed from: M */
    private ErrorMode f8588M;

    /* renamed from: N */
    private boolean f8589N;

    /* renamed from: P */
    private FlightActivity.AbstractC2736a f8590P;

    /* renamed from: b */
    C1681v f8591b;

    /* renamed from: i */
    private DroidPlannerApp f8598i;

    /* renamed from: j */
    private C2083a f8599j;

    /* renamed from: k */
    private DialogC2752a f8600k;

    /* renamed from: l */
    private Context f8601l;

    /* renamed from: m */
    private TextView f8602m;

    /* renamed from: n */
    private TextView f8603n;

    /* renamed from: o */
    private AutoScrollTextView f8604o;

    /* renamed from: p */
    private LinearLayout f8605p;

    /* renamed from: q */
    private Button f8606q;

    /* renamed from: r */
    private ImageView f8607r;

    /* renamed from: s */
    private ImageView f8608s;

    /* renamed from: t */
    private ImageView f8609t;

    /* renamed from: u */
    private ImageView f8610u;

    /* renamed from: v */
    private ImageView f8611v;

    /* renamed from: w */
    private ImageView f8612w;

    /* renamed from: x */
    private final int f8613x = 0;

    /* renamed from: y */
    private final int f8614y = 1;

    /* renamed from: z */
    private final int f8615z = 2;

    /* renamed from: A */
    private Handler f8576A = new Handler(this);

    /* renamed from: C */
    private boolean f8578C = false;

    /* renamed from: L */
    private Observer f8587L = new Observer() { // from class: com.fimi.soul.module.droneFragment.ShowDroneStatusLineFragment.1
        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            Point point = new Point();
            Display defaultDisplay = ShowDroneStatusLineFragment.this.getActivity().getWindow().getWindowManager().getDefaultDisplay();
            defaultDisplay.getSize(point);
            if (ShowDroneStatusLineFragment.this.f8580E.isShown() || ShowDroneStatusLineFragment.this.f8606q.isShown()) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ShowDroneStatusLineFragment.this.f8605p.getLayoutParams();
                layoutParams.width = defaultDisplay.getWidth() * 0;
                layoutParams.addRule(0, ShowDroneStatusLineFragment.this.f8580E.getId());
                layoutParams.setMargins((int) (defaultDisplay.getHeight() * 0.15d), 0, (int) (defaultDisplay.getHeight() * 0.15d), 0);
                layoutParams.addRule(1, ShowDroneStatusLineFragment.this.f8607r.getId());
                ShowDroneStatusLineFragment.this.f8605p.setLayoutParams(layoutParams);
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) ShowDroneStatusLineFragment.this.f8605p.getLayoutParams();
            layoutParams2.width = defaultDisplay.getWidth() * 0;
            layoutParams2.addRule(0, ShowDroneStatusLineFragment.this.f8610u.getId());
            layoutParams2.setMargins((int) (defaultDisplay.getHeight() * 0.15d), 0, (int) (defaultDisplay.getHeight() * 0.15d), 0);
            layoutParams2.addRule(1, ShowDroneStatusLineFragment.this.f8607r.getId());
            ShowDroneStatusLineFragment.this.f8605p.setLayoutParams(layoutParams2);
        }
    };

    /* renamed from: c */
    int f8592c = 0;

    /* renamed from: d */
    int f8593d = 0;

    /* renamed from: e */
    long f8594e = 0;

    /* renamed from: f */
    boolean f8595f = false;

    /* renamed from: g */
    int f8596g = 0;

    /* renamed from: h */
    int f8597h = 0;

    /* renamed from: a */
    private void m31157a(int i, int i2, int i3) {
        if (this.f8600k != null && this.f8600k.isShowing()) {
            this.f8600k.dismiss();
            this.f8600k = null;
        }
        this.f8600k = new DialogC2752a(getActivity(), getString(i), getString(i2), i3, 3, false, new DialogC2752a.AbstractC2755a() { // from class: com.fimi.soul.module.droneFragment.ShowDroneStatusLineFragment.4
            @Override // com.fimi.soul.module.droneui.DialogC2752a.AbstractC2755a
            /* renamed from: a */
            public void mo29725a() {
                if (ShowDroneStatusLineFragment.this.f8600k != null) {
                    ShowDroneStatusLineFragment.this.f8600k.dismiss();
                    ShowDroneStatusLineFragment.this.f8600k = null;
                }
            }

            @Override // com.fimi.soul.module.droneui.DialogC2752a.AbstractC2755a
            /* renamed from: b */
            public void mo29724b() {
            }

            @Override // com.fimi.soul.module.droneui.DialogC2752a.AbstractC2755a
            /* renamed from: c */
            public void mo29723c() {
            }

            @Override // com.fimi.soul.module.droneui.DialogC2752a.AbstractC2755a
            /* renamed from: d */
            public void mo29722d() {
                if (ShowDroneStatusLineFragment.this.f8600k != null) {
                    ShowDroneStatusLineFragment.this.f8600k.dismiss();
                    ShowDroneStatusLineFragment.this.f8600k = null;
                }
            }
        });
        this.f8600k.setCancelable(true);
        this.f8600k.show();
    }

    @TargetApi(16)
    /* renamed from: a */
    private void m31156a(C2365x c2365x) {
        int i;
        int i2;
        int i3;
        int i4 = C1704R.C1707string.des_sky_landing_BAT_LOWPOWER;
        int i5 = 0;
        if (c2365x.m31810S()) {
            if (this.f8599j.m33001au().m32392e() == 7 || this.f8599j.m33001au().m32392e() == 8) {
                i3 = C1704R.C1707string.sky_lowpower_return;
                i4 = C1704R.C1707string.sky_lowpower_return_result;
            } else if (this.f8599j.m33001au().m32392e() == 9) {
                i3 = C1704R.C1707string.sky_landing_BAT_LOWPOWER;
            } else {
                i3 = C1704R.C1707string.sky_LOWPOWER;
                i4 = C1704R.C1707string.sky_LOWPOWER_result;
            }
            i = C1704R.C1705drawable.low_battery;
            i5 = i3;
            i2 = C1704R.C1707string.sky_LOWPOWER_title;
        } else if (this.f8599j.m32979j() != null && (this.f8599j.m32979j().m32411b() == 1 || this.f8599j.m32979j().m32411b() == 3)) {
            switch (this.f8599j.m32979j().m32411b()) {
                case 1:
                    i5 = C1704R.C1707string.sky_no_fly_error;
                    i2 = C1704R.C1707string.sky_no_fly_error_title;
                    i4 = C1704R.C1707string.sky_no_fly_result;
                    break;
                case 2:
                    i5 = C1704R.C1707string.restricted_alttiude_zone;
                    i2 = C1704R.C1707string.restricted_alttiude_zone_title;
                    i4 = C1704R.C1707string.sky_no_fly_result;
                    break;
                case 3:
                    i2 = C1704R.C1707string.sky_land_error_title;
                    i5 = C1704R.C1707string.sky_land_error;
                    break;
                default:
                    i4 = C1704R.C1707string.fault_back_battery_des;
                    i2 = 0;
                    break;
            }
            i = C1704R.C1705drawable.no_fly_zone;
        } else if (c2365x.m31763m()) {
            i5 = C1704R.C1707string.sky_BATTERY_ERROR;
            i2 = C1704R.C1707string.sky_BATTERY_ERROR_title;
            i4 = C1704R.C1707string.sky_BATTERY_ERROR_result;
            i = C1704R.C1705drawable.battery_abnormal;
        } else if (c2365x.m31770f() && !this.f8599j.m33001au().m32390g().isLightStream()) {
            i5 = C1704R.C1707string.sky_GPS_ERROR;
            i2 = C1704R.C1707string.sky_GPS_ERROR_title;
            i4 = C1704R.C1707string.sky_GPS_ERROR_result;
            i = C1704R.C1705drawable.plane_fall_bg;
        } else if (c2365x.m31823F()) {
            i5 = C1704R.C1707string.sky_bat_damage;
            i2 = C1704R.C1707string.title_bat_damage;
            i4 = C1704R.C1707string.result_bat_damage;
            i = C1704R.C1705drawable.battery_abnormal;
        } else if (c2365x.m31824E()) {
            i5 = C1704R.C1707string.sky_bat_dischage_warning;
            i2 = C1704R.C1707string.title_bat_dischage_warning;
            i4 = C1704R.C1707string.result_bat_dischage_warning;
            i = C1704R.C1705drawable.battery_abnormal;
        } else if (c2365x.m31821H()) {
            i5 = C1704R.C1707string.sky_desc_bat_comm_error;
            i2 = C1704R.C1707string.sky_bat_comm_error;
            i4 = C1704R.C1707string.sky_desc_bat_comm_error2;
            i = C1704R.C1705drawable.battery_abnormal;
        } else if (c2365x.m31792ah()) {
            i5 = C1704R.C1707string.shortlife_sky_BATTERY_ERROR;
            i2 = C1704R.C1707string.shortlife_sky__BATTERY_ERROR_title;
            i4 = C1704R.C1707string.shortlife_sky__BATTERY_ERROR_result;
            i = C1704R.C1705drawable.battery_abnormal;
        } else if (this.f8599j.m33001au().m32390g().isLightStream() && c2365x.m31760p()) {
            i5 = C1704R.C1707string.sky_VPS_ERROR;
            i2 = C1704R.C1707string.sky_VPS_ERROR_title;
            i4 = C1704R.C1707string.sky_VPS_ERROR_result;
            i = C1704R.C1705drawable.plane_fall_bg;
        } else if (c2365x.m31811R()) {
            i5 = C1704R.C1707string.sky_LP_RETURN;
            i2 = C1704R.C1707string.sky_LP_RETURN_title;
            i4 = C1704R.C1707string.sky_LP_RETURN_result;
            i = C1704R.C1705drawable.plane_fall_bg;
        } else if (c2365x.m31812Q()) {
            i5 = C1704R.C1707string.sky_BAT_light_LOWPOWER;
            i2 = C1704R.C1707string.sky_BAT_light_LOWPOWER_title;
            i4 = C1704R.C1707string.sky_BAT_light_LOWPOWER_result;
            i = C1704R.C1705drawable.plane_fall_bg;
        } else if (!c2365x.m31806W()) {
            this.f8593d = 0;
            return;
        } else {
            i = C1704R.C1705drawable.img_warning_rocker;
            i2 = C1704R.C1707string.stick_move_warning_title;
            i4 = C1704R.C1707string.stick_move_warning_result;
            i5 = C1704R.C1707string.stick_move_warning_des;
        }
        if (this.f8593d != i5 && i != 0 && i2 != 0) {
            m31157a(i2, i4, i);
        }
        this.f8593d = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public float m31144b(String str) {
        new DisplayMetrics();
        float f = getResources().getDisplayMetrics().density;
        TextPaint textPaint = new TextPaint();
        Rect rect = new Rect();
        textPaint.setTextSize(13.0f);
        textPaint.getTextBounds(str, 0, str.length(), rect);
        return f * rect.width();
    }

    /* renamed from: b */
    private void m31149b() {
        this.f8611v.setVisibility(0);
    }

    /* renamed from: b */
    private void m31147b(int i, int i2) {
        this.f8606q.setVisibility(i2);
        if (!getString(i).equals(this.f8606q.getText().toString())) {
            this.f8606q.setText(i);
        }
        this.f8609t.setVisibility(i2);
        this.f8606q.setEnabled(true);
        this.f8585J.m33908a(true);
    }

    /* renamed from: c */
    private void m31142c() {
        this.f8611v.setVisibility(4);
    }

    /* renamed from: c */
    private void m31140c(int i, int i2) {
        this.f8606q.setVisibility(i2);
        if (!"".equals(this.f8606q.getText().toString())) {
            this.f8606q.setText("");
        }
        this.f8609t.setVisibility(i2);
        this.f8606q.setEnabled(false);
        this.f8585J.m33908a(false);
    }

    /* renamed from: c */
    private void m31137c(boolean z) {
        this.f8580E.setVisibility(z ? 0 : 4);
        this.f8585J.m33908a(z);
        ImageView imageView = this.f8581F;
        if (z) {
        }
        imageView.setVisibility(4);
    }

    /* renamed from: c */
    private boolean m31138c(String str) {
        if (str == null || !str.contains(":")) {
            return false;
        }
        try {
            Integer.valueOf(str.split(":")[0]).intValue();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    private void m31136d() {
        int i;
        int i2;
        if (!isAdded()) {
            return;
        }
        if (!this.f8599j.mo32905ac() && !this.f8599j.m33022aE()) {
            C1648b.m34863b(C1642c.m34886d()).m34864b();
            return;
        }
        this.f8588M = this.f8583H.m33873a(this.f8599j);
        Log.d(f8574O, "deelErrorUI: mode:" + this.f8588M.getLightErrorList().size() + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f8588M.getSeriousErrorList().size());
        ArrayList lightErrorList = this.f8588M.getLightErrorList();
        if (lightErrorList.size() <= this.f8592c) {
            this.f8592c = 0;
        }
        if (this.f8599j.m33009am()) {
            if (this.f8599j.m33007ao().m31807V()) {
                this.f8597h++;
                if (this.f8597h >= 3) {
                    m31157a(C1704R.C1707string.title_sky_bat_lowpower_dangerous, C1704R.C1707string.des_sky_bat_lowpower_dangerous, C1704R.C1705drawable.plane_fall_bg);
                    C1648b.m34863b(C1642c.m34886d()).m34867a(C1642c.m34886d().getString(C1704R.C1707string.sky_bat_lowpower_dangerous));
                    C3107av.m29182a(C1642c.m34886d(), 2000L);
                    this.f8597h = 0;
                }
            } else if (this.f8599j.m33007ao().m31810S()) {
                this.f8597h++;
                if (this.f8597h >= 4) {
                    if (this.f8599j.m33001au().m32392e() == 7 || this.f8599j.m33001au().m32392e() == 8) {
                        i = C1704R.C1707string.sky_lowpower_return;
                        i2 = C1704R.C1707string.sky_lowpower_return_result;
                    } else if (this.f8599j.m33001au().m32392e() == 9) {
                        i = C1704R.C1707string.sky_landing_BAT_LOWPOWER;
                        i2 = C1704R.C1707string.des_sky_landing_BAT_LOWPOWER;
                    } else {
                        i = C1704R.C1707string.sky_LOWPOWER;
                        i2 = C1704R.C1707string.sky_LOWPOWER_result;
                    }
                    m31157a(C1704R.C1707string.title_sky_landing_BAT_LOWPOWER, i2, C1704R.C1705drawable.plane_fall_bg);
                    C1648b.m34863b(C1642c.m34886d()).m34867a(C1642c.m34886d().getString(i));
                    C3107av.m29182a(C1642c.m34886d(), 2000L);
                    this.f8597h = 0;
                }
            }
        }
        if (lightErrorList == null || lightErrorList.size() <= 0) {
            m31133d("");
            m31142c();
        } else {
            m31149b();
            this.f8604o.setTextColor(getResources().getColor(C1704R.color.warmtextcl));
            m31133d(getText(((Integer) lightErrorList.get(this.f8592c)).intValue()).toString());
        }
        this.f8592c++;
        if ((this.f8588M.isCompassFault() || this.f8588M.isMiddleFault()) && !this.f8599j.m33009am()) {
            m31137c(true);
            this.f8580E.setText(getString(C1704R.C1707string.platform_correct));
            this.f8612w.setVisibility(4);
            return;
        }
        m31137c(false);
        if (this.f8588M.getSeriousErrorList().size() <= 0 || this.f8606q.getVisibility() == 0) {
            this.f8612w.setVisibility(4);
        } else {
            this.f8612w.setVisibility(0);
        }
    }

    /* renamed from: d */
    private void m31135d(int i) {
        if (isAdded()) {
            if (getString(C1704R.C1707string.self_error_result).equals(this.f8602m.getText().toString())) {
                this.f8607r.setImageResource(C1704R.C1705drawable.notnormal_icon);
                this.f8607r.setTag(Integer.valueOf((int) C1704R.C1705drawable.notnormal_icon));
            } else if (this.f8607r.getTag() == null) {
                this.f8607r.setImageResource(i);
                this.f8607r.setTag(Integer.valueOf(i));
            } else if (i == ((Integer) this.f8607r.getTag()).intValue()) {
            } else {
                this.f8607r.setImageResource(i);
                this.f8607r.setTag(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: d */
    private void m31133d(String str) {
        Log.d(f8574O, "changeErrorCode: errorString:" + str + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f8604o.getText().toString());
        if (str == null || str.equals(this.f8604o.getText().toString())) {
            return;
        }
        if (str.equals("")) {
            Log.d(f8574O, "changeErrorCode: 1");
            this.f8604o.setText("");
            this.f8602m.setTextSize(11.0f);
            this.f8604o.setVisibility(8);
            return;
        }
        Log.d(f8574O, "changeErrorCode: 2");
        this.f8602m.setTextSize(9.0f);
        this.f8604o.setVisibility(0);
        this.f8604o.setText(str, TextView.BufferType.NORMAL);
        this.f8604o.setAnimation(AnimationUtils.loadAnimation(this.f8601l, C1704R.anim.push_up_in));
    }

    /* renamed from: e */
    private void m31132e(int i) {
        if (this.f8576A.hasMessages(0) || getString(i).equals(this.f8604o.getText())) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = Integer.valueOf(i);
        this.f8576A.sendMessageDelayed(obtain, 2500L);
    }

    /* renamed from: f */
    private void m31130f(int i) {
        if (i == 0 || getString(i).equals(this.f8602m.getText().toString())) {
            return;
        }
        this.f8602m.setText(i);
    }

    /* renamed from: a */
    public int m31160a() {
        return this.f8596g;
    }

    @Override // com.fimi.soul.biz.p180h.AbstractC1858e
    /* renamed from: a */
    public void mo31159a(int i) {
        m31130f(i);
    }

    @Override // com.fimi.soul.biz.p180h.AbstractC1858e
    /* renamed from: a */
    public void mo31158a(int i, int i2) {
        if (i > 0) {
            m31147b(i, i2);
        } else {
            m31140c(i, i2);
        }
    }

    /* renamed from: a */
    public void m31152a(FlightActivity.AbstractC2736a abstractC2736a) {
        this.f8590P = abstractC2736a;
    }

    /* renamed from: a */
    public void m31151a(String str) {
        if (m31138c(str)) {
            if (getActivity() != null) {
                C3103au.m29218b(getActivity().getAssets(), this.f8603n);
            }
            this.f8603n.setTextSize(1, 16.5f);
            this.f8603n.setPadding(0, 0, 0, 0);
            this.f8608s.setVisibility(0);
        } else {
            if (getActivity() != null) {
                C3103au.m29232a(getActivity().getAssets(), this.f8603n);
            }
            this.f8603n.setTextSize(1, 13.0f);
            this.f8603n.setTextColor(-1);
            this.f8603n.setPadding(0, (int) ((14.0f * getResources().getDisplayMetrics().density) / 3.0f), 0, 0);
            this.f8608s.setVisibility(4);
        }
        this.f8603n.setText(str);
    }

    /* renamed from: a */
    public void m31150a(boolean z) {
        if (z && System.currentTimeMillis() - this.f8594e >= 800) {
            this.f8594e = System.currentTimeMillis();
            if (this.f8595f) {
                this.f8595f = false;
                this.f8608s.setImageDrawable(null);
            } else {
                this.f8595f = true;
                this.f8608s.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.record_time_red_dot));
            }
            this.f8603n.setAlpha(1.0f);
            this.f8608s.invalidate();
        }
        if (!z) {
            this.f8608s.setImageDrawable(getResources().getDrawable(C1704R.C1705drawable.gray_point));
            this.f8603n.setAlpha(0.3f);
        }
    }

    @Override // com.fimi.soul.biz.p180h.AbstractC1858e
    /* renamed from: b */
    public void mo31148b(int i) {
        m31135d(i);
    }

    /* renamed from: b */
    public void m31143b(boolean z) {
        this.f8589N = z;
    }

    /* renamed from: c */
    public void m31141c(int i) {
        if (i <= 0) {
            return;
        }
        this.f8596g = i;
        m31151a(getString(i));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            if (!this.f8599j.mo32905ac()) {
                return false;
            }
            m31133d(getString(((Integer) message.obj).intValue()));
            return false;
        } else if (message.what == 1) {
            m31136d();
            return false;
        } else if (message.what != 2) {
            return false;
        } else {
            m31135d(C1704R.C1705drawable.normal_icon);
            this.f8602m.setText(getString(C1704R.C1707string.self_vps_ok_result));
            return false;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8598i = (DroidPlannerApp) activity.getApplication();
        this.f8599j = this.f8598i.f4493a;
        this.f8601l = activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.fault_bnt /* 2131756242 */:
                this.f8588M = this.f8583H.m33873a(this.f8599j);
                this.f8584I.m28662a(this.f8588M.getSeriousErrorList(), view, (int) getResources().getDimension(C1704R.dimen.popuwindows_xoff), (int) getResources().getDimension(C1704R.dimen.popuwindows_yoff));
                return;
            case C1704R.C1706id.linestart /* 2131756243 */:
            case C1704R.C1706id.linecalibration /* 2131756244 */:
            case C1704R.C1706id.camertime /* 2131756247 */:
            default:
                return;
            case C1704R.C1706id.dronemoelbutton /* 2131756245 */:
                if (this.f8599j.mo32906ab().mo32588a() && this.f8599j.mo32905ac()) {
                    this.f8577B.m31367d();
                    this.f8599j.mo32909a(C2104d.EnumC2105a.NOTIDRONEAIR);
                    return;
                }
                this.f8591b.m34546a().edit().putBoolean(C1756a.f4519L, false).commit();
                Intent intent = new Intent(this.f8601l, LoginActivity.class);
                intent.putExtra(AbstractC1493b.f3577j, 2);
                intent.putExtra(C9654a.C9655a.f30195k, false);
                startActivity(intent);
                return;
            case C1704R.C1706id.compass_calibration /* 2131756246 */:
                if (this.f8588M != null && this.f8588M.isMiddleFault()) {
                    startActivity(new Intent(getActivity(), RemoteCalibration.class));
                    return;
                } else if (this.f8588M == null || !this.f8588M.isCompassFault()) {
                    return;
                } else {
                    Intent intent2 = new Intent(getActivity(), CaliCompassActivity.class);
                    intent2.putExtra(C1756a.f4525R, true);
                    startActivity(intent2);
                    return;
                }
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8583H = C1862h.m33874a();
        this.f8585J = new C1851b();
        this.f8585J.addObserver(this.f8587L);
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.showstatusline, (ViewGroup) null);
        this.f8602m = (TextView) inflate.findViewById(C1704R.C1706id.dronestuts);
        this.f8602m.getPaint().setFakeBoldText(true);
        this.f8611v = (ImageView) inflate.findViewById(C1704R.C1706id.divide_line);
        this.f8604o = (AutoScrollTextView) inflate.findViewById(C1704R.C1706id.dronerrorcode);
        this.f8605p = (LinearLayout) inflate.findViewById(C1704R.C1706id.ll_erroe_hint);
        this.f8603n = (TextView) inflate.findViewById(C1704R.C1706id.camertime);
        this.f8603n.setOnClickListener(this);
        this.f8606q = (Button) inflate.findViewById(C1704R.C1706id.dronemoelbutton);
        this.f8606q.setOnClickListener(this);
        this.f8580E = (Button) inflate.findViewById(C1704R.C1706id.compass_calibration);
        this.f8580E.setOnClickListener(this);
        this.f8607r = (ImageView) inflate.findViewById(C1704R.C1706id.headview);
        this.f8608s = (ImageView) inflate.findViewById(C1704R.C1706id.camericon);
        this.f8609t = (ImageView) inflate.findViewById(C1704R.C1706id.linestart);
        this.f8610u = (ImageView) inflate.findViewById(C1704R.C1706id.lineend);
        this.f8581F = (ImageView) inflate.findViewById(C1704R.C1706id.linecalibration);
        this.f8612w = (ImageView) inflate.findViewById(C1704R.C1706id.fault_bnt);
        this.f8612w.setOnClickListener(this);
        C3103au.m29232a(getActivity().getAssets(), this.f8602m, this.f8604o, this.f8606q);
        C3103au.m29218b(getActivity().getAssets(), this.f8603n);
        this.f8577B = C2523d.m31374a(this.f8599j);
        m31141c(C1704R.C1707string.fault_camera);
        this.f8584I = new C3238d(getActivity(), (int) getResources().getDimension(C1704R.dimen.popuwindows_w), C2954b.f10826ao);
        f8575a = true;
        this.f8604o.m28992a(0.0f);
        this.f8604o.setEnabled(false);
        this.f8604o.addTextChangedListener(new TextWatcher() { // from class: com.fimi.soul.module.droneFragment.ShowDroneStatusLineFragment.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!"".equals(charSequence.toString())) {
                    ShowDroneStatusLineFragment.this.f8586K = charSequence.toString();
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if ("".equals(charSequence.toString()) || charSequence.toString().equals(ShowDroneStatusLineFragment.this.f8586K)) {
                    return;
                }
                int measuredWidth = ShowDroneStatusLineFragment.this.f8604o.getMeasuredWidth();
                new Paint().setTextSize(ShowDroneStatusLineFragment.this.f8604o.getTextSize());
                if (ShowDroneStatusLineFragment.this.m31144b(charSequence.toString()) <= measuredWidth - ShowDroneStatusLineFragment.this.getResources().getInteger(C1704R.integer.integer_marquee_value)) {
                    ShowDroneStatusLineFragment.this.f8604o.m28991b();
                } else if (ShowDroneStatusLineFragment.this.f8604o.f11878b) {
                } else {
                    ShowDroneStatusLineFragment.this.f8576A.postDelayed(new Runnable() { // from class: com.fimi.soul.module.droneFragment.ShowDroneStatusLineFragment.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ShowDroneStatusLineFragment.this.f8604o.m28993a();
                        }
                    }, 1000L);
                }
            }
        });
        this.f8579D = new Timer();
        this.f8579D.schedule(new TimerTask() { // from class: com.fimi.soul.module.droneFragment.ShowDroneStatusLineFragment.3
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                ShowDroneStatusLineFragment.this.f8576A.sendEmptyMessage(1);
            }
        }, 0L, 4000L);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8585J.deleteObserver(this.f8587L);
        this.f8599j.mo32903b(this);
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (c2083a.mo32905ac() && c2083a.mo32906ab().mo32588a()) {
            this.f8578C = true;
            if (getResources().getColor(C1704R.color.white) != this.f8602m.getCurrentTextColor()) {
                this.f8602m.setTextColor(getResources().getColor(C1704R.color.white));
            }
            switch (enumC2105a) {
                case Remotecontrol:
                case NOFLYZONE:
                default:
                    return;
                case ERROR_CODE:
                    C2365x m33007ao = c2083a.m33007ao();
                    if (m33007ao.m31802a() < 0 && c2083a.m32979j() == null) {
                        this.f8593d = 0;
                        this.f8612w.setVisibility(4);
                        return;
                    } else if (c2083a.m33009am()) {
                        m31156a(m33007ao);
                        return;
                    } else {
                        this.f8593d = 0;
                        return;
                    }
            }
        }
        switch (enumC2105a) {
            case Remotecontrol:
                if (!c2083a.mo32905ac()) {
                    C3075ad.m29357d();
                    this.f8602m.setTextColor(getResources().getColor(C1704R.color.white));
                    m31135d(C1704R.C1705drawable.notnormal_icon);
                    this.f8602m.setText(C1704R.C1707string.uncondrone);
                    this.f8606q.setVisibility(4);
                    if (this.f8588M != null && !this.f8588M.isMiddleFault()) {
                        m31137c(false);
                    }
                    this.f8609t.setVisibility(4);
                    break;
                }
                break;
            case CLEANALLOBJ:
                C3075ad.m29357d();
                this.f8602m.setText(C1704R.C1707string.dis_connect_phone);
                m31133d("");
                m31135d(C1704R.C1705drawable.notnormal_red_icon);
                this.f8602m.setTextColor(getResources().getColor(C1704R.color.errortextcl));
                this.f8606q.setVisibility(0);
                m31137c(false);
                m31147b(C1704R.C1707string.connectagain, 0);
                this.f8609t.setVisibility(0);
                if (this.f8578C && c2083a.m33009am()) {
                    this.f8578C = false;
                    C1648b.m34863b(getActivity()).m34867a(getString(C1704R.C1707string.dis_connect_phone));
                    break;
                }
                break;
        }
        m31133d("");
        this.f8611v.setVisibility(4);
        if (this.f8588M != null && this.f8588M.getLightErrorList().size() == 0) {
            m31133d("");
            m31142c();
            this.f8604o.m28992a(0.0f);
            this.f8604o.m28991b();
        }
        this.f8612w.setVisibility(4);
        this.f8596g = 0;
        this.f8593d = 0;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8591b = C1681v.m34543a(getActivity());
        if (this.f8582G == null) {
            this.f8582G = new C1853d(this, this.f8599j, getActivity());
        }
        this.f8599j.mo32908a(this);
        this.f8582G.m33899c();
        this.f8582G.m33895e();
        if (this.f8599j.mo32905ac() || this.f8599j.mo32906ab().mo32588a()) {
            return;
        }
        m31147b(C1704R.C1707string.connect_rn, 0);
        this.f8602m.setText(C1704R.C1707string.connectdefault);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
        this.f8582G.m33897d();
    }
}
