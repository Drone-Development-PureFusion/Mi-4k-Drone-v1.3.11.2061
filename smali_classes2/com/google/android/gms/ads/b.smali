.class public Lcom/google/android/gms/ads/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/b$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/client/y;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/ads/internal/client/ah;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/ah;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/y;->a()Lcom/google/android/gms/ads/internal/client/y;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/ads/b;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/ah;Lcom/google/android/gms/ads/internal/client/y;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/ah;Lcom/google/android/gms/ads/internal/client/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/b;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/b;->c:Lcom/google/android/gms/ads/internal/client/ah;

    iput-object p3, p0, Lcom/google/android/gms/ads/b;->a:Lcom/google/android/gms/ads/internal/client/y;

    return-void
.end method

.method private a(Lcom/google/android/gms/ads/internal/client/e;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/b;->c:Lcom/google/android/gms/ads/internal/client/ah;

    iget-object v1, p0, Lcom/google/android/gms/ads/b;->a:Lcom/google/android/gms/ads/internal/client/y;

    iget-object v2, p0, Lcom/google/android/gms/ads/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/ads/internal/client/y;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/e;)Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ah;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to load ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/b;->c:Lcom/google/android/gms/ads/internal/client/ah;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ah;->b()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get the mediation adapter class name."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/c;)V
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/ads/c;->f()Lcom/google/android/gms/ads/internal/client/e;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/b;->a(Lcom/google/android/gms/ads/internal/client/e;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/doubleclick/d;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/ads/doubleclick/d;->j()Lcom/google/android/gms/ads/internal/client/e;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/b;->a(Lcom/google/android/gms/ads/internal/client/e;)V

    return-void
.end method

.method public b()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/b;->c:Lcom/google/android/gms/ads/internal/client/ah;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ah;->a()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to check if ad is loading."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method
