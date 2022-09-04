.class public Lcom/google/android/gms/internal/ic;
.super Ljava/lang/Object;


# instance fields
.field protected a:Lcom/google/android/gms/internal/kt;

.field protected b:Lcom/google/android/gms/internal/ig;

.field protected c:Lcom/google/android/gms/internal/hy;

.field protected d:Lcom/google/android/gms/internal/ip;

.field protected e:Ljava/lang/String;

.field protected f:Ljava/lang/String;

.field protected g:Lcom/google/android/gms/internal/kt$a;

.field protected h:Z

.field protected i:J

.field protected j:Lcom/google/firebase/b;

.field private k:Z

.field private l:Z

.field private m:Lcom/google/android/gms/internal/il;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/kt$a;->b:Lcom/google/android/gms/internal/kt$a;

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->g:Lcom/google/android/gms/internal/kt$a;

    const-wide/32 v0, 0xa00000

    iput-wide v0, p0, Lcom/google/android/gms/internal/ic;->i:J

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ic;->k:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ic;->l:Z

    return-void
.end method

.method private A()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "default"

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->e:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/hy;)Lcom/google/android/gms/internal/hm;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ic$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ic$1;-><init>(Lcom/google/android/gms/internal/hy;)V

    return-object v0
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Firebase/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "5"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/database/g;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private q()Lcom/google/android/gms/internal/il;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->m:Lcom/google/android/gms/internal/il;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/lz;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->r()V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->m:Lcom/google/android/gms/internal/il;

    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ih;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ih;->a:Lcom/google/android/gms/internal/ih;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ih;->b()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->m:Lcom/google/android/gms/internal/il;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/ii;->a:Lcom/google/android/gms/internal/ii;

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->m:Lcom/google/android/gms/internal/il;

    goto :goto_0
.end method

.method private declared-synchronized r()V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/gw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ic;->j:Lcom/google/firebase/b;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gw;-><init>(Lcom/google/firebase/b;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->m:Lcom/google/android/gms/internal/il;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private s()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->v()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->q()Lcom/google/android/gms/internal/il;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->y()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->x()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->w()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->A()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->z()V

    return-void
.end method

.method private t()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->b:Lcom/google/android/gms/internal/ig;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ig;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->d:Lcom/google/android/gms/internal/ip;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ip;->d()V

    return-void
.end method

.method private u()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ic;->m()Lcom/google/android/gms/internal/ip;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/me;

    if-nez v1, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Custom run loops are not supported!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast v0, Lcom/google/android/gms/internal/me;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/me;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method private v()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->a:Lcom/google/android/gms/internal/kt;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->q()Lcom/google/android/gms/internal/il;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ic;->g:Lcom/google/android/gms/internal/kt$a;

    const/4 v2, 0x0

    invoke-interface {v0, p0, v1, v2}, Lcom/google/android/gms/internal/il;->a(Lcom/google/android/gms/internal/ic;Lcom/google/android/gms/internal/kt$a;Ljava/util/List;)Lcom/google/android/gms/internal/kt;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->a:Lcom/google/android/gms/internal/kt;

    :cond_0
    return-void
.end method

.method private w()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->d:Lcom/google/android/gms/internal/ip;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->m:Lcom/google/android/gms/internal/il;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/il;->b(Lcom/google/android/gms/internal/ic;)Lcom/google/android/gms/internal/ip;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->d:Lcom/google/android/gms/internal/ip;

    :cond_0
    return-void
.end method

.method private x()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->b:Lcom/google/android/gms/internal/ig;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->q()Lcom/google/android/gms/internal/il;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/il;->a(Lcom/google/android/gms/internal/ic;)Lcom/google/android/gms/internal/ig;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->b:Lcom/google/android/gms/internal/ig;

    :cond_0
    return-void
.end method

.method private y()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->q()Lcom/google/android/gms/internal/il;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/il;->c(Lcom/google/android/gms/internal/ic;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ic;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->f:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private z()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->c:Lcom/google/android/gms/internal/hy;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->q()Lcom/google/android/gms/internal/il;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->u()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/il;->a(Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/hy;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ic;->c:Lcom/google/android/gms/internal/hy;

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/hp;Lcom/google/android/gms/internal/hr$a;)Lcom/google/android/gms/internal/hr;
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->q()Lcom/google/android/gms/internal/il;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ic;->i()Lcom/google/android/gms/internal/hn;

    move-result-object v1

    invoke-interface {v0, p0, v1, p1, p2}, Lcom/google/android/gms/internal/il;->a(Lcom/google/android/gms/internal/ic;Lcom/google/android/gms/internal/hn;Lcom/google/android/gms/internal/hp;Lcom/google/android/gms/internal/hr$a;)Lcom/google/android/gms/internal/hr;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/internal/ks;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ks;

    iget-object v1, p0, Lcom/google/android/gms/internal/ic;->a:Lcom/google/android/gms/internal/kt;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ks;-><init>(Lcom/google/android/gms/internal/kt;Ljava/lang/String;)V

    return-object v0
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ic;->k:Z

    return v0
.end method

.method b(Ljava/lang/String;)Lcom/google/android/gms/internal/jp;
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ic;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->m:Lcom/google/android/gms/internal/il;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/il;->a(Lcom/google/android/gms/internal/ic;Ljava/lang/String;)Lcom/google/android/gms/internal/jp;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You have enabled persistence, but persistence is not supported on this platform."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/jo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jo;-><init>()V

    :cond_1
    return-object v0
.end method

.method declared-synchronized b()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ic;->k:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ic;->k:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->s()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public c()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ic;->l:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->t()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ic;->l:Z

    :cond_0
    return-void
.end method

.method d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ic;->l:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->b:Lcom/google/android/gms/internal/ig;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ig;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->d:Lcom/google/android/gms/internal/ip;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ip;->c()V

    return-void
.end method

.method protected e()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ic;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/firebase/database/d;

    const-string v1, "Modifications to DatabaseConfig objects must occur before they are in use"

    invoke-direct {v0, v1}, Lcom/google/firebase/database/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public g()Lcom/google/android/gms/internal/kt$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->g:Lcom/google/android/gms/internal/kt$a;

    return-object v0
.end method

.method public h()Lcom/google/android/gms/internal/kt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->a:Lcom/google/android/gms/internal/kt;

    return-object v0
.end method

.method public i()Lcom/google/android/gms/internal/hn;
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/hn;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ic;->h()Lcom/google/android/gms/internal/kt;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ic;->p()Lcom/google/android/gms/internal/hy;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ic;->a(Lcom/google/android/gms/internal/hy;)Lcom/google/android/gms/internal/hm;

    move-result-object v2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ic;->u()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ic;->j()Z

    move-result v4

    invoke-static {}, Lcom/google/firebase/database/g;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ic;->n()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/hn;-><init>(Lcom/google/android/gms/internal/kt;Lcom/google/android/gms/internal/hm;Ljava/util/concurrent/ScheduledExecutorService;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ic;->h:Z

    return v0
.end method

.method public k()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ic;->i:J

    return-wide v0
.end method

.method public l()Lcom/google/android/gms/internal/ig;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->b:Lcom/google/android/gms/internal/ig;

    return-object v0
.end method

.method public m()Lcom/google/android/gms/internal/ip;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->d:Lcom/google/android/gms/internal/ip;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->f:Ljava/lang/String;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->e:Ljava/lang/String;

    return-object v0
.end method

.method public p()Lcom/google/android/gms/internal/hy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ic;->c:Lcom/google/android/gms/internal/hy;

    return-object v0
.end method
