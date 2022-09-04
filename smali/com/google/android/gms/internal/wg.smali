.class public Lcom/google/android/gms/internal/wg;
.super Lcom/google/android/gms/internal/abq;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field final a:Lcom/google/android/gms/internal/acy;

.field final b:Lcom/google/android/gms/internal/wi;

.field private final c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/acy;Lcom/google/android/gms/internal/wi;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/abq;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/wg;->a:Lcom/google/android/gms/internal/acy;

    iput-object p2, p0, Lcom/google/android/gms/internal/wg;->b:Lcom/google/android/gms/internal/wi;

    iput-object p3, p0, Lcom/google/android/gms/internal/wg;->c:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->B()Lcom/google/android/gms/internal/wh;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/wh;->a(Lcom/google/android/gms/internal/wg;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/wg;->b:Lcom/google/android/gms/internal/wi;

    iget-object v1, p0, Lcom/google/android/gms/internal/wg;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/wi;->a(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/google/android/gms/internal/abv;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/wg$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/wg$1;-><init>(Lcom/google/android/gms/internal/wg;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/abv;->a:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/internal/wg$1;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/wg$1;-><init>(Lcom/google/android/gms/internal/wg;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    throw v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/wg;->b:Lcom/google/android/gms/internal/wi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wi;->a()V

    return-void
.end method
