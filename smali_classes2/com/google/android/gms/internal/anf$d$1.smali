.class Lcom/google/android/gms/internal/anf$d$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/anf$d;->a(Ljava/lang/String;I[B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ail$c",
        "<",
        "Lcom/google/android/gms/nearby/connection/a$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:[B

.field final synthetic d:Lcom/google/android/gms/internal/anf$d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/anf$d;Ljava/lang/String;I[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/anf$d$1;->d:Lcom/google/android/gms/internal/anf$d;

    iput-object p2, p0, Lcom/google/android/gms/internal/anf$d$1;->a:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/internal/anf$d$1;->b:I

    iput-object p4, p0, Lcom/google/android/gms/internal/anf$d$1;->c:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/nearby/connection/a$b;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/anf$d$1;->a:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    iget v2, p0, Lcom/google/android/gms/internal/anf$d$1;->b:I

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/anf$d$1;->c:[B

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/nearby/connection/a$b;->a(Ljava/lang/String;Lcom/google/android/gms/common/api/Status;[B)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/nearby/connection/a$b;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/anf$d$1;->a(Lcom/google/android/gms/nearby/connection/a$b;)V

    return-void
.end method
