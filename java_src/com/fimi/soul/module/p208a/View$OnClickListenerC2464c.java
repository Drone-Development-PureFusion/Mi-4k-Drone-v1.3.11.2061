package com.fimi.soul.module.p208a;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.view.horizontallistview.C3272a;
import com.fimi.soul.view.horizontallistview.HorizontalListView;
import com.fimi.soul.view.marknumberprogress.AbstractC3290b;
import com.fimi.soul.view.marknumberprogress.EvProgressBar;
import com.fimi.soul.view.marknumberprogress.SaturationContrastProgressBar;
import com.fimi.soul.view.wheelview.WheelView;
/* renamed from: com.fimi.soul.module.a.c */
/* loaded from: classes.dex */
public class View$OnClickListenerC2464c implements View.OnClickListener, AdapterView.OnItemClickListener, WheelView.AbstractC3330a {

    /* renamed from: A */
    private ImageView f7973A;

    /* renamed from: B */
    private AbstractC2472a f7974B;

    /* renamed from: C */
    private boolean f7975C;

    /* renamed from: D */
    private int f7976D;

    /* renamed from: E */
    private int f7977E;

    /* renamed from: F */
    private int[] f7978F;

    /* renamed from: H */
    private boolean f7980H;

    /* renamed from: a */
    private Resources f7983a;

    /* renamed from: b */
    private View f7984b;

    /* renamed from: c */
    private EvProgressBar f7985c;

    /* renamed from: d */
    private SaturationContrastProgressBar f7986d;

    /* renamed from: e */
    private SaturationContrastProgressBar f7987e;

    /* renamed from: f */
    private String[] f7988f;

    /* renamed from: g */
    private String[] f7989g;

    /* renamed from: h */
    private String[] f7990h;

    /* renamed from: i */
    private String[] f7991i;

    /* renamed from: j */
    private String[] f7992j;

    /* renamed from: m */
    private String[] f7995m;

    /* renamed from: n */
    private TextView f7996n;

    /* renamed from: p */
    private LinearLayout f7998p;

    /* renamed from: q */
    private TextView f7999q;

    /* renamed from: r */
    private RelativeLayout f8000r;

    /* renamed from: s */
    private TextView f8001s;

    /* renamed from: t */
    private LinearLayout f8002t;

    /* renamed from: u */
    private LinearLayout f8003u;

    /* renamed from: v */
    private TextView f8004v;

    /* renamed from: w */
    private RelativeLayout f8005w;

    /* renamed from: x */
    private HorizontalListView f8006x;

    /* renamed from: y */
    private C3272a f8007y;

    /* renamed from: z */
    private ImageView f8008z;

    /* renamed from: k */
    private View[] f7993k = new View[5];

    /* renamed from: l */
    private String[][] f7994l = new String[5];

    /* renamed from: o */
    private String f7997o = "";

    /* renamed from: G */
    private int[] f7979G = {6, 64, 64, 0, 0};

    /* renamed from: I */
    private int f7981I = -1;

    /* renamed from: J */
    private Handler f7982J = new Handler() { // from class: com.fimi.soul.module.a.c.7
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (View$OnClickListenerC2464c.this.f8000r != null) {
                View$OnClickListenerC2464c.this.f8000r.setVisibility(4);
                View$OnClickListenerC2464c.this.f7998p.setVisibility(4);
            }
            if (View$OnClickListenerC2464c.this.f7974B != null) {
                View$OnClickListenerC2464c.this.f7974B.mo31545a(0);
            }
            View$OnClickListenerC2464c.this.f7975C = false;
        }
    };

    /* renamed from: com.fimi.soul.module.a.c$a */
    /* loaded from: classes.dex */
    public interface AbstractC2472a {
        /* renamed from: a */
        void mo31545a(int i);

        /* renamed from: a */
        void mo31544a(int i, String str);

        /* renamed from: a */
        void mo31543a(int i, String str, String str2);

        /* renamed from: a */
        void mo31542a(int i, boolean z);

        /* renamed from: a */
        void mo31540a(String[] strArr);
    }

    public View$OnClickListenerC2464c(View view, boolean z) {
        this.f7984b = view;
        this.f7980H = z;
        this.f7983a = view.getResources();
        this.f7976D = this.f7983a.getColor(C1704R.color.camera_menu_item_text_color_def);
        this.f7977E = this.f7983a.getColor(C1704R.color.white);
        m31586a();
        m31555l();
    }

    /* renamed from: l */
    private void m31555l() {
        this.f7985c.setOnProgressBarListener(new AbstractC3290b() { // from class: com.fimi.soul.module.a.c.4
            @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
            /* renamed from: a */
            public void mo28463a(int i) {
                View$OnClickListenerC2464c.this.m31585a(i);
            }

            @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
            /* renamed from: a */
            public void mo28462a(int i, int i2) {
                View$OnClickListenerC2464c.this.m31581a("" + View$OnClickListenerC2464c.this.f7994l[0][i]);
                if (View$OnClickListenerC2464c.this.f7974B != null) {
                    String str = View$OnClickListenerC2464c.this.f7994l[0][i];
                    View$OnClickListenerC2464c.this.f7974B.mo31543a(0, View$OnClickListenerC2464c.this.f7994l[0][i], str.equals("0.0") ? " " + str + " EV" : str + " EV");
                    View$OnClickListenerC2464c.this.m31558i();
                }
            }

            @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
            /* renamed from: b */
            public void mo28461b(int i, int i2) {
                if (View$OnClickListenerC2464c.this.f7974B == null || View$OnClickListenerC2464c.this.f7974B == null) {
                    return;
                }
                String str = View$OnClickListenerC2464c.this.f7994l[0][i];
                View$OnClickListenerC2464c.this.f7974B.mo31544a(0, str.equals("0.0") ? " " + str + " EV" : str + " EV");
            }
        });
        this.f7987e.setOnProgressBarListener(new AbstractC3290b() { // from class: com.fimi.soul.module.a.c.5
            @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
            /* renamed from: a */
            public void mo28463a(int i) {
                View$OnClickListenerC2464c.this.m31585a(i);
            }

            @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
            /* renamed from: a */
            public void mo28462a(int i, int i2) {
                View$OnClickListenerC2464c.this.m31581a("" + (i - 64));
                if (View$OnClickListenerC2464c.this.f7974B != null) {
                    View$OnClickListenerC2464c.this.f7974B.mo31543a(1, "" + (i - 64), "" + i);
                    View$OnClickListenerC2464c.this.m31558i();
                }
            }

            @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
            /* renamed from: b */
            public void mo28461b(int i, int i2) {
                if (View$OnClickListenerC2464c.this.f7974B != null) {
                    View$OnClickListenerC2464c.this.f7974B.mo31544a(1, "" + i);
                }
            }
        });
        this.f7986d.setOnProgressBarListener(new AbstractC3290b() { // from class: com.fimi.soul.module.a.c.6
            @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
            /* renamed from: a */
            public void mo28463a(int i) {
                View$OnClickListenerC2464c.this.m31585a(i);
            }

            @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
            /* renamed from: a */
            public void mo28462a(int i, int i2) {
                View$OnClickListenerC2464c.this.m31581a("" + (i - 64));
                if (View$OnClickListenerC2464c.this.f7974B != null) {
                    View$OnClickListenerC2464c.this.f7974B.mo31543a(2, "" + (i - 64), "" + i);
                    View$OnClickListenerC2464c.this.m31558i();
                }
            }

            @Override // com.fimi.soul.view.marknumberprogress.AbstractC3290b
            /* renamed from: b */
            public void mo28461b(int i, int i2) {
                if (View$OnClickListenerC2464c.this.f7974B != null) {
                    View$OnClickListenerC2464c.this.f7974B.mo31544a(2, "" + i);
                }
            }
        });
        this.f8004v.setOnClickListener(this);
        this.f8001s.setOnClickListener(this);
    }

    /* renamed from: a */
    public void m31586a() {
        this.f8000r = (RelativeLayout) this.f7984b.findViewById(C1704R.C1706id.rl_items);
        this.f7998p = (LinearLayout) this.f7984b.findViewById(C1704R.C1706id.ll_info);
        this.f7996n = (TextView) this.f7984b.findViewById(C1704R.C1706id.tv_info);
        this.f7999q = (TextView) this.f7984b.findViewById(C1704R.C1706id.tv_info_value);
        View[] viewArr = this.f7993k;
        EvProgressBar evProgressBar = (EvProgressBar) this.f7984b.findViewById(C1704R.C1706id.mEvProgressBar);
        this.f7985c = evProgressBar;
        viewArr[0] = evProgressBar;
        if (this.f7980H) {
            this.f8000r.setVisibility(4);
            this.f7998p.setVisibility(4);
            this.f7985c.setVisibility(8);
        }
        View[] viewArr2 = this.f7993k;
        SaturationContrastProgressBar saturationContrastProgressBar = (SaturationContrastProgressBar) this.f7984b.findViewById(C1704R.C1706id.mStaturationBar);
        this.f7987e = saturationContrastProgressBar;
        viewArr2[1] = saturationContrastProgressBar;
        View[] viewArr3 = this.f7993k;
        SaturationContrastProgressBar saturationContrastProgressBar2 = (SaturationContrastProgressBar) this.f7984b.findViewById(C1704R.C1706id.mContrastBar);
        this.f7986d = saturationContrastProgressBar2;
        viewArr3[2] = saturationContrastProgressBar2;
        View[] viewArr4 = this.f7993k;
        LinearLayout linearLayout = (LinearLayout) this.f7984b.findViewById(C1704R.C1706id.sharpan_ly);
        this.f8003u = linearLayout;
        viewArr4[3] = linearLayout;
        this.f8004v = (TextView) this.f7984b.findViewById(C1704R.C1706id.sharpan_normal);
        this.f8001s = (TextView) this.f7984b.findViewById(C1704R.C1706id.sharpan_hight);
        this.f8006x = (HorizontalListView) this.f7984b.findViewById(C1704R.C1706id.whitebalance_horizon_listview);
        this.f8005w = (RelativeLayout) this.f7984b.findViewById(C1704R.C1706id.whitebalance_rl);
        this.f7993k[4] = this.f8005w;
        String[][] strArr = this.f7994l;
        String[] stringArray = this.f7983a.getStringArray(C1704R.array.ev);
        this.f7988f = stringArray;
        strArr[0] = stringArray;
        this.f7985c.setMax(this.f7988f.length - 1);
        String[][] strArr2 = this.f7994l;
        String[] stringArray2 = this.f7983a.getStringArray(C1704R.array.saturation);
        this.f7989g = stringArray2;
        strArr2[1] = stringArray2;
        String[][] strArr3 = this.f7994l;
        String[] stringArray3 = this.f7983a.getStringArray(C1704R.array.contrast);
        this.f7990h = stringArray3;
        strArr3[2] = stringArray3;
        String[][] strArr4 = this.f7994l;
        String[] stringArray4 = this.f7983a.getStringArray(C1704R.array.sharpan);
        this.f7991i = stringArray4;
        strArr4[3] = stringArray4;
        this.f8004v.setText(this.f7991i[0]);
        this.f8001s.setText(this.f7991i[1]);
        String[][] strArr5 = this.f7994l;
        String[] stringArray5 = this.f7983a.getStringArray(C1704R.array.whitebalance);
        this.f7992j = stringArray5;
        strArr5[4] = stringArray5;
        this.f7995m = this.f7983a.getStringArray(C1704R.array.cmd_whitebalance);
        m31578b();
        this.f7997o = this.f7983a.getString(C1704R.C1707string.camera_menu_ev);
    }

    /* renamed from: a */
    public void m31585a(int i) {
        if (this.f7974B != null) {
            if (i == 0) {
                this.f7974B.mo31545a(4);
            } else if (i != 1) {
            } else {
                this.f7974B.mo31545a(0);
            }
        }
    }

    @Override // com.fimi.soul.view.wheelview.WheelView.AbstractC3330a
    /* renamed from: a */
    public void mo28279a(int i, Object obj) {
        if (this.f7981I == i) {
            return;
        }
        this.f7981I = i;
        this.f7998p.setVisibility(0);
        this.f7997o = ((C2473d) obj).m31554a();
        m31573c(i - 1);
        if (this.f7974B != null) {
            if (i == this.f7979G.length) {
                this.f7974B.mo31542a(i - 1, true);
            } else {
                this.f7974B.mo31542a(i - 1, false);
            }
        }
        if (i != 4) {
            return;
        }
        this.f8006x.m28556a(this.f8007y.m28536a(), this.f8007y.getCount());
    }

    /* renamed from: a */
    public void m31584a(AbstractC2472a abstractC2472a) {
        this.f7974B = abstractC2472a;
    }

    /* renamed from: a */
    public void m31581a(String str) {
        this.f7996n.setText(this.f7997o + " : ");
        this.f7999q.setText(str);
    }

    /* renamed from: a */
    public void m31580a(int[] iArr) {
        this.f7978F = iArr;
        if (!this.f7980H) {
            this.f7985c.setProgress(iArr[0]);
        }
        m31581a(this.f7988f[iArr[0]]);
        this.f7987e.setProgress(iArr[1]);
        this.f7986d.setProgress(iArr[2]);
        switch (iArr[3]) {
            case 0:
                this.f8004v.setSelected(true);
                this.f8001s.setSelected(false);
                this.f8004v.setTextColor(this.f7977E);
                this.f8001s.setTextColor(this.f7976D);
                break;
            case 1:
                this.f8004v.setSelected(false);
                this.f8001s.setSelected(true);
                this.f8004v.setTextColor(this.f7976D);
                this.f8001s.setTextColor(this.f7977E);
                break;
        }
        this.f8007y.m28535a(iArr[4]);
        this.f8007y.notifyDataSetChanged();
    }

    /* renamed from: a */
    public int[] m31579a(String[] strArr) {
        int[] iArr = new int[5];
        for (int i = 0; i < strArr.length; i++) {
            switch (i) {
                case 0:
                    iArr[i] = m31575b(strArr[i]);
                    break;
                case 1:
                    iArr[i] = m31571c(strArr[i]);
                    break;
                case 2:
                    iArr[i] = m31568d(strArr[i]);
                    break;
                case 3:
                    iArr[i] = m31565e(strArr[i]);
                    break;
                case 4:
                    iArr[i] = m31562f(strArr[i]);
                    break;
            }
        }
        return iArr;
    }

    /* renamed from: b */
    public int m31577b(int i) {
        switch (i) {
            case 0:
                return this.f7985c.getProgress();
            case 1:
                return this.f7987e.getProgress();
            case 2:
                return this.f7986d.getProgress();
            case 3:
            default:
                return 0;
            case 4:
                return this.f8007y.m28536a();
        }
    }

    /* renamed from: b */
    public int m31575b(String str) {
        if (str == null) {
            return 6;
        }
        if (str != null && str.equals("unknown")) {
            return 6;
        }
        int i = 0;
        while (true) {
            if (i >= this.f7988f.length) {
                i = 6;
                break;
            } else if (str.contains(this.f7988f[i])) {
                break;
            } else {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public void m31578b() {
        this.f8008z = (ImageView) this.f7984b.findViewById(C1704R.C1706id.bt_sliding_left);
        this.f8008z.setVisibility(8);
        this.f7973A = (ImageView) this.f7984b.findViewById(C1704R.C1706id.bt_sliding_right);
        this.f8007y = new C3272a(this.f7984b.getContext(), this.f7992j);
        this.f8006x.setAdapter((ListAdapter) this.f8007y);
        this.f8006x.setOnChangeListener(new HorizontalListView.AbstractC3270a() { // from class: com.fimi.soul.module.a.c.1
            @Override // com.fimi.soul.view.horizontallistview.HorizontalListView.AbstractC3270a
            /* renamed from: a */
            public void mo28538a() {
                View$OnClickListenerC2464c.this.m31558i();
            }
        });
        this.f8006x.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.fimi.soul.module.a.c.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                View$OnClickListenerC2464c.this.f8007y.m28535a(i);
                View$OnClickListenerC2464c.this.f8007y.notifyDataSetChanged();
                String str = View$OnClickListenerC2464c.this.f7994l[4][i];
                View$OnClickListenerC2464c.this.m31581a("" + str);
                if (View$OnClickListenerC2464c.this.f7974B != null) {
                    View$OnClickListenerC2464c.this.f7974B.mo31543a(4, str, View$OnClickListenerC2464c.this.f7995m[i]);
                    View$OnClickListenerC2464c.this.f7974B.mo31544a(4, View$OnClickListenerC2464c.this.f7995m[i]);
                }
            }
        });
        this.f8006x.setOnListViewGuide(new HorizontalListView.AbstractC3271b() { // from class: com.fimi.soul.module.a.c.3
            @Override // com.fimi.soul.view.horizontallistview.HorizontalListView.AbstractC3271b
            /* renamed from: a */
            public void mo28537a(int i) {
                if (i == 0) {
                    View$OnClickListenerC2464c.this.f7973A.setVisibility(0);
                    View$OnClickListenerC2464c.this.f8008z.setVisibility(8);
                } else if (i == 1) {
                    View$OnClickListenerC2464c.this.f7973A.setVisibility(0);
                    View$OnClickListenerC2464c.this.f8008z.setVisibility(0);
                } else if (i != 2) {
                } else {
                    View$OnClickListenerC2464c.this.f7973A.setVisibility(8);
                    View$OnClickListenerC2464c.this.f8008z.setVisibility(0);
                }
            }
        });
    }

    /* renamed from: c */
    public int m31571c(String str) {
        if (str == null || str == null || str.equals("unknown")) {
            return 64;
        }
        return Integer.parseInt(str);
    }

    /* renamed from: c */
    public void m31574c() {
        if (!this.f7980H) {
            this.f7985c.setProgress(this.f7979G[0]);
        }
        this.f7987e.setProgress(this.f7979G[1]);
        this.f7986d.setProgress(this.f7979G[2]);
        switch (this.f7979G[3]) {
            case 0:
                this.f8004v.setSelected(true);
                this.f8001s.setSelected(false);
                this.f8004v.setTextColor(this.f7977E);
                this.f8001s.setTextColor(this.f7976D);
                break;
            case 1:
                this.f8004v.setSelected(false);
                this.f8001s.setSelected(true);
                this.f8004v.setTextColor(this.f7976D);
                this.f8001s.setTextColor(this.f7977E);
                break;
        }
        this.f8007y.m28535a(this.f7979G[4]);
        this.f8007y.notifyDataSetChanged();
        m31573c(4);
    }

    /* renamed from: c */
    public void m31573c(int i) {
        if (this.f8000r.getVisibility() != 0) {
            this.f8000r.setVisibility(0);
        }
        for (int i2 = 0; i2 < this.f7993k.length; i2++) {
            if (i != i2) {
                this.f7993k[i2].setVisibility(4);
            } else if (i != 0 || !this.f7980H) {
                this.f7993k[i2].setVisibility(0);
                switch (i) {
                    case 0:
                        m31581a("" + this.f7994l[i2][m31577b(i2)]);
                        break;
                    case 1:
                        m31581a("" + (m31577b(i2) - 64));
                    case 2:
                        m31581a("" + (m31577b(i2) - 64));
                        break;
                    case 3:
                        m31581a("" + this.f7994l[i2][m31564f()]);
                        break;
                    case 4:
                        m31581a("" + this.f7994l[i2][m31577b(i2)]);
                        break;
                }
            } else {
                this.f7998p.setVisibility(4);
                this.f8000r.setVisibility(4);
            }
        }
    }

    /* renamed from: d */
    public int m31568d(String str) {
        if (str == null || str == null || str.equals("unknown")) {
            return 64;
        }
        return Integer.parseInt(str);
    }

    /* renamed from: d */
    public String[] m31570d() {
        String[] strArr = new String[this.f7979G.length];
        if (this.f7980H) {
            strArr[0] = this.f7988f[this.f7978F[0]];
        } else {
            strArr[0] = this.f7988f[this.f7979G[0]];
        }
        strArr[1] = "" + (this.f7979G[1] - 64);
        strArr[2] = "" + (this.f7979G[2] - 64);
        strArr[3] = this.f7991i[this.f7979G[3]];
        strArr[4] = this.f7992j[this.f7979G[4]];
        this.f8006x.setSelection(this.f7979G[4]);
        return strArr;
    }

    /* renamed from: e */
    public int m31565e(String str) {
        if (str == null) {
            return 0;
        }
        int parseInt = (str == null || str.equals("unknown")) ? 3 : Integer.parseInt(str);
        if (parseInt != 3 && parseInt != 4) {
            parseInt = 3;
        }
        return parseInt - 3;
    }

    /* renamed from: e */
    public String[] m31567e() {
        String[] strArr = new String[this.f7978F.length];
        strArr[0] = this.f7988f[this.f7978F[0]];
        strArr[1] = "" + (this.f7978F[1] - 64);
        strArr[2] = "" + (this.f7978F[2] - 64);
        strArr[3] = this.f7991i[this.f7978F[3]];
        strArr[4] = this.f7992j[this.f7978F[4]];
        this.f8006x.setSelection(this.f7978F[4]);
        return strArr;
    }

    /* renamed from: f */
    public int m31564f() {
        return (!this.f8004v.isSelected() && this.f8001s.isSelected()) ? 1 : 0;
    }

    /* renamed from: f */
    public int m31562f(String str) {
        if (str == null) {
            return 0;
        }
        if (str != null && str.equals("unknown")) {
            return 0;
        }
        int i = 0;
        while (true) {
            if (i >= this.f7995m.length) {
                i = 0;
                break;
            } else if (str.contains(this.f7995m[i])) {
                break;
            } else {
                i++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public void m31561g() {
        if (this.f7974B != null) {
            this.f7974B.mo31540a(m31570d());
        }
    }

    @Override // com.fimi.soul.view.wheelview.WheelView.AbstractC3330a
    /* renamed from: h */
    public void mo28278h() {
        m31561g();
    }

    /* renamed from: i */
    public void m31558i() {
        if (this.f7982J != null) {
            this.f7982J.removeMessages(0);
        }
    }

    /* renamed from: j */
    public String[] m31557j() {
        String[] strArr = new String[5];
        for (int i = 0; i < this.f7979G.length; i++) {
            switch (i) {
                case 0:
                    strArr[i] = this.f7988f[i];
                    break;
                case 1:
                    strArr[i] = "" + this.f7979G[i];
                    break;
                case 2:
                    strArr[i] = "" + this.f7979G[i];
                    break;
                case 3:
                    strArr[i] = "" + this.f7979G[i] + 3;
                    break;
                case 4:
                    strArr[i] = this.f7995m[i];
                    break;
            }
        }
        return strArr;
    }

    /* renamed from: k */
    public String m31556k() {
        return this.f7980H ? "on_ev" : C1831e.f4911cE;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.sharpan_normal /* 2131755550 */:
                this.f8004v.setSelected(true);
                this.f8001s.setSelected(false);
                this.f8004v.setTextColor(this.f7977E);
                this.f8001s.setTextColor(this.f7976D);
                if (this.f7974B != null) {
                    String str = this.f7994l[3][0];
                    m31581a(str);
                    this.f7974B.mo31543a(3, str, "3");
                    this.f7974B.mo31544a(3, "3");
                    break;
                }
                break;
            case C1704R.C1706id.sharpan_hight /* 2131755551 */:
                this.f8004v.setSelected(false);
                this.f8001s.setSelected(true);
                this.f8004v.setTextColor(this.f7976D);
                this.f8001s.setTextColor(this.f7977E);
                if (this.f7974B != null) {
                    String str2 = this.f7994l[3][1];
                    m31581a(str2);
                    this.f7974B.mo31543a(3, str2, "4");
                    this.f7974B.mo31544a(3, "4");
                    break;
                }
                break;
        }
        if (this.f7982J == null || !this.f7975C) {
            return;
        }
        this.f7982J.removeMessages(0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i < 5) {
            this.f7998p.setVisibility(0);
            this.f7997o = ((TextView) view.findViewById(C1704R.C1706id.tv_lv_item_tag)).getText().toString();
            m31573c(i);
            if (this.f7974B != null) {
            }
            this.f7975C = true;
        } else {
            m31561g();
        }
        if (this.f7974B != null) {
            this.f7974B.mo31542a(i, false);
        }
    }
}
