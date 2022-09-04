.class Lcom/google/android/gms/internal/acz$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/acz;->o()V
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

    iput-object p1, p0, Lcom/google/android/gms/internal/acz$2;->a:Lcom/google/android/gms/internal/acz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/acz$2;->a:Lcom/google/android/gms/internal/acz;

    iget-object v0, v0, Lcom/google/android/gms/internal/acz;->a:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->B()V

    iget-object v0, p0, Lcom/google/android/gms/internal/acz$2;->a:Lcom/google/android/gms/internal/acz;

    iget-object v0, v0, Lcom/google/android/gms/internal/acz;->a:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->i()Lcom/google/android/gms/ads/internal/overlay/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/d;->m()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/acz$2;->a:Lcom/google/android/gms/internal/acz;

    invoke-static {v0}, Lcom/google/android/gms/internal/acz;->a(Lcom/google/android/gms/internal/acz;)Lcom/google/android/gms/internal/acz$c;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/acz$2;->a:Lcom/google/android/gms/internal/acz;

    invoke-static {v0}, Lcom/google/android/gms/internal/acz;->a(Lcom/google/android/gms/internal/acz;)Lcom/google/android/gms/internal/acz$c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/acz$c;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/acz$2;->a:Lcom/google/android/gms/internal/acz;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/acz;->a(Lcom/google/android/gms/internal/acz;Lcom/google/android/gms/internal/acz$c;)Lcom/google/android/gms/internal/acz$c;

    :cond_1
    return-void
.end method
