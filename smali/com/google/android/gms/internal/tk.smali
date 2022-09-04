.class public Lcom/google/android/gms/internal/tk;
.super Lcom/google/android/gms/internal/tf;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final d:Lcom/google/android/gms/internal/wy;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/abi;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/tm;Lcom/google/android/gms/internal/wy;)V
    .locals 3

    invoke-direct/range {p0 .. p5}, Lcom/google/android/gms/internal/tf;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Lcom/google/android/gms/internal/abi;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/tm;)V

    iput-object p6, p0, Lcom/google/android/gms/internal/tk;->d:Lcom/google/android/gms/internal/wy;

    iget-object v0, p0, Lcom/google/android/gms/internal/tk;->d:Lcom/google/android/gms/internal/wy;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/tk;->a(Lcom/google/android/gms/internal/wy;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/tk;->a()V

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/tk;->a(I)V

    const-string v1, "Tracking ad unit: "

    iget-object v0, p0, Lcom/google/android/gms/internal/tk;->b:Lcom/google/android/gms/internal/th;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/th;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method protected b(Lorg/json/JSONObject;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/tk;->d:Lcom/google/android/gms/internal/wy;

    const-string v1, "AFMA_updateActiveView"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/wy;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method protected c()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/tk;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-super {p0}, Lcom/google/android/gms/internal/tf;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/tk;->d:Lcom/google/android/gms/internal/wy;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/tk;->b(Lcom/google/android/gms/internal/wy;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public d()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/tk;->c()V

    return-void
.end method

.method protected j()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
