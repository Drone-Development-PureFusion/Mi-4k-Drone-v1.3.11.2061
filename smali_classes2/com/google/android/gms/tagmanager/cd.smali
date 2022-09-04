.class Lcom/google/android/gms/tagmanager/cd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/dm$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/tagmanager/cd$a;,
        Lcom/google/android/gms/tagmanager/cd$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/util/concurrent/ScheduledExecutorService;

.field private final d:Lcom/google/android/gms/tagmanager/cd$a;

.field private e:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation
.end field

.field private f:Z

.field private g:Lcom/google/android/gms/tagmanager/dq;

.field private h:Ljava/lang/String;

.field private i:Lcom/google/android/gms/tagmanager/av;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tagmanager/av",
            "<",
            "Lcom/google/android/gms/internal/gi$j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/dq;)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/tagmanager/cd;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/dq;Lcom/google/android/gms/tagmanager/cd$b;Lcom/google/android/gms/tagmanager/cd$a;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/dq;Lcom/google/android/gms/tagmanager/cd$b;Lcom/google/android/gms/tagmanager/cd$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/cd;->g:Lcom/google/android/gms/tagmanager/dq;

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cd;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/cd;->a:Ljava/lang/String;

    if-nez p4, :cond_0

    new-instance p4, Lcom/google/android/gms/tagmanager/cd$1;

    invoke-direct {p4, p0}, Lcom/google/android/gms/tagmanager/cd$1;-><init>(Lcom/google/android/gms/tagmanager/cd;)V

    :cond_0
    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/cd$b;->a()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->c:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez p5, :cond_1

    new-instance v0, Lcom/google/android/gms/tagmanager/cd$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/cd$2;-><init>(Lcom/google/android/gms/tagmanager/cd;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->d:Lcom/google/android/gms/tagmanager/cd$a;

    :goto_0
    return-void

    :cond_1
    iput-object p5, p0, Lcom/google/android/gms/tagmanager/cd;->d:Lcom/google/android/gms/tagmanager/cd$a;

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/tagmanager/cd;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->b:Landroid/content/Context;

    return-object v0
.end method

.method private declared-synchronized a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/cd;->f:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "called method after closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    monitor-exit p0

    return-void
.end method

.method private b(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/cc;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->d:Lcom/google/android/gms/tagmanager/cd$a;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cd;->g:Lcom/google/android/gms/tagmanager/dq;

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/cd$a;->a(Lcom/google/android/gms/tagmanager/dq;)Lcom/google/android/gms/tagmanager/cc;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cd;->i:Lcom/google/android/gms/tagmanager/av;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/cc;->a(Lcom/google/android/gms/tagmanager/av;)V

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cd;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/cc;->a(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tagmanager/cc;->b(Ljava/lang/String;)V

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/tagmanager/cd;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(JLjava/lang/String;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x37

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "loadAfterDelay: containerId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " delay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->e(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cd;->a()V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->i:Lcom/google/android/gms/tagmanager/av;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "callback must be set before loadAfterDelay() is called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->e:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->e:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {p0, p3}, Lcom/google/android/gms/tagmanager/cd;->b(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/cc;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->e:Ljava/util/concurrent/ScheduledFuture;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void
.end method

.method public declared-synchronized a(Lcom/google/android/gms/tagmanager/av;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tagmanager/av",
            "<",
            "Lcom/google/android/gms/internal/gi$j;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cd;->a()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cd;->i:Lcom/google/android/gms/tagmanager/av;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cd;->a()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cd;->h:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cd;->a()V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->e:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->e:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cd;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/cd;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
