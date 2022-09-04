.class final Lcom/google/android/gms/internal/ph$a;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ph;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/oj",
        "<",
        "Ljava/util/Map",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ph;

.field private final b:Lcom/google/android/gms/internal/oj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/oj",
            "<TK;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/oj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/oj",
            "<TV;>;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/internal/ox;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ox",
            "<+",
            "Ljava/util/Map",
            "<TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ph;Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/oj;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/oj;Lcom/google/android/gms/internal/ox;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/nr;",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/android/gms/internal/oj",
            "<TK;>;",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/android/gms/internal/oj",
            "<TV;>;",
            "Lcom/google/android/gms/internal/ox",
            "<+",
            "Ljava/util/Map",
            "<TK;TV;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ph$a;->a:Lcom/google/android/gms/internal/ph;

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/pm;

    invoke-direct {v0, p2, p4, p3}, Lcom/google/android/gms/internal/pm;-><init>(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/oj;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ph$a;->b:Lcom/google/android/gms/internal/oj;

    new-instance v0, Lcom/google/android/gms/internal/pm;

    invoke-direct {v0, p2, p6, p5}, Lcom/google/android/gms/internal/pm;-><init>(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/oj;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ph$a;->c:Lcom/google/android/gms/internal/oj;

    iput-object p7, p0, Lcom/google/android/gms/internal/ph$a;->d:Lcom/google/android/gms/internal/ox;

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/nx;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/nx;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/nx;->n()Lcom/google/android/gms/internal/od;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/od;->p()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/od;->b()Ljava/lang/Number;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/od;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/od;->g()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/od;->q()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/od;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/nx;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "null"

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/pp;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/pp;",
            ")",
            "Ljava/util/Map",
            "<TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    move-result-object v1

    sget-object v0, Lcom/google/android/gms/internal/pq;->i:Lcom/google/android/gms/internal/pq;

    if-ne v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->j()V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ph$a;->d:Lcom/google/android/gms/internal/ox;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ox;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    sget-object v2, Lcom/google/android/gms/internal/pq;->a:Lcom/google/android/gms/internal/pq;

    if-ne v1, v2, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->a()V

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->a()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ph$a;->b:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ph$a;->c:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/og;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xf

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "duplicate key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->b()V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->b()V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->c()V

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->e()Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lcom/google/android/gms/internal/ou;->a:Lcom/google/android/gms/internal/ou;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ou;->a(Lcom/google/android/gms/internal/pp;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ph$a;->b:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ph$a;->c:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/og;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xf

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "duplicate key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->d()V

    goto/16 :goto_0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ph$a;->a(Lcom/google/android/gms/internal/ps;Ljava/util/Map;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ps;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ps;",
            "Ljava/util/Map",
            "<TK;TV;>;)V"
        }
    .end annotation

    const/4 v2, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->f()Lcom/google/android/gms/internal/ps;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ph$a;->a:Lcom/google/android/gms/internal/ph;

    invoke-static {v0}, Lcom/google/android/gms/internal/ph;->a(Lcom/google/android/gms/internal/ph;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->d()Lcom/google/android/gms/internal/ps;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ps;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;

    iget-object v2, p0, Lcom/google/android/gms/internal/ph$a;->c:Lcom/google/android/gms/internal/oj;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->e()Lcom/google/android/gms/internal/ps;

    goto :goto_0

    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v1, v2

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v6, p0, Lcom/google/android/gms/internal/ph$a;->b:Lcom/google/android/gms/internal/oj;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/oj;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/nx;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Lcom/google/android/gms/internal/nx;->h()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v6}, Lcom/google/android/gms/internal/nx;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    :goto_3
    or-int/2addr v0, v1

    move v1, v0

    goto :goto_2

    :cond_4
    move v0, v2

    goto :goto_3

    :cond_5
    if-eqz v1, :cond_7

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->b()Lcom/google/android/gms/internal/ps;

    :goto_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->b()Lcom/google/android/gms/internal/ps;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nx;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/oz;->a(Lcom/google/android/gms/internal/nx;Lcom/google/android/gms/internal/ps;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ph$a;->c:Lcom/google/android/gms/internal/oj;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->c()Lcom/google/android/gms/internal/ps;

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->c()Lcom/google/android/gms/internal/ps;

    goto/16 :goto_0

    :cond_7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->d()Lcom/google/android/gms/internal/ps;

    :goto_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_8

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nx;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ph$a;->a(Lcom/google/android/gms/internal/nx;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ps;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;

    iget-object v0, p0, Lcom/google/android/gms/internal/ph$a;->c:Lcom/google/android/gms/internal/oj;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->e()Lcom/google/android/gms/internal/ps;

    goto/16 :goto_0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ph$a;->a(Lcom/google/android/gms/internal/pp;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
