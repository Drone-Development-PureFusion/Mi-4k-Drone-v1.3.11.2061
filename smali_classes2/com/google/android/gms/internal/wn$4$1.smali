.class Lcom/google/android/gms/internal/wn$4$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/wn$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/wn$4;->a(Lcom/google/android/gms/internal/uq;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/uq;

.field final synthetic b:Lcom/google/android/gms/internal/wn$4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/wn$4;Lcom/google/android/gms/internal/uq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/wn$4$1;->b:Lcom/google/android/gms/internal/wn$4;

    iput-object p2, p0, Lcom/google/android/gms/internal/wn$4$1;->a:Lcom/google/android/gms/internal/uq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/wo;)V
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/internal/wo;->d:Lcom/google/android/gms/internal/ur;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/wo;->d:Lcom/google/android/gms/internal/ur;

    iget-object v1, p0, Lcom/google/android/gms/internal/wn$4$1;->a:Lcom/google/android/gms/internal/uq;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ur;->a(Lcom/google/android/gms/internal/uq;)V

    :cond_0
    return-void
.end method
