.class Lcom/google/android/gms/internal/anf$b$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/anf$b;->a(Ljava/lang/String;[BZ)V
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
        "Lcom/google/android/gms/nearby/connection/a$d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:[B

.field final synthetic c:Z

.field final synthetic d:Lcom/google/android/gms/internal/anf$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/anf$b;Ljava/lang/String;[BZ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/anf$b$1;->d:Lcom/google/android/gms/internal/anf$b;

    iput-object p2, p0, Lcom/google/android/gms/internal/anf$b$1;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/anf$b$1;->b:[B

    iput-boolean p4, p0, Lcom/google/android/gms/internal/anf$b$1;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/nearby/connection/a$d;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/anf$b$1;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/anf$b$1;->b:[B

    iget-boolean v2, p0, Lcom/google/android/gms/internal/anf$b$1;->c:Z

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/nearby/connection/a$d;->a(Ljava/lang/String;[BZ)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/nearby/connection/a$d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/anf$b$1;->a(Lcom/google/android/gms/nearby/connection/a$d;)V

    return-void
.end method
