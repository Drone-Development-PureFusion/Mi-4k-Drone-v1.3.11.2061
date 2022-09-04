.class Lcom/google/android/gms/internal/afq$2;
.super Lcom/google/android/gms/internal/afn;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/afq;->a(Lcom/google/android/gms/cast/MediaInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/afq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/afq;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/afq$2;->a:Lcom/google/android/gms/internal/afq;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/afn;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Bitmap;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/afq$2;->a:Lcom/google/android/gms/internal/afq;

    invoke-static {v0}, Lcom/google/android/gms/internal/afq;->b(Lcom/google/android/gms/internal/afq;)Lcom/google/android/gms/internal/afn;

    move-result-object v0

    if-ne v0, p0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afq$2;->a:Lcom/google/android/gms/internal/afq;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/afq;->a(Lcom/google/android/gms/internal/afq;Lcom/google/android/gms/internal/afn;)Lcom/google/android/gms/internal/afn;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afq$2;->a:Lcom/google/android/gms/internal/afq;

    invoke-static {v0}, Lcom/google/android/gms/internal/afq;->d(Lcom/google/android/gms/internal/afq;)Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/afq$2;->a:Lcom/google/android/gms/internal/afq;

    invoke-static {v1}, Lcom/google/android/gms/internal/afq;->c(Lcom/google/android/gms/internal/afq;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/afq;->a(Landroid/support/v4/media/MediaMetadataCompat$Builder;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->build()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V

    :cond_0
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/afq$2;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method
