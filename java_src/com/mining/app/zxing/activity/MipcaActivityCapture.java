package com.mining.app.zxing.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.fimi.overseas.soul.C1704R;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.mining.app.zxing.p257a.C10032c;
import com.mining.app.zxing.p258b.C10044f;
import com.mining.app.zxing.p258b.HandlerC10038a;
import com.mining.app.zxing.view.ViewfinderView;
import java.io.IOException;
import java.util.Vector;
/* loaded from: classes.dex */
public class MipcaActivityCapture extends Activity implements SurfaceHolder.Callback {

    /* renamed from: h */
    private static final long f30971h = 200;

    /* renamed from: a */
    private HandlerC10038a f30972a;

    /* renamed from: b */
    private ViewfinderView f30973b;

    /* renamed from: c */
    private boolean f30974c;

    /* renamed from: d */
    private Vector<BarcodeFormat> f30975d;

    /* renamed from: e */
    private String f30976e;

    /* renamed from: f */
    private C10044f f30977f;

    /* renamed from: g */
    private Button f30978g;

    /* renamed from: i */
    private final MediaPlayer.OnCompletionListener f30979i = new MediaPlayer.OnCompletionListener() { // from class: com.mining.app.zxing.activity.MipcaActivityCapture.2
        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.seekTo(0);
        }
    };

    /* renamed from: a */
    private void m6389a(SurfaceHolder surfaceHolder) {
        try {
            C10032c.m6416a().m6412a(surfaceHolder);
            if (this.f30972a != null) {
                return;
            }
            this.f30972a = new HandlerC10038a(this, this.f30975d, this.f30976e);
        } catch (IOException e) {
        } catch (RuntimeException e2) {
        }
    }

    /* renamed from: a */
    public ViewfinderView m6390a() {
        return this.f30973b;
    }

    /* renamed from: a */
    public void m6388a(Result result, Bitmap bitmap) {
        this.f30977f.m6378a();
        String text = result.getText();
        if (text.equals("")) {
            Toast.makeText(this, "Scan failed!", 0).show();
        } else {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("result", text);
            intent.putExtras(bundle);
            setResult(-1, intent);
        }
        finish();
    }

    /* renamed from: b */
    public Handler m6387b() {
        return this.f30972a;
    }

    /* renamed from: c */
    public void m6386c() {
        this.f30973b.m6375a();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.activity_insurance_capture);
        C10032c.m6414a(getApplication());
        this.f30973b = (ViewfinderView) findViewById(C1704R.C1706id.viewfinder_view);
        this.f30978g = (Button) findViewById(C1704R.C1706id.return_insurance);
        this.f30974c = false;
        this.f30977f = new C10044f(this);
        this.f30978g.setOnClickListener(new View.OnClickListener() { // from class: com.mining.app.zxing.activity.MipcaActivityCapture.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MipcaActivityCapture.this.finish();
            }
        });
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.f30977f.m6377b();
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.f30972a != null) {
            this.f30972a.m6385a();
            this.f30972a = null;
        }
        C10032c.m6416a().m6410b();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        SurfaceHolder holder = ((SurfaceView) findViewById(C1704R.C1706id.preview_view)).getHolder();
        if (this.f30974c) {
            m6389a(holder);
        } else {
            holder.addCallback(this);
            holder.setType(3);
        }
        this.f30975d = null;
        this.f30976e = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (!this.f30974c) {
            this.f30974c = true;
            m6389a(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f30974c = false;
    }
}
