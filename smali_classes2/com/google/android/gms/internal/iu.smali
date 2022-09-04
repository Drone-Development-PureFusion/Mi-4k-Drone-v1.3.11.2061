.class public Lcom/google/android/gms/internal/iu;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/iu$b;,
        Lcom/google/android/gms/internal/iu$c;,
        Lcom/google/android/gms/internal/iu$d;,
        Lcom/google/android/gms/internal/iu$a;
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field private b:Lcom/google/android/gms/internal/ju;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Lcom/google/android/gms/internal/it;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/jb;

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/iv;",
            "Lcom/google/android/gms/internal/kg;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/kg;",
            "Lcom/google/android/gms/internal/iv;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/kg;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/internal/iu$d;

.field private final h:Lcom/google/android/gms/internal/jp;

.field private final i:Lcom/google/android/gms/internal/ks;

.field private j:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/iu;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ic;Lcom/google/android/gms/internal/jp;Lcom/google/android/gms/internal/iu$d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/iu;->j:J

    invoke-static {}, Lcom/google/android/gms/internal/ju;->a()Lcom/google/android/gms/internal/ju;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/iu;->b:Lcom/google/android/gms/internal/ju;

    new-instance v0, Lcom/google/android/gms/internal/jb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jb;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/iu;->c:Lcom/google/android/gms/internal/jb;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/iu;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/iu;->e:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/iu;->f:Ljava/util/Set;

    iput-object p3, p0, Lcom/google/android/gms/internal/iu;->g:Lcom/google/android/gms/internal/iu$d;

    iput-object p2, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    const-string v0, "SyncTree"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ic;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ks;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/iu;->i:Lcom/google/android/gms/internal/ks;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/iv;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/ju;)Lcom/google/android/gms/internal/ju;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/iu;->b:Lcom/google/android/gms/internal/ju;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/iv;)Lcom/google/android/gms/internal/kg;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iv;)Lcom/google/android/gms/internal/kg;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kg;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/kg;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/kg;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/ks;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->i:Lcom/google/android/gms/internal/ks;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/jh;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/jh;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/jc;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/jc;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/jh;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/jh;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/jh;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/jh;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->b:Lcom/google/android/gms/internal/ju;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/iu;->c:Lcom/google/android/gms/internal/jb;

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/jb;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jc;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/jc;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/jc;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/jh;",
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Lcom/google/android/gms/internal/it;",
            ">;",
            "Lcom/google/android/gms/internal/lh;",
            "Lcom/google/android/gms/internal/jc;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/jh;->c()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/jc;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/it;

    if-nez p3, :cond_1

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object p3

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/jh;->c()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/jh;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/jh;

    move-result-object v5

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ju;->c()Lcom/google/android/gms/internal/gz;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/gz;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ju;

    if-eqz v1, :cond_2

    if-eqz v5, :cond_2

    if-eqz p3, :cond_4

    invoke-interface {p3, v4}, Lcom/google/android/gms/internal/lh;->c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    :goto_1
    invoke-virtual {p4, v4}, Lcom/google/android/gms/internal/jc;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/jc;

    move-result-object v4

    invoke-direct {p0, v5, v1, v2, v4}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/jc;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0, p1, p4, p3}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/lh;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    move-object v0, v3

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    goto :goto_1
.end method

.method private a(Lcom/google/android/gms/internal/ju;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Lcom/google/android/gms/internal/it;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kh;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ju;Ljava/util/List;)V

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/c;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/kg;",
            "Lcom/google/android/gms/internal/ie;",
            "Lcom/google/firebase/database/c;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    new-instance v1, Lcom/google/android/gms/internal/iu$9;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/iu$9;-><init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/c;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/jp;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/jh;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/kg;",
            "Lcom/google/android/gms/internal/jh;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->b:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ju;->e(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/it;

    sget-boolean v2, Lcom/google/android/gms/internal/iu;->a:Z

    if-nez v2, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing sync point for query tag that we\'re tracking"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/iu;->c:Lcom/google/android/gms/internal/jb;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/jb;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jc;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v1, v2}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/lh;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/kh;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/kh;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/iu;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/iu;->a(Ljava/util/List;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/ju;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Lcom/google/android/gms/internal/it;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kh;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/it;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/it;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/it;->d()Lcom/google/android/gms/internal/kh;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/it;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ju;->c()Lcom/google/android/gms/internal/gz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gz;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ju;

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ju;Ljava/util/List;)V

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/kh;)V
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/iv;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/iu$c;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/iu$c;-><init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kh;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/iu;->g:Lcom/google/android/gms/internal/iu$d;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kg;

    move-result-object v4

    invoke-interface {v3, v4, v1, v2, v2}, Lcom/google/android/gms/internal/iu$d;->a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/iv;Lcom/google/android/gms/internal/hq;Lcom/google/android/gms/internal/iu$a;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/iu;->b:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ju;->c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    if-eqz v1, :cond_0

    sget-boolean v1, Lcom/google/android/gms/internal/iu;->a:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/it;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/it;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "If we\'re adding a query, it shouldn\'t be shadowed"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/iu$10;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/iu$10;-><init>(Lcom/google/android/gms/internal/iu;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ju$a;)V

    :cond_1
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kg;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/iv;

    move-result-object v2

    sget-boolean v3, Lcom/google/android/gms/internal/iu;->a:Z

    if-nez v3, :cond_1

    if-nez v2, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/iu;->e:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->d:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void
.end method

.method private b(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/iv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/iv;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kg;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kg;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/google/android/gms/internal/iv;)Lcom/google/android/gms/internal/kg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kg;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/ju;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ju;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/jc;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/jh;",
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Lcom/google/android/gms/internal/it;",
            ">;",
            "Lcom/google/android/gms/internal/lh;",
            "Lcom/google/android/gms/internal/jc;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/android/gms/internal/it;

    if-nez p3, :cond_1

    if-eqz v6, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ju;->c()Lcom/google/android/gms/internal/gz;

    move-result-object v7

    new-instance v0, Lcom/google/android/gms/internal/iu$11;

    move-object v1, p0

    move-object v3, p4

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/iu$11;-><init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/jh;Ljava/util/List;)V

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/gz;->a(Lcom/google/android/gms/internal/he$b;)V

    if-eqz v6, :cond_0

    invoke-virtual {v6, p1, p4, v2}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/lh;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object v5

    :cond_1
    move-object v2, p3

    goto :goto_0
.end method

.method private c()Lcom/google/android/gms/internal/iv;
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/iv;

    iget-wide v2, p0, Lcom/google/android/gms/internal/iu;->j:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/google/android/gms/internal/iu;->j:J

    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/iv;-><init>(J)V

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->c:Lcom/google/android/gms/internal/jb;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/ju;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->b:Lcom/google/android/gms/internal/ju;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/iu;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->e:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/iv;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/iu;->c()Lcom/google/android/gms/internal/iv;

    move-result-object v0

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/iu;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->d:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/iu$d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->g:Lcom/google/android/gms/internal/iu$d;

    return-object v0
.end method


# virtual methods
.method public a(JZZLcom/google/android/gms/internal/mc;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZZ",
            "Lcom/google/android/gms/internal/mc;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    new-instance v1, Lcom/google/android/gms/internal/iu$13;

    move-object v2, p0

    move v3, p4

    move-wide v4, p1

    move v6, p3

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/iu$13;-><init>(Lcom/google/android/gms/internal/iu;ZJZLcom/google/android/gms/internal/mc;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/jp;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ie;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ie;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    new-instance v1, Lcom/google/android/gms/internal/iu$8;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/iu$8;-><init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/ie;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/jp;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    new-instance v1, Lcom/google/android/gms/internal/iu$4;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/iu$4;-><init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/ij;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/jp;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;Lcom/google/android/gms/internal/ia;JZ)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Lcom/google/android/gms/internal/ia;",
            "Lcom/google/android/gms/internal/ia;",
            "JZ)",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    new-instance v1, Lcom/google/android/gms/internal/iu$12;

    move-object v2, p0

    move/from16 v3, p6

    move-object v4, p1

    move-object v5, p2

    move-wide v6, p4

    move-object v8, p3

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/iu$12;-><init>(Lcom/google/android/gms/internal/iu;ZLcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;JLcom/google/android/gms/internal/ia;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/jp;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Lcom/google/android/gms/internal/lh;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    new-instance v1, Lcom/google/android/gms/internal/iu$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/iu$2;-><init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/jp;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/iv;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Lcom/google/android/gms/internal/lh;",
            "Lcom/google/android/gms/internal/iv;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    new-instance v1, Lcom/google/android/gms/internal/iu$6;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/google/android/gms/internal/iu$6;-><init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/iv;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/jp;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lh;JZZ)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Lcom/google/android/gms/internal/lh;",
            "Lcom/google/android/gms/internal/lh;",
            "JZZ)",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    if-nez p6, :cond_0

    if-nez p7, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v1, "We shouldn\'t be persisting non-visible writes."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mk;->a(ZLjava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    new-instance v1, Lcom/google/android/gms/internal/iu$1;

    move-object v2, p0

    move/from16 v3, p7

    move-object v4, p1

    move-object v5, p2

    move-wide v6, p4

    move-object v8, p3

    move/from16 v9, p6

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/iu$1;-><init>(Lcom/google/android/gms/internal/iu;ZLcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;JLcom/google/android/gms/internal/lh;Z)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/jp;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/lm;",
            ">;)",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->b:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ju;->e(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/it;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/it;->d()Lcom/google/android/gms/internal/kh;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kh;->b()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lm;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/lm;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    move-object v1, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, v1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Ljava/util/List;Lcom/google/android/gms/internal/iv;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/lm;",
            ">;",
            "Lcom/google/android/gms/internal/iv;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iv;)Lcom/google/android/gms/internal/kg;

    move-result-object v1

    if-eqz v1, :cond_4

    sget-boolean v0, Lcom/google/android/gms/internal/iu;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ij;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->b:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ju;->e(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/it;

    sget-boolean v2, Lcom/google/android/gms/internal/iu;->a:Z

    if-nez v2, :cond_1

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing sync point for query tag that we\'re tracking"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kh;

    move-result-object v0

    sget-boolean v1, Lcom/google/android/gms/internal/iu;->a:Z

    if-nez v1, :cond_2

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Missing view for query tag that we\'re tracking"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/kh;->b()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lm;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/lm;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1, v1, p3}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/iv;)Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/internal/ij;Ljava/util/Map;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/ij;",
            "Lcom/google/android/gms/internal/lh;",
            ">;)",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    new-instance v1, Lcom/google/android/gms/internal/iu$3;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/internal/iu$3;-><init>(Lcom/google/android/gms/internal/iu;Ljava/util/Map;Lcom/google/android/gms/internal/ij;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/jp;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Ljava/util/Map;Lcom/google/android/gms/internal/iv;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/ij;",
            "Lcom/google/android/gms/internal/lh;",
            ">;",
            "Lcom/google/android/gms/internal/iv;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    new-instance v1, Lcom/google/android/gms/internal/iu$7;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/google/android/gms/internal/iu$7;-><init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/iv;Lcom/google/android/gms/internal/ij;Ljava/util/Map;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/jp;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/iv;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/iv;",
            ")",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    new-instance v1, Lcom/google/android/gms/internal/iu$5;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/iu$5;-><init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/iv;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/jp;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/kg;Lcom/google/firebase/database/c;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/kg;",
            "Lcom/google/firebase/database/c;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/c;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/kg;Z)V
    .locals 1

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/iu$b;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/iu$b;-><init>(Lcom/google/android/gms/internal/kg;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ie;)Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/iu$b;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/iu$b;-><init>(Lcom/google/android/gms/internal/kg;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/ie;)Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->b:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->d()Z

    move-result v0

    return v0
.end method

.method public b(Lcom/google/android/gms/internal/ij;Ljava/util/List;)Lcom/google/android/gms/internal/lh;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/android/gms/internal/lh;"
        }
    .end annotation

    iget-object v2, p0, Lcom/google/android/gms/internal/iu;->b:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/it;

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    move-object v4, v2

    move-object v2, p1

    :goto_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v5

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ij;->e()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v6

    if-eqz v5, :cond_1

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ju;

    move-result-object v4

    :goto_1
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/it;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    :goto_2
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/iu;->c:Lcom/google/android/gms/internal/jb;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, p2, v2}, Lcom/google/android/gms/internal/jb;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;Ljava/util/List;Z)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ju;->a()Lcom/google/android/gms/internal/ju;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_2

    :cond_3
    move-object v1, v0

    move-object v0, v2

    move-object v2, v3

    goto :goto_0
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/iu;->h:Lcom/google/android/gms/internal/jp;

    new-instance v1, Lcom/google/android/gms/internal/iu$14;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/iu$14;-><init>(Lcom/google/android/gms/internal/iu;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/jp;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/ie;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ie;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ie;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/c;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
