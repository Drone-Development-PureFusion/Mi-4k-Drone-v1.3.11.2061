.class final Lcom/google/android/gms/internal/anf$g;
.super Lcom/google/android/gms/internal/ane;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/anf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
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
            "Lcom/google/android/gms/nearby/connection/a$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ail;)V
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
            "Lcom/google/android/gms/nearby/connection/a$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ane;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ahl$b;

    iput-object v0, p0, Lcom/google/android/gms/internal/anf$g;->a:Lcom/google/android/gms/internal/ahl$b;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ail;

    iput-object v0, p0, Lcom/google/android/gms/internal/anf$g;->b:Lcom/google/android/gms/internal/ail;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/anf$g;->a:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/anf$g;->b:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/internal/anf$g$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/anf$g$2;-><init>(Lcom/google/android/gms/internal/anf$g;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-object v6, p0, Lcom/google/android/gms/internal/anf$g;->b:Lcom/google/android/gms/internal/ail;

    new-instance v0, Lcom/google/android/gms/internal/anf$g$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/anf$g$1;-><init>(Lcom/google/android/gms/internal/anf$g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method
