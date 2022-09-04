package com.fimi.soul.module.droneFragment;

import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.p182j.C1877d;
import com.fimi.soul.biz.p182j.C1884j;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.view.MyEditView;
import com.fimi.soul.view.myhorizontalseebar.SeekBar;
import com.google.android.gms.maps.model.C8615g;
import java.math.BigDecimal;
import java.util.regex.Pattern;
/* renamed from: com.fimi.soul.module.droneFragment.a */
/* loaded from: classes.dex */
public class View$OnClickListenerC2614a implements View.OnClickListener {

    /* renamed from: r */
    private static final int f8749r = 1;

    /* renamed from: s */
    private static final int f8750s = 2;

    /* renamed from: a */
    private PercentRelativeLayout f8751a;

    /* renamed from: b */
    private SeekBar f8752b;

    /* renamed from: c */
    private SeekBar f8753c;

    /* renamed from: d */
    private C2083a f8754d;

    /* renamed from: e */
    private TextView f8755e;

    /* renamed from: f */
    private TextView f8756f;

    /* renamed from: g */
    private MyEditView f8757g;

    /* renamed from: h */
    private MyEditView f8758h;

    /* renamed from: m */
    private String f8763m;

    /* renamed from: n */
    private Button f8764n;

    /* renamed from: o */
    private boolean f8765o;

    /* renamed from: p */
    private String f8766p;

    /* renamed from: q */
    private String f8767q;

    /* renamed from: i */
    private int f8759i = 1;

    /* renamed from: j */
    private int f8760j = 8;

    /* renamed from: k */
    private int f8761k = 120;

    /* renamed from: l */
    private int f8762l = 5;

    /* renamed from: t */
    private int f8768t = 1500;

    /* renamed from: u */
    private Handler f8769u = new Handler() { // from class: com.fimi.soul.module.droneFragment.a.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    View$OnClickListenerC2614a.this.m31017a(View$OnClickListenerC2614a.this.f8757g, View$OnClickListenerC2614a.this.f8761k, View$OnClickListenerC2614a.this.f8762l, View$OnClickListenerC2614a.this.f8752b, View$OnClickListenerC2614a.this.f8765o ? View$OnClickListenerC2614a.this.f8754d.f5919d.getString(C1704R.C1707string.distance_unit_ft) : View$OnClickListenerC2614a.this.f8754d.f5919d.getString(C1704R.C1707string.distance_unit_m));
                    return;
                case 2:
                    View$OnClickListenerC2614a.this.m31017a(View$OnClickListenerC2614a.this.f8758h, View$OnClickListenerC2614a.this.f8760j, View$OnClickListenerC2614a.this.f8759i, View$OnClickListenerC2614a.this.f8753c, View$OnClickListenerC2614a.this.f8765o ? View$OnClickListenerC2614a.this.f8754d.f5919d.getString(C1704R.C1707string.speed_unit_mph) : View$OnClickListenerC2614a.this.f8754d.f5919d.getString(C1704R.C1707string.speed_unit_m));
                    return;
                default:
                    return;
            }
        }
    };

    public View$OnClickListenerC2614a(C2083a c2083a, View view) {
        this.f8754d = c2083a;
        m31023a(view);
    }

    /* renamed from: a */
    private void m31023a(View view) {
        this.f8764n = (Button) view.findViewById(C1704R.C1706id.delete_operaActon);
        this.f8764n.setOnClickListener(this);
        this.f8751a = (PercentRelativeLayout) view.findViewById(C1704R.C1706id.changgeHeight_view);
        this.f8752b = (SeekBar) view.findViewById(C1704R.C1706id.height_seebar);
        this.f8752b.setMax(this.f8765o ? (int) C1679t.m34553b(this.f8761k) : this.f8761k);
        this.f8752b.setOnSeekBarChangeListener(new SeekBar.AbstractC3299a() { // from class: com.fimi.soul.module.droneFragment.a.2
            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28392a(SeekBar seekBar) {
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28391a(SeekBar seekBar, int i, boolean z) {
                View$OnClickListenerC2614a.this.f8765o = C1642c.m34885e().m34501p();
                int m34553b = ((double) i) < (View$OnClickListenerC2614a.this.f8765o ? C1679t.m34553b((double) View$OnClickListenerC2614a.this.f8762l) : (double) View$OnClickListenerC2614a.this.f8762l) ? View$OnClickListenerC2614a.this.f8765o ? (int) C1679t.m34553b(View$OnClickListenerC2614a.this.f8762l) : View$OnClickListenerC2614a.this.f8762l : i;
                View$OnClickListenerC2614a.this.f8757g.setText(m34553b + (View$OnClickListenerC2614a.this.f8765o ? View$OnClickListenerC2614a.this.f8754d.f5919d.getString(C1704R.C1707string.distance_unit_ft) : View$OnClickListenerC2614a.this.f8754d.f5919d.getString(C1704R.C1707string.distance_unit_m)));
                View$OnClickListenerC2614a.this.m31024a(m34553b);
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: b */
            public void mo28390b(SeekBar seekBar) {
            }
        });
        this.f8753c = (SeekBar) view.findViewById(C1704R.C1706id.speek_seebar);
        this.f8753c.setMax(this.f8765o ? (int) C1679t.m34551c(this.f8760j) : this.f8760j);
        this.f8753c.setOnSeekBarChangeListener(new SeekBar.AbstractC3299a() { // from class: com.fimi.soul.module.droneFragment.a.3
            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28392a(SeekBar seekBar) {
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: a */
            public void mo28391a(SeekBar seekBar, int i, boolean z) {
                View$OnClickListenerC2614a.this.f8765o = C1642c.m34885e().m34501p();
                int m34551c = ((double) i) < (View$OnClickListenerC2614a.this.f8765o ? C1679t.m34551c((double) View$OnClickListenerC2614a.this.f8759i) : (double) View$OnClickListenerC2614a.this.f8759i) ? View$OnClickListenerC2614a.this.f8765o ? (int) C1679t.m34551c(View$OnClickListenerC2614a.this.f8759i) : View$OnClickListenerC2614a.this.f8759i : i;
                C1877d.m33782p().m33784n();
                FlyActionBean m33783o = C1877d.m33782p().m33811a() == 2 ? C1877d.m33782p().m33783o() : C1877d.m33782p().m33784n();
                if (m33783o != null) {
                    m33783o.setSpeek(View$OnClickListenerC2614a.this.f8765o ? (float) C1679t.m34550d(m34551c) : m34551c);
                }
                if (C1877d.m33782p().m33811a() == 1) {
                    C1877d.m33782p().m33794d(View$OnClickListenerC2614a.this.f8765o ? (float) C1679t.m34550d(m34551c) : m34551c);
                } else {
                    C1877d.m33782p().m33797c(View$OnClickListenerC2614a.this.f8765o ? (float) C1679t.m34550d(m34551c) : m34551c);
                }
                View$OnClickListenerC2614a.this.f8758h.setText(m34551c + (View$OnClickListenerC2614a.this.f8765o ? View$OnClickListenerC2614a.this.f8754d.f5919d.getString(C1704R.C1707string.speed_unit_mph) : View$OnClickListenerC2614a.this.f8754d.f5919d.getString(C1704R.C1707string.speed_unit_m)));
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.SeekBar.AbstractC3299a
            /* renamed from: b */
            public void mo28390b(SeekBar seekBar) {
            }
        });
        this.f8755e = (TextView) view.findViewById(C1704R.C1706id.pointheight);
        this.f8756f = (TextView) view.findViewById(C1704R.C1706id.pointsppek);
        this.f8757g = (MyEditView) view.findViewById(C1704R.C1706id.poi_height);
        this.f8757g.setInputType(2);
        this.f8757g.addTextChangedListener(new TextWatcher() { // from class: com.fimi.soul.module.droneFragment.a.4
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!View$OnClickListenerC2614a.this.f8757g.hasFocus() || View$OnClickListenerC2614a.this.f8766p.equals(editable.toString())) {
                    return;
                }
                if (View$OnClickListenerC2614a.this.f8769u.hasMessages(1)) {
                    View$OnClickListenerC2614a.this.f8769u.removeMessages(1);
                }
                View$OnClickListenerC2614a.this.f8769u.sendEmptyMessageDelayed(1, View$OnClickListenerC2614a.this.f8768t);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                View$OnClickListenerC2614a.this.f8766p = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f8757g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.fimi.soul.module.droneFragment.a.5
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                if (!z) {
                    View$OnClickListenerC2614a.this.m31017a(View$OnClickListenerC2614a.this.f8757g, View$OnClickListenerC2614a.this.f8761k, View$OnClickListenerC2614a.this.f8762l, View$OnClickListenerC2614a.this.f8752b, View$OnClickListenerC2614a.this.f8765o ? View$OnClickListenerC2614a.this.f8754d.f5919d.getString(C1704R.C1707string.distance_unit_ft) : View$OnClickListenerC2614a.this.f8754d.f5919d.getString(C1704R.C1707string.distance_unit_m));
                    return;
                }
                View$OnClickListenerC2614a.this.f8763m = View$OnClickListenerC2614a.this.f8757g.getText().toString();
                if (View$OnClickListenerC2614a.this.f8763m.length() <= 0) {
                    return;
                }
                View$OnClickListenerC2614a.this.f8757g.setText(View$OnClickListenerC2614a.this.f8763m.substring(0, View$OnClickListenerC2614a.this.f8763m.length() - (View$OnClickListenerC2614a.this.f8765o ? 2 : 1)));
            }
        });
        this.f8758h = (MyEditView) view.findViewById(C1704R.C1706id.poi_speek);
        this.f8758h.setInputType(2);
        this.f8758h.addTextChangedListener(new TextWatcher() { // from class: com.fimi.soul.module.droneFragment.a.6
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!View$OnClickListenerC2614a.this.f8758h.hasFocus() || View$OnClickListenerC2614a.this.f8767q.equals(editable.toString())) {
                    View$OnClickListenerC2614a.this.f8758h.setSelection(editable.length());
                    return;
                }
                if (View$OnClickListenerC2614a.this.f8769u.hasMessages(2)) {
                    View$OnClickListenerC2614a.this.f8769u.removeMessages(2);
                }
                View$OnClickListenerC2614a.this.f8769u.sendEmptyMessageDelayed(2, View$OnClickListenerC2614a.this.f8768t);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                View$OnClickListenerC2614a.this.f8767q = charSequence.toString();
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.f8758h.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.fimi.soul.module.droneFragment.a.7
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                if (!z) {
                    View$OnClickListenerC2614a.this.m31017a(View$OnClickListenerC2614a.this.f8758h, View$OnClickListenerC2614a.this.f8760j, View$OnClickListenerC2614a.this.f8759i, View$OnClickListenerC2614a.this.f8753c, View$OnClickListenerC2614a.this.f8765o ? View$OnClickListenerC2614a.this.f8754d.f5919d.getString(C1704R.C1707string.speed_unit_mph) : View$OnClickListenerC2614a.this.f8754d.f5919d.getString(C1704R.C1707string.speed_unit_m));
                    return;
                }
                View$OnClickListenerC2614a.this.f8763m = View$OnClickListenerC2614a.this.f8758h.getText().toString();
                if (View$OnClickListenerC2614a.this.f8763m.length() <= 3) {
                    return;
                }
                View$OnClickListenerC2614a.this.f8758h.setText(View$OnClickListenerC2614a.this.f8763m.substring(0, View$OnClickListenerC2614a.this.f8763m.length() - 3));
            }
        });
        C3103au.m29232a(this.f8754d.f5919d.getAssets(), this.f8755e, this.f8756f, this.f8764n, this.f8757g, this.f8758h);
    }

    /* renamed from: a */
    private void m31022a(EditText editText) {
        if (editText.getText().toString().length() > 0) {
            if (this.f8757g == editText) {
                this.f8757g.setSelection(this.f8757g.length() - 1);
            } else if (this.f8758h != editText || this.f8758h.length() <= 3) {
            } else {
                this.f8758h.setSelection(this.f8758h.length() - 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m31017a(MyEditView myEditView, int i, int i2, SeekBar seekBar, String str) {
        String str2;
        float f;
        String str3;
        float f2;
        try {
            myEditView.setCursorVisible(false);
            String m31016a = m31016a(m31010b(myEditView.getText().toString()));
            FlyActionBean m33783o = C1877d.m33782p().m33811a() == 2 ? C1877d.m33782p().m33783o() : C1877d.m33782p().m33784n();
            if (seekBar == this.f8752b) {
                float m34549e = this.f8765o ? (float) C1679t.m34549e(Float.parseFloat(m31016a)) : Float.parseFloat(m31016a);
                if (m34549e > i) {
                    float f3 = i;
                    StringBuilder sb = new StringBuilder();
                    if (this.f8765o) {
                        i = (int) C1679t.m34553b(i);
                    }
                    String sb2 = sb.append(i).append(str).toString();
                    myEditView.setText(sb2);
                    str3 = sb2;
                    f2 = f3;
                } else {
                    if (m34549e < i2) {
                        m34549e = i2;
                        StringBuilder sb3 = new StringBuilder();
                        if (this.f8765o) {
                            i2 = (int) C1679t.m34553b(i2);
                        }
                        m31016a = sb3.append(i2).append(str).toString();
                        myEditView.setText(m31016a);
                    }
                    float f4 = m34549e;
                    str3 = m31016a;
                    f2 = f4;
                }
                if (!str3.contains(str)) {
                    myEditView.setText(str3 + str);
                }
                seekBar.setProgress(this.f8765o ? (int) Math.round(C1679t.m34553b(f2)) : Math.round(f2));
                m33783o.setHeight(f2);
                m31024a(this.f8765o ? (int) Math.round(C1679t.m34553b(f2)) : Math.round(f2));
            } else if (seekBar == this.f8753c) {
                float m34550d = this.f8765o ? (float) C1679t.m34550d(Float.parseFloat(m31016a)) : Float.parseFloat(m31016a);
                if (m34550d > i) {
                    float f5 = i;
                    StringBuilder sb4 = new StringBuilder();
                    if (this.f8765o) {
                        i = (int) C1679t.m34551c(i);
                    }
                    String sb5 = sb4.append(i).append(str).toString();
                    myEditView.setText(sb5);
                    str2 = sb5;
                    f = f5;
                } else {
                    if (m34550d < i2) {
                        m34550d = i2;
                        StringBuilder sb6 = new StringBuilder();
                        if (this.f8765o) {
                            i2 = (int) C1679t.m34551c(i2);
                        }
                        m31016a = sb6.append(i2).append(str).toString();
                        myEditView.setText(m31016a);
                    }
                    float f6 = m34550d;
                    str2 = m31016a;
                    f = f6;
                }
                if (!str2.contains(str)) {
                    myEditView.setText(str2 + str);
                }
                seekBar.setProgress(this.f8765o ? (int) Math.round(C1679t.m34551c(f)) : Math.round(f));
                m33783o.setSpeek(f);
            }
            m31022a((EditText) myEditView);
            myEditView.setCursorVisible(true);
        } catch (Exception e) {
            myEditView.setText(this.f8763m + str);
            m31022a((EditText) myEditView);
            myEditView.setCursorVisible(true);
        }
    }

    /* renamed from: b */
    public static String m31010b(String str) {
        return Pattern.compile("[^0-9.]").matcher(str).replaceAll("").trim();
    }

    /* renamed from: a */
    public String m31016a(String str) {
        return BigDecimal.valueOf(Integer.parseInt(str)).stripTrailingZeros().toPlainString();
    }

    /* renamed from: a */
    public void m31026a() {
        if (!this.f8751a.isShown()) {
            this.f8753c.setMax(this.f8765o ? (int) C1679t.m34551c(this.f8760j) : this.f8760j);
            this.f8752b.setMax(this.f8765o ? (int) C1679t.m34553b(this.f8761k) : this.f8761k);
            this.f8751a.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void m31025a(float f) {
        this.f8752b.setProgress(this.f8765o ? (int) Math.round(C1679t.m34553b(f)) : Math.round(f));
    }

    /* renamed from: a */
    public void m31024a(int i) {
        FlyActionBean m33783o = C1877d.m33782p().m33811a() == 2 ? C1877d.m33782p().m33783o() : C1877d.m33782p().m33784n();
        if (m33783o != null) {
            C1877d.m33782p().m33801b(this.f8765o ? (float) C1679t.m34549e(i) : i);
            m33783o.setHeight(this.f8765o ? (float) C1679t.m34549e(i) : i);
            for (C8615g c8615g : C1877d.m33782p().m33789i()) {
                FlyActionBean flyActionBean = (FlyActionBean) c8615g.m11006o();
                if (flyActionBean != null && flyActionBean.equals(m33783o)) {
                    c8615g.m11029a(C1884j.m33757a(this.f8754d.f5919d, m33783o.getDrawableRes(), m33783o.getHeight(), true));
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void m31015b() {
        if (this.f8751a.isShown()) {
            this.f8751a.setVisibility(4);
        }
    }

    /* renamed from: b */
    public void m31014b(float f) {
        this.f8753c.setProgress(this.f8765o ? (int) Math.round(C1679t.m34551c(f)) : Math.round(f));
    }

    /* renamed from: b */
    public void m31013b(int i) {
        this.f8764n.setText(i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.delete_operaActon /* 2131755213 */:
                this.f8754d.mo32909a(C2104d.EnumC2105a.DELETE_WAYPOINT);
                return;
            default:
                return;
        }
    }
}
