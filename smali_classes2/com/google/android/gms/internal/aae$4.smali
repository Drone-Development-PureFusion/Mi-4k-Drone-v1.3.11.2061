.class Lcom/google/android/gms/internal/aae$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/aca;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aae;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ty;Lcom/google/android/gms/internal/aad;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/aca",
        "<",
        "Lcom/google/android/gms/internal/wu;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aae;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aae;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aae$4;->a:Lcom/google/android/gms/internal/aae;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/wu;)V
    .locals 2

    const-string v0, "/log"

    sget-object v1, Lcom/google/android/gms/internal/vs;->i:Lcom/google/android/gms/internal/vt;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/wu;->a(Ljava/lang/String;Lcom/google/android/gms/internal/vt;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/wu;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aae$4;->a(Lcom/google/android/gms/internal/wu;)V

    return-void
.end method
