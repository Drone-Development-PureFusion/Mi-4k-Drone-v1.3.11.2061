.class final Lcom/google/android/gms/internal/ft$b;
.super Lcom/google/android/gms/internal/ge;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ft;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ge",
        "<",
        "Ljava/lang/Void;",
        "Lcom/google/android/gms/internal/gr;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ge;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$b;->e:Lcom/google/android/gms/internal/ga;

    iget-object v1, p0, Lcom/google/android/gms/internal/ft$b;->d:Lcom/google/firebase/auth/n;

    invoke-virtual {v1}, Lcom/google/firebase/auth/n;->n()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ft$b;->b:Lcom/google/android/gms/internal/ge$a;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ga;->g(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ft$b;->f:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/internal/gr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/gr;->a()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ft$b;->b(Ljava/lang/Object;)V

    return-void
.end method
