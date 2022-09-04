.class public final Lcom/google/android/gms/internal/nr;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/nr$a;
    }
.end annotation


# instance fields
.field final a:Lcom/google/android/gms/internal/nv;

.field final b:Lcom/google/android/gms/internal/oe;

.field private final c:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/po",
            "<*>;",
            "Lcom/google/android/gms/internal/nr$a",
            "<*>;>;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/po",
            "<*>;",
            "Lcom/google/android/gms/internal/oj",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ok;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/google/android/gms/internal/os;

.field private final g:Z

.field private final h:Z

.field private final i:Z

.field private final j:Z


# direct methods
.method public constructor <init>()V
    .locals 12

    const/4 v4, 0x0

    sget-object v1, Lcom/google/android/gms/internal/ot;->a:Lcom/google/android/gms/internal/ot;

    sget-object v2, Lcom/google/android/gms/internal/no;->a:Lcom/google/android/gms/internal/no;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    const/4 v7, 0x1

    sget-object v10, Lcom/google/android/gms/internal/oh;->a:Lcom/google/android/gms/internal/oh;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    move-object v0, p0

    move v5, v4

    move v6, v4

    move v8, v4

    move v9, v4

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/nr;-><init>(Lcom/google/android/gms/internal/ot;Lcom/google/android/gms/internal/nq;Ljava/util/Map;ZZZZZZLcom/google/android/gms/internal/oh;Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/ot;Lcom/google/android/gms/internal/nq;Ljava/util/Map;ZZZZZZLcom/google/android/gms/internal/oh;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ot;",
            "Lcom/google/android/gms/internal/nq;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/android/gms/internal/nt",
            "<*>;>;ZZZZZZ",
            "Lcom/google/android/gms/internal/oh;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ok;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/nr;->c:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nr;->d:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/internal/nr$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/nr$1;-><init>(Lcom/google/android/gms/internal/nr;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/nr;->a:Lcom/google/android/gms/internal/nv;

    new-instance v0, Lcom/google/android/gms/internal/nr$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/nr$2;-><init>(Lcom/google/android/gms/internal/nr;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/nr;->b:Lcom/google/android/gms/internal/oe;

    new-instance v0, Lcom/google/android/gms/internal/os;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/os;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/nr;->f:Lcom/google/android/gms/internal/os;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/nr;->g:Z

    iput-boolean p6, p0, Lcom/google/android/gms/internal/nr;->i:Z

    iput-boolean p7, p0, Lcom/google/android/gms/internal/nr;->h:Z

    iput-boolean p8, p0, Lcom/google/android/gms/internal/nr;->j:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/pn;->Q:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pi;->a:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, p11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->x:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->m:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->g:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->i:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->k:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Long;

    invoke-direct {p0, p10}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/oh;)Lcom/google/android/gms/internal/oj;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/pn;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/android/gms/internal/oj;)Lcom/google/android/gms/internal/ok;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Double;

    invoke-direct {p0, p9}, Lcom/google/android/gms/internal/nr;->a(Z)Lcom/google/android/gms/internal/oj;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/pn;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/android/gms/internal/oj;)Lcom/google/android/gms/internal/ok;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v2, Ljava/lang/Float;

    invoke-direct {p0, p9}, Lcom/google/android/gms/internal/nr;->b(Z)Lcom/google/android/gms/internal/oj;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/pn;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/android/gms/internal/oj;)Lcom/google/android/gms/internal/ok;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->r:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->t:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->z:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->B:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v1, Ljava/math/BigDecimal;

    sget-object v2, Lcom/google/android/gms/internal/pn;->v:Lcom/google/android/gms/internal/oj;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/pn;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/oj;)Lcom/google/android/gms/internal/ok;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v1, Ljava/math/BigInteger;

    sget-object v2, Lcom/google/android/gms/internal/pn;->w:Lcom/google/android/gms/internal/oj;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/pn;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/oj;)Lcom/google/android/gms/internal/ok;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->D:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->F:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->J:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->O:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->H:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->d:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pd;->a:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->M:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pl;->a:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pk;->a:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->K:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pb;->a:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->b:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/google/android/gms/internal/pc;

    iget-object v2, p0, Lcom/google/android/gms/internal/nr;->f:Lcom/google/android/gms/internal/os;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/pc;-><init>(Lcom/google/android/gms/internal/os;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/google/android/gms/internal/ph;

    iget-object v2, p0, Lcom/google/android/gms/internal/nr;->f:Lcom/google/android/gms/internal/os;

    invoke-direct {v1, v2, p5}, Lcom/google/android/gms/internal/ph;-><init>(Lcom/google/android/gms/internal/os;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/google/android/gms/internal/pe;

    iget-object v2, p0, Lcom/google/android/gms/internal/nr;->f:Lcom/google/android/gms/internal/os;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/pe;-><init>(Lcom/google/android/gms/internal/os;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/android/gms/internal/pn;->R:Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/google/android/gms/internal/pj;

    iget-object v2, p0, Lcom/google/android/gms/internal/nr;->f:Lcom/google/android/gms/internal/os;

    invoke-direct {v1, v2, p2, p1}, Lcom/google/android/gms/internal/pj;-><init>(Lcom/google/android/gms/internal/os;Lcom/google/android/gms/internal/nq;Lcom/google/android/gms/internal/ot;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/nr;->e:Ljava/util/List;

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/oh;)Lcom/google/android/gms/internal/oj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/oh;",
            ")",
            "Lcom/google/android/gms/internal/oj",
            "<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/oh;->a:Lcom/google/android/gms/internal/oh;

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/pn;->n:Lcom/google/android/gms/internal/oj;

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/nr$5;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/nr$5;-><init>(Lcom/google/android/gms/internal/nr;)V

    goto :goto_0
.end method

.method private a(Z)Lcom/google/android/gms/internal/oj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/internal/oj",
            "<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/pn;->p:Lcom/google/android/gms/internal/oj;

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/nr$3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/nr$3;-><init>(Lcom/google/android/gms/internal/nr;)V

    goto :goto_0
.end method

.method private a(D)V
    .locals 3

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0xa8

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not a valid double value as per JSON specification. To override this"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/nr;D)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/nr;->a(D)V

    return-void
.end method

.method private static a(Ljava/lang/Object;Lcom/google/android/gms/internal/pp;)V
    .locals 2

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/pq;->j:Lcom/google/android/gms/internal/pq;

    if-eq v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ny;

    const-string v1, "JSON document was not fully consumed."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ny;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/pt; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/og;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/ny;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ny;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    return-void
.end method

.method private b(Z)Lcom/google/android/gms/internal/oj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/internal/oj",
            "<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/pn;->o:Lcom/google/android/gms/internal/oj;

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/nr$4;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/nr$4;-><init>(Lcom/google/android/gms/internal/nr;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ok;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/ok;",
            "Lcom/google/android/gms/internal/po",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/nr;->e:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/nr;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v0

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ok;

    if-nez v2, :cond_2

    if-ne v0, p1, :cond_1

    move v2, v1

    goto :goto_0

    :cond_2
    invoke-interface {v0, p0, p2}, Lcom/google/android/gms/internal/ok;->a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x16

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "GSON cannot serialize "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/po",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nr;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/oj;

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/nr;->c:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const/4 v1, 0x0

    if-nez v0, :cond_5

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/nr;->c:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v0, 0x1

    move-object v2, v1

    move v1, v0

    :goto_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nr$a;

    if-nez v0, :cond_0

    :try_start_0
    new-instance v3, Lcom/google/android/gms/internal/nr$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/nr$a;-><init>()V

    invoke-interface {v2, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/nr;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ok;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/ok;->a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/nr$a;->a(Lcom/google/android/gms/internal/oj;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/nr;->d:Ljava/util/Map;

    invoke-interface {v3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/nr;->c:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    goto :goto_0

    :cond_3
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x13

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "GSON cannot handle "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/internal/nr;->c:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_4
    throw v0

    :cond_5
    move-object v2, v0

    goto :goto_1
.end method

.method public a(Ljava/lang/Class;)Lcom/google/android/gms/internal/oj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/po;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/po;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/io/Writer;)Lcom/google/android/gms/internal/ps;
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/nr;->i:Z

    if-eqz v0, :cond_0

    const-string v0, ")]}\'\n"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ps;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ps;-><init>(Ljava/io/Writer;)V

    iget-boolean v1, p0, Lcom/google/android/gms/internal/nr;->j:Z

    if-eqz v1, :cond_1

    const-string v1, "  "

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ps;->c(Ljava/lang/String;)V

    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/nr;->g:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ps;->d(Z)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/nx;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/nx;",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/nx;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2}, Lcom/google/android/gms/internal/oy;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/nx;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/nx;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/pf;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/pf;-><init>(Lcom/google/android/gms/internal/nx;)V

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/pp;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/pp;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/pp;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    const/4 v1, 0x1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->p()Z

    move-result v2

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/pp;->a(Z)V

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    const/4 v1, 0x0

    invoke-static {p2}, Lcom/google/android/gms/internal/po;->a(Ljava/lang/reflect/Type;)Lcom/google/android/gms/internal/po;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/pp;->a(Z)V

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    if-eqz v1, :cond_0

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/pp;->a(Z)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v1, Lcom/google/android/gms/internal/og;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/pp;->a(Z)V

    throw v0

    :catch_1
    move-exception v0

    :try_start_2
    new-instance v1, Lcom/google/android/gms/internal/og;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/og;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
.end method

.method public a(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/Reader;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/pp;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/pp;-><init>(Ljava/io/Reader;)V

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/pp;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/pp;)V

    return-object v1
.end method

.method public a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2}, Lcom/google/android/gms/internal/oy;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/nr;->a(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/nx;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/nx;Ljava/lang/Appendable;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/nz;->a:Lcom/google/android/gms/internal/nz;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/nx;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/nx;Lcom/google/android/gms/internal/ps;)V
    .locals 5

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ps;->g()Z

    move-result v1

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ps;->b(Z)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ps;->h()Z

    move-result v2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/nr;->h:Z

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ps;->c(Z)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ps;->i()Z

    move-result v3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/nr;->g:Z

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ps;->d(Z)V

    :try_start_0
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/oz;->a(Lcom/google/android/gms/internal/nx;Lcom/google/android/gms/internal/ps;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ps;->b(Z)V

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ps;->c(Z)V

    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ps;->d(Z)V

    return-void

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v4, Lcom/google/android/gms/internal/ny;

    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/ny;-><init>(Ljava/lang/Throwable;)V

    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ps;->b(Z)V

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ps;->c(Z)V

    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ps;->d(Z)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/internal/nx;Ljava/lang/Appendable;)V
    .locals 2

    :try_start_0
    invoke-static {p2}, Lcom/google/android/gms/internal/oz;->a(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nr;->a(Ljava/io/Writer;)Lcom/google/android/gms/internal/ps;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/nx;Lcom/google/android/gms/internal/ps;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public a(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/ps;)V
    .locals 5

    invoke-static {p2}, Lcom/google/android/gms/internal/po;->a(Ljava/lang/reflect/Type;)Lcom/google/android/gms/internal/po;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v0

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ps;->g()Z

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p3, v2}, Lcom/google/android/gms/internal/ps;->b(Z)V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ps;->h()Z

    move-result v2

    iget-boolean v3, p0, Lcom/google/android/gms/internal/nr;->h:Z

    invoke-virtual {p3, v3}, Lcom/google/android/gms/internal/ps;->c(Z)V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ps;->i()Z

    move-result v3

    iget-boolean v4, p0, Lcom/google/android/gms/internal/nr;->g:Z

    invoke-virtual {p3, v4}, Lcom/google/android/gms/internal/ps;->d(Z)V

    :try_start_0
    invoke-virtual {v0, p3, p1}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, v1}, Lcom/google/android/gms/internal/ps;->b(Z)V

    invoke-virtual {p3, v2}, Lcom/google/android/gms/internal/ps;->c(Z)V

    invoke-virtual {p3, v3}, Lcom/google/android/gms/internal/ps;->d(Z)V

    return-void

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v4, Lcom/google/android/gms/internal/ny;

    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/ny;-><init>(Ljava/lang/Throwable;)V

    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {p3, v1}, Lcom/google/android/gms/internal/ps;->b(Z)V

    invoke-virtual {p3, v2}, Lcom/google/android/gms/internal/ps;->c(Z)V

    invoke-virtual {p3, v3}, Lcom/google/android/gms/internal/ps;->d(Z)V

    throw v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V
    .locals 2

    :try_start_0
    invoke-static {p3}, Lcom/google/android/gms/internal/oz;->a(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/nr;->a(Ljava/io/Writer;)Lcom/google/android/gms/internal/ps;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/ps;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/ny;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ny;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{serializeNulls:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/google/android/gms/internal/nr;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "factories:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/nr;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/nr;->f:Lcom/google/android/gms/internal/os;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
