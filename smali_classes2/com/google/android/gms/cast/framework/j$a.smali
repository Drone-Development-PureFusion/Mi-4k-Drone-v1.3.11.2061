.class Lcom/google/android/gms/cast/framework/j$a;
.super Lcom/google/android/gms/cast/framework/ad$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/j;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/cast/framework/j;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/j$a;->a:Lcom/google/android/gms/cast/framework/j;

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/ad$a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/cast/framework/j;Lcom/google/android/gms/cast/framework/j$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/j$a;-><init>(Lcom/google/android/gms/cast/framework/j;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const v0, 0x93c108

    return v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/j$a;->a:Lcom/google/android/gms/cast/framework/j;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/framework/j;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/j$a;->a:Lcom/google/android/gms/cast/framework/j;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/framework/j;->a(Z)V

    return-void
.end method

.method public b()Lcom/google/android/gms/c/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/j$a;->a:Lcom/google/android/gms/cast/framework/j;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/j$a;->a:Lcom/google/android/gms/cast/framework/j;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/framework/j;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/j$a;->a:Lcom/google/android/gms/cast/framework/j;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/j;->k()J

    move-result-wide v0

    return-wide v0
.end method
