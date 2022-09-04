package com.fimi.soul.module.droneui;

import android.os.Bundle;
import android.os.Message;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseDroneFragment;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.media.player.FermiMediaManager;
import com.fimi.soul.media.player.FermiMediaPlayerType;
import com.fimi.soul.media.player.IFermiMediaPlayer;
import com.fimi.soul.media.player.IMediaPlayer;
import com.fimi.soul.media.player.OnPlayerStateChangedListener;
import com.fimi.soul.module.droneui.FlightActivity;
/* loaded from: classes.dex */
public class DroneCameraFragment extends BaseDroneFragment {

    /* renamed from: a */
    private static final String f9365a = DroneCameraFragment.class.getSimpleName();

    /* renamed from: b */
    private static final int f9366b = 2;

    /* renamed from: e */
    private static View f9367e;

    /* renamed from: c */
    private SurfaceView f9368c;

    /* renamed from: f */
    private IFermiMediaPlayer f9370f;

    /* renamed from: d */
    private String f9369d = C1831e.m33974d();

    /* renamed from: g */
    private boolean f9371g = false;

    /* renamed from: a */
    private void m30521a(View view) {
        this.f9368c = (SurfaceView) view.findViewById(C1704R.C1706id.ids_video_view);
        f9367e = view.findViewById(C1704R.C1706id.control_cantairn);
        f9367e.setVisibility(0);
    }

    /* renamed from: i */
    private void m30514i() {
        this.f9368c.setKeepScreenOn(true);
        PreferenceManager.getDefaultSharedPreferences(getActivity());
        this.f9368c.setZOrderMediaOverlay(true);
        this.f9370f = FermiMediaManager.getDefaultManager(getActivity()).createFermiMediaPlayer(FermiMediaPlayerType.FimiMediaPlayer);
        this.f9370f.setSurfaceView(this.f9368c);
        this.f9370f.setAutoPlay(false);
        this.f9370f.setMediaUri(this.f9369d);
        this.f9370f.addOnPlayerStateChangedListener(new OnPlayerStateChangedListener() { // from class: com.fimi.soul.module.droneui.DroneCameraFragment.1
            @Override // com.fimi.soul.media.player.OnPlayerStateChangedListener
            public void OnPlayerStateChanged(IFermiMediaPlayer.FermiPlyaerState fermiPlyaerState, IFermiMediaPlayer iFermiMediaPlayer) {
                Log.d("Good", "播放器状态-->" + fermiPlyaerState.toString());
                if (fermiPlyaerState == IFermiMediaPlayer.FermiPlyaerState.Inited) {
                    DroneCameraFragment.this.f9371g = true;
                    DroneCameraFragment.this.m30517f();
                }
                if (DroneCameraFragment.this.f9371g) {
                    if (fermiPlyaerState == IFermiMediaPlayer.FermiPlyaerState.Playing) {
                        DroneCameraFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.fimi.soul.module.droneui.DroneCameraFragment.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                DroneCameraFragment.this.c().sendEmptyMessageDelayed(2, 500L);
                            }
                        });
                    } else {
                        DroneCameraFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.fimi.soul.module.droneui.DroneCameraFragment.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                DroneCameraFragment.f9367e.setVisibility(0);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // com.fimi.kernel.BaseFragment
    /* renamed from: a */
    public void mo30522a(Message message) {
        a().mo34429c();
        if (message.what == 2) {
            f9367e.setVisibility(8);
        }
    }

    /* renamed from: f */
    public void m30517f() {
        if (((FlightActivity) getActivity()).m30498b() == FlightActivity.EnumC2739c.Camera && this.f9370f != null && this.f9369d != null && this.f9371g) {
            try {
                this.f9368c.setVisibility(0);
                this.f9370f.prepare();
                this.f9370f.play();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    public void m30516g() {
        f9367e.setVisibility(0);
        this.f9368c.setZOrderMediaOverlay(false);
        this.f9368c.setVisibility(8);
        if (this.f9370f.isPlaying()) {
            this.f9370f.stop();
        }
    }

    @Override // com.fimi.kernel.BaseFragment, android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(C1704R.layout.fragment_camera_preview, (ViewGroup) null);
        getActivity().setVolumeControlStream(3);
        m30521a(inflate);
        m30514i();
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f9370f.isPlaying()) {
            this.f9370f.stop();
        }
        if (this.f9370f instanceof IMediaPlayer) {
            ((IMediaPlayer) this.f9370f).release();
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        Log.d("Good", "onStart");
        m30517f();
        super.onStart();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.f9370f.isPlaying()) {
            this.f9370f.stop();
        }
    }
}
