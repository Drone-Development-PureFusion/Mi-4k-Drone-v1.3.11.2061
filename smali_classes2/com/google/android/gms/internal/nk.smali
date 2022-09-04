.class public Lcom/google/android/gms/internal/nk;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:Z


# instance fields
.field private b:Lcom/google/android/gms/internal/nh;

.field private c:Ljava/lang/Exception;

.field private d:I

.field private e:Ljava/lang/Exception;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/nk;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/nk;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/nh;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/internal/nh;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    return-void
.end method

.method private a(Landroid/content/Context;)Z
    .locals 2

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, -0x2

    iput v0, p0, Lcom/google/android/gms/internal/nk;->d:I

    new-instance v0, Ljava/net/SocketException;

    const-string v1, "Network subsystem is unavailable"

    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->e:Ljava/lang/Exception;

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/nh;->c(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    move-object v1, v0

    const-string v2, "NetworkRequestProxy"

    const-string v3, "getResultString failed with a RemoteException:"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public a()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iput v0, p0, Lcom/google/android/gms/internal/nk;->d:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->e:Ljava/lang/Exception;

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/nh;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->c:Ljava/lang/Exception;

    const-string v1, "NetworkRequestProxy"

    const-string v2, "reset failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/g/g;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/g/g",
            "<TTResult;>;TTResult;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->f()Ljava/lang/Exception;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/nk;->g()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/firebase/c/g;->a(Ljava/lang/Throwable;I)Lcom/google/firebase/c/g;

    move-result-object v0

    sget-boolean v1, Lcom/google/android/gms/internal/nk;->a:Z

    if-nez v1, :cond_1

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {p1, v0}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Landroid/content/Context;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/nk;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/nh;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->c:Ljava/lang/Exception;

    const-string v1, "NetworkRequestProxy"

    const-string v2, "performRequest failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public b()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/nh;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->c:Ljava/lang/Exception;

    const-string v1, "NetworkRequestProxy"

    const-string v2, "performRequestEnd failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/nh;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->c:Ljava/lang/Exception;

    const-string v1, "NetworkRequestProxy"

    const-string v2, "performRequestStart failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public c()Ljava/io/InputStream;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/nh;->c()Lcom/google/android/gms/c/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->c:Ljava/lang/Exception;

    const-string v1, "NetworkRequestProxy"

    const-string v2, "getStream failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Lorg/json/JSONObject;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/nh;->d()Lcom/google/android/gms/c/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/nh;->e()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 v0, 0x0

    return-object v0

    :catch_0
    move-exception v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->c:Ljava/lang/Exception;

    const-string v1, "NetworkRequestProxy"

    const-string v2, "getRawResult failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public f()Ljava/lang/Exception;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->e:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->e:Ljava/lang/Exception;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->c:Ljava/lang/Exception;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->c:Ljava/lang/Exception;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/nh;->g()Lcom/google/android/gms/c/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->c:Ljava/lang/Exception;

    const-string v1, "NetworkRequestProxy"

    const-string v2, "getException failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()I
    .locals 3

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/nk;->d:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/nk;->d:I

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/nh;->h()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->c:Ljava/lang/Exception;

    const-string v1, "NetworkRequestProxy"

    const-string v2, "getResultCode failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/nk;->d:I

    const/4 v2, -0x2

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/nk;->e:Ljava/lang/Exception;

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    invoke-interface {v1}, Lcom/google/android/gms/internal/nh;->i()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    iput-object v1, p0, Lcom/google/android/gms/internal/nk;->c:Ljava/lang/Exception;

    const-string v2, "NetworkRequestProxy"

    const-string v3, "isResultSuccess failed with a RemoteException:"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public i()I
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/nh;->j()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nk;->c:Ljava/lang/Exception;

    const-string v1, "NetworkRequestProxy"

    const-string v2, "getResultingContentLength failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    goto :goto_0
.end method
