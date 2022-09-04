.class Lcom/google/android/gms/internal/gu$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/g/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/gu;->a(ZLcom/google/android/gms/internal/hy$a;)V
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
        "Lcom/google/firebase/auth/o;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hy$a;

.field final synthetic b:Lcom/google/android/gms/internal/gu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gu;Lcom/google/android/gms/internal/hy$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gu$2;->b:Lcom/google/android/gms/internal/gu;

    iput-object p2, p0, Lcom/google/android/gms/internal/gu$2;->a:Lcom/google/android/gms/internal/hy$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/auth/o;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/gu$2;->a:Lcom/google/android/gms/internal/hy$a;

    invoke-virtual {p1}, Lcom/google/firebase/auth/o;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/hy$a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/firebase/auth/o;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/gu$2;->a(Lcom/google/firebase/auth/o;)V

    return-void
.end method
