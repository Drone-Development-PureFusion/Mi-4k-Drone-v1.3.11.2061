.class abstract Lcom/google/android/gms/internal/anx$b;
.super Lcom/google/android/gms/internal/anu;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/anx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/anu",
        "<",
        "Lcom/google/android/gms/safetynet/c$a;",
        ">;"
    }
.end annotation


# instance fields
.field protected c:Lcom/google/android/gms/internal/anv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/anu;-><init>(Lcom/google/android/gms/common/api/g;)V

    new-instance v0, Lcom/google/android/gms/internal/anx$b$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/anx$b$1;-><init>(Lcom/google/android/gms/internal/anx$b;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/anx$b;->c:Lcom/google/android/gms/internal/anv;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/safetynet/c$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/anx$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/anx$a;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/safetynet/AttestationData;)V

    return-object v0
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/anx$b;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/safetynet/c$a;

    move-result-object v0

    return-object v0
.end method
