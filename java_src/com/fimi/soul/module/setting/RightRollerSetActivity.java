package com.fimi.soul.module.setting;

import android.content.Intent;
import android.os.Bundle;
import android.support.p001v4.app.FragmentActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p195d.p196a.p197a.C2155br;
import com.fimi.soul.drone.p195d.p196a.p197a.C2186r;
import com.fimi.soul.drone.p205i.C2333c;
import com.fimi.soul.drone.p205i.C2336f;
import com.fimi.soul.module.droneFragment.ShowDroneStatusFragment;
import java.util.ArrayList;
import org.p356d.AbstractC11759f;
/* loaded from: classes.dex */
public class RightRollerSetActivity extends FragmentActivity implements View.OnClickListener, C2104d.AbstractC2106b {

    /* renamed from: a */
    C2922g f10307a;

    /* renamed from: b */
    C2083a f10308b;

    /* renamed from: c */
    ListView f10309c;

    /* renamed from: d */
    Button f10310d;

    /* renamed from: e */
    Intent f10311e;

    /* renamed from: f */
    boolean f10312f = true;

    /* renamed from: g */
    String f10313g = "";

    /* renamed from: h */
    int f10314h = -1;

    /* renamed from: j */
    private C1827d f10316j = (C1827d) C1783b.m34166a().m34150d();

    /* renamed from: i */
    boolean f10315i = false;

    /* renamed from: com.fimi.soul.module.setting.RightRollerSetActivity$a */
    /* loaded from: classes.dex */
    public enum EnumC2894a {
        ev,
        light,
        ATTI_GPS
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m30063b(EnumC2894a enumC2894a) {
        if (enumC2894a != EnumC2894a.ATTI_GPS) {
            C2155br c2155br = new C2155br();
            c2155br.f6616d = C2186r.f6822a;
            c2155br.f6617e = (byte) 1;
            if (enumC2894a == EnumC2894a.ev) {
                c2155br.f6618f = (byte) 1;
                this.f10311e.putExtra("content", getString(C1704R.C1707string.ev_control));
            } else if (enumC2894a == EnumC2894a.light) {
                c2155br.f6618f = (byte) 2;
                this.f10311e.putExtra("content", getString(C1704R.C1707string.light_control));
            }
            this.f10308b.mo32906ab().mo32587a(c2155br.mo32762b());
            m30066a(enumC2894a);
            this.f10315i = true;
        }
        setResult(-1, this.f10311e);
    }

    /* renamed from: a */
    public void m30067a() {
        if (this.f10316j.e()) {
            this.f10316j.m33989u().m34054a("ae_bias", ShowDroneStatusFragment.f8492b > 0.0f ? AbstractC11759f.f37105b + ShowDroneStatusFragment.f8492b + " EV" : ShowDroneStatusFragment.f8492b < 0.0f ? ShowDroneStatusFragment.f8492b + " EV" : " 0.0 EV");
        }
    }

    /* renamed from: a */
    public void m30066a(EnumC2894a enumC2894a) {
        int i = 0;
        C2336f m32984g = this.f10308b.m32984g();
        if (enumC2894a != EnumC2894a.ev && enumC2894a == EnumC2894a.light) {
            i = 1;
        }
        this.f10308b.mo32906ab().mo32587a(m32984g.m32001b(i, m32984g));
    }

    /* renamed from: b */
    public void m30064b() {
        this.f10308b.mo32906ab().mo32587a(new C2336f().m31995f());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.black_btn /* 2131756179 */:
                finish();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.right_roller_layout);
        this.f10310d = (Button) findViewById(C1704R.C1706id.black_btn);
        this.f10310d.setOnClickListener(this);
        this.f10309c = (ListView) findViewById(C1704R.C1706id.right_listview);
        getWindow().addFlags(128);
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        if (!c2083a.mo32906ab().mo32588a() || !c2083a.mo32905ac()) {
            return;
        }
        switch (enumC2105a) {
            case backControl:
                C2333c mo32918R = c2083a.mo32918R();
                if (mo32918R == null || mo32918R.m32031b() != 115 || !this.f10315i) {
                    return;
                }
                if (mo32918R.m32030c() == 2) {
                    switch (mo32918R.f7579d) {
                        case 1:
                            this.f10307a.m29933a(1);
                            this.f10314h = 1;
                            m30067a();
                            break;
                        case 2:
                            this.f10307a.m29933a(0);
                            this.f10314h = 0;
                            break;
                    }
                    C1688z.m34448a(this, getString(C1704R.C1707string.set_success));
                } else if (mo32918R.m32030c() == 4 || mo32918R.m32030c() == 6) {
                    C1688z.m34448a(this, getString(C1704R.C1707string.setting_false));
                    this.f10314h = -1;
                }
                this.f10315i = false;
                return;
            case BRIGHTNESS:
                Log.i("istep", " 飞机发过来的灯光值 " + ((int) c2083a.m32984g().m32000c()));
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f10311e = getIntent();
        if (!this.f10308b.mo32906ab().mo32588a() || !this.f10308b.mo32905ac()) {
            this.f10309c.setClickable(false);
            this.f10307a.m29932a(true);
            return;
        }
        this.f10312f = this.f10311e.getBooleanExtra("GPS_ATTI", false);
        this.f10313g = this.f10311e.getStringExtra("curModel") != null ? this.f10311e.getStringExtra("curModel") : "";
        if (this.f10307a != null && this.f10312f) {
            this.f10307a.m29931b(true);
            this.f10307a.m29933a(2);
            this.f10309c.setClickable(false);
        } else if (this.f10312f || this.f10307a == null) {
        } else {
            this.f10309c.setClickable(true);
            this.f10307a.m29931b(false);
            if (this.f10313g.equals(getString(C1704R.C1707string.ev_control))) {
                this.f10307a.m29933a(1);
            } else if (!this.f10313g.equals(getString(C1704R.C1707string.light_control))) {
            } else {
                this.f10307a.m29933a(0);
            }
        }
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f10308b = ((DroidPlannerApp) getApplication()).f4493a;
        this.f10308b.mo32908a(this);
        String[] stringArray = getResources().getStringArray(C1704R.array.right_set);
        ArrayList arrayList = new ArrayList();
        if (stringArray != null && stringArray.length > 0) {
            for (String str : stringArray) {
                C2931h c2931h = new C2931h();
                c2931h.m29891a(false);
                c2931h.m29892a(str);
                arrayList.add(c2931h);
            }
        }
        this.f10307a = new C2922g(this, arrayList);
        this.f10309c.setAdapter((ListAdapter) this.f10307a);
        this.f10309c.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.fimi.soul.module.setting.RightRollerSetActivity.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long j) {
                if (!RightRollerSetActivity.this.f10308b.mo32906ab().mo32588a() || !RightRollerSetActivity.this.f10308b.mo32905ac()) {
                    C1688z.m34448a(RightRollerSetActivity.this, RightRollerSetActivity.this.getString(C1704R.C1707string.right_scroll_mode_des));
                    return;
                }
                switch (i) {
                    case 0:
                        RightRollerSetActivity.this.m30063b(EnumC2894a.light);
                        break;
                    case 1:
                        RightRollerSetActivity.this.m30063b(EnumC2894a.ev);
                        break;
                }
                view.setOnTouchListener(new View.OnTouchListener() { // from class: com.fimi.soul.module.setting.RightRollerSetActivity.1.1
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view2, MotionEvent motionEvent) {
                        return i == RightRollerSetActivity.this.f10314h || i == 2;
                    }
                });
            }
        });
        this.f10309c.setOnTouchListener(new View.OnTouchListener() { // from class: com.fimi.soul.module.setting.RightRollerSetActivity.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return RightRollerSetActivity.this.f10312f || !RightRollerSetActivity.this.f10308b.mo32905ac() || !RightRollerSetActivity.this.f10308b.mo32906ab().mo32588a();
            }
        });
        m30064b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.f10308b != null) {
            this.f10308b.mo32903b(this);
        }
    }
}
