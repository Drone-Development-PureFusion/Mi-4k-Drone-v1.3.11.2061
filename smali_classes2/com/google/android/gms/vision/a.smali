.class public Lcom/google/android/gms/vision/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/a$e;,
        Lcom/google/android/gms/vision/a$d;,
        Lcom/google/android/gms/vision/a$h;,
        Lcom/google/android/gms/vision/a$f;,
        Lcom/google/android/gms/vision/a$g;,
        Lcom/google/android/gms/vision/a$b;,
        Lcom/google/android/gms/vision/a$c;,
        Lcom/google/android/gms/vision/a$a;
    }
.end annotation


# static fields
.field public static final a:I = 0x0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field

.field public static final b:I = 0x1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation
.end field


# instance fields
.field private c:Landroid/content/Context;

.field private final d:Ljava/lang/Object;

.field private e:Landroid/hardware/Camera;

.field private f:I

.field private g:I

.field private h:Lcom/google/android/gms/common/images/a;

.field private i:F

.field private j:I

.field private k:I

.field private l:Z

.field private m:Landroid/view/SurfaceView;

.field private n:Landroid/graphics/SurfaceTexture;

.field private o:Z

.field private p:Ljava/lang/Thread;

.field private q:Lcom/google/android/gms/vision/a$e;

.field private r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<[B",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/a;->d:Ljava/lang/Object;

    iput v1, p0, Lcom/google/android/gms/vision/a;->f:I

    const/high16 v0, 0x41f00000    # 30.0f

    iput v0, p0, Lcom/google/android/gms/vision/a;->i:F

    const/16 v0, 0x400

    iput v0, p0, Lcom/google/android/gms/vision/a;->j:I

    const/16 v0, 0x300

    iput v0, p0, Lcom/google/android/gms/vision/a;->k:I

    iput-boolean v1, p0, Lcom/google/android/gms/vision/a;->l:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/a;->r:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/vision/a$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/vision/a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/vision/a;F)F
    .locals 0

    iput p1, p0, Lcom/google/android/gms/vision/a;->i:F

    return p1
.end method

.method private static a(I)I
    .locals 3

    new-instance v1, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v1}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-static {v0, v1}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    iget v2, v1, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-ne v2, p0, :cond_0

    :goto_1
    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method static synthetic a(Lcom/google/android/gms/vision/a;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/vision/a;->j:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/vision/a;Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/vision/a;->c:Landroid/content/Context;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/vision/a;Lcom/google/android/gms/vision/a$e;)Lcom/google/android/gms/vision/a$e;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/vision/a;->q:Lcom/google/android/gms/vision/a$e;

    return-object p1
.end method

.method static a(Landroid/hardware/Camera;II)Lcom/google/android/gms/vision/a$h;
    .locals 7

    invoke-static {p0}, Lcom/google/android/gms/vision/a;->a(Landroid/hardware/Camera;)Ljava/util/List;

    move-result-object v0

    const/4 v3, 0x0

    const v2, 0x7fffffff

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/a$h;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/a$h;->a()Lcom/google/android/gms/common/images/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/common/images/a;->a()I

    move-result v5

    sub-int/2addr v5, p1

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    invoke-virtual {v1}, Lcom/google/android/gms/common/images/a;->b()I

    move-result v1

    sub-int/2addr v1, p2

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int/2addr v1, v5

    if-ge v1, v2, :cond_1

    move v6, v1

    move-object v1, v0

    move v0, v6

    :goto_1
    move v2, v0

    move-object v3, v1

    goto :goto_0

    :cond_0
    return-object v3

    :cond_1
    move v0, v2

    move-object v1, v3

    goto :goto_1
.end method

.method static synthetic a(Lcom/google/android/gms/vision/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->d:Ljava/lang/Object;

    return-object v0
.end method

.method static a(Landroid/hardware/Camera;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/Camera;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/vision/a$h;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    iget v1, v0, Landroid/hardware/Camera$Size;->width:I

    int-to-float v1, v1

    iget v6, v0, Landroid/hardware/Camera$Size;->height:I

    int-to-float v6, v6

    div-float v6, v1, v6

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/Camera$Size;

    iget v8, v1, Landroid/hardware/Camera$Size;->width:I

    int-to-float v8, v8

    iget v9, v1, Landroid/hardware/Camera$Size;->height:I

    int-to-float v9, v9

    div-float/2addr v8, v9

    sub-float v8, v6, v8

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    const v9, 0x3c23d70a    # 0.01f

    cmpg-float v8, v8, v9

    if-gez v8, :cond_1

    new-instance v6, Lcom/google/android/gms/vision/a$h;

    invoke-direct {v6, v0, v1}, Lcom/google/android/gms/vision/a$h;-><init>(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)V

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "CameraSource"

    const-string v1, "No preview sizes have a corresponding same-aspect-ratio picture size"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    new-instance v2, Lcom/google/android/gms/vision/a$h;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/vision/a$h;-><init>(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)V

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v4
.end method

.method private a(Landroid/hardware/Camera;Landroid/hardware/Camera$Parameters;I)V
    .locals 5

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->c:Landroid/content/Context;

    const-string v2, "window"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const-string v2, "CameraSource"

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x1f

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Bad rotation value: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v1

    :goto_0
    new-instance v1, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v1}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    invoke-static {p3, v1}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    iget v2, v1, Landroid/hardware/Camera$CameraInfo;->facing:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    iget v1, v1, Landroid/hardware/Camera$CameraInfo;->orientation:I

    add-int/2addr v0, v1

    rem-int/lit16 v1, v0, 0x168

    rsub-int v0, v1, 0x168

    rem-int/lit16 v0, v0, 0x168

    :goto_1
    div-int/lit8 v2, v1, 0x5a

    iput v2, p0, Lcom/google/android/gms/vision/a;->g:I

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    invoke-virtual {p2, v1}, Landroid/hardware/Camera$Parameters;->setRotation(I)V

    return-void

    :pswitch_0
    move v0, v1

    goto :goto_0

    :pswitch_1
    const/16 v0, 0x5a

    goto :goto_0

    :pswitch_2
    const/16 v0, 0xb4

    goto :goto_0

    :pswitch_3
    const/16 v0, 0x10e

    goto :goto_0

    :cond_0
    iget v1, v1, Landroid/hardware/Camera$CameraInfo;->orientation:I

    sub-int v0, v1, v0

    add-int/lit16 v0, v0, 0x168

    rem-int/lit16 v0, v0, 0x168

    move v1, v0

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic a(Lcom/google/android/gms/vision/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/vision/a;->l:Z

    return p1
.end method

.method private a(Lcom/google/android/gms/common/images/a;)[B
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    const/16 v0, 0x11

    invoke-static {v0}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/common/images/a;->b()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/common/images/a;->a()I

    move-result v2

    mul-int/2addr v1, v2

    mul-int/2addr v0, v1

    int-to-long v0, v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x4020000000000000L    # 8.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    if-eq v2, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Failed to create valid buffer for camera source."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/vision/a;->r:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method static a(Landroid/hardware/Camera;F)[I
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v0, p1

    float-to-int v4, v0

    const/4 v3, 0x0

    const v2, 0x7fffffff

    invoke-virtual {p0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewFpsRange()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    aget v1, v0, v1

    sub-int v1, v4, v1

    const/4 v6, 0x1

    aget v6, v0, v6

    sub-int v6, v4, v6

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    add-int/2addr v1, v6

    if-ge v1, v2, :cond_1

    move v7, v1

    move-object v1, v0

    move v0, v7

    :goto_1
    move v2, v0

    move-object v3, v1

    goto :goto_0

    :cond_0
    return-object v3

    :cond_1
    move v0, v2

    move-object v1, v3

    goto :goto_1
.end method

.method static synthetic b(Lcom/google/android/gms/vision/a;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/vision/a;->k:I

    return p1
.end method

.method static synthetic b(Lcom/google/android/gms/vision/a;)Landroid/hardware/Camera;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/vision/a;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/vision/a;->f:I

    return p1
.end method

.method static synthetic c(Lcom/google/android/gms/vision/a;)Lcom/google/android/gms/vision/a$e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->q:Lcom/google/android/gms/vision/a$e;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/vision/a;)Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->p:Ljava/lang/Thread;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/vision/a;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->r:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/vision/a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/vision/a;->g:I

    return v0
.end method

.method private f()Landroid/hardware/Camera;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/vision/a;->f:I

    invoke-static {v0}, Lcom/google/android/gms/vision/a;->a(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Could not find requested camera."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static {v0}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/vision/a;->j:I

    iget v3, p0, Lcom/google/android/gms/vision/a;->k:I

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/vision/a;->a(Landroid/hardware/Camera;II)Lcom/google/android/gms/vision/a$h;

    move-result-object v2

    if-nez v2, :cond_1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Could not find suitable preview size."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/vision/a$h;->b()Lcom/google/android/gms/common/images/a;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/android/gms/vision/a$h;->a()Lcom/google/android/gms/common/images/a;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/vision/a;->h:Lcom/google/android/gms/common/images/a;

    iget v2, p0, Lcom/google/android/gms/vision/a;->i:F

    invoke-static {v1, v2}, Lcom/google/android/gms/vision/a;->a(Landroid/hardware/Camera;F)[I

    move-result-object v2

    if-nez v2, :cond_2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Could not find suitable preview frames per second range."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v4

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/google/android/gms/common/images/a;->a()I

    move-result v5

    invoke-virtual {v3}, Lcom/google/android/gms/common/images/a;->b()I

    move-result v3

    invoke-virtual {v4, v5, v3}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    :cond_3
    iget-object v3, p0, Lcom/google/android/gms/vision/a;->h:Lcom/google/android/gms/common/images/a;

    invoke-virtual {v3}, Lcom/google/android/gms/common/images/a;->a()I

    move-result v3

    iget-object v5, p0, Lcom/google/android/gms/vision/a;->h:Lcom/google/android/gms/common/images/a;

    invoke-virtual {v5}, Lcom/google/android/gms/common/images/a;->b()I

    move-result v5

    invoke-virtual {v4, v3, v5}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    const/4 v3, 0x0

    aget v3, v2, v3

    const/4 v5, 0x1

    aget v2, v2, v5

    invoke-virtual {v4, v3, v2}, Landroid/hardware/Camera$Parameters;->setPreviewFpsRange(II)V

    const/16 v2, 0x11

    invoke-virtual {v4, v2}, Landroid/hardware/Camera$Parameters;->setPreviewFormat(I)V

    invoke-direct {p0, v1, v4, v0}, Lcom/google/android/gms/vision/a;->a(Landroid/hardware/Camera;Landroid/hardware/Camera$Parameters;I)V

    iget-boolean v0, p0, Lcom/google/android/gms/vision/a;->l:Z

    if-eqz v0, :cond_4

    invoke-virtual {v4}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v0

    const-string v2, "continuous-video"

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "continuous-video"

    invoke-virtual {v4, v0}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    :cond_4
    :goto_0
    invoke-virtual {v1, v4}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    new-instance v0, Lcom/google/android/gms/vision/a$d;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/vision/a$d;-><init>(Lcom/google/android/gms/vision/a;Lcom/google/android/gms/vision/a$1;)V

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->h:Lcom/google/android/gms/common/images/a;

    invoke-direct {p0, v0}, Lcom/google/android/gms/vision/a;->a(Lcom/google/android/gms/common/images/a;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->h:Lcom/google/android/gms/common/images/a;

    invoke-direct {p0, v0}, Lcom/google/android/gms/vision/a;->a(Lcom/google/android/gms/common/images/a;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->h:Lcom/google/android/gms/common/images/a;

    invoke-direct {p0, v0}, Lcom/google/android/gms/vision/a;->a(Lcom/google/android/gms/common/images/a;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->h:Lcom/google/android/gms/common/images/a;

    invoke-direct {p0, v0}, Lcom/google/android/gms/vision/a;->a(Lcom/google/android/gms/common/images/a;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    return-object v1

    :cond_5
    const-string v0, "CameraSource"

    const-string v2, "Camera auto focus is not supported on this device."

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method static synthetic g(Lcom/google/android/gms/vision/a;)Lcom/google/android/gms/common/images/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->h:Lcom/google/android/gms/common/images/a;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/SurfaceHolder;)Lcom/google/android/gms/vision/a;
    .locals 3
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.CAMERA"
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/vision/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-object p0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/vision/a;->f()Landroid/hardware/Camera;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    new-instance v0, Ljava/lang/Thread;

    iget-object v2, p0, Lcom/google/android/gms/vision/a;->q:Lcom/google/android/gms/vision/a$e;

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/google/android/gms/vision/a;->p:Ljava/lang/Thread;

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->q:Lcom/google/android/gms/vision/a$e;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/vision/a$e;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->p:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/vision/a;->o:Z

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/vision/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/vision/a;->c()V

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->q:Lcom/google/android/gms/vision/a$e;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/a$e;->a()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/google/android/gms/vision/a$c;Lcom/google/android/gms/vision/a$b;)V
    .locals 6

    iget-object v1, p0, Lcom/google/android/gms/vision/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/vision/a$g;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/vision/a$g;-><init>(Lcom/google/android/gms/vision/a;Lcom/google/android/gms/vision/a$1;)V

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/a$g;->a(Lcom/google/android/gms/vision/a$g;Lcom/google/android/gms/vision/a$c;)Lcom/google/android/gms/vision/a$c;

    new-instance v2, Lcom/google/android/gms/vision/a$f;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/google/android/gms/vision/a$f;-><init>(Lcom/google/android/gms/vision/a;Lcom/google/android/gms/vision/a$1;)V

    invoke-static {v2, p2}, Lcom/google/android/gms/vision/a$f;->a(Lcom/google/android/gms/vision/a$f;Lcom/google/android/gms/vision/a$b;)Lcom/google/android/gms/vision/a$b;

    iget-object v3, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v3, v0, v4, v5, v2}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b()Lcom/google/android/gms/vision/a;
    .locals 3
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.CAMERA"
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/vision/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-object p0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/vision/a;->f()Landroid/hardware/Camera;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v0, v2, :cond_1

    new-instance v0, Landroid/graphics/SurfaceTexture;

    const/16 v2, 0x64

    invoke-direct {v0, v2}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/vision/a;->n:Landroid/graphics/SurfaceTexture;

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    iget-object v2, p0, Lcom/google/android/gms/vision/a;->n:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0, v2}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/vision/a;->o:Z

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    new-instance v0, Ljava/lang/Thread;

    iget-object v2, p0, Lcom/google/android/gms/vision/a;->q:Lcom/google/android/gms/vision/a$e;

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/google/android/gms/vision/a;->p:Ljava/lang/Thread;

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->q:Lcom/google/android/gms/vision/a$e;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/vision/a$e;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->p:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    new-instance v0, Landroid/view/SurfaceView;

    iget-object v2, p0, Lcom/google/android/gms/vision/a;->c:Landroid/content/Context;

    invoke-direct {v0, v2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/vision/a;->m:Landroid/view/SurfaceView;

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    iget-object v2, p0, Lcom/google/android/gms/vision/a;->m:Landroid/view/SurfaceView;

    invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/vision/a;->o:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method public c()V
    .locals 5

    iget-object v1, p0, Lcom/google/android/gms/vision/a;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/a;->q:Lcom/google/android/gms/vision/a$e;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/vision/a$e;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->p:Ljava/lang/Thread;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/vision/a;->p:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lcom/google/android/gms/vision/a;->p:Ljava/lang/Thread;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-boolean v0, p0, Lcom/google/android/gms/vision/a;->o:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    :try_start_4
    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/vision/a;->r:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    monitor-exit v1

    return-void

    :catch_0
    move-exception v0

    const-string v0, "CameraSource"

    const-string v2, "Frame processing thread interrupted on release."

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :cond_2
    :try_start_5
    iget-object v0, p0, Lcom/google/android/gms/vision/a;->e:Landroid/hardware/Camera;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    :catch_1
    move-exception v0

    :try_start_6
    const-string v2, "CameraSource"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x20

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Failed to clear camera preview: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_1
.end method

.method public d()Lcom/google/android/gms/common/images/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/a;->h:Lcom/google/android/gms/common/images/a;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/vision/a;->f:I

    return v0
.end method
