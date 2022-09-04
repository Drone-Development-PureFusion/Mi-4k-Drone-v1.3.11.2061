.class public Lcom/google/android/gms/internal/nf;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 2
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/nf;->b:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lcom/google/android/gms/internal/nf;->b:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/nf;->a:Landroid/os/Handler;

    :goto_0
    return-void

    :cond_0
    iput-object v1, p0, Lcom/google/android/gms/internal/nf;->a:Landroid/os/Handler;

    goto :goto_0

    :cond_1
    iput-object v1, p0, Lcom/google/android/gms/internal/nf;->a:Landroid/os/Handler;

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/nf;->a:Landroid/os/Handler;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/nf;->b:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/nf;->b:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lcom/google/firebase/c/p;->a()Lcom/google/firebase/c/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/firebase/c/p;->d(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/nf;->a:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
