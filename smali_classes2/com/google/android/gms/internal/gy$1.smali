.class Lcom/google/android/gms/internal/gy$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/gy;->a(IZ)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# instance fields
.field a:I

.field final synthetic b:I

.field final synthetic c:Z

.field final synthetic d:Lcom/google/android/gms/internal/gy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gy;IZ)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/gy$1;->d:Lcom/google/android/gms/internal/gy;

    iput p2, p0, Lcom/google/android/gms/internal/gy$1;->b:I

    iput-boolean p3, p0, Lcom/google/android/gms/internal/gy$1;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p0, Lcom/google/android/gms/internal/gy$1;->b:I

    iput v0, p0, Lcom/google/android/gms/internal/gy$1;->a:I

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map$Entry;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/gy$1;->d:Lcom/google/android/gms/internal/gy;

    invoke-static {v0}, Lcom/google/android/gms/internal/gy;->a(Lcom/google/android/gms/internal/gy;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/gy$1;->a:I

    aget-object v1, v0, v1

    iget-object v0, p0, Lcom/google/android/gms/internal/gy$1;->d:Lcom/google/android/gms/internal/gy;

    invoke-static {v0}, Lcom/google/android/gms/internal/gy;->b(Lcom/google/android/gms/internal/gy;)[Ljava/lang/Object;

    move-result-object v0

    iget v2, p0, Lcom/google/android/gms/internal/gy$1;->a:I

    aget-object v2, v0, v2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gy$1;->c:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/gy$1;->a:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    iput v0, p0, Lcom/google/android/gms/internal/gy$1;->a:I

    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/gy$1;->a:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public hasNext()Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/google/android/gms/internal/gy$1;->c:Z

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/google/android/gms/internal/gy$1;->a:I

    if-ltz v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    iget v2, p0, Lcom/google/android/gms/internal/gy$1;->a:I

    iget-object v3, p0, Lcom/google/android/gms/internal/gy$1;->d:Lcom/google/android/gms/internal/gy;

    invoke-static {v3}, Lcom/google/android/gms/internal/gy;->a(Lcom/google/android/gms/internal/gy;)[Ljava/lang/Object;

    move-result-object v3

    array-length v3, v3

    if-lt v2, v3, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gy$1;->a()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Can\'t remove elements from ImmutableSortedMap"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
