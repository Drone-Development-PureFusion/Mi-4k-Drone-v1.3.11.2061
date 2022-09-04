.class final Lcom/google/android/gms/nearby/messages/internal/v;
.super Lcom/google/android/gms/nearby/messages/internal/k$a;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/nearby/messages/internal/k$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/v;->a:Lcom/google/android/gms/internal/ahl$b;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/nearby/messages/internal/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)",
            "Lcom/google/android/gms/nearby/messages/internal/v;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/v;

    invoke-direct {v0, p0}, Lcom/google/android/gms/nearby/messages/internal/v;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/nearby/messages/internal/v;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/v;->a:Lcom/google/android/gms/internal/ahl$b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/nearby/messages/internal/v;->b:Z

    :cond_0
    return-void
.end method
