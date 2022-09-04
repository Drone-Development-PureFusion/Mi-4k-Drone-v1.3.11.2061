.class final Lcom/google/android/gms/internal/anf$d;
.super Lcom/google/android/gms/internal/anf$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/anf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
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

.field private final b:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/internal/ail;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$b;",
            ">;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/anf$b;-><init>(Lcom/google/android/gms/internal/ail;)V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ahl$b;

    iput-object v0, p0, Lcom/google/android/gms/internal/anf$d;->a:Lcom/google/android/gms/internal/ahl$b;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ail;

    iput-object v0, p0, Lcom/google/android/gms/internal/anf$d;->b:Lcom/google/android/gms/internal/ail;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I[B)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/anf$d;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/internal/anf$d$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/anf$d$1;-><init>(Lcom/google/android/gms/internal/anf$d;Ljava/lang/String;I[B)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method

.method public b(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/anf$d;->a:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method
