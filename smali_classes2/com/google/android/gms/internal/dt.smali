.class public Lcom/google/android/gms/internal/dt;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;

.field private b:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/dt;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/dt;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/dt;->c:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/dt;->b:Ljava/util/concurrent/ScheduledFuture;

    iput-object v0, p0, Lcom/google/android/gms/internal/dt;->c:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/dt;->a:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dt;->d:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/google/android/gms/internal/dl;JLcom/google/android/gms/internal/dh;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dt;->b:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dt;->b:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dt;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ds;

    iget-object v1, p0, Lcom/google/android/gms/internal/dt;->c:Ljava/lang/String;

    invoke-direct {v0, p1, p2, p5, v1}, Lcom/google/android/gms/internal/ds;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/dl;Lcom/google/android/gms/internal/dh;Ljava/lang/String;)V

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/dt;->a:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v0, p3, p4, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/dt;->b:Ljava/util/concurrent/ScheduledFuture;

    monitor-exit p0

    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ds;

    invoke-direct {v0, p1, p2, p5}, Lcom/google/android/gms/internal/ds;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/dl;Lcom/google/android/gms/internal/dh;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
