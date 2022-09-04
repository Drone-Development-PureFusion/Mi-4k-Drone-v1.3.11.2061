.class Lcom/google/android/gms/internal/acz$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/acz;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/acz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/acz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/acz$1;->a:Lcom/google/android/gms/internal/acz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/acz$1;->a:Lcom/google/android/gms/internal/acz;

    iget-object v0, v0, Lcom/google/android/gms/internal/acz;->b:Lcom/google/android/gms/ads/internal/safebrowsing/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/acz$1;->a:Lcom/google/android/gms/internal/acz;

    iget-object v0, v0, Lcom/google/android/gms/internal/acz;->b:Lcom/google/android/gms/ads/internal/safebrowsing/c;

    iget-object v1, p0, Lcom/google/android/gms/internal/acz$1;->a:Lcom/google/android/gms/internal/acz;

    iget-object v1, v1, Lcom/google/android/gms/internal/acz;->a:Lcom/google/android/gms/internal/acy;

    invoke-interface {v1}, Lcom/google/android/gms/internal/acy;->b()Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/safebrowsing/c;->a(Landroid/view/View;)V

    :cond_0
    return-void
.end method
