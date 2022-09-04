.class public Lcom/google/android/gms/vision/face/internal/client/a;
.super Lcom/google/android/gms/vision/internal/client/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/vision/internal/client/a",
        "<",
        "Lcom/google/android/gms/vision/face/internal/client/d;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;)V
    .locals 1

    const-string v0, "FaceNativeHandle"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/vision/internal/client/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/vision/face/internal/client/a;->a:Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;

    invoke-virtual {p0}, Lcom/google/android/gms/vision/face/internal/client/a;->d()Ljava/lang/Object;

    return-void
.end method

.method private a(Lcom/google/android/gms/vision/face/internal/client/FaceParcel;)Lcom/google/android/gms/vision/face/a;
    .locals 11

    new-instance v0, Lcom/google/android/gms/vision/face/a;

    iget v1, p1, Lcom/google/android/gms/vision/face/internal/client/FaceParcel;->b:I

    new-instance v2, Landroid/graphics/PointF;

    iget v3, p1, Lcom/google/android/gms/vision/face/internal/client/FaceParcel;->c:F

    iget v4, p1, Lcom/google/android/gms/vision/face/internal/client/FaceParcel;->d:F

    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    iget v3, p1, Lcom/google/android/gms/vision/face/internal/client/FaceParcel;->e:F

    iget v4, p1, Lcom/google/android/gms/vision/face/internal/client/FaceParcel;->f:F

    iget v5, p1, Lcom/google/android/gms/vision/face/internal/client/FaceParcel;->g:F

    iget v6, p1, Lcom/google/android/gms/vision/face/internal/client/FaceParcel;->h:F

    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/face/internal/client/a;->b(Lcom/google/android/gms/vision/face/internal/client/FaceParcel;)[Lcom/google/android/gms/vision/face/c;

    move-result-object v7

    iget v8, p1, Lcom/google/android/gms/vision/face/internal/client/FaceParcel;->j:F

    iget v9, p1, Lcom/google/android/gms/vision/face/internal/client/FaceParcel;->k:F

    iget v10, p1, Lcom/google/android/gms/vision/face/internal/client/FaceParcel;->l:F

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/vision/face/a;-><init>(ILandroid/graphics/PointF;FFFF[Lcom/google/android/gms/vision/face/c;FFF)V

    return-object v0
.end method

.method private a(Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;)Lcom/google/android/gms/vision/face/c;
    .locals 4

    new-instance v0, Lcom/google/android/gms/vision/face/c;

    new-instance v1, Landroid/graphics/PointF;

    iget v2, p1, Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;->b:F

    iget v3, p1, Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;->c:F

    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    iget v2, p1, Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;->d:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/vision/face/c;-><init>(Landroid/graphics/PointF;I)V

    return-object v0
.end method

.method private b(Lcom/google/android/gms/vision/face/internal/client/FaceParcel;)[Lcom/google/android/gms/vision/face/c;
    .locals 4

    const/4 v0, 0x0

    iget-object v2, p1, Lcom/google/android/gms/vision/face/internal/client/FaceParcel;->i:[Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;

    if-nez v2, :cond_0

    new-array v0, v0, [Lcom/google/android/gms/vision/face/c;

    :goto_0
    return-object v0

    :cond_0
    array-length v1, v2

    new-array v1, v1, [Lcom/google/android/gms/vision/face/c;

    :goto_1
    array-length v3, v2

    if-ge v0, v3, :cond_1

    aget-object v3, v2, v0

    invoke-direct {p0, v3}, Lcom/google/android/gms/vision/face/internal/client/a;->a(Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;)Lcom/google/android/gms/vision/face/c;

    move-result-object v3

    aput-object v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/akb;Landroid/content/Context;)Lcom/google/android/gms/vision/face/internal/client/d;
    .locals 3

    const-string v0, "com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/akb;->a(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/vision/face/internal/client/e$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/vision/face/internal/client/e;

    move-result-object v0

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/vision/face/internal/client/a;->a:Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/vision/face/internal/client/e;->a(Lcom/google/android/gms/c/e;Lcom/google/android/gms/vision/face/internal/client/FaceSettingsParcel;)Lcom/google/android/gms/vision/face/internal/client/d;

    move-result-object v0

    return-object v0
.end method

.method protected a()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/vision/face/internal/client/a;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/face/internal/client/d;

    invoke-interface {v0}, Lcom/google/android/gms/vision/face/internal/client/d;->a()V

    return-void
.end method

.method public a(I)Z
    .locals 4

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/vision/face/internal/client/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/vision/face/internal/client/a;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/face/internal/client/d;

    invoke-interface {v0, p1}, Lcom/google/android/gms/vision/face/internal/client/d;->a(I)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "FaceNativeHandle"

    const-string v3, "Could not call native face detector"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move v0, v1

    goto :goto_0
.end method

.method public a(Ljava/nio/ByteBuffer;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)[Lcom/google/android/gms/vision/face/a;
    .locals 4

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/vision/face/internal/client/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    new-array v0, v1, [Lcom/google/android/gms/vision/face/a;

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/vision/face/internal/client/a;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/face/internal/client/d;

    invoke-interface {v0, v2, p2}, Lcom/google/android/gms/vision/face/internal/client/d;->a(Lcom/google/android/gms/c/e;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)[Lcom/google/android/gms/vision/face/internal/client/FaceParcel;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    array-length v0, v3

    new-array v2, v0, [Lcom/google/android/gms/vision/face/a;

    move v0, v1

    :goto_1
    array-length v1, v3

    if-ge v0, v1, :cond_1

    aget-object v1, v3, v0

    invoke-direct {p0, v1}, Lcom/google/android/gms/vision/face/internal/client/a;->a(Lcom/google/android/gms/vision/face/internal/client/FaceParcel;)Lcom/google/android/gms/vision/face/a;

    move-result-object v1

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v2, "FaceNativeHandle"

    const-string v3, "Could not call native face detector"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-array v0, v1, [Lcom/google/android/gms/vision/face/a;

    goto :goto_0

    :cond_1
    move-object v0, v2

    goto :goto_0
.end method

.method protected synthetic b(Lcom/google/android/gms/internal/akb;Landroid/content/Context;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/vision/face/internal/client/a;->a(Lcom/google/android/gms/internal/akb;Landroid/content/Context;)Lcom/google/android/gms/vision/face/internal/client/d;

    move-result-object v0

    return-object v0
.end method
