.class Lcom/google/android/gms/tagmanager/dl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/tagmanager/dl$b;,
        Lcom/google/android/gms/tagmanager/dl$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/os/Looper;

.field private b:Lcom/google/android/gms/tagmanager/a;

.field private c:Lcom/google/android/gms/tagmanager/a;

.field private d:Lcom/google/android/gms/common/api/Status;

.field private e:Lcom/google/android/gms/tagmanager/dl$b;

.field private f:Lcom/google/android/gms/tagmanager/dl$a;

.field private g:Z

.field private h:Lcom/google/android/gms/tagmanager/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/dl;->d:Lcom/google/android/gms/common/api/Status;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->a:Landroid/os/Looper;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/tagmanager/f;Landroid/os/Looper;Lcom/google/android/gms/tagmanager/a;Lcom/google/android/gms/tagmanager/dl$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/dl;->h:Lcom/google/android/gms/tagmanager/f;

    if-eqz p2, :cond_0

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/tagmanager/dl;->a:Landroid/os/Looper;

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/dl;->b:Lcom/google/android/gms/tagmanager/a;

    iput-object p4, p0, Lcom/google/android/gms/tagmanager/dl;->f:Lcom/google/android/gms/tagmanager/dl$a;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->d:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/tagmanager/f;->a(Lcom/google/android/gms/tagmanager/dl;)I

    return-void

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    goto :goto_0
.end method

.method private g()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->e:Lcom/google/android/gms/tagmanager/dl$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->e:Lcom/google/android/gms/tagmanager/dl$b;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dl;->c:Lcom/google/android/gms/tagmanager/a;

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/dl$b;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->d:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public declared-synchronized a(Lcom/google/android/gms/tagmanager/a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/dl;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    if-nez p1, :cond_1

    :try_start_1
    const-string v0, "Unexpected null container."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :try_start_2
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/dl;->c:Lcom/google/android/gms/tagmanager/a;

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/dl;->g()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public declared-synchronized a(Lcom/google/android/gms/tagmanager/b$a;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/dl;->g:Z

    if-eqz v0, :cond_1

    const-string v0, "ContainerHolder is released."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    if-nez p1, :cond_2

    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->e:Lcom/google/android/gms/tagmanager/dl$b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    :try_start_2
    new-instance v0, Lcom/google/android/gms/tagmanager/dl$b;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dl;->a:Landroid/os/Looper;

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/tagmanager/dl$b;-><init>(Lcom/google/android/gms/tagmanager/dl;Lcom/google/android/gms/tagmanager/b$a;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->e:Lcom/google/android/gms/tagmanager/dl$b;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->c:Lcom/google/android/gms/tagmanager/a;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/dl;->g()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/dl;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->b:Lcom/google/android/gms/tagmanager/a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tagmanager/a;->i(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/dl;->g:Z

    if-eqz v0, :cond_0

    const-string v0, "Releasing a released ContainerHolder."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/dl;->g:Z

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->h:Lcom/google/android/gms/tagmanager/f;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/tagmanager/f;->b(Lcom/google/android/gms/tagmanager/dl;)Z

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->b:Lcom/google/android/gms/tagmanager/a;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/a;->e()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->b:Lcom/google/android/gms/tagmanager/a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->c:Lcom/google/android/gms/tagmanager/a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->f:Lcom/google/android/gms/tagmanager/dl$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->e:Lcom/google/android/gms/tagmanager/dl$b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method b(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/dl;->g:Z

    if-eqz v0, :cond_0

    const-string v0, "setCtfeUrlPathAndQuery called on a released ContainerHolder."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->f:Lcom/google/android/gms/tagmanager/dl$a;

    invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/dl$a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public declared-synchronized c()Lcom/google/android/gms/tagmanager/a;
    .locals 2

    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/tagmanager/dl;->g:Z

    if-eqz v1, :cond_0

    const-string v1, "ContainerHolder is released."

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->c:Lcom/google/android/gms/tagmanager/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->c:Lcom/google/android/gms/tagmanager/a;

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->b:Lcom/google/android/gms/tagmanager/a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->c:Lcom/google/android/gms/tagmanager/a;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->b:Lcom/google/android/gms/tagmanager/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/dl;->g:Z

    if-eqz v0, :cond_0

    const-string v0, "Refreshing a released ContainerHolder."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->f:Lcom/google/android/gms/tagmanager/dl$a;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/dl$a;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method e()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/dl;->g:Z

    if-eqz v0, :cond_0

    const-string v0, "getContainerId called on a released ContainerHolder."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->b:Lcom/google/android/gms/tagmanager/a;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/a;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method f()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/dl;->g:Z

    if-eqz v0, :cond_0

    const-string v0, "setCtfeUrlPathAndQuery called on a released ContainerHolder."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl;->f:Lcom/google/android/gms/tagmanager/dl$a;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/dl$a;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
