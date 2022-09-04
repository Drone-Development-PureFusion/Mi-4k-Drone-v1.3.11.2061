.class public final Lcom/google/android/gms/g/i;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/g/i$c;,
        Lcom/google/android/gms/g/i$a;,
        Lcom/google/android/gms/g/i$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Exception;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p0    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/q;

    invoke-direct {v0}, Lcom/google/android/gms/g/q;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Lcom/google/android/gms/g/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(TTResult;)",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/q;

    invoke-direct {v0}, Lcom/google/android/gms/g/q;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/g/q;->a(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Ljava/util/Collection;)Lcom/google/android/gms/g/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+",
            "Lcom/google/android/gms/g/f",
            "<*>;>;)",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/g/i;->a(Ljava/lang/Object;)Lcom/google/android/gms/g/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/g/f;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null tasks are not accepted"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v1, Lcom/google/android/gms/g/q;

    invoke-direct {v1}, Lcom/google/android/gms/g/q;-><init>()V

    new-instance v2, Lcom/google/android/gms/g/i$c;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/g/i$c;-><init>(ILcom/google/android/gms/g/q;)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/g/f;

    invoke-static {v0, v2}, Lcom/google/android/gms/g/i;->a(Lcom/google/android/gms/g/f;Lcom/google/android/gms/g/i$b;)V

    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method public static a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/g/f;
    .locals 1
    .param p0    # Ljava/util/concurrent/Callable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TTResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/g/h;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, p0}, Lcom/google/android/gms/g/i;->a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p0    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/Callable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable",
            "<TTResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    const-string v0, "Executor must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Callback must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/g/q;

    invoke-direct {v0}, Lcom/google/android/gms/g/q;-><init>()V

    new-instance v1, Lcom/google/android/gms/g/i$1;

    invoke-direct {v1, v0, p1}, Lcom/google/android/gms/g/i$1;-><init>(Lcom/google/android/gms/g/q;Ljava/util/concurrent/Callable;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static varargs a([Lcom/google/android/gms/g/f;)Lcom/google/android/gms/g/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/g/f",
            "<*>;)",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    array-length v0, p0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/g/i;->a(Ljava/lang/Object;)Lcom/google/android/gms/g/f;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/g/i;->a(Ljava/util/Collection;)Lcom/google/android/gms/g/f;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Lcom/google/android/gms/g/f;)Ljava/lang/Object;
    .locals 2
    .param p0    # Lcom/google/android/gms/g/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;)TTResult;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/internal/d;->a()V

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/g/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/g/i;->b(Lcom/google/android/gms/g/f;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/g/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/g/i$a;-><init>(Lcom/google/android/gms/g/i$1;)V

    invoke-static {p0, v0}, Lcom/google/android/gms/g/i;->a(Lcom/google/android/gms/g/f;Lcom/google/android/gms/g/i$b;)V

    invoke-virtual {v0}, Lcom/google/android/gms/g/i$a;->a()V

    invoke-static {p0}, Lcom/google/android/gms/g/i;->b(Lcom/google/android/gms/g/f;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Lcom/google/android/gms/g/f;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 3
    .param p0    # Lcom/google/android/gms/g/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/TimeUnit;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TTResult;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/internal/d;->a()V

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "TimeUnit must not be null"

    invoke-static {p3, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/g/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/g/i;->b(Lcom/google/android/gms/g/f;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/g/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/g/i$a;-><init>(Lcom/google/android/gms/g/i$1;)V

    invoke-static {p0, v0}, Lcom/google/android/gms/g/i;->a(Lcom/google/android/gms/g/f;Lcom/google/android/gms/g/i$b;)V

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/g/i$a;->a(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/concurrent/TimeoutException;

    const-string v1, "Timed out waiting for Task"

    invoke-direct {v0, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/g/i;->b(Lcom/google/android/gms/g/f;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method private static a(Lcom/google/android/gms/g/f;Lcom/google/android/gms/g/i$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/f",
            "<*>;",
            "Lcom/google/android/gms/g/i$b;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/g/h;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/g/f;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/d;)Lcom/google/android/gms/g/f;

    sget-object v0, Lcom/google/android/gms/g/h;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/g/f;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/g/c;)Lcom/google/android/gms/g/f;

    return-void
.end method

.method private static b(Lcom/google/android/gms/g/f;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;)TTResult;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/g/f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/g/f;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, Lcom/google/android/gms/g/f;->d()Ljava/lang/Exception;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
