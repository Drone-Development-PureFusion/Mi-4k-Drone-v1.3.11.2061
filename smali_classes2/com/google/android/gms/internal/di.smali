.class public Lcom/google/android/gms/internal/di;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/di$c;,
        Lcom/google/android/gms/internal/di$b;,
        Lcom/google/android/gms/internal/di$a;
    }
.end annotation


# instance fields
.field final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/di$c",
            "<",
            "Lcom/google/android/gms/internal/dv;",
            ">;>;"
        }
    .end annotation
.end field

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/dn;

.field private final d:Lcom/google/android/gms/common/util/e;

.field private e:Ljava/lang/String;

.field private final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/dt;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/dn;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/dn;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/common/util/h;->d()Lcom/google/android/gms/common/util/e;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/di;-><init>(Landroid/content/Context;Ljava/util/Map;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/common/util/e;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/util/Map;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/common/util/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/dt;",
            ">;",
            "Lcom/google/android/gms/internal/dn;",
            "Lcom/google/android/gms/common/util/e;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/di;->e:Ljava/lang/String;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/di;->a:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/di;->b:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/di;->d:Lcom/google/android/gms/common/util/e;

    iput-object p3, p0, Lcom/google/android/gms/internal/di;->c:Lcom/google/android/gms/internal/dn;

    iput-object p2, p0, Lcom/google/android/gms/internal/di;->f:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/di;)Lcom/google/android/gms/internal/dn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/di;->c:Lcom/google/android/gms/internal/dn;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/dl;Ljava/util/List;ILcom/google/android/gms/internal/di$a;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/dl;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lcom/google/android/gms/internal/di$a;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/dl;->a()Lcom/google/android/gms/internal/dd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x34

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Attempting to fetch container "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " from a saved resource"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    iget-object v9, p0, Lcom/google/android/gms/internal/di;->c:Lcom/google/android/gms/internal/dn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dd;->d()Ljava/lang/String;

    move-result-object v10

    new-instance v0, Lcom/google/android/gms/internal/di$b;

    const/4 v2, 0x1

    sget-object v4, Lcom/google/android/gms/internal/dk;->a:Lcom/google/android/gms/internal/dj;

    const/4 v8, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/di$b;-><init>(Lcom/google/android/gms/internal/di;ILcom/google/android/gms/internal/dl;Lcom/google/android/gms/internal/dj;Ljava/util/List;ILcom/google/android/gms/internal/di$a;Lcom/google/android/gms/internal/aos;)V

    invoke-virtual {v9, v10, v0}, Lcom/google/android/gms/internal/dn;->a(Ljava/lang/String;Lcom/google/android/gms/internal/dh;)V

    return-void
.end method

.method private b(Lcom/google/android/gms/internal/dl;Ljava/util/List;ILcom/google/android/gms/internal/di$a;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/dl;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lcom/google/android/gms/internal/di$a;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/dl;->a()Lcom/google/android/gms/internal/dd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x38

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Attempting to fetch container "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " from the default resource"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    iget-object v9, p0, Lcom/google/android/gms/internal/di;->c:Lcom/google/android/gms/internal/dn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dd;->d()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dd;->b()Ljava/lang/String;

    move-result-object v11

    new-instance v0, Lcom/google/android/gms/internal/di$b;

    const/4 v2, 0x2

    sget-object v4, Lcom/google/android/gms/internal/dk;->a:Lcom/google/android/gms/internal/dj;

    const/4 v8, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v5, p2

    move v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/di$b;-><init>(Lcom/google/android/gms/internal/di;ILcom/google/android/gms/internal/dl;Lcom/google/android/gms/internal/dj;Ljava/util/List;ILcom/google/android/gms/internal/di$a;Lcom/google/android/gms/internal/aos;)V

    invoke-virtual {v9, v10, v11, v0}, Lcom/google/android/gms/internal/dn;->a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/dh;)V

    return-void
.end method

.method private b(Lcom/google/android/gms/internal/dl;Ljava/util/List;ILcom/google/android/gms/internal/di$a;Lcom/google/android/gms/internal/aos;)V
    .locals 14
    .param p5    # Lcom/google/android/gms/internal/aos;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/dl;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lcom/google/android/gms/internal/di$a;",
            "Lcom/google/android/gms/internal/aos;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/dl;->a()Lcom/google/android/gms/internal/dd;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/di;->a:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/dd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/di$c;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/dl;->a()Lcom/google/android/gms/internal/dd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dd;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/di;->f:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/dl;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/dt;

    if-nez v0, :cond_4

    const/4 v0, 0x0

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/dt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/dt;-><init>()V

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/di;->f:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/dl;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v9, v0

    :goto_2
    invoke-virtual {v3}, Lcom/google/android/gms/internal/dd;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x2b

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Attempting to fetch container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " from network"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    iget-object v10, p0, Lcom/google/android/gms/internal/di;->b:Landroid/content/Context;

    const-wide/16 v12, 0x0

    new-instance v0, Lcom/google/android/gms/internal/di$b;

    const/4 v2, 0x0

    sget-object v4, Lcom/google/android/gms/internal/dk;->a:Lcom/google/android/gms/internal/dj;

    move-object v1, p0

    move-object v3, p1

    move-object/from16 v5, p2

    move/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/di$b;-><init>(Lcom/google/android/gms/internal/di;ILcom/google/android/gms/internal/dl;Lcom/google/android/gms/internal/dj;Ljava/util/List;ILcom/google/android/gms/internal/di$a;Lcom/google/android/gms/internal/aos;)V

    move-object v1, v9

    move-object v2, v10

    move-object v3, p1

    move-wide v4, v12

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/dt;->a(Landroid/content/Context;Lcom/google/android/gms/internal/dl;JLcom/google/android/gms/internal/dh;)V

    :goto_3
    return-void

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/di$c;->a()J

    move-result-wide v0

    :goto_4
    const-wide/32 v4, 0xdbba0

    add-long/2addr v0, v4

    iget-object v4, p0, Lcom/google/android/gms/internal/di;->d:Lcom/google/android/gms/common/util/e;

    invoke-interface {v4}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v4

    cmp-long v0, v0, v4

    if-gez v0, :cond_5

    const/4 v0, 0x1

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/di;->c:Lcom/google/android/gms/internal/dn;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/dd;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/dn;->a(Ljava/lang/String;)J

    move-result-wide v0

    goto :goto_4

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/dt;

    iget-object v1, p0, Lcom/google/android/gms/internal/di;->e:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/dt;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    add-int/lit8 v3, p3, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/di;->a(Lcom/google/android/gms/internal/dl;Ljava/util/List;ILcom/google/android/gms/internal/di$a;Lcom/google/android/gms/internal/aos;)V

    goto :goto_3

    :cond_4
    move-object v9, v0

    goto/16 :goto_2

    :cond_5
    move v0, v2

    goto/16 :goto_0
.end method


# virtual methods
.method a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/dm$a;)V
    .locals 6

    invoke-virtual {p2}, Lcom/google/android/gms/internal/dm$a;->b()Lcom/google/android/gms/internal/dd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dd;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/dm$a;->c()Lcom/google/android/gms/internal/dv;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/di;->a:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/di;->a:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/di$c;

    iget-object v2, p0, Lcom/google/android/gms/internal/di;->d:Lcom/google/android/gms/common/util/e;

    invoke-interface {v2}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/di$c;->a(J)V

    sget-object v2, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    if-ne p1, v2, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/di$c;->a(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/di$c;->a(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/di;->a:Ljava/util/Map;

    new-instance v3, Lcom/google/android/gms/internal/di$c;

    iget-object v4, p0, Lcom/google/android/gms/internal/di;->d:Lcom/google/android/gms/common/util/e;

    invoke-interface {v4}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v4

    invoke-direct {v3, p1, v1, v4, v5}, Lcom/google/android/gms/internal/di$c;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;J)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method a(Lcom/google/android/gms/internal/dl;Ljava/util/List;ILcom/google/android/gms/internal/di$a;Lcom/google/android/gms/internal/aos;)V
    .locals 4
    .param p5    # Lcom/google/android/gms/internal/aos;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/dl;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lcom/google/android/gms/internal/di$a;",
            "Lcom/google/android/gms/internal/aos;",
            ")V"
        }
    .end annotation

    if-nez p3, :cond_0

    const-string v0, "Starting to fetch a new resource"

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lt p3, v0, :cond_2

    const-string v1, "There is no valid resource for the container: "

    invoke-virtual {p1}, Lcom/google/android/gms/internal/dl;->a()Lcom/google/android/gms/internal/dd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dd;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/dm;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0x10

    invoke-direct {v2, v3, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    add-int/lit8 v0, p3, -0x1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/dm;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    invoke-interface {p4, v1}, Lcom/google/android/gms/internal/di$a;->a(Lcom/google/android/gms/internal/dm;)V

    :goto_1
    return-void

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x24

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unknown fetching source: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-direct/range {p0 .. p5}, Lcom/google/android/gms/internal/di;->b(Lcom/google/android/gms/internal/dl;Ljava/util/List;ILcom/google/android/gms/internal/di$a;Lcom/google/android/gms/internal/aos;)V

    goto :goto_1

    :pswitch_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/di;->a(Lcom/google/android/gms/internal/dl;Ljava/util/List;ILcom/google/android/gms/internal/di$a;)V

    goto :goto_1

    :pswitch_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/di;->b(Lcom/google/android/gms/internal/dl;Ljava/util/List;ILcom/google/android/gms/internal/di$a;)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/di$a;Lcom/google/android/gms/internal/aos;)V
    .locals 8
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/android/gms/internal/di$a;",
            "Lcom/google/android/gms/internal/aos;",
            ")V"
        }
    .end annotation

    const/4 v6, 0x0

    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v7, Lcom/google/android/gms/internal/dl;

    invoke-direct {v7}, Lcom/google/android/gms/internal/dl;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/dd;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/di;->a(Ljava/lang/String;)Z

    move-result v4

    invoke-static {}, Lcom/google/android/gms/internal/apn;->a()Lcom/google/android/gms/internal/apn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/apn;->c()Ljava/lang/String;

    move-result-object v5

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/dd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/dl;->a(Lcom/google/android/gms/internal/dd;)Lcom/google/android/gms/internal/dl;

    move-result-object v1

    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    move-object v0, p0

    move v3, v6

    move-object v4, p5

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/di;->a(Lcom/google/android/gms/internal/dl;Ljava/util/List;ILcom/google/android/gms/internal/di$a;Lcom/google/android/gms/internal/aos;)V

    return-void

    :cond_0
    move v0, v6

    goto :goto_0
.end method

.method a(Ljava/lang/String;)Z
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/apn;->a()Lcom/google/android/gms/internal/apn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/apn;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/apn;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
