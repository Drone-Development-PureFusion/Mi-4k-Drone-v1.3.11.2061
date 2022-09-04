.class Lcom/google/android/gms/internal/age$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/age;-><init>(Landroid/view/View;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/google/android/gms/internal/age;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/age;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/age$1;->b:Lcom/google/android/gms/internal/age;

    iput-wide p2, p0, Lcom/google/android/gms/internal/age$1;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/age$1;->b:Lcom/google/android/gms/internal/age;

    invoke-static {v0}, Lcom/google/android/gms/internal/age;->a(Lcom/google/android/gms/internal/age;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->e()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/google/android/gms/internal/age$1;->a:J

    add-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/cast/framework/media/c;->a(J)Lcom/google/android/gms/common/api/i;

    :cond_0
    return-void
.end method
