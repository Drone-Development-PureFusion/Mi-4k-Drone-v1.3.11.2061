.class public Lcom/google/android/gms/vision/face/d;
.super Lcom/google/android/gms/vision/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/face/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/vision/c",
        "<",
        "Lcom/google/android/gms/vision/face/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/vision/b;Lcom/google/android/gms/vision/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b",
            "<",
            "Lcom/google/android/gms/vision/face/a;",
            ">;",
            "Lcom/google/android/gms/vision/g",
            "<",
            "Lcom/google/android/gms/vision/face/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/vision/c;-><init>(Lcom/google/android/gms/vision/b;Lcom/google/android/gms/vision/g;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/vision/face/d;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/vision/face/d;->a(I)V

    return-void
.end method


# virtual methods
.method public b(Lcom/google/android/gms/vision/b$a;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b$a",
            "<",
            "Lcom/google/android/gms/vision/face/a;",
            ">;)I"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/vision/b$a;->a()Landroid/util/SparseArray;

    move-result-object v5

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No faces for selectFocus."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/face/a;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/face/a;->b()F

    move-result v1

    const/4 v0, 0x1

    move v3, v2

    move v2, v1

    move v1, v0

    :goto_0
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/face/a;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/face/a;->b()F

    move-result v0

    cmpl-float v6, v0, v2

    if-lez v6, :cond_1

    move v2, v0

    move v3, v4

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    return v3
.end method
