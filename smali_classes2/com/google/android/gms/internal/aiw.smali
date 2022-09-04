.class public Lcom/google/android/gms/internal/aiw;
.super Lcom/google/android/gms/common/api/q;

# interfaces
.implements Lcom/google/android/gms/common/api/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/aiw$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/m;",
        ">",
        "Lcom/google/android/gms/common/api/q",
        "<TR;>;",
        "Lcom/google/android/gms/common/api/n",
        "<TR;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/common/api/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/p",
            "<-TR;+",
            "Lcom/google/android/gms/common/api/m;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/google/android/gms/internal/aiw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/aiw",
            "<+",
            "Lcom/google/android/gms/common/api/m;",
            ">;"
        }
    .end annotation
.end field

.field private volatile c:Lcom/google/android/gms/common/api/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/o",
            "<-TR;>;"
        }
    .end annotation
.end field

.field private d:Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/i",
            "<TR;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/Object;

.field private f:Lcom/google/android/gms/common/api/Status;

.field private final g:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/common/api/g;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/google/android/gms/internal/aiw$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/aiw$a;"
        }
    .end annotation
.end field

.field private i:Z


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/common/api/g;",
            ">;)V"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/q;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/aiw;->a:Lcom/google/android/gms/common/api/p;

    iput-object v1, p0, Lcom/google/android/gms/internal/aiw;->b:Lcom/google/android/gms/internal/aiw;

    iput-object v1, p0, Lcom/google/android/gms/internal/aiw;->c:Lcom/google/android/gms/common/api/o;

    iput-object v1, p0, Lcom/google/android/gms/internal/aiw;->d:Lcom/google/android/gms/common/api/i;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/aiw;->e:Ljava/lang/Object;

    iput-object v1, p0, Lcom/google/android/gms/internal/aiw;->f:Lcom/google/android/gms/common/api/Status;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/aiw;->i:Z

    const-string v0, "GoogleApiClient reference must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/aiw;->g:Ljava/lang/ref/WeakReference;

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/g;

    new-instance v1, Lcom/google/android/gms/internal/aiw$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->c()Landroid/os/Looper;

    move-result-object v0

    :goto_0
    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/aiw$a;-><init>(Lcom/google/android/gms/internal/aiw;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/aiw;->h:Lcom/google/android/gms/internal/aiw$a;

    return-void

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aiw;)Lcom/google/android/gms/common/api/p;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->a:Lcom/google/android/gms/common/api/p;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/aiw;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/aiw;->f:Lcom/google/android/gms/common/api/Status;

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->f:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/aiw;->b(Lcom/google/android/gms/common/api/Status;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aiw;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aiw;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aiw;Lcom/google/android/gms/common/api/m;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aiw;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/aiw;)Lcom/google/android/gms/internal/aiw$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->h:Lcom/google/android/gms/internal/aiw$a;

    return-object v0
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->a:Lcom/google/android/gms/common/api/p;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->c:Lcom/google/android/gms/common/api/o;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/g;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/aiw;->i:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/aiw;->a:Lcom/google/android/gms/common/api/p;

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/aiw;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/aiw;->i:Z

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->f:Lcom/google/android/gms/common/api/Status;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->f:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/aiw;->b(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->d:Lcom/google/android/gms/common/api/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->d:Lcom/google/android/gms/common/api/i;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/n;)V

    goto :goto_0
.end method

.method private b(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/aiw;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->a:Lcom/google/android/gms/common/api/p;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->a:Lcom/google/android/gms/common/api/p;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/p;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    const-string v2, "onFailure must not return null"

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/aiw;->b:Lcom/google/android/gms/internal/aiw;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/aiw;->a(Lcom/google/android/gms/common/api/Status;)V

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/aiw;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->c:Lcom/google/android/gms/common/api/o;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/o;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private b(Lcom/google/android/gms/common/api/m;)V
    .locals 6

    instance-of v1, p1, Lcom/google/android/gms/common/api/k;

    if-eqz v1, :cond_0

    :try_start_0
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/common/api/k;

    move-object v1, v0

    invoke-interface {v1}, Lcom/google/android/gms/common/api/k;->b()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v1

    const-string v2, "TransformedResultImpl"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x12

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Unable to release "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/aiw;)Ljava/lang/ref/WeakReference;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->g:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method private c()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/g;

    iget-object v1, p0, Lcom/google/android/gms/internal/aiw;->c:Lcom/google/android/gms/common/api/o;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/aiw;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->e:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/aiw;)Lcom/google/android/gms/internal/aiw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->b:Lcom/google/android/gms/internal/aiw;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/p;)Lcom/google/android/gms/common/api/q;
    .locals 5
    .param p1    # Lcom/google/android/gms/common/api/p;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "Lcom/google/android/gms/common/api/m;",
            ">(",
            "Lcom/google/android/gms/common/api/p",
            "<-TR;+TS;>;)",
            "Lcom/google/android/gms/common/api/q",
            "<TS;>;"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/aiw;->e:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/aiw;->a:Lcom/google/android/gms/common/api/p;

    if-nez v2, :cond_0

    move v2, v0

    :goto_0
    const-string v4, "Cannot call then() twice."

    invoke-static {v2, v4}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/aiw;->c:Lcom/google/android/gms/common/api/o;

    if-nez v2, :cond_1

    :goto_1
    const-string v1, "Cannot call then() and andFinally() on the same TransformedResult."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/aiw;->a:Lcom/google/android/gms/common/api/p;

    new-instance v0, Lcom/google/android/gms/internal/aiw;

    iget-object v1, p0, Lcom/google/android/gms/internal/aiw;->g:Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/aiw;-><init>(Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/aiw;->b:Lcom/google/android/gms/internal/aiw;

    invoke-direct {p0}, Lcom/google/android/gms/internal/aiw;->b()V

    monitor-exit v3

    return-object v0

    :cond_0
    move v2, v1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/aiw;->c:Lcom/google/android/gms/common/api/o;

    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/i",
            "<*>;)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/aiw;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/aiw;->d:Lcom/google/android/gms/common/api/i;

    invoke-direct {p0}, Lcom/google/android/gms/internal/aiw;->b()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/google/android/gms/common/api/m;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/aiw;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/common/api/m;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->a:Lcom/google/android/gms/common/api/p;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/air;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/aiw$1;

    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/internal/aiw$1;-><init>(Lcom/google/android/gms/internal/aiw;Lcom/google/android/gms/common/api/m;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/aiw;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aiw;->c:Lcom/google/android/gms/common/api/o;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/o;->b(Lcom/google/android/gms/common/api/m;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    invoke-interface {p1}, Lcom/google/android/gms/common/api/m;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/aiw;->a(Lcom/google/android/gms/common/api/Status;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aiw;->b(Lcom/google/android/gms/common/api/m;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/o;)V
    .locals 5
    .param p1    # Lcom/google/android/gms/common/api/o;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/o",
            "<-TR;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/aiw;->e:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/aiw;->c:Lcom/google/android/gms/common/api/o;

    if-nez v2, :cond_0

    move v2, v0

    :goto_0
    const-string v4, "Cannot call andFinally() twice."

    invoke-static {v2, v4}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/aiw;->a:Lcom/google/android/gms/common/api/p;

    if-nez v2, :cond_1

    :goto_1
    const-string v1, "Cannot call then() and andFinally() on the same TransformedResult."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/aiw;->c:Lcom/google/android/gms/common/api/o;

    invoke-direct {p0}, Lcom/google/android/gms/internal/aiw;->b()V

    monitor-exit v3

    return-void

    :cond_0
    move v2, v1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
