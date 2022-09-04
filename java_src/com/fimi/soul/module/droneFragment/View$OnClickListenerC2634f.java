package com.fimi.soul.module.droneFragment;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1688z;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p182j.C1877d;
import com.fimi.soul.biz.p182j.C1884j;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.C3077ae;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3125i;
import com.fimi.soul.view.MyEditView;
import com.fimi.soul.view.myhorizontalseebar.SeekBar;
import com.google.android.gms.maps.C8499b;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8611c;
import com.google.android.gms.maps.model.C8615g;
import com.google.android.gms.maps.model.C8617i;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.firebase.p253b.C9755a;
import it.p273a.p274a.AbstractC10866e;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
/* renamed from: com.fimi.soul.module.droneFragment.f */
/* loaded from: classes.dex */
public class View$OnClickListenerC2634f implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: ah */
    private static final String f8831ah = "PoiOperaView";

    /* renamed from: A */
    private Button f8832A;

    /* renamed from: B */
    private Button f8833B;

    /* renamed from: C */
    private PopupWindow f8834C;

    /* renamed from: D */
    private String[] f8835D;

    /* renamed from: E */
    private boolean f8836E;

    /* renamed from: F */
    private boolean f8837F;

    /* renamed from: G */
    private boolean f8838G;

    /* renamed from: H */
    private boolean f8839H;

    /* renamed from: I */
    private C2083a f8840I;

    /* renamed from: J */
    private int f8841J;

    /* renamed from: K */
    private C8611c f8842K;

    /* renamed from: M */
    private C8615g f8844M;

    /* renamed from: N */
    private C8615g f8845N;

    /* renamed from: O */
    private C8500c f8846O;

    /* renamed from: P */
    private C8617i f8847P;

    /* renamed from: Q */
    private int f8848Q;

    /* renamed from: Z */
    private String f8857Z;

    /* renamed from: a */
    EditText[] f8858a;

    /* renamed from: aa */
    private SeekBar[] f8859aa;

    /* renamed from: ai */
    private float f8866ai;

    /* renamed from: aj */
    private float f8867aj;

    /* renamed from: b */
    InputMethodManager f8868b;

    /* renamed from: c */
    String f8869c;

    /* renamed from: d */
    String f8870d;

    /* renamed from: e */
    String f8871e;

    /* renamed from: f */
    String f8872f;

    /* renamed from: h */
    private MyEditView f8874h;

    /* renamed from: i */
    private MyEditView f8875i;

    /* renamed from: j */
    private MyEditView f8876j;

    /* renamed from: k */
    private MyEditView f8877k;

    /* renamed from: l */
    private TextView f8878l;

    /* renamed from: m */
    private TextView f8879m;

    /* renamed from: n */
    private TextView f8880n;

    /* renamed from: o */
    private TextView f8881o;

    /* renamed from: p */
    private TextView f8882p;

    /* renamed from: q */
    private SeekBar f8883q;

    /* renamed from: r */
    private SeekBar f8884r;

    /* renamed from: s */
    private SeekBar f8885s;

    /* renamed from: t */
    private SeekBar f8886t;

    /* renamed from: u */
    private RadioGroup f8887u;

    /* renamed from: v */
    private Context f8888v;

    /* renamed from: w */
    private PercentRelativeLayout f8889w;

    /* renamed from: x */
    private RadioButton f8890x;

    /* renamed from: y */
    private RadioButton f8891y;

    /* renamed from: z */
    private Button f8892z;

    /* renamed from: R */
    private int f8849R = 5;

    /* renamed from: S */
    private int f8850S = 120;

    /* renamed from: T */
    private int f8851T = 10;

    /* renamed from: U */
    private int f8852U = 1;

    /* renamed from: V */
    private int f8853V = AbstractC10866e.f34847n;

    /* renamed from: W */
    private int f8854W = 5;

    /* renamed from: X */
    private int f8855X = 360;

    /* renamed from: Y */
    private int f8856Y = 0;

    /* renamed from: ab */
    private int f8860ab = 1500;

    /* renamed from: ad */
    private int f8862ad = 1;

    /* renamed from: ae */
    private int f8863ae = 2;

    /* renamed from: af */
    private int f8864af = 3;

    /* renamed from: ag */
    private int f8865ag = 4;

    /* renamed from: g */
    Handler f8873g = new Handler() { // from class: com.fimi.soul.module.droneFragment.f.6
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == View$OnClickListenerC2634f.this.f8863ae) {
                try {
                    int sqrt = (int) Math.sqrt(Integer.parseInt(View$OnClickListenerC2634f.m30913b(View$OnClickListenerC2634f.this.f8876j.getText().toString())) * 1.5d);
                    if (sqrt >= View$OnClickListenerC2634f.this.f8851T) {
                        sqrt = View$OnClickListenerC2634f.this.f8851T;
                    }
                    if (sqrt == 0) {
                        View$OnClickListenerC2634f.this.m30921a(View$OnClickListenerC2634f.this.f8875i, View$OnClickListenerC2634f.this.f8884r.getMax(), View$OnClickListenerC2634f.this.f8852U, View$OnClickListenerC2634f.this.f8884r, View$OnClickListenerC2634f.this.f8861ac ? View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.speed_unit_mph) : View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.speed_unit_m));
                    } else {
                        View$OnClickListenerC2634f.this.m30921a(View$OnClickListenerC2634f.this.f8875i, sqrt, View$OnClickListenerC2634f.this.f8852U, View$OnClickListenerC2634f.this.f8884r, View$OnClickListenerC2634f.this.f8861ac ? View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.speed_unit_mph) : View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.speed_unit_m));
                    }
                } catch (Exception e) {
                }
            } else if (message.what == View$OnClickListenerC2634f.this.f8862ad) {
                View$OnClickListenerC2634f.this.m30921a(View$OnClickListenerC2634f.this.f8874h, View$OnClickListenerC2634f.this.f8850S, View$OnClickListenerC2634f.this.f8849R, View$OnClickListenerC2634f.this.f8883q, View$OnClickListenerC2634f.this.f8861ac ? View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_ft) : View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_m));
            } else if (message.what == View$OnClickListenerC2634f.this.f8864af) {
                View$OnClickListenerC2634f.this.m30921a(View$OnClickListenerC2634f.this.f8876j, View$OnClickListenerC2634f.this.f8885s.getMax(), View$OnClickListenerC2634f.this.f8854W, View$OnClickListenerC2634f.this.f8885s, View$OnClickListenerC2634f.this.f8861ac ? View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_ft) : View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_m));
            } else if (message.what != View$OnClickListenerC2634f.this.f8865ag) {
            } else {
                View$OnClickListenerC2634f.this.m30921a(View$OnClickListenerC2634f.this.f8877k, View$OnClickListenerC2634f.this.f8855X, View$OnClickListenerC2634f.this.f8856Y, View$OnClickListenerC2634f.this.f8886t, "°");
            }
        }
    };

    /* renamed from: L */
    private C1877d f8843L = C1877d.m33782p();

    /* renamed from: ac */
    private boolean f8861ac = C1642c.m34885e().m34501p();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fimi.soul.module.droneFragment.f$a */
    /* loaded from: classes.dex */
    public class C2651a extends BaseAdapter {

        /* renamed from: b */
        private Context f8910b;

        /* renamed from: c */
        private String[] f8911c;

        public C2651a(Context context, String[] strArr) {
            this.f8910b = context;
            this.f8911c = strArr;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (this.f8911c == null) {
                return 0;
            }
            return this.f8911c.length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (this.f8911c == null) {
                return null;
            }
            return this.f8911c[i];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(this.f8910b).inflate(C1704R.layout.mysimple_spinner_dropdown_item, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.itemangle);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            if (View$OnClickListenerC2634f.this.f8834C != null) {
                layoutParams.width = View$OnClickListenerC2634f.this.f8834C.getWidth();
            }
            textView.setLayoutParams(layoutParams);
            textView.setText(this.f8911c[i]);
            C3103au.m29232a(this.f8910b.getAssets(), textView);
            return inflate;
        }
    }

    public View$OnClickListenerC2634f(View view, C2083a c2083a) {
        EditText[] editTextArr;
        this.f8868b = (InputMethodManager) c2083a.f5919d.getSystemService("input_method");
        this.f8848Q = c2083a.f5919d.getResources().getDisplayMetrics().heightPixels / 3;
        this.f8840I = c2083a;
        this.f8846O = c2083a.m33012aj();
        this.f8888v = c2083a.f5919d;
        this.f8835D = this.f8888v.getResources().getStringArray(C1704R.array.drone_head);
        this.f8880n = (TextView) view.findViewById(C1704R.C1706id.pointheight);
        this.f8881o = (TextView) view.findViewById(C1704R.C1706id.pointsppek);
        this.f8882p = (TextView) view.findViewById(C1704R.C1706id.pointridus);
        this.f8877k = (MyEditView) view.findViewById(C1704R.C1706id.poianglevalue);
        this.f8879m = (TextView) view.findViewById(C1704R.C1706id.poiangle);
        this.f8886t = (SeekBar) view.findViewById(C1704R.C1706id.angle_seebar_value);
        this.f8886t.setMax(this.f8855X);
        this.f8886t.setOnSeekBarChangeListener(new SeekBar.AbstractC3299a() { // from class: com.fimi.soul.module.droneFragment.f.1
            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28392a(SeekBar seekBar) {
                View$OnClickListenerC2634f.this.f8839H = true;
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28391a(SeekBar seekBar, int i, boolean z) {
                FlyActionBean m33792f;
                if (!View$OnClickListenerC2634f.this.f8839H || (m33792f = View$OnClickListenerC2634f.this.f8843L.m33792f()) == null) {
                    return;
                }
                View$OnClickListenerC2634f.this.f8877k.setText(i + "°");
                m33792f.setStart_point_agle((short) i);
                View$OnClickListenerC2634f.this.m30919a(false);
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: b */
            public void mo28390b(SeekBar seekBar) {
                View$OnClickListenerC2634f.this.f8839H = false;
            }
        });
        this.f8833B = (Button) view.findViewById(C1704R.C1706id.setPoi);
        this.f8833B.setOnClickListener(this);
        this.f8878l = (TextView) view.findViewById(C1704R.C1706id.spend_time);
        this.f8832A = (Button) view.findViewById(C1704R.C1706id.delete_poi);
        this.f8832A.setOnClickListener(this);
        this.f8892z = (Button) view.findViewById(C1704R.C1706id.myspinner);
        this.f8892z.setText(this.f8835D[0]);
        this.f8892z.setOnClickListener(this);
        this.f8887u = (RadioGroup) view.findViewById(C1704R.C1706id.drone_direction);
        this.f8890x = (RadioButton) view.findViewById(C1704R.C1706id.clockwise);
        this.f8891y = (RadioButton) view.findViewById(C1704R.C1706id.anticlockwise);
        this.f8887u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.fimi.soul.module.droneFragment.f.9
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                FlyActionBean m33792f = View$OnClickListenerC2634f.this.f8843L.m33792f();
                if (m33792f != null) {
                    switch (i) {
                        case C1704R.C1706id.clockwise /* 2131755787 */:
                            m33792f.setPara1(3);
                            break;
                        case C1704R.C1706id.anticlockwise /* 2131755788 */:
                            m33792f.setPara1(1);
                            break;
                    }
                    View$OnClickListenerC2634f.this.m30904f();
                    View$OnClickListenerC2634f.this.m30919a(false);
                }
            }
        });
        this.f8887u.check(C1704R.C1706id.clockwise);
        this.f8889w = (PercentRelativeLayout) view.findViewById(C1704R.C1706id.poi_operaRL);
        this.f8874h = (MyEditView) view.findViewById(C1704R.C1706id.poi_height_value);
        this.f8875i = (MyEditView) view.findViewById(C1704R.C1706id.poispeek);
        this.f8876j = (MyEditView) view.findViewById(C1704R.C1706id.poiridusvalue);
        this.f8883q = (SeekBar) view.findViewById(C1704R.C1706id.height_seebar_value);
        this.f8884r = (SeekBar) view.findViewById(C1704R.C1706id.speek_seebar_value);
        this.f8885s = (SeekBar) view.findViewById(C1704R.C1706id.ridus_seebar_value);
        this.f8885s.setMax(this.f8861ac ? (int) C1679t.m34549e(this.f8853V) : this.f8853V);
        this.f8884r.setMax(this.f8861ac ? (int) C1679t.m34551c(this.f8851T) : this.f8851T);
        this.f8883q.setMax(this.f8861ac ? (int) C1679t.m34549e(this.f8850S) : this.f8850S);
        this.f8883q.setOnSeekBarChangeListener(new SeekBar.AbstractC3299a() { // from class: com.fimi.soul.module.droneFragment.f.10
            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28392a(SeekBar seekBar) {
                View$OnClickListenerC2634f.this.f8836E = true;
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28391a(SeekBar seekBar, int i, boolean z) {
                FlyActionBean m33792f;
                if (!View$OnClickListenerC2634f.this.f8836E || (m33792f = View$OnClickListenerC2634f.this.f8843L.m33792f()) == null) {
                    return;
                }
                int m34553b = ((double) i) < (View$OnClickListenerC2634f.this.f8861ac ? C1679t.m34553b((double) View$OnClickListenerC2634f.this.f8849R) : (double) View$OnClickListenerC2634f.this.f8849R) ? View$OnClickListenerC2634f.this.f8861ac ? (int) C1679t.m34553b(View$OnClickListenerC2634f.this.f8849R) : View$OnClickListenerC2634f.this.f8849R : i;
                View$OnClickListenerC2634f.this.f8874h.setText(m34553b + (View$OnClickListenerC2634f.this.f8861ac ? View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_ft) : View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_m)));
                m33792f.setHeight(View$OnClickListenerC2634f.this.f8861ac ? (float) Math.round(C1679t.m34549e(m34553b)) : m34553b);
                for (C8615g c8615g : C1877d.m33782p().m33789i()) {
                    if (c8615g.m11006o().equals(m33792f)) {
                        c8615g.m11029a(C1884j.m33757a(View$OnClickListenerC2634f.this.f8888v, m33792f.getDrawableRes(), m33792f.getHeight(), true));
                        return;
                    }
                }
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: b */
            public void mo28390b(SeekBar seekBar) {
                View$OnClickListenerC2634f.this.f8836E = false;
            }
        });
        this.f8884r.setOnSeekBarChangeListener(new SeekBar.AbstractC3299a() { // from class: com.fimi.soul.module.droneFragment.f.11
            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28392a(SeekBar seekBar) {
                View$OnClickListenerC2634f.this.f8837F = true;
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28391a(SeekBar seekBar, int i, boolean z) {
                FlyActionBean m33792f;
                if (!View$OnClickListenerC2634f.this.f8837F || (m33792f = View$OnClickListenerC2634f.this.f8843L.m33792f()) == null) {
                    return;
                }
                int m34551c = ((double) i) < (View$OnClickListenerC2634f.this.f8861ac ? C1679t.m34551c((double) View$OnClickListenerC2634f.this.f8852U) : (double) View$OnClickListenerC2634f.this.f8852U) ? View$OnClickListenerC2634f.this.f8861ac ? (int) C1679t.m34551c(View$OnClickListenerC2634f.this.f8852U) : View$OnClickListenerC2634f.this.f8852U : i;
                View$OnClickListenerC2634f.this.f8875i.setText(m34551c + (View$OnClickListenerC2634f.this.f8861ac ? View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.speed_unit_mph) : View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.speed_unit_m)));
                m33792f.setSpeek(View$OnClickListenerC2634f.this.f8861ac ? (float) Math.round(C1679t.m34550d(m34551c)) : m34551c);
                View$OnClickListenerC2634f.this.m30884p();
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: b */
            public void mo28390b(SeekBar seekBar) {
                View$OnClickListenerC2634f.this.f8837F = false;
                float m34550d = View$OnClickListenerC2634f.this.f8861ac ? (float) C1679t.m34550d(seekBar.getProgress()) : seekBar.getProgress();
                if ((View$OnClickListenerC2634f.this.f8861ac ? C1679t.m34549e(View$OnClickListenerC2634f.this.f8885s.getProgress()) : View$OnClickListenerC2634f.this.f8885s.getProgress()) * 1.5d < m34550d * m34550d) {
                    float f = (float) (((m34550d * m34550d) / 1.5d) + 1.0d);
                    if (f < View$OnClickListenerC2634f.this.f8854W) {
                        f = View$OnClickListenerC2634f.this.f8854W;
                    }
                    View$OnClickListenerC2634f.this.f8885s.setProgress(View$OnClickListenerC2634f.this.f8861ac ? (int) Math.round(C1679t.m34553b(f)) : (int) f);
                    View$OnClickListenerC2634f.this.f8876j.setText(View$OnClickListenerC2634f.this.f8861ac ? ((int) Math.round(C1679t.m34553b(f))) + View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_ft) : f + View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_m));
                    FlyActionBean m33792f = View$OnClickListenerC2634f.this.f8843L.m33792f();
                    if (m33792f == null) {
                        return;
                    }
                    m33792f.setRidus(f);
                    View$OnClickListenerC2634f.this.m30917b(m33792f);
                    View$OnClickListenerC2634f.this.m30919a(false);
                }
            }
        });
        this.f8885s.setOnSeekBarChangeListener(new SeekBar.AbstractC3299a() { // from class: com.fimi.soul.module.droneFragment.f.12
            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28392a(SeekBar seekBar) {
                View$OnClickListenerC2634f.this.f8838G = true;
                View$OnClickListenerC2634f.this.f8841J = ((int) (((View$OnClickListenerC2634f.this.f8861ac ? C1679t.m34550d(View$OnClickListenerC2634f.this.f8884r.getProgress()) : View$OnClickListenerC2634f.this.f8884r.getProgress()) * (View$OnClickListenerC2634f.this.f8861ac ? C1679t.m34550d(View$OnClickListenerC2634f.this.f8884r.getProgress()) : View$OnClickListenerC2634f.this.f8884r.getProgress())) / 1.5d)) + 1;
                if (View$OnClickListenerC2634f.this.f8841J < View$OnClickListenerC2634f.this.f8852U) {
                    View$OnClickListenerC2634f.this.f8841J = View$OnClickListenerC2634f.this.f8852U;
                }
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28391a(SeekBar seekBar, int i, boolean z) {
                FlyActionBean m33792f;
                if (!View$OnClickListenerC2634f.this.f8838G || (m33792f = View$OnClickListenerC2634f.this.f8843L.m33792f()) == null) {
                    return;
                }
                int m34553b = ((double) i) <= (View$OnClickListenerC2634f.this.f8861ac ? C1679t.m34553b((double) View$OnClickListenerC2634f.this.f8841J) : (double) View$OnClickListenerC2634f.this.f8841J) ? View$OnClickListenerC2634f.this.f8861ac ? (int) C1679t.m34553b(View$OnClickListenerC2634f.this.f8841J) : View$OnClickListenerC2634f.this.f8841J : i;
                if (m34553b < (View$OnClickListenerC2634f.this.f8861ac ? C1679t.m34553b(View$OnClickListenerC2634f.this.f8854W) : View$OnClickListenerC2634f.this.f8854W)) {
                    m34553b = View$OnClickListenerC2634f.this.f8861ac ? (int) C1679t.m34553b(View$OnClickListenerC2634f.this.f8854W) : View$OnClickListenerC2634f.this.f8854W;
                }
                View$OnClickListenerC2634f.this.f8876j.setText(m34553b + (View$OnClickListenerC2634f.this.f8861ac ? View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_ft) : View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_m)));
                m33792f.setRidus(View$OnClickListenerC2634f.this.f8861ac ? (int) Math.round(C1679t.m34549e(m34553b)) : m34553b);
                View$OnClickListenerC2634f.this.m30917b(m33792f);
                View$OnClickListenerC2634f.this.m30919a(false);
                View$OnClickListenerC2634f.this.m30884p();
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: b */
            public void mo28390b(SeekBar seekBar) {
                View$OnClickListenerC2634f.this.f8838G = false;
                float m34549e = View$OnClickListenerC2634f.this.f8861ac ? (float) C1679t.m34549e(seekBar.getProgress()) : seekBar.getProgress();
                if ((View$OnClickListenerC2634f.this.f8861ac ? C1679t.m34549e(View$OnClickListenerC2634f.this.f8885s.getProgress()) : View$OnClickListenerC2634f.this.f8885s.getProgress()) * 1.5d < m34549e * m34549e) {
                    int sqrt = (int) Math.sqrt((View$OnClickListenerC2634f.this.f8861ac ? C1679t.m34549e(View$OnClickListenerC2634f.this.f8885s.getProgress()) : View$OnClickListenerC2634f.this.f8885s.getProgress()) * 1.5d);
                    if (sqrt >= View$OnClickListenerC2634f.this.f8851T) {
                        sqrt = View$OnClickListenerC2634f.this.f8851T;
                    }
                    View$OnClickListenerC2634f.this.f8884r.setMax(View$OnClickListenerC2634f.this.f8861ac ? (int) Math.round(C1679t.m34551c(sqrt)) : sqrt);
                    if ((View$OnClickListenerC2634f.this.f8861ac ? C1679t.m34550d(View$OnClickListenerC2634f.this.f8884r.getProgress()) : View$OnClickListenerC2634f.this.f8884r.getProgress()) < sqrt) {
                        return;
                    }
                    View$OnClickListenerC2634f.this.f8884r.setProgress(View$OnClickListenerC2634f.this.f8861ac ? (int) Math.round(C1679t.m34551c(sqrt)) : sqrt);
                    View$OnClickListenerC2634f.this.f8875i.setText(View$OnClickListenerC2634f.this.f8861ac ? ((int) Math.round(C1679t.m34551c(sqrt))) + View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.speed_unit_mph) : sqrt + View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.speed_unit_m));
                }
            }
        });
        C3103au.m29218b(this.f8888v.getAssets(), this.f8877k, this.f8874h, this.f8875i, this.f8876j);
        C3103au.m29232a(this.f8888v.getAssets(), this.f8881o, this.f8882p, this.f8880n, this.f8890x, this.f8891y, this.f8878l, this.f8879m);
        this.f8858a = new EditText[]{this.f8874h, this.f8875i, this.f8876j, this.f8877k};
        for (EditText editText : this.f8858a) {
            editText.setInputType(2);
            editText.clearFocus();
        }
        this.f8874h.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.fimi.soul.module.droneFragment.f.13
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                if (!z) {
                    View$OnClickListenerC2634f.this.m30921a(View$OnClickListenerC2634f.this.f8874h, View$OnClickListenerC2634f.this.f8850S, View$OnClickListenerC2634f.this.f8849R, View$OnClickListenerC2634f.this.f8883q, View$OnClickListenerC2634f.this.f8861ac ? View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_ft) : View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_m));
                } else {
                    View$OnClickListenerC2634f.this.f8857Z = View$OnClickListenerC2634f.this.f8874h.getText().toString();
                }
            }
        });
        this.f8875i.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.fimi.soul.module.droneFragment.f.14
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                if (z) {
                    View$OnClickListenerC2634f.this.f8857Z = View$OnClickListenerC2634f.this.f8875i.getText().toString();
                    return;
                }
                try {
                    int sqrt = (int) Math.sqrt(Integer.parseInt(View$OnClickListenerC2634f.m30913b(View$OnClickListenerC2634f.this.f8876j.getText().toString())) * 1.5d);
                    if (sqrt >= View$OnClickListenerC2634f.this.f8851T) {
                        sqrt = View$OnClickListenerC2634f.this.f8851T;
                    }
                    if (sqrt == 0) {
                        View$OnClickListenerC2634f.this.m30921a(View$OnClickListenerC2634f.this.f8875i, View$OnClickListenerC2634f.this.f8884r.getMax(), View$OnClickListenerC2634f.this.f8852U, View$OnClickListenerC2634f.this.f8884r, View$OnClickListenerC2634f.this.f8861ac ? View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.speed_unit_mph) : View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.speed_unit_m));
                    } else {
                        View$OnClickListenerC2634f.this.m30921a(View$OnClickListenerC2634f.this.f8875i, sqrt, View$OnClickListenerC2634f.this.f8852U, View$OnClickListenerC2634f.this.f8884r, View$OnClickListenerC2634f.this.f8861ac ? View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.speed_unit_mph) : View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.speed_unit_m));
                    }
                } catch (Exception e) {
                }
            }
        });
        this.f8876j.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.fimi.soul.module.droneFragment.f.15
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                if (!z) {
                    View$OnClickListenerC2634f.this.m30921a(View$OnClickListenerC2634f.this.f8876j, View$OnClickListenerC2634f.this.f8885s.getMax(), View$OnClickListenerC2634f.this.f8854W, View$OnClickListenerC2634f.this.f8885s, View$OnClickListenerC2634f.this.f8861ac ? View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_ft) : View$OnClickListenerC2634f.this.f8888v.getString(C1704R.C1707string.distance_unit_m));
                    return;
                }
                View$OnClickListenerC2634f.this.f8857Z = View$OnClickListenerC2634f.this.f8876j.getText().toString();
                if (View$OnClickListenerC2634f.this.f8857Z.length() <= 0) {
                    return;
                }
                View$OnClickListenerC2634f.this.f8876j.setText(View$OnClickListenerC2634f.this.f8857Z.substring(0, View$OnClickListenerC2634f.this.f8857Z.length() - (View$OnClickListenerC2634f.this.f8861ac ? 2 : 1)));
            }
        });
        this.f8877k.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.fimi.soul.module.droneFragment.f.16
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                if (!z) {
                    View$OnClickListenerC2634f.this.m30921a(View$OnClickListenerC2634f.this.f8877k, View$OnClickListenerC2634f.this.f8855X, View$OnClickListenerC2634f.this.f8856Y, View$OnClickListenerC2634f.this.f8886t, "°");
                    return;
                }
                View$OnClickListenerC2634f.this.f8857Z = View$OnClickListenerC2634f.this.f8877k.getText().toString();
                if (View$OnClickListenerC2634f.this.f8857Z.length() <= 0) {
                    return;
                }
                View$OnClickListenerC2634f.this.f8877k.setText(View$OnClickListenerC2634f.this.f8857Z.substring(0, View$OnClickListenerC2634f.this.f8857Z.length() - 1));
            }
        });
        this.f8875i.addTextChangedListener(new TextWatcher() { // from class: com.fimi.soul.module.droneFragment.f.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!View$OnClickListenerC2634f.this.f8875i.hasFocus() || View$OnClickListenerC2634f.this.f8870d.equals(editable.toString())) {
                    return;
                }
                if (View$OnClickListenerC2634f.this.f8873g.hasMessages(View$OnClickListenerC2634f.this.f8863ae)) {
                    View$OnClickListenerC2634f.this.f8873g.removeMessages(View$OnClickListenerC2634f.this.f8863ae);
                }
                View$OnClickListenerC2634f.this.f8873g.sendEmptyMessageDelayed(View$OnClickListenerC2634f.this.f8863ae, View$OnClickListenerC2634f.this.f8860ab);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                View$OnClickListenerC2634f.this.f8870d = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f8874h.addTextChangedListener(new TextWatcher() { // from class: com.fimi.soul.module.droneFragment.f.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!View$OnClickListenerC2634f.this.f8874h.hasFocus() || View$OnClickListenerC2634f.this.f8869c.equals(editable.toString())) {
                    return;
                }
                if (View$OnClickListenerC2634f.this.f8873g.hasMessages(View$OnClickListenerC2634f.this.f8862ad)) {
                    View$OnClickListenerC2634f.this.f8873g.removeMessages(View$OnClickListenerC2634f.this.f8862ad);
                }
                View$OnClickListenerC2634f.this.f8873g.sendEmptyMessageDelayed(View$OnClickListenerC2634f.this.f8862ad, View$OnClickListenerC2634f.this.f8860ab);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                View$OnClickListenerC2634f.this.f8869c = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f8876j.addTextChangedListener(new TextWatcher() { // from class: com.fimi.soul.module.droneFragment.f.4
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!View$OnClickListenerC2634f.this.f8876j.hasFocus() || View$OnClickListenerC2634f.this.f8871e.equals(editable.toString())) {
                    return;
                }
                if (View$OnClickListenerC2634f.this.f8873g.hasMessages(View$OnClickListenerC2634f.this.f8864af)) {
                    View$OnClickListenerC2634f.this.f8873g.removeMessages(View$OnClickListenerC2634f.this.f8864af);
                }
                View$OnClickListenerC2634f.this.f8873g.sendEmptyMessageDelayed(View$OnClickListenerC2634f.this.f8864af, View$OnClickListenerC2634f.this.f8860ab);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                View$OnClickListenerC2634f.this.f8871e = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f8877k.addTextChangedListener(new TextWatcher() { // from class: com.fimi.soul.module.droneFragment.f.5
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!View$OnClickListenerC2634f.this.f8877k.hasFocus() || View$OnClickListenerC2634f.this.f8872f.equals(editable.toString())) {
                    return;
                }
                if (View$OnClickListenerC2634f.this.f8873g.hasMessages(View$OnClickListenerC2634f.this.f8865ag)) {
                    View$OnClickListenerC2634f.this.f8873g.removeMessages(View$OnClickListenerC2634f.this.f8865ag);
                }
                View$OnClickListenerC2634f.this.f8873g.sendEmptyMessageDelayed(View$OnClickListenerC2634f.this.f8865ag, View$OnClickListenerC2634f.this.f8860ab);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                View$OnClickListenerC2634f.this.f8872f = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f8859aa = new SeekBar[]{this.f8883q, this.f8884r, this.f8885s, this.f8886t};
        for (SeekBar seekBar : this.f8859aa) {
            seekBar.setOnTouchListener(this);
        }
    }

    /* renamed from: a */
    private void m30930a(EditText editText) {
        int i = 2;
        if (editText.getText().toString().length() > 0) {
            if (this.f8874h == editText) {
                MyEditView myEditView = this.f8874h;
                int length = this.f8874h.length();
                if (!this.f8861ac) {
                    i = 1;
                }
                myEditView.setSelection(Math.round(length - i));
            } else if (this.f8875i == editText && this.f8875i.length() > 3) {
                this.f8875i.setSelection(Math.round(this.f8875i.length() - 3));
            } else if (this.f8876j != editText) {
                if (this.f8877k != editText) {
                    return;
                }
                this.f8877k.setSelection(this.f8877k.length() - 1);
            } else {
                MyEditView myEditView2 = this.f8876j;
                int length2 = this.f8876j.length();
                if (!this.f8861ac) {
                    i = 1;
                }
                myEditView2.setSelection(Math.round(length2 - i));
            }
        }
    }

    /* renamed from: a */
    private void m30927a(FlyActionBean flyActionBean, C8500c c8500c, boolean z) {
        LatLng m30928a = z ? m30928a(flyActionBean, flyActionBean.getStart_point_agle()) : m30928a(flyActionBean, -flyActionBean.getStart_point_agle());
        if (m30928a != null) {
            if (this.f8844M == null) {
                this.f8844M = c8500c.m11577a(new MarkerOptions().m11353a(m30928a).m11352a(C1884j.m33758a(C1704R.C1705drawable.icn_rotate_point)));
                this.f8844M.m11032a(10000.0f);
                this.f8844M.m11031a(0.5f, 0.5f);
                this.f8844M.m11026a(false);
                this.f8844M.m11024b(m30882q());
            } else {
                this.f8844M.m11030a(m30928a);
                this.f8844M.m11024b(m30882q());
            }
        }
        m30892l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m30921a(MyEditView myEditView, int i, int i2, SeekBar seekBar, String str) {
        String str2;
        float f;
        String str3;
        float f2;
        String str4;
        float f3;
        try {
            String m30920a = m30920a(m30913b(myEditView.getText().toString()));
            FlyActionBean m33792f = this.f8843L.m33792f();
            if (seekBar == this.f8886t) {
                float parseInt = Integer.parseInt(m30920a);
                if (parseInt > i) {
                    parseInt = i;
                    m30920a = i + str;
                    myEditView.setText(m30920a);
                } else if (parseInt < i2) {
                    parseInt = i2;
                    m30920a = i2 + str;
                    myEditView.setText(m30920a);
                }
                if (!m30920a.contains(str)) {
                    myEditView.setText(m30920a + str);
                }
                seekBar.setProgress(Integer.valueOf((int) parseInt).intValue());
                m33792f.setStart_point_agle((short) parseInt);
                m30919a(false);
            } else if (seekBar == this.f8884r) {
                float m34550d = this.f8861ac ? (float) C1679t.m34550d(Float.parseFloat(m30920a)) : Float.parseFloat(m30920a);
                if (m34550d > i) {
                    float f4 = i;
                    StringBuilder sb = new StringBuilder();
                    if (this.f8861ac) {
                        i = (int) C1679t.m34551c(i);
                    }
                    String sb2 = sb.append(i).append(str).toString();
                    myEditView.setText(sb2);
                    str4 = sb2;
                    f3 = f4;
                } else {
                    if (m34550d < i2) {
                        m34550d = i2;
                        StringBuilder sb3 = new StringBuilder();
                        if (this.f8861ac) {
                            i2 = (int) C1679t.m34551c(i2);
                        }
                        m30920a = sb3.append(i2).append(str).toString();
                        myEditView.setText(m30920a);
                    }
                    float f5 = m34550d;
                    str4 = m30920a;
                    f3 = f5;
                }
                if (!str4.contains(str)) {
                    myEditView.setText(str4 + str);
                }
                seekBar.setProgress(this.f8861ac ? (int) Math.round(C1679t.m34551c(f3)) : Math.round(f3));
                m33792f.setSpeek(f3);
                m30884p();
            } else if (seekBar == this.f8883q) {
                float m34549e = this.f8861ac ? (float) C1679t.m34549e(Float.parseFloat(m30920a)) : Float.parseFloat(m30920a);
                if (m34549e > i) {
                    float f6 = i;
                    StringBuilder sb4 = new StringBuilder();
                    if (this.f8861ac) {
                        i = (int) C1679t.m34553b(i);
                    }
                    String sb5 = sb4.append(i).append(str).toString();
                    myEditView.setText(sb5);
                    str3 = sb5;
                    f2 = f6;
                } else {
                    if (m34549e < i2) {
                        m34549e = i2;
                        StringBuilder sb6 = new StringBuilder();
                        if (this.f8861ac) {
                            i2 = (int) C1679t.m34553b(i2);
                        }
                        m30920a = sb6.append(i2).append(str).toString();
                        myEditView.setText(m30920a);
                    }
                    float f7 = m34549e;
                    str3 = m30920a;
                    f2 = f7;
                }
                if (!str3.contains(str)) {
                    myEditView.setText(str3 + str);
                }
                seekBar.setProgress(this.f8861ac ? (int) Math.round(C1679t.m34553b(f2)) : Math.round(f2));
                m33792f.setHeight(f2);
                Iterator<C8615g> it2 = C1877d.m33782p().m33789i().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C8615g next = it2.next();
                    if (next.m11006o().equals(m33792f)) {
                        next.m11029a(C1884j.m33757a(this.f8888v, m33792f.getDrawableRes(), Math.round(m33792f.getHeight()), true));
                        break;
                    }
                }
            } else if (seekBar == this.f8885s) {
                float m34549e2 = this.f8861ac ? (float) C1679t.m34549e(Float.parseFloat(m30920a)) : Float.parseFloat(m30920a);
                if (m34549e2 > i) {
                    float f8 = i;
                    StringBuilder sb7 = new StringBuilder();
                    if (this.f8861ac) {
                        i = (int) C1679t.m34553b(i);
                    }
                    String sb8 = sb7.append(i).append(str).toString();
                    myEditView.setText(sb8);
                    str2 = sb8;
                    f = f8;
                } else {
                    if (m34549e2 < i2) {
                        m34549e2 = i2;
                        StringBuilder sb9 = new StringBuilder();
                        if (this.f8861ac) {
                            i2 = (int) C1679t.m34553b(i2);
                        }
                        m30920a = sb9.append(i2).append(str).toString();
                        myEditView.setText(m30920a);
                    }
                    float f9 = m34549e2;
                    str2 = m30920a;
                    f = f9;
                }
                if (!str2.contains(str)) {
                    myEditView.setText(str2 + str);
                }
                seekBar.setProgress(this.f8861ac ? (int) Math.round(C1679t.m34553b(f)) : Math.round(f));
                m33792f.setRidus(f);
                m30917b(m33792f);
                m30919a(false);
                m30884p();
            }
            m30930a(myEditView);
            myEditView.setCursorVisible(true);
        } catch (Exception e) {
            myEditView.setText(this.f8857Z + str);
            m30930a(myEditView);
            myEditView.setCursorVisible(true);
        }
    }

    /* renamed from: b */
    public static String m30913b(String str) {
        return Pattern.compile("[^0-9]").matcher(str).replaceAll("").trim();
    }

    /* renamed from: b */
    private void m30916b(FlyActionBean flyActionBean, C8500c c8500c, boolean z) {
        LatLng m30928a = z ? m30928a(flyActionBean, flyActionBean.getStart_point_agle() + 90) : m30928a(flyActionBean, 270 - flyActionBean.getStart_point_agle());
        if (m30928a != null) {
            if (this.f8845N != null) {
                this.f8845N.m11030a(m30928a);
                if (z) {
                    this.f8845N.m11024b(flyActionBean.getStart_point_agle() + 180 + m30882q());
                    return;
                } else {
                    this.f8845N.m11024b(((-flyActionBean.getStart_point_agle()) - 180) + m30882q());
                    return;
                }
            }
            this.f8845N = c8500c.m11577a(new MarkerOptions().m11353a(m30928a).m11352a(C1884j.m33758a(C1704R.C1705drawable.icon_fly_direction)));
            this.f8845N.m11032a(10000.0f);
            if (z) {
                this.f8845N.m11024b(flyActionBean.getStart_point_agle() + 180 + c8500c.m11613a().f27433d);
            } else {
                this.f8845N.m11024b(((-flyActionBean.getStart_point_agle()) - 180) + c8500c.m11613a().f27433d);
            }
            this.f8845N.m11031a(0.5f, 0.5f);
        }
    }

    /* renamed from: l */
    private void m30892l() {
        FlyActionBean m33792f = C1877d.m33782p().m33792f();
        if (this.f8844M == null || m33792f == null) {
            return;
        }
        if (this.f8847P == null) {
            this.f8847P = this.f8846O.m11575a(new PolylineOptions().m11299a(this.f8844M.m11020c(), m33792f.getLatLng()).m11303a(this.f8840I.f5919d.getResources().getColor(C1704R.color.ridus_color)).m11304a(4.0f));
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m33792f.getLatLng());
        arrayList.add(this.f8844M.m11020c());
        this.f8847P.m10982a(arrayList);
    }

    /* renamed from: m */
    private double m30890m() {
        return C3077ae.m29349c(new LatLng(this.f8840I.mo32890x().m32302b(), this.f8840I.mo32890x().m32301c()), new LatLng(this.f8840I.mo32891w().m32189f(), this.f8840I.mo32891w().m32190e())).m29318a();
    }

    /* renamed from: n */
    private void m30888n() {
        if (this.f8834C != null) {
            if (this.f8834C.isShowing()) {
                this.f8834C.dismiss();
                this.f8892z.setBackgroundResource(C1704R.C1705drawable.bg_fly_combobox_more_down);
                return;
            }
            this.f8892z.setBackgroundResource(C1704R.C1705drawable.bg_fly_combobox_more_up);
            this.f8834C.showAsDropDown(this.f8892z, 0, C3125i.m29081b(this.f8888v, -8.0f));
            return;
        }
        this.f8892z.setBackgroundResource(C1704R.C1705drawable.bg_fly_combobox_more_up);
        View inflate = LayoutInflater.from(this.f8888v).inflate(C1704R.layout.myspinner_item, (ViewGroup) null);
        ListView listView = (ListView) inflate.findViewById(C1704R.C1706id.list_head_angle);
        listView.setAdapter((ListAdapter) new C2651a(this.f8888v, this.f8835D));
        listView.setSelection(1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.fimi.soul.module.droneFragment.f.7
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                FlyActionBean m33792f = C1877d.m33782p().m33792f();
                View$OnClickListenerC2634f.this.f8892z.setText((String) adapterView.getItemAtPosition(i));
                if (m33792f != null) {
                    m33792f.setYaw_mode(i);
                }
                View$OnClickListenerC2634f.this.f8834C.dismiss();
                View$OnClickListenerC2634f.this.f8892z.setBackgroundResource(C1704R.C1705drawable.bg_fly_combobox_more_down);
            }
        });
        this.f8834C = new PopupWindow(listView, this.f8892z.getWidth(), this.f8892z.getHeight() * 4);
        this.f8834C.setContentView(inflate);
        this.f8834C.showAsDropDown(this.f8892z, 0, C3125i.m29081b(this.f8888v, -8.0f));
        this.f8834C.setOutsideTouchable(true);
        this.f8834C.setTouchable(true);
        this.f8834C.setFocusable(true);
        this.f8834C.setBackgroundDrawable(new BitmapDrawable());
        this.f8834C.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.fimi.soul.module.droneFragment.f.8
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                View$OnClickListenerC2634f.this.f8892z.setBackgroundResource(C1704R.C1705drawable.bg_fly_combobox_more_down);
            }
        });
    }

    /* renamed from: o */
    private void m30886o() {
        this.f8889w.getWidth();
        FlyActionBean m33792f = this.f8843L.m33792f();
        int i = this.f8888v.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.f8888v.getResources().getDisplayMetrics().heightPixels;
        C8500c m33012aj = this.f8840I.m33012aj();
        if (m33012aj != null && m33792f != null) {
            Point m11482a = m33012aj.m11554n().m11482a(m33792f.getLatLng());
            if (m11482a.x > i / 2) {
                m33012aj.m11609a(C8499b.m11620a(m33012aj.m11554n().m11483a(new Point((i / 2) + (m11482a.x - (i / 3)), i2 / 2))));
            }
        }
        m30917b(m33792f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m30884p() {
        FlyActionBean m33792f = C1877d.m33782p().m33792f();
        if (this.f8842K == null || m33792f == null) {
            return;
        }
        this.f8878l.setText(String.format(this.f8888v.getString(C1704R.C1707string.spend_timereminder), Integer.valueOf((int) Math.round(((this.f8842K.m11068d() * 2.0d) * 3.141592653589793d) / m33792f.getSpeek()))));
    }

    /* renamed from: q */
    private synchronized float m30882q() {
        float f = 0.0f;
        synchronized (this) {
            try {
                CameraPosition m11613a = this.f8846O.m11613a();
                if (m11613a != null) {
                    f = m11613a.f27433d;
                }
            } catch (Exception e) {
            }
        }
        return f;
    }

    /* renamed from: a */
    public LatLng m30928a(FlyActionBean flyActionBean, double d) {
        if (flyActionBean == null || this.f8842K == null) {
            return null;
        }
        return C3077ae.m29353a(flyActionBean.getLatLng(), d, this.f8842K.m11068d());
    }

    /* renamed from: a */
    public String m30920a(String str) {
        return BigDecimal.valueOf(Integer.parseInt(str)).stripTrailingZeros().toPlainString();
    }

    /* renamed from: a */
    public void m30931a() {
        if (!this.f8833B.isShown()) {
            this.f8833B.setVisibility(0);
            C1688z.m34449a(this.f8888v, (int) C1704R.C1707string.set_poi_tip, 1500);
        }
    }

    /* renamed from: a */
    public void m30929a(FlyActionBean flyActionBean) {
        if (this.f8892z.getText().toString().equals(this.f8835D[0])) {
            flyActionBean.setYaw_mode(0);
        } else if (this.f8892z.getText().toString().equals(this.f8835D[1])) {
            flyActionBean.setYaw_mode(1);
        } else if (this.f8892z.getText().toString().equals(this.f8835D[2])) {
            flyActionBean.setYaw_mode(2);
        } else if (this.f8892z.getText().toString().equals(this.f8835D[3])) {
            flyActionBean.setYaw_mode(3);
        } else if (this.f8892z.getText().toString().equals(this.f8835D[4])) {
            flyActionBean.setYaw_mode(4);
        }
        switch (this.f8887u.getCheckedRadioButtonId()) {
            case C1704R.C1706id.clockwise /* 2131755787 */:
                flyActionBean.setPara1(3);
                break;
            case C1704R.C1706id.anticlockwise /* 2131755788 */:
                flyActionBean.setPara1(1);
                break;
        }
        m30904f();
        m30884p();
    }

    /* renamed from: a */
    public void m30919a(boolean z) {
        FlyActionBean m33792f = this.f8843L.m33792f();
        this.f8846O = this.f8840I.m33012aj();
        if (m33792f == null || this.f8846O == null) {
            return;
        }
        switch (this.f8887u.getCheckedRadioButtonId()) {
            case C1704R.C1706id.clockwise /* 2131755787 */:
                if (!z) {
                    m30927a(m33792f, this.f8846O, true);
                }
                m30916b(m33792f, this.f8846O, true);
                return;
            case C1704R.C1706id.anticlockwise /* 2131755788 */:
                if (!z) {
                    m30927a(m33792f, this.f8846O, false);
                }
                m30916b(m33792f, this.f8846O, false);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void m30918b() {
        if (this.f8889w.isShown()) {
            this.f8889w.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void m30917b(FlyActionBean flyActionBean) {
        this.f8846O = this.f8840I.m33012aj();
        if (this.f8846O == null || flyActionBean == null) {
            return;
        }
        if (this.f8842K != null) {
            this.f8842K.m11078a(Math.round(flyActionBean.getRidus()));
            return;
        }
        this.f8842K = this.f8846O.m11581a(new CircleOptions().m11416a(Math.round(flyActionBean.getRidus())).m11415a(4.0f).m11414a(this.f8888v.getResources().getColor(C1704R.color.ridus_color)).m11413a(this.f8843L.m33792f().getLatLng()));
        this.f8843L.m33807a(this.f8842K);
    }

    /* renamed from: c */
    public void m30912c() {
        if (!this.f8889w.isShown()) {
            this.f8889w.setVisibility(0);
        }
    }

    /* renamed from: d */
    public void m30909d() {
        m30918b();
        if (this.f8834C != null && this.f8834C.isShowing()) {
            this.f8834C.dismiss();
            this.f8892z.setBackgroundResource(C1704R.C1705drawable.bg_fly_combobox_more_down);
        }
        if (this.f8842K != null) {
            this.f8842K.m11079a();
            this.f8842K = null;
        }
        if (this.f8844M != null) {
            this.f8844M.m11033a();
            this.f8844M = null;
        }
        if (this.f8845N != null) {
            this.f8845N.m11033a();
            this.f8845N = null;
        }
        if (this.f8847P != null) {
            this.f8847P.m10985a();
            this.f8847P = null;
        }
    }

    /* renamed from: e */
    public void m30906e() {
        if (this.f8833B.isShown()) {
            this.f8833B.setVisibility(8);
        }
    }

    /* renamed from: f */
    public void m30904f() {
        if (this.f8890x.isChecked()) {
            this.f8890x.setTextColor(this.f8888v.getResources().getColor(C1704R.color.color_height));
            this.f8891y.setTextColor(this.f8888v.getResources().getColor(C1704R.color.black));
            return;
        }
        this.f8891y.setTextColor(this.f8888v.getResources().getColor(C1704R.color.color_height));
        this.f8890x.setTextColor(this.f8888v.getResources().getColor(C1704R.color.black));
    }

    /* renamed from: g */
    public void m30902g() {
        m30912c();
        m30886o();
        m30900h();
    }

    /* renamed from: h */
    public void m30900h() {
        FlyActionBean m33792f = C1877d.m33782p().m33792f();
        if (m33792f != null) {
            double m30890m = m30890m();
            if (this.f8853V - m30890m < this.f8854W) {
                C1688z.m34449a(this.f8888v, (int) C1704R.C1707string.cant_setPoi, 3000);
                return;
            }
            this.f8883q.setProgress(this.f8861ac ? (int) Math.round(C1679t.m34553b(m33792f.getHeight() - this.f8849R)) : Math.round(m33792f.getHeight() - this.f8849R));
            this.f8884r.setProgress(this.f8861ac ? (int) Math.round(C1679t.m34551c(m33792f.getSpeek() - this.f8852U)) : Math.round(m33792f.getSpeek() - this.f8852U));
            this.f8885s.setProgress(this.f8861ac ? (int) Math.round(C1679t.m34553b(m33792f.getRidus() - this.f8854W)) : Math.round(m33792f.getRidus() - this.f8854W));
            this.f8886t.setProgress(m33792f.getStart_point_agle());
            this.f8885s.setMax((int) (this.f8861ac ? C1679t.m34553b(this.f8853V - m30890m) : this.f8853V - m30890m));
            this.f8874h.setText(this.f8861ac ? ((int) C1679t.m34553b(m33792f.getHeight())) + this.f8888v.getString(C1704R.C1707string.distance_unit_ft) : Math.round(m33792f.getHeight()) + this.f8888v.getString(C1704R.C1707string.distance_unit_m));
            this.f8875i.setText(this.f8861ac ? ((int) C1679t.m34551c(m33792f.getSpeek())) + this.f8888v.getString(C1704R.C1707string.speed_unit_mph) : Math.round(m33792f.getSpeek()) + this.f8888v.getString(C1704R.C1707string.speed_unit_m));
            this.f8876j.setText(this.f8861ac ? ((int) C1679t.m34553b(m33792f.getRidus())) + this.f8888v.getString(C1704R.C1707string.distance_unit_ft) : Math.round(m33792f.getRidus()) + this.f8888v.getString(C1704R.C1707string.distance_unit_m));
            this.f8877k.setText(((int) m33792f.getStart_point_agle()) + "°");
            if (m33792f.getPara1() == 0 || m33792f.getPara1() == 1) {
                this.f8887u.check(this.f8891y.getId());
            } else if (m33792f.getPara1() == 2 || m33792f.getPara1() == 3) {
                this.f8887u.check(this.f8890x.getId());
            }
            m30929a(m33792f);
            m30919a(false);
            m30892l();
        }
    }

    /* renamed from: i */
    public synchronized void m30898i() {
        double d = C9755a.f30449c;
        synchronized (this) {
            FlyActionBean m33792f = C1877d.m33782p().m33792f();
            if (this.f8842K != null && this.f8844M != null && m33792f != null) {
                m33792f.setRidus((int) C3077ae.m29349c(m33792f.getLatLng(), this.f8844M.m11020c()).m29318a());
                m30917b(m33792f);
                LatLng m30928a = m30928a(m33792f, C9755a.f30449c);
                switch (this.f8887u.getCheckedRadioButtonId()) {
                    case C1704R.C1706id.clockwise /* 2131755787 */:
                        d = C3077ae.m29348d(m30928a, this.f8844M.m11020c());
                        break;
                    case C1704R.C1706id.anticlockwise /* 2131755788 */:
                        d = this.f8855X - C3077ae.m29348d(m30928a, this.f8844M.m11020c());
                        break;
                }
                m33792f.setStart_point_agle((short) d);
                this.f8877k.setText(((int) d) + "deg");
                m30919a(false);
            }
        }
    }

    /* renamed from: j */
    public void m30896j() {
        if (this.f8834C == null || !this.f8834C.isShowing()) {
            return;
        }
        this.f8834C.dismiss();
    }

    /* renamed from: k */
    public void m30894k() {
        if (this.f8842K != null) {
            this.f8842K.m11079a();
            this.f8842K = null;
        }
        if (this.f8844M != null) {
            this.f8844M.m11033a();
            this.f8844M = null;
        }
        if (this.f8845N != null) {
            this.f8845N.m11033a();
            this.f8845N = null;
        }
        if (this.f8847P != null) {
            this.f8847P.m10985a();
            this.f8847P = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.myspinner /* 2131755784 */:
                m30888n();
                return;
            case C1704R.C1706id.delete_poi /* 2131755790 */:
                m30909d();
                this.f8840I.mo32909a(C2104d.EnumC2105a.CLEARDATA);
                m30931a();
                return;
            case C1704R.C1706id.setPoi /* 2131755791 */:
                this.f8840I.mo32909a(C2104d.EnumC2105a.CREATEPOI);
                this.f8833B.setVisibility(8);
                this.f8861ac = C1642c.m34885e().m34501p();
                this.f8885s.setMax(this.f8861ac ? (int) C1679t.m34553b(this.f8853V) : this.f8853V);
                this.f8884r.setMax(this.f8861ac ? (int) C1679t.m34551c(this.f8851T) : this.f8851T);
                this.f8883q.setMax(this.f8861ac ? (int) C1679t.m34553b(this.f8850S) : this.f8850S);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f8866ai = motionEvent.getX();
                this.f8867aj = motionEvent.getY();
                break;
            case 1:
                view.getParent().requestDisallowInterceptTouchEvent(false);
                break;
            case 2:
                if (Math.abs(view.getX() - this.f8866ai) >= Math.abs(view.getY() - this.f8867aj)) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
        }
        return false;
    }
}
