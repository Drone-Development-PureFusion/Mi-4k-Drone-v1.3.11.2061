.class Lcom/google/firebase/b/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/b/a;->a(J)Lcom/google/android/gms/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/n",
        "<",
        "Lcom/google/android/gms/internal/ajr$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/g/g;

.field final synthetic b:Lcom/google/firebase/b/a;


# direct methods
.method constructor <init>(Lcom/google/firebase/b/a;Lcom/google/android/gms/g/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/b/a$1;->b:Lcom/google/firebase/b/a;

    iput-object p2, p0, Lcom/google/firebase/b/a$1;->a:Lcom/google/android/gms/g/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/google/android/gms/common/api/m;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/api/m;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/google/android/gms/internal/ajr$b;

    invoke-virtual {p0, p1}, Lcom/google/firebase/b/a$1;->a(Lcom/google/android/gms/internal/ajr$b;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ajr$b;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/internal/ajr$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/firebase/b/a$1;->b:Lcom/google/firebase/b/a;

    iget-object v1, p0, Lcom/google/firebase/b/a$1;->a:Lcom/google/android/gms/g/g;

    invoke-virtual {v0, v1, p1}, Lcom/google/firebase/b/a;->a(Lcom/google/android/gms/g/g;Lcom/google/android/gms/internal/ajr$b;)V

    return-void
.end method
