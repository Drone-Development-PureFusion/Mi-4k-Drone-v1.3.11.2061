.class public Lcom/google/android/gms/vision/f;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/vision/b$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/f$c;,
        Lcom/google/android/gms/vision/f$a;,
        Lcom/google/android/gms/vision/f$b;
    }
.end annotation

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
.field private a:Lcom/google/android/gms/vision/f$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/vision/f$b",
            "<TT;>;"
        }
    .end annotation
.end field

.field private b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/google/android/gms/vision/f$c;",
            ">;"
        }
    .end annotation
.end field

.field private c:I


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/f;->b:Landroid/util/SparseArray;

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/vision/f;->c:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/vision/f$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/vision/f;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/vision/f;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/vision/f;->c:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/vision/f;Lcom/google/android/gms/vision/f$b;)Lcom/google/android/gms/vision/f$b;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/vision/f;->a:Lcom/google/android/gms/vision/f$b;

    return-object p1
.end method

.method private b(Lcom/google/android/gms/vision/b$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b$a",
            "<TT;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/vision/b$a;->a()Landroid/util/SparseArray;

    move-result-object v1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/vision/f;->b:Landroid/util/SparseArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    new-instance v4, Lcom/google/android/gms/vision/f$c;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lcom/google/android/gms/vision/f$c;-><init>(Lcom/google/android/gms/vision/f;Lcom/google/android/gms/vision/f$1;)V

    iget-object v5, p0, Lcom/google/android/gms/vision/f;->a:Lcom/google/android/gms/vision/f$b;

    invoke-interface {v5, v3}, Lcom/google/android/gms/vision/f$b;->a(Ljava/lang/Object;)Lcom/google/android/gms/vision/g;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/vision/f$c;->a(Lcom/google/android/gms/vision/f$c;Lcom/google/android/gms/vision/g;)Lcom/google/android/gms/vision/g;

    invoke-static {v4}, Lcom/google/android/gms/vision/f$c;->a(Lcom/google/android/gms/vision/f$c;)Lcom/google/android/gms/vision/g;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Lcom/google/android/gms/vision/g;->a(ILjava/lang/Object;)V

    iget-object v3, p0, Lcom/google/android/gms/vision/f;->b:Landroid/util/SparseArray;

    invoke-virtual {v3, v2, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private c(Lcom/google/android/gms/vision/b$a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b$a",
            "<TT;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/vision/b$a;->a()Landroid/util/SparseArray;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/vision/f;->b:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/vision/f;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/vision/f;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/f$c;

    invoke-static {v0}, Lcom/google/android/gms/vision/f$c;->b(Lcom/google/android/gms/vision/f$c;)I

    invoke-static {v0}, Lcom/google/android/gms/vision/f$c;->c(Lcom/google/android/gms/vision/f$c;)I

    move-result v5

    iget v6, p0, Lcom/google/android/gms/vision/f;->c:I

    if-lt v5, v6, :cond_1

    invoke-static {v0}, Lcom/google/android/gms/vision/f$c;->a(Lcom/google/android/gms/vision/f$c;)Lcom/google/android/gms/vision/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/vision/g;->a()V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/vision/f$c;->a(Lcom/google/android/gms/vision/f$c;)Lcom/google/android/gms/vision/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/vision/g;->a(Lcom/google/android/gms/vision/b$a;)V

    goto :goto_1

    :cond_2
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iget-object v2, p0, Lcom/google/android/gms/vision/f;->b:Landroid/util/SparseArray;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->delete(I)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method private d(Lcom/google/android/gms/vision/b$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b$a",
            "<TT;>;)V"
        }
    .end annotation

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/vision/b$a;->a()Landroid/util/SparseArray;

    move-result-object v3

    move v1, v2

    :goto_0
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v0

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/vision/f;->b:Landroid/util/SparseArray;

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/f$c;

    invoke-static {v0, v2}, Lcom/google/android/gms/vision/f$c;->a(Lcom/google/android/gms/vision/f$c;I)I

    invoke-static {v0}, Lcom/google/android/gms/vision/f$c;->a(Lcom/google/android/gms/vision/f$c;)Lcom/google/android/gms/vision/g;

    move-result-object v0

    invoke-virtual {v0, p1, v4}, Lcom/google/android/gms/vision/g;->a(Lcom/google/android/gms/vision/b$a;Ljava/lang/Object;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/vision/f;->b:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/vision/f;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/f$c;

    invoke-static {v0}, Lcom/google/android/gms/vision/f$c;->a(Lcom/google/android/gms/vision/f$c;)Lcom/google/android/gms/vision/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/vision/g;->a()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/f;->b:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    return-void
.end method

.method public a(Lcom/google/android/gms/vision/b$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b$a",
            "<TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/f;->b(Lcom/google/android/gms/vision/b$a;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/f;->c(Lcom/google/android/gms/vision/b$a;)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/f;->d(Lcom/google/android/gms/vision/b$a;)V

    return-void
.end method
