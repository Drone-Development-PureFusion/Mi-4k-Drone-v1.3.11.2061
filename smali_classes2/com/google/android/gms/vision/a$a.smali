.class public Lcom/google/android/gms/vision/a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/vision/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/vision/b",
            "<*>;"
        }
    .end annotation
.end field

.field private b:Lcom/google/android/gms/vision/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/vision/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/vision/b",
            "<*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/vision/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/vision/a;-><init>(Lcom/google/android/gms/vision/a$1;)V

    iput-object v0, p0, Lcom/google/android/gms/vision/a$a;->b:Lcom/google/android/gms/vision/a;

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No context supplied."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No detector supplied."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-object p2, p0, Lcom/google/android/gms/vision/a$a;->a:Lcom/google/android/gms/vision/b;

    iget-object v0, p0, Lcom/google/android/gms/vision/a$a;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/a;->a(Lcom/google/android/gms/vision/a;Landroid/content/Context;)Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(F)Lcom/google/android/gms/vision/a$a;
    .locals 3

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid fps: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/a$a;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/a;->a(Lcom/google/android/gms/vision/a;F)F

    return-object p0
.end method

.method public a(I)Lcom/google/android/gms/vision/a$a;
    .locals 3

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid camera: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/a$a;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/a;->c(Lcom/google/android/gms/vision/a;I)I

    return-object p0
.end method

.method public a(II)Lcom/google/android/gms/vision/a$a;
    .locals 3

    const v0, 0xf4240

    if-lez p1, :cond_0

    if-gt p1, v0, :cond_0

    if-lez p2, :cond_0

    if-le p2, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x2d

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid preview size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/vision/a$a;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/a;->a(Lcom/google/android/gms/vision/a;I)I

    iget-object v0, p0, Lcom/google/android/gms/vision/a$a;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v0, p2}, Lcom/google/android/gms/vision/a;->b(Lcom/google/android/gms/vision/a;I)I

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/vision/a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/a$a;->b:Lcom/google/android/gms/vision/a;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/a;->a(Lcom/google/android/gms/vision/a;Z)Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/vision/a;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/vision/a$a;->b:Lcom/google/android/gms/vision/a;

    new-instance v1, Lcom/google/android/gms/vision/a$e;

    iget-object v2, p0, Lcom/google/android/gms/vision/a$a;->b:Lcom/google/android/gms/vision/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, Lcom/google/android/gms/vision/a$a;->a:Lcom/google/android/gms/vision/b;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/vision/a$e;-><init>(Lcom/google/android/gms/vision/a;Lcom/google/android/gms/vision/b;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/vision/a;->a(Lcom/google/android/gms/vision/a;Lcom/google/android/gms/vision/a$e;)Lcom/google/android/gms/vision/a$e;

    iget-object v0, p0, Lcom/google/android/gms/vision/a$a;->b:Lcom/google/android/gms/vision/a;

    return-object v0
.end method
