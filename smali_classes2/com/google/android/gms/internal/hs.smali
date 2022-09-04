.class public Lcom/google/android/gms/internal/hs;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hl$a;
.implements Lcom/google/android/gms/internal/hr;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/hs$b;,
        Lcom/google/android/gms/internal/hs$d;,
        Lcom/google/android/gms/internal/hs$f;,
        Lcom/google/android/gms/internal/hs$e;,
        Lcom/google/android/gms/internal/hs$c;,
        Lcom/google/android/gms/internal/hs$a;
    }
.end annotation


# static fields
.field static final synthetic a:Z

.field private static b:J


# instance fields
.field private A:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation
.end field

.field private B:J

.field private C:Z

.field private final c:Lcom/google/android/gms/internal/hr$a;

.field private final d:Lcom/google/android/gms/internal/hp;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:J

.field private i:Lcom/google/android/gms/internal/hl;

.field private j:Lcom/google/android/gms/internal/hs$b;

.field private k:J

.field private l:J

.field private m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Long;",
            "Lcom/google/android/gms/internal/hs$a;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/hs$d;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Long;",
            "Lcom/google/android/gms/internal/hs$f;",
            ">;"
        }
    .end annotation
.end field

.field private p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/hs$c;",
            "Lcom/google/android/gms/internal/hs$e;",
            ">;"
        }
    .end annotation
.end field

.field private q:Ljava/lang/String;

.field private r:Z

.field private final s:Lcom/google/android/gms/internal/hn;

.field private final t:Lcom/google/android/gms/internal/hm;

.field private final u:Ljava/util/concurrent/ScheduledExecutorService;

.field private final v:Lcom/google/android/gms/internal/ks;

.field private final w:Lcom/google/android/gms/internal/hw;

.field private x:Ljava/lang/String;

.field private y:J

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/hs;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/hs;->a:Z

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/google/android/gms/internal/hs;->b:J

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/hn;Lcom/google/android/gms/internal/hp;Lcom/google/android/gms/internal/hr$a;)V
    .locals 8

    const/4 v7, 0x0

    const-wide/16 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->f:Ljava/util/HashSet;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hs;->g:Z

    sget-object v0, Lcom/google/android/gms/internal/hs$b;->a:Lcom/google/android/gms/internal/hs$b;

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    iput-wide v2, p0, Lcom/google/android/gms/internal/hs;->k:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/hs;->l:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/hs;->y:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/hs;->z:I

    iput-object v7, p0, Lcom/google/android/gms/internal/hs;->A:Ljava/util/concurrent/ScheduledFuture;

    iput-object p3, p0, Lcom/google/android/gms/internal/hs;->c:Lcom/google/android/gms/internal/hr$a;

    iput-object p1, p0, Lcom/google/android/gms/internal/hs;->s:Lcom/google/android/gms/internal/hn;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hn;->c()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->u:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hn;->b()Lcom/google/android/gms/internal/hm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->t:Lcom/google/android/gms/internal/hm;

    iput-object p2, p0, Lcom/google/android/gms/internal/hs;->d:Lcom/google/android/gms/internal/hp;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->p:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->m:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->o:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->n:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/internal/hw$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->u:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hn;->a()Lcom/google/android/gms/internal/kt;

    move-result-object v2

    const-string v3, "ConnectionRetryHelper"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/hw$a;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/kt;Ljava/lang/String;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/hw$a;->a(J)Lcom/google/android/gms/internal/hw$a;

    move-result-object v0

    const-wide v2, 0x3ff4cccccccccccdL    # 1.3

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/hw$a;->a(D)Lcom/google/android/gms/internal/hw$a;

    move-result-object v0

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/hw$a;->b(J)Lcom/google/android/gms/internal/hw$a;

    move-result-object v0

    const-wide v2, 0x3fe6666666666666L    # 0.7

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/hw$a;->b(D)Lcom/google/android/gms/internal/hw$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hw$a;->a()Lcom/google/android/gms/internal/hw;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->w:Lcom/google/android/gms/internal/hw;

    sget-wide v0, Lcom/google/android/gms/internal/hs;->b:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    sput-wide v2, Lcom/google/android/gms/internal/hs;->b:J

    new-instance v2, Lcom/google/android/gms/internal/ks;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hn;->a()Lcom/google/android/gms/internal/kt;

    move-result-object v3

    const-string v4, "PersistentConnection"

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x17

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "pc_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v4, v0}, Lcom/google/android/gms/internal/ks;-><init>(Lcom/google/android/gms/internal/kt;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    iput-object v7, p0, Lcom/google/android/gms/internal/hs;->x:Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->q()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hs;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/hs;->z:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hs;Lcom/google/android/gms/internal/hs$b;)Lcom/google/android/gms/internal/hs$b;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    return-object p1
.end method

.method private a(Lcom/google/android/gms/internal/hs$c;)Lcom/google/android/gms/internal/hs$e;
    .locals 5

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xf

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "removing query "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->p:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x40

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Trying to remove listener for QuerySpec "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " but no listener exists."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->p:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hs$e;

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->p:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->q()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hs;Lcom/google/android/gms/internal/hs$c;)Lcom/google/android/gms/internal/hs$e;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/hs;->a(Lcom/google/android/gms/internal/hs$c;)Lcom/google/android/gms/internal/hs$e;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/internal/ks;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hs;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hs;->q:Ljava/lang/String;

    return-object p1
.end method

.method private a(Ljava/util/List;)Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/internal/hs$e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1d

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "removing all listens at path "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/hs$c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hs$e;

    invoke-static {v1}, Lcom/google/android/gms/internal/hs$c;->a(Lcom/google/android/gms/internal/hs$c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hs$e;

    iget-object v3, p0, Lcom/google/android/gms/internal/hs;->p:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs$e;->a()Lcom/google/android/gms/internal/hs$c;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->q()V

    return-object v2
.end method

.method private a(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "p"

    invoke-static {p1}, Lcom/google/android/gms/internal/ho;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "d"

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    const-string v1, "h"

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hs;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hs;->A:Ljava/util/concurrent/ScheduledFuture;

    return-object p1
.end method

.method private a(J)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v1, "handling timestamp"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v0, p1, v0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "serverTimeOffset"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->c:Lcom/google/android/gms/internal/hr$a;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/hr$a;->a(Ljava/util/Map;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/hs$e;)V
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "p"

    invoke-static {p1}, Lcom/google/android/gms/internal/hs$e;->a(Lcom/google/android/gms/internal/hs$e;)Lcom/google/android/gms/internal/hs$c;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/hs$c;->a(Lcom/google/android/gms/internal/hs$c;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ho;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hs$e;->b()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "q"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hs$e;->a()Lcom/google/android/gms/internal/hs$c;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/hs$c;->b(Lcom/google/android/gms/internal/hs$c;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "t"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v1, "n"

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/hs$a;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hs;Ljava/util/List;Lcom/google/android/gms/internal/hs$c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/hs;->a(Ljava/util/List;Lcom/google/android/gms/internal/hs$c;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x17

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Auth token revoked: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->q:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hs;->r:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->c:Lcom/google/android/gms/internal/hr$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/hr$a;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->i:Lcom/google/android/gms/internal/hl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hl;->b()V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/hu;",
            ")V"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "p"

    invoke-static {p2}, Lcom/google/android/gms/internal/ho;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "d"

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/hs$2;

    invoke-direct {v1, p0, p4}, Lcom/google/android/gms/internal/hs$2;-><init>(Lcom/google/android/gms/internal/hs;Lcom/google/android/gms/internal/hu;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/hs$a;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/hu;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/hu;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p2, p3, p4}, Lcom/google/android/gms/internal/hs;->a(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/hs;->k:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/google/android/gms/internal/hs;->k:J

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->o:Ljava/util/Map;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/internal/hs$f;

    const/4 v6, 0x0

    invoke-direct {v5, p1, v0, p5, v6}, Lcom/google/android/gms/internal/hs$f;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/hu;Lcom/google/android/gms/internal/hs$1;)V

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/hs;->b(J)V

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/hs;->B:J

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->q()V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v4, 0x0

    const/4 v10, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v3, v5

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "handleServerMessage: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v10, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-string v0, "d"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "m"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_1
    const-string v0, "m"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v0, "p"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "d"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v1, "t"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ho;->a(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v4

    if-eqz v3, :cond_4

    instance-of v1, v2, Ljava/util/Map;

    if-eqz v1, :cond_4

    move-object v1, v2

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v2, "ignoring empty merge for path "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-array v2, v10, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-void

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    invoke-static {v0}, Lcom/google/android/gms/internal/ho;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->c:Lcom/google/android/gms/internal/hr$a;

    invoke-interface {v1, v0, v2, v3, v4}, Lcom/google/android/gms/internal/hr$a;->a(Ljava/util/List;Ljava/lang/Object;ZLjava/lang/Long;)V

    goto :goto_1

    :cond_5
    const-string v0, "rm"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "p"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ho;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    const-string v1, "d"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "t"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ho;->a(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v7

    check-cast v1, Ljava/util/List;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    const-string v2, "s"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "e"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v2, :cond_6

    invoke-static {v2}, Lcom/google/android/gms/internal/ho;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    move-object v5, v2

    :goto_3
    if-eqz v3, :cond_7

    invoke-static {v3}, Lcom/google/android/gms/internal/ho;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    :goto_4
    const-string v3, "m"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/internal/ht;

    invoke-direct {v3, v5, v2, v1}, Lcom/google/android/gms/internal/ht;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Object;)V

    invoke-interface {v8, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    move-object v5, v4

    goto :goto_3

    :cond_7
    move-object v2, v4

    goto :goto_4

    :cond_8
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v2, "Ignoring empty range merge for path "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_5
    new-array v2, v10, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_9
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->c:Lcom/google/android/gms/internal/hr$a;

    invoke-interface {v0, v6, v8, v7}, Lcom/google/android/gms/internal/hr$a;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V

    goto/16 :goto_1

    :cond_b
    const-string v0, "c"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "p"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ho;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hs;->b(Ljava/util/List;)V

    goto/16 :goto_1

    :cond_c
    const-string v0, "ac"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "s"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "d"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_d
    const-string v0, "sd"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/hs;->b(Ljava/util/Map;)V

    goto/16 :goto_1

    :cond_e
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v2, "Unrecognized action from server: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_f

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_6
    new-array v2, v10, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_f
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_6
.end method

.method private a(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/hs$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/android/gms/internal/hs$a;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2, p3}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;ZLjava/util/Map;Lcom/google/android/gms/internal/hs$a;)V

    return-void
.end method

.method private a(Ljava/lang/String;ZLjava/util/Map;Lcom/google/android/gms/internal/hs$a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/android/gms/internal/hs$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->p()J

    move-result-wide v0

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "r"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "a"

    invoke-interface {v2, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "b"

    invoke-interface {v2, v3, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/internal/hs;->i:Lcom/google/android/gms/internal/hl;

    invoke-virtual {v3, v2, p2}, Lcom/google/android/gms/internal/hl;->a(Ljava/util/Map;Z)V

    iget-object v2, p0, Lcom/google/android/gms/internal/hs;->m:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private a(Ljava/util/List;Lcom/google/android/gms/internal/hs$c;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/hs$c;",
            ")V"
        }
    .end annotation

    const-string v0, "no_index"

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/hs$c;->b(Lcom/google/android/gms/internal/hs$c;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "i"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xe

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "\".indexOn\": \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-static {p2}, Lcom/google/android/gms/internal/hs$c;->a(Lcom/google/android/gms/internal/hs$c;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ho;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x76

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Using an unspecified index. Consider adding \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "\' at "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " to your security and Firebase Database rules for better performance"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private a(Z)V
    .locals 6

    const/4 v2, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->f()Z

    move-result v0

    const-string v3, "Must be connected to send auth, but was: %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/internal/ho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->q:Ljava/lang/String;

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "Auth token must be set to authenticate!"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v3, v2}, Lcom/google/android/gms/internal/ho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/internal/hs$3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/hs$3;-><init>(Lcom/google/android/gms/internal/hs;Z)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/hs;->q:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/ma;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ma;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v4, "cred"

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ma;->a()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ma;->b()Ljava/util/Map;

    move-result-object v4

    if-eqz v4, :cond_0

    const-string v4, "authvar"

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ma;->b()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v3, "gauth"

    invoke-direct {p0, v3, v1, v2, v0}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;ZLjava/util/Map;Lcom/google/android/gms/internal/hs$a;)V

    :goto_1
    return-void

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    const-string v3, "cred"

    iget-object v4, p0, Lcom/google/android/gms/internal/hs;->q:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "auth"

    invoke-direct {p0, v3, v1, v2, v0}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;ZLjava/util/Map;Lcom/google/android/gms/internal/hs$a;)V

    goto :goto_1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hs;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/hs;->r:Z

    return p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/internal/hs$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    return-object v0
.end method

.method private b(J)V
    .locals 9

    sget-boolean v0, Lcom/google/android/gms/internal/hs;->a:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->g()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "sendPut called when we can\'t send writes (we\'re disconnected or writes are paused)."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->o:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/hs$f;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/hs$f;->c()Lcom/google/android/gms/internal/hu;

    move-result-object v7

    invoke-virtual {v6}, Lcom/google/android/gms/internal/hs$f;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/google/android/gms/internal/hs$f;->d()V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/hs$f;->b()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/hs$4;

    move-object v2, p0

    move-wide v4, p1

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/hs$4;-><init>(Lcom/google/android/gms/internal/hs;Ljava/lang/String;JLcom/google/android/gms/internal/hs$f;Lcom/google/android/gms/internal/hu;)V

    invoke-direct {p0, v3, v0, v1}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/hs$a;)V

    return-void
.end method

.method private b(Lcom/google/android/gms/internal/hs$e;)V
    .locals 5

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "p"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hs$e;->a()Lcom/google/android/gms/internal/hs$c;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/hs$c;->a(Lcom/google/android/gms/internal/hs$c;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ho;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hs$e;->b()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v2, "q"

    invoke-static {p1}, Lcom/google/android/gms/internal/hs$e;->a(Lcom/google/android/gms/internal/hs$e;)Lcom/google/android/gms/internal/hs$c;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/hs$c;->b(Lcom/google/android/gms/internal/hs$c;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "t"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/hs$e;->c()Lcom/google/android/gms/internal/hq;

    move-result-object v0

    const-string v2, "h"

    invoke-interface {v0}, Lcom/google/android/gms/internal/hq;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hq;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/internal/hq;->c()Lcom/google/android/gms/internal/hk;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/hk;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/ho;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v4, "hs"

    invoke-virtual {v2}, Lcom/google/android/gms/internal/hk;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "ps"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "ch"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string v0, "q"

    new-instance v2, Lcom/google/android/gms/internal/hs$5;

    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/internal/hs$5;-><init>(Lcom/google/android/gms/internal/hs;Lcom/google/android/gms/internal/hs$e;)V

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/hs$a;)V

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/hs;->a(Ljava/util/List;)Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hs$e;

    invoke-static {v0}, Lcom/google/android/gms/internal/hs$e;->b(Lcom/google/android/gms/internal/hs$e;)Lcom/google/android/gms/internal/hu;

    move-result-object v0

    const-string v2, "permission_denied"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/hu;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private b(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v0, "msg"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ks;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/internal/hs;)J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/hs;->y:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/google/android/gms/internal/hs;->y:J

    return-wide v0
.end method

.method private c(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "c"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "s"

    new-instance v2, Lcom/google/android/gms/internal/hs$6;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/hs$6;-><init>(Lcom/google/android/gms/internal/hs;)V

    invoke-direct {p0, v1, v0, v2}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/hs$a;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v1, "Not sending stats because stats are empty"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/hs;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/hs;->y:J

    return-wide v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/hs;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->h()V

    return-void
.end method

.method static synthetic f(Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/internal/hm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->t:Lcom/google/android/gms/internal/hm;

    return-object v0
.end method

.method private f()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    sget-object v1, Lcom/google/android/gms/internal/hs$b;->d:Lcom/google/android/gms/internal/hs$b;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    sget-object v1, Lcom/google/android/gms/internal/hs$b;->e:Lcom/google/android/gms/internal/hs$b;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/internal/hr$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->c:Lcom/google/android/gms/internal/hr$a;

    return-object v0
.end method

.method private g()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    sget-object v1, Lcom/google/android/gms/internal/hs$b;->e:Lcom/google/android/gms/internal/hs$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private h()V
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hs;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    sget-object v3, Lcom/google/android/gms/internal/hs$b;->a:Lcom/google/android/gms/internal/hs$b;

    if-ne v0, v3, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "Not in disconnected state: %s"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/internal/ho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hs;->r:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v3, "Scheduling connection attempt"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v2, p0, Lcom/google/android/gms/internal/hs;->r:Z

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->w:Lcom/google/android/gms/internal/hw;

    new-instance v2, Lcom/google/android/gms/internal/hs$1;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/hs$1;-><init>(Lcom/google/android/gms/internal/hs;Z)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/hw;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :cond_1
    move v0, v2

    goto :goto_0
.end method

.method static synthetic h(Lcom/google/android/gms/internal/hs;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->n()V

    return-void
.end method

.method static synthetic i(Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/internal/hl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->i:Lcom/google/android/gms/internal/hl;

    return-object v0
.end method

.method private i()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hs$f;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs$f;->b()Ljava/util/Map;

    move-result-object v2

    const-string v3, "h"

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs$f;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs$f;->c()Lcom/google/android/gms/internal/hu;

    move-result-object v0

    const-string v2, "disconnected"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/hu;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic j(Lcom/google/android/gms/internal/hs;)I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/hs;->z:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/hs;->z:I

    return v0
.end method

.method private j()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hs;->a(Z)V

    return-void
.end method

.method static synthetic k(Lcom/google/android/gms/internal/hs;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/hs;->z:I

    return v0
.end method

.method private k()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hs;->a(Z)V

    return-void
.end method

.method static synthetic l(Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/internal/hw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->w:Lcom/google/android/gms/internal/hw;

    return-object v0
.end method

.method private l()V
    .locals 4

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->f()Z

    move-result v0

    const-string v2, "Must be connected to send unauth."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/ho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->q:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "Auth token must not be set."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "unauth"

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/hs$a;)V

    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method static synthetic m(Lcom/google/android/gms/internal/hs;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->o:Ljava/util/Map;

    return-object v0
.end method

.method private m()V
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v3, "calling restore state"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    sget-object v3, Lcom/google/android/gms/internal/hs$b;->c:Lcom/google/android/gms/internal/hs$b;

    if-ne v0, v3, :cond_2

    move v0, v1

    :goto_0
    const-string v3, "Wanted to restore auth, but was in wrong state: %s"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/internal/ho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->q:Ljava/lang/String;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v1, "Not restoring auth because token is null."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/hs$b;->e:Lcom/google/android/gms/internal/hs$b;

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->n()V

    :goto_1
    return-void

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v1, "Restoring auth."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/hs$b;->d:Lcom/google/android/gms/internal/hs$b;

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->k()V

    goto :goto_1
.end method

.method private n()V
    .locals 7

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    sget-object v3, Lcom/google/android/gms/internal/hs$b;->e:Lcom/google/android/gms/internal/hs$b;

    if-ne v0, v3, :cond_2

    move v0, v1

    :goto_0
    const-string v3, "Should be connected if we\'re restoring state, but we are: %s"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/internal/ho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v1, "Restoring outstanding listens"

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hs$e;

    iget-object v3, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs$e;->a()Lcom/google/android/gms/internal/hs$c;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x11

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Restoring listen "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hs;->b(Lcom/google/android/gms/internal/hs$e;)V

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v1, "Restoring writes."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->o:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/hs;->b(J)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hs$d;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs$d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs$d;->b()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs$d;->c()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs$d;->d()Lcom/google/android/gms/internal/hu;

    move-result-object v0

    invoke-direct {p0, v2, v3, v4, v0}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method static synthetic n(Lcom/google/android/gms/internal/hs;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->q()V

    return-void
.end method

.method static synthetic o(Lcom/google/android/gms/internal/hs;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->p:Ljava/util/Map;

    return-object v0
.end method

.method private o()V
    .locals 6

    const/16 v5, 0x2e

    const/16 v3, 0x2d

    const/4 v4, 0x1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/lz;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->s:Lcom/google/android/gms/internal/hn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hn;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "persistence.android.enabled"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v2, "sdk.android."

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->s:Lcom/google/android/gms/internal/hn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hn;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v2, "Sending first connection stats"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/hs;->c(Ljava/util/Map;)V

    return-void

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    sget-boolean v0, Lcom/google/android/gms/internal/hs;->a:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->s:Lcom/google/android/gms/internal/hn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hn;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Stats for persistence on JVM missing (persistence not yet supported)"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_4
    const-string v2, "sdk.java."

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->s:Lcom/google/android/gms/internal/hn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hn;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_2
.end method

.method private p()J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/internal/hs;->l:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/google/android/gms/internal/hs;->l:J

    return-wide v0
.end method

.method static synthetic p(Lcom/google/android/gms/internal/hs;)Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->s()Z

    move-result v0

    return v0
.end method

.method private q()V
    .locals 5

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->r()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->A:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->A:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->u:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/google/android/gms/internal/hs$7;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/hs$7;-><init>(Lcom/google/android/gms/internal/hs;)V

    const-wide/32 v2, 0xea60

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->A:Ljava/util/concurrent/ScheduledFuture;

    :cond_1
    :goto_0
    return-void

    :cond_2
    const-string v1, "connection_idle"

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/hs;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->r()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v0, 0x1

    :cond_3
    invoke-static {v0}, Lcom/google/android/gms/internal/ho;->a(Z)V

    const-string v0, "connection_idle"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/hs;->e(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private r()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hs;->C:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private s()Z
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->r()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/internal/hs;->B:J

    const-wide/32 v4, 0xea60

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->h()V

    return-void
.end method

.method public a(JLjava/lang/String;)V
    .locals 5

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v1, "onReady"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/hs;->h:J

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/hs;->a(J)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hs;->g:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->o()V

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->m()V

    iput-boolean v3, p0, Lcom/google/android/gms/internal/hs;->g:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/hs;->x:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->c:Lcom/google/android/gms/internal/hr$a;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hr$a;->a()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/hl$b;)V
    .locals 8

    const-wide/16 v6, 0x0

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v3, "Got on disconnect due to "

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hl$b;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/hs$b;->a:Lcom/google/android/gms/internal/hs$b;

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->i:Lcom/google/android/gms/internal/hl;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/hs;->C:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->i()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hs;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/google/android/gms/internal/hs;->h:J

    sub-long/2addr v2, v4

    iget-wide v4, p0, Lcom/google/android/gms/internal/hs;->h:J

    cmp-long v0, v4, v6

    if-lez v0, :cond_6

    const-wide/16 v4, 0x7530

    cmp-long v0, v2, v4

    if-lez v0, :cond_5

    const/4 v0, 0x1

    :goto_1
    sget-object v1, Lcom/google/android/gms/internal/hl$b;->a:Lcom/google/android/gms/internal/hl$b;

    if-eq p1, v1, :cond_1

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->w:Lcom/google/android/gms/internal/hw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hw;->a()V

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->h()V

    :cond_3
    iput-wide v6, p0, Lcom/google/android/gms/internal/hs;->h:J

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->c:Lcom/google/android/gms/internal/hr$a;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hr$a;->b()V

    return-void

    :cond_4
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_1

    :cond_6
    move v0, v1

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hs;->e:Ljava/lang/String;

    return-void
.end method

.method public a(Ljava/util/List;Lcom/google/android/gms/internal/hu;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/hu;",
            ")V"
        }
    .end annotation

    const/4 v3, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "oc"

    invoke-direct {p0, v0, p1, v3, p2}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V

    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->q()V

    return-void

    :cond_0
    iget-object v6, p0, Lcom/google/android/gms/internal/hs;->n:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/internal/hs$d;

    const-string v1, "oc"

    move-object v2, p1

    move-object v4, p2

    move-object v5, v3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hs$d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;Lcom/google/android/gms/internal/hs$1;)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public a(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/hu;",
            ")V"
        }
    .end annotation

    const-string v1, "p"

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public a(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/hu;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/hu;",
            ")V"
        }
    .end annotation

    const-string v1, "p"

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public a(Ljava/util/List;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/hs$c;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/hs$c;-><init>(Ljava/util/List;Ljava/util/Map;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0xf

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "unlistening on "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hs;->a(Lcom/google/android/gms/internal/hs$c;)Lcom/google/android/gms/internal/hs$e;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hs;->a(Lcom/google/android/gms/internal/hs$e;)V

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->q()V

    return-void
.end method

.method public a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/hq;Ljava/lang/Long;Lcom/google/android/gms/internal/hu;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/android/gms/internal/hq;",
            "Ljava/lang/Long;",
            "Lcom/google/android/gms/internal/hu;",
            ")V"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v2, Lcom/google/android/gms/internal/hs$c;

    invoke-direct {v2, p1, p2}, Lcom/google/android/gms/internal/hs$c;-><init>(Ljava/util/List;Ljava/util/Map;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0xd

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Listening on "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->p:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    :goto_0
    const-string v3, "listen() called twice for same QuerySpec."

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/internal/ho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x15

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Adding listen query: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v1}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/hs$e;

    const/4 v5, 0x0

    move-object v1, p5

    move-object v3, p4

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hs$e;-><init>(Lcom/google/android/gms/internal/hu;Lcom/google/android/gms/internal/hs$c;Ljava/lang/Long;Lcom/google/android/gms/internal/hq;Lcom/google/android/gms/internal/hs$1;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->p:Ljava/util/Map;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hs;->b(Lcom/google/android/gms/internal/hs$e;)V

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->q()V

    return-void

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/hu;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/android/gms/internal/hu;",
            ")V"
        }
    .end annotation

    const-string v1, "m"

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lcom/google/android/gms/internal/hu;)V

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "r"

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "r"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    iget-object v2, p0, Lcom/google/android/gms/internal/hs;->m:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hs$a;

    if-eqz v0, :cond_0

    const-string v1, "b"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/hs$a;->a(Ljava/util/Map;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "error"

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "a"

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "a"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "b"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1a

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Ignoring unknown message: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public b()V
    .locals 1

    const-string v0, "shutdown"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/hs;->d(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v2, "Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-string v0, "server_kill"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/hs;->d(Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/hu;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hs;->C:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "o"

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V

    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->q()V

    return-void

    :cond_0
    iget-object v6, p0, Lcom/google/android/gms/internal/hs;->n:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/internal/hs$d;

    const-string v1, "o"

    const/4 v5, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hs$d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;Lcom/google/android/gms/internal/hs$1;)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public b(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/hu;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/android/gms/internal/hu;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hs;->C:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "om"

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;)V

    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->q()V

    return-void

    :cond_0
    iget-object v6, p0, Lcom/google/android/gms/internal/hs;->n:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/internal/hs$d;

    const-string v1, "om"

    const/4 v5, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hs$d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Lcom/google/android/gms/internal/hu;Lcom/google/android/gms/internal/hs$1;)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v1, "Auth token refresh requested"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "token_refresh"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/hs;->d(Ljava/lang/String;)V

    const-string v0, "token_refresh"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/hs;->e(Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v1, "Auth token refreshed."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/hs;->q:Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->j()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->l()V

    goto :goto_0
.end method

.method public d()V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hs$f;

    invoke-static {v0}, Lcom/google/android/gms/internal/hs$f;->a(Lcom/google/android/gms/internal/hs$f;)Lcom/google/android/gms/internal/hu;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/hs$f;->a(Lcom/google/android/gms/internal/hs$f;)Lcom/google/android/gms/internal/hu;

    move-result-object v0

    const-string v2, "write_canceled"

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/hu;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hs$d;

    invoke-static {v0}, Lcom/google/android/gms/internal/hs$d;->a(Lcom/google/android/gms/internal/hs$d;)Lcom/google/android/gms/internal/hu;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/internal/hs$d;->a(Lcom/google/android/gms/internal/hs$d;)Lcom/google/android/gms/internal/hu;

    move-result-object v0

    const-string v2, "write_canceled"

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/hu;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->f()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hs;->C:Z

    :cond_4
    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->q()V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v2, "Connection interrupted for: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->f:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->i:Lcom/google/android/gms/internal/hl;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->i:Lcom/google/android/gms/internal/hl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hl;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->i:Lcom/google/android/gms/internal/hl;

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->w:Lcom/google/android/gms/internal/hw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hw;->a()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->w:Lcom/google/android/gms/internal/hw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hw;->c()V

    sget-object v0, Lcom/google/android/gms/internal/hs$b;->a:Lcom/google/android/gms/internal/hs$b;

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    goto :goto_1
.end method

.method public e(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->v:Lcom/google/android/gms/internal/ks;

    const-string v2, "Connection no longer interrupted for: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->f:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hs;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    sget-object v1, Lcom/google/android/gms/internal/hs$b;->a:Lcom/google/android/gms/internal/hs$b;

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/hs;->h()V

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->f:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public g(Ljava/lang/String;)V
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    sget-object v3, Lcom/google/android/gms/internal/hs$b;->b:Lcom/google/android/gms/internal/hs$b;

    if-ne v0, v3, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "Trying to open network connection while in the wrong state: %s"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/internal/ho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->c:Lcom/google/android/gms/internal/hr$a;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/hr$a;->a(Z)V

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/hs;->q:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/hs$b;->c:Lcom/google/android/gms/internal/hs$b;

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->j:Lcom/google/android/gms/internal/hs$b;

    new-instance v0, Lcom/google/android/gms/internal/hl;

    iget-object v1, p0, Lcom/google/android/gms/internal/hs;->s:Lcom/google/android/gms/internal/hn;

    iget-object v2, p0, Lcom/google/android/gms/internal/hs;->d:Lcom/google/android/gms/internal/hp;

    iget-object v3, p0, Lcom/google/android/gms/internal/hs;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/hs;->x:Ljava/lang/String;

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hl;-><init>(Lcom/google/android/gms/internal/hn;Lcom/google/android/gms/internal/hp;Ljava/lang/String;Lcom/google/android/gms/internal/hl$a;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/hs;->i:Lcom/google/android/gms/internal/hl;

    iget-object v0, p0, Lcom/google/android/gms/internal/hs;->i:Lcom/google/android/gms/internal/hl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hl;->a()V

    return-void

    :cond_1
    move v0, v2

    goto :goto_0
.end method
