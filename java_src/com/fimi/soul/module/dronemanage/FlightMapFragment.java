package com.fimi.soul.module.dronemanage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.p001v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1679t;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.manager.C2015y;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p182j.C1874c;
import com.fimi.soul.biz.p182j.C1877d;
import com.fimi.soul.biz.p182j.C1882h;
import com.fimi.soul.biz.p182j.C1888n;
import com.fimi.soul.biz.p183k.C1894b;
import com.fimi.soul.biz.p183k.C1895c;
import com.fimi.soul.biz.p183k.C1901d;
import com.fimi.soul.biz.p183k.C1905f;
import com.fimi.soul.biz.p183k.C1906g;
import com.fimi.soul.biz.p183k.C1909i;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.biz.p186n.C2018a;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p195d.p196a.p197a.C2180l;
import com.fimi.soul.drone.p195d.p196a.p197a.C2181m;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.drone.p205i.C2302ah;
import com.fimi.soul.drone.p205i.C2332bk;
import com.fimi.soul.drone.p205i.C2359r;
import com.fimi.soul.drone.p205i.p206a.C2289c;
import com.fimi.soul.entity.DynamicDYZ_Entity;
import com.fimi.soul.entity.FlyActionBean;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.module.droneFragment.AbstractC2631d;
import com.fimi.soul.module.droneFragment.AbstractView$OnTouchListenerC2632e;
import com.fimi.soul.module.droneFragment.FlyActionSettingFragment;
import com.fimi.soul.module.droneui.DroneMap;
import com.fimi.soul.utils.C3077ae;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3083ak;
import com.fimi.soul.utils.C3084al;
import com.fimi.soul.view.MapWrapperLayout;
import com.fimi.soul.view.titlebar.TouchableMap;
import com.google.android.gms.maps.AbstractC8554f;
import com.google.android.gms.maps.C8499b;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8611c;
import com.google.android.gms.maps.model.C8615g;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.smile.SmileConstants;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes.dex */
public class FlightMapFragment extends DroneMap implements TouchableMap.AbstractC3323a, C8500c.AbstractC8527b, C8500c.AbstractC8528c, C8500c.AbstractC8536k, C8500c.AbstractC8539n, C8500c.AbstractC8540o, C8500c.AbstractC8541p, C8500c.AbstractC8542q, C8500c.AbstractC8543r, AbstractC8554f {

    /* renamed from: K */
    private static final int f9155K = 20;

    /* renamed from: L */
    private static final int f9156L = 30;

    /* renamed from: A */
    private AbstractView$OnTouchListenerC2632e f9157A;

    /* renamed from: B */
    private AbstractView$OnTouchListenerC2632e f9158B;

    /* renamed from: C */
    private AbstractView$OnTouchListenerC2632e f9159C;

    /* renamed from: E */
    private View f9161E;

    /* renamed from: F */
    private Button f9162F;

    /* renamed from: G */
    private Button f9163G;

    /* renamed from: H */
    private View f9164H;

    /* renamed from: I */
    private C1909i f9165I;

    /* renamed from: J */
    private C1895c f9166J;

    /* renamed from: M */
    private LatLng f9167M;

    /* renamed from: N */
    private LatLng f9168N;

    /* renamed from: O */
    private float f9169O;

    /* renamed from: P */
    private float f9170P;

    /* renamed from: Q */
    private AbstractC2694a f9171Q;

    /* renamed from: R */
    private SharedPreferences f9172R;

    /* renamed from: S */
    private C1882h f9173S;

    /* renamed from: T */
    private C1874c f9174T;

    /* renamed from: U */
    private TouchableMap f9175U;

    /* renamed from: V */
    private double f9176V;

    /* renamed from: W */
    private AbstractC2631d f9177W;

    /* renamed from: X */
    private List<C8611c> f9178X;

    /* renamed from: Y */
    private boolean f9179Y;

    /* renamed from: aa */
    private LatLng f9182aa;

    /* renamed from: b */
    SharedPreferences.Editor f9186b;

    /* renamed from: c */
    Point f9187c;

    /* renamed from: e */
    C8611c f9189e;

    /* renamed from: f */
    C8611c f9190f;

    /* renamed from: s */
    private C1901d f9194s;

    /* renamed from: t */
    private C1888n f9195t;

    /* renamed from: u */
    private LatLng f9196u;

    /* renamed from: v */
    private C8611c f9197v;

    /* renamed from: w */
    private boolean f9198w;

    /* renamed from: x */
    private FragmentManager f9199x;

    /* renamed from: y */
    private View f9200y;

    /* renamed from: z */
    private Button f9201z;

    /* renamed from: D */
    private boolean f9160D = false;

    /* renamed from: a */
    boolean f9181a = false;

    /* renamed from: d */
    boolean f9188d = true;

    /* renamed from: g */
    List<DynamicDYZ_Entity> f9191g = new ArrayList();

    /* renamed from: h */
    List<DynamicDYZ_Entity> f9192h = new ArrayList();

    /* renamed from: Z */
    private final int f9180Z = 16;

    /* renamed from: ab */
    private final int f9183ab = 1;

    /* renamed from: ac */
    private EnumC2695b f9184ac = EnumC2695b.no_check;

    /* renamed from: ad */
    private int f9185ad = 1;

    /* renamed from: i */
    protected Handler f9193i = new Handler() { // from class: com.fimi.soul.module.dronemanage.FlightMapFragment.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            C2180l c2180l = new C2180l();
            switch (message.what) {
                case 1:
                    c2180l.m32817c(true);
                    if (FlightMapFragment.this.f9191g != null) {
                        for (DynamicDYZ_Entity dynamicDYZ_Entity : FlightMapFragment.this.f9191g) {
                            if (dynamicDYZ_Entity != null) {
                                C3077ae.m29349c(FlightMapFragment.this.f9182aa, new LatLng(dynamicDYZ_Entity.getLatitude(), dynamicDYZ_Entity.getLogitude())).m29318a();
                                FlightMapFragment.this.f9192h.add(dynamicDYZ_Entity);
                            }
                        }
                    }
                    if (FlightMapFragment.this.f9192h == null || FlightMapFragment.this.f9192h.size() <= 0) {
                        return;
                    }
                    String encryptKey = FlightMapFragment.this.f9192h.get(0).getEncryptKey();
                    c2180l.m32820b(C1679t.m34555a(encryptKey.substring(6, encryptKey.length() - 4)));
                    if (!C1772d.m34208a().m34187k()) {
                        c2180l.m32824a(false);
                    } else {
                        c2180l.m32826a((byte) 26);
                        c2180l.m32824a(true);
                        c2180l.m32821b(true);
                        c2180l.m32823a(FlightMapFragment.m30616a(FlightMapFragment.this.f9185ad));
                    }
                    FlightMapFragment.this.f9388k.mo32906ab().mo32587a(c2180l.mo32762b());
                    FlightMapFragment.this.f9184ac = EnumC2695b.sendKey;
                    return;
                case 16:
                    c2180l.m32817c(false);
                    FlightMapFragment.this.f9388k.mo32906ab().mo32587a(c2180l.mo32762b());
                    return;
                case 20:
                default:
                    return;
                case 30:
                    FlightMapFragment.this.m30605a(true);
                    return;
            }
        }
    };

    /* renamed from: com.fimi.soul.module.dronemanage.FlightMapFragment$a */
    /* loaded from: classes.dex */
    public interface AbstractC2694a {
        /* renamed from: a */
        void mo30500a(List<C2332bk> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.module.dronemanage.FlightMapFragment$b */
    /* loaded from: classes.dex */
    public enum EnumC2695b {
        no_check,
        checkStatus,
        sendKey,
        sendData,
        finish
    }

    /* renamed from: a */
    public static int m30604a(byte[] bArr) {
        return ((bArr[1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (bArr[0] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
    }

    /* renamed from: a */
    private void m30612a(C2332bk c2332bk) {
    }

    /* renamed from: a */
    private void m30608a(LatLng latLng, int i, int i2, C2289c c2289c) {
        if (this.f9387j == null) {
            return;
        }
        this.f9172R.getInt(C2279c.f7282s, 1);
        boolean m34187k = C1772d.m34208a().m34187k();
        if (i2 == 3 || m34187k) {
            if (this.f9190f != null) {
                this.f9190f.m11075a(latLng);
                if (i != this.f9190f.m11068d()) {
                    if (m34187k) {
                        this.f9190f.m11078a(c2289c.m32400l() * 10);
                    } else {
                        this.f9190f.m11078a(i + 100);
                    }
                }
            } else {
                this.f9190f = this.f9387j.m11581a(new CircleOptions().m11413a(latLng).m11416a(m34187k ? c2289c.m32400l() * 10 : i + 100).m11414a(Color.argb(99, 255, 79, 0)).m11415a(2.0f).m11409b(Color.argb(26, 255, 36, 0)));
            }
        } else if (this.f9190f != null) {
            this.f9190f.m11079a();
            this.f9190f = null;
        }
        if (m34187k) {
            if ((c2289c.m32402j() & 3) == 1) {
                if (!this.f9179Y) {
                    if (this.f9189e != null) {
                        this.f9189e.m11079a();
                        this.f9189e = null;
                    }
                    this.f9189e = this.f9387j.m11581a(C1905f.m33624a(i, Color.argb(99, 255, 79, 0), Color.argb(26, 255, 36, 0), 2.0f, 100).m11413a(latLng));
                    this.f9179Y = true;
                } else if (this.f9189e == null) {
                    this.f9189e = this.f9387j.m11581a(C1905f.m33624a(i, Color.argb(99, 255, 79, 0), Color.argb(26, 255, 36, 0), 2.0f, 100).m11413a(latLng));
                } else {
                    this.f9189e.m11075a(latLng);
                    if (i != this.f9189e.m11068d()) {
                        this.f9189e.m11078a(i);
                    }
                }
            } else if (this.f9179Y) {
                if (this.f9189e != null) {
                    this.f9189e.m11079a();
                    this.f9189e = null;
                }
                this.f9189e = this.f9387j.m11581a(C1905f.m33624a(i, Color.argb(99, 255, 79, 0), Color.argb(26, 255, 36, 0), 2.0f, 100).m11413a(latLng));
                this.f9179Y = false;
            } else if (this.f9189e == null) {
                this.f9189e = this.f9387j.m11581a(C1905f.m33624a(i, Color.argb(99, 255, 79, 0), Color.argb(26, 255, 36, 0), 2.0f, 100).m11413a(latLng));
            } else {
                this.f9189e.m11075a(latLng);
                if (i != this.f9189e.m11068d()) {
                    this.f9189e.m11078a(i);
                }
            }
        } else if (this.f9189e != null) {
            this.f9189e.m11075a(latLng);
            if (i != this.f9189e.m11068d()) {
                this.f9189e.m11078a(i);
            }
        } else {
            this.f9189e = this.f9387j.m11581a(new CircleOptions().m11413a(latLng).m11416a(i).m11414a(Color.argb(99, 255, 79, 0)).m11415a(2.0f).m11409b(Color.argb(26, 255, 36, 0)).m11410b(100.0f));
        }
        if (!this.f9178X.contains(this.f9189e)) {
            this.f9178X.add(this.f9189e);
        }
        C1894b.m33702a().m33701a(this.f9189e.m11069c());
    }

    /* renamed from: a */
    private void m30607a(String str) {
        if (str != null) {
            this.f9388k.mo32906ab().mo32582a(C1679t.m34555a(str));
        }
    }

    /* renamed from: a */
    public static byte[] m30616a(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    /* renamed from: b */
    private String m30602b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        int i = 0;
        for (byte b : bArr) {
            i += b & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
        }
        return C1679t.m34554a(m30615a(i, false));
    }

    /* renamed from: c */
    private void m30599c(LatLng latLng) {
        if (this.f9387j != null) {
            if (this.f9197v == null) {
                this.f9197v = this.f9387j.m11581a(new CircleOptions().m11413a(latLng).m11416a(500.0d).m11415a(5.0f).m11414a(getResources().getColor(C1704R.color.errortextcl)));
                return;
            }
            this.f9197v.m11075a(latLng);
            this.f9197v.m11074a(true);
        }
    }

    /* renamed from: g */
    private void m30598g() {
    }

    /* renamed from: h */
    private void m30597h() {
        this.f9161E = LayoutInflater.from(getActivity()).inflate(C1704R.layout.mystyle_com_inforwindow, (ViewGroup) null);
        this.f9162F = (Button) this.f9161E.findViewById(C1704R.C1706id.delete);
        this.f9163G = (Button) this.f9161E.findViewById(C1704R.C1706id.excute_again);
        this.f9159C = new AbstractView$OnTouchListenerC2632e(this.f9162F, getResources().getDrawable(C1704R.C1705drawable.btn_fly_back_bubble_left_normal), getResources().getDrawable(C1704R.C1705drawable.btn_fly_back_bubble_left_pressed)) { // from class: com.fimi.soul.module.dronemanage.FlightMapFragment.1
            @Override // com.fimi.soul.module.droneFragment.AbstractView$OnTouchListenerC2632e
            /* renamed from: a */
            protected void mo30589a(View view, C8615g c8615g) {
                C1877d.m33782p().m33779s();
                FlightMapFragment.this.f9388k.mo32909a(C2104d.EnumC2105a.CLEARDATA);
            }
        };
        this.f9158B = new AbstractView$OnTouchListenerC2632e(this.f9162F, getResources().getDrawable(C1704R.C1705drawable.btn_fly_back_bubble_left_normal), getResources().getDrawable(C1704R.C1705drawable.btn_fly_back_bubble_left_pressed)) { // from class: com.fimi.soul.module.dronemanage.FlightMapFragment.2
            @Override // com.fimi.soul.module.droneFragment.AbstractView$OnTouchListenerC2632e
            /* renamed from: a */
            protected void mo30589a(View view, C8615g c8615g) {
                if ((FlightMapFragment.this.f9388k.m32979j() != null && FlightMapFragment.this.f9388k.m32979j().m32411b() == 1) || FlightMapFragment.this.f9388k.m33007ao().m31769g()) {
                    C1688z.m34448a(FlightMapFragment.this.getActivity(), FlightMapFragment.this.getString(C1704R.C1707string.show_drone_control_no_zoom_auto_flight));
                    return;
                }
                C1882h m33763a = C1882h.m33763a(FlightMapFragment.this.getActivity());
                FlyActionBean flyActionBean = null;
                if (c8615g.m11006o() instanceof FlyActionBean) {
                    flyActionBean = (FlyActionBean) c8615g.m11006o();
                }
                if (flyActionBean == null) {
                    return;
                }
                switch (flyActionBean.getModelType()) {
                    case 1:
                        m33763a.m33764a(1);
                        FlightMapFragment.this.f9388k.mo32909a(C2104d.EnumC2105a.UPWAYPOINT);
                        return;
                    case 2:
                        m33763a.m33764a(2);
                        FlightMapFragment.this.f9388k.mo32909a(C2104d.EnumC2105a.ASSIGNWAYPOINT);
                        return;
                    case 3:
                        m33763a.m33764a(3);
                        FlightMapFragment.this.f9388k.mo32909a(C2104d.EnumC2105a.INTERESTWAYPOINT);
                        return;
                    default:
                        return;
                }
            }
        };
        this.f9162F.setOnTouchListener(this.f9159C);
        this.f9163G.setOnTouchListener(this.f9158B);
    }

    /* renamed from: i */
    private void m30595i() {
        this.f9200y = LayoutInflater.from(getActivity()).inflate(C1704R.layout.mystyle_inforwindow, (ViewGroup) null);
        this.f9201z = (Button) this.f9200y.findViewById(C1704R.C1706id.reminder);
        this.f9157A = new AbstractView$OnTouchListenerC2632e(this.f9201z, getResources().getDrawable(C1704R.C1705drawable.btn_fly_back_bubble_normal), getResources().getDrawable(C1704R.C1705drawable.btn_fly_back_bubble_pressed)) { // from class: com.fimi.soul.module.dronemanage.FlightMapFragment.3
            @Override // com.fimi.soul.module.droneFragment.AbstractView$OnTouchListenerC2632e
            /* renamed from: a */
            protected void mo30589a(View view, C8615g c8615g) {
                if (FlightMapFragment.this.f9201z.getText().toString().equals(FlightMapFragment.this.getString(C1704R.C1707string.delete_marker))) {
                    FlightMapFragment.this.f9388k.mo32909a(C2104d.EnumC2105a.DELETE_WAYPOINT);
                }
            }
        };
        this.f9201z.setOnTouchListener(this.f9157A);
    }

    /* renamed from: j */
    private void m30594j() {
        if (this.f9387j != null) {
            this.f9387j.m11594a((C8500c.AbstractC8539n) this);
            this.f9387j.m11591a((C8500c.AbstractC8542q) this);
            this.f9387j.m11590a((C8500c.AbstractC8543r) this);
            this.f9387j.m11611a(this.f9172R.getInt(C2279c.f7282s, 1));
            this.f9387j.m11572a(false);
            this.f9387j.m11605a((C8500c.AbstractC8528c) this);
            this.f9387j.m11593a((C8500c.AbstractC8540o) this);
            this.f9387j.m11606a((C8500c.AbstractC8527b) this);
            this.f9387j.m11555m().m11451a(false);
        }
    }

    /* renamed from: k */
    private void m30593k() {
        if (this.f9197v != null) {
            this.f9197v.m11074a(false);
        }
    }

    /* renamed from: l */
    private void m30592l() {
        C2015y.m33256a(getActivity()).m33246b(new AbstractC1945k() { // from class: com.fimi.soul.module.dronemanage.FlightMapFragment.4
            @Override // com.fimi.soul.biz.p185m.AbstractC1945k
            /* renamed from: a */
            public void mo28106a(PlaneMsg planeMsg, File file) {
                if (planeMsg.isSuccess()) {
                    try {
                        JSONArray jSONArray = new JSONArray(planeMsg.getData().toString());
                        if (jSONArray == null || jSONArray.length() <= 0) {
                            return;
                        }
                        for (int i = 0; i < jSONArray.length(); i++) {
                            FlightMapFragment.this.f9191g.add((DynamicDYZ_Entity) C3083ak.m29323b(DynamicDYZ_Entity.class, jSONArray.getJSONObject(i).toString()));
                        }
                        FlightMapFragment.this.f9193i.sendEmptyMessage(1);
                    } catch (JsonParseException e) {
                        e.printStackTrace();
                    } catch (JsonMappingException e2) {
                        e2.printStackTrace();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    } catch (JSONException e4) {
                        e4.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: m */
    private void m30591m() {
        if (this.f9185ad >= this.f9192h.size() || this.f9185ad < 0) {
            return;
        }
        DynamicDYZ_Entity dynamicDYZ_Entity = this.f9192h.get(this.f9185ad - 1);
        if (!C1772d.m34208a().m34187k()) {
            C2181m c2181m = new C2181m();
            String encryptValue = dynamicDYZ_Entity.getEncryptValue();
            c2181m.m32794b(C1679t.m34555a(encryptValue.substring(6, encryptValue.length() - 4)));
            this.f9388k.mo32906ab().mo32587a(c2181m.mo32762b());
        } else {
            C2180l c2180l = new C2180l();
            c2180l.m32826a((byte) 36);
            c2180l.m32817c(true);
            String encryptValue2 = dynamicDYZ_Entity.getEncryptValue();
            byte[] m34555a = C1679t.m34555a(encryptValue2.substring(6, encryptValue2.length() - 4));
            if (!C1772d.m34208a().m34187k()) {
                c2180l.m32824a(false);
            } else {
                c2180l.m32824a(true);
                c2180l.m32821b(false);
                c2180l.m32823a(m30616a(this.f9185ad));
            }
            c2180l.m32820b(m34555a);
            this.f9388k.mo32906ab().mo32587a(c2180l.mo32762b());
        }
        this.f9184ac = EnumC2695b.sendData;
    }

    /* renamed from: n */
    private void m30590n() {
        C2180l c2180l = new C2180l();
        c2180l.m32817c(false);
        c2180l.m32809g((byte) 1);
        c2180l.m32813e((byte) 1);
        this.f9388k.mo32906ab().mo32587a(c2180l.mo32762b());
        this.f9194s.m33652a(this.f9192h);
        this.f9184ac = EnumC2695b.finish;
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8527b
    /* renamed from: a */
    public View mo11520a(C8615g c8615g) {
        FlyActionBean flyActionBean;
        if (!(c8615g.m11006o() instanceof FlyActionBean) || (flyActionBean = (FlyActionBean) c8615g.m11006o()) == null) {
            return null;
        }
        if (flyActionBean.getStyleInfo() != 2) {
            this.f9201z.setText(c8615g.m11016e());
            this.f9157A.m30941a(c8615g);
            MapWrapperLayout m33025aB = this.f9388k.m33025aB();
            if (m33025aB != null) {
                m33025aB.m28881a(c8615g, this.f9200y);
            }
            return this.f9200y;
        }
        if (!flyActionBean.isCanExcute()) {
            m30614a(this.f9163G, 75);
        } else {
            m30614a(this.f9163G, 255);
        }
        this.f9158B.m30941a(c8615g);
        this.f9159C.m30941a(c8615g);
        MapWrapperLayout m33025aB2 = this.f9388k.m33025aB();
        if (m33025aB2 != null) {
            m33025aB2.m28881a(c8615g, this.f9161E);
        }
        return this.f9161E;
    }

    /* renamed from: a */
    public void m30618a() {
        if (this.f9166J == null) {
            this.f9166J = new C1895c(this.f9387j, this.f9388k);
        }
        if (this.f9165I == null) {
            this.f9165I = new C1909i(this.f9388k);
        } else {
            this.f9165I.m33599a(true);
        }
        if (!C1772d.m34208a().m34187k()) {
            this.f9166J.m33683b();
            return;
        }
        if (this.f9193i.hasMessages(30)) {
            this.f9193i.removeMessages(30);
        }
        this.f9193i.sendEmptyMessageDelayed(30, 2000L);
    }

    /* renamed from: a */
    public void m30617a(float f, boolean z, View... viewArr) {
        for (int i = 0; i < viewArr.length; i++) {
            View view = viewArr[i];
            if (view.getAlpha() != f) {
                view.setAlpha(f);
            }
            if (view.isEnabled() != z) {
                viewArr[i].setEnabled(z);
            }
        }
    }

    @Override // com.fimi.soul.view.titlebar.TouchableMap.AbstractC3323a
    /* renamed from: a */
    public void mo28295a(MotionEvent motionEvent) {
        C2018a m33233a = C2018a.m33233a();
        if (m33233a.m33226c() == C2018a.EnumC2021a.DRONEPRESS) {
            switch (motionEvent.getAction() & 255) {
                case 0:
                    this.f9169O = motionEvent.getX();
                    this.f9170P = motionEvent.getY();
                    this.f9181a = true;
                    m33233a.m33228a(false);
                    return;
                case 1:
                    m33233a.m33228a(true);
                    if (!this.f9181a) {
                        return;
                    }
                    if (Math.abs(motionEvent.getX() - this.f9169O) <= 30.0f && Math.abs(motionEvent.getY() - this.f9170P) <= 30.0f) {
                        return;
                    }
                    m33233a.m33230a(C2018a.EnumC2021a.DRONE);
                    return;
                case 2:
                case 3:
                case 4:
                default:
                    return;
                case 5:
                    this.f9181a = false;
                    return;
            }
        }
    }

    /* renamed from: a */
    public void m30614a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
        if (i == 255) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
    }

    /* renamed from: a */
    public void m30613a(C2289c c2289c) {
        LatLng latLng;
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29346a = C3078af.m29346a(c2289c.m32406f(), c2289c.m32405g());
            latLng = new LatLng(m29346a.m29322a(), m29346a.m29320b());
        } else {
            latLng = new LatLng(c2289c.m32406f(), c2289c.m32405g());
        }
        int m32409c = c2289c.m32409c() * 10;
        if (this.f9387j != null) {
            m30608a(latLng, m32409c, c2289c.m32407e(), c2289c);
        }
    }

    /* renamed from: a */
    public void m30611a(FlyActionBean flyActionBean) {
        this.f9174T.m33821b();
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8528c
    /* renamed from: a */
    public void mo11518a(CameraPosition cameraPosition) {
        if (this.f9173S.m33765a().get() == 3 && this.f9388k.mo32905ac()) {
            this.f9388k.mo32909a(C2104d.EnumC2105a.CHANGESTARTMARKER);
        }
        if (cameraPosition == null || cameraPosition.f27431b < 7.0f) {
            return;
        }
        this.f9194s.m33658a();
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8539n
    /* renamed from: a */
    public void mo11506a(LatLng latLng) {
        if (f9375l == 6 || f9375l == 4 || f9375l == 5) {
            return;
        }
        this.f9388k.mo32909a(C2104d.EnumC2105a.HIDEINFORWINDOW);
        FlyActionSettingFragment flyActionSettingFragment = (FlyActionSettingFragment) this.f9199x.findFragmentById(C1704R.C1706id.flyaction);
        if ((flyActionSettingFragment != null && !flyActionSettingFragment.isVisible()) || !this.f9173S.m33762b()) {
            return;
        }
        if (this.f9173S.m33765a().get() == 1) {
            this.f9174T.m33823a(latLng, C1704R.C1705drawable.icon_fly_waypoint_red);
        } else if (this.f9173S.m33765a().get() == 2) {
            this.f9174T.m33823a(latLng, C1704R.C1705drawable.img_fly_flag_blue);
        } else if (this.f9173S.m33765a().get() != 3) {
        } else {
            this.f9174T.m33823a(latLng, C1704R.C1705drawable.img_fly_flag_blue);
        }
    }

    /* renamed from: a */
    public void m30606a(List<C2332bk> list) {
    }

    /* renamed from: a */
    public void m30605a(boolean z) {
        if (this.f9165I != null) {
            this.f9165I.m33595b(z);
        }
    }

    /* renamed from: a */
    public byte[] m30615a(int i, boolean z) {
        byte[] bArr = new byte[2];
        if (z) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                bArr[length] = (byte) (i & 255);
                i >>= 8;
            }
        } else {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr[i2] = (byte) (i & 255);
                i >>= 8;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8527b
    /* renamed from: b */
    public View mo11519b(C8615g c8615g) {
        return null;
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8540o
    /* renamed from: b */
    public void mo11505b() {
        if (this.f9387j.m11613a().f27431b >= 7.0f) {
            this.f9194s.m33658a();
        }
    }

    @Override // com.fimi.soul.module.droneui.DroneMap, com.google.android.gms.maps.AbstractC8554f
    /* renamed from: b */
    public void mo11486b(C8500c c8500c) {
        if (c8500c != null) {
            this.f9387j = c8500c;
            this.f9388k.m33029a(this.f9387j);
            if (this.f9194s == null) {
                this.f9194s = new C1901d(getActivity().getApplicationContext(), this.f9387j);
            }
            if (this.f9174T == null) {
                this.f9174T = new C1874c(this.f9388k, this.f9387j, getActivity().getApplicationContext(), this.f9199x);
            } else {
                this.f9174T.m33818d();
            }
            if (this.f9195t == null) {
                this.f9195t = new C1888n(this.f9388k);
            }
            m30594j();
            if (this.f9177W != null) {
                this.f9177W.mo30502a(c8500c);
            }
            m30595i();
            m30597h();
            m30598g();
            if (MyLocationManager.m33443a(getActivity()).m33438c() == null && !this.f9388k.mo32905ac() && this.f9387j != null) {
                this.f9388k.m32983g(true);
                this.f9387j.m11609a(C8499b.m11619a(new LatLng(32.76593d, 102.523984d), 4.0f));
            }
            m30618a();
        }
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8541p
    /* renamed from: b */
    public void mo11504b(LatLng latLng) {
    }

    /* renamed from: c */
    public void m30601c() {
        if (this.f9387j != null) {
            this.f9387j.m11611a(this.f9172R.getInt(C2279c.f7282s, 1));
        }
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8536k
    /* renamed from: c */
    public void mo11509c(C8615g c8615g) {
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8542q
    /* renamed from: d */
    public boolean mo11503d(C8615g c8615g) {
        if (this.f9388k.m33001au().m32390g().judgeNoAction()) {
            this.f9174T.m33822a(c8615g);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8543r
    /* renamed from: e */
    public void mo11502e(C8615g c8615g) {
        m30596h(c8615g);
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8543r
    /* renamed from: f */
    public void mo11501f(C8615g c8615g) {
        if ((this.f9176V >= 500.0d || this.f9198w) && this.f9196u != null) {
            c8615g.m11030a(this.f9196u);
        }
        if (c8615g.m11011j()) {
            c8615g.m11012i();
            c8615g.m11027a("");
        }
        this.f9388k.mo32909a(C2104d.EnumC2105a.NOTIFICHANGECIECLERIDUS);
    }

    @Override // com.google.android.gms.maps.C8500c.AbstractC8543r
    /* renamed from: g */
    public void mo11500g(C8615g c8615g) {
    }

    /* renamed from: h */
    public void m30596h(C8615g c8615g) {
        LatLng m11020c = c8615g.m11020c();
        for (C8611c c8611c : C1906g.m33620c().m33619d()) {
            if (c8611c != null && C3077ae.m29349c(c8611c.m11069c(), m11020c).m29318a() < c8611c.m11068d()) {
                this.f9198w = true;
                C1688z.m34449a(this.f9388k.f5919d, (int) C1704R.C1707string.flyzonwaypoint, 3000);
                return;
            }
        }
        this.f9198w = false;
        this.f9176V = C3077ae.m29349c(m11020c, new LatLng(this.f9388k.mo32890x().m32302b(), this.f9388k.mo32890x().m32301c())).m29318a();
        if (this.f9173S.m33765a().get() == 1 || this.f9173S.m33765a().get() == 2) {
            if (C1642c.m34885e().m34501p()) {
                c8615g.m11027a(getString(C1704R.C1707string.distancetag) + C1679t.m34553b(this.f9176V) + getString(C1704R.C1707string.foot_unit));
            } else {
                c8615g.m11027a(getString(C1704R.C1707string.distancetag) + C1679t.m34556a(this.f9176V, 1) + getString(C1704R.C1707string.meter));
            }
            c8615g.m11013h();
        }
        if (this.f9176V >= 500.0d) {
            C1688z.m34449a(getActivity(), (int) C1704R.C1707string.waypoint_distan_home_Err, 1000);
            return;
        }
        this.f9196u = m11020c;
        FlyActionBean flyActionBean = null;
        if (c8615g.m11006o() instanceof FlyActionBean) {
            flyActionBean = (FlyActionBean) c8615g.m11006o();
        }
        if (flyActionBean == null) {
            return;
        }
        flyActionBean.setLatLng(m11020c);
        m30611a(flyActionBean);
    }

    @Override // com.fimi.soul.module.droneui.DroneMap, com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f9171Q = (AbstractC2694a) getActivity();
            this.f9177W = (AbstractC2631d) getActivity();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f9195t == null) {
            if (this.f9388k == null) {
                this.f9388k = ((DroidPlannerApp) getActivity().getApplication()).f4493a;
            }
            this.f9195t = new C1888n(this.f9388k);
        }
        this.f9173S = C1882h.m33763a(getActivity().getApplicationContext());
        this.f9178X = C1906g.m33620c().m33619d();
        this.f9199x = getActivity().getSupportFragmentManager();
    }

    @Override // com.fimi.soul.module.droneui.DroneMap, com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f9175U = new TouchableMap(getActivity());
        this.f9175U.addView(onCreateView);
        this.f9175U.setNonConsumingTouchListener(this);
        this.f9172R = PreferenceManager.getDefaultSharedPreferences(getActivity());
        this.f9186b = this.f9172R.edit();
        return this.f9175U;
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f9194s != null) {
            this.f9194s.m33650b();
        }
        for (C8611c c8611c : this.f9178X) {
            if (c8611c != null) {
                c8611c.m11079a();
            }
        }
        this.f9195t.m33735a();
        if (this.f9177W != null) {
            this.f9177W = null;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // com.fimi.soul.module.droneui.DroneMap, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        C2359r m32990d;
        int i = 0;
        super.onDroneEvent(enumC2105a, c2083a);
        switch (enumC2105a) {
            case UPDATE_FLYZONE:
                if (this.f9194s != null) {
                    this.f9194s.m33646c();
                }
                if (this.f9166J == null) {
                    return;
                }
                this.f9166J.m33697a();
                return;
            case Remotecontrol:
                if (!c2083a.mo32905ac() && !this.f9160D) {
                    c2083a.m33017ad();
                    this.f9160D = true;
                }
                if (!c2083a.mo32905ac()) {
                    return;
                }
                this.f9160D = false;
                return;
            case NOFLYZONE:
                C2289c m32979j = c2083a.m32979j();
                if (m32979j.m32411b() == 4 || m32979j.m32411b() == 5 || m32979j.m32411b() == 6) {
                    return;
                }
                m30613a(m32979j);
                return;
            case DISPLAYLIMITCIRCLE:
                C2302ah mo32890x = c2083a.mo32890x();
                m30599c(new LatLng(mo32890x.m32302b(), mo32890x.m32301c()));
                return;
            case HIDEDISPLAYCIRCLE:
                m30593k();
                return;
            case HOMEPOINT:
            default:
                return;
            case DYNAMIC_RESULT:
                if (this.f9184ac == EnumC2695b.finish || (m32990d = c2083a.m32990d()) == null) {
                    return;
                }
                byte m31868e = m32990d.m31868e();
                byte m31866f = m32990d.m31866f();
                byte m31864g = m32990d.m31864g();
                if (m31866f == 1) {
                    return;
                }
                switch (this.f9184ac) {
                    case checkStatus:
                        this.f9191g.clear();
                        this.f9192h.clear();
                        if (m31868e != 1 || m31866f != 0 || m31864g != 0) {
                            return;
                        }
                        this.f9182aa = new LatLng(c2083a.mo32891w().m32189f(), c2083a.mo32891w().m32190e());
                        m30592l();
                        return;
                    case sendKey:
                        if (m31864g != 0) {
                            return;
                        }
                        m30591m();
                        return;
                    case sendData:
                        if (m31864g != 0 || m31866f == 1) {
                            return;
                        }
                        byte[] m31870d = m32990d.m31870d();
                        if (m31870d != null && m31870d.length > 0) {
                            i = m30604a(m31870d);
                        }
                        if (this.f9185ad == this.f9192h.size()) {
                            m30590n();
                            return;
                        } else if (this.f9185ad != i) {
                            return;
                        } else {
                            m30591m();
                            this.f9185ad++;
                            return;
                        }
                    default:
                        return;
                }
        }
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f9165I != null) {
            this.f9165I.m33599a(false);
        }
    }

    @Override // com.fimi.soul.module.droneui.DroneMap, com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.fimi.soul.module.droneui.DroneMap, com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.f9387j != null) {
            m30618a();
        }
    }

    @Override // com.fimi.soul.module.droneui.DroneMap, com.google.android.gms.maps.SupportMapFragment, android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
    }
}
