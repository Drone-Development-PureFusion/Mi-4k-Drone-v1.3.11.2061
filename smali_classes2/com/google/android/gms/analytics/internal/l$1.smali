.class Lcom/google/android/gms/analytics/internal/l$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/analytics/internal/am;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/analytics/internal/l;->a(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/android/gms/analytics/internal/v;

.field final synthetic c:Lcom/google/android/gms/analytics/internal/g;

.field final synthetic d:Lcom/google/android/gms/analytics/internal/l;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/internal/l;ILcom/google/android/gms/analytics/internal/v;Lcom/google/android/gms/analytics/internal/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/internal/l$1;->d:Lcom/google/android/gms/analytics/internal/l;

    iput p2, p0, Lcom/google/android/gms/analytics/internal/l$1;->a:I

    iput-object p3, p0, Lcom/google/android/gms/analytics/internal/l$1;->b:Lcom/google/android/gms/analytics/internal/v;

    iput-object p4, p0, Lcom/google/android/gms/analytics/internal/l$1;->c:Lcom/google/android/gms/analytics/internal/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/l$1;->d:Lcom/google/android/gms/analytics/internal/l;

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/l;->b(Lcom/google/android/gms/analytics/internal/l;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/analytics/internal/l$1$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/analytics/internal/l$1$1;-><init>(Lcom/google/android/gms/analytics/internal/l$1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
