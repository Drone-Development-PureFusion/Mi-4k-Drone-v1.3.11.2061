.class public abstract Lcom/google/android/gms/vision/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/vision/b$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/vision/b$b",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/vision/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/vision/b",
            "<TT;>;"
        }
    .end annotation
.end field

.field private b:Lcom/google/android/gms/vision/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/vision/g",
            "<TT;>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Z

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/vision/b;Lcom/google/android/gms/vision/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b",
            "<TT;>;",
            "Lcom/google/android/gms/vision/g",
            "<TT;>;)V"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/vision/c;->c:I

    iput-boolean v1, p0, Lcom/google/android/gms/vision/c;->d:Z

    iput v1, p0, Lcom/google/android/gms/vision/c;->f:I

    iput-object p1, p0, Lcom/google/android/gms/vision/c;->a:Lcom/google/android/gms/vision/b;

    iput-object p2, p0, Lcom/google/android/gms/vision/c;->b:Lcom/google/android/gms/vision/g;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/c;->b:Lcom/google/android/gms/vision/g;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/g;->a()V

    return-void
.end method

.method protected a(I)V
    .locals 3

    if-gez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Invalid max gap: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput p1, p0, Lcom/google/android/gms/vision/c;->c:I

    return-void
.end method

.method public a(Lcom/google/android/gms/vision/b$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b$a",
            "<TT;>;)V"
        }
    .end annotation

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/vision/b$a;->a()Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-nez v1, :cond_1

    iget v0, p0, Lcom/google/android/gms/vision/c;->f:I

    iget v1, p0, Lcom/google/android/gms/vision/c;->c:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/vision/c;->b:Lcom/google/android/gms/vision/g;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/g;->a()V

    iput-boolean v2, p0, Lcom/google/android/gms/vision/c;->d:Z

    :goto_0
    iget v0, p0, Lcom/google/android/gms/vision/c;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/c;->f:I

    :goto_1
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/c;->b:Lcom/google/android/gms/vision/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/vision/g;->a(Lcom/google/android/gms/vision/b$a;)V

    goto :goto_0

    :cond_1
    iput v2, p0, Lcom/google/android/gms/vision/c;->f:I

    iget-boolean v1, p0, Lcom/google/android/gms/vision/c;->d:Z

    if-eqz v1, :cond_3

    iget v1, p0, Lcom/google/android/gms/vision/c;->e:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/vision/c;->b:Lcom/google/android/gms/vision/g;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/vision/g;->a(Lcom/google/android/gms/vision/b$a;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/vision/c;->b:Lcom/google/android/gms/vision/g;

    invoke-virtual {v1}, Lcom/google/android/gms/vision/g;->a()V

    iput-boolean v2, p0, Lcom/google/android/gms/vision/c;->d:Z

    :cond_3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/vision/c;->b(Lcom/google/android/gms/vision/b$a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    const-string v0, "FocusingProcessor"

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x23

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Invalid focus selected: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_4
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/google/android/gms/vision/c;->d:Z

    iput v1, p0, Lcom/google/android/gms/vision/c;->e:I

    iget-object v1, p0, Lcom/google/android/gms/vision/c;->a:Lcom/google/android/gms/vision/b;

    iget v2, p0, Lcom/google/android/gms/vision/c;->e:I

    invoke-virtual {v1, v2}, Lcom/google/android/gms/vision/b;->a(I)Z

    iget-object v1, p0, Lcom/google/android/gms/vision/c;->b:Lcom/google/android/gms/vision/g;

    iget v2, p0, Lcom/google/android/gms/vision/c;->e:I

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/vision/g;->a(ILjava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/vision/c;->b:Lcom/google/android/gms/vision/g;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/vision/g;->a(Lcom/google/android/gms/vision/b$a;Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public abstract b(Lcom/google/android/gms/vision/b$a;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b$a",
            "<TT;>;)I"
        }
    .end annotation
.end method
