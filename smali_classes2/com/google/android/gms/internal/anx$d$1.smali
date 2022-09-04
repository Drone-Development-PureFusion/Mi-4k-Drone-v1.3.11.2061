.class Lcom/google/android/gms/internal/anx$d$1;
.super Lcom/google/android/gms/internal/ant;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/anx$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/anx$d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/anx$d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/anx$d$1;->a:Lcom/google/android/gms/internal/anx$d;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ant;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/safetynet/HarmfulAppsData;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/anx$d$1;->a:Lcom/google/android/gms/internal/anx$d;

    new-instance v1, Lcom/google/android/gms/internal/anx$f;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/anx$f;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/anx$d;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
