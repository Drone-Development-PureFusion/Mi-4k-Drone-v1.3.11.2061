.class Lcom/google/firebase/c/i$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/g/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/c/i;->l()Lcom/google/android/gms/g/f;
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
        "Lcom/google/firebase/c/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/g/g;

.field final synthetic b:Lcom/google/firebase/c/i;


# direct methods
.method constructor <init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/c/i$1;->b:Lcom/google/firebase/c/i;

    iput-object p2, p0, Lcom/google/firebase/c/i$1;->a:Lcom/google/android/gms/g/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/c/h;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/c/i$1;->a:Lcom/google/android/gms/g/g;

    invoke-virtual {p1}, Lcom/google/firebase/c/h;->l()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/firebase/c/h;

    invoke-virtual {p0, p1}, Lcom/google/firebase/c/i$1;->a(Lcom/google/firebase/c/h;)V

    return-void
.end method
