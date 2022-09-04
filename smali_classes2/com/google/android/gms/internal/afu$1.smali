.class Lcom/google/android/gms/internal/afu$1;
.super Lcom/google/android/gms/internal/afn;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/afu;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/net/Uri;

.field final synthetic b:Lcom/google/android/gms/internal/afu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/afu;Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/afu$1;->b:Lcom/google/android/gms/internal/afu;

    iput-object p3, p0, Lcom/google/android/gms/internal/afu$1;->a:Landroid/net/Uri;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/afn;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Bitmap;)V
    .locals 2

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/afu$1;->b:Lcom/google/android/gms/internal/afu;

    invoke-static {v0}, Lcom/google/android/gms/internal/afu;->a(Lcom/google/android/gms/internal/afu;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/afu$1;->a:Landroid/net/Uri;

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/afu$1;->b:Lcom/google/android/gms/internal/afu;

    invoke-static {v0}, Lcom/google/android/gms/internal/afu;->b(Lcom/google/android/gms/internal/afu;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afu$1;->b:Lcom/google/android/gms/internal/afu;

    invoke-static {v0}, Lcom/google/android/gms/internal/afu;->b(Lcom/google/android/gms/internal/afu;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/afu$1;->b:Lcom/google/android/gms/internal/afu;

    invoke-static {v0}, Lcom/google/android/gms/internal/afu;->c(Lcom/google/android/gms/internal/afu;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afu$1;->b:Lcom/google/android/gms/internal/afu;

    invoke-static {v0}, Lcom/google/android/gms/internal/afu;->c(Lcom/google/android/gms/internal/afu;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afu$1;->b:Lcom/google/android/gms/internal/afu;

    invoke-static {v0}, Lcom/google/android/gms/internal/afu;->d(Lcom/google/android/gms/internal/afu;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/afu$1;->b:Lcom/google/android/gms/internal/afu;

    invoke-static {v0}, Lcom/google/android/gms/internal/afu;->d(Lcom/google/android/gms/internal/afu;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/afu$1;->b:Lcom/google/android/gms/internal/afu;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/afu;->a(Lcom/google/android/gms/internal/afu;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    :cond_2
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/afu$1;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method
