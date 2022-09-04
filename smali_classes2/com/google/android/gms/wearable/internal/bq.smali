.class public Lcom/google/android/gms/wearable/internal/bq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/f;


# instance fields
.field private c:I

.field private d:Lcom/google/android/gms/wearable/h;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/wearable/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lcom/google/android/gms/wearable/f;->d()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/wearable/internal/bq;->c:I

    invoke-interface {p1}, Lcom/google/android/gms/wearable/f;->c()Lcom/google/android/gms/wearable/h;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/wearable/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/h;

    iput-object v0, p0, Lcom/google/android/gms/wearable/internal/bq;->d:Lcom/google/android/gms/wearable/h;

    return-void
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/bq;->e()Lcom/google/android/gms/wearable/f;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c()Lcom/google/android/gms/wearable/h;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bq;->d:Lcom/google/android/gms/wearable/h;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wearable/internal/bq;->c:I

    return v0
.end method

.method public e()Lcom/google/android/gms/wearable/f;
    .locals 0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/bq;->d()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string v0, "changed"

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/bq;->c()Lcom/google/android/gms/wearable/h;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x23

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "DataEventEntity{ type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", dataitem="

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
    invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/bq;->d()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const-string v0, "deleted"

    goto :goto_0

    :cond_1
    const-string v0, "unknown"

    goto :goto_0
.end method
