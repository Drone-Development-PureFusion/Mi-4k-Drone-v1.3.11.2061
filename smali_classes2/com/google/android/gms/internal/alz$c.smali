.class Lcom/google/android/gms/internal/alz$c;
.super Lcom/google/android/gms/internal/alq$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/alz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


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

.field private final b:Lcom/google/android/gms/internal/alz$a;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/alz$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/internal/alz$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/alq$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/alz$c;->a:Lcom/google/android/gms/internal/ahl$b;

    iput-object p2, p0, Lcom/google/android/gms/internal/alz$c;->b:Lcom/google/android/gms/internal/alz$a;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/alz$a;Lcom/google/android/gms/internal/alz$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/alz$c;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/alz$a;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/alz$c;->b:Lcom/google/android/gms/internal/alz$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/alz$c;->b:Lcom/google/android/gms/internal/alz$a;

    invoke-interface {v0}, Lcom/google/android/gms/internal/alz$a;->a()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/alz$c;->a:Lcom/google/android/gms/internal/ahl$b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method
