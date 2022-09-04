package com.fimi.soul.module.calibcompass;

import android.app.Activity;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fimi.kernel.p164c.C1645c;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.kernel.view.percent.PercentRelativeLayout;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.entity.CheckCampssBeann;
import com.fimi.soul.module.p214c.C2523d;
import com.fimi.soul.utils.C3103au;
import com.google.android.gms.maps.model.LatLng;
import it.p273a.p274a.AbstractC10866e;
import java.util.List;
/* loaded from: classes.dex */
public class CaliCompassErrorFragment extends BaseCaliCompassFragment {

    /* renamed from: f */
    AbstractC2536a f8244f;

    /* renamed from: g */
    private Button f8245g;

    /* renamed from: h */
    private Button f8246h;

    /* renamed from: i */
    private Button f8247i;

    /* renamed from: j */
    private ImageView f8248j;

    /* renamed from: k */
    private TextView f8249k;

    /* renamed from: l */
    private TextView f8250l;

    /* renamed from: m */
    private boolean f8251m;

    /* renamed from: n */
    private boolean f8252n;

    /* renamed from: o */
    private boolean f8253o;

    /* renamed from: p */
    private Handler f8254p = new Handler();

    /* renamed from: q */
    private Runnable f8255q = new Runnable() { // from class: com.fimi.soul.module.calibcompass.CaliCompassErrorFragment.1
        @Override // java.lang.Runnable
        public void run() {
            CaliCompassErrorFragment.this.getActivity().setResult(0);
            CaliCompassErrorFragment.this.getActivity().finish();
        }
    };

    /* renamed from: r */
    private int f8256r;

    /* renamed from: com.fimi.soul.module.calibcompass.CaliCompassErrorFragment$a */
    /* loaded from: classes.dex */
    interface AbstractC2536a {
        /* renamed from: d */
        void mo31318d();

        /* renamed from: e */
        void mo31317e();
    }

    /* renamed from: a */
    private void m31326a(View view) {
        this.f8248j = (ImageView) view.findViewById(C1704R.C1706id.tagIcon);
        this.f8245g = (Button) view.findViewById(C1704R.C1706id.quit);
        this.f8245g.setOnClickListener(this);
        this.f8246h = (Button) view.findViewById(C1704R.C1706id.again);
        this.f8246h.setOnClickListener(this);
        this.f8247i = (Button) view.findViewById(C1704R.C1706id.sucesscomplete);
        this.f8247i.setOnClickListener(this);
        this.f8249k = (TextView) view.findViewById(C1704R.C1706id.destitle);
        this.f8250l = (TextView) view.findViewById(C1704R.C1706id.calireason);
        m31325a(this.f8245g, 128);
        m31325a(this.f8246h, AbstractC10866e.f34827F);
        C3103au.m29232a(getActivity().getAssets(), this.f8245g, this.f8246h, this.f8247i, this.f8249k, this.f8250l);
    }

    /* renamed from: b */
    private void m31322b() {
        this.f8245g.setVisibility(0);
        this.f8246h.setVisibility(0);
        this.f8247i.setVisibility(8);
    }

    /* renamed from: c */
    private void m31321c() {
        this.f8245g.setVisibility(8);
        this.f8246h.setVisibility(8);
        this.f8247i.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fimi.soul.module.calibcompass.CaliCompassErrorFragment$2] */
    /* renamed from: d */
    private void m31320d() {
        new AsyncTask<Void, Void, Void>() { // from class: com.fimi.soul.module.calibcompass.CaliCompassErrorFragment.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                CheckCampssBeann checkCampssBeann;
                List<LatLng> listLatlng;
                CheckCampssBeann checkCampssBeann2 = (CheckCampssBeann) C1645c.m34884a().mo34880a(C2279c.f7170Z, CheckCampssBeann.class);
                if (checkCampssBeann2 != null) {
                    checkCampssBeann = checkCampssBeann2;
                    listLatlng = checkCampssBeann2.getListLatlng();
                } else {
                    checkCampssBeann = new CheckCampssBeann();
                    listLatlng = checkCampssBeann.getListLatlng();
                }
                Location m33438c = MyLocationManager.m33443a(CaliCompassErrorFragment.this.getActivity()).m33438c();
                if (m33438c != null) {
                    listLatlng.add(new LatLng(m33438c.getLatitude(), m33438c.getLongitude()));
                    checkCampssBeann.setListLatlng(listLatlng);
                    C1645c.m34884a().mo34879a(C2279c.f7170Z, checkCampssBeann);
                    return null;
                }
                return null;
            }
        }.execute(new Void[0]);
    }

    /* renamed from: a */
    public void m31327a() {
        C2523d.m31374a(this.f8198b).m31384a((byte) 1, (byte) 1, (byte) 4);
        getActivity().finish();
    }

    /* renamed from: a */
    public void m31325a(Button button, int i) {
        button.setTextColor(button.getTextColors().withAlpha(i));
    }

    /* renamed from: a */
    public void m31324a(String str, boolean z, boolean z2) {
        this.f8252n = z;
        this.f8253o = z2;
        if (true != z) {
            this.f8249k.setText(C1704R.C1707string.califail);
            this.f8250l.setText(str);
            PercentRelativeLayout.LayoutParams layoutParams = (PercentRelativeLayout.LayoutParams) this.f8248j.getLayoutParams();
            layoutParams.setMargins(0, (int) (this.f8256r * 0.12592f), 0, 0);
            this.f8248j.setLayoutParams(layoutParams);
            this.f8248j.setImageResource(C1704R.C1705drawable.icon_calibration_defeat);
            m31322b();
            return;
        }
        this.f8249k.setText(C1704R.C1707string.calisucess);
        this.f8250l.setText(str);
        PercentRelativeLayout.LayoutParams layoutParams2 = (PercentRelativeLayout.LayoutParams) this.f8248j.getLayoutParams();
        layoutParams2.setMargins(0, (int) (this.f8256r * 0.1111f), 0, 0);
        this.f8248j.setLayoutParams(layoutParams2);
        this.f8248j.setImageResource(C1704R.C1705drawable.icon_calibration_succeed);
        m31321c();
        m31320d();
    }

    /* renamed from: a */
    public void m31323a(boolean z) {
        this.f8251m = z;
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8244f = (AbstractC2536a) activity;
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        switch (view.getId()) {
            case C1704R.C1706id.quit /* 2131755040 */:
                if (this.f8244f == null) {
                    return;
                }
                this.f8244f.mo31317e();
                return;
            case C1704R.C1706id.again /* 2131755511 */:
                ((CaliCompassActivity) getActivity()).m31334a(getString(C1704R.C1707string.compass_calibration));
                if (this.f8244f == null) {
                    return;
                }
                this.f8244f.mo31318d();
                return;
            case C1704R.C1706id.sucesscomplete /* 2131755512 */:
                this.f8254p.postDelayed(this.f8255q, 300L);
                return;
            case C1704R.C1706id.black_btn /* 2131756179 */:
                this.f8254p.postDelayed(this.f8255q, 300L);
                return;
            default:
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f8256r = displayMetrics.heightPixels;
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.cali_compass_error, (ViewGroup) null);
        m31326a(inflate);
        return inflate;
    }

    @Override // com.fimi.soul.module.calibcompass.BaseCaliCompassFragment, android.support.p001v4.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (this.f8244f != null) {
            this.f8244f = null;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z || !isVisible()) {
            return;
        }
        if (this.f8252n) {
            C1648b.m34863b(getActivity()).m34867a(getString(C1704R.C1707string.calisucess));
        } else if (this.f8253o) {
        } else {
            C1648b.m34863b(getActivity()).m34867a(getString(C1704R.C1707string.calibration_failure));
        }
    }
}
