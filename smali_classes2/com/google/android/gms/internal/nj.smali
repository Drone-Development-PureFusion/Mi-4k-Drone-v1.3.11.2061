.class public Lcom/google/android/gms/internal/nj;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/Object;

.field private static volatile b:Lcom/google/android/gms/internal/nj;


# instance fields
.field private c:Lcom/google/android/gms/internal/ni;

.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/nj;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/nj;->d:Landroid/content/Context;

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/akb;->a:Lcom/google/android/gms/internal/akb$b;

    const-string v1, "com.google.android.gms.firebasestorage"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/akb;->a(Landroid/content/Context;Lcom/google/android/gms/internal/akb$b;Ljava/lang/String;)Lcom/google/android/gms/internal/akb;

    move-result-object v0

    const-string v1, "com.google.firebase.storage.network.NetworkRequestFactoryImpl"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/akb;->a(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ni$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ni;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nj;->c:Lcom/google/android/gms/internal/ni;
    :try_end_0
    .catch Lcom/google/android/gms/internal/akb$a; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/google/android/gms/internal/nj;->c:Lcom/google/android/gms/internal/ni;

    if-nez v0, :cond_0

    const-string v0, "NetworkRqFactoryProxy"

    const-string v1, "Unable to load Firebase Storage Network layer."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :catch_0
    move-exception v0

    const-string v1, "NetworkRqFactoryProxy"

    const-string v2, "NetworkRequestFactoryProxy failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_0
    return-void
.end method

.method public static a(Lcom/google/firebase/b;)Lcom/google/android/gms/internal/nj;
    .locals 3
    .param p0    # Lcom/google/firebase/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/google/android/gms/internal/nj;->b:Lcom/google/android/gms/internal/nj;

    if-nez v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/nj;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/nj;->b:Lcom/google/android/gms/internal/nj;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/nj;

    invoke-virtual {p0}, Lcom/google/firebase/b;->a()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/nj;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/google/android/gms/internal/nj;->b:Lcom/google/android/gms/internal/nj;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/nj;->b:Lcom/google/android/gms/internal/nj;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Lcom/google/android/gms/internal/nk;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/nk;

    iget-object v1, p0, Lcom/google/android/gms/internal/nj;->c:Lcom/google/android/gms/internal/ni;

    iget-object v2, p0, Lcom/google/android/gms/internal/nj;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Lcom/google/android/gms/internal/ni;->a(Landroid/net/Uri;Lcom/google/android/gms/c/e;)Lcom/google/android/gms/internal/nh;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/nk;-><init>(Lcom/google/android/gms/internal/nh;)V

    return-object v0
.end method

.method public a(Landroid/net/Uri;J)Lcom/google/android/gms/internal/nk;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/nk;

    iget-object v1, p0, Lcom/google/android/gms/internal/nj;->c:Lcom/google/android/gms/internal/ni;

    iget-object v2, p0, Lcom/google/android/gms/internal/nj;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-interface {v1, p1, v2, p2, p3}, Lcom/google/android/gms/internal/ni;->a(Landroid/net/Uri;Lcom/google/android/gms/c/e;J)Lcom/google/android/gms/internal/nh;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/nk;-><init>(Lcom/google/android/gms/internal/nh;)V

    return-object v0
.end method

.method public a(Landroid/net/Uri;Ljava/lang/String;)Lcom/google/android/gms/internal/nk;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/nk;

    iget-object v1, p0, Lcom/google/android/gms/internal/nj;->c:Lcom/google/android/gms/internal/ni;

    iget-object v2, p0, Lcom/google/android/gms/internal/nj;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-interface {v1, p1, v2, p2}, Lcom/google/android/gms/internal/ni;->b(Landroid/net/Uri;Lcom/google/android/gms/c/e;Ljava/lang/String;)Lcom/google/android/gms/internal/nh;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/nk;-><init>(Lcom/google/android/gms/internal/nh;)V

    return-object v0
.end method

.method public a(Landroid/net/Uri;Ljava/lang/String;[BJIZ)Lcom/google/android/gms/internal/nk;
    .locals 10
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/nk;

    iget-object v1, p0, Lcom/google/android/gms/internal/nj;->c:Lcom/google/android/gms/internal/ni;

    iget-object v2, p0, Lcom/google/android/gms/internal/nj;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v3

    invoke-static {p3}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v5

    move-object v2, p1

    move-object v4, p2

    move-wide v6, p4

    move/from16 v8, p6

    move/from16 v9, p7

    invoke-interface/range {v1 .. v9}, Lcom/google/android/gms/internal/ni;->a(Landroid/net/Uri;Lcom/google/android/gms/c/e;Ljava/lang/String;Lcom/google/android/gms/c/e;JIZ)Lcom/google/android/gms/internal/nh;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/nk;-><init>(Lcom/google/android/gms/internal/nh;)V

    return-object v0
.end method

.method public a(Landroid/net/Uri;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/nk;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/nk;

    iget-object v1, p0, Lcom/google/android/gms/internal/nj;->c:Lcom/google/android/gms/internal/ni;

    iget-object v2, p0, Lcom/google/android/gms/internal/nj;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v3

    invoke-interface {v1, p1, v2, v3}, Lcom/google/android/gms/internal/ni;->a(Landroid/net/Uri;Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;)Lcom/google/android/gms/internal/nh;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/nk;-><init>(Lcom/google/android/gms/internal/nh;)V

    return-object v0
.end method

.method public a(Landroid/net/Uri;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/google/android/gms/internal/nk;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/nk;

    iget-object v1, p0, Lcom/google/android/gms/internal/nj;->c:Lcom/google/android/gms/internal/ni;

    iget-object v2, p0, Lcom/google/android/gms/internal/nj;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v3

    invoke-interface {v1, p1, v2, v3, p3}, Lcom/google/android/gms/internal/ni;->a(Landroid/net/Uri;Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;Ljava/lang/String;)Lcom/google/android/gms/internal/nh;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/nk;-><init>(Lcom/google/android/gms/internal/nh;)V

    return-object v0
.end method

.method public a()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nj;->c:Lcom/google/android/gms/internal/ni;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ni;->a()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "NetworkRqFactoryProxy"

    const-string v2, "getBackendAuthority failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Landroid/net/Uri;)Lcom/google/android/gms/internal/nk;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/nk;

    iget-object v1, p0, Lcom/google/android/gms/internal/nj;->c:Lcom/google/android/gms/internal/ni;

    iget-object v2, p0, Lcom/google/android/gms/internal/nj;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Lcom/google/android/gms/internal/ni;->b(Landroid/net/Uri;Lcom/google/android/gms/c/e;)Lcom/google/android/gms/internal/nh;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/nk;-><init>(Lcom/google/android/gms/internal/nh;)V

    return-object v0
.end method

.method public b(Landroid/net/Uri;Ljava/lang/String;)Lcom/google/android/gms/internal/nk;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/nk;

    iget-object v1, p0, Lcom/google/android/gms/internal/nj;->c:Lcom/google/android/gms/internal/ni;

    iget-object v2, p0, Lcom/google/android/gms/internal/nj;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-interface {v1, p1, v2, p2}, Lcom/google/android/gms/internal/ni;->c(Landroid/net/Uri;Lcom/google/android/gms/c/e;Ljava/lang/String;)Lcom/google/android/gms/internal/nh;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/nk;-><init>(Lcom/google/android/gms/internal/nh;)V

    return-object v0
.end method

.method public c(Landroid/net/Uri;)Ljava/lang/String;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/nj;->c:Lcom/google/android/gms/internal/ni;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ni;->a(Landroid/net/Uri;)Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "NetworkRqFactoryProxy"

    const-string v2, "getDefaultURL failed with a RemoteException:"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    goto :goto_0
.end method
