.class public Lcom/google/android/gms/cast/framework/p;
.super Lcom/google/android/gms/cast/framework/v$a;


# instance fields
.field private final a:Lcom/google/android/gms/cast/framework/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/cast/framework/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/v$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/p;->a:Lcom/google/android/gms/cast/framework/f;

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

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/p;->a:Lcom/google/android/gms/cast/framework/f;

    invoke-interface {v0, p1}, Lcom/google/android/gms/cast/framework/f;->a(I)V

    return-void
.end method

.method public b()Lcom/google/android/gms/c/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/p;->a:Lcom/google/android/gms/cast/framework/f;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    return-object v0
.end method
