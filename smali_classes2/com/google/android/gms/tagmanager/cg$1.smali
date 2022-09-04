.class Lcom/google/android/gms/tagmanager/cg$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/dj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/cg;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/en$c;Lcom/google/android/gms/tagmanager/e;Lcom/google/android/gms/tagmanager/dr$a;Lcom/google/android/gms/tagmanager/dr$a;Lcom/google/android/gms/tagmanager/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tagmanager/dj$a",
        "<",
        "Lcom/google/android/gms/internal/en$a;",
        "Lcom/google/android/gms/tagmanager/bn",
        "<",
        "Lcom/google/android/gms/internal/hj$a;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/cg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/cg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cg$1;->a:Lcom/google/android/gms/tagmanager/cg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/en$a;Lcom/google/android/gms/tagmanager/bn;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/en$a;",
            "Lcom/google/android/gms/tagmanager/bn",
            "<",
            "Lcom/google/android/gms/internal/hj$a;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/tagmanager/bn;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/hj$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hj$a;->f()I

    move-result v0

    return v0
.end method

.method public synthetic a(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/en$a;

    check-cast p2, Lcom/google/android/gms/tagmanager/bn;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/tagmanager/cg$1;->a(Lcom/google/android/gms/internal/en$a;Lcom/google/android/gms/tagmanager/bn;)I

    move-result v0

    return v0
.end method
