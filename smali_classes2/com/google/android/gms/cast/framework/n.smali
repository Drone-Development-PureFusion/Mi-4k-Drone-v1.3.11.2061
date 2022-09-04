.class public Lcom/google/android/gms/cast/framework/n;
.super Lcom/google/android/gms/cast/framework/r$a;


# instance fields
.field private final a:Lcom/google/android/gms/cast/framework/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/cast/framework/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/r$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/n;->a:Lcom/google/android/gms/cast/framework/a;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const v0, 0x93c108

    return v0
.end method

.method public b()Lcom/google/android/gms/c/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/n;->a:Lcom/google/android/gms/cast/framework/a;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/n;->a:Lcom/google/android/gms/cast/framework/a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/a;->a()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/n;->a:Lcom/google/android/gms/cast/framework/a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/a;->b()V

    return-void
.end method
