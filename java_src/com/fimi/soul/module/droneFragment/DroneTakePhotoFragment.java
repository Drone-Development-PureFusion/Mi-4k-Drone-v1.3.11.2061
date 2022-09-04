package com.fimi.soul.module.droneFragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1681v;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.DroidPlannerApp;
import com.fimi.soul.biz.p182j.C1882h;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.drone.p205i.p206a.C2286a;
import com.fimi.soul.entity.DeviceType;
import com.fimi.soul.module.droneui.FlightActivity;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.view.DialogC3241e;
/* loaded from: classes.dex */
public class DroneTakePhotoFragment extends Fragment implements C2104d.AbstractC2106b {

    /* renamed from: a */
    C1681v f8369a;

    /* renamed from: b */
    private View$OnClickListenerC2656k f8370b;

    /* renamed from: c */
    private C2655j f8371c;

    /* renamed from: d */
    private C2083a f8372d;

    /* renamed from: e */
    private View f8373e;

    /* renamed from: f */
    private Dialog f8374f;

    /* renamed from: g */
    private int f8375g;

    /* renamed from: h */
    private double f8376h;

    /* renamed from: i */
    private FlightActivity.AbstractC2736a f8377i;

    /* renamed from: a */
    private void m31232a(String str) {
        if (this.f8374f != null && this.f8374f.isShowing()) {
            this.f8374f.dismiss();
            this.f8374f = null;
        }
        DialogC3241e.C3242a c3242a = new DialogC3241e.C3242a(getActivity());
        c3242a.m28655a(str);
        c3242a.m28653a(true);
        c3242a.m28654a(getString(C1704R.C1707string.finish), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneFragment.DroneTakePhotoFragment.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        this.f8374f = c3242a.m28659a();
        this.f8374f.setCanceledOnTouchOutside(false);
        this.f8374f.show();
    }

    /* renamed from: a */
    private boolean m31234a(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return ((float) (view.getBottom() - rect.bottom)) > view.getResources().getDisplayMetrics().density * 100.0f;
    }

    /* renamed from: c */
    private void m31230c() {
        boolean z = false;
        if (C1681v.m34543a(getActivity()).m34495v() == DeviceType.DEVICE_4K) {
            z = true;
        }
        if (!z || m31229d() < 2016) {
            short m32223c = this.f8372d.mo32910Z().m32223c();
            if (this.f8375g - m32223c < 0) {
                this.f8376h = ((m32223c - 255) * 90) / 255;
            } else {
                this.f8376h = ((m32223c * 90) / 255) - 90;
            }
            this.f8375g = m32223c;
        } else {
            this.f8376h = this.f8372d.mo32910Z().m32210j();
        }
        this.f8370b.m30849a((int) this.f8376h);
    }

    /* renamed from: d */
    private int m31229d() {
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        if (c3022b == null) {
            c3022b = new C3022b();
        }
        if (c3022b == null || c3022b.m29600c() <= 0) {
            return 0;
        }
        return c3022b.m29600c();
    }

    /* renamed from: a */
    public void m31233a(FlightActivity.AbstractC2736a abstractC2736a) {
        this.f8377i = abstractC2736a;
    }

    /* renamed from: a */
    public boolean m31235a() {
        if (this.f8374f == null || !this.f8374f.isShowing()) {
            return m31234a(this.f8373e);
        }
        return false;
    }

    /* renamed from: b */
    public void m31231b() {
        this.f8370b.m30816j();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8372d = ((DroidPlannerApp) activity.getApplication()).f4493a;
        this.f8369a = C1681v.m34543a(getActivity());
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.drone_takephone, (ViewGroup) null);
        this.f8373e = inflate;
        this.f8370b = new View$OnClickListenerC2656k(inflate, this.f8372d);
        this.f8371c = new C2655j(inflate);
        this.f8370b.m30839a(this.f8377i);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8372d.mo32903b(this);
    }

    @Override // com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case CAMERARECORD:
                if (C1882h.m33763a(getActivity().getApplicationContext()).m33765a().get() != 4) {
                    return;
                }
                this.f8370b.m30835b();
                return;
            case PTZ_GAIN:
                c2083a.mo32910Z().m32223c();
                if (!c2083a.mo32904af()) {
                    return;
                }
                m31230c();
                return;
            case WXCETAKEPHOTOAGAIN:
                this.f8370b.m30851a();
                return;
            case TAKEPHOTOBACKDATA:
                C2286a m33026aA = c2083a.m33026aA();
                if (m33026aA.m32423j() != 19) {
                    return;
                }
                this.f8370b.m30844a(m33026aA);
                return;
            case HEARDATA:
                if (!c2083a.m33007ao().m31755u()) {
                    return;
                }
                this.f8370b.m30822g();
                return;
            default:
                return;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (isAdded()) {
            if (z) {
                if (this.f8374f != null) {
                    this.f8374f.dismiss();
                }
                if (this.f8371c != null) {
                    this.f8371c.m30853a();
                }
                if (this.f8370b == null) {
                    return;
                }
                this.f8370b.m30824f();
                return;
            }
            if (!this.f8369a.m34546a().getBoolean(C2279c.f7230bF, false)) {
                m31232a(getString(C1704R.C1707string.fly_take_photo_tip));
            }
            this.f8370b.m30828d();
            this.f8370b.m30826e();
            this.f8370b.m30818i();
            this.f8371c.m30852b();
            this.f8372d.mo32909a(C2104d.EnumC2105a.CLEARMARKERTAKEPHOTO);
            this.f8372d.mo32909a(C2104d.EnumC2105a.CLEARDATA);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8372d.mo32908a(this);
    }
}
