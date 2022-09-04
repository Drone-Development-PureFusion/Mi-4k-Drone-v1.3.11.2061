.class Lcom/google/firebase/c/i$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/g/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/c/i;->a(J)Lcom/google/android/gms/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/g/d",
        "<",
        "Lcom/google/firebase/c/k$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/g/g;

.field final synthetic b:Lcom/google/firebase/c/i;


# direct methods
.method constructor <init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/c/i$4;->b:Lcom/google/firebase/c/i;

    iput-object p2, p0, Lcom/google/firebase/c/i$4;->a:Lcom/google/android/gms/g/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/c/k$b;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/c/i$4;->a:Lcom/google/android/gms/g/g;

    invoke-virtual {v0}, Lcom/google/android/gms/g/g;->a()Lcom/google/android/gms/g/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/g/f;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "StorageReference"

    const-string v1, "getBytes \'succeeded\', but failed to set a Result."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/firebase/c/i$4;->a:Lcom/google/android/gms/g/g;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->c:Lcom/google/android/gms/common/api/Status;

    invoke-static {v1}, Lcom/google/firebase/c/g;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/c/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/firebase/c/k$b;

    invoke-virtual {p0, p1}, Lcom/google/firebase/c/i$4;->a(Lcom/google/firebase/c/k$b;)V

    return-void
.end method
