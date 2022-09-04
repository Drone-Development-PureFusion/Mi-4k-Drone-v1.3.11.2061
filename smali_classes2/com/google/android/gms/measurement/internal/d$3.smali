.class Lcom/google/android/gms/measurement/internal/d$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/measurement/internal/d;->b(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/google/android/gms/measurement/internal/d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/d;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/d$3;->b:Lcom/google/android/gms/measurement/internal/d;

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/d$3;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/d$3;->b:Lcom/google/android/gms/measurement/internal/d;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d;->x()Lcom/google/android/gms/measurement/internal/af;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/af;->i:Lcom/google/android/gms/measurement/internal/af$b;

    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/d$3;->a:J

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/measurement/internal/af$b;->a(J)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/d$3;->b:Lcom/google/android/gms/measurement/internal/d;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/d;->w()Lcom/google/android/gms/measurement/internal/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/ab;->D()Lcom/google/android/gms/measurement/internal/ab$a;

    move-result-object v0

    const-string v1, "Session timeout duration set"

    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/d$3;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/ab$a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
