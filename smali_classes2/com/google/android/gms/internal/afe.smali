.class public Lcom/google/android/gms/internal/afe;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/a$d;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/api/g;
    .locals 3

    new-instance v0, Lcom/google/android/gms/common/api/g$a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/g$a;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/google/android/gms/cast/a;->k:Lcom/google/android/gms/common/api/a;

    new-instance v2, Lcom/google/android/gms/cast/a$c$a;

    invoke-direct {v2, p2, p3}, Lcom/google/android/gms/cast/a$c$a;-><init>(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/a$d;)V

    invoke-virtual {v2}, Lcom/google/android/gms/cast/a$c$a;->a()Lcom/google/android/gms/cast/a$c;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/api/g$a;->a(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$a$a;)Lcom/google/android/gms/common/api/g$a;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/common/api/g$a;->a(Lcom/google/android/gms/common/api/g$b;)Lcom/google/android/gms/common/api/g$a;

    move-result-object v0

    invoke-virtual {v0, p5}, Lcom/google/android/gms/common/api/g$a;->a(Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/api/g$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g$a;->c()Lcom/google/android/gms/common/api/g;

    move-result-object v0

    return-object v0
.end method
