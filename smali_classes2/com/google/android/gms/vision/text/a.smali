.class public Lcom/google/android/gms/vision/text/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/vision/text/c;


# instance fields
.field private a:Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;


# direct methods
.method constructor <init>(Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/vision/text/a;->a:Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/text/a;->a:Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;

    iget-object v0, v0, Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;->g:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/text/a;->a:Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;

    iget-object v0, v0, Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;->e:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/google/android/gms/vision/text/a;->a:Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;

    iget-object v0, v0, Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;->c:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

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

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method
