.class Lcom/google/android/gms/internal/anf$e$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/anf$e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
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
        "Lcom/google/android/gms/nearby/connection/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:[B

.field final synthetic e:Lcom/google/android/gms/internal/anf$e;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/anf$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/anf$e$1;->e:Lcom/google/android/gms/internal/anf$e;

    iput-object p2, p0, Lcom/google/android/gms/internal/anf$e$1;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/anf$e$1;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/anf$e$1;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/anf$e$1;->d:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/nearby/connection/a$a;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/anf$e$1;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/anf$e$1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/anf$e$1;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/anf$e$1;->d:[B

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/google/android/gms/nearby/connection/a$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/nearby/connection/a$a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/anf$e$1;->a(Lcom/google/android/gms/nearby/connection/a$a;)V

    return-void
.end method
