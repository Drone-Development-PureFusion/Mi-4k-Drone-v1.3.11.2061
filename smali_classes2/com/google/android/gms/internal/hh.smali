.class public Lcom/google/android/gms/internal/hh;
.super Lcom/google/android/gms/internal/gz;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/hh$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/gz",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/he;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<TK;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/he;Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;",
            "Ljava/util/Comparator",
            "<TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/gz;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/hh;->a:Lcom/google/android/gms/internal/he;

    iput-object p2, p0, Lcom/google/android/gms/internal/hh;->b:Ljava/util/Comparator;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/he;Ljava/util/Comparator;Lcom/google/android/gms/internal/hh$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/hh;-><init>(Lcom/google/android/gms/internal/he;Ljava/util/Comparator;)V

    return-void
.end method

.method public static a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/gz$a$a;Ljava/util/Comparator;)Lcom/google/android/gms/internal/hh;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<TA;>;",
            "Ljava/util/Map",
            "<TB;TC;>;",
            "Lcom/google/android/gms/internal/gz$a$a",
            "<TA;TB;>;",
            "Ljava/util/Comparator",
            "<TA;>;)",
            "Lcom/google/android/gms/internal/hh",
            "<TA;TC;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/hh$a;->a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/gz$a$a;Ljava/util/Comparator;)Lcom/google/android/gms/internal/hh;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/Map;Ljava/util/Comparator;)Lcom/google/android/gms/internal/hh;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map",
            "<TA;TB;>;",
            "Ljava/util/Comparator",
            "<TA;>;)",
            "Lcom/google/android/gms/internal/hh",
            "<TA;TB;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {}, Lcom/google/android/gms/internal/gz$a;->a()Lcom/google/android/gms/internal/gz$a$a;

    move-result-object v1

    invoke-static {v0, p0, v1, p1}, Lcom/google/android/gms/internal/hh$a;->a(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/gz$a$a;Ljava/util/Comparator;)Lcom/google/android/gms/internal/hh;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/lang/Object;)Lcom/google/android/gms/internal/he;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lcom/google/android/gms/internal/he",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/hh;->a:Lcom/google/android/gms/internal/he;

    :goto_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->c()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/hh;->b:Ljava/util/Comparator;

    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-gez v1, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->f()Lcom/google/android/gms/internal/he;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    :goto_1
    return-object v0

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->g()Lcom/google/android/gms/internal/he;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/gz;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lcom/google/android/gms/internal/gz",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/hh;->a:Lcom/google/android/gms/internal/he;

    iget-object v2, p0, Lcom/google/android/gms/internal/hh;->b:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2, v2}, Lcom/google/android/gms/internal/he;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/he;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/internal/he$a;->b:Lcom/google/android/gms/internal/he$a;

    move-object v2, v1

    move-object v4, v1

    move-object v5, v1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/he;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/he$a;Lcom/google/android/gms/internal/he;Lcom/google/android/gms/internal/he;)Lcom/google/android/gms/internal/he;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/hh;

    iget-object v2, p0, Lcom/google/android/gms/internal/hh;->b:Ljava/util/Comparator;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/hh;-><init>(Lcom/google/android/gms/internal/he;Ljava/util/Comparator;)V

    return-object v1
.end method

.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/hh;->a:Lcom/google/android/gms/internal/he;

    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->h()Lcom/google/android/gms/internal/he;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/he$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/he$b",
            "<TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/hh;->a:Lcom/google/android/gms/internal/he;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/he;->a(Lcom/google/android/gms/internal/he$b;)V

    return-void
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/hh;->e(Ljava/lang/Object;)Lcom/google/android/gms/internal/he;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/hh;->a:Lcom/google/android/gms/internal/he;

    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->i()Lcom/google/android/gms/internal/he;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/hh;->e(Ljava/lang/Object;)Lcom/google/android/gms/internal/he;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->e()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hh;->a:Lcom/google/android/gms/internal/he;

    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->j()I

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/Object;)Lcom/google/android/gms/internal/gz;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lcom/google/android/gms/internal/gz",
            "<TK;TV;>;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/hh;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hh;->a:Lcom/google/android/gms/internal/he;

    iget-object v2, p0, Lcom/google/android/gms/internal/hh;->b:Ljava/util/Comparator;

    invoke-interface {v0, p1, v2}, Lcom/google/android/gms/internal/he;->a(Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/he;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/internal/he$a;->b:Lcom/google/android/gms/internal/he$a;

    move-object v2, v1

    move-object v4, v1

    move-object v5, v1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/he;->a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/internal/he$a;Lcom/google/android/gms/internal/he;Lcom/google/android/gms/internal/he;)Lcom/google/android/gms/internal/he;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/hh;

    iget-object v2, p0, Lcom/google/android/gms/internal/hh;->b:Ljava/util/Comparator;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/hh;-><init>(Lcom/google/android/gms/internal/he;Ljava/util/Comparator;)V

    move-object p0, v0

    goto :goto_0
.end method

.method public d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TK;"
        }
    .end annotation

    const/4 v2, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/hh;->a:Lcom/google/android/gms/internal/he;

    move-object v0, v2

    :goto_0
    invoke-interface {v1}, Lcom/google/android/gms/internal/he;->c()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p0, Lcom/google/android/gms/internal/hh;->b:Ljava/util/Comparator;

    invoke-interface {v1}, Lcom/google/android/gms/internal/he;->d()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, p1, v4}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    if-nez v3, :cond_3

    invoke-interface {v1}, Lcom/google/android/gms/internal/he;->f()Lcom/google/android/gms/internal/he;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/he;->c()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {v1}, Lcom/google/android/gms/internal/he;->f()Lcom/google/android/gms/internal/he;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->g()Lcom/google/android/gms/internal/he;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/he;->c()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->g()Lcom/google/android/gms/internal/he;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->d()Ljava/lang/Object;

    move-result-object v2

    :cond_1
    :goto_2
    return-object v2

    :cond_2
    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->d()Ljava/lang/Object;

    move-result-object v2

    goto :goto_2

    :cond_3
    if-gez v3, :cond_4

    invoke-interface {v1}, Lcom/google/android/gms/internal/he;->f()Lcom/google/android/gms/internal/he;

    move-result-object v1

    goto :goto_0

    :cond_4
    invoke-interface {v1}, Lcom/google/android/gms/internal/he;->g()Lcom/google/android/gms/internal/he;

    move-result-object v0

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x32

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Couldn\'t find predecessor key of non-present key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hh;->a:Lcom/google/android/gms/internal/he;

    invoke-interface {v0}, Lcom/google/android/gms/internal/he;->c()Z

    move-result v0

    return v0
.end method

.method public e()Ljava/util/Iterator;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ha;

    iget-object v1, p0, Lcom/google/android/gms/internal/hh;->a:Lcom/google/android/gms/internal/he;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/hh;->b:Ljava/util/Comparator;

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ha;-><init>(Lcom/google/android/gms/internal/he;Ljava/lang/Object;Ljava/util/Comparator;Z)V

    return-object v0
.end method

.method public f()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator",
            "<TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/hh;->b:Ljava/util/Comparator;

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ha;

    iget-object v1, p0, Lcom/google/android/gms/internal/hh;->a:Lcom/google/android/gms/internal/he;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/hh;->b:Ljava/util/Comparator;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ha;-><init>(Lcom/google/android/gms/internal/he;Ljava/lang/Object;Ljava/util/Comparator;Z)V

    return-object v0
.end method
