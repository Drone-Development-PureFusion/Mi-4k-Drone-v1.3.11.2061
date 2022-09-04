.class public abstract Lcom/google/android/gms/common/api/u;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lcom/google/android/gms/common/api/a$a;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/aim;

.field private final c:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<TO;>;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/common/api/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TO;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/android/gms/internal/ahh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahh",
            "<TO;>;"
        }
    .end annotation
.end field

.field private final f:Landroid/os/Looper;

.field private final g:I

.field private final h:Lcom/google/android/gms/internal/aic;

.field private final i:Lcom/google/android/gms/common/api/g;

.field private final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final k:Ljava/util/concurrent/atomic/AtomicInteger;

.field private l:Lcom/google/android/gms/common/api/a$f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$a;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/common/api/a",
            "<TO;>;TO;)V"
        }
    .end annotation

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    :goto_0
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/common/api/u;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$a;Landroid/os/Looper;)V

    return-void

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$a;Landroid/os/Looper;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/common/api/a",
            "<TO;>;TO;",
            "Landroid/os/Looper;",
            ")V"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/gms/common/api/u;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/common/api/u;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Looper must not be null."

    invoke-static {p4, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/api/u;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/common/api/u;->c:Lcom/google/android/gms/common/api/a;

    iput-object p3, p0, Lcom/google/android/gms/common/api/u;->d:Lcom/google/android/gms/common/api/a$a;

    iput-object p4, p0, Lcom/google/android/gms/common/api/u;->f:Landroid/os/Looper;

    new-instance v0, Lcom/google/android/gms/internal/aim;

    invoke-direct {v0}, Lcom/google/android/gms/internal/aim;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/u;->b:Lcom/google/android/gms/internal/aim;

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->c:Lcom/google/android/gms/common/api/a;

    iget-object v1, p0, Lcom/google/android/gms/common/api/u;->d:Lcom/google/android/gms/common/api/a$a;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ahh;->a(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$a;)Lcom/google/android/gms/internal/ahh;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/api/u;->e:Lcom/google/android/gms/internal/ahh;

    new-instance v0, Lcom/google/android/gms/internal/aid;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aid;-><init>(Lcom/google/android/gms/common/api/u;)V

    iput-object v0, p0, Lcom/google/android/gms/common/api/u;->i:Lcom/google/android/gms/common/api/g;

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->a:Landroid/content/Context;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/aic;->a(Landroid/content/Context;Lcom/google/android/gms/common/api/u;)Landroid/util/Pair;

    move-result-object v1

    iget-object v0, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/aic;

    iput-object v0, p0, Lcom/google/android/gms/common/api/u;->h:Lcom/google/android/gms/internal/aic;

    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/common/api/u;->g:I

    return-void
.end method

.method private a(ILcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p2    # Lcom/google/android/gms/internal/aiv;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/google/android/gms/common/api/a$c;",
            ">(I",
            "Lcom/google/android/gms/internal/aiv",
            "<TA;TTResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/g/g;

    invoke-direct {v0}, Lcom/google/android/gms/g/g;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/common/api/u;->h:Lcom/google/android/gms/internal/aic;

    invoke-virtual {v1, p0, p1, p2, v0}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/common/api/u;ILcom/google/android/gms/internal/aiv;Lcom/google/android/gms/g/g;)V

    invoke-virtual {v0}, Lcom/google/android/gms/g/g;->a()Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method private a(ILcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    .locals 1
    .param p2    # Lcom/google/android/gms/internal/ahl$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/a$c;",
            "T:",
            "Lcom/google/android/gms/internal/ahl$a",
            "<+",
            "Lcom/google/android/gms/common/api/m;",
            "TA;>;>(ITT;)TT;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ahl$a;->l()V

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->h:Lcom/google/android/gms/internal/aic;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/common/api/u;ILcom/google/android/gms/internal/ahl$a;)V

    return-object p2
.end method


# virtual methods
.method public a(Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/api/a$f;
    .locals 8
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/u;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->c:Lcom/google/android/gms/common/api/a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/a;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->c:Lcom/google/android/gms/common/api/a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/a;->c()Lcom/google/android/gms/common/api/a$i;

    move-result-object v2

    new-instance v0, Lcom/google/android/gms/common/internal/i;

    iget-object v1, p0, Lcom/google/android/gms/common/api/u;->a:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/a$i;->b()I

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/common/api/u;->a:Landroid/content/Context;

    invoke-static {v4}, Lcom/google/android/gms/common/internal/s;->a(Landroid/content/Context;)Lcom/google/android/gms/common/internal/s;

    move-result-object v6

    iget-object v4, p0, Lcom/google/android/gms/common/api/u;->d:Lcom/google/android/gms/common/api/a$a;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/common/api/a$i;->b(Ljava/lang/Object;)Lcom/google/android/gms/common/api/a$h;

    move-result-object v7

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/common/internal/i;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/a$h;)V

    iput-object v0, p0, Lcom/google/android/gms/common/api/u;->l:Lcom/google/android/gms/common/api/a$f;

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->l:Lcom/google/android/gms/common/api/a$f;

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->c:Lcom/google/android/gms/common/api/a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/a;->b()Lcom/google/android/gms/common/api/a$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/u;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/common/api/u;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/s;->a(Landroid/content/Context;)Lcom/google/android/gms/common/internal/s;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/common/api/u;->d:Lcom/google/android/gms/common/api/a$a;

    move-object v2, p1

    move-object v5, p2

    move-object v6, p3

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/common/api/a$b;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Ljava/lang/Object;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/api/u;->l:Lcom/google/android/gms/common/api/a$f;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/google/android/gms/common/api/a$c;",
            ">(",
            "Lcom/google/android/gms/internal/aiv",
            "<TA;TTResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/u;->a(ILcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    .locals 1
    .param p1    # Lcom/google/android/gms/internal/ahl$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/a$c;",
            "T:",
            "Lcom/google/android/gms/internal/ahl$a",
            "<+",
            "Lcom/google/android/gms/common/api/m;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/u;->a(ILcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 4

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/common/api/u;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/u;->b:Lcom/google/android/gms/internal/aim;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/aim;->a()V

    iget-object v1, p0, Lcom/google/android/gms/common/api/u;->h:Lcom/google/android/gms/internal/aic;

    iget v2, p0, Lcom/google/android/gms/common/api/u;->g:I

    iget-object v3, p0, Lcom/google/android/gms/common/api/u;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    if-lez v3, :cond_1

    :goto_1
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/aic;->a(IZ)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public b(Lcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lcom/google/android/gms/common/api/a$c;",
            ">(",
            "Lcom/google/android/gms/internal/aiv",
            "<TA;TTResult;>;)",
            "Lcom/google/android/gms/g/f",
            "<TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/u;->a(ILcom/google/android/gms/internal/aiv;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    .locals 1
    .param p1    # Lcom/google/android/gms/internal/ahl$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/a$c;",
            "T:",
            "Lcom/google/android/gms/internal/ahl$a",
            "<+",
            "Lcom/google/android/gms/common/api/m;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/u;->a(ILcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->h:Lcom/google/android/gms/internal/aic;

    iget v1, p0, Lcom/google/android/gms/common/api/u;->g:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/aic;->a(IZ)V

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->l:Lcom/google/android/gms/common/api/a$f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Lcom/google/android/gms/internal/ahh;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ahh",
            "<TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->e:Lcom/google/android/gms/internal/ahh;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/api/u;->g:I

    return v0
.end method

.method public g()Lcom/google/android/gms/common/api/g;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->i:Lcom/google/android/gms/common/api/g;

    return-object v0
.end method

.method public h()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/u;->f:Landroid/os/Looper;

    return-object v0
.end method
