.class public Lcom/google/android/gms/tagmanager/dm;
.super Lcom/google/android/gms/internal/ahn;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/tagmanager/dm$d;,
        Lcom/google/android/gms/tagmanager/dm$c;,
        Lcom/google/android/gms/tagmanager/dm$b;,
        Lcom/google/android/gms/tagmanager/dm$a;,
        Lcom/google/android/gms/tagmanager/dm$e;,
        Lcom/google/android/gms/tagmanager/dm$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ahn",
        "<",
        "Lcom/google/android/gms/tagmanager/b;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/util/e;

.field private final b:Lcom/google/android/gms/tagmanager/dm$d;

.field private final c:Landroid/os/Looper;

.field private final d:Lcom/google/android/gms/tagmanager/bu;

.field private final e:I

.field private final f:Landroid/content/Context;

.field private final g:Lcom/google/android/gms/tagmanager/f;

.field private final h:Ljava/lang/String;

.field private final l:Lcom/google/android/gms/tagmanager/dn;

.field private m:Lcom/google/android/gms/tagmanager/dm$f;

.field private n:Lcom/google/android/gms/internal/em;

.field private volatile o:Lcom/google/android/gms/tagmanager/dl;

.field private volatile p:Z

.field private q:Lcom/google/android/gms/internal/gi$j;

.field private r:J

.field private s:Ljava/lang/String;

.field private t:Lcom/google/android/gms/tagmanager/dm$e;

.field private u:Lcom/google/android/gms/tagmanager/dm$a;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/f;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/dm$f;Lcom/google/android/gms/tagmanager/dm$e;Lcom/google/android/gms/internal/em;Lcom/google/android/gms/common/util/e;Lcom/google/android/gms/tagmanager/bu;Lcom/google/android/gms/tagmanager/dn;)V
    .locals 2

    if-nez p3, :cond_2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ahn;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/dm;->f:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/dm;->g:Lcom/google/android/gms/tagmanager/f;

    if-nez p3, :cond_0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lcom/google/android/gms/tagmanager/dm;->c:Landroid/os/Looper;

    iput-object p4, p0, Lcom/google/android/gms/tagmanager/dm;->h:Ljava/lang/String;

    iput p5, p0, Lcom/google/android/gms/tagmanager/dm;->e:I

    iput-object p6, p0, Lcom/google/android/gms/tagmanager/dm;->m:Lcom/google/android/gms/tagmanager/dm$f;

    iput-object p7, p0, Lcom/google/android/gms/tagmanager/dm;->t:Lcom/google/android/gms/tagmanager/dm$e;

    iput-object p8, p0, Lcom/google/android/gms/tagmanager/dm;->n:Lcom/google/android/gms/internal/em;

    new-instance v0, Lcom/google/android/gms/tagmanager/dm$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/tagmanager/dm$d;-><init>(Lcom/google/android/gms/tagmanager/dm;Lcom/google/android/gms/tagmanager/dm$1;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->b:Lcom/google/android/gms/tagmanager/dm$d;

    new-instance v0, Lcom/google/android/gms/internal/gi$j;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gi$j;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->q:Lcom/google/android/gms/internal/gi$j;

    iput-object p9, p0, Lcom/google/android/gms/tagmanager/dm;->a:Lcom/google/android/gms/common/util/e;

    iput-object p10, p0, Lcom/google/android/gms/tagmanager/dm;->d:Lcom/google/android/gms/tagmanager/bu;

    iput-object p11, p0, Lcom/google/android/gms/tagmanager/dm;->l:Lcom/google/android/gms/tagmanager/dn;

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/dm;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/tagmanager/bs;->a()Lcom/google/android/gms/tagmanager/bs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bs;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/dm;->a(Ljava/lang/String;)V

    :cond_1
    return-void

    :cond_2
    move-object v0, p3

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/f;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/dq;)V
    .locals 18

    new-instance v4, Lcom/google/android/gms/tagmanager/ce;

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    invoke-direct {v4, v0, v1}, Lcom/google/android/gms/tagmanager/ce;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v16, Lcom/google/android/gms/tagmanager/cd;

    move-object/from16 v0, v16

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p6

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/tagmanager/cd;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/tagmanager/dq;)V

    new-instance v14, Lcom/google/android/gms/internal/em;

    move-object/from16 v0, p1

    invoke-direct {v14, v0}, Lcom/google/android/gms/internal/em;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/common/util/h;->d()Lcom/google/android/gms/common/util/e;

    move-result-object v15

    new-instance v5, Lcom/google/android/gms/tagmanager/au;

    const/4 v6, 0x1

    const/4 v7, 0x5

    const-wide/32 v8, 0xdbba0

    const-wide/16 v10, 0x1388

    const-string v12, "refreshing"

    invoke-static {}, Lcom/google/android/gms/common/util/h;->d()Lcom/google/android/gms/common/util/e;

    move-result-object v13

    invoke-direct/range {v5 .. v13}, Lcom/google/android/gms/tagmanager/au;-><init>(IIJJLjava/lang/String;Lcom/google/android/gms/common/util/e;)V

    new-instance v17, Lcom/google/android/gms/tagmanager/dn;

    move-object/from16 v0, v17

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/dn;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move/from16 v11, p5

    move-object v12, v4

    move-object/from16 v13, v16

    move-object/from16 v16, v5

    invoke-direct/range {v6 .. v17}, Lcom/google/android/gms/tagmanager/dm;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/f;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/dm$f;Lcom/google/android/gms/tagmanager/dm$e;Lcom/google/android/gms/internal/em;Lcom/google/android/gms/common/util/e;Lcom/google/android/gms/tagmanager/bu;Lcom/google/android/gms/tagmanager/dn;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/tagmanager/dm;->n:Lcom/google/android/gms/internal/em;

    invoke-virtual/range {p6 .. p6}, Lcom/google/android/gms/tagmanager/dq;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/em;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/tagmanager/bu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->d:Lcom/google/android/gms/tagmanager/bu;

    return-object v0
.end method

.method private declared-synchronized a(J)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->t:Lcom/google/android/gms/tagmanager/dm$e;

    if-nez v0, :cond_0

    const-string v0, "Refresh requested, but no network load scheduler."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->t:Lcom/google/android/gms/tagmanager/dm$e;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm;->q:Lcom/google/android/gms/internal/gi$j;

    iget-object v1, v1, Lcom/google/android/gms/internal/gi$j;->c:Ljava/lang/String;

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/gms/tagmanager/dm$e;->a(JLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized a(Lcom/google/android/gms/internal/gi$j;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->m:Lcom/google/android/gms/tagmanager/dm$f;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/el$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/el$a;-><init>()V

    iget-wide v2, p0, Lcom/google/android/gms/tagmanager/dm;->r:J

    iput-wide v2, v0, Lcom/google/android/gms/internal/el$a;->a:J

    new-instance v1, Lcom/google/android/gms/internal/gi$f;

    invoke-direct {v1}, Lcom/google/android/gms/internal/gi$f;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/el$a;->b:Lcom/google/android/gms/internal/gi$f;

    iput-object p1, v0, Lcom/google/android/gms/internal/el$a;->c:Lcom/google/android/gms/internal/gi$j;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm;->m:Lcom/google/android/gms/tagmanager/dm$f;

    invoke-interface {v1, v0}, Lcom/google/android/gms/tagmanager/dm$f;->a(Lcom/google/android/gms/internal/el$a;)V
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

.method private declared-synchronized a(Lcom/google/android/gms/internal/gi$j;JZ)V
    .locals 8

    monitor-enter p0

    if-eqz p4, :cond_0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/dm;->p:Z

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dm;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->o:Lcom/google/android/gms/tagmanager/dl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/dm;->q:Lcom/google/android/gms/internal/gi$j;

    iput-wide p2, p0, Lcom/google/android/gms/tagmanager/dm;->r:J

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->l:Lcom/google/android/gms/tagmanager/dn;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/dn;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    iget-wide v4, p0, Lcom/google/android/gms/tagmanager/dm;->r:J

    add-long/2addr v4, v0

    iget-object v6, p0, Lcom/google/android/gms/tagmanager/dm;->a:Lcom/google/android/gms/common/util/e;

    invoke-interface {v6}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/tagmanager/dm;->a(J)V

    new-instance v0, Lcom/google/android/gms/tagmanager/a;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/dm;->g:Lcom/google/android/gms/tagmanager/f;

    invoke-virtual {v2}, Lcom/google/android/gms/tagmanager/f;->a()Lcom/google/android/gms/tagmanager/e;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/dm;->h:Ljava/lang/String;

    move-wide v4, p2

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/a;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/e;Ljava/lang/String;JLcom/google/android/gms/internal/gi$j;)V

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm;->o:Lcom/google/android/gms/tagmanager/dl;

    if-nez v1, :cond_3

    new-instance v1, Lcom/google/android/gms/tagmanager/dl;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/dm;->g:Lcom/google/android/gms/tagmanager/f;

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/dm;->c:Landroid/os/Looper;

    iget-object v4, p0, Lcom/google/android/gms/tagmanager/dm;->b:Lcom/google/android/gms/tagmanager/dm$d;

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/google/android/gms/tagmanager/dl;-><init>(Lcom/google/android/gms/tagmanager/f;Landroid/os/Looper;Lcom/google/android/gms/tagmanager/a;Lcom/google/android/gms/tagmanager/dl$a;)V

    iput-object v1, p0, Lcom/google/android/gms/tagmanager/dm;->o:Lcom/google/android/gms/tagmanager/dl;

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dm;->i()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm;->u:Lcom/google/android/gms/tagmanager/dm$a;

    invoke-interface {v1, v0}, Lcom/google/android/gms/tagmanager/dm$a;->a(Lcom/google/android/gms/tagmanager/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->o:Lcom/google/android/gms/tagmanager/dl;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/dm;->b(Lcom/google/android/gms/common/api/m;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_3
    :try_start_2
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm;->o:Lcom/google/android/gms/tagmanager/dl;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/tagmanager/dl;->a(Lcom/google/android/gms/tagmanager/a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method static synthetic a(Lcom/google/android/gms/tagmanager/dm;J)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/tagmanager/dm;->a(J)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/tagmanager/dm;Lcom/google/android/gms/internal/gi$j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/internal/gi$j;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/tagmanager/dm;Lcom/google/android/gms/internal/gi$j;JZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/internal/gi$j;JZ)V

    return-void
.end method

.method private a(Z)V
    .locals 10

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->m:Lcom/google/android/gms/tagmanager/dm$f;

    new-instance v1, Lcom/google/android/gms/tagmanager/dm$b;

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/tagmanager/dm$b;-><init>(Lcom/google/android/gms/tagmanager/dm;Lcom/google/android/gms/tagmanager/dm$1;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/dm$f;->a(Lcom/google/android/gms/tagmanager/av;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->t:Lcom/google/android/gms/tagmanager/dm$e;

    new-instance v1, Lcom/google/android/gms/tagmanager/dm$c;

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/tagmanager/dm$c;-><init>(Lcom/google/android/gms/tagmanager/dm;Lcom/google/android/gms/tagmanager/dm$1;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/dm$e;->a(Lcom/google/android/gms/tagmanager/av;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->m:Lcom/google/android/gms/tagmanager/dm$f;

    iget v1, p0, Lcom/google/android/gms/tagmanager/dm;->e:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/dm$f;->a(I)Lcom/google/android/gms/internal/en$c;

    move-result-object v6

    if-eqz v6, :cond_0

    new-instance v7, Lcom/google/android/gms/tagmanager/dl;

    iget-object v8, p0, Lcom/google/android/gms/tagmanager/dm;->g:Lcom/google/android/gms/tagmanager/f;

    iget-object v9, p0, Lcom/google/android/gms/tagmanager/dm;->c:Landroid/os/Looper;

    new-instance v0, Lcom/google/android/gms/tagmanager/a;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/dm;->g:Lcom/google/android/gms/tagmanager/f;

    invoke-virtual {v2}, Lcom/google/android/gms/tagmanager/f;->a()Lcom/google/android/gms/tagmanager/e;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/dm;->h:Ljava/lang/String;

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/a;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/e;Ljava/lang/String;JLcom/google/android/gms/internal/en$c;)V

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm;->b:Lcom/google/android/gms/tagmanager/dm$d;

    invoke-direct {v7, v8, v9, v0, v1}, Lcom/google/android/gms/tagmanager/dl;-><init>(Lcom/google/android/gms/tagmanager/f;Landroid/os/Looper;Lcom/google/android/gms/tagmanager/a;Lcom/google/android/gms/tagmanager/dl$a;)V

    iput-object v7, p0, Lcom/google/android/gms/tagmanager/dm;->o:Lcom/google/android/gms/tagmanager/dl;

    :cond_0
    new-instance v0, Lcom/google/android/gms/tagmanager/dm$3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/tagmanager/dm$3;-><init>(Lcom/google/android/gms/tagmanager/dm;Z)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->u:Lcom/google/android/gms/tagmanager/dm$a;

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/dm;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->t:Lcom/google/android/gms/tagmanager/dm$e;

    const-string v1, ""

    invoke-interface {v0, v4, v5, v1}, Lcom/google/android/gms/tagmanager/dm$e;->a(JLjava/lang/String;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->m:Lcom/google/android/gms/tagmanager/dm$f;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/dm$f;->a()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/tagmanager/dl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->o:Lcom/google/android/gms/tagmanager/dl;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/tagmanager/dn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->l:Lcom/google/android/gms/tagmanager/dn;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/common/util/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->a:Lcom/google/android/gms/common/util/e;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/tagmanager/dm;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/dm;->p:Z

    return v0
.end method

.method static synthetic f(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/internal/gi$j;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->q:Lcom/google/android/gms/internal/gi$j;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/tagmanager/dm;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/tagmanager/dm;->r:J

    return-wide v0
.end method

.method static synthetic h(Lcom/google/android/gms/tagmanager/dm;)Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/dm;->n()Z

    move-result v0

    return v0
.end method

.method private n()Z
    .locals 3

    invoke-static {}, Lcom/google/android/gms/tagmanager/bs;->a()Lcom/google/android/gms/tagmanager/bs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bs;->b()Lcom/google/android/gms/tagmanager/bs$a;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/tagmanager/bs$a;->b:Lcom/google/android/gms/tagmanager/bs$a;

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bs;->b()Lcom/google/android/gms/tagmanager/bs$a;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/tagmanager/bs$a;->c:Lcom/google/android/gms/tagmanager/bs$a;

    if-ne v1, v2, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm;->h:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bs;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/tagmanager/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->o:Lcom/google/android/gms/tagmanager/dl;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->o:Lcom/google/android/gms/tagmanager/dl;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->d:Lcom/google/android/gms/common/api/Status;

    if-ne p1, v0, :cond_1

    const-string v0, "timer expired: setting result to failure"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    :cond_1
    new-instance v0, Lcom/google/android/gms/tagmanager/dl;

    invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/dl;-><init>(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0
.end method

.method declared-synchronized a(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/dm;->s:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->t:Lcom/google/android/gms/tagmanager/dm$e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->t:Lcom/google/android/gms/tagmanager/dm$e;

    invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/dm$e;->a(Ljava/lang/String;)V
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

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/tagmanager/b;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 8

    const/4 v7, 0x0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->m:Lcom/google/android/gms/tagmanager/dm$f;

    iget v1, p0, Lcom/google/android/gms/tagmanager/dm;->e:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/dm$f;->a(I)Lcom/google/android/gms/internal/en$c;

    move-result-object v6

    if-eqz v6, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/a;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dm;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/dm;->g:Lcom/google/android/gms/tagmanager/f;

    invoke-virtual {v2}, Lcom/google/android/gms/tagmanager/f;->a()Lcom/google/android/gms/tagmanager/e;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/dm;->h:Ljava/lang/String;

    const-wide/16 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/a;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/e;Ljava/lang/String;JLcom/google/android/gms/internal/en$c;)V

    new-instance v1, Lcom/google/android/gms/tagmanager/dl;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/dm;->g:Lcom/google/android/gms/tagmanager/f;

    iget-object v3, p0, Lcom/google/android/gms/tagmanager/dm;->c:Landroid/os/Looper;

    new-instance v4, Lcom/google/android/gms/tagmanager/dm$2;

    invoke-direct {v4, p0}, Lcom/google/android/gms/tagmanager/dm$2;-><init>(Lcom/google/android/gms/tagmanager/dm;)V

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/google/android/gms/tagmanager/dl;-><init>(Lcom/google/android/gms/tagmanager/f;Landroid/os/Looper;Lcom/google/android/gms/tagmanager/a;Lcom/google/android/gms/tagmanager/dl$a;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/tagmanager/dm;->b(Lcom/google/android/gms/common/api/m;)V

    :goto_0
    iput-object v7, p0, Lcom/google/android/gms/tagmanager/dm;->t:Lcom/google/android/gms/tagmanager/dm$e;

    iput-object v7, p0, Lcom/google/android/gms/tagmanager/dm;->m:Lcom/google/android/gms/tagmanager/dm$f;

    return-void

    :cond_0
    const-string v0, "Default was requested, but no default container was found"

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0xa

    invoke-direct {v1, v2, v0, v7}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/tagmanager/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/dm;->b(Lcom/google/android/gms/common/api/m;)V

    goto :goto_0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/dm;->a(Z)V

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/dm;->a(Z)V

    return-void
.end method

.method declared-synchronized h()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm;->s:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
