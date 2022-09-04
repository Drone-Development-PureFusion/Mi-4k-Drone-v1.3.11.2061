.class public final Lcom/google/android/gms/internal/oa;
.super Lcom/google/android/gms/internal/nx;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ow",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/nx;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/nx;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ow;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ow;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/oa;->a:Lcom/google/android/gms/internal/ow;

    return-void
.end method

.method private a(Ljava/lang/Object;)Lcom/google/android/gms/internal/nx;
    .locals 1

    if-nez p1, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/nz;->a:Lcom/google/android/gms/internal/nz;

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/od;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/od;-><init>(Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/nx;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/oa;->a:Lcom/google/android/gms/internal/ow;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ow;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/internal/nx;)V
    .locals 1

    if-nez p2, :cond_0

    sget-object p2, Lcom/google/android/gms/internal/nz;->a:Lcom/google/android/gms/internal/nz;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/oa;->a:Lcom/google/android/gms/internal/ow;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ow;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/nx;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/String;Lcom/google/android/gms/internal/nx;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/nx;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/String;Lcom/google/android/gms/internal/nx;)V

    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/oa;->a:Lcom/google/android/gms/internal/ow;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ow;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/internal/nx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/oa;->a:Lcom/google/android/gms/internal/ow;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ow;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nx;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/internal/nu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/oa;->a:Lcom/google/android/gms/internal/ow;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ow;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nu;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-eq p1, p0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/internal/oa;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/oa;

    iget-object v0, p1, Lcom/google/android/gms/internal/oa;->a:Lcom/google/android/gms/internal/ow;

    iget-object v1, p0, Lcom/google/android/gms/internal/oa;->a:Lcom/google/android/gms/internal/ow;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ow;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/oa;->a:Lcom/google/android/gms/internal/ow;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ow;->hashCode()I

    move-result v0

    return v0
.end method
