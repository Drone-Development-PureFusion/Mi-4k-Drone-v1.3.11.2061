.class Lcom/google/android/gms/internal/wn$3$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/wn$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/wn$3;->a(Lcom/google/android/gms/internal/yx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/yx;

.field final synthetic b:Lcom/google/android/gms/internal/wn$3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/wn$3;Lcom/google/android/gms/internal/yx;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/wn$3$1;->b:Lcom/google/android/gms/internal/wn$3;

    iput-object p2, p0, Lcom/google/android/gms/internal/wn$3$1;->a:Lcom/google/android/gms/internal/yx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/wo;)V
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/internal/wo;->c:Lcom/google/android/gms/internal/yy;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/wo;->c:Lcom/google/android/gms/internal/yy;

    iget-object v1, p0, Lcom/google/android/gms/internal/wn$3$1;->a:Lcom/google/android/gms/internal/yx;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/yy;->a(Lcom/google/android/gms/internal/yx;)V

    :cond_0
    return-void
.end method
