.class Lcom/google/android/gms/internal/zt$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/acr$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zt;->a(Lcom/google/android/gms/internal/zt$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/acr$c",
        "<",
        "Lcom/google/android/gms/internal/wy;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zt$a;

.field final synthetic b:Lcom/google/android/gms/internal/zt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zt;Lcom/google/android/gms/internal/zt$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zt$1;->b:Lcom/google/android/gms/internal/zt;

    iput-object p2, p0, Lcom/google/android/gms/internal/zt$1;->a:Lcom/google/android/gms/internal/zt$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/wy;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zt$1;->a:Lcom/google/android/gms/internal/zt$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zt$a;->a(Lcom/google/android/gms/internal/wy;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/wy;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zt$1;->a(Lcom/google/android/gms/internal/wy;)V

    return-void
.end method
