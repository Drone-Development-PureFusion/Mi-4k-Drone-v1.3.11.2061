package com.fimi.soul.p168b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1663g;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.entity.X11DeviceInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.C2336f;
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.entity.DeviceType;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.view.DialogC3245f;
import java.io.File;
/* renamed from: com.fimi.soul.b.b */
/* loaded from: classes.dex */
public class C1717b extends BaseAdapter implements AdapterView.OnItemClickListener, AbstractC1792f<X11RespCmd> {

    /* renamed from: b */
    private static final float f4313b = 0.064f;

    /* renamed from: a */
    ListView f4314a;

    /* renamed from: c */
    private Context f4315c;

    /* renamed from: e */
    private int f4317e;

    /* renamed from: f */
    private int f4318f;

    /* renamed from: g */
    private int f4319g;

    /* renamed from: h */
    private int f4320h;

    /* renamed from: i */
    private boolean f4321i;

    /* renamed from: j */
    private String f4322j;

    /* renamed from: k */
    private String f4323k;

    /* renamed from: p */
    private boolean f4328p;

    /* renamed from: r */
    private C2083a f4330r;

    /* renamed from: s */
    private SharedPreferences f4331s;

    /* renamed from: t */
    private AbstractC1725a f4332t;

    /* renamed from: m */
    private boolean f4325m = true;

    /* renamed from: n */
    private boolean f4326n = false;

    /* renamed from: o */
    private boolean f4327o = false;

    /* renamed from: q */
    private boolean f4329q = true;

    /* renamed from: d */
    private C1827d f4316d = (C1827d) C1783b.m34166a().m34150d();

    /* renamed from: l */
    private X11DeviceInfo f4324l = this.f4316d.j().getX11DeviceInfo();

    /* renamed from: com.fimi.soul.b.b$a */
    /* loaded from: classes.dex */
    public interface AbstractC1725a {
        /* renamed from: a */
        boolean mo30069a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.b.b$b */
    /* loaded from: classes.dex */
    public class C1726b {

        /* renamed from: a */
        TextView f4340a;

        /* renamed from: b */
        TextView f4341b;

        /* renamed from: c */
        ImageView f4342c;

        /* renamed from: d */
        RelativeLayout f4343d;

        /* renamed from: e */
        SwitchButton f4344e;

        private C1726b() {
        }

        /* renamed from: a */
        public View m34329a(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(C1717b.this.f4315c).inflate(C1704R.layout.item_setting, viewGroup, false);
            this.f4343d = (RelativeLayout) inflate.findViewById(C1704R.C1706id.rl);
            this.f4340a = (TextView) inflate.findViewById(C1704R.C1706id.setting_title_tv);
            this.f4342c = (ImageView) inflate.findViewById(C1704R.C1706id.setting_arrow);
            this.f4341b = (TextView) inflate.findViewById(C1704R.C1706id.settig_coontent_tv);
            this.f4344e = (SwitchButton) inflate.findViewById(C1704R.C1706id.switch_btn);
            C3103au.m29232a(C1717b.this.f4315c.getAssets(), this.f4340a, this.f4341b);
            return inflate;
        }

        /* renamed from: a */
        public void m34328a(boolean z) {
            this.f4343d.setClickable(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.b.b$c */
    /* loaded from: classes.dex */
    public enum EnumC1727c {
        RECORD_TITLE,
        INDEX_RECORD_1080P_60,
        INDEX_RECORD_1080P_30,
        INDEX_RECORD_720P,
        VOLUME_RECORD_TITLE,
        VOLUME_RECORD_CONTENT,
        IMAGE_TITLE,
        INDEX_PHOTO_4V3_16M,
        INDEX_PHOTO_16V9_12M,
        INDEX_PHOTO_4V3_8M,
        GRID_TITLE,
        GRID_CONTENT,
        BRIGHTNESS_AUTO_CONTENT,
        TFCARD_TITLE,
        TFCARD_CONTENT,
        BOTTOM_ITEM
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.b.b$d */
    /* loaded from: classes.dex */
    public enum EnumC1728d {
        STANDARD_TITLE,
        INDEX_STANDARD_PAL,
        INDEX_STANDARD_NTSC,
        RECORD_TITLE,
        INDEX_RECORD_2160P_30P_4K,
        INDEX_RECORD_1440P_60P_4K,
        INDEX_RECORD_1080P_100P_4K,
        INDEX_RECORD_1080P_60P_4K,
        INDEX_RECORD_1080P_30P_4K,
        IMAGE_TITLE,
        INDEX_PHOTO_4V3_12M_4K,
        INDEX_PHOTO_16V9_8M_4K,
        IMAGE_FORMAT_TITLE,
        IMAGE_JPG,
        IMAGE_RAW,
        GRID_TITLE,
        GRID_CONTENT,
        BRIGHTNESS_AUTO_CONTENT,
        TFCARD_TITLE,
        TFCARD_CONTENT,
        RESERT,
        RESERT_CAMERA,
        BOTTOM_ITEM
    }

    public C1717b(Context context, C2083a c2083a) {
        this.f4321i = false;
        this.f4328p = false;
        this.f4330r = c2083a;
        this.f4315c = context;
        this.f4321i = C1783b.m34166a().m34153c();
        this.f4331s = C1681v.m34543a(context).m34546a();
        this.f4328p = c2083a.m32984g().m31992i();
        m34362a();
        m34335g();
    }

    /* renamed from: a */
    private void m34360a(C1726b c1726b) {
        if (this.f4326n) {
            c1726b.f4344e.m34420a(true, false);
        } else {
            c1726b.f4344e.m34420a(false, false);
        }
        c1726b.f4344e.setVisibility(0);
        c1726b.f4341b.setVisibility(0);
        c1726b.f4341b.setText(C1704R.C1707string.vedio_recording_audio);
        c1726b.f4344e.setOnSwitchListener(new SwitchButton.AbstractC1695a() { // from class: com.fimi.soul.b.b.1
            @Override // com.fimi.kernel.view.button.SwitchButton.AbstractC1695a
            /* renamed from: a */
            public void mo28184a(View view, boolean z) {
                SwitchButton switchButton = (SwitchButton) view.findViewById(C1704R.C1706id.switch_btn);
                if (!C1717b.this.m34333h()) {
                    C1688z.m34447a(C1717b.this.f4315c, C1717b.this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                    if (C1717b.this.f4326n) {
                        switchButton.m34420a(true, false);
                    } else {
                        switchButton.m34420a(false, false);
                    }
                } else if (!C1717b.this.m34333h()) {
                    C1688z.m34447a(C1717b.this.f4315c, C1717b.this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                    if (C1717b.this.f4326n) {
                        switchButton.m34420a(true, false);
                    } else {
                        switchButton.m34420a(false, false);
                    }
                } else {
                    if (C1717b.this.f4326n) {
                        C1717b.this.f4326n = false;
                        switchButton.m34420a(false, true);
                        C1717b.this.f4323k = C1831e.f4918cL;
                    } else {
                        C1717b.this.f4326n = true;
                        switchButton.m34420a(true, true);
                        C1717b.this.f4323k = C1831e.f4919cM;
                    }
                    C1717b.this.f4322j = C1831e.f4873bT;
                    if (!C1717b.this.f4325m) {
                        return;
                    }
                    C1717b.this.f4316d.m33989u().m34043f();
                }
            }
        });
    }

    /* renamed from: a */
    private void m34359a(C1726b c1726b, ViewGroup.LayoutParams layoutParams) {
        c1726b.f4340a.setVisibility(8);
        c1726b.f4344e.setVisibility(8);
        c1726b.f4343d.setBackgroundResource(0);
        c1726b.f4341b.setTextColor(this.f4315c.getResources().getColor(C1704R.color.white));
        c1726b.f4341b.setAlpha(1.0f);
        c1726b.f4342c.setVisibility(8);
        c1726b.f4344e.setOnSwitchListener(null);
        layoutParams.height = (int) this.f4315c.getResources().getDimension(C1704R.dimen.setting_adapt_height);
        c1726b.f4343d.setLayoutParams(layoutParams);
        c1726b.m34328a(false);
    }

    /* renamed from: a */
    private void m34358a(C1726b c1726b, String str) {
        c1726b.f4340a.setVisibility(0);
        c1726b.f4341b.setVisibility(0);
        c1726b.f4340a.setText(str);
        c1726b.f4341b.setVisibility(4);
        c1726b.f4343d.setBackgroundResource(C1704R.color.list_nomal);
        c1726b.m34328a(true);
    }

    /* renamed from: a */
    private void m34357a(C1726b c1726b, String str, boolean z) {
        c1726b.f4341b.setVisibility(0);
        c1726b.f4341b.setText(str);
        if (z) {
            c1726b.f4341b.setTextColor(this.f4315c.getResources().getColor(C1704R.color.option_choose));
            c1726b.f4342c.setVisibility(0);
        } else {
            c1726b.f4341b.setTextColor(this.f4315c.getResources().getColor(C1704R.color.white_90));
            c1726b.f4342c.setVisibility(4);
        }
        c1726b.m34328a(false);
    }

    /* renamed from: b */
    private void m34350b(C1726b c1726b) {
        this.f4327o = C1642c.m34885e().m34503n();
        if (this.f4327o) {
            c1726b.f4344e.m34420a(true, false);
        } else {
            c1726b.f4344e.m34420a(false, false);
        }
        c1726b.f4344e.setVisibility(0);
        c1726b.f4341b.setVisibility(0);
        c1726b.f4341b.setText(C1704R.C1707string.grid_line_set);
        c1726b.f4344e.setOnSwitchListener(new SwitchButton.AbstractC1695a() { // from class: com.fimi.soul.b.b.2
            @Override // com.fimi.kernel.view.button.SwitchButton.AbstractC1695a
            /* renamed from: a */
            public void mo28184a(View view, boolean z) {
                SwitchButton switchButton = (SwitchButton) view.findViewById(C1704R.C1706id.switch_btn);
                if (z) {
                    C1642c.m34885e().m34519f(true);
                    C1717b.this.f4330r.mo32909a(C2104d.EnumC2105a.Show9Grid);
                    C1717b.this.f4327o = true;
                    switchButton.setSwitchState(true);
                    return;
                }
                C1642c.m34885e().m34519f(false);
                C1717b.this.f4330r.mo32909a(C2104d.EnumC2105a.hide9Grid);
                C1717b.this.f4327o = false;
                switchButton.setSwitchState(false);
            }
        });
    }

    /* renamed from: b */
    private void m34349b(C1726b c1726b, ViewGroup.LayoutParams layoutParams) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.f4315c).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        layoutParams.height = displayMetrics.heightPixels * 0;
        c1726b.f4343d.setLayoutParams(layoutParams);
        c1726b.f4343d.setBackgroundResource(C1704R.color.list_nomal);
    }

    /* renamed from: b */
    private void m34348b(C1726b c1726b, String str, boolean z) {
        c1726b.f4341b.setVisibility(0);
        c1726b.f4344e.setVisibility(0);
        c1726b.f4341b.setText(str);
        c1726b.f4344e.setSwitchState(z);
    }

    /* renamed from: c */
    private void m34343c(C1726b c1726b) {
        if (this.f4328p) {
            c1726b.f4344e.m34420a(true, false);
        } else {
            c1726b.f4344e.m34420a(false, false);
        }
        c1726b.f4344e.setVisibility(0);
        c1726b.f4341b.setVisibility(0);
        c1726b.f4341b.setText(C1704R.C1707string.auto_chage_brightness);
        this.f4314a.setTag(c1726b.f4344e);
        c1726b.f4344e.setClickable(false);
        c1726b.f4344e.setOnSwitchListener(new SwitchButton.AbstractC1695a() { // from class: com.fimi.soul.b.b.3
            @Override // com.fimi.kernel.view.button.SwitchButton.AbstractC1695a
            /* renamed from: a */
            public void mo28184a(View view, boolean z) {
                SwitchButton switchButton = (SwitchButton) view.findViewById(C1704R.C1706id.switch_btn);
                if (C1717b.this.f4332t.mo30069a()) {
                    C1688z.m34449a(C1717b.this.f4315c, (int) C1704R.C1707string.front_lights_setting_app_enable_tip3, 3000);
                    switchButton.setSwitchState(C1717b.this.f4328p);
                } else if (!C1717b.this.f4330r.mo32905ac()) {
                    C1688z.m34447a(C1717b.this.f4315c, C1717b.this.f4315c.getString(C1704R.C1707string.front_lights_setting_no_connect), C1688z.f4191b);
                    switchButton.setSwitchState(C1717b.this.f4328p);
                } else if (!C1717b.this.m34339e()) {
                    switchButton.setSwitchState(false);
                } else if (z) {
                    C1717b.this.m34353a(true);
                } else {
                    C1717b.this.m34353a(false);
                }
            }
        });
    }

    /* renamed from: g */
    private void m34335g() {
        String videoResolution = this.f4316d.j().getVideoResolution();
        String photoSize = this.f4316d.j().getPhotoSize();
        String image_format = this.f4316d.j().getImage_format();
        if (videoResolution == null) {
            return;
        }
        if (videoResolution != null) {
            videoResolution = videoResolution.trim();
        }
        if (photoSize != null) {
            photoSize = photoSize.trim();
        }
        if (this.f4325m) {
            if ("1920x1080 30P 16:9".contains(videoResolution)) {
                this.f4318f = EnumC1727c.INDEX_RECORD_1080P_30.ordinal();
            }
            if ("1920x1080 60P 16:9".contains(videoResolution)) {
                this.f4318f = EnumC1727c.INDEX_RECORD_1080P_60.ordinal();
            }
            if (C1831e.f4941cj.contains(videoResolution)) {
                this.f4318f = EnumC1727c.INDEX_RECORD_720P.ordinal();
            }
            if (photoSize != null) {
                if (C1831e.f4943cl.contains(photoSize)) {
                    this.f4317e = EnumC1727c.INDEX_PHOTO_16V9_12M.ordinal();
                }
                if (C1831e.f4942ck.contains(photoSize)) {
                    this.f4317e = EnumC1727c.INDEX_PHOTO_4V3_16M.ordinal();
                }
                if (C1831e.f4944cm.contains(photoSize)) {
                    this.f4317e = EnumC1727c.INDEX_PHOTO_4V3_8M.ordinal();
                }
            }
        } else {
            if (C1831e.f4909cC.equals(this.f4316d.j().getSystemType())) {
                this.f4329q = false;
                this.f4320h = EnumC1728d.INDEX_STANDARD_PAL.ordinal();
            } else {
                this.f4329q = true;
                this.f4320h = EnumC1728d.INDEX_STANDARD_NTSC.ordinal();
            }
            if (C1831e.f4945cn.contains(videoResolution) || C1831e.f4950cs.contains(videoResolution)) {
                this.f4318f = EnumC1728d.INDEX_RECORD_2160P_30P_4K.ordinal();
            }
            if (C1831e.f4946co.contains(videoResolution) || C1831e.f4951ct.contains(videoResolution)) {
                this.f4318f = EnumC1728d.INDEX_RECORD_1440P_60P_4K.ordinal();
            }
            if ("1920x1080 30P 16:9".contains(videoResolution) || C1831e.f4954cw.contains(videoResolution)) {
                this.f4318f = EnumC1728d.INDEX_RECORD_1080P_30P_4K.ordinal();
            }
            if ("1920x1080 60P 16:9".contains(videoResolution) || C1831e.f4953cv.contains(videoResolution)) {
                this.f4318f = EnumC1728d.INDEX_RECORD_1080P_60P_4K.ordinal();
            }
            if ("1920x1080 100P 16:9".contains(videoResolution) || "1920x1080 100P 16:9".contains(videoResolution)) {
                this.f4318f = EnumC1728d.INDEX_RECORD_1080P_100P_4K.ordinal();
            }
            if (photoSize != null) {
                if (C1831e.f4955cx.contains(photoSize)) {
                    this.f4317e = EnumC1728d.INDEX_PHOTO_4V3_12M_4K.ordinal();
                }
                if (C1831e.f4956cy.contains(photoSize)) {
                    this.f4317e = EnumC1728d.INDEX_PHOTO_16V9_8M_4K.ordinal();
                }
            }
            if (image_format != null && !"".equals(image_format)) {
                if (C1831e.f4957cz.equals(image_format)) {
                    this.f4319g = EnumC1728d.IMAGE_JPG.ordinal();
                }
                if (C1831e.f4907cA.equals(image_format)) {
                    this.f4319g = EnumC1728d.IMAGE_RAW.ordinal();
                }
            }
        }
        if (C1831e.f4918cL.equals(this.f4316d.j().getVideoMode())) {
            this.f4326n = false;
        } else {
            this.f4326n = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public boolean m34333h() {
        return this.f4316d.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m34331i() {
        this.f4316d.m33989u().m34043f();
        this.f4322j = C1831e.f4877bX;
        this.f4323k = C1831e.f4910cD;
        C1642c.m34885e().m34519f(false);
        m34353a(false);
    }

    /* renamed from: a */
    public void m34362a() {
        if (C1681v.m34543a(this.f4315c).m34495v() == DeviceType.DEVICE_4K) {
            this.f4325m = false;
        } else {
            this.f4325m = true;
        }
        this.f4316d.m33989u().m34052b();
    }

    /* renamed from: a */
    public void m34361a(AbstractC1725a abstractC1725a) {
        this.f4332t = abstractC1725a;
    }

    /* renamed from: a */
    public void m34353a(boolean z) {
        C2336f m32984g = this.f4330r.m32984g();
        this.f4330r.mo32906ab().mo32587a(m32984g.m32004a(z, m32984g));
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        switch (x11RespCmd.getMsg_id()) {
            case 2:
                if (!z) {
                    if (x11RespCmd.getType() != null) {
                        C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.setting_false), C1688z.f4192c);
                    }
                    C1642c.m34889b().mo34429c();
                    return;
                } else if (C1831e.f4855bB.equals(x11RespCmd.getType()) || "menu_album".equals(x11RespCmd.getType())) {
                    return;
                } else {
                    C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_success), C1688z.f4192c);
                    this.f4316d.m33989u().m34052b();
                    return;
                }
            case 3:
                C1642c.m34889b().mo34429c();
                m34335g();
                notifyDataSetChanged();
                return;
            case 4:
                if (z) {
                    C1663g.m34751b(new File(C3129m.m29053n()));
                    C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.format_success), C1688z.f4192c);
                    this.f4316d.m33989u().m34046d(C1831e.f4927cU);
                    this.f4316d.a(true);
                } else {
                    C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.format_fail), C1688z.f4192c);
                }
                C1642c.m34889b().mo34429c();
                return;
            case 11:
                this.f4316d.m33989u().m34052b();
                return;
            case 257:
                if (z) {
                    return;
                }
                C1642c.m34889b().mo34429c();
                return;
            case 260:
                CameraValue.isCameraParameterChange = true;
                this.f4316d.m33989u().m34054a(this.f4322j, this.f4323k);
                C1642c.m34889b().mo34440a();
                if (this.f4324l.getChip() != null) {
                    return;
                }
                this.f4316d.m33989u().m34047d();
                return;
            case C1831e.f4835ai /* 10066329 */:
                C1642c.m34889b().mo34429c();
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void m34351b() {
        if (this.f4316d != null) {
            this.f4316d.a(this);
            if (!C1772d.m34208a().m34185m() || this.f4316d.e()) {
                return;
            }
            C1642c.m34889b().mo34440a();
            this.f4316d.m33987w().m33996b();
        }
    }

    /* renamed from: c */
    public void m34344c() {
        SwitchButton switchButton = (SwitchButton) this.f4314a.getTag();
        if (this.f4332t.mo30069a()) {
            C1688z.m34449a(this.f4315c, (int) C1704R.C1707string.front_lights_setting_app_enable_tip3, 3000);
        } else if (!this.f4330r.mo32905ac()) {
            C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.front_lights_setting_no_connect), C1688z.f4191b);
        } else if (switchButton.getToggleOn()) {
            m34353a(false);
        } else {
            m34353a(true);
        }
    }

    /* renamed from: d */
    public void m34341d() {
        SwitchButton switchButton = (SwitchButton) this.f4314a.getTag();
        if (this.f4330r.m32984g().m31991j()) {
            this.f4328p = this.f4330r.m32984g().m31992i();
        } else {
            C1688z.m34449a(this.f4315c, (int) C1704R.C1707string.setting_false, 3000);
        }
        if (switchButton != null) {
            switchButton.setSwitchState(this.f4328p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m34339e() {
        boolean z;
        if (!this.f4330r.mo32905ac()) {
            C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.front_lights_setting_no_connect), C1688z.f4191b);
            return false;
        }
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        if (c3022b != null && c3022b.m29604a() > 0) {
            if (c3022b.m29604a() >= (this.f4325m ? 1902 : 1067)) {
                z = true;
                if (!z) {
                    return z;
                }
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.fc_update_tip), C1688z.f4191b);
                return z;
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* renamed from: f */
    public boolean m34337f() {
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        boolean z = c3022b != null && c3022b.m29580m() > 0 && c3022b.m29580m() >= 1063;
        if (!z) {
            C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.camera_menu_update_tip), C1688z.f4191b);
        }
        return z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4325m ? EnumC1727c.values().length : EnumC1728d.values().length;
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
        C1726b c1726b;
        boolean z = true;
        if (view == null) {
            c1726b = new C1726b();
            view = c1726b.m34329a(viewGroup);
            view.setTag(c1726b);
            this.f4314a = (ListView) viewGroup;
        } else {
            c1726b = (C1726b) view.getTag();
        }
        m34359a(c1726b, view.getLayoutParams());
        if (this.f4325m) {
            if (i == EnumC1727c.RECORD_TITLE.ordinal()) {
                m34358a(c1726b, this.f4315c.getString(C1704R.C1707string.record_title));
            } else if (i == EnumC1727c.INDEX_RECORD_1080P_30.ordinal()) {
                String string = this.f4315c.getString(C1704R.C1707string.option_video_1080_30f);
                if (this.f4318f != EnumC1727c.INDEX_RECORD_1080P_30.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string, z);
            } else if (i == EnumC1727c.INDEX_RECORD_1080P_60.ordinal()) {
                String string2 = this.f4315c.getString(C1704R.C1707string.option_video_1080p_60);
                if (this.f4318f != EnumC1727c.INDEX_RECORD_1080P_60.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string2, z);
            } else if (i == EnumC1727c.INDEX_RECORD_720P.ordinal()) {
                if (this.f4318f != EnumC1727c.INDEX_RECORD_720P.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, "1280x720", z);
            } else if (i == EnumC1727c.IMAGE_TITLE.ordinal()) {
                m34358a(c1726b, this.f4315c.getString(C1704R.C1707string.photo));
            } else if (i == EnumC1727c.INDEX_PHOTO_4V3_16M.ordinal()) {
                String string3 = this.f4315c.getString(C1704R.C1707string.option_photo_16M);
                if (this.f4317e != EnumC1727c.INDEX_PHOTO_4V3_16M.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string3, z);
            } else if (i == EnumC1727c.INDEX_PHOTO_16V9_12M.ordinal()) {
                String string4 = this.f4315c.getString(C1704R.C1707string.option_photo_12M);
                if (this.f4317e != EnumC1727c.INDEX_PHOTO_16V9_12M.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string4, z);
            } else if (i == EnumC1727c.INDEX_PHOTO_4V3_8M.ordinal()) {
                String string5 = this.f4315c.getString(C1704R.C1707string.option_photo_8M);
                if (this.f4317e != EnumC1727c.INDEX_PHOTO_4V3_8M.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string5, z);
            } else if (i == EnumC1727c.TFCARD_TITLE.ordinal()) {
                m34358a(c1726b, this.f4315c.getString(C1704R.C1707string.sdcard_operation));
            } else if (i == EnumC1727c.TFCARD_CONTENT.ordinal()) {
                c1726b.f4341b.setVisibility(0);
                c1726b.f4341b.setText(this.f4315c.getString(C1704R.C1707string.camera_sd_format));
                c1726b.f4341b.setTextColor(this.f4315c.getResources().getColor(C1704R.color.white_90));
            } else if (i == EnumC1727c.VOLUME_RECORD_TITLE.ordinal()) {
                m34358a(c1726b, this.f4315c.getString(C1704R.C1707string.audio_title));
            } else if (i == EnumC1727c.VOLUME_RECORD_CONTENT.ordinal()) {
                m34360a(c1726b);
            } else if (i == EnumC1727c.BOTTOM_ITEM.ordinal()) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = (int) this.f4315c.getResources().getDimension(C1704R.dimen.setting_adapt_bottom);
                c1726b.f4343d.setLayoutParams(layoutParams);
                c1726b.f4343d.setBackgroundResource(C1704R.color.list_nomal);
                c1726b.f4340a.setVisibility(8);
                c1726b.f4344e.setVisibility(8);
                c1726b.f4342c.setVisibility(8);
                c1726b.f4341b.setVisibility(8);
                c1726b.m34328a(false);
            } else if (i == EnumC1727c.GRID_TITLE.ordinal()) {
                m34358a(c1726b, this.f4315c.getString(C1704R.C1707string.grid_lines_others));
            } else if (i == EnumC1727c.GRID_CONTENT.ordinal()) {
                m34350b(c1726b);
                c1726b.f4344e.setTag(Integer.valueOf(EnumC1727c.GRID_CONTENT.ordinal()));
            } else if (i == EnumC1727c.BRIGHTNESS_AUTO_CONTENT.ordinal()) {
                m34343c(c1726b);
                c1726b.f4344e.setTag(Integer.valueOf(EnumC1727c.BRIGHTNESS_AUTO_CONTENT.ordinal()));
            }
        } else if (i == EnumC1728d.STANDARD_TITLE.ordinal()) {
            m34358a(c1726b, this.f4315c.getString(C1704R.C1707string.media_setting_standard));
        } else if (i == EnumC1728d.INDEX_STANDARD_PAL.ordinal()) {
            String string6 = this.f4315c.getString(C1704R.C1707string.media_setting_standard_pal);
            if (this.f4320h != EnumC1728d.INDEX_STANDARD_PAL.ordinal()) {
                z = false;
            }
            m34357a(c1726b, string6, z);
        } else if (i == EnumC1728d.INDEX_STANDARD_NTSC.ordinal()) {
            String string7 = this.f4315c.getString(C1704R.C1707string.media_setting_standard_ntsc);
            if (this.f4320h != EnumC1728d.INDEX_STANDARD_NTSC.ordinal()) {
                z = false;
            }
            m34357a(c1726b, string7, z);
        } else if (i == EnumC1728d.RECORD_TITLE.ordinal()) {
            m34358a(c1726b, this.f4315c.getString(C1704R.C1707string.record_title));
        } else if (i == EnumC1728d.INDEX_RECORD_1440P_60P_4K.ordinal()) {
            if (this.f4329q) {
                String string8 = this.f4315c.getString(C1704R.C1707string.option_video_1440p_60_4k);
                if (this.f4318f != EnumC1728d.INDEX_RECORD_1440P_60P_4K.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string8, z);
            } else {
                String string9 = this.f4315c.getString(C1704R.C1707string.option_video_1440p_50_pal_4k);
                if (this.f4318f != EnumC1728d.INDEX_RECORD_1440P_60P_4K.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string9, z);
            }
        } else if (i == EnumC1728d.INDEX_RECORD_1080P_30P_4K.ordinal()) {
            if (this.f4329q) {
                String string10 = this.f4315c.getString(C1704R.C1707string.option_video_1080p_30_4k);
                if (this.f4318f != EnumC1728d.INDEX_RECORD_1080P_30P_4K.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string10, z);
            } else {
                String string11 = this.f4315c.getString(C1704R.C1707string.option_video_1080p_25_pal_4k);
                if (this.f4318f != EnumC1728d.INDEX_RECORD_1080P_30P_4K.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string11, z);
            }
        } else if (i == EnumC1728d.INDEX_RECORD_1080P_60P_4K.ordinal()) {
            if (this.f4329q) {
                String string12 = this.f4315c.getString(C1704R.C1707string.option_video_1080p_60_4k);
                if (this.f4318f != EnumC1728d.INDEX_RECORD_1080P_60P_4K.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string12, z);
            } else {
                String string13 = this.f4315c.getString(C1704R.C1707string.option_video_1080p_50_pal_4k);
                if (this.f4318f != EnumC1728d.INDEX_RECORD_1080P_60P_4K.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string13, z);
            }
        } else if (i == EnumC1728d.INDEX_RECORD_1080P_100P_4K.ordinal()) {
            if (this.f4329q) {
                String string14 = this.f4315c.getString(C1704R.C1707string.option_video_1080p_100_4k);
                if (this.f4318f != EnumC1728d.INDEX_RECORD_1080P_100P_4K.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string14, z);
            } else {
                String string15 = this.f4315c.getString(C1704R.C1707string.option_video_1080p_100_pal_4k);
                if (this.f4318f != EnumC1728d.INDEX_RECORD_1080P_100P_4K.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string15, z);
            }
        } else if (i == EnumC1728d.INDEX_RECORD_2160P_30P_4K.ordinal()) {
            if (this.f4329q) {
                String string16 = this.f4315c.getString(C1704R.C1707string.option_video_2160p_30_4k);
                if (this.f4318f != EnumC1728d.INDEX_RECORD_2160P_30P_4K.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string16, z);
            } else {
                String string17 = this.f4315c.getString(C1704R.C1707string.option_video_2160p_25_pal_4k);
                if (this.f4318f != EnumC1728d.INDEX_RECORD_2160P_30P_4K.ordinal()) {
                    z = false;
                }
                m34357a(c1726b, string17, z);
            }
        } else if (i == EnumC1728d.IMAGE_TITLE.ordinal()) {
            m34358a(c1726b, this.f4315c.getString(C1704R.C1707string.photo));
        } else if (i == EnumC1728d.INDEX_PHOTO_4V3_12M_4K.ordinal()) {
            String string18 = this.f4315c.getString(C1704R.C1707string.option_photo_12M_4k);
            if (this.f4317e != EnumC1728d.INDEX_PHOTO_4V3_12M_4K.ordinal()) {
                z = false;
            }
            m34357a(c1726b, string18, z);
        } else if (i == EnumC1728d.INDEX_PHOTO_16V9_8M_4K.ordinal()) {
            String string19 = this.f4315c.getString(C1704R.C1707string.option_photo_8M_4k);
            if (this.f4317e != EnumC1728d.INDEX_PHOTO_16V9_8M_4K.ordinal()) {
                z = false;
            }
            m34357a(c1726b, string19, z);
        } else if (i == EnumC1728d.TFCARD_TITLE.ordinal()) {
            m34358a(c1726b, this.f4315c.getString(C1704R.C1707string.sdcard_operation));
        } else if (i == EnumC1728d.TFCARD_CONTENT.ordinal()) {
            c1726b.f4341b.setVisibility(0);
            c1726b.f4341b.setText(this.f4315c.getString(C1704R.C1707string.camera_sd_format));
            c1726b.f4341b.setTextColor(this.f4315c.getResources().getColor(C1704R.color.white_90));
        } else if (i == EnumC1728d.IMAGE_FORMAT_TITLE.ordinal()) {
            m34358a(c1726b, this.f4315c.getString(C1704R.C1707string.image_format));
        } else if (i == EnumC1728d.IMAGE_JPG.ordinal()) {
            String string20 = this.f4315c.getString(C1704R.C1707string.image_jpg);
            if (this.f4319g != EnumC1728d.IMAGE_JPG.ordinal()) {
                z = false;
            }
            m34357a(c1726b, string20, z);
        } else if (i == EnumC1728d.IMAGE_RAW.ordinal()) {
            String string21 = this.f4315c.getString(C1704R.C1707string.image_raw);
            if (this.f4319g != EnumC1728d.IMAGE_RAW.ordinal()) {
                z = false;
            }
            m34357a(c1726b, string21, z);
        } else if (i == EnumC1728d.GRID_TITLE.ordinal()) {
            m34358a(c1726b, this.f4315c.getString(C1704R.C1707string.grid_lines_others));
        } else if (i == EnumC1728d.GRID_CONTENT.ordinal()) {
            m34350b(c1726b);
            c1726b.f4344e.setTag(Integer.valueOf(EnumC1728d.GRID_CONTENT.ordinal()));
        } else if (i == EnumC1728d.BRIGHTNESS_AUTO_CONTENT.ordinal()) {
            m34343c(c1726b);
            c1726b.f4344e.setTag(Integer.valueOf(EnumC1728d.BRIGHTNESS_AUTO_CONTENT.ordinal()));
        } else if (i == EnumC1728d.RESERT.ordinal()) {
            m34358a(c1726b, this.f4315c.getString(C1704R.C1707string.camera_setting_resert));
        } else if (i == EnumC1728d.RESERT_CAMERA.ordinal()) {
            c1726b.f4341b.setVisibility(0);
            c1726b.f4341b.setText(this.f4315c.getString(C1704R.C1707string.camera_setting_resert_camera_setting));
            c1726b.f4341b.setTextColor(this.f4315c.getResources().getColor(C1704R.color.white_90));
        } else if (i == EnumC1728d.BOTTOM_ITEM.ordinal()) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = (int) this.f4315c.getResources().getDimension(C1704R.dimen.setting_adapt_bottom);
            c1726b.f4343d.setLayoutParams(layoutParams2);
            c1726b.f4343d.setBackgroundResource(C1704R.color.list_nomal);
            c1726b.f4340a.setVisibility(8);
            c1726b.f4344e.setVisibility(8);
            c1726b.f4342c.setVisibility(8);
            c1726b.f4341b.setVisibility(8);
            c1726b.m34328a(false);
        }
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f4325m) {
            if (i != EnumC1727c.TFCARD_CONTENT.ordinal() && i != EnumC1727c.GRID_CONTENT.ordinal() && i != EnumC1727c.BRIGHTNESS_AUTO_CONTENT.ordinal()) {
                this.f4316d.m33989u().m34043f();
            }
        } else if (i != EnumC1728d.TFCARD_CONTENT.ordinal() && i != EnumC1728d.GRID_CONTENT.ordinal() && i != EnumC1728d.BRIGHTNESS_AUTO_CONTENT.ordinal() && i != EnumC1728d.RESERT_CAMERA.ordinal()) {
            if ((i == EnumC1728d.INDEX_STANDARD_PAL.ordinal() || i == EnumC1728d.INDEX_STANDARD_NTSC.ordinal()) && !m34337f()) {
                return;
            }
            this.f4316d.m33989u().m34043f();
        }
        if (i == EnumC1727c.INDEX_RECORD_1080P_30.ordinal() && this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f4322j = C1831e.f4862bI;
                this.f4323k = "1920x1080 30P 16:9";
            }
        }
        if (i == EnumC1727c.INDEX_RECORD_1080P_60.ordinal() && this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f4322j = C1831e.f4862bI;
                this.f4323k = "1920x1080 60P 16:9";
            }
        }
        if (i == EnumC1727c.INDEX_RECORD_720P.ordinal() && this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f4322j = C1831e.f4862bI;
                this.f4323k = C1831e.f4941cj;
            }
        }
        if (i == EnumC1727c.INDEX_PHOTO_4V3_16M.ordinal() && this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f4322j = C1831e.f4867bN;
                this.f4323k = C1831e.f4942ck;
            }
        }
        if (i == EnumC1727c.INDEX_PHOTO_4V3_8M.ordinal() && this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f4322j = C1831e.f4867bN;
                this.f4323k = C1831e.f4944cm;
            }
        }
        if (i == EnumC1727c.INDEX_PHOTO_16V9_12M.ordinal() && this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f4322j = C1831e.f4867bN;
                this.f4323k = C1831e.f4943cl;
            }
        }
        if (i == EnumC1728d.INDEX_RECORD_2160P_30P_4K.ordinal() && !this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            }
            this.f4322j = C1831e.f4862bI;
            if (this.f4329q) {
                this.f4323k = C1831e.f4945cn;
            } else {
                this.f4323k = C1831e.f4950cs;
            }
        }
        if (i == EnumC1728d.INDEX_RECORD_1440P_60P_4K.ordinal() && !this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            }
            this.f4322j = C1831e.f4862bI;
            if (this.f4329q) {
                this.f4323k = C1831e.f4946co;
            } else {
                this.f4323k = C1831e.f4951ct;
            }
        }
        if (i == EnumC1728d.INDEX_RECORD_1080P_30P_4K.ordinal() && !this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            }
            this.f4322j = C1831e.f4862bI;
            if (this.f4329q) {
                this.f4323k = "1920x1080 30P 16:9";
            } else {
                this.f4323k = C1831e.f4954cw;
            }
        }
        if (i == EnumC1728d.INDEX_RECORD_1080P_60P_4K.ordinal() && !this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            }
            this.f4322j = C1831e.f4862bI;
            if (this.f4329q) {
                this.f4323k = "1920x1080 60P 16:9";
            } else {
                this.f4323k = C1831e.f4953cv;
            }
        }
        if (i == EnumC1728d.INDEX_RECORD_1080P_100P_4K.ordinal() && !this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            }
            this.f4322j = C1831e.f4862bI;
            if (this.f4329q) {
                this.f4323k = "1920x1080 100P 16:9";
            } else {
                this.f4323k = "1920x1080 100P 16:9";
            }
        }
        if (i == EnumC1728d.IMAGE_JPG.ordinal() && !this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f4322j = C1831e.f4875bV;
                this.f4323k = C1831e.f4957cz;
            }
        }
        if (i == EnumC1728d.IMAGE_RAW.ordinal() && !this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f4322j = C1831e.f4875bV;
                this.f4323k = C1831e.f4907cA;
            }
        }
        if (i == EnumC1728d.GRID_CONTENT.ordinal() && !this.f4325m) {
            SwitchButton switchButton = (SwitchButton) view.findViewById(C1704R.C1706id.switch_btn);
            if (C1642c.m34885e().m34503n()) {
                switchButton.m34420a(false, true);
                this.f4330r.mo32909a(C2104d.EnumC2105a.hide9Grid);
                C1642c.m34885e().m34519f(false);
            } else {
                switchButton.m34420a(true, true);
                this.f4330r.mo32909a(C2104d.EnumC2105a.Show9Grid);
                C1642c.m34885e().m34519f(true);
            }
        }
        if (i == EnumC1728d.GRID_CONTENT.ordinal() && this.f4325m) {
            SwitchButton switchButton2 = (SwitchButton) view.findViewById(C1704R.C1706id.switch_btn);
            if (C1642c.m34885e().m34503n()) {
                switchButton2.m34420a(false, true);
                this.f4330r.mo32909a(C2104d.EnumC2105a.hide9Grid);
                C1642c.m34885e().m34519f(false);
            } else {
                switchButton2.m34420a(true, true);
                this.f4330r.mo32909a(C2104d.EnumC2105a.Show9Grid);
                C1642c.m34885e().m34519f(true);
            }
        }
        if (i == EnumC1728d.INDEX_PHOTO_16V9_8M_4K.ordinal() && !this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f4322j = C1831e.f4867bN;
                this.f4323k = C1831e.f4956cy;
            }
        }
        if (i == EnumC1728d.INDEX_PHOTO_4V3_12M_4K.ordinal() && !this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f4322j = C1831e.f4867bN;
                this.f4323k = C1831e.f4955cx;
            }
        }
        if ((this.f4325m && i == EnumC1727c.TFCARD_CONTENT.ordinal()) || (i == EnumC1728d.TFCARD_CONTENT.ordinal() && !this.f4325m)) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.no_connect_camera), C1688z.f4191b);
                return;
            } else if (this.f4316d.i()) {
                new DialogC3245f.C3246a(this.f4315c).m28641a(this.f4315c.getString(C1704R.C1707string.you_ensure_format_tf)).m28644a(this.f4315c.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(this.f4315c.getString(C1704R.C1707string.format), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.b.b.5
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        C1717b.this.f4316d.m33989u().m34049c();
                        C1642c.m34889b().mo34440a();
                    }
                }).m28640a(this.f4315c.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.b.b.4
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                    }
                }).m28645a().show();
            } else {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.format_fail_camera_no_tf_card), C1688z.f4191b);
            }
        }
        if (i == EnumC1727c.VOLUME_RECORD_CONTENT.ordinal() && this.f4325m) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            }
            this.f4322j = C1831e.f4873bT;
            if (this.f4326n) {
                this.f4326n = false;
                this.f4323k = C1831e.f4918cL;
            } else {
                this.f4326n = true;
                this.f4323k = C1831e.f4919cM;
            }
        }
        if (!this.f4325m && i == EnumC1728d.INDEX_STANDARD_NTSC.ordinal()) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f4322j = C1831e.f4876bW;
                this.f4323k = C1831e.f4908cB;
            }
        }
        if (!this.f4325m && i == EnumC1728d.INDEX_STANDARD_PAL.ordinal()) {
            if (!m34333h()) {
                C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f4322j = C1831e.f4876bW;
                this.f4323k = C1831e.f4909cC;
            }
        }
        if (i == EnumC1728d.BRIGHTNESS_AUTO_CONTENT.ordinal() && !this.f4325m && m34339e()) {
            m34344c();
        }
        if (i == EnumC1727c.BRIGHTNESS_AUTO_CONTENT.ordinal() && this.f4325m && m34339e()) {
            m34344c();
        }
        if (i != EnumC1728d.RESERT_CAMERA.ordinal() || this.f4325m) {
            return;
        }
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        if (c3022b == null || c3022b.m29580m() <= 0 || c3022b.m29580m() >= 1066) {
            new DialogC3245f.C3246a(this.f4315c).m28641a(this.f4315c.getString(C1704R.C1707string.camera_setting_resert_camera_setting_dialog)).m28644a(this.f4315c.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(this.f4315c.getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.b.b.7
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    C1717b.this.m34331i();
                }
            }).m28640a(this.f4315c.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.b.b.6
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                }
            }).m28645a().show();
        } else {
            C1688z.m34447a(this.f4315c, this.f4315c.getString(C1704R.C1707string.camera_menu_update_tip), C1688z.f4191b);
        }
    }
}
