.class Lcom/google/android/gms/wearable/internal/bb$1;
.super Lcom/google/android/gms/wearable/internal/ba;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/bb;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/ba",
        "<",
        "Lcom/google/android/gms/wearable/a$e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/google/android/gms/wearable/internal/bb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/bb;Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/bb$1;->c:Lcom/google/android/gms/wearable/internal/bb;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/bb$1;->a:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/wearable/internal/bb$1;->b:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/ba;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/a$e;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/bb$e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/bb$e;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/wearable/b;)V

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/ar;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/bb$1;->a(Lcom/google/android/gms/wearable/internal/ar;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/ar;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bb$1;->a:Ljava/lang/String;

    iget v1, p0, Lcom/google/android/gms/wearable/internal/bb$1;->b:I

    invoke-virtual {p1, p0, v0, v1}, Lcom/google/android/gms/wearable/internal/ar;->a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;I)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/bb$1;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/a$e;

    move-result-object v0

    return-object v0
.end method
