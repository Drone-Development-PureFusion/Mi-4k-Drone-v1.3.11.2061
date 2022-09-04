.class public final Lcom/google/android/gms/internal/pg;
.super Lcom/google/android/gms/internal/ps;


# static fields
.field private static final a:Ljava/io/Writer;

.field private static final b:Lcom/google/android/gms/internal/od;


# instance fields
.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/nx;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:Lcom/google/android/gms/internal/nx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/pg$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/pg$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/pg;->a:Ljava/io/Writer;

    new-instance v0, Lcom/google/android/gms/internal/od;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/od;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/pg;->b:Lcom/google/android/gms/internal/od;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/pg;->a:Ljava/io/Writer;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ps;-><init>(Ljava/io/Writer;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    sget-object v0, Lcom/google/android/gms/internal/nz;->a:Lcom/google/android/gms/internal/nz;

    iput-object v0, p0, Lcom/google/android/gms/internal/pg;->e:Lcom/google/android/gms/internal/nx;

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/nx;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->d:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/nx;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/pg;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/pg;->j()Lcom/google/android/gms/internal/nx;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/oa;

    iget-object v1, p0, Lcom/google/android/gms/internal/pg;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/String;Lcom/google/android/gms/internal/nx;)V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/pg;->d:Ljava/lang/String;

    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iput-object p1, p0, Lcom/google/android/gms/internal/pg;->e:Lcom/google/android/gms/internal/nx;

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/pg;->j()Lcom/google/android/gms/internal/nx;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/nu;

    if-eqz v1, :cond_4

    check-cast v0, Lcom/google/android/gms/internal/nu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/nu;->a(Lcom/google/android/gms/internal/nx;)V

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method private j()Lcom/google/android/gms/internal/nx;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nx;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/nx;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v1, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x22

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Expected one JSON element but was "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->e:Lcom/google/android/gms/internal/nx;

    return-object v0
.end method

.method public a(J)Lcom/google/android/gms/internal/ps;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/od;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/od;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/pg;->a(Lcom/google/android/gms/internal/nx;)V

    return-object p0
.end method

.method public a(Ljava/lang/Number;)Lcom/google/android/gms/internal/ps;
    .locals 4

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/pg;->f()Lcom/google/android/gms/internal/ps;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/pg;->g()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x21

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "JSON forbids NaN and infinities: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/od;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/od;-><init>(Ljava/lang/Number;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/pg;->a(Lcom/google/android/gms/internal/nx;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/pg;->j()Lcom/google/android/gms/internal/nx;

    move-result-object v0

    instance-of v0, v0, Lcom/google/android/gms/internal/oa;

    if-eqz v0, :cond_2

    iput-object p1, p0, Lcom/google/android/gms/internal/pg;->d:Ljava/lang/String;

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public a(Z)Lcom/google/android/gms/internal/ps;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/od;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/od;-><init>(Ljava/lang/Boolean;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/pg;->a(Lcom/google/android/gms/internal/nx;)V

    return-object p0
.end method

.method public b()Lcom/google/android/gms/internal/ps;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/nu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/nu;-><init>()V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/pg;->a(Lcom/google/android/gms/internal/nx;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/pg;->f()Lcom/google/android/gms/internal/ps;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/od;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/od;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/pg;->a(Lcom/google/android/gms/internal/nx;)V

    goto :goto_0
.end method

.method public c()Lcom/google/android/gms/internal/ps;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/pg;->j()Lcom/google/android/gms/internal/nx;

    move-result-object v0

    instance-of v0, v0, Lcom/google/android/gms/internal/nu;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    sget-object v1, Lcom/google/android/gms/internal/pg;->b:Lcom/google/android/gms/internal/od;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d()Lcom/google/android/gms/internal/ps;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/oa;

    invoke-direct {v0}, Lcom/google/android/gms/internal/oa;-><init>()V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/pg;->a(Lcom/google/android/gms/internal/nx;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public e()Lcom/google/android/gms/internal/ps;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/pg;->j()Lcom/google/android/gms/internal/nx;

    move-result-object v0

    instance-of v0, v0, Lcom/google/android/gms/internal/oa;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/internal/pg;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public f()Lcom/google/android/gms/internal/ps;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/nz;->a:Lcom/google/android/gms/internal/nz;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/pg;->a(Lcom/google/android/gms/internal/nx;)V

    return-object p0
.end method

.method public flush()V
    .locals 0

    return-void
.end method
