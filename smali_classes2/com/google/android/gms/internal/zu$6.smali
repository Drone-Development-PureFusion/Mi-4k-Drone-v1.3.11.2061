.class Lcom/google/android/gms/internal/zu$6;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/acc$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zu;->a(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/internal/aco;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/acc$a",
        "<",
        "Lcom/google/android/gms/ads/internal/formats/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:D

.field final synthetic c:Z

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/google/android/gms/internal/zu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zu;ZDZLjava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zu$6;->e:Lcom/google/android/gms/internal/zu;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/zu$6;->a:Z

    iput-wide p3, p0, Lcom/google/android/gms/internal/zu$6;->b:D

    iput-boolean p5, p0, Lcom/google/android/gms/internal/zu$6;->c:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/zu$6;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/ads/internal/formats/c;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zu$6;->e:Lcom/google/android/gms/internal/zu;

    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zu$6;->a:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zu;->a(IZ)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/io/InputStream;)Lcom/google/android/gms/ads/internal/formats/c;
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    const/4 v0, 0x0

    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const-wide/high16 v2, 0x4064000000000000L    # 160.0

    iget-wide v4, p0, Lcom/google/android/gms/internal/zu$6;->b:D

    mul-double/2addr v2, v4

    double-to-int v2, v2

    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zu$6;->c:Z

    if-nez v2, :cond_0

    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    :cond_0
    const/4 v2, 0x0

    :try_start_0
    invoke-static {p1, v2, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    :goto_0
    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/zu$6;->e:Lcom/google/android/gms/internal/zu;

    const/4 v2, 0x2

    iget-boolean v3, p0, Lcom/google/android/gms/internal/zu$6;->a:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/zu;->a(IZ)V

    :goto_1
    return-object v0

    :catch_0
    move-exception v1

    const-string v2, "Error grabbing image."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/abr;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v1, v0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/common/util/s;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v5, 0x3d

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Decoded image w: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " h:"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " bytes: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->e(Ljava/lang/String;)V

    :cond_2
    new-instance v0, Lcom/google/android/gms/ads/internal/formats/c;

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zu$6;->d:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-wide v4, p0, Lcom/google/android/gms/internal/zu$6;->b:D

    invoke-direct {v0, v2, v1, v4, v5}, Lcom/google/android/gms/ads/internal/formats/c;-><init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;D)V

    goto :goto_1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zu$6;->a()Lcom/google/android/gms/ads/internal/formats/c;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zu$6;->a(Ljava/io/InputStream;)Lcom/google/android/gms/ads/internal/formats/c;

    move-result-object v0

    return-object v0
.end method
