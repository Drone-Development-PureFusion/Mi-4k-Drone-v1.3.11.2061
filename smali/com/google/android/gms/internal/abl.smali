.class public Lcom/google/android/gms/internal/abl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/abt$b;
.implements Lcom/google/android/gms/internal/tp$b;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private A:J

.field private B:I

.field private final a:Ljava/lang/Object;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/abm;

.field private d:Lcom/google/android/gms/internal/ti;

.field private e:Ljava/math/BigInteger;

.field private final f:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/abj;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/abo;",
            ">;"
        }
    .end annotation
.end field

.field private h:Z

.field private i:Z

.field private j:I

.field private k:Z

.field private l:Landroid/content/Context;

.field private m:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private n:Lcom/google/android/gms/internal/uh;

.field private o:Z

.field private p:Lcom/google/android/gms/internal/tq;

.field private q:Lcom/google/android/gms/internal/to;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/Boolean;

.field private t:Ljava/lang/String;

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Ljava/lang/String;

.field private z:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/abv;)V
    .locals 6

    const-wide/16 v4, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->e:Ljava/math/BigInteger;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->f:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->g:Ljava/util/HashMap;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/abl;->h:Z

    iput-boolean v3, p0, Lcom/google/android/gms/internal/abl;->i:Z

    iput v1, p0, Lcom/google/android/gms/internal/abl;->j:I

    iput-boolean v1, p0, Lcom/google/android/gms/internal/abl;->k:Z

    iput-object v2, p0, Lcom/google/android/gms/internal/abl;->n:Lcom/google/android/gms/internal/uh;

    iput-boolean v3, p0, Lcom/google/android/gms/internal/abl;->o:Z

    iput-object v2, p0, Lcom/google/android/gms/internal/abl;->p:Lcom/google/android/gms/internal/tq;

    iput-object v2, p0, Lcom/google/android/gms/internal/abl;->q:Lcom/google/android/gms/internal/to;

    iput-object v2, p0, Lcom/google/android/gms/internal/abl;->s:Ljava/lang/Boolean;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/abl;->u:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/abl;->v:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/abl;->w:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/abl;->x:Z

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->y:Ljava/lang/String;

    iput-wide v4, p0, Lcom/google/android/gms/internal/abl;->z:J

    iput-wide v4, p0, Lcom/google/android/gms/internal/abl;->A:J

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/abl;->B:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/abv;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->b:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/abm;

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/abm;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->c:Lcom/google/android/gms/internal/abm;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/google/android/gms/internal/abn;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 6

    iget-object v2, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v0, "app"

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->c:Lcom/google/android/gms/internal/abm;

    invoke-virtual {v1, p1, p3}, Lcom/google/android/gms/internal/abm;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->g:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->g:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/abo;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/abo;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    const-string v0, "slots"

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/abj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abj;->d()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const-string v0, "ads"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->f:Ljava/util/HashSet;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/abn;->a(Ljava/util/HashSet;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v3
.end method

.method public a(Landroid/content/Context;)Lcom/google/android/gms/internal/tq;
    .locals 8

    const/4 v1, 0x0

    sget-object v0, Lcom/google/android/gms/internal/uf;->Q:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/common/util/s;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/abl;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    monitor-exit v2

    move-object v0, v1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->q:Lcom/google/android/gms/internal/to;

    if-nez v0, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/to;

    invoke-direct {v0}, Lcom/google/android/gms/internal/to;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->q:Lcom/google/android/gms/internal/to;

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->p:Lcom/google/android/gms/internal/tq;

    if-nez v0, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/tq;

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->q:Lcom/google/android/gms/internal/to;

    new-instance v3, Lcom/google/android/gms/internal/zz;

    iget-object v4, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/internal/abl;->m:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/google/android/gms/internal/zz;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/tq;-><init>(Lcom/google/android/gms/internal/to;Lcom/google/android/gms/internal/zz;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->p:Lcom/google/android/gms/internal/tq;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->p:Lcom/google/android/gms/internal/tq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/tq;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->p:Lcom/google/android/gms/internal/tq;

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)Ljava/util/concurrent/Future;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/abl;->B:I

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/abt;->a(Landroid/content/Context;I)Ljava/util/concurrent/Future;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(J)Ljava/util/concurrent/Future;
    .locals 5

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/abl;->A:J

    cmp-long v0, v2, p1

    if-gez v0, :cond_0

    iput-wide p1, p0, Lcom/google/android/gms/internal/abl;->A:J

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/abt;->a(Landroid/content/Context;J)Ljava/util/concurrent/Future;

    move-result-object v0

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/concurrent/Future;
    .locals 4

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->k()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/abl;->z:J

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    if-eqz p2, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->y:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/internal/abl;->y:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/internal/abl;->z:J

    invoke-static {p1, p2, v2, v3}, Lcom/google/android/gms/internal/abt;->a(Landroid/content/Context;Ljava/lang/String;J)Ljava/util/concurrent/Future;

    move-result-object v0

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Landroid/content/Context;Z)Ljava/util/concurrent/Future;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/abl;->i:Z

    if-eq p2, v0, :cond_0

    iput-boolean p2, p0, Lcom/google/android/gms/internal/abl;->i:Z

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/abt;->a(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    move-result-object v0

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/String;)Ljava/util/concurrent/Future;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->r:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/abl;->r:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/abt;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/concurrent/Future;

    move-result-object v0

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/abl;->k:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/abl;->m:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->h()Lcom/google/android/gms/internal/tp;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/tp;->a(Lcom/google/android/gms/internal/tp$b;)V

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/abt;->a(Landroid/content/Context;Lcom/google/android/gms/internal/abt$b;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/abt;->b(Landroid/content/Context;Lcom/google/android/gms/internal/abt$b;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/abt;->c(Landroid/content/Context;Lcom/google/android/gms/internal/abt$b;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/abt;->d(Landroid/content/Context;Lcom/google/android/gms/internal/abt$b;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/abt;->e(Landroid/content/Context;Lcom/google/android/gms/internal/abt$b;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/abt;->f(Landroid/content/Context;Lcom/google/android/gms/internal/abt$b;)Ljava/util/concurrent/Future;

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/abt;->g(Landroid/content/Context;Lcom/google/android/gms/internal/abt$b;)Ljava/util/concurrent/Future;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/abl;->a(Ljava/lang/Thread;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v0

    iget-object v2, p2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/abv;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->t:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/common/util/s;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/security/NetworkSecurityPolicy;->getInstance()Landroid/security/NetworkSecurityPolicy;

    move-result-object v0

    invoke-virtual {v0}, Landroid/security/NetworkSecurityPolicy;->isCleartextTrafficPermitted()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/abl;->v:Z

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ti;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/abl;->m:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v4

    invoke-virtual {v4, p1, p2}, Lcom/google/android/gms/internal/abv;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)Lcom/google/android/gms/internal/wx;

    move-result-object v4

    invoke-direct {v0, v2, v3, v4}, Lcom/google/android/gms/internal/ti;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/wx;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->d:Lcom/google/android/gms/internal/ti;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/abl;->s()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->s()Lcom/google/android/gms/ads/internal/purchase/i;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/internal/purchase/i;->a(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/abl;->k:Z

    :cond_1
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    const-string v0, "use_https"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/abl;->i:Z

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/abl;->i:Z

    const-string v0, "webview_cache_version"

    iget v2, p0, Lcom/google/android/gms/internal/abl;->j:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/abl;->j:I

    const-string v0, "content_url_opted_out"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "content_url_opted_out"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/abl;->b(Z)V

    :cond_0
    const-string v0, "content_url_hashes"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "content_url_hashes"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->r:Ljava/lang/String;

    :cond_1
    const-string v0, "auto_collect_location"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/abl;->w:Z

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/abl;->w:Z

    const-string v0, "app_settings_json"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "app_settings_json"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->y:Ljava/lang/String;

    const-string v0, "app_settings_last_update_ms"

    iget-wide v2, p0, Lcom/google/android/gms/internal/abl;->z:J

    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/abl;->z:J

    const-string v0, "app_last_background_time_ms"

    iget-wide v2, p0, Lcom/google/android/gms/internal/abl;->A:J

    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/abl;->A:J

    const-string v0, "request_in_session_count"

    iget v2, p0, Lcom/google/android/gms/internal/abl;->B:I

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/abl;->B:I

    monitor-exit v1

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->y:Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/google/android/gms/internal/abj;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->f:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/Boolean;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/abl;->s:Ljava/lang/Boolean;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/internal/abo;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/Thread;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->m:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/zz;->a(Landroid/content/Context;Ljava/lang/Thread;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)Lcom/google/android/gms/internal/zz;

    return-void
.end method

.method public a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/internal/zz;

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/abl;->m:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/internal/zz;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zz;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/util/HashSet;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/abj;",
            ">;)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->f:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Z)V
    .locals 4

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->k()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/abl;->A:J

    sub-long v2, v0, v2

    sget-object v0, Lcom/google/android/gms/internal/uf;->aq:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->c:Lcom/google/android/gms/internal/abm;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abm;->a(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->c:Lcom/google/android/gms/internal/abm;

    iget v1, p0, Lcom/google/android/gms/internal/abl;->B:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abm;->a(I)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->k()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/abl;->a(J)Ljava/util/concurrent/Future;

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->c:Lcom/google/android/gms/internal/abm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abm;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/abl;->a(I)Ljava/util/concurrent/Future;

    goto :goto_0
.end method

.method public b(Landroid/content/Context;Z)Ljava/util/concurrent/Future;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/abl;->w:Z

    if-eq p2, v0, :cond_0

    iput-boolean p2, p0, Lcom/google/android/gms/internal/abl;->w:Z

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/abt;->c(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    move-result-object v0

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b(Z)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/abl;->o:Z

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/abt;->b(Landroid/content/Context;Z)Ljava/util/concurrent/Future;

    :cond_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/abl;->o:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/abl;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/tq;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/tq;->isAlive()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "start fetching content..."

    invoke-static {v2}, Lcom/google/android/gms/internal/abr;->c(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/tq;->a()V

    :cond_1
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/abl;->o:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c()Ljava/lang/String;
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->e:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/abl;->e:Ljava/math/BigInteger;

    sget-object v3, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v2, v3}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/abl;->e:Ljava/math/BigInteger;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/abl;->x:Z

    return-void
.end method

.method public d()Lcom/google/android/gms/internal/abm;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->c:Lcom/google/android/gms/internal/abm;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public d(Z)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/abl;->u:Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public e()Lcom/google/android/gms/internal/uh;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->n:Lcom/google/android/gms/internal/uh;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public f()Z
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/abl;->h:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/google/android/gms/internal/abl;->h:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public g()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/abl;->i:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/abl;->v:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public h()Ljava/lang/String;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->t:Ljava/lang/String;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public i()Ljava/lang/String;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->r:Ljava/lang/String;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public j()Ljava/lang/Boolean;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->s:Ljava/lang/Boolean;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public k()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/abl;->w:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public l()J
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-wide v2, p0, Lcom/google/android/gms/internal/abl;->A:J

    monitor-exit v1

    return-wide v2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public m()I
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/abl;->B:I

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/abl;->x:Z

    return v0
.end method

.method public o()Lcom/google/android/gms/internal/abk;
    .locals 6

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/abk;

    iget-object v2, p0, Lcom/google/android/gms/internal/abl;->y:Ljava/lang/String;

    iget-wide v4, p0, Lcom/google/android/gms/internal/abl;->z:J

    invoke-direct {v0, v2, v4, v5}, Lcom/google/android/gms/internal/abk;-><init>(Ljava/lang/String;J)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public p()Lcom/google/android/gms/internal/ti;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->d:Lcom/google/android/gms/internal/ti;

    return-object v0
.end method

.method public q()Landroid/content/res/Resources;
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->m:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->e:Z

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    sget-object v2, Lcom/google/android/gms/internal/akb;->a:Lcom/google/android/gms/internal/akb$b;

    const-string v3, "com.google.android.gms.ads.dynamite"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/akb;->a(Landroid/content/Context;Lcom/google/android/gms/internal/akb$b;Ljava/lang/String;)Lcom/google/android/gms/internal/akb;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/akb;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    :try_end_0
    .catch Lcom/google/android/gms/internal/akb$a; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Cannot load resource from dynamite apk or local jar"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public r()Z
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/abl;->u:Z

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method s()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ug;

    iget-object v1, p0, Lcom/google/android/gms/internal/abl;->l:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/abl;->m:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ug;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->l()Lcom/google/android/gms/internal/ui;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ui;->a(Lcom/google/android/gms/internal/ug;)Lcom/google/android/gms/internal/uh;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/abl;->n:Lcom/google/android/gms/internal/uh;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Cannot initialize CSI reporter."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
