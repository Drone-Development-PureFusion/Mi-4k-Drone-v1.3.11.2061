.class Lcom/google/android/gms/cast/framework/d$b;
.super Lcom/google/android/gms/cast/framework/s$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/d;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/cast/framework/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/d$b;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/s$a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/cast/framework/d;Lcom/google/android/gms/cast/framework/d$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/d$b;-><init>(Lcom/google/android/gms/cast/framework/d;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const v0, 0x93c108

    return v0
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$b;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v0, p1}, Lcom/google/android/gms/cast/framework/d;->a(Lcom/google/android/gms/cast/framework/d;I)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$b;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/d;->c(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/a$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d$b;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/d;->d(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/common/api/g;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/cast/a$b;->c(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/cast/LaunchOptions;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$b;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/d;->c(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/a$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d$b;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/d;->d(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/common/api/g;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/cast/a$b;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/cast/LaunchOptions;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/cast/framework/d$a;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/d$b;->a:Lcom/google/android/gms/cast/framework/d;

    const-string v3, "launchApplication"

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/cast/framework/d$a;-><init>(Lcom/google/android/gms/cast/framework/d;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$b;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/d;->c(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/a$b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d$b;->a:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/d;->d(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/common/api/g;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/cast/a$b;->b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/cast/framework/d$a;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/d$b;->a:Lcom/google/android/gms/cast/framework/d;

    const-string v3, "joinApplication"

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/cast/framework/d$a;-><init>(Lcom/google/android/gms/cast/framework/d;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method
