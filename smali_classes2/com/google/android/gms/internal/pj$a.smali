.class public final Lcom/google/android/gms/internal/pj$a;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/pj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/oj",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ox;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ox",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/pj$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ox;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ox",
            "<TT;>;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/pj$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/pj$a;->a:Lcom/google/android/gms/internal/ox;

    iput-object p2, p0, Lcom/google/android/gms/internal/pj$a;->b:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ox;Ljava/util/Map;Lcom/google/android/gms/internal/pj$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/pj$a;-><init>(Lcom/google/android/gms/internal/ox;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ps;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->f()Lcom/google/android/gms/internal/ps;

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->d()Lcom/google/android/gms/internal/ps;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/pj$a;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/pj$b;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/pj$b;->a(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/google/android/gms/internal/pj$b;->g:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ps;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/pj$b;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->e()Lcom/google/android/gms/internal/ps;

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/pp;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/pq;->i:Lcom/google/android/gms/internal/pq;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->j()V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/pj$a;->a:Lcom/google/android/gms/internal/ox;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ox;->a()Ljava/lang/Object;

    move-result-object v1

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->c()V

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->g()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/pj$a;->b:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/pj$b;

    if-eqz v0, :cond_1

    iget-boolean v2, v0, Lcom/google/android/gms/internal/pj$b;->i:Z

    if-nez v2, :cond_2

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->n()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/og;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/og;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    :try_start_1
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/pj$b;->a(Lcom/google/android/gms/internal/pp;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->d()V

    move-object v0, v1

    goto :goto_0
.end method
