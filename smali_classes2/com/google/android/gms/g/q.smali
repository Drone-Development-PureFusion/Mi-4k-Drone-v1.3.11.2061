.class final Lcom/google/android/gms/g/q;
.super Lcom/google/android/gms/g/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/g/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/g/f",
        "<TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lcom/google/android/gms/g/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/g/p",
            "<TTResult;>;"
        }
    .end annotation
.end field

.field private c:Z

.field private d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTResult;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/Exception;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/g/f;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/g/q;->a:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/g/p;

    invoke-direct {v0}, Lcom/google/android/gms/g/p;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/g/q;->b:Lcom/google/android/gms/g/p;

    return-void
.end method

.method private e()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/g/q;->c:Z

    const-string v1, "Task is not yet complete"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    return-void
.end method

.method private f()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/g/q;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Task is already complete"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/g/q;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/g/q;->c:Z

    if-nez v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/g/q;->b:Lcom/google/android/gms/g/p;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/g/p;->a(Lcom/google/android/gms/g/f;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public a(Landroid/app/Activity;Lcom/google/android/gms/g/b;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/g/b",
            "<TTResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/l;

    sget-object v1, Lcom/google/android/gms/g/h;->a:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/g/l;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/b;)V

    iget-object v1, p0, Lcom/google/android/gms/g/q;->b:Lcom/google/android/gms/g/p;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/p;->a(Lcom/google/android/gms/g/o;)V

    invoke-static {p1}, Lcom/google/android/gms/g/q$a;->a(Landroid/app/Activity;)Lcom/google/android/gms/g/q$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/q$a;->a(Lcom/google/android/gms/g/o;)V

    invoke-direct {p0}, Lcom/google/android/gms/g/q;->g()V

    return-object p0
.end method

.method public a(Landroid/app/Activity;Lcom/google/android/gms/g/c;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/g/c;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/m;

    sget-object v1, Lcom/google/android/gms/g/h;->a:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/g/m;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/c;)V

    iget-object v1, p0, Lcom/google/android/gms/g/q;->b:Lcom/google/android/gms/g/p;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/p;->a(Lcom/google/android/gms/g/o;)V

    invoke-static {p1}, Lcom/google/android/gms/g/q$a;->a(Landroid/app/Activity;)Lcom/google/android/gms/g/q$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/q$a;->a(Lcom/google/android/gms/g/o;)V

    invoke-direct {p0}, Lcom/google/android/gms/g/q;->g()V

    return-object p0
.end method

.method public a(Landroid/app/Activity;Lcom/google/android/gms/g/d;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/g/d",
            "<-TTResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/n;

    sget-object v1, Lcom/google/android/gms/g/h;->a:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/g/n;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/d;)V

    iget-object v1, p0, Lcom/google/android/gms/g/q;->b:Lcom/google/android/gms/g/p;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/p;->a(Lcom/google/android/gms/g/o;)V

    invoke-static {p1}, Lcom/google/android/gms/g/q$a;->a(Landroid/app/Activity;)Lcom/google/android/gms/g/q$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/q$a;->a(Lcom/google/android/gms/g/o;)V

    invoke-direct {p0}, Lcom/google/android/gms/g/q;->g()V

    return-object p0
.end method

.method public a(Lcom/google/android/gms/g/a;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/android/gms/g/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/g/a",
            "<TTResult;TTContinuationResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/g/h;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/g/q;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/g/b;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/android/gms/g/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/b",
            "<TTResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/g/h;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/g/q;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/b;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/g/c;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/android/gms/g/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/c;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/g/h;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/g/q;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/c;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/g/d;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/android/gms/g/d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/d",
            "<-TTResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/g/h;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/g/q;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/d;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/a;)Lcom/google/android/gms/g/f;
    .locals 3
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/gms/g/a",
            "<TTResult;TTContinuationResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/q;

    invoke-direct {v0}, Lcom/google/android/gms/g/q;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/g/q;->b:Lcom/google/android/gms/g/p;

    new-instance v2, Lcom/google/android/gms/g/j;

    invoke-direct {v2, p1, p2, v0}, Lcom/google/android/gms/g/j;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/a;Lcom/google/android/gms/g/q;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/g/p;->a(Lcom/google/android/gms/g/o;)V

    invoke-direct {p0}, Lcom/google/android/gms/g/q;->g()V

    return-object v0
.end method

.method public a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/b;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/gms/g/b",
            "<TTResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/g/q;->b:Lcom/google/android/gms/g/p;

    new-instance v1, Lcom/google/android/gms/g/l;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/g/l;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/b;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/p;->a(Lcom/google/android/gms/g/o;)V

    invoke-direct {p0}, Lcom/google/android/gms/g/q;->g()V

    return-object p0
.end method

.method public a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/c;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/gms/g/c;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/g/q;->b:Lcom/google/android/gms/g/p;

    new-instance v1, Lcom/google/android/gms/g/m;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/g/m;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/c;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/p;->a(Lcom/google/android/gms/g/o;)V

    invoke-direct {p0}, Lcom/google/android/gms/g/q;->g()V

    return-object p0
.end method

.method public a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/d;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/gms/g/d",
            "<-TTResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/g/q;->b:Lcom/google/android/gms/g/p;

    new-instance v1, Lcom/google/android/gms/g/n;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/g/n;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/d;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/p;->a(Lcom/google/android/gms/g/o;)V

    invoke-direct {p0}, Lcom/google/android/gms/g/q;->g()V

    return-object p0
.end method

.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Class;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class",
            "<TX;>;)TTResult;^TX;"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/g/q;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/g/q;->e()V

    iget-object v0, p0, Lcom/google/android/gms/g/q;->e:Ljava/lang/Exception;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/g/q;->e:Ljava/lang/Exception;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/g/q;->e:Ljava/lang/Exception;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/g/e;

    iget-object v2, p0, Lcom/google/android/gms/g/q;->e:Ljava/lang/Exception;

    invoke-direct {v0, v2}, Lcom/google/android/gms/g/e;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/g/q;->d:Ljava/lang/Object;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 2
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/g/q;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/g/q;->f()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/g/q;->c:Z

    iput-object p1, p0, Lcom/google/android/gms/g/q;->e:Ljava/lang/Exception;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/g/q;->b:Lcom/google/android/gms/g/p;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/g/p;->a(Lcom/google/android/gms/g/f;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/g/q;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/g/q;->f()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/g/q;->c:Z

    iput-object p1, p0, Lcom/google/android/gms/g/q;->d:Ljava/lang/Object;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/g/q;->b:Lcom/google/android/gms/g/p;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/g/p;->a(Lcom/google/android/gms/g/f;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/g/q;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/g/q;->c:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b(Lcom/google/android/gms/g/a;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p1    # Lcom/google/android/gms/g/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/g/a",
            "<TTResult;",
            "Lcom/google/android/gms/g/f",
            "<TTContinuationResult;>;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/g/h;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/g/q;->b(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/a;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/a;)Lcom/google/android/gms/g/f;
    .locals 3
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/android/gms/g/a",
            "<TTResult;",
            "Lcom/google/android/gms/g/f",
            "<TTContinuationResult;>;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/q;

    invoke-direct {v0}, Lcom/google/android/gms/g/q;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/g/q;->b:Lcom/google/android/gms/g/p;

    new-instance v2, Lcom/google/android/gms/g/k;

    invoke-direct {v2, p1, p2, v0}, Lcom/google/android/gms/g/k;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/a;Lcom/google/android/gms/g/q;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/g/p;->a(Lcom/google/android/gms/g/o;)V

    invoke-direct {p0}, Lcom/google/android/gms/g/q;->g()V

    return-object v0
.end method

.method public b()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/g/q;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/g/q;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/g/q;->e:Ljava/lang/Exception;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/g/q;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/g/q;->e()V

    iget-object v0, p0, Lcom/google/android/gms/g/q;->e:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/g/e;

    iget-object v2, p0, Lcom/google/android/gms/g/q;->e:Ljava/lang/Exception;

    invoke-direct {v0, v2}, Lcom/google/android/gms/g/e;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/g/q;->d:Ljava/lang/Object;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0
.end method

.method public d()Ljava/lang/Exception;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/g/q;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/g/q;->e:Ljava/lang/Exception;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
