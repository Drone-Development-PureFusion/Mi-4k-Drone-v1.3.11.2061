.class public Lcom/google/firebase/database/k;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ir;

.field private final b:Lcom/google/android/gms/internal/ij;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ir;Lcom/google/android/gms/internal/ij;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/database/k;->a:Lcom/google/android/gms/internal/ir;

    iput-object p2, p0, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    iget-object v0, p0, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    invoke-virtual {p0}, Lcom/google/firebase/database/k;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/iz;->a(Lcom/google/android/gms/internal/ij;Ljava/lang/Object;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ir;Lcom/google/android/gms/internal/ij;Lcom/google/firebase/database/k$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/database/k;-><init>(Lcom/google/android/gms/internal/ir;Lcom/google/android/gms/internal/ij;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/lh;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ir;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ir;-><init>(Lcom/google/android/gms/internal/lh;)V

    new-instance v1, Lcom/google/android/gms/internal/ij;

    const-string v2, ""

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lcom/google/firebase/database/k;-><init>(Lcom/google/android/gms/internal/ir;Lcom/google/android/gms/internal/ij;)V

    return-void
.end method

.method static synthetic a(Lcom/google/firebase/database/k;)Lcom/google/android/gms/internal/ir;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/k;->a:Lcom/google/android/gms/internal/ir;

    return-object v0
.end method

.method static synthetic b(Lcom/google/firebase/database/k;)Lcom/google/android/gms/internal/ij;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    return-object v0
.end method


# virtual methods
.method a()Lcom/google/android/gms/internal/lh;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/database/k;->a:Lcom/google/android/gms/internal/ir;

    iget-object v1, p0, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ir;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/firebase/database/h;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/firebase/database/h",
            "<TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/database/k;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/mm;->a(Ljava/lang/Object;Lcom/google/firebase/database/h;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/database/k;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/mm;->a(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/iz;->a(Lcom/google/android/gms/internal/ij;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/mm;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ml;->a(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/firebase/database/k;->a:Lcom/google/android/gms/internal/ir;

    iget-object v2, p0, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    invoke-static {v0}, Lcom/google/android/gms/internal/li;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ir;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/firebase/database/k;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ij;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)Lcom/google/firebase/database/k;
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/internal/ml;->a(Ljava/lang/String;)V

    new-instance v0, Lcom/google/firebase/database/k;

    iget-object v1, p0, Lcom/google/firebase/database/k;->a:Lcom/google/android/gms/internal/ir;

    iget-object v2, p0, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    new-instance v3, Lcom/google/android/gms/internal/ij;

    invoke-direct {v3, p1}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/database/k;-><init>(Lcom/google/android/gms/internal/ir;Lcom/google/android/gms/internal/ij;)V

    return-object v0
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/database/k;->a:Lcom/google/android/gms/internal/ir;

    iget-object v1, p0, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    invoke-virtual {p0}, Lcom/google/firebase/database/k;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-static {p1}, Lcom/google/android/gms/internal/ll;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/lh;->b(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ir;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    return-void
.end method

.method public b()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/firebase/database/k;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()J
    .locals 2

    invoke-virtual {p0}, Lcom/google/firebase/database/k;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->c()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public d()Ljava/lang/Iterable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable",
            "<",
            "Lcom/google/firebase/database/k;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/database/k;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    new-instance v0, Lcom/google/firebase/database/k$1;

    invoke-direct {v0, p0}, Lcom/google/firebase/database/k$1;-><init>(Lcom/google/firebase/database/k;)V

    :goto_0
    return-object v0

    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lc;->iterator()Ljava/util/Iterator;

    move-result-object v1

    new-instance v0, Lcom/google/firebase/database/k$2;

    invoke-direct {v0, p0, v1}, Lcom/google/firebase/database/k$2;-><init>(Lcom/google/firebase/database/k;Ljava/util/Iterator;)V

    goto :goto_0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->g()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->g()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kv;->e()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/firebase/database/k;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/firebase/database/k;->a:Lcom/google/android/gms/internal/ir;

    move-object v0, p1

    check-cast v0, Lcom/google/firebase/database/k;

    iget-object v0, v0, Lcom/google/firebase/database/k;->a:Lcom/google/android/gms/internal/ir;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    check-cast p1, Lcom/google/firebase/database/k;

    iget-object v1, p1, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ij;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/database/k;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/database/k;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->f()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/database/k;->b:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kv;->e()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/google/firebase/database/k;->a:Lcom/google/android/gms/internal/ir;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ir;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/lh;->a(Z)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x20

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "MutableData { key = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", value = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "<none>"

    goto :goto_0
.end method
