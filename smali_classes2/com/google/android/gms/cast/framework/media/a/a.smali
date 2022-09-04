.class public abstract Lcom/google/android/gms/cast/framework/media/a/a;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/google/android/gms/cast/framework/media/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Lcom/google/android/gms/cast/framework/media/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/a;->a:Lcom/google/android/gms/cast/framework/media/c;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/d;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/a;->a:Lcom/google/android/gms/cast/framework/media/c;

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/a;->a:Lcom/google/android/gms/cast/framework/media/c;

    goto :goto_0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/a;->a:Lcom/google/android/gms/cast/framework/media/c;

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method
