.class Lcom/google/android/gms/internal/wx$c$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/acr$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/wx$c;->v_()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/acr$c",
        "<",
        "Lcom/google/android/gms/internal/wy;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/wx$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/wx$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/wx$c$2;->a:Lcom/google/android/gms/internal/wx$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/wy;)V
    .locals 1

    const-string v0, "Releasing engine reference."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/wx$c$2;->a:Lcom/google/android/gms/internal/wx$c;

    invoke-static {v0}, Lcom/google/android/gms/internal/wx$c;->a(Lcom/google/android/gms/internal/wx$c;)Lcom/google/android/gms/internal/wx$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wx$d;->x_()V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/wy;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/wx$c$2;->a(Lcom/google/android/gms/internal/wy;)V

    return-void
.end method
