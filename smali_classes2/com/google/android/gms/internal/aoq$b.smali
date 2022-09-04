.class Lcom/google/android/gms/internal/aoq$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/di$a;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aoq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aoq;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/aoq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/aoq;Lcom/google/android/gms/internal/aoq$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aoq$b;-><init>(Lcom/google/android/gms/internal/aoq;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/dm;)V
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/dm;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->c(Lcom/google/android/gms/internal/aoq;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/aoq$e;

    iget-object v2, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/aoq$e;-><init>(Lcom/google/android/gms/internal/aoq;Lcom/google/android/gms/internal/dm;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->c(Lcom/google/android/gms/internal/aoq;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/aoq$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/aoq$a;-><init>(Lcom/google/android/gms/internal/aoq;Lcom/google/android/gms/internal/aoq$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public run()V
    .locals 7
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;)I

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Z)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;Z)Z

    invoke-static {}, Lcom/google/android/gms/internal/apn;->a()Lcom/google/android/gms/internal/apn;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v3}, Lcom/google/android/gms/internal/aoq;->d(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/apn;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->h(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/di;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v1}, Lcom/google/android/gms/internal/aoq;->d(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v2}, Lcom/google/android/gms/internal/aoq;->e(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v3}, Lcom/google/android/gms/internal/aoq;->f(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v5}, Lcom/google/android/gms/internal/aoq;->g(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/aos;

    move-result-object v6

    move-object v5, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/di;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/di$a;Lcom/google/android/gms/internal/aos;)V

    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    iget-object v3, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v3}, Lcom/google/android/gms/internal/aoq;->g(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/aos;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/aos;->d()Z

    move-result v3

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;Z)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$b;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->k(Lcom/google/android/gms/internal/aoq;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2
.end method
