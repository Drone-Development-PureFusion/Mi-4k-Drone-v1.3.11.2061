.class abstract Lcom/google/android/gms/config/internal/c$c;
.super Lcom/google/android/gms/config/internal/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/config/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/config/internal/c$b",
        "<",
        "Lcom/google/android/gms/internal/ajr$b;",
        ">;"
    }
.end annotation


# instance fields
.field protected c:Lcom/google/android/gms/config/internal/i;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/config/internal/c$b;-><init>(Lcom/google/android/gms/common/api/g;)V

    new-instance v0, Lcom/google/android/gms/config/internal/c$c$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/config/internal/c$c$1;-><init>(Lcom/google/android/gms/config/internal/c$c;)V

    iput-object v0, p0, Lcom/google/android/gms/config/internal/c$c;->c:Lcom/google/android/gms/config/internal/i;

    return-void
.end method
