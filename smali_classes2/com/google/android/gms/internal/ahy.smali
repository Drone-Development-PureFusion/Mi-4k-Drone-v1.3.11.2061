.class public final Lcom/google/android/gms/internal/ahy;
.super Lcom/google/android/gms/common/api/g;

# interfaces
.implements Lcom/google/android/gms/internal/aig$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ahy$a;,
        Lcom/google/android/gms/internal/ahy$b;
    }
.end annotation


# instance fields
.field final c:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/google/android/gms/internal/ahl$a",
            "<**>;>;"
        }
    .end annotation
.end field

.field d:Lcom/google/android/gms/internal/zzqv;

.field final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/a$d",
            "<*>;",
            "Lcom/google/android/gms/common/api/a$f;",
            ">;"
        }
    .end annotation
.end field

.field f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field final g:Lcom/google/android/gms/common/internal/s;

.field final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/a",
            "<*>;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final i:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<+",
            "Lcom/google/android/gms/internal/aok;",
            "Lcom/google/android/gms/internal/aom;",
            ">;"
        }
    .end annotation
.end field

.field j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/aiw;",
            ">;"
        }
    .end annotation
.end field

.field final k:Lcom/google/android/gms/internal/aix;

.field private final l:Ljava/util/concurrent/locks/Lock;

.field private final m:Lcom/google/android/gms/common/internal/x;

.field private n:Lcom/google/android/gms/internal/aig;

.field private final o:I

.field private final p:Landroid/content/Context;

.field private final q:Landroid/os/Looper;

.field private volatile r:Z

.field private s:J

.field private t:J

.field private final u:Lcom/google/android/gms/internal/ahy$a;

.field private final v:Lcom/google/android/gms/common/b;

.field private final w:Lcom/google/android/gms/internal/aim;

.field private final x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/internal/aho;",
            ">;"
        }
    .end annotation
.end field

.field private y:Ljava/lang/Integer;

.field private final z:Lcom/google/android/gms/common/internal/x$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/locks/Lock;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/b;Lcom/google/android/gms/common/api/a$b;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Map;IILjava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/concurrent/locks/Lock;",
            "Landroid/os/Looper;",
            "Lcom/google/android/gms/common/internal/s;",
            "Lcom/google/android/gms/common/b;",
            "Lcom/google/android/gms/common/api/a$b",
            "<+",
            "Lcom/google/android/gms/internal/aok;",
            "Lcom/google/android/gms/internal/aom;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/a",
            "<*>;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/common/api/g$b;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/common/api/g$c;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/a$d",
            "<*>;",
            "Lcom/google/android/gms/common/api/a$f;",
            ">;II",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/internal/aho;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/api/g;-><init>()V

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/internal/ahy;->c:Ljava/util/Queue;

    const-wide/32 v2, 0x1d4c0

    iput-wide v2, p0, Lcom/google/android/gms/internal/ahy;->s:J

    const-wide/16 v2, 0x1388

    iput-wide v2, p0, Lcom/google/android/gms/internal/ahy;->t:J

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/internal/ahy;->f:Ljava/util/Set;

    new-instance v2, Lcom/google/android/gms/internal/aim;

    invoke-direct {v2}, Lcom/google/android/gms/internal/aim;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/internal/ahy;->w:Lcom/google/android/gms/internal/aim;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/internal/ahy;->j:Ljava/util/Set;

    new-instance v2, Lcom/google/android/gms/internal/ahy$1;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ahy$1;-><init>(Lcom/google/android/gms/internal/ahy;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ahy;->z:Lcom/google/android/gms/common/internal/x$a;

    iput-object p1, p0, Lcom/google/android/gms/internal/ahy;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    new-instance v2, Lcom/google/android/gms/common/internal/x;

    iget-object v3, p0, Lcom/google/android/gms/internal/ahy;->z:Lcom/google/android/gms/common/internal/x$a;

    invoke-direct {v2, p3, v3}, Lcom/google/android/gms/common/internal/x;-><init>(Landroid/os/Looper;Lcom/google/android/gms/common/internal/x$a;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    iput-object p3, p0, Lcom/google/android/gms/internal/ahy;->q:Landroid/os/Looper;

    new-instance v2, Lcom/google/android/gms/internal/ahy$a;

    invoke-direct {v2, p0, p3}, Lcom/google/android/gms/internal/ahy$a;-><init>(Lcom/google/android/gms/internal/ahy;Landroid/os/Looper;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ahy;->u:Lcom/google/android/gms/internal/ahy$a;

    iput-object p5, p0, Lcom/google/android/gms/internal/ahy;->v:Lcom/google/android/gms/common/b;

    move/from16 v0, p11

    iput v0, p0, Lcom/google/android/gms/internal/ahy;->o:I

    iget v2, p0, Lcom/google/android/gms/internal/ahy;->o:I

    if-ltz v2, :cond_0

    invoke-static/range {p12 .. p12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    :cond_0
    iput-object p7, p0, Lcom/google/android/gms/internal/ahy;->h:Ljava/util/Map;

    iput-object p10, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    move-object/from16 v0, p13

    iput-object v0, p0, Lcom/google/android/gms/internal/ahy;->x:Ljava/util/ArrayList;

    new-instance v2, Lcom/google/android/gms/internal/aix;

    iget-object v3, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/aix;-><init>(Ljava/util/Map;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ahy;->k:Lcom/google/android/gms/internal/aix;

    invoke-interface {p8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/common/api/g$b;

    iget-object v4, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v4, v2}, Lcom/google/android/gms/common/internal/x;->a(Lcom/google/android/gms/common/api/g$b;)V

    goto :goto_0

    :cond_1
    invoke-interface {p9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/common/api/g$c;

    iget-object v4, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v4, v2}, Lcom/google/android/gms/common/internal/x;->a(Lcom/google/android/gms/common/api/g$c;)V

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/google/android/gms/internal/ahy;->g:Lcom/google/android/gms/common/internal/s;

    iput-object p6, p0, Lcom/google/android/gms/internal/ahy;->i:Lcom/google/android/gms/common/api/a$b;

    return-void
.end method

.method public static a(Ljava/lang/Iterable;Z)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Lcom/google/android/gms/common/api/a$f;",
            ">;Z)I"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v3, 0x1

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    move v2, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->v()Z

    move-result v5

    if-eqz v5, :cond_0

    move v2, v3

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->m_()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v3

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_3

    if-eqz v1, :cond_2

    if-eqz p1, :cond_2

    const/4 v3, 0x2

    :cond_2
    :goto_2
    return v3

    :cond_3
    const/4 v3, 0x3

    goto :goto_2

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method private a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/aiu;Z)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ajd;->c:Lcom/google/android/gms/internal/aje;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/aje;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ahy$4;

    invoke-direct {v1, p0, p2, p3, p1}, Lcom/google/android/gms/internal/ahy$4;-><init>(Lcom/google/android/gms/internal/ahy;Lcom/google/android/gms/internal/aiu;ZLcom/google/android/gms/common/api/g;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ahy;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ahy;->t()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ahy;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/aiu;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ahy;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/aiu;Z)V

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/aih;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/internal/aih;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p0, Lcom/google/android/gms/internal/ahy;->o:I

    if-ltz v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/ahj;->a(Lcom/google/android/gms/internal/aih;)Lcom/google/android/gms/internal/ahj;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/ahy;->o:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ahj;->a(I)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Called stopAutoManage but automatic lifecycle management is not enabled."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static b(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    const-string v0, "UNKNOWN"

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "SIGN_IN_MODE_NONE"

    goto :goto_0

    :pswitch_1
    const-string v0, "SIGN_IN_MODE_REQUIRED"

    goto :goto_0

    :pswitch_2
    const-string v0, "SIGN_IN_MODE_OPTIONAL"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ahy;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ahy;->u()V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ahy;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->p:Landroid/content/Context;

    return-object v0
.end method

.method private c(I)V
    .locals 12

    const/4 v3, 0x1

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    if-nez v1, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    if-eqz v1, :cond_2

    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v1, p1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {p1}, Lcom/google/android/gms/internal/ahy;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ahy;->b(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x33

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Cannot use sign-in mode: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ". Mode was already set to "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    move v2, v0

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->v()Z

    move-result v5

    if-eqz v5, :cond_3

    move v2, v3

    :cond_3
    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->m_()Z

    move-result v0

    if-eqz v0, :cond_7

    move v0, v3

    :goto_2
    move v1, v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_5
    :pswitch_0
    new-instance v0, Lcom/google/android/gms/internal/aia;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->p:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    iget-object v4, p0, Lcom/google/android/gms/internal/ahy;->q:Landroid/os/Looper;

    iget-object v5, p0, Lcom/google/android/gms/internal/ahy;->v:Lcom/google/android/gms/common/b;

    iget-object v6, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    iget-object v7, p0, Lcom/google/android/gms/internal/ahy;->g:Lcom/google/android/gms/common/internal/s;

    iget-object v8, p0, Lcom/google/android/gms/internal/ahy;->h:Ljava/util/Map;

    iget-object v9, p0, Lcom/google/android/gms/internal/ahy;->i:Lcom/google/android/gms/common/api/a$b;

    iget-object v10, p0, Lcom/google/android/gms/internal/ahy;->x:Ljava/util/ArrayList;

    move-object v2, p0

    move-object v11, p0

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/aia;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ahy;Ljava/util/concurrent/locks/Lock;Landroid/os/Looper;Lcom/google/android/gms/common/j;Ljava/util/Map;Lcom/google/android/gms/common/internal/s;Ljava/util/Map;Lcom/google/android/gms/common/api/a$b;Ljava/util/ArrayList;Lcom/google/android/gms/internal/aig$a;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    goto/16 :goto_0

    :pswitch_1
    if-nez v2, :cond_6

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    if-eqz v1, :cond_5

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    if-eqz v2, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->p:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    iget-object v3, p0, Lcom/google/android/gms/internal/ahy;->q:Landroid/os/Looper;

    iget-object v4, p0, Lcom/google/android/gms/internal/ahy;->v:Lcom/google/android/gms/common/b;

    iget-object v5, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    iget-object v6, p0, Lcom/google/android/gms/internal/ahy;->g:Lcom/google/android/gms/common/internal/s;

    iget-object v7, p0, Lcom/google/android/gms/internal/ahy;->h:Ljava/util/Map;

    iget-object v8, p0, Lcom/google/android/gms/internal/ahy;->i:Lcom/google/android/gms/common/api/a$b;

    iget-object v9, p0, Lcom/google/android/gms/internal/ahy;->x:Ljava/util/ArrayList;

    move-object v1, p0

    invoke-static/range {v0 .. v9}, Lcom/google/android/gms/internal/ahq;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ahy;Ljava/util/concurrent/locks/Lock;Landroid/os/Looper;Lcom/google/android/gms/common/j;Ljava/util/Map;Lcom/google/android/gms/common/internal/s;Ljava/util/Map;Lcom/google/android/gms/common/api/a$b;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/ahq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    goto/16 :goto_0

    :cond_7
    move v0, v1

    goto :goto_2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private s()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/x;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aig;->a()V

    return-void
.end method

.method private t()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ahy;->s()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method private u()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ahy;->s()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method


# virtual methods
.method public a(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/ConnectionResult;
    .locals 3
    .param p3    # Ljava/util/concurrent/TimeUnit;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-eq v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    const-string v1, "blockingConnect must not be called on the UI thread"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    const-string v0, "TimeUnit must not be null"

    invoke-static {p3, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ahy;->a(Ljava/lang/Iterable;Z)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ahy;->c(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/x;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/aig;->a(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/ConnectionResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;
    .locals 2
    .param p1    # Lcom/google/android/gms/common/api/a$d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lcom/google/android/gms/common/api/a$f;",
            ">(",
            "Lcom/google/android/gms/common/api/a$d",
            "<TC;>;)TC;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a$f;

    const-string v1, "Appropriate Api was not requested."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    .locals 4
    .param p1    # Lcom/google/android/gms/internal/ahl$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/a$c;",
            "R::",
            "Lcom/google/android/gms/common/api/m;",
            "T:",
            "Lcom/google/android/gms/internal/ahl$a",
            "<TR;TA;>;>(TT;)TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ahl$a;->g()Lcom/google/android/gms/common/api/a$d;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "This task can not be enqueued (it\'s probably a Batch or malformed)"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ahl$a;->g()Lcom/google/android/gms/common/api/a$d;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ahl$a;->h()Lcom/google/android/gms/common/api/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ahl$a;->h()Lcom/google/android/gms/common/api/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/a;->f()Ljava/lang/String;

    move-result-object v0

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x41

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "GoogleApiClient is not configured to use "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " required for this call."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->c:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_2
    return-object p1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const-string v0, "the API"

    goto :goto_1

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/aig;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_2

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(T",
            "L;",
            ")",
            "Lcom/google/android/gms/internal/ail",
            "<T",
            "L;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->w:Lcom/google/android/gms/internal/aim;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->q:Landroid/os/Looper;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/aim;->a(Ljava/lang/Object;Landroid/os/Looper;)Lcom/google/android/gms/internal/ail;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public a(I)V
    .locals 3

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    if-eq p1, v0, :cond_0

    const/4 v1, 0x2

    if-ne p1, v1, :cond_1

    :cond_0
    :goto_0
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x21

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Illegal sign-in mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ahy;->c(I)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ahy;->s()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public a(IZ)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->n()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->k:Lcom/google/android/gms/internal/aix;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/aix;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/x;->a(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/x;->a()V

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ahy;->s()V

    :cond_1
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ahl$a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ahy;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/x;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Landroid/support/v4/app/FragmentActivity;)V
    .locals 1
    .param p1    # Landroid/support/v4/app/FragmentActivity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/internal/aih;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/aih;-><init>(Landroid/app/Activity;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ahy;->a(Lcom/google/android/gms/internal/aih;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->v:Lcom/google/android/gms/common/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->p:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->c()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/b;->b(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->o()Z

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->m()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/x;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/x;->a()V

    :cond_1
    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/g$b;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/g$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/x;->a(Lcom/google/android/gms/common/api/g$b;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/g$c;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/g$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/x;->a(Lcom/google/android/gms/common/api/g$c;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/aiw;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->j:Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ahy;->j:Ljava/util/Set;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->j:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public a(Lcom/google/android/gms/common/api/a;)Z
    .locals 2
    .param p1    # Lcom/google/android/gms/common/api/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a",
            "<*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/a;->d()Lcom/google/android/gms/common/api/a$d;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/internal/ait;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/aig;->a(Lcom/google/android/gms/internal/ait;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->p:Landroid/content/Context;

    return-object v0
.end method

.method b(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lcom/google/android/gms/common/api/a$f;",
            ">(",
            "Lcom/google/android/gms/common/api/a$d",
            "<*>;)TC;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a$f;

    const-string v1, "Appropriate Api was not requested."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    .locals 4
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

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ahl$a;->g()Lcom/google/android/gms/common/api/a$d;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "This task can not be executed (it\'s probably a Batch or malformed)"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ahl$a;->g()Lcom/google/android/gms/common/api/a$d;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ahl$a;->h()Lcom/google/android/gms/common/api/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ahl$a;->h()Lcom/google/android/gms/common/api/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/a;->f()Ljava/lang/String;

    move-result-object v0

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x41

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "GoogleApiClient is not configured to use "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " required for this call."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GoogleApiClient is not connected yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const-string v0, "the API"

    goto :goto_1

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->m()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->c:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ahl$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->k:Lcom/google/android/gms/internal/aix;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/aix;->a(Lcom/google/android/gms/internal/ahn;)V

    sget-object v1, Lcom/google/android/gms/common/api/Status;->c:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ahl$a;->c(Lcom/google/android/gms/common/api/Status;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_3
    return-object p1

    :cond_4
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/aig;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_3
.end method

.method public b(Lcom/google/android/gms/internal/aiw;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->j:Ljava/util/Set;

    if-nez v0, :cond_1

    const-string v0, "GoogleApiClientImpl"

    const-string v1, "Attempted to remove pending transform when no transforms are registered."

    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    invoke-static {v0, v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->j:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "GoogleApiClientImpl"

    const-string v1, "Failed to remove pending transform - this may lead to memory leaks!"

    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    invoke-static {v0, v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_2
    :try_start_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->p()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aig;->f()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    const-string v1, "mContext="

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->p:Landroid/content/Context;

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    const-string v1, "mResuming="

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ahy;->r:Z

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mWorkQueue.size()="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->append(Ljava/lang/CharSequence;)Ljava/io/PrintWriter;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->c:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->k:Lcom/google/android/gms/internal/aix;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/aix;->a(Ljava/io/PrintWriter;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/aig;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/gms/common/api/a;)Z
    .locals 2
    .param p1    # Lcom/google/android/gms/common/api/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a",
            "<*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/a;->d()Lcom/google/android/gms/common/api/a$d;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a$f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/g$b;)Z
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/g$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/x;->b(Lcom/google/android/gms/common/api/g$b;)Z

    move-result v0

    return v0
.end method

.method public b(Lcom/google/android/gms/common/api/g$c;)Z
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/g$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/x;->b(Lcom/google/android/gms/common/api/g$c;)Z

    move-result v0

    return v0
.end method

.method public c()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->q:Landroid/os/Looper;

    return-object v0
.end method

.method public c(Lcom/google/android/gms/common/api/a;)Lcom/google/android/gms/common/ConnectionResult;
    .locals 3
    .param p1    # Lcom/google/android/gms/common/api/a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a",
            "<*>;)",
            "Lcom/google/android/gms/common/ConnectionResult;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->m()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot invoke getConnectionResult unless GoogleApiClient is connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/a;->d()Lcom/google/android/gms/common/api/a$d;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/aig;->a(Lcom/google/android/gms/common/api/a;)Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/common/ConnectionResult;->v:Lcom/google/android/gms/common/ConnectionResult;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_0
    return-object v0

    :cond_1
    :try_start_2
    const-string v0, "GoogleApiClientImpl"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "GoogleApiClientImpl"

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " requested in getConnectionResult is not connected but is not present in the failed  connections map"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    invoke-static {v0, v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :cond_3
    :try_start_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, " was never registered with GoogleApiClient"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
.end method

.method public c(Lcom/google/android/gms/common/api/g$b;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/g$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/x;->c(Lcom/google/android/gms/common/api/g$b;)V

    return-void
.end method

.method public c(Lcom/google/android/gms/common/api/g$c;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/g$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/x;->c(Lcom/google/android/gms/common/api/g$c;)V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aig;->g()V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/ahy;->o:I

    if-ltz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    const-string v1, "Sign-in mode should have been set explicitly by auto-manage."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ahy;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ahy;->a(Ljava/lang/Iterable;Z)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_3
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
.end method

.method public f()Lcom/google/android/gms/common/ConnectionResult;
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v0, v3, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "blockingConnect must not be called on the UI thread"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/ahy;->o:I

    if-ltz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    :goto_1
    const-string v0, "Sign-in mode should have been set explicitly by auto-manage."

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    :cond_0
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ahy;->c(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/x;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aig;->b()Lcom/google/android/gms/common/ConnectionResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object v0

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1

    :cond_3
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ahy;->a(Ljava/lang/Iterable;Z)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_4
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
.end method

.method public g()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->k:Lcom/google/android/gms/internal/aix;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/aix;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aig;->c()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->w:Lcom/google/android/gms/internal/aim;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/aim;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ahl$a;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ahl$a;->a(Lcom/google/android/gms/internal/aix$b;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ahl$a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_1
    return-void

    :cond_2
    :try_start_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->o()Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->m:Lcom/google/android/gms/common/internal/x;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/x;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_1
.end method

.method public h()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->g()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->e()V

    return-void
.end method

.method public i()Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->j()Z

    move-result v0

    const-string v2, "GoogleApiClient is not connected yet."

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->y:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API"

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/internal/aiu;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aiu;-><init>(Lcom/google/android/gms/common/api/g;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ahy;->e:Ljava/util/Map;

    sget-object v3, Lcom/google/android/gms/internal/ajd;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0, p0, v0, v1}, Lcom/google/android/gms/internal/ahy;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/aiu;Z)V

    :goto_1
    return-object v0

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ahy$2;

    invoke-direct {v2, p0, v1, v0}, Lcom/google/android/gms/internal/ahy$2;-><init>(Lcom/google/android/gms/internal/ahy;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/internal/aiu;)V

    new-instance v3, Lcom/google/android/gms/internal/ahy$3;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ahy$3;-><init>(Lcom/google/android/gms/internal/ahy;Lcom/google/android/gms/internal/aiu;)V

    new-instance v4, Lcom/google/android/gms/common/api/g$a;

    iget-object v5, p0, Lcom/google/android/gms/internal/ahy;->p:Landroid/content/Context;

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/g$a;-><init>(Landroid/content/Context;)V

    sget-object v5, Lcom/google/android/gms/internal/ajd;->b:Lcom/google/android/gms/common/api/a;

    invoke-virtual {v4, v5}, Lcom/google/android/gms/common/api/g$a;->a(Lcom/google/android/gms/common/api/a;)Lcom/google/android/gms/common/api/g$a;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/google/android/gms/common/api/g$a;->a(Lcom/google/android/gms/common/api/g$b;)Lcom/google/android/gms/common/api/g$a;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/common/api/g$a;->a(Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/api/g$a;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ahy;->u:Lcom/google/android/gms/internal/ahy$a;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/common/api/g$a;->a(Landroid/os/Handler;)Lcom/google/android/gms/common/api/g$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/g$a;->c()Lcom/google/android/gms/common/api/g;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/g;->e()V

    goto :goto_1
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aig;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->n:Lcom/google/android/gms/internal/aig;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aig;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ahy;->r:Z

    return v0
.end method

.method n()V
    .locals 4

    const/4 v3, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ahy;->r:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->d:Lcom/google/android/gms/internal/zzqv;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->v:Lcom/google/android/gms/common/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->p:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ahy$b;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ahy$b;-><init>(Lcom/google/android/gms/internal/ahy;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/b;->a(Landroid/content/Context;Lcom/google/android/gms/internal/zzqv$a;)Lcom/google/android/gms/internal/zzqv;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ahy;->d:Lcom/google/android/gms/internal/zzqv;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->u:Lcom/google/android/gms/internal/ahy$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->u:Lcom/google/android/gms/internal/ahy$a;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ahy$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/internal/ahy;->s:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ahy$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->u:Lcom/google/android/gms/internal/ahy$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->u:Lcom/google/android/gms/internal/ahy$a;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ahy$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/internal/ahy;->t:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ahy$a;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0
.end method

.method o()Z
    .locals 3

    const/4 v1, 0x1

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ahy;->m()Z

    move-result v2

    if-nez v2, :cond_0

    :goto_0
    return v0

    :cond_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ahy;->r:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->u:Lcom/google/android/gms/internal/ahy$a;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ahy$a;->removeMessages(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->u:Lcom/google/android/gms/internal/ahy$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ahy$a;->removeMessages(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->d:Lcom/google/android/gms/internal/zzqv;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahy;->d:Lcom/google/android/gms/internal/zzqv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzqv;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ahy;->d:Lcom/google/android/gms/internal/zzqv;

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method p()Z
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->j:Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_0
    return v0

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->j:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahy;->l:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method q()Ljava/lang/String;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    const-string v1, ""

    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p0, v1, v3, v2, v3}, Lcom/google/android/gms/internal/ahy;->b(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public r()I
    .locals 1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
