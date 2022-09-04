.class final Lcom/google/android/gms/internal/pc$a;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/pc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/oj",
        "<",
        "Ljava/util/Collection",
        "<TE;>;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/oj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/oj",
            "<TE;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/ox;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ox",
            "<+",
            "Ljava/util/Collection",
            "<TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/oj;Lcom/google/android/gms/internal/ox;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/nr;",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/android/gms/internal/oj",
            "<TE;>;",
            "Lcom/google/android/gms/internal/ox",
            "<+",
            "Ljava/util/Collection",
            "<TE;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/pm;

    invoke-direct {v0, p1, p3, p2}, Lcom/google/android/gms/internal/pm;-><init>(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/oj;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/pc$a;->a:Lcom/google/android/gms/internal/oj;

    iput-object p4, p0, Lcom/google/android/gms/internal/pc$a;->b:Lcom/google/android/gms/internal/ox;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/pp;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/pp;",
            ")",
            "Ljava/util/Collection",
            "<TE;>;"
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
    iget-object v0, p0, Lcom/google/android/gms/internal/pc$a;->b:Lcom/google/android/gms/internal/ox;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ox;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->a()V

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/pc$a;->a:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->b()V

    goto :goto_0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/pc$a;->a(Lcom/google/android/gms/internal/ps;Ljava/util/Collection;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ps;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ps;",
            "Ljava/util/Collection",
            "<TE;>;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->f()Lcom/google/android/gms/internal/ps;

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->b()Lcom/google/android/gms/internal/ps;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/pc$a;->a:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v2, p1, v1}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->c()Lcom/google/android/gms/internal/ps;

    goto :goto_0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pc$a;->a(Lcom/google/android/gms/internal/pp;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
