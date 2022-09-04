package com.fimi.soul.media.gallery;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.view.photodraweeview.AbstractC3312d;
import com.fimi.soul.view.photodraweeview.PhotoDraweeView;
/* renamed from: com.fimi.soul.media.gallery.b */
/* loaded from: classes.dex */
public class AlertDialogC2405b extends AlertDialog implements View.OnClickListener {

    /* renamed from: a */
    private Bitmap f7935a;

    /* renamed from: b */
    private ProgressBar f7936b;

    public AlertDialogC2405b(Context context, Bitmap bitmap, int i) {
        super(context, i);
        this.f7935a = bitmap;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case C1704R.C1706id.gallery /* 2131755926 */:
                dismiss();
                return;
            default:
                return;
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1704R.layout.gallery_dialog);
        PhotoDraweeView photoDraweeView = (PhotoDraweeView) findViewById(C1704R.C1706id.gallery);
        photoDraweeView.setOnPhotoTapListener(new AbstractC3312d() { // from class: com.fimi.soul.media.gallery.b.1
            @Override // com.fimi.soul.view.photodraweeview.AbstractC3312d
            /* renamed from: a */
            public void mo28347a(View view, float f, float f2) {
                AlertDialogC2405b.this.dismiss();
            }
        });
        this.f7936b = (ProgressBar) findViewById(C1704R.C1706id.progress);
        photoDraweeView.setOnClickListener(this);
        if (this.f7935a != null) {
            photoDraweeView.setImageBitmap(this.f7935a);
            this.f7936b.setVisibility(4);
            photoDraweeView.setVisibility(0);
        }
    }
}
