.class Lcom/google/android/gms/drive/internal/br$j;
.super Lcom/google/android/gms/drive/internal/bs$a;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingRemoteException"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/br;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "j"
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/drive/internal/bs$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/drive/internal/br$j;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/drive/internal/bt;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/br$j;->a(Lcom/google/android/gms/drive/internal/bt;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/bt;)V
    .locals 0

    return-void
.end method
