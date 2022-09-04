.class Lcom/google/firebase/c/j$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/c/q$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/c/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/firebase/c/q$a",
        "<",
        "Lcom/google/android/gms/g/d",
        "<-TTResult;>;TTResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/c/j;


# direct methods
.method constructor <init>(Lcom/google/firebase/c/j;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/c/j$1;->a:Lcom/google/firebase/c/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/g/d;Lcom/google/firebase/c/j$a;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/g/d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/c/j$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/d",
            "<-TTResult;>;TTResult;)V"
        }
    .end annotation

    invoke-static {}, Lcom/google/firebase/c/o;->a()Lcom/google/firebase/c/o;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/c/j$1;->a:Lcom/google/firebase/c/j;

    invoke-virtual {v0, v1}, Lcom/google/firebase/c/o;->b(Lcom/google/firebase/c/j;)V

    invoke-interface {p1, p2}, Lcom/google/android/gms/g/d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/google/android/gms/g/d;

    check-cast p2, Lcom/google/firebase/c/j$a;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/c/j$1;->a(Lcom/google/android/gms/g/d;Lcom/google/firebase/c/j$a;)V

    return-void
.end method
