package com.fimi.soul.utils;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Sets;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.listener.RequestLoggingListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.fimi.kernel.C1642c;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
/* renamed from: com.fimi.soul.utils.ad */
/* loaded from: classes.dex */
public class C3075ad {

    /* renamed from: a */
    private static final String f11515a = "imagepipeline_cache";

    /* renamed from: c */
    private static final int f11517c = 41943040;

    /* renamed from: e */
    private static ImagePipelineConfig f11519e;

    /* renamed from: b */
    private static final int f11516b = (int) Runtime.getRuntime().maxMemory();

    /* renamed from: d */
    private static final int f11518d = f11516b / 4;

    /* renamed from: a */
    public static void m29365a() {
        Fresco.initialize(C1642c.m34893a(), m29358c());
    }

    /* renamed from: a */
    public static void m29364a(SimpleDraweeView simpleDraweeView, String str) {
        m29363a(simpleDraweeView, str, null);
    }

    /* renamed from: a */
    public static void m29363a(SimpleDraweeView simpleDraweeView, String str, ControllerListener controllerListener) {
        if (str == null) {
            return;
        }
        int i = simpleDraweeView.getLayoutParams().width;
        int i2 = simpleDraweeView.getLayoutParams().height;
        PipelineDraweeControllerBuilder newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
        newDraweeControllerBuilder.setOldController(simpleDraweeView.getController());
        newDraweeControllerBuilder.setAutoPlayAnimations(true);
        ImageRequestBuilder newBuilderWithSource = ImageRequestBuilder.newBuilderWithSource(Uri.parse(str));
        newBuilderWithSource.setProgressiveRenderingEnabled(true);
        Log.d("Good", str);
        if (i > 0 && i2 > 0) {
            newBuilderWithSource.setResizeOptions(new ResizeOptions(i, i2));
        }
        newDraweeControllerBuilder.setImageRequest(newBuilderWithSource.build());
        newDraweeControllerBuilder.setControllerListener(controllerListener);
        simpleDraweeView.setController(newDraweeControllerBuilder.build());
    }

    /* renamed from: a */
    public static void m29362a(SimpleDraweeView simpleDraweeView, String str, String str2, ControllerListener controllerListener) {
        if (str2 == null) {
            return;
        }
        int i = simpleDraweeView.getLayoutParams().width;
        int i2 = simpleDraweeView.getLayoutParams().height;
        PipelineDraweeControllerBuilder newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
        if (!str.startsWith("file:///")) {
            str = "file://" + str;
        }
        if (str != null && str.length() > 0) {
            newDraweeControllerBuilder.setLowResImageRequest(ImageRequest.fromUri(str));
        }
        newDraweeControllerBuilder.setOldController(simpleDraweeView.getController());
        newDraweeControllerBuilder.setAutoPlayAnimations(true);
        ImageRequestBuilder newBuilderWithSource = str2.endsWith(X11FileInfo.FILE_TYPE_MP4) ? ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)) : ImageRequestBuilder.newBuilderWithSource(Uri.parse(str2));
        if (i > 0 && i2 > 0) {
            newBuilderWithSource.setResizeOptions(new ResizeOptions(i, i2));
        }
        newDraweeControllerBuilder.setImageRequest(newBuilderWithSource.build());
        newDraweeControllerBuilder.setControllerListener(controllerListener);
        simpleDraweeView.setController(newDraweeControllerBuilder.build());
    }

    /* renamed from: a */
    private static void m29361a(ImagePipelineConfig.Builder builder) {
        builder.setRequestListeners(Sets.newHashSet(new RequestLoggingListener()));
    }

    /* renamed from: a */
    private static void m29360a(ImagePipelineConfig.Builder builder, Context context) {
        final MemoryCacheParams memoryCacheParams = new MemoryCacheParams(f11518d, Integer.MAX_VALUE, f11518d, Integer.MAX_VALUE, Integer.MAX_VALUE);
        builder.setBitmapMemoryCacheParamsSupplier(new Supplier<MemoryCacheParams>() { // from class: com.fimi.soul.utils.ad.1
            @Override // com.facebook.common.internal.Supplier
            /* renamed from: a */
            public MemoryCacheParams mo40100get() {
                return MemoryCacheParams.this;
            }
        }).setMainDiskCacheConfig(DiskCacheConfig.newBuilder().setBaseDirectoryPath(context.getApplicationContext().getCacheDir()).setBaseDirectoryName(f11515a).setMaxCacheSize(41943040L).build());
    }

    /* renamed from: b */
    public static void m29359b() {
        Fresco.shutDown();
    }

    /* renamed from: c */
    public static ImagePipelineConfig m29358c() {
        if (f11519e == null) {
            ImagePipelineConfig.Builder newBuilder = ImagePipelineConfig.newBuilder(C1642c.m34893a());
            m29360a(newBuilder, C1642c.m34893a());
            m29361a(newBuilder);
            f11519e = newBuilder.build();
        }
        return f11519e;
    }

    /* renamed from: d */
    public static void m29357d() {
        ImagePipeline imagePipeline = Fresco.getImagePipeline();
        imagePipeline.clearMemoryCaches();
        imagePipeline.clearDiskCaches();
    }
}
