.class public Lcom/google/android/gms/location/places/internal/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/location/places/i;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I

.field private final d:Ljava/lang/CharSequence;

.field private e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IILjava/lang/CharSequence;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/location/places/internal/p;->a:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/location/places/internal/p;->b:I

    iput p3, p0, Lcom/google/android/gms/location/places/internal/p;->c:I

    iput-object p4, p0, Lcom/google/android/gms/location/places/internal/p;->d:Ljava/lang/CharSequence;

    iput p5, p0, Lcom/google/android/gms/location/places/internal/p;->e:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/location/places/internal/p;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/p;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/location/places/internal/p;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/location/places/internal/p;->e:I

    return v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/location/places/PlacePhotoResult;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/p;->c()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/p;->d()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/location/places/internal/p;->a(Lcom/google/android/gms/common/api/g;II)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;II)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "II)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/location/places/PlacePhotoResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/location/places/internal/p$1;

    sget-object v2, Lcom/google/android/gms/location/places/l;->c:Lcom/google/android/gms/common/api/a;

    move-object v1, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/location/places/internal/p$1;-><init>(Lcom/google/android/gms/location/places/internal/p;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;II)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/p;->f()Lcom/google/android/gms/location/places/i;

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

    iget v0, p0, Lcom/google/android/gms/location/places/internal/p;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/location/places/internal/p;->c:I

    return v0
.end method

.method public e()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/internal/p;->d:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/location/places/internal/p;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/location/places/internal/p;

    iget v2, p1, Lcom/google/android/gms/location/places/internal/p;->b:I

    iget v3, p0, Lcom/google/android/gms/location/places/internal/p;->b:I

    if-ne v2, v3, :cond_3

    iget v2, p1, Lcom/google/android/gms/location/places/internal/p;->c:I

    iget v3, p0, Lcom/google/android/gms/location/places/internal/p;->c:I

    if-ne v2, v3, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/location/places/internal/p;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/location/places/internal/p;->a:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p1, Lcom/google/android/gms/location/places/internal/p;->d:Ljava/lang/CharSequence;

    iget-object v3, p0, Lcom/google/android/gms/location/places/internal/p;->d:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public f()Lcom/google/android/gms/location/places/i;
    .locals 0

    return-object p0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/location/places/internal/p;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/location/places/internal/p;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/p;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/location/places/internal/p;->d:Ljava/lang/CharSequence;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
