.class Lcom/google/firebase/auth/n$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/g/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/auth/n;->q()Lcom/google/android/gms/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/g/a",
        "<",
        "Lcom/google/firebase/auth/o;",
        "Lcom/google/android/gms/g/f",
        "<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/auth/n;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/n;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/n$1;->a:Lcom/google/firebase/auth/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/google/android/gms/g/f;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lcom/google/android/gms/g/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/google/firebase/auth/n$1;->b(Lcom/google/android/gms/g/f;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/g/f;)Lcom/google/android/gms/g/f;
    .locals 2
    .param p1    # Lcom/google/android/gms/g/f;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/g/f",
            "<",
            "Lcom/google/firebase/auth/o;",
            ">;)",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/g/f;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/o;

    iget-object v1, p0, Lcom/google/firebase/auth/n$1;->a:Lcom/google/firebase/auth/n;

    invoke-static {v1}, Lcom/google/firebase/auth/n;->a(Lcom/google/firebase/auth/n;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/firebase/auth/o;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/firebase/auth/FirebaseAuth;->d(Ljava/lang/String;)Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method
