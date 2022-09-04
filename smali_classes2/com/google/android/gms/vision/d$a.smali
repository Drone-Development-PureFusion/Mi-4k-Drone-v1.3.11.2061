.class public Lcom/google/android/gms/vision/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/vision/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/vision/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/vision/d;-><init>(Lcom/google/android/gms/vision/d$1;)V

    iput-object v0, p0, Lcom/google/android/gms/vision/d$a;->a:Lcom/google/android/gms/vision/d;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/vision/d$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/d$a;->a:Lcom/google/android/gms/vision/d;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/d$b;->d(Lcom/google/android/gms/vision/d$b;I)I

    return-object p0
.end method

.method public a(J)Lcom/google/android/gms/vision/d$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/d$a;->a:Lcom/google/android/gms/vision/d;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/vision/d$b;->a(Lcom/google/android/gms/vision/d$b;J)J

    return-object p0
.end method

.method public a(Landroid/graphics/Bitmap;)Lcom/google/android/gms/vision/d$a;
    .locals 3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/vision/d$a;->a:Lcom/google/android/gms/vision/d;

    invoke-static {v2, p1}, Lcom/google/android/gms/vision/d;->a(Lcom/google/android/gms/vision/d;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/google/android/gms/vision/d$a;->a:Lcom/google/android/gms/vision/d;

    invoke-virtual {v2}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/google/android/gms/vision/d$b;->a(Lcom/google/android/gms/vision/d$b;I)I

    invoke-static {v2, v1}, Lcom/google/android/gms/vision/d$b;->b(Lcom/google/android/gms/vision/d$b;I)I

    return-object p0
.end method

.method public a(Ljava/nio/ByteBuffer;III)Lcom/google/android/gms/vision/d$a;
    .locals 3

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Null image data supplied."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    mul-int v1, p2, p3

    if-ge v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid image data size."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sparse-switch p4, :sswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x25

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unsupported image format: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    iget-object v0, p0, Lcom/google/android/gms/vision/d$a;->a:Lcom/google/android/gms/vision/d;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/d;->a(Lcom/google/android/gms/vision/d;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lcom/google/android/gms/vision/d$a;->a:Lcom/google/android/gms/vision/d;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/android/gms/vision/d$b;->a(Lcom/google/android/gms/vision/d$b;I)I

    invoke-static {v0, p3}, Lcom/google/android/gms/vision/d$b;->b(Lcom/google/android/gms/vision/d$b;I)I

    invoke-static {v0, p4}, Lcom/google/android/gms/vision/d$b;->c(Lcom/google/android/gms/vision/d$b;I)I

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_0
        0x11 -> :sswitch_0
        0x32315659 -> :sswitch_0
    .end sparse-switch
.end method

.method public a()Lcom/google/android/gms/vision/d;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/vision/d$a;->a:Lcom/google/android/gms/vision/d;

    invoke-static {v0}, Lcom/google/android/gms/vision/d;->a(Lcom/google/android/gms/vision/d;)Ljava/nio/ByteBuffer;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/vision/d$a;->a:Lcom/google/android/gms/vision/d;

    invoke-static {v0}, Lcom/google/android/gms/vision/d;->b(Lcom/google/android/gms/vision/d;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing image data.  Call either setBitmap or setImageData to specify the image"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/d$a;->a:Lcom/google/android/gms/vision/d;

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/vision/d$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/d$a;->a:Lcom/google/android/gms/vision/d;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/d$b;->e(Lcom/google/android/gms/vision/d$b;I)I

    return-object p0
.end method
