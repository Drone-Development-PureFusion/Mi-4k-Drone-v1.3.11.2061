package com.fimi.soul.media.player;

import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p164c.AbstractC1643a;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.media.player.FermiPlayerViewBuilder;
@SuppressLint({"ValidFragment"})
/* loaded from: classes.dex */
public class DroneVideoDialogFragment extends DialogFragment implements FermiPlayerViewBuilder.OnDisappearButtonListener {
    private static final String SP_KEY_FRAGMENT_POSITION = "SP_KEY_FRAGMENT_POSITION_VideoDialogFragment";
    private static final String SP_KEY_PLAYER_ADDR = "SP_KEY_PLAYER_ADDR_VideoDialogFragment";
    private View bottomView;
    private IFermiMediaPlayer player;
    private View topView;
    AbstractC1643a manager = null;
    private int currentPosition = 0;
    private String url = "";

    public static DroneVideoDialogFragment newInstance(String str) {
        DroneVideoDialogFragment droneVideoDialogFragment = new DroneVideoDialogFragment();
        droneVideoDialogFragment.url = str;
        C1642c.m34887c().mo34878a("SP_KEY_PLAYER_ADDR_VideoDialogFragment", str);
        return droneVideoDialogFragment;
    }

    public void dismissDialog() {
        this.player.stop();
        this.currentPosition = 0;
        this.manager.mo34882a(SP_KEY_FRAGMENT_POSITION, this.currentPosition);
        dismiss();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        dismissDialog();
        super.onCancel(dialogInterface);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.manager = C1642c.m34887c();
        setStyle(C1704R.style.videoDialog, 16973831);
        this.currentPosition = this.manager.mo34875b(SP_KEY_FRAGMENT_POSITION);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.player = FermiMediaManager.getDefaultManager(getActivity()).createFermiMediaPlayer(FermiMediaPlayerType.SystemMediaPlayer);
        this.player.setAutoPlay(true);
        this.player.setPlayPosition(this.currentPosition);
        this.url = this.manager.mo34883a("SP_KEY_PLAYER_ADDR_VideoDialogFragment");
        View create = FermiPlayerViewBuilder.Builder(getActivity(), C1704R.layout.layout_dronevideovideo_fullscreen).setFermiMediaPlayer(this.player).setOnClickCloseListenner(new FermiPlayerViewBuilder.OnClickCloseListener() { // from class: com.fimi.soul.media.player.DroneVideoDialogFragment.1
            @Override // com.fimi.soul.media.player.FermiPlayerViewBuilder.OnClickCloseListener
            public void onClose(View view) {
                DroneVideoDialogFragment.this.player.stop();
                DroneVideoDialogFragment.this.dismissDialog();
            }
        }).setOnDisappearButtonListener(this).create();
        this.topView = create.findViewById(C1704R.C1706id.rl_topView);
        this.bottomView = create.findViewById(C1704R.C1706id.rl_bottomView);
        this.player.setMediaUri(this.url);
        this.player.prepare();
        return create;
    }

    @Override // com.fimi.soul.media.player.FermiPlayerViewBuilder.OnDisappearButtonListener
    public void onDisappearButton(boolean z) {
        if (z) {
            this.topView.setVisibility(8);
            this.bottomView.setVisibility(8);
            return;
        }
        this.topView.setVisibility(0);
        this.bottomView.setVisibility(0);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.player.play();
    }
}
