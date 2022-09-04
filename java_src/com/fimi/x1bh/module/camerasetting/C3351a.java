package com.fimi.x1bh.module.camerasetting;

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
import com.fimi.soul.entity.CameraValue;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.view.DialogC3245f;
import java.io.File;
/* renamed from: com.fimi.x1bh.module.camerasetting.a */
/* loaded from: classes.dex */
public class C3351a extends BaseAdapter implements AdapterView.OnItemClickListener, AbstractC1792f<X11RespCmd> {

    /* renamed from: b */
    private static final float f13349b = 0.064f;

    /* renamed from: a */
    ListView f13350a;

    /* renamed from: c */
    private Context f13351c;

    /* renamed from: e */
    private int f13353e;

    /* renamed from: f */
    private int f13354f;

    /* renamed from: g */
    private int f13355g;

    /* renamed from: h */
    private int f13356h;

    /* renamed from: i */
    private boolean f13357i;

    /* renamed from: j */
    private String f13358j;

    /* renamed from: k */
    private String f13359k;

    /* renamed from: p */
    private SharedPreferences f13364p;

    /* renamed from: q */
    private AbstractC3355a f13365q;

    /* renamed from: m */
    private boolean f13361m = false;

    /* renamed from: n */
    private boolean f13362n = false;

    /* renamed from: o */
    private boolean f13363o = true;

    /* renamed from: d */
    private C1827d f13352d = (C1827d) C1783b.m34166a().m34150d();

    /* renamed from: l */
    private X11DeviceInfo f13360l = this.f13352d.j().getX11DeviceInfo();

    /* renamed from: com.fimi.x1bh.module.camerasetting.a$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3355a {
        /* renamed from: a */
        boolean m28183a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.x1bh.module.camerasetting.a$b */
    /* loaded from: classes2.dex */
    public class C3356b {

        /* renamed from: a */
        TextView f13369a;

        /* renamed from: b */
        TextView f13370b;

        /* renamed from: c */
        ImageView f13371c;

        /* renamed from: d */
        RelativeLayout f13372d;

        /* renamed from: e */
        SwitchButton f13373e;

        private C3356b() {
        }

        /* renamed from: a */
        public View m28182a(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(C3351a.this.f13351c).inflate(C1704R.layout.item_setting, viewGroup, false);
            this.f13372d = (RelativeLayout) inflate.findViewById(C1704R.C1706id.rl);
            this.f13369a = (TextView) inflate.findViewById(C1704R.C1706id.setting_title_tv);
            this.f13371c = (ImageView) inflate.findViewById(C1704R.C1706id.setting_arrow);
            this.f13370b = (TextView) inflate.findViewById(C1704R.C1706id.settig_coontent_tv);
            this.f13373e = (SwitchButton) inflate.findViewById(C1704R.C1706id.switch_btn);
            C3103au.m29232a(C3351a.this.f13351c.getAssets(), this.f13369a, this.f13370b);
            return inflate;
        }

        /* renamed from: a */
        public void m28181a(boolean z) {
            this.f13372d.setClickable(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.x1bh.module.camerasetting.a$c */
    /* loaded from: classes2.dex */
    public enum EnumC3357c {
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
        TFCARD_TITLE,
        TFCARD_CONTENT,
        BOTTOM_ITEM
    }

    public C3351a(Context context) {
        this.f13357i = false;
        this.f13351c = context;
        this.f13357i = C1783b.m34166a().m34153c();
        this.f13364p = C1681v.m34543a(context).m34546a();
        m28204a();
        m28187d();
    }

    /* renamed from: a */
    private void m28202a(C3356b c3356b) {
        if (this.f13361m) {
            c3356b.f13373e.m34420a(true, false);
        } else {
            c3356b.f13373e.m34420a(false, false);
        }
        c3356b.f13373e.setVisibility(0);
        c3356b.f13370b.setVisibility(0);
        c3356b.f13370b.setText(C1704R.C1707string.vedio_recording_audio);
        c3356b.f13373e.setOnSwitchListener(new SwitchButton.AbstractC1695a() { // from class: com.fimi.x1bh.module.camerasetting.a.1
            @Override // com.fimi.kernel.view.button.SwitchButton.AbstractC1695a
            /* renamed from: a */
            public void mo28184a(View view, boolean z) {
                SwitchButton switchButton = (SwitchButton) view.findViewById(C1704R.C1706id.switch_btn);
                if (!C3351a.this.m28185e()) {
                    C1688z.m34447a(C3351a.this.f13351c, C3351a.this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                    if (C3351a.this.f13361m) {
                        switchButton.m34420a(true, false);
                    } else {
                        switchButton.m34420a(false, false);
                    }
                } else if (!C3351a.this.m28185e()) {
                    C1688z.m34447a(C3351a.this.f13351c, C3351a.this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                    if (C3351a.this.f13361m) {
                        switchButton.m34420a(true, false);
                    } else {
                        switchButton.m34420a(false, false);
                    }
                } else {
                    if (C3351a.this.f13361m) {
                        C3351a.this.f13361m = false;
                        switchButton.m34420a(false, true);
                        C3351a.this.f13359k = C1831e.f4918cL;
                    } else {
                        C3351a.this.f13361m = true;
                        switchButton.m34420a(true, true);
                        C3351a.this.f13359k = C1831e.f4919cM;
                    }
                    C3351a.this.f13358j = C1831e.f4873bT;
                }
            }
        });
    }

    /* renamed from: a */
    private void m28201a(C3356b c3356b, ViewGroup.LayoutParams layoutParams) {
        c3356b.f13369a.setVisibility(8);
        c3356b.f13373e.setVisibility(8);
        c3356b.f13372d.setBackgroundResource(0);
        c3356b.f13370b.setTextColor(this.f13351c.getResources().getColor(C1704R.color.white));
        c3356b.f13370b.setAlpha(1.0f);
        c3356b.f13371c.setVisibility(8);
        c3356b.f13373e.setOnSwitchListener(null);
        layoutParams.height = (int) this.f13351c.getResources().getDimension(C1704R.dimen.setting_adapt_height);
        c3356b.f13372d.setLayoutParams(layoutParams);
        c3356b.m28181a(false);
    }

    /* renamed from: a */
    private void m28200a(C3356b c3356b, String str) {
        c3356b.f13369a.setVisibility(0);
        c3356b.f13370b.setVisibility(0);
        c3356b.f13369a.setText(str);
        c3356b.f13370b.setVisibility(4);
        c3356b.f13372d.setBackgroundResource(C1704R.color.list_nomal);
        c3356b.m28181a(true);
    }

    /* renamed from: a */
    private void m28199a(C3356b c3356b, String str, boolean z) {
        c3356b.f13370b.setVisibility(0);
        c3356b.f13370b.setText(str);
        if (z) {
            c3356b.f13370b.setTextColor(this.f13351c.getResources().getColor(C1704R.color.option_choose));
            c3356b.f13371c.setVisibility(0);
        } else {
            c3356b.f13370b.setTextColor(this.f13351c.getResources().getColor(C1704R.color.white_90));
            c3356b.f13371c.setVisibility(4);
        }
        c3356b.m28181a(false);
    }

    /* renamed from: b */
    private void m28193b(C3356b c3356b, ViewGroup.LayoutParams layoutParams) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.f13351c).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        layoutParams.height = displayMetrics.heightPixels * 0;
        c3356b.f13372d.setLayoutParams(layoutParams);
        c3356b.f13372d.setBackgroundResource(C1704R.color.list_nomal);
    }

    /* renamed from: b */
    private void m28192b(C3356b c3356b, String str, boolean z) {
        c3356b.f13370b.setVisibility(0);
        c3356b.f13373e.setVisibility(0);
        c3356b.f13370b.setText(str);
        c3356b.f13373e.setSwitchState(z);
    }

    /* renamed from: d */
    private void m28187d() {
        String videoResolution = this.f13352d.j().getVideoResolution();
        String photoSize = this.f13352d.j().getPhotoSize();
        String image_format = this.f13352d.j().getImage_format();
        if (videoResolution == null) {
            return;
        }
        if (videoResolution != null) {
            videoResolution = videoResolution.trim();
        }
        if (photoSize != null) {
            photoSize = photoSize.trim();
        }
        if (C1831e.f4909cC.equals(this.f13352d.j().getSystemType())) {
            this.f13363o = false;
            this.f13356h = EnumC3357c.INDEX_STANDARD_PAL.ordinal();
        } else {
            this.f13363o = true;
            this.f13356h = EnumC3357c.INDEX_STANDARD_NTSC.ordinal();
        }
        if (C1831e.f4945cn.contains(videoResolution) || C1831e.f4950cs.contains(videoResolution)) {
            this.f13354f = EnumC3357c.INDEX_RECORD_2160P_30P_4K.ordinal();
        }
        if (C1831e.f4946co.contains(videoResolution) || C1831e.f4951ct.contains(videoResolution)) {
            this.f13354f = EnumC3357c.INDEX_RECORD_1440P_60P_4K.ordinal();
        }
        if ("1920x1080 30P 16:9".contains(videoResolution) || C1831e.f4954cw.contains(videoResolution)) {
            this.f13354f = EnumC3357c.INDEX_RECORD_1080P_30P_4K.ordinal();
        }
        if ("1920x1080 60P 16:9".contains(videoResolution) || C1831e.f4953cv.contains(videoResolution)) {
            this.f13354f = EnumC3357c.INDEX_RECORD_1080P_60P_4K.ordinal();
        }
        if ("1920x1080 100P 16:9".contains(videoResolution) || "1920x1080 100P 16:9".contains(videoResolution)) {
            this.f13354f = EnumC3357c.INDEX_RECORD_1080P_100P_4K.ordinal();
        }
        if (photoSize != null) {
            if (C1831e.f4955cx.contains(photoSize)) {
                this.f13353e = EnumC3357c.INDEX_PHOTO_4V3_12M_4K.ordinal();
            }
            if (C1831e.f4956cy.contains(photoSize)) {
                this.f13353e = EnumC3357c.INDEX_PHOTO_16V9_8M_4K.ordinal();
            }
        }
        if (image_format != null && !"".equals(image_format)) {
            if (C1831e.f4957cz.equals(image_format)) {
                this.f13355g = EnumC3357c.IMAGE_JPG.ordinal();
            }
            if (C1831e.f4907cA.equals(image_format)) {
                this.f13355g = EnumC3357c.IMAGE_RAW.ordinal();
            }
        }
        if (C1831e.f4918cL.equals(this.f13352d.j().getVideoMode())) {
            this.f13361m = false;
        } else {
            this.f13361m = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public boolean m28185e() {
        return this.f13352d.e();
    }

    /* renamed from: a */
    public void m28204a() {
        this.f13352d.m33989u().m34052b();
    }

    /* renamed from: a */
    public void m28203a(AbstractC3355a abstractC3355a) {
        this.f13365q = abstractC3355a;
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        switch (x11RespCmd.getMsg_id()) {
            case 2:
                if (!z) {
                    if (x11RespCmd.getType() != null) {
                        C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.setting_false), C1688z.f4192c);
                    }
                    C1642c.m34889b().mo34429c();
                    return;
                } else if (C1831e.f4855bB.equals(x11RespCmd.getType()) || "menu_album".equals(x11RespCmd.getType())) {
                    return;
                } else {
                    C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.set_success), C1688z.f4192c);
                    this.f13352d.m33989u().m34052b();
                    return;
                }
            case 3:
                C1642c.m34889b().mo34429c();
                m28187d();
                notifyDataSetChanged();
                return;
            case 4:
                if (z) {
                    C1663g.m34751b(new File(C3129m.m29053n()));
                    C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.format_success), C1688z.f4192c);
                    this.f13352d.m33989u().m34046d(C1831e.f4927cU);
                    this.f13352d.a(true);
                } else {
                    C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.format_fail), C1688z.f4192c);
                }
                C1642c.m34889b().mo34429c();
                return;
            case 11:
                this.f13352d.m33989u().m34052b();
                return;
            case 257:
                if (z) {
                    return;
                }
                C1642c.m34889b().mo34429c();
                return;
            case 260:
                CameraValue.isCameraParameterChange = true;
                this.f13352d.m33989u().m34054a(this.f13358j, this.f13359k);
                C1642c.m34889b().mo34440a();
                if (this.f13360l.getChip() != null) {
                    return;
                }
                this.f13352d.m33989u().m34047d();
                return;
            case C1831e.f4835ai /* 10066329 */:
                C1642c.m34889b().mo34429c();
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void m28194b() {
        if (this.f13352d != null) {
            this.f13352d.a(this);
            if (!C1772d.m34208a().m34185m() || this.f13352d.e()) {
                return;
            }
            C1642c.m34889b().mo34440a();
            this.f13352d.m33987w().m33996b();
        }
    }

    /* renamed from: c */
    public boolean m28189c() {
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        boolean z = c3022b != null && c3022b.m29580m() > 0 && c3022b.m29580m() >= 1063;
        if (!z) {
            C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.camera_menu_update_tip), C1688z.f4191b);
        }
        return z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return EnumC3357c.values().length;
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
        C3356b c3356b;
        boolean z = true;
        if (view == null) {
            c3356b = new C3356b();
            view = c3356b.m28182a(viewGroup);
            view.setTag(c3356b);
            this.f13350a = (ListView) viewGroup;
        } else {
            c3356b = (C3356b) view.getTag();
        }
        m28201a(c3356b, view.getLayoutParams());
        if (i == EnumC3357c.STANDARD_TITLE.ordinal()) {
            m28200a(c3356b, this.f13351c.getString(C1704R.C1707string.media_setting_standard));
        } else if (i == EnumC3357c.INDEX_STANDARD_PAL.ordinal()) {
            String string = this.f13351c.getString(C1704R.C1707string.media_setting_standard_pal);
            if (this.f13356h != EnumC3357c.INDEX_STANDARD_PAL.ordinal()) {
                z = false;
            }
            m28199a(c3356b, string, z);
        } else if (i == EnumC3357c.INDEX_STANDARD_NTSC.ordinal()) {
            String string2 = this.f13351c.getString(C1704R.C1707string.media_setting_standard_ntsc);
            if (this.f13356h != EnumC3357c.INDEX_STANDARD_NTSC.ordinal()) {
                z = false;
            }
            m28199a(c3356b, string2, z);
        } else if (i == EnumC3357c.RECORD_TITLE.ordinal()) {
            m28200a(c3356b, this.f13351c.getString(C1704R.C1707string.record_title));
        } else if (i == EnumC3357c.INDEX_RECORD_1440P_60P_4K.ordinal()) {
            if (this.f13363o) {
                String string3 = this.f13351c.getString(C1704R.C1707string.option_video_1440p_60_4k);
                if (this.f13354f != EnumC3357c.INDEX_RECORD_1440P_60P_4K.ordinal()) {
                    z = false;
                }
                m28199a(c3356b, string3, z);
            } else {
                String string4 = this.f13351c.getString(C1704R.C1707string.option_video_1440p_50_pal_4k);
                if (this.f13354f != EnumC3357c.INDEX_RECORD_1440P_60P_4K.ordinal()) {
                    z = false;
                }
                m28199a(c3356b, string4, z);
            }
        } else if (i == EnumC3357c.INDEX_RECORD_1080P_30P_4K.ordinal()) {
            if (this.f13363o) {
                String string5 = this.f13351c.getString(C1704R.C1707string.option_video_1080p_30_4k);
                if (this.f13354f != EnumC3357c.INDEX_RECORD_1080P_30P_4K.ordinal()) {
                    z = false;
                }
                m28199a(c3356b, string5, z);
            } else {
                String string6 = this.f13351c.getString(C1704R.C1707string.option_video_1080p_25_pal_4k);
                if (this.f13354f != EnumC3357c.INDEX_RECORD_1080P_30P_4K.ordinal()) {
                    z = false;
                }
                m28199a(c3356b, string6, z);
            }
        } else if (i == EnumC3357c.INDEX_RECORD_1080P_60P_4K.ordinal()) {
            if (this.f13363o) {
                String string7 = this.f13351c.getString(C1704R.C1707string.option_video_1080p_60_4k);
                if (this.f13354f != EnumC3357c.INDEX_RECORD_1080P_60P_4K.ordinal()) {
                    z = false;
                }
                m28199a(c3356b, string7, z);
            } else {
                String string8 = this.f13351c.getString(C1704R.C1707string.option_video_1080p_50_pal_4k);
                if (this.f13354f != EnumC3357c.INDEX_RECORD_1080P_60P_4K.ordinal()) {
                    z = false;
                }
                m28199a(c3356b, string8, z);
            }
        } else if (i == EnumC3357c.INDEX_RECORD_1080P_100P_4K.ordinal()) {
            if (this.f13363o) {
                String string9 = this.f13351c.getString(C1704R.C1707string.option_video_1080p_100_4k);
                if (this.f13354f != EnumC3357c.INDEX_RECORD_1080P_100P_4K.ordinal()) {
                    z = false;
                }
                m28199a(c3356b, string9, z);
            } else {
                String string10 = this.f13351c.getString(C1704R.C1707string.option_video_1080p_100_pal_4k);
                if (this.f13354f != EnumC3357c.INDEX_RECORD_1080P_100P_4K.ordinal()) {
                    z = false;
                }
                m28199a(c3356b, string10, z);
            }
        } else if (i == EnumC3357c.INDEX_RECORD_2160P_30P_4K.ordinal()) {
            if (this.f13363o) {
                String string11 = this.f13351c.getString(C1704R.C1707string.option_video_2160p_30_4k);
                if (this.f13354f != EnumC3357c.INDEX_RECORD_2160P_30P_4K.ordinal()) {
                    z = false;
                }
                m28199a(c3356b, string11, z);
            } else {
                String string12 = this.f13351c.getString(C1704R.C1707string.option_video_2160p_25_pal_4k);
                if (this.f13354f != EnumC3357c.INDEX_RECORD_2160P_30P_4K.ordinal()) {
                    z = false;
                }
                m28199a(c3356b, string12, z);
            }
        } else if (i == EnumC3357c.IMAGE_TITLE.ordinal()) {
            m28200a(c3356b, this.f13351c.getString(C1704R.C1707string.photo));
        } else if (i == EnumC3357c.INDEX_PHOTO_4V3_12M_4K.ordinal()) {
            String string13 = this.f13351c.getString(C1704R.C1707string.option_photo_12M_4k);
            if (this.f13353e != EnumC3357c.INDEX_PHOTO_4V3_12M_4K.ordinal()) {
                z = false;
            }
            m28199a(c3356b, string13, z);
        } else if (i == EnumC3357c.INDEX_PHOTO_16V9_8M_4K.ordinal()) {
            String string14 = this.f13351c.getString(C1704R.C1707string.option_photo_8M_4k);
            if (this.f13353e != EnumC3357c.INDEX_PHOTO_16V9_8M_4K.ordinal()) {
                z = false;
            }
            m28199a(c3356b, string14, z);
        } else if (i == EnumC3357c.IMAGE_FORMAT_TITLE.ordinal()) {
            m28200a(c3356b, this.f13351c.getString(C1704R.C1707string.image_format));
        } else if (i == EnumC3357c.IMAGE_JPG.ordinal()) {
            String string15 = this.f13351c.getString(C1704R.C1707string.image_jpg);
            if (this.f13355g != EnumC3357c.IMAGE_JPG.ordinal()) {
                z = false;
            }
            m28199a(c3356b, string15, z);
        } else if (i == EnumC3357c.IMAGE_RAW.ordinal()) {
            String string16 = this.f13351c.getString(C1704R.C1707string.image_raw);
            if (this.f13355g != EnumC3357c.IMAGE_RAW.ordinal()) {
                z = false;
            }
            m28199a(c3356b, string16, z);
        } else if (i == EnumC3357c.TFCARD_TITLE.ordinal()) {
            m28200a(c3356b, this.f13351c.getString(C1704R.C1707string.sdcard_operation));
        } else if (i == EnumC3357c.TFCARD_CONTENT.ordinal()) {
            c3356b.f13370b.setVisibility(0);
            c3356b.f13370b.setText(this.f13351c.getString(C1704R.C1707string.camera_sd_format));
            c3356b.f13370b.setTextColor(this.f13351c.getResources().getColor(C1704R.color.white_90));
        } else if (i == EnumC3357c.BOTTOM_ITEM.ordinal()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = (int) this.f13351c.getResources().getDimension(C1704R.dimen.setting_adapt_bottom);
            c3356b.f13372d.setLayoutParams(layoutParams);
            c3356b.f13372d.setBackgroundResource(C1704R.color.list_nomal);
            c3356b.f13369a.setVisibility(8);
            c3356b.f13373e.setVisibility(8);
            c3356b.f13371c.setVisibility(8);
            c3356b.f13370b.setVisibility(8);
            c3356b.m28181a(false);
        }
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i != EnumC3357c.TFCARD_CONTENT.ordinal()) {
            this.f13352d.m33989u().m34043f();
        }
        if (i == EnumC3357c.INDEX_RECORD_2160P_30P_4K.ordinal()) {
            if (!m28185e()) {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            }
            this.f13358j = C1831e.f4862bI;
            if (this.f13363o) {
                this.f13359k = C1831e.f4945cn;
            } else {
                this.f13359k = C1831e.f4950cs;
            }
        }
        if (i == EnumC3357c.INDEX_RECORD_1440P_60P_4K.ordinal()) {
            if (!m28185e()) {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            }
            this.f13358j = C1831e.f4862bI;
            if (this.f13363o) {
                this.f13359k = C1831e.f4946co;
            } else {
                this.f13359k = C1831e.f4951ct;
            }
        }
        if (i == EnumC3357c.INDEX_RECORD_1080P_30P_4K.ordinal()) {
            if (!m28185e()) {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            }
            this.f13358j = C1831e.f4862bI;
            if (this.f13363o) {
                this.f13359k = "1920x1080 30P 16:9";
            } else {
                this.f13359k = C1831e.f4954cw;
            }
        }
        if (i == EnumC3357c.INDEX_RECORD_1080P_60P_4K.ordinal()) {
            if (!m28185e()) {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            }
            this.f13358j = C1831e.f4862bI;
            if (this.f13363o) {
                this.f13359k = "1920x1080 60P 16:9";
            } else {
                this.f13359k = C1831e.f4953cv;
            }
        }
        if (i == EnumC3357c.INDEX_RECORD_1080P_100P_4K.ordinal()) {
            if (!m28185e()) {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            }
            this.f13358j = C1831e.f4862bI;
            if (this.f13363o) {
                this.f13359k = "1920x1080 100P 16:9";
            } else {
                this.f13359k = "1920x1080 100P 16:9";
            }
        }
        if (i == EnumC3357c.IMAGE_JPG.ordinal()) {
            if (!m28185e()) {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f13358j = C1831e.f4875bV;
                this.f13359k = C1831e.f4957cz;
            }
        }
        if (i == EnumC3357c.IMAGE_RAW.ordinal()) {
            if (!m28185e()) {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f13358j = C1831e.f4875bV;
                this.f13359k = C1831e.f4907cA;
            }
        }
        if (i == EnumC3357c.INDEX_PHOTO_16V9_8M_4K.ordinal()) {
            if (!m28185e()) {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f13358j = C1831e.f4867bN;
                this.f13359k = C1831e.f4956cy;
            }
        }
        if (i == EnumC3357c.INDEX_PHOTO_4V3_12M_4K.ordinal()) {
            if (!m28185e()) {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f13358j = C1831e.f4867bN;
                this.f13359k = C1831e.f4955cx;
            }
        }
        if (i == EnumC3357c.INDEX_STANDARD_NTSC.ordinal()) {
            if (!m28185e()) {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f13358j = C1831e.f4876bW;
                this.f13359k = C1831e.f4908cB;
            }
        }
        if (i == EnumC3357c.INDEX_STANDARD_PAL.ordinal()) {
            if (!m28185e()) {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.set_fail_no_connect_camera), C1688z.f4191b);
                return;
            } else {
                this.f13358j = C1831e.f4876bW;
                this.f13359k = C1831e.f4909cC;
            }
        }
        if (i == EnumC3357c.TFCARD_CONTENT.ordinal()) {
            if (!m28185e()) {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.no_connect_camera), C1688z.f4191b);
            } else if (this.f13352d.i()) {
                new DialogC3245f.C3246a(this.f13351c).m28641a(this.f13351c.getString(C1704R.C1707string.you_ensure_format_tf)).m28644a(this.f13351c.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(this.f13351c.getString(C1704R.C1707string.format), new DialogInterface.OnClickListener() { // from class: com.fimi.x1bh.module.camerasetting.a.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        C3351a.this.f13352d.m33989u().m34049c();
                        C1642c.m34889b().mo34440a();
                    }
                }).m28640a(this.f13351c.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.x1bh.module.camerasetting.a.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                    }
                }).m28645a().show();
            } else {
                C1688z.m34447a(this.f13351c, this.f13351c.getString(C1704R.C1707string.format_fail_camera_no_tf_card), C1688z.f4191b);
            }
        }
    }
}
