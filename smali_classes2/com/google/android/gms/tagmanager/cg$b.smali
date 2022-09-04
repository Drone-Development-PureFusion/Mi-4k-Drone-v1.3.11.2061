.class Lcom/google/android/gms/tagmanager/cg$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/tagmanager/cg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/tagmanager/bn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/google/android/gms/internal/hj$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tagmanager/bn;Lcom/google/android/gms/internal/hj$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;",
            "Lcom/google/android/gms/internal/hj$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cg$b;->a:Lcom/google/android/gms/tagmanager/bn;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/cg$b;->b:Lcom/google/android/gms/internal/hj$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/tagmanager/bn;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg$b;->a:Lcom/google/android/gms/tagmanager/bn;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/internal/hj$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg$b;->b:Lcom/google/android/gms/internal/hj$a;

    return-object v0
.end method

.method public c()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg$b;->a:Lcom/google/android/gms/tagmanager/bn;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hj$a;->f()I

    move-result v1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg$b;->b:Lcom/google/android/gms/internal/hj$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cg$b;->b:Lcom/google/android/gms/internal/hj$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hj$a;->f()I

    move-result v0

    goto :goto_0
.end method
