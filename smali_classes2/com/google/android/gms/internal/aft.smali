.class public Lcom/google/android/gms/internal/aft;
.super Lcom/google/android/gms/cast/framework/media/a/a;


# instance fields
.field private final a:Landroid/widget/ImageView;

.field private final b:Landroid/content/Context;

.field private final c:I

.field private final d:Landroid/graphics/Bitmap;

.field private final e:Lcom/google/android/gms/cast/framework/media/a;

.field private f:Lcom/google/android/gms/internal/afn;

.field private g:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Landroid/content/Context;II)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aft;->a:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aft;->b:Landroid/content/Context;

    iput p3, p0, Lcom/google/android/gms/internal/aft;->c:I

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p4}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aft;->d:Landroid/graphics/Bitmap;

    invoke-static {p2}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/c;->a()Lcom/google/android/gms/cast/framework/CastOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/CastOptions;->g()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->e()Lcom/google/android/gms/cast/framework/media/a;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/aft;->e:Lcom/google/android/gms/cast/framework/media/a;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/cast/MediaQueueItem;)Landroid/net/Uri;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/cast/MediaQueueItem;->b()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aft;->e:Lcom/google/android/gms/cast/framework/media/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/aft;->e:Lcom/google/android/gms/cast/framework/media/a;

    invoke-virtual {v1}, Lcom/google/android/gms/cast/MediaInfo;->e()Lcom/google/android/gms/cast/MediaMetadata;

    move-result-object v2

    iget v3, p0, Lcom/google/android/gms/internal/aft;->c:I

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/cast/framework/media/a;->a(Lcom/google/android/gms/cast/MediaMetadata;I)Lcom/google/android/gms/common/images/WebImage;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/common/images/WebImage;->b()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/common/images/WebImage;->b()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/google/android/gms/cast/framework/media/b;->b(Lcom/google/android/gms/cast/MediaInfo;I)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aft;)Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aft;->g:Landroid/net/Uri;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/aft;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aft;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method private e()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/aft;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aft;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/gms/internal/aft;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->r()Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/aft;->a(Lcom/google/android/gms/cast/MediaQueueItem;)Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/aft;->g:Landroid/net/Uri;

    iget-object v0, p0, Lcom/google/android/gms/internal/aft;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/gms/internal/aft;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/aft;->g:Landroid/net/Uri;

    invoke-static {v1, v0}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iput-object v0, p0, Lcom/google/android/gms/internal/aft;->g:Landroid/net/Uri;

    iget-object v1, p0, Lcom/google/android/gms/internal/aft;->a:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/google/android/gms/internal/aft;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    new-instance v1, Lcom/google/android/gms/internal/aft$1;

    iget-object v2, p0, Lcom/google/android/gms/internal/aft;->b:Landroid/content/Context;

    invoke-direct {v1, p0, v2, v0}, Lcom/google/android/gms/internal/aft$1;-><init>(Lcom/google/android/gms/internal/aft;Landroid/content/Context;Landroid/net/Uri;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/aft;->f:Lcom/google/android/gms/internal/afn;

    iget-object v1, p0, Lcom/google/android/gms/internal/aft;->f:Lcom/google/android/gms/internal/afn;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/afn;->a(Landroid/net/Uri;)Landroid/os/AsyncTask;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aft;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/gms/internal/aft;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/aft;->e()V

    return-void
.end method

.method public b()V
    .locals 3

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/internal/aft;->g:Landroid/net/Uri;

    iget-object v0, p0, Lcom/google/android/gms/internal/aft;->f:Lcom/google/android/gms/internal/afn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aft;->f:Lcom/google/android/gms/internal/afn;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/afn;->cancel(Z)Z

    iput-object v2, p0, Lcom/google/android/gms/internal/aft;->f:Lcom/google/android/gms/internal/afn;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aft;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/gms/internal/aft;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-super {p0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aft;->e()V

    return-void
.end method
