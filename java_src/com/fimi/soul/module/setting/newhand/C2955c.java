package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.widget.SeekBar;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.manager.C1973k;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.biz.p190r.C2032a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.entity.FlyModeLog;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Setting;
import com.fimi.soul.module.setting.C2932i;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.DialogC3245f;
import java.io.File;
import java.util.List;
/* renamed from: com.fimi.soul.module.setting.newhand.c */
/* loaded from: classes.dex */
public class C2955c extends AbstractC2973d {

    /* renamed from: H */
    private static final int f10858H = 3000;

    /* renamed from: I */
    private static final int f10859I = 1;

    /* renamed from: a */
    public static final int f10860a = 9;

    /* renamed from: b */
    public static final byte f10861b = 0;

    /* renamed from: c */
    public static final byte f10862c = 1;

    /* renamed from: d */
    public static final byte f10863d = 2;

    /* renamed from: e */
    public static final byte f10864e = 3;

    /* renamed from: f */
    public static final byte f10865f = 85;

    /* renamed from: g */
    public static final byte f10866g = -86;

    /* renamed from: h */
    public static final byte f10867h = 0;

    /* renamed from: i */
    public static final byte f10868i = 1;

    /* renamed from: j */
    public static final int f10869j = 60;

    /* renamed from: l */
    private static final int f10870l = 2;

    /* renamed from: m */
    private static final int f10871m = 3;

    /* renamed from: n */
    private static final int f10872n = 4;

    /* renamed from: o */
    private static final int f10873o = 5;

    /* renamed from: p */
    private static final int f10874p = 6;

    /* renamed from: q */
    private static final int f10875q = 7;

    /* renamed from: r */
    private static final int f10876r = 8;

    /* renamed from: s */
    private static final int f10877s = 9;

    /* renamed from: t */
    private static final int f10878t = 10;

    /* renamed from: u */
    private static final int f10879u = 11;

    /* renamed from: v */
    private static final String f10880v = "0";

    /* renamed from: w */
    private static final String f10881w = "1";

    /* renamed from: x */
    private static final String f10882x = "2";

    /* renamed from: y */
    private static final String f10883y = "3";

    /* renamed from: E */
    private boolean f10888E;

    /* renamed from: F */
    private Context f10889F;

    /* renamed from: G */
    private C2032a f10890G;

    /* renamed from: k */
    C2083a f10893k;

    /* renamed from: z */
    private int f10894z = 0;

    /* renamed from: A */
    private int f10884A = 0;

    /* renamed from: B */
    private int f10885B = 0;

    /* renamed from: C */
    private int f10886C = 0;

    /* renamed from: D */
    private int f10887D = 0;

    /* renamed from: J */
    private boolean f10891J = false;

    /* renamed from: K */
    private Handler f10892K = new Handler() { // from class: com.fimi.soul.module.setting.newhand.c.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (1 == message.what) {
                C2955c.this.m29802n();
            }
            switch (message.what) {
                case 2:
                    C2955c.this.m29823b((byte) 0);
                    return;
                case 3:
                    C2955c.this.m29823b((byte) 1);
                    return;
                case 4:
                    C2955c.this.mo29798a(2, 1);
                    return;
                case 5:
                    C2955c.this.mo29798a(2, 0);
                    return;
                case 6:
                    C2955c.this.mo29798a(4, 1);
                    return;
                case 7:
                    C2955c.this.mo29798a(4, 0);
                    return;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    return;
            }
        }
    };

    public C2955c(C2083a c2083a, Context context) {
        this.f10888E = false;
        this.f10893k = c2083a;
        this.f10889F = context;
        this.f10890G = C2032a.m33177a(context);
        this.f10888E = C1642c.m34885e().m34501p();
    }

    /* renamed from: a */
    private C2196c m29830a(byte b) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10865f);
        c2196c.f6914d.m32744b(b);
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32743b(0);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: a */
    private C2196c m29829a(float f) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10865f);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 2);
        c2196c.f6914d.m32744b((byte) 3);
        c2196c.f6914d.m32749a(f);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public FlyModeLog m29824a(String str) {
        int m29604a = ((C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class)).m29604a();
        int m29594f = ((C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class)).m29594f();
        FlyModeLog flyModeLog = new FlyModeLog();
        flyModeLog.setUserID(C1756a.m34259c(this.f10889F).getUserID());
        flyModeLog.setFcVersion(m29604a + "");
        flyModeLog.setOpenType(str);
        flyModeLog.setApplyTime(C3103au.m29222b(System.currentTimeMillis()));
        flyModeLog.setX2Version(m29594f + "");
        flyModeLog.setAppType("0");
        return flyModeLog;
    }

    /* renamed from: b */
    private C2196c m29822b(float f) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10865f);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 2);
        c2196c.f6914d.m32744b((byte) 5);
        c2196c.f6914d.m32749a(f);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: b */
    private C2196c m29821b(int i) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10865f);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 2);
        c2196c.f6914d.m32744b((byte) 7);
        c2196c.f6914d.m32749a(i);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: b */
    private C2196c m29820b(int i, int i2) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10865f);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 3);
        c2196c.f6914d.m32744b((byte) i);
        c2196c.f6914d.m32743b((int) ((byte) i2));
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m29823b(byte b) {
        this.f10893k.mo32906ab().mo32587a(m29830a(b));
    }

    /* renamed from: c */
    private C2196c m29817c(int i) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10865f);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 2);
        c2196c.f6914d.m32744b((byte) 7);
        c2196c.f6914d.m32743b(i);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: d */
    private C2196c m29815d(int i) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10865f);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 2);
        c2196c.f6914d.m32744b((byte) 3);
        c2196c.f6914d.m32743b(i);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: e */
    private C2196c m29813e(int i) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10865f);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 2);
        c2196c.f6914d.m32744b((byte) 5);
        c2196c.f6914d.m32743b(i);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: f */
    private C2196c m29811f() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10866g);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32743b(0);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: g */
    private C2196c m29809g() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10866g);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 3);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32743b(0);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: h */
    private C2196c m29808h() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10866g);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 4);
        c2196c.f6914d.m32744b((byte) 7);
        c2196c.f6914d.m32749a(0.0f);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: i */
    private C2196c m29807i() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10866g);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 2);
        c2196c.f6914d.m32744b((byte) 7);
        c2196c.f6914d.m32743b(0);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: j */
    private C2196c m29806j() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10866g);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 4);
        c2196c.f6914d.m32744b((byte) 3);
        c2196c.f6914d.m32749a(0.0f);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: k */
    private C2196c m29805k() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10866g);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 2);
        c2196c.f6914d.m32744b((byte) 3);
        c2196c.f6914d.m32743b(0);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: l */
    private C2196c m29804l() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10866g);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 4);
        c2196c.f6914d.m32744b((byte) 5);
        c2196c.f6914d.m32749a(0.0f);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: m */
    private C2196c m29803m() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 9;
        c2196c.f6913c = 135;
        c2196c.f6914d.m32744b(f10866g);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 2);
        c2196c.f6914d.m32744b((byte) 5);
        c2196c.f6914d.m32743b(0);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m29802n() {
        if (C1642c.m34889b().mo34433b() == null || !C1642c.m34889b().mo34433b().isShowing()) {
            return;
        }
        C1642c.m34889b().mo34429c();
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: a */
    public void mo29801a() {
        if (this.f10891J) {
            this.f10893k.mo32906ab().mo32587a(m29808h());
        } else if (C1772d.m34208a().m34187k()) {
            this.f10893k.mo32906ab().mo32587a(m29807i());
        } else {
            this.f10893k.mo32906ab().mo32587a(m29808h());
        }
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: a */
    public void mo29800a(double d) {
        if (this.f10891J) {
            this.f10893k.mo32906ab().mo32587a(m29829a((float) d));
        } else {
            this.f10893k.mo32906ab().mo32587a(m29815d((int) Math.round(d)));
        }
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: a */
    public void mo29799a(int i) {
        if (this.f10891J) {
            this.f10893k.mo32906ab().mo32587a(m29821b(i));
        } else {
            this.f10893k.mo32906ab().mo32587a(m29817c(i));
        }
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: a */
    public void mo29798a(int i, int i2) {
        this.f10893k.mo32906ab().mo32587a(m29820b(i, i2));
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: a */
    public void mo29797a(int i, final AbstractC2974e abstractC2974e) {
        this.f10894z = i;
        if (!this.f10893k.mo32905ac()) {
            C1688z.m34449a(this.f10889F, (int) C1704R.C1707string.set_new_hand_fail, C1688z.f4191b);
        } else if (this.f10893k.m33009am()) {
            C1688z.m34447a(this.f10889F, this.f10889F.getString(C1704R.C1707string.not_set_flight_distance_in_sky), C1688z.f4191b);
        } else if (i == 10000) {
            mo29799a(500);
            abstractC2974e.mo29786a(500);
        } else {
            final FlyModeLog m29824a = m29824a("2");
            new DialogC3245f.C3246a(this.f10889F).m28641a(this.f10889F.getString(C1704R.C1707string.setting_dialog_warm_hint)).m28635b(this.f10889F.getString(C1704R.C1707string.more_distance_cue)).m28644a(this.f10889F.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(this.f10889F.getString(C1704R.C1707string.setting_dialog_agree), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.7
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    C2955c.this.mo29799a(10000);
                    abstractC2974e.mo29786a(10000);
                    C2955c.this.f10890G.m33175a(m29824a);
                }
            }).m28640a(this.f10889F.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.6
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                }
            }).m28645a().show();
        }
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: a */
    public void mo29796a(SwitchButton switchButton, Setting setting) {
        if (!this.f10893k.mo32905ac()) {
            C1688z.m34449a(this.f10889F, (int) C1704R.C1707string.set_new_hand_fail, C1688z.f4191b);
        } else if (this.f10893k.m33009am()) {
            C1688z.m34447a(this.f10889F, this.f10889F.getString(C1704R.C1707string.not_set_newhand_in_sky), C1688z.f4191b);
        } else if (setting.getIsOPen().booleanValue()) {
            switchButton.m34420a(false, true);
            m29823b((byte) 1);
        } else {
            switchButton.m34420a(true, true);
            m29823b((byte) 0);
        }
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: a */
    public void mo29795a(List<Setting> list, C2932i c2932i) {
        if (list.get(c2932i.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)).getIsOPen().booleanValue()) {
            return;
        }
        if (!this.f10893k.mo32905ac()) {
            C1688z.m34449a(this.f10889F, (int) C1704R.C1707string.set_new_hand_fail, C1688z.f4191b);
        } else if (this.f10893k.m33009am()) {
            C1688z.m34447a(this.f10889F, this.f10889F.getString(C1704R.C1707string.not_set_attitude_in_sky), C1688z.f4191b);
        } else if (list.get(c2932i.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).getIsOPen().booleanValue()) {
            mo29798a(4, 0);
        } else {
            new DialogC3245f.C3246a(this.f10889F).m28641a(this.f10889F.getString(C1704R.C1707string.setting_dialog_warm_hint)).m28635b(this.f10889F.getString(C1704R.C1707string.force_attiyude_mode_delcare)).m28644a(this.f10889F.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(this.f10889F.getString(C1704R.C1707string.setting_dialog_agree), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    final FlyModeLog m29824a = C2955c.this.m29824a("1");
                    int m34502o = C1642c.m34885e().m34502o();
                    if (m34502o >= 2) {
                        C2955c.this.mo29798a(4, 1);
                        C2955c.this.f10890G.m33175a(m29824a);
                        return;
                    }
                    C1642c.m34885e().m34533c(m34502o + 1);
                    new DialogC3245f.C3262e(C2955c.this.f10889F).m28574a(C1704R.C1705drawable.img_right_pulley).m28570a(C2955c.this.f10889F.getString(C1704R.C1707string.setting_dialog_button_force_attitude)).m28569a(C2955c.this.f10889F.getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.3.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface2, int i2) {
                            C2955c.this.mo29798a(4, 1);
                            C2955c.this.f10890G.m33175a(m29824a);
                        }
                    }).m28575a().show();
                }
            }).m28640a(this.f10889F.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).m28645a().show();
        }
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: a */
    public void mo29794a(List<Setting> list, C2932i c2932i, final C1973k c1973k) {
        if (!list.get(c2932i.m29885a(C2932i.EnumC2937d.NEW_HAND_MODE)).getIsOPen().booleanValue() && !list.get(c2932i.m29885a(C2932i.EnumC2937d.FORCED_ATTITUDE_MODE)).getIsOPen().booleanValue()) {
            if (!this.f10893k.mo32905ac()) {
                C1688z.m34449a(this.f10889F, (int) C1704R.C1707string.set_new_hand_fail, C1688z.f4191b);
            } else if (this.f10893k.m33009am()) {
                C1688z.m34447a(this.f10889F, this.f10889F.getString(C1704R.C1707string.not_set_optical_flow_in_sky), C1688z.f4191b);
            } else if (list.get(c2932i.m29885a(C2932i.EnumC2937d.OPTICAL_FLOW_MODE)).getIsOPen().booleanValue()) {
                mo29798a(2, 0);
            } else {
                final FlyModeLog m29824a = m29824a("0");
                DialogC3245f.C3246a c3246a = new DialogC3245f.C3246a(this.f10889F);
                this.f10888E = C1642c.m34885e().m34501p();
                c3246a.m28641a(this.f10889F.getString(C1704R.C1707string.setting_dialog_warm_hint)).m28635b(this.f10889F.getString(C1704R.C1707string.assist_the_location_mode_to_open_please_be_careful_to_fly, this.f10888E ? C1679t.m34553b(0.5d) + this.f10889F.getString(C1704R.C1707string.distance_unit_ft) : "0.5m", this.f10888E ? C1679t.m34553b(2.5d) + this.f10889F.getString(C1704R.C1707string.distance_unit_ft) : "2.5m")).m28644a(this.f10889F.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(this.f10889F.getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.5
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C2955c.this.mo29798a(2, 1);
                        C2955c.this.f10890G.m33175a(m29824a);
                        c1973k.m33366a(C1756a.m34259c(C2955c.this.f10889F), C1973k.f5475b, new AbstractC1945k() { // from class: com.fimi.soul.module.setting.newhand.c.5.1
                            @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                            /* renamed from: a */
                            public void mo28106a(PlaneMsg planeMsg, File file) {
                                if (planeMsg.isSuccess()) {
                                }
                            }
                        });
                    }
                }).m28640a(this.f10889F.getString(C1704R.C1707string.refuse), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.4
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).m28645a().show();
            }
        }
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: b */
    public void mo29793b() {
        if (this.f10891J) {
            this.f10893k.mo32906ab().mo32587a(m29806j());
        } else if (C1772d.m34208a().m34187k()) {
            this.f10893k.mo32906ab().mo32587a(m29805k());
        } else {
            this.f10893k.mo32906ab().mo32587a(m29806j());
        }
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: b */
    public void mo29792b(double d) {
        if (d < 30.0d) {
            d = 30.0d;
        }
        if (this.f10891J) {
            this.f10893k.mo32906ab().mo32587a(m29822b((float) d));
        } else {
            this.f10893k.mo32906ab().mo32587a(m29813e((int) d));
        }
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: b */
    public void mo29791b(int i, AbstractC2974e abstractC2974e) {
        this.f10884A = i;
        if (!this.f10893k.mo32905ac()) {
            C1688z.m34449a(this.f10889F, (int) C1704R.C1707string.set_new_hand_fail, C1688z.f4191b);
        } else if (this.f10893k.m33009am()) {
            C1688z.m34447a(this.f10889F, this.f10889F.getString(C1704R.C1707string.not_set_flight_speed_in_sky), C1688z.f4191b);
        } else {
            String string = this.f10888E ? this.f10889F.getString(C1704R.C1707string.speed_unit_mph) : this.f10889F.getString(C1704R.C1707string.speed_unit_m);
            int i2 = C1772d.m34208a().m34187k() ? 16 : 18;
            this.f10885B = this.f10888E ? (int) Math.round(C1679t.m34550d(this.f10884A)) : this.f10884A;
            new DialogC3245f.C3249b(this.f10889F).m28613c(this.f10889F.getString(C1704R.C1707string.flight_speed_limit)).m28627a(3).m28620b(i2).m28611d(this.f10889F.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28623a(string).m28618b(this.f10889F.getString(C1704R.C1707string.dialog_speed_unit)).m28621a(true).m28612c(false).m28615c(this.f10884A).m28622a(this.f10889F.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.10
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i3) {
                }
            }).m28617b(this.f10889F.getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.9
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i3) {
                    C2955c.this.mo29800a(C2955c.this.f10885B);
                }
            }).m28626a(new SeekBar.OnSeekBarChangeListener() { // from class: com.fimi.soul.module.setting.newhand.c.8
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar, int i3, boolean z) {
                    C2955c.this.f10885B = i3 + 3;
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            }).m28628a().show();
        }
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: c */
    public void mo29790c() {
        if (this.f10891J) {
            this.f10893k.mo32906ab().mo32587a(m29804l());
        } else if (C1772d.m34208a().m34187k()) {
            this.f10893k.mo32906ab().mo32587a(m29803m());
        } else {
            this.f10893k.mo32906ab().mo32587a(m29804l());
        }
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: c */
    public void mo29789c(int i, final AbstractC2974e abstractC2974e) {
        this.f10886C = i;
        this.f10887D = this.f10888E ? (int) Math.round(C1679t.m34549e(this.f10886C)) : this.f10886C;
        if (!this.f10893k.mo32905ac()) {
            C1688z.m34449a(this.f10889F, (int) C1704R.C1707string.set_new_hand_fail, C1688z.f4191b);
        } else if (this.f10893k.m33009am()) {
            C1688z.m34447a(this.f10889F, this.f10889F.getString(C1704R.C1707string.not_set_flight_height_in_sky), C1688z.f4191b);
        } else {
            new DialogC3245f.C3249b(this.f10889F).m28613c(this.f10889F.getString(C1704R.C1707string.flight_height)).m28627a(30).m28620b(500).m28611d(this.f10889F.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28623a(this.f10888E ? this.f10889F.getString(C1704R.C1707string.distance_unit_ft) : this.f10889F.getString(C1704R.C1707string.distance_unit_m)).m28612c(false).m28618b(this.f10889F.getString(C1704R.C1707string.dialog_height_unit)).m28615c(this.f10886C).m28622a(this.f10889F.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.13
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                }
            }).m28617b(this.f10889F.getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.12
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    if (C2955c.this.f10887D > C1679t.m34549e(400.0d)) {
                        new DialogC3245f.C3246a(C2955c.this.f10889F).m28641a(C2955c.this.f10889F.getString(C1704R.C1707string.setting_dialog_warm_hint)).m28635b(C2955c.this.f10889F.getString(C1704R.C1707string.more_height_cue)).m28644a(C2955c.this.f10889F.getResources().getColor(C1704R.color.dialog_ensure_hot)).m28634b(C2955c.this.f10889F.getString(C1704R.C1707string.setting_dialog_agree), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.12.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface2, int i3) {
                                C2955c.this.mo29792b(C2955c.this.f10887D);
                                C2955c.this.f10890G.m33175a(C2955c.this.m29824a("3"));
                                abstractC2974e.mo29786a(C2955c.this.f10887D);
                            }
                        }).m28640a(C2955c.this.f10889F.getString(C1704R.C1707string.cancel), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.setting.newhand.c.12.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface2, int i3) {
                            }
                        }).m28645a().show();
                        return;
                    }
                    C2955c.this.mo29792b(C2955c.this.f10887D);
                    abstractC2974e.mo29786a(C2955c.this.f10886C);
                }
            }).m28626a(new SeekBar.OnSeekBarChangeListener() { // from class: com.fimi.soul.module.setting.newhand.c.11
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                    C2955c.this.f10887D = i2 + 30;
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            }).m28628a().show();
        }
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: d */
    public void mo29788d() {
        this.f10893k.mo32906ab().mo32587a(m29809g());
    }

    @Override // com.fimi.soul.module.setting.newhand.AbstractC2973d
    /* renamed from: e */
    public void mo29787e() {
        this.f10893k.mo32906ab().mo32587a(m29811f());
    }
}
