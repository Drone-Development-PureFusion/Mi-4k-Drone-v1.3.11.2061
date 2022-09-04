.class abstract Lcom/google/android/gms/internal/ow$c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<TT;>;"
    }
.end annotation


# instance fields
.field b:Lcom/google/android/gms/internal/ow$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ow$d",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field c:Lcom/google/android/gms/internal/ow$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ow$d",
            "<TK;TV;>;"
        }
    .end annotation
.end field

.field d:I

.field final synthetic e:Lcom/google/android/gms/internal/ow;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ow;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ow$c;->e:Lcom/google/android/gms/internal/ow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ow$c;->e:Lcom/google/android/gms/internal/ow;

    iget-object v0, v0, Lcom/google/android/gms/internal/ow;->e:Lcom/google/android/gms/internal/ow$d;

    iget-object v0, v0, Lcom/google/android/gms/internal/ow$d;->d:Lcom/google/android/gms/internal/ow$d;

    iput-object v0, p0, Lcom/google/android/gms/internal/ow$c;->b:Lcom/google/android/gms/internal/ow$d;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ow$c;->c:Lcom/google/android/gms/internal/ow$d;

    iget-object v0, p0, Lcom/google/android/gms/internal/ow$c;->e:Lcom/google/android/gms/internal/ow;

    iget v0, v0, Lcom/google/android/gms/internal/ow;->d:I

    iput v0, p0, Lcom/google/android/gms/internal/ow$c;->d:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ow;Lcom/google/android/gms/internal/ow$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ow$c;-><init>(Lcom/google/android/gms/internal/ow;)V

    return-void
.end method


# virtual methods
.method final b()Lcom/google/android/gms/internal/ow$d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ow$d",
            "<TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ow$c;->b:Lcom/google/android/gms/internal/ow$d;

    iget-object v1, p0, Lcom/google/android/gms/internal/ow$c;->e:Lcom/google/android/gms/internal/ow;

    iget-object v1, v1, Lcom/google/android/gms/internal/ow;->e:Lcom/google/android/gms/internal/ow$d;

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ow$c;->e:Lcom/google/android/gms/internal/ow;

    iget v1, v1, Lcom/google/android/gms/internal/ow;->d:I

    iget v2, p0, Lcom/google/android/gms/internal/ow$c;->d:I

    if-eq v1, v2, :cond_1

    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    iget-object v1, v0, Lcom/google/android/gms/internal/ow$d;->d:Lcom/google/android/gms/internal/ow$d;

    iput-object v1, p0, Lcom/google/android/gms/internal/ow$c;->b:Lcom/google/android/gms/internal/ow$d;

    iput-object v0, p0, Lcom/google/android/gms/internal/ow$c;->c:Lcom/google/android/gms/internal/ow$d;

    return-object v0
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ow$c;->b:Lcom/google/android/gms/internal/ow$d;

    iget-object v1, p0, Lcom/google/android/gms/internal/ow$c;->e:Lcom/google/android/gms/internal/ow;

    iget-object v1, v1, Lcom/google/android/gms/internal/ow;->e:Lcom/google/android/gms/internal/ow$d;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ow$c;->c:Lcom/google/android/gms/internal/ow$d;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ow$c;->e:Lcom/google/android/gms/internal/ow;

    iget-object v1, p0, Lcom/google/android/gms/internal/ow$c;->c:Lcom/google/android/gms/internal/ow$d;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ow;->a(Lcom/google/android/gms/internal/ow$d;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ow$c;->c:Lcom/google/android/gms/internal/ow$d;

    iget-object v0, p0, Lcom/google/android/gms/internal/ow$c;->e:Lcom/google/android/gms/internal/ow;

    iget v0, v0, Lcom/google/android/gms/internal/ow;->d:I

    iput v0, p0, Lcom/google/android/gms/internal/ow$c;->d:I

    return-void
.end method
