.class public Lcom/google/android/gms/internal/la;
.super Lcom/google/android/gms/internal/kw;

# interfaces
.implements Lcom/google/android/gms/internal/lh;


# static fields
.field private static final c:Lcom/google/android/gms/internal/la;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/la;

    invoke-direct {v0}, Lcom/google/android/gms/internal/la;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/la;->c:Lcom/google/android/gms/internal/la;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/kw;-><init>()V

    return-void
.end method

.method public static j()Lcom/google/android/gms/internal/la;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/la;->c:Lcom/google/android/gms/internal/la;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/lh;)I
    .locals 1

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;
    .locals 0

    return-object p0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p2

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/la;->c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->e()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-interface {v1, v2, p2}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/la;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object p2

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 1

    invoke-interface {p2}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/kv;->f()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/kw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/kw;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/kw;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object p0

    goto :goto_0
.end method

.method public a()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Z)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lh$a;)Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/kv;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/kv;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/la;->c(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/la;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/la;
    .locals 0

    return-object p0
.end method

.method public c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;
    .locals 0

    return-object p0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/lh;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/la;->a(Lcom/google/android/gms/internal/lh;)I

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v1, 0x1

    instance-of v0, p1, Lcom/google/android/gms/internal/la;

    if-eqz v0, :cond_0

    :goto_0
    return v1

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/lh;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/lh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/la;->f()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    check-cast p1, Lcom/google/android/gms/internal/lh;

    invoke-interface {p1}, Lcom/google/android/gms/internal/lh;->f()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public f()Lcom/google/android/gms/internal/lh;
    .locals 0

    return-object p0
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public i()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/internal/lg;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/internal/lg;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "<Empty Node>"

    return-object v0
.end method
