.class public Lcom/google/android/gms/internal/kg;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ij;

.field private final b:Lcom/google/android/gms/internal/kf;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/kg;->a:Lcom/google/android/gms/internal/ij;

    iput-object p2, p0, Lcom/google/android/gms/internal/kg;->b:Lcom/google/android/gms/internal/kf;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/kg;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/kg;

    sget-object v1, Lcom/google/android/gms/internal/kf;->a:Lcom/google/android/gms/internal/kf;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/kg;-><init>(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/ij;Ljava/util/Map;)Lcom/google/android/gms/internal/kg;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/internal/kg;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/kf;->a(Ljava/util/Map;)Lcom/google/android/gms/internal/kf;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/kg;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/kg;-><init>(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/kf;)V

    return-object v1
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/ij;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->a:Lcom/google/android/gms/internal/ij;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/internal/kf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->b:Lcom/google/android/gms/internal/kf;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/lb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->b:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kf;->j()Lcom/google/android/gms/internal/lb;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->b:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kf;->n()Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->b:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kf;->m()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    check-cast p1, Lcom/google/android/gms/internal/kg;

    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->a:Lcom/google/android/gms/internal/ij;

    iget-object v3, p1, Lcom/google/android/gms/internal/kg;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ij;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/kg;->b:Lcom/google/android/gms/internal/kf;

    iget-object v3, p1, Lcom/google/android/gms/internal/kg;->b:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/kf;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->b:Lcom/google/android/gms/internal/kf;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kf;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/kg;->a:Lcom/google/android/gms/internal/ij;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/kg;->b:Lcom/google/android/gms/internal/kf;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
