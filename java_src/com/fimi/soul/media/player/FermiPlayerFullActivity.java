package com.fimi.soul.media.player;

import android.os.Bundle;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.media.player.widget.FimiVideoView;
/* loaded from: classes.dex */
public class FermiPlayerFullActivity extends BaseActivity {
    public static final String SP_KEY_PLAYER_ADDR = "SP_KEY_PLAYER_ADDR_VideoDialogFragment";
    private FimiVideoView player;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_player_full);
        this.player = (FimiVideoView) findViewById(C1704R.C1706id.video_view);
        this.player.setDecodeType(0);
        this.player.setVideoPath(C1831e.m33974d());
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.soul.base.BaseFimiActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.fimi.soul.base.BaseActivity, com.fimi.kernel.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.player.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // com.fimi.soul.base.BaseActivity, android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.player != null) {
            this.player.release(false);
        }
    }
}
