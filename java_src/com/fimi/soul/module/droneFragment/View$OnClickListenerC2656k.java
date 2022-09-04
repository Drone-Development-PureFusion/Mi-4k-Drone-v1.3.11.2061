package com.fimi.soul.module.droneFragment;

import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.AbstractC1794c;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.p182j.C1877d;
import com.fimi.soul.biz.p182j.C1882h;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p205i.p206a.C2286a;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.C3077ae;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.MyEditView;
import com.fimi.soul.view.SwitchButtonStoke;
import com.fimi.soul.view.myhorizontalseebar.SeekBar;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.p253b.C9755a;
import java.math.BigDecimal;
import java.util.regex.Pattern;
/* renamed from: com.fimi.soul.module.droneFragment.k */
/* loaded from: classes.dex */
public class View$OnClickListenerC2656k implements View.OnClickListener, SwitchButtonStoke.AbstractC3176a {

    /* renamed from: U */
    private static final int f8933U = 1;

    /* renamed from: Y */
    private static final int f8934Y = 1;

    /* renamed from: Z */
    private static final int f8935Z = 2;

    /* renamed from: aa */
    private static final int f8936aa = 1500;

    /* renamed from: ac */
    private static final String f8937ac = "TakePhotoView";

    /* renamed from: B */
    private int f8939B;

    /* renamed from: C */
    private int f8940C;

    /* renamed from: D */
    private int f8941D;

    /* renamed from: E */
    private int f8942E;

    /* renamed from: H */
    private double f8945H;

    /* renamed from: I */
    private double f8946I;

    /* renamed from: J */
    private double f8947J;

    /* renamed from: K */
    private double f8948K;

    /* renamed from: L */
    private double f8949L;

    /* renamed from: O */
    private boolean f8952O;

    /* renamed from: R */
    private String f8955R;

    /* renamed from: V */
    private boolean f8958V;

    /* renamed from: W */
    private String f8959W;

    /* renamed from: X */
    private String f8960X;

    /* renamed from: a */
    private Button f8961a;

    /* renamed from: ad */
    private FlightActivity.AbstractC2736a f8963ad;

    /* renamed from: b */
    private Button f8964b;

    /* renamed from: c */
    private Button f8965c;

    /* renamed from: d */
    private MyEditView f8966d;

    /* renamed from: e */
    private MyEditView f8967e;

    /* renamed from: f */
    private TextView f8968f;

    /* renamed from: g */
    private TextView f8969g;

    /* renamed from: h */
    private TextView f8970h;

    /* renamed from: i */
    private TextView f8971i;

    /* renamed from: j */
    private TextView f8972j;

    /* renamed from: k */
    private TextView f8973k;

    /* renamed from: l */
    private TextView f8974l;

    /* renamed from: m */
    private TextView f8975m;

    /* renamed from: n */
    private SeekBar f8976n;

    /* renamed from: o */
    private SeekBar f8977o;

    /* renamed from: p */
    private SwitchButtonStoke f8978p;

    /* renamed from: q */
    private C2083a f8979q;

    /* renamed from: r */
    private PercentRelativeLayout f8980r;

    /* renamed from: s */
    private ImageView f8981s;

    /* renamed from: t */
    private int f8982t = 1;

    /* renamed from: u */
    private int f8983u = 30;

    /* renamed from: v */
    private int f8984v = 10;

    /* renamed from: w */
    private int f8985w = 10;

    /* renamed from: x */
    private int f8986x = 120;

    /* renamed from: y */
    private int f8987y = 500;

    /* renamed from: z */
    private int f8988z = 4;

    /* renamed from: A */
    private int f8938A = 8;

    /* renamed from: F */
    private int f8943F = 20;

    /* renamed from: G */
    private int f8944G = 1;

    /* renamed from: N */
    private int f8951N = 300;

    /* renamed from: P */
    private boolean f8953P = false;

    /* renamed from: Q */
    private int f8954Q = 0;

    /* renamed from: S */
    private String f8956S = "s";

    /* renamed from: T */
    private String f8957T = "m/s";

    /* renamed from: ab */
    private Handler f8962ab = new Handler() { // from class: com.fimi.soul.module.droneFragment.k.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    View$OnClickListenerC2656k.this.m30838a(View$OnClickListenerC2656k.this.f8966d, View$OnClickListenerC2656k.this.f8942E, 0, View$OnClickListenerC2656k.this.f8976n, View$OnClickListenerC2656k.this.f8956S);
                    return;
                case 2:
                    View$OnClickListenerC2656k.this.m30838a(View$OnClickListenerC2656k.this.f8967e, View$OnClickListenerC2656k.this.f8939B, View$OnClickListenerC2656k.this.f8982t, View$OnClickListenerC2656k.this.f8977o, View$OnClickListenerC2656k.this.f8958V ? View$OnClickListenerC2656k.this.f8979q.f5919d.getString(C1704R.C1707string.speed_unit_mph) : View$OnClickListenerC2656k.this.f8979q.f5919d.getString(C1704R.C1707string.speed_unit_m));
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: M */
    private C1827d f8950M = (C1827d) C1783b.m34166a().m34150d();

    public View$OnClickListenerC2656k(View view, C2083a c2083a) {
        this.f8979q = c2083a;
        m30847a(view);
    }

    /* renamed from: a */
    private int m30850a(double d) {
        this.f8945H = d;
        double sin = (int) (this.f8988z / Math.sin(Math.toRadians(d)));
        double cos = (int) (this.f8938A / Math.cos(Math.toRadians(d)));
        if (Math.cos(Math.toRadians(d)) * sin <= this.f8938A && Math.sin(Math.toRadians(d)) * cos > this.f8988z) {
            this.f8939B = (int) sin;
        }
        if (Math.cos(Math.toRadians(d)) * sin > this.f8938A && Math.sin(Math.toRadians(d)) * cos <= this.f8988z) {
            this.f8939B = (int) cos;
        }
        if (Math.sin(Math.toRadians(d)) * cos <= this.f8988z && Math.cos(Math.toRadians(d)) * sin <= this.f8938A) {
            if (sin >= cos) {
                this.f8939B = (int) sin;
            } else {
                this.f8939B = (int) cos;
            }
        }
        this.f8977o.setMax(this.f8958V ? (int) C1679t.m34551c(this.f8939B - 1) : this.f8939B - 1);
        this.f8975m.setText(String.format(this.f8979q.f5919d.getString(C1704R.C1707string.fly_angle), Integer.valueOf((int) d)));
        int m34551c = (this.f8958V ? (int) C1679t.m34551c(1.0d) : 1) + this.f8977o.getProgress();
        m30848a(m30812l(), d, (int) (this.f8987y - m30814k()), this.f8958V ? (float) C1679t.m34550d(m34551c) : m34551c);
        return this.f8939B;
    }

    /* renamed from: a */
    private int m30848a(int i, double d, int i2, float f) {
        double sin = i / Math.sin(Math.toRadians(d));
        double d2 = this.f8951N;
        int i3 = this.f8951N;
        if ((Math.cos(Math.toRadians(d)) * sin) - m30814k() <= i3 && (Math.sin(Math.toRadians(d)) * d2) - ((this.f8979q.mo32891w().m32188g() - 677216.0d) / 10.0d) <= i) {
            if (sin <= d2) {
                this.f8942E = (int) (d2 / f);
                this.f8940C = (int) d2;
            } else {
                this.f8942E = (int) (sin / f);
                this.f8940C = (int) sin;
            }
        }
        if ((Math.cos(Math.toRadians(d)) * sin) - m30814k() <= i3 && (Math.sin(Math.toRadians(d)) * d2) - ((this.f8979q.mo32891w().m32188g() - 677216.0d) / 10.0d) > i) {
            this.f8942E = (int) (sin / f);
            this.f8940C = (int) sin;
        }
        if ((sin * Math.cos(Math.toRadians(d))) - m30814k() > i3 && (Math.sin(Math.toRadians(d)) * d2) - ((this.f8979q.mo32891w().m32188g() - 677216.0d) / 10.0d) <= i) {
            this.f8942E = (int) (d2 / f);
            this.f8940C = (int) d2;
        }
        m30810m();
        this.f8976n.setMax(this.f8942E);
        return this.f8942E;
    }

    /* renamed from: a */
    private void m30847a(View view) {
        View[] viewArr;
        MyEditView[] myEditViewArr;
        this.f8972j = (TextView) view.findViewById(C1704R.C1706id.guestDestinceDes);
        this.f8973k = (TextView) view.findViewById(C1704R.C1706id.height_diatance_guest);
        this.f8974l = (TextView) view.findViewById(C1704R.C1706id.drone_fly_direction);
        this.f8975m = (TextView) view.findViewById(C1704R.C1706id.drone_fly_angle);
        this.f8981s = (ImageView) view.findViewById(C1704R.C1706id.targeImage);
        this.f8980r = (PercentRelativeLayout) view.findViewById(C1704R.C1706id.takephoto_operaRL);
        this.f8961a = (Button) view.findViewById(C1704R.C1706id.fly_action_cancal_btn);
        this.f8964b = (Button) view.findViewById(C1704R.C1706id.fly_action_execute_btn);
        this.f8968f = (TextView) view.findViewById(C1704R.C1706id.show_camera_angle);
        this.f8969g = (TextView) view.findViewById(C1704R.C1706id.heighdes);
        this.f8970h = (TextView) view.findViewById(C1704R.C1706id.speekdes);
        this.f8976n = (SeekBar) view.findViewById(C1704R.C1706id.heightseebar_value);
        this.f8976n.setOnSeekBarChangeListener(new SeekBar.AbstractC3299a() { // from class: com.fimi.soul.module.droneFragment.k.2
            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28392a(SeekBar seekBar) {
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28391a(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    View$OnClickListenerC2656k.this.f8966d.setText(i + "s");
                    View$OnClickListenerC2656k.this.m30810m();
                    C1877d.m33782p().m33800b(i);
                }
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: b */
            public void mo28390b(SeekBar seekBar) {
            }
        });
        this.f8977o = (SeekBar) view.findViewById(C1704R.C1706id.speek_seebar_value);
        this.f8958V = C1642c.m34885e().m34501p();
        this.f8977o.setOnSeekBarChangeListener(new SeekBar.AbstractC3299a() { // from class: com.fimi.soul.module.droneFragment.k.3
            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28392a(SeekBar seekBar) {
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28391a(SeekBar seekBar, int i, boolean z) {
                Log.d(View$OnClickListenerC2656k.f8937ac, "onProgressChanged: " + i);
                int m34551c = i + (View$OnClickListenerC2656k.this.f8958V ? (int) C1679t.m34551c(1.0d) : 1);
                View$OnClickListenerC2656k.this.m30810m();
                View$OnClickListenerC2656k.this.f8967e.setText(m34551c + (View$OnClickListenerC2656k.this.f8958V ? View$OnClickListenerC2656k.this.f8979q.f5919d.getString(C1704R.C1707string.speed_unit_mph) : View$OnClickListenerC2656k.this.f8979q.f5919d.getString(C1704R.C1707string.speed_unit_m)));
                C1877d.m33782p().m33810a(View$OnClickListenerC2656k.this.f8958V ? (float) C1679t.m34550d(m34551c) : m34551c);
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: b */
            public void mo28390b(SeekBar seekBar) {
                View$OnClickListenerC2656k.this.m30820h();
            }
        });
        this.f8978p = (SwitchButtonStoke) view.findViewById(C1704R.C1706id.is_auto_back);
        this.f8978p.setOnSwitchListener(new SwitchButtonStoke.AbstractC3176a() { // from class: com.fimi.soul.module.droneFragment.k.4
            @Override // com.fimi.soul.view.SwitchButtonStoke.AbstractC3176a
            /* renamed from: a */
            public void mo28856a(View view2, boolean z) {
                if (z) {
                    View$OnClickListenerC2656k.this.f8954Q = 1;
                } else {
                    View$OnClickListenerC2656k.this.f8954Q = 0;
                }
            }
        });
        this.f8971i = (TextView) view.findViewById(C1704R.C1706id.sbbuttondes);
        this.f8965c = (Button) view.findViewById(C1704R.C1706id.setflyphoto);
        this.f8966d = (MyEditView) view.findViewById(C1704R.C1706id.height_value);
        this.f8966d.addTextChangedListener(new TextWatcher() { // from class: com.fimi.soul.module.droneFragment.k.5
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!View$OnClickListenerC2656k.this.f8966d.hasFocus() || View$OnClickListenerC2656k.this.f8959W.equals(editable.toString())) {
                    return;
                }
                if (View$OnClickListenerC2656k.this.f8962ab.hasMessages(1)) {
                    View$OnClickListenerC2656k.this.f8962ab.removeMessages(1);
                }
                View$OnClickListenerC2656k.this.f8962ab.sendEmptyMessageDelayed(1, 1500L);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                View$OnClickListenerC2656k.this.f8959W = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f8966d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.fimi.soul.module.droneFragment.k.6
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                if (!z) {
                    View$OnClickListenerC2656k.this.m30838a(View$OnClickListenerC2656k.this.f8966d, View$OnClickListenerC2656k.this.f8942E, 0, View$OnClickListenerC2656k.this.f8976n, View$OnClickListenerC2656k.this.f8956S);
                    return;
                }
                View$OnClickListenerC2656k.this.f8955R = View$OnClickListenerC2656k.this.f8966d.getText().toString();
                if (View$OnClickListenerC2656k.this.f8955R.length() <= 0) {
                    return;
                }
                View$OnClickListenerC2656k.this.f8966d.setText(View$OnClickListenerC2656k.this.f8955R.substring(0, View$OnClickListenerC2656k.this.f8955R.length() - 1));
            }
        });
        this.f8967e = (MyEditView) view.findViewById(C1704R.C1706id.speek_value);
        this.f8967e.addTextChangedListener(new TextWatcher() { // from class: com.fimi.soul.module.droneFragment.k.7
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!View$OnClickListenerC2656k.this.f8967e.hasFocus() || View$OnClickListenerC2656k.this.f8960X.equals(editable.toString())) {
                    return;
                }
                if (View$OnClickListenerC2656k.this.f8962ab.hasMessages(2)) {
                    View$OnClickListenerC2656k.this.f8962ab.removeMessages(2);
                }
                View$OnClickListenerC2656k.this.f8962ab.sendEmptyMessageDelayed(2, 1500L);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                View$OnClickListenerC2656k.this.f8960X = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f8967e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.fimi.soul.module.droneFragment.k.8
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                if (!z) {
                    View$OnClickListenerC2656k.this.m30838a(View$OnClickListenerC2656k.this.f8967e, View$OnClickListenerC2656k.this.f8939B, View$OnClickListenerC2656k.this.f8982t, View$OnClickListenerC2656k.this.f8977o, View$OnClickListenerC2656k.this.f8958V ? View$OnClickListenerC2656k.this.f8979q.f5919d.getString(C1704R.C1707string.speed_unit_mph) : View$OnClickListenerC2656k.this.f8979q.f5919d.getString(C1704R.C1707string.speed_unit_m));
                    return;
                }
                View$OnClickListenerC2656k.this.f8955R = View$OnClickListenerC2656k.this.f8966d.getText().toString();
                if (View$OnClickListenerC2656k.this.f8955R.length() <= 3) {
                    return;
                }
                View$OnClickListenerC2656k.this.f8967e.setText(View$OnClickListenerC2656k.this.f8955R.substring(0, View$OnClickListenerC2656k.this.f8955R.length() - 3));
            }
        });
        C3103au.m29232a(this.f8979q.f5919d.getAssets(), this.f8961a, this.f8964b, this.f8968f, this.f8969g, this.f8970h, this.f8971i, this.f8965c, this.f8972j, this.f8973k, this.f8974l, this.f8975m);
        C3103au.m29218b(this.f8979q.f5919d.getAssets(), this.f8966d, this.f8967e);
        for (View view2 : new View[]{this.f8961a, this.f8964b, this.f8965c}) {
            if (view2 instanceof SwitchButtonStoke) {
                ((SwitchButtonStoke) view2).setOnSwitchListener(this);
            } else {
                view2.setOnClickListener(this);
            }
        }
        for (MyEditView myEditView : new MyEditView[]{this.f8966d, this.f8967e}) {
            myEditView.clearFocus();
            myEditView.setInputType(2);
        }
    }

    /* renamed from: a */
    private void m30846a(EditText editText) {
        if (editText.getText().toString().length() > 0) {
            if (this.f8966d == editText) {
                this.f8966d.setSelection(this.f8966d.length() - 1);
            } else if (this.f8967e != editText || this.f8967e.length() <= 3) {
            } else {
                this.f8967e.setSelection(this.f8967e.length() - 3);
            }
        }
    }

    /* renamed from: a */
    private void m30845a(TextView textView, int i, String str) {
        if (!textView.getText().toString().equals(String.format(this.f8979q.f5919d.getString(i), str))) {
            textView.setText(String.format(this.f8979q.f5919d.getString(i), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m30838a(MyEditView myEditView, int i, int i2, SeekBar seekBar, String str) {
        float parseInt;
        try {
            myEditView.setCursorVisible(false);
            String m30836a = m30836a(m30832b(myEditView.getText().toString()));
            if (seekBar == this.f8977o) {
                parseInt = this.f8958V ? (float) C1679t.m34550d(Float.parseFloat(m30836a)) : Float.parseFloat(m30836a);
            } else {
                parseInt = Integer.parseInt(m30836a);
            }
            if (seekBar == this.f8977o) {
                if (parseInt > i) {
                    parseInt = i;
                    StringBuilder sb = new StringBuilder();
                    if (this.f8958V) {
                        i = (int) C1679t.m34551c(i);
                    }
                    m30836a = sb.append(i).append(str).toString();
                    myEditView.setText(m30836a);
                } else if (parseInt < i2) {
                    parseInt = i2;
                    m30836a = (this.f8958V ? (int) C1679t.m34551c(i2) : i2) + str;
                    myEditView.setText(m30836a);
                }
                if (!m30836a.contains(str)) {
                    myEditView.setText(m30836a + str);
                }
                seekBar.setProgress((this.f8958V ? (int) Math.round(C1679t.m34551c(parseInt)) : Math.round(parseInt)) - (this.f8958V ? (int) C1679t.m34551c(1.0d) : 1));
            } else {
                if (parseInt > i) {
                    parseInt = i;
                    String str2 = i + str;
                    myEditView.setText(str2);
                    m30836a = str2;
                } else if (parseInt < i2) {
                    parseInt = i2;
                    String str3 = i2 + str;
                    myEditView.setText(str3);
                    m30836a = str3;
                }
                if (str == this.f8956S) {
                    C1877d.m33782p().m33800b(Math.round(Float.valueOf(parseInt).floatValue()));
                } else {
                    C1877d.m33782p().m33810a(this.f8958V ? (float) C1679t.m34550d(parseInt) : parseInt);
                }
                if (!m30836a.contains(str)) {
                    myEditView.setText(m30836a + str);
                }
                seekBar.setProgress(Math.round(parseInt));
            }
            m30846a((EditText) myEditView);
            myEditView.setCursorVisible(true);
        } catch (Exception e) {
            myEditView.setText(i2 + str);
            m30846a((EditText) myEditView);
            myEditView.setCursorVisible(true);
        }
    }

    /* renamed from: b */
    public static String m30832b(String str) {
        return Pattern.compile("[^0-9.]").matcher(str).replaceAll("").trim();
    }

    /* renamed from: k */
    private double m30814k() {
        return C3077ae.m29349c(new LatLng(this.f8979q.mo32890x().m32302b(), this.f8979q.mo32890x().m32301c()), new LatLng(this.f8979q.mo32891w().m32189f(), this.f8979q.mo32891w().m32190e())).m29318a();
    }

    /* renamed from: l */
    private int m30812l() {
        return (int) (this.f8986x - ((this.f8979q.mo32891w().m32188g() - 677216.0d) / 10.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m30810m() {
        int m34551c = (this.f8958V ? (int) C1679t.m34551c(1.0d) : 1) + this.f8977o.getProgress();
        float m34550d = (this.f8958V ? (float) C1679t.m34550d(m34551c) : m34551c) * this.f8976n.getProgress();
        double m34556a = C1679t.m34556a((m34550d * Math.sin(Math.toRadians(this.f8945H))) + ((this.f8979q.mo32891w().m32188g() - 677216.0d) / 10.0d), 1);
        double m34556a2 = C1679t.m34556a(m34550d * Math.cos(Math.toRadians(this.f8945H)), 1);
        m30845a(this.f8973k, C1704R.C1707string.take_phone_fly_time, this.f8958V ? C1679t.m34553b(m34556a) + this.f8979q.f5919d.getString(C1704R.C1707string.distance_unit_ft) : m34556a + this.f8979q.f5919d.getString(C1704R.C1707string.distance_unit_m));
        m30845a(this.f8972j, C1704R.C1707string.guest_distance_value, this.f8958V ? C1679t.m34553b(m34556a2) + this.f8979q.f5919d.getString(C1704R.C1707string.distance_unit_ft) : m34556a2 + this.f8979q.f5919d.getString(C1704R.C1707string.distance_unit_m));
    }

    /* renamed from: a */
    public LatLng m30837a(LatLng latLng, double d, double d2) {
        return C3077ae.m29353a(latLng, d, d2);
    }

    /* renamed from: a */
    public String m30836a(String str) {
        return BigDecimal.valueOf(Double.parseDouble(str)).stripTrailingZeros().toPlainString();
    }

    /* renamed from: a */
    public void m30851a() {
        if (this.f8979q.m33001au().m32390g().isEnforcementAtti()) {
            C1688z.m34449a(this.f8979q.f5919d, (int) C1704R.C1707string.cant_fly_takePhoto_atti, 3000);
        } else if (this.f8979q.m33001au().m32390g().isLightStream()) {
            C1688z.m34449a(this.f8979q.f5919d, (int) C1704R.C1707string.cant_fly_takePhoto_VPU, 3000);
        } else if (this.f8942E > 0 && this.f8976n.getProgress() == 0) {
            C1688z.m34449a(this.f8979q.f5919d, (int) C1704R.C1707string.set_flyTime, 3000);
        } else {
            if (this.f8950M == null || this.f8950M.g() != AbstractC1794c.EnumC1804a.Recoding) {
                this.f8950M.m33986x().mo34004f();
            } else {
                m30835b();
            }
            this.f8979q.mo32909a(C2104d.EnumC2105a.SHOWOUTTIMEPROBAR);
        }
    }

    /* renamed from: a */
    public void m30849a(int i) {
        this.f8941D = i;
        this.f8968f.setText(this.f8941D + "°");
        m30850a(Math.abs(i));
    }

    @Override // com.fimi.soul.view.SwitchButtonStoke.AbstractC3176a
    /* renamed from: a */
    public void mo28856a(View view, boolean z) {
    }

    /* renamed from: a */
    public void m30844a(C2286a c2286a) {
        if (c2286a != null) {
            try {
                if (this.f8947J == C9755a.f30449c) {
                    this.f8947J = c2286a.m32429d();
                }
                if (this.f8948K == C9755a.f30449c) {
                    this.f8948K = c2286a.m32428e();
                }
                if (this.f8949L == C9755a.f30449c) {
                    this.f8949L = c2286a.m32430c();
                }
                if (this.f8946I == C9755a.f30449c) {
                    this.f8946I = c2286a.m32427f() / 10;
                }
                this.f8977o.setProgress(c2286a.m32426g() / 10);
                this.f8976n.setProgress(c2286a.m32425h() / c2286a.m32426g());
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: a */
    public void m30839a(FlightActivity.AbstractC2736a abstractC2736a) {
        this.f8963ad = abstractC2736a;
    }

    /* renamed from: b */
    public void m30835b() {
        if (this.f8953P) {
            if (this.f8947J == C9755a.f30449c) {
                this.f8947J = this.f8979q.mo32891w().m32188g() - 677216.0d;
            }
            LatLng latLng = new LatLng(this.f8979q.mo32891w().m32186i(), this.f8979q.mo32891w().m32185j());
            this.f8948K = latLng.f27463b;
            this.f8949L = latLng.f27462a;
            if (this.f8946I == C9755a.f30449c) {
                this.f8946I = this.f8945H;
            }
            m30831c();
        }
    }

    /* renamed from: c */
    public void m30831c() {
        int m34551c = (this.f8958V ? (int) C1679t.m34551c(1.0d) : 1) + this.f8977o.getProgress();
        float m34550d = this.f8958V ? (float) C1679t.m34550d(m34551c) : m34551c;
        Log.d(f8937ac, "updateTakePhoto: isReturn：" + this.f8954Q + ",time:" + ((int) ((short) (this.f8976n.getProgress() * m34550d * 10.0f))) + ",angle:" + ((int) ((short) (this.f8946I * 100.0d))) + "speek:" + ((int) ((byte) (m34550d * 10.0f))) + ",cacheDroneHeight:" + ((int) ((short) this.f8947J)) + ",cacheLong:" + ((float) this.f8948K) + ",cacheLat:" + ((float) this.f8949L));
        C2523d.m31374a(this.f8979q).m31383a((byte) 18, (byte) this.f8954Q, (short) (this.f8976n.getProgress() * m34550d * 10.0f), (short) (this.f8946I * 100.0d), (byte) (m34550d * 10.0f), (short) this.f8947J, (float) this.f8948K, (float) this.f8949L);
    }

    /* renamed from: d */
    public void m30828d() {
        C1688z.m34449a(this.f8979q.f5919d, (int) C1704R.C1707string.take_photo_tip, 2000);
    }

    /* renamed from: e */
    public void m30826e() {
        this.f8965c.setVisibility(0);
        this.f8981s.setVisibility(0);
    }

    /* renamed from: f */
    public void m30824f() {
        this.f8965c.setVisibility(8);
        this.f8965c.setVisibility(8);
        if (this.f8980r.isShown()) {
            this.f8980r.setVisibility(8);
        }
    }

    /* renamed from: g */
    public void m30822g() {
        this.f8968f.setText(C1704R.C1707string.no_use);
    }

    /* renamed from: h */
    public void m30820h() {
        if (this.f8942E >= 20) {
            this.f8976n.setProgress(this.f8943F);
            this.f8966d.setText(this.f8943F + "s");
            return;
        }
        if (this.f8942E == 0 && this.f8980r.isShown() && m30812l() < 2) {
            C1688z.m34447a(this.f8979q.f5919d, this.f8979q.f5919d.getString(C1704R.C1707string.take_photo_hint), 3000);
        }
        this.f8976n.setProgress(this.f8942E);
        this.f8966d.setText(this.f8942E + "s");
    }

    /* renamed from: i */
    public void m30818i() {
        this.f8958V = C1642c.m34885e().m34501p();
        float m33793e = C1877d.m33782p().m33793e();
        Log.d(f8937ac, "reStartDefault: " + m33793e);
        this.f8977o.setProgress(this.f8958V ? (int) Math.round(C1679t.m34551c(m33793e - 1.0f)) : Math.round(m33793e - 1.0f));
        this.f8967e.setText(this.f8958V ? ((int) Math.round(C1679t.m34551c(m33793e))) + this.f8979q.f5919d.getString(C1704R.C1707string.speed_unit_mph) : Math.round(m33793e) + this.f8979q.f5919d.getString(C1704R.C1707string.speed_unit_m));
        int m33795d = C1877d.m33782p().m33795d();
        this.f8976n.setProgress(m33795d);
        this.f8966d.setText(m33795d + "s");
        this.f8980r.setVisibility(8);
        this.f8978p.setSwitchState(false);
        this.f8954Q = 0;
        this.f8949L = C9755a.f30449c;
        this.f8947J = C9755a.f30449c;
        this.f8948K = C9755a.f30449c;
        this.f8946I = C9755a.f30449c;
        this.f8952O = false;
        this.f8953P = false;
        m30810m();
    }

    /* renamed from: j */
    public void m30816j() {
        this.f8963ad.mo30467b();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.fly_action_cancal_btn /* 2131755705 */:
                this.f8953P = false;
                m30824f();
                C1882h.m33763a(this.f8979q.f5919d).m33764a(0);
                this.f8979q.mo32909a(C2104d.EnumC2105a.CANCALFLYACTION);
                this.f8963ad.mo30467b();
                return;
            case C1704R.C1706id.fly_action_execute_btn /* 2131755706 */:
                if ((this.f8979q.m32979j() != null && this.f8979q.m32979j().m32411b() == 1) || this.f8979q.m33007ao().m31769g()) {
                    C1688z.m34448a(this.f8979q.f5919d, this.f8979q.f5919d.getString(C1704R.C1707string.show_drone_control_no_zoom_auto_flight));
                    return;
                } else if (!this.f8952O) {
                    C1688z.m34449a(this.f8979q.f5919d, (int) C1704R.C1707string.on_next, 3000);
                    return;
                } else {
                    this.f8953P = true;
                    m30851a();
                    return;
                }
            case C1704R.C1706id.setflyphoto /* 2131755726 */:
                this.f8952O = true;
                if (!this.f8980r.isShown()) {
                    this.f8980r.setVisibility(0);
                }
                if (this.f8981s.isShown()) {
                    this.f8981s.setVisibility(8);
                }
                if (!this.f8965c.isShown()) {
                    return;
                }
                this.f8965c.setVisibility(8);
                return;
            default:
                return;
        }
    }
}
