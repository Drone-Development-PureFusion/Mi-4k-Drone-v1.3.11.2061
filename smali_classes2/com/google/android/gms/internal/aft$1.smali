.class Lcom/google/android/gms/internal/aft$1;
.super Lcom/google/android/gms/internal/afn;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aft;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/net/Uri;

.field final synthetic b:Lcom/google/android/gms/internal/aft;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aft;Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aft$1;->b:Lcom/google/android/gms/internal/aft;

    iput-object p3, p0, Lcom/google/android/gms/internal/aft$1;->a:Landroid/net/Uri;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/afn;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Bitmap;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aft$1;->b:Lcom/google/android/gms/internal/aft;

    invoke-static {v0}, Lcom/google/android/gms/internal/aft;->a(Lcom/google/android/gms/internal/aft;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aft$1;->a:Landroid/net/Uri;

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aft$1;->b:Lcom/google/android/gms/internal/aft;

    invoke-static {v0}, Lcom/google/android/gms/internal/aft;->b(Lcom/google/android/gms/internal/aft;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aft$1;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method
