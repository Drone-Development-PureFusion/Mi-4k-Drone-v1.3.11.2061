.class public final Lcom/google/android/gms/vision/text/e;
.super Lcom/google/android/gms/vision/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/text/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/vision/b",
        "<",
        "Lcom/google/android/gms/vision/text/d;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/vision/text/internal/client/g;


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/vision/b;-><init>()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Default constructor called"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private constructor <init>(Lcom/google/android/gms/vision/text/internal/client/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/vision/b;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/vision/text/e;->a:Lcom/google/android/gms/vision/text/internal/client/g;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/vision/text/internal/client/g;Lcom/google/android/gms/vision/text/e$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/text/e;-><init>(Lcom/google/android/gms/vision/text/internal/client/g;)V

    return-void
.end method

.method private a(Landroid/graphics/Bitmap;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)Landroid/graphics/Bitmap;
    .locals 7

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    iget v0, p2, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->f:I

    if-eqz v0, :cond_0

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    iget v0, p2, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->f:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/vision/text/e;->b(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v5, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    move-object v0, p1

    move v2, v1

    move v6, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    :cond_0
    iget v0, p2, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->f:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget v0, p2, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->f:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    :cond_1
    iput v4, p2, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->b:I

    iput v3, p2, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->c:I

    :cond_2
    return-object p1
.end method

.method private a(Ljava/nio/ByteBuffer;III)Landroid/graphics/Bitmap;
    .locals 8

    const/4 v7, 0x0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    :goto_0
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v0, Landroid/graphics/YuvImage;

    const/4 v5, 0x0

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, v7, v7, p3, p4}, Landroid/graphics/Rect;-><init>(IIII)V

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v6}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v1, v0

    invoke-static {v0, v7, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    new-array v1, v0, [B

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    goto :goto_0
.end method

.method private a(Landroid/graphics/Rect;IILcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)Landroid/graphics/Rect;
    .locals 5

    iget v0, p4, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->f:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-object p1

    :pswitch_0
    new-instance v0, Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int v1, p3, v1

    iget v2, p1, Landroid/graphics/Rect;->left:I

    iget v3, p1, Landroid/graphics/Rect;->top:I

    sub-int v3, p3, v3

    iget v4, p1, Landroid/graphics/Rect;->right:I

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object p1, v0

    goto :goto_0

    :pswitch_1
    new-instance v0, Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/Rect;->right:I

    sub-int v1, p2, v1

    iget v2, p1, Landroid/graphics/Rect;->bottom:I

    sub-int v2, p3, v2

    iget v3, p1, Landroid/graphics/Rect;->left:I

    sub-int v3, p2, v3

    iget v4, p1, Landroid/graphics/Rect;->top:I

    sub-int v4, p3, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object p1, v0

    goto :goto_0

    :pswitch_2
    new-instance v0, Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/Rect;->top:I

    iget v2, p1, Landroid/graphics/Rect;->right:I

    sub-int v2, p2, v2

    iget v3, p1, Landroid/graphics/Rect;->bottom:I

    iget v4, p1, Landroid/graphics/Rect;->left:I

    sub-int v4, p2, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object p1, v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a([Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;)Landroid/util/SparseArray;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;",
            ")",
            "Landroid/util/SparseArray",
            "<",
            "Lcom/google/android/gms/vision/text/d;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    array-length v4, p1

    move v2, v1

    :goto_0
    if-ge v2, v4, :cond_1

    aget-object v5, p1, v2

    iget v0, v5, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->k:I

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/SparseArray;

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iget v6, v5, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->k:I

    invoke-virtual {v3, v6, v0}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_0
    iget v6, v5, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->l:I

    invoke-virtual {v0, v6, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_1
    new-instance v2, Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v0

    invoke-direct {v2, v0}, Landroid/util/SparseArray;-><init>(I)V

    :goto_1
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    new-instance v5, Lcom/google/android/gms/vision/text/d;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/SparseArray;

    invoke-direct {v5, v0}, Lcom/google/android/gms/vision/text/d;-><init>(Landroid/util/SparseArray;)V

    invoke-virtual {v2, v4, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    return-object v2
.end method

.method private b(I)I
    .locals 2

    packed-switch p1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported rotation degree."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_1
    const/16 v0, 0x5a

    goto :goto_0

    :pswitch_2
    const/16 v0, 0xb4

    goto :goto_0

    :pswitch_3
    const/16 v0, 0x10e

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public a(Lcom/google/android/gms/vision/d;)Landroid/util/SparseArray;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/d;",
            ")",
            "Landroid/util/SparseArray",
            "<",
            "Lcom/google/android/gms/vision/text/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;

    const/4 v1, 0x1

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;-><init>(ILandroid/graphics/Rect;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/vision/text/e;->a(Lcom/google/android/gms/vision/d;Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;)Landroid/util/SparseArray;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/vision/d;Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;)Landroid/util/SparseArray;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/d;",
            "Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;",
            ")",
            "Landroid/util/SparseArray",
            "<",
            "Lcom/google/android/gms/vision/text/d;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No frame supplied."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->a(Lcom/google/android/gms/vision/d;)Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/vision/text/e;->a(Landroid/graphics/Bitmap;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v2, p2, Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;->b:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p2, Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;->b:Landroid/graphics/Rect;

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/vision/d$b;->a()I

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/vision/d$b;->b()I

    move-result v4

    invoke-direct {p0, v2, v3, v4, v1}, Lcom/google/android/gms/vision/text/e;->a(Landroid/graphics/Rect;IILcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)Landroid/graphics/Rect;

    move-result-object v2

    iget-object v3, p2, Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;->b:Landroid/graphics/Rect;

    invoke-virtual {v3, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    :cond_1
    const/4 v2, 0x0

    iput v2, v1, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->f:I

    iget-object v2, p0, Lcom/google/android/gms/vision/text/e;->a:Lcom/google/android/gms/vision/text/internal/client/g;

    invoke-virtual {v2, v0, v1, p2}, Lcom/google/android/gms/vision/text/internal/client/g;->a(Landroid/graphics/Bitmap;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;)[Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/vision/text/e;->a([Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;)Landroid/util/SparseArray;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d;->b()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/vision/d$b;->f()I

    move-result v0

    iget v3, v1, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->b:I

    iget v4, v1, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->c:I

    invoke-direct {p0, v2, v0, v3, v4}, Lcom/google/android/gms/vision/text/e;->a(Ljava/nio/ByteBuffer;III)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method public a()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/vision/b;->a()V

    iget-object v0, p0, Lcom/google/android/gms/vision/text/e;->a:Lcom/google/android/gms/vision/text/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/text/internal/client/g;->c()V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/text/e;->a:Lcom/google/android/gms/vision/text/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/text/internal/client/g;->b()Z

    move-result v0

    return v0
.end method
