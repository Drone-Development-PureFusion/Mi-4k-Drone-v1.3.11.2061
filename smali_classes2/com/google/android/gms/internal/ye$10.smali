.class Lcom/google/android/gms/internal/ye$10;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ye;->a(Lcom/google/ads/mediation/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ye;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ye;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ye$10;->a:Lcom/google/android/gms/internal/ye;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ye$10;->a:Lcom/google/android/gms/internal/ye;

    invoke-static {v0}, Lcom/google/android/gms/internal/ye;->a(Lcom/google/android/gms/internal/ye;)Lcom/google/android/gms/internal/xs;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/xs;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call onAdLoaded."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
