package com.fimi.soul.media.gallery;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.p001v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.fimi.kernel.utils.C1656c;
import com.fimi.kernel.utils.C1678s;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3073ab;
import com.fimi.soul.utils.C3075ad;
import com.fimi.soul.view.photodraweeview.AbstractC3312d;
import com.fimi.soul.view.photodraweeview.PhotoDraweeView;
/* loaded from: classes.dex */
public class ImageDetailFragment extends Fragment {

    /* renamed from: e */
    private static boolean f7911e;

    /* renamed from: a */
    Bitmap f7912a = null;

    /* renamed from: b */
    private String f7913b;

    /* renamed from: c */
    private PhotoDraweeView f7914c;

    /* renamed from: d */
    private ProgressBar f7915d;

    /* renamed from: a */
    public static ImageDetailFragment m31630a(String str, boolean z) {
        ImageDetailFragment imageDetailFragment = new ImageDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        imageDetailFragment.setArguments(bundle);
        f7911e = z;
        return imageDetailFragment;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private void m31631a(PhotoDraweeView photoDraweeView, String str, Bitmap bitmap) {
        if (bitmap == null) {
            photoDraweeView.setImageResource(C1704R.C1705drawable.friends_sends_pictures_no);
        } else if (!C3073ab.m29370c(str, getActivity())) {
            photoDraweeView.setImageBitmap(bitmap);
        } else {
            photoDraweeView.setBackground(C1678s.m34590a(bitmap));
            photoDraweeView.setImageResource(C1704R.C1705drawable.video_ic);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (f7911e) {
            this.f7913b = "file://" + this.f7913b;
        }
        this.f7914c.getLayoutParams().height = C1656c.m34817d(getActivity()).heightPixels;
        this.f7914c.getLayoutParams().width = C1656c.m34817d(getActivity()).widthPixels;
        C3075ad.m29363a(this.f7914c, this.f7913b, new BaseControllerListener<ImageInfo>() { // from class: com.fimi.soul.media.gallery.ImageDetailFragment.2
            @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
            /* renamed from: a */
            public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) {
                super.onFinalImageSet(str, imageInfo, animatable);
                if (imageInfo == null || ImageDetailFragment.this.f7914c == null) {
                    return;
                }
                ImageDetailFragment.this.f7914c.mo28348a(imageInfo.getWidth(), imageInfo.getHeight());
            }
        });
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7913b = getArguments() != null ? getArguments().getString("url") : null;
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1704R.layout.image_detail_fragment, viewGroup, false);
        this.f7914c = (PhotoDraweeView) inflate.findViewById(C1704R.C1706id.image);
        this.f7914c.setOnPhotoTapListener(new AbstractC3312d() { // from class: com.fimi.soul.media.gallery.ImageDetailFragment.1
            @Override // com.fimi.soul.view.photodraweeview.AbstractC3312d
            /* renamed from: a */
            public void mo28347a(View view, float f, float f2) {
                ImageDetailFragment.this.getActivity().finish();
                ImageDetailFragment.this.getActivity().overridePendingTransition(17432576, 17432577);
            }
        });
        this.f7915d = (ProgressBar) inflate.findViewById(C1704R.C1706id.loading);
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f7912a = null;
        System.gc();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.f7912a != null && !this.f7912a.isRecycled()) {
            this.f7912a.recycle();
        }
        System.gc();
    }
}
