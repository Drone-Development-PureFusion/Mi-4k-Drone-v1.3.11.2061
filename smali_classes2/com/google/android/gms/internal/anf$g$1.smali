.class Lcom/google/android/gms/internal/anf$g$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/anf$g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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
        "Lcom/google/android/gms/nearby/connection/a$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/google/android/gms/internal/anf$g;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/anf$g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/anf$g$1;->e:Lcom/google/android/gms/internal/anf$g;

    iput-object p2, p0, Lcom/google/android/gms/internal/anf$g$1;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/anf$g$1;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/anf$g$1;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/anf$g$1;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/nearby/connection/a$c;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/anf$g$1;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/anf$g$1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/anf$g$1;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/anf$g$1;->d:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/google/android/gms/nearby/connection/a$c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/nearby/connection/a$c;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/anf$g$1;->a(Lcom/google/android/gms/nearby/connection/a$c;)V

    return-void
.end method
