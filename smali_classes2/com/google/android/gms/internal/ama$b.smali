.class Lcom/google/android/gms/internal/ama$b;
.super Lcom/google/android/gms/internal/alp$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ama;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/fitness/result/SessionStopResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/fitness/result/SessionStopResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/alp$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ama$b;->a:Lcom/google/android/gms/internal/ahl$b;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ama$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ama$b;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/fitness/result/SessionStopResult;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ama$b;->a:Lcom/google/android/gms/internal/ahl$b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method
