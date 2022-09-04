.class Lcom/google/android/gms/internal/anf$b;
.super Lcom/google/android/gms/internal/ane;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/anf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ail;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ail;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ane;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/anf$b;->a:Lcom/google/android/gms/internal/ail;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;[BZ)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/anf$b;->a:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/internal/anf$b$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/anf$b$1;-><init>(Lcom/google/android/gms/internal/anf$b;Ljava/lang/String;[BZ)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/anf$b;->a:Lcom/google/android/gms/internal/ail;

    new-instance v1, Lcom/google/android/gms/internal/anf$b$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/anf$b$2;-><init>(Lcom/google/android/gms/internal/anf$b;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ail;->a(Lcom/google/android/gms/internal/ail$c;)V

    return-void
.end method
