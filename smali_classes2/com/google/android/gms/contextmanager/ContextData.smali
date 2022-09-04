.class public Lcom/google/android/gms/contextmanager/ContextData;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/ContextData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private b:Lcom/google/android/gms/internal/py;

.field private c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/b;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/ContextData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(I[B)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/ContextData;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/ContextData;->c:[B

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/ContextData;->f()V

    return-void
.end method

.method private e()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/ContextData;->a()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->c:[B

    invoke-static {v0}, Lcom/google/android/gms/internal/py;->a([B)Lcom/google/android/gms/internal/py;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->c:[B
    :try_end_0
    .catch Lcom/google/android/gms/internal/rc; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/ContextData;->f()V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "ContextData"

    const-string v2, "Could not deserialize context bytes."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->c:[B

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->c:[B

    if-eqz v0, :cond_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->c:[B

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid internal representation - full"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->c:[B

    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid internal representation - empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Impossible"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method a()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->a:I

    return v0
.end method

.method c()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->c:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->c:[B

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    invoke-static {v0}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/rd;)[B

    move-result-object v0

    goto :goto_0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/ContextData;->e()V

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    iget-object v0, v0, Lcom/google/android/gms/internal/py;->b:Ljava/lang/String;

    return-object v0
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
    instance-of v2, p1, Lcom/google/android/gms/contextmanager/ContextData;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/contextmanager/ContextData;

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/ContextData;->e()V

    invoke-direct {p1}, Lcom/google/android/gms/contextmanager/ContextData;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/ContextData;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/contextmanager/ContextData;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    iget-object v2, v2, Lcom/google/android/gms/internal/py;->c:Lcom/google/android/gms/internal/qb;

    iget v2, v2, Lcom/google/android/gms/internal/qb;->c:I

    iget-object v3, p1, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    iget-object v3, v3, Lcom/google/android/gms/internal/py;->c:Lcom/google/android/gms/internal/qb;

    iget v3, v3, Lcom/google/android/gms/internal/qb;->c:I

    if-eq v2, v3, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/ContextData;->e()V

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/ContextData;->d()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    iget-object v2, v2, Lcom/google/android/gms/internal/py;->c:Lcom/google/android/gms/internal/qb;

    iget v2, v2, Lcom/google/android/gms/internal/qb;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/ContextData;->e()V

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/ContextData;->b:Lcom/google/android/gms/internal/py;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/py;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/b;->a(Lcom/google/android/gms/contextmanager/ContextData;Landroid/os/Parcel;I)V

    return-void
.end method
