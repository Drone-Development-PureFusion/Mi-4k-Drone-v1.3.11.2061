.class public abstract Lcom/google/android/gms/cast/internal/d;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Lcom/google/android/gms/cast/internal/o;

.field protected final f:Lcom/google/android/gms/cast/internal/m;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/d;->a:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    invoke-direct {v0, p2}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/internal/d;->f:Lcom/google/android/gms/cast/internal/m;

    invoke-virtual {p0, p3}, Lcom/google/android/gms/cast/internal/d;->a(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(JI)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/google/android/gms/cast/internal/o;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/d;->b:Lcom/google/android/gms/cast/internal/o;

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/d;->b:Lcom/google/android/gms/cast/internal/o;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/d;->a()V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/d;->f:Lcom/google/android/gms/cast/internal/m;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected final a(Ljava/lang/String;JLjava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/d;->f:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "Sending text message: %s to: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/d;->b:Lcom/google/android/gms/cast/internal/o;

    iget-object v2, p0, Lcom/google/android/gms/cast/internal/d;->a:Ljava/lang/String;

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/cast/internal/o;->a(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method protected final c()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/d;->b:Lcom/google/android/gms/cast/internal/o;

    invoke-interface {v0}, Lcom/google/android/gms/cast/internal/o;->a()J

    move-result-wide v0

    return-wide v0
.end method
