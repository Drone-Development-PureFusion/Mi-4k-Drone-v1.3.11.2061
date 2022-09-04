.class abstract Lcom/google/android/gms/drive/internal/c$d;
.super Lcom/google/android/gms/drive/internal/bs;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/drive/internal/bs",
        "<",
        "Lcom/google/android/gms/drive/h$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/google/android/gms/drive/internal/c;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/drive/internal/c;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/c$d;->c:Lcom/google/android/gms/drive/internal/c;

    invoke-direct {p0, p2}, Lcom/google/android/gms/drive/internal/bs;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/drive/internal/c;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/internal/c$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/drive/internal/c$d;-><init>(Lcom/google/android/gms/drive/internal/c;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/drive/h$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/drive/internal/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/drive/internal/c$c;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/l;)V

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/c$d;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/drive/h$a;

    move-result-object v0

    return-object v0
.end method
