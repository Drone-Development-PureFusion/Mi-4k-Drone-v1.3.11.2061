.class final Lcom/google/android/gms/ads/internal/n$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/vt;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/n;->a(Lcom/google/android/gms/internal/xu;Lcom/google/android/gms/internal/xv;Lcom/google/android/gms/ads/internal/f$a;)Lcom/google/android/gms/internal/vt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/xu;

.field final synthetic b:Lcom/google/android/gms/ads/internal/f$a;

.field final synthetic c:Lcom/google/android/gms/internal/xv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/xu;Lcom/google/android/gms/ads/internal/f$a;Lcom/google/android/gms/internal/xv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/n$5;->a:Lcom/google/android/gms/internal/xu;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/n$5;->b:Lcom/google/android/gms/ads/internal/f$a;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/n$5;->c:Lcom/google/android/gms/internal/xv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/acy;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/acy;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Lcom/google/android/gms/internal/acy;->b()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/n$5;->a:Lcom/google/android/gms/internal/xu;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/n$5;->a:Lcom/google/android/gms/internal/xu;

    invoke-interface {v1}, Lcom/google/android/gms/internal/xu;->k()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/n$5;->a:Lcom/google/android/gms/internal/xu;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/xu;->a(Lcom/google/android/gms/c/e;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/n$5;->b:Lcom/google/android/gms/ads/internal/f$a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/f$a;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Unable to call handleClick on mapper"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :try_start_1
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/n;->a(Lcom/google/android/gms/internal/acy;)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/n$5;->c:Lcom/google/android/gms/internal/xv;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/n$5;->c:Lcom/google/android/gms/internal/xv;

    invoke-interface {v1}, Lcom/google/android/gms/internal/xv;->i()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/n$5;->c:Lcom/google/android/gms/internal/xv;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/xv;->a(Lcom/google/android/gms/c/e;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/n$5;->b:Lcom/google/android/gms/ads/internal/f$a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/f$a;->a()V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/n;->a(Lcom/google/android/gms/internal/acy;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method
