.class public Lcom/google/android/gms/vision/text/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/vision/text/c;


# instance fields
.field private a:Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/vision/text/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/vision/text/b;->a:Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    return-void
.end method


# virtual methods
.method a()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/vision/text/a;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/vision/text/b;->a:Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    iget-object v0, v0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->b:[Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;

    array-length v0, v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/text/b;->b:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/google/android/gms/vision/text/b;->a:Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    iget-object v2, v2, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->b:[Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;

    array-length v2, v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/vision/text/b;->b:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/vision/text/b;->a:Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    iget-object v2, v0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->b:[Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;

    array-length v3, v2

    move v0, v1

    :goto_1
    if-ge v0, v3, :cond_1

    aget-object v1, v2, v0

    iget-object v4, p0, Lcom/google/android/gms/vision/text/b;->b:Ljava/util/List;

    new-instance v5, Lcom/google/android/gms/vision/text/a;

    invoke-direct {v5, v1}, Lcom/google/android/gms/vision/text/a;-><init>(Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/vision/text/b;->b:Ljava/util/List;

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/text/b;->a:Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    iget-object v0, v0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->f:Ljava/lang/String;

    return-object v0
.end method

.method public c()Landroid/graphics/Rect;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/vision/text/f;->a(Lcom/google/android/gms/vision/text/c;)Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public d()[Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/text/b;->a:Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    iget-object v0, v0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->c:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

    invoke-static {v0}, Lcom/google/android/gms/vision/text/f;->a(Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;)[Landroid/graphics/Point;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/vision/text/c;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/vision/text/b;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/text/b;->a:Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    iget-object v0, v0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->h:Ljava/lang/String;

    return-object v0
.end method

.method public g()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/text/b;->a:Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    iget-object v0, v0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->c:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

    iget v0, v0, Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;->f:F

    return v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/text/b;->a:Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    iget-boolean v0, v0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->j:Z

    return v0
.end method
