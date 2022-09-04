.class Lcom/google/android/gms/cast/framework/m$a;
.super Lcom/google/android/gms/cast/framework/ac$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/m;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/cast/framework/m;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/m$a;->a:Lcom/google/android/gms/cast/framework/m;

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/ac$a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/cast/framework/m;Lcom/google/android/gms/cast/framework/m$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/m$a;-><init>(Lcom/google/android/gms/cast/framework/m;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const v0, 0x93c108

    return v0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/c/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/m$a;->a:Lcom/google/android/gms/cast/framework/m;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/framework/m;->a(Ljava/lang/String;)Lcom/google/android/gms/cast/framework/j;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/j;->u()Lcom/google/android/gms/c/e;

    move-result-object v0

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/m$a;->a:Lcom/google/android/gms/cast/framework/m;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/m;->c()Z

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/m$a;->a:Lcom/google/android/gms/cast/framework/m;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/m;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
