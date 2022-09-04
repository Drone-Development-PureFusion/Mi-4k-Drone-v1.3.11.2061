.class Lcom/google/android/gms/wearable/internal/aa$1;
.super Lcom/google/android/gms/wearable/internal/ba;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/aa;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;[B)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/ba",
        "<",
        "Lcom/google/android/gms/wearable/m$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:[B

.field final synthetic d:Lcom/google/android/gms/wearable/internal/aa;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/aa;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/aa$1;->d:Lcom/google/android/gms/wearable/internal/aa;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/aa$1;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/wearable/internal/aa$1;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/wearable/internal/aa$1;->c:[B

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/ba;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/m$c;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/aa$b;

    const/4 v1, -0x1

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/aa$b;-><init>(Lcom/google/android/gms/common/api/Status;I)V

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/ar;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/aa$1;->a(Lcom/google/android/gms/wearable/internal/ar;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/ar;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aa$1;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/wearable/internal/aa$1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/wearable/internal/aa$1;->c:[B

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/wearable/internal/ar;->a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Ljava/lang/String;[B)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/aa$1;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/m$c;

    move-result-object v0

    return-object v0
.end method
