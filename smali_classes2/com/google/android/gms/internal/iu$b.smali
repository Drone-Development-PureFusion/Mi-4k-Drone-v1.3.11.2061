.class Lcom/google/android/gms/internal/iu$b;
.super Lcom/google/android/gms/internal/ie;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/iu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private b:Lcom/google/android/gms/internal/kg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/kg;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ie;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/iu$b;->b:Lcom/google/android/gms/internal/kg;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/ie;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/iu$b;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/iu$b;-><init>(Lcom/google/android/gms/internal/kg;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ka;Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kb;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public a()Lcom/google/android/gms/internal/kg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$b;->b:Lcom/google/android/gms/internal/kg;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/kb;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/firebase/database/c;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ie;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/android/gms/internal/iu$b;

    return v0
.end method

.method public a(Lcom/google/android/gms/internal/kc$a;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/iu$b;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/iu$b;

    iget-object v0, p1, Lcom/google/android/gms/internal/iu$b;->b:Lcom/google/android/gms/internal/kg;

    iget-object v1, p0, Lcom/google/android/gms/internal/iu$b;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kg;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$b;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->hashCode()I

    move-result v0

    return v0
.end method
