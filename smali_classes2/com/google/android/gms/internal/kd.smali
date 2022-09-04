.class public Lcom/google/android/gms/internal/kd;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/kg;

.field private final b:Lcom/google/android/gms/internal/lb;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/kg;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/kd;->a:Lcom/google/android/gms/internal/kg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->c()Lcom/google/android/gms/internal/lb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/kd;->b:Lcom/google/android/gms/internal/lb;

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/ka;Lcom/google/android/gms/internal/ie;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/kb;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->b()Lcom/google/android/gms/internal/kc$a;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/kc$a;->e:Lcom/google/android/gms/internal/kc$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kc$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->b()Lcom/google/android/gms/internal/kc$a;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/kc$a;->a:Lcom/google/android/gms/internal/kc$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kc$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/kd;->a:Lcom/google/android/gms/internal/kg;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/ie;->a(Lcom/google/android/gms/internal/ka;Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kb;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->c()Lcom/google/android/gms/internal/lc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/kd;->b:Lcom/google/android/gms/internal/lb;

    invoke-virtual {p3, v0, v1, v2}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ka;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ka;

    move-result-object p1

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/kd;)Lcom/google/android/gms/internal/lb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kd;->b:Lcom/google/android/gms/internal/lb;

    return-object v0
.end method

.method private a()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<",
            "Lcom/google/android/gms/internal/ka;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/kd$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/kd$1;-><init>(Lcom/google/android/gms/internal/kd;)V

    return-object v0
.end method

.method private a(Ljava/util/List;Lcom/google/android/gms/internal/kc$a;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/lc;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kb;",
            ">;",
            "Lcom/google/android/gms/internal/kc$a;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ka;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ie;",
            ">;",
            "Lcom/google/android/gms/internal/lc;",
            ")V"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ka;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->b()Lcom/google/android/gms/internal/kc$a;

    move-result-object v3

    invoke-virtual {v3, p2}, Lcom/google/android/gms/internal/kc$a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/kd;->a()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ka;

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ie;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ie;->a(Lcom/google/android/gms/internal/kc$a;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-direct {p0, v0, v1, p5}, Lcom/google/android/gms/internal/kd;->a(Lcom/google/android/gms/internal/ka;Lcom/google/android/gms/internal/ie;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/kb;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Lcom/google/android/gms/internal/lc;Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ka;",
            ">;",
            "Lcom/google/android/gms/internal/lc;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/ie;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kb;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ka;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->b()Lcom/google/android/gms/internal/kc$a;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/kc$a;->d:Lcom/google/android/gms/internal/kc$a;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/kc$a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/internal/kd;->b:Lcom/google/android/gms/internal/lb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->e()Lcom/google/android/gms/internal/lc;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->c()Lcom/google/android/gms/internal/lc;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/lb;->a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lh;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->c()Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ka;->c(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/google/android/gms/internal/kc$a;->a:Lcom/google/android/gms/internal/kc$a;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/kd;->a(Ljava/util/List;Lcom/google/android/gms/internal/kc$a;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/lc;)V

    sget-object v2, Lcom/google/android/gms/internal/kc$a;->b:Lcom/google/android/gms/internal/kc$a;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/kd;->a(Ljava/util/List;Lcom/google/android/gms/internal/kc$a;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/lc;)V

    sget-object v2, Lcom/google/android/gms/internal/kc$a;->c:Lcom/google/android/gms/internal/kc$a;

    move-object v0, p0

    move-object v3, v6

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/kd;->a(Ljava/util/List;Lcom/google/android/gms/internal/kc$a;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/lc;)V

    sget-object v2, Lcom/google/android/gms/internal/kc$a;->d:Lcom/google/android/gms/internal/kc$a;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/kd;->a(Ljava/util/List;Lcom/google/android/gms/internal/kc$a;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/lc;)V

    sget-object v2, Lcom/google/android/gms/internal/kc$a;->e:Lcom/google/android/gms/internal/kc$a;

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/kd;->a(Ljava/util/List;Lcom/google/android/gms/internal/kc$a;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/internal/lc;)V

    return-object v1
.end method
