.class Lcom/google/android/gms/internal/anf$g$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/anf$g;->a(Ljava/lang/String;)V
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

.field final synthetic b:Lcom/google/android/gms/internal/anf$g;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/anf$g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/anf$g$2;->b:Lcom/google/android/gms/internal/anf$g;

    iput-object p2, p0, Lcom/google/android/gms/internal/anf$g$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/nearby/connection/a$c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/anf$g$2;->a:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/google/android/gms/nearby/connection/a$c;->a(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/nearby/connection/a$c;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/anf$g$2;->a(Lcom/google/android/gms/nearby/connection/a$c;)V

    return-void
.end method
