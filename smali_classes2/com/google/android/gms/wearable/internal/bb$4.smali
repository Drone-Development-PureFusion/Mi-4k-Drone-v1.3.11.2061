.class Lcom/google/android/gms/wearable/internal/bb$4;
.super Lcom/google/android/gms/wearable/internal/ba;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/bb;->b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/ba",
        "<",
        "Lcom/google/android/gms/wearable/a$g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/wearable/internal/bb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/bb;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/bb$4;->b:Lcom/google/android/gms/wearable/internal/bb;

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/bb$4;->a:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/ba;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/a$g;
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/bb$a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/wearable/internal/bb$a;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/internal/ar;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/bb$4;->a(Lcom/google/android/gms/wearable/internal/ar;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/ar;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/bb$4;->a:Ljava/lang/String;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/ar;->b(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/bb$4;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/a$g;

    move-result-object v0

    return-object v0
.end method
