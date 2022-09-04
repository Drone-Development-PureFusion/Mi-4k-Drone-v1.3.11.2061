package com.fimi.soul.module.droneui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.support.p001v4.app.FragmentManager;
import android.support.p001v4.view.GravityCompat;
import android.support.p001v4.widget.DrawerLayout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p165d.C1648b;
import com.fimi.kernel.utils.C1680u;
import com.fimi.kernel.utils.C1681v;
import com.fimi.kernel.utils.C1685x;
import com.fimi.kernel.utils.C1688z;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.camera.AbstractC1794c;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.manager.C1967h;
import com.fimi.soul.biz.manager.C1981o;
import com.fimi.soul.biz.manager.C2013x;
import com.fimi.soul.biz.p170b.C1772d;
import com.fimi.soul.biz.p171c.C1775a;
import com.fimi.soul.biz.p180h.C1862h;
import com.fimi.soul.biz.p181i.C1867a;
import com.fimi.soul.biz.p182j.C1877d;
import com.fimi.soul.biz.p182j.C1882h;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.droneconnection.connection.C2204b;
import com.fimi.soul.drone.p195d.p196a.p197a.C2155br;
import com.fimi.soul.drone.p195d.p196a.p197a.C2186r;
import com.fimi.soul.drone.p204h.C2279c;
import com.fimi.soul.drone.p205i.C2332bk;
import com.fimi.soul.drone.p205i.C2365x;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.media.player.FimiMediaPlayer;
import com.fimi.soul.module.droneFragment.AbstractC2631d;
import com.fimi.soul.module.droneFragment.CameraFullScreenShowLeadFragment;
import com.fimi.soul.module.droneFragment.DroneTakePhotoFragment;
import com.fimi.soul.module.droneFragment.FlyActionSettingFragment;
import com.fimi.soul.module.droneFragment.ShowDroneControlFragment;
import com.fimi.soul.module.droneFragment.ShowDroneStatusFragment;
import com.fimi.soul.module.droneFragment.ShowDroneStatusLineFragment;
import com.fimi.soul.module.droneFragment.ShowDroneUiFragment;
import com.fimi.soul.module.dronemanage.FlightMapFragment;
import com.fimi.soul.module.insurance.ReceiveInsuranceActivity;
import com.fimi.soul.module.login.FirstLeadFragment;
import com.fimi.soul.module.push.MessageDetailActivity;
import com.fimi.soul.module.setting.C2912d;
import com.fimi.soul.module.setting.MapSettingFragment;
import com.fimi.soul.module.social.WebViewActivity;
import com.fimi.soul.module.update.C3029b;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3022b;
import com.fimi.soul.module.update.p218a.C3027g;
import com.fimi.soul.service.CheckCampassCaliService;
import com.fimi.soul.service.RequestVersionService;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.C3125i;
import com.fimi.soul.utils.C3129m;
import com.fimi.soul.utils.p219a.C3070c;
import com.fimi.soul.view.DialogC3245f;
import com.fimi.soul.view.MapWrapperLayout;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.android.gms.fitness.data.C5138a;
import com.google.android.gms.maps.C8500c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public class FlightActivity extends BaseActivity implements C2104d.AbstractC2106b, ShowDroneUiFragment.AbstractC2612d, AbstractC2631d, FlightMapFragment.AbstractC2694a, FirstLeadFragment.AbstractC2787a, MapSettingFragment.AbstractC2889a {

    /* renamed from: C */
    private static final int f9391C = 123;

    /* renamed from: O */
    private static final int f9392O = 15;

    /* renamed from: c */
    public static final int f9393c = 1000;

    /* renamed from: d */
    public static final int f9394d = 1001;

    /* renamed from: t */
    private static final int f9395t = 1;

    /* renamed from: A */
    private FlyActionSettingFragment f9396A;

    /* renamed from: B */
    private TextView f9397B;

    /* renamed from: E */
    private C1681v f9399E;

    /* renamed from: F */
    private C2204b f9400F;

    /* renamed from: G */
    private C3027g f9401G;

    /* renamed from: K */
    private boolean f9405K;

    /* renamed from: M */
    private boolean f9407M;

    /* renamed from: N */
    private Toast f9408N;

    /* renamed from: a */
    View f9410a;

    /* renamed from: f */
    C2737b f9413f;

    /* renamed from: g */
    private FragmentManager f9414g;

    /* renamed from: h */
    private FlightMapFragment f9415h;

    /* renamed from: i */
    private FirstLeadFragment f9416i;

    /* renamed from: j */
    private CameraFullScreenShowLeadFragment f9417j;

    /* renamed from: k */
    private ShowDroneUiFragment f9418k;

    /* renamed from: l */
    private ShowDroneStatusFragment f9419l;

    /* renamed from: m */
    private ShowDroneStatusLineFragment f9420m;

    /* renamed from: n */
    private DroneTakePhotoFragment f9421n;

    /* renamed from: o */
    private ShowDroneControlFragment f9422o;

    /* renamed from: p */
    private MapSettingFragment f9423p;

    /* renamed from: r */
    private FrameLayout f9425r;

    /* renamed from: s */
    private FrameLayout f9426s;

    /* renamed from: v */
    private ProgressBar f9428v;

    /* renamed from: w */
    private boolean f9429w;

    /* renamed from: x */
    private byte f9430x;

    /* renamed from: y */
    private RelativeLayout f9431y;

    /* renamed from: z */
    private DrawerLayout f9432z;

    /* renamed from: b */
    public EnumC2739c f9411b = EnumC2739c.EarthMap;

    /* renamed from: q */
    private boolean f9424q = false;

    /* renamed from: u */
    private boolean f9427u = true;

    /* renamed from: D */
    private int f9398D = 5;

    /* renamed from: H */
    private int f9402H = -1;

    /* renamed from: I */
    private boolean f9403I = false;

    /* renamed from: J */
    private boolean f9404J = false;

    /* renamed from: L */
    private Handler f9406L = new Handler() { // from class: com.fimi.soul.module.droneui.FlightActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && FlightActivity.this.f9427u) {
                if (C1882h.m33763a(FlightActivity.this.getApplicationContext()).m33765a().get() != 4) {
                    C1688z.m34449a(FlightActivity.this, (int) C1704R.C1707string.updataerror, 3000);
                } else if (((C1827d) C1783b.m34166a().m34150d()).g() != AbstractC1794c.EnumC1804a.Recoding) {
                    C1688z.m34449a(FlightActivity.this, (int) C1704R.C1707string.open_record_error, 3000);
                } else {
                    C1688z.m34449a(FlightActivity.this, (int) C1704R.C1707string.updateLoadtakepDrhotoerror, 3000);
                }
                FlightActivity.this.f9414g.beginTransaction().hide(FlightActivity.this.f9421n).commitAllowingStateLoss();
                FlightActivity.this.m30506a(0);
                FlightActivity.this.f9428v.setVisibility(8);
            } else if (message.what != 123) {
                if (message.what != 15 || !FlightActivity.this.drone.mo32904af() || !FlightActivity.this.drone.mo32905ac()) {
                    return;
                }
                FlightActivity.this.f9418k.m31094a(true);
            } else if (FlightActivity.this.f9398D <= 0) {
                FlightActivity.this.f9397B.setVisibility(8);
                FlightActivity.this.drone.mo32909a(C2104d.EnumC2105a.CHANGETAKEPHOTOMARKERCOLOR);
            } else {
                sendEmptyMessageDelayed(123, 1000L);
                FlightActivity.this.f9397B.setText(FlightActivity.this.f9398D + "");
                FlightActivity.this.f9397B.setVisibility(0);
                FlightActivity.m30486g(FlightActivity.this);
            }
        }
    };

    /* renamed from: e */
    Timer f9412e = null;

    /* renamed from: P */
    private AbstractC2736a f9409P = new AbstractC2736a() { // from class: com.fimi.soul.module.droneui.FlightActivity.7
        @Override // com.fimi.soul.module.droneui.FlightActivity.AbstractC2736a
        /* renamed from: a */
        public void mo30468a() {
            FlightActivity.this.f9418k.m31045n();
            FlightActivity.this.m30506a(4);
        }

        @Override // com.fimi.soul.module.droneui.FlightActivity.AbstractC2736a
        /* renamed from: b */
        public void mo30467b() {
            FlightActivity.this.m30506a(0);
        }

        @Override // com.fimi.soul.module.droneui.FlightActivity.AbstractC2736a
        /* renamed from: c */
        public void mo30466c() {
            FlightActivity.this.m30506a(0);
        }

        @Override // com.fimi.soul.module.droneui.FlightActivity.AbstractC2736a
        /* renamed from: d */
        public void mo30465d() {
            FlightActivity.this.m30506a(4);
        }

        @Override // com.fimi.soul.module.droneui.FlightActivity.AbstractC2736a
        /* renamed from: e */
        public void mo30464e() {
            FlightActivity.this.f9418k.m31045n();
        }

        @Override // com.fimi.soul.module.droneui.FlightActivity.AbstractC2736a
        /* renamed from: f */
        public void mo30463f() {
            FlightActivity.this.f9418k.m31043o();
        }

        @Override // com.fimi.soul.module.droneui.FlightActivity.AbstractC2736a
        /* renamed from: g */
        public void mo30462g() {
            FlightActivity.this.m30506a(0);
        }

        @Override // com.fimi.soul.module.droneui.FlightActivity.AbstractC2736a
        /* renamed from: h */
        public void mo30461h() {
            if (FlightActivity.this.f9404J) {
                FlightActivity.this.m30506a(0);
            }
        }

        @Override // com.fimi.soul.module.droneui.FlightActivity.AbstractC2736a
        /* renamed from: i */
        public void mo30460i() {
            if (FlightActivity.this.f9418k.m31039q()) {
                return;
            }
            FlightActivity.this.m30506a(4);
            FlightActivity.this.f9429w = true;
        }

        @Override // com.fimi.soul.module.droneui.FlightActivity.AbstractC2736a
        /* renamed from: j */
        public void mo30459j() {
            FlightActivity.this.f9418k.m31029z();
        }

        @Override // com.fimi.soul.module.droneui.FlightActivity.AbstractC2736a
        /* renamed from: k */
        public void mo30458k() {
            FlightActivity.this.f9418k.m31032w();
        }
    };

    /* renamed from: com.fimi.soul.module.droneui.FlightActivity$4 */
    /* loaded from: classes.dex */
    class DialogInterface$OnClickListenerC27294 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1681v f9436a;

        /* renamed from: b */
        final /* synthetic */ int f9437b;

        DialogInterface$OnClickListenerC27294(C1681v c1681v, int i) {
            this.f9436a = c1681v;
            this.f9437b = i;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f9436a.m34541a("insurance_ret", this.f9437b - 1);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.fimi.soul.module.droneui.FlightActivity$5 */
    /* loaded from: classes.dex */
    class DialogInterface$OnClickListenerC27305 implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1681v f9439a;

        /* renamed from: b */
        final /* synthetic */ int f9440b;

        DialogInterface$OnClickListenerC27305(C1681v c1681v, int i) {
            this.f9439a = c1681v;
            this.f9440b = i;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (C3103au.m29221b(FlightActivity.this)) {
                this.f9439a.m34541a("insurance_ret", this.f9440b + 1);
                Intent intent = new Intent(FlightActivity.this, WebViewActivity.class);
                intent.putExtra("url", ReceiveInsuranceActivity.f9698a);
                intent.putExtra("title", FlightActivity.this.getString(C1704R.C1707string.xiaomi_insurance));
                FlightActivity.this.startActivity(intent);
            } else {
                C1688z.m34449a(FlightActivity.this, (int) C1704R.C1707string.login_result_net, 1000);
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.fimi.soul.module.droneui.FlightActivity$a */
    /* loaded from: classes.dex */
    public interface AbstractC2736a {
        /* renamed from: a */
        void mo30468a();

        /* renamed from: b */
        void mo30467b();

        /* renamed from: c */
        void mo30466c();

        /* renamed from: d */
        void mo30465d();

        /* renamed from: e */
        void mo30464e();

        /* renamed from: f */
        void mo30463f();

        /* renamed from: g */
        void mo30462g();

        /* renamed from: h */
        void mo30461h();

        /* renamed from: i */
        void mo30460i();

        /* renamed from: j */
        void mo30459j();

        /* renamed from: k */
        void mo30458k();
    }

    /* renamed from: com.fimi.soul.module.droneui.FlightActivity$b */
    /* loaded from: classes.dex */
    class C2737b extends BroadcastReceiver {
        C2737b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("rtsp", -1);
            if (intExtra == 0 && FlightActivity.this.f9412e != null) {
                FlightActivity.this.f9412e.cancel();
                FlightActivity.this.f9412e = null;
            } else if (intExtra != 1) {
            } else {
                if (FlightActivity.this.f9412e == null) {
                    FlightActivity.this.f9412e = new Timer();
                }
                FlightActivity.this.f9412e.schedule(new TimerTask() { // from class: com.fimi.soul.module.droneui.FlightActivity.b.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        FlightActivity.this.f9406L.sendEmptyMessageDelayed(15, 3000L);
                    }
                }, 1000L, 5000L);
            }
        }
    }

    /* renamed from: com.fimi.soul.module.droneui.FlightActivity$c */
    /* loaded from: classes.dex */
    public enum EnumC2739c {
        EarthMap,
        Camera
    }

    /* renamed from: a */
    private synchronized void m30499a(boolean z) {
        if (z) {
            if (!C1681v.m34543a(this).m34494w()) {
                C1681v.m34543a(this).m34510i(true);
                if (this.f9417j == null) {
                    this.f9417j = new CameraFullScreenShowLeadFragment();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("isOpen", true);
                this.f9417j.setArguments(bundle);
                this.f9414g.beginTransaction().add(C1704R.C1706id.camera_full_screen_layout, this.f9417j).commit();
            }
        } else if (!C1681v.m34543a(this).m34493x()) {
            C1681v.m34543a(this).m34507j(true);
            if (this.f9417j == null) {
                this.f9417j = new CameraFullScreenShowLeadFragment();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("isOpen", false);
            this.f9417j.setArguments(bundle2);
            this.f9414g.beginTransaction().add(C1704R.C1706id.camera_full_screen_layout, this.f9417j).commit();
        }
    }

    /* renamed from: c */
    private void m30495c(int i) {
        if (!this.f9428v.isShown()) {
            this.f9428v.setVisibility(0);
            if (this.f9406L.hasMessages(1)) {
                this.f9406L.removeMessages(1);
            }
            this.f9427u = true;
            if (C1877d.m33782p().m33788j().size() < 1) {
                this.f9406L.sendEmptyMessageDelayed(1, i);
            } else {
                this.f9406L.sendEmptyMessageDelayed(1, C1877d.m33782p().m33788j().size() * 2000);
            }
        }
    }

    /* renamed from: g */
    static /* synthetic */ int m30486g(FlightActivity flightActivity) {
        int i = flightActivity.f9398D;
        flightActivity.f9398D = i - 1;
        return i;
    }

    /* renamed from: p */
    private void m30475p() {
        boolean m34187k = C1772d.m34208a().m34187k();
        C3022b c3022b = (C3022b) C1642c.m34887c().mo34880a(C3029b.f11258C, C3022b.class);
        int m29604a = c3022b != null ? c3022b.m29604a() : 0;
        if (m34187k || m29604a >= C2912d.f10400g) {
            C2912d.m29999a(this.drone).m30001a();
        }
    }

    /* renamed from: q */
    private void m30474q() {
        C1685x.m34455b(new Runnable() { // from class: com.fimi.soul.module.droneui.FlightActivity.2
            @Override // java.lang.Runnable
            public void run() {
                File file = new File(C3103au.m29187o(FlightActivity.this.getApplicationContext()));
                if (!file.exists()) {
                    try {
                        file.createNewFile();
                        String str = C3129m.m29045v() + C3029b.f11277V;
                        InputStream fileInputStream = FlightActivity.this.m30501a(str) ? new FileInputStream(str) : FlightActivity.this.getAssets().open("NoFlyZone-V1.0.0-DB.sqlite");
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                fileInputStream.close();
                                return;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: r */
    private void m30473r() {
    }

    /* renamed from: s */
    private void m30472s() {
        if (!this.f9431y.isShown()) {
            this.f9431y.setVisibility(0);
            this.f9414g.beginTransaction().hide(this.f9396A).commitAllowingStateLoss();
            if (this.f9421n.isVisible()) {
                this.f9414g.beginTransaction().hide(this.f9421n).commitAllowingStateLoss();
            }
            this.drone.mo32909a(C2104d.EnumC2105a.HIDEDISPLAYCIRCLE);
        }
    }

    /* renamed from: t */
    private void m30471t() {
        if (this.f9407M) {
            this.f9408N.cancel();
            finish();
            Process.killProcess(Process.myPid());
            this.f9418k.m31053j();
            return;
        }
        this.f9407M = true;
        this.f9408N = Toast.makeText(getApplicationContext(), (int) C1704R.C1707string.again_exit, 0);
        this.f9408N.show();
        getHandler().sendEmptyMessageDelayed(0, 2000L);
    }

    /* renamed from: u */
    private void m30470u() {
        C1967h.m33384a(this).m33383a(new AbstractC1945k() { // from class: com.fimi.soul.module.droneui.FlightActivity.6
            @Override // com.fimi.soul.biz.p185m.AbstractC1945k
            /* renamed from: a */
            public void mo28106a(PlaneMsg planeMsg, File file) {
                if (planeMsg.isSuccess()) {
                    final HistoryPushMessage historyPushMessage = (HistoryPushMessage) planeMsg.getData();
                    historyPushMessage.setTime(new SimpleDateFormat("yyyy.MM.dd").format(new Date()));
                    C3070c m29392a = C3070c.m29392a(FlightActivity.this);
                    if (m29392a.m29390b(historyPushMessage)) {
                        return;
                    }
                    m29392a.m29391a(historyPushMessage);
                    new DialogC3245f.C3246a(FlightActivity.this).m28641a(historyPushMessage.getTitle()).m28635b(historyPushMessage.getPayload()).m28644a(FlightActivity.this.getResources().getColor(C1704R.color.dialog_right_btn)).m28634b(FlightActivity.this.getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneui.FlightActivity.6.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(FlightActivity.this, MessageDetailActivity.class);
                            intent.setFlags(AbstractC4808e.f17570a_);
                            intent.putExtra("redirectURL", historyPushMessage.getRedirectURL());
                            FlightActivity.this.startActivity(intent);
                        }
                    }).m28630d(17).m28640a(FlightActivity.this.getString(C1704R.C1707string.dialog_close), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneui.FlightActivity.6.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).m28645a().show();
                }
            }
        });
    }

    /* renamed from: v */
    private boolean m30469v() {
        if (this.f9429w) {
            if ((this.drone.m33001au().m32392e() != 7 && this.drone.m33001au().m32392e() != 8 && this.drone.m33001au().m32392e() != 3 && this.drone.m33001au().m32392e() != 9) || this.f9430x == 7 || this.f9430x == 8 || this.f9430x == 3 || this.f9430x == 9) {
                this.f9405K = false;
            } else {
                this.f9405K = true;
            }
            if (this.drone.m33001au().m32393d() == 1 || this.drone.m33001au().m32393d() == 2 || this.drone.m33001au().m32393d() == 0) {
                if (this.f9402H < 0 || this.f9402H == this.drone.m33001au().m32393d()) {
                    this.f9402H = this.drone.m33001au().m32393d();
                } else {
                    this.f9403I = true;
                }
            }
        } else {
            this.f9430x = this.drone.m33001au().m32392e();
            if (this.drone.m33001au().m32393d() == 1 || this.drone.m33001au().m32393d() == 2 || this.drone.m33001au().m32393d() == 0) {
                this.f9402H = this.drone.m33001au().m32393d();
            } else {
                this.f9402H = -1;
            }
            this.f9403I = false;
            this.f9405K = false;
        }
        C2365x m33007ao = this.drone.m33007ao();
        if (m33007ao.m31810S() || this.drone.m33001au().m32394c() == 3 || this.drone.m33001au().m32397a() == 5) {
            return true;
        }
        if ((this.drone.m32979j() != null && (this.drone.m32979j().m32411b() == 1 || this.drone.m32979j().m32411b() == 3)) || m33007ao.m31763m()) {
            return true;
        }
        if ((m33007ao.m31770f() && !this.drone.m33001au().m32390g().isLightStream()) || m33007ao.m31823F() || m33007ao.m31824E() || m33007ao.m31821H() || m33007ao.m31792ah()) {
            return true;
        }
        return (this.drone.m33001au().m32390g().isLightStream() && m33007ao.m31760p()) || m33007ao.m31811R() || m33007ao.m31812Q() || m33007ao.m31806W() || this.f9405K || this.f9403I;
    }

    @Override // com.fimi.soul.module.droneFragment.ShowDroneUiFragment.AbstractC2612d
    /* renamed from: a */
    public void mo30507a() {
        if (this.f9423p != null) {
            this.f9423p.m30081j();
            this.f9423p.m30079k();
            this.f9414g.beginTransaction().show(this.f9423p).commit();
        }
    }

    /* renamed from: a */
    public void m30506a(int i) {
        this.f9418k.m31092b(i);
        this.f9425r.setVisibility(i);
        this.f9426s.setVisibility(i);
    }

    /* renamed from: a */
    public void m30505a(EnumC2739c enumC2739c) {
        this.f9411b = enumC2739c;
    }

    @Override // com.fimi.soul.module.droneFragment.AbstractC2631d
    /* renamed from: a */
    public void mo30502a(C8500c c8500c) {
        MapWrapperLayout mapWrapperLayout = (MapWrapperLayout) findViewById(C1704R.C1706id.map_relative_layout);
        mapWrapperLayout.m28882a(c8500c, C3125i.m29082a(this, 28.0f));
        this.drone.m33030a(mapWrapperLayout);
    }

    @Override // com.fimi.soul.module.dronemanage.FlightMapFragment.AbstractC2694a
    /* renamed from: a */
    public void mo30500a(List<C2332bk> list) {
    }

    /* renamed from: a */
    public boolean m30501a(String str) {
        String m34496u = C1681v.m34543a(getBaseContext()).m34496u();
        File file = new File(str);
        return file.exists() && C1680u.m34548a(file).equals(m34496u);
    }

    /* renamed from: b */
    public EnumC2739c m30498b() {
        return this.f9411b;
    }

    /* renamed from: b */
    public void m30497b(int i) {
        this.f9418k.m31085c(i);
    }

    @Override // com.fimi.soul.module.setting.MapSettingFragment.AbstractC2889a
    /* renamed from: c */
    public void mo30068c() {
        if (this.f9423p != null) {
            this.f9414g.beginTransaction().hide(this.f9423p).commit();
            if (this.f9418k != null) {
                this.f9418k.onStart();
            }
        }
        if (this.f9415h != null) {
            this.f9415h.m30601c();
        }
        C1862h.m33870b().clear();
    }

    /* renamed from: d */
    public void m30493d() {
        this.f9414g.beginTransaction().hide(this.f9415h).commitAllowingStateLoss();
        this.f9414g.executePendingTransactions();
    }

    /* renamed from: e */
    public void m30491e() {
        this.f9414g.beginTransaction().show(this.f9415h).commitAllowingStateLoss();
    }

    /* renamed from: f */
    public boolean m30489f() {
        return this.f9423p.m30087g();
    }

    /* renamed from: g */
    public void m30487g() {
        if (this.f9401G != null) {
            this.f9401G.m29533b();
        }
    }

    /* renamed from: h */
    public void m30485h() {
        this.f9410a.setVisibility(4);
    }

    /* renamed from: i */
    public void m30483i() {
        this.f9410a.setVisibility(0);
    }

    /* renamed from: j */
    public void m30481j() {
        if (C1642c.m34885e().m34530d()) {
            findViewById(C1704R.C1706id.bottom_state_rl).setVisibility(0);
        } else {
            findViewById(C1704R.C1706id.bottom_state_rl).setVisibility(4);
        }
    }

    /* renamed from: k */
    public void m30479k() {
        if (!C1642c.m34885e().m34526e() || this.f9418k.m31122D()) {
            findViewById(C1704R.C1706id.bottom_state_rl2).setVisibility(4);
        } else {
            findViewById(C1704R.C1706id.bottom_state_rl2).setVisibility(0);
        }
    }

    /* renamed from: l */
    public void m30478l() {
        try {
            int m34498s = C1642c.m34885e().m34498s();
            if (m34498s >= 3) {
                return;
            }
            C1642c.m34885e().m34525e(m34498s + 1);
            DialogC3245f.C3262e c3262e = new DialogC3245f.C3262e(this);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(C1704R.C1707string.dialog_emergency_stop_puple_content));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(C1704R.color.setting_dialog_force_attitude)), 13, 29, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(C1704R.color.setting_dialog_force_attitude)), 34, 49, 33);
            c3262e.m28570a(getString(C1704R.C1707string.dialog_emergency_stop_puple)).m28567b(getResources().getColor(C1704R.color.emergencystoppulp)).m28566b(spannableStringBuilder).m28568a(false).m28564b(true).m28574a(C1704R.C1705drawable.img_rc_btn).m28569a(getString(C1704R.C1707string.ensure), new DialogInterface.OnClickListener() { // from class: com.fimi.soul.module.droneui.FlightActivity.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).m28575a().show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: m */
    public void m30477m() {
    }

    @Override // com.fimi.soul.module.login.FirstLeadFragment.AbstractC2787a
    /* renamed from: n */
    public void mo30291n() {
        this.f9414g.beginTransaction().remove(this.f9416i).commit();
    }

    /* renamed from: o */
    public void m30476o() {
        if (!this.drone.mo32905ac() || this.f9424q) {
            return;
        }
        this.f9424q = true;
        new C2013x(this).m33260a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && i2 == 1001) {
            this.f9418k.m31041p();
        } else if (!this.f9399E.m34546a().getBoolean(C1756a.f4519L, false)) {
        } else {
            this.f9399E.m34546a().edit().putBoolean(C1756a.f4519L, true).commit();
            if (this.f9399E.m34546a().getBoolean(C1756a.f4517J, false) && this.f9423p != null && !this.f9423p.isHidden()) {
                this.f9414g.beginTransaction().hide(this.f9423p).commit();
            }
            this.f9399E.m34546a().edit().putBoolean(C1756a.f4517J, false).commit();
        }
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(256);
        getWindow().addFlags(512);
        this.f9401G = new C3027g(this.drone);
        getWindow().setFlags(128, 128);
        this.dpa.m34274d();
        this.dpa.m34276b(this);
        FimiMediaPlayer.loadLibrariesOnce(null);
        FimiMediaPlayer.native_profileBegin("libfmplayer.so");
        this.f9410a = findViewById(C1704R.C1706id.showStatus);
        setContentView(C1704R.layout.activity_main);
        this.f9399E = C1681v.m34543a(this);
        this.f9397B = (TextView) findViewById(C1704R.C1706id.reciprocal_value);
        this.f9416i = new FirstLeadFragment();
        this.f9416i.m30292a(this);
        this.f9428v = (ProgressBar) findViewById(C1704R.C1706id.progrebar);
        this.f9431y = (RelativeLayout) findViewById(C1704R.C1706id.normal_rla);
        this.f9432z = (DrawerLayout) findViewById(C1704R.C1706id.drawerview);
        this.f9432z.setDrawerLockMode(1);
        this.f9432z.setFocusableInTouchMode(false);
        C2022a.m33223a().m33222a(!C1681v.m34543a(this).m34546a().getBoolean(C2279c.f7238bN, false));
        m30474q();
        if (C1981o.m33342a(this).m33340b()) {
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            audioManager.setStreamVolume(3, audioManager.getStreamMaxVolume(3), 0);
        }
        m30475p();
        this.f9414g = getSupportFragmentManager();
        this.f9421n = (DroneTakePhotoFragment) this.f9414g.findFragmentById(C1704R.C1706id.takephoto);
        if (this.f9421n == null) {
            this.f9421n = new DroneTakePhotoFragment();
            this.f9414g.beginTransaction().add(C1704R.C1706id.takephoto, this.f9421n, "takephoto").hide(this.f9421n).commitAllowingStateLoss();
        } else {
            this.f9414g.beginTransaction().hide(this.f9421n).commit();
        }
        this.f9396A = (FlyActionSettingFragment) this.f9414g.findFragmentById(C1704R.C1706id.flyaction);
        if (this.f9396A == null) {
            this.f9396A = new FlyActionSettingFragment();
            this.f9414g.beginTransaction().add(C1704R.C1706id.flyaction, this.f9396A, C5138a.f18729h).hide(this.f9396A).commit();
        } else {
            this.f9414g.beginTransaction().hide(this.f9396A).commit();
        }
        this.f9415h = (FlightMapFragment) this.f9414g.findFragmentById(C1704R.C1706id.mapFragment);
        if (this.f9415h == null) {
            this.f9415h = new FlightMapFragment();
            this.f9414g.beginTransaction().add(C1704R.C1706id.mapFragment, this.f9415h).commit();
        }
        this.f9420m = (ShowDroneStatusLineFragment) this.f9414g.findFragmentById(C1704R.C1706id.showBasedata);
        if (this.f9420m == null) {
            this.f9420m = new ShowDroneStatusLineFragment();
            this.f9414g.beginTransaction().add(C1704R.C1706id.showBasedata, this.f9420m).commit();
        }
        this.f9419l = (ShowDroneStatusFragment) this.f9414g.findFragmentById(C1704R.C1706id.showStatus);
        if (this.f9419l == null) {
            this.f9419l = new ShowDroneStatusFragment();
            this.f9414g.beginTransaction().add(C1704R.C1706id.showStatus, this.f9419l).commit();
        }
        this.f9418k = (ShowDroneUiFragment) this.f9414g.findFragmentById(C1704R.C1706id.handleWapoint);
        if (this.f9418k == null) {
            this.f9418k = new ShowDroneUiFragment();
            this.f9418k.m31101a(this.f9420m, this.f9419l);
            this.f9414g.beginTransaction().add(C1704R.C1706id.handleWapoint, this.f9418k).commit();
        }
        this.f9423p = (MapSettingFragment) this.f9414g.findFragmentById(C1704R.C1706id.activity_general_setting);
        if (this.f9423p == null) {
            this.f9423p = new MapSettingFragment();
            this.f9414g.beginTransaction().add(C1704R.C1706id.activity_general_setting, this.f9423p).hide(this.f9423p).commit();
        }
        startService(new Intent(this, CheckCampassCaliService.class));
        if (this.f9399E.m34546a().getInt("curModel", 1) == 1) {
            this.f9414g.beginTransaction().add(C1704R.C1706id.lead_layout, this.f9416i).commit();
        }
        new C1775a(this).m34180a();
        if (C3021a.m29616a().m29615a(0).m29566b() <= 0) {
            startService(new Intent(this, RequestVersionService.class));
        }
        m30470u();
        this.f9422o = (ShowDroneControlFragment) this.f9414g.findFragmentById(C1704R.C1706id.controlfragment);
        this.f9425r = (FrameLayout) findViewById(C1704R.C1706id.showBasedata);
        this.f9426s = (FrameLayout) findViewById(C1704R.C1706id.showStatus);
        this.f9422o.m31204a(this.f9409P);
        this.f9396A.m31225a(this.f9409P);
        this.f9421n.m31233a(this.f9409P);
        this.f9420m.m31152a(this.f9409P);
        this.f9419l.m31185a(this.f9409P);
        this.f9400F = new C2204b();
        this.f9400F.m32702d();
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f9400F.m32700d(true);
        if (this.f9418k != null) {
            this.f9418k.m31094a(false);
            this.f9418k.m31033v();
        }
        this.f9401G.m29530e();
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.drone.C2104d.AbstractC2106b
    public void onDroneEvent(C2104d.EnumC2105a enumC2105a, C2083a c2083a) {
        switch (enumC2105a) {
            case QUITTAKEPHOTOFLY:
                if (this.f9406L.hasMessages(123)) {
                    this.f9406L.removeMessages(123);
                }
                if (this.f9406L.hasMessages(1)) {
                    this.f9406L.removeMessages(1);
                }
                this.f9397B.setVisibility(8);
                this.f9428v.setVisibility(8);
                this.f9427u = false;
                return;
            case ENTRYTAKEPHOTOMODEL:
                if (c2083a.m33026aA().m32423j() == 18) {
                    if (!this.f9406L.hasMessages(123)) {
                        this.f9398D = 5;
                    }
                    this.f9406L.sendEmptyMessage(123);
                }
                if (this.f9406L.hasMessages(1)) {
                    this.f9406L.removeMessages(1);
                }
                this.f9428v.setVisibility(8);
                this.f9427u = false;
                return;
            case TAKEPHOTOBACKDATA:
                if (!this.f9431y.isShown()) {
                    this.f9431y.setVisibility(0);
                }
                if (!this.f9421n.isVisible()) {
                    return;
                }
                this.f9414g.beginTransaction().hide(this.f9421n).commitAllowingStateLoss();
                m30506a(0);
                return;
            case CLOSEOUTTIMEPROBAR:
                if (this.f9406L.hasMessages(1)) {
                    this.f9406L.removeMessages(1);
                }
                this.f9428v.setVisibility(8);
                this.f9427u = false;
                return;
            case SHOWOUTTIMEPROBAR:
                m30495c(5000);
                return;
            case Remotecontrol:
                if (!this.f9429w || c2083a.mo32904af()) {
                    return;
                }
                c2083a.mo32909a(C2104d.EnumC2105a.HIDE_FULL_SCREEN);
                return;
            case HEARDATA:
                if (!c2083a.m33001au().m32390g().isExceAction()) {
                    this.f9404J = true;
                    return;
                }
                this.f9414g.beginTransaction().hide(this.f9396A).commitAllowingStateLoss();
                c2083a.mo32909a(C2104d.EnumC2105a.HIDEDISPLAYCIRCLE);
                this.f9409P.mo30461h();
                this.f9404J = false;
                return;
            case CANCALFLYACTION:
                this.f9431y.setVisibility(0);
                this.f9414g.beginTransaction().hide(this.f9396A).commitAllowingStateLoss();
                this.f9414g.beginTransaction().hide(this.f9421n).commitAllowingStateLoss();
                this.f9396A.setUserVisibleHint(true);
                c2083a.mo32909a(C2104d.EnumC2105a.HIDEDISPLAYCIRCLE);
                return;
            case SHOWCAMPASSCALI:
                if (!c2083a.mo32905ac() || !c2083a.m33009am()) {
                }
                return;
            case CLOSEDRAWCONTROLClose:
                this.f9432z.closeDrawer(GravityCompat.END);
                return;
            case CLOSEDRAWCONTROL:
                C1882h m33763a = C1882h.m33763a(getApplicationContext());
                if (!c2083a.m33009am() || m33763a.m33765a().get() == 0) {
                    this.f9431y.setVisibility(0);
                    this.f9414g.beginTransaction().hide(this.f9396A).commitAllowingStateLoss();
                    this.f9414g.beginTransaction().hide(this.f9421n).commitAllowingStateLoss();
                } else if (c2083a.m33001au().m32390g().judgeNoAction()) {
                    if (m33763a.m33765a().get() == 4) {
                        this.f9414g.beginTransaction().show(this.f9421n).commitAllowingStateLoss();
                    } else {
                        this.f9414g.beginTransaction().show(this.f9396A).commitAllowingStateLoss();
                    }
                }
                this.f9432z.closeDrawer(GravityCompat.END);
                return;
            case OPENDRAWCONTROL:
                this.f9432z.openDrawer(GravityCompat.END);
                return;
            case ChangeCameraOrMap:
                if (this.f9411b == EnumC2739c.Camera) {
                    m30491e();
                    return;
                } else {
                    m30493d();
                    return;
                }
            case CLOSEFLYACTIONFRAGMENT:
                if (!this.f9431y.isShown()) {
                    this.f9431y.setVisibility(0);
                }
                if (this.f9396A.isVisible()) {
                    this.f9414g.beginTransaction().hide(this.f9396A).commitAllowingStateLoss();
                    m30506a(0);
                }
                if (!this.f9421n.isVisible()) {
                    return;
                }
                this.f9414g.beginTransaction().hide(this.f9421n).commitAllowingStateLoss();
                m30506a(0);
                return;
            case XIAOMI_INSURENCE:
            default:
                return;
            case DRONEINFLOOR:
                m30472s();
                return;
            case SHOWTAKEPHOTOFRAGMENT:
                m30472s();
                return;
            case CLEANALLOBJ:
                m30472s();
                this.f9424q = false;
                return;
            case SHOW_FULL_SCREEN:
                if ((C1882h.m33763a(getApplicationContext()).m33765a().get() != 0 && !c2083a.m33001au().m32390g().isExceAction()) || this.f9418k.m31039q() || m30469v()) {
                    return;
                }
                m30506a(4);
                m30497b(0);
                this.f9429w = true;
                m30499a(false);
                return;
            case HIDE_FULL_SCREEN:
                if (!this.f9429w) {
                    return;
                }
                this.f9429w = false;
                m30506a(0);
                m30497b(4);
                return;
            case SHOW_FULL_SCREEN_LEAD:
                if (C1882h.m33763a(getApplicationContext()).m33765a().get() != 0 && !c2083a.m33001au().m32390g().isExceAction()) {
                    return;
                }
                m30499a(true);
                return;
            case CLOSE_FULL_SCREEN_LEAD:
                if (this.f9417j == null) {
                    return;
                }
                this.f9414g.beginTransaction().remove(this.f9417j).commit();
                return;
            case ERROR_CODE:
                if (!this.f9429w || !m30469v()) {
                    return;
                }
                c2083a.mo32909a(C2104d.EnumC2105a.HIDE_FULL_SCREEN);
                return;
        }
    }

    @Override // com.fimi.kernel.BaseActivity
    public void onHandleMessage(Message message) {
        super.onHandleMessage(message);
        this.f9407M = false;
    }

    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f9429w) {
                this.f9429w = false;
                m30506a(0);
                m30497b(4);
                return true;
            } else if (this.f9432z.isDrawerOpen(GravityCompat.END)) {
                this.f9432z.closeDrawer(GravityCompat.END);
                return true;
            } else if (this.f9396A != null && this.f9396A.m31223b()) {
                return true;
            } else {
                if (this.f9421n != null && this.f9421n.m31235a()) {
                    return true;
                }
                if (this.f9396A != null && !this.f9396A.isHidden()) {
                    this.f9396A.m31228a();
                    if (!this.f9431y.isShown()) {
                        this.f9431y.setVisibility(0);
                    }
                    if (!this.f9396A.isVisible()) {
                        return true;
                    }
                    this.f9414g.beginTransaction().hide(this.f9396A).commitAllowingStateLoss();
                    return true;
                } else if (this.f9421n == null || this.f9421n.isHidden()) {
                    if (this.f9423p == null || this.f9423p.isHidden()) {
                        m30471t();
                        return false;
                    }
                    if (this.f9423p.m30078m()) {
                        this.f9414g.beginTransaction().hide(this.f9423p).commit();
                    }
                    return false;
                } else {
                    m30506a(0);
                    if (!this.f9431y.isShown()) {
                        this.f9431y.setVisibility(0);
                    }
                    if (!this.f9421n.isVisible()) {
                        return true;
                    }
                    this.f9414g.beginTransaction().hide(this.f9421n).commitAllowingStateLoss();
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f9423p == null) {
            this.f9423p = new MapSettingFragment();
            this.f9414g.beginTransaction().add(C1704R.C1706id.activity_general_setting, this.f9423p).hide(this.f9423p).commit();
        }
        if (this.f9418k != null) {
            this.f9418k.m31094a(this.drone.mo32904af());
        }
        C1862h.m33870b().clear();
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.drone.mo32906ab().mo32588a() && this.drone.mo32905ac()) {
            C2155br c2155br = new C2155br();
            c2155br.f6616d = C2186r.f6822a;
            c2155br.f6617e = (byte) 1;
            c2155br.f6618f = (byte) 0;
            this.drone.mo32906ab().mo32587a(c2155br.mo32762b());
        }
        this.f9413f = new C2737b();
        registerReceiver(this.f9413f, new IntentFilter("resetRTSP"));
        C1867a.m33847a().m33840a(getLocalClassName(), 0, this.drone);
        m30476o();
    }

    @Override // com.fimi.soul.base.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        FimiMediaPlayer.native_profileEnd();
        unregisterReceiver(this.f9413f);
        C1648b.m34863b(getApplicationContext()).m34861b(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m30473r();
    }
}
